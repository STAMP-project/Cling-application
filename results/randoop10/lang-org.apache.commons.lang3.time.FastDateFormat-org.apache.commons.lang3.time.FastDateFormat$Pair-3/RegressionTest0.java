import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test00001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00001");
        int int0 = org.apache.commons.lang3.time.FastDateFormat.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        int int0 = java.util.Calendar.SUNDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        int int0 = java.util.Calendar.NARROW_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32772 + "'", int0 == 32772);
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        int int0 = java.util.Calendar.LONG_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32770 + "'", int0 == 32770);
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        int int0 = java.util.Calendar.DST_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("hi!", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        java.util.Locale locale3 = new java.util.Locale("", "hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale3.getISO3Country();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter country code for HI!");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "_HI!");
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        java.util.Date date0 = new java.util.Date();
        java.lang.String[] strArray1 = java.util.Locale.getISOLanguages();
        boolean boolean2 = date0.equals((java.lang.Object) strArray1);
// flaky:         org.junit.Assert.assertEquals(date0.toString(), "Mon Feb 21 14:45:49 UTC 2022");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        int int0 = java.util.Calendar.DATE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        java.util.Locale locale3 = new java.util.Locale("", "hi!", "");
        java.lang.Class<?> wildcardClass4 = locale3.getClass();
        org.junit.Assert.assertEquals(locale3.toString(), "_HI!");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        java.util.Locale.Category category0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = java.util.Locale.getDefault(category0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.lang.Object obj1 = timeZone0.clone();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        int int0 = java.util.Calendar.UNDECIMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) ' ', timeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        java.util.Date date0 = new java.util.Date();
        int int1 = date0.getSeconds();
        long long2 = date0.getTime();
        java.util.Date date3 = new java.util.Date();
        int int4 = date3.getSeconds();
        long long5 = date3.getTime();
        int int6 = date0.compareTo(date3);
// flaky:         org.junit.Assert.assertEquals(date0.toString(), "Mon Feb 21 14:45:50 UTC 2022");
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 50 + "'", int1 == 50);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1645454750011L + "'", long2 == 1645454750011L);
// flaky:         org.junit.Assert.assertEquals(date3.toString(), "Mon Feb 21 14:45:50 UTC 2022");
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 50 + "'", int4 == 50);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1645454750011L + "'", long5 == 1645454750011L);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        double double0 = java.util.Locale.LanguageRange.MAX_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1.0d + "'", double0 == 1.0d);
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        int int0 = java.util.Calendar.JUNE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.Date date1 = new java.util.Date();
        int int2 = date1.getSeconds();
        long long3 = date1.getTime();
        boolean boolean4 = timeZone0.inDaylightTime(date1);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
// flaky:         org.junit.Assert.assertEquals(date1.toString(), "Mon Feb 21 14:45:50 UTC 2022");
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 50 + "'", int2 == 50);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1645454750197L + "'", long3 == 1645454750197L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        java.util.Date date0 = new java.util.Date();
        int int1 = date0.getTimezoneOffset();
        date0.setMonth(0);
        java.lang.String str4 = date0.toString();
// flaky:         org.junit.Assert.assertEquals(date0.toString(), "Fri Jan 21 14:45:50 UTC 2022");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Fri Jan 21 14:45:50 UTC 2022" + "'", str4, "Fri Jan 21 14:45:50 UTC 2022");
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        int int0 = java.util.Calendar.FEBRUARY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        int int0 = java.util.Calendar.DAY_OF_YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = fastDateFormat2.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h:mm:ss a z" + "'", str3, "h:mm:ss a z");
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        int int0 = java.util.Calendar.DAY_OF_WEEK_IN_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) -1, timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        java.util.Date date0 = new java.util.Date();
        int int1 = date0.getSeconds();
        long long2 = date0.getTime();
        date0.setTime((long) (byte) 0);
        java.util.Locale.FilteringMode filteringMode5 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        boolean boolean6 = date0.equals((java.lang.Object) filteringMode5);
        org.junit.Assert.assertEquals(date0.toString(), "Thu Jan 01 00:00:00 UTC 1970");
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 50 + "'", int1 == 50);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1645454750536L + "'", long2 == 1645454750536L);
        org.junit.Assert.assertTrue("'" + filteringMode5 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode5.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = fastDateFormat2.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat2);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        int int0 = java.util.Calendar.WEEK_OF_YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("Fri Jan 21 14:45:50 UTC 2022");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=frijan2114:45:50utc2022");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone1);
        java.util.Date date5 = new java.util.Date();
        int int6 = date5.getTimezoneOffset();
        date5.setMonth(0);
        boolean boolean9 = timeZone0.inDaylightTime(date5);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Fri Jan 21 14:45:50 UTC 2022");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        int int0 = org.apache.commons.lang3.time.FastDateFormat.LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        int int0 = org.apache.commons.lang3.time.FastDateFormat.MEDIUM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        int int0 = java.util.Calendar.MAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        int int0 = java.util.Calendar.SECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 13 + "'", int0 == 13);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        int int0 = java.util.Calendar.TUESDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        boolean boolean4 = timeZone2.hasSameRules(timeZone3);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, (int) '#', timeZone2, locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de");
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        int int0 = java.util.Calendar.AUGUST;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        int int0 = java.util.Calendar.HOUR_OF_DAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        int int0 = java.util.Calendar.AM_PM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        int int0 = java.util.Calendar.APRIL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        int int0 = java.util.Calendar.MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder3 = builder0.setWeekDefinition((int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        java.util.Locale locale4 = java.util.Locale.CHINESE;
        java.lang.String str5 = locale4.getLanguage();
        boolean boolean6 = locale4.hasExtensions();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getInstance("hi!", timeZone1, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh" + "'", str5, "zh");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        boolean boolean5 = timeZone3.hasSameRules(timeZone4);
        boolean boolean6 = timeZone2.hasSameRules(timeZone3);
        java.util.Locale locale10 = new java.util.Locale("", "hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(13, 2, timeZone3, locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 13");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals(locale10.toString(), "_HI!");
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        int int0 = java.util.Calendar.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone1);
        boolean boolean5 = timeZone1.useDaylightTime();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        int int0 = java.util.TimeZone.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone1);
        java.util.Date date3 = new java.util.Date();
        int int4 = date3.getTimezoneOffset();
        date3.setMonth(0);
        java.lang.StringBuffer stringBuffer7 = null;
        java.text.FieldPosition fieldPosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer9 = fastDateFormat2.format((java.lang.Object) 0, stringBuffer7, fieldPosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat2);
// flaky:         org.junit.Assert.assertEquals(date3.toString(), "Fri Jan 21 14:45:51 UTC 2022");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone1);
        java.lang.String str4 = fastDateFormat2.format((long) '#');
        java.lang.StringBuffer stringBuffer6 = null;
        java.text.FieldPosition fieldPosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer8 = fastDateFormat2.format((java.lang.Object) 0.0d, stringBuffer6, fieldPosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "12:00:00 AM UTC" + "'", str4, "12:00:00 AM UTC");
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        int int0 = java.util.Calendar.JANUARY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        char char0 = java.util.Locale.PRIVATE_USE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'x' + "'", char0 == 'x');
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        boolean boolean2 = timeZone0.hasSameRules(timeZone1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = timeZone1.getDisplayName(false, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        java.lang.String[] strArray0 = java.util.TimeZone.getAvailableIDs();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        java.time.ZoneId zoneId0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone(zoneId0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        boolean boolean5 = locale4.hasExtensions();
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.util.Locale locale7 = java.util.Locale.CHINESE;
        java.lang.String str8 = locale7.getLanguage();
        java.util.Locale[] localeArray9 = new java.util.Locale[] { locale3, locale4, locale6, locale7 };
        java.util.ArrayList<java.util.Locale> localeList10 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList10, localeArray9);
        java.util.Locale.FilteringMode filteringMode12 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList13 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList10, filteringMode12);
        java.util.function.UnaryOperator<java.util.Locale> localeUnaryOperator14 = null;
        // The following exception was thrown during execution in test generation
        try {
            localeList13.replaceAll(localeUnaryOperator14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh" + "'", str8, "zh");
        org.junit.Assert.assertNotNull(localeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + filteringMode12 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode12.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList13);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        java.util.Locale locale1 = java.util.Locale.CHINESE;
        java.lang.String str2 = locale1.getLanguage();
        boolean boolean3 = locale1.hasExtensions();
        java.lang.String str4 = locale1.getDisplayCountry();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(8, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh" + "'", str2, "zh");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        int int0 = java.util.Calendar.THURSDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(122);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 122");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone1);
        boolean boolean5 = timeZone1.observesDaylightTime();
        java.util.Locale locale8 = java.util.Locale.FRANCE;
        java.lang.String str9 = locale8.getVariant();
        java.lang.String str10 = timeZone1.getDisplayName(false, (int) (short) 1, locale8);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Temps universel coordonn\351" + "'", str10, "Temps universel coordonn\351");
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setWeekDate(5, (int) (byte) -1, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder6 = builder4.setInstant(1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        int int0 = java.util.TimeZone.LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone1);
        java.lang.String str4 = fastDateFormat2.format((long) '#');
        boolean boolean5 = fastDateFormat2.getTimeZoneOverridesCalendar();
        java.lang.String str7 = fastDateFormat2.format(100L);
        java.util.Calendar calendar8 = null;
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer10 = fastDateFormat2.format(calendar8, stringBuffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "12:00:00 AM UTC" + "'", str4, "12:00:00 AM UTC");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "12:00:00 AM UTC" + "'", str7, "12:00:00 AM UTC");
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) 'a', timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        int int0 = java.util.Calendar.WEDNESDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        java.util.Date date0 = new java.util.Date();
        int int1 = date0.getTimezoneOffset();
        java.util.Date date2 = new java.util.Date();
        int int3 = date2.getDay();
        int int4 = date2.getTimezoneOffset();
        boolean boolean5 = date0.equals((java.lang.Object) date2);
// flaky:         org.junit.Assert.assertEquals(date0.toString(), "Mon Feb 21 14:45:52 UTC 2022");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Mon Feb 21 14:45:52 UTC 2022");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        boolean boolean5 = locale4.hasExtensions();
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.util.Locale locale7 = java.util.Locale.CHINESE;
        java.lang.String str8 = locale7.getLanguage();
        java.util.Locale[] localeArray9 = new java.util.Locale[] { locale3, locale4, locale6, locale7 };
        java.util.ArrayList<java.util.Locale> localeList10 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList10, localeArray9);
        java.util.Locale.FilteringMode filteringMode12 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList13 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList10, filteringMode12);
        java.util.Spliterator<java.util.Locale> localeSpliterator14 = localeList13.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale16 = localeList13.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh" + "'", str8, "zh");
        org.junit.Assert.assertNotNull(localeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + filteringMode12 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode12.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList13);
        org.junit.Assert.assertNotNull(localeSpliterator14);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.lang.String str1 = locale0.getLanguage();
        java.lang.Object obj2 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh" + "'", str1, "zh");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "zh");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "zh");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "zh");
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        java.util.Date date0 = new java.util.Date();
        java.lang.String str1 = date0.toGMTString();
        int int2 = date0.getYear();
        java.lang.String str3 = date0.toString();
// flaky:         org.junit.Assert.assertEquals(date0.toString(), "Mon Feb 21 14:45:53 UTC 2022");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "21 Feb 2022 14:45:53 GMT" + "'", str1, "21 Feb 2022 14:45:53 GMT");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 122 + "'", int2 == 122);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Mon Feb 21 14:45:53 UTC 2022" + "'", str3, "Mon Feb 21 14:45:53 UTC 2022");
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("21 Feb 2022 14:45:53 GMT");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: e");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone1);
        boolean boolean5 = timeZone1.observesDaylightTime();
        timeZone1.setRawOffset(52);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = timeZone1.getDisplayName(true, 32770);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 32770");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone1);
        java.lang.String str4 = fastDateFormat2.format((long) '#');
        java.util.Calendar calendar5 = null;
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer7 = fastDateFormat2.format(calendar5, stringBuffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "12:00:00 AM UTC" + "'", str4, "12:00:00 AM UTC");
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(122, 32772);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 32772");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        int int0 = java.util.Calendar.DAY_OF_WEEK;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        java.util.Date date0 = new java.util.Date();
        int int1 = date0.getTimezoneOffset();
        int int2 = date0.getSeconds();
        java.lang.String str3 = date0.toString();
// flaky:         org.junit.Assert.assertEquals(date0.toString(), "Mon Feb 21 14:45:53 UTC 2022");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 53 + "'", int2 == 53);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Mon Feb 21 14:45:53 UTC 2022" + "'", str3, "Mon Feb 21 14:45:53 UTC 2022");
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        boolean boolean5 = locale4.hasExtensions();
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.util.Locale locale7 = java.util.Locale.CHINESE;
        java.lang.String str8 = locale7.getLanguage();
        java.util.Locale[] localeArray9 = new java.util.Locale[] { locale3, locale4, locale6, locale7 };
        java.util.ArrayList<java.util.Locale> localeList10 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList10, localeArray9);
        java.util.Locale.FilteringMode filteringMode12 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList13 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList10, filteringMode12);
        java.util.Spliterator<java.util.Locale> localeSpliterator14 = localeList13.spliterator();
        localeList13.clear();
        java.util.Locale locale17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale18 = localeList13.set((int) (byte) 0, locale17);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh" + "'", str8, "zh");
        org.junit.Assert.assertNotNull(localeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + filteringMode12 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode12.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList13);
        org.junit.Assert.assertNotNull(localeSpliterator14);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.setScript("zho");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: zho [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.setLanguage("FastDateFormat[]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: FastDateFormat[] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        java.text.ParsePosition parsePosition1 = new java.text.ParsePosition(16);
        int int2 = parsePosition1.getErrorIndex();
        int int3 = parsePosition1.getErrorIndex();
        java.lang.Class<?> wildcardClass4 = parsePosition1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        boolean boolean5 = locale4.hasExtensions();
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.util.Locale locale7 = java.util.Locale.CHINESE;
        java.lang.String str8 = locale7.getLanguage();
        java.util.Locale[] localeArray9 = new java.util.Locale[] { locale3, locale4, locale6, locale7 };
        java.util.ArrayList<java.util.Locale> localeList10 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList10, localeArray9);
        java.util.Locale.FilteringMode filteringMode12 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList13 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList10, filteringMode12);
        java.util.Spliterator<java.util.Locale> localeSpliterator14 = localeList13.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale16 = localeList13.remove((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh" + "'", str8, "zh");
        org.junit.Assert.assertNotNull(localeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + filteringMode12 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode12.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList13);
        org.junit.Assert.assertNotNull(localeSpliterator14);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        boolean boolean4 = timeZone2.hasSameRules(timeZone3);
        java.util.Locale locale5 = java.util.Locale.CHINESE;
        java.lang.String str6 = locale5.getLanguage();
        boolean boolean7 = locale5.hasExtensions();
        java.util.Locale locale8 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str9 = locale5.getDisplayLanguage(locale8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(2, (int) '#', timeZone3, locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh" + "'", str6, "zh");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u4e2d\u6587" + "'", str9, "\u4e2d\u6587");
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.addUnicodeLocaleAttribute("Temps universel coordonn\351");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: Temps universel coordonne? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) -1, timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        int int0 = java.util.Calendar.NOVEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.addUnicodeLocaleAttribute("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        java.time.Instant instant0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = java.util.Date.from(instant0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        java.util.Locale locale2 = java.util.Locale.US;
        java.lang.String str3 = locale2.getDisplayVariant();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) -1, (int) (short) -1, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone1);
        java.lang.String str5 = timeZone0.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coordinated Universal Time" + "'", str5, "Coordinated Universal Time");
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        boolean boolean5 = timeZone3.hasSameRules(timeZone4);
        boolean boolean6 = timeZone2.hasSameRules(timeZone3);
        boolean boolean7 = timeZone3.observesDaylightTime();
        timeZone3.setRawOffset(52);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(54, 122, timeZone3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 122");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("Mon Feb 21 14:45:53 UTC 2022");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: Mon Feb 21 14:45:53 UTC 2022 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        boolean boolean5 = locale4.hasExtensions();
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.util.Locale locale7 = java.util.Locale.CHINESE;
        java.lang.String str8 = locale7.getLanguage();
        java.util.Locale[] localeArray9 = new java.util.Locale[] { locale3, locale4, locale6, locale7 };
        java.util.ArrayList<java.util.Locale> localeList10 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList10, localeArray9);
        java.util.Locale.FilteringMode filteringMode12 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList13 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList10, filteringMode12);
        java.util.Spliterator<java.util.Locale> localeSpliterator14 = localeList13.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale16 = localeList13.remove(32770);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32770, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh" + "'", str8, "zh");
        org.junit.Assert.assertNotNull(localeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + filteringMode12 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode12.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList13);
        org.junit.Assert.assertNotNull(localeSpliterator14);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        java.util.Date date0 = new java.util.Date();
        int int1 = date0.getSeconds();
        long long2 = date0.getTime();
        java.lang.Object obj3 = date0.clone();
// flaky:         org.junit.Assert.assertEquals(date0.toString(), "Mon Feb 21 14:45:54 UTC 2022");
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 54 + "'", int1 == 54);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1645454754693L + "'", long2 == 1645454754693L);
        org.junit.Assert.assertNotNull(obj3);
// flaky:         org.junit.Assert.assertEquals(obj3.toString(), "Mon Feb 21 14:45:54 UTC 2022");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "Mon Feb 21 14:45:54 UTC 2022");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "Mon Feb 21 14:45:54 UTC 2022");
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setWeekDate(5, (int) (byte) -1, 1);
        java.util.Calendar.Builder builder6 = builder4.setLenient(true);
        java.util.Calendar.Builder builder10 = builder6.setTimeOfDay(122, 11, 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder12 = builder10.setCalendarType("zho");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown calendar type: zho");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        int int0 = java.util.Calendar.SEPTEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.util.Date date4 = new java.util.Date();
        int int5 = date4.getSeconds();
        java.lang.String str6 = fastDateFormat2.format(date4);
        java.text.ParsePosition parsePosition9 = new java.text.ParsePosition(16);
        int int10 = parsePosition9.getErrorIndex();
        java.lang.Object obj11 = fastDateFormat2.parseObject("Temps universel coordonn\351", parsePosition9);
        java.util.Locale locale12 = java.util.Locale.ITALIAN;
        java.lang.StringBuffer stringBuffer13 = null;
        java.text.Format.Field field14 = null;
        java.text.FieldPosition fieldPosition15 = new java.text.FieldPosition(field14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer16 = fastDateFormat2.format((java.lang.Object) locale12, stringBuffer13, fieldPosition15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.util.Locale");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h:mm:ss a z" + "'", str3, "h:mm:ss a z");
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Mon Feb 21 14:45:54 UTC 2022");
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 54 + "'", int5 == 54);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2:45:54 PM UTC" + "'", str6, "2:45:54 PM UTC");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "it");
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        double double0 = java.util.Locale.LanguageRange.MIN_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.0d + "'", double0 == 0.0d);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) 'x', timeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 120");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        java.util.Date date0 = new java.util.Date();
        int int1 = date0.getTimezoneOffset();
        java.util.Date date7 = new java.util.Date(3, (int) (short) 0, 6, 0, (int) (short) 1);
        java.util.Date date8 = new java.util.Date();
        int int9 = date8.getTimezoneOffset();
        long long10 = date8.getTime();
        boolean boolean11 = date7.after(date8);
        boolean boolean12 = date0.before(date8);
        java.lang.String str13 = date8.toString();
// flaky:         org.junit.Assert.assertEquals(date0.toString(), "Mon Feb 21 14:45:54 UTC 2022");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals(date7.toString(), "Tue Jan 06 00:01:00 UTC 1903");
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Feb 21 14:45:54 UTC 2022");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1645454754924L + "'", long10 == 1645454754924L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Mon Feb 21 14:45:54 UTC 2022" + "'", str13, "Mon Feb 21 14:45:54 UTC 2022");
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(8, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = locale0.getExtension('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        java.util.Locale locale5 = new java.util.Locale("", "hi!", "");
        java.lang.String str6 = locale5.getDisplayLanguage();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(10, (int) (short) 10, locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale5.toString(), "_HI!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        int int0 = java.util.Calendar.SATURDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        java.util.Date date0 = new java.util.Date();
        int int1 = date0.getSeconds();
        long long2 = date0.getTime();
        date0.setTime((long) (byte) 0);
        java.time.Instant instant5 = date0.toInstant();
        java.util.Locale.LanguageRange[] languageRangeArray6 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList7 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7, languageRangeArray6);
        java.util.Locale locale9 = java.util.Locale.GERMAN;
        java.util.Locale locale10 = java.util.Locale.FRANCE;
        boolean boolean11 = locale10.hasExtensions();
        java.util.Locale locale12 = java.util.Locale.FRANCE;
        java.util.Locale locale13 = java.util.Locale.CHINESE;
        java.lang.String str14 = locale13.getLanguage();
        java.util.Locale[] localeArray15 = new java.util.Locale[] { locale9, locale10, locale12, locale13 };
        java.util.ArrayList<java.util.Locale> localeList16 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList16, localeArray15);
        java.util.Locale.FilteringMode filteringMode18 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList19 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.util.Locale>) localeList16, filteringMode18);
        boolean boolean20 = date0.equals((java.lang.Object) localeList16);
        org.junit.Assert.assertEquals(date0.toString(), "Thu Jan 01 00:00:00 UTC 1970");
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 55 + "'", int1 == 55);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1645454755037L + "'", long2 == 1645454755037L);
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertNotNull(languageRangeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "de");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "zh" + "'", str14, "zh");
        org.junit.Assert.assertNotNull(localeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + filteringMode18 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode18.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        boolean boolean5 = locale4.hasExtensions();
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.util.Locale locale7 = java.util.Locale.CHINESE;
        java.lang.String str8 = locale7.getLanguage();
        java.util.Locale[] localeArray9 = new java.util.Locale[] { locale3, locale4, locale6, locale7 };
        java.util.ArrayList<java.util.Locale> localeList10 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList10, localeArray9);
        java.util.Locale.FilteringMode filteringMode12 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList13 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList10, filteringMode12);
        java.util.Spliterator<java.util.Locale> localeSpliterator14 = localeList13.spliterator();
        java.util.Iterator<java.util.Locale> localeItor15 = localeList13.iterator();
        java.lang.String[] strArray16 = java.util.Locale.getISOCountries();
        java.lang.CharSequence[] charSequenceArray17 = localeList13.toArray((java.lang.CharSequence[]) strArray16);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale19 = localeList13.get(9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 9, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh" + "'", str8, "zh");
        org.junit.Assert.assertNotNull(localeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + filteringMode12 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode12.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList13);
        org.junit.Assert.assertNotNull(localeSpliterator14);
        org.junit.Assert.assertNotNull(localeItor15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(charSequenceArray17);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setWeekDate(5, (int) (byte) -1, 1);
        java.util.Calendar.Builder builder6 = builder4.setLenient(true);
        java.util.Calendar.Builder builder10 = builder6.setTimeOfDay(122, 11, 10);
        java.util.Calendar.Builder builder14 = builder10.setWeekDate(100, 9, 2);
        java.util.TimeZone timeZone15 = java.util.TimeZone.getDefault();
        java.util.Calendar.Builder builder16 = builder14.setTimeZone(timeZone15);
        int int17 = timeZone15.getDSTSavings();
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        int int0 = java.util.Calendar.NARROW_FORMAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 2);
        java.util.Locale locale6 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale7 = locale6.stripExtensions();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone0, locale7);
        int int9 = calendar8.getWeekYear();
        java.util.TimeZone timeZone10 = java.util.TimeZone.getDefault();
        int int12 = timeZone10.getOffset((long) 2);
        java.util.Locale locale16 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale17 = locale16.stripExtensions();
        java.util.Calendar calendar18 = java.util.Calendar.getInstance(timeZone10, locale17);
        int int20 = calendar18.getLeastMaximum(4);
        int int21 = calendar8.compareTo(calendar18);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals(locale6.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=1645454755461,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=45,SECOND=55,MILLISECOND=461,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2022 + "'", int9 == 2022);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals(locale16.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar18);
// flaky:         org.junit.Assert.assertEquals(calendar18.toString(), "java.util.GregorianCalendar[time=1645454755461,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=45,SECOND=55,MILLISECOND=461,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        int int0 = java.util.Calendar.FIELD_COUNT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 17 + "'", int0 == 17);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 2);
        java.util.Locale locale6 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale7 = locale6.stripExtensions();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone0, locale7);
        int int9 = calendar8.getWeekYear();
        java.lang.Object obj10 = calendar8.clone();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals(locale6.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=1645454755646,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=45,SECOND=55,MILLISECOND=646,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2022 + "'", int9 == 2022);
        org.junit.Assert.assertNotNull(obj10);
// flaky:         org.junit.Assert.assertEquals(obj10.toString(), "java.util.GregorianCalendar[time=1645454755646,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=45,SECOND=55,MILLISECOND=646,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "java.util.GregorianCalendar[time=1645454755646,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=45,SECOND=55,MILLISECOND=646,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "java.util.GregorianCalendar[time=1645454755646,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=45,SECOND=55,MILLISECOND=646,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.util.Date date4 = new java.util.Date();
        int int5 = date4.getSeconds();
        java.lang.String str6 = fastDateFormat2.format(date4);
        java.text.ParsePosition parsePosition9 = new java.text.ParsePosition(16);
        int int10 = parsePosition9.getErrorIndex();
        java.lang.Object obj11 = fastDateFormat2.parseObject("Temps universel coordonn\351", parsePosition9);
        java.util.TimeZone timeZone12 = java.util.TimeZone.getDefault();
        int int14 = timeZone12.getOffset((long) 2);
        java.util.Locale locale18 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale19 = locale18.stripExtensions();
        java.util.Calendar calendar20 = java.util.Calendar.getInstance(timeZone12, locale19);
        java.lang.StringBuffer stringBuffer21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer22 = fastDateFormat2.format(calendar20, stringBuffer21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h:mm:ss a z" + "'", str3, "h:mm:ss a z");
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Mon Feb 21 14:45:55 UTC 2022");
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 55 + "'", int5 == 55);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2:45:55 PM UTC" + "'", str6, "2:45:55 PM UTC");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals(locale18.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar20);
// flaky:         org.junit.Assert.assertEquals(calendar20.toString(), "java.util.GregorianCalendar[time=1645454755852,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=45,SECOND=55,MILLISECOND=852,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "France");
        java.util.Locale.Builder builder5 = builder0.removeUnicodeLocaleAttribute("GMT");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.setVariant("java.text.ParsePosition[index=0,errorIndex=0]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: java.text.ParsePosition[index=0,errorIndex=0] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 2);
        java.util.Locale locale6 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale7 = locale6.stripExtensions();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone0, locale7);
        calendar8.set(122, 52, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            calendar8.roll(17, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals(locale6.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=122,MONTH=52,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=1,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=45,SECOND=55,MILLISECOND=993,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone1);
        java.lang.String str4 = fastDateFormat2.format((long) '#');
        boolean boolean5 = fastDateFormat2.getTimeZoneOverridesCalendar();
        java.lang.String str7 = fastDateFormat2.format(100L);
        java.lang.String str9 = fastDateFormat2.format((long) 8);
        java.util.Calendar calendar10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = fastDateFormat2.format(calendar10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "12:00:00 AM UTC" + "'", str4, "12:00:00 AM UTC");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "12:00:00 AM UTC" + "'", str7, "12:00:00 AM UTC");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "12:00:00 AM UTC" + "'", str9, "12:00:00 AM UTC");
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = java.util.Date.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = locale0.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        int int0 = java.util.Calendar.SHORT_FORMAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        java.util.Locale locale1 = new java.util.Locale("zh");
        java.util.Locale locale2 = java.util.Locale.CHINESE;
        java.lang.String str3 = locale2.getLanguage();
        boolean boolean4 = locale2.hasExtensions();
        java.lang.String str5 = locale2.getDisplayCountry();
        java.lang.String str6 = locale1.getDisplayName(locale2);
        boolean boolean8 = locale1.equals((java.lang.Object) 54);
        org.junit.Assert.assertEquals(locale1.toString(), "zh");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh" + "'", str3, "zh");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587" + "'", str6, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setWeekDate(5, (int) (byte) -1, 1);
        java.util.Calendar.Builder builder6 = builder4.setLenient(true);
        java.util.Calendar.Builder builder10 = builder6.setTimeOfDay(122, 11, 10);
        java.util.Calendar.Builder builder14 = builder10.setWeekDate(100, 9, 2);
        java.util.TimeZone timeZone15 = java.util.TimeZone.getDefault();
        java.util.Calendar.Builder builder16 = builder14.setTimeZone(timeZone15);
        java.util.Locale locale18 = new java.util.Locale("zh");
        java.util.Locale locale19 = java.util.Locale.CHINESE;
        java.lang.String str20 = locale19.getLanguage();
        boolean boolean21 = locale19.hasExtensions();
        java.lang.String str22 = locale19.getDisplayCountry();
        java.lang.String str23 = locale18.getDisplayName(locale19);
        java.lang.String str24 = timeZone15.getDisplayName(locale19);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertEquals(locale18.toString(), "zh");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "zh" + "'", str20, "zh");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u4e2d\u6587" + "'", str23, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Coordinated Universal Time" + "'", str24, "Coordinated Universal Time");
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        int int0 = java.util.Calendar.ZONE_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 15 + "'", int0 == 15);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        int int0 = org.apache.commons.lang3.time.FastDateFormat.FULL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        long long6 = java.util.Date.UTC((int) (short) -1, (int) (short) -1, (int) (byte) 0, 50, (int) (short) 100, 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-2243103600000L) + "'", long6 == (-2243103600000L));
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.util.Date date4 = new java.util.Date();
        int int5 = date4.getSeconds();
        java.lang.String str6 = fastDateFormat2.format(date4);
        java.text.ParsePosition parsePosition9 = new java.text.ParsePosition(16);
        int int10 = parsePosition9.getErrorIndex();
        java.lang.Object obj11 = fastDateFormat2.parseObject("Temps universel coordonn\351", parsePosition9);
        java.util.Locale.LanguageRange[] languageRangeArray12 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList13 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13, languageRangeArray12);
        java.util.Locale locale15 = java.util.Locale.GERMAN;
        java.util.Locale locale16 = java.util.Locale.FRANCE;
        boolean boolean17 = locale16.hasExtensions();
        java.util.Locale locale18 = java.util.Locale.FRANCE;
        java.util.Locale locale19 = java.util.Locale.CHINESE;
        java.lang.String str20 = locale19.getLanguage();
        java.util.Locale[] localeArray21 = new java.util.Locale[] { locale15, locale16, locale18, locale19 };
        java.util.ArrayList<java.util.Locale> localeList22 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList22, localeArray21);
        java.util.Locale.FilteringMode filteringMode24 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList25 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, (java.util.Collection<java.util.Locale>) localeList22, filteringMode24);
        java.util.Spliterator<java.util.Locale> localeSpliterator26 = localeList25.spliterator();
        java.lang.Object[] objArray27 = localeList25.toArray();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList29 = java.util.Locale.LanguageRange.parse("zho");
        java.util.Set<java.lang.String> strSet30 = java.util.Calendar.getAvailableCalendarTypes();
        java.util.stream.Stream<java.lang.String> strStream31 = strSet30.parallelStream();
        java.lang.String str32 = java.util.Locale.lookupTag(languageRangeList29, (java.util.Collection<java.lang.String>) strSet30);
        java.util.stream.Stream<java.lang.String> strStream33 = strSet30.stream();
        boolean boolean34 = localeList25.containsAll((java.util.Collection<java.lang.String>) strSet30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = fastDateFormat2.format((java.lang.Object) strSet30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.util.Collections$UnmodifiableSet");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h:mm:ss a z" + "'", str3, "h:mm:ss a z");
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Mon Feb 21 14:45:56 UTC 2022");
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 56 + "'", int5 == 56);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2:45:56 PM UTC" + "'", str6, "2:45:56 PM UTC");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(languageRangeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "de");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "zh" + "'", str20, "zh");
        org.junit.Assert.assertNotNull(localeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + filteringMode24 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode24.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList25);
        org.junit.Assert.assertNotNull(localeSpliterator26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(languageRangeList29);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNotNull(strStream31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(strStream33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.util.Locale locale6 = new java.util.Locale("", "hi!", "");
        java.lang.String str7 = locale6.getCountry();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(55, timeZone2, locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 55");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals(locale6.toString(), "_HI!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HI!" + "'", str7, "HI!");
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        int int0 = java.util.Calendar.ALL_STYLES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        java.util.Locale locale1 = new java.util.Locale("zh");
        java.util.Locale locale2 = java.util.Locale.CHINESE;
        java.lang.String str3 = locale2.getLanguage();
        boolean boolean4 = locale2.hasExtensions();
        java.lang.String str5 = locale2.getDisplayCountry();
        java.lang.String str6 = locale1.getDisplayName(locale2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = locale2.getUnicodeLocaleType("java.text.ParsePosition[index=0,errorIndex=0]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: java.text.ParsePosition[index=0,errorIndex=0]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "zh");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh" + "'", str3, "zh");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587" + "'", str6, "\u4e2d\u6587");
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("US", (double) 122);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=122.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 2);
        java.util.Locale locale6 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale7 = locale6.stripExtensions();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone0, locale7);
        int int10 = calendar8.getLeastMaximum(4);
        calendar8.setFirstDayOfWeek((-1));
        boolean boolean14 = calendar8.isSet(8);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals(locale6.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=1645454756887,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=-1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=45,SECOND=56,MILLISECOND=887,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setExtension(' ', "Fri Jan 21 14:45:50 UTC 2022");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key:   [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 2);
        java.util.Locale locale6 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale7 = locale6.stripExtensions();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone0, locale7);
        int int9 = calendar8.getWeekYear();
        boolean boolean11 = calendar8.equals((java.lang.Object) 100.0d);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals(locale6.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=1645454756935,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=45,SECOND=56,MILLISECOND=935,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2022 + "'", int9 == 2022);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        int int0 = java.util.Calendar.DECEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        int int0 = java.util.Calendar.MONDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        java.util.Locale locale7 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale8 = locale7.stripExtensions();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone1, locale7);
        java.util.Locale locale12 = java.util.Locale.CHINESE;
        java.lang.String str13 = locale12.getLanguage();
        boolean boolean14 = locale12.hasExtensions();
        java.util.Locale locale15 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str16 = locale12.getDisplayLanguage(locale15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = timeZone1.getDisplayName(false, 52, locale12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals(locale7.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "_HI!");
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "zh" + "'", str13, "zh");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u4e2d\u6587" + "'", str16, "\u4e2d\u6587");
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        boolean boolean5 = locale4.hasExtensions();
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.util.Locale locale7 = java.util.Locale.CHINESE;
        java.lang.String str8 = locale7.getLanguage();
        java.util.Locale[] localeArray9 = new java.util.Locale[] { locale3, locale4, locale6, locale7 };
        java.util.ArrayList<java.util.Locale> localeList10 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList10, localeArray9);
        java.util.Locale.FilteringMode filteringMode12 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList13 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList10, filteringMode12);
        java.util.Spliterator<java.util.Locale> localeSpliterator14 = localeList13.spliterator();
        java.lang.Object[] objArray15 = localeList13.toArray();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList17 = java.util.Locale.LanguageRange.parse("zho");
        java.util.Set<java.lang.String> strSet18 = java.util.Calendar.getAvailableCalendarTypes();
        java.util.stream.Stream<java.lang.String> strStream19 = strSet18.parallelStream();
        java.lang.String str20 = java.util.Locale.lookupTag(languageRangeList17, (java.util.Collection<java.lang.String>) strSet18);
        java.util.stream.Stream<java.lang.String> strStream21 = strSet18.stream();
        boolean boolean22 = localeList13.containsAll((java.util.Collection<java.lang.String>) strSet18);
        java.util.function.UnaryOperator<java.util.Locale> localeUnaryOperator23 = null;
        // The following exception was thrown during execution in test generation
        try {
            localeList13.replaceAll(localeUnaryOperator23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh" + "'", str8, "zh");
        org.junit.Assert.assertNotNull(localeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + filteringMode12 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode12.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList13);
        org.junit.Assert.assertNotNull(localeSpliterator14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(languageRangeList17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(strStream19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(strStream21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "France");
        java.util.Locale.Builder builder5 = builder0.removeUnicodeLocaleAttribute("GMT");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder0.setRegion("FastDateFormat[h:mm:ss a z]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: FastDateFormat[h:mm:ss a z] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 2);
        java.util.Locale locale6 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale7 = locale6.stripExtensions();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone0, locale7);
        calendar8.set(122, 52, (int) (byte) 1);
        int int13 = calendar8.getWeeksInWeekYear();
        boolean boolean14 = calendar8.isLenient();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals(locale6.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=122,MONTH=52,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=1,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=45,SECOND=57,MILLISECOND=549,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("Mon Feb 21 14:45:54 UTC 2022");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: o");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 2);
        java.util.Locale locale6 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale7 = locale6.stripExtensions();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone0, locale7);
        calendar8.set(122, 52, (int) (byte) 1);
        java.lang.String str13 = calendar8.getCalendarType();
        boolean boolean14 = calendar8.isLenient();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals(locale6.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=122,MONTH=52,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=1,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=45,SECOND=57,MILLISECOND=687,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "gregory" + "'", str13, "gregory");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str2 = timeZone1.getID();
        boolean boolean3 = timeZone1.useDaylightTime();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GMT" + "'", str2, "GMT");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("21 Feb 2022 14:45:54 GMT");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 21 Feb 2022 14:45:54 GMT [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setUnicodeLocaleKeyword("French", "Fri Jan 21 14:45:50 UTC 2022");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: French [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        java.util.Locale locale0 = java.util.Locale.US;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        java.lang.String str2 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645454757830,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=45,SECOND=57,MILLISECOND=830,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en_US" + "'", str2, "en_US");
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        boolean boolean4 = timeZone2.hasSameRules(timeZone3);
        java.util.Locale locale8 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale9 = locale8.stripExtensions();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone2, locale8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(4, locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals(locale8.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "_HI!");
        org.junit.Assert.assertNotNull(fastDateFormat10);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        int int0 = java.util.Calendar.AM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setWeekDate(5, (int) (byte) -1, 1);
        java.util.Calendar.Builder builder6 = builder4.setLenient(true);
        java.util.Calendar.Builder builder10 = builder6.setTimeOfDay(122, 11, 10);
        java.util.Calendar.Builder builder14 = builder10.setWeekDate(100, 9, 2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder16 = builder10.setCalendarType("\u4e2d\u6587");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown calendar type: ??");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.util.Date date4 = new java.util.Date();
        int int5 = date4.getSeconds();
        java.lang.String str6 = fastDateFormat2.format(date4);
        java.text.ParsePosition parsePosition8 = new java.text.ParsePosition(16);
        int int9 = parsePosition8.getErrorIndex();
        java.lang.String str10 = parsePosition8.toString();
        java.lang.Object obj11 = null;
        boolean boolean12 = parsePosition8.equals(obj11);
        int int13 = parsePosition8.getIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = fastDateFormat2.format((java.lang.Object) int13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h:mm:ss a z" + "'", str3, "h:mm:ss a z");
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Mon Feb 21 14:45:58 UTC 2022");
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 58 + "'", int5 == 58);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2:45:58 PM UTC" + "'", str6, "2:45:58 PM UTC");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.text.ParsePosition[index=16,errorIndex=-1]" + "'", str10, "java.text.ParsePosition[index=16,errorIndex=-1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 16 + "'", int13 == 16);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        int int0 = java.util.Calendar.DAY_OF_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.lang.String str2 = locale0.getDisplayLanguage(locale1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale0.getExtension('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        java.util.Locale locale0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        int int0 = java.util.Calendar.WEEK_OF_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        int int0 = java.util.Calendar.PM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 2);
        java.util.Locale locale6 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale7 = locale6.stripExtensions();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone0, locale7);
        int int10 = calendar8.getLeastMaximum(4);
        java.util.TimeZone timeZone12 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone12);
        java.lang.String str14 = fastDateFormat13.getPattern();
        java.text.ParsePosition parsePosition17 = new java.text.ParsePosition(16);
        parsePosition17.setIndex(11);
        java.lang.Object obj20 = fastDateFormat13.parseObject("FastDateFormat[]", parsePosition17);
        boolean boolean21 = fastDateFormat13.getTimeZoneOverridesCalendar();
        boolean boolean22 = calendar8.equals((java.lang.Object) fastDateFormat13);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals(locale6.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=1645454758490,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=45,SECOND=58,MILLISECOND=490,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h:mm:ss a z" + "'", str14, "h:mm:ss a z");
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        java.util.Date date5 = new java.util.Date(3, (int) (short) 0, 6, 0, (int) (short) 1);
        date5.setTime(1645454750011L);
        java.lang.String str8 = date5.toString();
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Feb 21 14:45:50 GMT 2022");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Mon Feb 21 14:45:50 GMT 2022" + "'", str8, "Mon Feb 21 14:45:50 GMT 2022");
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 10, (-1), locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.text.ParsePosition parsePosition6 = new java.text.ParsePosition(16);
        parsePosition6.setIndex(11);
        java.lang.Object obj9 = fastDateFormat2.parseObject("FastDateFormat[]", parsePosition6);
        java.util.TimeZone timeZone10 = fastDateFormat2.getTimeZone();
        java.lang.String str11 = timeZone10.getDisplayName();
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h:mm:ss a z" + "'", str3, "h:mm:ss a z");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(timeZone10);
// flaky:         org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Temps universel coordonn\351");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Temps universel coordonn\351" + "'", str11, "Temps universel coordonn\351");
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        java.util.Locale locale0 = java.util.Locale.US;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        java.lang.String str2 = calendar1.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645454758976,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=45,SECOND=58,MILLISECOND=976,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.util.GregorianCalendar[time=1645454758976,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=45,SECOND=58,MILLISECOND=976,ZONE_OFFSET=0,DST_OFFSET=0]" + "'", str2, "java.util.GregorianCalendar[time=1645454758976,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=45,SECOND=58,MILLISECOND=976,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone1);
        java.lang.String str5 = timeZone1.getID();
        java.lang.String str6 = timeZone1.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone2);
// flaky:         org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GMT" + "'", str5, "GMT");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Heure de Greenwich" + "'", str6, "Heure de Greenwich");
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 2);
        java.util.Locale locale6 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale7 = locale6.stripExtensions();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone0, locale7);
        int int10 = calendar8.getLeastMaximum(4);
        java.util.TimeZone timeZone11 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone12 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone13 = java.util.TimeZone.getDefault();
        boolean boolean14 = timeZone12.hasSameRules(timeZone13);
        boolean boolean15 = timeZone11.hasSameRules(timeZone12);
        java.util.Calendar calendar16 = java.util.Calendar.getInstance(timeZone12);
        calendar8.setTimeZone(timeZone12);
        java.util.TimeZone timeZone18 = java.util.TimeZone.getDefault();
        int int20 = timeZone18.getOffset((long) 2);
        java.util.Locale locale24 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale25 = locale24.stripExtensions();
        java.util.Calendar calendar26 = java.util.Calendar.getInstance(timeZone18, locale25);
        calendar26.set(122, 52, (int) (byte) 1);
        calendar26.setMinimalDaysInFirstWeek(8);
        int int33 = calendar8.compareTo(calendar26);
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals(locale6.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=1645454759261,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=45,SECOND=59,MILLISECOND=261,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(timeZone11);
// flaky:         org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone12);
// flaky:         org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone13);
// flaky:         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(calendar16);
// flaky:         org.junit.Assert.assertEquals(calendar16.toString(), "java.util.GregorianCalendar[time=1645454759262,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=45,SECOND=59,MILLISECOND=262,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone18);
// flaky:         org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals(locale24.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar26);
// flaky:         org.junit.Assert.assertEquals(calendar26.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=8,ERA=1,YEAR=122,MONTH=52,WEEK_OF_YEAR=17,WEEK_OF_MONTH=0,DAY_OF_MONTH=1,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=45,SECOND=59,MILLISECOND=262,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        char char0 = java.util.Locale.UNICODE_LOCALE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'u' + "'", char0 == 'u');
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 2);
        java.util.Locale locale6 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale7 = locale6.stripExtensions();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone0, locale7);
        calendar8.set(122, 52, (int) (byte) 1);
        java.lang.String str13 = calendar8.getCalendarType();
        int int14 = calendar8.getWeekYear();
        calendar8.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = calendar8.getMinimum((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals(locale6.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "gregory" + "'", str13, "gregory");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 126 + "'", int14 == 126);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.text.ParsePosition parsePosition6 = new java.text.ParsePosition(16);
        parsePosition6.setIndex(11);
        java.lang.Object obj9 = fastDateFormat2.parseObject("FastDateFormat[]", parsePosition6);
        java.util.Locale locale13 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale14 = locale13.stripExtensions();
        java.util.Locale locale15 = java.util.Locale.US;
        java.util.Calendar calendar16 = java.util.Calendar.getInstance(locale15);
        java.lang.String str17 = locale13.getDisplayCountry(locale15);
        java.lang.StringBuffer stringBuffer18 = null;
        java.text.Format.Field field19 = null;
        java.text.FieldPosition fieldPosition21 = new java.text.FieldPosition(field19, 16);
        fieldPosition21.setBeginIndex((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer24 = fastDateFormat2.format((java.lang.Object) str17, stringBuffer18, fieldPosition21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.lang.String");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h:mm:ss a z" + "'", str3, "h:mm:ss a z");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals(locale13.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_US");
        org.junit.Assert.assertNotNull(calendar16);
// flaky:         org.junit.Assert.assertEquals(calendar16.toString(), "java.util.GregorianCalendar[time=1645454759305,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=45,SECOND=59,MILLISECOND=305,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HI!" + "'", str17, "HI!");
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone1);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = timeZone0.getOffset(45, (int) (byte) 0, 7, (int) (byte) 0, (int) ' ', 45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone2);
// flaky:         org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "France");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("java.text.ParsePosition[index=16,errorIndex=-1]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: java.text.ParsePosition[index=16,errorIndex=-1] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        java.util.Locale locale7 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale8 = locale7.stripExtensions();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone1, locale7);
        java.lang.String str10 = timeZone1.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone2);
// flaky:         org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals(locale7.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "_HI!");
        org.junit.Assert.assertNotNull(fastDateFormat9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Heure de Greenwich" + "'", str10, "Heure de Greenwich");
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone1);
        boolean boolean5 = timeZone1.observesDaylightTime();
        timeZone1.setRawOffset(52);
        timeZone1.setID("Temps universel coordonn\351");
        java.util.Locale locale11 = new java.util.Locale("zh");
        java.util.Locale locale12 = java.util.Locale.CHINESE;
        java.lang.String str13 = locale12.getLanguage();
        boolean boolean14 = locale12.hasExtensions();
        java.lang.String str15 = locale12.getDisplayCountry();
        java.lang.String str16 = locale11.getDisplayName(locale12);
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(timeZone1, locale11);
        // The following exception was thrown during execution in test generation
        try {
            calendar17.add(55, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone2);
// flaky:         org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals(locale11.toString(), "zh");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "zh" + "'", str13, "zh");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u4e2d\u6587" + "'", str16, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar17);
// flaky:         org.junit.Assert.assertEquals(calendar17.toString(), "java.util.GregorianCalendar[time=1645454759476,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Temps universel coordonn\351\",offset=52,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=45,SECOND=59,MILLISECOND=528,ZONE_OFFSET=52,DST_OFFSET=0]");
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.text.AttributedCharacterIterator.Attribute attribute1 = java.text.AttributedCharacterIterator.Attribute.READING;
        boolean boolean3 = attribute1.equals((java.lang.Object) 12);
        boolean boolean4 = locale0.equals((java.lang.Object) attribute1);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertNotNull(attribute1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone1);
        boolean boolean5 = timeZone1.observesDaylightTime();
        timeZone1.setRawOffset(52);
        timeZone1.setID("Temps universel coordonn\351");
        java.util.Locale locale11 = new java.util.Locale("zh");
        java.util.Locale locale12 = java.util.Locale.CHINESE;
        java.lang.String str13 = locale12.getLanguage();
        boolean boolean14 = locale12.hasExtensions();
        java.lang.String str15 = locale12.getDisplayCountry();
        java.lang.String str16 = locale11.getDisplayName(locale12);
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(timeZone1, locale11);
        // The following exception was thrown during execution in test generation
        try {
            calendar17.roll((int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone2);
// flaky:         org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals(locale11.toString(), "zh");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "zh" + "'", str13, "zh");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u4e2d\u6587" + "'", str16, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar17);
// flaky:         org.junit.Assert.assertEquals(calendar17.toString(), "java.util.GregorianCalendar[time=1645454759513,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Temps universel coordonn\351\",offset=52,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=45,SECOND=59,MILLISECOND=565,ZONE_OFFSET=52,DST_OFFSET=0]");
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "France");
        java.util.Locale.Builder builder5 = builder0.removeUnicodeLocaleAttribute("GMT");
        java.util.Locale locale6 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder0.setVariant("US");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: US [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.text.ParsePosition parsePosition6 = new java.text.ParsePosition(16);
        parsePosition6.setIndex(11);
        java.lang.Object obj9 = fastDateFormat2.parseObject("FastDateFormat[]", parsePosition6);
        java.util.TimeZone timeZone10 = fastDateFormat2.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = fastDateFormat2.parseObject("FastDateFormat[h:mm:ss a z]");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h:mm:ss a z" + "'", str3, "h:mm:ss a z");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(timeZone10);
// flaky:         org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Temps universel coordonn\351");
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 11");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("GMT", (double) 1);
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone5 = java.util.TimeZone.getDefault();
        boolean boolean6 = timeZone4.hasSameRules(timeZone5);
        java.util.Locale locale10 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale11 = locale10.stripExtensions();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone4, locale10);
        java.util.TimeZone timeZone13 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone14 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone15 = java.util.TimeZone.getDefault();
        boolean boolean16 = timeZone14.hasSameRules(timeZone15);
        boolean boolean17 = timeZone13.hasSameRules(timeZone14);
        boolean boolean18 = timeZone14.observesDaylightTime();
        timeZone14.setRawOffset(52);
        timeZone14.setID("Temps universel coordonn\351");
        java.util.Locale locale24 = new java.util.Locale("zh");
        java.util.Locale locale25 = java.util.Locale.CHINESE;
        java.lang.String str26 = locale25.getLanguage();
        boolean boolean27 = locale25.hasExtensions();
        java.lang.String str28 = locale25.getDisplayCountry();
        java.lang.String str29 = locale24.getDisplayName(locale25);
        java.util.Calendar calendar30 = java.util.Calendar.getInstance(timeZone14, locale24);
        java.lang.String str31 = fastDateFormat12.format(calendar30);
        boolean boolean32 = languageRange2.equals((java.lang.Object) fastDateFormat12);
        org.junit.Assert.assertNotNull(timeZone4);
// flaky:         org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals(locale10.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "_HI!");
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
// flaky:         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone15);
// flaky:         org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals(locale24.toString(), "zh");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "zh" + "'", str26, "zh");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\u4e2d\u6587" + "'", str29, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar30);
// flaky:         org.junit.Assert.assertEquals(calendar30.toString(), "java.util.GregorianCalendar[time=1645454759614,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Temps universel coordonn\351\",offset=52,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=45,SECOND=59,MILLISECOND=666,ZONE_OFFSET=52,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 2);
        java.util.Locale locale6 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale7 = locale6.stripExtensions();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone0, locale7);
        int int10 = calendar8.getLeastMaximum(4);
        // The following exception was thrown during execution in test generation
        try {
            calendar8.set(50, 56);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 50");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals(locale6.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=1645454759704,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=45,SECOND=59,MILLISECOND=704,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        boolean boolean5 = locale4.hasExtensions();
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.util.Locale locale7 = java.util.Locale.CHINESE;
        java.lang.String str8 = locale7.getLanguage();
        java.util.Locale[] localeArray9 = new java.util.Locale[] { locale3, locale4, locale6, locale7 };
        java.util.ArrayList<java.util.Locale> localeList10 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList10, localeArray9);
        java.util.Locale.FilteringMode filteringMode12 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList13 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList10, filteringMode12);
        java.util.Spliterator<java.util.Locale> localeSpliterator14 = localeList13.spliterator();
        java.util.Iterator<java.util.Locale> localeItor15 = localeList13.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale17 = localeList13.remove(2022);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2022, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh" + "'", str8, "zh");
        org.junit.Assert.assertNotNull(localeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + filteringMode12 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode12.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList13);
        org.junit.Assert.assertNotNull(localeSpliterator14);
        org.junit.Assert.assertNotNull(localeItor15);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 2);
        java.util.Locale locale6 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale7 = locale6.stripExtensions();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone0, locale7);
        int int10 = calendar8.getLeastMaximum(4);
        calendar8.setFirstDayOfWeek((-1));
        calendar8.setMinimalDaysInFirstWeek((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            calendar8.setWeekDate((int) (short) 10, 54, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals(locale6.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=1645454759762,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=-1,minimalDaysInFirstWeek=-1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=45,SECOND=59,MILLISECOND=762,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        boolean boolean4 = timeZone2.hasSameRules(timeZone3);
        boolean boolean5 = timeZone1.hasSameRules(timeZone2);
        java.util.Locale locale6 = java.util.Locale.TAIWAN;
        java.util.Locale locale7 = locale6.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getInstance("21 Feb 2022 14:45:54 GMT", timeZone1, locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: e");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone2);
// flaky:         org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone3);
// flaky:         org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_TW");
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str2 = timeZone1.getID();
        java.util.TimeZone.setDefault(timeZone1);
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(timeZone1);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = calendar4.getActualMinimum(58);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 58");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GMT" + "'", str2, "GMT");
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=1645454759837,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=45,SECOND=59,MILLISECOND=837,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        long long6 = java.util.Date.UTC(32770, 5, 15, 51, 13, 2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1031926792382000L + "'", long6 == 1031926792382000L);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone1);
        boolean boolean5 = timeZone1.observesDaylightTime();
        timeZone1.setRawOffset(52);
        timeZone1.setID("Temps universel coordonn\351");
        java.util.Locale locale11 = new java.util.Locale("zh");
        java.util.Locale locale12 = java.util.Locale.CHINESE;
        java.lang.String str13 = locale12.getLanguage();
        boolean boolean14 = locale12.hasExtensions();
        java.lang.String str15 = locale12.getDisplayCountry();
        java.lang.String str16 = locale11.getDisplayName(locale12);
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(timeZone1, locale11);
        calendar17.clear();
        long long19 = calendar17.getTimeInMillis();
        java.util.TimeZone timeZone20 = java.util.TimeZone.getDefault();
        int int22 = timeZone20.getOffset((long) 2);
        java.util.Locale locale26 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale27 = locale26.stripExtensions();
        java.util.Calendar calendar28 = java.util.Calendar.getInstance(timeZone20, locale27);
        int int30 = calendar28.getLeastMaximum(4);
        calendar28.setFirstDayOfWeek((-1));
        int int33 = calendar28.getFirstDayOfWeek();
        int int34 = calendar17.compareTo(calendar28);
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone2);
// flaky:         org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals(locale11.toString(), "zh");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "zh" + "'", str13, "zh");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u4e2d\u6587" + "'", str16, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar17);
        org.junit.Assert.assertEquals(calendar17.toString(), "java.util.GregorianCalendar[time=-52,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Temps universel coordonn\351\",offset=52,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-52L) + "'", long19 == (-52L));
        org.junit.Assert.assertNotNull(timeZone20);
// flaky:         org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals(locale26.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar28);
// flaky:         org.junit.Assert.assertEquals(calendar28.toString(), "java.util.GregorianCalendar[time=1645454759908,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=-1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=45,SECOND=59,MILLISECOND=908,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        int int0 = java.util.Calendar.MINUTE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "France");
        java.util.Locale.Builder builder5 = builder0.removeUnicodeLocaleAttribute("GMT");
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.lang.String str7 = locale6.getVariant();
        java.lang.String str8 = locale6.getDisplayCountry();
        java.util.Locale.Builder builder9 = builder0.setLocale(locale6);
        java.util.Locale locale13 = new java.util.Locale("", "hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder9.setLocale(locale13);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: HI! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "France" + "'", str8, "France");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals(locale13.toString(), "_HI!");
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setWeekDate(5, (int) (byte) -1, 1);
        java.util.Calendar.Builder builder6 = builder4.setLenient(true);
        java.util.Calendar.Builder builder10 = builder6.setTimeOfDay(122, 11, 10);
        java.util.Calendar.Builder builder14 = builder10.setWeekDate(100, 9, 2);
        java.util.TimeZone timeZone15 = java.util.TimeZone.getDefault();
        java.util.Calendar.Builder builder16 = builder14.setTimeZone(timeZone15);
        java.lang.Class<?> wildcardClass17 = timeZone15.getClass();
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(timeZone15);
// flaky:         org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 2);
        java.util.Locale locale6 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale7 = locale6.stripExtensions();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone0, locale7);
        calendar8.set(122, 52, (int) (byte) 1);
        calendar8.setMinimalDaysInFirstWeek(8);
        // The following exception was thrown during execution in test generation
        try {
            calendar8.clear(32770);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32770");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals(locale6.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=8,ERA=1,YEAR=122,MONTH=52,WEEK_OF_YEAR=17,WEEK_OF_MONTH=0,DAY_OF_MONTH=1,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=0,MILLISECOND=54,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "France");
        java.util.Locale.Builder builder5 = builder0.removeUnicodeLocaleAttribute("GMT");
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.lang.String str7 = locale6.getVariant();
        java.lang.String str8 = locale6.getDisplayCountry();
        java.util.Locale.Builder builder9 = builder0.setLocale(locale6);
        java.util.Locale locale10 = builder9.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder9.setUnicodeLocaleKeyword("HI!", "Temps universel coordonn\351");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: HI! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "France" + "'", str8, "France");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_FR");
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone1);
        boolean boolean5 = timeZone1.observesDaylightTime();
        timeZone1.setRawOffset(52);
        timeZone1.setID("Temps universel coordonn\351");
        java.util.Locale locale11 = new java.util.Locale("zh");
        java.util.Locale locale12 = java.util.Locale.CHINESE;
        java.lang.String str13 = locale12.getLanguage();
        boolean boolean14 = locale12.hasExtensions();
        java.lang.String str15 = locale12.getDisplayCountry();
        java.lang.String str16 = locale11.getDisplayName(locale12);
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(timeZone1, locale11);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = timeZone1.getOffset(5, 0, (int) (byte) 10, (int) ' ', 0, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone2);
// flaky:         org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals(locale11.toString(), "zh");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "zh" + "'", str13, "zh");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u4e2d\u6587" + "'", str16, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar17);
// flaky:         org.junit.Assert.assertEquals(calendar17.toString(), "java.util.GregorianCalendar[time=1645454760310,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Temps universel coordonn\351\",offset=52,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=0,MILLISECOND=362,ZONE_OFFSET=52,DST_OFFSET=0]");
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 2);
        java.util.Locale locale6 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale7 = locale6.stripExtensions();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone0, locale7);
        calendar8.set(122, 52, (int) (byte) 1);
        calendar8.setMinimalDaysInFirstWeek(8);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = calendar8.getActualMaximum((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals(locale6.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=8,ERA=1,YEAR=122,MONTH=52,WEEK_OF_YEAR=17,WEEK_OF_MONTH=0,DAY_OF_MONTH=1,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=0,MILLISECOND=326,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        boolean boolean2 = timeZone0.hasSameRules(timeZone1);
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        boolean boolean5 = timeZone3.hasSameRules(timeZone4);
        timeZone4.setID("Etc/UTC");
        boolean boolean8 = timeZone1.hasSameRules(timeZone4);
        java.util.Locale locale14 = new java.util.Locale("", "hi!", "");
        java.lang.String str15 = locale14.getCountry();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = timeZone4.getDisplayName(false, 13, locale14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 13");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(timeZone3);
// flaky:         org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone4);
// flaky:         org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals(locale14.toString(), "_HI!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HI!" + "'", str15, "HI!");
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "France");
        java.util.Locale.Builder builder5 = builder0.removeUnicodeLocaleAttribute("GMT");
        java.util.Locale locale6 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder0.setLanguageTag("2:45:53 PM UTC");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: 2:45:53 PM UTC [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        boolean boolean5 = locale4.hasExtensions();
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.util.Locale locale7 = java.util.Locale.CHINESE;
        java.lang.String str8 = locale7.getLanguage();
        java.util.Locale[] localeArray9 = new java.util.Locale[] { locale3, locale4, locale6, locale7 };
        java.util.ArrayList<java.util.Locale> localeList10 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList10, localeArray9);
        java.util.Locale.FilteringMode filteringMode12 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList13 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList10, filteringMode12);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList15 = java.util.Locale.LanguageRange.parse("zho");
        java.util.Set<java.lang.String> strSet16 = java.util.Calendar.getAvailableCalendarTypes();
        java.util.stream.Stream<java.lang.String> strStream17 = strSet16.parallelStream();
        java.lang.String str18 = java.util.Locale.lookupTag(languageRangeList15, (java.util.Collection<java.lang.String>) strSet16);
        java.util.stream.Stream<java.lang.String> strStream19 = strSet16.stream();
        boolean boolean20 = localeList10.containsAll((java.util.Collection<java.lang.String>) strSet16);
        java.util.function.UnaryOperator<java.util.Locale> localeUnaryOperator21 = null;
        // The following exception was thrown during execution in test generation
        try {
            localeList10.replaceAll(localeUnaryOperator21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh" + "'", str8, "zh");
        org.junit.Assert.assertNotNull(localeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + filteringMode12 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode12.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList13);
        org.junit.Assert.assertNotNull(languageRangeList15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strStream17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(strStream19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        boolean boolean4 = timeZone2.hasSameRules(timeZone3);
        timeZone3.setID("Etc/UTC");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(32772, 0, timeZone3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 32772");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone2);
// flaky:         org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone3);
// flaky:         org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("GMT", (double) 1);
        java.text.ParsePosition parsePosition4 = new java.text.ParsePosition(16);
        parsePosition4.setIndex(11);
        boolean boolean7 = languageRange2.equals((java.lang.Object) 11);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        int int0 = java.util.Calendar.MARCH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        boolean boolean5 = timeZone3.hasSameRules(timeZone4);
        boolean boolean6 = timeZone2.hasSameRules(timeZone3);
        java.util.TimeZone timeZone8 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str9 = timeZone8.getID();
        boolean boolean10 = timeZone3.hasSameRules(timeZone8);
        java.util.Locale locale11 = java.util.Locale.FRANCE;
        boolean boolean12 = locale11.hasExtensions();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone8, locale11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(10, locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone2);
// flaky:         org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        org.junit.Assert.assertNotNull(timeZone3);
// flaky:         org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        org.junit.Assert.assertNotNull(timeZone4);
// flaky:         org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky:         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "GMT" + "'", str9, "GMT");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(fastDateFormat13);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = java.util.Date.parse("java.text.ParsePosition[index=16,errorIndex=-1]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = locale0.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
// flaky:         org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone1);
        java.lang.String str5 = timeZone1.getID();
        java.util.Locale locale8 = java.util.Locale.FRANCE;
        java.lang.String str9 = locale8.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = timeZone1.getDisplayName(true, 52, locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        org.junit.Assert.assertNotNull(timeZone2);
// flaky:         org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GMT" + "'", str5, "GMT");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "fr" + "'", str9, "fr");
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setWeekDate(5, (int) (byte) -1, 1);
        java.util.Calendar.Builder builder6 = builder4.setLenient(true);
        java.util.Calendar.Builder builder10 = builder6.setTimeOfDay(122, 11, 10);
        java.util.Calendar.Builder builder14 = builder10.setWeekDate(100, 9, 2);
        java.util.TimeZone timeZone15 = java.util.TimeZone.getDefault();
        java.util.Calendar.Builder builder16 = builder14.setTimeZone(timeZone15);
        java.util.Date date17 = new java.util.Date();
        int int18 = date17.getSeconds();
        date17.setTime((long) 16);
        date17.setMinutes(12);
        boolean boolean23 = timeZone15.inDaylightTime(date17);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(timeZone15);
// flaky:         org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:12:00 GMT 1970");
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        boolean boolean4 = timeZone2.hasSameRules(timeZone3);
        boolean boolean5 = timeZone1.hasSameRules(timeZone2);
        boolean boolean6 = timeZone2.observesDaylightTime();
        timeZone2.setRawOffset(52);
        timeZone2.setID("Temps universel coordonn\351");
        java.util.Locale locale12 = new java.util.Locale("zh");
        java.util.Locale locale13 = java.util.Locale.CHINESE;
        java.lang.String str14 = locale13.getLanguage();
        boolean boolean15 = locale13.hasExtensions();
        java.lang.String str16 = locale13.getDisplayCountry();
        java.lang.String str17 = locale12.getDisplayName(locale13);
        java.util.Calendar calendar18 = java.util.Calendar.getInstance(timeZone2, locale12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(50, timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 50");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone3);
// flaky:         org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals(locale12.toString(), "zh");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "zh" + "'", str14, "zh");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\u4e2d\u6587" + "'", str17, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar18);
// flaky:         org.junit.Assert.assertEquals(calendar18.toString(), "java.util.GregorianCalendar[time=1645454761405,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Temps universel coordonn\351\",offset=52,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=1,MILLISECOND=457,ZONE_OFFSET=52,DST_OFFSET=0]");
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 2);
        java.util.Locale locale6 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale7 = locale6.stripExtensions();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone0, locale7);
        calendar8.set(122, 52, (int) (byte) 1);
        int int13 = calendar8.getWeeksInWeekYear();
        boolean boolean14 = calendar8.isWeekDateSupported();
        boolean boolean16 = calendar8.equals((java.lang.Object) 10);
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals(locale6.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=122,MONTH=52,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=1,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=1,MILLISECOND=632,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        boolean boolean5 = locale4.hasExtensions();
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.util.Locale locale7 = java.util.Locale.CHINESE;
        java.lang.String str8 = locale7.getLanguage();
        java.util.Locale[] localeArray9 = new java.util.Locale[] { locale3, locale4, locale6, locale7 };
        java.util.ArrayList<java.util.Locale> localeList10 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList10, localeArray9);
        java.util.Locale.FilteringMode filteringMode12 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList13 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList10, filteringMode12);
        java.util.Locale locale15 = java.util.Locale.ROOT;
        java.util.Locale locale16 = java.util.Locale.FRANCE;
        java.lang.String str17 = locale15.getDisplayLanguage(locale16);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale18 = localeList13.set(49, locale15);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 49, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh" + "'", str8, "zh");
        org.junit.Assert.assertNotNull(localeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + filteringMode12 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode12.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList13);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) 'x', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "France");
        java.util.Locale.Builder builder5 = builder0.removeUnicodeLocaleAttribute("GMT");
        java.util.Locale locale9 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale10 = locale9.stripExtensions();
        java.util.Locale locale11 = java.util.Locale.US;
        java.util.Calendar calendar12 = java.util.Calendar.getInstance(locale11);
        java.lang.String str13 = locale9.getDisplayCountry(locale11);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder0.setLocale(locale9);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: HI! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals(locale9.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertNotNull(calendar12);
// flaky:         org.junit.Assert.assertEquals(calendar12.toString(), "java.util.GregorianCalendar[time=1645454761897,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=1,MILLISECOND=897,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HI!" + "'", str13, "HI!");
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("FastDateFormat[h:mm:ss a z]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=fastdateformat[h:mm:ss a z]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str2 = timeZone1.getID();
        java.util.TimeZone.setDefault(timeZone1);
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(timeZone1);
        int int5 = calendar4.getFirstDayOfWeek();
        java.lang.String str6 = calendar4.toString();
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GMT" + "'", str2, "GMT");
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=1645454762116,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=2,MILLISECOND=116,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.util.GregorianCalendar[time=1645454762116,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=2,MILLISECOND=116,ZONE_OFFSET=0,DST_OFFSET=0]" + "'", str6, "java.util.GregorianCalendar[time=1645454762116,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=2,MILLISECOND=116,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone1);
        java.util.TimeZone timeZone6 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str7 = timeZone6.getID();
        boolean boolean8 = timeZone1.hasSameRules(timeZone6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = timeZone1.getDisplayName(false, 17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 17");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        org.junit.Assert.assertNotNull(timeZone2);
// flaky:         org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(timeZone6);
// flaky:         org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GMT" + "'", str7, "GMT");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.text.ParsePosition parsePosition7 = new java.text.ParsePosition(16);
        parsePosition7.setIndex(11);
        java.lang.Object obj10 = fastDateFormat3.parseObject("FastDateFormat[]", parsePosition7);
        java.util.TimeZone timeZone11 = fastDateFormat3.getTimeZone();
        java.util.Locale.Category category12 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale13 = java.util.Locale.TAIWAN;
        java.util.Locale locale14 = locale13.stripExtensions();
        java.util.Locale.setDefault(category12, locale13);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 100, timeZone11, locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h:mm:ss a z" + "'", str4, "h:mm:ss a z");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(timeZone11);
// flaky:         org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u5354\u8abf\u4e16\u754c\u6642\u9593");
        org.junit.Assert.assertTrue("'" + category12 + "' != '" + java.util.Locale.Category.FORMAT + "'", category12.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        int int0 = java.util.Calendar.SHORT_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32769 + "'", int0 == 32769);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 2);
        java.util.Locale locale6 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale7 = locale6.stripExtensions();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone0, locale7);
        calendar8.set(122, 52, (int) (byte) 1);
        int int13 = calendar8.getWeeksInWeekYear();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = calendar8.getActualMinimum(21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 21");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals(locale6.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=122,MONTH=52,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=1,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=2,MILLISECOND=425,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        java.util.Date date0 = new java.util.Date();
        int int1 = date0.getDay();
        java.lang.String str2 = date0.toGMTString();
        int int3 = date0.getYear();
// flaky:         org.junit.Assert.assertEquals(date0.toString(), "Mon Feb 21 14:46:02 GMT 2022");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "21 Feb 2022 14:46:02 GMT" + "'", str2, "21 Feb 2022 14:46:02 GMT");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 122 + "'", int3 == 122);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("Coordinated Universal Time");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: Coordinated Universal Time [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        int int0 = java.util.Calendar.MILLISECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 14 + "'", int0 == 14);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.text.ParsePosition parsePosition7 = new java.text.ParsePosition(16);
        parsePosition7.setIndex(11);
        java.lang.Object obj10 = fastDateFormat3.parseObject("FastDateFormat[]", parsePosition7);
        java.util.TimeZone timeZone11 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(32770, timeZone11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 32770");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h:mm:ss a z" + "'", str4, "h:mm:ss a z");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        boolean boolean4 = timeZone2.hasSameRules(timeZone3);
        boolean boolean5 = timeZone1.hasSameRules(timeZone2);
        java.util.TimeZone timeZone7 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str8 = timeZone7.getID();
        boolean boolean9 = timeZone2.hasSameRules(timeZone7);
        java.util.Locale locale10 = java.util.Locale.FRANCE;
        boolean boolean11 = locale10.hasExtensions();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone7, locale10);
        java.lang.String str13 = locale10.toString();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GMT" + "'", str8, "GMT");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "fr_FR" + "'", str13, "fr_FR");
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 15");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone1);
        java.lang.String str4 = fastDateFormat2.format((long) '#');
        boolean boolean5 = fastDateFormat2.getTimeZoneOverridesCalendar();
        java.util.Calendar calendar6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = fastDateFormat2.format(calendar6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "12:00:00 AM UTC" + "'", str4, "12:00:00 AM UTC");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        java.util.TimeZone timeZone3 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str4 = timeZone3.getID();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((-1), 2022, timeZone3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 2022");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GMT" + "'", str4, "GMT");
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        java.util.Locale locale7 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale8 = locale7.stripExtensions();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone1, locale7);
        java.util.Date date15 = new java.util.Date(3, (int) (short) 0, 6, 0, (int) (short) 1);
        java.util.Date date16 = new java.util.Date();
        int int17 = date16.getTimezoneOffset();
        long long18 = date16.getTime();
        boolean boolean19 = date15.after(date16);
        java.lang.StringBuffer stringBuffer20 = null;
        java.text.Format.Field field21 = null;
        java.text.FieldPosition fieldPosition23 = new java.text.FieldPosition(field21, 16);
        fieldPosition23.setBeginIndex((int) '4');
        java.lang.StringBuffer stringBuffer26 = fastDateFormat9.format((java.lang.Object) date15, stringBuffer20, fieldPosition23);
        java.lang.StringBuffer stringBuffer28 = null;
        java.text.Format.Field field29 = null;
        java.text.FieldPosition fieldPosition31 = new java.text.FieldPosition(field29, 16);
        fieldPosition31.setBeginIndex((int) '4');
        fieldPosition31.setBeginIndex((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer36 = fastDateFormat9.format((java.lang.Object) 6, stringBuffer28, fieldPosition31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals(locale7.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "_HI!");
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertEquals(date15.toString(), "Tue Jan 06 00:01:00 GMT 1903");
// flaky:         org.junit.Assert.assertEquals(date16.toString(), "Mon Feb 21 14:46:02 GMT 2022");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1645454762767L + "'", long18 == 1645454762767L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(stringBuffer26);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        java.util.Locale locale7 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale8 = locale7.stripExtensions();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone1, locale7);
        java.lang.Object obj10 = fastDateFormat9.clone();
        java.util.Locale locale11 = java.util.Locale.CHINESE;
        java.lang.String str12 = locale11.getLanguage();
        boolean boolean13 = locale11.hasExtensions();
        java.lang.String str14 = locale11.getDisplayCountry();
        java.util.Set<java.lang.String> strSet15 = locale11.getUnicodeLocaleKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator16 = fastDateFormat9.formatToCharacterIterator((java.lang.Object) strSet15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.util.Collections$EmptySet");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals(locale7.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "_HI!");
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "FastDateFormat[]");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "zh" + "'", str12, "zh");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        boolean boolean5 = locale4.hasExtensions();
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.util.Locale locale7 = java.util.Locale.CHINESE;
        java.lang.String str8 = locale7.getLanguage();
        java.util.Locale[] localeArray9 = new java.util.Locale[] { locale3, locale4, locale6, locale7 };
        java.util.ArrayList<java.util.Locale> localeList10 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList10, localeArray9);
        java.util.Locale.FilteringMode filteringMode12 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList13 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList10, filteringMode12);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList15 = java.util.Locale.LanguageRange.parse("zho");
        java.util.Set<java.lang.String> strSet16 = java.util.Calendar.getAvailableCalendarTypes();
        java.util.stream.Stream<java.lang.String> strStream17 = strSet16.parallelStream();
        java.lang.String str18 = java.util.Locale.lookupTag(languageRangeList15, (java.util.Collection<java.lang.String>) strSet16);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList20 = java.util.Locale.LanguageRange.parse("zho");
        java.util.Set<java.lang.String> strSet21 = java.util.Calendar.getAvailableCalendarTypes();
        java.util.stream.Stream<java.lang.String> strStream22 = strSet21.parallelStream();
        java.lang.String str23 = java.util.Locale.lookupTag(languageRangeList20, (java.util.Collection<java.lang.String>) strSet21);
        java.util.stream.Stream<java.lang.String> strStream24 = strSet21.stream();
        java.util.List<java.lang.String> strList25 = java.util.Locale.filterTags(languageRangeList15, (java.util.Collection<java.lang.String>) strSet21);
        boolean boolean26 = localeList13.containsAll((java.util.Collection<java.lang.String>) strList25);
        java.util.Locale locale29 = new java.util.Locale("GMT");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale30 = localeList13.set(7, locale29);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 7, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh" + "'", str8, "zh");
        org.junit.Assert.assertNotNull(localeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + filteringMode12 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode12.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList13);
        org.junit.Assert.assertNotNull(languageRangeList15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strStream17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(languageRangeList20);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(strStream22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(strStream24);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals(locale29.toString(), "gmt");
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 2);
        java.util.Locale locale6 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale7 = locale6.stripExtensions();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone0, locale7);
        int int10 = calendar8.getLeastMaximum(4);
        calendar8.setFirstDayOfWeek((-1));
        java.lang.Object obj13 = calendar8.clone();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals(locale6.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=1645454762902,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=-1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=2,MILLISECOND=902,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(obj13);
// flaky:         org.junit.Assert.assertEquals(obj13.toString(), "java.util.GregorianCalendar[time=1645454762902,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=-1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=2,MILLISECOND=902,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "java.util.GregorianCalendar[time=1645454762902,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=-1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=2,MILLISECOND=902,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "java.util.GregorianCalendar[time=1645454762902,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=-1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=2,MILLISECOND=902,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        boolean boolean4 = timeZone2.hasSameRules(timeZone3);
        java.util.TimeZone timeZone5 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        boolean boolean7 = timeZone5.hasSameRules(timeZone6);
        timeZone6.setID("Etc/UTC");
        boolean boolean10 = timeZone3.hasSameRules(timeZone6);
        java.util.Locale locale11 = java.util.Locale.ROOT;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(126, 3, timeZone3, locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 126");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.Object obj2 = locale1.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "zh_TW");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "zh_TW");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "zh_TW");
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 2);
        java.util.Locale locale6 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale7 = locale6.stripExtensions();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone0, locale7);
        calendar8.set(122, 52, (int) (byte) 1);
        calendar8.setMinimalDaysInFirstWeek(8);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = calendar8.getLeastMaximum(54);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 54");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals(locale6.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=8,ERA=1,YEAR=122,MONTH=52,WEEK_OF_YEAR=17,WEEK_OF_MONTH=0,DAY_OF_MONTH=1,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=2,MILLISECOND=946,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        boolean boolean5 = locale4.hasExtensions();
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.util.Locale locale7 = java.util.Locale.CHINESE;
        java.lang.String str8 = locale7.getLanguage();
        java.util.Locale[] localeArray9 = new java.util.Locale[] { locale3, locale4, locale6, locale7 };
        java.util.ArrayList<java.util.Locale> localeList10 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList10, localeArray9);
        java.util.Locale.FilteringMode filteringMode12 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList13 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList10, filteringMode12);
        java.util.Spliterator<java.util.Locale> localeSpliterator14 = localeList13.spliterator();
        java.lang.Object[] objArray15 = localeList13.toArray();
        java.util.Spliterator<java.util.Locale> localeSpliterator16 = localeList13.spliterator();
        java.util.function.UnaryOperator<java.util.Locale> localeUnaryOperator17 = null;
        // The following exception was thrown during execution in test generation
        try {
            localeList13.replaceAll(localeUnaryOperator17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh" + "'", str8, "zh");
        org.junit.Assert.assertNotNull(localeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + filteringMode12 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode12.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList13);
        org.junit.Assert.assertNotNull(localeSpliterator14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(localeSpliterator16);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        java.util.Locale locale1 = java.util.Locale.KOREA;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, locale1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.lang.String[] strArray5 = java.util.TimeZone.getAvailableIDs(50);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator6 = fastDateFormat2.formatToCharacterIterator((java.lang.Object) strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: [Ljava.lang.String;");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(fastDateFormat2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\uc2dc\ubd84\ucd08' z" + "'", str3, "\uc2dc\ubd84\ucd08' z");
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone1);
        java.util.TimeZone timeZone6 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str7 = timeZone6.getID();
        boolean boolean8 = timeZone1.hasSameRules(timeZone6);
        java.util.Locale.Category category11 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale12 = java.util.Locale.TAIWAN;
        java.util.Locale locale13 = locale12.stripExtensions();
        java.util.Locale.setDefault(category11, locale12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = timeZone1.getDisplayName(false, 6, locale12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GMT" + "'", str7, "GMT");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + category11 + "' != '" + java.util.Locale.Category.FORMAT + "'", category11.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_TW");
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        java.util.Locale locale7 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale8 = locale7.stripExtensions();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone1, locale7);
        java.lang.Object obj10 = fastDateFormat9.clone();
        java.util.Locale locale14 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale15 = locale14.stripExtensions();
        java.lang.StringBuffer stringBuffer16 = null;
        java.util.Locale.LanguageRange[] languageRangeArray17 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList18 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18, languageRangeArray17);
        java.util.Locale locale20 = java.util.Locale.GERMAN;
        java.util.Locale locale21 = java.util.Locale.FRANCE;
        boolean boolean22 = locale21.hasExtensions();
        java.util.Locale locale23 = java.util.Locale.FRANCE;
        java.util.Locale locale24 = java.util.Locale.CHINESE;
        java.lang.String str25 = locale24.getLanguage();
        java.util.Locale[] localeArray26 = new java.util.Locale[] { locale20, locale21, locale23, locale24 };
        java.util.ArrayList<java.util.Locale> localeList27 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList27, localeArray26);
        java.util.Locale.FilteringMode filteringMode29 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList30 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.util.Locale>) localeList27, filteringMode29);
        java.util.Spliterator<java.util.Locale> localeSpliterator31 = localeList30.spliterator();
        java.lang.Object[] objArray32 = localeList30.toArray();
        localeList30.clear();
        java.text.Format.Field field34 = null;
        java.text.FieldPosition fieldPosition35 = new java.text.FieldPosition(field34);
        boolean boolean36 = localeList30.equals((java.lang.Object) fieldPosition35);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer37 = fastDateFormat9.format((java.lang.Object) locale15, stringBuffer16, fieldPosition35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.util.Locale");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals(locale7.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "_HI!");
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "FastDateFormat[]");
        org.junit.Assert.assertEquals(locale14.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "_HI!");
        org.junit.Assert.assertNotNull(languageRangeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "de");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "zh" + "'", str25, "zh");
        org.junit.Assert.assertNotNull(localeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + filteringMode29 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode29.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList30);
        org.junit.Assert.assertNotNull(localeSpliterator31);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setWeekDate(5, (int) (byte) -1, 1);
        java.util.Calendar.Builder builder8 = builder0.setDate(51, 122, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder11 = builder0.setWeekDefinition(5, (int) 'u');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setWeekDate(5, (int) (byte) -1, 1);
        java.util.Calendar.Builder builder8 = builder0.setTimeOfDay(1, (int) 'x', (int) '4');
        java.util.Date date9 = new java.util.Date();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder10 = builder8.setInstant(date9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder8);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Mon Feb 21 14:46:03 GMT 2022");
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        boolean boolean5 = locale4.hasExtensions();
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.util.Locale locale7 = java.util.Locale.CHINESE;
        java.lang.String str8 = locale7.getLanguage();
        java.util.Locale[] localeArray9 = new java.util.Locale[] { locale3, locale4, locale6, locale7 };
        java.util.ArrayList<java.util.Locale> localeList10 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList10, localeArray9);
        java.util.Locale.FilteringMode filteringMode12 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList13 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList10, filteringMode12);
        java.util.Spliterator<java.util.Locale> localeSpliterator14 = localeList13.spliterator();
        java.lang.Object[] objArray15 = localeList13.toArray();
        localeList13.clear();
        java.text.Format.Field field17 = null;
        java.text.FieldPosition fieldPosition18 = new java.text.FieldPosition(field17);
        boolean boolean19 = localeList13.equals((java.lang.Object) fieldPosition18);
        java.util.function.UnaryOperator<java.util.Locale> localeUnaryOperator20 = null;
        // The following exception was thrown during execution in test generation
        try {
            localeList13.replaceAll(localeUnaryOperator20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh" + "'", str8, "zh");
        org.junit.Assert.assertNotNull(localeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + filteringMode12 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode12.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList13);
        org.junit.Assert.assertNotNull(localeSpliterator14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 2);
        java.util.Locale locale6 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale7 = locale6.stripExtensions();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone0, locale7);
        calendar8.set(122, 52, (int) (byte) 1);
        java.lang.String str13 = calendar8.getCalendarType();
        int int14 = calendar8.getWeekYear();
        // The following exception was thrown during execution in test generation
        try {
            calendar8.set(2022, 58);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2022");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals(locale6.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=-58180670036415,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=126,MONTH=4,WEEK_OF_YEAR=18,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=121,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=3,MILLISECOND=585,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "gregory" + "'", str13, "gregory");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 126 + "'", int14 == 126);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        boolean boolean5 = locale4.hasExtensions();
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.util.Locale locale7 = java.util.Locale.CHINESE;
        java.lang.String str8 = locale7.getLanguage();
        java.util.Locale[] localeArray9 = new java.util.Locale[] { locale3, locale4, locale6, locale7 };
        java.util.ArrayList<java.util.Locale> localeList10 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList10, localeArray9);
        java.util.Locale.FilteringMode filteringMode12 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList13 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList10, filteringMode12);
        java.util.Spliterator<java.util.Locale> localeSpliterator14 = localeList13.spliterator();
        localeList13.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale17 = localeList13.remove((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh" + "'", str8, "zh");
        org.junit.Assert.assertNotNull(localeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + filteringMode12 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode12.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList13);
        org.junit.Assert.assertNotNull(localeSpliterator14);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone5 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        boolean boolean7 = timeZone5.hasSameRules(timeZone6);
        boolean boolean8 = timeZone4.hasSameRules(timeZone5);
        boolean boolean9 = timeZone5.observesDaylightTime();
        timeZone5.setRawOffset(52);
        timeZone5.setID("Temps universel coordonn\351");
        java.util.Locale locale15 = new java.util.Locale("zh");
        java.util.Locale locale16 = java.util.Locale.CHINESE;
        java.lang.String str17 = locale16.getLanguage();
        boolean boolean18 = locale16.hasExtensions();
        java.lang.String str19 = locale16.getDisplayCountry();
        java.lang.String str20 = locale15.getDisplayName(locale16);
        java.util.Calendar calendar21 = java.util.Calendar.getInstance(timeZone5, locale15);
        calendar21.clear();
        java.lang.String str23 = fastDateFormat2.format(calendar21);
        java.lang.StringBuffer stringBuffer25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer26 = fastDateFormat2.format((long) 5, stringBuffer25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h:mm:ss a z" + "'", str3, "h:mm:ss a z");
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals(locale15.toString(), "zh");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "zh" + "'", str17, "zh");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\u4e2d\u6587" + "'", str20, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar21);
        org.junit.Assert.assertEquals(calendar21.toString(), "java.util.GregorianCalendar[time=-52,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Temps universel coordonn\351\",offset=52,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=52,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "12:00:00 AM GMT+00:00" + "'", str23, "12:00:00 AM GMT+00:00");
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        java.util.Date date5 = new java.util.Date(3, (int) (short) 0, 6, 0, (int) (short) 1);
        java.util.Date date6 = new java.util.Date();
        int int7 = date6.getTimezoneOffset();
        long long8 = date6.getTime();
        boolean boolean9 = date5.after(date6);
        long long10 = date6.getTime();
        java.lang.Object obj11 = date6.clone();
        org.junit.Assert.assertEquals(date5.toString(), "Tue Jan 06 00:01:00 GMT 1903");
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Feb 21 14:46:03 GMT 2022");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1645454763885L + "'", long8 == 1645454763885L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1645454763885L + "'", long10 == 1645454763885L);
        org.junit.Assert.assertNotNull(obj11);
// flaky:         org.junit.Assert.assertEquals(obj11.toString(), "Mon Feb 21 14:46:03 GMT 2022");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "Mon Feb 21 14:46:03 GMT 2022");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "Mon Feb 21 14:46:03 GMT 2022");
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 2);
        java.util.Locale locale6 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale7 = locale6.stripExtensions();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone0, locale7);
        calendar8.set(122, 52, (int) (byte) 1);
        java.lang.String str13 = calendar8.getCalendarType();
        int int14 = calendar8.getWeekYear();
        calendar8.clear();
        int int16 = calendar8.getMinimalDaysInFirstWeek();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = calendar8.getLeastMaximum((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals(locale6.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar8);
        org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "gregory" + "'", str13, "gregory");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 126 + "'", int14 == 126);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone1);
        boolean boolean5 = timeZone1.observesDaylightTime();
        timeZone1.setRawOffset(52);
        timeZone1.setID("Temps universel coordonn\351");
        java.util.Locale locale11 = new java.util.Locale("zh");
        java.util.Locale locale12 = java.util.Locale.CHINESE;
        java.lang.String str13 = locale12.getLanguage();
        boolean boolean14 = locale12.hasExtensions();
        java.lang.String str15 = locale12.getDisplayCountry();
        java.lang.String str16 = locale11.getDisplayName(locale12);
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(timeZone1, locale11);
        calendar17.clear();
        // The following exception was thrown during execution in test generation
        try {
            calendar17.set(32770, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32770");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals(locale11.toString(), "zh");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "zh" + "'", str13, "zh");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u4e2d\u6587" + "'", str16, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar17);
        org.junit.Assert.assertEquals(calendar17.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Temps universel coordonn\351\",offset=52,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 2);
        java.util.Locale locale6 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale7 = locale6.stripExtensions();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone0, locale7);
        int int10 = calendar8.getLeastMaximum(4);
        calendar8.setFirstDayOfWeek((-1));
        // The following exception was thrown during execution in test generation
        try {
            calendar8.add(55, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals(locale6.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=1645454764343,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=-1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=4,MILLISECOND=343,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh_TW" + "'", str2, "zh_TW");
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        boolean boolean5 = locale4.hasExtensions();
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.util.Locale locale7 = java.util.Locale.CHINESE;
        java.lang.String str8 = locale7.getLanguage();
        java.util.Locale[] localeArray9 = new java.util.Locale[] { locale3, locale4, locale6, locale7 };
        java.util.ArrayList<java.util.Locale> localeList10 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList10, localeArray9);
        java.util.Locale.FilteringMode filteringMode12 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList13 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList10, filteringMode12);
        java.util.Spliterator<java.util.Locale> localeSpliterator14 = localeList13.spliterator();
        boolean boolean15 = localeList13.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale17 = localeList13.remove(11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 11, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh" + "'", str8, "zh");
        org.junit.Assert.assertNotNull(localeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + filteringMode12 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode12.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList13);
        org.junit.Assert.assertNotNull(localeSpliterator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        boolean boolean4 = timeZone2.hasSameRules(timeZone3);
        java.util.Locale locale8 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale9 = locale8.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(56, 16, timeZone3, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 16");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals(locale8.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "_HI!");
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        java.util.Locale locale7 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale8 = locale7.stripExtensions();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone1, locale7);
        java.util.TimeZone timeZone10 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone11 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone12 = java.util.TimeZone.getDefault();
        boolean boolean13 = timeZone11.hasSameRules(timeZone12);
        boolean boolean14 = timeZone10.hasSameRules(timeZone11);
        boolean boolean15 = timeZone11.observesDaylightTime();
        timeZone11.setRawOffset(52);
        timeZone11.setID("Temps universel coordonn\351");
        java.util.Locale locale21 = new java.util.Locale("zh");
        java.util.Locale locale22 = java.util.Locale.CHINESE;
        java.lang.String str23 = locale22.getLanguage();
        boolean boolean24 = locale22.hasExtensions();
        java.lang.String str25 = locale22.getDisplayCountry();
        java.lang.String str26 = locale21.getDisplayName(locale22);
        java.util.Calendar calendar27 = java.util.Calendar.getInstance(timeZone11, locale21);
        java.lang.String str28 = fastDateFormat9.format(calendar27);
        calendar27.set((int) (short) 0, 0, 58);
        // The following exception was thrown during execution in test generation
        try {
            calendar27.roll(52, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals(locale7.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "_HI!");
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals(locale21.toString(), "zh");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "zh" + "'", str23, "zh");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\u4e2d\u6587" + "'", str26, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar27);
// flaky:         org.junit.Assert.assertEquals(calendar27.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Temps universel coordonn\351\",offset=52,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=0,MONTH=0,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=58,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=4,MILLISECOND=509,ZONE_OFFSET=52,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = java.util.Locale.CHINESE;
        java.lang.String str3 = locale2.getLanguage();
        boolean boolean4 = locale2.hasExtensions();
        java.lang.String str5 = locale2.getDisplayCountry();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(55, timeZone1, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 55");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh" + "'", str3, "zh");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        boolean boolean5 = locale4.hasExtensions();
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.util.Locale locale7 = java.util.Locale.CHINESE;
        java.lang.String str8 = locale7.getLanguage();
        java.util.Locale[] localeArray9 = new java.util.Locale[] { locale3, locale4, locale6, locale7 };
        java.util.ArrayList<java.util.Locale> localeList10 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList10, localeArray9);
        java.util.Locale.FilteringMode filteringMode12 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList13 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList10, filteringMode12);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList15 = java.util.Locale.LanguageRange.parse("zho");
        java.util.Set<java.lang.String> strSet16 = java.util.Calendar.getAvailableCalendarTypes();
        java.util.stream.Stream<java.lang.String> strStream17 = strSet16.parallelStream();
        java.lang.String str18 = java.util.Locale.lookupTag(languageRangeList15, (java.util.Collection<java.lang.String>) strSet16);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList20 = java.util.Locale.LanguageRange.parse("zho");
        java.util.Set<java.lang.String> strSet21 = java.util.Calendar.getAvailableCalendarTypes();
        java.util.stream.Stream<java.lang.String> strStream22 = strSet21.parallelStream();
        java.lang.String str23 = java.util.Locale.lookupTag(languageRangeList20, (java.util.Collection<java.lang.String>) strSet21);
        java.util.stream.Stream<java.lang.String> strStream24 = strSet21.stream();
        java.util.List<java.lang.String> strList25 = java.util.Locale.filterTags(languageRangeList15, (java.util.Collection<java.lang.String>) strSet21);
        boolean boolean26 = localeList13.containsAll((java.util.Collection<java.lang.String>) strList25);
        java.util.Locale locale28 = java.util.Locale.KOREAN;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale29 = localeList13.set(45, locale28);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 45, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh" + "'", str8, "zh");
        org.junit.Assert.assertNotNull(localeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + filteringMode12 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode12.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList13);
        org.junit.Assert.assertNotNull(languageRangeList15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strStream17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(languageRangeList20);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(strStream22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(strStream24);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "ko");
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        boolean boolean5 = locale4.hasExtensions();
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.util.Locale locale7 = java.util.Locale.CHINESE;
        java.lang.String str8 = locale7.getLanguage();
        java.util.Locale[] localeArray9 = new java.util.Locale[] { locale3, locale4, locale6, locale7 };
        java.util.ArrayList<java.util.Locale> localeList10 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList10, localeArray9);
        java.util.Locale.FilteringMode filteringMode12 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList13 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList10, filteringMode12);
        java.util.Locale locale18 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale19 = locale18.stripExtensions();
        boolean boolean20 = locale18.hasExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale21 = localeList13.set(51, locale18);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 51, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh" + "'", str8, "zh");
        org.junit.Assert.assertNotNull(localeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + filteringMode12 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode12.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList13);
        org.junit.Assert.assertEquals(locale18.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "_HI!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 2);
        int int3 = timeZone0.getDSTSavings();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str3 = timeZone2.getID();
        java.util.TimeZone.setDefault(timeZone2);
        java.util.Locale locale5 = java.util.Locale.ROOT;
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.lang.String str7 = locale5.getDisplayLanguage(locale6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(56, timeZone2, locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 56");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GMT" + "'", str3, "GMT");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setWeekDate(5, (int) (byte) -1, 1);
        java.util.Calendar.Builder builder6 = builder4.setLenient(true);
        java.util.Calendar.Builder builder10 = builder6.setTimeOfDay(122, 11, 10);
        java.util.Calendar.Builder builder14 = builder10.setWeekDate(100, 9, 2);
        java.util.Calendar.Builder builder18 = builder14.setTimeOfDay(52, (int) (short) 10, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder21 = builder18.setWeekDefinition(59, 54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "France");
        java.util.Locale.Builder builder5 = builder0.removeUnicodeLocaleAttribute("GMT");
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.lang.String str7 = locale6.getVariant();
        java.lang.String str8 = locale6.getDisplayCountry();
        java.util.Locale.Builder builder9 = builder0.setLocale(locale6);
        java.util.Locale locale10 = builder9.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder9.setScript("java.text.AttributedCharacterIterator$Attribute(input_method_segment)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: java.text.AttributedCharacterIterator$Attribute(input_method_segment) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u6cd5\u56fd" + "'", str8, "\u6cd5\u56fd");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_FR");
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        boolean boolean5 = locale4.hasExtensions();
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.util.Locale locale7 = java.util.Locale.CHINESE;
        java.lang.String str8 = locale7.getLanguage();
        java.util.Locale[] localeArray9 = new java.util.Locale[] { locale3, locale4, locale6, locale7 };
        java.util.ArrayList<java.util.Locale> localeList10 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList10, localeArray9);
        java.util.Locale.FilteringMode filteringMode12 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList13 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList10, filteringMode12);
        java.util.ListIterator<java.util.Locale> localeItor14 = localeList13.listIterator();
        java.util.Iterator<java.util.Locale> localeItor15 = localeList13.iterator();
        java.util.Locale.LanguageRange[] languageRangeArray16 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList17 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList17, languageRangeArray16);
        java.util.Locale locale19 = java.util.Locale.GERMAN;
        java.util.Locale locale20 = java.util.Locale.FRANCE;
        boolean boolean21 = locale20.hasExtensions();
        java.util.Locale locale22 = java.util.Locale.FRANCE;
        java.util.Locale locale23 = java.util.Locale.CHINESE;
        java.lang.String str24 = locale23.getLanguage();
        java.util.Locale[] localeArray25 = new java.util.Locale[] { locale19, locale20, locale22, locale23 };
        java.util.ArrayList<java.util.Locale> localeList26 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList26, localeArray25);
        java.util.Locale.FilteringMode filteringMode28 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList29 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.util.Locale>) localeList26, filteringMode28);
        java.util.Set<java.lang.String> strSet30 = java.util.Calendar.getAvailableCalendarTypes();
        java.util.stream.Stream<java.lang.String> strStream31 = strSet30.parallelStream();
        java.lang.String str32 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.lang.String>) strSet30);
        java.util.stream.Stream<java.lang.String> strStream33 = strSet30.parallelStream();
        boolean boolean34 = localeList13.retainAll((java.util.Collection<java.lang.String>) strSet30);
        java.lang.String[] strArray41 = new java.lang.String[] { "java.text.ParsePosition[index=0,errorIndex=0]", "2:45:54 PM UTC", "2:45:56 PM UTC", "2:46:01 PM UTC", "java.text.ParsePosition[index=0,errorIndex=0]", "en_US" };
        java.lang.String[] strArray48 = new java.lang.String[] { "java.text.ParsePosition[index=0,errorIndex=0]", "2:45:54 PM UTC", "2:45:56 PM UTC", "2:46:01 PM UTC", "java.text.ParsePosition[index=0,errorIndex=0]", "en_US" };
        java.lang.String[] strArray55 = new java.lang.String[] { "java.text.ParsePosition[index=0,errorIndex=0]", "2:45:54 PM UTC", "2:45:56 PM UTC", "2:46:01 PM UTC", "java.text.ParsePosition[index=0,errorIndex=0]", "en_US" };
        java.lang.String[] strArray62 = new java.lang.String[] { "java.text.ParsePosition[index=0,errorIndex=0]", "2:45:54 PM UTC", "2:45:56 PM UTC", "2:46:01 PM UTC", "java.text.ParsePosition[index=0,errorIndex=0]", "en_US" };
        java.lang.String[][] strArray63 = new java.lang.String[][] { strArray41, strArray48, strArray55, strArray62 };
        java.lang.String[][] strArray64 = localeList13.toArray(strArray63);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale66 = localeList13.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh" + "'", str8, "zh");
        org.junit.Assert.assertNotNull(localeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + filteringMode12 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode12.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList13);
        org.junit.Assert.assertNotNull(localeItor14);
        org.junit.Assert.assertNotNull(localeItor15);
        org.junit.Assert.assertNotNull(languageRangeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "de");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "zh" + "'", str24, "zh");
        org.junit.Assert.assertNotNull(localeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + filteringMode28 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode28.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList29);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNotNull(strStream31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(strStream33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(strArray64);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        java.util.Locale locale1 = new java.util.Locale("zh");
        java.lang.Object obj2 = locale1.clone();
        org.junit.Assert.assertEquals(locale1.toString(), "zh");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "zh");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "zh");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "zh");
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setWeekDate(5, (int) (byte) -1, 1);
        java.util.Calendar.Builder builder6 = builder4.setLenient(true);
        java.util.Calendar.Builder builder10 = builder6.setTimeOfDay(122, 11, 10);
        java.util.Calendar.Builder builder14 = builder10.setWeekDate(100, 9, 2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder16 = builder10.setCalendarType("2:45:54 PM UTC");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown calendar type: 2:45:54 PM UTC");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        int int0 = java.util.Calendar.HOUR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        java.util.Locale locale5 = new java.util.Locale("java.text.ParsePosition[index=16,errorIndex=-1]", "FastDateFormat[]", "FastDateFormat[]");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(3, 12, locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 12");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale5.toString(), "java.text.parseposition[index=16,errorindex=-1]_FASTDATEFORMAT[]_FastDateFormat[]");
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        int int0 = java.util.Calendar.LONG_FORMAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 12");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("21 Feb 2022 14:45:59 GMT");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: e");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 2);
        java.util.Date date3 = new java.util.Date();
        date3.setMinutes(32770);
        boolean boolean6 = timeZone0.inDaylightTime(date3);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky:         org.junit.Assert.assertEquals(date3.toString(), "Wed Mar 16 08:10:05 GMT 2022");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone1);
        boolean boolean5 = timeZone1.observesDaylightTime();
        timeZone1.setRawOffset(52);
        java.lang.String str8 = timeZone1.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Greenwich Mean Time" + "'", str8, "Greenwich Mean Time");
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("\uc624\ud6c4\uc2dc\ubd84\ucd08 UTC", (double) 32772);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=32772.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone1);
        boolean boolean5 = timeZone1.observesDaylightTime();
        timeZone1.setRawOffset(52);
        timeZone1.setID("Temps universel coordonn\351");
        java.util.Locale locale11 = new java.util.Locale("zh");
        java.util.Locale locale12 = java.util.Locale.CHINESE;
        java.lang.String str13 = locale12.getLanguage();
        boolean boolean14 = locale12.hasExtensions();
        java.lang.String str15 = locale12.getDisplayCountry();
        java.lang.String str16 = locale11.getDisplayName(locale12);
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(timeZone1, locale11);
        java.util.Locale locale20 = java.util.Locale.SIMPLIFIED_CHINESE;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Integer> strMap21 = calendar17.getDisplayNames(52, 2, locale20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals(locale11.toString(), "zh");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "zh" + "'", str13, "zh");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u4e2d\u6587" + "'", str16, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar17);
// flaky:         org.junit.Assert.assertEquals(calendar17.toString(), "java.util.GregorianCalendar[time=1645454766139,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Temps universel coordonn\351\",offset=52,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=6,MILLISECOND=191,ZONE_OFFSET=52,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        boolean boolean2 = timeZone0.hasSameRules(timeZone1);
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone5 = java.util.TimeZone.getDefault();
        boolean boolean6 = timeZone4.hasSameRules(timeZone5);
        boolean boolean7 = timeZone3.hasSameRules(timeZone4);
        boolean boolean8 = timeZone1.hasSameRules(timeZone4);
        java.util.Locale.Builder builder11 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder14 = builder11.setExtension('a', "France");
        java.util.Locale locale16 = java.util.Locale.forLanguageTag("h:mm:ss a z");
        java.util.Locale.Builder builder17 = builder14.setLocale(locale16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = timeZone1.getDisplayName(true, (int) (byte) 100, locale16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 2);
        boolean boolean3 = timeZone0.useDaylightTime();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone1);
        boolean boolean5 = timeZone1.observesDaylightTime();
        timeZone1.setRawOffset(52);
        timeZone1.setID("Temps universel coordonn\351");
        java.util.Locale locale11 = new java.util.Locale("zh");
        java.util.Locale locale12 = java.util.Locale.CHINESE;
        java.lang.String str13 = locale12.getLanguage();
        boolean boolean14 = locale12.hasExtensions();
        java.lang.String str15 = locale12.getDisplayCountry();
        java.lang.String str16 = locale11.getDisplayName(locale12);
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(timeZone1, locale11);
        calendar17.clear();
        long long19 = calendar17.getTimeInMillis();
        java.util.Date date20 = new java.util.Date();
        int int21 = date20.getTimezoneOffset();
        date20.setMinutes(5);
        int int24 = date20.getMonth();
        calendar17.setTime(date20);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = calendar17.getMinimum(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals(locale11.toString(), "zh");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "zh" + "'", str13, "zh");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u4e2d\u6587" + "'", str16, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar17);
// flaky:         org.junit.Assert.assertEquals(calendar17.toString(), "java.util.GregorianCalendar[time=1645452306347,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Temps universel coordonn\351\",offset=52,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=5,SECOND=6,MILLISECOND=399,ZONE_OFFSET=52,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-52L) + "'", long19 == (-52L));
// flaky:         org.junit.Assert.assertEquals(date20.toString(), "Mon Feb 21 14:05:06 GMT 2022");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 2);
        java.util.Locale locale6 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale7 = locale6.stripExtensions();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone0, locale7);
        calendar8.set(122, 52, (int) (byte) 1);
        int int13 = calendar8.getWeeksInWeekYear();
        calendar8.add(13, 0);
        calendar8.set(17, 4, 58, 32769, 7, 54);
        // The following exception was thrown during execution in test generation
        try {
            calendar8.clear(49);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 49");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals(locale6.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=17,MONTH=4,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=58,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=32769,MINUTE=7,SECOND=54,MILLISECOND=373,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone1);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = timeZone1.getOffset(0, (int) '#', 0, (int) 'a', (int) 'u', 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        boolean boolean5 = locale4.hasExtensions();
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.util.Locale locale7 = java.util.Locale.CHINESE;
        java.lang.String str8 = locale7.getLanguage();
        java.util.Locale[] localeArray9 = new java.util.Locale[] { locale3, locale4, locale6, locale7 };
        java.util.ArrayList<java.util.Locale> localeList10 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList10, localeArray9);
        java.util.Locale.FilteringMode filteringMode12 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList13 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList10, filteringMode12);
        java.util.Spliterator<java.util.Locale> localeSpliterator14 = localeList13.spliterator();
        localeList13.clear();
        java.util.Date date21 = new java.util.Date(3, (int) (short) 0, 6, 0, (int) (short) 1);
        date21.setTime(1645454750011L);
        java.time.Instant instant24 = date21.toInstant();
        java.util.Date date25 = new java.util.Date();
        int int26 = date25.getSeconds();
        date25.setTime((long) 16);
        date25.setMinutes(12);
        int int31 = date25.getMinutes();
        java.time.Instant instant32 = date25.toInstant();
        java.util.Date date33 = new java.util.Date();
        int int34 = date33.getSeconds();
        date33.setTime((long) 16);
        date33.setMinutes(12);
        int int39 = date33.getMinutes();
        java.time.Instant instant40 = date33.toInstant();
        java.util.Date date41 = new java.util.Date();
        int int42 = date41.getSeconds();
        date41.setTime((long) 16);
        date41.setMinutes(12);
        int int47 = date41.getMinutes();
        java.time.Instant instant48 = date41.toInstant();
        java.util.Date date49 = new java.util.Date();
        int int50 = date49.getSeconds();
        date49.setTime((long) 16);
        date49.setMinutes(12);
        int int55 = date49.getMinutes();
        java.time.Instant instant56 = date49.toInstant();
        java.util.Date date57 = new java.util.Date();
        int int58 = date57.getSeconds();
        date57.setTime((long) 16);
        date57.setMinutes(12);
        int int63 = date57.getMinutes();
        java.time.Instant instant64 = date57.toInstant();
        java.time.temporal.TemporalAdjuster[] temporalAdjusterArray65 = new java.time.temporal.TemporalAdjuster[] { instant24, instant32, instant40, instant48, instant56, instant64 };
        java.time.temporal.TemporalAdjuster[] temporalAdjusterArray66 = localeList13.toArray(temporalAdjusterArray65);
        java.util.Locale locale68 = java.util.Locale.US;
        java.util.Locale locale69 = locale68.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            localeList13.add(13, locale68);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 13, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh" + "'", str8, "zh");
        org.junit.Assert.assertNotNull(localeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + filteringMode12 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode12.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList13);
        org.junit.Assert.assertNotNull(localeSpliterator14);
        org.junit.Assert.assertEquals(date21.toString(), "Mon Feb 21 14:45:50 GMT 2022");
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:12:00 GMT 1970");
// flaky:         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 6 + "'", int26 == 6);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 12 + "'", int31 == 12);
        org.junit.Assert.assertNotNull(instant32);
        org.junit.Assert.assertEquals(date33.toString(), "Thu Jan 01 00:12:00 GMT 1970");
// flaky:         org.junit.Assert.assertTrue("'" + int34 + "' != '" + 6 + "'", int34 == 6);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 12 + "'", int39 == 12);
        org.junit.Assert.assertNotNull(instant40);
        org.junit.Assert.assertEquals(date41.toString(), "Thu Jan 01 00:12:00 GMT 1970");
// flaky:         org.junit.Assert.assertTrue("'" + int42 + "' != '" + 6 + "'", int42 == 6);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 12 + "'", int47 == 12);
        org.junit.Assert.assertNotNull(instant48);
        org.junit.Assert.assertEquals(date49.toString(), "Thu Jan 01 00:12:00 GMT 1970");
// flaky:         org.junit.Assert.assertTrue("'" + int50 + "' != '" + 6 + "'", int50 == 6);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 12 + "'", int55 == 12);
        org.junit.Assert.assertNotNull(instant56);
        org.junit.Assert.assertEquals(date57.toString(), "Thu Jan 01 00:12:00 GMT 1970");
// flaky:         org.junit.Assert.assertTrue("'" + int58 + "' != '" + 6 + "'", int58 == 6);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 12 + "'", int63 == 12);
        org.junit.Assert.assertNotNull(instant64);
        org.junit.Assert.assertNotNull(temporalAdjusterArray65);
        org.junit.Assert.assertNotNull(temporalAdjusterArray66);
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "en_US");
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.util.Locale locale2 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone1, locale2);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = calendar3.get(49);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 49");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1645454766423,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=6,MILLISECOND=423,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.util.Date date4 = new java.util.Date();
        int int5 = date4.getSeconds();
        java.lang.String str6 = fastDateFormat2.format(date4);
        java.lang.String str7 = date4.toGMTString();
        int int8 = date4.getDate();
        java.lang.Object obj9 = null;
        boolean boolean10 = date4.equals(obj9);
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h:mm:ss a z" + "'", str3, "h:mm:ss a z");
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Mon Feb 21 14:46:06 GMT 2022");
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2:46:06 PM UTC" + "'", str6, "2:46:06 PM UTC");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "21 Feb 2022 14:46:06 GMT" + "'", str7, "21 Feb 2022 14:46:06 GMT");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 21 + "'", int8 == 21);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        java.util.Locale locale1 = java.util.Locale.KOREA;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, locale1);
        java.lang.String str4 = fastDateFormat2.format((java.lang.Object) 1645454750118L);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator6 = fastDateFormat2.formatToCharacterIterator((java.lang.Object) 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(fastDateFormat2);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\uc624\ud6c4\uc2dc\ubd84\ucd08 UTC" + "'", str4, "\uc624\ud6c4\uc2dc\ubd84\ucd08 UTC");
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 2);
        java.util.Locale locale6 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale7 = locale6.stripExtensions();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone0, locale7);
        calendar8.set(122, 52, (int) (byte) 1);
        int int13 = calendar8.getWeeksInWeekYear();
        calendar8.add(13, 0);
        java.util.Calendar.Builder builder17 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder21 = builder17.setWeekDate(5, (int) (byte) -1, 1);
        java.util.Calendar.Builder builder23 = builder21.setLenient(true);
        java.util.Calendar.Builder builder27 = builder23.setTimeOfDay(122, 11, 10);
        java.util.Calendar.Builder builder31 = builder27.setWeekDate(100, 9, 2);
        java.util.TimeZone timeZone32 = java.util.TimeZone.getDefault();
        java.util.Calendar.Builder builder33 = builder31.setTimeZone(timeZone32);
        calendar8.setTimeZone(timeZone32);
        java.lang.String str35 = timeZone32.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals(locale6.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=122,MONTH=52,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=1,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=6,MILLISECOND=648,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(timeZone32);
        org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Greenwich Mean Time" + "'", str35, "Greenwich Mean Time");
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str3 = timeZone2.getID();
        java.util.TimeZone.setDefault(timeZone2);
        java.util.Locale locale5 = java.util.Locale.CANADA_FRENCH;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(126, timeZone2, locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 126");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GMT" + "'", str3, "GMT");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_CA");
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone1);
        boolean boolean5 = timeZone1.observesDaylightTime();
        timeZone1.setRawOffset(52);
        timeZone1.setID("Temps universel coordonn\351");
        java.util.Locale locale11 = new java.util.Locale("zh");
        java.util.Locale locale12 = java.util.Locale.CHINESE;
        java.lang.String str13 = locale12.getLanguage();
        boolean boolean14 = locale12.hasExtensions();
        java.lang.String str15 = locale12.getDisplayCountry();
        java.lang.String str16 = locale11.getDisplayName(locale12);
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(timeZone1, locale11);
        calendar17.clear();
        long long19 = calendar17.getTimeInMillis();
        java.util.Date date20 = new java.util.Date();
        int int21 = date20.getTimezoneOffset();
        date20.setMinutes(5);
        int int24 = date20.getMonth();
        calendar17.setTime(date20);
        java.util.Locale locale27 = new java.util.Locale("zh");
        java.util.Locale locale28 = java.util.Locale.CHINESE;
        java.lang.String str29 = locale28.getLanguage();
        boolean boolean30 = locale28.hasExtensions();
        java.lang.String str31 = locale28.getDisplayCountry();
        java.lang.String str32 = locale27.getDisplayName(locale28);
        java.util.Locale.setDefault(locale27);
        boolean boolean34 = calendar17.equals((java.lang.Object) locale27);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals(locale11.toString(), "zh");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "zh" + "'", str13, "zh");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u4e2d\u6587" + "'", str16, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar17);
// flaky:         org.junit.Assert.assertEquals(calendar17.toString(), "java.util.GregorianCalendar[time=1645452306702,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Temps universel coordonn\351\",offset=52,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=5,SECOND=6,MILLISECOND=754,ZONE_OFFSET=52,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-52L) + "'", long19 == (-52L));
// flaky:         org.junit.Assert.assertEquals(date20.toString(), "Mon Feb 21 14:05:06 GMT 2022");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals(locale27.toString(), "zh");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "zh" + "'", str29, "zh");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\u4e2d\u6587" + "'", str32, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        java.util.Date date0 = new java.util.Date();
        int int1 = date0.getTimezoneOffset();
        date0.setMinutes(5);
        int int4 = date0.getMonth();
        java.util.Date date5 = new java.util.Date();
        int int6 = date5.getSeconds();
        java.util.Date date7 = new java.util.Date();
        int int8 = date7.getTimezoneOffset();
        date7.setMinutes(5);
        boolean boolean11 = date5.after(date7);
        long long12 = date7.getTime();
        boolean boolean13 = date0.after(date7);
        java.util.Locale locale14 = java.util.Locale.CHINESE;
        java.lang.String str15 = locale14.getLanguage();
        boolean boolean16 = locale14.hasExtensions();
        java.lang.String str17 = locale14.getDisplayCountry();
        java.util.Set<java.lang.String> strSet18 = locale14.getUnicodeLocaleKeys();
        java.lang.String str19 = locale14.getISO3Language();
        boolean boolean20 = date0.equals((java.lang.Object) locale14);
// flaky:         org.junit.Assert.assertEquals(date0.toString(), "Mon Feb 21 14:05:06 GMT 2022");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Feb 21 14:46:06 GMT 2022");
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Feb 21 14:05:06 GMT 2022");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1645452306868L + "'", long12 == 1645452306868L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "zh" + "'", str15, "zh");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "zho" + "'", str19, "zho");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = java.util.Date.parse("\u6cd5\u56fd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "France");
        java.util.Locale.Builder builder5 = builder0.removeUnicodeLocaleAttribute("GMT");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder0.setExtension('#', "HI!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: # [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "France");
        java.util.Locale.Builder builder5 = builder0.removeUnicodeLocaleAttribute("GMT");
        java.util.Locale locale6 = builder0.build();
        java.util.Locale.Builder builder7 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder0.removeUnicodeLocaleAttribute("2:45:56 PM UTC");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 2:45:56 PM UTC [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str2 = timeZone1.getID();
        java.util.Locale locale6 = new java.util.Locale("2:45:52 PM UTC");
        java.util.Locale locale8 = new java.util.Locale("zh");
        java.lang.String str9 = locale6.getDisplayScript(locale8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = timeZone1.getDisplayName(false, (int) '4', locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GMT" + "'", str2, "GMT");
        org.junit.Assert.assertEquals(locale6.toString(), "2:45:52 pm utc");
        org.junit.Assert.assertEquals(locale8.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 0, (int) '#', locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("Etc/UTC");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setTimeOfDay(16, (int) ' ', 16);
        java.util.Calendar.Builder builder9 = builder4.setTimeOfDay(55, 54, (int) 'a', 3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder11 = builder9.setInstant(1645454760590L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        long long6 = java.util.Date.UTC((int) 'a', 3, (int) 'a', (int) '#', 0, 53);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 868273253000L + "'", long6 == 868273253000L);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setWeekDate(5, (int) (byte) -1, 1);
        java.util.Calendar.Builder builder8 = builder0.setDate(51, 122, 0);
        java.util.Date date14 = new java.util.Date(3, (int) (short) 0, 6, 0, (int) (short) 1);
        date14.setMinutes(0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder17 = builder0.setInstant(date14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals(date14.toString(), "Tue Jan 06 00:00:00 GMT 1903");
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        boolean boolean4 = timeZone2.hasSameRules(timeZone3);
        boolean boolean5 = timeZone1.hasSameRules(timeZone2);
        boolean boolean6 = timeZone2.observesDaylightTime();
        java.util.TimeZone timeZone7 = java.util.TimeZone.getDefault();
        int int9 = timeZone7.getOffset((long) 2);
        java.util.Locale locale13 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale14 = locale13.stripExtensions();
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone7, locale14);
        boolean boolean16 = timeZone2.hasSameRules(timeZone7);
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(timeZone7);
        java.util.Locale locale18 = java.util.Locale.US;
        java.lang.String str19 = locale18.getDisplayVariant();
        java.util.Set<java.lang.String> strSet20 = locale18.getUnicodeLocaleAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(5, timeZone7, locale18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Greenwich Mean Time");
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertEquals(locale13.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar15);
// flaky:         org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=1645454767353,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=35,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=7,MILLISECOND=388,ZONE_OFFSET=35,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(calendar17);
// flaky:         org.junit.Assert.assertEquals(calendar17.toString(), "java.util.GregorianCalendar[time=1645454767353,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=35,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=7,MILLISECOND=388,ZONE_OFFSET=35,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strSet20);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "France");
        java.util.Locale.Builder builder6 = builder1.removeUnicodeLocaleAttribute("GMT");
        java.util.Locale locale7 = java.util.Locale.FRANCE;
        java.lang.String str8 = locale7.getVariant();
        java.lang.String str9 = locale7.getDisplayCountry();
        java.util.Locale.Builder builder10 = builder1.setLocale(locale7);
        java.util.Locale locale12 = new java.util.Locale("zh");
        java.lang.String str13 = locale7.getDisplayName(locale12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) ' ', locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u6cd5\u56fd" + "'", str9, "\u6cd5\u56fd");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertEquals(locale12.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str13, "\u6cd5\u6587\u6cd5\u56fd)");
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "France");
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("h:mm:ss a z");
        java.util.Locale.Builder builder6 = builder3.setLocale(locale5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder3.setRegion("Mon Feb 21 14:45:54 UTC 2022");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: Mon Feb 21 14:45:54 UTC 2022 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 2);
        java.util.Locale locale6 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale7 = locale6.stripExtensions();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone0, locale7);
        calendar8.set(122, 52, (int) (byte) 1);
        java.lang.String str13 = calendar8.getCalendarType();
        calendar8.setTimeInMillis(1645454750284L);
        boolean boolean16 = calendar8.isLenient();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Greenwich Mean Time");
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertEquals(locale6.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=1645454750284,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=35,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=45,SECOND=50,MILLISECOND=319,ZONE_OFFSET=35,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "gregory" + "'", str13, "gregory");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone1);
        boolean boolean5 = timeZone1.observesDaylightTime();
        timeZone1.setRawOffset(52);
        timeZone1.setID("Temps universel coordonn\351");
        java.util.Locale locale11 = new java.util.Locale("zh");
        java.util.Locale locale12 = java.util.Locale.CHINESE;
        java.lang.String str13 = locale12.getLanguage();
        boolean boolean14 = locale12.hasExtensions();
        java.lang.String str15 = locale12.getDisplayCountry();
        java.lang.String str16 = locale11.getDisplayName(locale12);
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(timeZone1, locale11);
        calendar17.clear();
        long long19 = calendar17.getTimeInMillis();
        java.util.Date date20 = new java.util.Date();
        int int21 = date20.getSeconds();
        long long22 = date20.getTime();
        date20.setTime((long) (byte) 0);
        calendar17.setTime(date20);
        calendar17.set(17, 50, (int) (short) 100, 32772, 50);
        java.util.Calendar calendar32 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone34 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone35 = java.util.TimeZone.getDefault();
        boolean boolean36 = timeZone34.hasSameRules(timeZone35);
        java.util.Locale locale40 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale41 = locale40.stripExtensions();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone34, locale40);
        java.util.Date date48 = new java.util.Date(3, (int) (short) 0, 6, 0, (int) (short) 1);
        java.util.Date date49 = new java.util.Date();
        int int50 = date49.getTimezoneOffset();
        long long51 = date49.getTime();
        boolean boolean52 = date48.after(date49);
        java.lang.StringBuffer stringBuffer53 = null;
        java.text.Format.Field field54 = null;
        java.text.FieldPosition fieldPosition56 = new java.text.FieldPosition(field54, 16);
        fieldPosition56.setBeginIndex((int) '4');
        java.lang.StringBuffer stringBuffer59 = fastDateFormat42.format((java.lang.Object) date48, stringBuffer53, fieldPosition56);
        calendar32.setTime(date48);
        boolean boolean61 = calendar17.equals((java.lang.Object) date48);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals(locale11.toString(), "zh");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "zh" + "'", str13, "zh");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u4e2d\u6587" + "'", str16, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar17);
        org.junit.Assert.assertEquals(calendar17.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Temps universel coordonn\351\",offset=52,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=17,MONTH=50,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=100,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=32772,MINUTE=50,SECOND=0,MILLISECOND=52,ZONE_OFFSET=52,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-52L) + "'", long19 == (-52L));
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 00:00:00 GMT 1970");
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1645454767488L + "'", long22 == 1645454767488L);
        org.junit.Assert.assertNotNull(calendar32);
// flaky:         org.junit.Assert.assertEquals(calendar32.toString(), "java.util.GregorianCalendar[time=-2113948740035,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=35,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1903,MONTH=0,WEEK_OF_YEAR=2,WEEK_OF_MONTH=2,DAY_OF_MONTH=6,DAY_OF_YEAR=6,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=1,SECOND=0,MILLISECOND=0,ZONE_OFFSET=35,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone34);
        org.junit.Assert.assertEquals(timeZone34.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone35);
        org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals(locale40.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "_HI!");
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertEquals(date48.toString(), "Tue Jan 06 00:01:00 GMT 1903");
// flaky:         org.junit.Assert.assertEquals(date49.toString(), "Mon Feb 21 14:46:07 GMT 2022");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long51 + "' != '" + 1645454767488L + "'", long51 == 1645454767488L);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(stringBuffer59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        java.util.Locale locale7 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale8 = locale7.stripExtensions();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone1, locale7);
        java.util.TimeZone timeZone11 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone11);
        java.lang.String str13 = fastDateFormat12.getPattern();
        java.util.Date date14 = new java.util.Date();
        int int15 = date14.getSeconds();
        java.lang.String str16 = fastDateFormat12.format(date14);
        java.lang.String str17 = date14.toGMTString();
        java.lang.StringBuffer stringBuffer18 = null;
        java.text.Format.Field field19 = null;
        java.text.FieldPosition fieldPosition21 = new java.text.FieldPosition(field19, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer22 = fastDateFormat9.format((java.lang.Object) str17, stringBuffer18, fieldPosition21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.lang.String");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals(locale7.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "_HI!");
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h:mm:ss a z" + "'", str13, "h:mm:ss a z");
// flaky:         org.junit.Assert.assertEquals(date14.toString(), "Mon Feb 21 14:46:07 GMT 2022");
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2:46:07 PM UTC" + "'", str16, "2:46:07 PM UTC");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "21 Feb 2022 14:46:07 GMT" + "'", str17, "21 Feb 2022 14:46:07 GMT");
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        java.util.TimeZone timeZone1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("en-US", timeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: e");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale.LanguageRange[] languageRangeArray1 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList2 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList2, languageRangeArray1);
        java.util.Locale locale4 = java.util.Locale.GERMAN;
        java.util.Locale locale5 = java.util.Locale.FRANCE;
        boolean boolean6 = locale5.hasExtensions();
        java.util.Locale locale7 = java.util.Locale.FRANCE;
        java.util.Locale locale8 = java.util.Locale.CHINESE;
        java.lang.String str9 = locale8.getLanguage();
        java.util.Locale[] localeArray10 = new java.util.Locale[] { locale4, locale5, locale7, locale8 };
        java.util.ArrayList<java.util.Locale> localeList11 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList11, localeArray10);
        java.util.Locale.FilteringMode filteringMode13 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList14 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.util.Locale>) localeList11, filteringMode13);
        java.util.ListIterator<java.util.Locale> localeItor15 = localeList14.listIterator();
        java.util.Iterator<java.util.Locale> localeItor16 = localeList14.iterator();
        java.util.Locale.LanguageRange[] languageRangeArray17 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList18 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18, languageRangeArray17);
        java.util.Locale locale20 = java.util.Locale.GERMAN;
        java.util.Locale locale21 = java.util.Locale.FRANCE;
        boolean boolean22 = locale21.hasExtensions();
        java.util.Locale locale23 = java.util.Locale.FRANCE;
        java.util.Locale locale24 = java.util.Locale.CHINESE;
        java.lang.String str25 = locale24.getLanguage();
        java.util.Locale[] localeArray26 = new java.util.Locale[] { locale20, locale21, locale23, locale24 };
        java.util.ArrayList<java.util.Locale> localeList27 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList27, localeArray26);
        java.util.Locale.FilteringMode filteringMode29 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList30 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.util.Locale>) localeList27, filteringMode29);
        java.util.Set<java.lang.String> strSet31 = java.util.Calendar.getAvailableCalendarTypes();
        java.util.stream.Stream<java.lang.String> strStream32 = strSet31.parallelStream();
        java.lang.String str33 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.lang.String>) strSet31);
        java.util.stream.Stream<java.lang.String> strStream34 = strSet31.parallelStream();
        boolean boolean35 = localeList14.retainAll((java.util.Collection<java.lang.String>) strSet31);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale36 = java.util.Locale.lookup(languageRangeList0, (java.util.Collection<java.util.Locale>) localeList14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "zh" + "'", str9, "zh");
        org.junit.Assert.assertNotNull(localeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + filteringMode13 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode13.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList14);
        org.junit.Assert.assertNotNull(localeItor15);
        org.junit.Assert.assertNotNull(localeItor16);
        org.junit.Assert.assertNotNull(languageRangeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "de");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "zh" + "'", str25, "zh");
        org.junit.Assert.assertNotNull(localeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + filteringMode29 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode29.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList30);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNotNull(strStream32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(strStream34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "France");
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("h:mm:ss a z");
        java.util.Locale.Builder builder6 = builder3.setLocale(locale5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder3.setUnicodeLocaleKeyword("FastDateFormat[h:mm:ss a z]", "hi!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: FastDateFormat[h:mm:ss a z] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 2);
        java.util.Locale locale6 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale7 = locale6.stripExtensions();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone0, locale7);
        int int10 = calendar8.getLeastMaximum(4);
        calendar8.setFirstDayOfWeek((-1));
        int int13 = calendar8.getFirstDayOfWeek();
        boolean boolean14 = calendar8.isLenient();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Greenwich Mean Time");
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertEquals(locale6.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=1645454767776,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=35,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=-1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=7,MILLISECOND=811,ZONE_OFFSET=35,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        int int0 = java.util.Calendar.YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        int int0 = java.util.Calendar.FRIDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("21 Feb 2022 14:45:59 GMT", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: e");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone1);
        java.lang.String str4 = fastDateFormat2.format((long) '#');
        boolean boolean5 = fastDateFormat2.getTimeZoneOverridesCalendar();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        int int8 = timeZone6.getOffset((long) 2);
        java.util.Locale locale12 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale13 = locale12.stripExtensions();
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone6, locale13);
        int int16 = calendar14.getLeastMaximum(4);
        int int18 = calendar14.getLeastMaximum((int) (byte) 0);
        java.util.Date date19 = new java.util.Date();
        int int20 = date19.getTimezoneOffset();
        int int21 = date19.getSeconds();
        boolean boolean22 = calendar14.after((java.lang.Object) date19);
        java.util.Date date23 = new java.util.Date();
        int int24 = date23.getSeconds();
        date23.setTime((long) 16);
        date23.setMinutes(12);
        int int29 = date23.getSeconds();
        date23.setMinutes(51);
        boolean boolean32 = date19.before(date23);
        java.lang.StringBuffer stringBuffer33 = null;
        java.util.TimeZone timeZone35 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone36 = java.util.TimeZone.getDefault();
        boolean boolean37 = timeZone35.hasSameRules(timeZone36);
        java.util.Locale locale41 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale42 = locale41.stripExtensions();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone35, locale41);
        java.util.Date date49 = new java.util.Date(3, (int) (short) 0, 6, 0, (int) (short) 1);
        java.util.Date date50 = new java.util.Date();
        int int51 = date50.getTimezoneOffset();
        long long52 = date50.getTime();
        boolean boolean53 = date49.after(date50);
        java.lang.StringBuffer stringBuffer54 = null;
        java.text.Format.Field field55 = null;
        java.text.FieldPosition fieldPosition57 = new java.text.FieldPosition(field55, 16);
        fieldPosition57.setBeginIndex((int) '4');
        java.lang.StringBuffer stringBuffer60 = fastDateFormat43.format((java.lang.Object) date49, stringBuffer54, fieldPosition57);
        java.util.Calendar.Builder builder61 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder65 = builder61.setWeekDate(5, (int) (byte) -1, 1);
        java.util.Calendar.Builder builder67 = builder65.setLenient(true);
        java.util.Calendar.Builder builder71 = builder67.setTimeOfDay(122, 11, 10);
        java.util.Calendar.Builder builder75 = builder71.setWeekDate(100, 9, 2);
        java.util.TimeZone timeZone76 = java.util.TimeZone.getDefault();
        java.util.Calendar.Builder builder77 = builder75.setTimeZone(timeZone76);
        boolean boolean78 = fieldPosition57.equals((java.lang.Object) builder75);
        java.lang.String str79 = fieldPosition57.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer80 = fastDateFormat2.format((java.lang.Object) boolean32, stringBuffer33, fieldPosition57);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "12:00:00 AM UTC" + "'", str4, "12:00:00 AM UTC");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Greenwich Mean Time");
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals(locale12.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar14);
// flaky:         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=1645454767878,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=35,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=7,MILLISECOND=913,ZONE_OFFSET=35,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
// flaky:         org.junit.Assert.assertEquals(date19.toString(), "Mon Feb 21 14:46:07 GMT 2022");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:51:00 GMT 1970");
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7 + "'", int24 == 7);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(timeZone35);
        org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone36);
        org.junit.Assert.assertEquals(timeZone36.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals(locale41.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "_HI!");
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertEquals(date49.toString(), "Tue Jan 06 00:01:00 GMT 1903");
// flaky:         org.junit.Assert.assertEquals(date50.toString(), "Mon Feb 21 14:46:07 GMT 2022");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long52 + "' != '" + 1645454767879L + "'", long52 == 1645454767879L);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(stringBuffer60);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(builder75);
        org.junit.Assert.assertNotNull(timeZone76);
        org.junit.Assert.assertEquals(timeZone76.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(builder77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "java.text.FieldPosition[field=16,attribute=null,beginIndex=52,endIndex=0]" + "'", str79, "java.text.FieldPosition[field=16,attribute=null,beginIndex=52,endIndex=0]");
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        boolean boolean2 = timeZone0.hasSameRules(timeZone1);
        timeZone1.setID("Etc/UTC");
        boolean boolean5 = timeZone1.useDaylightTime();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone5 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        boolean boolean7 = timeZone5.hasSameRules(timeZone6);
        boolean boolean8 = timeZone4.hasSameRules(timeZone5);
        boolean boolean9 = timeZone5.observesDaylightTime();
        timeZone5.setRawOffset(52);
        timeZone5.setID("Temps universel coordonn\351");
        java.util.Locale locale15 = new java.util.Locale("zh");
        java.util.Locale locale16 = java.util.Locale.CHINESE;
        java.lang.String str17 = locale16.getLanguage();
        boolean boolean18 = locale16.hasExtensions();
        java.lang.String str19 = locale16.getDisplayCountry();
        java.lang.String str20 = locale15.getDisplayName(locale16);
        java.util.Calendar calendar21 = java.util.Calendar.getInstance(timeZone5, locale15);
        calendar21.clear();
        java.lang.String str23 = fastDateFormat2.format(calendar21);
        calendar21.setFirstDayOfWeek(8);
        boolean boolean27 = calendar21.isSet(2);
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h:mm:ss a z" + "'", str3, "h:mm:ss a z");
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals(locale15.toString(), "zh");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "zh" + "'", str17, "zh");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\u4e2d\u6587" + "'", str20, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar21);
        org.junit.Assert.assertEquals(calendar21.toString(), "java.util.GregorianCalendar[time=-52,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Temps universel coordonn\351\",offset=52,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=8,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=52,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "12:00:00 AM GMT+00:00" + "'", str23, "12:00:00 AM GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = fastDateFormat0.parseObject("en-US");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat0);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        boolean boolean4 = timeZone2.hasSameRules(timeZone3);
        boolean boolean5 = timeZone1.hasSameRules(timeZone2);
        int int6 = timeZone2.getRawOffset();
        java.util.TimeZone timeZone7 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone8 = java.util.TimeZone.getDefault();
        boolean boolean9 = timeZone7.hasSameRules(timeZone8);
        timeZone8.setID("Etc/UTC");
        boolean boolean12 = timeZone2.hasSameRules(timeZone8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getInstance("US", timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: U");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("21 Feb 2022 14:46:04 GMT");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=21feb202214:46:04gmt");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        java.util.Locale locale1 = java.util.Locale.KOREA;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, locale1);
        java.lang.String str4 = fastDateFormat2.format((java.lang.Object) 1645454750118L);
        java.util.TimeZone timeZone5 = java.util.TimeZone.getDefault();
        int int7 = timeZone5.getOffset((long) 2);
        java.util.Locale locale11 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale12 = locale11.stripExtensions();
        java.util.Calendar calendar13 = java.util.Calendar.getInstance(timeZone5, locale12);
        int int15 = calendar13.getLeastMaximum(4);
        calendar13.setFirstDayOfWeek((-1));
        int int18 = calendar13.getFirstDayOfWeek();
        java.lang.String str19 = fastDateFormat2.format(calendar13);
        java.util.TimeZone timeZone20 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone21 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getDefault();
        boolean boolean23 = timeZone21.hasSameRules(timeZone22);
        boolean boolean24 = timeZone20.hasSameRules(timeZone21);
        boolean boolean25 = timeZone21.observesDaylightTime();
        timeZone21.setRawOffset(52);
        timeZone21.setID("Temps universel coordonn\351");
        java.util.Locale locale31 = new java.util.Locale("zh");
        java.util.Locale locale32 = java.util.Locale.CHINESE;
        java.lang.String str33 = locale32.getLanguage();
        boolean boolean34 = locale32.hasExtensions();
        java.lang.String str35 = locale32.getDisplayCountry();
        java.lang.String str36 = locale31.getDisplayName(locale32);
        java.util.Calendar calendar37 = java.util.Calendar.getInstance(timeZone21, locale31);
        calendar37.clear();
        java.lang.StringBuffer stringBuffer39 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer40 = fastDateFormat2.format(calendar37, stringBuffer39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(fastDateFormat2);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\uc624\ud6c4\uc2dc\ubd84\ucd08 UTC" + "'", str4, "\uc624\ud6c4\uc2dc\ubd84\ucd08 UTC");
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Heure de Greenwich");
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertEquals(locale11.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar13);
// flaky:         org.junit.Assert.assertEquals(calendar13.toString(), "java.util.GregorianCalendar[time=1645454768061,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=35,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=-1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=8,MILLISECOND=96,ZONE_OFFSET=35,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\uc624\ud6c4\uc2dc\ubd84\ucd08 GMT" + "'", str19, "\uc624\ud6c4\uc2dc\ubd84\ucd08 GMT");
        org.junit.Assert.assertNotNull(timeZone20);
// flaky:         org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone22);
// flaky:         org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals(locale31.toString(), "zh");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "zh" + "'", str33, "zh");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\u4e2d\u6587" + "'", str36, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar37);
        org.junit.Assert.assertEquals(calendar37.toString(), "java.util.GregorianCalendar[time=-52,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Temps universel coordonn\351\",offset=52,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=52,DST_OFFSET=0]");
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs(126);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        java.util.Date date0 = new java.util.Date();
        int int1 = date0.getSeconds();
        date0.setTime((long) 16);
        date0.setMinutes(12);
        int int6 = date0.getSeconds();
        date0.setMinutes(51);
        date0.setYear(15);
        org.junit.Assert.assertEquals(date0.toString(), "Fri Jan 01 00:51:00 GMT 1915");
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone1);
        boolean boolean5 = timeZone1.observesDaylightTime();
        timeZone1.setRawOffset(52);
        timeZone1.setID("Temps universel coordonn\351");
        java.util.Locale locale11 = new java.util.Locale("zh");
        java.util.Locale locale12 = java.util.Locale.CHINESE;
        java.lang.String str13 = locale12.getLanguage();
        boolean boolean14 = locale12.hasExtensions();
        java.lang.String str15 = locale12.getDisplayCountry();
        java.lang.String str16 = locale11.getDisplayName(locale12);
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(timeZone1, locale11);
        calendar17.clear();
        long long19 = calendar17.getTimeInMillis();
        java.util.Date date20 = new java.util.Date();
        int int21 = date20.getSeconds();
        long long22 = date20.getTime();
        date20.setTime((long) (byte) 0);
        calendar17.setTime(date20);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = calendar17.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals(locale11.toString(), "zh");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "zh" + "'", str13, "zh");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u4e2d\u6587" + "'", str16, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar17);
        org.junit.Assert.assertEquals(calendar17.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Temps universel coordonn\351\",offset=52,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=52,ZONE_OFFSET=52,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-52L) + "'", long19 == (-52L));
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 00:00:00 GMT 1970");
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1645454768256L + "'", long22 == 1645454768256L);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        java.util.Locale locale1 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleKeys();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(32769, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 32769");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet2);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 2);
        java.util.Date date3 = new java.util.Date();
        int int4 = date3.getSeconds();
        java.util.Date date5 = new java.util.Date();
        int int6 = date5.getTimezoneOffset();
        date5.setMinutes(5);
        boolean boolean9 = date3.after(date5);
        long long10 = date5.getTime();
        java.util.Date date11 = new java.util.Date();
        int int12 = date11.getSeconds();
        boolean boolean13 = date5.before(date11);
        boolean boolean14 = timeZone0.inDaylightTime(date11);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Greenwich Mean Time");
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
// flaky:         org.junit.Assert.assertEquals(date3.toString(), "Mon Feb 21 14:46:08 GMT 2022");
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Feb 21 14:05:08 GMT 2022");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1645452308387L + "'", long10 == 1645452308387L);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Mon Feb 21 14:46:08 GMT 2022");
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        java.util.Locale.Category category1 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.util.Locale.setDefault(category1, locale2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getInstance("java.text.ParsePosition[index=0,errorIndex=0]", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: j");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.FORMAT + "'", category1.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_TW");
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone5 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        boolean boolean7 = timeZone5.hasSameRules(timeZone6);
        boolean boolean8 = timeZone4.hasSameRules(timeZone5);
        boolean boolean9 = timeZone5.observesDaylightTime();
        timeZone5.setRawOffset(52);
        timeZone5.setID("Temps universel coordonn\351");
        java.util.Locale locale15 = new java.util.Locale("zh");
        java.util.Locale locale16 = java.util.Locale.CHINESE;
        java.lang.String str17 = locale16.getLanguage();
        boolean boolean18 = locale16.hasExtensions();
        java.lang.String str19 = locale16.getDisplayCountry();
        java.lang.String str20 = locale15.getDisplayName(locale16);
        java.util.Calendar calendar21 = java.util.Calendar.getInstance(timeZone5, locale15);
        calendar21.clear();
        java.lang.String str23 = fastDateFormat2.format(calendar21);
        calendar21.set((int) (short) 1, (int) (byte) 1, 9);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = calendar21.getMinimum(32772);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32772");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h:mm:ss a z" + "'", str3, "h:mm:ss a z");
        org.junit.Assert.assertNotNull(timeZone4);
// flaky:         org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone6);
// flaky:         org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals(locale15.toString(), "zh");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "zh" + "'", str17, "zh");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\u4e2d\u6587" + "'", str20, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar21);
        org.junit.Assert.assertEquals(calendar21.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Temps universel coordonn\351\",offset=52,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=1,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=9,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=52,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "12:00:00 AM GMT+00:00" + "'", str23, "12:00:00 AM GMT+00:00");
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        java.util.Locale locale2 = java.util.Locale.FRENCH;
        java.lang.String str3 = locale2.getDisplayLanguage();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(15, 3, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 15");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fran\347ais" + "'", str3, "fran\347ais");
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 2);
        java.util.Locale locale6 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale7 = locale6.stripExtensions();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone0, locale7);
        calendar8.set(122, 52, (int) (byte) 1);
        int int13 = calendar8.getWeeksInWeekYear();
        boolean boolean14 = calendar8.isWeekDateSupported();
        calendar8.set(9, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = calendar8.getLeastMaximum((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals(locale6.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=122,MONTH=52,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=1,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=10,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=9,MILLISECOND=143,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        java.text.Format.Field field0 = null;
        java.text.FieldPosition fieldPosition2 = new java.text.FieldPosition(field0, 16);
        fieldPosition2.setBeginIndex(12);
        int int5 = fieldPosition2.getField();
        java.lang.Class<?> wildcardClass6 = fieldPosition2.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("US");
        java.util.Locale.LanguageRange[] languageRangeArray2 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList3 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList3, languageRangeArray2);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        boolean boolean7 = locale6.hasExtensions();
        java.util.Locale locale8 = java.util.Locale.FRANCE;
        java.util.Locale locale9 = java.util.Locale.CHINESE;
        java.lang.String str10 = locale9.getLanguage();
        java.util.Locale[] localeArray11 = new java.util.Locale[] { locale5, locale6, locale8, locale9 };
        java.util.ArrayList<java.util.Locale> localeList12 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList12, localeArray11);
        java.util.Locale.FilteringMode filteringMode14 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList15 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.util.Locale>) localeList12, filteringMode14);
        java.util.Spliterator<java.util.Locale> localeSpliterator16 = localeList15.spliterator();
        java.lang.Object[] objArray17 = localeList15.toArray();
        java.util.Spliterator<java.util.Locale> localeSpliterator18 = localeList15.spliterator();
        boolean boolean19 = languageRange1.equals((java.lang.Object) localeSpliterator18);
        org.junit.Assert.assertNotNull(languageRangeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "zh" + "'", str10, "zh");
        org.junit.Assert.assertNotNull(localeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + filteringMode14 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode14.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList15);
        org.junit.Assert.assertNotNull(localeSpliterator16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(localeSpliterator18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder2 = builder0.setCalendarType("2:46:01 PM UTC");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown calendar type: 2:46:01 PM UTC");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str3 = timeZone2.getID();
        java.util.TimeZone.setDefault(timeZone2);
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(timeZone2);
        java.util.Locale.Builder builder6 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder9 = builder6.setExtension('a', "France");
        java.util.Locale.Builder builder11 = builder6.removeUnicodeLocaleAttribute("GMT");
        java.util.Locale locale12 = builder6.build();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(35, timeZone2, locale12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone2);
// flaky:         org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GMT" + "'", str3, "GMT");
        org.junit.Assert.assertNotNull(calendar5);
// flaky:         org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=1645454769389,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=9,MILLISECOND=389,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setTimeOfDay(16, (int) ' ', 16);
        java.util.Calendar.Builder builder6 = builder0.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder8 = builder6.setCalendarType("\uc624\ud6c4\uc2dc\ubd84\ucd08 UTC");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown calendar type: ???? 2?? 45??? 50?? UTC");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        java.util.Locale locale4 = new java.util.Locale("en_US", "\uc624\ud6c4\uc2dc\ubd84\ucd08 UTC");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(15, 35, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "\uc624\ud6c4\uc2dc\ubd84\ucd08 UTC");
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        int int0 = java.util.Calendar.ERA;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone1);
        java.util.TimeZone timeZone6 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str7 = timeZone6.getID();
        boolean boolean8 = timeZone1.hasSameRules(timeZone6);
        timeZone6.setRawOffset((int) 'x');
        java.util.TimeZone timeZone11 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone12 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone13 = java.util.TimeZone.getDefault();
        boolean boolean14 = timeZone12.hasSameRules(timeZone13);
        boolean boolean15 = timeZone11.hasSameRules(timeZone12);
        boolean boolean16 = timeZone12.observesDaylightTime();
        timeZone12.setRawOffset(52);
        timeZone12.setID("Temps universel coordonn\351");
        java.util.Locale locale22 = new java.util.Locale("zh");
        java.util.Locale locale23 = java.util.Locale.CHINESE;
        java.lang.String str24 = locale23.getLanguage();
        boolean boolean25 = locale23.hasExtensions();
        java.lang.String str26 = locale23.getDisplayCountry();
        java.lang.String str27 = locale22.getDisplayName(locale23);
        java.util.Calendar calendar28 = java.util.Calendar.getInstance(timeZone12, locale22);
        calendar28.clear();
        long long30 = calendar28.getTimeInMillis();
        java.util.Date date31 = new java.util.Date();
        int int32 = date31.getSeconds();
        long long33 = date31.getTime();
        date31.setTime((long) (byte) 0);
        calendar28.setTime(date31);
        boolean boolean37 = timeZone6.inDaylightTime(date31);
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone2);
// flaky:         org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(timeZone6);
// flaky:         org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GMT" + "'", str7, "GMT");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(timeZone11);
// flaky:         org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone13);
// flaky:         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals(locale22.toString(), "zh");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "zh" + "'", str24, "zh");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\u4e2d\u6587" + "'", str27, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar28);
        org.junit.Assert.assertEquals(calendar28.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Temps universel coordonn\351\",offset=52,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=52,ZONE_OFFSET=52,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-52L) + "'", long30 == (-52L));
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:00:00 GMT 1970");
// flaky:         org.junit.Assert.assertTrue("'" + int32 + "' != '" + 9 + "'", int32 == 9);
// flaky:         org.junit.Assert.assertTrue("'" + long33 + "' != '" + 1645454769526L + "'", long33 == 1645454769526L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 2);
        java.util.Locale locale6 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale7 = locale6.stripExtensions();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone0, locale7);
        boolean boolean9 = timeZone0.observesDaylightTime();
        java.util.TimeZone timeZone10 = java.util.TimeZone.getDefault();
        int int12 = timeZone10.getOffset((long) 2);
        java.util.Locale locale16 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale17 = locale16.stripExtensions();
        java.util.Calendar calendar18 = java.util.Calendar.getInstance(timeZone10, locale17);
        int int20 = calendar18.getLeastMaximum(4);
        int int22 = calendar18.getLeastMaximum((int) (byte) 0);
        java.util.Date date23 = new java.util.Date();
        int int24 = date23.getTimezoneOffset();
        int int25 = date23.getSeconds();
        boolean boolean26 = calendar18.after((java.lang.Object) date23);
        java.util.Date date27 = new java.util.Date();
        int int28 = date27.getSeconds();
        date27.setTime((long) 16);
        date27.setMinutes(12);
        int int33 = date27.getSeconds();
        date27.setMinutes(51);
        boolean boolean36 = date23.before(date27);
        boolean boolean37 = timeZone0.inDaylightTime(date23);
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals(locale6.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=1645454769552,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=9,MILLISECOND=552,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(timeZone10);
// flaky:         org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals(locale16.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar18);
// flaky:         org.junit.Assert.assertEquals(calendar18.toString(), "java.util.GregorianCalendar[time=1645454769552,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=9,MILLISECOND=552,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Mon Feb 21 14:46:09 GMT 2022");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 9 + "'", int25 == 9);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:51:00 GMT 1970");
// flaky:         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 9 + "'", int28 == 9);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone5 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        boolean boolean7 = timeZone5.hasSameRules(timeZone6);
        boolean boolean8 = timeZone4.hasSameRules(timeZone5);
        boolean boolean9 = timeZone5.observesDaylightTime();
        timeZone5.setRawOffset(52);
        timeZone5.setID("Temps universel coordonn\351");
        java.util.Locale locale15 = new java.util.Locale("zh");
        java.util.Locale locale16 = java.util.Locale.CHINESE;
        java.lang.String str17 = locale16.getLanguage();
        boolean boolean18 = locale16.hasExtensions();
        java.lang.String str19 = locale16.getDisplayCountry();
        java.lang.String str20 = locale15.getDisplayName(locale16);
        java.util.Calendar calendar21 = java.util.Calendar.getInstance(timeZone5, locale15);
        calendar21.clear();
        java.lang.String str23 = fastDateFormat2.format(calendar21);
        // The following exception was thrown during execution in test generation
        try {
            calendar21.setWeekDate(51, (int) (short) 1, 51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: 51");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h:mm:ss a z" + "'", str3, "h:mm:ss a z");
        org.junit.Assert.assertNotNull(timeZone4);
// flaky:         org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone6);
// flaky:         org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals(locale15.toString(), "zh");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "zh" + "'", str17, "zh");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\u4e2d\u6587" + "'", str20, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar21);
        org.junit.Assert.assertEquals(calendar21.toString(), "java.util.GregorianCalendar[time=-52,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Temps universel coordonn\351\",offset=52,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=52,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "12:00:00 AM GMT+00:00" + "'", str23, "12:00:00 AM GMT+00:00");
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 2);
        java.util.Locale locale6 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale7 = locale6.stripExtensions();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone0, locale7);
        calendar8.set(122, 52, (int) (byte) 1);
        java.lang.String str13 = calendar8.getCalendarType();
        int int14 = calendar8.getWeekYear();
        calendar8.clear();
        calendar8.setLenient(true);
        java.util.Locale.LanguageRange[] languageRangeArray18 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList19 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList19, languageRangeArray18);
        java.util.Locale locale21 = java.util.Locale.CHINESE;
        java.lang.String str22 = locale21.getLanguage();
        boolean boolean23 = locale21.hasExtensions();
        java.lang.String str24 = locale21.getDisplayCountry();
        java.util.Set<java.lang.String> strSet25 = locale21.getUnicodeLocaleKeys();
        java.lang.String str26 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList19, (java.util.Collection<java.lang.String>) strSet25);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap27 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList28 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList19, strMap27);
        java.util.Locale locale29 = java.util.Locale.US;
        java.util.Locale locale30 = locale29.stripExtensions();
        java.util.Set<java.lang.String> strSet31 = locale30.getUnicodeLocaleKeys();
        java.lang.String str32 = java.util.Locale.lookupTag(languageRangeList28, (java.util.Collection<java.lang.String>) strSet31);
        boolean boolean33 = calendar8.equals((java.lang.Object) languageRangeList28);
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals(locale6.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar8);
        org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "gregory" + "'", str13, "gregory");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 126 + "'", int14 == 126);
        org.junit.Assert.assertNotNull(languageRangeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "zh" + "'", str22, "zh");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(languageRangeList28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "en_US");
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        int int0 = java.util.Calendar.JULY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.util.Locale.setDefault(locale1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(56, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 56");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        java.util.Locale locale1 = java.util.Locale.US;
        java.lang.String str2 = locale1.getCountry();
        boolean boolean3 = locale1.hasExtensions();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("GMT", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "US" + "'", str2, "US");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone1);
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(timeZone1);
        boolean boolean6 = timeZone1.useDaylightTime();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(calendar5);
// flaky:         org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=1645454769717,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=9,MILLISECOND=717,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 2);
        java.util.Locale locale6 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale7 = locale6.stripExtensions();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone0, locale7);
        calendar8.set(122, 52, (int) (byte) 1);
        calendar8.setMinimalDaysInFirstWeek(8);
        int int16 = calendar8.getGreatestMinimum(8);
        int int18 = calendar8.get(10);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals(locale6.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=-58180670030274,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=8,ERA=1,YEAR=126,MONTH=4,WEEK_OF_YEAR=17,WEEK_OF_MONTH=0,DAY_OF_MONTH=1,DAY_OF_YEAR=121,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=9,MILLISECOND=726,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = java.util.Locale.US;
        java.util.Locale locale4 = locale3.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(51, (int) 'a', timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        int int0 = java.util.Calendar.LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("GMT", (double) 1);
        double double3 = languageRange2.getWeight();
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.util.Locale locale7 = java.util.Locale.GERMAN;
        java.util.Locale locale8 = java.util.Locale.FRANCE;
        boolean boolean9 = locale8.hasExtensions();
        java.util.Locale locale10 = java.util.Locale.FRANCE;
        java.util.Locale locale11 = java.util.Locale.CHINESE;
        java.lang.String str12 = locale11.getLanguage();
        java.util.Locale[] localeArray13 = new java.util.Locale[] { locale7, locale8, locale10, locale11 };
        java.util.ArrayList<java.util.Locale> localeList14 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList14, localeArray13);
        java.util.Locale.FilteringMode filteringMode16 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList17 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.util.Locale>) localeList14, filteringMode16);
        java.util.Spliterator<java.util.Locale> localeSpliterator18 = localeList17.spliterator();
        java.lang.Object[] objArray19 = localeList17.toArray();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList21 = java.util.Locale.LanguageRange.parse("zho");
        java.util.Set<java.lang.String> strSet22 = java.util.Calendar.getAvailableCalendarTypes();
        java.util.stream.Stream<java.lang.String> strStream23 = strSet22.parallelStream();
        java.lang.String str24 = java.util.Locale.lookupTag(languageRangeList21, (java.util.Collection<java.lang.String>) strSet22);
        java.util.stream.Stream<java.lang.String> strStream25 = strSet22.stream();
        boolean boolean26 = localeList17.containsAll((java.util.Collection<java.lang.String>) strSet22);
        java.util.Spliterator<java.util.Locale> localeSpliterator27 = localeList17.spliterator();
        java.lang.Object[] objArray28 = localeList17.toArray();
        boolean boolean29 = languageRange2.equals((java.lang.Object) objArray28);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "zh" + "'", str12, "zh");
        org.junit.Assert.assertNotNull(localeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + filteringMode16 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode16.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList17);
        org.junit.Assert.assertNotNull(localeSpliterator18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(languageRangeList21);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(strStream23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(strStream25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(localeSpliterator27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        boolean boolean5 = locale4.hasExtensions();
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.util.Locale locale7 = java.util.Locale.CHINESE;
        java.lang.String str8 = locale7.getLanguage();
        java.util.Locale[] localeArray9 = new java.util.Locale[] { locale3, locale4, locale6, locale7 };
        java.util.ArrayList<java.util.Locale> localeList10 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList10, localeArray9);
        java.util.Locale.FilteringMode filteringMode12 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList13 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList10, filteringMode12);
        java.util.Spliterator<java.util.Locale> localeSpliterator14 = localeList13.spliterator();
        java.lang.Object[] objArray15 = localeList13.toArray();
        localeList13.clear();
        java.util.Locale.Builder builder18 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder21 = builder18.setExtension('a', "France");
        java.util.Locale locale23 = java.util.Locale.forLanguageTag("h:mm:ss a z");
        java.util.Locale.Builder builder24 = builder21.setLocale(locale23);
        java.util.Locale locale25 = locale23.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            localeList13.add(54, locale23);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 54, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh" + "'", str8, "zh");
        org.junit.Assert.assertNotNull(localeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + filteringMode12 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode12.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList13);
        org.junit.Assert.assertNotNull(localeSpliterator14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "");
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setWeekDate(5, (int) (byte) -1, 1);
        java.util.Calendar.Builder builder8 = builder0.setDate(51, 122, 0);
        java.util.Calendar.Builder builder12 = builder0.setWeekDate((int) (short) 0, 8, 16);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar13 = builder12.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: 16");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        boolean boolean4 = timeZone2.hasSameRules(timeZone3);
        boolean boolean5 = timeZone1.hasSameRules(timeZone2);
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone7 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone8 = java.util.TimeZone.getDefault();
        boolean boolean9 = timeZone7.hasSameRules(timeZone8);
        boolean boolean10 = timeZone6.hasSameRules(timeZone7);
        java.lang.String str11 = timeZone7.getID();
        boolean boolean12 = timeZone2.hasSameRules(timeZone7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(13, timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 13");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "GMT" + "'", str11, "GMT");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        java.util.Locale locale0 = java.util.Locale.US;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleKeys();
        java.lang.String str3 = locale1.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "en_US" + "'", str3, "en_US");
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 2);
        java.util.Locale locale6 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale7 = locale6.stripExtensions();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone0, locale7);
        calendar8.set(122, 52, (int) (byte) 1);
        calendar8.setMinimalDaysInFirstWeek(8);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = calendar8.getMinimum(52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals(locale6.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=8,ERA=1,YEAR=122,MONTH=52,WEEK_OF_YEAR=17,WEEK_OF_MONTH=0,DAY_OF_MONTH=1,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=10,MILLISECOND=50,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone1);
        boolean boolean5 = timeZone1.observesDaylightTime();
        timeZone1.setRawOffset(52);
        timeZone1.setID("Temps universel coordonn\351");
        java.util.Locale locale11 = new java.util.Locale("zh");
        java.util.Locale locale12 = java.util.Locale.CHINESE;
        java.lang.String str13 = locale12.getLanguage();
        boolean boolean14 = locale12.hasExtensions();
        java.lang.String str15 = locale12.getDisplayCountry();
        java.lang.String str16 = locale11.getDisplayName(locale12);
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(timeZone1, locale11);
        calendar17.clear();
        long long19 = calendar17.getTimeInMillis();
        java.util.Date date20 = new java.util.Date();
        int int21 = date20.getSeconds();
        long long22 = date20.getTime();
        date20.setTime((long) (byte) 0);
        calendar17.setTime(date20);
        java.util.Date date26 = new java.util.Date();
        int int27 = date26.getDay();
        int int28 = date26.getTimezoneOffset();
        date26.setDate((int) (short) 100);
        int int31 = date20.compareTo(date26);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals(locale11.toString(), "zh");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "zh" + "'", str13, "zh");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u4e2d\u6587" + "'", str16, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar17);
        org.junit.Assert.assertEquals(calendar17.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Temps universel coordonn\351\",offset=52,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=52,ZONE_OFFSET=52,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-52L) + "'", long19 == (-52L));
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 00:00:00 GMT 1970");
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1645454770069L + "'", long22 == 1645454770069L);
// flaky:         org.junit.Assert.assertEquals(date26.toString(), "Wed May 11 14:46:10 GMT 2022");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("\u82f1\u6587\u7f8e\u56fd)", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=??(??)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(50, 32772, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 32772");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone1);
        java.lang.String str4 = fastDateFormat2.format((long) '#');
        java.lang.String str6 = fastDateFormat2.format((long) 52);
        boolean boolean7 = fastDateFormat2.getTimeZoneOverridesCalendar();
        java.util.TimeZone timeZone8 = java.util.TimeZone.getDefault();
        int int10 = timeZone8.getOffset((long) 2);
        java.util.Locale locale14 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale15 = locale14.stripExtensions();
        java.util.Calendar calendar16 = java.util.Calendar.getInstance(timeZone8, locale15);
        calendar16.set(122, 52, (int) (byte) 1);
        int int21 = calendar16.getWeeksInWeekYear();
        calendar16.add(13, 0);
        java.util.Calendar.Builder builder25 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder29 = builder25.setWeekDate(5, (int) (byte) -1, 1);
        java.util.Calendar.Builder builder31 = builder29.setLenient(true);
        java.util.Calendar.Builder builder35 = builder31.setTimeOfDay(122, 11, 10);
        java.util.Calendar.Builder builder39 = builder35.setWeekDate(100, 9, 2);
        java.util.TimeZone timeZone40 = java.util.TimeZone.getDefault();
        java.util.Calendar.Builder builder41 = builder39.setTimeZone(timeZone40);
        calendar16.setTimeZone(timeZone40);
        java.lang.StringBuffer stringBuffer43 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer44 = fastDateFormat2.format(calendar16, stringBuffer43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "12:00:00 AM UTC" + "'", str4, "12:00:00 AM UTC");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "12:00:00 AM UTC" + "'", str6, "12:00:00 AM UTC");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals(locale14.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar16);
// flaky:         org.junit.Assert.assertEquals(calendar16.toString(), "java.util.GregorianCalendar[time=-58180670029867,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=126,MONTH=4,WEEK_OF_YEAR=18,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=121,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=10,MILLISECOND=133,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(timeZone40);
        org.junit.Assert.assertEquals(timeZone40.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(builder41);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(55, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 55");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 2);
        java.util.Locale locale6 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale7 = locale6.stripExtensions();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone0, locale7);
        calendar8.set(122, 52, (int) (byte) 1);
        java.lang.String str13 = calendar8.getCalendarType();
        int int14 = calendar8.getWeekYear();
        java.lang.String str15 = calendar8.toString();
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals(locale6.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=-58180670029710,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=126,MONTH=4,WEEK_OF_YEAR=18,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=121,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=10,MILLISECOND=290,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "gregory" + "'", str13, "gregory");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 126 + "'", int14 == 126);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.util.GregorianCalendar[time=-58180670029710,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=126,MONTH=4,WEEK_OF_YEAR=18,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=121,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=10,MILLISECOND=290,ZONE_OFFSET=0,DST_OFFSET=0]" + "'", str15, "java.util.GregorianCalendar[time=-58180670029710,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=126,MONTH=4,WEEK_OF_YEAR=18,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=121,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=10,MILLISECOND=290,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("\uc624\uc804\uc2dc\ubd84\ucd08 UTC");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=?????12??00???00??utc");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("java.util.GregorianCalendar[time=1645454762116,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=2,MILLISECOND=116,ZONE_OFFSET=0,DST_OFFSET=0]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=java.util.gregoriancalendar[time=1645454762116,arefieldsset=true,areallfieldsset=true,lenient=true,zone=sun.util.calendar.zoneinfo[id=\"gmt\",offset=0,dstsavings=0,usedaylight=false,transitions=0,lastrule=null],firstdayofweek=1,minimaldaysinfirstweek=1,era=1,year=2022,month=1,week_of_year=9,week_of_month=4,day_of_month=21,day_of_year=52,day_of_week=2,day_of_week_in_month=3,am_pm=1,hour=2,hour_of_day=14,minute=46,second=2,millisecond=116,zone_offset=0,dst_offset=0]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "France");
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("h:mm:ss a z");
        java.util.Locale.Builder builder6 = builder3.setLocale(locale5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.setRegion("2:46:06 PM UTC");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: 2:46:06 PM UTC [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("\u6cd5\u6587\u6cd5\u56fd)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.text.ParsePosition parsePosition7 = new java.text.ParsePosition(16);
        parsePosition7.setIndex(11);
        java.lang.Object obj10 = fastDateFormat3.parseObject("FastDateFormat[]", parsePosition7);
        java.util.TimeZone timeZone11 = fastDateFormat3.getTimeZone();
        boolean boolean12 = timeZone11.observesDaylightTime();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getInstance("Chinese", timeZone11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: C");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h:mm:ss a z" + "'", str4, "h:mm:ss a z");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(timeZone11);
// flaky:         org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        java.util.Locale locale7 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale8 = locale7.stripExtensions();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone1, locale7);
        java.util.TimeZone timeZone10 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone11 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone12 = java.util.TimeZone.getDefault();
        boolean boolean13 = timeZone11.hasSameRules(timeZone12);
        boolean boolean14 = timeZone10.hasSameRules(timeZone11);
        boolean boolean15 = timeZone11.observesDaylightTime();
        timeZone11.setRawOffset(52);
        timeZone11.setID("Temps universel coordonn\351");
        java.util.Locale locale21 = new java.util.Locale("zh");
        java.util.Locale locale22 = java.util.Locale.CHINESE;
        java.lang.String str23 = locale22.getLanguage();
        boolean boolean24 = locale22.hasExtensions();
        java.lang.String str25 = locale22.getDisplayCountry();
        java.lang.String str26 = locale21.getDisplayName(locale22);
        java.util.Calendar calendar27 = java.util.Calendar.getInstance(timeZone11, locale21);
        java.lang.String str28 = fastDateFormat9.format(calendar27);
        java.util.TimeZone timeZone29 = java.util.TimeZone.getDefault();
        int int31 = timeZone29.getOffset((long) 2);
        java.util.Locale locale35 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale36 = locale35.stripExtensions();
        java.util.Calendar calendar37 = java.util.Calendar.getInstance(timeZone29, locale36);
        java.lang.StringBuffer stringBuffer38 = null;
        java.lang.StringBuffer stringBuffer39 = fastDateFormat9.format(calendar37, stringBuffer38);
        boolean boolean40 = calendar37.isLenient();
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone2);
// flaky:         org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals(locale7.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "_HI!");
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(timeZone10);
// flaky:         org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone12);
// flaky:         org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals(locale21.toString(), "zh");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "zh" + "'", str23, "zh");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\u4e2d\u6587" + "'", str26, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar27);
// flaky:         org.junit.Assert.assertEquals(calendar27.toString(), "java.util.GregorianCalendar[time=1645454770615,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Temps universel coordonn\351\",offset=52,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=10,MILLISECOND=667,ZONE_OFFSET=52,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(timeZone29);
// flaky:         org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals(locale35.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar37);
// flaky:         org.junit.Assert.assertEquals(calendar37.toString(), "java.util.GregorianCalendar[time=1645454770615,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=10,MILLISECOND=615,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNull(stringBuffer39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str2 = timeZone1.getID();
        java.util.TimeZone.setDefault(timeZone1);
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(timeZone1);
        int int5 = calendar4.getFirstDayOfWeek();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        int int8 = timeZone6.getOffset((long) 2);
        java.util.Locale locale12 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale13 = locale12.stripExtensions();
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone6, locale13);
        calendar4.setTimeZone(timeZone6);
        java.lang.Object obj16 = calendar4.clone();
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GMT" + "'", str2, "GMT");
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=1645454770700,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=10,MILLISECOND=700,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(timeZone6);
// flaky:         org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals(locale12.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar14);
// flaky:         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=1645454770700,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=10,MILLISECOND=700,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(obj16);
// flaky:         org.junit.Assert.assertEquals(obj16.toString(), "java.util.GregorianCalendar[time=1645454770700,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=10,MILLISECOND=700,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "java.util.GregorianCalendar[time=1645454770700,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=10,MILLISECOND=700,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "java.util.GregorianCalendar[time=1645454770700,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=10,MILLISECOND=700,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone1);
        java.util.Locale locale7 = java.util.Locale.ROOT;
        java.util.Locale locale8 = java.util.Locale.FRANCE;
        java.lang.String str9 = locale7.getDisplayLanguage(locale8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = timeZone1.getDisplayName(false, 17, locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 17");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone2);
// flaky:         org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 2);
        java.util.Locale locale6 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale7 = locale6.stripExtensions();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone0, locale7);
        int int9 = calendar8.getWeekYear();
        calendar8.setFirstDayOfWeek(100);
        java.util.Locale locale14 = java.util.Locale.PRC;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = calendar8.getDisplayName(1969, 0, locale14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals(locale6.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=1645454770764,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=100,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=10,MILLISECOND=764,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2022 + "'", int9 == 2022);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 2);
        java.util.Locale locale6 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale7 = locale6.stripExtensions();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone0, locale7);
        int int9 = calendar8.getWeekYear();
        calendar8.setFirstDayOfWeek(100);
        java.util.TimeZone timeZone13 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone13);
        java.lang.String str15 = fastDateFormat14.getPattern();
        java.util.TimeZone timeZone16 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone17 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone18 = java.util.TimeZone.getDefault();
        boolean boolean19 = timeZone17.hasSameRules(timeZone18);
        boolean boolean20 = timeZone16.hasSameRules(timeZone17);
        boolean boolean21 = timeZone17.observesDaylightTime();
        timeZone17.setRawOffset(52);
        timeZone17.setID("Temps universel coordonn\351");
        java.util.Locale locale27 = new java.util.Locale("zh");
        java.util.Locale locale28 = java.util.Locale.CHINESE;
        java.lang.String str29 = locale28.getLanguage();
        boolean boolean30 = locale28.hasExtensions();
        java.lang.String str31 = locale28.getDisplayCountry();
        java.lang.String str32 = locale27.getDisplayName(locale28);
        java.util.Calendar calendar33 = java.util.Calendar.getInstance(timeZone17, locale27);
        calendar33.clear();
        java.lang.String str35 = fastDateFormat14.format(calendar33);
        int int37 = calendar33.getGreatestMinimum(10);
        calendar33.roll(3, (int) 'a');
        int int42 = calendar33.getMaximum(8);
        int int43 = calendar8.compareTo(calendar33);
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals(locale6.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=1645454770830,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=100,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=10,MILLISECOND=830,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2022 + "'", int9 == 2022);
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h:mm:ss a z" + "'", str15, "h:mm:ss a z");
        org.junit.Assert.assertNotNull(timeZone16);
// flaky:         org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone18);
// flaky:         org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals(locale27.toString(), "zh");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "zh" + "'", str29, "zh");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\u4e2d\u6587" + "'", str32, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar33);
        org.junit.Assert.assertEquals(calendar33.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Temps universel coordonn\351\",offset=52,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=46,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=52,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "12:00:00 AM GMT+00:00" + "'", str35, "12:00:00 AM GMT+00:00");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 6 + "'", int42 == 6);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setWeekDate(5, (int) (byte) -1, 1);
        java.util.Calendar.Builder builder8 = builder0.setDate(51, 122, 0);
        java.util.Calendar.Builder builder12 = builder8.setWeekDate(13, 55, 50);
        java.util.TimeZone timeZone13 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone14 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone15 = java.util.TimeZone.getDefault();
        boolean boolean16 = timeZone14.hasSameRules(timeZone15);
        boolean boolean17 = timeZone13.hasSameRules(timeZone14);
        boolean boolean18 = timeZone14.observesDaylightTime();
        java.lang.String str19 = timeZone14.getID();
        java.util.Calendar.Builder builder20 = builder8.setTimeZone(timeZone14);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder22 = builder8.setCalendarType("\uc624\ud6c4\uc2dc\ubd84\ucd08 GMT");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown calendar type: ???? 2?? 46??? 05?? GMT");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(timeZone13);
// flaky:         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone14);
// flaky:         org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone15);
// flaky:         org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "GMT" + "'", str19, "GMT");
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str2 = timeZone1.getID();
        java.util.TimeZone.setDefault(timeZone1);
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(timeZone1);
        // The following exception was thrown during execution in test generation
        try {
            calendar4.clear(1969);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1969");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GMT" + "'", str2, "GMT");
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=1645454770888,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=10,MILLISECOND=888,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        java.util.Locale locale7 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale8 = locale7.stripExtensions();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone1, locale7);
        java.util.TimeZone timeZone10 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone11 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone12 = java.util.TimeZone.getDefault();
        boolean boolean13 = timeZone11.hasSameRules(timeZone12);
        boolean boolean14 = timeZone10.hasSameRules(timeZone11);
        boolean boolean15 = timeZone11.observesDaylightTime();
        timeZone11.setRawOffset(52);
        timeZone11.setID("Temps universel coordonn\351");
        java.util.Locale locale21 = new java.util.Locale("zh");
        java.util.Locale locale22 = java.util.Locale.CHINESE;
        java.lang.String str23 = locale22.getLanguage();
        boolean boolean24 = locale22.hasExtensions();
        java.lang.String str25 = locale22.getDisplayCountry();
        java.lang.String str26 = locale21.getDisplayName(locale22);
        java.util.Calendar calendar27 = java.util.Calendar.getInstance(timeZone11, locale21);
        java.lang.String str28 = fastDateFormat9.format(calendar27);
        // The following exception was thrown during execution in test generation
        try {
            calendar27.setWeekDate(5, 21, 32770);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: 32770");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone2);
// flaky:         org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals(locale7.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "_HI!");
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(timeZone10);
// flaky:         org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone12);
// flaky:         org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals(locale21.toString(), "zh");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "zh" + "'", str23, "zh");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\u4e2d\u6587" + "'", str26, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar27);
// flaky:         org.junit.Assert.assertEquals(calendar27.toString(), "java.util.GregorianCalendar[time=1645454770986,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Temps universel coordonn\351\",offset=52,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=11,MILLISECOND=38,ZONE_OFFSET=52,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.text.ParsePosition parsePosition6 = new java.text.ParsePosition(16);
        parsePosition6.setIndex(11);
        java.lang.Object obj9 = fastDateFormat2.parseObject("FastDateFormat[]", parsePosition6);
        boolean boolean10 = fastDateFormat2.getTimeZoneOverridesCalendar();
        java.text.AttributedCharacterIterator attributedCharacterIterator12 = fastDateFormat2.formatToCharacterIterator((java.lang.Object) 1645454754924L);
        java.util.Date date13 = new java.util.Date();
        int int14 = date13.getTimezoneOffset();
        java.util.Date date20 = new java.util.Date(3, (int) (short) 0, 6, 0, (int) (short) 1);
        java.util.Date date21 = new java.util.Date();
        int int22 = date21.getTimezoneOffset();
        long long23 = date21.getTime();
        boolean boolean24 = date20.after(date21);
        boolean boolean25 = date13.before(date21);
        int int26 = date21.getMonth();
        java.lang.StringBuffer stringBuffer27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer28 = fastDateFormat2.format(date21, stringBuffer27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h:mm:ss a z" + "'", str3, "h:mm:ss a z");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributedCharacterIterator12);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Mon Feb 21 14:46:11 GMT 2022");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals(date20.toString(), "Tue Jan 06 00:01:00 GMT 1903");
// flaky:         org.junit.Assert.assertEquals(date21.toString(), "Mon Feb 21 14:46:11 GMT 2022");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1645454771006L + "'", long23 == 1645454771006L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setTimeOfDay(16, (int) ' ', 16);
        java.util.Calendar.Builder builder9 = builder4.setTimeOfDay(55, 54, (int) 'a', 3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder12 = builder9.setWeekDefinition((int) ' ', 46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.lang.String str1 = locale0.getLanguage();
        boolean boolean2 = locale0.hasExtensions();
        java.util.Locale locale3 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str4 = locale0.getDisplayLanguage(locale3);
        java.lang.String str5 = locale3.getLanguage();
        java.lang.String str6 = locale3.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh" + "'", str1, "zh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u4e2d\u6587" + "'", str4, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh" + "'", str5, "zh");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh_TW" + "'", str6, "zh_TW");
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        boolean boolean4 = timeZone2.hasSameRules(timeZone3);
        boolean boolean5 = timeZone1.hasSameRules(timeZone2);
        boolean boolean6 = timeZone2.observesDaylightTime();
        timeZone2.setRawOffset(52);
        java.util.Locale locale9 = java.util.Locale.FRANCE;
        java.util.Locale.setDefault(locale9);
        java.util.Locale locale11 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet12 = locale11.getUnicodeLocaleKeys();
        java.lang.String str13 = locale11.getDisplayLanguage();
        java.lang.String str14 = locale9.getDisplayVariant(locale11);
        java.util.Set<java.lang.String> strSet15 = locale9.getUnicodeLocaleKeys();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getInstance("\uc624\uc804\uc2dc\ubd84\ucd08 UTC", timeZone2, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: U");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chinois" + "'", str13, "chinois");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        java.util.Locale locale1 = new java.util.Locale("zh");
        java.lang.String str2 = locale1.getDisplayVariant();
        java.lang.String str3 = locale1.getDisplayCountry();
        java.util.Set<java.lang.String> strSet4 = locale1.getUnicodeLocaleKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = locale1.getExtension(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.TAIWAN;
        java.util.Locale locale2 = locale1.stripExtensions();
        java.util.Locale.setDefault(category0, locale1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale1.getUnicodeLocaleType("HI!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: HI!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone1);
        java.util.TimeZone timeZone6 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str7 = timeZone6.getID();
        boolean boolean8 = timeZone1.hasSameRules(timeZone6);
        timeZone6.setRawOffset((int) 'x');
        timeZone6.setID("US");
        java.util.TimeZone timeZone16 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone16);
        java.lang.String str18 = fastDateFormat17.getPattern();
        java.util.Locale locale19 = fastDateFormat17.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = timeZone6.getDisplayName(false, 58, locale19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 58");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GMT" + "'", str7, "GMT");
// flaky:         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h:mm:ss a z" + "'", str18, "h:mm:ss a z");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(12, 126, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 126");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.lang.String str5 = fastDateFormat2.format(1645454755875L);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.parse("zho");
        java.util.Set<java.lang.String> strSet8 = java.util.Calendar.getAvailableCalendarTypes();
        java.util.stream.Stream<java.lang.String> strStream9 = strSet8.parallelStream();
        java.lang.String str10 = java.util.Locale.lookupTag(languageRangeList7, (java.util.Collection<java.lang.String>) strSet8);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList12 = java.util.Locale.LanguageRange.parse("zho");
        java.util.Set<java.lang.String> strSet13 = java.util.Calendar.getAvailableCalendarTypes();
        java.util.stream.Stream<java.lang.String> strStream14 = strSet13.parallelStream();
        java.lang.String str15 = java.util.Locale.lookupTag(languageRangeList12, (java.util.Collection<java.lang.String>) strSet13);
        java.util.Locale.FilteringMode filteringMode16 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList17 = java.util.Locale.filterTags(languageRangeList7, (java.util.Collection<java.lang.String>) strSet13, filteringMode16);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator18 = fastDateFormat2.formatToCharacterIterator((java.lang.Object) strSet13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.util.Collections$UnmodifiableSet");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FastDateFormat[]" + "'", str3, "FastDateFormat[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(strStream9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(languageRangeList12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strStream14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + filteringMode16 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode16.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.text.Format.Field field1 = null;
        java.text.FieldPosition fieldPosition3 = new java.text.FieldPosition(field1, 16);
        fieldPosition3.setBeginIndex(12);
        java.util.Date date6 = new java.util.Date();
        date6.setMinutes(32770);
        boolean boolean9 = fieldPosition3.equals((java.lang.Object) date6);
        boolean boolean10 = locale0.equals((java.lang.Object) boolean9);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Wed Mar 16 08:10:11 GMT 2022");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "France");
        java.util.Locale.Builder builder5 = builder0.removeUnicodeLocaleAttribute("GMT");
        java.util.Locale locale6 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder0.setExtension(' ', "Mon Feb 21 14:45:54 UTC 2022");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key:   [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 2);
        java.util.Locale locale6 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale7 = locale6.stripExtensions();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone0, locale7);
        int int9 = calendar8.getWeekYear();
        calendar8.setFirstDayOfWeek(100);
        calendar8.set(32772, 0, 20);
        java.util.TimeZone timeZone16 = java.util.TimeZone.getDefault();
        int int18 = timeZone16.getOffset((long) 2);
        java.util.Locale locale22 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale23 = locale22.stripExtensions();
        java.util.Calendar calendar24 = java.util.Calendar.getInstance(timeZone16, locale23);
        int int26 = calendar24.getLeastMaximum(4);
        java.util.TimeZone timeZone27 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone28 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone29 = java.util.TimeZone.getDefault();
        boolean boolean30 = timeZone28.hasSameRules(timeZone29);
        boolean boolean31 = timeZone27.hasSameRules(timeZone28);
        java.util.Calendar calendar32 = java.util.Calendar.getInstance(timeZone28);
        calendar24.setTimeZone(timeZone28);
        int int34 = calendar8.compareTo(calendar24);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals(locale6.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=100,minimalDaysInFirstWeek=1,ERA=1,YEAR=32772,MONTH=0,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=20,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=11,MILLISECOND=855,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2022 + "'", int9 == 2022);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals(locale22.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar24);
// flaky:         org.junit.Assert.assertEquals(calendar24.toString(), "java.util.GregorianCalendar[time=1645454771855,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=11,MILLISECOND=855,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(calendar32);
// flaky:         org.junit.Assert.assertEquals(calendar32.toString(), "java.util.GregorianCalendar[time=1645454771855,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=11,MILLISECOND=855,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        java.util.Locale locale1 = java.util.Locale.KOREA;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, locale1);
        java.lang.String str4 = fastDateFormat2.format((java.lang.Object) 1645454750118L);
        java.util.TimeZone timeZone5 = java.util.TimeZone.getDefault();
        int int7 = timeZone5.getOffset((long) 2);
        java.util.Locale locale11 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale12 = locale11.stripExtensions();
        java.util.Calendar calendar13 = java.util.Calendar.getInstance(timeZone5, locale12);
        int int15 = calendar13.getLeastMaximum(4);
        calendar13.setFirstDayOfWeek((-1));
        int int18 = calendar13.getFirstDayOfWeek();
        java.lang.String str19 = fastDateFormat2.format(calendar13);
        java.util.TimeZone timeZone20 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone21 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getDefault();
        boolean boolean23 = timeZone21.hasSameRules(timeZone22);
        boolean boolean24 = timeZone20.hasSameRules(timeZone21);
        boolean boolean25 = timeZone21.observesDaylightTime();
        java.util.TimeZone timeZone26 = java.util.TimeZone.getDefault();
        int int28 = timeZone26.getOffset((long) 2);
        java.util.Locale locale32 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale33 = locale32.stripExtensions();
        java.util.Calendar calendar34 = java.util.Calendar.getInstance(timeZone26, locale33);
        boolean boolean35 = timeZone21.hasSameRules(timeZone26);
        java.util.Calendar calendar36 = java.util.Calendar.getInstance(timeZone26);
        java.util.TimeZone timeZone40 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone40);
        java.lang.String str42 = fastDateFormat41.getPattern();
        java.text.ParsePosition parsePosition45 = new java.text.ParsePosition(16);
        parsePosition45.setIndex(11);
        java.lang.Object obj48 = fastDateFormat41.parseObject("FastDateFormat[]", parsePosition45);
        boolean boolean49 = fastDateFormat41.getTimeZoneOverridesCalendar();
        java.text.AttributedCharacterIterator attributedCharacterIterator51 = fastDateFormat41.formatToCharacterIterator((java.lang.Object) 1645454754924L);
        java.util.Locale locale52 = fastDateFormat41.getLocale();
        java.util.Map<java.lang.String, java.lang.Integer> strMap53 = calendar36.getDisplayNames(2, 0, locale52);
        java.lang.StringBuffer stringBuffer54 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer55 = fastDateFormat2.format(calendar36, stringBuffer54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(fastDateFormat2);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\uc624\ud6c4\uc2dc\ubd84\ucd08 UTC" + "'", str4, "\uc624\ud6c4\uc2dc\ubd84\ucd08 UTC");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals(locale11.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar13);
// flaky:         org.junit.Assert.assertEquals(calendar13.toString(), "java.util.GregorianCalendar[time=1645454772040,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=-1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=12,MILLISECOND=40,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\uc624\ud6c4\uc2dc\ubd84\ucd08 GMT" + "'", str19, "\uc624\ud6c4\uc2dc\ubd84\ucd08 GMT");
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals(locale32.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar34);
// flaky:         org.junit.Assert.assertEquals(calendar34.toString(), "java.util.GregorianCalendar[time=1645454772040,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=12,MILLISECOND=40,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(calendar36);
// flaky:         org.junit.Assert.assertEquals(calendar36.toString(), "java.util.GregorianCalendar[time=1645454772040,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=12,MILLISECOND=40,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "h:mm:ss a z" + "'", str42, "h:mm:ss a z");
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(attributedCharacterIterator51);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "en_US");
        org.junit.Assert.assertNotNull(strMap53);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        boolean boolean5 = locale4.hasExtensions();
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.util.Locale locale7 = java.util.Locale.CHINESE;
        java.lang.String str8 = locale7.getLanguage();
        java.util.Locale[] localeArray9 = new java.util.Locale[] { locale3, locale4, locale6, locale7 };
        java.util.ArrayList<java.util.Locale> localeList10 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList10, localeArray9);
        java.util.Locale.FilteringMode filteringMode12 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList13 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList10, filteringMode12);
        java.util.Spliterator<java.util.Locale> localeSpliterator14 = localeList13.spliterator();
        java.lang.Object[] objArray15 = localeList13.toArray();
        java.util.Spliterator<java.util.Locale> localeSpliterator16 = localeList13.spliterator();
        localeList13.clear();
        java.util.Locale locale18 = null;
        boolean boolean19 = localeList13.add(locale18);
        java.util.function.UnaryOperator<java.util.Locale> localeUnaryOperator20 = null;
        // The following exception was thrown during execution in test generation
        try {
            localeList13.replaceAll(localeUnaryOperator20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh" + "'", str8, "zh");
        org.junit.Assert.assertNotNull(localeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + filteringMode12 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode12.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList13);
        org.junit.Assert.assertNotNull(localeSpliterator14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(localeSpliterator16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setWeekDate(5, (int) (byte) -1, 1);
        java.util.Calendar.Builder builder6 = builder4.setLenient(true);
        java.util.Calendar.Builder builder10 = builder6.setTimeOfDay((-1), 45, 11);
        java.util.TimeZone timeZone11 = java.util.TimeZone.getDefault();
        int int13 = timeZone11.getOffset((long) 2);
        java.util.Locale locale17 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale18 = locale17.stripExtensions();
        java.util.Calendar calendar19 = java.util.Calendar.getInstance(timeZone11, locale18);
        calendar19.set(122, 52, (int) (byte) 1);
        calendar19.setMinimalDaysInFirstWeek(8);
        java.util.Date date31 = new java.util.Date(3, 16, 11, 8, 51);
        calendar19.setTime(date31);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder33 = builder10.setInstant(date31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals(locale17.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar19);
        org.junit.Assert.assertEquals(calendar19.toString(), "java.util.GregorianCalendar[time=-2071494540000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=8,ERA=1,YEAR=1904,MONTH=4,WEEK_OF_YEAR=19,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=132,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=8,HOUR_OF_DAY=8,MINUTE=51,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(date31.toString(), "Wed May 11 08:51:00 GMT 1904");
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 2);
        java.util.Locale locale6 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale7 = locale6.stripExtensions();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone0, locale7);
        calendar8.set(122, 52, (int) (byte) 1);
        int int13 = calendar8.getWeeksInWeekYear();
        java.util.Locale locale16 = java.util.Locale.FRANCE;
        java.lang.String str17 = locale16.getVariant();
        java.lang.String str18 = locale16.getDisplayCountry();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = calendar8.getDisplayName((int) (short) 100, 0, locale16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals(locale6.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=122,MONTH=52,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=1,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=12,MILLISECOND=286,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "France" + "'", str18, "France");
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        boolean boolean5 = locale4.hasExtensions();
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.util.Locale locale7 = java.util.Locale.CHINESE;
        java.lang.String str8 = locale7.getLanguage();
        java.util.Locale[] localeArray9 = new java.util.Locale[] { locale3, locale4, locale6, locale7 };
        java.util.ArrayList<java.util.Locale> localeList10 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList10, localeArray9);
        java.util.Locale.FilteringMode filteringMode12 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList13 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList10, filteringMode12);
        java.util.Spliterator<java.util.Locale> localeSpliterator14 = localeList13.spliterator();
        java.lang.Object[] objArray15 = localeList13.toArray();
        java.util.Spliterator<java.util.Locale> localeSpliterator16 = localeList13.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale> localeList19 = localeList13.subList((-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: fromIndex = -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh" + "'", str8, "zh");
        org.junit.Assert.assertNotNull(localeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + filteringMode12 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode12.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList13);
        org.junit.Assert.assertNotNull(localeSpliterator14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(localeSpliterator16);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        java.util.Date date0 = new java.util.Date();
        int int1 = date0.getTimezoneOffset();
        long long2 = date0.getTime();
        java.util.Date date3 = new java.util.Date();
        int int4 = date3.getSeconds();
        date3.setTime((long) 16);
        date3.setMinutes(12);
        int int9 = date3.getSeconds();
        boolean boolean10 = date0.after(date3);
        int int11 = date3.getDate();
        java.lang.String str12 = date3.toLocaleString();
        java.lang.Object obj13 = date3.clone();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
// flaky:         org.junit.Assert.assertEquals(date0.toString(), "Mon Feb 21 14:46:12 GMT 2022");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1645454772545L + "'", long2 == 1645454772545L);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:12:00 GMT 1970");
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 12 + "'", int4 == 12);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u4e0a\u5348 12:12:00" + "'", str12, "\u4e0a\u5348 12:12:00");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "Thu Jan 01 00:12:00 GMT 1970");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "Thu Jan 01 00:12:00 GMT 1970");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "Thu Jan 01 00:12:00 GMT 1970");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone1);
        java.lang.String str4 = fastDateFormat2.format((long) '#');
        java.lang.String str5 = fastDateFormat2.toString();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        int int8 = timeZone6.getOffset((long) 2);
        java.util.Locale locale12 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale13 = locale12.stripExtensions();
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone6, locale13);
        int int16 = calendar14.getLeastMaximum(4);
        calendar14.setFirstDayOfWeek((-1));
        int int19 = calendar14.getFirstDayOfWeek();
        long long20 = calendar14.getTimeInMillis();
        calendar14.set((int) (byte) 0, 49, 15, (int) (short) 1, 8);
        java.lang.String str27 = fastDateFormat2.format(calendar14);
        // The following exception was thrown during execution in test generation
        try {
            calendar14.setWeekDate((int) '4', (int) '4', 18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: 18");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "12:00:00 AM UTC" + "'", str4, "12:00:00 AM UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FastDateFormat[h:mm:ss a z]" + "'", str5, "FastDateFormat[h:mm:ss a z]");
        org.junit.Assert.assertNotNull(timeZone6);
// flaky:         org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals(locale12.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar14);
// flaky:         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=-62037269507186,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=-1,minimalDaysInFirstWeek=1,ERA=1,YEAR=4,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=3,DAY_OF_MONTH=15,DAY_OF_YEAR=46,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=8,SECOND=12,MILLISECOND=814,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1645454772814L + "'", long20 == 1645454772814L);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1:08:12 AM GMT" + "'", str27, "1:08:12 AM GMT");
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        boolean boolean5 = locale4.hasExtensions();
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.util.Locale locale7 = java.util.Locale.CHINESE;
        java.lang.String str8 = locale7.getLanguage();
        java.util.Locale[] localeArray9 = new java.util.Locale[] { locale3, locale4, locale6, locale7 };
        java.util.ArrayList<java.util.Locale> localeList10 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList10, localeArray9);
        java.util.Locale.FilteringMode filteringMode12 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList13 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList10, filteringMode12);
        java.util.Spliterator<java.util.Locale> localeSpliterator14 = localeList13.spliterator();
        java.util.Iterator<java.util.Locale> localeItor15 = localeList13.iterator();
        java.util.function.UnaryOperator<java.util.Locale> localeUnaryOperator16 = null;
        // The following exception was thrown during execution in test generation
        try {
            localeList13.replaceAll(localeUnaryOperator16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh" + "'", str8, "zh");
        org.junit.Assert.assertNotNull(localeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + filteringMode12 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode12.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList13);
        org.junit.Assert.assertNotNull(localeSpliterator14);
        org.junit.Assert.assertNotNull(localeItor15);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        boolean boolean5 = locale4.hasExtensions();
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.util.Locale locale7 = java.util.Locale.CHINESE;
        java.lang.String str8 = locale7.getLanguage();
        java.util.Locale[] localeArray9 = new java.util.Locale[] { locale3, locale4, locale6, locale7 };
        java.util.ArrayList<java.util.Locale> localeList10 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList10, localeArray9);
        java.util.Locale.FilteringMode filteringMode12 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList13 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList10, filteringMode12);
        java.util.Spliterator<java.util.Locale> localeSpliterator14 = localeList13.spliterator();
        java.lang.Object[] objArray15 = localeList13.toArray();
        localeList13.clear();
        java.text.Format.Field field17 = null;
        java.text.FieldPosition fieldPosition18 = new java.text.FieldPosition(field17);
        boolean boolean19 = localeList13.equals((java.lang.Object) fieldPosition18);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale21 = localeList13.remove((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh" + "'", str8, "zh");
        org.junit.Assert.assertNotNull(localeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + filteringMode12 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode12.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList13);
        org.junit.Assert.assertNotNull(localeSpliterator14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("zho");
        java.util.Locale.LanguageRange[] languageRangeArray2 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList3 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList3, languageRangeArray2);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        boolean boolean7 = locale6.hasExtensions();
        java.util.Locale locale8 = java.util.Locale.FRANCE;
        java.util.Locale locale9 = java.util.Locale.CHINESE;
        java.lang.String str10 = locale9.getLanguage();
        java.util.Locale[] localeArray11 = new java.util.Locale[] { locale5, locale6, locale8, locale9 };
        java.util.ArrayList<java.util.Locale> localeList12 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList12, localeArray11);
        java.util.Locale.FilteringMode filteringMode14 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList15 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.util.Locale>) localeList12, filteringMode14);
        java.util.Locale.FilteringMode filteringMode16 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList17 = java.util.Locale.filter(languageRangeList1, (java.util.Collection<java.util.Locale>) localeList12, filteringMode16);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<java.util.Locale> localeItor19 = localeList17.listIterator(126);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 126");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "zh" + "'", str10, "zh");
        org.junit.Assert.assertNotNull(localeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + filteringMode14 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode14.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList15);
        org.junit.Assert.assertTrue("'" + filteringMode16 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode16.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList17);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 2);
        java.util.Locale locale6 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale7 = locale6.stripExtensions();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone0, locale7);
        int int10 = calendar8.getLeastMaximum(4);
        int int12 = calendar8.getLeastMaximum((int) (byte) 0);
        boolean boolean13 = calendar8.isWeekDateSupported();
        java.lang.String str14 = calendar8.toString();
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals(locale6.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=1645454773303,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=13,MILLISECOND=303,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.util.GregorianCalendar[time=1645454773303,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=13,MILLISECOND=303,ZONE_OFFSET=0,DST_OFFSET=0]" + "'", str14, "java.util.GregorianCalendar[time=1645454773303,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=13,MILLISECOND=303,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setWeekDate(5, (int) (byte) -1, 1);
        java.util.Calendar.Builder builder8 = builder0.setDate(51, 122, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder10 = builder0.setCalendarType("zh_TW");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown calendar type: zh_TW");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("Temps universel coordonn\351");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=tempsuniverselcoordonne?");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("2:46:13 PM UTC");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=2:46:13 pm utc");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("\uc624\uc804\uc2dc\ubd84\ucd08 UTC");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        boolean boolean5 = locale4.hasExtensions();
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.util.Locale locale7 = java.util.Locale.CHINESE;
        java.lang.String str8 = locale7.getLanguage();
        java.util.Locale[] localeArray9 = new java.util.Locale[] { locale3, locale4, locale6, locale7 };
        java.util.ArrayList<java.util.Locale> localeList10 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList10, localeArray9);
        java.util.Locale.FilteringMode filteringMode12 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList13 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList10, filteringMode12);
        java.util.Spliterator<java.util.Locale> localeSpliterator14 = localeList13.spliterator();
        java.util.Iterator<java.util.Locale> localeItor15 = localeList13.iterator();
        java.util.Set<java.lang.String> strSet16 = java.util.Calendar.getAvailableCalendarTypes();
        java.util.stream.Stream<java.lang.String> strStream17 = strSet16.parallelStream();
        boolean boolean18 = localeList13.removeAll((java.util.Collection<java.lang.String>) strSet16);
        java.lang.Object[] objArray19 = localeList13.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale21 = localeList13.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh" + "'", str8, "zh");
        org.junit.Assert.assertNotNull(localeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + filteringMode12 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode12.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList13);
        org.junit.Assert.assertNotNull(localeSpliterator14);
        org.junit.Assert.assertNotNull(localeItor15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.lang.String str2 = locale0.getISO3Language();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale0.getExtension('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zho" + "'", str2, "zho");
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        boolean boolean5 = locale4.hasExtensions();
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.util.Locale locale7 = java.util.Locale.CHINESE;
        java.lang.String str8 = locale7.getLanguage();
        java.util.Locale[] localeArray9 = new java.util.Locale[] { locale3, locale4, locale6, locale7 };
        java.util.ArrayList<java.util.Locale> localeList10 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList10, localeArray9);
        java.util.Locale.FilteringMode filteringMode12 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList13 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList10, filteringMode12);
        java.util.Locale.LanguageRange[] languageRangeArray14 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList15 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList15, languageRangeArray14);
        java.util.Locale locale17 = java.util.Locale.GERMAN;
        java.util.Locale locale18 = java.util.Locale.FRANCE;
        boolean boolean19 = locale18.hasExtensions();
        java.util.Locale locale20 = java.util.Locale.FRANCE;
        java.util.Locale locale21 = java.util.Locale.CHINESE;
        java.lang.String str22 = locale21.getLanguage();
        java.util.Locale[] localeArray23 = new java.util.Locale[] { locale17, locale18, locale20, locale21 };
        java.util.ArrayList<java.util.Locale> localeList24 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList24, localeArray23);
        java.util.Locale.FilteringMode filteringMode26 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList27 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, (java.util.Collection<java.util.Locale>) localeList24, filteringMode26);
        java.util.Spliterator<java.util.Locale> localeSpliterator28 = localeList27.spliterator();
        java.util.Iterator<java.util.Locale> localeItor29 = localeList27.iterator();
        int int30 = localeList27.size();
        java.util.Locale locale31 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList27);
        java.util.TimeZone timeZone32 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone33 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone34 = java.util.TimeZone.getDefault();
        boolean boolean35 = timeZone33.hasSameRules(timeZone34);
        boolean boolean36 = timeZone32.hasSameRules(timeZone33);
        boolean boolean37 = timeZone33.observesDaylightTime();
        java.util.TimeZone timeZone38 = java.util.TimeZone.getDefault();
        int int40 = timeZone38.getOffset((long) 2);
        java.util.Locale locale44 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale45 = locale44.stripExtensions();
        java.util.Calendar calendar46 = java.util.Calendar.getInstance(timeZone38, locale45);
        boolean boolean47 = timeZone33.hasSameRules(timeZone38);
        java.util.Calendar calendar48 = java.util.Calendar.getInstance(timeZone38);
        timeZone38.setRawOffset(32770);
        int int51 = localeList27.lastIndexOf((java.lang.Object) 32770);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale> localeList54 = localeList27.subList(3, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh" + "'", str8, "zh");
        org.junit.Assert.assertNotNull(localeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + filteringMode12 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode12.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList13);
        org.junit.Assert.assertNotNull(languageRangeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "de");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "zh" + "'", str22, "zh");
        org.junit.Assert.assertNotNull(localeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + filteringMode26 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode26.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList27);
        org.junit.Assert.assertNotNull(localeSpliterator28);
        org.junit.Assert.assertNotNull(localeItor29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(locale31);
        org.junit.Assert.assertNotNull(timeZone32);
// flaky:         org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone33);
// flaky:         org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone34);
// flaky:         org.junit.Assert.assertEquals(timeZone34.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(timeZone38);
// flaky:         org.junit.Assert.assertEquals(timeZone38.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertEquals(locale44.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar46);
// flaky:         org.junit.Assert.assertEquals(calendar46.toString(), "java.util.GregorianCalendar[time=1645454773605,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=32770,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=13,MILLISECOND=605,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(calendar48);
// flaky:         org.junit.Assert.assertEquals(calendar48.toString(), "java.util.GregorianCalendar[time=1645454773605,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=32770,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=13,MILLISECOND=605,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.text.ParsePosition parsePosition6 = new java.text.ParsePosition(16);
        parsePosition6.setIndex(11);
        java.lang.Object obj9 = fastDateFormat2.parseObject("FastDateFormat[]", parsePosition6);
        java.util.TimeZone timeZone12 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone12);
        java.lang.String str14 = fastDateFormat13.getPattern();
        java.text.ParsePosition parsePosition17 = new java.text.ParsePosition((int) (short) 10);
        int int18 = parsePosition17.getIndex();
        java.lang.Object obj19 = fastDateFormat13.parseObject("\uc624\uc804\uc2dc\ubd84\ucd08 UTC", parsePosition17);
        java.lang.Object obj20 = fastDateFormat2.parseObject("2:45:54 PM UTC", parsePosition17);
        java.lang.String str21 = fastDateFormat2.getPattern();
        java.util.Calendar.Builder builder22 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder26 = builder22.setWeekDate(5, (int) (byte) -1, 1);
        java.util.Calendar.Builder builder28 = builder26.setLenient(true);
        java.util.Calendar.Builder builder32 = builder28.setTimeOfDay(122, 11, 10);
        java.util.Calendar.Builder builder36 = builder32.setDate(32769, 17, 1);
        java.util.Calendar.Builder builder39 = builder36.set(9, 32772);
        java.lang.StringBuffer stringBuffer40 = null;
        java.text.FieldPosition fieldPosition42 = new java.text.FieldPosition(53);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer43 = fastDateFormat2.format((java.lang.Object) builder39, stringBuffer40, fieldPosition42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.util.Calendar$Builder");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h:mm:ss a z" + "'", str3, "h:mm:ss a z");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h:mm:ss a z" + "'", str14, "h:mm:ss a z");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "h:mm:ss a z" + "'", str21, "h:mm:ss a z");
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder39);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("2:45:53 PM UTC", (double) 1645454753728L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=1.645454753728E12");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        java.util.Locale locale0 = java.util.Locale.US;
        java.lang.String str1 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "en_US" + "'", str1, "en_US");
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str2 = timeZone1.getID();
        java.util.TimeZone.setDefault(timeZone1);
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(timeZone1);
        int int5 = calendar4.getFirstDayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            calendar4.roll(21, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GMT" + "'", str2, "GMT");
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=1645454773972,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=13,MILLISECOND=972,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "France");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder0.setScript("GMT");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: GMT [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        boolean boolean5 = locale4.hasExtensions();
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.util.Locale locale7 = java.util.Locale.CHINESE;
        java.lang.String str8 = locale7.getLanguage();
        java.util.Locale[] localeArray9 = new java.util.Locale[] { locale3, locale4, locale6, locale7 };
        java.util.ArrayList<java.util.Locale> localeList10 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList10, localeArray9);
        java.util.Locale.FilteringMode filteringMode12 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList13 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList10, filteringMode12);
        java.util.ListIterator<java.util.Locale> localeItor14 = localeList13.listIterator();
        java.util.Iterator<java.util.Locale> localeItor15 = localeList13.iterator();
        java.util.Locale.LanguageRange[] languageRangeArray16 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList17 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList17, languageRangeArray16);
        java.util.Locale locale19 = java.util.Locale.GERMAN;
        java.util.Locale locale20 = java.util.Locale.FRANCE;
        boolean boolean21 = locale20.hasExtensions();
        java.util.Locale locale22 = java.util.Locale.FRANCE;
        java.util.Locale locale23 = java.util.Locale.CHINESE;
        java.lang.String str24 = locale23.getLanguage();
        java.util.Locale[] localeArray25 = new java.util.Locale[] { locale19, locale20, locale22, locale23 };
        java.util.ArrayList<java.util.Locale> localeList26 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList26, localeArray25);
        java.util.Locale.FilteringMode filteringMode28 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList29 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.util.Locale>) localeList26, filteringMode28);
        java.util.Set<java.lang.String> strSet30 = java.util.Calendar.getAvailableCalendarTypes();
        java.util.stream.Stream<java.lang.String> strStream31 = strSet30.parallelStream();
        java.lang.String str32 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.lang.String>) strSet30);
        java.util.stream.Stream<java.lang.String> strStream33 = strSet30.parallelStream();
        boolean boolean34 = localeList13.retainAll((java.util.Collection<java.lang.String>) strSet30);
        java.lang.String[] strArray41 = new java.lang.String[] { "java.text.ParsePosition[index=0,errorIndex=0]", "2:45:54 PM UTC", "2:45:56 PM UTC", "2:46:01 PM UTC", "java.text.ParsePosition[index=0,errorIndex=0]", "en_US" };
        java.lang.String[] strArray48 = new java.lang.String[] { "java.text.ParsePosition[index=0,errorIndex=0]", "2:45:54 PM UTC", "2:45:56 PM UTC", "2:46:01 PM UTC", "java.text.ParsePosition[index=0,errorIndex=0]", "en_US" };
        java.lang.String[] strArray55 = new java.lang.String[] { "java.text.ParsePosition[index=0,errorIndex=0]", "2:45:54 PM UTC", "2:45:56 PM UTC", "2:46:01 PM UTC", "java.text.ParsePosition[index=0,errorIndex=0]", "en_US" };
        java.lang.String[] strArray62 = new java.lang.String[] { "java.text.ParsePosition[index=0,errorIndex=0]", "2:45:54 PM UTC", "2:45:56 PM UTC", "2:46:01 PM UTC", "java.text.ParsePosition[index=0,errorIndex=0]", "en_US" };
        java.lang.String[][] strArray63 = new java.lang.String[][] { strArray41, strArray48, strArray55, strArray62 };
        java.lang.String[][] strArray64 = localeList13.toArray(strArray63);
        boolean boolean66 = localeList13.equals((java.lang.Object) (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale> localeList69 = localeList13.subList(120, 120);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 120");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh" + "'", str8, "zh");
        org.junit.Assert.assertNotNull(localeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + filteringMode12 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode12.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList13);
        org.junit.Assert.assertNotNull(localeItor14);
        org.junit.Assert.assertNotNull(localeItor15);
        org.junit.Assert.assertNotNull(languageRangeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "de");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "zh" + "'", str24, "zh");
        org.junit.Assert.assertNotNull(localeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + filteringMode28 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode28.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList29);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNotNull(strStream31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(strStream33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 2);
        java.util.Locale locale6 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale7 = locale6.stripExtensions();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone0, locale7);
        calendar8.set(122, 52, (int) (byte) 1);
        int int13 = calendar8.getWeeksInWeekYear();
        calendar8.add(13, 0);
        int int17 = calendar8.getWeeksInWeekYear();
        java.util.TimeZone timeZone19 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.util.Calendar calendar20 = java.util.Calendar.getInstance(timeZone19);
        int int21 = calendar8.compareTo(calendar20);
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals(locale6.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=122,MONTH=52,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=1,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=14,MILLISECOND=27,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertNotNull(timeZone19);
// flaky:         org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(calendar20);
// flaky:         org.junit.Assert.assertEquals(calendar20.toString(), "java.util.GregorianCalendar[time=1645454774030,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=14,MILLISECOND=30,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        boolean boolean2 = timeZone0.hasSameRules(timeZone1);
        boolean boolean3 = timeZone0.observesDaylightTime();
        java.util.Locale locale6 = java.util.Locale.CHINA;
        boolean boolean7 = locale6.hasExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = timeZone0.getDisplayName(true, 32772, locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 32772");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone1);
        java.time.ZoneId zoneId5 = timeZone0.toZoneId();
        java.util.TimeZone timeZone9 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone9);
        java.lang.String str11 = fastDateFormat10.toString();
        java.lang.Object obj12 = fastDateFormat10.clone();
        java.util.Locale locale13 = fastDateFormat10.getLocale();
        java.lang.String str14 = timeZone0.getDisplayName(true, 1, locale13);
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone2);
// flaky:         org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(zoneId5);
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "FastDateFormat[]" + "'", str11, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "FastDateFormat[]");
        org.junit.Assert.assertNotNull(locale13);
// flaky:         org.junit.Assert.assertEquals(locale13.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Greenwich Mean Time" + "'", str14, "Greenwich Mean Time");
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        boolean boolean5 = locale4.hasExtensions();
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.util.Locale locale7 = java.util.Locale.CHINESE;
        java.lang.String str8 = locale7.getLanguage();
        java.util.Locale[] localeArray9 = new java.util.Locale[] { locale3, locale4, locale6, locale7 };
        java.util.ArrayList<java.util.Locale> localeList10 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList10, localeArray9);
        java.util.Locale.FilteringMode filteringMode12 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList13 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList10, filteringMode12);
        java.util.Spliterator<java.util.Locale> localeSpliterator14 = localeList13.spliterator();
        java.util.Iterator<java.util.Locale> localeItor15 = localeList13.iterator();
        java.lang.String[] strArray16 = java.util.Locale.getISOCountries();
        java.lang.CharSequence[] charSequenceArray17 = localeList13.toArray((java.lang.CharSequence[]) strArray16);
        boolean boolean19 = localeList13.remove((java.lang.Object) 'u');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale21 = localeList13.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh" + "'", str8, "zh");
        org.junit.Assert.assertNotNull(localeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + filteringMode12 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode12.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList13);
        org.junit.Assert.assertNotNull(localeSpliterator14);
        org.junit.Assert.assertNotNull(localeItor15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(charSequenceArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        boolean boolean5 = locale4.hasExtensions();
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.util.Locale locale7 = java.util.Locale.CHINESE;
        java.lang.String str8 = locale7.getLanguage();
        java.util.Locale[] localeArray9 = new java.util.Locale[] { locale3, locale4, locale6, locale7 };
        java.util.ArrayList<java.util.Locale> localeList10 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList10, localeArray9);
        java.util.Locale.FilteringMode filteringMode12 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList13 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList10, filteringMode12);
        java.util.Spliterator<java.util.Locale> localeSpliterator14 = localeList13.spliterator();
        java.lang.Object[] objArray15 = localeList13.toArray();
        localeList13.clear();
        java.text.Format.Field field17 = null;
        java.text.FieldPosition fieldPosition18 = new java.text.FieldPosition(field17);
        boolean boolean19 = localeList13.equals((java.lang.Object) fieldPosition18);
        java.util.Locale locale20 = java.util.Locale.US;
        java.util.Locale locale21 = locale20.stripExtensions();
        java.util.Locale locale22 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet23 = locale22.getUnicodeLocaleKeys();
        java.lang.String str24 = locale21.getDisplayVariant(locale22);
        int int25 = localeList13.lastIndexOf((java.lang.Object) locale21);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale27 = localeList13.get((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh" + "'", str8, "zh");
        org.junit.Assert.assertNotNull(localeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + filteringMode12 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode12.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList13);
        org.junit.Assert.assertNotNull(localeSpliterator14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.lang.String str1 = locale0.getLanguage();
        boolean boolean2 = locale0.hasExtensions();
        java.lang.Object obj3 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh" + "'", str1, "zh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "zh");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "zh");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "zh");
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        java.util.Calendar.Builder builder1 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder5 = builder1.setWeekDate(5, (int) (byte) -1, 1);
        java.util.Calendar.Builder builder7 = builder5.setLenient(true);
        java.util.Calendar.Builder builder11 = builder7.setTimeOfDay(122, 11, 10);
        java.util.Calendar.Builder builder15 = builder11.setWeekDate(100, 9, 2);
        java.util.Calendar.Builder builder19 = builder15.setTimeOfDay(52, (int) (short) 10, (-1));
        java.util.Calendar.Builder builder21 = builder19.setLenient(true);
        java.util.Calendar.Builder builder24 = builder19.set(2, 54);
        java.util.TimeZone timeZone26 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone27 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone28 = java.util.TimeZone.getDefault();
        boolean boolean29 = timeZone27.hasSameRules(timeZone28);
        boolean boolean30 = timeZone26.hasSameRules(timeZone27);
        java.util.TimeZone timeZone32 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str33 = timeZone32.getID();
        boolean boolean34 = timeZone27.hasSameRules(timeZone32);
        java.util.Locale locale35 = java.util.Locale.FRANCE;
        boolean boolean36 = locale35.hasExtensions();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone32, locale35);
        java.util.Calendar.Builder builder38 = builder19.setTimeZone(timeZone32);
        java.util.Locale locale39 = java.util.Locale.ROOT;
        java.util.Locale.Builder builder40 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder43 = builder40.setExtension('a', "France");
        java.util.Locale.Builder builder45 = builder40.removeUnicodeLocaleAttribute("GMT");
        java.util.Locale locale46 = java.util.Locale.FRANCE;
        java.lang.String str47 = locale46.getVariant();
        java.lang.String str48 = locale46.getDisplayCountry();
        java.util.Locale.Builder builder49 = builder40.setLocale(locale46);
        java.util.Locale locale51 = new java.util.Locale("zh");
        java.lang.String str52 = locale46.getDisplayName(locale51);
        java.lang.String str53 = locale39.getDisplayName(locale46);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat54 = org.apache.commons.lang3.time.FastDateFormat.getInstance("France", timeZone32, locale39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: r");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(timeZone26);
// flaky:         org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone27);
// flaky:         org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone28);
// flaky:         org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(timeZone32);
// flaky:         org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "GMT" + "'", str33, "GMT");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "");
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
// flaky:         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "\u6cd5\u56fd" + "'", str48, "\u6cd5\u56fd");
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertEquals(locale51.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str52 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str52, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs(18);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone1);
        boolean boolean5 = timeZone1.observesDaylightTime();
        timeZone1.setRawOffset(52);
        timeZone1.setID("Temps universel coordonn\351");
        java.util.Locale locale11 = new java.util.Locale("zh");
        java.util.Locale locale12 = java.util.Locale.CHINESE;
        java.lang.String str13 = locale12.getLanguage();
        boolean boolean14 = locale12.hasExtensions();
        java.lang.String str15 = locale12.getDisplayCountry();
        java.lang.String str16 = locale11.getDisplayName(locale12);
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(timeZone1, locale11);
        calendar17.clear();
        long long19 = calendar17.getTimeInMillis();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = calendar17.isSet(53);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone2);
// flaky:         org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals(locale11.toString(), "zh");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "zh" + "'", str13, "zh");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u4e2d\u6587" + "'", str16, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar17);
        org.junit.Assert.assertEquals(calendar17.toString(), "java.util.GregorianCalendar[time=-52,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Temps universel coordonn\351\",offset=52,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-52L) + "'", long19 == (-52L));
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.util.Date date9 = new java.util.Date(3, (int) (short) 0, 6, 0, (int) (short) 1);
        java.util.Date date10 = new java.util.Date();
        int int11 = date10.getTimezoneOffset();
        long long12 = date10.getTime();
        boolean boolean13 = date9.after(date10);
        java.lang.StringBuffer stringBuffer14 = null;
        java.lang.StringBuffer stringBuffer15 = fastDateFormat2.format(date9, stringBuffer14);
        java.util.Calendar calendar16 = java.util.Calendar.getInstance();
        java.lang.StringBuffer stringBuffer17 = null;
        java.lang.StringBuffer stringBuffer18 = fastDateFormat2.format(calendar16, stringBuffer17);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = calendar16.getActualMaximum(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FastDateFormat[]" + "'", str3, "FastDateFormat[]");
        org.junit.Assert.assertEquals(date9.toString(), "Tue Jan 06 00:01:00 GMT 1903");
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Mon Feb 21 14:46:15 GMT 2022");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1645454775219L + "'", long12 == 1645454775219L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(stringBuffer15);
        org.junit.Assert.assertNotNull(calendar16);
// flaky:         org.junit.Assert.assertEquals(calendar16.toString(), "java.util.GregorianCalendar[time=1645454775219,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=15,MILLISECOND=219,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNull(stringBuffer18);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        int int3 = timeZone1.getOffset((long) 2);
        int int4 = timeZone1.getRawOffset();
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder8 = builder5.setExtension('a', "France");
        java.util.Locale locale9 = builder5.build();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(45, timeZone1, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 45");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        java.util.Date date0 = new java.util.Date();
        int int1 = date0.getTimezoneOffset();
        date0.setMonth(0);
        int int4 = date0.getDate();
        date0.setMinutes((int) ' ');
// flaky:         org.junit.Assert.assertEquals(date0.toString(), "Fri Jan 21 14:32:15 GMT 2022");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.lang.Object obj4 = fastDateFormat2.clone();
        java.util.Locale locale5 = fastDateFormat2.getLocale();
        java.lang.Object obj6 = fastDateFormat2.clone();
        java.util.TimeZone timeZone7 = java.util.TimeZone.getDefault();
        int int9 = timeZone7.getOffset((long) 2);
        java.util.Locale locale13 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale14 = locale13.stripExtensions();
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone7, locale14);
        java.lang.String str16 = fastDateFormat2.format(calendar15);
        java.util.Locale locale18 = new java.util.Locale("2:45:52 PM UTC");
        java.util.Locale locale20 = new java.util.Locale("zh");
        java.lang.String str21 = locale18.getDisplayScript(locale20);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator22 = fastDateFormat2.formatToCharacterIterator((java.lang.Object) locale20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.util.Locale");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FastDateFormat[]" + "'", str3, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "FastDateFormat[]");
        org.junit.Assert.assertNotNull(locale5);
// flaky:         org.junit.Assert.assertEquals(locale5.toString(), "zh");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone7);
// flaky:         org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals(locale13.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar15);
// flaky:         org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=1645454775360,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=15,MILLISECOND=360,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals(locale18.toString(), "2:45:52 pm utc");
        org.junit.Assert.assertEquals(locale20.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 2);
        java.util.Locale locale6 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale7 = locale6.stripExtensions();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone0, locale7);
        calendar8.set(122, 52, (int) (byte) 1);
        calendar8.setMinimalDaysInFirstWeek(8);
        // The following exception was thrown during execution in test generation
        try {
            calendar8.roll((int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals(locale6.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=8,ERA=1,YEAR=122,MONTH=52,WEEK_OF_YEAR=17,WEEK_OF_MONTH=0,DAY_OF_MONTH=1,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=15,MILLISECOND=388,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        java.util.TimeZone timeZone0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar1 = java.util.Calendar.getInstance(timeZone0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "France");
        java.util.Locale.Builder builder5 = builder0.removeUnicodeLocaleAttribute("GMT");
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.lang.String str7 = locale6.getVariant();
        java.lang.String str8 = locale6.getDisplayCountry();
        java.util.Locale.Builder builder9 = builder0.setLocale(locale6);
        java.util.Locale locale10 = builder9.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder9.removeUnicodeLocaleAttribute("java.text.FieldPosition[field=16,attribute=null,beginIndex=52,endIndex=0]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: java.text.FieldPosition[field=16,attribute=null,beginIndex=52,endIndex=0] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u6cd5\u570b" + "'", str8, "\u6cd5\u570b");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_FR");
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone1);
        java.util.TimeZone timeZone6 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str7 = timeZone6.getID();
        boolean boolean8 = timeZone1.hasSameRules(timeZone6);
        java.lang.Object obj9 = timeZone1.clone();
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        org.junit.Assert.assertNotNull(timeZone2);
// flaky:         org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(timeZone6);
// flaky:         org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GMT" + "'", str7, "GMT");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        boolean boolean5 = locale4.hasExtensions();
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.util.Locale locale7 = java.util.Locale.CHINESE;
        java.lang.String str8 = locale7.getLanguage();
        java.util.Locale[] localeArray9 = new java.util.Locale[] { locale3, locale4, locale6, locale7 };
        java.util.ArrayList<java.util.Locale> localeList10 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList10, localeArray9);
        java.util.Locale.FilteringMode filteringMode12 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList13 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList10, filteringMode12);
        java.util.Spliterator<java.util.Locale> localeSpliterator14 = localeList13.spliterator();
        localeList13.clear();
        java.util.Date date16 = new java.util.Date();
        int int17 = date16.getTimezoneOffset();
        long long18 = date16.getTime();
        int int19 = date16.getMinutes();
        boolean boolean20 = localeList13.remove((java.lang.Object) date16);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale> localeList23 = localeList13.subList((int) (byte) 100, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh" + "'", str8, "zh");
        org.junit.Assert.assertNotNull(localeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + filteringMode12 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode12.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList13);
        org.junit.Assert.assertNotNull(localeSpliterator14);
// flaky:         org.junit.Assert.assertEquals(date16.toString(), "Mon Feb 21 14:46:15 GMT 2022");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1645454775826L + "'", long18 == 1645454775826L);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 46 + "'", int19 == 46);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "France");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder0.setExtension('#', "Chinese");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: # [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = java.util.Date.parse("fr-FR");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setWeekDate(5, (int) (byte) -1, 1);
        java.util.Calendar.Builder builder8 = builder0.setDate(51, 122, 0);
        java.util.Calendar.Builder builder12 = builder0.setTimeOfDay(45, 7, 16);
        java.util.Calendar.Builder builder16 = builder12.setTimeOfDay((int) (short) 0, (int) (short) 100, 55);
        java.util.Calendar.Builder builder21 = builder12.setTimeOfDay((int) (short) 10, 12, 2, 122);
        int[] intArray27 = new int[] { (short) -1, 7, 3, (short) -1, 54 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder28 = builder12.setFields(intArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, 7, 3, -1, 54]");
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        int int0 = java.util.Calendar.OCTOBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "France");
        java.util.Locale.Builder builder5 = builder0.removeUnicodeLocaleAttribute("GMT");
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.lang.String str7 = locale6.getVariant();
        java.lang.String str8 = locale6.getDisplayCountry();
        java.util.Locale.Builder builder9 = builder0.setLocale(locale6);
        java.util.Locale locale10 = builder9.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder9.addUnicodeLocaleAttribute("\uc624\ud6c4\uc2dc\ubd84\ucd08 GMT");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ???? 2?? 46??? 05?? GMT [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u6cd5\u570b" + "'", str8, "\u6cd5\u570b");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_FR");
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.text.ParsePosition parsePosition6 = new java.text.ParsePosition(16);
        parsePosition6.setIndex(11);
        java.lang.Object obj9 = fastDateFormat2.parseObject("FastDateFormat[]", parsePosition6);
        boolean boolean10 = fastDateFormat2.getTimeZoneOverridesCalendar();
        java.text.AttributedCharacterIterator attributedCharacterIterator12 = fastDateFormat2.formatToCharacterIterator((java.lang.Object) 1645454754924L);
        java.util.Locale locale13 = fastDateFormat2.getLocale();
        java.util.TimeZone timeZone14 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone15 = java.util.TimeZone.getDefault();
        boolean boolean16 = timeZone14.hasSameRules(timeZone15);
        timeZone15.setID("Etc/UTC");
        boolean boolean19 = locale13.equals((java.lang.Object) "Etc/UTC");
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h:mm:ss a z" + "'", str3, "h:mm:ss a z");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributedCharacterIterator12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertNotNull(timeZone14);
// flaky:         org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        org.junit.Assert.assertNotNull(timeZone15);
// flaky:         org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u5354\u8abf\u4e16\u754c\u6642\u9593");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        java.util.Locale locale1 = java.util.Locale.US;
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        java.lang.String str3 = locale1.getDisplayScript();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("zho", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: o");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1645454776319,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=16,MILLISECOND=319,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(12, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone5 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        boolean boolean7 = timeZone5.hasSameRules(timeZone6);
        boolean boolean8 = timeZone4.hasSameRules(timeZone5);
        boolean boolean9 = timeZone5.observesDaylightTime();
        timeZone5.setRawOffset(52);
        timeZone5.setID("Temps universel coordonn\351");
        java.util.Locale locale15 = new java.util.Locale("zh");
        java.util.Locale locale16 = java.util.Locale.CHINESE;
        java.lang.String str17 = locale16.getLanguage();
        boolean boolean18 = locale16.hasExtensions();
        java.lang.String str19 = locale16.getDisplayCountry();
        java.lang.String str20 = locale15.getDisplayName(locale16);
        java.util.Calendar calendar21 = java.util.Calendar.getInstance(timeZone5, locale15);
        calendar21.clear();
        java.lang.String str23 = fastDateFormat2.format(calendar21);
        calendar21.set((int) (short) 1, (int) (byte) 1, 9);
        calendar21.set(7, 55, 2022, (int) (short) 0, 35, 0);
        // The following exception was thrown during execution in test generation
        try {
            calendar21.set(51, 51);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 51");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h:mm:ss a z" + "'", str3, "h:mm:ss a z");
        org.junit.Assert.assertNotNull(timeZone4);
// flaky:         org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone6);
// flaky:         org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals(locale15.toString(), "zh");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "zh" + "'", str17, "zh");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\u4e2d\u6587" + "'", str20, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar21);
        org.junit.Assert.assertEquals(calendar21.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Temps universel coordonn\351\",offset=52,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=7,MONTH=55,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=2022,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=35,SECOND=0,MILLISECOND=0,ZONE_OFFSET=52,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "12:00:00 AM GMT+00:00" + "'", str23, "12:00:00 AM GMT+00:00");
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("\u4e0a\u5348 12:12:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=1970/1/1??12:12:00");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("21 Feb 2022 14:46:11 GMT");
        java.lang.String str2 = timeZone1.getID();
        boolean boolean3 = timeZone1.useDaylightTime();
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GMT" + "'", str2, "GMT");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("java.text.FieldPosition[field=16,attribute=null,beginIndex=52,endIndex=0]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: j");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("US");
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        boolean boolean5 = timeZone3.hasSameRules(timeZone4);
        java.util.Locale locale9 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale10 = locale9.stripExtensions();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone3, locale9);
        boolean boolean12 = languageRange1.equals((java.lang.Object) fastDateFormat11);
        org.junit.Assert.assertNotNull(timeZone3);
// flaky:         org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        org.junit.Assert.assertNotNull(timeZone4);
// flaky:         org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals(locale9.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "_HI!");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str2 = timeZone1.getID();
        java.util.TimeZone.setDefault(timeZone1);
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(timeZone1);
        int int5 = calendar4.getFirstDayOfWeek();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        int int8 = timeZone6.getOffset((long) 2);
        java.util.Locale locale12 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale13 = locale12.stripExtensions();
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone6, locale13);
        calendar4.setTimeZone(timeZone6);
        java.lang.String str16 = timeZone6.getID();
        java.util.Date date17 = new java.util.Date();
        int int18 = date17.getDay();
        java.lang.String str19 = date17.toGMTString();
        java.time.Instant instant20 = date17.toInstant();
        boolean boolean21 = timeZone6.inDaylightTime(date17);
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GMT" + "'", str2, "GMT");
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=1645454776953,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=16,MILLISECOND=953,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(timeZone6);
// flaky:         org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals(locale12.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar14);
// flaky:         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=1645454776953,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=16,MILLISECOND=953,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "GMT" + "'", str16, "GMT");
// flaky:         org.junit.Assert.assertEquals(date17.toString(), "Mon Feb 21 14:46:16 GMT 2022");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "21 Feb 2022 14:46:16 GMT" + "'", str19, "21 Feb 2022 14:46:16 GMT");
        org.junit.Assert.assertNotNull(instant20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setWeekDate(5, (int) (byte) -1, 1);
        java.util.Calendar.Builder builder8 = builder0.setDate(51, 122, 0);
        java.util.Calendar.Builder builder12 = builder8.setWeekDate(8, 58, 52);
        int[] intArray19 = new int[] { 16, 32769, 32772, (byte) 1, (short) 100, 32769 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder20 = builder12.setFields(intArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[16, 32769, 32772, 1, 100, 32769]");
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        boolean boolean5 = locale4.hasExtensions();
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.util.Locale locale7 = java.util.Locale.CHINESE;
        java.lang.String str8 = locale7.getLanguage();
        java.util.Locale[] localeArray9 = new java.util.Locale[] { locale3, locale4, locale6, locale7 };
        java.util.ArrayList<java.util.Locale> localeList10 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList10, localeArray9);
        java.util.Locale.FilteringMode filteringMode12 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList13 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList10, filteringMode12);
        java.util.Spliterator<java.util.Locale> localeSpliterator14 = localeList13.spliterator();
        java.lang.Object[] objArray15 = localeList13.toArray();
        localeList13.clear();
        java.util.Locale.LanguageRange[] languageRangeArray17 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList18 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18, languageRangeArray17);
        java.util.Locale locale20 = java.util.Locale.GERMAN;
        java.util.Locale locale21 = java.util.Locale.FRANCE;
        boolean boolean22 = locale21.hasExtensions();
        java.util.Locale locale23 = java.util.Locale.FRANCE;
        java.util.Locale locale24 = java.util.Locale.CHINESE;
        java.lang.String str25 = locale24.getLanguage();
        java.util.Locale[] localeArray26 = new java.util.Locale[] { locale20, locale21, locale23, locale24 };
        java.util.ArrayList<java.util.Locale> localeList27 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList27, localeArray26);
        java.util.Locale.FilteringMode filteringMode29 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList30 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.util.Locale>) localeList27, filteringMode29);
        java.util.Set<java.lang.String> strSet31 = java.util.Calendar.getAvailableCalendarTypes();
        java.util.stream.Stream<java.lang.String> strStream32 = strSet31.parallelStream();
        java.lang.String str33 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.lang.String>) strSet31);
        boolean boolean34 = localeList13.containsAll((java.util.Collection<java.lang.String>) strSet31);
        java.util.stream.Stream<java.lang.String> strStream35 = strSet31.stream();
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh" + "'", str8, "zh");
        org.junit.Assert.assertNotNull(localeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + filteringMode12 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode12.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList13);
        org.junit.Assert.assertNotNull(localeSpliterator14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(languageRangeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "de");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "zh" + "'", str25, "zh");
        org.junit.Assert.assertNotNull(localeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + filteringMode29 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode29.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList30);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNotNull(strStream32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strStream35);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        java.util.Calendar.Builder builder1 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder5 = builder1.setTimeOfDay(16, (int) ' ', 16);
        java.util.Locale.Builder builder6 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder9 = builder6.setExtension('a', "France");
        java.util.Locale.Builder builder11 = builder6.removeUnicodeLocaleAttribute("GMT");
        java.util.Locale locale12 = java.util.Locale.FRANCE;
        java.lang.String str13 = locale12.getVariant();
        java.lang.String str14 = locale12.getDisplayCountry();
        java.util.Locale.Builder builder15 = builder6.setLocale(locale12);
        java.util.Locale locale17 = new java.util.Locale("zh");
        java.lang.String str18 = locale12.getDisplayName(locale17);
        java.util.Calendar.Builder builder19 = builder1.setLocale(locale12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(18, locale12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 18");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u6cd5\u56fd" + "'", str14, "\u6cd5\u56fd");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertEquals(locale17.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str18, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(timeZone1);
        java.util.Calendar.Builder builder3 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder7 = builder3.setWeekDate(5, (int) (byte) -1, 1);
        java.util.Calendar.Builder builder9 = builder7.setLenient(true);
        java.util.Calendar.Builder builder13 = builder9.setTimeOfDay(122, 11, 10);
        java.util.Calendar.Builder builder17 = builder13.setWeekDate(100, 9, 2);
        java.util.Calendar.Builder builder21 = builder17.setTimeOfDay(52, (int) (short) 10, (-1));
        java.util.Calendar.Builder builder23 = builder21.setLenient(true);
        java.util.Calendar.Builder builder26 = builder21.set(2, 54);
        java.util.Calendar calendar27 = builder21.build();
        java.util.TimeZone timeZone28 = java.util.TimeZone.getDefault();
        int int30 = timeZone28.getOffset((long) 2);
        java.util.Locale locale34 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale35 = locale34.stripExtensions();
        java.util.Calendar calendar36 = java.util.Calendar.getInstance(timeZone28, locale35);
        int int38 = calendar36.getLeastMaximum(4);
        int int40 = calendar36.getLeastMaximum((int) (byte) 0);
        java.util.Date date41 = new java.util.Date();
        int int42 = date41.getTimezoneOffset();
        int int43 = date41.getSeconds();
        boolean boolean44 = calendar36.after((java.lang.Object) date41);
        java.util.Date date45 = new java.util.Date();
        int int46 = date45.getSeconds();
        date45.setTime((long) 16);
        date45.setMinutes(12);
        int int51 = date45.getSeconds();
        date45.setMinutes(51);
        boolean boolean54 = date41.before(date45);
        java.lang.String str55 = date45.toGMTString();
        calendar27.setTime(date45);
        boolean boolean57 = timeZone1.inDaylightTime(date45);
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1645454777296,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=17,MILLISECOND=296,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(calendar27);
// flaky:         org.junit.Assert.assertEquals(calendar27.toString(), "java.util.GregorianCalendar[time=3060016,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=51,SECOND=0,MILLISECOND=16,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone28);
// flaky:         org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals(locale34.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar36);
// flaky:         org.junit.Assert.assertEquals(calendar36.toString(), "java.util.GregorianCalendar[time=1645454777296,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=17,MILLISECOND=296,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
// flaky:         org.junit.Assert.assertEquals(date41.toString(), "Mon Feb 21 14:46:17 GMT 2022");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int43 + "' != '" + 17 + "'", int43 == 17);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals(date45.toString(), "Thu Jan 01 00:51:00 GMT 1970");
// flaky:         org.junit.Assert.assertTrue("'" + int46 + "' != '" + 17 + "'", int46 == 17);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "1 Jan 1970 00:51:00 GMT" + "'", str55, "1 Jan 1970 00:51:00 GMT");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        boolean boolean5 = locale4.hasExtensions();
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.util.Locale locale7 = java.util.Locale.CHINESE;
        java.lang.String str8 = locale7.getLanguage();
        java.util.Locale[] localeArray9 = new java.util.Locale[] { locale3, locale4, locale6, locale7 };
        java.util.ArrayList<java.util.Locale> localeList10 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList10, localeArray9);
        java.util.Locale.FilteringMode filteringMode12 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList13 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList10, filteringMode12);
        java.util.Spliterator<java.util.Locale> localeSpliterator14 = localeList13.spliterator();
        java.lang.Object[] objArray15 = localeList13.toArray();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList17 = java.util.Locale.LanguageRange.parse("zho");
        java.util.Set<java.lang.String> strSet18 = java.util.Calendar.getAvailableCalendarTypes();
        java.util.stream.Stream<java.lang.String> strStream19 = strSet18.parallelStream();
        java.lang.String str20 = java.util.Locale.lookupTag(languageRangeList17, (java.util.Collection<java.lang.String>) strSet18);
        java.util.stream.Stream<java.lang.String> strStream21 = strSet18.stream();
        boolean boolean22 = localeList13.containsAll((java.util.Collection<java.lang.String>) strSet18);
        java.util.Spliterator<java.util.Locale> localeSpliterator23 = localeList13.spliterator();
        java.lang.Class<?> wildcardClass24 = localeSpliterator23.getClass();
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh" + "'", str8, "zh");
        org.junit.Assert.assertNotNull(localeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + filteringMode12 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode12.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList13);
        org.junit.Assert.assertNotNull(localeSpliterator14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(languageRangeList17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(strStream19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(strStream21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(localeSpliterator23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 2);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = timeZone0.getOffset(6, 2022, 53, 2022, 58, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 2);
        java.util.Locale locale6 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale7 = locale6.stripExtensions();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone0, locale7);
        calendar8.set(122, 52, (int) (byte) 1);
        java.lang.String str13 = calendar8.getCalendarType();
        calendar8.setTimeInMillis(1645454750284L);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = calendar8.getMinimum(126);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 126");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals(locale6.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar8);
        org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=1645454750284,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=45,SECOND=50,MILLISECOND=284,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "gregory" + "'", str13, "gregory");
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        boolean boolean2 = timeZone0.hasSameRules(timeZone1);
        boolean boolean3 = timeZone0.observesDaylightTime();
        java.lang.Object obj4 = timeZone0.clone();
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("en-US", (double) 868273253000L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=8.68273253E11");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        java.util.Locale locale7 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale8 = locale7.stripExtensions();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone1, locale7);
        java.util.TimeZone timeZone10 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone11 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone12 = java.util.TimeZone.getDefault();
        boolean boolean13 = timeZone11.hasSameRules(timeZone12);
        boolean boolean14 = timeZone10.hasSameRules(timeZone11);
        boolean boolean15 = timeZone11.observesDaylightTime();
        timeZone11.setRawOffset(52);
        timeZone11.setID("Temps universel coordonn\351");
        java.util.Locale locale21 = new java.util.Locale("zh");
        java.util.Locale locale22 = java.util.Locale.CHINESE;
        java.lang.String str23 = locale22.getLanguage();
        boolean boolean24 = locale22.hasExtensions();
        java.lang.String str25 = locale22.getDisplayCountry();
        java.lang.String str26 = locale21.getDisplayName(locale22);
        java.util.Calendar calendar27 = java.util.Calendar.getInstance(timeZone11, locale21);
        java.lang.String str28 = fastDateFormat9.format(calendar27);
        // The following exception was thrown during execution in test generation
        try {
            calendar27.clear(49);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 49");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone2);
// flaky:         org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals(locale7.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "_HI!");
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(timeZone10);
// flaky:         org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone12);
// flaky:         org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals(locale21.toString(), "zh");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "zh" + "'", str23, "zh");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\u4e2d\u6587" + "'", str26, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar27);
// flaky:         org.junit.Assert.assertEquals(calendar27.toString(), "java.util.GregorianCalendar[time=1645454777889,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Temps universel coordonn\351\",offset=52,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=17,MILLISECOND=941,ZONE_OFFSET=52,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        java.util.Locale locale1 = java.util.Locale.KOREA;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, locale1);
        java.lang.String str4 = fastDateFormat2.format((java.lang.Object) 1645454750118L);
        java.util.TimeZone timeZone5 = java.util.TimeZone.getDefault();
        int int7 = timeZone5.getOffset((long) 2);
        java.util.Locale locale11 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale12 = locale11.stripExtensions();
        java.util.Calendar calendar13 = java.util.Calendar.getInstance(timeZone5, locale12);
        int int15 = calendar13.getLeastMaximum(4);
        calendar13.setFirstDayOfWeek((-1));
        int int18 = calendar13.getFirstDayOfWeek();
        java.lang.String str19 = fastDateFormat2.format(calendar13);
        java.lang.Object obj20 = fastDateFormat2.clone();
        java.util.Date date21 = new java.util.Date();
        int int22 = date21.getSeconds();
        date21.setTime((long) 16);
        date21.setMinutes(12);
        int int27 = date21.getMinutes();
        java.util.Date date28 = new java.util.Date();
        int int29 = date28.getTimezoneOffset();
        date28.setMinutes(5);
        int int32 = date28.getMonth();
        boolean boolean33 = date21.before(date28);
        java.lang.String str34 = fastDateFormat2.format(date21);
        java.lang.StringBuffer stringBuffer36 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer37 = fastDateFormat2.format(1645454768272L, stringBuffer36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(fastDateFormat2);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\uc624\ud6c4\uc2dc\ubd84\ucd08 UTC" + "'", str4, "\uc624\ud6c4\uc2dc\ubd84\ucd08 UTC");
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals(locale11.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar13);
// flaky:         org.junit.Assert.assertEquals(calendar13.toString(), "java.util.GregorianCalendar[time=1645454778071,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=-1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=18,MILLISECOND=71,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\uc624\ud6c4\uc2dc\ubd84\ucd08 GMT" + "'", str19, "\uc624\ud6c4\uc2dc\ubd84\ucd08 GMT");
        org.junit.Assert.assertNotNull(obj20);
// flaky:         org.junit.Assert.assertEquals(obj20.toString(), "\uc2dc\ubd84\ucd08' z]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "\uc2dc\ubd84\ucd08' z]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "\uc2dc\ubd84\ucd08' z]");
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:12:00 GMT 1970");
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 18 + "'", int22 == 18);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 12 + "'", int27 == 12);
// flaky:         org.junit.Assert.assertEquals(date28.toString(), "Mon Feb 21 14:05:18 GMT 2022");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\uc624\uc804\uc2dc\ubd84\ucd08 UTC" + "'", str34, "\uc624\uc804\uc2dc\ubd84\ucd08 UTC");
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        boolean boolean5 = locale4.hasExtensions();
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.util.Locale locale7 = java.util.Locale.CHINESE;
        java.lang.String str8 = locale7.getLanguage();
        java.util.Locale[] localeArray9 = new java.util.Locale[] { locale3, locale4, locale6, locale7 };
        java.util.ArrayList<java.util.Locale> localeList10 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList10, localeArray9);
        java.util.Locale.FilteringMode filteringMode12 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList13 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList10, filteringMode12);
        java.util.ListIterator<java.util.Locale> localeItor14 = localeList13.listIterator();
        java.util.Iterator<java.util.Locale> localeItor15 = localeList13.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale17 = localeList13.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh" + "'", str8, "zh");
        org.junit.Assert.assertNotNull(localeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + filteringMode12 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode12.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList13);
        org.junit.Assert.assertNotNull(localeItor14);
        org.junit.Assert.assertNotNull(localeItor15);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        java.text.ParsePosition parsePosition1 = new java.text.ParsePosition((int) (short) 10);
        int int2 = parsePosition1.getIndex();
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder6 = builder3.setExtension('a', "France");
        java.util.Locale.Builder builder8 = builder3.removeUnicodeLocaleAttribute("GMT");
        java.util.Locale locale9 = java.util.Locale.FRANCE;
        java.lang.String str10 = locale9.getVariant();
        java.lang.String str11 = locale9.getDisplayCountry();
        java.util.Locale.Builder builder12 = builder3.setLocale(locale9);
        java.util.Locale locale13 = builder12.build();
        boolean boolean14 = parsePosition1.equals((java.lang.Object) builder12);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder12.setLanguageTag("21 Feb 2022 14:46:11 GMT");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: 21 Feb 2022 14:46:11 GMT [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u6cd5\u56fd" + "'", str11, "\u6cd5\u56fd");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "France");
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("h:mm:ss a z");
        java.util.Locale.Builder builder6 = builder3.setLocale(locale5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder3.setExtension('u', "\uc624\ud6c4\uc2dc\ubd84\ucd08 GMT");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: ???? 2?? 46??? 05?? GMT [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setWeekDate(5, (int) (byte) -1, 1);
        java.util.Calendar.Builder builder6 = builder4.setLenient(true);
        java.util.Calendar.Builder builder10 = builder6.setTimeOfDay(122, 11, 10);
        java.util.Calendar.Builder builder14 = builder10.setWeekDate(100, 9, 2);
        java.util.Calendar.Builder builder18 = builder14.setTimeOfDay(52, (int) (short) 10, (-1));
        java.util.Calendar.Builder builder20 = builder18.setLenient(true);
        java.util.Calendar.Builder builder23 = builder18.set(2, 54);
        java.util.Calendar calendar24 = builder18.build();
        // The following exception was thrown during execution in test generation
        try {
            int int26 = calendar24.get((int) 'x');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 120");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(calendar24);
// flaky:         org.junit.Assert.assertEquals(calendar24.toString(), "java.util.GregorianCalendar[time=-59006778601000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=100,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=5,DAY_OF_MONTH=26,DAY_OF_YEAR=57,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=9,SECOND=59,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "France");
        java.util.Locale.Builder builder5 = builder0.removeUnicodeLocaleAttribute("GMT");
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.lang.String str7 = locale6.getVariant();
        java.lang.String str8 = locale6.getDisplayCountry();
        java.util.Locale.Builder builder9 = builder0.setLocale(locale6);
        java.util.Locale locale10 = builder9.build();
        java.util.Locale.Builder builder11 = builder9.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder9.removeUnicodeLocaleAttribute("en");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: en [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u6cd5\u56fd" + "'", str8, "\u6cd5\u56fd");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.lang.String str1 = timeZone0.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Greenwich Mean Time");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Greenwich Mean Time" + "'", str1, "Greenwich Mean Time");
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        boolean boolean5 = locale4.hasExtensions();
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.util.Locale locale7 = java.util.Locale.CHINESE;
        java.lang.String str8 = locale7.getLanguage();
        java.util.Locale[] localeArray9 = new java.util.Locale[] { locale3, locale4, locale6, locale7 };
        java.util.ArrayList<java.util.Locale> localeList10 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList10, localeArray9);
        java.util.Locale.FilteringMode filteringMode12 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList13 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList10, filteringMode12);
        java.util.Spliterator<java.util.Locale> localeSpliterator14 = localeList13.spliterator();
        java.lang.Object[] objArray15 = localeList13.toArray();
        localeList13.clear();
        java.util.Locale.LanguageRange[] languageRangeArray17 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList18 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18, languageRangeArray17);
        java.util.Locale locale20 = java.util.Locale.GERMAN;
        java.util.Locale locale21 = java.util.Locale.FRANCE;
        boolean boolean22 = locale21.hasExtensions();
        java.util.Locale locale23 = java.util.Locale.FRANCE;
        java.util.Locale locale24 = java.util.Locale.CHINESE;
        java.lang.String str25 = locale24.getLanguage();
        java.util.Locale[] localeArray26 = new java.util.Locale[] { locale20, locale21, locale23, locale24 };
        java.util.ArrayList<java.util.Locale> localeList27 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList27, localeArray26);
        java.util.Locale.FilteringMode filteringMode29 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList30 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.util.Locale>) localeList27, filteringMode29);
        java.util.Set<java.lang.String> strSet31 = java.util.Calendar.getAvailableCalendarTypes();
        java.util.stream.Stream<java.lang.String> strStream32 = strSet31.parallelStream();
        java.lang.String str33 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.lang.String>) strSet31);
        boolean boolean34 = localeList13.containsAll((java.util.Collection<java.lang.String>) strSet31);
        java.lang.Object[] objArray35 = localeList13.toArray();
        boolean boolean37 = localeList13.equals((java.lang.Object) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale39 = localeList13.get(46);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 46, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh" + "'", str8, "zh");
        org.junit.Assert.assertNotNull(localeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + filteringMode12 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode12.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList13);
        org.junit.Assert.assertNotNull(localeSpliterator14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(languageRangeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "de");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "zh" + "'", str25, "zh");
        org.junit.Assert.assertNotNull(localeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + filteringMode29 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode29.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList30);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNotNull(strStream32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        boolean boolean4 = timeZone2.hasSameRules(timeZone3);
        boolean boolean5 = timeZone1.hasSameRules(timeZone2);
        boolean boolean6 = timeZone2.observesDaylightTime();
        timeZone2.setRawOffset(52);
        timeZone2.setID("Temps universel coordonn\351");
        java.util.Locale locale12 = new java.util.Locale("zh");
        java.util.Locale locale13 = java.util.Locale.CHINESE;
        java.lang.String str14 = locale13.getLanguage();
        boolean boolean15 = locale13.hasExtensions();
        java.lang.String str16 = locale13.getDisplayCountry();
        java.lang.String str17 = locale12.getDisplayName(locale13);
        java.util.Calendar calendar18 = java.util.Calendar.getInstance(timeZone2, locale12);
        java.util.TimeZone timeZone19 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone20 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone21 = java.util.TimeZone.getDefault();
        boolean boolean22 = timeZone20.hasSameRules(timeZone21);
        boolean boolean23 = timeZone19.hasSameRules(timeZone20);
        java.util.TimeZone timeZone25 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str26 = timeZone25.getID();
        boolean boolean27 = timeZone20.hasSameRules(timeZone25);
        timeZone25.setRawOffset(126);
        calendar18.setTimeZone(timeZone25);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(4, timeZone25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone3);
// flaky:         org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals(locale12.toString(), "zh");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "zh" + "'", str14, "zh");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\u4e2d\u6587" + "'", str17, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar18);
// flaky:         org.junit.Assert.assertEquals(calendar18.toString(), "java.util.GregorianCalendar[time=1645454778695,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=126,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=18,MILLISECOND=747,ZONE_OFFSET=52,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone19);
// flaky:         org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone20);
// flaky:         org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone21);
// flaky:         org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(timeZone25);
// flaky:         org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "GMT" + "'", str26, "GMT");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "France");
        java.util.Locale.Builder builder5 = builder0.removeUnicodeLocaleAttribute("GMT");
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.lang.String str7 = locale6.getVariant();
        java.lang.String str8 = locale6.getDisplayCountry();
        java.util.Locale.Builder builder9 = builder0.setLocale(locale6);
        java.util.Locale locale10 = builder9.build();
        java.util.Locale.Builder builder11 = builder9.clearExtensions();
        java.util.Locale locale13 = new java.util.Locale("zh");
        java.util.Locale locale14 = java.util.Locale.CHINESE;
        java.lang.String str15 = locale14.getLanguage();
        boolean boolean16 = locale14.hasExtensions();
        java.lang.String str17 = locale14.getDisplayCountry();
        java.lang.String str18 = locale13.getDisplayName(locale14);
        java.util.Locale.setDefault(locale13);
        java.lang.String str20 = locale13.getVariant();
        java.util.Locale.Builder builder21 = builder11.setLocale(locale13);
        java.util.Locale locale22 = builder21.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder24 = builder21.removeUnicodeLocaleAttribute("java.text.AttributedCharacterIterator$Attribute(reading)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: java.text.AttributedCharacterIterator$Attribute(reading) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u6cd5\u56fd" + "'", str8, "\u6cd5\u56fd");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertEquals(locale13.toString(), "zh");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "zh" + "'", str15, "zh");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u4e2d\u6587" + "'", str18, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh");
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        java.util.Locale locale1 = new java.util.Locale("2:45:52 PM UTC");
        java.util.Locale locale3 = new java.util.Locale("zh");
        java.lang.String str4 = locale1.getDisplayScript(locale3);
        java.lang.String str5 = locale3.getLanguage();
        java.lang.String str6 = locale3.toString();
        org.junit.Assert.assertEquals(locale1.toString(), "2:45:52 pm utc");
        org.junit.Assert.assertEquals(locale3.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh" + "'", str5, "zh");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh" + "'", str6, "zh");
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setWeekDate(5, (int) (byte) -1, 1);
        java.util.Calendar.Builder builder6 = builder4.setLenient(true);
        java.util.Calendar.Builder builder10 = builder6.setTimeOfDay(122, 11, 10);
        java.util.Calendar.Builder builder14 = builder10.setWeekDate(100, 9, 2);
        java.util.Calendar.Builder builder18 = builder10.setDate(5, 53, 51);
        java.util.Locale.Category category19 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale20 = java.util.Locale.TAIWAN;
        java.util.Locale locale21 = locale20.stripExtensions();
        java.util.Locale.setDefault(category19, locale20);
        java.util.Calendar.Builder builder23 = builder10.setLocale(locale20);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder25 = builder10.setCalendarType("Etc/UTC");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown calendar type: Etc/UTC");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + category19 + "' != '" + java.util.Locale.Category.FORMAT + "'", category19.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("2:45:53 PM UTC", (double) 1645454772545L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=1.645454772545E12");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("21 Feb 2022 14:46:11 GMT");
        java.lang.String str2 = timeZone1.getID();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = timeZone1.getDisplayName(true, 55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 55");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GMT" + "'", str2, "GMT");
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 2);
        java.util.Locale locale6 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale7 = locale6.stripExtensions();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone0, locale7);
        int int10 = calendar8.getLeastMaximum(4);
        java.util.TimeZone timeZone11 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone12 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone13 = java.util.TimeZone.getDefault();
        boolean boolean14 = timeZone12.hasSameRules(timeZone13);
        boolean boolean15 = timeZone11.hasSameRules(timeZone12);
        java.util.Calendar calendar16 = java.util.Calendar.getInstance(timeZone12);
        calendar8.setTimeZone(timeZone12);
        java.lang.Object obj18 = calendar8.clone();
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals(locale6.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=1645454778981,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=18,MILLISECOND=981,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(timeZone11);
// flaky:         org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone12);
// flaky:         org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone13);
// flaky:         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(calendar16);
// flaky:         org.junit.Assert.assertEquals(calendar16.toString(), "java.util.GregorianCalendar[time=1645454778981,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=18,MILLISECOND=981,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(obj18);
// flaky:         org.junit.Assert.assertEquals(obj18.toString(), "java.util.GregorianCalendar[time=1645454778981,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=18,MILLISECOND=981,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "java.util.GregorianCalendar[time=1645454778981,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=18,MILLISECOND=981,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "java.util.GregorianCalendar[time=1645454778981,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=18,MILLISECOND=981,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.text.ParsePosition parsePosition6 = new java.text.ParsePosition(16);
        parsePosition6.setIndex(11);
        java.lang.Object obj9 = fastDateFormat2.parseObject("FastDateFormat[]", parsePosition6);
        java.util.TimeZone timeZone12 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone12);
        java.lang.String str14 = fastDateFormat13.getPattern();
        java.text.ParsePosition parsePosition17 = new java.text.ParsePosition((int) (short) 10);
        int int18 = parsePosition17.getIndex();
        java.lang.Object obj19 = fastDateFormat13.parseObject("\uc624\uc804\uc2dc\ubd84\ucd08 UTC", parsePosition17);
        java.lang.Object obj20 = fastDateFormat2.parseObject("2:45:54 PM UTC", parsePosition17);
        java.lang.String str21 = fastDateFormat2.getPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = fastDateFormat2.parseObject("Etc/UTC");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h:mm:ss a z" + "'", str3, "h:mm:ss a z");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h:mm:ss a z" + "'", str14, "h:mm:ss a z");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "h:mm:ss a z" + "'", str21, "h:mm:ss a z");
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "France");
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("h:mm:ss a z");
        java.util.Locale.Builder builder6 = builder3.setLocale(locale5);
        java.util.Locale locale7 = builder6.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder6.setRegion("21 Feb 2022 14:46:12 GMT");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: 21 Feb 2022 14:46:12 GMT [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        long long1 = java.util.Date.parse("Mon Feb 21 14:45:50 GMT 2022");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1645454750000L + "'", long1 == 1645454750000L);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        boolean boolean5 = locale4.hasExtensions();
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.util.Locale locale7 = java.util.Locale.CHINESE;
        java.lang.String str8 = locale7.getLanguage();
        java.util.Locale[] localeArray9 = new java.util.Locale[] { locale3, locale4, locale6, locale7 };
        java.util.ArrayList<java.util.Locale> localeList10 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList10, localeArray9);
        java.util.Locale.FilteringMode filteringMode12 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList13 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList10, filteringMode12);
        java.util.Spliterator<java.util.Locale> localeSpliterator14 = localeList13.spliterator();
        java.lang.Object[] objArray15 = localeList13.toArray();
        localeList13.clear();
        java.util.Set<java.lang.String> strSet17 = java.util.Calendar.getAvailableCalendarTypes();
        boolean boolean18 = localeList13.retainAll((java.util.Collection<java.lang.String>) strSet17);
        java.util.function.UnaryOperator<java.util.Locale> localeUnaryOperator19 = null;
        // The following exception was thrown during execution in test generation
        try {
            localeList13.replaceAll(localeUnaryOperator19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh" + "'", str8, "zh");
        org.junit.Assert.assertNotNull(localeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + filteringMode12 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode12.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList13);
        org.junit.Assert.assertNotNull(localeSpliterator14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone1);
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(timeZone1);
        calendar5.setTimeInMillis(1645454754937L);
        // The following exception was thrown during execution in test generation
        try {
            calendar5.roll((int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone2);
// flaky:         org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(calendar5);
// flaky:         org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=1645454754937,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=45,SECOND=54,MILLISECOND=937,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        long long6 = java.util.Date.UTC(9, (int) ' ', 1969, 292269054, 12, 122);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1050497705642000L + "'", long6 == 1050497705642000L);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 2);
        java.util.Locale locale6 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale7 = locale6.stripExtensions();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone0, locale7);
        calendar8.set(122, 52, (int) (byte) 1);
        java.lang.String str13 = calendar8.getCalendarType();
        int int15 = calendar8.getActualMinimum(0);
        java.util.Locale.LanguageRange[] languageRangeArray16 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList17 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList17, languageRangeArray16);
        java.util.Locale.LanguageRange[] languageRangeArray19 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList20 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20, languageRangeArray19);
        java.util.Locale locale22 = java.util.Locale.GERMAN;
        java.util.Locale locale23 = java.util.Locale.FRANCE;
        boolean boolean24 = locale23.hasExtensions();
        java.util.Locale locale25 = java.util.Locale.FRANCE;
        java.util.Locale locale26 = java.util.Locale.CHINESE;
        java.lang.String str27 = locale26.getLanguage();
        java.util.Locale[] localeArray28 = new java.util.Locale[] { locale22, locale23, locale25, locale26 };
        java.util.ArrayList<java.util.Locale> localeList29 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList29, localeArray28);
        java.util.Locale.FilteringMode filteringMode31 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList32 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.util.Locale>) localeList29, filteringMode31);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList34 = java.util.Locale.LanguageRange.parse("zho");
        java.util.Set<java.lang.String> strSet35 = java.util.Calendar.getAvailableCalendarTypes();
        java.util.stream.Stream<java.lang.String> strStream36 = strSet35.parallelStream();
        java.lang.String str37 = java.util.Locale.lookupTag(languageRangeList34, (java.util.Collection<java.lang.String>) strSet35);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList39 = java.util.Locale.LanguageRange.parse("zho");
        java.util.Set<java.lang.String> strSet40 = java.util.Calendar.getAvailableCalendarTypes();
        java.util.stream.Stream<java.lang.String> strStream41 = strSet40.parallelStream();
        java.lang.String str42 = java.util.Locale.lookupTag(languageRangeList39, (java.util.Collection<java.lang.String>) strSet40);
        java.util.stream.Stream<java.lang.String> strStream43 = strSet40.stream();
        java.util.List<java.lang.String> strList44 = java.util.Locale.filterTags(languageRangeList34, (java.util.Collection<java.lang.String>) strSet40);
        boolean boolean45 = localeList32.containsAll((java.util.Collection<java.lang.String>) strList44);
        java.util.Locale.FilteringMode filteringMode46 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.lang.String> strList47 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.lang.String>) strList44, filteringMode46);
        boolean boolean48 = calendar8.before((java.lang.Object) strList44);
        // The following exception was thrown during execution in test generation
        try {
            int int50 = calendar8.getActualMinimum((int) 'x');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 120");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals(locale6.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=122,MONTH=52,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=1,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=19,MILLISECOND=266,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "gregory" + "'", str13, "gregory");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(languageRangeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(languageRangeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "de");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "zh" + "'", str27, "zh");
        org.junit.Assert.assertNotNull(localeArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + filteringMode31 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode31.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList32);
        org.junit.Assert.assertNotNull(languageRangeList34);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(strStream36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(languageRangeList39);
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertNotNull(strStream41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(strStream43);
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + filteringMode46 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode46.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone1);
        int int5 = timeZone1.getRawOffset();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone7 = java.util.TimeZone.getDefault();
        boolean boolean8 = timeZone6.hasSameRules(timeZone7);
        timeZone7.setID("Etc/UTC");
        boolean boolean11 = timeZone1.hasSameRules(timeZone7);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = timeZone7.getOffset(21, 11, 15, (int) (short) 100, 1969, 51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone2);
// flaky:         org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(timeZone6);
// flaky:         org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone7);
// flaky:         org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.text.ParsePosition parsePosition6 = new java.text.ParsePosition(16);
        parsePosition6.setIndex(11);
        java.lang.Object obj9 = fastDateFormat2.parseObject("FastDateFormat[]", parsePosition6);
        java.util.Locale locale10 = java.util.Locale.JAPANESE;
        java.lang.StringBuffer stringBuffer11 = null;
        java.text.Format.Field field12 = null;
        java.text.FieldPosition fieldPosition14 = new java.text.FieldPosition(field12, 0);
        fieldPosition14.setEndIndex(9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer17 = fastDateFormat2.format((java.lang.Object) locale10, stringBuffer11, fieldPosition14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.util.Locale");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h:mm:ss a z" + "'", str3, "h:mm:ss a z");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ja");
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone1);
        boolean boolean5 = timeZone1.observesDaylightTime();
        java.lang.String str6 = timeZone1.getID();
        java.lang.Object obj7 = timeZone1.clone();
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone2);
// flaky:         org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "GMT" + "'", str6, "GMT");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        boolean boolean4 = timeZone2.hasSameRules(timeZone3);
        boolean boolean5 = timeZone1.hasSameRules(timeZone2);
        boolean boolean6 = timeZone2.observesDaylightTime();
        java.util.TimeZone timeZone7 = java.util.TimeZone.getDefault();
        int int9 = timeZone7.getOffset((long) 2);
        java.util.Locale locale13 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale14 = locale13.stripExtensions();
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone7, locale14);
        boolean boolean16 = timeZone2.hasSameRules(timeZone7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(23, timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 23");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone2);
// flaky:         org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone3);
// flaky:         org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(timeZone7);
// flaky:         org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals(locale13.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar15);
// flaky:         org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=1645454779441,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=19,MILLISECOND=441,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        boolean boolean4 = timeZone2.hasSameRules(timeZone3);
        boolean boolean5 = timeZone1.hasSameRules(timeZone2);
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(timeZone2);
        timeZone2.setID("java.text.AttributedCharacterIterator$Attribute(input_method_segment)");
        java.util.Locale.Category category9 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale10 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(category9, locale10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) ' ', timeZone2, locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone3);
// flaky:         org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(calendar6);
// flaky:         org.junit.Assert.assertEquals(calendar6.toString(), "java.util.GregorianCalendar[time=1645454779507,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"java.text.AttributedCharacterIterator$Attribute(input_method_segment)\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=19,MILLISECOND=507,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + category9 + "' != '" + java.util.Locale.Category.FORMAT + "'", category9.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "de");
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone1);
        boolean boolean5 = timeZone1.observesDaylightTime();
        timeZone1.setRawOffset(52);
        timeZone1.setID("Temps universel coordonn\351");
        java.util.Locale locale11 = new java.util.Locale("zh");
        java.util.Locale locale12 = java.util.Locale.CHINESE;
        java.lang.String str13 = locale12.getLanguage();
        boolean boolean14 = locale12.hasExtensions();
        java.lang.String str15 = locale12.getDisplayCountry();
        java.lang.String str16 = locale11.getDisplayName(locale12);
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(timeZone1, locale11);
        java.util.TimeZone timeZone18 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone19 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone20 = java.util.TimeZone.getDefault();
        boolean boolean21 = timeZone19.hasSameRules(timeZone20);
        boolean boolean22 = timeZone18.hasSameRules(timeZone19);
        java.util.TimeZone timeZone24 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str25 = timeZone24.getID();
        boolean boolean26 = timeZone19.hasSameRules(timeZone24);
        timeZone24.setRawOffset(126);
        calendar17.setTimeZone(timeZone24);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = calendar17.getMaximum((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone2);
// flaky:         org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals(locale11.toString(), "zh");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "zh" + "'", str13, "zh");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u4e2d\u6587" + "'", str16, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar17);
// flaky:         org.junit.Assert.assertEquals(calendar17.toString(), "java.util.GregorianCalendar[time=1645454779566,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=126,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=19,MILLISECOND=618,ZONE_OFFSET=52,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone18);
// flaky:         org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone19);
// flaky:         org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone20);
// flaky:         org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(timeZone24);
// flaky:         org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "GMT" + "'", str25, "GMT");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        boolean boolean4 = timeZone2.hasSameRules(timeZone3);
        boolean boolean5 = timeZone1.hasSameRules(timeZone2);
        java.lang.String str6 = timeZone2.getID();
        java.util.TimeZone timeZone7 = java.util.TimeZone.getDefault();
        int int9 = timeZone7.getOffset((long) 2);
        int int10 = timeZone7.getRawOffset();
        boolean boolean11 = timeZone2.hasSameRules(timeZone7);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone7);
        java.util.TimeZone timeZone13 = java.util.TimeZone.getDefault();
        int int15 = timeZone13.getOffset((long) 2);
        java.util.Locale locale19 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale20 = locale19.stripExtensions();
        java.util.Calendar calendar21 = java.util.Calendar.getInstance(timeZone13, locale20);
        calendar21.set(122, 52, (int) (byte) 1);
        java.lang.String str26 = calendar21.getCalendarType();
        int int27 = calendar21.getWeekYear();
        calendar21.clear();
        calendar21.setLenient(true);
        int int32 = calendar21.getMaximum((int) (short) 10);
        java.lang.StringBuffer stringBuffer33 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer34 = fastDateFormat12.format(calendar21, stringBuffer33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone2);
// flaky:         org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone3);
// flaky:         org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "GMT" + "'", str6, "GMT");
        org.junit.Assert.assertNotNull(timeZone7);
// flaky:         org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
// flaky:         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals(locale19.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar21);
        org.junit.Assert.assertEquals(calendar21.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "gregory" + "'", str26, "gregory");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 126 + "'", int27 == 126);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 11 + "'", int32 == 11);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        java.util.Date date0 = new java.util.Date();
        int int1 = date0.getDay();
        int int2 = date0.getTimezoneOffset();
        java.lang.Object obj3 = date0.clone();
// flaky:         org.junit.Assert.assertEquals(date0.toString(), "Mon Feb 21 14:46:19 GMT 2022");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(obj3);
// flaky:         org.junit.Assert.assertEquals(obj3.toString(), "Mon Feb 21 14:46:19 GMT 2022");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "Mon Feb 21 14:46:19 GMT 2022");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "Mon Feb 21 14:46:19 GMT 2022");
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) -1, 32770);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 32770");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone5 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        boolean boolean7 = timeZone5.hasSameRules(timeZone6);
        boolean boolean8 = timeZone4.hasSameRules(timeZone5);
        boolean boolean9 = timeZone5.observesDaylightTime();
        timeZone5.setRawOffset(52);
        timeZone5.setID("Temps universel coordonn\351");
        java.util.Locale locale15 = new java.util.Locale("zh");
        java.util.Locale locale16 = java.util.Locale.CHINESE;
        java.lang.String str17 = locale16.getLanguage();
        boolean boolean18 = locale16.hasExtensions();
        java.lang.String str19 = locale16.getDisplayCountry();
        java.lang.String str20 = locale15.getDisplayName(locale16);
        java.util.Calendar calendar21 = java.util.Calendar.getInstance(timeZone5, locale15);
        calendar21.clear();
        java.lang.String str23 = fastDateFormat2.format(calendar21);
        int int25 = calendar21.getGreatestMinimum(10);
        calendar21.roll(3, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            calendar21.roll(15, 19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h:mm:ss a z" + "'", str3, "h:mm:ss a z");
        org.junit.Assert.assertNotNull(timeZone4);
// flaky:         org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone6);
// flaky:         org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals(locale15.toString(), "zh");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "zh" + "'", str17, "zh");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\u4e2d\u6587" + "'", str20, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar21);
        org.junit.Assert.assertEquals(calendar21.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Temps universel coordonn\351\",offset=52,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=46,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=52,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "12:00:00 AM GMT+00:00" + "'", str23, "12:00:00 AM GMT+00:00");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        boolean boolean5 = timeZone3.hasSameRules(timeZone4);
        boolean boolean6 = timeZone2.hasSameRules(timeZone3);
        java.util.TimeZone timeZone8 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str9 = timeZone8.getID();
        boolean boolean10 = timeZone3.hasSameRules(timeZone8);
        java.util.Locale locale11 = java.util.Locale.FRANCE;
        boolean boolean12 = locale11.hasExtensions();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone8, locale11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(11, locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 11");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "GMT" + "'", str9, "GMT");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(fastDateFormat13);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "France");
        java.util.Locale.Builder builder5 = builder0.removeUnicodeLocaleAttribute("GMT");
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.lang.String str7 = locale6.getVariant();
        java.lang.String str8 = locale6.getDisplayCountry();
        java.util.Locale.Builder builder9 = builder0.setLocale(locale6);
        java.util.Locale locale10 = builder9.build();
        java.util.Locale.Builder builder11 = builder9.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder11.setVariant("1 janv. 1970 00:12:00");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: 1 janv. 1970 00:12:00 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "France" + "'", str8, "France");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone1);
        boolean boolean5 = timeZone1.observesDaylightTime();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        int int8 = timeZone6.getOffset((long) 2);
        java.util.Locale locale12 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale13 = locale12.stripExtensions();
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone6, locale13);
        boolean boolean15 = timeZone1.hasSameRules(timeZone6);
        java.util.TimeZone timeZone18 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone19 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone20 = java.util.TimeZone.getDefault();
        boolean boolean21 = timeZone19.hasSameRules(timeZone20);
        boolean boolean22 = timeZone18.hasSameRules(timeZone19);
        boolean boolean23 = timeZone19.observesDaylightTime();
        timeZone19.setRawOffset(52);
        timeZone19.setID("Temps universel coordonn\351");
        java.util.Locale locale29 = new java.util.Locale("zh");
        java.util.Locale locale30 = java.util.Locale.CHINESE;
        java.lang.String str31 = locale30.getLanguage();
        boolean boolean32 = locale30.hasExtensions();
        java.lang.String str33 = locale30.getDisplayCountry();
        java.lang.String str34 = locale29.getDisplayName(locale30);
        java.util.Calendar calendar35 = java.util.Calendar.getInstance(timeZone19, locale29);
        java.util.Set<java.lang.Character> charSet36 = locale29.getExtensionKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str37 = timeZone1.getDisplayName(false, 6, locale29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals(locale12.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar14);
// flaky:         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=1645454779913,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=19,MILLISECOND=913,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals(locale29.toString(), "zh");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "zh" + "'", str31, "zh");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\u4e2d\u6587" + "'", str34, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar35);
// flaky:         org.junit.Assert.assertEquals(calendar35.toString(), "java.util.GregorianCalendar[time=1645454779913,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Temps universel coordonn\351\",offset=52,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=19,MILLISECOND=965,ZONE_OFFSET=52,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(charSet36);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        java.util.Locale locale0 = java.util.Locale.US;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        java.util.TimeZone timeZone2 = calendar1.getTimeZone();
        calendar1.set(49, (int) (short) 10, 126);
        // The following exception was thrown during execution in test generation
        try {
            calendar1.clear(19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 19");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=49,MONTH=10,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=126,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=20,MILLISECOND=72,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone2);
// flaky:         org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Heure de Greenwich");
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        boolean boolean4 = timeZone2.hasSameRules(timeZone3);
        java.util.Locale locale8 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale9 = locale8.stripExtensions();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone2, locale8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(56, timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 56");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals(locale8.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "_HI!");
        org.junit.Assert.assertNotNull(fastDateFormat10);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        boolean boolean2 = timeZone0.hasSameRules(timeZone1);
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        boolean boolean5 = timeZone3.hasSameRules(timeZone4);
        timeZone4.setID("Etc/UTC");
        boolean boolean8 = timeZone1.hasSameRules(timeZone4);
        java.util.Locale locale9 = java.util.Locale.FRANCE;
        java.util.Locale.setDefault(locale9);
        java.util.Locale locale11 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet12 = locale11.getUnicodeLocaleKeys();
        java.lang.String str13 = locale11.getDisplayLanguage();
        java.lang.String str14 = locale9.getDisplayVariant(locale11);
        java.lang.String str15 = locale11.getDisplayLanguage();
        java.lang.String str16 = timeZone4.getDisplayName(locale11);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chinois" + "'", str13, "chinois");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chinois" + "'", str15, "chinois");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Coordinated Universal Time" + "'", str16, "Coordinated Universal Time");
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        boolean boolean4 = timeZone2.hasSameRules(timeZone3);
        boolean boolean5 = timeZone1.hasSameRules(timeZone2);
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone7 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone8 = java.util.TimeZone.getDefault();
        boolean boolean9 = timeZone7.hasSameRules(timeZone8);
        boolean boolean10 = timeZone6.hasSameRules(timeZone7);
        java.lang.String str11 = timeZone7.getID();
        boolean boolean12 = timeZone2.hasSameRules(timeZone7);
        int int14 = timeZone7.getOffset(1645452352636L);
        int int15 = timeZone7.getRawOffset();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(45, timeZone7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 45");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "GMT" + "'", str11, "GMT");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        boolean boolean5 = locale4.hasExtensions();
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.util.Locale locale7 = java.util.Locale.CHINESE;
        java.lang.String str8 = locale7.getLanguage();
        java.util.Locale[] localeArray9 = new java.util.Locale[] { locale3, locale4, locale6, locale7 };
        java.util.ArrayList<java.util.Locale> localeList10 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList10, localeArray9);
        java.util.Locale.FilteringMode filteringMode12 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList13 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList10, filteringMode12);
        java.util.Set<java.lang.String> strSet14 = java.util.Calendar.getAvailableCalendarTypes();
        java.util.stream.Stream<java.lang.String> strStream15 = strSet14.parallelStream();
        java.lang.String str16 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet14);
        java.util.Locale.LanguageRange[] languageRangeArray17 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList18 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18, languageRangeArray17);
        java.util.Locale locale20 = java.util.Locale.GERMAN;
        java.util.Locale locale21 = java.util.Locale.FRANCE;
        boolean boolean22 = locale21.hasExtensions();
        java.util.Locale locale23 = java.util.Locale.FRANCE;
        java.util.Locale locale24 = java.util.Locale.CHINESE;
        java.lang.String str25 = locale24.getLanguage();
        java.util.Locale[] localeArray26 = new java.util.Locale[] { locale20, locale21, locale23, locale24 };
        java.util.ArrayList<java.util.Locale> localeList27 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList27, localeArray26);
        java.util.Locale.FilteringMode filteringMode29 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList30 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.util.Locale>) localeList27, filteringMode29);
        java.util.Locale locale31 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList27);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList33 = java.util.Locale.LanguageRange.parse("zho");
        java.util.Set<java.lang.String> strSet34 = java.util.Calendar.getAvailableCalendarTypes();
        java.util.stream.Stream<java.lang.String> strStream35 = strSet34.parallelStream();
        java.lang.String str36 = java.util.Locale.lookupTag(languageRangeList33, (java.util.Collection<java.lang.String>) strSet34);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList38 = java.util.Locale.LanguageRange.parse("zho");
        java.util.Set<java.lang.String> strSet39 = java.util.Calendar.getAvailableCalendarTypes();
        java.util.stream.Stream<java.lang.String> strStream40 = strSet39.parallelStream();
        java.lang.String str41 = java.util.Locale.lookupTag(languageRangeList38, (java.util.Collection<java.lang.String>) strSet39);
        java.util.stream.Stream<java.lang.String> strStream42 = strSet39.stream();
        java.util.List<java.lang.String> strList43 = java.util.Locale.filterTags(languageRangeList33, (java.util.Collection<java.lang.String>) strSet39);
        boolean boolean44 = localeList27.removeAll((java.util.Collection<java.lang.String>) strSet39);
        int int45 = localeList27.size();
        java.util.Locale.LanguageRange[] languageRangeArray46 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList47 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList47, languageRangeArray46);
        java.util.Locale locale49 = java.util.Locale.GERMAN;
        java.util.Locale locale50 = java.util.Locale.FRANCE;
        boolean boolean51 = locale50.hasExtensions();
        java.util.Locale locale52 = java.util.Locale.FRANCE;
        java.util.Locale locale53 = java.util.Locale.CHINESE;
        java.lang.String str54 = locale53.getLanguage();
        java.util.Locale[] localeArray55 = new java.util.Locale[] { locale49, locale50, locale52, locale53 };
        java.util.ArrayList<java.util.Locale> localeList56 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList56, localeArray55);
        java.util.Locale.FilteringMode filteringMode58 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList59 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList47, (java.util.Collection<java.util.Locale>) localeList56, filteringMode58);
        java.util.Spliterator<java.util.Locale> localeSpliterator60 = localeList59.spliterator();
        boolean boolean61 = localeList27.contains((java.lang.Object) localeSpliterator60);
        java.util.AbstractCollection[] abstractCollectionArray63 = new java.util.AbstractCollection[0];
        @SuppressWarnings("unchecked")
        java.util.AbstractCollection<java.util.Locale.LanguageRange>[] languageRangeCollectionArray64 = (java.util.AbstractCollection<java.util.Locale.LanguageRange>[]) abstractCollectionArray63;
        // The following exception was thrown during execution in test generation
        try {
            java.util.AbstractCollection<java.util.Locale.LanguageRange>[] languageRangeCollectionArray65 = localeList27.toArray((java.util.AbstractCollection<java.util.Locale.LanguageRange>[]) abstractCollectionArray63);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: null");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh" + "'", str8, "zh");
        org.junit.Assert.assertNotNull(localeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + filteringMode12 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode12.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(strStream15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(languageRangeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "de");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "zh" + "'", str25, "zh");
        org.junit.Assert.assertNotNull(localeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + filteringMode29 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode29.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList30);
        org.junit.Assert.assertNull(locale31);
        org.junit.Assert.assertNotNull(languageRangeList33);
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertNotNull(strStream35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(languageRangeList38);
        org.junit.Assert.assertNotNull(strSet39);
        org.junit.Assert.assertNotNull(strStream40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(strStream42);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 4 + "'", int45 == 4);
        org.junit.Assert.assertNotNull(languageRangeArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "de");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "zh" + "'", str54, "zh");
        org.junit.Assert.assertNotNull(localeArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + filteringMode58 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode58.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList59);
        org.junit.Assert.assertNotNull(localeSpliterator60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(abstractCollectionArray63);
        org.junit.Assert.assertNotNull(languageRangeCollectionArray64);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        boolean boolean5 = locale4.hasExtensions();
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.util.Locale locale7 = java.util.Locale.CHINESE;
        java.lang.String str8 = locale7.getLanguage();
        java.util.Locale[] localeArray9 = new java.util.Locale[] { locale3, locale4, locale6, locale7 };
        java.util.ArrayList<java.util.Locale> localeList10 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList10, localeArray9);
        java.util.Locale.FilteringMode filteringMode12 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList13 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList10, filteringMode12);
        java.util.Spliterator<java.util.Locale> localeSpliterator14 = localeList13.spliterator();
        localeList13.clear();
        java.util.Date date16 = new java.util.Date();
        int int17 = date16.getTimezoneOffset();
        long long18 = date16.getTime();
        int int19 = date16.getMinutes();
        boolean boolean20 = localeList13.remove((java.lang.Object) date16);
        int int21 = date16.getMonth();
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh" + "'", str8, "zh");
        org.junit.Assert.assertNotNull(localeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + filteringMode12 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode12.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList13);
        org.junit.Assert.assertNotNull(localeSpliterator14);
// flaky:         org.junit.Assert.assertEquals(date16.toString(), "Mon Feb 21 14:46:20 GMT 2022");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1645454780365L + "'", long18 == 1645454780365L);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 46 + "'", int19 == 46);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.lang.String str1 = locale0.getDisplayScript();
        java.lang.String str2 = locale0.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "France" + "'", str2, "France");
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        java.util.Locale locale7 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale8 = locale7.stripExtensions();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone1, locale7);
        java.util.TimeZone timeZone10 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone11 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone12 = java.util.TimeZone.getDefault();
        boolean boolean13 = timeZone11.hasSameRules(timeZone12);
        boolean boolean14 = timeZone10.hasSameRules(timeZone11);
        boolean boolean15 = timeZone11.observesDaylightTime();
        timeZone11.setRawOffset(52);
        timeZone11.setID("Temps universel coordonn\351");
        java.util.Locale locale21 = new java.util.Locale("zh");
        java.util.Locale locale22 = java.util.Locale.CHINESE;
        java.lang.String str23 = locale22.getLanguage();
        boolean boolean24 = locale22.hasExtensions();
        java.lang.String str25 = locale22.getDisplayCountry();
        java.lang.String str26 = locale21.getDisplayName(locale22);
        java.util.Calendar calendar27 = java.util.Calendar.getInstance(timeZone11, locale21);
        java.lang.String str28 = fastDateFormat9.format(calendar27);
        java.util.TimeZone timeZone29 = java.util.TimeZone.getDefault();
        int int31 = timeZone29.getOffset((long) 2);
        java.util.Locale locale35 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale36 = locale35.stripExtensions();
        java.util.Calendar calendar37 = java.util.Calendar.getInstance(timeZone29, locale36);
        int int38 = calendar27.compareTo(calendar37);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals(locale7.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "_HI!");
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals(locale21.toString(), "zh");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "zh" + "'", str23, "zh");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\u4e2d\u6587" + "'", str26, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar27);
// flaky:         org.junit.Assert.assertEquals(calendar27.toString(), "java.util.GregorianCalendar[time=1645454780427,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Temps universel coordonn\351\",offset=52,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=20,MILLISECOND=479,ZONE_OFFSET=52,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals(locale35.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar37);
// flaky:         org.junit.Assert.assertEquals(calendar37.toString(), "java.util.GregorianCalendar[time=1645454780428,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=20,MILLISECOND=428,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setWeekDate(5, (int) (byte) -1, 1);
        java.util.Calendar.Builder builder6 = builder4.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder8 = builder4.setInstant((long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone5 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        boolean boolean7 = timeZone5.hasSameRules(timeZone6);
        boolean boolean8 = timeZone4.hasSameRules(timeZone5);
        boolean boolean9 = timeZone5.observesDaylightTime();
        timeZone5.setRawOffset(52);
        timeZone5.setID("Temps universel coordonn\351");
        java.util.Locale locale15 = new java.util.Locale("zh");
        java.util.Locale locale16 = java.util.Locale.CHINESE;
        java.lang.String str17 = locale16.getLanguage();
        boolean boolean18 = locale16.hasExtensions();
        java.lang.String str19 = locale16.getDisplayCountry();
        java.lang.String str20 = locale15.getDisplayName(locale16);
        java.util.Calendar calendar21 = java.util.Calendar.getInstance(timeZone5, locale15);
        calendar21.clear();
        java.lang.String str23 = fastDateFormat2.format(calendar21);
        int int25 = calendar21.getGreatestMinimum(10);
        calendar21.roll(3, (int) 'a');
        int int30 = calendar21.getMaximum(8);
        java.lang.Object obj31 = calendar21.clone();
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h:mm:ss a z" + "'", str3, "h:mm:ss a z");
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals(locale15.toString(), "zh");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "zh" + "'", str17, "zh");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\u4e2d\u6587" + "'", str20, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar21);
        org.junit.Assert.assertEquals(calendar21.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Temps universel coordonn\351\",offset=52,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=46,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=52,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "12:00:00 AM GMT+00:00" + "'", str23, "12:00:00 AM GMT+00:00");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 6 + "'", int30 == 6);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Temps universel coordonn\351\",offset=52,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=46,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=52,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Temps universel coordonn\351\",offset=52,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=46,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=52,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Temps universel coordonn\351\",offset=52,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=46,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=52,DST_OFFSET=0]");
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setWeekDate(5, (int) (byte) -1, 1);
        java.util.Calendar.Builder builder6 = builder4.setLenient(true);
        java.util.Calendar.Builder builder10 = builder6.setTimeOfDay(122, 11, 10);
        java.util.Calendar.Builder builder14 = builder10.setWeekDate(100, 9, 2);
        java.util.Calendar.Builder builder18 = builder14.setTimeOfDay(52, (int) (short) 10, (-1));
        java.util.Calendar.Builder builder20 = builder18.setLenient(true);
        java.util.Calendar.Builder builder23 = builder18.set(2, 54);
        java.util.Calendar.Builder builder25 = builder18.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar26 = builder25.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HOUR_OF_DAY");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "France");
        java.util.Locale.Builder builder5 = builder0.removeUnicodeLocaleAttribute("GMT");
        java.util.Locale locale6 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder0.addUnicodeLocaleAttribute("fr");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: fr [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 2);
        java.util.Locale locale6 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale7 = locale6.stripExtensions();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone0, locale7);
        calendar8.set(122, 52, (int) (byte) 1);
        calendar8.setMinimalDaysInFirstWeek(8);
        java.util.Date date20 = new java.util.Date(3, 16, 11, 8, 51);
        calendar8.setTime(date20);
        java.lang.String str22 = calendar8.toString();
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals(locale6.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=-2071494540000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=8,ERA=1,YEAR=1904,MONTH=4,WEEK_OF_YEAR=19,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=132,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=8,HOUR_OF_DAY=8,MINUTE=51,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals(date20.toString(), "Wed May 11 08:51:00 UTC 1904");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "java.util.GregorianCalendar[time=-2071494540000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=8,ERA=1,YEAR=1904,MONTH=4,WEEK_OF_YEAR=19,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=132,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=8,HOUR_OF_DAY=8,MINUTE=51,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]" + "'", str22, "java.util.GregorianCalendar[time=-2071494540000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=8,ERA=1,YEAR=1904,MONTH=4,WEEK_OF_YEAR=19,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=132,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=8,HOUR_OF_DAY=8,MINUTE=51,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str2 = timeZone1.getID();
        java.util.TimeZone.setDefault(timeZone1);
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(timeZone1);
        int int5 = calendar4.getFirstDayOfWeek();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        int int8 = timeZone6.getOffset((long) 2);
        java.util.Locale locale12 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale13 = locale12.stripExtensions();
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone6, locale13);
        calendar4.setTimeZone(timeZone6);
        java.lang.String str16 = calendar4.toString();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GMT" + "'", str2, "GMT");
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=1645454780717,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=20,MILLISECOND=717,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals(locale12.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar14);
// flaky:         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=1645454780717,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=20,MILLISECOND=717,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.util.GregorianCalendar[time=1645454780717,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=20,MILLISECOND=717,ZONE_OFFSET=0,DST_OFFSET=0]" + "'", str16, "java.util.GregorianCalendar[time=1645454780717,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=20,MILLISECOND=717,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone5 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        boolean boolean7 = timeZone5.hasSameRules(timeZone6);
        boolean boolean8 = timeZone4.hasSameRules(timeZone5);
        boolean boolean9 = timeZone5.observesDaylightTime();
        timeZone5.setRawOffset(52);
        timeZone5.setID("Temps universel coordonn\351");
        java.util.Locale locale15 = new java.util.Locale("zh");
        java.util.Locale locale16 = java.util.Locale.CHINESE;
        java.lang.String str17 = locale16.getLanguage();
        boolean boolean18 = locale16.hasExtensions();
        java.lang.String str19 = locale16.getDisplayCountry();
        java.lang.String str20 = locale15.getDisplayName(locale16);
        java.util.Calendar calendar21 = java.util.Calendar.getInstance(timeZone5, locale15);
        calendar21.clear();
        java.lang.String str23 = fastDateFormat2.format(calendar21);
        calendar21.set((int) (short) 1, (int) (byte) 1, 9);
        java.lang.String str28 = calendar21.toString();
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h:mm:ss a z" + "'", str3, "h:mm:ss a z");
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals(locale15.toString(), "zh");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "zh" + "'", str17, "zh");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\u4e2d\u6587" + "'", str20, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar21);
        org.junit.Assert.assertEquals(calendar21.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Temps universel coordonn\351\",offset=52,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=1,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=9,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=52,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "12:00:00 AM GMT+00:00" + "'", str23, "12:00:00 AM GMT+00:00");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Temps universel coordonn\351\",offset=52,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=1,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=9,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=52,DST_OFFSET=0]" + "'", str28, "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Temps universel coordonn\351\",offset=52,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=1,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=9,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=52,DST_OFFSET=0]");
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        java.util.TimeZone timeZone3 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str4 = timeZone3.getID();
        java.util.TimeZone.setDefault(timeZone3);
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(timeZone3);
        int int7 = calendar6.getFirstDayOfWeek();
        java.util.TimeZone timeZone8 = java.util.TimeZone.getDefault();
        int int10 = timeZone8.getOffset((long) 2);
        java.util.Locale locale14 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale15 = locale14.stripExtensions();
        java.util.Calendar calendar16 = java.util.Calendar.getInstance(timeZone8, locale15);
        calendar6.setTimeZone(timeZone8);
        java.util.TimeZone timeZone18 = java.util.TimeZone.getDefault();
        int int20 = timeZone18.getOffset((long) 2);
        java.util.Locale locale24 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale25 = locale24.stripExtensions();
        java.util.Calendar calendar26 = java.util.Calendar.getInstance(timeZone18, locale25);
        int int28 = calendar26.getLeastMaximum(4);
        java.util.TimeZone timeZone29 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone30 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone31 = java.util.TimeZone.getDefault();
        boolean boolean32 = timeZone30.hasSameRules(timeZone31);
        boolean boolean33 = timeZone29.hasSameRules(timeZone30);
        java.util.Calendar calendar34 = java.util.Calendar.getInstance(timeZone30);
        calendar26.setTimeZone(timeZone30);
        calendar6.setTimeZone(timeZone30);
        java.util.Locale locale37 = java.util.Locale.CHINA;
        java.util.TimeZone timeZone38 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone39 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone40 = java.util.TimeZone.getDefault();
        boolean boolean41 = timeZone39.hasSameRules(timeZone40);
        boolean boolean42 = timeZone38.hasSameRules(timeZone39);
        boolean boolean43 = timeZone39.observesDaylightTime();
        timeZone39.setRawOffset(52);
        timeZone39.setID("Temps universel coordonn\351");
        java.util.Locale locale49 = new java.util.Locale("zh");
        java.util.Locale locale50 = java.util.Locale.CHINESE;
        java.lang.String str51 = locale50.getLanguage();
        boolean boolean52 = locale50.hasExtensions();
        java.lang.String str53 = locale50.getDisplayCountry();
        java.lang.String str54 = locale49.getDisplayName(locale50);
        java.util.Calendar calendar55 = java.util.Calendar.getInstance(timeZone39, locale49);
        java.util.Set<java.lang.Character> charSet56 = locale49.getExtensionKeys();
        java.lang.String str57 = locale37.getDisplayCountry(locale49);
        java.util.Locale locale58 = java.util.Locale.CHINESE;
        java.lang.String str59 = locale58.getLanguage();
        boolean boolean60 = locale58.hasExtensions();
        java.lang.String str61 = locale58.getDisplayCountry();
        java.lang.String str62 = locale58.getISO3Language();
        java.lang.String str63 = locale58.getVariant();
        java.lang.String str64 = locale37.getDisplayLanguage(locale58);
        java.lang.String str65 = locale37.getCountry();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat66 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(2, 6, timeZone30, locale37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GMT" + "'", str4, "GMT");
        org.junit.Assert.assertNotNull(calendar6);
// flaky:         org.junit.Assert.assertEquals(calendar6.toString(), "java.util.GregorianCalendar[time=1645454780840,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=20,MILLISECOND=840,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals(locale14.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar16);
// flaky:         org.junit.Assert.assertEquals(calendar16.toString(), "java.util.GregorianCalendar[time=1645454780840,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=20,MILLISECOND=840,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals(locale24.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar26);
// flaky:         org.junit.Assert.assertEquals(calendar26.toString(), "java.util.GregorianCalendar[time=1645454780840,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=20,MILLISECOND=840,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(calendar34);
// flaky:         org.junit.Assert.assertEquals(calendar34.toString(), "java.util.GregorianCalendar[time=1645454780840,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=20,MILLISECOND=840,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(timeZone38);
        org.junit.Assert.assertEquals(timeZone38.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone39);
        org.junit.Assert.assertEquals(timeZone39.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone40);
        org.junit.Assert.assertEquals(timeZone40.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals(locale49.toString(), "zh");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "zh" + "'", str51, "zh");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "\u4e2d\u6587" + "'", str54, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar55);
// flaky:         org.junit.Assert.assertEquals(calendar55.toString(), "java.util.GregorianCalendar[time=1645454780841,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Temps universel coordonn\351\",offset=52,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=20,MILLISECOND=893,ZONE_OFFSET=52,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(charSet56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "\u4e2d\u56fd" + "'", str57, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "zh" + "'", str59, "zh");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "zho" + "'", str62, "zho");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "\u4e2d\u6587" + "'", str64, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "CN" + "'", str65, "CN");
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        java.util.Date date0 = new java.util.Date();
        int int1 = date0.getTimezoneOffset();
        date0.setMinutes(5);
        int int4 = date0.getMonth();
        int int5 = date0.getYear();
        java.util.TimeZone timeZone7 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone8 = java.util.TimeZone.getDefault();
        boolean boolean9 = timeZone7.hasSameRules(timeZone8);
        java.util.Locale locale13 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale14 = locale13.stripExtensions();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone7, locale13);
        java.lang.Object obj16 = fastDateFormat15.clone();
        java.text.ParsePosition parsePosition19 = new java.text.ParsePosition(16);
        int int20 = parsePosition19.getErrorIndex();
        java.lang.String str21 = parsePosition19.toString();
        java.lang.Object obj22 = null;
        boolean boolean23 = parsePosition19.equals(obj22);
        int int24 = parsePosition19.getIndex();
        int int25 = parsePosition19.getIndex();
        java.lang.Object obj26 = fastDateFormat15.parseObject("France", parsePosition19);
        java.util.Date date27 = new java.util.Date();
        date27.setTime((long) 2);
        int int30 = date27.getYear();
        java.lang.StringBuffer stringBuffer31 = null;
        java.lang.StringBuffer stringBuffer32 = fastDateFormat15.format(date27, stringBuffer31);
        boolean boolean33 = date0.before(date27);
        java.util.TimeZone timeZone34 = java.util.TimeZone.getDefault();
        int int36 = timeZone34.getOffset((long) 2);
        java.util.Locale locale40 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale41 = locale40.stripExtensions();
        java.util.Calendar calendar42 = java.util.Calendar.getInstance(timeZone34, locale41);
        int int44 = calendar42.getLeastMaximum(4);
        int int46 = calendar42.getLeastMaximum((int) (byte) 0);
        java.util.Date date47 = new java.util.Date();
        int int48 = date47.getTimezoneOffset();
        int int49 = date47.getSeconds();
        boolean boolean50 = calendar42.after((java.lang.Object) date47);
        java.util.Date date51 = new java.util.Date();
        int int52 = date51.getSeconds();
        date51.setTime((long) 16);
        date51.setMinutes(12);
        int int57 = date51.getSeconds();
        date51.setMinutes(51);
        boolean boolean60 = date47.before(date51);
        java.lang.String str61 = date51.toGMTString();
        int int62 = date51.getMinutes();
        long long63 = date51.getTime();
        boolean boolean64 = date27.equals((java.lang.Object) long63);
// flaky:         org.junit.Assert.assertEquals(date0.toString(), "Mon Feb 21 14:05:20 GMT 2022");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 122 + "'", int5 == 122);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals(locale13.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "_HI!");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "FastDateFormat[]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "java.text.ParsePosition[index=16,errorIndex=-1]" + "'", str21, "java.text.ParsePosition[index=16,errorIndex=-1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 16 + "'", int24 == 16);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 16 + "'", int25 == 16);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 70 + "'", int30 == 70);
        org.junit.Assert.assertNull(stringBuffer32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(timeZone34);
        org.junit.Assert.assertEquals(timeZone34.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals(locale40.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar42);
// flaky:         org.junit.Assert.assertEquals(calendar42.toString(), "java.util.GregorianCalendar[time=1645454780874,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=20,MILLISECOND=874,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 3 + "'", int44 == 3);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
// flaky:         org.junit.Assert.assertEquals(date47.toString(), "Mon Feb 21 14:46:20 GMT 2022");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int49 + "' != '" + 20 + "'", int49 == 20);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals(date51.toString(), "Thu Jan 01 00:51:00 GMT 1970");
// flaky:         org.junit.Assert.assertTrue("'" + int52 + "' != '" + 20 + "'", int52 == 20);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "1 Jan 1970 00:51:00 GMT" + "'", str61, "1 Jan 1970 00:51:00 GMT");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 51 + "'", int62 == 51);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 3060016L + "'", long63 == 3060016L);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        int int4 = timeZone2.getOffset((long) 2);
        java.util.Locale locale8 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale9 = locale8.stripExtensions();
        java.util.Calendar calendar10 = java.util.Calendar.getInstance(timeZone2, locale9);
        calendar10.set(122, 52, (int) (byte) 1);
        int int15 = calendar10.getWeeksInWeekYear();
        calendar10.add(13, 0);
        int int19 = calendar10.getWeeksInWeekYear();
        calendar10.setMinimalDaysInFirstWeek(9);
        java.util.TimeZone timeZone22 = java.util.TimeZone.getDefault();
        timeZone22.setID("\uc624\ud6c4\uc2dc\ubd84\ucd08 GMT");
        calendar10.setTimeZone(timeZone22);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 32769, timeZone22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 32769");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals(locale8.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar10);
// flaky:         org.junit.Assert.assertEquals(calendar10.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"\uc624\ud6c4\uc2dc\ubd84\ucd08 GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=9,ERA=1,YEAR=122,MONTH=52,WEEK_OF_YEAR=17,WEEK_OF_MONTH=0,DAY_OF_MONTH=1,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=20,MILLISECOND=905,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.util.Date date4 = new java.util.Date();
        int int5 = date4.getSeconds();
        java.lang.String str6 = fastDateFormat2.format(date4);
        java.util.Locale.LanguageRange[] languageRangeArray7 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList8 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8, languageRangeArray7);
        java.util.Locale locale10 = java.util.Locale.GERMAN;
        java.util.Locale locale11 = java.util.Locale.FRANCE;
        boolean boolean12 = locale11.hasExtensions();
        java.util.Locale locale13 = java.util.Locale.FRANCE;
        java.util.Locale locale14 = java.util.Locale.CHINESE;
        java.lang.String str15 = locale14.getLanguage();
        java.util.Locale[] localeArray16 = new java.util.Locale[] { locale10, locale11, locale13, locale14 };
        java.util.ArrayList<java.util.Locale> localeList17 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList17, localeArray16);
        java.util.Locale.FilteringMode filteringMode19 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList20 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.util.Locale>) localeList17, filteringMode19);
        java.util.Set<java.lang.String> strSet21 = java.util.Calendar.getAvailableCalendarTypes();
        java.util.stream.Stream<java.lang.String> strStream22 = strSet21.parallelStream();
        java.lang.String str23 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.lang.String>) strSet21);
        java.util.Locale.LanguageRange[] languageRangeArray24 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList25 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList25, languageRangeArray24);
        java.util.Locale locale27 = java.util.Locale.GERMAN;
        java.util.Locale locale28 = java.util.Locale.FRANCE;
        boolean boolean29 = locale28.hasExtensions();
        java.util.Locale locale30 = java.util.Locale.FRANCE;
        java.util.Locale locale31 = java.util.Locale.CHINESE;
        java.lang.String str32 = locale31.getLanguage();
        java.util.Locale[] localeArray33 = new java.util.Locale[] { locale27, locale28, locale30, locale31 };
        java.util.ArrayList<java.util.Locale> localeList34 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList34, localeArray33);
        java.util.Locale.FilteringMode filteringMode36 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList37 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList25, (java.util.Collection<java.util.Locale>) localeList34, filteringMode36);
        java.util.Locale locale38 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.util.Locale>) localeList34);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap39 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList40 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, strMap39);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap41 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList42 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, strMap41);
        java.lang.StringBuffer stringBuffer43 = null;
        java.util.TimeZone timeZone45 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone46 = java.util.TimeZone.getDefault();
        boolean boolean47 = timeZone45.hasSameRules(timeZone46);
        java.util.Locale locale51 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale52 = locale51.stripExtensions();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat53 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone45, locale51);
        java.util.Date date59 = new java.util.Date(3, (int) (short) 0, 6, 0, (int) (short) 1);
        java.util.Date date60 = new java.util.Date();
        int int61 = date60.getTimezoneOffset();
        long long62 = date60.getTime();
        boolean boolean63 = date59.after(date60);
        java.lang.StringBuffer stringBuffer64 = null;
        java.text.Format.Field field65 = null;
        java.text.FieldPosition fieldPosition67 = new java.text.FieldPosition(field65, 16);
        fieldPosition67.setBeginIndex((int) '4');
        java.lang.StringBuffer stringBuffer70 = fastDateFormat53.format((java.lang.Object) date59, stringBuffer64, fieldPosition67);
        java.util.Calendar.Builder builder71 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder75 = builder71.setWeekDate(5, (int) (byte) -1, 1);
        java.util.Calendar.Builder builder77 = builder75.setLenient(true);
        java.util.Calendar.Builder builder81 = builder77.setTimeOfDay(122, 11, 10);
        java.util.Calendar.Builder builder85 = builder81.setWeekDate(100, 9, 2);
        java.util.TimeZone timeZone86 = java.util.TimeZone.getDefault();
        java.util.Calendar.Builder builder87 = builder85.setTimeZone(timeZone86);
        boolean boolean88 = fieldPosition67.equals((java.lang.Object) builder85);
        java.text.Format.Field field89 = fieldPosition67.getFieldAttribute();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer90 = fastDateFormat2.format((java.lang.Object) strMap41, stringBuffer43, fieldPosition67);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: <null>");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h:mm:ss a z" + "'", str3, "h:mm:ss a z");
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Mon Feb 21 14:46:20 GMT 2022");
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2:46:20 PM UTC" + "'", str6, "2:46:20 PM UTC");
        org.junit.Assert.assertNotNull(languageRangeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "de");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "zh" + "'", str15, "zh");
        org.junit.Assert.assertNotNull(localeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + filteringMode19 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode19.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList20);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(strStream22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(languageRangeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "de");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "zh" + "'", str32, "zh");
        org.junit.Assert.assertNotNull(localeArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + filteringMode36 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode36.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList37);
        org.junit.Assert.assertNull(locale38);
        org.junit.Assert.assertNotNull(languageRangeList40);
        org.junit.Assert.assertNotNull(languageRangeList42);
        org.junit.Assert.assertNotNull(timeZone45);
        org.junit.Assert.assertEquals(timeZone45.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone46);
        org.junit.Assert.assertEquals(timeZone46.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals(locale51.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "_HI!");
        org.junit.Assert.assertNotNull(fastDateFormat53);
        org.junit.Assert.assertEquals(date59.toString(), "Tue Jan 06 00:01:00 GMT 1903");
// flaky:         org.junit.Assert.assertEquals(date60.toString(), "Mon Feb 21 14:46:20 GMT 2022");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long62 + "' != '" + 1645454780995L + "'", long62 == 1645454780995L);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(stringBuffer70);
        org.junit.Assert.assertNotNull(builder75);
        org.junit.Assert.assertNotNull(builder77);
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertNotNull(builder85);
        org.junit.Assert.assertNotNull(timeZone86);
        org.junit.Assert.assertEquals(timeZone86.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(builder87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNull(field89);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setWeekDate(5, (int) (byte) -1, 1);
        java.util.Calendar.Builder builder6 = builder4.setLenient(true);
        java.util.Calendar.Builder builder10 = builder6.setTimeOfDay(122, 11, 10);
        java.util.Calendar.Builder builder14 = builder10.setWeekDate(100, 9, 2);
        java.util.Calendar.Builder builder18 = builder14.setTimeOfDay(52, (int) (short) 10, (-1));
        java.util.Calendar.Builder builder20 = builder18.setLenient(true);
        java.util.Calendar.Builder builder23 = builder18.set(2, 54);
        java.util.Calendar.Builder builder28 = builder18.setTimeOfDay((int) 'u', 32769, 70, 5);
        java.util.Date date29 = new java.util.Date();
        int int30 = date29.getTimezoneOffset();
        long long31 = date29.getTime();
        java.util.Date date32 = new java.util.Date();
        int int33 = date32.getSeconds();
        date32.setTime((long) 16);
        date32.setMinutes(12);
        int int38 = date32.getSeconds();
        boolean boolean39 = date29.after(date32);
        int int40 = date32.getDate();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder41 = builder28.setInstant(date32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder28);
// flaky:         org.junit.Assert.assertEquals(date29.toString(), "Mon Feb 21 14:46:21 GMT 2022");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1645454781037L + "'", long31 == 1645454781037L);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Jan 01 00:12:00 GMT 1970");
// flaky:         org.junit.Assert.assertTrue("'" + int33 + "' != '" + 21 + "'", int33 == 21);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        java.util.Locale locale1 = new java.util.Locale("GMT");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale1.getUnicodeLocaleType("12:00:00 AM GMT+00:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: 12:00:00 AM GMT+00:00");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "gmt");
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone5 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        boolean boolean7 = timeZone5.hasSameRules(timeZone6);
        boolean boolean8 = timeZone4.hasSameRules(timeZone5);
        boolean boolean9 = timeZone5.observesDaylightTime();
        timeZone5.setRawOffset(52);
        timeZone5.setID("Temps universel coordonn\351");
        java.util.Locale locale15 = new java.util.Locale("zh");
        java.util.Locale locale16 = java.util.Locale.CHINESE;
        java.lang.String str17 = locale16.getLanguage();
        boolean boolean18 = locale16.hasExtensions();
        java.lang.String str19 = locale16.getDisplayCountry();
        java.lang.String str20 = locale15.getDisplayName(locale16);
        java.util.Calendar calendar21 = java.util.Calendar.getInstance(timeZone5, locale15);
        calendar21.clear();
        java.lang.String str23 = fastDateFormat2.format(calendar21);
        java.util.TimeZone timeZone24 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone25 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone26 = java.util.TimeZone.getDefault();
        boolean boolean27 = timeZone25.hasSameRules(timeZone26);
        boolean boolean28 = timeZone24.hasSameRules(timeZone25);
        boolean boolean29 = timeZone25.observesDaylightTime();
        timeZone25.setRawOffset(52);
        timeZone25.setID("Temps universel coordonn\351");
        java.util.Locale locale35 = new java.util.Locale("zh");
        java.util.Locale locale36 = java.util.Locale.CHINESE;
        java.lang.String str37 = locale36.getLanguage();
        boolean boolean38 = locale36.hasExtensions();
        java.lang.String str39 = locale36.getDisplayCountry();
        java.lang.String str40 = locale35.getDisplayName(locale36);
        java.util.Calendar calendar41 = java.util.Calendar.getInstance(timeZone25, locale35);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator42 = fastDateFormat2.formatToCharacterIterator((java.lang.Object) timeZone25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: sun.util.calendar.ZoneInfo");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h:mm:ss a z" + "'", str3, "h:mm:ss a z");
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals(locale15.toString(), "zh");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "zh" + "'", str17, "zh");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\u4e2d\u6587" + "'", str20, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar21);
        org.junit.Assert.assertEquals(calendar21.toString(), "java.util.GregorianCalendar[time=-52,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Temps universel coordonn\351\",offset=52,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=52,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "12:00:00 AM GMT+00:00" + "'", str23, "12:00:00 AM GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals(locale35.toString(), "zh");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "zh" + "'", str37, "zh");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\u4e2d\u6587" + "'", str40, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar41);
// flaky:         org.junit.Assert.assertEquals(calendar41.toString(), "java.util.GregorianCalendar[time=1645454781078,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Temps universel coordonn\351\",offset=52,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=21,MILLISECOND=130,ZONE_OFFSET=52,DST_OFFSET=0]");
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.lang.String str2 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh_TW" + "'", str2, "zh_TW");
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.lang.Object obj4 = fastDateFormat2.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = fastDateFormat2.parseObject("\uc624\uc804\uc2dc\ubd84\ucd08 UTC");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FastDateFormat[]" + "'", str3, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "FastDateFormat[]");
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(59, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        java.util.Date date5 = new java.util.Date(3, 16, 11, 8, 51);
        date5.setMonth((int) 'x');
        java.util.Date date8 = new java.util.Date();
        int int9 = date8.getTimezoneOffset();
        long long10 = date8.getTime();
        java.util.Date date11 = new java.util.Date();
        int int12 = date11.getSeconds();
        date11.setTime((long) 16);
        date11.setMinutes(12);
        int int17 = date11.getSeconds();
        boolean boolean18 = date8.after(date11);
        boolean boolean19 = date5.before(date8);
        java.lang.String str20 = date5.toGMTString();
        java.lang.Object obj21 = date5.clone();
        org.junit.Assert.assertEquals(date5.toString(), "Sun Jan 11 08:51:00 GMT 1914");
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Feb 21 14:46:21 GMT 2022");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1645454781399L + "'", long10 == 1645454781399L);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:12:00 GMT 1970");
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 21 + "'", int12 == 21);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "11 Jan 1914 08:51:00 GMT" + "'", str20, "11 Jan 1914 08:51:00 GMT");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "Sun Jan 11 08:51:00 GMT 1914");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "Sun Jan 11 08:51:00 GMT 1914");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "Sun Jan 11 08:51:00 GMT 1914");
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs(3);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "France");
        java.util.Locale.Builder builder5 = builder0.removeUnicodeLocaleAttribute("GMT");
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.lang.String str7 = locale6.getVariant();
        java.lang.String str8 = locale6.getDisplayCountry();
        java.util.Locale.Builder builder9 = builder0.setLocale(locale6);
        java.util.Locale locale10 = builder9.build();
        java.util.Locale.Builder builder11 = builder9.clearExtensions();
        java.util.Locale locale13 = new java.util.Locale("zh");
        java.util.Locale locale14 = java.util.Locale.CHINESE;
        java.lang.String str15 = locale14.getLanguage();
        boolean boolean16 = locale14.hasExtensions();
        java.lang.String str17 = locale14.getDisplayCountry();
        java.lang.String str18 = locale13.getDisplayName(locale14);
        java.util.Locale.Builder builder19 = builder9.setLocale(locale14);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder21 = builder19.setScript("fr");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: fr [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "France" + "'", str8, "France");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertEquals(locale13.toString(), "zh");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "zh" + "'", str15, "zh");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u4e2d\u6587" + "'", str18, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("21 Feb 2022 14:46:20 GMT", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=21feb202214:46:20gmt");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone1);
        boolean boolean5 = timeZone1.observesDaylightTime();
        timeZone1.setRawOffset(52);
        timeZone1.setID("Temps universel coordonn\351");
        java.util.Locale locale11 = new java.util.Locale("zh");
        java.util.Locale locale12 = java.util.Locale.CHINESE;
        java.lang.String str13 = locale12.getLanguage();
        boolean boolean14 = locale12.hasExtensions();
        java.lang.String str15 = locale12.getDisplayCountry();
        java.lang.String str16 = locale11.getDisplayName(locale12);
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(timeZone1, locale11);
        java.util.TimeZone timeZone18 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone19 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone20 = java.util.TimeZone.getDefault();
        boolean boolean21 = timeZone19.hasSameRules(timeZone20);
        boolean boolean22 = timeZone18.hasSameRules(timeZone19);
        java.util.TimeZone timeZone24 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str25 = timeZone24.getID();
        boolean boolean26 = timeZone19.hasSameRules(timeZone24);
        timeZone24.setRawOffset(126);
        calendar17.setTimeZone(timeZone24);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = timeZone24.getOffset(0, 1, 32770, 35, (int) (byte) 1, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals(locale11.toString(), "zh");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "zh" + "'", str13, "zh");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u4e2d\u6587" + "'", str16, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar17);
// flaky:         org.junit.Assert.assertEquals(calendar17.toString(), "java.util.GregorianCalendar[time=1645454781609,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=126,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=21,MILLISECOND=661,ZONE_OFFSET=52,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "GMT" + "'", str25, "GMT");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }
}
