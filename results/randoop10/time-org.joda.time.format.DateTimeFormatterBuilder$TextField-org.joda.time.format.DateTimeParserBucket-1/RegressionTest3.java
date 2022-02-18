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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("Japanisch");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=japanisch");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("-8");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=-8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) '#');
        java.lang.String str3 = dateTimeZone1.getName(0L);
        java.lang.String str4 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+35:00" + "'", str3, "+35:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+35:00" + "'", str4, "+35:00");
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("DateTimeField[dayOfMonth]", (double) (-9223372036854775808L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-9.223372036854776E18");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "100");
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder7 = builder5.setScript("");
        java.util.Locale.Builder builder9 = builder7.setVariant("weekyear");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.setScript("\u97e9\u56fd");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: java.io.IOException: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale locale5 = java.util.Locale.CHINESE;
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("DateTimeField[yearOfCentury]");
        java.lang.String str8 = locale5.getDisplayCountry(locale7);
        java.util.Locale.Builder builder9 = builder4.setLocale(locale7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder4.setScript("31");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: 31 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.lang.String str4 = locale3.getISO3Country();
        java.lang.String str5 = locale3.getISO3Language();
        java.util.Locale locale6 = java.util.Locale.getDefault();
        java.lang.String str7 = locale3.getDisplayVariant(locale6);
        java.util.Locale locale8 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale11 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology10, locale11, (java.lang.Integer) 100);
        java.util.Locale locale14 = java.util.Locale.getDefault();
        java.lang.String str15 = locale14.getISO3Country();
        java.lang.String str16 = locale14.getISO3Language();
        java.util.Locale locale17 = java.util.Locale.getDefault();
        java.lang.String str18 = locale14.getDisplayVariant(locale17);
        java.util.Locale locale19 = java.util.Locale.getDefault();
        java.lang.String str20 = locale19.getISO3Country();
        java.util.Locale locale21 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray22 = new java.util.Locale[] { locale3, locale8, locale11, locale14, locale19, locale21 };
        java.util.ArrayList<java.util.Locale> localeList23 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList23, localeArray22);
        java.util.Locale locale25 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList23);
        java.lang.String[] strArray29 = new java.lang.String[] { "zh", "hi!", "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        java.lang.String str32 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList30);
        java.util.Locale.LanguageRange[] languageRangeArray33 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList34 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList34, languageRangeArray33);
        java.util.Locale locale36 = java.util.Locale.getDefault();
        java.lang.String str37 = locale36.getISO3Country();
        java.lang.String str38 = locale36.getISO3Language();
        java.util.Locale locale39 = java.util.Locale.getDefault();
        java.lang.String str40 = locale36.getDisplayVariant(locale39);
        java.util.Locale locale41 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology43 = null;
        java.util.Locale locale44 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket46 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology43, locale44, (java.lang.Integer) 100);
        java.util.Locale locale47 = java.util.Locale.getDefault();
        java.lang.String str48 = locale47.getISO3Country();
        java.lang.String str49 = locale47.getISO3Language();
        java.util.Locale locale50 = java.util.Locale.getDefault();
        java.lang.String str51 = locale47.getDisplayVariant(locale50);
        java.util.Locale locale52 = java.util.Locale.getDefault();
        java.lang.String str53 = locale52.getISO3Country();
        java.util.Locale locale54 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray55 = new java.util.Locale[] { locale36, locale41, locale44, locale47, locale52, locale54 };
        java.util.ArrayList<java.util.Locale> localeList56 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList56, localeArray55);
        java.util.Locale locale58 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList34, (java.util.Collection<java.util.Locale>) localeList56);
        java.util.List<java.util.Locale> localeList59 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList56);
        java.util.Locale.LanguageRange[] languageRangeArray60 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList61 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList61, languageRangeArray60);
        java.util.Locale locale63 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet64 = locale63.getUnicodeLocaleKeys();
        java.lang.String str65 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList61, (java.util.Collection<java.lang.String>) strSet64);
        java.lang.String str66 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet64);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap67 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList68 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap67);
        java.util.Collection<java.util.Locale> localeCollection69 = null;
        java.util.Locale.FilteringMode filteringMode70 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.util.Locale> localeList71 = java.util.Locale.filter(languageRangeList68, localeCollection69, filteringMode70);
        java.util.Locale locale72 = java.util.Locale.GERMAN;
        java.util.Locale locale73 = java.util.Locale.getDefault();
        java.lang.String str74 = locale72.getDisplayVariant(locale73);
        java.util.Set<java.lang.String> strSet75 = locale73.getUnicodeLocaleKeys();
        java.util.Locale.FilteringMode filteringMode76 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList77 = java.util.Locale.filterTags(languageRangeList68, (java.util.Collection<java.lang.String>) strSet75, filteringMode76);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap78 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList79 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList68, strMap78);
        java.util.Locale.LanguageRange[] languageRangeArray80 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList81 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList81, languageRangeArray80);
        java.util.Locale locale83 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet84 = locale83.getUnicodeLocaleKeys();
        java.lang.String str85 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList81, (java.util.Collection<java.lang.String>) strSet84);
        java.lang.String str86 = java.util.Locale.lookupTag(languageRangeList79, (java.util.Collection<java.lang.String>) strSet84);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "it_IT");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ITA" + "'", str4, "ITA");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ita" + "'", str5, "ita");
        org.junit.Assert.assertNotNull(locale6);
// flaky:         org.junit.Assert.assertEquals(locale6.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
// flaky:         org.junit.Assert.assertEquals(locale8.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale11);
// flaky:         org.junit.Assert.assertEquals(locale11.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale14);
// flaky:         org.junit.Assert.assertEquals(locale14.toString(), "it_IT");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ITA" + "'", str15, "ITA");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ita" + "'", str16, "ita");
        org.junit.Assert.assertNotNull(locale17);
// flaky:         org.junit.Assert.assertEquals(locale17.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
// flaky:         org.junit.Assert.assertEquals(locale19.toString(), "it_IT");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ITA" + "'", str20, "ITA");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(locale25);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(languageRangeArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(locale36);
// flaky:         org.junit.Assert.assertEquals(locale36.toString(), "it_IT");
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "ITA" + "'", str37, "ITA");
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "ita" + "'", str38, "ita");
        org.junit.Assert.assertNotNull(locale39);
// flaky:         org.junit.Assert.assertEquals(locale39.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(locale41);
// flaky:         org.junit.Assert.assertEquals(locale41.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale44);
// flaky:         org.junit.Assert.assertEquals(locale44.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale47);
// flaky:         org.junit.Assert.assertEquals(locale47.toString(), "it_IT");
// flaky:         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "ITA" + "'", str48, "ITA");
// flaky:         org.junit.Assert.assertEquals("'" + str49 + "' != '" + "ita" + "'", str49, "ita");
        org.junit.Assert.assertNotNull(locale50);
// flaky:         org.junit.Assert.assertEquals(locale50.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(locale52);
// flaky:         org.junit.Assert.assertEquals(locale52.toString(), "it_IT");
// flaky:         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "ITA" + "'", str53, "ITA");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNull(locale58);
        org.junit.Assert.assertNotNull(localeList59);
        org.junit.Assert.assertNotNull(languageRangeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet64);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNotNull(languageRangeList68);
        org.junit.Assert.assertTrue("'" + filteringMode70 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode70.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(localeList71);
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "de");
        org.junit.Assert.assertNotNull(locale73);
// flaky:         org.junit.Assert.assertEquals(locale73.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNotNull(strSet75);
        org.junit.Assert.assertTrue("'" + filteringMode76 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode76.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList77);
        org.junit.Assert.assertNotNull(languageRangeList79);
        org.junit.Assert.assertNotNull(languageRangeArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(locale83);
        org.junit.Assert.assertEquals(locale83.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet84);
        org.junit.Assert.assertNull(str85);
        org.junit.Assert.assertNull(str86);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale locale3 = locale2.stripExtensions();
        java.util.Locale locale5 = new java.util.Locale("weekOfWeekyear");
        java.lang.String str6 = locale5.getCountry();
        java.lang.String str7 = locale3.getDisplayVariant(locale5);
        java.util.Set<java.lang.Character> charSet8 = locale3.getExtensionKeys();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals(locale5.toString(), "weekofweekyear");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charSet8);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 0);
        int int4 = dateTimeZone2.getStandardOffset((-61851600000000L));
        long long6 = dateTimeZone2.nextTransition(0L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 360000000 + "'", int4 == 360000000);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(7343661);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone0.getMillisKeepLocal(dateTimeZone1, 97L);
        boolean boolean5 = dateTimeZone1.isFixed();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.Chronology chronology9 = null;
        java.util.Locale locale10 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology9, locale10, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket(100L, chronology7, locale10);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeParserBucket13.getZone();
        int int16 = dateTimeZone14.getOffsetFromLocal((long) (byte) 1);
        java.util.Locale.Category category18 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale20 = new java.util.Locale("US");
        java.lang.String str21 = locale20.getVariant();
        java.util.Locale.setDefault(category18, locale20);
        java.lang.String str23 = dateTimeZone14.getShortName(0L, locale20);
        java.lang.String str25 = dateTimeZone14.getName((long) 100);
        long long27 = dateTimeZone1.getMillisKeepLocal(dateTimeZone14, 2L);
        long long31 = dateTimeZone1.convertLocalToUTC(6048863930090L, false, 6652801000L);
        long long34 = dateTimeZone1.adjustOffset(28014780000L, true);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 212400097L + "'", long4 == 212400097L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(locale10);
// flaky:         org.junit.Assert.assertEquals(locale10.toString(), "it_IT");
        org.junit.Assert.assertNotNull(dateTimeZone14);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 212400000 + "'", int16 == 212400000);
        org.junit.Assert.assertTrue("'" + category18 + "' != '" + java.util.Locale.Category.FORMAT + "'", category18.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale20.toString(), "us");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+59:00" + "'", str23, "+59:00");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+59:00" + "'", str25, "+59:00");
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-212399998L) + "'", long27 == (-212399998L));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 6048863930090L + "'", long31 == 6048863930090L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 28014780000L + "'", long34 == 28014780000L);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone11 = chronology8.getZone();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(1497);
        long long15 = dateTimeZone11.getMillisKeepLocal(dateTimeZone13, 28166400000L);
        java.util.TimeZone timeZone16 = dateTimeZone13.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '+00:00:01.497' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 28166398503L + "'", long15 == 28166398503L);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "100");
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("era");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.setScript("South Korea");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: South Korea [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "ko-KR");
        java.util.Locale.Builder builder8 = builder3.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale.Builder builder11 = builder9.setLanguageTag("Italian");
        java.util.Locale.Builder builder12 = builder9.clearExtensions();
        java.util.Locale.Builder builder13 = builder12.clear();
        java.util.Locale locale14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder13.setLocale(locale14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Germany");
        double double2 = languageRange1.getWeight();
        double double3 = languageRange1.getWeight();
        double double4 = languageRange1.getWeight();
        double double5 = languageRange1.getWeight();
        double double6 = languageRange1.getWeight();
        double double7 = languageRange1.getWeight();
        java.lang.String str8 = languageRange1.getRange();
        double double9 = languageRange1.getWeight();
        double double10 = languageRange1.getWeight();
        double double11 = languageRange1.getWeight();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "germany" + "'", str8, "germany");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(2);
        long long5 = dateTimeZone1.convertLocalToUTC((long) 0, false, (long) (short) 1);
        java.lang.String str7 = dateTimeZone1.getName((long) (short) 100);
        long long9 = dateTimeZone1.convertUTCToLocal((long) 8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone1.getOffset(readableInstant10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-7200000L) + "'", long5 == (-7200000L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+02:00" + "'", str7, "+02:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 7200008L + "'", long9 == 7200008L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7200000 + "'", int11 == 7200000);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale10 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology8, locale10, (java.lang.Integer) 1, 0);
        java.util.Locale locale14 = java.util.Locale.ENGLISH;
        java.lang.String str15 = locale10.getDisplayName(locale14);
        java.lang.String str16 = locale10.getISO3Country();
        java.util.Locale.Builder builder17 = builder6.setLocale(locale10);
        java.util.Locale.Builder builder20 = builder17.setUnicodeLocaleKeyword("35", "");
        java.util.Locale.Builder builder22 = builder20.addUnicodeLocaleAttribute("zho");
        java.util.Locale.Builder builder24 = builder22.addUnicodeLocaleAttribute("italia");
        java.util.Locale locale25 = builder24.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder27 = builder24.setLanguageTag("DateTimeField[dayOfYear]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: DateTimeField[dayOfYear] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "");
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("10_JPN_us");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '10_JPN_us' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("-292275054", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=-292275054");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale10 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology8, locale10, (java.lang.Integer) 1, 0);
        java.util.Locale locale14 = java.util.Locale.ENGLISH;
        java.lang.String str15 = locale10.getDisplayName(locale14);
        java.lang.String str16 = locale10.getISO3Country();
        java.util.Locale.Builder builder17 = builder6.setLocale(locale10);
        java.util.Locale.Builder builder18 = builder17.clear();
        java.util.Locale.Builder builder20 = builder17.setLanguage("germany");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder23 = builder20.setExtension('a', "ISOCHRONOLOGY[UTC]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: ISOCHRONOLOGY[UTC] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        java.util.Locale locale2 = new java.util.Locale("168", "\u6cd5\u6587");
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\u6cd5\u6587");
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        java.util.Locale locale3 = new java.util.Locale("ko-KR", "32", "");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str7 = dateTimeZone6.getID();
        long long11 = dateTimeZone6.convertLocalToUTC((long) 53, true, 60220800000L);
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone6.getOffset(readableInstant12);
        java.util.Locale locale17 = new java.util.Locale("+01:00", "x-lvariant-0");
        java.lang.String str18 = dateTimeZone6.getName((long) 'a', locale17);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.Chronology chronology23 = null;
        java.util.Locale locale24 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology23, locale24, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket(100L, chronology21, locale24);
        java.lang.String str28 = locale24.getScript();
        java.util.Set<java.lang.String> strSet29 = locale24.getUnicodeLocaleKeys();
        java.lang.String str30 = locale24.getDisplayCountry();
        java.lang.String str31 = dateTimeZone6.getName(11L, locale24);
        java.lang.String str32 = locale3.getDisplayLanguage(locale24);
        java.lang.String str33 = locale24.getCountry();
        java.lang.String str34 = locale24.getLanguage();
        java.lang.String str35 = locale24.getISO3Country();
        org.junit.Assert.assertEquals(locale3.toString(), "ko-kr_32");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "32" + "'", str4, "32");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 53L + "'", long11 == 53L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals(locale17.toString(), "+01:00_X-LVARIANT-0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
        org.junit.Assert.assertNotNull(locale24);
// flaky:         org.junit.Assert.assertEquals(locale24.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(strSet29);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:00" + "'", str31, "+00:00");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "ko-kr" + "'", str32, "ko-kr");
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "zh" + "'", str34, "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "ko-KR");
        java.util.Locale.Builder builder8 = builder3.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder10 = builder3.addUnicodeLocaleAttribute("ita");
        java.util.Locale locale11 = builder10.build();
        java.util.Locale.Builder builder12 = builder10.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder10.addUnicodeLocaleAttribute("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "100");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder4.setUnicodeLocaleKeyword("\u4e2d\u56fd", "\u97e9\u56fd");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: java.io.IOException: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "ko-KR");
        java.util.Locale.Builder builder8 = builder3.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder9 = builder8.clearExtensions();
        java.util.Locale.Builder builder10 = builder8.clearExtensions();
        java.util.Locale.Builder builder12 = builder10.setRegion("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder12.setExtension('4', "ITALIA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: 4 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("29");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=29");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket7.getZone();
        long long11 = dateTimeParserBucket7.computeMillis(true, "\u4e2d\u6587\u4e2d\u56fd)");
        int int12 = dateTimeParserBucket7.getOffset();
        java.util.Locale locale13 = dateTimeParserBucket7.getLocale();
        org.joda.time.Chronology chronology14 = dateTimeParserBucket7.getChronology();
        int int15 = dateTimeParserBucket7.getOffset();
        dateTimeParserBucket7.setOffset((java.lang.Integer) 70);
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(locale13);
// flaky:         org.junit.Assert.assertEquals(locale13.toString(), "zh");
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale locale3 = builder1.build();
        java.util.Locale.Builder builder5 = builder1.setLanguage("ITA");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder1.setUnicodeLocaleKeyword("Wednesday", "\u5fb7\u6587");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: Wednesday [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder8 = builder1.addUnicodeLocaleAttribute("jpn");
        java.util.Locale.Builder builder10 = builder8.setRegion("");
        java.util.Locale locale11 = builder10.build();
        java.lang.String str12 = locale11.getScript();
        java.util.Set<java.lang.String> strSet13 = locale11.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ita__#u-jpn");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+05:12");
        long long5 = dateTimeZone1.convertLocalToUTC(19353600000L, false, 59875200117L);
        java.lang.String str6 = dateTimeZone1.getID();
        long long9 = dateTimeZone1.convertLocalToUTC((-622079999913L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 19334880000L + "'", long5 == 19334880000L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+05:12" + "'", str6, "+05:12");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-622098719913L) + "'", long9 == (-622098719913L));
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Germany");
        java.lang.String str2 = languageRange1.getRange();
        java.lang.String str3 = languageRange1.getRange();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType5 = dateTimeFieldType4.getRangeDurationType();
        org.joda.time.DurationFieldType durationFieldType6 = dateTimeFieldType4.getRangeDurationType();
        java.lang.String str7 = dateTimeFieldType4.getName();
        boolean boolean8 = languageRange1.equals((java.lang.Object) dateTimeFieldType4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "germany" + "'", str2, "germany");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "germany" + "'", str3, "germany");
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "weekOfWeekyear" + "'", str7, "weekOfWeekyear");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clear();
        java.util.Locale locale8 = builder1.build();
        java.util.Locale locale9 = locale8.stripExtensions();
        java.lang.String str10 = locale9.getDisplayCountry();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        java.util.Locale locale2 = new java.util.Locale("Thu", "Italia");
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str5 = dateTimeZone4.getID();
        long long9 = dateTimeZone4.convertLocalToUTC((long) 53, true, 60220800000L);
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone4.getOffset(readableInstant10);
        java.util.Locale locale15 = new java.util.Locale("+01:00", "x-lvariant-0");
        java.lang.String str16 = dateTimeZone4.getName((long) 'a', locale15);
        java.lang.String str17 = locale15.getDisplayVariant();
        java.lang.String str18 = locale2.getDisplayLanguage(locale15);
        java.util.Set<java.lang.String> strSet19 = locale15.getUnicodeLocaleAttributes();
        org.junit.Assert.assertEquals(locale2.toString(), "thu_ITALIA");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 53L + "'", long9 == 53L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals(locale15.toString(), "+01:00_X-LVARIANT-0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "thu" + "'", str18, "thu");
        org.junit.Assert.assertNotNull(strSet19);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        java.util.Locale locale3 = new java.util.Locale("weekOfWeekyear", "UTC", "+00:00");
        boolean boolean4 = locale3.hasExtensions();
        org.joda.time.Chronology chronology6 = null;
        java.util.Locale locale7 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology6, locale7, (java.lang.Integer) 100);
        java.lang.String str10 = locale3.getDisplayCountry(locale7);
        java.util.Locale locale11 = java.util.Locale.CHINESE;
        java.lang.String str12 = locale11.toLanguageTag();
        java.lang.String str13 = locale11.getDisplayScript();
        java.lang.String str14 = locale3.getDisplayCountry(locale11);
        java.lang.String str15 = locale11.getScript();
        java.lang.String str17 = locale11.getExtension('u');
        java.lang.String str18 = locale11.getISO3Country();
        java.lang.String str19 = locale11.toLanguageTag();
        java.lang.String str20 = locale11.getDisplayVariant();
        org.junit.Assert.assertEquals(locale3.toString(), "weekofweekyear_UTC_+00:00");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale7);
// flaky:         org.junit.Assert.assertEquals(locale7.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "zh" + "'", str12, "zh");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "zh" + "'", str19, "zh");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("187");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=187");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket7.getZone();
        long long11 = dateTimeParserBucket7.computeMillis(true, "\u4e2d\u6587\u4e2d\u56fd)");
        long long12 = dateTimeParserBucket7.computeMillis();
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguageTag("eng");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder8 = builder1.clear();
        java.util.Locale.Builder builder10 = builder1.setLanguage("it");
        java.util.Locale.Builder builder11 = builder10.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder11.setLanguage("x-lvariant-0_ITALIANO (ITALIA)_ITA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: x-lvariant-0_ITALIANO (ITALIA)_ITA [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology1, locale3, (java.lang.Integer) 1, 0);
        java.util.Locale locale7 = java.util.Locale.ENGLISH;
        java.lang.String str8 = locale3.getDisplayName(locale7);
        java.util.Locale locale9 = java.util.Locale.getDefault();
        java.lang.String str10 = locale9.getISO3Country();
        java.lang.String str11 = locale9.getISO3Language();
        java.util.Locale locale12 = java.util.Locale.getDefault();
        java.lang.String str13 = locale9.getDisplayVariant(locale12);
        java.util.Locale locale14 = java.util.Locale.ITALY;
        java.lang.String str15 = locale14.getDisplayName();
        java.lang.String str16 = locale14.getISO3Language();
        java.lang.String str17 = locale12.getDisplayScript(locale14);
        java.lang.String str18 = locale7.getDisplayScript(locale14);
        java.util.Set<java.lang.String> strSet19 = locale14.getUnicodeLocaleKeys();
        java.lang.String str20 = locale14.getDisplayScript();
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
// flaky:         org.junit.Assert.assertEquals(locale9.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "zho" + "'", str11, "zho");
        org.junit.Assert.assertNotNull(locale12);
// flaky:         org.junit.Assert.assertEquals(locale12.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "it_IT");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u610f\u5927\u5229\u6587\u610f\u5927\u5229)" + "'", str15, "\u610f\u5927\u5229\u6587\u610f\u5927\u5229)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ita" + "'", str16, "ita");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(4492738);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "ko-KR");
        java.util.Locale.Builder builder8 = builder3.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder10 = builder3.addUnicodeLocaleAttribute("ita");
        java.util.Locale.Builder builder12 = builder10.setRegion("CN");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder12.addUnicodeLocaleAttribute("java.io.IOException: +01:00");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: java.io.IOException: +01:00 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("java.io.IOException: java.io.IOException: Thu");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=java.io.ioexception: java.io.ioexception: thu");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        java.io.IOException iOException2 = new java.io.IOException("zho");
        java.lang.Throwable[] throwableArray3 = iOException2.getSuppressed();
        java.lang.Throwable throwable5 = null;
        java.io.IOException iOException6 = new java.io.IOException("UTC", throwable5);
        java.io.IOException iOException7 = new java.io.IOException(throwable5);
        iOException2.addSuppressed((java.lang.Throwable) iOException7);
        java.io.IOException iOException9 = new java.io.IOException("", (java.lang.Throwable) iOException2);
        java.io.IOException iOException12 = new java.io.IOException("UTC");
        java.io.IOException iOException14 = new java.io.IOException("zho");
        iOException12.addSuppressed((java.lang.Throwable) iOException14);
        java.io.IOException iOException16 = new java.io.IOException((java.lang.Throwable) iOException14);
        java.io.IOException iOException17 = new java.io.IOException("Thu", (java.lang.Throwable) iOException16);
        iOException2.addSuppressed((java.lang.Throwable) iOException17);
        java.lang.String str19 = iOException2.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "java.io.IOException: zho" + "'", str19, "java.io.IOException: zho");
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("JPN");
        java.lang.String str2 = languageRange1.getRange();
        java.lang.String str3 = languageRange1.getRange();
        java.lang.String str4 = languageRange1.getRange();
        double double5 = languageRange1.getWeight();
        java.lang.String str6 = languageRange1.getRange();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jpn" + "'", str2, "jpn");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jpn" + "'", str3, "jpn");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jpn" + "'", str4, "jpn");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "jpn" + "'", str6, "jpn");
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale10 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology8, locale10, (java.lang.Integer) 1, 0);
        java.util.Locale locale14 = java.util.Locale.ENGLISH;
        java.lang.String str15 = locale10.getDisplayName(locale14);
        java.lang.String str16 = locale10.getISO3Country();
        java.util.Locale.Builder builder17 = builder6.setLocale(locale10);
        java.util.Locale.Builder builder18 = builder6.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder20 = builder6.setLanguageTag("secondOfDay");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: secondOfDay [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        int int3 = dateTimeZone1.getStandardOffset((long) (byte) -1);
        java.lang.String str4 = dateTimeZone1.toString();
        java.lang.String str6 = dateTimeZone1.getShortName((long) '#');
        java.util.Locale locale7 = java.util.Locale.GERMAN;
        boolean boolean8 = dateTimeZone1.equals((java.lang.Object) locale7);
        java.lang.String str9 = locale7.getVariant();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale locale7 = builder6.build();
        boolean boolean8 = locale7.hasExtensions();
        java.lang.String str9 = locale7.getDisplayScript();
        java.lang.String str10 = locale7.getLanguage();
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("yearOfCentury");
        java.lang.String str13 = locale12.getDisplayName();
        java.lang.String str14 = locale7.getDisplayCountry(locale12);
        java.util.Locale locale15 = locale7.stripExtensions();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ita");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ita" + "'", str10, "ita");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ita");
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.lang.String str2 = locale0.getDisplayCountry();
        java.lang.Object obj3 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ko-KR" + "'", str1, "ko-KR");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u97e9\u56fd" + "'", str2, "\u97e9\u56fd");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "ko_KR");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "ko_KR");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "ko_KR");
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        int int8 = dateTimeParserBucket7.getOffset();
        java.lang.Object obj9 = dateTimeParserBucket7.saveState();
        java.util.Locale locale10 = dateTimeParserBucket7.getLocale();
        java.lang.Integer int11 = dateTimeParserBucket7.getOffsetInteger();
        org.joda.time.Chronology chronology12 = dateTimeParserBucket7.getChronology();
        java.util.Locale locale13 = dateTimeParserBucket7.getLocale();
        java.lang.Object obj14 = dateTimeParserBucket7.saveState();
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(locale10);
// flaky:         org.junit.Assert.assertEquals(locale10.toString(), "zh");
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(locale13);
// flaky:         org.junit.Assert.assertEquals(locale13.toString(), "zh");
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Deutsch", (double) 0);
        double double3 = languageRange2.getWeight();
        java.util.Locale.LanguageRange languageRange5 = new java.util.Locale.LanguageRange("JPN");
        java.lang.String str6 = languageRange5.getRange();
        double double7 = languageRange5.getWeight();
        boolean boolean8 = languageRange2.equals((java.lang.Object) double7);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "jpn" + "'", str6, "jpn");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        java.io.IOException iOException2 = new java.io.IOException("UTC");
        java.io.IOException iOException4 = new java.io.IOException("zho");
        iOException2.addSuppressed((java.lang.Throwable) iOException4);
        java.io.IOException iOException6 = new java.io.IOException("259200032", (java.lang.Throwable) iOException2);
        java.lang.String str7 = iOException6.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.io.IOException: 259200032" + "'", str7, "java.io.IOException: 259200032");
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'x', 47);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("\u5fb7\u6587\u5fb7\u56fd)", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=??(??)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder9 = builder7.removeUnicodeLocaleAttribute("jpn");
        java.util.Locale.Builder builder11 = builder9.setLanguage("CN");
        java.util.Locale.Builder builder12 = builder9.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder12.setUnicodeLocaleKeyword("zho", "USA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: zho [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setScript("AM");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: AM [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("java.io.IOException: und");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'java.io.IOException: und' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(4492738, 2937600);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 2937600");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("hourOfHalfday", (double) 30239999999L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=3.0239999999E10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "ko-KR");
        java.util.Locale.Builder builder8 = builder3.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder10 = builder3.addUnicodeLocaleAttribute("ita");
        java.util.Locale.Builder builder12 = builder10.setLanguageTag("year");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder10.addUnicodeLocaleAttribute("FR");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: FR [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        java.io.IOException iOException1 = new java.io.IOException("jpn");
        java.io.IOException iOException2 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.io.IOException iOException3 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) iOException3);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology1, locale3, (java.lang.Integer) 1, 0);
        java.lang.String str7 = locale3.getLanguage();
        java.lang.String str8 = locale3.getVariant();
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("338855");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '338855' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        java.util.Locale locale2 = new java.util.Locale("CHINESE", "Deutsch");
        org.junit.Assert.assertEquals(locale2.toString(), "chinese_DEUTSCH");
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        long long5 = dateTimeZone1.convertLocalToUTC(35L, true, 32054400052L);
        boolean boolean6 = dateTimeZone1.isFixed();
        int int8 = dateTimeZone1.getOffsetFromLocal(82800003L);
        java.lang.String str10 = dateTimeZone1.getName(952128000097L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(7);
        int int3 = dateTimeZone1.getOffset(28112398503L);
        boolean boolean4 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 25200000 + "'", int3 == 25200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("\u5fb7\u56fd", (double) (-3599991L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-3599991.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        java.util.Locale locale3 = new java.util.Locale("\u4e00\u6708", "\u7f8e\u56fd", "italia");
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u4e00\u6708\u7f8e\u56fd_italia");
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguageTag("eng");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale locale8 = builder7.build();
        java.util.Locale.Builder builder9 = builder7.clear();
        java.util.Locale.Builder builder11 = builder7.addUnicodeLocaleAttribute("86399999");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder7.setVariant("168");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: 168 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "eng");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        java.lang.String str8 = locale4.getScript();
        java.lang.String str10 = locale4.getExtension('u');
        java.util.Locale locale12 = new java.util.Locale("2");
        java.lang.String str13 = locale4.getDisplayCountry(locale12);
        java.util.Locale.setDefault(locale4);
        java.lang.String str15 = locale4.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "10_JPN_us");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals(locale12.toString(), "2");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JPN" + "'", str13, "JPN");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "us" + "'", str15, "us");
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale locale1 = java.util.Locale.GERMANY;
        java.lang.String str2 = locale1.getVariant();
        java.util.Set<java.lang.String> strSet3 = locale1.getUnicodeLocaleAttributes();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList4 = java.util.Locale.filterTags(languageRangeList0, (java.util.Collection<java.lang.String>) strSet3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder10 = builder7.setExtension('x', "");
        java.util.Locale.Builder builder11 = builder7.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder7.setVariant("3");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: 3 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "ko-KR");
        java.util.Locale.Builder builder8 = builder3.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale.Builder builder11 = builder9.setLanguageTag("Italian");
        java.util.Locale.Builder builder12 = builder9.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder9.setVariant("\u516c\u5143");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "100");
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder5.setExtension(' ', "zho");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key:   [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("jpn");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'jpn' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName(27654780117L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.nextTransition((-1L));
        boolean boolean6 = dateTimeZone1.isStandardOffset((long) (-1));
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        int int10 = dateTimeZone1.getStandardOffset(5L);
        int int12 = dateTimeZone1.getOffsetFromLocal((-1562400000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Germany");
        java.lang.String str2 = languageRange1.getRange();
        double double3 = languageRange1.getWeight();
        java.lang.String str4 = languageRange1.getRange();
        java.lang.String str5 = languageRange1.getRange();
        double double6 = languageRange1.getWeight();
        double double7 = languageRange1.getWeight();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "germany" + "'", str2, "germany");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "germany" + "'", str4, "germany");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "germany" + "'", str5, "germany");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.getDisplayName();
        java.lang.String str2 = locale0.getDisplayLanguage();
        java.lang.String str3 = locale0.getISO3Language();
        java.lang.String str4 = locale0.getVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Chinese (China)" + "'", str1, "Chinese (China)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Chinese" + "'", str2, "Chinese");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zho" + "'", str3, "zho");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("8");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(84, 338855);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 338855");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.setRegion("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder0.addUnicodeLocaleAttribute("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((long) 'a');
        boolean boolean5 = dateTimeZone1.isFixed();
        java.lang.String str7 = dateTimeZone1.getShortName((long) (short) 100);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        java.util.Locale locale3 = new java.util.Locale("\u52a0\u62ff\u5927", "jpn", "\u65e5\u6587");
        java.util.Locale locale7 = new java.util.Locale("Chine", "\u7f8e\u56fd", "United States");
        boolean boolean8 = locale3.equals((java.lang.Object) "Chine");
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u52a0\u62ff\u5927\u65e5\u6587");
// flaky:         org.junit.Assert.assertEquals(locale7.toString(), "\u7f8e\u56fd_United States");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale2 = new java.util.Locale("US");
        java.lang.String str3 = locale2.getVariant();
        java.util.Locale.setDefault(category0, locale2);
        java.util.Locale locale5 = java.util.Locale.getDefault(category0);
        java.util.Locale locale6 = java.util.Locale.getDefault(category0);
        java.util.Locale.Builder builder7 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        java.util.Locale.Builder builder11 = builder8.setExtension('a', "");
        java.util.Locale.Builder builder13 = builder8.setLanguageTag("eng");
        java.util.Locale.Builder builder14 = builder8.clearExtensions();
        java.util.Locale.Builder builder15 = builder8.clear();
        java.util.Locale.Builder builder17 = builder8.setLanguage("it");
        java.util.Locale locale18 = builder8.build();
        java.lang.String str19 = locale18.getDisplayName();
        java.util.Locale.setDefault(category0, locale18);
        java.lang.Object obj21 = locale18.clone();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale2.toString(), "us");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "us");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "us");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "it");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Italian" + "'", str19, "Italian");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "it");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "it");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "it");
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder9 = builder7.removeUnicodeLocaleAttribute("jpn");
        java.util.Locale.Builder builder10 = builder7.clear();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.Chronology chronology14 = null;
        java.util.Locale locale15 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology14, locale15, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket(100L, chronology12, locale15);
        java.lang.Object obj19 = dateTimeParserBucket18.saveState();
        dateTimeParserBucket18.setOffset((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.yearOfCentury();
        java.util.Locale locale24 = java.util.Locale.US;
        dateTimeParserBucket18.saveField(dateTimeFieldType22, "centuryOfEra", locale24);
        java.lang.String str26 = locale24.getDisplayScript();
        java.lang.String str27 = locale24.getDisplayCountry();
        java.util.Locale.Builder builder28 = builder7.setLocale(locale24);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder31 = builder7.setExtension('u', "\u671d\u9c9c\u6587");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: ??? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale15);
// flaky:         org.junit.Assert.assertEquals(locale15.toString(), "ita");
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "United States" + "'", str27, "United States");
        org.junit.Assert.assertNotNull(builder28);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "ko-KR");
        java.util.Locale.Builder builder8 = builder3.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder10 = builder3.addUnicodeLocaleAttribute("ita");
        java.util.Locale.Builder builder13 = builder3.setExtension('x', "Thu");
        java.util.Locale locale16 = new java.util.Locale("+01:00", "x-lvariant-0");
        java.lang.String str17 = locale16.getLanguage();
        java.lang.String str18 = locale16.getDisplayLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder19 = builder13.setLocale(locale16);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: +01:00 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertEquals(locale16.toString(), "+01:00_X-LVARIANT-0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+01:00" + "'", str17, "+01:00");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+01:00" + "'", str18, "+01:00");
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        java.util.Locale locale2 = new java.util.Locale("US", "+100:00");
        org.junit.Assert.assertEquals(locale2.toString(), "us_+100:00");
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.Locale locale6 = new java.util.Locale("weekOfWeekyear", "UTC", "+00:00");
        boolean boolean7 = locale6.hasExtensions();
        org.joda.time.Chronology chronology9 = null;
        java.util.Locale locale10 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology9, locale10, (java.lang.Integer) 100);
        java.lang.String str13 = locale6.getDisplayCountry(locale10);
        java.lang.String str14 = dateTimeZone1.getShortName((long) (short) 1, locale10);
        java.lang.String str15 = dateTimeZone1.getID();
        int int17 = dateTimeZone1.getStandardOffset(60480000010L);
        int int19 = dateTimeZone1.getStandardOffset(259200107L);
        int int21 = dateTimeZone1.getStandardOffset((long) 1970);
        int int23 = dateTimeZone1.getOffset(41904000000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals(locale6.toString(), "weekofweekyear_UTC_+00:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(locale10);
// flaky:         org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("11");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '11' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.nextTransition((-1L));
        java.lang.String str5 = dateTimeZone1.toString();
        java.util.TimeZone timeZone6 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertNotNull(timeZone6);
// flaky:         org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1, (int) (short) 0);
        boolean boolean4 = dateTimeZone2.isStandardOffset(70000L);
        java.util.TimeZone timeZone5 = dateTimeZone2.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+01:00");
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        boolean boolean5 = dateTimeZone1.isStandardOffset((long) (byte) -1);
        long long7 = dateTimeZone1.convertUTCToLocal(64713600000L);
        java.util.Locale locale10 = new java.util.Locale("java.io.IOException: ita");
        java.util.Locale locale11 = locale10.stripExtensions();
        java.lang.String str12 = dateTimeZone1.getShortName(1638872035257599830L, locale10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 64713600000L + "'", long7 == 64713600000L);
        org.junit.Assert.assertEquals(locale10.toString(), "java.io.ioexception: ita");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "java.io.ioexception: ita");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder2.setExtension('a', "United States");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: United States [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        java.io.IOException iOException4 = new java.io.IOException("");
        java.io.IOException iOException5 = new java.io.IOException("USA", (java.lang.Throwable) iOException4);
        java.io.IOException iOException6 = new java.io.IOException("-1", (java.lang.Throwable) iOException4);
        java.lang.Throwable[] throwableArray7 = iOException4.getSuppressed();
        java.io.IOException iOException8 = new java.io.IOException("thu (ITALIA)", (java.lang.Throwable) iOException4);
        org.junit.Assert.assertNotNull(throwableArray7);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getNameKey((long) (short) -1);
        int int4 = dateTimeZone0.getStandardOffset((long) '#');
        long long7 = dateTimeZone0.adjustOffset((long) '#', false);
        long long9 = dateTimeZone0.previousTransition(0L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("ISOCHRONOLOGY[UTC]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'ISOCHRONOLOGY[UTC]' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("java.io.IOException: java.io.IOException: germany", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=java.io.ioexception:java.io.ioexception:germany");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder9 = builder7.removeUnicodeLocaleAttribute("jpn");
        java.util.Locale.Builder builder11 = builder9.setLanguageTag("cinese");
        java.util.Locale.Builder builder12 = builder9.clear();
        java.util.Locale.Builder builder13 = builder12.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder13.setExtension('4', "12");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: 4 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        int int8 = dateTimeParserBucket7.getOffset();
        dateTimeParserBucket7.setOffset((java.lang.Integer) 59);
        long long13 = dateTimeParserBucket7.computeMillis(false, "49");
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeParserBucket7.getZone();
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 41L + "'", long13 == 41L);
        org.junit.Assert.assertNotNull(dateTimeZone14);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology1, locale3, (java.lang.Integer) 1, 0);
        dateTimeParserBucket6.setOffset((int) (short) 100);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket6.getChronology();
        dateTimeParserBucket6.setPivotYear((java.lang.Integer) 5207);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        dateTimeParserBucket6.setZone(dateTimeZone12);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(chronology9);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.nextTransition((-1L));
        int int6 = dateTimeZone1.getStandardOffset((long) 86399);
        int int8 = dateTimeZone1.getStandardOffset(70000L);
        long long10 = dateTimeZone1.nextTransition((-61851600000000L));
        java.lang.String str12 = dateTimeZone1.getShortName(2275257599830L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-61851600000000L) + "'", long10 == (-61851600000000L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        java.io.IOException iOException1 = new java.io.IOException("hourOfHalfday");
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("-101");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=-101");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        int int8 = dateTimeParserBucket7.getOffset();
        dateTimeParserBucket7.setOffset((java.lang.Integer) 59);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeParserBucket7.getZone();
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone11);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder1.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder1.removeUnicodeLocaleAttribute("99");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 99 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.removeUnicodeLocaleAttribute("eng");
        java.util.Locale.Builder builder5 = builder1.setLanguageTag("Chine");
        java.util.Locale.Builder builder7 = builder1.setVariant("Chine");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder1.addUnicodeLocaleAttribute("dayofyear");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: dayofyear [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.addUnicodeLocaleAttribute("UTC");
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.lang.String str4 = locale3.getISO3Country();
        java.lang.String str5 = locale3.getISO3Language();
        java.util.Locale locale6 = java.util.Locale.getDefault();
        java.lang.String str7 = locale3.getDisplayVariant(locale6);
        java.util.Locale locale8 = java.util.Locale.ITALY;
        java.lang.String str9 = locale8.getDisplayName();
        java.lang.String str10 = locale8.getISO3Language();
        java.lang.String str11 = locale6.getDisplayScript(locale8);
        java.lang.String str12 = locale6.getDisplayName();
        java.lang.String str13 = locale6.getVariant();
        java.lang.String str14 = locale6.getLanguage();
        java.util.Locale.Builder builder15 = builder0.setLocale(locale6);
        java.util.Locale locale16 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder18 = builder0.setLanguageTag("5207");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: 5207 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jpn" + "'", str5, "jpn");
        org.junit.Assert.assertNotNull(locale6);
// flaky:         org.junit.Assert.assertEquals(locale6.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it_IT");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u30a4\u30bf\u30ea\u30a2\u8a9e\u30a4\u30bf\u30ea\u30a2)" + "'", str9, "\u30a4\u30bf\u30ea\u30a2\u8a9e\u30a4\u30bf\u30ea\u30a2)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ita" + "'", str10, "ita");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u65e5\u672c\u8a9e" + "'", str12, "\u65e5\u672c\u8a9e");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ja" + "'", str14, "ja");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(locale16);
// flaky:         org.junit.Assert.assertEquals(locale16.toString(), "ja");
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.FRENCH;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology1, locale2, (java.lang.Integer) (-1), 0);
        java.util.Locale locale6 = java.util.Locale.ITALY;
        java.lang.String str7 = locale6.getScript();
        java.lang.String str8 = locale6.getScript();
        boolean boolean9 = dateTimeParserBucket5.restoreState((java.lang.Object) locale6);
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        int int13 = dateTimeZone11.getStandardOffset((long) (byte) -1);
        java.lang.String str15 = dateTimeZone11.getNameKey((-259200000L));
        dateTimeParserBucket5.setZone(dateTimeZone11);
        long long18 = dateTimeZone11.convertUTCToLocal(87L);
        java.lang.String str20 = dateTimeZone11.getShortName((long) 345599);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 87L + "'", long18 == 87L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.secondOfMinute();
        org.joda.time.DurationField durationField10 = dateTimeField9.getRangeDurationField();
        long long13 = dateTimeField9.getDifferenceAsLong(1146185520059L, 156826312272000052L);
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "ja");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-156825166086479L) + "'", long13 == (-156825166086479L));
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale10 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology8, locale10, (java.lang.Integer) 1, 0);
        java.util.Locale locale14 = java.util.Locale.ENGLISH;
        java.lang.String str15 = locale10.getDisplayName(locale14);
        java.lang.String str16 = locale10.getISO3Country();
        java.util.Locale.Builder builder17 = builder6.setLocale(locale10);
        java.util.Locale.Builder builder20 = builder17.setUnicodeLocaleKeyword("35", "");
        java.util.Locale.Builder builder22 = builder20.addUnicodeLocaleAttribute("zho");
        java.util.Locale.Builder builder24 = builder20.removeUnicodeLocaleAttribute("Cina");
        java.util.Locale.Builder builder25 = builder20.clear();
        java.util.Locale locale26 = java.util.Locale.CHINESE;
        java.lang.String str27 = locale26.getScript();
        java.util.Locale.Builder builder28 = builder20.setLocale(locale26);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder31 = builder20.setUnicodeLocaleKeyword("China", "fr-FR");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: China [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(builder28);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ita");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.removeUnicodeLocaleAttribute("\u30d5\u30e9\u30f3\u30b9\u8a9e\u30ab\u30ca\u30c0)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ????? (????) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale locale8 = builder1.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder1.setRegion("ITA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: ITA [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ita");
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        java.util.Locale locale3 = new java.util.Locale("8831", "50", "java.io.IOException: +59:00");
        org.junit.Assert.assertEquals(locale3.toString(), "8831_50_java.io.IOException: +59:00");
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        int int3 = dateTimeZone1.getOffset((-64270320L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale locale5 = java.util.Locale.CHINESE;
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("DateTimeField[yearOfCentury]");
        java.lang.String str8 = locale5.getDisplayCountry(locale7);
        java.util.Locale.Builder builder9 = builder4.setLocale(locale7);
        java.util.Locale.Builder builder11 = builder4.setLanguageTag("CHINESE");
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder8 = builder1.addUnicodeLocaleAttribute("jpn");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder8.setExtension('#', "java.io.IOException: java.io.IOException: ITA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: # [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        boolean boolean5 = dateTimeZone1.isStandardOffset((long) (byte) -1);
        boolean boolean7 = dateTimeZone1.isStandardOffset((-1L));
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone1.isLocalDateTimeGap(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguageTag("eng");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale locale8 = builder7.build();
        java.util.Locale locale9 = java.util.Locale.CHINESE;
        java.lang.String str10 = locale9.toLanguageTag();
        java.lang.String str11 = locale9.getDisplayScript();
        java.util.Locale.Builder builder12 = builder7.setLocale(locale9);
        java.lang.String str13 = locale9.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = locale9.getUnicodeLocaleType("-1");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "eng");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "zh" + "'", str10, "zh");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "zh" + "'", str13, "zh");
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        int int8 = dateTimeParserBucket7.getOffset();
        java.lang.Object obj9 = dateTimeParserBucket7.saveState();
        java.util.Locale locale10 = dateTimeParserBucket7.getLocale();
        java.lang.Integer int11 = dateTimeParserBucket7.getOffsetInteger();
        org.joda.time.Chronology chronology12 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField14 = chronology12.hourOfDay();
        java.lang.String str15 = dateTimeField14.getName();
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(locale10);
// flaky:         org.junit.Assert.assertEquals(locale10.toString(), "zh");
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hourOfDay" + "'", str15, "hourOfDay");
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(4, 4);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        java.util.Locale locale2 = new java.util.Locale("360660000", "SECONDOFMINUTE");
        org.junit.Assert.assertEquals(locale2.toString(), "360660000_SECONDOFMINUTE");
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str1 = dateTimeZone0.getID();
        boolean boolean3 = dateTimeZone0.isStandardOffset((long) 'a');
        boolean boolean5 = dateTimeZone0.isStandardOffset(1860087L);
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTC" + "'", str1, "UTC");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clear();
        java.util.Locale.Builder builder3 = builder1.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.setScript("Cina");
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder8 = builder7.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.removeUnicodeLocaleAttribute("\u65e5\u6587");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("DateTimeField[secondOfDay]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=datetimefield[secondofday]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguageTag("eng");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale locale8 = builder7.build();
        java.util.Locale.Builder builder9 = builder7.clear();
        java.util.Locale.Builder builder11 = builder7.addUnicodeLocaleAttribute("86399999");
        java.util.Locale.Builder builder13 = builder11.setLanguage("JPN");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder13.setVariant("zh-TW");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: zh-TW [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "eng");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        java.io.IOException iOException1 = new java.io.IOException("UTC");
        java.io.IOException iOException3 = new java.io.IOException("zho");
        iOException1.addSuppressed((java.lang.Throwable) iOException3);
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) iOException3);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) iOException5);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(5, 2922789);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 2922789");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        java.io.IOException iOException2 = new java.io.IOException("dayofyear");
        java.io.IOException iOException3 = new java.io.IOException((java.lang.Throwable) iOException2);
        java.io.IOException iOException5 = new java.io.IOException("und");
        iOException3.addSuppressed((java.lang.Throwable) iOException5);
        java.io.IOException iOException7 = new java.io.IOException("Franz\366sisch", (java.lang.Throwable) iOException3);
        java.io.IOException iOException8 = new java.io.IOException((java.lang.Throwable) iOException7);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.getDisplayName();
        java.lang.String str2 = locale0.getDisplayLanguage();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Chronology chronology6 = null;
        java.util.Locale locale7 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology6, locale7, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket(100L, chronology4, locale7);
        java.lang.String str11 = locale7.getScript();
        java.util.Set<java.lang.String> strSet12 = locale7.getUnicodeLocaleKeys();
        java.lang.String str13 = locale7.getDisplayCountry();
        java.lang.String str14 = locale0.getDisplayScript(locale7);
        java.lang.String str15 = locale7.getDisplayVariant();
        java.util.Set<java.lang.Character> charSet16 = locale7.getExtensionKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str1, "\u4e2d\u6587\u4e2d\u56fd)");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u6587" + "'", str2, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale7);
// flaky:         org.junit.Assert.assertEquals(locale7.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strSet12);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charSet16);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        java.io.IOException iOException2 = new java.io.IOException();
        java.io.IOException iOException3 = new java.io.IOException("\u5fb7\u56fd", (java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException("5100", (java.lang.Throwable) iOException2);
        java.lang.String str5 = iOException2.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.io.IOException" + "'", str5, "java.io.IOException");
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        java.lang.String str8 = locale4.getScript();
        java.lang.String str10 = locale4.getExtension('u');
        java.lang.String str11 = locale4.toLanguageTag();
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "zh" + "'", str11, "zh");
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        java.util.Locale locale1 = new java.util.Locale("ITA");
        org.junit.Assert.assertEquals(locale1.toString(), "ita");
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(11, 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        java.lang.String str3 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Germany");
        java.lang.String str2 = languageRange1.getRange();
        double double3 = languageRange1.getWeight();
        java.lang.String str4 = languageRange1.getRange();
        java.lang.String str5 = languageRange1.getRange();
        java.lang.String str6 = languageRange1.getRange();
        java.lang.Object obj7 = null;
        boolean boolean8 = languageRange1.equals(obj7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "germany" + "'", str2, "germany");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "germany" + "'", str4, "germany");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "germany" + "'", str5, "germany");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "germany" + "'", str6, "germany");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("de");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap2);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap4 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList5 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap4);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap6 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap6);
        java.util.Locale.LanguageRange[] languageRangeArray8 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList9 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9, languageRangeArray8);
        java.util.Locale locale11 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet12 = locale11.getUnicodeLocaleKeys();
        java.lang.String str13 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, (java.util.Collection<java.lang.String>) strSet12);
        java.util.Locale locale14 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet15 = locale14.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList16 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, (java.util.Collection<java.lang.String>) strSet15);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap17 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList18 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, strMap17);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap19 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList20 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, strMap19);
        java.util.Locale.LanguageRange[] languageRangeArray21 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList22 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList22, languageRangeArray21);
        java.util.Locale locale24 = java.util.Locale.getDefault();
        java.lang.String str25 = locale24.getISO3Country();
        java.lang.String str26 = locale24.getISO3Language();
        java.util.Locale locale27 = java.util.Locale.getDefault();
        java.lang.String str28 = locale24.getDisplayVariant(locale27);
        java.util.Locale locale29 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology31 = null;
        java.util.Locale locale32 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology31, locale32, (java.lang.Integer) 100);
        java.util.Locale locale35 = java.util.Locale.getDefault();
        java.lang.String str36 = locale35.getISO3Country();
        java.lang.String str37 = locale35.getISO3Language();
        java.util.Locale locale38 = java.util.Locale.getDefault();
        java.lang.String str39 = locale35.getDisplayVariant(locale38);
        java.util.Locale locale40 = java.util.Locale.getDefault();
        java.lang.String str41 = locale40.getISO3Country();
        java.util.Locale locale42 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray43 = new java.util.Locale[] { locale24, locale29, locale32, locale35, locale40, locale42 };
        java.util.ArrayList<java.util.Locale> localeList44 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList44, localeArray43);
        java.util.Locale locale46 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList22, (java.util.Collection<java.util.Locale>) localeList44);
        java.lang.String[] strArray50 = new java.lang.String[] { "zh", "hi!", "" };
        java.util.ArrayList<java.lang.String> strList51 = new java.util.ArrayList<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList51, strArray50);
        java.lang.String str53 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList22, (java.util.Collection<java.lang.String>) strList51);
        java.util.Locale.LanguageRange[] languageRangeArray54 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList55 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList55, languageRangeArray54);
        java.util.Locale locale57 = java.util.Locale.getDefault();
        java.lang.String str58 = locale57.getISO3Country();
        java.lang.String str59 = locale57.getISO3Language();
        java.util.Locale locale60 = java.util.Locale.getDefault();
        java.lang.String str61 = locale57.getDisplayVariant(locale60);
        java.util.Locale locale62 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology64 = null;
        java.util.Locale locale65 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket67 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology64, locale65, (java.lang.Integer) 100);
        java.util.Locale locale68 = java.util.Locale.getDefault();
        java.lang.String str69 = locale68.getISO3Country();
        java.lang.String str70 = locale68.getISO3Language();
        java.util.Locale locale71 = java.util.Locale.getDefault();
        java.lang.String str72 = locale68.getDisplayVariant(locale71);
        java.util.Locale locale73 = java.util.Locale.getDefault();
        java.lang.String str74 = locale73.getISO3Country();
        java.util.Locale locale75 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray76 = new java.util.Locale[] { locale57, locale62, locale65, locale68, locale73, locale75 };
        java.util.ArrayList<java.util.Locale> localeList77 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList77, localeArray76);
        java.util.Locale locale79 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList55, (java.util.Collection<java.util.Locale>) localeList77);
        java.util.List<java.util.Locale> localeList80 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList22, (java.util.Collection<java.util.Locale>) localeList77);
        java.util.Locale locale81 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, (java.util.Collection<java.util.Locale>) localeList77);
        java.util.Locale locale84 = new java.util.Locale("Italienisch", "zho");
        java.util.Set<java.lang.String> strSet85 = locale84.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList86 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, (java.util.Collection<java.lang.String>) strSet85);
        java.util.List<java.lang.String> strList87 = java.util.Locale.filterTags(languageRangeList7, (java.util.Collection<java.lang.String>) strList86);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertNotNull(languageRangeList5);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertNotNull(languageRangeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(languageRangeList18);
        org.junit.Assert.assertNotNull(languageRangeList20);
        org.junit.Assert.assertNotNull(languageRangeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(locale24);
// flaky:         org.junit.Assert.assertEquals(locale24.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "zho" + "'", str26, "zho");
        org.junit.Assert.assertNotNull(locale27);
// flaky:         org.junit.Assert.assertEquals(locale27.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(locale29);
// flaky:         org.junit.Assert.assertEquals(locale29.toString(), "zh");
        org.junit.Assert.assertNotNull(locale32);
// flaky:         org.junit.Assert.assertEquals(locale32.toString(), "zh");
        org.junit.Assert.assertNotNull(locale35);
// flaky:         org.junit.Assert.assertEquals(locale35.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "zho" + "'", str37, "zho");
        org.junit.Assert.assertNotNull(locale38);
// flaky:         org.junit.Assert.assertEquals(locale38.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(locale40);
// flaky:         org.junit.Assert.assertEquals(locale40.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNull(locale46);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(languageRangeArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(locale57);
// flaky:         org.junit.Assert.assertEquals(locale57.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
// flaky:         org.junit.Assert.assertEquals("'" + str59 + "' != '" + "zho" + "'", str59, "zho");
        org.junit.Assert.assertNotNull(locale60);
// flaky:         org.junit.Assert.assertEquals(locale60.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(locale62);
// flaky:         org.junit.Assert.assertEquals(locale62.toString(), "zh");
        org.junit.Assert.assertNotNull(locale65);
// flaky:         org.junit.Assert.assertEquals(locale65.toString(), "zh");
        org.junit.Assert.assertNotNull(locale68);
// flaky:         org.junit.Assert.assertEquals(locale68.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
// flaky:         org.junit.Assert.assertEquals("'" + str70 + "' != '" + "zho" + "'", str70, "zho");
        org.junit.Assert.assertNotNull(locale71);
// flaky:         org.junit.Assert.assertEquals(locale71.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(locale73);
// flaky:         org.junit.Assert.assertEquals(locale73.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNull(locale79);
        org.junit.Assert.assertNotNull(localeList80);
        org.junit.Assert.assertNull(locale81);
        org.junit.Assert.assertEquals(locale84.toString(), "italienisch_ZHO");
        org.junit.Assert.assertNotNull(strSet85);
        org.junit.Assert.assertNotNull(strList86);
        org.junit.Assert.assertNotNull(strList87);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clear();
        java.util.Locale.Builder builder3 = builder1.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.setScript("Cina");
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder6.setVariant("292278993");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: 292278993 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        long long3 = dateTimeZone1.previousTransition(604801053L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 604801053L + "'", long3 == 604801053L);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str1 = dateTimeZone0.getID();
        int int3 = dateTimeZone0.getOffsetFromLocal(60480000010L);
        long long7 = dateTimeZone0.convertLocalToUTC(18748800052L, false, 259200087L);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str10 = dateTimeZone9.getID();
        long long12 = dateTimeZone9.previousTransition((long) 'a');
        boolean boolean13 = dateTimeZone9.isFixed();
        long long17 = dateTimeZone9.convertLocalToUTC(0L, false, (long) (short) 100);
        long long19 = dateTimeZone0.getMillisKeepLocal(dateTimeZone9, (long) 5207);
        long long21 = dateTimeZone0.nextTransition((long) (-3600000));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTC" + "'", str1, "UTC");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 18748800052L + "'", long7 == 18748800052L);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 5207L + "'", long19 == 5207L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-3600000L) + "'", long21 == (-3600000L));
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("");
        java.lang.String str2 = locale1.toLanguageTag();
        java.lang.String str3 = locale1.getISO3Language();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "und" + "'", str2, "und");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.setVariant("DEUTSCH");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder1.setLanguageTag("77");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: 77 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder5 = builder1.clear();
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.addUnicodeLocaleAttribute("weekOfWeekyear");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: weekOfWeekyear [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clear();
        java.util.Locale.Builder builder3 = builder1.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder5 = builder3.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder3.setScript("hourOfHalfday");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: hourOfHalfday [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("\u516c\u5143", (double) (-79200434L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-7.9200434E7");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale4 = new java.util.Locale("10", "jpn", "us");
        java.lang.String str5 = locale4.getDisplayName();
        java.util.Locale.setDefault(category0, locale4);
        java.util.Locale locale7 = java.util.Locale.getDefault(category0);
        java.util.Locale locale8 = java.util.Locale.getDefault(category0);
        java.util.Locale locale9 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale4.toString(), "10_JPN_us");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10 (JPN,us)" + "'", str5, "10 (JPN,us)");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "10_JPN_us");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "10_JPN_us");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "10_JPN_us");
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale2 = new java.util.Locale("US");
        java.lang.String str3 = locale2.getVariant();
        java.util.Locale.setDefault(category0, locale2);
        java.util.Locale locale5 = java.util.Locale.getDefault(category0);
        org.joda.time.Chronology chronology7 = null;
        java.util.Locale locale8 = java.util.Locale.FRENCH;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology7, locale8, (java.lang.Integer) (-1), 0);
        java.util.Locale locale12 = java.util.Locale.ITALY;
        java.lang.String str13 = locale12.getScript();
        java.lang.String str14 = locale12.getScript();
        boolean boolean15 = dateTimeParserBucket11.restoreState((java.lang.Object) locale12);
        java.util.Locale.setDefault(category0, locale12);
        java.util.Locale locale17 = java.util.Locale.getDefault(category0);
        java.util.Locale locale18 = java.util.Locale.getDefault(category0);
        java.util.Locale locale19 = java.util.Locale.getDefault(category0);
        java.util.Locale locale20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.setDefault(category0, locale20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Can't set default locale to NULL");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale2.toString(), "us");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "us");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "it_IT");
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        java.util.Locale locale3 = new java.util.Locale("clockhourOfDay", "\u5fb7\u6587\u5fb7\u56fd)", "DATETIMEFIELD[DAYOFYEAR]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale3.getISO3Country();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter country code for ?? (??)");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u5fb7\u6587\u5fb7\u56fd)_DATETIMEFIELD[DAYOFYEAR]");
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder1.build();
        java.util.Set<java.lang.Character> charSet3 = locale2.getExtensionKeys();
        java.lang.String str4 = locale2.getDisplayCountry();
        java.util.Set<java.lang.String> strSet5 = locale2.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale.LanguageRange[] languageRangeArray1 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList2 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList2, languageRangeArray1);
        java.util.Locale locale4 = java.util.Locale.getDefault();
        java.lang.String str5 = locale4.getISO3Country();
        java.lang.String str6 = locale4.getISO3Language();
        java.util.Locale locale7 = java.util.Locale.getDefault();
        java.lang.String str8 = locale4.getDisplayVariant(locale7);
        java.util.Locale locale9 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology11 = null;
        java.util.Locale locale12 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology11, locale12, (java.lang.Integer) 100);
        java.util.Locale locale15 = java.util.Locale.getDefault();
        java.lang.String str16 = locale15.getISO3Country();
        java.lang.String str17 = locale15.getISO3Language();
        java.util.Locale locale18 = java.util.Locale.getDefault();
        java.lang.String str19 = locale15.getDisplayVariant(locale18);
        java.util.Locale locale20 = java.util.Locale.getDefault();
        java.lang.String str21 = locale20.getISO3Country();
        java.util.Locale locale22 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray23 = new java.util.Locale[] { locale4, locale9, locale12, locale15, locale20, locale22 };
        java.util.ArrayList<java.util.Locale> localeList24 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList24, localeArray23);
        java.util.Locale locale26 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.util.Locale>) localeList24);
        java.lang.String[] strArray30 = new java.lang.String[] { "zh", "hi!", "" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        java.lang.String str33 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.lang.String>) strList31);
        java.util.Locale.LanguageRange[] languageRangeArray34 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList35 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList35, languageRangeArray34);
        java.util.Locale locale37 = java.util.Locale.getDefault();
        java.lang.String str38 = locale37.getISO3Country();
        java.lang.String str39 = locale37.getISO3Language();
        java.util.Locale locale40 = java.util.Locale.getDefault();
        java.lang.String str41 = locale37.getDisplayVariant(locale40);
        java.util.Locale locale42 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology44 = null;
        java.util.Locale locale45 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket47 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology44, locale45, (java.lang.Integer) 100);
        java.util.Locale locale48 = java.util.Locale.getDefault();
        java.lang.String str49 = locale48.getISO3Country();
        java.lang.String str50 = locale48.getISO3Language();
        java.util.Locale locale51 = java.util.Locale.getDefault();
        java.lang.String str52 = locale48.getDisplayVariant(locale51);
        java.util.Locale locale53 = java.util.Locale.getDefault();
        java.lang.String str54 = locale53.getISO3Country();
        java.util.Locale locale55 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray56 = new java.util.Locale[] { locale37, locale42, locale45, locale48, locale53, locale55 };
        java.util.ArrayList<java.util.Locale> localeList57 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList57, localeArray56);
        java.util.Locale locale59 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, (java.util.Collection<java.util.Locale>) localeList57);
        java.util.List<java.util.Locale> localeList60 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.util.Locale>) localeList57);
        java.util.Locale.LanguageRange[] languageRangeArray61 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList62 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList62, languageRangeArray61);
        java.util.Locale locale64 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet65 = locale64.getUnicodeLocaleKeys();
        java.lang.String str66 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList62, (java.util.Collection<java.lang.String>) strSet65);
        java.lang.String str67 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.lang.String>) strSet65);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap68 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList69 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, strMap68);
        java.util.Collection<java.util.Locale> localeCollection70 = null;
        java.util.Locale.FilteringMode filteringMode71 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.util.Locale> localeList72 = java.util.Locale.filter(languageRangeList69, localeCollection70, filteringMode71);
        java.util.Locale locale73 = java.util.Locale.GERMAN;
        java.util.Locale locale74 = java.util.Locale.getDefault();
        java.lang.String str75 = locale73.getDisplayVariant(locale74);
        java.util.Set<java.lang.String> strSet76 = locale74.getUnicodeLocaleKeys();
        java.util.Locale.FilteringMode filteringMode77 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList78 = java.util.Locale.filterTags(languageRangeList69, (java.util.Collection<java.lang.String>) strSet76, filteringMode77);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap79 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList80 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList69, strMap79);
        java.util.Locale.LanguageRange[] languageRangeArray81 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList82 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList82, languageRangeArray81);
        java.util.Locale locale84 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet85 = locale84.getUnicodeLocaleKeys();
        java.lang.String str86 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList82, (java.util.Collection<java.lang.String>) strSet85);
        java.util.List<java.lang.String> strList87 = java.util.Locale.filterTags(languageRangeList80, (java.util.Collection<java.lang.String>) strSet85);
        org.joda.time.Chronology chronology89 = null;
        java.util.Locale locale91 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket94 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology89, locale91, (java.lang.Integer) 1, 0);
        java.util.Locale locale95 = java.util.Locale.ENGLISH;
        java.lang.String str96 = locale91.getDisplayName(locale95);
        java.util.Set<java.lang.String> strSet97 = locale91.getUnicodeLocaleAttributes();
        java.lang.String str98 = java.util.Locale.lookupTag(languageRangeList80, (java.util.Collection<java.lang.String>) strSet97);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str99 = java.util.Locale.lookupTag(languageRangeList0, (java.util.Collection<java.lang.String>) strSet97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zho" + "'", str6, "zho");
        org.junit.Assert.assertNotNull(locale7);
// flaky:         org.junit.Assert.assertEquals(locale7.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
// flaky:         org.junit.Assert.assertEquals(locale9.toString(), "zh");
        org.junit.Assert.assertNotNull(locale12);
// flaky:         org.junit.Assert.assertEquals(locale12.toString(), "zh");
        org.junit.Assert.assertNotNull(locale15);
// flaky:         org.junit.Assert.assertEquals(locale15.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "zho" + "'", str17, "zho");
        org.junit.Assert.assertNotNull(locale18);
// flaky:         org.junit.Assert.assertEquals(locale18.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale20);
// flaky:         org.junit.Assert.assertEquals(locale20.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(locale26);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(languageRangeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(locale37);
// flaky:         org.junit.Assert.assertEquals(locale37.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "zho" + "'", str39, "zho");
        org.junit.Assert.assertNotNull(locale40);
// flaky:         org.junit.Assert.assertEquals(locale40.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(locale42);
// flaky:         org.junit.Assert.assertEquals(locale42.toString(), "zh");
        org.junit.Assert.assertNotNull(locale45);
// flaky:         org.junit.Assert.assertEquals(locale45.toString(), "zh");
        org.junit.Assert.assertNotNull(locale48);
// flaky:         org.junit.Assert.assertEquals(locale48.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
// flaky:         org.junit.Assert.assertEquals("'" + str50 + "' != '" + "zho" + "'", str50, "zho");
        org.junit.Assert.assertNotNull(locale51);
// flaky:         org.junit.Assert.assertEquals(locale51.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(locale53);
// flaky:         org.junit.Assert.assertEquals(locale53.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNull(locale59);
        org.junit.Assert.assertNotNull(localeList60);
        org.junit.Assert.assertNotNull(languageRangeArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet65);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNotNull(languageRangeList69);
        org.junit.Assert.assertTrue("'" + filteringMode71 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode71.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(localeList72);
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "de");
        org.junit.Assert.assertNotNull(locale74);
// flaky:         org.junit.Assert.assertEquals(locale74.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNotNull(strSet76);
        org.junit.Assert.assertTrue("'" + filteringMode77 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode77.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList78);
        org.junit.Assert.assertNotNull(languageRangeList80);
        org.junit.Assert.assertNotNull(languageRangeArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(locale84);
        org.junit.Assert.assertEquals(locale84.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet85);
        org.junit.Assert.assertNull(str86);
        org.junit.Assert.assertNotNull(strList87);
        org.junit.Assert.assertEquals(locale91.toString(), "");
        org.junit.Assert.assertNotNull(locale95);
        org.junit.Assert.assertEquals(locale95.toString(), "en");
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "" + "'", str96, "");
        org.junit.Assert.assertNotNull(strSet97);
        org.junit.Assert.assertNull(str98);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("JPN");
        java.lang.String str2 = locale1.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "jpn");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((long) 'a');
        boolean boolean5 = dateTimeZone1.isFixed();
        int int7 = dateTimeZone1.getStandardOffset(97L);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone9.getOffset(readableInstant10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone9.getOffset(readableInstant12);
        long long15 = dateTimeZone1.getMillisKeepLocal(dateTimeZone9, 3599999L);
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        int int19 = dateTimeZone17.getStandardOffset((long) (byte) -1);
        java.lang.String str20 = dateTimeZone17.toString();
        java.lang.String str22 = dateTimeZone17.getShortName((long) '#');
        long long24 = dateTimeZone9.getMillisKeepLocal(dateTimeZone17, 35L);
        java.lang.String str25 = dateTimeZone17.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3599999L + "'", long15 == 3599999L);
        org.junit.Assert.assertNotNull(dateTimeZone17);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTC" + "'", str20, "UTC");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 35L + "'", long24 == 35L);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "UTC" + "'", str25, "UTC");
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        java.util.Locale locale1 = new java.util.Locale("");
        java.lang.String str2 = locale1.getISO3Language();
        java.lang.String str3 = locale1.getDisplayScript();
        java.lang.String str4 = locale1.getCountry();
        java.util.Locale.setDefault(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        java.util.Locale locale1 = new java.util.Locale("7");
        org.junit.Assert.assertEquals(locale1.toString(), "7");
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        java.util.Locale locale2 = new java.util.Locale("-6011", "usa_ZHO");
        org.junit.Assert.assertEquals(locale2.toString(), "-6011_USA_ZHO");
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((long) 'a');
        boolean boolean5 = dateTimeZone1.isFixed();
        long long9 = dateTimeZone1.convertLocalToUTC(0L, false, (long) (short) 100);
        int int11 = dateTimeZone1.getStandardOffset(107L);
        long long15 = dateTimeZone1.convertLocalToUTC((long) 10, true, (-3L));
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone1.getOffset(readableInstant16);
        long long20 = dateTimeZone1.adjustOffset(259200090L, false);
        int int22 = dateTimeZone1.getOffset((long) 0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 259200090L + "'", long20 == 259200090L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("-434");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=-434");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("\u4e0b\u5348");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=??");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        long long6 = dateTimeZone1.convertLocalToUTC((long) 1, true);
        java.lang.String str7 = dateTimeZone1.toString();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long11 = dateTimeZone1.adjustOffset(259200048L, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int14 = dateTimeZone1.getStandardOffset((long) 99);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 259200048L + "'", long11 == 259200048L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("italia");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Chronology chronology5 = null;
        java.util.Locale locale6 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology5, locale6, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket(100L, chronology3, locale6);
        int int10 = dateTimeParserBucket9.getOffset();
        java.lang.Object obj11 = dateTimeParserBucket9.saveState();
        java.util.Locale locale12 = dateTimeParserBucket9.getLocale();
        java.lang.String str13 = locale12.getCountry();
        boolean boolean14 = languageRange1.equals((java.lang.Object) str13);
        org.junit.Assert.assertNotNull(locale6);
// flaky:         org.junit.Assert.assertEquals(locale6.toString(), "zh");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(locale12);
// flaky:         org.junit.Assert.assertEquals(locale12.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.GERMANY;
        java.lang.String str2 = locale1.getDisplayCountry();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale4 = java.util.Locale.getDefault(category0);
        java.util.Locale locale5 = java.util.Locale.getDefault();
        java.lang.String str6 = locale5.getISO3Country();
        java.lang.String str7 = locale5.getISO3Language();
        java.util.Locale locale8 = java.util.Locale.getDefault();
        java.lang.String str9 = locale5.getDisplayVariant(locale8);
        java.util.Locale.setDefault(category0, locale8);
        java.util.Locale locale11 = java.util.Locale.getDefault(category0);
        java.util.Locale.Builder builder12 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder13 = builder12.clear();
        java.util.Locale.Builder builder14 = builder13.clearExtensions();
        java.util.Locale.Builder builder16 = builder14.setLanguageTag("fr-CA");
        java.util.Locale locale17 = builder14.build();
        java.lang.String str18 = locale17.getCountry();
        java.lang.String str19 = locale17.getISO3Country();
        java.util.Locale.setDefault(category0, locale17);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u5fb7\u56fd" + "'", str2, "\u5fb7\u56fd");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale5);
// flaky:         org.junit.Assert.assertEquals(locale5.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zho" + "'", str7, "zho");
        org.junit.Assert.assertNotNull(locale8);
// flaky:         org.junit.Assert.assertEquals(locale8.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale11);
// flaky:         org.junit.Assert.assertEquals(locale11.toString(), "zh");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "CA" + "'", str18, "CA");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "CAN" + "'", str19, "CAN");
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("secondOfMinute");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        long long3 = dateTimeZone1.nextTransition((long) (-434));
        java.lang.String str4 = dateTimeZone1.getID();
        int int6 = dateTimeZone1.getOffset(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-434L) + "'", long3 == (-434L));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.001" + "'", str4, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.addUnicodeLocaleAttribute("UTC");
        java.util.Locale.Builder builder3 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder3.setExtension('x', "secondOfMinute");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: secondOfMinute [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        java.io.IOException iOException2 = new java.io.IOException("UTC");
        java.io.IOException iOException5 = new java.io.IOException("zho");
        java.lang.Throwable[] throwableArray6 = iOException5.getSuppressed();
        java.lang.Throwable throwable8 = null;
        java.io.IOException iOException9 = new java.io.IOException("UTC", throwable8);
        java.io.IOException iOException10 = new java.io.IOException(throwable8);
        iOException5.addSuppressed((java.lang.Throwable) iOException10);
        java.io.IOException iOException12 = new java.io.IOException("UTC", (java.lang.Throwable) iOException10);
        iOException2.addSuppressed((java.lang.Throwable) iOException10);
        java.io.IOException iOException14 = new java.io.IOException("72000", (java.lang.Throwable) iOException10);
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("-08:00", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=-08:00");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Germany");
        java.lang.String str2 = languageRange1.getRange();
        java.util.Locale.LanguageRange languageRange4 = new java.util.Locale.LanguageRange("Germany");
        java.lang.String str5 = languageRange4.getRange();
        java.util.Locale.LanguageRange[] languageRangeArray6 = new java.util.Locale.LanguageRange[] { languageRange1, languageRange4 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList7 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7, languageRangeArray6);
        java.util.Locale.LanguageRange languageRange10 = new java.util.Locale.LanguageRange("Germany");
        java.util.Locale.LanguageRange[] languageRangeArray11 = new java.util.Locale.LanguageRange[] { languageRange10 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList12 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList12, languageRangeArray11);
        java.util.Locale.LanguageRange[] languageRangeArray14 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList15 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList15, languageRangeArray14);
        java.util.Locale locale17 = java.util.Locale.getDefault();
        java.lang.String str18 = locale17.getISO3Country();
        java.lang.String str19 = locale17.getISO3Language();
        java.util.Locale locale20 = java.util.Locale.getDefault();
        java.lang.String str21 = locale17.getDisplayVariant(locale20);
        java.util.Locale locale22 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology24 = null;
        java.util.Locale locale25 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology24, locale25, (java.lang.Integer) 100);
        java.util.Locale locale28 = java.util.Locale.getDefault();
        java.lang.String str29 = locale28.getISO3Country();
        java.lang.String str30 = locale28.getISO3Language();
        java.util.Locale locale31 = java.util.Locale.getDefault();
        java.lang.String str32 = locale28.getDisplayVariant(locale31);
        java.util.Locale locale33 = java.util.Locale.getDefault();
        java.lang.String str34 = locale33.getISO3Country();
        java.util.Locale locale35 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray36 = new java.util.Locale[] { locale17, locale22, locale25, locale28, locale33, locale35 };
        java.util.ArrayList<java.util.Locale> localeList37 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList37, localeArray36);
        java.util.Locale locale39 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, (java.util.Collection<java.util.Locale>) localeList37);
        java.util.Locale.FilteringMode filteringMode40 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList41 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, (java.util.Collection<java.util.Locale>) localeList37, filteringMode40);
        java.util.List<java.util.Locale> localeList42 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.util.Locale>) localeList41);
        java.util.Locale.LanguageRange languageRange44 = new java.util.Locale.LanguageRange("Germany");
        java.util.Locale.LanguageRange[] languageRangeArray45 = new java.util.Locale.LanguageRange[] { languageRange44 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList46 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList46, languageRangeArray45);
        java.util.Locale.LanguageRange[] languageRangeArray48 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList49 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList49, languageRangeArray48);
        java.util.Locale locale51 = java.util.Locale.getDefault();
        java.lang.String str52 = locale51.getISO3Country();
        java.lang.String str53 = locale51.getISO3Language();
        java.util.Locale locale54 = java.util.Locale.getDefault();
        java.lang.String str55 = locale51.getDisplayVariant(locale54);
        java.util.Locale locale56 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology58 = null;
        java.util.Locale locale59 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket61 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology58, locale59, (java.lang.Integer) 100);
        java.util.Locale locale62 = java.util.Locale.getDefault();
        java.lang.String str63 = locale62.getISO3Country();
        java.lang.String str64 = locale62.getISO3Language();
        java.util.Locale locale65 = java.util.Locale.getDefault();
        java.lang.String str66 = locale62.getDisplayVariant(locale65);
        java.util.Locale locale67 = java.util.Locale.getDefault();
        java.lang.String str68 = locale67.getISO3Country();
        java.util.Locale locale69 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray70 = new java.util.Locale[] { locale51, locale56, locale59, locale62, locale67, locale69 };
        java.util.ArrayList<java.util.Locale> localeList71 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList71, localeArray70);
        java.util.Locale locale73 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList49, (java.util.Collection<java.util.Locale>) localeList71);
        java.util.Locale.FilteringMode filteringMode74 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList75 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList46, (java.util.Collection<java.util.Locale>) localeList71, filteringMode74);
        java.util.Locale locale76 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.util.Locale>) localeList71);
        java.util.Locale.LanguageRange[] languageRangeArray77 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList78 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList78, languageRangeArray77);
        java.util.Locale locale80 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet81 = locale80.getUnicodeLocaleKeys();
        java.lang.String str82 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList78, (java.util.Collection<java.lang.String>) strSet81);
        java.util.Locale locale83 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet84 = locale83.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList85 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList78, (java.util.Collection<java.lang.String>) strSet84);
        java.util.List<java.lang.String> strList86 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.lang.String>) strSet84);
        java.util.Collection<java.util.Locale> localeCollection87 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale> localeList88 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, localeCollection87);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "germany" + "'", str2, "germany");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "germany" + "'", str5, "germany");
        org.junit.Assert.assertNotNull(languageRangeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(languageRangeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(languageRangeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(locale17);
// flaky:         org.junit.Assert.assertEquals(locale17.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "zho" + "'", str19, "zho");
        org.junit.Assert.assertNotNull(locale20);
// flaky:         org.junit.Assert.assertEquals(locale20.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(locale22);
// flaky:         org.junit.Assert.assertEquals(locale22.toString(), "zh");
        org.junit.Assert.assertNotNull(locale25);
// flaky:         org.junit.Assert.assertEquals(locale25.toString(), "zh");
        org.junit.Assert.assertNotNull(locale28);
// flaky:         org.junit.Assert.assertEquals(locale28.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "zho" + "'", str30, "zho");
        org.junit.Assert.assertNotNull(locale31);
// flaky:         org.junit.Assert.assertEquals(locale31.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(locale33);
// flaky:         org.junit.Assert.assertEquals(locale33.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(locale39);
        org.junit.Assert.assertTrue("'" + filteringMode40 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode40.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList41);
        org.junit.Assert.assertNotNull(localeList42);
        org.junit.Assert.assertNotNull(languageRangeArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(languageRangeArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(locale51);
// flaky:         org.junit.Assert.assertEquals(locale51.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
// flaky:         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "zho" + "'", str53, "zho");
        org.junit.Assert.assertNotNull(locale54);
// flaky:         org.junit.Assert.assertEquals(locale54.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(locale56);
// flaky:         org.junit.Assert.assertEquals(locale56.toString(), "zh");
        org.junit.Assert.assertNotNull(locale59);
// flaky:         org.junit.Assert.assertEquals(locale59.toString(), "zh");
        org.junit.Assert.assertNotNull(locale62);
// flaky:         org.junit.Assert.assertEquals(locale62.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
// flaky:         org.junit.Assert.assertEquals("'" + str64 + "' != '" + "zho" + "'", str64, "zho");
        org.junit.Assert.assertNotNull(locale65);
// flaky:         org.junit.Assert.assertEquals(locale65.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(locale67);
// flaky:         org.junit.Assert.assertEquals(locale67.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNull(locale73);
        org.junit.Assert.assertTrue("'" + filteringMode74 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode74.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList75);
        org.junit.Assert.assertNull(locale76);
        org.junit.Assert.assertNotNull(languageRangeArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet81);
        org.junit.Assert.assertNull(str82);
        org.junit.Assert.assertNotNull(locale83);
        org.junit.Assert.assertEquals(locale83.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet84);
        org.junit.Assert.assertNotNull(strList85);
        org.junit.Assert.assertNotNull(strList86);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getOffsetInteger();
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        int int9 = dateTimeZone7.getStandardOffset((long) (byte) -1);
        java.lang.String str11 = dateTimeZone7.getName(32054400100L);
        dateTimeParserBucket4.setZone(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeParserBucket4.getZone();
        int int15 = dateTimeZone13.getOffset(0L);
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "thu");
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        int int3 = dateTimeZone1.getStandardOffset((long) (byte) -1);
        java.lang.String str4 = dateTimeZone1.toString();
        java.lang.String str6 = dateTimeZone1.getShortName((long) '#');
        java.util.Locale locale7 = java.util.Locale.GERMAN;
        boolean boolean8 = dateTimeZone1.equals((java.lang.Object) locale7);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str11 = dateTimeZone10.getID();
        long long13 = dateTimeZone10.previousTransition((long) 'a');
        boolean boolean14 = dateTimeZone10.isFixed();
        int int16 = dateTimeZone10.getStandardOffset(97L);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant19 = null;
        int int20 = dateTimeZone18.getOffset(readableInstant19);
        org.joda.time.ReadableInstant readableInstant21 = null;
        int int22 = dateTimeZone18.getOffset(readableInstant21);
        long long24 = dateTimeZone10.getMillisKeepLocal(dateTimeZone18, 3599999L);
        long long26 = dateTimeZone18.convertUTCToLocal((long) (byte) 100);
        org.joda.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = dateTimeZone18.isLocalDateTimeGap(localDateTime27);
        long long30 = dateTimeZone1.getMillisKeepLocal(dateTimeZone18, (long) 8);
        java.lang.String str31 = dateTimeZone18.toString();
        int int33 = dateTimeZone18.getOffsetFromLocal(338855117L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 3599999L + "'", long24 == 3599999L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 100L + "'", long26 == 100L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 8L + "'", long30 == 8L);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "UTC" + "'", str31, "UTC");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        java.io.IOException iOException3 = new java.io.IOException("UTC");
        java.io.IOException iOException5 = new java.io.IOException("zho");
        iOException3.addSuppressed((java.lang.Throwable) iOException5);
        java.io.IOException iOException7 = new java.io.IOException("2", (java.lang.Throwable) iOException3);
        java.io.IOException iOException8 = new java.io.IOException((java.lang.Throwable) iOException7);
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) iOException8);
        java.io.IOException iOException10 = new java.io.IOException("DateTimeField[weekOfWeekyear]", (java.lang.Throwable) iOException9);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("de");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap2);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap4 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList5 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap4);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap6 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap6);
        java.util.Locale.LanguageRange[] languageRangeArray8 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList9 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9, languageRangeArray8);
        java.util.Locale locale11 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet12 = locale11.getUnicodeLocaleKeys();
        java.lang.String str13 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, (java.util.Collection<java.lang.String>) strSet12);
        java.util.Locale locale14 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet15 = locale14.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList16 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, (java.util.Collection<java.lang.String>) strSet15);
        java.util.Locale.LanguageRange[] languageRangeArray17 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList18 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18, languageRangeArray17);
        java.util.Locale locale20 = java.util.Locale.getDefault();
        java.lang.String str21 = locale20.getISO3Country();
        java.lang.String str22 = locale20.getISO3Language();
        java.util.Locale locale23 = java.util.Locale.getDefault();
        java.lang.String str24 = locale20.getDisplayVariant(locale23);
        java.util.Locale locale25 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology27 = null;
        java.util.Locale locale28 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology27, locale28, (java.lang.Integer) 100);
        java.util.Locale locale31 = java.util.Locale.getDefault();
        java.lang.String str32 = locale31.getISO3Country();
        java.lang.String str33 = locale31.getISO3Language();
        java.util.Locale locale34 = java.util.Locale.getDefault();
        java.lang.String str35 = locale31.getDisplayVariant(locale34);
        java.util.Locale locale36 = java.util.Locale.getDefault();
        java.lang.String str37 = locale36.getISO3Country();
        java.util.Locale locale38 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray39 = new java.util.Locale[] { locale20, locale25, locale28, locale31, locale36, locale38 };
        java.util.ArrayList<java.util.Locale> localeList40 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList40, localeArray39);
        java.util.Locale locale42 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.util.Locale>) localeList40);
        java.lang.String[] strArray46 = new java.lang.String[] { "zh", "hi!", "" };
        java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        java.lang.String str49 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.lang.String>) strList47);
        java.util.Locale.LanguageRange[] languageRangeArray50 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList51 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList51, languageRangeArray50);
        java.util.Locale locale53 = java.util.Locale.getDefault();
        java.lang.String str54 = locale53.getISO3Country();
        java.lang.String str55 = locale53.getISO3Language();
        java.util.Locale locale56 = java.util.Locale.getDefault();
        java.lang.String str57 = locale53.getDisplayVariant(locale56);
        java.util.Locale locale58 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology60 = null;
        java.util.Locale locale61 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket63 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology60, locale61, (java.lang.Integer) 100);
        java.util.Locale locale64 = java.util.Locale.getDefault();
        java.lang.String str65 = locale64.getISO3Country();
        java.lang.String str66 = locale64.getISO3Language();
        java.util.Locale locale67 = java.util.Locale.getDefault();
        java.lang.String str68 = locale64.getDisplayVariant(locale67);
        java.util.Locale locale69 = java.util.Locale.getDefault();
        java.lang.String str70 = locale69.getISO3Country();
        java.util.Locale locale71 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray72 = new java.util.Locale[] { locale53, locale58, locale61, locale64, locale69, locale71 };
        java.util.ArrayList<java.util.Locale> localeList73 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList73, localeArray72);
        java.util.Locale locale75 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList51, (java.util.Collection<java.util.Locale>) localeList73);
        java.util.List<java.util.Locale> localeList76 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.util.Locale>) localeList73);
        java.util.List<java.util.Locale> localeList77 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, (java.util.Collection<java.util.Locale>) localeList73);
        java.util.Locale.FilteringMode filteringMode78 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList79 = java.util.Locale.filter(languageRangeList1, (java.util.Collection<java.util.Locale>) localeList77, filteringMode78);
        java.util.Locale locale81 = java.util.Locale.forLanguageTag("\u5fb7\u56fd");
        java.lang.String str82 = locale81.getDisplayScript();
        java.util.Set<java.lang.String> strSet83 = locale81.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList84 = java.util.Locale.filterTags(languageRangeList1, (java.util.Collection<java.lang.String>) strSet83);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertNotNull(languageRangeList5);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertNotNull(languageRangeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(languageRangeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(locale20);
// flaky:         org.junit.Assert.assertEquals(locale20.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "zho" + "'", str22, "zho");
        org.junit.Assert.assertNotNull(locale23);
// flaky:         org.junit.Assert.assertEquals(locale23.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(locale25);
// flaky:         org.junit.Assert.assertEquals(locale25.toString(), "zh");
        org.junit.Assert.assertNotNull(locale28);
// flaky:         org.junit.Assert.assertEquals(locale28.toString(), "zh");
        org.junit.Assert.assertNotNull(locale31);
// flaky:         org.junit.Assert.assertEquals(locale31.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "zho" + "'", str33, "zho");
        org.junit.Assert.assertNotNull(locale34);
// flaky:         org.junit.Assert.assertEquals(locale34.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(locale36);
// flaky:         org.junit.Assert.assertEquals(locale36.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(locale42);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(languageRangeArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(locale53);
// flaky:         org.junit.Assert.assertEquals(locale53.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
// flaky:         org.junit.Assert.assertEquals("'" + str55 + "' != '" + "zho" + "'", str55, "zho");
        org.junit.Assert.assertNotNull(locale56);
// flaky:         org.junit.Assert.assertEquals(locale56.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(locale58);
// flaky:         org.junit.Assert.assertEquals(locale58.toString(), "zh");
        org.junit.Assert.assertNotNull(locale61);
// flaky:         org.junit.Assert.assertEquals(locale61.toString(), "zh");
        org.junit.Assert.assertNotNull(locale64);
// flaky:         org.junit.Assert.assertEquals(locale64.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
// flaky:         org.junit.Assert.assertEquals("'" + str66 + "' != '" + "zho" + "'", str66, "zho");
        org.junit.Assert.assertNotNull(locale67);
// flaky:         org.junit.Assert.assertEquals(locale67.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(locale69);
// flaky:         org.junit.Assert.assertEquals(locale69.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNull(locale75);
        org.junit.Assert.assertNotNull(localeList76);
        org.junit.Assert.assertNotNull(localeList77);
        org.junit.Assert.assertTrue("'" + filteringMode78 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode78.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList79);
        org.junit.Assert.assertNotNull(locale81);
        org.junit.Assert.assertEquals(locale81.toString(), "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertNotNull(strSet83);
        org.junit.Assert.assertNotNull(strList84);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("0", (double) (-2L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-2.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, 5);
        java.lang.String str4 = dateTimeZone2.getNameKey(12L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("Japanisch");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'Japanisch' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        java.io.IOException iOException1 = new java.io.IOException("DateTimeField[weekyear]");
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) '#');
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.util.Locale locale8 = new java.util.Locale("weekOfWeekyear", "UTC", "+00:00");
        boolean boolean9 = locale8.hasExtensions();
        org.joda.time.Chronology chronology11 = null;
        java.util.Locale locale12 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology11, locale12, (java.lang.Integer) 100);
        java.lang.String str15 = locale8.getDisplayCountry(locale12);
        java.lang.String str16 = dateTimeZone3.getShortName((long) (short) 1, locale12);
        java.lang.String str17 = dateTimeZone3.getID();
        int int19 = dateTimeZone3.getStandardOffset(60480000010L);
        int int21 = dateTimeZone3.getStandardOffset(259200107L);
        long long23 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, 18748800000L);
        long long27 = dateTimeZone1.convertLocalToUTC(3124483200000L, false, (-90L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals(locale8.toString(), "weekofweekyear_UTC_+00:00");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(locale12);
// flaky:         org.junit.Assert.assertEquals(locale12.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+100:05" + "'", str16, "+100:05");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+100:05" + "'", str17, "+100:05");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 360300000 + "'", int19 == 360300000);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 360300000 + "'", int21 == 360300000);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 18514500000L + "'", long23 == 18514500000L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 3124357200000L + "'", long27 == 3124357200000L);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("20");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=20");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.GERMANY;
        java.lang.String str2 = locale1.getDisplayCountry();
        java.util.Locale.setDefault(category0, locale1);
        java.lang.String str4 = locale1.getDisplayLanguage();
        java.lang.String str5 = locale1.toString();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Germania" + "'", str2, "Germania");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "tedesco" + "'", str4, "tedesco");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "de_DE" + "'", str5, "de_DE");
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        int int8 = dateTimeParserBucket7.getOffset();
        java.lang.Object obj9 = dateTimeParserBucket7.saveState();
        java.util.Locale locale10 = dateTimeParserBucket7.getLocale();
        java.lang.Integer int11 = dateTimeParserBucket7.getOffsetInteger();
        org.joda.time.Chronology chronology12 = dateTimeParserBucket7.getChronology();
        int int13 = dateTimeParserBucket7.getOffset();
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "it_IT");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(locale10);
// flaky:         org.junit.Assert.assertEquals(locale10.toString(), "it_IT");
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket7.getZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        java.util.TimeZone timeZone10 = dateTimeZone8.toTimeZone();
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone8.isLocalDateTimeGap(localDateTime11);
        java.lang.String str14 = dateTimeZone8.getName(363599999L);
        java.util.TimeZone timeZone15 = dateTimeZone8.toTimeZone();
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone8.getOffset(readableInstant16);
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "it_IT");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone10);
// flaky:         org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Tempo universale coordinato");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertNotNull(timeZone15);
// flaky:         org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Tempo universale coordinato");
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Italienisch (Italien)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=italienisch (italien)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("ko");
        org.junit.Assert.assertNotNull(languageRangeList1);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("Italy");
        org.junit.Assert.assertNotNull(languageRangeList1);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale5 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology4, locale5, (java.lang.Integer) 100);
        java.util.Locale[] localeArray8 = new java.util.Locale[] { locale5 };
        java.util.ArrayList<java.util.Locale> localeList9 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList9, localeArray8);
        java.util.Locale locale11 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList9);
        java.util.Locale.LanguageRange languageRange13 = new java.util.Locale.LanguageRange("Germany");
        java.util.Locale.LanguageRange[] languageRangeArray14 = new java.util.Locale.LanguageRange[] { languageRange13 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList15 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList15, languageRangeArray14);
        java.util.Locale.LanguageRange[] languageRangeArray17 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList18 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18, languageRangeArray17);
        java.util.Locale locale20 = java.util.Locale.getDefault();
        java.lang.String str21 = locale20.getISO3Country();
        java.lang.String str22 = locale20.getISO3Language();
        java.util.Locale locale23 = java.util.Locale.getDefault();
        java.lang.String str24 = locale20.getDisplayVariant(locale23);
        java.util.Locale locale25 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology27 = null;
        java.util.Locale locale28 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology27, locale28, (java.lang.Integer) 100);
        java.util.Locale locale31 = java.util.Locale.getDefault();
        java.lang.String str32 = locale31.getISO3Country();
        java.lang.String str33 = locale31.getISO3Language();
        java.util.Locale locale34 = java.util.Locale.getDefault();
        java.lang.String str35 = locale31.getDisplayVariant(locale34);
        java.util.Locale locale36 = java.util.Locale.getDefault();
        java.lang.String str37 = locale36.getISO3Country();
        java.util.Locale locale38 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray39 = new java.util.Locale[] { locale20, locale25, locale28, locale31, locale36, locale38 };
        java.util.ArrayList<java.util.Locale> localeList40 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList40, localeArray39);
        java.util.Locale locale42 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.util.Locale>) localeList40);
        java.util.Locale.FilteringMode filteringMode43 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList44 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, (java.util.Collection<java.util.Locale>) localeList40, filteringMode43);
        java.util.List<java.util.Locale> localeList45 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList44);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale5);
// flaky:         org.junit.Assert.assertEquals(locale5.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(locale11);
        org.junit.Assert.assertNotNull(languageRangeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(languageRangeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(locale20);
// flaky:         org.junit.Assert.assertEquals(locale20.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "zho" + "'", str22, "zho");
        org.junit.Assert.assertNotNull(locale23);
// flaky:         org.junit.Assert.assertEquals(locale23.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(locale25);
// flaky:         org.junit.Assert.assertEquals(locale25.toString(), "zh");
        org.junit.Assert.assertNotNull(locale28);
// flaky:         org.junit.Assert.assertEquals(locale28.toString(), "zh");
        org.junit.Assert.assertNotNull(locale31);
// flaky:         org.junit.Assert.assertEquals(locale31.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "zho" + "'", str33, "zho");
        org.junit.Assert.assertNotNull(locale34);
// flaky:         org.junit.Assert.assertEquals(locale34.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(locale36);
// flaky:         org.junit.Assert.assertEquals(locale36.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(locale42);
        org.junit.Assert.assertTrue("'" + filteringMode43 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode43.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList44);
        org.junit.Assert.assertNotNull(localeList45);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("DateTimeField[minuteOfHour]", (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=100.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder10 = builder7.setExtension('x', "");
        java.util.Locale.Builder builder11 = builder7.clearExtensions();
        java.util.Locale locale12 = builder7.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder7.setLanguageTag("\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: ??????? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "ita");
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.FRENCH;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology1, locale2, (java.lang.Integer) (-1), 0);
        java.util.Locale locale6 = locale2.stripExtensions();
        java.util.Set<java.lang.String> strSet7 = locale6.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet8 = locale6.getUnicodeLocaleKeys();
        java.lang.String str9 = locale6.getISO3Language();
        java.lang.String str10 = locale6.getISO3Country();
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "fra" + "'", str9, "fra");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("DateTimeField[minuteOfDay]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=datetimefield[minuteofday]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Germany");
        double double2 = languageRange1.getWeight();
        double double3 = languageRange1.getWeight();
        double double4 = languageRange1.getWeight();
        double double5 = languageRange1.getWeight();
        double double6 = languageRange1.getWeight();
        boolean boolean8 = languageRange1.equals((java.lang.Object) 361920000);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("\u52a0\u62ff\u5927");
        java.util.Locale.setDefault(locale1);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=???????");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "100");
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale locale6 = builder5.build();
        java.util.Locale.Builder builder8 = builder5.addUnicodeLocaleAttribute("Oct");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.setRegion("Italian (Italy)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: Italian (Italy) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        java.io.IOException iOException1 = new java.io.IOException("Korean");
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.nextTransition((-1L));
        boolean boolean6 = dateTimeZone1.isStandardOffset((long) (-1));
        org.joda.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = dateTimeZone1.isLocalDateTimeGap(localDateTime7);
        long long10 = dateTimeZone1.convertUTCToLocal((-176675418259198030L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-176675418259198030L) + "'", long10 == (-176675418259198030L));
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        java.lang.Throwable throwable1 = null;
        java.io.IOException iOException2 = new java.io.IOException("it-IT", throwable1);
        java.lang.Throwable[] throwableArray3 = iOException2.getSuppressed();
        java.lang.String str4 = iOException2.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.io.IOException: it-IT" + "'", str4, "java.io.IOException: it-IT");
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        java.io.IOException iOException2 = new java.io.IOException("UTC");
        java.io.IOException iOException4 = new java.io.IOException("zho");
        iOException2.addSuppressed((java.lang.Throwable) iOException4);
        java.lang.Throwable[] throwableArray6 = iOException2.getSuppressed();
        java.io.IOException iOException7 = new java.io.IOException("weekOfWeekyear", (java.lang.Throwable) iOException2);
        java.io.IOException iOException8 = new java.io.IOException((java.lang.Throwable) iOException7);
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) iOException7);
        java.lang.Throwable[] throwableArray10 = iOException7.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray10);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("java.io.ioexception: weekyear");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        java.util.Locale locale1 = new java.util.Locale("\u4e2d\u56fd");
        java.lang.String str2 = locale1.toString();
        org.junit.Assert.assertEquals(locale1.toString(), "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u56fd" + "'", str2, "\u4e2d\u56fd");
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("italia");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'italia' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        java.util.Locale locale2 = new java.util.Locale("", "Italy");
        org.junit.Assert.assertEquals(locale2.toString(), "_ITALY");
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(338855);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("\u30c9\u30a4\u30c4\u8a9e");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=?????");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale.Category category1 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale2 = java.util.Locale.getDefault(category1);
        java.util.Locale locale3 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(category1, locale3);
        java.util.Locale locale5 = java.util.Locale.getDefault(category1);
        java.util.Locale locale6 = java.util.Locale.getDefault(category1);
        java.lang.String str7 = locale0.getDisplayLanguage(locale6);
        java.lang.String str8 = locale0.getISO3Language();
        java.lang.Object obj9 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category1.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "zh");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Chinesisch" + "'", str7, "Chinesisch");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zho" + "'", str8, "zho");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "zh_TW");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "zh_TW");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "zh_TW");
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Chronology chronology5 = null;
        java.util.Locale locale6 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology5, locale6, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket(100L, chronology3, locale6);
        boolean boolean10 = dateTimeZone1.equals((java.lang.Object) dateTimeParserBucket9);
        java.util.TimeZone timeZone11 = dateTimeZone1.toTimeZone();
        java.lang.String str13 = dateTimeZone1.getNameKey((long) '4');
        boolean boolean14 = dateTimeZone1.isFixed();
        java.lang.String str15 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(locale6);
// flaky:         org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(timeZone11);
// flaky:         org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale locale3 = builder1.build();
        java.util.Locale.Builder builder5 = builder1.setLanguage("ITA");
        java.util.Locale.Builder builder8 = builder5.setExtension('a', "FRA");
        java.util.Locale.Builder builder9 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder10 = builder9.clearExtensions();
        java.util.Locale locale11 = builder10.build();
        java.util.Locale locale12 = locale11.stripExtensions();
        java.lang.String str13 = locale11.getISO3Country();
        java.util.Locale.Builder builder14 = builder8.setLocale(locale11);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder17 = builder14.setUnicodeLocaleKeyword("java.io.IOException: Oct", "zh-CN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: java.io.IOException: Oct [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("72000", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=72000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("1970");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '1970' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("year");
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("\u5fb7\u56fd");
        java.lang.String str4 = locale1.getDisplayLanguage(locale3);
        java.lang.String str5 = locale3.getISO3Country();
        java.util.Locale.setDefault(locale3);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "year");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "year" + "'", str4, "year");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Chronology chronology5 = null;
        java.util.Locale locale6 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology5, locale6, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket(100L, chronology3, locale6);
        boolean boolean10 = dateTimeZone1.equals((java.lang.Object) dateTimeParserBucket9);
        java.lang.Object obj11 = dateTimeParserBucket9.saveState();
        long long13 = dateTimeParserBucket9.computeMillis(true);
        long long14 = dateTimeParserBucket9.computeMillis();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("58");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '58' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((-33000000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        int int8 = dateTimeParserBucket7.getOffset();
        java.lang.Object obj9 = dateTimeParserBucket7.saveState();
        java.util.Locale locale10 = dateTimeParserBucket7.getLocale();
        java.lang.Integer int11 = dateTimeParserBucket7.getOffsetInteger();
        org.joda.time.Chronology chronology12 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.weekyearOfCentury();
        java.lang.String str15 = dateTimeField13.getAsShortText((long) 'u');
        org.joda.time.ReadablePartial readablePartial16 = null;
        java.util.Locale locale19 = new java.util.Locale("\u610f\u5927\u5229\u6587");
        java.lang.String str20 = dateTimeField13.getAsShortText(readablePartial16, 23, locale19);
        long long23 = dateTimeField13.set(15769284200L, 0);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "70" + "'", str15, "70");
        org.junit.Assert.assertEquals(locale19.toString(), "\u610f\u5927\u5229\u6587");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "23" + "'", str20, "23");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-2193219515800L) + "'", long23 == (-2193219515800L));
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("it");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'it' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ita");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder0.setScript("+00:00:00.032");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: +00:00:00.032 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder9 = builder7.removeUnicodeLocaleAttribute("jpn");
        java.util.Locale.Builder builder11 = builder9.setLanguage("CN");
        java.util.Locale.Builder builder12 = builder11.clearExtensions();
        java.util.Locale.Builder builder13 = builder11.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder13.setLanguageTag("\u610f\u5927\u5229\u6587");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: ???? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket(604800053L, chronology1, locale2);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str6 = dateTimeZone5.getID();
        long long8 = dateTimeZone5.nextTransition((-1L));
        boolean boolean10 = dateTimeZone5.isStandardOffset((long) (-1));
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone5.getOffset(readableInstant11);
        long long15 = dateTimeZone5.adjustOffset((-292275054L), false);
        long long17 = dateTimeZone5.convertUTCToLocal((long) 52);
        dateTimeParserBucket3.setZone(dateTimeZone5);
        boolean boolean20 = dateTimeZone5.equals((java.lang.Object) 76L);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-292275054L) + "'", long15 == (-292275054L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 52L + "'", long17 == 52L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getRangeDurationType();
        org.joda.time.DurationFieldType durationFieldType2 = dateTimeFieldType0.getDurationType();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(durationFieldType2);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("\uc11c\uae30", (double) (-360659991L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-3.60659991E8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguageTag("eng");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder8 = builder1.clearExtensions();
        java.util.Locale.Builder builder9 = builder1.clear();
        java.util.Locale.Builder builder11 = builder9.setVariant("");
        java.util.Locale.Builder builder12 = builder11.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder12.addUnicodeLocaleAttribute("FR_FR");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: FR_FR [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.lang.String str2 = locale0.getDisplayVariant(locale1);
        java.util.Set<java.lang.String> strSet3 = locale1.getUnicodeLocaleKeys();
        java.lang.String str4 = locale1.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(strSet3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh" + "'", str4, "zh");
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "ko-KR");
        java.util.Locale.Builder builder8 = builder3.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder9 = builder8.clearExtensions();
        java.util.Locale.Builder builder10 = builder8.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder8.setRegion("secondOfDay");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: secondOfDay [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(23, 18000000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 18000000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("30", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=30");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        int int3 = dateTimeZone1.getStandardOffset((long) (byte) 1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        java.util.Locale locale3 = new java.util.Locale("monthOfYear", "era", "java.io.IOException: zho");
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleAttributes();
        org.junit.Assert.assertEquals(locale3.toString(), "monthofyear_ERA_java.io.IOException: zho");
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("cinese (cina) (8)");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale1.getExtension(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology1, locale3, (java.lang.Integer) 1, 0);
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = locale3.getDisplayName(locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "");
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clear();
        java.util.Locale.Builder builder3 = builder1.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.setScript("Cina");
        java.util.Locale locale7 = builder6.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder6.setUnicodeLocaleKeyword("Italia", "ERA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: Italia [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        java.io.IOException iOException1 = new java.io.IOException("SECONDOFMINUTE");
        java.lang.String str2 = iOException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.io.IOException: SECONDOFMINUTE" + "'", str2, "java.io.IOException: SECONDOFMINUTE");
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((long) 'a');
        boolean boolean5 = dateTimeZone1.isFixed();
        int int7 = dateTimeZone1.getStandardOffset(97L);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone9.getOffset(readableInstant10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone9.getOffset(readableInstant12);
        long long15 = dateTimeZone1.getMillisKeepLocal(dateTimeZone9, 3599999L);
        java.util.TimeZone timeZone16 = dateTimeZone1.toTimeZone();
        int int18 = dateTimeZone1.getStandardOffset((-292260000L));
        java.lang.String str20 = dateTimeZone1.getName(259200001L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3599999L + "'", long15 == 3599999L);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((long) 'a');
        boolean boolean5 = dateTimeZone1.isFixed();
        long long9 = dateTimeZone1.convertLocalToUTC(0L, false, (long) (short) 100);
        int int11 = dateTimeZone1.getOffsetFromLocal(0L);
        java.lang.String str13 = dateTimeZone1.getNameKey(18748800052L);
        java.lang.String str14 = dateTimeZone1.getID();
        java.lang.String str16 = dateTimeZone1.getShortName((long) (byte) 10);
        org.joda.time.ReadableInstant readableInstant17 = null;
        int int18 = dateTimeZone1.getOffset(readableInstant17);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        java.util.Locale locale1 = new java.util.Locale("x-lvariant-0_ITALIANO (ITALIA)_ITA");
        java.lang.String str2 = locale1.getDisplayScript();
        org.junit.Assert.assertEquals(locale1.toString(), "x-lvariant-0_italiano (italia)_ita");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(25200000, 366);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 366");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clear();
        java.util.Locale.Builder builder3 = builder1.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.setScript("Cina");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder3.setRegion("chinese");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: chinese [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket7.getZone();
        int int10 = dateTimeZone8.getOffsetFromLocal((long) (byte) 1);
        boolean boolean11 = dateTimeZone8.isFixed();
        java.lang.String str13 = dateTimeZone8.getShortName(97L);
        long long16 = dateTimeZone8.adjustOffset(0L, true);
        java.lang.String str18 = dateTimeZone8.getShortName(98L);
        long long21 = dateTimeZone8.adjustOffset(432000000L, true);
        long long23 = dateTimeZone8.nextTransition((long) 100);
        java.lang.String str25 = dateTimeZone8.getShortName(60220800000L);
        long long28 = dateTimeZone8.convertLocalToUTC(9000L, true);
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "ja");
        org.junit.Assert.assertNotNull(dateTimeZone8);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 432000000L + "'", long21 == 432000000L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00" + "'", str25, "+00:00");
// flaky:         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 9000L + "'", long28 == 9000L);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        int int4 = dateTimeZone1.getOffsetFromLocal((long) 100);
        long long6 = dateTimeZone1.convertUTCToLocal((long) (byte) 100);
        boolean boolean7 = dateTimeZone1.isFixed();
        java.lang.String str8 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguageTag("eng");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale locale8 = builder7.build();
        java.util.Locale.Builder builder9 = builder7.clear();
        java.util.Locale.Builder builder12 = builder7.setExtension('x', "99");
        java.util.Locale.Builder builder13 = builder12.clearExtensions();
        java.util.Locale.Builder builder14 = builder13.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder17 = builder13.setUnicodeLocaleKeyword("us", "+00:00:00.010");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword type: +00:00:00.010 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "eng");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "100");
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale locale6 = builder5.build();
        java.util.Locale.Builder builder8 = builder5.addUnicodeLocaleAttribute("Oct");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder5.addUnicodeLocaleAttribute("259200032");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 259200032 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(2);
        long long4 = dateTimeZone1.adjustOffset(60480000010L, true);
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName((long) ' ', locale8);
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        int int14 = dateTimeZone1.getOffset(21254400000L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str17 = dateTimeZone1.getNameKey(22982400059L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 60480000010L + "'", long4 == 60480000010L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7200000 + "'", int6 == 7200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+02:00" + "'", str9, "+02:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-7200000L) + "'", long12 == (-7200000L));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7200000 + "'", int14 == 7200000);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "100");
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale locale6 = builder5.build();
        java.util.Locale.Builder builder8 = builder5.addUnicodeLocaleAttribute("Oct");
        java.util.Locale.Builder builder10 = builder8.setLanguage("fra");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder8.setScript("\u4e0a\u5348");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-10368000), 193980000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 193980000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("year");
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone5.getOffset(readableInstant6);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone5.getOffset(readableInstant8);
        org.joda.time.Chronology chronology12 = null;
        java.util.Locale locale13 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology12, locale13, (java.lang.Integer) 100);
        java.lang.String str16 = dateTimeZone5.getShortName(10L, locale13);
        java.util.Locale.Builder builder17 = builder0.setLocale(locale13);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder19 = builder0.setVariant("33");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: 33 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(locale13);
// flaky:         org.junit.Assert.assertEquals(locale13.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale10 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology8, locale10, (java.lang.Integer) 1, 0);
        java.util.Locale locale14 = java.util.Locale.ENGLISH;
        java.lang.String str15 = locale10.getDisplayName(locale14);
        java.lang.String str16 = locale10.getISO3Country();
        java.util.Locale.Builder builder17 = builder6.setLocale(locale10);
        java.util.Locale.Builder builder20 = builder17.setUnicodeLocaleKeyword("35", "");
        java.util.Locale.Builder builder22 = builder17.setLanguage("ita");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder24 = builder17.setLanguage("35");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: 35 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clear();
        java.util.Locale.Builder builder3 = builder1.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.setScript("Cina");
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder7.setExtension('u', "259200032");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: 259200032 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale10 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology8, locale10, (java.lang.Integer) 1, 0);
        java.util.Locale locale14 = java.util.Locale.ENGLISH;
        java.lang.String str15 = locale10.getDisplayName(locale14);
        java.lang.String str16 = locale10.getISO3Country();
        java.util.Locale.Builder builder17 = builder6.setLocale(locale10);
        java.util.Locale.Builder builder18 = builder6.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder20 = builder18.setRegion("-292275054");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: -292275054 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "100");
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("era");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder5.setVariant("DateTimeField[millisOfDay]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: DateTimeField[millisOfDay] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        java.io.IOException iOException1 = new java.io.IOException("\u4e2d\u56fd");
        java.lang.Throwable[] throwableArray2 = iOException1.getSuppressed();
        java.io.IOException iOException3 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) iOException3);
        java.io.IOException iOException7 = new java.io.IOException("UTC");
        java.io.IOException iOException9 = new java.io.IOException("zho");
        iOException7.addSuppressed((java.lang.Throwable) iOException9);
        java.lang.Throwable[] throwableArray11 = iOException7.getSuppressed();
        java.io.IOException iOException12 = new java.io.IOException("weekOfWeekyear", (java.lang.Throwable) iOException7);
        iOException3.addSuppressed((java.lang.Throwable) iOException7);
        java.lang.String str14 = iOException7.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.io.IOException: UTC" + "'", str14, "java.io.IOException: UTC");
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder9 = builder7.removeUnicodeLocaleAttribute("jpn");
        java.util.Locale.Builder builder11 = builder9.setLanguageTag("cinese");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder9.addUnicodeLocaleAttribute("DE");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: DE [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((long) 'a');
        boolean boolean5 = dateTimeZone1.isFixed();
        int int7 = dateTimeZone1.getStandardOffset(97L);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone9.getOffset(readableInstant10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone9.getOffset(readableInstant12);
        long long15 = dateTimeZone1.getMillisKeepLocal(dateTimeZone9, 3599999L);
        long long17 = dateTimeZone9.convertUTCToLocal((long) (byte) 100);
        org.joda.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = dateTimeZone9.isLocalDateTimeGap(localDateTime18);
        org.joda.time.ReadableInstant readableInstant20 = null;
        int int21 = dateTimeZone9.getOffset(readableInstant20);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3599999L + "'", long15 == 3599999L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((long) 'a');
        boolean boolean5 = dateTimeZone1.isFixed();
        java.lang.String str7 = dateTimeZone1.getShortName(53L);
        long long9 = dateTimeZone1.previousTransition((-156764159999998813L));
        long long11 = dateTimeZone1.nextTransition(93623040345600000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-156764159999998813L) + "'", long9 == (-156764159999998813L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 93623040345600000L + "'", long11 == 93623040345600000L);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        java.util.Locale locale1 = new java.util.Locale("Deutsch");
        org.junit.Assert.assertEquals(locale1.toString(), "deutsch");
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        java.util.Locale locale3 = new java.util.Locale("Italiano", "24", "de_DE");
        org.junit.Assert.assertEquals(locale3.toString(), "italiano_24_de_DE");
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.removeUnicodeLocaleAttribute("eng");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale5 = builder3.build();
        java.lang.String str6 = locale5.getDisplayScript();
        java.lang.String str7 = locale5.toString();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        java.util.Locale locale2 = new java.util.Locale("", "IT");
        org.junit.Assert.assertEquals(locale2.toString(), "_IT");
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        java.io.IOException iOException2 = new java.io.IOException("UTC");
        java.io.IOException iOException4 = new java.io.IOException("zho");
        iOException2.addSuppressed((java.lang.Throwable) iOException4);
        java.lang.Throwable[] throwableArray6 = iOException2.getSuppressed();
        java.io.IOException iOException7 = new java.io.IOException("weekOfWeekyear", (java.lang.Throwable) iOException2);
        java.io.IOException iOException8 = new java.io.IOException((java.lang.Throwable) iOException7);
        java.io.IOException iOException10 = new java.io.IOException("jpn");
        java.io.IOException iOException13 = new java.io.IOException("UTC");
        java.io.IOException iOException15 = new java.io.IOException("zho");
        iOException13.addSuppressed((java.lang.Throwable) iOException15);
        java.io.IOException iOException17 = new java.io.IOException("2", (java.lang.Throwable) iOException13);
        iOException10.addSuppressed((java.lang.Throwable) iOException17);
        iOException8.addSuppressed((java.lang.Throwable) iOException10);
        java.lang.Throwable[] throwableArray20 = iOException8.getSuppressed();
        java.io.IOException iOException22 = new java.io.IOException("UTC");
        java.lang.Throwable[] throwableArray23 = iOException22.getSuppressed();
        java.io.IOException iOException24 = new java.io.IOException((java.lang.Throwable) iOException22);
        iOException8.addSuppressed((java.lang.Throwable) iOException22);
        java.lang.Throwable[] throwableArray26 = iOException8.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray26);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale locale3 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str4 = locale2.getDisplayLanguage(locale3);
        java.util.Set<java.lang.String> strSet5 = locale3.getUnicodeLocaleKeys();
        java.lang.String str6 = locale3.getISO3Country();
        java.util.Locale.setDefault(locale3);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CHN" + "'", str6, "CHN");
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale locale3 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str4 = locale2.getDisplayLanguage(locale3);
        java.lang.String str5 = locale3.getDisplayCountry();
        java.lang.String str6 = locale3.getDisplayScript();
        java.lang.String str7 = locale3.getDisplayLanguage();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u4e2d\u56fd" + "'", str5, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u6587" + "'", str7, "\u4e2d\u6587");
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("-9");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"-9\" is malformed at \"9\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        java.io.IOException iOException1 = new java.io.IOException("DateTimeField[weekOfWeekyear]");
        java.io.IOException iOException2 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.io.IOException iOException4 = new java.io.IOException("jpn");
        java.io.IOException iOException7 = new java.io.IOException("UTC");
        java.io.IOException iOException9 = new java.io.IOException("zho");
        iOException7.addSuppressed((java.lang.Throwable) iOException9);
        java.io.IOException iOException11 = new java.io.IOException("2", (java.lang.Throwable) iOException7);
        iOException4.addSuppressed((java.lang.Throwable) iOException11);
        java.io.IOException iOException13 = new java.io.IOException((java.lang.Throwable) iOException11);
        iOException2.addSuppressed((java.lang.Throwable) iOException11);
        java.lang.String str15 = iOException2.toString();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.io.IOException: java.io.IOException: DateTimeField[weekOfWeekyear]" + "'", str15, "java.io.IOException: java.io.IOException: DateTimeField[weekOfWeekyear]");
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket7.getZone();
        long long11 = dateTimeParserBucket7.computeMillis(true, "\u4e2d\u6587\u4e2d\u56fd)");
        int int12 = dateTimeParserBucket7.getOffset();
        java.util.Locale locale13 = dateTimeParserBucket7.getLocale();
        org.joda.time.Chronology chronology14 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.secondOfMinute();
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(locale13);
// flaky:         org.junit.Assert.assertEquals(locale13.toString(), "zh");
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("java.io.IOException: java.io.IOException: DateTimeField[weekOfWeekyear]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=java.io.ioexception: java.io.ioexception: datetimefield[weekofweekyear]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.lang.String str4 = locale3.getISO3Country();
        java.lang.String str5 = locale3.getISO3Language();
        java.util.Locale locale6 = java.util.Locale.getDefault();
        java.lang.String str7 = locale3.getDisplayVariant(locale6);
        java.util.Locale locale8 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale11 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology10, locale11, (java.lang.Integer) 100);
        java.util.Locale locale14 = java.util.Locale.getDefault();
        java.lang.String str15 = locale14.getISO3Country();
        java.lang.String str16 = locale14.getISO3Language();
        java.util.Locale locale17 = java.util.Locale.getDefault();
        java.lang.String str18 = locale14.getDisplayVariant(locale17);
        java.util.Locale locale19 = java.util.Locale.getDefault();
        java.lang.String str20 = locale19.getISO3Country();
        java.util.Locale locale21 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray22 = new java.util.Locale[] { locale3, locale8, locale11, locale14, locale19, locale21 };
        java.util.ArrayList<java.util.Locale> localeList23 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList23, localeArray22);
        java.util.Locale locale25 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList23);
        java.lang.String[] strArray29 = new java.lang.String[] { "zh", "hi!", "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        java.lang.String str32 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList30);
        java.util.Locale.LanguageRange[] languageRangeArray33 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList34 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList34, languageRangeArray33);
        java.util.Locale locale36 = java.util.Locale.getDefault();
        java.lang.String str37 = locale36.getISO3Country();
        java.lang.String str38 = locale36.getISO3Language();
        java.util.Locale locale39 = java.util.Locale.getDefault();
        java.lang.String str40 = locale36.getDisplayVariant(locale39);
        java.util.Locale locale41 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology43 = null;
        java.util.Locale locale44 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket46 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology43, locale44, (java.lang.Integer) 100);
        java.util.Locale locale47 = java.util.Locale.getDefault();
        java.lang.String str48 = locale47.getISO3Country();
        java.lang.String str49 = locale47.getISO3Language();
        java.util.Locale locale50 = java.util.Locale.getDefault();
        java.lang.String str51 = locale47.getDisplayVariant(locale50);
        java.util.Locale locale52 = java.util.Locale.getDefault();
        java.lang.String str53 = locale52.getISO3Country();
        java.util.Locale locale54 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray55 = new java.util.Locale[] { locale36, locale41, locale44, locale47, locale52, locale54 };
        java.util.ArrayList<java.util.Locale> localeList56 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList56, localeArray55);
        java.util.Locale locale58 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList34, (java.util.Collection<java.util.Locale>) localeList56);
        java.util.List<java.util.Locale> localeList59 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList56);
        java.util.Locale.LanguageRange[] languageRangeArray60 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList61 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList61, languageRangeArray60);
        java.util.Locale locale63 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet64 = locale63.getUnicodeLocaleKeys();
        java.lang.String str65 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList61, (java.util.Collection<java.lang.String>) strSet64);
        java.lang.String str66 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet64);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap67 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList68 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap67);
        java.util.Locale locale69 = java.util.Locale.getDefault();
        java.lang.String str70 = locale69.getISO3Country();
        java.lang.String str71 = locale69.getISO3Language();
        java.util.Locale.setDefault(locale69);
        java.util.Set<java.lang.String> strSet73 = locale69.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList74 = java.util.Locale.filterTags(languageRangeList68, (java.util.Collection<java.lang.String>) strSet73);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap75 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList76 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList68, strMap75);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap77 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList78 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList76, strMap77);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zho" + "'", str5, "zho");
        org.junit.Assert.assertNotNull(locale6);
// flaky:         org.junit.Assert.assertEquals(locale6.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
// flaky:         org.junit.Assert.assertEquals(locale8.toString(), "zh");
        org.junit.Assert.assertNotNull(locale11);
// flaky:         org.junit.Assert.assertEquals(locale11.toString(), "zh");
        org.junit.Assert.assertNotNull(locale14);
// flaky:         org.junit.Assert.assertEquals(locale14.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "zho" + "'", str16, "zho");
        org.junit.Assert.assertNotNull(locale17);
// flaky:         org.junit.Assert.assertEquals(locale17.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
// flaky:         org.junit.Assert.assertEquals(locale19.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(locale25);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(languageRangeArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(locale36);
// flaky:         org.junit.Assert.assertEquals(locale36.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "zho" + "'", str38, "zho");
        org.junit.Assert.assertNotNull(locale39);
// flaky:         org.junit.Assert.assertEquals(locale39.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(locale41);
// flaky:         org.junit.Assert.assertEquals(locale41.toString(), "zh");
        org.junit.Assert.assertNotNull(locale44);
// flaky:         org.junit.Assert.assertEquals(locale44.toString(), "zh");
        org.junit.Assert.assertNotNull(locale47);
// flaky:         org.junit.Assert.assertEquals(locale47.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "zho" + "'", str49, "zho");
        org.junit.Assert.assertNotNull(locale50);
// flaky:         org.junit.Assert.assertEquals(locale50.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(locale52);
// flaky:         org.junit.Assert.assertEquals(locale52.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNull(locale58);
        org.junit.Assert.assertNotNull(localeList59);
        org.junit.Assert.assertNotNull(languageRangeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet64);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNotNull(languageRangeList68);
        org.junit.Assert.assertNotNull(locale69);
// flaky:         org.junit.Assert.assertEquals(locale69.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "zho" + "'", str71, "zho");
        org.junit.Assert.assertNotNull(strSet73);
        org.junit.Assert.assertNotNull(strList74);
        org.junit.Assert.assertNotNull(languageRangeList76);
        org.junit.Assert.assertNotNull(languageRangeList78);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale9 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology8, locale9, (java.lang.Integer) 100);
        java.lang.String str12 = dateTimeZone1.getShortName(10L, locale9);
        org.joda.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = dateTimeZone1.isLocalDateTimeGap(localDateTime13);
        long long18 = dateTimeZone1.convertLocalToUTC((long) (short) 100, true, 218889237168000000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(locale9);
// flaky:         org.junit.Assert.assertEquals(locale9.toString(), "thu_ITALIA");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        java.lang.String str4 = dateTimeZone1.getName(1187L);
        long long7 = dateTimeZone1.adjustOffset(356580000L, false);
        long long10 = dateTimeZone1.adjustOffset(6652800031L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 356580000L + "'", long7 == 356580000L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 6652800031L + "'", long10 == 6652800031L);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("millisOfDay");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("fr-FR");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'fr-FR' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.nextTransition((-1L));
        int int6 = dateTimeZone1.getStandardOffset((long) 86399);
        java.lang.String str7 = dateTimeZone1.getID();
        int int9 = dateTimeZone1.getOffset(789263999954L);
        long long11 = dateTimeZone1.nextTransition(53L);
        long long14 = dateTimeZone1.convertLocalToUTC(36000000L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 53L + "'", long11 == 53L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 36000000L + "'", long14 == 36000000L);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(2);
        long long4 = dateTimeZone1.adjustOffset(60480000010L, true);
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName((long) ' ', locale8);
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        int int14 = dateTimeZone1.getOffset(21254400000L);
        long long18 = dateTimeZone1.convertLocalToUTC(70L, true, (long) 7343661);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 60480000010L + "'", long4 == 60480000010L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7200000 + "'", int6 == 7200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+02:00" + "'", str9, "+02:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-7200000L) + "'", long12 == (-7200000L));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7200000 + "'", int14 == 7200000);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-7199930L) + "'", long18 == (-7199930L));
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "ko-KR");
        java.util.Locale.Builder builder8 = builder3.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder10 = builder3.addUnicodeLocaleAttribute("ita");
        java.util.Locale locale11 = builder10.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder10.setUnicodeLocaleKeyword("-9", "+00:00:01.497");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: -9 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.removeUnicodeLocaleAttribute("eng");
        java.util.Locale.Builder builder6 = builder1.setExtension('u', "4969628");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder1.setVariant("-434:00");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: -434:00 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("12");
        java.lang.String str2 = locale1.getDisplayVariant();
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder6 = builder4.clear();
        java.util.Locale locale7 = builder6.build();
        java.util.Locale locale8 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet9 = locale8.getUnicodeLocaleAttributes();
        org.joda.time.Chronology chronology11 = null;
        java.util.Locale locale12 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology11, locale12, (java.lang.Integer) 100);
        java.lang.String str15 = locale8.getDisplayScript(locale12);
        java.lang.String str16 = locale8.getVariant();
        java.util.Locale.Builder builder17 = builder6.setLocale(locale8);
        java.lang.String str18 = locale8.getISO3Language();
        java.lang.String str19 = locale1.getDisplayLanguage(locale8);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "zho" + "'", str18, "zho");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        java.io.IOException iOException3 = new java.io.IOException("\u4e2d\u56fd");
        java.lang.Throwable[] throwableArray4 = iOException3.getSuppressed();
        java.lang.Throwable[] throwableArray5 = iOException3.getSuppressed();
        java.io.IOException iOException6 = new java.io.IOException("DateTimeField[millisOfDay]", (java.lang.Throwable) iOException3);
        java.io.IOException iOException7 = new java.io.IOException("Japanese", (java.lang.Throwable) iOException3);
        java.lang.String str8 = iOException7.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.io.IOException: Japanese" + "'", str8, "java.io.IOException: Japanese");
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale locale8 = builder1.build();
        java.lang.String str9 = locale8.getISO3Language();
        java.util.Locale locale12 = new java.util.Locale("utc", "dayOfWeek");
        java.lang.String str13 = locale8.getDisplayName(locale12);
        java.lang.String str14 = locale12.getDisplayVariant();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ita");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ita" + "'", str9, "ita");
        org.junit.Assert.assertEquals(locale12.toString(), "utc_DAYOFWEEK");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Italian" + "'", str13, "Italian");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(99);
        boolean boolean2 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("9", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=9");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.weekOfWeekyear();
        int int11 = dateTimeField10.getMaximumValue();
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "79200_java.io.ioexception: zho_FRA_13");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 53 + "'", int11 == 53);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("-8", (double) 1219855139999L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=1.219855139999E12");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        java.util.Locale locale1 = new java.util.Locale("SECONDOFMINUTE");
        java.lang.String str2 = locale1.getVariant();
        org.junit.Assert.assertEquals(locale1.toString(), "secondofminute");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        java.io.IOException iOException2 = new java.io.IOException("UTC");
        java.io.IOException iOException4 = new java.io.IOException("zho");
        iOException2.addSuppressed((java.lang.Throwable) iOException4);
        java.lang.Throwable[] throwableArray6 = iOException2.getSuppressed();
        java.io.IOException iOException7 = new java.io.IOException("weekOfWeekyear", (java.lang.Throwable) iOException2);
        java.io.IOException iOException8 = new java.io.IOException((java.lang.Throwable) iOException7);
        java.io.IOException iOException10 = new java.io.IOException("jpn");
        java.io.IOException iOException13 = new java.io.IOException("UTC");
        java.io.IOException iOException15 = new java.io.IOException("zho");
        iOException13.addSuppressed((java.lang.Throwable) iOException15);
        java.io.IOException iOException17 = new java.io.IOException("2", (java.lang.Throwable) iOException13);
        iOException10.addSuppressed((java.lang.Throwable) iOException17);
        iOException8.addSuppressed((java.lang.Throwable) iOException10);
        java.lang.Throwable throwable23 = null;
        java.io.IOException iOException24 = new java.io.IOException("UTC", throwable23);
        java.io.IOException iOException25 = new java.io.IOException(throwable23);
        java.io.IOException iOException26 = new java.io.IOException("weekyear", (java.lang.Throwable) iOException25);
        java.lang.Throwable[] throwableArray27 = iOException26.getSuppressed();
        java.io.IOException iOException28 = new java.io.IOException((java.lang.Throwable) iOException26);
        java.io.IOException iOException29 = new java.io.IOException((java.lang.Throwable) iOException26);
        java.io.IOException iOException30 = new java.io.IOException("-292275054", (java.lang.Throwable) iOException26);
        java.io.IOException iOException32 = new java.io.IOException("java.io.IOException: und");
        iOException26.addSuppressed((java.lang.Throwable) iOException32);
        iOException10.addSuppressed((java.lang.Throwable) iOException26);
        java.io.IOException iOException35 = new java.io.IOException((java.lang.Throwable) iOException10);
        java.lang.Throwable[] throwableArray36 = iOException35.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray36);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        java.lang.String str8 = locale4.getScript();
        java.lang.String str10 = locale4.getExtension('u');
        java.util.Locale locale12 = new java.util.Locale("2");
        java.lang.String str13 = locale4.getDisplayCountry(locale12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = locale4.getISO3Language();
// flaky:             org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter language code for 79200_java.io.ioexception: zho");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "79200_java.io.ioexception: zho_FRA_13");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals(locale12.toString(), "2");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "FRA" + "'", str13, "FRA");
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        java.io.IOException iOException1 = new java.io.IOException("secondOfMinute");
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket(604800053L, chronology1, locale2);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 2);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "ko-KR");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.setScript("HALFDAYOFDAY");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: HALFDAYOFDAY [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale locale7 = builder6.build();
        java.util.Locale locale8 = builder6.build();
        java.util.Locale locale10 = new java.util.Locale("Chinese (Taiwan)");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder6.setLocale(locale10);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: chinese (taiwan) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ita");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ita");
        org.junit.Assert.assertEquals(locale10.toString(), "chinese (taiwan)");
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        java.util.Locale locale1 = new java.util.Locale("java.io.IOException: ita");
        java.lang.String str2 = locale1.getCountry();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale1.getUnicodeLocaleType("java.io.IOException: CHN");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: java.io.IOException: CHN");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "java.io.ioexception: ita");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("year");
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("UTC");
        java.util.Locale locale6 = builder3.build();
        java.util.Locale.Builder builder8 = builder3.setLanguageTag("zho");
        java.util.Locale.Builder builder9 = builder8.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder8.setExtension('#', "\u610f\u5927\u5229\u6587");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: # [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "utc");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("US");
        java.lang.String str2 = languageRange1.getRange();
        double double3 = languageRange1.getWeight();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "us" + "'", str2, "us");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clear();
        java.util.Locale.Builder builder3 = builder1.clear();
        java.util.Locale locale4 = builder3.build();
        java.lang.String str5 = locale4.getLanguage();
        java.lang.String str6 = locale4.getISO3Country();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(70);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale10 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology8, locale10, (java.lang.Integer) 1, 0);
        java.util.Locale locale14 = java.util.Locale.ENGLISH;
        java.lang.String str15 = locale10.getDisplayName(locale14);
        java.lang.String str16 = locale10.getISO3Country();
        java.util.Locale.Builder builder17 = builder6.setLocale(locale10);
        java.util.Locale.Builder builder20 = builder17.setUnicodeLocaleKeyword("35", "");
        java.util.Locale.Builder builder22 = builder20.addUnicodeLocaleAttribute("zho");
        java.util.Locale.Builder builder24 = builder20.removeUnicodeLocaleAttribute("Cina");
        java.util.Locale.Builder builder25 = builder20.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder28 = builder20.setExtension('4', "\u6708");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: 4 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.GERMANY;
        java.lang.String str2 = locale1.getDisplayCountry();
        java.util.Locale.setDefault(category0, locale1);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Chronology chronology7 = null;
        java.util.Locale locale8 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology7, locale8, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket(100L, chronology5, locale8);
        java.lang.String str12 = locale8.getDisplayScript();
        java.util.Locale.setDefault(category0, locale8);
        java.lang.String str14 = locale8.getLanguage();
        java.lang.String str15 = locale8.getVariant();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u5fb7\u56fd" + "'", str2, "\u5fb7\u56fd");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "zh" + "'", str14, "zh");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(25200000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        java.io.IOException iOException3 = new java.io.IOException("UTC");
        java.io.IOException iOException5 = new java.io.IOException("zho");
        iOException3.addSuppressed((java.lang.Throwable) iOException5);
        java.lang.Throwable[] throwableArray7 = iOException3.getSuppressed();
        java.io.IOException iOException8 = new java.io.IOException("weekOfWeekyear", (java.lang.Throwable) iOException3);
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) iOException8);
        java.io.IOException iOException11 = new java.io.IOException("jpn");
        java.io.IOException iOException14 = new java.io.IOException("UTC");
        java.io.IOException iOException16 = new java.io.IOException("zho");
        iOException14.addSuppressed((java.lang.Throwable) iOException16);
        java.io.IOException iOException18 = new java.io.IOException("2", (java.lang.Throwable) iOException14);
        iOException11.addSuppressed((java.lang.Throwable) iOException18);
        iOException9.addSuppressed((java.lang.Throwable) iOException11);
        java.lang.Throwable[] throwableArray21 = iOException9.getSuppressed();
        java.io.IOException iOException22 = new java.io.IOException("AD", (java.lang.Throwable) iOException9);
        java.io.IOException iOException28 = new java.io.IOException("jpn");
        java.io.IOException iOException29 = new java.io.IOException((java.lang.Throwable) iOException28);
        java.io.IOException iOException30 = new java.io.IOException("35", (java.lang.Throwable) iOException29);
        java.io.IOException iOException31 = new java.io.IOException("Germania", (java.lang.Throwable) iOException30);
        java.io.IOException iOException32 = new java.io.IOException("dayofyear", (java.lang.Throwable) iOException30);
        java.io.IOException iOException34 = new java.io.IOException("jpn");
        java.io.IOException iOException37 = new java.io.IOException("UTC");
        java.io.IOException iOException39 = new java.io.IOException("zho");
        iOException37.addSuppressed((java.lang.Throwable) iOException39);
        java.io.IOException iOException41 = new java.io.IOException("2", (java.lang.Throwable) iOException37);
        iOException34.addSuppressed((java.lang.Throwable) iOException41);
        iOException32.addSuppressed((java.lang.Throwable) iOException34);
        java.io.IOException iOException44 = new java.io.IOException("x-lvariant-0_ITALIANO (ITALIA)_ITA", (java.lang.Throwable) iOException34);
        iOException22.addSuppressed((java.lang.Throwable) iOException44);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray21);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("JPN");
        java.lang.String str2 = languageRange1.getRange();
        double double3 = languageRange1.getWeight();
        double double4 = languageRange1.getWeight();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jpn" + "'", str2, "jpn");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        java.util.Locale locale1 = new java.util.Locale("US");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.FRENCH;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology3, locale4, (java.lang.Integer) (-1), 0);
        java.util.Locale locale8 = locale4.stripExtensions();
        java.lang.String str9 = locale1.getDisplayLanguage(locale8);
        java.lang.String str10 = locale1.toString();
        org.junit.Assert.assertEquals(locale1.toString(), "us");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "us" + "'", str9, "us");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "us" + "'", str10, "us");
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "100");
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder7 = builder5.setScript("");
        java.util.Locale.Builder builder9 = builder7.setVariant("weekyear");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.setRegion("java.io.IOException: java.io.IOException: jpn");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: java.io.IOException: java.io.IOException: jpn [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology1, locale3, (java.lang.Integer) 1, 0);
        java.lang.String str7 = locale3.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = locale3.getExtension('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str1 = dateTimeZone0.getID();
        boolean boolean3 = dateTimeZone0.isStandardOffset((long) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone5.getOffset(readableInstant6);
        long long10 = dateTimeZone5.convertLocalToUTC((long) 1, true);
        java.lang.String str11 = dateTimeZone5.toString();
        long long14 = dateTimeZone5.convertLocalToUTC(2L, false);
        long long16 = dateTimeZone0.getMillisKeepLocal(dateTimeZone5, (long) 'u');
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        java.util.Locale locale23 = new java.util.Locale("weekOfWeekyear", "UTC", "+00:00");
        boolean boolean24 = locale23.hasExtensions();
        org.joda.time.Chronology chronology26 = null;
        java.util.Locale locale27 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology26, locale27, (java.lang.Integer) 100);
        java.lang.String str30 = locale23.getDisplayCountry(locale27);
        java.lang.String str31 = dateTimeZone18.getShortName((long) (short) 1, locale27);
        java.lang.String str32 = dateTimeZone18.getID();
        int int34 = dateTimeZone18.getStandardOffset(60480000010L);
        int int36 = dateTimeZone18.getStandardOffset(259200107L);
        boolean boolean37 = dateTimeZone5.equals((java.lang.Object) dateTimeZone18);
        java.lang.String str39 = dateTimeZone18.getNameKey(4L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTC" + "'", str1, "UTC");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 117L + "'", long16 == 117L);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertEquals(locale23.toString(), "weekofweekyear_UTC_+00:00");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "UTC" + "'", str30, "UTC");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:00:00.001" + "'", str31, "+00:00:00.001");
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00:00.001" + "'", str32, "+00:00:00.001");
// flaky:         org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
// flaky:         org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("fra");
        double double2 = languageRange1.getWeight();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "ko-KR");
        java.util.Locale.Builder builder8 = builder3.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder10 = builder3.addUnicodeLocaleAttribute("ita");
        java.util.Locale.Builder builder12 = builder10.setRegion("CN");
        java.util.Locale.Builder builder13 = builder12.clear();
        java.util.Locale.Builder builder15 = builder13.setLanguageTag("ko-kr");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder17 = builder15.setLanguageTag("weekOfWeekyear");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: weekOfWeekyear [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology1, locale3, (java.lang.Integer) 1, 0);
        dateTimeParserBucket6.setOffset((int) (short) 100);
        dateTimeParserBucket6.setOffset((java.lang.Integer) 12);
        long long11 = dateTimeParserBucket6.computeMillis();
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 105L + "'", long11 == 105L);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        java.io.IOException iOException1 = new java.io.IOException("\u30c9\u30a4\u30c4\u8a9e");
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(523909);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Germany");
        java.lang.String str2 = languageRange1.getRange();
        java.lang.String str3 = languageRange1.getRange();
        double double4 = languageRange1.getWeight();
        java.lang.String str5 = languageRange1.getRange();
        double double6 = languageRange1.getWeight();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "germany" + "'", str2, "germany");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "germany" + "'", str3, "germany");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "germany" + "'", str5, "germany");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        java.io.IOException iOException2 = new java.io.IOException();
        java.io.IOException iOException3 = new java.io.IOException("\u5fb7\u56fd", (java.lang.Throwable) iOException2);
        java.lang.Throwable[] throwableArray4 = iOException3.getSuppressed();
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) iOException3);
        java.io.IOException iOException6 = new java.io.IOException("DATETIMEFIELD[CLOCKHOUROFHALFDAY]", (java.lang.Throwable) iOException5);
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("BC", (double) 291600000L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=2.916E8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        java.util.Locale locale3 = new java.util.Locale("\u5927\u97d3\u6c11\u56fd", "ko-kr", "50");
        org.junit.Assert.assertEquals(locale3.toString(), "\u5927\u97d3\u6c11\u56fd_KO-KR_50");
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("\u30d5\u30e9\u30f3\u30b9\u8a9e\u30ab\u30ca\u30c0)", (double) 193980000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=1.9398E8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket7.getZone();
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone8.isLocalDateTimeGap(localDateTime10);
        long long14 = dateTimeZone8.convertLocalToUTC((long) (byte) 100, false);
        java.lang.String str16 = dateTimeZone8.getShortName(7200008L);
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone9);
// flaky:         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(31);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder9 = builder1.removeUnicodeLocaleAttribute("CHN");
        java.util.Locale.Builder builder11 = builder9.removeUnicodeLocaleAttribute("Japanese");
        java.util.Locale locale12 = builder9.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder9.setUnicodeLocaleKeyword("yearOfCentury", "99");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: yearOfCentury [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "ita");
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale locale7 = builder6.build();
        java.util.Locale.Builder builder9 = builder6.setVariant("18000000");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.setVariant("Chinesisch");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: Chinesisch [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ita");
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("DateTimeField[yearOfCentury]");
        java.lang.String str3 = locale0.getDisplayCountry(locale2);
        java.lang.Object obj4 = locale2.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "");
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.lang.String str1 = locale0.toLanguageTag();
        java.lang.String str2 = locale0.getLanguage();
        java.lang.String str3 = locale0.getLanguage();
        java.lang.String str4 = locale0.getISO3Country();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh" + "'", str1, "zh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh" + "'", str2, "zh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh" + "'", str3, "zh");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        java.io.IOException iOException1 = new java.io.IOException("secondOfDay");
        java.lang.Throwable throwable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            iOException1.addSuppressed(throwable2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("+100:32");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=+100:32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "ko-KR");
        java.util.Locale.Builder builder8 = builder3.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder10 = builder3.addUnicodeLocaleAttribute("ita");
        java.util.Locale.Builder builder12 = builder10.setRegion("CN");
        java.util.Locale.Builder builder13 = builder12.clear();
        java.util.Locale locale14 = builder12.build();
        java.util.Locale locale15 = builder12.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder18 = builder12.setUnicodeLocaleKeyword("", "5131");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "100");
        java.util.Locale.Builder builder5 = builder4.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.setRegion("+00:00:00.024");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: +00:00:00.024 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        java.lang.String str8 = locale4.getDisplayScript();
        java.lang.String str9 = locale4.getISO3Language();
        java.lang.Object obj10 = locale4.clone();
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "zho" + "'", str9, "zho");
        org.junit.Assert.assertNotNull(obj10);
// flaky:         org.junit.Assert.assertEquals(obj10.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "zh");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "zh");
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder9 = builder7.removeUnicodeLocaleAttribute("jpn");
        java.util.Locale.Builder builder11 = builder9.setLanguage("CN");
        java.util.Locale.Builder builder12 = builder11.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder11.setVariant("+53:53");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: +53:53 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        int int8 = dateTimeParserBucket7.getOffset();
        java.lang.Integer int9 = dateTimeParserBucket7.getPivotYear();
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale10 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology8, locale10, (java.lang.Integer) 1, 0);
        java.util.Locale locale14 = java.util.Locale.ENGLISH;
        java.lang.String str15 = locale10.getDisplayName(locale14);
        java.lang.String str16 = locale10.getISO3Country();
        java.util.Locale.Builder builder17 = builder6.setLocale(locale10);
        java.util.Locale.Builder builder20 = builder17.setUnicodeLocaleKeyword("35", "");
        java.util.Locale.Builder builder22 = builder20.addUnicodeLocaleAttribute("zho");
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.Chronology chronology26 = null;
        java.util.Locale locale27 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology26, locale27, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket(100L, chronology24, locale27);
        int int31 = dateTimeParserBucket30.getOffset();
        java.lang.Object obj32 = dateTimeParserBucket30.saveState();
        java.util.Locale locale33 = dateTimeParserBucket30.getLocale();
        java.util.Locale locale34 = dateTimeParserBucket30.getLocale();
        java.util.Locale.Builder builder35 = builder22.setLocale(locale34);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder38 = builder35.setUnicodeLocaleKeyword("FR_FR", "yearOfEra");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: FR_FR [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(locale27);
// flaky:         org.junit.Assert.assertEquals(locale27.toString(), "zh");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(locale33);
// flaky:         org.junit.Assert.assertEquals(locale33.toString(), "zh");
        org.junit.Assert.assertNotNull(locale34);
// flaky:         org.junit.Assert.assertEquals(locale34.toString(), "zh");
        org.junit.Assert.assertNotNull(builder35);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("12");
        java.lang.String str2 = locale1.getDisplayVariant();
        java.util.Set<java.lang.String> strSet3 = locale1.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguageTag("eng");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale locale8 = builder7.build();
        java.util.Locale locale9 = java.util.Locale.ROOT;
        java.util.Locale.Builder builder10 = builder7.setLocale(locale9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder7.setLanguage("dayOfYear");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: dayOfYear [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "eng");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        java.util.Locale locale1 = new java.util.Locale("CHN");
        java.lang.String str2 = locale1.toLanguageTag();
        java.lang.String str3 = locale1.toLanguageTag();
        org.junit.Assert.assertEquals(locale1.toString(), "chn");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "chn" + "'", str2, "chn");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chn" + "'", str3, "chn");
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket7.getZone();
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        java.lang.String str11 = dateTimeZone8.getNameKey((-3L));
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 0);
        long long17 = dateTimeZone14.adjustOffset(1L, false);
        long long19 = dateTimeZone8.getMillisKeepLocal(dateTimeZone14, 2L);
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone8.getShortName(363599999L, locale21);
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone9);
// flaky:         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-359999998L) + "'", long19 == (-359999998L));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        java.util.Locale locale3 = new java.util.Locale("ko-KR", "32", "");
        java.lang.String str4 = locale3.getDisplayCountry();
        java.lang.String str5 = locale3.getCountry();
        org.junit.Assert.assertEquals(locale3.toString(), "ko-kr_32");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "32" + "'", str4, "32");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "32" + "'", str5, "32");
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("\u30a4\u30bf\u30ea\u30a2", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=????");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.removeUnicodeLocaleAttribute("eng");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale5 = builder3.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder3.setLanguageTag("\u6708\u66dc\u65e5");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: ??? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "ko-KR");
        java.util.Locale.Builder builder8 = builder3.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder9 = builder8.clearExtensions();
        java.util.Locale.Builder builder10 = builder8.clearExtensions();
        java.util.Locale.Builder builder12 = builder10.setRegion("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder10.setLanguage("x-lvariant-0");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: x-lvariant-0 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getOffsetInteger();
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        int int9 = dateTimeZone7.getStandardOffset((long) (byte) -1);
        java.lang.String str11 = dateTimeZone7.getName(32054400100L);
        dateTimeParserBucket4.setZone(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeParserBucket4.getZone();
        boolean boolean15 = dateTimeZone13.isStandardOffset(7343999999L);
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "zh");
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        java.io.IOException iOException4 = new java.io.IOException("zho");
        java.lang.Throwable[] throwableArray5 = iOException4.getSuppressed();
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) iOException4);
        java.io.IOException iOException7 = new java.io.IOException("ITA", (java.lang.Throwable) iOException4);
        java.io.IOException iOException8 = new java.io.IOException((java.lang.Throwable) iOException7);
        java.io.IOException iOException9 = new java.io.IOException("1497", (java.lang.Throwable) iOException8);
        java.io.IOException iOException10 = new java.io.IOException("48", (java.lang.Throwable) iOException8);
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        java.util.Locale locale2 = new java.util.Locale("-434", "");
        org.junit.Assert.assertEquals(locale2.toString(), "-434");
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.removeUnicodeLocaleAttribute("eng");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder4.setRegion("8");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: 8 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale10 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology8, locale10, (java.lang.Integer) 1, 0);
        java.util.Locale locale14 = java.util.Locale.ENGLISH;
        java.lang.String str15 = locale10.getDisplayName(locale14);
        java.lang.String str16 = locale10.getISO3Country();
        java.util.Locale.Builder builder17 = builder6.setLocale(locale10);
        java.util.Locale.Builder builder20 = builder17.setUnicodeLocaleKeyword("35", "");
        java.util.Locale.Builder builder22 = builder20.addUnicodeLocaleAttribute("zho");
        java.util.Locale.Builder builder24 = builder22.addUnicodeLocaleAttribute("italia");
        java.util.Locale.Builder builder26 = builder22.setVariant("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder28 = builder26.removeUnicodeLocaleAttribute("ja");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ja [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        java.util.Locale locale2 = new java.util.Locale("year", "December");
        java.util.Locale.Category category3 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale4 = java.util.Locale.GERMANY;
        java.lang.String str5 = locale4.getDisplayCountry();
        java.util.Locale.setDefault(category3, locale4);
        java.util.Locale locale7 = java.util.Locale.GERMAN;
        java.util.Locale locale8 = java.util.Locale.getDefault();
        java.lang.String str9 = locale7.getDisplayVariant(locale8);
        java.util.Locale.setDefault(category3, locale7);
        java.util.Locale locale11 = java.util.Locale.getDefault(category3);
        java.util.Locale locale12 = java.util.Locale.getDefault(category3);
        java.lang.String str13 = locale2.getDisplayLanguage(locale12);
        java.lang.String str14 = locale12.getDisplayCountry();
        org.junit.Assert.assertEquals(locale2.toString(), "year_DECEMBER");
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.FORMAT + "'", category3.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u5fb7\u56fd" + "'", str5, "\u5fb7\u56fd");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de");
        org.junit.Assert.assertNotNull(locale8);
// flaky:         org.junit.Assert.assertEquals(locale8.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "de");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "de");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "year" + "'", str13, "year");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("ERA", strMap1);
        org.junit.Assert.assertNotNull(languageRangeList2);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.TimeZone timeZone3 = dateTimeZone1.toTimeZone();
        org.joda.time.tz.NameProvider nameProvider4 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider4);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider4);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider4);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider4);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider4);
        boolean boolean10 = dateTimeZone1.equals((java.lang.Object) nameProvider4);
        long long12 = dateTimeZone1.previousTransition(88646398503L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone3);
// flaky:         org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(nameProvider4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 88646398503L + "'", long12 == 88646398503L);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        java.util.Locale locale1 = new java.util.Locale("\u661f\u671f\u4e00");
        org.junit.Assert.assertEquals(locale1.toString(), "\u661f\u671f\u4e00");
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clear();
        java.util.Locale.Builder builder3 = builder1.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder5 = builder3.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.setVariant("java.io.IOException");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: java.io.IOException [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        java.io.IOException iOException2 = new java.io.IOException("UTC");
        java.io.IOException iOException4 = new java.io.IOException("zho");
        iOException2.addSuppressed((java.lang.Throwable) iOException4);
        java.lang.Throwable[] throwableArray6 = iOException2.getSuppressed();
        java.io.IOException iOException7 = new java.io.IOException("\u610f\u5927\u5229\u6587", (java.lang.Throwable) iOException2);
        java.io.IOException iOException8 = new java.io.IOException((java.lang.Throwable) iOException2);
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        java.lang.Throwable throwable1 = null;
        java.io.IOException iOException2 = new java.io.IOException("UTC", throwable1);
        java.io.IOException iOException3 = new java.io.IOException(throwable1);
        java.io.IOException iOException4 = new java.io.IOException(throwable1);
        java.io.IOException iOException6 = new java.io.IOException("UTC");
        java.io.IOException iOException8 = new java.io.IOException("zho");
        iOException6.addSuppressed((java.lang.Throwable) iOException8);
        iOException4.addSuppressed((java.lang.Throwable) iOException8);
        java.lang.Throwable[] throwableArray11 = iOException4.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray11);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder7.setExtension('u', "DateTimeField[weekyearOfCentury]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: DateTimeField[weekyearOfCentury] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(2, (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("DateTimeField[clockhourOfHalfday]", (double) 18144000010L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=1.814400001E10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale10 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology8, locale10, (java.lang.Integer) 1, 0);
        java.util.Locale locale14 = java.util.Locale.ENGLISH;
        java.lang.String str15 = locale10.getDisplayName(locale14);
        java.lang.String str16 = locale10.getISO3Country();
        java.util.Locale.Builder builder17 = builder6.setLocale(locale10);
        java.util.Locale.Builder builder20 = builder17.setUnicodeLocaleKeyword("35", "");
        java.util.Locale.Builder builder22 = builder20.addUnicodeLocaleAttribute("zho");
        java.util.Locale.Builder builder24 = builder20.removeUnicodeLocaleAttribute("Cina");
        java.util.Locale.Builder builder25 = builder20.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder27 = builder20.setLanguageTag("Italian (Italy)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: Italian (Italy) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        java.util.Locale locale5 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str7 = locale5.getUnicodeLocaleType("35");
        java.lang.String str8 = dateTimeZone1.getName(64713600009L, locale5);
        java.lang.String str9 = locale5.getISO3Language();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "zho" + "'", str9, "zho");
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.lang.String str4 = locale3.getISO3Country();
        java.lang.String str5 = locale3.getISO3Language();
        java.util.Locale locale6 = java.util.Locale.getDefault();
        java.lang.String str7 = locale3.getDisplayVariant(locale6);
        java.util.Locale locale8 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale11 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology10, locale11, (java.lang.Integer) 100);
        java.util.Locale locale14 = java.util.Locale.getDefault();
        java.lang.String str15 = locale14.getISO3Country();
        java.lang.String str16 = locale14.getISO3Language();
        java.util.Locale locale17 = java.util.Locale.getDefault();
        java.lang.String str18 = locale14.getDisplayVariant(locale17);
        java.util.Locale locale19 = java.util.Locale.getDefault();
        java.lang.String str20 = locale19.getISO3Country();
        java.util.Locale locale21 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray22 = new java.util.Locale[] { locale3, locale8, locale11, locale14, locale19, locale21 };
        java.util.ArrayList<java.util.Locale> localeList23 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList23, localeArray22);
        java.util.Locale locale25 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList23);
        java.lang.String[] strArray29 = new java.lang.String[] { "zh", "hi!", "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        java.lang.String str32 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList30);
        java.util.Locale.LanguageRange[] languageRangeArray33 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList34 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList34, languageRangeArray33);
        java.util.Locale locale36 = java.util.Locale.getDefault();
        java.lang.String str37 = locale36.getISO3Country();
        java.lang.String str38 = locale36.getISO3Language();
        java.util.Locale locale39 = java.util.Locale.getDefault();
        java.lang.String str40 = locale36.getDisplayVariant(locale39);
        java.util.Locale locale41 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology43 = null;
        java.util.Locale locale44 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket46 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology43, locale44, (java.lang.Integer) 100);
        java.util.Locale locale47 = java.util.Locale.getDefault();
        java.lang.String str48 = locale47.getISO3Country();
        java.lang.String str49 = locale47.getISO3Language();
        java.util.Locale locale50 = java.util.Locale.getDefault();
        java.lang.String str51 = locale47.getDisplayVariant(locale50);
        java.util.Locale locale52 = java.util.Locale.getDefault();
        java.lang.String str53 = locale52.getISO3Country();
        java.util.Locale locale54 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray55 = new java.util.Locale[] { locale36, locale41, locale44, locale47, locale52, locale54 };
        java.util.ArrayList<java.util.Locale> localeList56 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList56, localeArray55);
        java.util.Locale locale58 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList34, (java.util.Collection<java.util.Locale>) localeList56);
        java.util.List<java.util.Locale> localeList59 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList56);
        java.util.Locale.LanguageRange[] languageRangeArray60 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList61 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList61, languageRangeArray60);
        java.util.Locale locale63 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet64 = locale63.getUnicodeLocaleKeys();
        java.lang.String str65 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList61, (java.util.Collection<java.lang.String>) strSet64);
        java.lang.String str66 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet64);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap67 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList68 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap67);
        java.util.Collection<java.util.Locale> localeCollection69 = null;
        java.util.Locale.FilteringMode filteringMode70 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.util.Locale> localeList71 = java.util.Locale.filter(languageRangeList68, localeCollection69, filteringMode70);
        java.util.Locale locale72 = java.util.Locale.GERMAN;
        java.util.Locale locale73 = java.util.Locale.getDefault();
        java.lang.String str74 = locale72.getDisplayVariant(locale73);
        java.util.Set<java.lang.String> strSet75 = locale73.getUnicodeLocaleKeys();
        java.util.Locale.FilteringMode filteringMode76 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList77 = java.util.Locale.filterTags(languageRangeList68, (java.util.Collection<java.lang.String>) strSet75, filteringMode76);
        java.util.Collection<java.lang.String> strCollection78 = null;
        java.lang.String str79 = java.util.Locale.lookupTag(languageRangeList68, strCollection78);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jpn" + "'", str5, "jpn");
        org.junit.Assert.assertNotNull(locale6);
// flaky:         org.junit.Assert.assertEquals(locale6.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
// flaky:         org.junit.Assert.assertEquals(locale8.toString(), "ja");
        org.junit.Assert.assertNotNull(locale11);
// flaky:         org.junit.Assert.assertEquals(locale11.toString(), "ja");
        org.junit.Assert.assertNotNull(locale14);
// flaky:         org.junit.Assert.assertEquals(locale14.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "jpn" + "'", str16, "jpn");
        org.junit.Assert.assertNotNull(locale17);
// flaky:         org.junit.Assert.assertEquals(locale17.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
// flaky:         org.junit.Assert.assertEquals(locale19.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(locale25);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(languageRangeArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(locale36);
// flaky:         org.junit.Assert.assertEquals(locale36.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "jpn" + "'", str38, "jpn");
        org.junit.Assert.assertNotNull(locale39);
// flaky:         org.junit.Assert.assertEquals(locale39.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(locale41);
// flaky:         org.junit.Assert.assertEquals(locale41.toString(), "ja");
        org.junit.Assert.assertNotNull(locale44);
// flaky:         org.junit.Assert.assertEquals(locale44.toString(), "ja");
        org.junit.Assert.assertNotNull(locale47);
// flaky:         org.junit.Assert.assertEquals(locale47.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
// flaky:         org.junit.Assert.assertEquals("'" + str49 + "' != '" + "jpn" + "'", str49, "jpn");
        org.junit.Assert.assertNotNull(locale50);
// flaky:         org.junit.Assert.assertEquals(locale50.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(locale52);
// flaky:         org.junit.Assert.assertEquals(locale52.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNull(locale58);
        org.junit.Assert.assertNotNull(localeList59);
        org.junit.Assert.assertNotNull(languageRangeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet64);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNotNull(languageRangeList68);
        org.junit.Assert.assertTrue("'" + filteringMode70 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode70.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(localeList71);
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "de");
        org.junit.Assert.assertNotNull(locale73);
// flaky:         org.junit.Assert.assertEquals(locale73.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNotNull(strSet75);
        org.junit.Assert.assertTrue("'" + filteringMode76 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode76.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList77);
        org.junit.Assert.assertNull(str79);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        java.lang.String str1 = dateTimeFieldType0.toString();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "millisOfSecond" + "'", str1, "millisOfSecond");
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        java.io.IOException iOException1 = new java.io.IOException("+01:00");
        java.lang.Throwable[] throwableArray2 = iOException1.getSuppressed();
        java.io.IOException iOException3 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.lang.String str6 = iOException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.io.IOException: +01:00" + "'", str6, "java.io.IOException: +01:00");
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((long) 'a');
        boolean boolean5 = dateTimeZone1.isFixed();
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (byte) 10);
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone1.isLocalDateTimeGap(localDateTime8);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long14 = dateTimeZone1.convertLocalToUTC(3124396800000L, false, (-360660010L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3124396800000L + "'", long14 == 3124396800000L);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder9 = builder7.removeUnicodeLocaleAttribute("jpn");
        java.util.Locale.Builder builder11 = builder9.setLanguageTag("cinese");
        java.util.Locale.Builder builder12 = builder9.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder12.setExtension('4', "107");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: 4 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("KOR", strMap1);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.util.Locale locale6 = java.util.Locale.getDefault();
        java.lang.String str7 = locale6.getISO3Country();
        java.lang.String str8 = locale6.getISO3Language();
        java.util.Locale locale9 = java.util.Locale.getDefault();
        java.lang.String str10 = locale6.getDisplayVariant(locale9);
        java.util.Locale locale11 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology13, locale14, (java.lang.Integer) 100);
        java.util.Locale locale17 = java.util.Locale.getDefault();
        java.lang.String str18 = locale17.getISO3Country();
        java.lang.String str19 = locale17.getISO3Language();
        java.util.Locale locale20 = java.util.Locale.getDefault();
        java.lang.String str21 = locale17.getDisplayVariant(locale20);
        java.util.Locale locale22 = java.util.Locale.getDefault();
        java.lang.String str23 = locale22.getISO3Country();
        java.util.Locale locale24 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray25 = new java.util.Locale[] { locale6, locale11, locale14, locale17, locale22, locale24 };
        java.util.ArrayList<java.util.Locale> localeList26 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList26, localeArray25);
        java.util.Locale locale28 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.util.Locale>) localeList26);
        java.lang.String[] strArray32 = new java.lang.String[] { "zh", "hi!", "" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        java.lang.String str35 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList33);
        java.util.Locale.LanguageRange[] languageRangeArray36 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList37 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList37, languageRangeArray36);
        java.util.Locale locale39 = java.util.Locale.getDefault();
        java.lang.String str40 = locale39.getISO3Country();
        java.lang.String str41 = locale39.getISO3Language();
        java.util.Locale locale42 = java.util.Locale.getDefault();
        java.lang.String str43 = locale39.getDisplayVariant(locale42);
        java.util.Locale locale44 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology46 = null;
        java.util.Locale locale47 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket49 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology46, locale47, (java.lang.Integer) 100);
        java.util.Locale locale50 = java.util.Locale.getDefault();
        java.lang.String str51 = locale50.getISO3Country();
        java.lang.String str52 = locale50.getISO3Language();
        java.util.Locale locale53 = java.util.Locale.getDefault();
        java.lang.String str54 = locale50.getDisplayVariant(locale53);
        java.util.Locale locale55 = java.util.Locale.getDefault();
        java.lang.String str56 = locale55.getISO3Country();
        java.util.Locale locale57 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray58 = new java.util.Locale[] { locale39, locale44, locale47, locale50, locale55, locale57 };
        java.util.ArrayList<java.util.Locale> localeList59 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList59, localeArray58);
        java.util.Locale locale61 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, (java.util.Collection<java.util.Locale>) localeList59);
        java.util.List<java.util.Locale> localeList62 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.util.Locale>) localeList59);
        java.util.Locale.LanguageRange languageRange64 = new java.util.Locale.LanguageRange("Germany");
        java.util.Locale.LanguageRange[] languageRangeArray65 = new java.util.Locale.LanguageRange[] { languageRange64 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList66 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList66, languageRangeArray65);
        java.util.Locale.LanguageRange[] languageRangeArray68 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList69 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList69, languageRangeArray68);
        java.util.Locale locale71 = java.util.Locale.getDefault();
        java.lang.String str72 = locale71.getISO3Country();
        java.lang.String str73 = locale71.getISO3Language();
        java.util.Locale locale74 = java.util.Locale.getDefault();
        java.lang.String str75 = locale71.getDisplayVariant(locale74);
        java.util.Locale locale76 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology78 = null;
        java.util.Locale locale79 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket81 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology78, locale79, (java.lang.Integer) 100);
        java.util.Locale locale82 = java.util.Locale.getDefault();
        java.lang.String str83 = locale82.getISO3Country();
        java.lang.String str84 = locale82.getISO3Language();
        java.util.Locale locale85 = java.util.Locale.getDefault();
        java.lang.String str86 = locale82.getDisplayVariant(locale85);
        java.util.Locale locale87 = java.util.Locale.getDefault();
        java.lang.String str88 = locale87.getISO3Country();
        java.util.Locale locale89 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray90 = new java.util.Locale[] { locale71, locale76, locale79, locale82, locale87, locale89 };
        java.util.ArrayList<java.util.Locale> localeList91 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList91, localeArray90);
        java.util.Locale locale93 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList69, (java.util.Collection<java.util.Locale>) localeList91);
        java.util.Locale.FilteringMode filteringMode94 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList95 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList66, (java.util.Collection<java.util.Locale>) localeList91, filteringMode94);
        java.util.Locale locale96 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.util.Locale>) localeList95);
        java.util.Locale locale97 = java.util.Locale.lookup(languageRangeList2, (java.util.Collection<java.util.Locale>) localeList95);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
// flaky:         org.junit.Assert.assertEquals(locale6.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zho" + "'", str8, "zho");
        org.junit.Assert.assertNotNull(locale9);
// flaky:         org.junit.Assert.assertEquals(locale9.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
// flaky:         org.junit.Assert.assertEquals(locale11.toString(), "zh");
        org.junit.Assert.assertNotNull(locale14);
// flaky:         org.junit.Assert.assertEquals(locale14.toString(), "zh");
        org.junit.Assert.assertNotNull(locale17);
// flaky:         org.junit.Assert.assertEquals(locale17.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "zho" + "'", str19, "zho");
        org.junit.Assert.assertNotNull(locale20);
// flaky:         org.junit.Assert.assertEquals(locale20.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(locale22);
// flaky:         org.junit.Assert.assertEquals(locale22.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(locale28);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(languageRangeArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(locale39);
// flaky:         org.junit.Assert.assertEquals(locale39.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "zho" + "'", str41, "zho");
        org.junit.Assert.assertNotNull(locale42);
// flaky:         org.junit.Assert.assertEquals(locale42.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(locale44);
// flaky:         org.junit.Assert.assertEquals(locale44.toString(), "zh");
        org.junit.Assert.assertNotNull(locale47);
// flaky:         org.junit.Assert.assertEquals(locale47.toString(), "zh");
        org.junit.Assert.assertNotNull(locale50);
// flaky:         org.junit.Assert.assertEquals(locale50.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "zho" + "'", str52, "zho");
        org.junit.Assert.assertNotNull(locale53);
// flaky:         org.junit.Assert.assertEquals(locale53.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(locale55);
// flaky:         org.junit.Assert.assertEquals(locale55.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNull(locale61);
        org.junit.Assert.assertNotNull(localeList62);
        org.junit.Assert.assertNotNull(languageRangeArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(languageRangeArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(locale71);
// flaky:         org.junit.Assert.assertEquals(locale71.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "zho" + "'", str73, "zho");
        org.junit.Assert.assertNotNull(locale74);
// flaky:         org.junit.Assert.assertEquals(locale74.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNotNull(locale76);
// flaky:         org.junit.Assert.assertEquals(locale76.toString(), "zh");
        org.junit.Assert.assertNotNull(locale79);
// flaky:         org.junit.Assert.assertEquals(locale79.toString(), "zh");
        org.junit.Assert.assertNotNull(locale82);
// flaky:         org.junit.Assert.assertEquals(locale82.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "zho" + "'", str84, "zho");
        org.junit.Assert.assertNotNull(locale85);
// flaky:         org.junit.Assert.assertEquals(locale85.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertNotNull(locale87);
// flaky:         org.junit.Assert.assertEquals(locale87.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertNotNull(locale89);
        org.junit.Assert.assertEquals(locale89.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertNull(locale93);
        org.junit.Assert.assertTrue("'" + filteringMode94 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode94.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList95);
        org.junit.Assert.assertNull(locale96);
        org.junit.Assert.assertNull(locale97);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.monthOfYear();
        java.lang.String str1 = dateTimeFieldType0.getName();
        org.joda.time.DurationFieldType durationFieldType2 = dateTimeFieldType0.getDurationType();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "monthOfYear" + "'", str1, "monthOfYear");
        org.junit.Assert.assertNotNull(durationFieldType2);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        java.util.Locale locale2 = new java.util.Locale("\u4e2d\u6587\u4e2d\u56fd)", "CAN");
        org.junit.Assert.assertEquals(locale2.toString(), "\u4e2d\u6587\u4e2d\u56fd)_CAN");
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        java.util.Locale locale3 = new java.util.Locale("168", "DateTimeField[millisOfDay]", "dayOfYear");
        java.lang.String str4 = locale3.getDisplayName();
        org.junit.Assert.assertEquals(locale3.toString(), "168_DATETIMEFIELD[MILLISOFDAY]_dayOfYear");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "168 (DATETIMEFIELD[MILLISOFDAY],dayOfYear)" + "'", str4, "168 (DATETIMEFIELD[MILLISOFDAY],dayOfYear)");
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale4 = new java.util.Locale("10", "jpn", "us");
        java.lang.String str5 = locale4.getDisplayName();
        java.util.Locale.setDefault(category0, locale4);
        java.util.Locale locale7 = java.util.Locale.getDefault(category0);
        boolean boolean8 = locale7.hasExtensions();
        java.lang.String str9 = locale7.getScript();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale4.toString(), "10_JPN_us");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10 (JPN,us)" + "'", str5, "10 (JPN,us)");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "10_JPN_us");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.addUnicodeLocaleAttribute("UTC");
        java.util.Locale.Builder builder3 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.setVariant("java.io.IOException: it-IT");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: java.io.IOException: it-IT [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder8 = builder1.addUnicodeLocaleAttribute("jpn");
        java.util.Locale.Builder builder10 = builder8.setRegion("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder8.setLanguageTag("360660000");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: 360660000 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        boolean boolean4 = dateTimeZone1.isStandardOffset((long) (byte) 100);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.Chronology chronology9 = null;
        java.util.Locale locale10 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology9, locale10, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket(100L, chronology7, locale10);
        java.lang.String str14 = locale10.getScript();
        java.lang.String str16 = locale10.getExtension('u');
        java.util.Set<java.lang.String> strSet17 = locale10.getUnicodeLocaleAttributes();
        java.lang.String str18 = dateTimeZone1.getShortName((long) 100, locale10);
        java.lang.String str20 = dateTimeZone1.getShortName(10L);
        java.lang.String str22 = dateTimeZone1.getShortName((long) 2);
        int int24 = dateTimeZone1.getOffsetFromLocal(64713600000L);
        java.lang.String str26 = dateTimeZone1.getNameKey(32054400052L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(locale10);
// flaky:         org.junit.Assert.assertEquals(locale10.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.010" + "'", str18, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.010" + "'", str20, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.010" + "'", str22, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "ko-KR");
        java.util.Locale.Builder builder8 = builder3.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder9 = builder8.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder8.setUnicodeLocaleKeyword("", "\u5927\u97d3\u6c11\u56fd");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        java.util.Locale locale2 = new java.util.Locale("italiano (Italia)", "48");
        java.util.Locale.setDefault(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "italiano (italia)_48");
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket7.getZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        int int11 = dateTimeZone8.getOffset(64713600009L);
        long long14 = dateTimeZone8.adjustOffset(259200100L, false);
        long long17 = dateTimeZone8.adjustOffset((-27430372L), true);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "italiano (italia)_48");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 259200100L + "'", long14 == 259200100L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-27430372L) + "'", long17 == (-27430372L));
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        java.util.Locale locale3 = new java.util.Locale("ko-KR", "32", "");
        java.util.Locale locale4 = locale3.stripExtensions();
        org.junit.Assert.assertEquals(locale3.toString(), "ko-kr_32");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko-kr_32");
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        java.io.IOException iOException2 = new java.io.IOException("und");
        java.io.IOException iOException3 = new java.io.IOException("dayOfYear", (java.lang.Throwable) iOException2);
        java.lang.String str4 = iOException2.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.io.IOException: und" + "'", str4, "java.io.IOException: und");
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        boolean boolean2 = dateTimeZone1.isFixed();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone1.getOffset(readableInstant3);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguageTag("eng");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder8 = builder1.clear();
        java.util.Locale.Builder builder10 = builder1.setLanguage("it");
        java.util.Locale locale11 = builder10.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder10.setLanguage("Deutsch (Deutschland)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: Deutsch (Deutschland) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "it");
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.FRENCH;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology1, locale2, (java.lang.Integer) (-1), 0);
        java.util.Locale locale6 = locale2.stripExtensions();
        java.util.Locale.Builder builder7 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder8 = builder7.clear();
        java.util.Locale locale9 = builder8.build();
        java.util.Locale locale10 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str11 = locale9.getDisplayLanguage(locale10);
        java.lang.String str12 = locale10.getDisplayCountry();
        java.lang.String str13 = locale2.getDisplayLanguage(locale10);
        java.lang.String str14 = locale10.getCountry();
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "China" + "'", str12, "China");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u6cd5\u6587" + "'", str13, "\u6cd5\u6587");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "CN" + "'", str14, "CN");
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clear();
        java.util.Locale.Builder builder3 = builder1.clearExtensions();
        java.util.Locale locale4 = builder3.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder3.setUnicodeLocaleKeyword("+00:00:00.024", "DateTimeField[minuteOfDay]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: +00:00:00.024 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder9 = builder7.removeUnicodeLocaleAttribute("jpn");
        java.util.Locale.Builder builder11 = builder9.setLanguage("CN");
        java.util.Locale.Builder builder12 = builder9.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder9.removeUnicodeLocaleAttribute("360000000");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 360000000 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("DEUTSCH");
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "deutsch");
        org.junit.Assert.assertNotNull(strSet2);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("Chinesisch");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(3600000);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("java.io.IOException: java.io.IOException: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=java.io.ioexception: java.io.ioexception: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("\u661f\u671f\u4e00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=???");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((long) 'a');
        boolean boolean5 = dateTimeZone1.isFixed();
        int int7 = dateTimeZone1.getOffset((long) (short) 100);
        boolean boolean9 = dateTimeZone1.isStandardOffset((long) 0);
        int int11 = dateTimeZone1.getStandardOffset((long) 8);
        long long14 = dateTimeZone1.convertLocalToUTC(259200000L, true);
        java.util.TimeZone timeZone15 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str19 = dateTimeZone18.getID();
        long long23 = dateTimeZone18.convertLocalToUTC((long) 53, true, 60220800000L);
        org.joda.time.ReadableInstant readableInstant24 = null;
        int int25 = dateTimeZone18.getOffset(readableInstant24);
        java.util.Locale locale29 = new java.util.Locale("+01:00", "x-lvariant-0");
        java.lang.String str30 = dateTimeZone18.getName((long) 'a', locale29);
        java.lang.String str31 = locale29.getDisplayCountry();
        java.lang.String str32 = dateTimeZone1.getName((-262800000L), locale29);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = locale29.getISO3Country();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter country code for X-LVARIANT-0");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 259200000L + "'", long14 == 259200000L);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTC" + "'", str19, "UTC");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 53L + "'", long23 == 53L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals(locale29.toString(), "+01:00_X-LVARIANT-0");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00" + "'", str30, "+00:00");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "X-LVARIANT-0" + "'", str31, "X-LVARIANT-0");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00" + "'", str32, "+00:00");
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("francese", (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=10.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguageTag("eng");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder8 = builder1.clear();
        java.util.Locale.Builder builder10 = builder1.setLanguageTag("CHN");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder1.addUnicodeLocaleAttribute("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        java.util.Locale locale1 = new java.util.Locale("193980000");
        org.junit.Assert.assertEquals(locale1.toString(), "193980000");
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.FRENCH;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology1, locale2, (java.lang.Integer) (-1), 0);
        dateTimeParserBucket5.setOffset((java.lang.Integer) 5207);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr");
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale.Builder builder5 = builder1.setUnicodeLocaleKeyword("48", "English");
        java.util.Locale.Builder builder6 = builder1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.addUnicodeLocaleAttribute("23");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 23 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        java.io.IOException iOException2 = new java.io.IOException("zho");
        java.lang.Throwable[] throwableArray3 = iOException2.getSuppressed();
        java.lang.Throwable throwable5 = null;
        java.io.IOException iOException6 = new java.io.IOException("UTC", throwable5);
        java.io.IOException iOException7 = new java.io.IOException(throwable5);
        iOException2.addSuppressed((java.lang.Throwable) iOException7);
        java.io.IOException iOException9 = new java.io.IOException("UTC", (java.lang.Throwable) iOException7);
        java.io.IOException iOException10 = new java.io.IOException((java.lang.Throwable) iOException7);
        java.io.IOException iOException14 = new java.io.IOException("\u4e2d\u56fd");
        java.lang.Throwable[] throwableArray15 = iOException14.getSuppressed();
        java.lang.Throwable[] throwableArray16 = iOException14.getSuppressed();
        java.io.IOException iOException17 = new java.io.IOException("DateTimeField[millisOfDay]", (java.lang.Throwable) iOException14);
        java.io.IOException iOException18 = new java.io.IOException("Japanese", (java.lang.Throwable) iOException14);
        iOException10.addSuppressed((java.lang.Throwable) iOException18);
        java.lang.Throwable[] throwableArray20 = iOException18.getSuppressed();
        java.lang.String str21 = iOException18.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "java.io.IOException: Japanese" + "'", str21, "java.io.IOException: Japanese");
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder10 = builder7.setExtension('x', "");
        java.util.Locale.Builder builder11 = builder10.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder11.setLanguageTag("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Empty subtag [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale locale8 = builder1.build();
        java.lang.String str9 = locale8.getISO3Language();
        java.util.Locale locale12 = new java.util.Locale("utc", "dayOfWeek");
        java.lang.String str13 = locale8.getDisplayName(locale12);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone15.getOffset(readableInstant16);
        java.util.Locale locale19 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str21 = locale19.getUnicodeLocaleType("35");
        java.lang.String str22 = dateTimeZone15.getName(64713600009L, locale19);
        java.lang.String str23 = locale8.getDisplayName(locale19);
        java.lang.String str24 = locale19.getVariant();
        java.lang.String str25 = locale19.getDisplayScript();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ita");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ita" + "'", str9, "ita");
        org.junit.Assert.assertEquals(locale12.toString(), "utc_DAYOFWEEK");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Italian" + "'", str13, "Italian");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u610f\u5927\u5229\u6587" + "'", str23, "\u610f\u5927\u5229\u6587");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("338855", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=338855");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        java.util.Locale locale2 = new java.util.Locale("\u661f\u671f\u56db", "thu");
        java.lang.String str4 = locale2.getExtension('a');
        org.junit.Assert.assertEquals(locale2.toString(), "\u661f\u671f\u56db_THU");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("50", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=50");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        int int4 = dateTimeZone1.getOffsetFromLocal((long) 100);
        org.joda.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = dateTimeZone1.isLocalDateTimeGap(localDateTime5);
        boolean boolean7 = dateTimeZone1.isFixed();
        int int9 = dateTimeZone1.getOffsetFromLocal((long) '4');
        java.lang.String str10 = dateTimeZone1.getID();
        int int12 = dateTimeZone1.getStandardOffset(0L);
        java.lang.String str13 = dateTimeZone1.getID();
        int int15 = dateTimeZone1.getStandardOffset(26006400048L);
        long long19 = dateTimeZone1.convertLocalToUTC((long) 1970, false, 8L);
        org.joda.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = dateTimeZone1.isLocalDateTimeGap(localDateTime20);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1970L + "'", long19 == 1970L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.GERMANY;
        java.lang.String str2 = locale1.getDisplayCountry();
        java.util.Locale.setDefault(category0, locale1);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Chronology chronology7 = null;
        java.util.Locale locale8 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology7, locale8, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket(100L, chronology5, locale8);
        java.lang.String str12 = locale8.getDisplayScript();
        java.util.Locale.setDefault(category0, locale8);
        java.lang.String str14 = locale8.getDisplayVariant();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Germany" + "'", str2, "Germany");
        org.junit.Assert.assertNotNull(locale8);
// flaky:         org.junit.Assert.assertEquals(locale8.toString(), "ita");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Germania", (double) (-360659893L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-3.60659893E8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(1972);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguageTag("eng");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder8 = builder1.clear();
        java.util.Locale.Builder builder11 = builder8.setExtension('u', "DE");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder8.setLanguageTag("java.io.IOException: +02:00");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: java.io.IOException: +02:00 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "ko-KR");
        java.util.Locale.Builder builder8 = builder3.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale.Builder builder11 = builder9.setLanguageTag("Italian");
        java.util.Locale.Builder builder12 = builder9.clearExtensions();
        java.util.Locale.Builder builder13 = builder9.clearExtensions();
        java.util.Locale.Builder builder16 = builder13.setExtension('u', "year");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder18 = builder16.setLanguage("clockhourOfHalfday");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: clockhourOfHalfday [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("halfdayOfDay");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=halfdayofday");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("", (double) 8540279926L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=8.540279926E9");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("\u661f\u671f\u4e00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=???");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        java.io.IOException iOException2 = new java.io.IOException("UTC");
        java.io.IOException iOException5 = new java.io.IOException("zho");
        java.lang.Throwable[] throwableArray6 = iOException5.getSuppressed();
        java.lang.Throwable throwable8 = null;
        java.io.IOException iOException9 = new java.io.IOException("UTC", throwable8);
        java.io.IOException iOException10 = new java.io.IOException(throwable8);
        iOException5.addSuppressed((java.lang.Throwable) iOException10);
        java.io.IOException iOException12 = new java.io.IOException("UTC", (java.lang.Throwable) iOException10);
        iOException2.addSuppressed((java.lang.Throwable) iOException10);
        java.lang.Throwable[] throwableArray14 = iOException2.getSuppressed();
        java.io.IOException iOException15 = new java.io.IOException("24", (java.lang.Throwable) iOException2);
        java.io.IOException iOException17 = new java.io.IOException("ita");
        java.io.IOException iOException18 = new java.io.IOException((java.lang.Throwable) iOException17);
        iOException2.addSuppressed((java.lang.Throwable) iOException17);
        java.io.IOException iOException22 = new java.io.IOException("zho");
        java.lang.Throwable[] throwableArray23 = iOException22.getSuppressed();
        java.io.IOException iOException24 = new java.io.IOException((java.lang.Throwable) iOException22);
        java.io.IOException iOException25 = new java.io.IOException("ITA", (java.lang.Throwable) iOException22);
        java.io.IOException iOException26 = new java.io.IOException((java.lang.Throwable) iOException25);
        iOException17.addSuppressed((java.lang.Throwable) iOException25);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray23);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("9", (double) (-2193219515800L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-2.1932195158E12");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.TimeZone timeZone3 = dateTimeZone1.toTimeZone();
        org.joda.time.tz.NameProvider nameProvider4 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider4);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider4);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider4);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider4);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider4);
        boolean boolean10 = dateTimeZone1.equals((java.lang.Object) nameProvider4);
        boolean boolean12 = dateTimeZone1.isStandardOffset((long) (-1852));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(nameProvider4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "ko-KR");
        java.util.Locale.Builder builder8 = builder3.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder10 = builder3.addUnicodeLocaleAttribute("ita");
        java.util.Locale.Builder builder12 = builder10.setRegion("CN");
        java.util.Locale.Builder builder13 = builder12.clear();
        java.util.Locale locale14 = builder12.build();
        java.util.Locale locale15 = builder12.build();
        java.lang.String str16 = locale15.getDisplayName();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.lang.String str3 = locale0.getDisplayScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("PM", (double) (-91L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-91.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.monthOfYear();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.secondOfMinute();
        org.joda.time.DurationField durationField12 = chronology8.seconds();
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        java.util.Locale locale1 = new java.util.Locale("1439");
        org.junit.Assert.assertEquals(locale1.toString(), "1439");
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology1, locale3, (java.lang.Integer) 1, 0);
        dateTimeParserBucket6.setOffset((int) (short) 100);
        dateTimeParserBucket6.setOffset((java.lang.Integer) 12);
        java.util.Locale locale11 = dateTimeParserBucket6.getLocale();
        int int12 = dateTimeParserBucket6.getOffset();
        long long15 = dateTimeParserBucket6.computeMillis(true, "java.io.IOException: -292275054");
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12 + "'", int12 == 12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 105L + "'", long15 == 105L);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clear();
        java.util.Locale.Builder builder3 = builder1.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder1.setVariant("DateTimeField[dayOfWeek]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: DateTimeField[dayOfWeek] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguageTag("eng");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder8 = builder1.clear();
        java.util.Locale.Builder builder11 = builder8.setExtension('u', "DE");
        java.util.Locale.Builder builder13 = builder8.setLanguageTag("Italian");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder8.setExtension('a', "Wednesday");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: Wednesday [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder8 = builder1.addUnicodeLocaleAttribute("jpn");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.setRegion("356580000");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: 356580000 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.FRENCH;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology1, locale2, (java.lang.Integer) (-1), 0);
        java.util.Locale locale6 = locale2.stripExtensions();
        java.util.Locale.Builder builder7 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder8 = builder7.clear();
        java.util.Locale locale9 = builder8.build();
        java.util.Locale locale10 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str11 = locale9.getDisplayLanguage(locale10);
        java.lang.String str12 = locale10.getDisplayCountry();
        java.lang.String str13 = locale2.getDisplayLanguage(locale10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = locale2.getUnicodeLocaleType("fran\347ais");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: franc?ais");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u4e2d\u56fd" + "'", str12, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u6cd5\u6587" + "'", str13, "\u6cd5\u6587");
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.lang.String str1 = locale0.getScript();
        java.util.Set<java.lang.String> strSet2 = locale0.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet3 = locale0.getUnicodeLocaleKeys();
        java.util.Set<java.lang.Character> charSet4 = locale0.getExtensionKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(charSet4);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("java.io.IOException: +01:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'java.io.IOException: +01:00' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.lang.String str5 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet4);
        java.util.Locale locale6 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet7 = locale6.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode8 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList9 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet7, filteringMode8);
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        java.util.Locale locale13 = java.util.Locale.getDefault();
        java.lang.String str14 = null; // flaky: locale13.getISO3Country();
        java.lang.String str15 = null; // flaky: locale13.getISO3Language();
        java.util.Locale locale16 = java.util.Locale.getDefault();
        java.lang.String str17 = locale13.getDisplayVariant(locale16);
        java.util.Locale locale18 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology20 = null;
        java.util.Locale locale21 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology20, locale21, (java.lang.Integer) 100);
        java.util.Locale locale24 = java.util.Locale.getDefault();
        java.lang.String str25 = null; // flaky: locale24.getISO3Country();
        java.lang.String str26 = null; // flaky: locale24.getISO3Language();
        java.util.Locale locale27 = java.util.Locale.getDefault();
        java.lang.String str28 = locale24.getDisplayVariant(locale27);
        java.util.Locale locale29 = java.util.Locale.getDefault();
        java.lang.String str30 = null; // flaky: locale29.getISO3Country();
        java.util.Locale locale31 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray32 = new java.util.Locale[] { locale13, locale18, locale21, locale24, locale29, locale31 };
        java.util.ArrayList<java.util.Locale> localeList33 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList33, localeArray32);
        java.util.Locale locale35 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.util.Locale>) localeList33);
        java.lang.String[] strArray39 = new java.lang.String[] { "zh", "hi!", "" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        java.lang.String str42 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.lang.String>) strList40);
        java.util.Locale.LanguageRange[] languageRangeArray43 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList44 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList44, languageRangeArray43);
        java.util.Locale locale46 = java.util.Locale.getDefault();
        java.lang.String str47 = null; // flaky: locale46.getISO3Country();
        java.lang.String str48 = null; // flaky: locale46.getISO3Language();
        java.util.Locale locale49 = java.util.Locale.getDefault();
        java.lang.String str50 = locale46.getDisplayVariant(locale49);
        java.util.Locale locale51 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology53 = null;
        java.util.Locale locale54 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket56 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology53, locale54, (java.lang.Integer) 100);
        java.util.Locale locale57 = java.util.Locale.getDefault();
        java.lang.String str58 = null; // flaky: locale57.getISO3Country();
        java.lang.String str59 = null; // flaky: locale57.getISO3Language();
        java.util.Locale locale60 = java.util.Locale.getDefault();
        java.lang.String str61 = locale57.getDisplayVariant(locale60);
        java.util.Locale locale62 = java.util.Locale.getDefault();
        java.lang.String str63 = null; // flaky: locale62.getISO3Country();
        java.util.Locale locale64 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray65 = new java.util.Locale[] { locale46, locale51, locale54, locale57, locale62, locale64 };
        java.util.ArrayList<java.util.Locale> localeList66 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList66, localeArray65);
        java.util.Locale locale68 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList44, (java.util.Collection<java.util.Locale>) localeList66);
        java.util.List<java.util.Locale> localeList69 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.util.Locale>) localeList66);
        java.util.Locale.LanguageRange[] languageRangeArray70 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList71 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList71, languageRangeArray70);
        java.util.Locale locale73 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet74 = locale73.getUnicodeLocaleKeys();
        java.lang.String str75 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList71, (java.util.Collection<java.lang.String>) strSet74);
        java.lang.String str76 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.lang.String>) strSet74);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap77 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList78 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, strMap77);
        java.util.Locale locale79 = java.util.Locale.GERMAN;
        java.util.Locale locale80 = java.util.Locale.getDefault();
        java.lang.String str81 = locale79.getDisplayVariant(locale80);
        java.util.Set<java.lang.String> strSet82 = locale80.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList83 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.lang.String>) strSet82);
        java.util.List<java.lang.String> strList84 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList83);
        java.util.Locale locale86 = java.util.Locale.forLanguageTag("Franz\366sisch (Frankreich)");
        java.lang.String str87 = locale86.toLanguageTag();
        java.util.Set<java.lang.String> strSet88 = locale86.getUnicodeLocaleAttributes();
        java.lang.String str89 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet88);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + filteringMode8 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode8.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(locale13);
// flaky:         org.junit.Assert.assertEquals(locale13.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "zho" + "'", str15, "zho");
        org.junit.Assert.assertNotNull(locale16);
// flaky:         org.junit.Assert.assertEquals(locale16.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale18);
// flaky:         org.junit.Assert.assertEquals(locale18.toString(), "zh");
        org.junit.Assert.assertNotNull(locale21);
// flaky:         org.junit.Assert.assertEquals(locale21.toString(), "zh");
        org.junit.Assert.assertNotNull(locale24);
// flaky:         org.junit.Assert.assertEquals(locale24.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "zho" + "'", str26, "zho");
        org.junit.Assert.assertNotNull(locale27);
// flaky:         org.junit.Assert.assertEquals(locale27.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(locale29);
// flaky:         org.junit.Assert.assertEquals(locale29.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(locale35);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(languageRangeArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(locale46);
// flaky:         org.junit.Assert.assertEquals(locale46.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
// flaky:         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "zho" + "'", str48, "zho");
        org.junit.Assert.assertNotNull(locale49);
// flaky:         org.junit.Assert.assertEquals(locale49.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(locale51);
// flaky:         org.junit.Assert.assertEquals(locale51.toString(), "zh");
        org.junit.Assert.assertNotNull(locale54);
// flaky:         org.junit.Assert.assertEquals(locale54.toString(), "zh");
        org.junit.Assert.assertNotNull(locale57);
// flaky:         org.junit.Assert.assertEquals(locale57.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
// flaky:         org.junit.Assert.assertEquals("'" + str59 + "' != '" + "zho" + "'", str59, "zho");
        org.junit.Assert.assertNotNull(locale60);
// flaky:         org.junit.Assert.assertEquals(locale60.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(locale62);
// flaky:         org.junit.Assert.assertEquals(locale62.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNull(locale68);
        org.junit.Assert.assertNotNull(localeList69);
        org.junit.Assert.assertNotNull(languageRangeArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet74);
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertNull(str76);
        org.junit.Assert.assertNotNull(languageRangeList78);
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "de");
        org.junit.Assert.assertNotNull(locale80);
// flaky:         org.junit.Assert.assertEquals(locale80.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertNotNull(strSet82);
        org.junit.Assert.assertNotNull(strList83);
        org.junit.Assert.assertNotNull(strList84);
        org.junit.Assert.assertNotNull(locale86);
        org.junit.Assert.assertEquals(locale86.toString(), "");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "und" + "'", str87, "und");
        org.junit.Assert.assertNotNull(strSet88);
        org.junit.Assert.assertNull(str89);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        java.io.IOException iOException1 = new java.io.IOException("\u661f\u671f\u65e5");
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clear();
        java.util.Locale.Builder builder3 = builder1.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.setScript("Cina");
        java.util.Locale.Builder builder8 = builder6.setRegion("168");
        java.util.Locale locale11 = new java.util.Locale("97", "DEUTSCH");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder8.setLocale(locale11);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: 97 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals(locale11.toString(), "97_DEUTSCH");
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        java.util.Locale locale3 = new java.util.Locale("10", "jpn", "us");
        java.util.Locale.setDefault(locale3);
        java.lang.String str5 = locale3.getDisplayLanguage();
        java.util.Set<java.lang.Character> charSet6 = locale3.getExtensionKeys();
        java.util.Locale locale10 = new java.util.Locale("\u52a0\u62ff\u5927", "jpn", "\u65e5\u6587");
        java.lang.String str11 = locale3.getDisplayLanguage(locale10);
        boolean boolean12 = locale10.hasExtensions();
        org.junit.Assert.assertEquals(locale3.toString(), "10_JPN_us");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10" + "'", str5, "10");
        org.junit.Assert.assertNotNull(charSet6);
// flaky:         org.junit.Assert.assertEquals(locale10.toString(), "\u52a0\u62ff\u5927\u65e5\u6587");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10" + "'", str11, "10");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket7.getZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        int int11 = dateTimeZone8.getOffset(64713600009L);
        java.lang.String str13 = dateTimeZone8.getNameKey((long) 3600000);
        long long16 = dateTimeZone8.adjustOffset(3600000054L, true);
        java.lang.String str17 = dateTimeZone8.getID();
        java.util.TimeZone timeZone18 = dateTimeZone8.toTimeZone();
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "10_JPN_us");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3600000054L + "'", long16 == 3600000054L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("5", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("292278993", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=292278993");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(18874799, 58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder7.setExtension('a', "+01:00 (X-LVARIANT-0)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: +01:00 (X [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("year");
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone5.getOffset(readableInstant6);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone5.getOffset(readableInstant8);
        org.joda.time.Chronology chronology12 = null;
        java.util.Locale locale13 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology12, locale13, (java.lang.Integer) 100);
        java.lang.String str16 = dateTimeZone5.getShortName(10L, locale13);
        java.util.Locale.Builder builder17 = null; // flaky: builder0.setLocale(locale13);
        java.util.Locale.Builder builder18 = null; // flaky: builder17.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder20 = null; // flaky: builder17.removeUnicodeLocaleAttribute("DateTimeField[dayOfMonth]");
// flaky:             org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: DateTimeField[dayOfMonth] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(locale13);
// flaky:         org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
// flaky:         org.junit.Assert.assertNotNull(builder17);
// flaky:         org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale locale7 = builder6.build();
        java.util.Locale.Builder builder9 = builder6.setVariant("18000000");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder6.setLanguage("DateTimeField[halfdayOfDay]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: DateTimeField[halfdayOfDay] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ita");
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("year");
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone5.getOffset(readableInstant6);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone5.getOffset(readableInstant8);
        org.joda.time.Chronology chronology12 = null;
        java.util.Locale locale13 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology12, locale13, (java.lang.Integer) 100);
        java.lang.String str16 = dateTimeZone5.getShortName(10L, locale13);
        java.util.Locale.Builder builder17 = null; // flaky: builder0.setLocale(locale13);
        java.util.Locale.Builder builder19 = builder0.setRegion("100");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder21 = builder0.setScript("+11:00");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: +11:00 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(locale13);
// flaky:         org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
// flaky:         org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        int int4 = dateTimeZone1.getOffsetFromLocal((long) 100);
        long long6 = dateTimeZone1.convertUTCToLocal((long) (byte) 100);
        boolean boolean7 = dateTimeZone1.isFixed();
        long long10 = dateTimeZone1.adjustOffset(4320000000L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 4320000000L + "'", long10 == 4320000000L);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(345599, 212400000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 212400000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.GERMANY;
        java.lang.String str2 = locale1.getDisplayCountry();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Set<java.lang.String> strSet4 = locale1.getUnicodeLocaleAttributes();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Germany" + "'", str2, "Germany");
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.GERMANY;
        java.lang.String str2 = locale1.getDisplayCountry();
        java.util.Locale.setDefault(category0, locale1);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Chronology chronology7 = null;
        java.util.Locale locale8 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology7, locale8, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket(100L, chronology5, locale8);
        java.lang.String str12 = locale8.getDisplayScript();
        java.util.Locale.setDefault(category0, locale8);
        java.lang.String str15 = locale8.getExtension('u');
        java.lang.String str16 = locale8.getDisplayCountry();
        java.lang.String str17 = locale8.getScript();
        java.util.Locale locale18 = locale8.stripExtensions();
        java.util.Set<java.lang.Character> charSet19 = locale18.getExtensionKeys();
        java.lang.String str20 = locale18.getDisplayVariant();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Germany" + "'", str2, "Germany");
        org.junit.Assert.assertNotNull(locale8);
// flaky:         org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str15);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale18);
// flaky:         org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertNotNull(charSet19);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale locale8 = builder1.build();
        java.lang.String str9 = locale8.getISO3Language();
        java.util.Set<java.lang.Character> charSet10 = locale8.getExtensionKeys();
        java.lang.String str11 = locale8.getVariant();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ita");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ita" + "'", str9, "ita");
        org.junit.Assert.assertNotNull(charSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-434), 11675);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 11675");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("millisOfDay", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=millisofday");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale locale3 = builder0.build();
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.setVariant("thu");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: thu [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "ko-KR");
        java.util.Locale.Builder builder8 = builder3.addUnicodeLocaleAttribute("Germany");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.addUnicodeLocaleAttribute("66");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 66 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(8);
        int int3 = dateTimeZone1.getStandardOffset((long) 3);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Chronology chronology7 = null;
        java.util.Locale locale8 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology7, locale8, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket(100L, chronology5, locale8);
        org.joda.time.DateTimeZone dateTimeZone12 = dateTimeParserBucket11.getZone();
        int int14 = dateTimeZone12.getOffsetFromLocal(102816006301L);
        long long16 = dateTimeZone1.getMillisKeepLocal(dateTimeZone12, 360001970L);
        long long19 = dateTimeZone12.convertLocalToUTC((long) 4969628, false);
        long long23 = dateTimeZone12.convertLocalToUTC(3149193599100L, false, 18720052L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertNotNull(locale8);
// flaky:         org.junit.Assert.assertEquals(locale8.toString(), "zh");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 360001978L + "'", long16 == 360001978L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 4969628L + "'", long19 == 4969628L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 3149193599100L + "'", long23 == 3149193599100L);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str1 = dateTimeZone0.getID();
        int int3 = dateTimeZone0.getOffsetFromLocal(60480000010L);
        long long7 = dateTimeZone0.convertLocalToUTC(18748800052L, false, 259200087L);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str10 = dateTimeZone9.getID();
        long long12 = dateTimeZone9.previousTransition((long) 'a');
        boolean boolean13 = dateTimeZone9.isFixed();
        long long17 = dateTimeZone9.convertLocalToUTC(0L, false, (long) (short) 100);
        long long19 = dateTimeZone0.getMillisKeepLocal(dateTimeZone9, (long) 5207);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str22 = dateTimeZone21.getID();
        long long24 = dateTimeZone21.nextTransition((-1L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone21);
        java.lang.String str26 = dateTimeZone21.getID();
        long long28 = dateTimeZone0.getMillisKeepLocal(dateTimeZone21, 93623040172800008L);
        int int30 = dateTimeZone21.getOffset(3974400000L);
        boolean boolean31 = dateTimeZone21.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTC" + "'", str1, "UTC");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 18748800052L + "'", long7 == 18748800052L);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 5207L + "'", long19 == 5207L);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTC" + "'", str22, "UTC");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "UTC" + "'", str26, "UTC");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 93623040172800008L + "'", long28 == 93623040172800008L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale10 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology8, locale10, (java.lang.Integer) 1, 0);
        java.util.Locale locale14 = java.util.Locale.ENGLISH;
        java.lang.String str15 = locale10.getDisplayName(locale14);
        java.lang.String str16 = locale10.getISO3Country();
        java.util.Locale.Builder builder17 = builder6.setLocale(locale10);
        java.util.Locale.Builder builder20 = builder17.setUnicodeLocaleKeyword("35", "");
        java.util.Locale.Builder builder22 = builder20.addUnicodeLocaleAttribute("zho");
        java.util.Locale.Builder builder24 = builder20.removeUnicodeLocaleAttribute("Cina");
        java.util.Locale.Builder builder25 = builder20.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder27 = builder25.setScript("JAVA.IO.IOEXCEPTION: ZHO");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: JAVA.IO.IOEXCEPTION: ZHO [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        java.io.IOException iOException1 = new java.io.IOException("UTC");
        java.io.IOException iOException3 = new java.io.IOException("zho");
        iOException1.addSuppressed((java.lang.Throwable) iOException3);
        java.lang.Throwable[] throwableArray5 = iOException3.getSuppressed();
        java.lang.String str6 = iOException3.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.io.IOException: zho" + "'", str6, "java.io.IOException: zho");
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder9 = builder1.setRegion("ko");
        java.util.Locale.Builder builder10 = builder9.clearExtensions();
        java.util.Locale locale11 = builder10.build();
        java.lang.String str13 = locale11.getUnicodeLocaleType("52");
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ita_KO");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguageTag("eng");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale locale8 = builder7.build();
        java.util.Locale locale9 = java.util.Locale.CHINESE;
        java.lang.String str10 = locale9.toLanguageTag();
        java.lang.String str11 = locale9.getDisplayScript();
        java.util.Locale.Builder builder12 = builder7.setLocale(locale9);
        java.util.Locale.Builder builder13 = builder7.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder7.addUnicodeLocaleAttribute("monthOfYear");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: monthOfYear [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "eng");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "zh" + "'", str10, "zh");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder1.setUnicodeLocaleKeyword("CN", "DateTimeField[hourOfHalfday]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword type: DateTimeField[hourOfHalfday] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        java.util.Locale locale2 = new java.util.Locale("18720052", "31_FRANZ\366\u30a4\u30bf\u30ea\u30a2");
        org.junit.Assert.assertEquals(locale2.toString(), "18720052_31_FRANZ\366\u30a4\u30bf\u30ea\u30a2");
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("DateTimeField[year]", (double) 464L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=464.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale2 = new java.util.Locale("US");
        java.lang.String str3 = locale2.getVariant();
        java.util.Locale.setDefault(category0, locale2);
        java.util.Locale locale5 = java.util.Locale.getDefault(category0);
        org.joda.time.Chronology chronology7 = null;
        java.util.Locale locale8 = java.util.Locale.FRENCH;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology7, locale8, (java.lang.Integer) (-1), 0);
        java.util.Locale locale12 = java.util.Locale.ITALY;
        java.lang.String str13 = locale12.getScript();
        java.lang.String str14 = locale12.getScript();
        boolean boolean15 = dateTimeParserBucket11.restoreState((java.lang.Object) locale12);
        java.util.Locale.setDefault(category0, locale12);
        java.lang.String str18 = locale12.getExtension('a');
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale2.toString(), "us");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "us");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str1 = dateTimeZone0.getID();
        int int3 = dateTimeZone0.getStandardOffset(1210L);
        long long6 = dateTimeZone0.adjustOffset(1199059200000L, false);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTC" + "'", str1, "UTC");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1199059200000L + "'", long6 == 1199059200000L);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("US", (double) 86399);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=86399.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = null; // flaky: locale0.getISO3Country();
        java.lang.String str2 = null; // flaky: locale0.getISO3Language();
        java.util.Locale.setDefault(locale0);
        java.util.Locale locale4 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale5 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str6 = locale4.getDisplayCountry(locale5);
        java.lang.String str7 = locale0.getDisplayCountry(locale4);
        java.util.Locale locale8 = java.util.Locale.ROOT;
        java.util.Locale locale9 = locale8.stripExtensions();
        java.util.Locale locale10 = locale9.stripExtensions();
        java.util.Locale.setDefault(locale9);
        java.lang.String str12 = locale0.getDisplayCountry(locale9);
        java.lang.String str13 = locale9.getScript();
        org.junit.Assert.assertNotNull(locale0);
// flaky:         org.junit.Assert.assertEquals(locale0.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zho" + "'", str2, "zho");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u56fd" + "'", str6, "\u4e2d\u56fd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        java.util.Locale locale2 = new java.util.Locale("\u4e2d\u56fd", "35");
        java.lang.String str3 = locale2.toString();
        org.junit.Assert.assertEquals(locale2.toString(), "\u4e2d\u56fd_35");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4e2d\u56fd_35" + "'", str3, "\u4e2d\u56fd_35");
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale locale3 = builder1.build();
        java.util.Locale.Builder builder5 = builder1.setLanguage("ITA");
        java.util.Locale.Builder builder8 = builder5.setExtension('a', "FRA");
        java.util.Locale.Builder builder10 = builder8.setRegion("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder10.setLanguageTag("4");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: 4 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        java.util.Locale locale2 = new java.util.Locale("Thu", "Italia");
        java.util.Locale.setDefault(locale2);
        java.lang.String str4 = locale2.getLanguage();
        org.junit.Assert.assertEquals(locale2.toString(), "thu_ITALIA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "thu" + "'", str4, "thu");
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        int int3 = dateTimeZone1.getStandardOffset(0L);
        long long5 = dateTimeZone1.previousTransition(259200059L);
        java.lang.String str7 = dateTimeZone1.getNameKey((-28080000001L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 259200059L + "'", long5 == 259200059L);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        java.io.IOException iOException4 = new java.io.IOException("");
        java.io.IOException iOException5 = new java.io.IOException("USA", (java.lang.Throwable) iOException4);
        java.io.IOException iOException6 = new java.io.IOException("-1", (java.lang.Throwable) iOException4);
        java.lang.Throwable[] throwableArray7 = iOException4.getSuppressed();
        java.io.IOException iOException8 = new java.io.IOException("DateTimeField[year]", (java.lang.Throwable) iOException4);
        org.junit.Assert.assertNotNull(throwableArray7);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        java.util.Locale locale3 = new java.util.Locale("zh-TW", "\u4e2d\u56fd\u8a9e\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd)", "17783699");
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u4e2d\u56fd\u8a9e\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd)_17783699");
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder1.removeUnicodeLocaleAttribute("12");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 12 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder8 = builder1.addUnicodeLocaleAttribute("jpn");
        java.util.Locale.Builder builder10 = builder8.setRegion("de");
        java.util.Locale.Builder builder11 = builder10.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder11.setVariant("29");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: 29 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        long long4 = dateTimeZone1.adjustOffset(86400002L, false);
        int int6 = dateTimeZone1.getOffset(338855117L);
        long long8 = dateTimeZone1.nextTransition((-622098719913L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 86400002L + "'", long4 == 86400002L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3600000 + "'", int6 == 3600000);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-622098719913L) + "'", long8 == (-622098719913L));
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("minuteOfDay");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=minuteofday");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        java.io.IOException iOException2 = new java.io.IOException("UTC");
        java.io.IOException iOException4 = new java.io.IOException("zho");
        iOException2.addSuppressed((java.lang.Throwable) iOException4);
        java.io.IOException iOException6 = new java.io.IOException("2", (java.lang.Throwable) iOException2);
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) iOException6);
        java.lang.Throwable[] throwableArray8 = iOException6.getSuppressed();
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) iOException6);
        java.lang.String str10 = iOException9.toString();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.io.IOException: java.io.IOException: 2" + "'", str10, "java.io.IOException: java.io.IOException: 2");
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        java.io.IOException iOException1 = new java.io.IOException("jpn");
        java.io.IOException iOException4 = new java.io.IOException("UTC");
        java.io.IOException iOException6 = new java.io.IOException("zho");
        iOException4.addSuppressed((java.lang.Throwable) iOException6);
        java.io.IOException iOException8 = new java.io.IOException("2", (java.lang.Throwable) iOException4);
        iOException1.addSuppressed((java.lang.Throwable) iOException8);
        java.io.IOException iOException10 = new java.io.IOException((java.lang.Throwable) iOException8);
        java.lang.String str11 = iOException8.toString();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.io.IOException: 2" + "'", str11, "java.io.IOException: 2");
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(1);
        boolean boolean2 = dateTimeZone1.isFixed();
        long long4 = dateTimeZone1.nextTransition(604801053L);
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 604801053L + "'", long4 == 604801053L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3600000 + "'", int6 == 3600000);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        java.util.Locale locale3 = new java.util.Locale("86", "cinese", "java.io.IOException: +01:00");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.junit.Assert.assertEquals(locale3.toString(), "86_CINESE_java.io.IOException: +01:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CINESE" + "'", str4, "CINESE");
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((-434));
        java.lang.String str2 = dateTimeZone1.toString();
        int int4 = dateTimeZone1.getOffsetFromLocal((long) 2);
        java.lang.String str5 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-434:00" + "'", str2, "-434:00");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1562400000) + "'", int4 == (-1562400000));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-434:00" + "'", str5, "-434:00");
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.lang.String str4 = dateTimeZone1.getNameKey(291600000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+01:00");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        java.util.Locale locale2 = new java.util.Locale("", "-01:00");
        org.junit.Assert.assertEquals(locale2.toString(), "_-01:00");
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clear();
        java.util.Locale locale8 = builder1.build();
        java.util.Locale locale9 = builder1.build();
        java.util.Locale.Builder builder11 = builder1.addUnicodeLocaleAttribute("4969628");
        java.util.Locale locale12 = builder11.build();
        java.util.Locale.Builder builder14 = builder11.addUnicodeLocaleAttribute("11675");
        java.util.Locale.Builder builder15 = builder11.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder17 = builder15.setLanguage("47");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: 47 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("DateTimeField[yearOfCentury]");
        java.util.Locale locale4 = new java.util.Locale("hi!", "ISOChronology[UTC]");
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale9 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology8, locale9, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket(100L, chronology6, locale9);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.util.Locale locale15 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet16 = locale15.getUnicodeLocaleAttributes();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology18, locale19, (java.lang.Integer) 100);
        java.lang.String str22 = locale15.getDisplayScript(locale19);
        java.lang.String str23 = locale15.getISO3Language();
        dateTimeParserBucket12.saveField(dateTimeFieldType13, "DateTimeField[dayOfYear]", locale15);
        java.lang.String str25 = locale4.getDisplayName(locale15);
        java.lang.String str26 = locale4.getDisplayScript();
        java.lang.String str27 = locale1.getDisplayScript(locale4);
        java.util.Set<java.lang.String> strSet28 = locale1.getUnicodeLocaleAttributes();
        java.lang.String str29 = locale1.getDisplayScript();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals(locale4.toString(), "hi!_ISOCHRONOLOGY[UTC]");
        org.junit.Assert.assertNotNull(locale9);
// flaky:         org.junit.Assert.assertEquals(locale9.toString(), "zh");
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(locale19);
// flaky:         org.junit.Assert.assertEquals(locale19.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "zho" + "'", str23, "zho");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi! (ISOCHRONOLOGY[UTC])" + "'", str25, "hi! (ISOCHRONOLOGY[UTC])");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("it_IT");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=it_it");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone0.getMillisKeepLocal(dateTimeZone1, 97L);
        boolean boolean6 = dateTimeZone1.isStandardOffset((long) 10);
        int int8 = dateTimeZone1.getOffsetFromLocal((long) 'u');
        org.joda.time.Chronology chronology11 = null;
        java.util.Locale locale12 = java.util.Locale.FRENCH;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology11, locale12, (java.lang.Integer) (-1), 0);
        java.util.Locale locale16 = locale12.stripExtensions();
        java.util.Locale.Builder builder17 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder18 = builder17.clear();
        java.util.Locale locale19 = builder18.build();
        java.util.Locale locale20 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str21 = locale19.getDisplayLanguage(locale20);
        java.lang.String str22 = locale20.getDisplayCountry();
        java.lang.String str23 = locale12.getDisplayLanguage(locale20);
        java.lang.String str24 = locale12.getDisplayLanguage();
        java.lang.String str25 = dateTimeZone1.getName((long) 2922789, locale12);
        long long29 = dateTimeZone1.convertLocalToUTC(3084498489600000L, true, (-3L));
        long long32 = dateTimeZone1.adjustOffset(388172822400107L, true);
        java.lang.String str33 = dateTimeZone1.toString();
        java.lang.String str35 = dateTimeZone1.getShortName(3103354799990L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\u4e2d\u56fd" + "'", str22, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u6cd5\u6587" + "'", str23, "\u6cd5\u6587");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\u6cd5\u6587" + "'", str24, "\u6cd5\u6587");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00" + "'", str25, "+00:00");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 3084498489600000L + "'", long29 == 3084498489600000L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 388172822400107L + "'", long32 == 388172822400107L);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "UTC" + "'", str33, "UTC");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:00" + "'", str35, "+00:00");
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale10 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology8, locale10, (java.lang.Integer) 1, 0);
        java.util.Locale locale14 = java.util.Locale.ENGLISH;
        java.lang.String str15 = locale10.getDisplayName(locale14);
        java.lang.String str16 = locale10.getISO3Country();
        java.util.Locale.Builder builder17 = builder6.setLocale(locale10);
        java.util.Locale.Builder builder20 = builder17.setUnicodeLocaleKeyword("35", "");
        java.util.Locale.Builder builder22 = builder20.addUnicodeLocaleAttribute("zho");
        java.util.Locale.Builder builder24 = builder20.removeUnicodeLocaleAttribute("Cina");
        java.util.Locale.Builder builder25 = builder20.clearExtensions();
        java.util.Locale.Builder builder27 = builder20.setLanguage("jpn");
        java.util.Locale.Builder builder28 = builder27.clear();
        java.util.Locale.Builder builder29 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder30 = builder29.clear();
        java.util.Locale.Builder builder32 = builder29.setLanguageTag("year");
        java.util.Locale.Builder builder34 = builder32.setLanguageTag("UTC");
        java.util.Locale locale35 = builder32.build();
        java.util.Locale.Builder builder36 = builder27.setLocale(locale35);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder39 = builder36.setExtension('#', "\u5fb7\u56fd");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: # [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "utc");
        org.junit.Assert.assertNotNull(builder36);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("50");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '50' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguageTag("eng");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale locale8 = builder7.build();
        java.util.Locale locale9 = java.util.Locale.ROOT;
        java.util.Locale.Builder builder10 = builder7.setLocale(locale9);
        java.lang.String str11 = locale9.getISO3Language();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "eng");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("tedesco");
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("java.io.IOException: +02:00");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Germany");
        java.lang.String str2 = languageRange1.getRange();
        double double3 = languageRange1.getWeight();
        java.lang.String str4 = languageRange1.getRange();
        java.lang.String str5 = languageRange1.getRange();
        double double6 = languageRange1.getWeight();
        java.lang.String str7 = languageRange1.getRange();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "germany" + "'", str2, "germany");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "germany" + "'", str4, "germany");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "germany" + "'", str5, "germany");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "germany" + "'", str7, "germany");
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("CHINESE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'CHINESE' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(category0, locale2);
        java.util.Locale locale4 = java.util.Locale.getDefault(category0);
        java.util.Locale locale5 = java.util.Locale.getDefault(category0);
        java.util.Locale locale6 = java.util.Locale.getDefault(category0);
        java.util.Locale.setDefault(locale6);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "de_DE");
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder5 = builder1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder5.setUnicodeLocaleKeyword("82", "\u30a4\u30bf\u30ea\u30a2");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword type: ???? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        int int3 = dateTimeZone1.getStandardOffset((long) (byte) -1);
        java.lang.String str4 = dateTimeZone1.toString();
        java.lang.String str6 = dateTimeZone1.getShortName((long) '#');
        java.util.Locale locale7 = java.util.Locale.GERMAN;
        boolean boolean8 = dateTimeZone1.equals((java.lang.Object) locale7);
        java.util.Set<java.lang.String> strSet9 = locale7.getUnicodeLocaleAttributes();
        java.lang.String str10 = locale7.getISO3Country();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.monthOfYear();
        java.lang.String str1 = dateTimeFieldType0.toString();
        org.joda.time.DurationFieldType durationFieldType2 = dateTimeFieldType0.getRangeDurationType();
        org.joda.time.DurationFieldType durationFieldType3 = dateTimeFieldType0.getRangeDurationType();
        org.joda.time.DurationFieldType durationFieldType4 = dateTimeFieldType0.getDurationType();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "monthOfYear" + "'", str1, "monthOfYear");
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(durationFieldType4);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Germany");
        java.lang.String str2 = languageRange1.getRange();
        java.util.Locale.LanguageRange languageRange4 = new java.util.Locale.LanguageRange("Germany");
        java.lang.String str5 = languageRange4.getRange();
        java.util.Locale.LanguageRange[] languageRangeArray6 = new java.util.Locale.LanguageRange[] { languageRange1, languageRange4 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList7 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7, languageRangeArray6);
        java.util.Locale.LanguageRange languageRange10 = new java.util.Locale.LanguageRange("Germany");
        java.util.Locale.LanguageRange[] languageRangeArray11 = new java.util.Locale.LanguageRange[] { languageRange10 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList12 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList12, languageRangeArray11);
        java.util.Locale.LanguageRange[] languageRangeArray14 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList15 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList15, languageRangeArray14);
        java.util.Locale locale17 = java.util.Locale.getDefault();
        java.lang.String str18 = locale17.getISO3Country();
        java.lang.String str19 = locale17.getISO3Language();
        java.util.Locale locale20 = java.util.Locale.getDefault();
        java.lang.String str21 = locale17.getDisplayVariant(locale20);
        java.util.Locale locale22 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology24 = null;
        java.util.Locale locale25 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology24, locale25, (java.lang.Integer) 100);
        java.util.Locale locale28 = java.util.Locale.getDefault();
        java.lang.String str29 = locale28.getISO3Country();
        java.lang.String str30 = locale28.getISO3Language();
        java.util.Locale locale31 = java.util.Locale.getDefault();
        java.lang.String str32 = locale28.getDisplayVariant(locale31);
        java.util.Locale locale33 = java.util.Locale.getDefault();
        java.lang.String str34 = locale33.getISO3Country();
        java.util.Locale locale35 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray36 = new java.util.Locale[] { locale17, locale22, locale25, locale28, locale33, locale35 };
        java.util.ArrayList<java.util.Locale> localeList37 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList37, localeArray36);
        java.util.Locale locale39 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, (java.util.Collection<java.util.Locale>) localeList37);
        java.util.Locale.FilteringMode filteringMode40 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList41 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, (java.util.Collection<java.util.Locale>) localeList37, filteringMode40);
        java.util.List<java.util.Locale> localeList42 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.util.Locale>) localeList41);
        java.util.Locale.LanguageRange languageRange44 = new java.util.Locale.LanguageRange("Germany");
        java.util.Locale.LanguageRange[] languageRangeArray45 = new java.util.Locale.LanguageRange[] { languageRange44 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList46 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList46, languageRangeArray45);
        java.util.Locale.LanguageRange[] languageRangeArray48 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList49 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList49, languageRangeArray48);
        java.util.Locale locale51 = java.util.Locale.getDefault();
        java.lang.String str52 = locale51.getISO3Country();
        java.lang.String str53 = locale51.getISO3Language();
        java.util.Locale locale54 = java.util.Locale.getDefault();
        java.lang.String str55 = locale51.getDisplayVariant(locale54);
        java.util.Locale locale56 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology58 = null;
        java.util.Locale locale59 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket61 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology58, locale59, (java.lang.Integer) 100);
        java.util.Locale locale62 = java.util.Locale.getDefault();
        java.lang.String str63 = locale62.getISO3Country();
        java.lang.String str64 = locale62.getISO3Language();
        java.util.Locale locale65 = java.util.Locale.getDefault();
        java.lang.String str66 = locale62.getDisplayVariant(locale65);
        java.util.Locale locale67 = java.util.Locale.getDefault();
        java.lang.String str68 = locale67.getISO3Country();
        java.util.Locale locale69 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray70 = new java.util.Locale[] { locale51, locale56, locale59, locale62, locale67, locale69 };
        java.util.ArrayList<java.util.Locale> localeList71 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList71, localeArray70);
        java.util.Locale locale73 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList49, (java.util.Collection<java.util.Locale>) localeList71);
        java.util.Locale.FilteringMode filteringMode74 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList75 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList46, (java.util.Collection<java.util.Locale>) localeList71, filteringMode74);
        java.util.Locale locale76 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.util.Locale>) localeList71);
        java.util.Locale.LanguageRange[] languageRangeArray77 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList78 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList78, languageRangeArray77);
        java.util.Locale locale80 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet81 = locale80.getUnicodeLocaleKeys();
        java.lang.String str82 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList78, (java.util.Collection<java.lang.String>) strSet81);
        java.util.Locale locale83 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet84 = locale83.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList85 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList78, (java.util.Collection<java.lang.String>) strSet84);
        java.util.List<java.lang.String> strList86 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.lang.String>) strSet84);
        java.util.Locale.LanguageRange[] languageRangeArray87 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList88 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList88, languageRangeArray87);
        java.util.Locale locale90 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet91 = locale90.getUnicodeLocaleKeys();
        java.lang.String str92 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList88, (java.util.Collection<java.lang.String>) strSet91);
        java.util.Locale locale93 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet94 = locale93.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode95 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList96 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList88, (java.util.Collection<java.lang.String>) strSet94, filteringMode95);
        java.util.List<java.lang.String> strList97 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.lang.String>) strList96);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "germany" + "'", str2, "germany");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "germany" + "'", str5, "germany");
        org.junit.Assert.assertNotNull(languageRangeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(languageRangeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(languageRangeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "DEU" + "'", str18, "DEU");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "deu" + "'", str19, "deu");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "DEU" + "'", str29, "DEU");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "deu" + "'", str30, "deu");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "DEU" + "'", str34, "DEU");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(locale39);
        org.junit.Assert.assertTrue("'" + filteringMode40 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode40.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList41);
        org.junit.Assert.assertNotNull(localeList42);
        org.junit.Assert.assertNotNull(languageRangeArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(languageRangeArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "DEU" + "'", str52, "DEU");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "deu" + "'", str53, "deu");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "DEU" + "'", str63, "DEU");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "deu" + "'", str64, "deu");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "DEU" + "'", str68, "DEU");
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNull(locale73);
        org.junit.Assert.assertTrue("'" + filteringMode74 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode74.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList75);
        org.junit.Assert.assertNull(locale76);
        org.junit.Assert.assertNotNull(languageRangeArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet81);
        org.junit.Assert.assertNull(str82);
        org.junit.Assert.assertNotNull(locale83);
        org.junit.Assert.assertEquals(locale83.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet84);
        org.junit.Assert.assertNotNull(strList85);
        org.junit.Assert.assertNotNull(strList86);
        org.junit.Assert.assertNotNull(languageRangeArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(locale90);
        org.junit.Assert.assertEquals(locale90.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet91);
        org.junit.Assert.assertNull(str92);
        org.junit.Assert.assertNotNull(locale93);
        org.junit.Assert.assertEquals(locale93.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet94);
        org.junit.Assert.assertTrue("'" + filteringMode95 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode95.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList96);
        org.junit.Assert.assertNotNull(strList97);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        java.util.Locale locale2 = new java.util.Locale("clockhourOfDay", "+00:00:00.001");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleAttributes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale2.getISO3Language();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter language code for clockhourofday");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "clockhourofday_+00:00:00.001");
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.Locale locale6 = new java.util.Locale("weekOfWeekyear", "UTC", "+00:00");
        boolean boolean7 = locale6.hasExtensions();
        org.joda.time.Chronology chronology9 = null;
        java.util.Locale locale10 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology9, locale10, (java.lang.Integer) 100);
        java.lang.String str13 = locale6.getDisplayCountry(locale10);
        java.lang.String str14 = dateTimeZone1.getShortName((long) (short) 1, locale10);
        java.lang.String str15 = locale10.getDisplayVariant();
        java.lang.String str16 = locale10.toLanguageTag();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals(locale6.toString(), "weekofweekyear_UTC_+00:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "de-DE" + "'", str16, "de-DE");
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.lang.String str3 = locale1.getDisplayVariant(locale2);
        java.lang.String str4 = locale2.toLanguageTag();
        java.util.Locale locale5 = locale2.stripExtensions();
        java.lang.String str7 = locale5.getExtension('a');
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "de" + "'", str4, "de");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.nextTransition((-1L));
        java.lang.String str5 = dateTimeZone1.toString();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguage("Italy");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.removeUnicodeLocaleAttribute("\u4e2d\u56fd\u8a9e");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ??? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder0.setScript("356580000");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: 356580000 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getISO3Country();
        java.util.Locale.Builder builder2 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder2.setLanguage("Italy");
        java.util.Locale locale6 = builder5.build();
        java.lang.String str7 = locale0.getDisplayVariant(locale6);
        java.lang.String str8 = locale6.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale0);
// flaky:         org.junit.Assert.assertEquals(locale0.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "italy");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "italy" + "'", str8, "italy");
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 0);
        long long5 = dateTimeZone2.adjustOffset(1L, false);
        int int7 = dateTimeZone2.getStandardOffset((long) (-1));
        java.lang.String str8 = dateTimeZone2.getID();
        int int10 = dateTimeZone2.getStandardOffset((-320400000L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 360000000 + "'", int7 == 360000000);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+100:00" + "'", str8, "+100:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 360000000 + "'", int10 == 360000000);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale10 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology8, locale10, (java.lang.Integer) 1, 0);
        java.util.Locale locale14 = java.util.Locale.ENGLISH;
        java.lang.String str15 = locale10.getDisplayName(locale14);
        java.lang.String str16 = locale10.getISO3Country();
        java.util.Locale.Builder builder17 = builder6.setLocale(locale10);
        java.util.Locale.Builder builder20 = builder17.setUnicodeLocaleKeyword("35", "");
        java.util.Locale.Builder builder23 = builder17.setExtension('a', "22");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder25 = builder17.addUnicodeLocaleAttribute("DateTimeField[clockhourOfHalfday]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: DateTimeField[clockhourOfHalfday] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        java.util.Locale locale3 = new java.util.Locale("java.io.IOException: java.io.IOException: 35", "\u4e00\u6708", "DateTimeField[dayOfMonth]");
        java.lang.String str4 = locale3.getDisplayCountry();
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u4e00\u6708_DateTimeField[dayOfMonth]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u4e00\u6708" + "'", str4, "\u4e00\u6708");
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("-2678388");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        java.lang.Throwable throwable2 = null;
        java.io.IOException iOException3 = new java.io.IOException("UTC", throwable2);
        java.io.IOException iOException4 = new java.io.IOException(throwable2);
        java.io.IOException iOException5 = new java.io.IOException("7", (java.lang.Throwable) iOException4);
        java.io.IOException iOException9 = new java.io.IOException("UTC");
        java.io.IOException iOException11 = new java.io.IOException("zho");
        iOException9.addSuppressed((java.lang.Throwable) iOException11);
        java.io.IOException iOException13 = new java.io.IOException("2", (java.lang.Throwable) iOException9);
        java.io.IOException iOException14 = new java.io.IOException("java.io.IOException: zho", (java.lang.Throwable) iOException9);
        java.io.IOException iOException15 = new java.io.IOException((java.lang.Throwable) iOException9);
        iOException5.addSuppressed((java.lang.Throwable) iOException9);
        java.lang.String str17 = iOException5.toString();
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java.io.IOException: 7" + "'", str17, "java.io.IOException: 7");
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Germany");
        java.lang.String str3 = languageRange2.getRange();
        java.util.Locale.LanguageRange languageRange5 = new java.util.Locale.LanguageRange("Germany");
        java.lang.String str6 = languageRange5.getRange();
        java.util.Locale.LanguageRange[] languageRangeArray7 = new java.util.Locale.LanguageRange[] { languageRange2, languageRange5 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList8 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8, languageRangeArray7);
        java.util.Locale.LanguageRange languageRange11 = new java.util.Locale.LanguageRange("Germany");
        java.util.Locale.LanguageRange[] languageRangeArray12 = new java.util.Locale.LanguageRange[] { languageRange11 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList13 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13, languageRangeArray12);
        java.util.Locale.LanguageRange[] languageRangeArray15 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList16 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16, languageRangeArray15);
        java.util.Locale locale18 = java.util.Locale.getDefault();
        java.lang.String str19 = locale18.getISO3Country();
        java.lang.String str20 = locale18.getISO3Language();
        java.util.Locale locale21 = java.util.Locale.getDefault();
        java.lang.String str22 = locale18.getDisplayVariant(locale21);
        java.util.Locale locale23 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology25 = null;
        java.util.Locale locale26 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket28 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology25, locale26, (java.lang.Integer) 100);
        java.util.Locale locale29 = java.util.Locale.getDefault();
        java.lang.String str30 = locale29.getISO3Country();
        java.lang.String str31 = locale29.getISO3Language();
        java.util.Locale locale32 = java.util.Locale.getDefault();
        java.lang.String str33 = locale29.getDisplayVariant(locale32);
        java.util.Locale locale34 = java.util.Locale.getDefault();
        java.lang.String str35 = locale34.getISO3Country();
        java.util.Locale locale36 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray37 = new java.util.Locale[] { locale18, locale23, locale26, locale29, locale34, locale36 };
        java.util.ArrayList<java.util.Locale> localeList38 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList38, localeArray37);
        java.util.Locale locale40 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, (java.util.Collection<java.util.Locale>) localeList38);
        java.util.Locale.FilteringMode filteringMode41 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList42 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, (java.util.Collection<java.util.Locale>) localeList38, filteringMode41);
        java.util.List<java.util.Locale> localeList43 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.util.Locale>) localeList42);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap44 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList45 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, strMap44);
        java.util.Locale.LanguageRange[] languageRangeArray46 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList47 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList47, languageRangeArray46);
        org.joda.time.Chronology chronology50 = null;
        java.util.Locale locale51 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket53 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology50, locale51, (java.lang.Integer) 100);
        java.util.Locale[] localeArray54 = new java.util.Locale[] { locale51 };
        java.util.ArrayList<java.util.Locale> localeList55 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList55, localeArray54);
        java.util.Locale locale57 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList47, (java.util.Collection<java.util.Locale>) localeList55);
        java.util.Locale.Builder builder58 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder59 = builder58.clear();
        java.util.Locale locale60 = builder59.build();
        java.util.Locale locale61 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str62 = locale60.getDisplayLanguage(locale61);
        java.util.Set<java.lang.String> strSet63 = locale61.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList64 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList47, (java.util.Collection<java.lang.String>) strSet63);
        java.util.Locale.LanguageRange[] languageRangeArray65 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList66 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList66, languageRangeArray65);
        java.util.Locale locale68 = java.util.Locale.getDefault();
        java.lang.String str69 = locale68.getISO3Country();
        java.lang.String str70 = locale68.getISO3Language();
        java.util.Locale locale71 = java.util.Locale.getDefault();
        java.lang.String str72 = locale68.getDisplayVariant(locale71);
        java.util.Locale locale73 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology75 = null;
        java.util.Locale locale76 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket78 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology75, locale76, (java.lang.Integer) 100);
        java.util.Locale locale79 = java.util.Locale.getDefault();
        java.lang.String str80 = locale79.getISO3Country();
        java.lang.String str81 = locale79.getISO3Language();
        java.util.Locale locale82 = java.util.Locale.getDefault();
        java.lang.String str83 = locale79.getDisplayVariant(locale82);
        java.util.Locale locale84 = java.util.Locale.getDefault();
        java.lang.String str85 = locale84.getISO3Country();
        java.util.Locale locale86 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray87 = new java.util.Locale[] { locale68, locale73, locale76, locale79, locale84, locale86 };
        java.util.ArrayList<java.util.Locale> localeList88 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList88, localeArray87);
        java.util.Locale locale90 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList66, (java.util.Collection<java.util.Locale>) localeList88);
        java.util.Locale locale91 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList47, (java.util.Collection<java.util.Locale>) localeList88);
        java.util.List<java.util.Locale> localeList92 = java.util.Locale.filter(languageRangeList45, (java.util.Collection<java.util.Locale>) localeList88);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale93 = java.util.Locale.lookup(languageRangeList0, (java.util.Collection<java.util.Locale>) localeList92);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "germany" + "'", str3, "germany");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "germany" + "'", str6, "germany");
        org.junit.Assert.assertNotNull(languageRangeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(languageRangeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(languageRangeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(locale18);
// flaky:         org.junit.Assert.assertEquals(locale18.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "zho" + "'", str20, "zho");
        org.junit.Assert.assertNotNull(locale21);
// flaky:         org.junit.Assert.assertEquals(locale21.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(locale23);
// flaky:         org.junit.Assert.assertEquals(locale23.toString(), "zh");
        org.junit.Assert.assertNotNull(locale26);
// flaky:         org.junit.Assert.assertEquals(locale26.toString(), "zh");
        org.junit.Assert.assertNotNull(locale29);
// flaky:         org.junit.Assert.assertEquals(locale29.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "zho" + "'", str31, "zho");
        org.junit.Assert.assertNotNull(locale32);
// flaky:         org.junit.Assert.assertEquals(locale32.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(locale34);
// flaky:         org.junit.Assert.assertEquals(locale34.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(locale40);
        org.junit.Assert.assertTrue("'" + filteringMode41 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode41.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList42);
        org.junit.Assert.assertNotNull(localeList43);
        org.junit.Assert.assertNotNull(languageRangeList45);
        org.junit.Assert.assertNotNull(languageRangeArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(locale51);
// flaky:         org.junit.Assert.assertEquals(locale51.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNull(locale57);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(strSet63);
        org.junit.Assert.assertNotNull(strList64);
        org.junit.Assert.assertNotNull(languageRangeArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(locale68);
// flaky:         org.junit.Assert.assertEquals(locale68.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
// flaky:         org.junit.Assert.assertEquals("'" + str70 + "' != '" + "zho" + "'", str70, "zho");
        org.junit.Assert.assertNotNull(locale71);
// flaky:         org.junit.Assert.assertEquals(locale71.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(locale73);
// flaky:         org.junit.Assert.assertEquals(locale73.toString(), "zh");
        org.junit.Assert.assertNotNull(locale76);
// flaky:         org.junit.Assert.assertEquals(locale76.toString(), "zh");
        org.junit.Assert.assertNotNull(locale79);
// flaky:         org.junit.Assert.assertEquals(locale79.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
// flaky:         org.junit.Assert.assertEquals("'" + str81 + "' != '" + "zho" + "'", str81, "zho");
        org.junit.Assert.assertNotNull(locale82);
// flaky:         org.junit.Assert.assertEquals(locale82.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertNotNull(locale84);
// flaky:         org.junit.Assert.assertEquals(locale84.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertNotNull(locale86);
        org.junit.Assert.assertEquals(locale86.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNull(locale90);
        org.junit.Assert.assertNull(locale91);
        org.junit.Assert.assertNotNull(localeList92);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "100");
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale locale6 = builder5.build();
        java.util.Locale.Builder builder8 = builder5.addUnicodeLocaleAttribute("Oct");
        java.util.Locale.Builder builder9 = builder5.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder5.removeUnicodeLocaleAttribute("fr-FR");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: fr-FR [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        java.io.IOException iOException1 = new java.io.IOException("");
        java.lang.Throwable throwable5 = null;
        java.io.IOException iOException6 = new java.io.IOException("UTC", throwable5);
        java.io.IOException iOException7 = new java.io.IOException(throwable5);
        java.io.IOException iOException8 = new java.io.IOException("weekyear", (java.lang.Throwable) iOException7);
        java.lang.Throwable[] throwableArray9 = iOException8.getSuppressed();
        java.io.IOException iOException10 = new java.io.IOException("cinese", (java.lang.Throwable) iOException8);
        iOException1.addSuppressed((java.lang.Throwable) iOException8);
        java.lang.Throwable throwable15 = null;
        java.io.IOException iOException16 = new java.io.IOException("UTC", throwable15);
        java.io.IOException iOException17 = new java.io.IOException(throwable15);
        java.io.IOException iOException18 = new java.io.IOException("weekyear", (java.lang.Throwable) iOException17);
        java.lang.Throwable[] throwableArray19 = iOException18.getSuppressed();
        java.io.IOException iOException20 = new java.io.IOException("cinese", (java.lang.Throwable) iOException18);
        java.io.IOException iOException21 = new java.io.IOException((java.lang.Throwable) iOException18);
        iOException8.addSuppressed((java.lang.Throwable) iOException21);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray19);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguageTag("eng");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder8 = builder1.clear();
        java.util.Locale.Builder builder10 = builder1.setLanguageTag("CHN");
        java.util.Locale.Builder builder11 = builder1.clearExtensions();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("\u661f\u671f\u516d", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=???");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        java.util.Locale locale3 = new java.util.Locale("Wednesday", "\u4e2d\u6587\u4e2d\u56fd)", "+00:00:00.032");
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u4e2d\u6587\u4e2d\u56fd)_+00:00:00.032");
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguageTag("eng");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale locale8 = builder7.build();
        java.util.Locale.Builder builder9 = builder7.clear();
        java.util.Locale.Builder builder11 = builder9.addUnicodeLocaleAttribute("era");
        java.util.Locale locale12 = builder11.build();
        java.util.Locale locale13 = builder11.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder11.setScript("7");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: 7 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "eng");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("4492738", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=4492738");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        java.util.Locale locale3 = new java.util.Locale("10 (JPN,us)", "22", "2922789");
        java.lang.String str4 = locale3.getDisplayVariant();
        java.lang.Class<?> wildcardClass5 = locale3.getClass();
        org.junit.Assert.assertEquals(locale3.toString(), "10 (jpn,us)_22_2922789");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2922789" + "'", str4, "2922789");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }
}
