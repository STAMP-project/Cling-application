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
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('u', "CHN");
        java.util.Locale.Builder builder7 = builder1.setExtension('u', "chinese");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.parse("zho");
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        java.util.Locale locale13 = java.util.Locale.GERMAN;
        java.util.Locale locale14 = java.util.Locale.FRANCE;
        boolean boolean15 = locale14.hasExtensions();
        java.util.Locale locale16 = java.util.Locale.FRANCE;
        java.util.Locale locale17 = java.util.Locale.CHINESE;
        java.lang.String str18 = locale17.getLanguage();
        java.util.Locale[] localeArray19 = new java.util.Locale[] { locale13, locale14, locale16, locale17 };
        java.util.ArrayList<java.util.Locale> localeList20 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList20, localeArray19);
        java.util.Locale.FilteringMode filteringMode22 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList23 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.util.Locale>) localeList20, filteringMode22);
        java.util.List<java.util.Locale> localeList24 = java.util.Locale.filter(languageRangeList9, (java.util.Collection<java.util.Locale>) localeList23);
        localeList23.clear();
        java.util.Calendar.Builder builder26 = new java.util.Calendar.Builder();
        boolean boolean27 = localeList23.remove((java.lang.Object) builder26);
        java.util.Calendar.Builder builder32 = builder26.setTimeOfDay(32770, 25, 3, 3);
        java.util.Locale locale33 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale34 = java.util.Locale.CHINESE;
        java.lang.String str35 = locale34.getLanguage();
        boolean boolean36 = locale34.hasExtensions();
        java.lang.String str37 = locale33.getDisplayVariant(locale34);
        java.lang.String str38 = locale33.getDisplayScript();
        java.util.Calendar.Builder builder39 = builder32.setLocale(locale33);
        java.lang.String str40 = locale33.getCountry();
        java.util.Locale.Builder builder41 = builder7.setLocale(locale33);
        java.util.Locale.Builder builder42 = builder41.clearExtensions();
        java.util.Locale locale43 = builder41.build();
        java.lang.String str44 = locale43.getDisplayName();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "de");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "zh" + "'", str18, "zh");
        org.junit.Assert.assertNotNull(localeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + filteringMode22 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode22.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList23);
        org.junit.Assert.assertNotNull(localeList24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "zh" + "'", str35, "zh");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "CN" + "'", str40, "CN");
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Chinese (China)" + "'", str44, "Chinese (China)");
    }

    @Test
    public void test20002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20002");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z");
        java.util.Date date2 = new java.util.Date();
        int int3 = date2.getSeconds();
        long long4 = date2.getTime();
        date2.setTime((long) (byte) 0);
        date2.setDate((int) (short) 0);
        date2.setMinutes(29);
        java.util.Date date16 = new java.util.Date(102, 56, 15, 18, (int) ' ');
        boolean boolean17 = date2.before(date16);
        int int18 = date16.getYear();
        java.lang.String str19 = fastDateFormat1.format(date16);
        date16.setDate(200);
        org.junit.Assert.assertNotNull(fastDateFormat1);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Wed Dec 31 00:29:00 GMT 1969");
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 24 + "'", int3 == 24);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1644572664653L + "'", long4 == 1644572664653L);
// flaky:         org.junit.Assert.assertEquals(date16.toString(), "Mon Mar 19 18:32:00 GMT 2007");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 106 + "'", int18 == 106);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "6:32:00 PM GMT" + "'", str19, "6:32:00 PM GMT");
    }

    @Test
    public void test20003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20003");
        java.util.Date date3 = new java.util.Date(1969, 1927, 2762);
// flaky:         org.junit.Assert.assertEquals(date3.toString(), "Sat Feb 21 00:00:00 GMT 4037");
    }

    @Test
    public void test20004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20004");
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
        java.util.List<java.util.Locale> localeList16 = java.util.Locale.filter(languageRangeList1, (java.util.Collection<java.util.Locale>) localeList15);
        localeList15.clear();
        java.util.Calendar.Builder builder18 = new java.util.Calendar.Builder();
        boolean boolean19 = localeList15.remove((java.lang.Object) builder18);
        java.util.Calendar.Builder builder21 = builder18.setInstant((long) 25);
        java.util.Calendar.Builder builder25 = builder21.setWeekDate((int) 'a', (int) (byte) 0, 0);
        java.util.TimeZone timeZone27 = java.util.TimeZone.getTimeZone("French");
        timeZone27.setRawOffset(365);
        java.util.Calendar.Builder builder30 = builder25.setTimeZone(timeZone27);
        java.util.TimeZone timeZone31 = java.util.TimeZone.getDefault();
        boolean boolean32 = timeZone31.observesDaylightTime();
        java.util.Calendar.Builder builder33 = builder30.setTimeZone(timeZone31);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder36 = builder33.setWeekDefinition((-405), 53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(localeList16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(timeZone31);
// flaky:         org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(builder33);
    }

    @Test
    public void test20005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20005");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        boolean boolean1 = locale0.hasExtensions();
        java.util.Locale locale5 = new java.util.Locale("", "hi!", "");
        java.lang.String str6 = locale0.getDisplayScript(locale5);
        java.util.Locale locale7 = java.util.Locale.GERMAN;
        java.util.Locale locale8 = locale7.stripExtensions();
        java.lang.String str9 = locale0.getDisplayCountry(locale7);
        java.util.Set<java.lang.Character> charSet10 = locale7.getExtensionKeys();
        java.util.Calendar calendar11 = java.util.Calendar.getInstance(locale7);
        java.util.Date date12 = new java.util.Date();
        int int13 = date12.getDay();
        int int14 = date12.getTimezoneOffset();
        int int15 = date12.getDate();
        int int16 = date12.getYear();
        boolean boolean17 = calendar11.before((java.lang.Object) date12);
        int int19 = calendar11.getActualMaximum(8);
        calendar11.setMinimalDaysInFirstWeek(53);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals(locale5.toString(), "_HI!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "de");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Frankreich" + "'", str9, "Frankreich");
        org.junit.Assert.assertNotNull(charSet10);
        org.junit.Assert.assertNotNull(calendar11);
// flaky:         org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=1644572664688,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=53,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=1,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=44,SECOND=24,MILLISECOND=688,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Fri Feb 11 09:44:24 GMT 2022");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 122 + "'", int16 == 122);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
    }

    @Test
    public void test20006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20006");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        boolean boolean2 = timeZone0.hasSameRules(timeZone1);
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone0);
        int int5 = calendar3.getActualMaximum(2);
        java.util.Date date6 = new java.util.Date();
        int int7 = date6.getSeconds();
        long long8 = date6.getTime();
        date6.setTime((long) (byte) 0);
        calendar3.setTime(date6);
        int int13 = calendar3.getActualMaximum(6);
        int int15 = calendar3.getLeastMaximum(1);
        calendar3.set(1, 27, 53, 292269054, 32770, (int) 'a');
        int int24 = calendar3.getGreatestMinimum(0);
        java.util.TimeZone timeZone25 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone26 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone27 = java.util.TimeZone.getDefault();
        boolean boolean28 = timeZone26.hasSameRules(timeZone27);
        boolean boolean29 = timeZone25.hasSameRules(timeZone26);
        java.util.TimeZone.setDefault(timeZone26);
        java.util.Calendar calendar31 = java.util.Calendar.getInstance(timeZone26);
        int int32 = calendar31.getFirstDayOfWeek();
        boolean boolean33 = calendar3.before((java.lang.Object) int32);
        java.time.Instant instant34 = calendar3.toInstant();
        calendar3.set((int) (short) 1, (int) 'u', 25);
        calendar3.setMinimalDaysInFirstWeek(47);
        calendar3.set(24388524, 28, 24, 2899, 43, (int) 'x');
        int int49 = calendar3.getActualMaximum(10);
        int int50 = calendar3.getFirstDayOfWeek();
        java.util.Locale locale51 = java.util.Locale.FRANCE;
        boolean boolean52 = locale51.hasExtensions();
        java.util.Locale locale56 = new java.util.Locale("", "hi!", "");
        java.lang.String str57 = locale51.getDisplayScript(locale56);
        java.util.Locale locale58 = java.util.Locale.GERMAN;
        java.util.Locale locale59 = locale58.stripExtensions();
        java.lang.String str60 = locale51.getDisplayCountry(locale58);
        java.lang.String str61 = locale58.getISO3Country();
        boolean boolean62 = calendar3.before((java.lang.Object) locale58);
        java.util.Locale.setDefault(locale58);
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Greenwich Zeit");
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Zeit");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=47,ERA=1,YEAR=24388524,MONTH=28,WEEK_OF_YEAR=42,WEEK_OF_MONTH=3,DAY_OF_MONTH=24,DAY_OF_YEAR=125,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=2899,MINUTE=43,SECOND=120,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 11 + "'", int5 == 11);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 GMT 1970");
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 24 + "'", int7 == 24);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1644572664699L + "'", long8 == 1644572664699L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 365 + "'", int13 == 365);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 292269054 + "'", int15 == 292269054);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(timeZone25);
// flaky:         org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "Greenwich Zeit");
        org.junit.Assert.assertNotNull(timeZone26);
// flaky:         org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "Greenwich Zeit");
        org.junit.Assert.assertNotNull(timeZone27);
// flaky:         org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "Greenwich Zeit");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(calendar31);
// flaky:         org.junit.Assert.assertEquals(calendar31.toString(), "java.util.GregorianCalendar[time=1644572664700,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=44,SECOND=24,MILLISECOND=700,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(instant34);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 11 + "'", int49 == 11);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals(locale56.toString(), "_HI!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "de");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "de");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Frankreich" + "'", str60, "Frankreich");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test20007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20007");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        boolean boolean2 = timeZone0.hasSameRules(timeZone1);
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone0);
        int int5 = calendar3.getActualMaximum(2);
        java.util.Date date6 = new java.util.Date();
        int int7 = date6.getSeconds();
        long long8 = date6.getTime();
        date6.setTime((long) (byte) 0);
        calendar3.setTime(date6);
        int int13 = calendar3.getActualMaximum(6);
        java.util.TimeZone timeZone14 = calendar3.getTimeZone();
        java.util.TimeZone timeZone16 = java.util.TimeZone.getTimeZone("\u6cd5\u6587");
        calendar3.setTimeZone(timeZone16);
        int int18 = calendar3.getFirstDayOfWeek();
        int int19 = calendar3.getFirstDayOfWeek();
        java.util.Date date20 = calendar3.getTime();
        date20.setYear(44);
        java.lang.String str23 = date20.toLocaleString();
        int int24 = date20.getYear();
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Greenwich Zeit");
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Zeit");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(calendar3);
        org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 11 + "'", int5 == 11);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 GMT 1970");
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 24 + "'", int7 == 24);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1644572664718L + "'", long8 == 1644572664718L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 365 + "'", int13 == 365);
        org.junit.Assert.assertNotNull(timeZone14);
// flaky:         org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Greenwich Zeit");
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "Greenwich Zeit");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(date20);
// flaky:         org.junit.Assert.assertEquals(date20.toString(), "Sat Jan 01 00:00:00 GMT 1944");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "01.01.1944 00:00:00" + "'", str23, "01.01.1944 00:00:00");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 44 + "'", int24 == 44);
    }

    @Test
    public void test20008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20008");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("11 Feb 2000 09:44:18 GMT");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: e");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20009");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.lang.String str1 = locale0.getLanguage();
        boolean boolean2 = locale0.hasExtensions();
        java.lang.String str3 = locale0.getDisplayCountry();
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Locale locale5 = java.util.Locale.ITALIAN;
        java.util.Locale locale6 = java.util.Locale.ITALY;
        java.util.Locale locale7 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale8 = java.util.Locale.CHINESE;
        java.lang.String str9 = locale8.getLanguage();
        boolean boolean10 = locale8.hasExtensions();
        java.lang.String str11 = locale7.getDisplayVariant(locale8);
        java.util.Locale locale12 = java.util.Locale.ITALY;
        java.util.Locale locale16 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale17 = java.util.Locale.ROOT;
        java.lang.String str18 = locale16.getDisplayScript(locale17);
        java.util.Locale locale19 = java.util.Locale.CHINESE;
        java.lang.String str20 = locale19.getLanguage();
        boolean boolean21 = locale19.hasExtensions();
        java.lang.String str22 = locale19.getDisplayCountry();
        java.lang.String str23 = locale19.getDisplayLanguage();
        java.lang.String str24 = locale19.getLanguage();
        java.util.Locale locale25 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray26 = new java.util.Locale[] { locale0, locale4, locale5, locale6, locale8, locale12, locale16, locale19, locale25 };
        java.util.ArrayList<java.util.Locale> localeList27 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList27, localeArray26);
        java.util.Locale locale30 = localeList27.get(7);
        int int31 = localeList27.size();
        java.util.TimeZone timeZone33 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone33);
        java.text.ParsePosition parsePosition37 = new java.text.ParsePosition(16);
        int int38 = parsePosition37.getErrorIndex();
        java.lang.Object obj39 = fastDateFormat34.parseObject("zho", parsePosition37);
        int int40 = localeList27.lastIndexOf((java.lang.Object) fastDateFormat34);
        boolean boolean41 = fastDateFormat34.getTimeZoneOverridesCalendar();
        java.lang.String str42 = fastDateFormat34.toString();
        java.util.TimeZone timeZone45 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone45);
        java.text.ParsePosition parsePosition49 = new java.text.ParsePosition(16);
        int int50 = parsePosition49.getErrorIndex();
        java.lang.Object obj51 = fastDateFormat46.parseObject("zho", parsePosition49);
        java.text.ParsePosition parsePosition54 = new java.text.ParsePosition(16);
        int int55 = parsePosition54.getErrorIndex();
        int int56 = parsePosition54.getErrorIndex();
        java.lang.Object obj57 = fastDateFormat46.parseObject("java.text.FieldPosition[field=-1,attribute=null,beginIndex=0,endIndex=28]", parsePosition54);
        parsePosition54.setIndex((int) (short) -1);
        java.lang.String str60 = parsePosition54.toString();
        parsePosition54.setErrorIndex(18);
        java.lang.Object obj63 = fastDateFormat34.parseObject("java.text.FieldPosition[field=-1,attribute=null,beginIndex=30,endIndex=365]", parsePosition54);
        java.lang.String str64 = fastDateFormat34.getPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj66 = fastDateFormat34.parseObject("cor\351en");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh" + "'", str1, "zh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "zh" + "'", str9, "zh");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "it_IT");
        org.junit.Assert.assertEquals(locale16.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "zh" + "'", str20, "zh");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Chinesisch" + "'", str23, "Chinesisch");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "zh" + "'", str24, "zh");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 9 + "'", int31 == 9);
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "FastDateFormat[h:mm:ss a z]" + "'", str42, "FastDateFormat[h:mm:ss a z]");
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "java.text.ParsePosition[index=-1,errorIndex=0]" + "'", str60, "java.text.ParsePosition[index=-1,errorIndex=0]");
        org.junit.Assert.assertNull(obj63);
// flaky:         org.junit.Assert.assertEquals("'" + str64 + "' != '" + "h:mm:ss a z" + "'", str64, "h:mm:ss a z");
    }
}
