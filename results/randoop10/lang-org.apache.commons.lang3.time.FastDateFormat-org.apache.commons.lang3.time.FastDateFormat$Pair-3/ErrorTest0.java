import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str3 = timeZone2.getID();
        java.util.TimeZone.setDefault(timeZone2);
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(timeZone2);
        int int6 = calendar5.getFirstDayOfWeek();
        java.util.TimeZone timeZone7 = java.util.TimeZone.getDefault();
        int int9 = timeZone7.getOffset((long) 2);
        java.util.Locale locale13 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale14 = locale13.stripExtensions();
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone7, locale14);
        calendar5.setTimeZone(timeZone7);
        java.lang.String str17 = timeZone7.getID();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, timeZone7);
        java.util.Locale locale19 = java.util.Locale.FRANCE;
        java.lang.String str20 = locale19.getVariant();
        java.lang.String str21 = timeZone7.getDisplayName(locale19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar5 and calendar15", (calendar5.compareTo(calendar15) == 0) == calendar5.equals(calendar15));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(timeZone1);
        java.util.TimeZone timeZone4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone4);
        java.lang.String str7 = fastDateFormat5.format((long) '#');
        boolean boolean8 = fastDateFormat5.getTimeZoneOverridesCalendar();
        java.lang.String str10 = fastDateFormat5.format(100L);
        java.lang.String str12 = fastDateFormat5.format((long) 8);
        java.util.Locale locale13 = fastDateFormat5.getLocale();
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone1, locale13);
        java.util.Locale.setDefault(locale13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar2 and calendar14", (calendar2.compareTo(calendar14) == 0) == calendar2.equals(calendar14));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
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
        java.util.Calendar calendar16 = java.util.Calendar.getInstance(timeZone6);
        timeZone6.setRawOffset(32770);
        timeZone6.setID("de-DE");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar14 and calendar16", (calendar14.compareTo(calendar16) == 0) == calendar14.equals(calendar16));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
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
        java.util.Calendar calendar16 = java.util.Calendar.getInstance(timeZone6);
        java.util.TimeZone timeZone20 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone20);
        java.lang.String str22 = fastDateFormat21.getPattern();
        java.text.ParsePosition parsePosition25 = new java.text.ParsePosition(16);
        parsePosition25.setIndex(11);
        java.lang.Object obj28 = fastDateFormat21.parseObject("FastDateFormat[]", parsePosition25);
        boolean boolean29 = fastDateFormat21.getTimeZoneOverridesCalendar();
        java.text.AttributedCharacterIterator attributedCharacterIterator31 = fastDateFormat21.formatToCharacterIterator((java.lang.Object) 1645454754924L);
        java.util.Locale locale32 = fastDateFormat21.getLocale();
        java.util.Map<java.lang.String, java.lang.Integer> strMap33 = calendar16.getDisplayNames(2, 0, locale32);
        java.util.Locale.Category category34 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale35 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(category34, locale35);
        java.util.Locale locale37 = java.util.Locale.KOREA;
        java.lang.String str38 = locale37.getScript();
        java.util.Locale locale39 = java.util.Locale.FRANCE;
        java.lang.String str40 = locale37.getDisplayVariant(locale39);
        java.util.Locale.setDefault(category34, locale37);
        java.util.Locale locale42 = java.util.Locale.ROOT;
        java.util.Locale.Builder builder43 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder46 = builder43.setExtension('a', "France");
        java.util.Locale.Builder builder48 = builder43.removeUnicodeLocaleAttribute("GMT");
        java.util.Locale locale49 = java.util.Locale.FRANCE;
        java.lang.String str50 = locale49.getVariant();
        java.lang.String str51 = locale49.getDisplayCountry();
        java.util.Locale.Builder builder52 = builder43.setLocale(locale49);
        java.util.Locale locale54 = new java.util.Locale("zh");
        java.lang.String str55 = locale49.getDisplayName(locale54);
        java.lang.String str56 = locale42.getDisplayName(locale49);
        java.lang.String str57 = locale42.getDisplayScript();
        java.util.Locale locale58 = locale42.stripExtensions();
        java.util.Locale.setDefault(category34, locale42);
        java.lang.String str60 = locale32.getDisplayCountry(locale42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar14 and calendar16", (calendar14.compareTo(calendar16) == 0) == calendar14.equals(calendar16));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
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
        calendar4.setTimeZone(timeZone28);
        java.util.Locale locale35 = java.util.Locale.US;
        java.util.Locale locale36 = locale35.stripExtensions();
        java.util.Locale locale37 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet38 = locale37.getUnicodeLocaleKeys();
        java.lang.String str39 = locale36.getDisplayVariant(locale37);
        java.lang.String str40 = timeZone28.getDisplayName(locale36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar4 and calendar14", (calendar4.compareTo(calendar14) == 0) == calendar4.equals(calendar14));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
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
        boolean boolean40 = fastDateFormat9.getTimeZoneOverridesCalendar();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar27 and calendar37", (calendar27.compareTo(calendar37) == 0) == calendar27.equals(calendar37));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
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
        java.util.TimeZone timeZone41 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone41);
        java.lang.String str43 = fastDateFormat42.getPattern();
        java.util.TimeZone timeZone44 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone45 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone46 = java.util.TimeZone.getDefault();
        boolean boolean47 = timeZone45.hasSameRules(timeZone46);
        boolean boolean48 = timeZone44.hasSameRules(timeZone45);
        boolean boolean49 = timeZone45.observesDaylightTime();
        timeZone45.setRawOffset(52);
        timeZone45.setID("Temps universel coordonn\351");
        java.util.Locale locale55 = new java.util.Locale("zh");
        java.util.Locale locale56 = java.util.Locale.CHINESE;
        java.lang.String str57 = locale56.getLanguage();
        boolean boolean58 = locale56.hasExtensions();
        java.lang.String str59 = locale56.getDisplayCountry();
        java.lang.String str60 = locale55.getDisplayName(locale56);
        java.util.Calendar calendar61 = java.util.Calendar.getInstance(timeZone45, locale55);
        calendar61.clear();
        java.lang.String str63 = fastDateFormat42.format(calendar61);
        calendar61.setLenient(true);
        java.lang.String str66 = fastDateFormat9.format(calendar61);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar27 and calendar37", (calendar27.compareTo(calendar37) == 0) == calendar27.equals(calendar37));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "France");
        java.util.Locale.Builder builder5 = builder0.removeUnicodeLocaleAttribute("GMT");
        java.util.Locale.Builder builder8 = builder0.setExtension('u', "en");
        java.util.Locale.Builder builder10 = builder0.removeUnicodeLocaleAttribute("English");
        java.util.Locale.Category category11 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale12 = java.util.Locale.TAIWAN;
        java.util.Locale locale13 = locale12.stripExtensions();
        java.util.Locale.setDefault(category11, locale12);
        java.util.Locale locale16 = new java.util.Locale("zh");
        java.util.Locale locale17 = java.util.Locale.CHINESE;
        java.lang.String str18 = locale17.getLanguage();
        boolean boolean19 = locale17.hasExtensions();
        java.lang.String str20 = locale17.getDisplayCountry();
        java.lang.String str21 = locale16.getDisplayName(locale17);
        java.util.Locale.setDefault(locale16);
        java.util.Locale.setDefault(category11, locale16);
        java.util.Locale.Builder builder24 = builder0.setLocale(locale16);
        java.util.TimeZone timeZone26 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone27 = java.util.TimeZone.getDefault();
        boolean boolean28 = timeZone26.hasSameRules(timeZone27);
        java.util.Locale locale32 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale33 = locale32.stripExtensions();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone26, locale32);
        java.util.TimeZone timeZone35 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone36 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone37 = java.util.TimeZone.getDefault();
        boolean boolean38 = timeZone36.hasSameRules(timeZone37);
        boolean boolean39 = timeZone35.hasSameRules(timeZone36);
        boolean boolean40 = timeZone36.observesDaylightTime();
        timeZone36.setRawOffset(52);
        timeZone36.setID("Temps universel coordonn\351");
        java.util.Locale locale46 = new java.util.Locale("zh");
        java.util.Locale locale47 = java.util.Locale.CHINESE;
        java.lang.String str48 = locale47.getLanguage();
        boolean boolean49 = locale47.hasExtensions();
        java.lang.String str50 = locale47.getDisplayCountry();
        java.lang.String str51 = locale46.getDisplayName(locale47);
        java.util.Calendar calendar52 = java.util.Calendar.getInstance(timeZone36, locale46);
        java.lang.String str53 = fastDateFormat34.format(calendar52);
        java.util.TimeZone timeZone54 = java.util.TimeZone.getDefault();
        int int56 = timeZone54.getOffset((long) 2);
        java.util.Locale locale60 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale61 = locale60.stripExtensions();
        java.util.Calendar calendar62 = java.util.Calendar.getInstance(timeZone54, locale61);
        java.lang.StringBuffer stringBuffer63 = null;
        java.lang.StringBuffer stringBuffer64 = fastDateFormat34.format(calendar62, stringBuffer63);
        calendar62.roll((int) (short) 0, (int) (byte) 0);
        java.util.Locale.LanguageRange[] languageRangeArray68 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList69 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList69, languageRangeArray68);
        java.util.Locale locale71 = java.util.Locale.GERMAN;
        java.util.Locale locale72 = java.util.Locale.FRANCE;
        boolean boolean73 = locale72.hasExtensions();
        java.util.Locale locale74 = java.util.Locale.FRANCE;
        java.util.Locale locale75 = java.util.Locale.CHINESE;
        java.lang.String str76 = locale75.getLanguage();
        java.util.Locale[] localeArray77 = new java.util.Locale[] { locale71, locale72, locale74, locale75 };
        java.util.ArrayList<java.util.Locale> localeList78 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList78, localeArray77);
        java.util.Locale.FilteringMode filteringMode80 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList81 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList69, (java.util.Collection<java.util.Locale>) localeList78, filteringMode80);
        java.util.Spliterator<java.util.Locale> localeSpliterator82 = localeList81.spliterator();
        java.lang.Object[] objArray83 = localeList81.toArray();
        localeList81.clear();
        java.text.Format.Field field85 = null;
        java.text.FieldPosition fieldPosition86 = new java.text.FieldPosition(field85);
        boolean boolean87 = localeList81.equals((java.lang.Object) fieldPosition86);
        java.util.Locale locale88 = java.util.Locale.US;
        java.util.Locale locale89 = locale88.stripExtensions();
        java.util.Locale locale90 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet91 = locale90.getUnicodeLocaleKeys();
        java.lang.String str92 = locale89.getDisplayVariant(locale90);
        int int93 = localeList81.lastIndexOf((java.lang.Object) locale89);
        java.util.Set<java.lang.String> strSet94 = locale89.getUnicodeLocaleKeys();
        boolean boolean95 = calendar62.before((java.lang.Object) locale89);
        java.util.Locale.Builder builder96 = builder24.setLocale(locale89);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar52 and calendar62", (calendar52.compareTo(calendar62) == 0) == calendar52.equals(calendar62));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
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
        java.util.TimeZone timeZone52 = java.util.TimeZone.getDefault();
        int int54 = timeZone52.getOffset((long) 2);
        java.util.Locale locale58 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale59 = locale58.stripExtensions();
        java.util.Calendar calendar60 = java.util.Calendar.getInstance(timeZone52, locale59);
        boolean boolean61 = localeList27.add(locale59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar46 and calendar60", (calendar46.compareTo(calendar60) == 0) == calendar46.equals(calendar60));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.text.ParsePosition parsePosition6 = new java.text.ParsePosition(16);
        parsePosition6.setIndex(11);
        java.lang.Object obj9 = fastDateFormat2.parseObject("FastDateFormat[]", parsePosition6);
        boolean boolean10 = fastDateFormat2.getTimeZoneOverridesCalendar();
        java.text.AttributedCharacterIterator attributedCharacterIterator12 = fastDateFormat2.formatToCharacterIterator((java.lang.Object) 1645454754924L);
        java.util.Locale locale13 = fastDateFormat2.getLocale();
        java.util.Locale locale14 = java.util.Locale.KOREAN;
        java.util.Locale locale15 = java.util.Locale.CHINESE;
        java.lang.String str16 = locale15.getLanguage();
        boolean boolean17 = locale15.hasExtensions();
        java.lang.String str18 = locale15.getDisplayCountry();
        java.lang.String str19 = locale15.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet20 = locale15.getUnicodeLocaleKeys();
        java.lang.String str21 = locale15.getISO3Country();
        java.lang.String str22 = locale14.getDisplayName(locale15);
        boolean boolean23 = fastDateFormat2.equals((java.lang.Object) locale14);
        java.util.TimeZone timeZone25 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone26 = java.util.TimeZone.getDefault();
        boolean boolean27 = timeZone25.hasSameRules(timeZone26);
        java.util.Locale locale31 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale32 = locale31.stripExtensions();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone25, locale31);
        java.util.TimeZone timeZone34 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone35 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone36 = java.util.TimeZone.getDefault();
        boolean boolean37 = timeZone35.hasSameRules(timeZone36);
        boolean boolean38 = timeZone34.hasSameRules(timeZone35);
        boolean boolean39 = timeZone35.observesDaylightTime();
        timeZone35.setRawOffset(52);
        timeZone35.setID("Temps universel coordonn\351");
        java.util.Locale locale45 = new java.util.Locale("zh");
        java.util.Locale locale46 = java.util.Locale.CHINESE;
        java.lang.String str47 = locale46.getLanguage();
        boolean boolean48 = locale46.hasExtensions();
        java.lang.String str49 = locale46.getDisplayCountry();
        java.lang.String str50 = locale45.getDisplayName(locale46);
        java.util.Calendar calendar51 = java.util.Calendar.getInstance(timeZone35, locale45);
        java.lang.String str52 = fastDateFormat33.format(calendar51);
        java.util.TimeZone timeZone53 = java.util.TimeZone.getDefault();
        int int55 = timeZone53.getOffset((long) 2);
        java.util.Locale locale59 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale60 = locale59.stripExtensions();
        java.util.Calendar calendar61 = java.util.Calendar.getInstance(timeZone53, locale60);
        java.lang.StringBuffer stringBuffer62 = null;
        java.lang.StringBuffer stringBuffer63 = fastDateFormat33.format(calendar61, stringBuffer62);
        boolean boolean64 = fastDateFormat2.equals((java.lang.Object) fastDateFormat33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar51 and calendar61", (calendar51.compareTo(calendar61) == 0) == calendar51.equals(calendar61));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
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
        java.util.TimeZone timeZone42 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone42);
        java.lang.String str44 = fastDateFormat43.getPattern();
        java.text.ParsePosition parsePosition47 = new java.text.ParsePosition(16);
        parsePosition47.setIndex(11);
        java.lang.Object obj50 = fastDateFormat43.parseObject("FastDateFormat[]", parsePosition47);
        java.lang.Object obj51 = fastDateFormat9.parseObject("21 Feb 2022 14:46:37 GMT", parsePosition47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar27 and calendar37", (calendar27.compareTo(calendar37) == 0) == calendar27.equals(calendar37));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone1);
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(timeZone1);
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone7 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone8 = java.util.TimeZone.getDefault();
        boolean boolean9 = timeZone7.hasSameRules(timeZone8);
        boolean boolean10 = timeZone6.hasSameRules(timeZone7);
        java.util.Calendar calendar11 = java.util.Calendar.getInstance(timeZone7);
        timeZone7.setID("java.text.AttributedCharacterIterator$Attribute(input_method_segment)");
        java.util.Locale locale14 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone7, locale14);
        boolean boolean16 = timeZone1.hasSameRules(timeZone7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar5 and calendar11", (calendar5.compareTo(calendar11) == 0) == calendar5.equals(calendar11));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setWeekDate(5, (int) (byte) -1, 1);
        java.util.Calendar.Builder builder6 = builder4.setLenient(true);
        java.util.Calendar.Builder builder10 = builder6.setTimeOfDay(122, 11, 10);
        java.util.Calendar.Builder builder14 = builder10.setWeekDate(100, 9, 2);
        java.util.Calendar.Builder builder18 = builder14.setTimeOfDay(52, (int) (short) 10, (-1));
        java.util.Calendar.Builder builder20 = builder18.setLenient(true);
        java.util.Calendar.Builder builder23 = builder18.set(2, 54);
        java.util.Calendar.Builder builder28 = builder18.setTimeOfDay((int) 'u', 32769, 70, 5);
        java.util.TimeZone timeZone29 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone30 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone31 = java.util.TimeZone.getDefault();
        boolean boolean32 = timeZone30.hasSameRules(timeZone31);
        boolean boolean33 = timeZone29.hasSameRules(timeZone30);
        boolean boolean34 = timeZone30.observesDaylightTime();
        java.util.TimeZone timeZone35 = java.util.TimeZone.getDefault();
        int int37 = timeZone35.getOffset((long) 2);
        java.util.Locale locale41 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale42 = locale41.stripExtensions();
        java.util.Calendar calendar43 = java.util.Calendar.getInstance(timeZone35, locale42);
        boolean boolean44 = timeZone30.hasSameRules(timeZone35);
        java.util.Calendar calendar45 = java.util.Calendar.getInstance(timeZone35);
        java.util.Calendar.Builder builder46 = builder28.setTimeZone(timeZone35);
        java.util.Calendar.Builder builder51 = builder28.setTimeOfDay(4, (int) (short) 1, (int) (short) 1, 10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar43 and calendar45", (calendar43.compareTo(calendar45) == 0) == calendar43.equals(calendar45));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str3 = timeZone2.getID();
        java.util.TimeZone.setDefault(timeZone2);
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(timeZone2);
        int int6 = calendar5.getFirstDayOfWeek();
        java.util.TimeZone timeZone7 = java.util.TimeZone.getDefault();
        int int9 = timeZone7.getOffset((long) 2);
        java.util.Locale locale13 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale14 = locale13.stripExtensions();
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone7, locale14);
        calendar5.setTimeZone(timeZone7);
        java.lang.String str17 = timeZone7.getID();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, timeZone7);
        java.time.ZoneId zoneId19 = timeZone7.toZoneId();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar5 and calendar15", (calendar5.compareTo(calendar15) == 0) == calendar5.equals(calendar15));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(timeZone1);
        java.util.TimeZone timeZone4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone4);
        java.lang.String str7 = fastDateFormat5.format((long) '#');
        boolean boolean8 = fastDateFormat5.getTimeZoneOverridesCalendar();
        java.lang.String str10 = fastDateFormat5.format(100L);
        java.lang.String str12 = fastDateFormat5.format((long) 8);
        java.util.Locale locale13 = fastDateFormat5.getLocale();
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone1, locale13);
        java.lang.String str15 = timeZone1.getDisplayName();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar2 and calendar14", (calendar2.compareTo(calendar14) == 0) == calendar2.equals(calendar14));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
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
        int int16 = timeZone6.getRawOffset();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar4 and calendar14", (calendar4.compareTo(calendar14) == 0) == calendar4.equals(calendar14));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.TAIWAN;
        java.util.Locale locale2 = locale1.stripExtensions();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale4 = java.util.Locale.CHINA;
        java.util.TimeZone timeZone5 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone7 = java.util.TimeZone.getDefault();
        boolean boolean8 = timeZone6.hasSameRules(timeZone7);
        boolean boolean9 = timeZone5.hasSameRules(timeZone6);
        boolean boolean10 = timeZone6.observesDaylightTime();
        timeZone6.setRawOffset(52);
        timeZone6.setID("Temps universel coordonn\351");
        java.util.Locale locale16 = new java.util.Locale("zh");
        java.util.Locale locale17 = java.util.Locale.CHINESE;
        java.lang.String str18 = locale17.getLanguage();
        boolean boolean19 = locale17.hasExtensions();
        java.lang.String str20 = locale17.getDisplayCountry();
        java.lang.String str21 = locale16.getDisplayName(locale17);
        java.util.Calendar calendar22 = java.util.Calendar.getInstance(timeZone6, locale16);
        java.util.Set<java.lang.Character> charSet23 = locale16.getExtensionKeys();
        java.lang.String str24 = locale4.getDisplayCountry(locale16);
        java.lang.String str25 = locale4.getLanguage();
        java.lang.String str26 = locale4.getLanguage();
        java.util.Locale.setDefault(category0, locale4);
        java.util.Locale locale28 = java.util.Locale.CHINA;
        java.lang.String str29 = locale28.getDisplayVariant();
        java.util.Locale.setDefault(category0, locale28);
        java.util.TimeZone timeZone31 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone32 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone33 = java.util.TimeZone.getDefault();
        boolean boolean34 = timeZone32.hasSameRules(timeZone33);
        boolean boolean35 = timeZone31.hasSameRules(timeZone32);
        java.util.TimeZone timeZone37 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str38 = timeZone37.getID();
        boolean boolean39 = timeZone32.hasSameRules(timeZone37);
        int int40 = timeZone37.getRawOffset();
        java.util.Locale locale41 = java.util.Locale.CHINA;
        java.util.TimeZone timeZone42 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone43 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone44 = java.util.TimeZone.getDefault();
        boolean boolean45 = timeZone43.hasSameRules(timeZone44);
        boolean boolean46 = timeZone42.hasSameRules(timeZone43);
        boolean boolean47 = timeZone43.observesDaylightTime();
        timeZone43.setRawOffset(52);
        timeZone43.setID("Temps universel coordonn\351");
        java.util.Locale locale53 = new java.util.Locale("zh");
        java.util.Locale locale54 = java.util.Locale.CHINESE;
        java.lang.String str55 = locale54.getLanguage();
        boolean boolean56 = locale54.hasExtensions();
        java.lang.String str57 = locale54.getDisplayCountry();
        java.lang.String str58 = locale53.getDisplayName(locale54);
        java.util.Calendar calendar59 = java.util.Calendar.getInstance(timeZone43, locale53);
        java.util.Set<java.lang.Character> charSet60 = locale53.getExtensionKeys();
        java.lang.String str61 = locale41.getDisplayCountry(locale53);
        java.lang.String str62 = locale41.getLanguage();
        java.lang.String str63 = locale41.getLanguage();
        java.util.Calendar calendar64 = java.util.Calendar.getInstance(timeZone37, locale41);
        java.util.Locale.setDefault(category0, locale41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar22 and calendar64", (calendar22.compareTo(calendar64) == 0) == calendar22.equals(calendar64));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
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
        java.util.Locale locale16 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(timeZone1, locale16);
        java.util.Calendar calendar18 = java.util.Calendar.getInstance(timeZone1);
        int int20 = timeZone1.getOffset(1645454754558L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar14 and calendar18", (calendar14.compareTo(calendar18) == 0) == calendar14.equals(calendar18));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone1);
        timeZone1.setID("Mon Feb 21 14:45:50 GMT 2022");
        java.util.TimeZone timeZone7 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone8 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone9 = java.util.TimeZone.getDefault();
        boolean boolean10 = timeZone8.hasSameRules(timeZone9);
        boolean boolean11 = timeZone7.hasSameRules(timeZone8);
        java.util.TimeZone timeZone13 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str14 = timeZone13.getID();
        boolean boolean15 = timeZone8.hasSameRules(timeZone13);
        timeZone13.setRawOffset((int) 'x');
        timeZone13.setRawOffset((int) 'x');
        java.util.TimeZone.setDefault(timeZone13);
        boolean boolean21 = timeZone1.hasSameRules(timeZone13);
        java.util.TimeZone timeZone23 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.util.Calendar calendar24 = java.util.Calendar.getInstance(timeZone23);
        java.util.TimeZone timeZone26 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone26);
        java.lang.String str29 = fastDateFormat27.format((long) '#');
        boolean boolean30 = fastDateFormat27.getTimeZoneOverridesCalendar();
        java.lang.String str32 = fastDateFormat27.format(100L);
        java.lang.String str34 = fastDateFormat27.format((long) 8);
        java.util.Locale locale35 = fastDateFormat27.getLocale();
        java.util.Calendar calendar36 = java.util.Calendar.getInstance(timeZone23, locale35);
        boolean boolean37 = timeZone1.hasSameRules(timeZone23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar24 and calendar36", (calendar24.compareTo(calendar36) == 0) == calendar24.equals(calendar36));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
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
        calendar27.setMinimalDaysInFirstWeek(4);
        calendar27.setMinimalDaysInFirstWeek(70);
        java.util.TimeZone timeZone33 = java.util.TimeZone.getDefault();
        int int35 = timeZone33.getOffset((long) 2);
        java.util.Locale locale39 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale40 = locale39.stripExtensions();
        java.util.Calendar calendar41 = java.util.Calendar.getInstance(timeZone33, locale40);
        int int43 = calendar41.getLeastMaximum(4);
        int int45 = calendar41.getLeastMaximum((int) (byte) 0);
        java.util.Date date46 = new java.util.Date();
        int int47 = date46.getTimezoneOffset();
        int int48 = date46.getSeconds();
        boolean boolean49 = calendar41.after((java.lang.Object) date46);
        java.lang.String str50 = date46.toGMTString();
        calendar27.setTime(date46);
        java.lang.Object obj52 = date46.clone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar27 and calendar41", (calendar27.compareTo(calendar41) == 0) == calendar27.equals(calendar41));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
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
        java.util.TimeZone timeZone21 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getDefault();
        boolean boolean23 = timeZone21.hasSameRules(timeZone22);
        java.util.Locale locale27 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale28 = locale27.stripExtensions();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone21, locale27);
        java.util.TimeZone timeZone30 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone31 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone32 = java.util.TimeZone.getDefault();
        boolean boolean33 = timeZone31.hasSameRules(timeZone32);
        boolean boolean34 = timeZone30.hasSameRules(timeZone31);
        boolean boolean35 = timeZone31.observesDaylightTime();
        timeZone31.setRawOffset(52);
        timeZone31.setID("Temps universel coordonn\351");
        java.util.Locale locale41 = new java.util.Locale("zh");
        java.util.Locale locale42 = java.util.Locale.CHINESE;
        java.lang.String str43 = locale42.getLanguage();
        boolean boolean44 = locale42.hasExtensions();
        java.lang.String str45 = locale42.getDisplayCountry();
        java.lang.String str46 = locale41.getDisplayName(locale42);
        java.util.Calendar calendar47 = java.util.Calendar.getInstance(timeZone31, locale41);
        java.lang.String str48 = fastDateFormat29.format(calendar47);
        calendar47.set((int) (short) 0, 0, 58);
        java.util.TimeZone timeZone53 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone54 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone55 = java.util.TimeZone.getDefault();
        boolean boolean56 = timeZone54.hasSameRules(timeZone55);
        boolean boolean57 = timeZone53.hasSameRules(timeZone54);
        boolean boolean58 = timeZone54.observesDaylightTime();
        java.util.TimeZone timeZone59 = java.util.TimeZone.getDefault();
        int int61 = timeZone59.getOffset((long) 2);
        java.util.Locale locale65 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale66 = locale65.stripExtensions();
        java.util.Calendar calendar67 = java.util.Calendar.getInstance(timeZone59, locale66);
        boolean boolean68 = timeZone54.hasSameRules(timeZone59);
        java.util.Calendar calendar69 = java.util.Calendar.getInstance(timeZone59);
        java.util.TimeZone timeZone73 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat74 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone73);
        java.lang.String str75 = fastDateFormat74.getPattern();
        java.text.ParsePosition parsePosition78 = new java.text.ParsePosition(16);
        parsePosition78.setIndex(11);
        java.lang.Object obj81 = fastDateFormat74.parseObject("FastDateFormat[]", parsePosition78);
        boolean boolean82 = fastDateFormat74.getTimeZoneOverridesCalendar();
        java.text.AttributedCharacterIterator attributedCharacterIterator84 = fastDateFormat74.formatToCharacterIterator((java.lang.Object) 1645454754924L);
        java.util.Locale locale85 = fastDateFormat74.getLocale();
        java.util.Map<java.lang.String, java.lang.Integer> strMap86 = calendar69.getDisplayNames(2, 0, locale85);
        boolean boolean87 = calendar47.after((java.lang.Object) locale85);
        java.util.Locale.Builder builder88 = builder19.setLocale(locale85);
        java.lang.String str89 = locale85.toLanguageTag();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar67 and calendar69", (calendar67.compareTo(calendar69) == 0) == calendar67.equals(calendar69));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
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
        java.util.Calendar calendar16 = java.util.Calendar.getInstance(timeZone6);
        java.util.TimeZone timeZone20 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone20);
        java.lang.String str22 = fastDateFormat21.getPattern();
        java.text.ParsePosition parsePosition25 = new java.text.ParsePosition(16);
        parsePosition25.setIndex(11);
        java.lang.Object obj28 = fastDateFormat21.parseObject("FastDateFormat[]", parsePosition25);
        boolean boolean29 = fastDateFormat21.getTimeZoneOverridesCalendar();
        java.text.AttributedCharacterIterator attributedCharacterIterator31 = fastDateFormat21.formatToCharacterIterator((java.lang.Object) 1645454754924L);
        java.util.Locale locale32 = fastDateFormat21.getLocale();
        java.util.Map<java.lang.String, java.lang.Integer> strMap33 = calendar16.getDisplayNames(2, 0, locale32);
        int int34 = calendar16.getWeekYear();
        java.util.Date date35 = new java.util.Date();
        int int36 = date35.getTimezoneOffset();
        long long37 = date35.getTime();
        java.util.Date date38 = new java.util.Date();
        int int39 = date38.getSeconds();
        date38.setTime((long) 16);
        date38.setMinutes(12);
        int int44 = date38.getSeconds();
        boolean boolean45 = date35.after(date38);
        java.util.Date date46 = new java.util.Date();
        int int47 = date46.getSeconds();
        date46.setTime((long) 16);
        date46.setMinutes(12);
        int int52 = date46.getMinutes();
        java.util.Date date53 = new java.util.Date();
        int int54 = date53.getTimezoneOffset();
        date53.setMinutes(5);
        int int57 = date53.getMonth();
        boolean boolean58 = date46.before(date53);
        boolean boolean59 = date38.before(date46);
        java.util.TimeZone timeZone60 = java.util.TimeZone.getDefault();
        int int62 = timeZone60.getOffset((long) 2);
        java.util.Locale locale66 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale67 = locale66.stripExtensions();
        java.util.Calendar calendar68 = java.util.Calendar.getInstance(timeZone60, locale67);
        int int70 = calendar68.getLeastMaximum(4);
        int int72 = calendar68.getLeastMaximum((int) (byte) 0);
        java.util.Date date73 = new java.util.Date();
        int int74 = date73.getTimezoneOffset();
        int int75 = date73.getSeconds();
        boolean boolean76 = calendar68.after((java.lang.Object) date73);
        java.util.Date date77 = new java.util.Date();
        int int78 = date77.getSeconds();
        date77.setTime((long) 16);
        date77.setMinutes(12);
        int int83 = date77.getSeconds();
        date77.setMinutes(51);
        boolean boolean86 = date73.before(date77);
        boolean boolean87 = date46.after(date77);
        boolean boolean88 = calendar16.after((java.lang.Object) date77);
        java.lang.Object obj89 = date77.clone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar14 and calendar16", (calendar14.compareTo(calendar16) == 0) == calendar14.equals(calendar16));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
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
        java.lang.String str41 = fastDateFormat9.format((-1859695026000L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar27 and calendar37", (calendar27.compareTo(calendar37) == 0) == calendar27.equals(calendar37));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
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
        java.util.TimeZone timeZone35 = java.util.TimeZone.getDefault();
        int int37 = timeZone35.getOffset((long) 2);
        java.util.Locale locale41 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale42 = locale41.stripExtensions();
        java.util.Calendar calendar43 = java.util.Calendar.getInstance(timeZone35, locale42);
        calendar43.set(122, 52, (int) (byte) 1);
        calendar43.setMinimalDaysInFirstWeek(8);
        java.util.Date date55 = new java.util.Date(3, 16, 11, 8, 51);
        calendar43.setTime(date55);
        java.lang.String str57 = fastDateFormat2.format(calendar43);
        java.util.Date date58 = new java.util.Date();
        int int59 = date58.getSeconds();
        long long60 = date58.getTime();
        date58.setTime((long) (byte) 0);
        boolean boolean63 = calendar43.after((java.lang.Object) date58);
        java.util.TimeZone timeZone66 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str67 = timeZone66.getID();
        java.util.TimeZone.setDefault(timeZone66);
        java.util.Calendar calendar69 = java.util.Calendar.getInstance(timeZone66);
        int int70 = calendar69.getFirstDayOfWeek();
        java.util.TimeZone timeZone71 = java.util.TimeZone.getDefault();
        int int73 = timeZone71.getOffset((long) 2);
        java.util.Locale locale77 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale78 = locale77.stripExtensions();
        java.util.Calendar calendar79 = java.util.Calendar.getInstance(timeZone71, locale78);
        calendar69.setTimeZone(timeZone71);
        java.lang.String str81 = timeZone71.getID();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat82 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, timeZone71);
        calendar43.setTimeZone(timeZone71);
        calendar43.set(32772, 53, 56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar13 and calendar69", (calendar13.compareTo(calendar69) == 0) == calendar13.equals(calendar69));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
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
        java.text.ParsePosition parsePosition42 = new java.text.ParsePosition(16);
        int int43 = parsePosition42.getErrorIndex();
        int int44 = parsePosition42.getErrorIndex();
        java.lang.Object obj45 = null;
        boolean boolean46 = parsePosition42.equals(obj45);
        parsePosition42.setIndex(8);
        java.lang.String str49 = parsePosition42.toString();
        java.lang.Object obj50 = fastDateFormat9.parseObject("\u610f\u5927\u5229\u6587\u610f\u5927\u5229)", parsePosition42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar27 and calendar37", (calendar27.compareTo(calendar37) == 0) == calendar27.equals(calendar37));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
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
        java.lang.Object obj21 = fastDateFormat2.clone();
        java.util.TimeZone timeZone22 = fastDateFormat2.getTimeZone();
        java.lang.Object obj23 = fastDateFormat2.clone();
        java.util.TimeZone timeZone25 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str26 = timeZone25.getID();
        java.util.TimeZone.setDefault(timeZone25);
        java.util.Calendar calendar28 = java.util.Calendar.getInstance(timeZone25);
        int int29 = calendar28.getFirstDayOfWeek();
        java.util.TimeZone timeZone30 = java.util.TimeZone.getDefault();
        int int32 = timeZone30.getOffset((long) 2);
        java.util.Locale locale36 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale37 = locale36.stripExtensions();
        java.util.Calendar calendar38 = java.util.Calendar.getInstance(timeZone30, locale37);
        calendar28.setTimeZone(timeZone30);
        java.lang.String str40 = fastDateFormat2.format(calendar28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar13 and calendar38", (calendar13.compareTo(calendar38) == 0) == calendar13.equals(calendar38));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
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
        java.lang.String str36 = fastDateFormat2.format((long) 70);
        int int37 = fastDateFormat2.getMaxLengthEstimate();
        java.util.TimeZone timeZone38 = java.util.TimeZone.getDefault();
        int int40 = timeZone38.getOffset((long) 2);
        java.util.Locale locale44 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale45 = locale44.stripExtensions();
        java.util.Calendar calendar46 = java.util.Calendar.getInstance(timeZone38, locale45);
        int int48 = calendar46.getLeastMaximum(4);
        calendar46.setFirstDayOfWeek((-1));
        calendar46.setMinimalDaysInFirstWeek((int) (short) -1);
        java.lang.String str53 = fastDateFormat2.format(calendar46);
        java.lang.String str54 = fastDateFormat2.getPattern();
        java.util.TimeZone timeZone57 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat58 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone57);
        java.lang.String str59 = fastDateFormat58.toString();
        java.util.Date date65 = new java.util.Date(3, (int) (short) 0, 6, 0, (int) (short) 1);
        java.util.Date date66 = new java.util.Date();
        int int67 = date66.getTimezoneOffset();
        long long68 = date66.getTime();
        boolean boolean69 = date65.after(date66);
        java.lang.StringBuffer stringBuffer70 = null;
        java.lang.StringBuffer stringBuffer71 = fastDateFormat58.format(date65, stringBuffer70);
        java.util.Date date72 = new java.util.Date();
        int int73 = date72.getTimezoneOffset();
        long long74 = date72.getTime();
        java.util.Date date75 = new java.util.Date();
        int int76 = date75.getSeconds();
        date75.setTime((long) 16);
        date75.setMinutes(12);
        int int81 = date75.getSeconds();
        boolean boolean82 = date72.after(date75);
        boolean boolean83 = fastDateFormat58.equals((java.lang.Object) date72);
        java.util.TimeZone timeZone86 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat87 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone86);
        java.lang.String str88 = fastDateFormat87.getPattern();
        java.text.ParsePosition parsePosition91 = new java.text.ParsePosition(16);
        parsePosition91.setIndex(11);
        java.lang.Object obj94 = fastDateFormat87.parseObject("FastDateFormat[]", parsePosition91);
        parsePosition91.setErrorIndex((int) (byte) 100);
        java.lang.Object obj97 = fastDateFormat58.parseObject("fr_FR", parsePosition91);
        java.lang.Object obj98 = fastDateFormat2.parseObject("Italian", parsePosition91);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar13 and calendar46", (calendar13.compareTo(calendar46) == 0) == calendar13.equals(calendar46));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 2);
        java.util.Locale locale6 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale7 = locale6.stripExtensions();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone0, locale7);
        int int10 = timeZone0.getOffset((long) 'u');
        java.util.TimeZone timeZone11 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone12 = java.util.TimeZone.getDefault();
        boolean boolean13 = timeZone11.hasSameRules(timeZone12);
        java.util.TimeZone timeZone14 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone15 = java.util.TimeZone.getDefault();
        boolean boolean16 = timeZone14.hasSameRules(timeZone15);
        timeZone15.setID("Etc/UTC");
        boolean boolean19 = timeZone12.hasSameRules(timeZone15);
        java.util.TimeZone.setDefault(timeZone15);
        boolean boolean21 = timeZone0.hasSameRules(timeZone15);
        java.util.TimeZone timeZone22 = java.util.TimeZone.getDefault();
        int int24 = timeZone22.getOffset((long) 2);
        java.util.Locale locale28 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale29 = locale28.stripExtensions();
        java.util.Calendar calendar30 = java.util.Calendar.getInstance(timeZone22, locale29);
        int int32 = timeZone22.getOffset((long) 'u');
        boolean boolean33 = timeZone0.hasSameRules(timeZone22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar8 and calendar30", (calendar8.compareTo(calendar30) == 0) == calendar8.equals(calendar30));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
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
        java.util.TimeZone timeZone35 = java.util.TimeZone.getDefault();
        int int37 = timeZone35.getOffset((long) 2);
        java.util.Locale locale41 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale42 = locale41.stripExtensions();
        java.util.Calendar calendar43 = java.util.Calendar.getInstance(timeZone35, locale42);
        calendar43.set(122, 52, (int) (byte) 1);
        calendar43.setMinimalDaysInFirstWeek(8);
        java.util.Date date55 = new java.util.Date(3, 16, 11, 8, 51);
        calendar43.setTime(date55);
        java.lang.String str57 = fastDateFormat2.format(calendar43);
        java.util.Date date58 = new java.util.Date();
        int int59 = date58.getSeconds();
        long long60 = date58.getTime();
        date58.setTime((long) (byte) 0);
        boolean boolean63 = calendar43.after((java.lang.Object) date58);
        java.util.TimeZone timeZone66 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str67 = timeZone66.getID();
        java.util.TimeZone.setDefault(timeZone66);
        java.util.Calendar calendar69 = java.util.Calendar.getInstance(timeZone66);
        int int70 = calendar69.getFirstDayOfWeek();
        java.util.TimeZone timeZone71 = java.util.TimeZone.getDefault();
        int int73 = timeZone71.getOffset((long) 2);
        java.util.Locale locale77 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale78 = locale77.stripExtensions();
        java.util.Calendar calendar79 = java.util.Calendar.getInstance(timeZone71, locale78);
        calendar69.setTimeZone(timeZone71);
        java.lang.String str81 = timeZone71.getID();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat82 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, timeZone71);
        calendar43.setTimeZone(timeZone71);
        int int84 = calendar43.getMinimalDaysInFirstWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar13 and calendar69", (calendar13.compareTo(calendar69) == 0) == calendar13.equals(calendar69));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        java.util.Date date0 = new java.util.Date();
        date0.setTime((long) 2);
        int int3 = date0.getSeconds();
        java.util.Date date4 = new java.util.Date();
        int int5 = date4.getSeconds();
        long long6 = date4.getTime();
        date4.setTime((long) (byte) 0);
        date4.setMinutes((int) (byte) 10);
        date4.setTime((long) 2);
        boolean boolean13 = date0.after(date4);
        date0.setMinutes((int) 'u');
        java.util.TimeZone timeZone16 = java.util.TimeZone.getDefault();
        int int18 = timeZone16.getOffset((long) 2);
        java.util.Locale locale22 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale23 = locale22.stripExtensions();
        java.util.Calendar calendar24 = java.util.Calendar.getInstance(timeZone16, locale23);
        calendar24.set(122, 52, (int) (byte) 1);
        int int29 = calendar24.getWeeksInWeekYear();
        boolean boolean30 = calendar24.isWeekDateSupported();
        calendar24.setFirstDayOfWeek(1);
        int int33 = calendar24.getWeekYear();
        int int34 = calendar24.getMinimalDaysInFirstWeek();
        java.util.Date date38 = new java.util.Date(56, 7, 1969);
        date38.setDate(32770);
        java.util.TimeZone timeZone41 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone42 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone43 = java.util.TimeZone.getDefault();
        boolean boolean44 = timeZone42.hasSameRules(timeZone43);
        boolean boolean45 = timeZone41.hasSameRules(timeZone42);
        boolean boolean46 = timeZone42.observesDaylightTime();
        timeZone42.setRawOffset(52);
        timeZone42.setID("Temps universel coordonn\351");
        java.util.Locale locale52 = new java.util.Locale("zh");
        java.util.Locale locale53 = java.util.Locale.CHINESE;
        java.lang.String str54 = locale53.getLanguage();
        boolean boolean55 = locale53.hasExtensions();
        java.lang.String str56 = locale53.getDisplayCountry();
        java.lang.String str57 = locale52.getDisplayName(locale53);
        java.util.Calendar calendar58 = java.util.Calendar.getInstance(timeZone42, locale52);
        calendar58.clear();
        long long60 = calendar58.getTimeInMillis();
        calendar58.roll(9, 16);
        java.util.Date date64 = new java.util.Date();
        int int65 = date64.getDay();
        calendar58.setTime(date64);
        java.time.Instant instant67 = calendar58.toInstant();
        java.util.Date date68 = java.util.Date.from(instant67);
        boolean boolean69 = date38.before(date68);
        calendar24.setTime(date68);
        boolean boolean71 = date0.before(date68);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar24 and calendar58", (calendar24.compareTo(calendar58) == 0) == calendar24.equals(calendar58));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
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
        java.lang.String str36 = fastDateFormat2.format((long) 70);
        int int37 = fastDateFormat2.getMaxLengthEstimate();
        java.util.TimeZone timeZone38 = java.util.TimeZone.getDefault();
        int int40 = timeZone38.getOffset((long) 2);
        java.util.Locale locale44 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale45 = locale44.stripExtensions();
        java.util.Calendar calendar46 = java.util.Calendar.getInstance(timeZone38, locale45);
        int int48 = calendar46.getLeastMaximum(4);
        calendar46.setFirstDayOfWeek((-1));
        calendar46.setMinimalDaysInFirstWeek((int) (short) -1);
        java.lang.String str53 = fastDateFormat2.format(calendar46);
        java.util.Date date54 = new java.util.Date();
        java.lang.String str55 = date54.toGMTString();
        int int56 = date54.getYear();
        java.time.Instant instant57 = date54.toInstant();
        java.lang.String str58 = fastDateFormat2.format(date54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar13 and calendar46", (calendar13.compareTo(calendar46) == 0) == calendar13.equals(calendar46));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        java.util.Locale locale1 = java.util.Locale.KOREA;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, locale1);
        java.lang.String str4 = fastDateFormat2.format((java.lang.Object) 1645454750118L);
        boolean boolean5 = fastDateFormat2.getTimeZoneOverridesCalendar();
        java.util.TimeZone timeZone7 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone8 = java.util.TimeZone.getDefault();
        boolean boolean9 = timeZone7.hasSameRules(timeZone8);
        java.util.Locale locale13 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale14 = locale13.stripExtensions();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone7, locale13);
        java.lang.Object obj16 = fastDateFormat15.clone();
        java.util.TimeZone timeZone18 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str19 = timeZone18.getID();
        java.util.TimeZone.setDefault(timeZone18);
        java.util.Calendar calendar21 = java.util.Calendar.getInstance(timeZone18);
        int int22 = calendar21.getFirstDayOfWeek();
        java.util.TimeZone timeZone23 = java.util.TimeZone.getDefault();
        int int25 = timeZone23.getOffset((long) 2);
        java.util.Locale locale29 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale30 = locale29.stripExtensions();
        java.util.Calendar calendar31 = java.util.Calendar.getInstance(timeZone23, locale30);
        calendar21.setTimeZone(timeZone23);
        java.lang.String str33 = timeZone23.getID();
        java.util.Calendar calendar34 = java.util.Calendar.getInstance(timeZone23);
        java.lang.String str35 = fastDateFormat15.format(calendar34);
        calendar34.roll(9, (int) (byte) -1);
        java.lang.String str39 = fastDateFormat2.format(calendar34);
        int int40 = fastDateFormat2.getMaxLengthEstimate();
        java.util.TimeZone timeZone41 = fastDateFormat2.getTimeZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar21 and calendar31", (calendar21.compareTo(calendar31) == 0) == calendar21.equals(calendar31));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
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
        java.util.TimeZone timeZone33 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone34 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone35 = java.util.TimeZone.getDefault();
        boolean boolean36 = timeZone34.hasSameRules(timeZone35);
        boolean boolean37 = timeZone33.hasSameRules(timeZone34);
        boolean boolean38 = timeZone34.observesDaylightTime();
        java.util.TimeZone timeZone39 = java.util.TimeZone.getDefault();
        int int41 = timeZone39.getOffset((long) 2);
        java.util.Locale locale45 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale46 = locale45.stripExtensions();
        java.util.Calendar calendar47 = java.util.Calendar.getInstance(timeZone39, locale46);
        boolean boolean48 = timeZone34.hasSameRules(timeZone39);
        java.util.Calendar calendar49 = java.util.Calendar.getInstance(timeZone39);
        java.util.TimeZone timeZone53 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat54 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone53);
        java.lang.String str55 = fastDateFormat54.getPattern();
        java.text.ParsePosition parsePosition58 = new java.text.ParsePosition(16);
        parsePosition58.setIndex(11);
        java.lang.Object obj61 = fastDateFormat54.parseObject("FastDateFormat[]", parsePosition58);
        boolean boolean62 = fastDateFormat54.getTimeZoneOverridesCalendar();
        java.text.AttributedCharacterIterator attributedCharacterIterator64 = fastDateFormat54.formatToCharacterIterator((java.lang.Object) 1645454754924L);
        java.util.Locale locale65 = fastDateFormat54.getLocale();
        java.util.Map<java.lang.String, java.lang.Integer> strMap66 = calendar49.getDisplayNames(2, 0, locale65);
        boolean boolean67 = calendar27.after((java.lang.Object) locale65);
        java.util.Date date68 = calendar27.getTime();
        java.lang.String str69 = date68.toGMTString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar47 and calendar49", (calendar47.compareTo(calendar49) == 0) == calendar47.equals(calendar49));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
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
        java.util.Locale locale22 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale23 = locale22.stripExtensions();
        java.util.Locale locale24 = java.util.Locale.US;
        java.util.Calendar calendar25 = java.util.Calendar.getInstance(locale24);
        java.lang.String str26 = locale22.getDisplayCountry(locale24);
        java.util.Set<java.lang.String> strSet27 = locale24.getUnicodeLocaleKeys();
        localeList12.add(0, locale24);
        java.util.Spliterator<java.util.Locale> localeSpliterator29 = localeList12.spliterator();
        int int30 = localeList12.size();
        boolean boolean31 = localeList12.isEmpty();
        java.util.Locale locale33 = new java.util.Locale("zh");
        java.lang.String str34 = locale33.getDisplayVariant();
        java.lang.String str35 = locale33.getDisplayCountry();
        java.util.Set<java.lang.String> strSet36 = locale33.getUnicodeLocaleKeys();
        boolean boolean37 = localeList12.removeAll((java.util.Collection<java.lang.String>) strSet36);
        java.util.Locale locale39 = java.util.Locale.KOREA;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, locale39);
        java.lang.String str42 = fastDateFormat40.format((java.lang.Object) 1645454750118L);
        java.util.TimeZone timeZone43 = java.util.TimeZone.getDefault();
        int int45 = timeZone43.getOffset((long) 2);
        java.util.Locale locale49 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale50 = locale49.stripExtensions();
        java.util.Calendar calendar51 = java.util.Calendar.getInstance(timeZone43, locale50);
        int int53 = calendar51.getLeastMaximum(4);
        calendar51.setFirstDayOfWeek((-1));
        int int56 = calendar51.getFirstDayOfWeek();
        java.lang.String str57 = fastDateFormat40.format(calendar51);
        java.lang.Object obj58 = fastDateFormat40.clone();
        java.util.Date date59 = new java.util.Date();
        int int60 = date59.getSeconds();
        date59.setTime((long) 16);
        date59.setMinutes(12);
        int int65 = date59.getMinutes();
        java.util.Date date66 = new java.util.Date();
        int int67 = date66.getTimezoneOffset();
        date66.setMinutes(5);
        int int70 = date66.getMonth();
        boolean boolean71 = date59.before(date66);
        java.lang.String str72 = fastDateFormat40.format(date59);
        java.lang.String str74 = fastDateFormat40.format((long) 70);
        java.util.Locale locale75 = java.util.Locale.US;
        java.lang.String str76 = locale75.getDisplayVariant();
        java.util.Locale locale77 = java.util.Locale.FRANCE;
        boolean boolean78 = locale77.hasExtensions();
        java.util.Locale locale79 = java.util.Locale.ROOT;
        java.lang.String str80 = locale77.getDisplayName(locale79);
        java.lang.String str81 = locale79.getCountry();
        java.lang.String str82 = locale75.getDisplayVariant(locale79);
        java.util.Calendar calendar83 = java.util.Calendar.getInstance(locale79);
        calendar83.clear();
        java.lang.String str85 = fastDateFormat40.format(calendar83);
        boolean boolean86 = localeList12.contains((java.lang.Object) fastDateFormat40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar25 and calendar51", (calendar25.compareTo(calendar51) == 0) == calendar25.equals(calendar51));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        java.util.Locale locale0 = java.util.Locale.US;
        java.lang.String str1 = locale0.getDisplayVariant();
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        boolean boolean3 = locale2.hasExtensions();
        java.util.Locale locale4 = java.util.Locale.ROOT;
        java.lang.String str5 = locale2.getDisplayName(locale4);
        java.lang.String str6 = locale4.getCountry();
        java.lang.String str7 = locale0.getDisplayVariant(locale4);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale4);
        java.util.TimeZone timeZone9 = calendar8.getTimeZone();
        java.lang.String str10 = timeZone9.getID();
        java.util.TimeZone timeZone12 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.util.Locale locale13 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone12, locale13);
        timeZone12.setRawOffset(0);
        java.util.TimeZone timeZone17 = null;
        boolean boolean18 = timeZone12.hasSameRules(timeZone17);
        boolean boolean19 = timeZone9.hasSameRules(timeZone12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar8 and calendar14", (calendar8.compareTo(calendar14) == 0) == calendar8.equals(calendar14));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.util.Locale locale2 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone1, locale2);
        int int5 = calendar3.getActualMinimum(10);
        java.lang.String str6 = calendar3.getCalendarType();
        calendar3.clear();
        int int8 = calendar3.getWeeksInWeekYear();
        java.util.TimeZone timeZone9 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone10 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone11 = java.util.TimeZone.getDefault();
        boolean boolean12 = timeZone10.hasSameRules(timeZone11);
        boolean boolean13 = timeZone9.hasSameRules(timeZone10);
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone10);
        timeZone10.setID("java.text.AttributedCharacterIterator$Attribute(input_method_segment)");
        java.util.TimeZone timeZone19 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str20 = timeZone19.getID();
        java.util.TimeZone.setDefault(timeZone19);
        java.util.Calendar calendar22 = java.util.Calendar.getInstance(timeZone19);
        int int23 = calendar22.getFirstDayOfWeek();
        java.util.TimeZone timeZone24 = java.util.TimeZone.getDefault();
        int int26 = timeZone24.getOffset((long) 2);
        java.util.Locale locale30 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale31 = locale30.stripExtensions();
        java.util.Calendar calendar32 = java.util.Calendar.getInstance(timeZone24, locale31);
        calendar22.setTimeZone(timeZone24);
        java.lang.String str34 = timeZone24.getID();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, timeZone24);
        boolean boolean36 = timeZone10.hasSameRules(timeZone24);
        calendar3.setTimeZone(timeZone24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar14 and calendar22", (calendar14.compareTo(calendar22) == 0) == calendar14.equals(calendar22));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        java.util.Locale locale0 = java.util.Locale.US;
        java.lang.String str1 = locale0.getDisplayVariant();
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        boolean boolean3 = locale2.hasExtensions();
        java.util.Locale locale4 = java.util.Locale.ROOT;
        java.lang.String str5 = locale2.getDisplayName(locale4);
        java.lang.String str6 = locale4.getCountry();
        java.lang.String str7 = locale0.getDisplayVariant(locale4);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale4);
        java.util.TimeZone timeZone9 = calendar8.getTimeZone();
        java.lang.String str10 = timeZone9.getID();
        java.util.Locale locale11 = java.util.Locale.GERMANY;
        java.util.Calendar calendar12 = java.util.Calendar.getInstance(timeZone9, locale11);
        java.util.TimeZone timeZone13 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone14 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone15 = java.util.TimeZone.getDefault();
        boolean boolean16 = timeZone14.hasSameRules(timeZone15);
        boolean boolean17 = timeZone13.hasSameRules(timeZone14);
        int int18 = timeZone14.getRawOffset();
        java.util.TimeZone timeZone19 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone20 = java.util.TimeZone.getDefault();
        boolean boolean21 = timeZone19.hasSameRules(timeZone20);
        timeZone20.setID("Etc/UTC");
        boolean boolean24 = timeZone14.hasSameRules(timeZone20);
        java.time.ZoneId zoneId25 = timeZone20.toZoneId();
        boolean boolean26 = timeZone9.hasSameRules(timeZone20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar8 and calendar12", (calendar8.compareTo(calendar12) == 0) == calendar8.equals(calendar12));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
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
        java.util.TimeZone timeZone40 = calendar37.getTimeZone();
        java.time.ZoneId zoneId41 = timeZone40.toZoneId();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar27 and calendar37", (calendar27.compareTo(calendar37) == 0) == calendar27.equals(calendar37));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
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
        java.lang.String str40 = fastDateFormat9.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar27 and calendar37", (calendar27.compareTo(calendar37) == 0) == calendar27.equals(calendar37));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone1);
        java.util.TimeZone timeZone6 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str7 = timeZone6.getID();
        boolean boolean8 = timeZone1.hasSameRules(timeZone6);
        boolean boolean9 = timeZone1.observesDaylightTime();
        timeZone1.setID("2:46:04 PM UTC");
        java.util.Calendar calendar12 = java.util.Calendar.getInstance(timeZone1);
        java.util.TimeZone timeZone13 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone14 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone15 = java.util.TimeZone.getDefault();
        boolean boolean16 = timeZone14.hasSameRules(timeZone15);
        boolean boolean17 = timeZone13.hasSameRules(timeZone14);
        boolean boolean18 = timeZone14.observesDaylightTime();
        java.util.TimeZone timeZone19 = java.util.TimeZone.getDefault();
        int int21 = timeZone19.getOffset((long) 2);
        java.util.Locale locale25 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale26 = locale25.stripExtensions();
        java.util.Calendar calendar27 = java.util.Calendar.getInstance(timeZone19, locale26);
        boolean boolean28 = timeZone14.hasSameRules(timeZone19);
        java.util.Calendar calendar29 = java.util.Calendar.getInstance(timeZone19);
        timeZone19.setRawOffset(32770);
        boolean boolean32 = timeZone1.hasSameRules(timeZone19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar12 and calendar27", (calendar12.compareTo(calendar27) == 0) == calendar12.equals(calendar27));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone1);
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(timeZone1);
        timeZone1.setID("java.text.AttributedCharacterIterator$Attribute(input_method_segment)");
        java.util.TimeZone timeZone10 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str11 = timeZone10.getID();
        java.util.TimeZone.setDefault(timeZone10);
        java.util.Calendar calendar13 = java.util.Calendar.getInstance(timeZone10);
        int int14 = calendar13.getFirstDayOfWeek();
        java.util.TimeZone timeZone15 = java.util.TimeZone.getDefault();
        int int17 = timeZone15.getOffset((long) 2);
        java.util.Locale locale21 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale22 = locale21.stripExtensions();
        java.util.Calendar calendar23 = java.util.Calendar.getInstance(timeZone15, locale22);
        calendar13.setTimeZone(timeZone15);
        java.lang.String str25 = timeZone15.getID();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, timeZone15);
        boolean boolean27 = timeZone1.hasSameRules(timeZone15);
        boolean boolean28 = timeZone1.observesDaylightTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar5 and calendar13", (calendar5.compareTo(calendar13) == 0) == calendar5.equals(calendar13));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone1);
        java.util.TimeZone timeZone6 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str7 = timeZone6.getID();
        boolean boolean8 = timeZone1.hasSameRules(timeZone6);
        int int9 = timeZone6.getRawOffset();
        java.util.Locale locale10 = java.util.Locale.CHINA;
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
        java.util.Set<java.lang.Character> charSet29 = locale22.getExtensionKeys();
        java.lang.String str30 = locale10.getDisplayCountry(locale22);
        java.lang.String str31 = locale10.getLanguage();
        java.lang.String str32 = locale10.getLanguage();
        java.util.Calendar calendar33 = java.util.Calendar.getInstance(timeZone6, locale10);
        java.time.ZoneId zoneId34 = timeZone6.toZoneId();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar28 and calendar33", (calendar28.compareTo(calendar33) == 0) == calendar28.equals(calendar33));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
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
        java.lang.String str36 = fastDateFormat2.format((long) 70);
        int int37 = fastDateFormat2.getMaxLengthEstimate();
        java.util.TimeZone timeZone38 = java.util.TimeZone.getDefault();
        int int40 = timeZone38.getOffset((long) 2);
        java.util.Locale locale44 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale45 = locale44.stripExtensions();
        java.util.Calendar calendar46 = java.util.Calendar.getInstance(timeZone38, locale45);
        int int48 = calendar46.getLeastMaximum(4);
        calendar46.setFirstDayOfWeek((-1));
        calendar46.setMinimalDaysInFirstWeek((int) (short) -1);
        java.lang.String str53 = fastDateFormat2.format(calendar46);
        java.lang.String str54 = fastDateFormat2.getPattern();
        java.util.Locale locale55 = fastDateFormat2.getLocale();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar13 and calendar46", (calendar13.compareTo(calendar46) == 0) == calendar13.equals(calendar46));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
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
        calendar37.clear();
        java.util.TimeZone timeZone42 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone43 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone44 = java.util.TimeZone.getDefault();
        boolean boolean45 = timeZone43.hasSameRules(timeZone44);
        boolean boolean46 = timeZone42.hasSameRules(timeZone43);
        java.util.TimeZone timeZone48 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str49 = timeZone48.getID();
        boolean boolean50 = timeZone43.hasSameRules(timeZone48);
        java.util.Locale locale51 = java.util.Locale.FRANCE;
        boolean boolean52 = locale51.hasExtensions();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat53 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone48, locale51);
        java.util.TimeZone timeZone55 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str56 = timeZone55.getID();
        java.util.TimeZone.setDefault(timeZone55);
        java.util.Calendar calendar58 = java.util.Calendar.getInstance(timeZone55);
        int int59 = calendar58.getFirstDayOfWeek();
        java.util.TimeZone timeZone60 = java.util.TimeZone.getDefault();
        int int62 = timeZone60.getOffset((long) 2);
        java.util.Locale locale66 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale67 = locale66.stripExtensions();
        java.util.Calendar calendar68 = java.util.Calendar.getInstance(timeZone60, locale67);
        calendar58.setTimeZone(timeZone60);
        java.lang.String str70 = timeZone60.getID();
        java.util.Calendar calendar71 = java.util.Calendar.getInstance(timeZone60);
        java.util.TimeZone timeZone72 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone73 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone74 = java.util.TimeZone.getDefault();
        boolean boolean75 = timeZone73.hasSameRules(timeZone74);
        boolean boolean76 = timeZone72.hasSameRules(timeZone73);
        timeZone73.setID("Mon Feb 21 14:45:50 GMT 2022");
        boolean boolean79 = timeZone60.hasSameRules(timeZone73);
        boolean boolean80 = timeZone48.hasSameRules(timeZone73);
        timeZone48.setID("21 Feb 2022 14:46:31 GMT");
        calendar37.setTimeZone(timeZone48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar27 and calendar58", (calendar27.compareTo(calendar58) == 0) == calendar27.equals(calendar58));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str3 = timeZone2.getID();
        java.util.TimeZone.setDefault(timeZone2);
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(timeZone2);
        int int6 = calendar5.getFirstDayOfWeek();
        java.util.TimeZone timeZone7 = java.util.TimeZone.getDefault();
        int int9 = timeZone7.getOffset((long) 2);
        java.util.Locale locale13 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale14 = locale13.stripExtensions();
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone7, locale14);
        calendar5.setTimeZone(timeZone7);
        java.lang.String str17 = timeZone7.getID();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, timeZone7);
        java.util.TimeZone timeZone20 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str21 = timeZone20.getID();
        java.time.ZoneId zoneId22 = timeZone20.toZoneId();
        java.util.TimeZone timeZone23 = java.util.TimeZone.getTimeZone(zoneId22);
        boolean boolean24 = timeZone7.hasSameRules(timeZone23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar5 and calendar15", (calendar5.compareTo(calendar15) == 0) == calendar5.equals(calendar15));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
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
        java.text.Format.Field field40 = null;
        java.text.FieldPosition fieldPosition42 = new java.text.FieldPosition(field40, 16);
        fieldPosition42.setBeginIndex(12);
        java.util.Date date45 = new java.util.Date();
        date45.setMinutes(32770);
        boolean boolean48 = fieldPosition42.equals((java.lang.Object) date45);
        int int49 = date45.getMonth();
        java.util.Date date50 = new java.util.Date();
        int int51 = date50.getSeconds();
        date50.setTime((long) 16);
        date50.setMinutes(12);
        int int56 = date50.getSeconds();
        date50.setMinutes(51);
        date50.setHours(55);
        int int61 = date50.getYear();
        boolean boolean62 = date45.before(date50);
        int int63 = date50.getYear();
        java.lang.String str64 = fastDateFormat9.format(date50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar27 and calendar37", (calendar27.compareTo(calendar37) == 0) == calendar27.equals(calendar37));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        boolean boolean4 = timeZone2.hasSameRules(timeZone3);
        boolean boolean5 = timeZone1.hasSameRules(timeZone2);
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(timeZone2);
        timeZone2.setRawOffset(50);
        java.util.Locale locale10 = new java.util.Locale("2:45:52 PM UTC");
        java.util.Locale locale12 = new java.util.Locale("zh");
        java.lang.String str13 = locale10.getDisplayScript(locale12);
        java.util.TimeZone timeZone15 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone15);
        java.lang.String str17 = fastDateFormat16.getPattern();
        java.text.ParsePosition parsePosition20 = new java.text.ParsePosition(16);
        parsePosition20.setIndex(11);
        java.lang.Object obj23 = fastDateFormat16.parseObject("FastDateFormat[]", parsePosition20);
        java.util.TimeZone timeZone24 = fastDateFormat16.getTimeZone();
        java.lang.String str25 = timeZone24.getID();
        java.util.Locale locale27 = new java.util.Locale("zh");
        java.lang.String str28 = locale27.getISO3Country();
        java.util.Calendar calendar29 = java.util.Calendar.getInstance(timeZone24, locale27);
        java.lang.String str30 = locale10.getDisplayName(locale27);
        java.lang.String str31 = locale10.getISO3Country();
        java.lang.String str33 = locale10.getExtension('x');
        java.util.Calendar calendar34 = java.util.Calendar.getInstance(timeZone2, locale10);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang3.time.FastDateFormat.getInstance("\u4e0b\u5348 02:46:08", timeZone2);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar6 and calendar29", (calendar6.compareTo(calendar29) == 0) == calendar6.equals(calendar29));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
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
        calendar37.roll((int) (short) 0, (int) (byte) 0);
        java.util.Locale.LanguageRange[] languageRangeArray43 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList44 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList44, languageRangeArray43);
        java.util.Locale locale46 = java.util.Locale.GERMAN;
        java.util.Locale locale47 = java.util.Locale.FRANCE;
        boolean boolean48 = locale47.hasExtensions();
        java.util.Locale locale49 = java.util.Locale.FRANCE;
        java.util.Locale locale50 = java.util.Locale.CHINESE;
        java.lang.String str51 = locale50.getLanguage();
        java.util.Locale[] localeArray52 = new java.util.Locale[] { locale46, locale47, locale49, locale50 };
        java.util.ArrayList<java.util.Locale> localeList53 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList53, localeArray52);
        java.util.Locale.FilteringMode filteringMode55 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList56 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList44, (java.util.Collection<java.util.Locale>) localeList53, filteringMode55);
        java.util.Spliterator<java.util.Locale> localeSpliterator57 = localeList56.spliterator();
        java.lang.Object[] objArray58 = localeList56.toArray();
        localeList56.clear();
        java.text.Format.Field field60 = null;
        java.text.FieldPosition fieldPosition61 = new java.text.FieldPosition(field60);
        boolean boolean62 = localeList56.equals((java.lang.Object) fieldPosition61);
        java.util.Locale locale63 = java.util.Locale.US;
        java.util.Locale locale64 = locale63.stripExtensions();
        java.util.Locale locale65 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet66 = locale65.getUnicodeLocaleKeys();
        java.lang.String str67 = locale64.getDisplayVariant(locale65);
        int int68 = localeList56.lastIndexOf((java.lang.Object) locale64);
        java.util.Set<java.lang.String> strSet69 = locale64.getUnicodeLocaleKeys();
        boolean boolean70 = calendar37.before((java.lang.Object) locale64);
        java.util.Set<java.lang.String> strSet71 = locale64.getUnicodeLocaleAttributes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar27 and calendar37", (calendar27.compareTo(calendar37) == 0) == calendar27.equals(calendar37));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone1);
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(timeZone1);
        timeZone1.setRawOffset(50);
        java.util.Locale locale9 = new java.util.Locale("2:45:52 PM UTC");
        java.util.Locale locale11 = new java.util.Locale("zh");
        java.lang.String str12 = locale9.getDisplayScript(locale11);
        java.util.TimeZone timeZone14 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone14);
        java.lang.String str16 = fastDateFormat15.getPattern();
        java.text.ParsePosition parsePosition19 = new java.text.ParsePosition(16);
        parsePosition19.setIndex(11);
        java.lang.Object obj22 = fastDateFormat15.parseObject("FastDateFormat[]", parsePosition19);
        java.util.TimeZone timeZone23 = fastDateFormat15.getTimeZone();
        java.lang.String str24 = timeZone23.getID();
        java.util.Locale locale26 = new java.util.Locale("zh");
        java.lang.String str27 = locale26.getISO3Country();
        java.util.Calendar calendar28 = java.util.Calendar.getInstance(timeZone23, locale26);
        java.lang.String str29 = locale9.getDisplayName(locale26);
        java.lang.String str30 = locale9.getISO3Country();
        java.lang.String str32 = locale9.getExtension('x');
        java.util.Calendar calendar33 = java.util.Calendar.getInstance(timeZone1, locale9);
        java.util.TimeZone timeZone36 = java.util.TimeZone.getDefault();
        timeZone36.setID("\uc624\ud6c4\uc2dc\ubd84\ucd08 GMT");
        java.util.Locale locale39 = java.util.Locale.ROOT;
        java.util.Locale locale40 = java.util.Locale.FRANCE;
        java.lang.String str41 = locale39.getDisplayLanguage(locale40);
        java.util.Calendar calendar42 = java.util.Calendar.getInstance(timeZone36, locale39);
        java.util.TimeZone timeZone44 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone44);
        java.lang.String str46 = fastDateFormat45.getPattern();
        java.text.ParsePosition parsePosition49 = new java.text.ParsePosition(16);
        parsePosition49.setIndex(11);
        java.lang.Object obj52 = fastDateFormat45.parseObject("FastDateFormat[]", parsePosition49);
        boolean boolean53 = fastDateFormat45.getTimeZoneOverridesCalendar();
        java.text.AttributedCharacterIterator attributedCharacterIterator55 = fastDateFormat45.formatToCharacterIterator((java.lang.Object) 1645454754924L);
        java.util.Locale locale56 = fastDateFormat45.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat57 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (short) 0, timeZone36, locale56);
        java.lang.String str58 = locale9.getDisplayLanguage(locale56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar5 and calendar28", (calendar5.compareTo(calendar28) == 0) == calendar5.equals(calendar28));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
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
        java.util.Locale locale19 = new java.util.Locale("\uc624\ud6c4\uc2dc\ubd84\ucd08 UTC");
        java.lang.String str20 = locale19.getVariant();
        java.lang.String str21 = timeZone12.getDisplayName(locale19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar8 and calendar16", (calendar8.compareTo(calendar16) == 0) == calendar8.equals(calendar16));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setWeekDate(5, (int) (byte) -1, 1);
        java.util.Calendar.Builder builder6 = builder4.setLenient(true);
        java.util.Calendar.Builder builder10 = builder6.setTimeOfDay(122, 11, 10);
        java.util.Calendar.Builder builder11 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder15 = builder11.setWeekDate(5, (int) (byte) -1, 1);
        java.util.Calendar.Builder builder17 = builder15.setLenient(true);
        java.util.Calendar.Builder builder21 = builder17.setTimeOfDay(122, 11, 10);
        java.util.Calendar.Builder builder25 = builder21.setWeekDate(100, 9, 2);
        java.util.Calendar.Builder builder29 = builder25.setTimeOfDay(52, (int) (short) 10, (-1));
        java.util.Calendar.Builder builder31 = builder29.setLenient(true);
        java.util.Calendar.Builder builder34 = builder29.set(2, 54);
        java.util.Calendar.Builder builder39 = builder29.setTimeOfDay((int) 'u', 32769, 70, 5);
        java.util.TimeZone timeZone40 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone41 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone42 = java.util.TimeZone.getDefault();
        boolean boolean43 = timeZone41.hasSameRules(timeZone42);
        boolean boolean44 = timeZone40.hasSameRules(timeZone41);
        boolean boolean45 = timeZone41.observesDaylightTime();
        java.util.TimeZone timeZone46 = java.util.TimeZone.getDefault();
        int int48 = timeZone46.getOffset((long) 2);
        java.util.Locale locale52 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale53 = locale52.stripExtensions();
        java.util.Calendar calendar54 = java.util.Calendar.getInstance(timeZone46, locale53);
        boolean boolean55 = timeZone41.hasSameRules(timeZone46);
        java.util.Calendar calendar56 = java.util.Calendar.getInstance(timeZone46);
        java.util.Calendar.Builder builder57 = builder39.setTimeZone(timeZone46);
        java.util.Calendar.Builder builder58 = builder6.setTimeZone(timeZone46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar54 and calendar56", (calendar54.compareTo(calendar56) == 0) == calendar54.equals(calendar56));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        boolean boolean4 = timeZone2.hasSameRules(timeZone3);
        boolean boolean5 = timeZone1.hasSameRules(timeZone2);
        java.util.TimeZone timeZone7 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str8 = timeZone7.getID();
        boolean boolean9 = timeZone2.hasSameRules(timeZone7);
        timeZone7.setRawOffset(126);
        java.util.Locale locale15 = new java.util.Locale("java.text.ParsePosition[index=16,errorIndex=-1]", "FastDateFormat[]", "FastDateFormat[]");
        java.lang.String str16 = locale15.getDisplayLanguage();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, timeZone7, locale15);
        java.util.TimeZone timeZone18 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone19 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone20 = java.util.TimeZone.getDefault();
        boolean boolean21 = timeZone19.hasSameRules(timeZone20);
        boolean boolean22 = timeZone18.hasSameRules(timeZone19);
        java.util.Calendar calendar23 = java.util.Calendar.getInstance(timeZone19);
        timeZone19.setRawOffset(50);
        java.util.Locale locale27 = new java.util.Locale("2:45:52 PM UTC");
        java.util.Locale locale29 = new java.util.Locale("zh");
        java.lang.String str30 = locale27.getDisplayScript(locale29);
        java.util.TimeZone timeZone32 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone32);
        java.lang.String str34 = fastDateFormat33.getPattern();
        java.text.ParsePosition parsePosition37 = new java.text.ParsePosition(16);
        parsePosition37.setIndex(11);
        java.lang.Object obj40 = fastDateFormat33.parseObject("FastDateFormat[]", parsePosition37);
        java.util.TimeZone timeZone41 = fastDateFormat33.getTimeZone();
        java.lang.String str42 = timeZone41.getID();
        java.util.Locale locale44 = new java.util.Locale("zh");
        java.lang.String str45 = locale44.getISO3Country();
        java.util.Calendar calendar46 = java.util.Calendar.getInstance(timeZone41, locale44);
        java.lang.String str47 = locale27.getDisplayName(locale44);
        java.lang.String str48 = locale27.getISO3Country();
        java.lang.String str50 = locale27.getExtension('x');
        java.util.Calendar calendar51 = java.util.Calendar.getInstance(timeZone19, locale27);
        java.text.AttributedCharacterIterator attributedCharacterIterator52 = fastDateFormat17.formatToCharacterIterator((java.lang.Object) calendar51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar23 and calendar46", (calendar23.compareTo(calendar46) == 0) == calendar23.equals(calendar46));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone1);
        java.util.TimeZone timeZone6 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str7 = timeZone6.getID();
        boolean boolean8 = timeZone1.hasSameRules(timeZone6);
        int int9 = timeZone6.getRawOffset();
        java.util.Locale locale10 = java.util.Locale.CHINA;
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
        java.util.Set<java.lang.Character> charSet29 = locale22.getExtensionKeys();
        java.lang.String str30 = locale10.getDisplayCountry(locale22);
        java.lang.String str31 = locale10.getLanguage();
        java.lang.String str32 = locale10.getLanguage();
        java.util.Calendar calendar33 = java.util.Calendar.getInstance(timeZone6, locale10);
        java.util.Locale locale37 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale38 = locale37.stripExtensions();
        java.util.TimeZone timeZone40 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone40);
        java.lang.String str42 = fastDateFormat41.getPattern();
        java.util.Date date43 = new java.util.Date();
        int int44 = date43.getSeconds();
        java.lang.String str45 = fastDateFormat41.format(date43);
        java.text.ParsePosition parsePosition48 = new java.text.ParsePosition(16);
        int int49 = parsePosition48.getErrorIndex();
        java.lang.Object obj50 = fastDateFormat41.parseObject("Temps universel coordonn\351", parsePosition48);
        int int51 = fastDateFormat41.getMaxLengthEstimate();
        java.util.Locale locale52 = fastDateFormat41.getLocale();
        java.lang.String str53 = locale37.getDisplayLanguage(locale52);
        java.lang.String str54 = locale10.getDisplayScript(locale52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar28 and calendar33", (calendar28.compareTo(calendar33) == 0) == calendar28.equals(calendar33));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone1);
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(timeZone1);
        timeZone1.setRawOffset(50);
        java.util.Locale locale9 = new java.util.Locale("2:45:52 PM UTC");
        java.util.Locale locale11 = new java.util.Locale("zh");
        java.lang.String str12 = locale9.getDisplayScript(locale11);
        java.util.TimeZone timeZone14 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone14);
        java.lang.String str16 = fastDateFormat15.getPattern();
        java.text.ParsePosition parsePosition19 = new java.text.ParsePosition(16);
        parsePosition19.setIndex(11);
        java.lang.Object obj22 = fastDateFormat15.parseObject("FastDateFormat[]", parsePosition19);
        java.util.TimeZone timeZone23 = fastDateFormat15.getTimeZone();
        java.lang.String str24 = timeZone23.getID();
        java.util.Locale locale26 = new java.util.Locale("zh");
        java.lang.String str27 = locale26.getISO3Country();
        java.util.Calendar calendar28 = java.util.Calendar.getInstance(timeZone23, locale26);
        java.lang.String str29 = locale9.getDisplayName(locale26);
        java.lang.String str30 = locale9.getISO3Country();
        java.lang.String str32 = locale9.getExtension('x');
        java.util.Calendar calendar33 = java.util.Calendar.getInstance(timeZone1, locale9);
        calendar33.clear();
        java.util.Locale.LanguageRange[] languageRangeArray35 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList36 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList36, languageRangeArray35);
        java.util.Locale locale38 = java.util.Locale.GERMAN;
        java.util.Locale locale39 = java.util.Locale.FRANCE;
        boolean boolean40 = locale39.hasExtensions();
        java.util.Locale locale41 = java.util.Locale.FRANCE;
        java.util.Locale locale42 = java.util.Locale.CHINESE;
        java.lang.String str43 = locale42.getLanguage();
        java.util.Locale[] localeArray44 = new java.util.Locale[] { locale38, locale39, locale41, locale42 };
        java.util.ArrayList<java.util.Locale> localeList45 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList45, localeArray44);
        java.util.Locale.FilteringMode filteringMode47 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList48 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList36, (java.util.Collection<java.util.Locale>) localeList45, filteringMode47);
        java.util.Spliterator<java.util.Locale> localeSpliterator49 = localeList48.spliterator();
        java.lang.Object[] objArray50 = localeList48.toArray();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList52 = java.util.Locale.LanguageRange.parse("zho");
        java.util.Set<java.lang.String> strSet53 = java.util.Calendar.getAvailableCalendarTypes();
        java.util.stream.Stream<java.lang.String> strStream54 = strSet53.parallelStream();
        java.lang.String str55 = java.util.Locale.lookupTag(languageRangeList52, (java.util.Collection<java.lang.String>) strSet53);
        java.util.stream.Stream<java.lang.String> strStream56 = strSet53.stream();
        boolean boolean57 = localeList48.containsAll((java.util.Collection<java.lang.String>) strSet53);
        java.util.Locale locale61 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale62 = locale61.stripExtensions();
        boolean boolean63 = localeList48.add(locale61);
        java.util.Locale locale67 = new java.util.Locale("21 Feb 2022 14:46:12 GMT", "java.util.GregorianCalendar[time=-58180670029710,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=126,MONTH=4,WEEK_OF_YEAR=18,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=121,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=10,MILLISECOND=290,ZONE_OFFSET=0,DST_OFFSET=0]", "1 janv. 1899 00:05:00");
        java.lang.String str68 = locale61.getDisplayCountry(locale67);
        java.util.Locale locale71 = new java.util.Locale("\uc624\ud6c4\uc2dc\ubd84\ucd08 GMT", "Chinese");
        java.lang.String str72 = locale67.getDisplayLanguage(locale71);
        java.lang.String str73 = locale67.getLanguage();
        boolean boolean74 = calendar33.before((java.lang.Object) locale67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar5 and calendar28", (calendar5.compareTo(calendar28) == 0) == calendar5.equals(calendar28));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
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
        java.lang.String str36 = fastDateFormat2.format((long) 70);
        int int37 = fastDateFormat2.getMaxLengthEstimate();
        java.util.TimeZone timeZone38 = java.util.TimeZone.getDefault();
        int int40 = timeZone38.getOffset((long) 2);
        java.util.Locale locale44 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale45 = locale44.stripExtensions();
        java.util.Calendar calendar46 = java.util.Calendar.getInstance(timeZone38, locale45);
        calendar46.set(122, 52, (int) (byte) 1);
        int int51 = calendar46.getWeeksInWeekYear();
        calendar46.add(13, 0);
        calendar46.set(17, 4, 58, 32769, 7, 54);
        calendar46.setFirstDayOfWeek(52);
        java.util.TimeZone timeZone64 = calendar46.getTimeZone();
        java.lang.String str65 = fastDateFormat2.format(calendar46);
        java.util.Calendar.Builder builder66 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder70 = builder66.setWeekDate(5, (int) (byte) -1, 1);
        java.util.Calendar.Builder builder72 = builder70.setLenient(true);
        java.util.Calendar.Builder builder76 = builder72.setTimeOfDay(122, 11, 10);
        java.util.Calendar.Builder builder80 = builder76.setWeekDate(100, 9, 2);
        java.util.TimeZone timeZone81 = java.util.TimeZone.getDefault();
        java.util.Calendar.Builder builder82 = builder80.setTimeZone(timeZone81);
        int int83 = timeZone81.getRawOffset();
        java.util.Calendar calendar84 = java.util.Calendar.getInstance(timeZone81);
        int int86 = calendar84.getActualMaximum(11);
        java.util.Date date87 = calendar84.getTime();
        java.lang.String str88 = fastDateFormat2.format(date87);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar13 and calendar84", (calendar13.compareTo(calendar84) == 0) == calendar13.equals(calendar84));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
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
        calendar27.setMinimalDaysInFirstWeek(4);
        calendar27.setMinimalDaysInFirstWeek(70);
        java.util.TimeZone timeZone33 = java.util.TimeZone.getDefault();
        int int35 = timeZone33.getOffset((long) 2);
        java.util.Locale locale39 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale40 = locale39.stripExtensions();
        java.util.Calendar calendar41 = java.util.Calendar.getInstance(timeZone33, locale40);
        int int43 = calendar41.getLeastMaximum(4);
        int int45 = calendar41.getLeastMaximum((int) (byte) 0);
        java.util.Date date46 = new java.util.Date();
        int int47 = date46.getTimezoneOffset();
        int int48 = date46.getSeconds();
        boolean boolean49 = calendar41.after((java.lang.Object) date46);
        java.lang.String str50 = date46.toGMTString();
        calendar27.setTime(date46);
        int int52 = date46.getDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar27 and calendar41", (calendar27.compareTo(calendar41) == 0) == calendar27.equals(calendar41));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone1);
        java.util.TimeZone timeZone6 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str7 = timeZone6.getID();
        boolean boolean8 = timeZone1.hasSameRules(timeZone6);
        int int9 = timeZone6.getRawOffset();
        java.util.Locale locale10 = java.util.Locale.CHINA;
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
        java.util.Set<java.lang.Character> charSet29 = locale22.getExtensionKeys();
        java.lang.String str30 = locale10.getDisplayCountry(locale22);
        java.lang.String str31 = locale10.getLanguage();
        java.lang.String str32 = locale10.getLanguage();
        java.util.Calendar calendar33 = java.util.Calendar.getInstance(timeZone6, locale10);
        java.util.TimeZone.setDefault(timeZone6);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar28 and calendar33", (calendar28.compareTo(calendar33) == 0) == calendar28.equals(calendar33));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
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
        java.lang.String str40 = fastDateFormat9.getPattern();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar27 and calendar37", (calendar27.compareTo(calendar37) == 0) == calendar27.equals(calendar37));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone1);
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(timeZone1);
        timeZone1.setID("java.text.AttributedCharacterIterator$Attribute(input_method_segment)");
        java.util.Locale locale8 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar9 = java.util.Calendar.getInstance(timeZone1, locale8);
        java.util.Locale locale11 = new java.util.Locale("21 Feb 2022 14:46:12 GMT");
        java.lang.String str12 = locale11.getDisplayCountry();
        java.util.Locale.Category category13 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale14 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(category13, locale14);
        java.util.Locale locale16 = java.util.Locale.KOREA;
        java.lang.String str17 = locale16.getScript();
        java.util.Locale locale18 = java.util.Locale.FRANCE;
        java.lang.String str19 = locale16.getDisplayVariant(locale18);
        java.util.Locale.setDefault(category13, locale16);
        java.util.Locale locale21 = java.util.Locale.ROOT;
        java.util.Locale.Builder builder22 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder25 = builder22.setExtension('a', "France");
        java.util.Locale.Builder builder27 = builder22.removeUnicodeLocaleAttribute("GMT");
        java.util.Locale locale28 = java.util.Locale.FRANCE;
        java.lang.String str29 = locale28.getVariant();
        java.lang.String str30 = locale28.getDisplayCountry();
        java.util.Locale.Builder builder31 = builder22.setLocale(locale28);
        java.util.Locale locale33 = new java.util.Locale("zh");
        java.lang.String str34 = locale28.getDisplayName(locale33);
        java.lang.String str35 = locale21.getDisplayName(locale28);
        java.lang.String str36 = locale21.getDisplayScript();
        java.util.Locale locale37 = locale21.stripExtensions();
        java.util.Locale.setDefault(category13, locale21);
        java.util.Locale locale39 = java.util.Locale.CHINESE;
        java.lang.String str40 = locale39.getLanguage();
        boolean boolean41 = locale39.hasExtensions();
        java.lang.String str42 = locale39.getDisplayCountry();
        java.lang.String str43 = locale39.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet44 = locale39.getUnicodeLocaleKeys();
        java.lang.String str45 = locale39.getCountry();
        java.util.Locale.setDefault(category13, locale39);
        java.util.Locale locale47 = java.util.Locale.CHINA;
        boolean boolean48 = locale47.hasExtensions();
        java.lang.String str49 = locale47.getDisplayVariant();
        java.lang.String str50 = locale47.getCountry();
        java.lang.String str51 = locale39.getDisplayScript(locale47);
        java.lang.String str52 = locale11.getDisplayLanguage(locale39);
        java.util.Calendar calendar53 = java.util.Calendar.getInstance(timeZone1, locale39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar5 and calendar9", (calendar5.compareTo(calendar9) == 0) == calendar5.equals(calendar9));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
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
        java.util.Iterator<java.util.Locale> localeItor23 = localeList13.iterator();
        java.util.TimeZone timeZone24 = java.util.TimeZone.getDefault();
        int int26 = timeZone24.getOffset((long) 2);
        java.util.Locale locale30 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale31 = locale30.stripExtensions();
        java.util.Calendar calendar32 = java.util.Calendar.getInstance(timeZone24, locale31);
        int int33 = calendar32.getWeekYear();
        calendar32.setFirstDayOfWeek(100);
        boolean boolean36 = localeList13.equals((java.lang.Object) calendar32);
        java.util.Locale locale37 = java.util.Locale.US;
        java.util.Calendar calendar38 = java.util.Calendar.getInstance(locale37);
        java.lang.String str39 = locale37.getDisplayScript();
        java.util.Set<java.lang.String> strSet40 = locale37.getUnicodeLocaleKeys();
        boolean boolean41 = localeList13.removeAll((java.util.Collection<java.lang.String>) strSet40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar32 and calendar38", (calendar32.compareTo(calendar38) == 0) == calendar32.equals(calendar38));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.util.Locale locale2 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone1, locale2);
        timeZone1.setRawOffset(0);
        java.util.TimeZone timeZone6 = null;
        boolean boolean7 = timeZone1.hasSameRules(timeZone6);
        timeZone1.setRawOffset((int) (short) 0);
        java.util.Calendar calendar10 = java.util.Calendar.getInstance(timeZone1);
        java.time.ZoneId zoneId11 = timeZone1.toZoneId();
        java.util.TimeZone timeZone12 = java.util.TimeZone.getTimeZone(zoneId11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar3 and calendar10", (calendar3.compareTo(calendar10) == 0) == calendar3.equals(calendar10));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
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
        java.util.Calendar calendar16 = java.util.Calendar.getInstance(timeZone6);
        java.util.TimeZone timeZone20 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone20);
        java.lang.String str22 = fastDateFormat21.getPattern();
        java.text.ParsePosition parsePosition25 = new java.text.ParsePosition(16);
        parsePosition25.setIndex(11);
        java.lang.Object obj28 = fastDateFormat21.parseObject("FastDateFormat[]", parsePosition25);
        boolean boolean29 = fastDateFormat21.getTimeZoneOverridesCalendar();
        java.text.AttributedCharacterIterator attributedCharacterIterator31 = fastDateFormat21.formatToCharacterIterator((java.lang.Object) 1645454754924L);
        java.util.Locale locale32 = fastDateFormat21.getLocale();
        java.util.Map<java.lang.String, java.lang.Integer> strMap33 = calendar16.getDisplayNames(2, 0, locale32);
        int int34 = calendar16.getWeekYear();
        java.util.Date date35 = new java.util.Date();
        int int36 = date35.getTimezoneOffset();
        long long37 = date35.getTime();
        java.util.Date date38 = new java.util.Date();
        int int39 = date38.getSeconds();
        date38.setTime((long) 16);
        date38.setMinutes(12);
        int int44 = date38.getSeconds();
        boolean boolean45 = date35.after(date38);
        java.util.Date date46 = new java.util.Date();
        int int47 = date46.getSeconds();
        date46.setTime((long) 16);
        date46.setMinutes(12);
        int int52 = date46.getMinutes();
        java.util.Date date53 = new java.util.Date();
        int int54 = date53.getTimezoneOffset();
        date53.setMinutes(5);
        int int57 = date53.getMonth();
        boolean boolean58 = date46.before(date53);
        boolean boolean59 = date38.before(date46);
        java.util.TimeZone timeZone60 = java.util.TimeZone.getDefault();
        int int62 = timeZone60.getOffset((long) 2);
        java.util.Locale locale66 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale67 = locale66.stripExtensions();
        java.util.Calendar calendar68 = java.util.Calendar.getInstance(timeZone60, locale67);
        int int70 = calendar68.getLeastMaximum(4);
        int int72 = calendar68.getLeastMaximum((int) (byte) 0);
        java.util.Date date73 = new java.util.Date();
        int int74 = date73.getTimezoneOffset();
        int int75 = date73.getSeconds();
        boolean boolean76 = calendar68.after((java.lang.Object) date73);
        java.util.Date date77 = new java.util.Date();
        int int78 = date77.getSeconds();
        date77.setTime((long) 16);
        date77.setMinutes(12);
        int int83 = date77.getSeconds();
        date77.setMinutes(51);
        boolean boolean86 = date73.before(date77);
        boolean boolean87 = date46.after(date77);
        boolean boolean88 = calendar16.after((java.lang.Object) date77);
        date77.setMonth(120);
        date77.setMonth(2);
        date77.setTime(1645454914702L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar14 and calendar16", (calendar14.compareTo(calendar16) == 0) == calendar14.equals(calendar16));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        java.util.Locale locale1 = java.util.Locale.US;
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        java.util.TimeZone timeZone3 = calendar2.getTimeZone();
        java.util.Locale locale4 = java.util.Locale.US;
        java.lang.String str5 = locale4.getCountry();
        boolean boolean6 = locale4.hasExtensions();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, timeZone3, locale4);
        java.util.TimeZone timeZone8 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone9 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone10 = java.util.TimeZone.getDefault();
        boolean boolean11 = timeZone9.hasSameRules(timeZone10);
        boolean boolean12 = timeZone8.hasSameRules(timeZone9);
        boolean boolean13 = timeZone9.observesDaylightTime();
        java.util.TimeZone timeZone14 = java.util.TimeZone.getDefault();
        int int16 = timeZone14.getOffset((long) 2);
        java.util.Locale locale20 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale21 = locale20.stripExtensions();
        java.util.Calendar calendar22 = java.util.Calendar.getInstance(timeZone14, locale21);
        boolean boolean23 = timeZone9.hasSameRules(timeZone14);
        boolean boolean24 = timeZone3.hasSameRules(timeZone14);
        timeZone3.setRawOffset(38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar2 and calendar22", (calendar2.compareTo(calendar22) == 0) == calendar2.equals(calendar22));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
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
        java.util.Locale locale16 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(timeZone1, locale16);
        java.util.Calendar calendar18 = java.util.Calendar.getInstance(timeZone1);
        java.util.TimeZone timeZone20 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone21 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getDefault();
        boolean boolean23 = timeZone21.hasSameRules(timeZone22);
        boolean boolean24 = timeZone20.hasSameRules(timeZone21);
        int int25 = timeZone21.getRawOffset();
        java.util.TimeZone timeZone26 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone27 = java.util.TimeZone.getDefault();
        boolean boolean28 = timeZone26.hasSameRules(timeZone27);
        timeZone27.setID("Etc/UTC");
        boolean boolean31 = timeZone21.hasSameRules(timeZone27);
        java.time.ZoneId zoneId32 = timeZone27.toZoneId();
        java.util.TimeZone timeZone33 = java.util.TimeZone.getTimeZone(zoneId32);
        java.util.TimeZone timeZone35 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone35);
        java.lang.String str37 = fastDateFormat36.getPattern();
        java.text.ParsePosition parsePosition40 = new java.text.ParsePosition(16);
        parsePosition40.setIndex(11);
        java.lang.Object obj43 = fastDateFormat36.parseObject("FastDateFormat[]", parsePosition40);
        java.util.TimeZone timeZone44 = fastDateFormat36.getTimeZone();
        java.lang.String str45 = timeZone44.getID();
        java.util.Locale locale47 = new java.util.Locale("zh");
        java.lang.String str48 = locale47.getISO3Country();
        java.util.Calendar calendar49 = java.util.Calendar.getInstance(timeZone44, locale47);
        boolean boolean50 = timeZone33.hasSameRules(timeZone44);
        java.util.Locale.Builder builder51 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder54 = builder51.setExtension('a', "France");
        java.util.Locale.Builder builder56 = builder51.removeUnicodeLocaleAttribute("GMT");
        java.util.Locale locale57 = java.util.Locale.FRANCE;
        java.lang.String str58 = locale57.getVariant();
        java.lang.String str59 = locale57.getDisplayCountry();
        java.util.Locale.Builder builder60 = builder51.setLocale(locale57);
        java.util.Locale locale61 = builder60.build();
        java.util.Locale.Builder builder62 = builder60.clearExtensions();
        java.util.Locale locale64 = new java.util.Locale("zh");
        java.util.Locale locale65 = java.util.Locale.CHINESE;
        java.lang.String str66 = locale65.getLanguage();
        boolean boolean67 = locale65.hasExtensions();
        java.lang.String str68 = locale65.getDisplayCountry();
        java.lang.String str69 = locale64.getDisplayName(locale65);
        java.util.Locale.setDefault(locale64);
        java.lang.String str71 = locale64.getVariant();
        java.util.Locale.Builder builder72 = builder62.setLocale(locale64);
        java.util.Locale locale73 = builder72.build();
        java.util.Locale locale74 = builder72.build();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat75 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone44, locale74);
        boolean boolean76 = timeZone1.hasSameRules(timeZone44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar14 and calendar49", (calendar14.compareTo(calendar49) == 0) == calendar14.equals(calendar49));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("\uc624\ud6c4\uc2dc\ubd84\ucd08 GMT");
        java.util.TimeZone timeZone3 = java.util.TimeZone.getTimeZone("2:45:54 PM UTC");
        boolean boolean4 = timeZone1.hasSameRules(timeZone3);
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        java.util.Locale locale8 = java.util.Locale.GERMAN;
        java.util.Locale locale9 = java.util.Locale.FRANCE;
        boolean boolean10 = locale9.hasExtensions();
        java.util.Locale locale11 = java.util.Locale.FRANCE;
        java.util.Locale locale12 = java.util.Locale.CHINESE;
        java.lang.String str13 = locale12.getLanguage();
        java.util.Locale[] localeArray14 = new java.util.Locale[] { locale8, locale9, locale11, locale12 };
        java.util.ArrayList<java.util.Locale> localeList15 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList15, localeArray14);
        java.util.Locale.FilteringMode filteringMode17 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList18 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, (java.util.Collection<java.util.Locale>) localeList15, filteringMode17);
        java.util.Spliterator<java.util.Locale> localeSpliterator19 = localeList18.spliterator();
        java.util.Iterator<java.util.Locale> localeItor20 = localeList18.iterator();
        java.util.Set<java.lang.String> strSet21 = java.util.Calendar.getAvailableCalendarTypes();
        java.util.stream.Stream<java.lang.String> strStream22 = strSet21.parallelStream();
        boolean boolean23 = localeList18.removeAll((java.util.Collection<java.lang.String>) strSet21);
        java.util.TimeZone timeZone25 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone25);
        java.lang.String str27 = fastDateFormat26.toString();
        java.lang.Object obj28 = fastDateFormat26.clone();
        java.util.Locale locale29 = fastDateFormat26.getLocale();
        boolean boolean30 = locale29.hasExtensions();
        boolean boolean31 = localeList18.add(locale29);
        java.util.Calendar calendar32 = java.util.Calendar.getInstance(timeZone3, locale29);
        java.util.Locale locale35 = new java.util.Locale("Coordinated Universal Time", "h:mm:ss a z");
        java.util.Locale locale37 = java.util.Locale.forLanguageTag("2:46:18 PM UTC");
        java.lang.String str38 = locale37.getVariant();
        java.util.Locale locale39 = java.util.Locale.US;
        java.util.Locale locale40 = locale39.stripExtensions();
        java.util.Locale locale41 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet42 = locale41.getUnicodeLocaleKeys();
        java.lang.String str43 = locale40.getDisplayVariant(locale41);
        java.lang.String str44 = locale37.getDisplayVariant(locale41);
        java.lang.String str45 = locale35.getDisplayLanguage(locale41);
        java.util.Calendar calendar46 = java.util.Calendar.getInstance(timeZone3, locale41);
        java.time.ZoneId zoneId47 = timeZone3.toZoneId();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar32 and calendar46", (calendar32.compareTo(calendar46) == 0) == calendar32.equals(calendar46));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        java.util.Locale locale0 = java.util.Locale.US;
        java.lang.String str1 = locale0.getDisplayVariant();
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        boolean boolean3 = locale2.hasExtensions();
        java.util.Locale locale4 = java.util.Locale.ROOT;
        java.lang.String str5 = locale2.getDisplayName(locale4);
        java.lang.String str6 = locale4.getCountry();
        java.lang.String str7 = locale0.getDisplayVariant(locale4);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale4);
        java.util.TimeZone timeZone9 = calendar8.getTimeZone();
        java.lang.String str10 = timeZone9.getID();
        java.util.Locale locale11 = java.util.Locale.GERMANY;
        java.util.Calendar calendar12 = java.util.Calendar.getInstance(timeZone9, locale11);
        java.util.Calendar calendar13 = java.util.Calendar.getInstance(timeZone9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar8 and calendar12", (calendar8.compareTo(calendar12) == 0) == calendar8.equals(calendar12));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        java.util.Locale locale7 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale8 = locale7.stripExtensions();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone1, locale7);
        java.lang.Object obj10 = fastDateFormat9.clone();
        java.util.TimeZone timeZone12 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str13 = timeZone12.getID();
        java.util.TimeZone.setDefault(timeZone12);
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone12);
        int int16 = calendar15.getFirstDayOfWeek();
        java.util.TimeZone timeZone17 = java.util.TimeZone.getDefault();
        int int19 = timeZone17.getOffset((long) 2);
        java.util.Locale locale23 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale24 = locale23.stripExtensions();
        java.util.Calendar calendar25 = java.util.Calendar.getInstance(timeZone17, locale24);
        calendar15.setTimeZone(timeZone17);
        java.lang.String str27 = timeZone17.getID();
        java.util.Calendar calendar28 = java.util.Calendar.getInstance(timeZone17);
        java.lang.String str29 = fastDateFormat9.format(calendar28);
        java.lang.StringBuffer stringBuffer31 = null;
        java.lang.StringBuffer stringBuffer32 = fastDateFormat9.format((long) 21, stringBuffer31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar15 and calendar25", (calendar15.compareTo(calendar25) == 0) == calendar15.equals(calendar25));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
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
        java.lang.String str36 = fastDateFormat2.format((long) 70);
        int int37 = fastDateFormat2.getMaxLengthEstimate();
        java.util.TimeZone timeZone38 = java.util.TimeZone.getDefault();
        int int40 = timeZone38.getOffset((long) 2);
        java.util.Locale locale44 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale45 = locale44.stripExtensions();
        java.util.Calendar calendar46 = java.util.Calendar.getInstance(timeZone38, locale45);
        int int48 = calendar46.getLeastMaximum(4);
        calendar46.setFirstDayOfWeek((-1));
        calendar46.setMinimalDaysInFirstWeek((int) (short) -1);
        java.lang.String str53 = fastDateFormat2.format(calendar46);
        java.lang.String str54 = fastDateFormat2.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar13 and calendar46", (calendar13.compareTo(calendar46) == 0) == calendar13.equals(calendar46));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale6 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale7 = locale6.stripExtensions();
        java.lang.String str8 = locale6.getLanguage();
        java.util.Locale.setDefault(category0, locale6);
        java.util.TimeZone timeZone10 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone11 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone12 = java.util.TimeZone.getDefault();
        boolean boolean13 = timeZone11.hasSameRules(timeZone12);
        boolean boolean14 = timeZone10.hasSameRules(timeZone11);
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone11);
        timeZone11.setRawOffset(50);
        java.util.Locale locale19 = new java.util.Locale("2:45:52 PM UTC");
        java.util.Locale locale21 = new java.util.Locale("zh");
        java.lang.String str22 = locale19.getDisplayScript(locale21);
        java.util.TimeZone timeZone24 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone24);
        java.lang.String str26 = fastDateFormat25.getPattern();
        java.text.ParsePosition parsePosition29 = new java.text.ParsePosition(16);
        parsePosition29.setIndex(11);
        java.lang.Object obj32 = fastDateFormat25.parseObject("FastDateFormat[]", parsePosition29);
        java.util.TimeZone timeZone33 = fastDateFormat25.getTimeZone();
        java.lang.String str34 = timeZone33.getID();
        java.util.Locale locale36 = new java.util.Locale("zh");
        java.lang.String str37 = locale36.getISO3Country();
        java.util.Calendar calendar38 = java.util.Calendar.getInstance(timeZone33, locale36);
        java.lang.String str39 = locale19.getDisplayName(locale36);
        java.lang.String str40 = locale19.getISO3Country();
        java.lang.String str42 = locale19.getExtension('x');
        java.util.Calendar calendar43 = java.util.Calendar.getInstance(timeZone11, locale19);
        calendar43.set((int) (byte) 1, (int) 'x', 0, 46, 40, 57);
        boolean boolean51 = locale6.equals((java.lang.Object) 'x');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar15 and calendar38", (calendar15.compareTo(calendar38) == 0) == calendar15.equals(calendar38));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
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
        java.util.Calendar calendar16 = java.util.Calendar.getInstance(timeZone6);
        java.util.TimeZone timeZone20 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone20);
        java.lang.String str22 = fastDateFormat21.getPattern();
        java.text.ParsePosition parsePosition25 = new java.text.ParsePosition(16);
        parsePosition25.setIndex(11);
        java.lang.Object obj28 = fastDateFormat21.parseObject("FastDateFormat[]", parsePosition25);
        boolean boolean29 = fastDateFormat21.getTimeZoneOverridesCalendar();
        java.text.AttributedCharacterIterator attributedCharacterIterator31 = fastDateFormat21.formatToCharacterIterator((java.lang.Object) 1645454754924L);
        java.util.Locale locale32 = fastDateFormat21.getLocale();
        java.util.Map<java.lang.String, java.lang.Integer> strMap33 = calendar16.getDisplayNames(2, 0, locale32);
        long long34 = calendar16.getTimeInMillis();
        java.util.TimeZone timeZone35 = java.util.TimeZone.getDefault();
        int int37 = timeZone35.getOffset((long) 2);
        java.util.Locale locale41 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale42 = locale41.stripExtensions();
        java.util.Calendar calendar43 = java.util.Calendar.getInstance(timeZone35, locale42);
        int int45 = calendar43.getLeastMaximum(4);
        int int47 = calendar43.getLeastMaximum((int) (byte) 0);
        java.util.Date date48 = new java.util.Date();
        int int49 = date48.getTimezoneOffset();
        int int50 = date48.getSeconds();
        boolean boolean51 = calendar43.after((java.lang.Object) date48);
        java.util.Date date52 = new java.util.Date();
        int int53 = date52.getSeconds();
        date52.setTime((long) 16);
        date52.setMinutes(12);
        int int58 = date52.getSeconds();
        date52.setMinutes(51);
        boolean boolean61 = date48.before(date52);
        calendar16.setTime(date48);
        date48.setDate(120);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar14 and calendar16", (calendar14.compareTo(calendar16) == 0) == calendar14.equals(calendar16));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 2);
        java.util.Locale locale6 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale7 = locale6.stripExtensions();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone0, locale7);
        calendar8.set(122, 52, (int) (byte) 1);
        int int13 = calendar8.getWeeksInWeekYear();
        boolean boolean14 = calendar8.isWeekDateSupported();
        calendar8.setFirstDayOfWeek(1);
        int int17 = calendar8.getWeekYear();
        int int18 = calendar8.getMinimalDaysInFirstWeek();
        long long19 = calendar8.getTimeInMillis();
        calendar8.set(17, (int) (byte) 10, (int) 'a', 21, 292269054);
        java.util.TimeZone timeZone27 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone28 = java.util.TimeZone.getDefault();
        boolean boolean29 = timeZone27.hasSameRules(timeZone28);
        java.util.Locale locale33 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale34 = locale33.stripExtensions();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone27, locale33);
        java.util.TimeZone timeZone36 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone37 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone38 = java.util.TimeZone.getDefault();
        boolean boolean39 = timeZone37.hasSameRules(timeZone38);
        boolean boolean40 = timeZone36.hasSameRules(timeZone37);
        boolean boolean41 = timeZone37.observesDaylightTime();
        timeZone37.setRawOffset(52);
        timeZone37.setID("Temps universel coordonn\351");
        java.util.Locale locale47 = new java.util.Locale("zh");
        java.util.Locale locale48 = java.util.Locale.CHINESE;
        java.lang.String str49 = locale48.getLanguage();
        boolean boolean50 = locale48.hasExtensions();
        java.lang.String str51 = locale48.getDisplayCountry();
        java.lang.String str52 = locale47.getDisplayName(locale48);
        java.util.Calendar calendar53 = java.util.Calendar.getInstance(timeZone37, locale47);
        java.lang.String str54 = fastDateFormat35.format(calendar53);
        java.util.TimeZone timeZone55 = java.util.TimeZone.getDefault();
        int int57 = timeZone55.getOffset((long) 2);
        java.util.Locale locale61 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale62 = locale61.stripExtensions();
        java.util.Calendar calendar63 = java.util.Calendar.getInstance(timeZone55, locale62);
        java.lang.StringBuffer stringBuffer64 = null;
        java.lang.StringBuffer stringBuffer65 = fastDateFormat35.format(calendar63, stringBuffer64);
        java.util.TimeZone timeZone66 = calendar63.getTimeZone();
        calendar8.setTimeZone(timeZone66);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar53 and calendar63", (calendar53.compareTo(calendar63) == 0) == calendar53.equals(calendar63));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(timeZone1);
        java.util.TimeZone timeZone4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone4);
        java.lang.String str7 = fastDateFormat5.format((long) '#');
        boolean boolean8 = fastDateFormat5.getTimeZoneOverridesCalendar();
        java.lang.String str10 = fastDateFormat5.format(100L);
        java.lang.String str12 = fastDateFormat5.format((long) 8);
        java.util.Locale locale13 = fastDateFormat5.getLocale();
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone1, locale13);
        java.lang.String str15 = locale13.getLanguage();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar2 and calendar14", (calendar2.compareTo(calendar14) == 0) == calendar2.equals(calendar14));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
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
        java.time.ZoneId zoneId13 = timeZone8.toZoneId();
        java.util.TimeZone timeZone14 = java.util.TimeZone.getTimeZone(zoneId13);
        java.util.TimeZone timeZone15 = java.util.TimeZone.getTimeZone(zoneId13);
        java.util.TimeZone timeZone16 = java.util.TimeZone.getTimeZone(zoneId13);
        timeZone16.setID("java.util.GregorianCalendar[time=1645454780717,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=20,MILLISECOND=717,ZONE_OFFSET=0,DST_OFFSET=0]");
        java.util.Locale locale21 = new java.util.Locale("Coordinated Universal Time", "h:mm:ss a z");
        java.util.Locale locale23 = java.util.Locale.forLanguageTag("2:46:18 PM UTC");
        java.lang.String str24 = locale23.getVariant();
        java.util.Locale locale25 = java.util.Locale.US;
        java.util.Locale locale26 = locale25.stripExtensions();
        java.util.Locale locale27 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet28 = locale27.getUnicodeLocaleKeys();
        java.lang.String str29 = locale26.getDisplayVariant(locale27);
        java.lang.String str30 = locale23.getDisplayVariant(locale27);
        java.lang.String str31 = locale21.getDisplayLanguage(locale27);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone16, locale27);
        java.util.TimeZone timeZone33 = fastDateFormat32.getTimeZone();
        java.util.Locale locale34 = java.util.Locale.US;
        java.lang.String str35 = locale34.getDisplayVariant();
        java.util.Locale locale36 = java.util.Locale.FRANCE;
        boolean boolean37 = locale36.hasExtensions();
        java.util.Locale locale38 = java.util.Locale.ROOT;
        java.lang.String str39 = locale36.getDisplayName(locale38);
        java.lang.String str40 = locale38.getCountry();
        java.lang.String str41 = locale34.getDisplayVariant(locale38);
        java.util.Calendar calendar42 = java.util.Calendar.getInstance(locale38);
        java.util.TimeZone timeZone43 = calendar42.getTimeZone();
        java.lang.String str44 = timeZone43.getID();
        java.util.Locale locale45 = java.util.Locale.GERMANY;
        java.util.Calendar calendar46 = java.util.Calendar.getInstance(timeZone43, locale45);
        java.lang.String str47 = timeZone33.getDisplayName(locale45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar42 and calendar46", (calendar42.compareTo(calendar46) == 0) == calendar42.equals(calendar46));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
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
        java.util.Calendar calendar16 = java.util.Calendar.getInstance(timeZone6);
        int int18 = timeZone6.getOffset(1645454837962L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar14 and calendar16", (calendar14.compareTo(calendar16) == 0) == calendar14.equals(calendar16));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
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
        java.lang.String str36 = fastDateFormat2.format((long) 70);
        java.util.TimeZone timeZone38 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str39 = timeZone38.getID();
        java.util.TimeZone.setDefault(timeZone38);
        java.util.Calendar calendar41 = java.util.Calendar.getInstance(timeZone38);
        int int42 = calendar41.getFirstDayOfWeek();
        java.util.TimeZone timeZone43 = java.util.TimeZone.getDefault();
        int int45 = timeZone43.getOffset((long) 2);
        java.util.Locale locale49 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale50 = locale49.stripExtensions();
        java.util.Calendar calendar51 = java.util.Calendar.getInstance(timeZone43, locale50);
        calendar41.setTimeZone(timeZone43);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList54 = java.util.Locale.LanguageRange.parse("zho");
        java.util.Set<java.lang.String> strSet55 = java.util.Calendar.getAvailableCalendarTypes();
        java.util.stream.Stream<java.lang.String> strStream56 = strSet55.parallelStream();
        java.lang.String str57 = java.util.Locale.lookupTag(languageRangeList54, (java.util.Collection<java.lang.String>) strSet55);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList59 = java.util.Locale.LanguageRange.parse("zho");
        java.util.Set<java.lang.String> strSet60 = java.util.Calendar.getAvailableCalendarTypes();
        java.util.stream.Stream<java.lang.String> strStream61 = strSet60.parallelStream();
        java.lang.String str62 = java.util.Locale.lookupTag(languageRangeList59, (java.util.Collection<java.lang.String>) strSet60);
        java.util.stream.Stream<java.lang.String> strStream63 = strSet60.stream();
        java.util.List<java.lang.String> strList64 = java.util.Locale.filterTags(languageRangeList54, (java.util.Collection<java.lang.String>) strSet60);
        java.util.stream.Stream<java.lang.String> strStream65 = strSet60.stream();
        boolean boolean66 = calendar41.before((java.lang.Object) strStream65);
        calendar41.setLenient(false);
        java.lang.String str69 = fastDateFormat2.format(calendar41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar13 and calendar51", (calendar13.compareTo(calendar51) == 0) == calendar13.equals(calendar51));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
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
        java.util.TimeZone timeZone35 = java.util.TimeZone.getDefault();
        int int37 = timeZone35.getOffset((long) 2);
        java.util.Locale locale41 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale42 = locale41.stripExtensions();
        java.util.Calendar calendar43 = java.util.Calendar.getInstance(timeZone35, locale42);
        calendar43.set(122, 52, (int) (byte) 1);
        calendar43.setMinimalDaysInFirstWeek(8);
        java.util.Date date55 = new java.util.Date(3, 16, 11, 8, 51);
        calendar43.setTime(date55);
        java.lang.String str57 = fastDateFormat2.format(calendar43);
        java.util.Date date58 = new java.util.Date();
        int int59 = date58.getSeconds();
        long long60 = date58.getTime();
        date58.setTime((long) (byte) 0);
        boolean boolean63 = calendar43.after((java.lang.Object) date58);
        java.util.TimeZone timeZone66 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str67 = timeZone66.getID();
        java.util.TimeZone.setDefault(timeZone66);
        java.util.Calendar calendar69 = java.util.Calendar.getInstance(timeZone66);
        int int70 = calendar69.getFirstDayOfWeek();
        java.util.TimeZone timeZone71 = java.util.TimeZone.getDefault();
        int int73 = timeZone71.getOffset((long) 2);
        java.util.Locale locale77 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale78 = locale77.stripExtensions();
        java.util.Calendar calendar79 = java.util.Calendar.getInstance(timeZone71, locale78);
        calendar69.setTimeZone(timeZone71);
        java.lang.String str81 = timeZone71.getID();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat82 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, timeZone71);
        calendar43.setTimeZone(timeZone71);
        int int84 = timeZone71.getDSTSavings();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar13 and calendar69", (calendar13.compareTo(calendar69) == 0) == calendar13.equals(calendar69));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone1);
        boolean boolean5 = timeZone1.observesDaylightTime();
        timeZone1.setRawOffset(52);
        java.lang.String str8 = timeZone1.getID();
        java.util.TimeZone timeZone9 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone10 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone11 = java.util.TimeZone.getDefault();
        boolean boolean12 = timeZone10.hasSameRules(timeZone11);
        boolean boolean13 = timeZone9.hasSameRules(timeZone10);
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone10);
        timeZone10.setID("java.text.AttributedCharacterIterator$Attribute(input_method_segment)");
        java.util.Locale locale17 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar18 = java.util.Calendar.getInstance(timeZone10, locale17);
        java.util.TimeZone.setDefault(timeZone10);
        java.util.TimeZone.setDefault(timeZone10);
        java.util.Calendar calendar21 = java.util.Calendar.getInstance(timeZone10);
        boolean boolean22 = timeZone1.hasSameRules(timeZone10);
        timeZone1.setRawOffset(39);
        timeZone1.setID("21 Feb 2022 14:47:34 GMT");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar14 and calendar18", (calendar14.compareTo(calendar18) == 0) == calendar14.equals(calendar18));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "France");
        java.util.Locale.Builder builder5 = builder0.removeUnicodeLocaleAttribute("GMT");
        java.util.Locale locale6 = builder0.build();
        java.util.Locale.Builder builder7 = builder0.clearExtensions();
        java.util.Calendar.Builder builder8 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder12 = builder8.setTimeOfDay(16, (int) ' ', 16);
        java.util.Locale.Builder builder13 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder16 = builder13.setExtension('a', "France");
        java.util.Locale.Builder builder18 = builder13.removeUnicodeLocaleAttribute("GMT");
        java.util.Locale locale19 = java.util.Locale.FRANCE;
        java.lang.String str20 = locale19.getVariant();
        java.lang.String str21 = locale19.getDisplayCountry();
        java.util.Locale.Builder builder22 = builder13.setLocale(locale19);
        java.util.Locale locale24 = new java.util.Locale("zh");
        java.lang.String str25 = locale19.getDisplayName(locale24);
        java.util.Calendar.Builder builder26 = builder8.setLocale(locale19);
        java.util.Calendar.Builder builder30 = builder8.setTimeOfDay((int) (byte) 1, 8, 120);
        java.util.TimeZone timeZone31 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone32 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone33 = java.util.TimeZone.getDefault();
        boolean boolean34 = timeZone32.hasSameRules(timeZone33);
        boolean boolean35 = timeZone31.hasSameRules(timeZone32);
        java.lang.String str36 = timeZone32.getID();
        java.lang.String str37 = timeZone32.getID();
        int int38 = timeZone32.getRawOffset();
        java.util.Calendar calendar39 = java.util.Calendar.getInstance(timeZone32);
        int int40 = timeZone32.getRawOffset();
        java.util.Calendar.Builder builder41 = builder30.setTimeZone(timeZone32);
        boolean boolean42 = timeZone32.observesDaylightTime();
        java.util.Locale locale44 = java.util.Locale.forLanguageTag("");
        java.lang.String str45 = locale44.getScript();
        java.lang.String str47 = locale44.getExtension('a');
        java.util.Calendar calendar48 = java.util.Calendar.getInstance(timeZone32, locale44);
        java.util.Locale.Builder builder49 = builder7.setLocale(locale44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar39 and calendar48", (calendar39.compareTo(calendar48) == 0) == calendar39.equals(calendar48));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "France");
        java.util.Locale.Builder builder5 = builder0.removeUnicodeLocaleAttribute("GMT");
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.lang.String str7 = locale6.getVariant();
        java.lang.String str8 = locale6.getDisplayCountry();
        java.util.Locale.Builder builder9 = builder0.setLocale(locale6);
        java.util.Locale.Builder builder10 = builder0.clearExtensions();
        java.util.Locale locale11 = java.util.Locale.FRANCE;
        java.lang.String str12 = locale11.getVariant();
        java.lang.String str13 = locale11.getDisplayCountry();
        java.util.Locale.Builder builder14 = builder10.setLocale(locale11);
        java.util.Locale.Builder builder15 = builder10.clearExtensions();
        java.util.Locale locale17 = java.util.Locale.forLanguageTag("");
        java.lang.String str18 = locale17.getScript();
        java.util.Locale.Builder builder19 = builder10.setLocale(locale17);
        java.util.Locale.Builder builder20 = builder10.clearExtensions();
        java.util.Locale locale21 = java.util.Locale.CHINA;
        java.lang.String str22 = locale21.getDisplayVariant();
        java.util.Locale.Builder builder23 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder26 = builder23.setExtension('a', "France");
        java.util.Locale locale28 = java.util.Locale.forLanguageTag("h:mm:ss a z");
        java.util.Locale.Builder builder29 = builder26.setLocale(locale28);
        java.util.Locale locale30 = locale28.stripExtensions();
        java.lang.String str31 = locale21.getDisplayCountry(locale30);
        java.util.Calendar calendar32 = java.util.Calendar.getInstance(locale30);
        java.util.Locale.Builder builder33 = builder20.setLocale(locale30);
        java.util.TimeZone timeZone34 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone35 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone36 = java.util.TimeZone.getDefault();
        boolean boolean37 = timeZone35.hasSameRules(timeZone36);
        boolean boolean38 = timeZone34.hasSameRules(timeZone35);
        boolean boolean39 = timeZone35.observesDaylightTime();
        timeZone35.setRawOffset(52);
        timeZone35.setID("Temps universel coordonn\351");
        java.util.Locale locale45 = new java.util.Locale("zh");
        java.util.Locale locale46 = java.util.Locale.CHINESE;
        java.lang.String str47 = locale46.getLanguage();
        boolean boolean48 = locale46.hasExtensions();
        java.lang.String str49 = locale46.getDisplayCountry();
        java.lang.String str50 = locale45.getDisplayName(locale46);
        java.util.Calendar calendar51 = java.util.Calendar.getInstance(timeZone35, locale45);
        java.lang.String str52 = locale45.getLanguage();
        java.lang.String str53 = locale45.getDisplayScript();
        java.util.Locale locale54 = java.util.Locale.CHINA;
        java.util.TimeZone timeZone55 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone56 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone57 = java.util.TimeZone.getDefault();
        boolean boolean58 = timeZone56.hasSameRules(timeZone57);
        boolean boolean59 = timeZone55.hasSameRules(timeZone56);
        boolean boolean60 = timeZone56.observesDaylightTime();
        timeZone56.setRawOffset(52);
        timeZone56.setID("Temps universel coordonn\351");
        java.util.Locale locale66 = new java.util.Locale("zh");
        java.util.Locale locale67 = java.util.Locale.CHINESE;
        java.lang.String str68 = locale67.getLanguage();
        boolean boolean69 = locale67.hasExtensions();
        java.lang.String str70 = locale67.getDisplayCountry();
        java.lang.String str71 = locale66.getDisplayName(locale67);
        java.util.Calendar calendar72 = java.util.Calendar.getInstance(timeZone56, locale66);
        java.util.Set<java.lang.Character> charSet73 = locale66.getExtensionKeys();
        java.lang.String str74 = locale54.getDisplayCountry(locale66);
        java.lang.String str75 = locale54.getLanguage();
        java.lang.String str76 = locale45.getDisplayVariant(locale54);
        java.lang.String str77 = locale30.getDisplayLanguage(locale54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar32 and calendar51", (calendar32.compareTo(calendar51) == 0) == calendar32.equals(calendar51));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        java.util.Locale locale7 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale8 = locale7.stripExtensions();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone1, locale7);
        java.lang.Object obj10 = fastDateFormat9.clone();
        java.util.TimeZone timeZone12 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str13 = timeZone12.getID();
        java.util.TimeZone.setDefault(timeZone12);
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone12);
        int int16 = calendar15.getFirstDayOfWeek();
        java.util.TimeZone timeZone17 = java.util.TimeZone.getDefault();
        int int19 = timeZone17.getOffset((long) 2);
        java.util.Locale locale23 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale24 = locale23.stripExtensions();
        java.util.Calendar calendar25 = java.util.Calendar.getInstance(timeZone17, locale24);
        calendar15.setTimeZone(timeZone17);
        java.lang.String str27 = timeZone17.getID();
        java.util.Calendar calendar28 = java.util.Calendar.getInstance(timeZone17);
        java.lang.String str29 = fastDateFormat9.format(calendar28);
        calendar28.roll(9, (int) (byte) -1);
        boolean boolean34 = calendar28.equals((java.lang.Object) "21 Feb 2022 14:48:44 GMT");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar15 and calendar25", (calendar15.compareTo(calendar25) == 0) == calendar15.equals(calendar25));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str3 = timeZone2.getID();
        java.util.TimeZone.setDefault(timeZone2);
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(timeZone2);
        int int6 = calendar5.getFirstDayOfWeek();
        java.util.TimeZone timeZone7 = java.util.TimeZone.getDefault();
        int int9 = timeZone7.getOffset((long) 2);
        java.util.Locale locale13 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale14 = locale13.stripExtensions();
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone7, locale14);
        calendar5.setTimeZone(timeZone7);
        java.lang.String str17 = timeZone7.getID();
        java.util.Calendar calendar18 = java.util.Calendar.getInstance(timeZone7);
        java.util.TimeZone timeZone19 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone20 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone21 = java.util.TimeZone.getDefault();
        boolean boolean22 = timeZone20.hasSameRules(timeZone21);
        boolean boolean23 = timeZone19.hasSameRules(timeZone20);
        timeZone20.setID("Mon Feb 21 14:45:50 GMT 2022");
        boolean boolean26 = timeZone7.hasSameRules(timeZone20);
        java.util.TimeZone.setDefault(timeZone20);
        java.util.Locale.Builder builder28 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder31 = builder28.setExtension('a', "France");
        java.util.Locale locale33 = java.util.Locale.forLanguageTag("h:mm:ss a z");
        java.util.Locale.Builder builder34 = builder31.setLocale(locale33);
        java.util.Locale.Category category35 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale36 = java.util.Locale.TAIWAN;
        java.util.Locale locale37 = locale36.stripExtensions();
        java.util.Locale.setDefault(category35, locale36);
        java.lang.String str39 = locale36.getDisplayCountry();
        java.lang.String str40 = locale33.getDisplayLanguage(locale36);
        java.util.TimeZone timeZone42 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone43 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone44 = java.util.TimeZone.getDefault();
        boolean boolean45 = timeZone43.hasSameRules(timeZone44);
        boolean boolean46 = timeZone42.hasSameRules(timeZone43);
        java.util.TimeZone timeZone48 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str49 = timeZone48.getID();
        boolean boolean50 = timeZone43.hasSameRules(timeZone48);
        java.util.Locale locale51 = java.util.Locale.FRANCE;
        boolean boolean52 = locale51.hasExtensions();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat53 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone48, locale51);
        java.lang.String str54 = locale33.getDisplayVariant(locale51);
        java.lang.String str55 = locale33.getDisplayName();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat56 = org.apache.commons.lang3.time.FastDateFormat.getInstance("\u4e0a\u5348 12:12:00", timeZone20, locale33);
        java.lang.String str58 = fastDateFormat56.format(1645454813077L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar5 and calendar15", (calendar5.compareTo(calendar15) == 0) == calendar5.equals(calendar15));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
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
        java.util.Locale locale17 = fastDateFormat2.getLocale();
        java.util.TimeZone timeZone19 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str20 = timeZone19.getID();
        java.util.TimeZone.setDefault(timeZone19);
        java.util.Calendar calendar22 = java.util.Calendar.getInstance(timeZone19);
        int int23 = calendar22.getFirstDayOfWeek();
        java.util.TimeZone timeZone24 = java.util.TimeZone.getDefault();
        int int26 = timeZone24.getOffset((long) 2);
        java.util.Locale locale30 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale31 = locale30.stripExtensions();
        java.util.Calendar calendar32 = java.util.Calendar.getInstance(timeZone24, locale31);
        calendar22.setTimeZone(timeZone24);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList35 = java.util.Locale.LanguageRange.parse("zho");
        java.util.Set<java.lang.String> strSet36 = java.util.Calendar.getAvailableCalendarTypes();
        java.util.stream.Stream<java.lang.String> strStream37 = strSet36.parallelStream();
        java.lang.String str38 = java.util.Locale.lookupTag(languageRangeList35, (java.util.Collection<java.lang.String>) strSet36);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList40 = java.util.Locale.LanguageRange.parse("zho");
        java.util.Set<java.lang.String> strSet41 = java.util.Calendar.getAvailableCalendarTypes();
        java.util.stream.Stream<java.lang.String> strStream42 = strSet41.parallelStream();
        java.lang.String str43 = java.util.Locale.lookupTag(languageRangeList40, (java.util.Collection<java.lang.String>) strSet41);
        java.util.stream.Stream<java.lang.String> strStream44 = strSet41.stream();
        java.util.List<java.lang.String> strList45 = java.util.Locale.filterTags(languageRangeList35, (java.util.Collection<java.lang.String>) strSet41);
        java.util.stream.Stream<java.lang.String> strStream46 = strSet41.stream();
        boolean boolean47 = calendar22.before((java.lang.Object) strStream46);
        java.lang.StringBuffer stringBuffer48 = null;
        java.lang.StringBuffer stringBuffer49 = fastDateFormat2.format(calendar22, stringBuffer48);
        long long50 = calendar22.getTimeInMillis();
        int int51 = calendar22.getWeekYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar15 and calendar32", (calendar15.compareTo(calendar32) == 0) == calendar15.equals(calendar32));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setWeekDate(5, (int) (byte) -1, 1);
        java.util.Calendar.Builder builder6 = builder4.setLenient(true);
        java.util.Calendar.Builder builder10 = builder6.setTimeOfDay(122, 11, 10);
        java.util.Calendar.Builder builder14 = builder10.setWeekDate(100, 9, 2);
        java.util.Calendar.Builder builder18 = builder14.setTimeOfDay(52, (int) (short) 10, (-1));
        java.util.Calendar.Builder builder20 = builder18.setLenient(true);
        java.util.Calendar.Builder builder23 = builder18.set(2, 54);
        java.util.TimeZone timeZone25 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone26 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone27 = java.util.TimeZone.getDefault();
        boolean boolean28 = timeZone26.hasSameRules(timeZone27);
        boolean boolean29 = timeZone25.hasSameRules(timeZone26);
        java.util.TimeZone timeZone31 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str32 = timeZone31.getID();
        boolean boolean33 = timeZone26.hasSameRules(timeZone31);
        java.util.Locale locale34 = java.util.Locale.FRANCE;
        boolean boolean35 = locale34.hasExtensions();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone31, locale34);
        java.util.Calendar.Builder builder37 = builder18.setTimeZone(timeZone31);
        java.util.TimeZone timeZone39 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str40 = timeZone39.getID();
        java.util.TimeZone.setDefault(timeZone39);
        java.util.Calendar calendar42 = java.util.Calendar.getInstance(timeZone39);
        int int43 = calendar42.getFirstDayOfWeek();
        java.util.TimeZone timeZone44 = java.util.TimeZone.getDefault();
        int int46 = timeZone44.getOffset((long) 2);
        java.util.Locale locale50 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale51 = locale50.stripExtensions();
        java.util.Calendar calendar52 = java.util.Calendar.getInstance(timeZone44, locale51);
        calendar42.setTimeZone(timeZone44);
        java.lang.String str54 = timeZone44.getID();
        java.util.Calendar calendar55 = java.util.Calendar.getInstance(timeZone44);
        java.util.TimeZone timeZone56 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone57 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone58 = java.util.TimeZone.getDefault();
        boolean boolean59 = timeZone57.hasSameRules(timeZone58);
        boolean boolean60 = timeZone56.hasSameRules(timeZone57);
        timeZone57.setID("Mon Feb 21 14:45:50 GMT 2022");
        boolean boolean63 = timeZone44.hasSameRules(timeZone57);
        boolean boolean64 = timeZone31.hasSameRules(timeZone44);
        java.util.Locale.Builder builder65 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder68 = builder65.setExtension('a', "France");
        java.util.Locale.Builder builder70 = builder65.removeUnicodeLocaleAttribute("GMT");
        java.util.Locale locale71 = java.util.Locale.FRANCE;
        java.lang.String str72 = locale71.getVariant();
        java.lang.String str73 = locale71.getDisplayCountry();
        java.util.Locale.Builder builder74 = builder65.setLocale(locale71);
        java.util.Locale locale76 = new java.util.Locale("zh");
        java.lang.String str77 = locale71.getDisplayName(locale76);
        java.lang.String str78 = locale71.getCountry();
        java.lang.String str79 = locale71.getISO3Language();
        java.util.Calendar calendar80 = java.util.Calendar.getInstance(timeZone31, locale71);
        java.util.Locale locale82 = new java.util.Locale("2:45:52 PM UTC");
        java.util.Locale locale84 = new java.util.Locale("zh");
        java.lang.String str85 = locale82.getDisplayScript(locale84);
        java.lang.String str86 = locale71.getDisplayScript(locale82);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar42 and calendar52", (calendar42.compareTo(calendar52) == 0) == calendar42.equals(calendar52));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
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
        java.lang.String str36 = fastDateFormat2.format((long) 70);
        int int37 = fastDateFormat2.getMaxLengthEstimate();
        java.util.TimeZone timeZone38 = java.util.TimeZone.getDefault();
        int int40 = timeZone38.getOffset((long) 2);
        java.util.Locale locale44 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale45 = locale44.stripExtensions();
        java.util.Calendar calendar46 = java.util.Calendar.getInstance(timeZone38, locale45);
        int int48 = calendar46.getLeastMaximum(4);
        calendar46.setFirstDayOfWeek((-1));
        calendar46.setMinimalDaysInFirstWeek((int) (short) -1);
        java.lang.String str53 = fastDateFormat2.format(calendar46);
        java.lang.String str54 = fastDateFormat2.getPattern();
        java.util.TimeZone timeZone55 = java.util.TimeZone.getDefault();
        int int57 = timeZone55.getOffset((long) 2);
        java.util.Locale locale61 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale62 = locale61.stripExtensions();
        java.util.Calendar calendar63 = java.util.Calendar.getInstance(timeZone55, locale62);
        calendar63.set(122, 52, (int) (byte) 1);
        java.lang.String str68 = calendar63.getCalendarType();
        int int69 = calendar63.getWeekYear();
        calendar63.clear();
        int int71 = calendar63.getMinimalDaysInFirstWeek();
        calendar63.setFirstDayOfWeek(3);
        calendar63.set((int) 'x', 53, 122, (int) (byte) -1, 122);
        calendar63.set(31, 0, 1);
        java.lang.String str84 = fastDateFormat2.format(calendar63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar13 and calendar46", (calendar13.compareTo(calendar46) == 0) == calendar13.equals(calendar46));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(timeZone1);
        java.util.TimeZone timeZone4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone4);
        java.lang.String str7 = fastDateFormat5.format((long) '#');
        boolean boolean8 = fastDateFormat5.getTimeZoneOverridesCalendar();
        java.lang.String str10 = fastDateFormat5.format(100L);
        java.lang.String str12 = fastDateFormat5.format((long) 8);
        java.util.Locale locale13 = fastDateFormat5.getLocale();
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone1, locale13);
        java.util.TimeZone timeZone16 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone17 = java.util.TimeZone.getDefault();
        boolean boolean18 = timeZone16.hasSameRules(timeZone17);
        java.util.Locale locale22 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale23 = locale22.stripExtensions();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone16, locale22);
        java.lang.Object obj25 = fastDateFormat24.clone();
        java.util.Locale locale26 = fastDateFormat24.getLocale();
        java.util.Locale locale28 = new java.util.Locale("2:45:52 PM UTC");
        java.util.TimeZone timeZone30 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone30);
        java.lang.String str32 = fastDateFormat31.toString();
        java.lang.Object obj33 = fastDateFormat31.clone();
        java.util.Locale locale34 = fastDateFormat31.getLocale();
        boolean boolean35 = locale34.hasExtensions();
        java.lang.String str36 = locale28.getDisplayVariant(locale34);
        java.lang.String str37 = locale26.getDisplayCountry(locale28);
        java.util.Locale locale38 = java.util.Locale.FRANCE;
        java.util.Locale.setDefault(locale38);
        java.lang.String str40 = locale38.toLanguageTag();
        java.util.Locale locale41 = java.util.Locale.US;
        java.util.Locale locale42 = locale41.stripExtensions();
        java.util.Locale locale43 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet44 = locale43.getUnicodeLocaleKeys();
        java.lang.String str45 = locale42.getDisplayVariant(locale43);
        java.util.Locale locale46 = java.util.Locale.US;
        java.lang.String str47 = locale46.getDisplayName();
        java.lang.String str48 = locale46.getLanguage();
        java.lang.String str49 = locale42.getDisplayLanguage(locale46);
        java.lang.String str50 = locale38.getDisplayScript(locale46);
        java.lang.String str51 = locale46.getVariant();
        boolean boolean52 = locale46.hasExtensions();
        java.util.Locale locale53 = locale46.stripExtensions();
        java.lang.String str54 = locale26.getDisplayCountry(locale53);
        java.lang.String str55 = timeZone1.getDisplayName(locale53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar2 and calendar14", (calendar2.compareTo(calendar14) == 0) == calendar2.equals(calendar14));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        java.util.Locale locale0 = java.util.Locale.US;
        java.lang.String str1 = locale0.getDisplayVariant();
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        boolean boolean3 = locale2.hasExtensions();
        java.util.Locale locale4 = java.util.Locale.ROOT;
        java.lang.String str5 = locale2.getDisplayName(locale4);
        java.lang.String str6 = locale4.getCountry();
        java.lang.String str7 = locale0.getDisplayVariant(locale4);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale4);
        java.util.TimeZone timeZone9 = calendar8.getTimeZone();
        java.lang.String str10 = timeZone9.getID();
        java.util.Locale locale11 = java.util.Locale.GERMANY;
        java.util.Calendar calendar12 = java.util.Calendar.getInstance(timeZone9, locale11);
        java.util.Date date13 = calendar12.getTime();
        int int14 = date13.getSeconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar8 and calendar12", (calendar8.compareTo(calendar12) == 0) == calendar8.equals(calendar12));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
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
        java.util.Date date20 = new java.util.Date();
        int int21 = date20.getTimezoneOffset();
        long long22 = date20.getTime();
        boolean boolean23 = localeList13.equals((java.lang.Object) date20);
        java.util.ListIterator<java.util.Locale> localeItor24 = localeList13.listIterator();
        java.util.Locale locale25 = java.util.Locale.ROOT;
        java.util.Locale locale26 = java.util.Locale.FRANCE;
        java.lang.String str27 = locale25.getDisplayLanguage(locale26);
        java.lang.String str28 = locale26.getCountry();
        java.lang.String str29 = locale26.getCountry();
        int int30 = localeList13.indexOf((java.lang.Object) locale26);
        java.util.TimeZone timeZone32 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone32);
        java.lang.String str34 = fastDateFormat33.toString();
        java.lang.Object obj35 = fastDateFormat33.clone();
        java.util.Locale locale36 = fastDateFormat33.getLocale();
        java.lang.Object obj37 = fastDateFormat33.clone();
        java.util.TimeZone timeZone38 = java.util.TimeZone.getDefault();
        int int40 = timeZone38.getOffset((long) 2);
        java.util.Locale locale44 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale45 = locale44.stripExtensions();
        java.util.Calendar calendar46 = java.util.Calendar.getInstance(timeZone38, locale45);
        java.lang.String str47 = fastDateFormat33.format(calendar46);
        java.util.Locale locale48 = fastDateFormat33.getLocale();
        java.util.TimeZone timeZone50 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str51 = timeZone50.getID();
        java.util.TimeZone.setDefault(timeZone50);
        java.util.Calendar calendar53 = java.util.Calendar.getInstance(timeZone50);
        int int54 = calendar53.getFirstDayOfWeek();
        java.util.TimeZone timeZone55 = java.util.TimeZone.getDefault();
        int int57 = timeZone55.getOffset((long) 2);
        java.util.Locale locale61 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale62 = locale61.stripExtensions();
        java.util.Calendar calendar63 = java.util.Calendar.getInstance(timeZone55, locale62);
        calendar53.setTimeZone(timeZone55);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList66 = java.util.Locale.LanguageRange.parse("zho");
        java.util.Set<java.lang.String> strSet67 = java.util.Calendar.getAvailableCalendarTypes();
        java.util.stream.Stream<java.lang.String> strStream68 = strSet67.parallelStream();
        java.lang.String str69 = java.util.Locale.lookupTag(languageRangeList66, (java.util.Collection<java.lang.String>) strSet67);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList71 = java.util.Locale.LanguageRange.parse("zho");
        java.util.Set<java.lang.String> strSet72 = java.util.Calendar.getAvailableCalendarTypes();
        java.util.stream.Stream<java.lang.String> strStream73 = strSet72.parallelStream();
        java.lang.String str74 = java.util.Locale.lookupTag(languageRangeList71, (java.util.Collection<java.lang.String>) strSet72);
        java.util.stream.Stream<java.lang.String> strStream75 = strSet72.stream();
        java.util.List<java.lang.String> strList76 = java.util.Locale.filterTags(languageRangeList66, (java.util.Collection<java.lang.String>) strSet72);
        java.util.stream.Stream<java.lang.String> strStream77 = strSet72.stream();
        boolean boolean78 = calendar53.before((java.lang.Object) strStream77);
        java.lang.StringBuffer stringBuffer79 = null;
        java.lang.StringBuffer stringBuffer80 = fastDateFormat33.format(calendar53, stringBuffer79);
        boolean boolean81 = localeList13.remove((java.lang.Object) calendar53);
        calendar53.setLenient(true);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar46 and calendar63", (calendar46.compareTo(calendar63) == 0) == calendar46.equals(calendar63));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setWeekDate(5, (int) (byte) -1, 1);
        java.util.Calendar.Builder builder6 = builder4.setLenient(true);
        java.util.Calendar.Builder builder10 = builder6.setTimeOfDay(122, 11, 10);
        java.util.Calendar.Builder builder14 = builder10.setWeekDate(100, 9, 2);
        java.util.Calendar.Builder builder18 = builder14.setTimeOfDay(52, (int) (short) 10, (-1));
        java.util.Calendar.Builder builder20 = builder18.setLenient(true);
        java.util.Calendar.Builder builder23 = builder18.set(2, 54);
        java.util.Calendar.Builder builder28 = builder18.setTimeOfDay((int) 'u', 32769, 70, 5);
        java.util.TimeZone timeZone29 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone30 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone31 = java.util.TimeZone.getDefault();
        boolean boolean32 = timeZone30.hasSameRules(timeZone31);
        boolean boolean33 = timeZone29.hasSameRules(timeZone30);
        boolean boolean34 = timeZone30.observesDaylightTime();
        java.util.TimeZone timeZone35 = java.util.TimeZone.getDefault();
        int int37 = timeZone35.getOffset((long) 2);
        java.util.Locale locale41 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale42 = locale41.stripExtensions();
        java.util.Calendar calendar43 = java.util.Calendar.getInstance(timeZone35, locale42);
        boolean boolean44 = timeZone30.hasSameRules(timeZone35);
        java.util.Calendar calendar45 = java.util.Calendar.getInstance(timeZone35);
        java.util.Calendar.Builder builder46 = builder28.setTimeZone(timeZone35);
        java.util.TimeZone.setDefault(timeZone35);
        java.util.TimeZone timeZone48 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone49 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone50 = java.util.TimeZone.getDefault();
        boolean boolean51 = timeZone49.hasSameRules(timeZone50);
        boolean boolean52 = timeZone48.hasSameRules(timeZone49);
        java.util.TimeZone timeZone54 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str55 = timeZone54.getID();
        boolean boolean56 = timeZone49.hasSameRules(timeZone54);
        timeZone54.setRawOffset((int) 'x');
        timeZone54.setRawOffset((int) 'x');
        java.util.TimeZone.setDefault(timeZone54);
        boolean boolean62 = timeZone35.hasSameRules(timeZone54);
        java.util.Calendar calendar63 = java.util.Calendar.getInstance(timeZone35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar43 and calendar45", (calendar43.compareTo(calendar45) == 0) == calendar43.equals(calendar45));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
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
        java.util.Locale locale16 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(timeZone1, locale16);
        java.util.Calendar calendar18 = java.util.Calendar.getInstance(timeZone1);
        timeZone1.setID("hi!");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar14 and calendar17", (calendar14.compareTo(calendar17) == 0) == calendar14.equals(calendar17));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        boolean boolean5 = timeZone3.hasSameRules(timeZone4);
        boolean boolean6 = timeZone2.hasSameRules(timeZone3);
        boolean boolean7 = timeZone3.observesDaylightTime();
        timeZone3.setRawOffset(52);
        timeZone3.setID("Temps universel coordonn\351");
        java.util.Locale locale13 = new java.util.Locale("zh");
        java.util.Locale locale14 = java.util.Locale.CHINESE;
        java.lang.String str15 = locale14.getLanguage();
        boolean boolean16 = locale14.hasExtensions();
        java.lang.String str17 = locale14.getDisplayCountry();
        java.lang.String str18 = locale13.getDisplayName(locale14);
        java.util.Calendar calendar19 = java.util.Calendar.getInstance(timeZone3, locale13);
        java.util.Set<java.lang.Character> charSet20 = locale13.getExtensionKeys();
        java.lang.String str21 = locale1.getDisplayCountry(locale13);
        java.lang.String str22 = locale0.getDisplayLanguage(locale1);
        java.util.Locale.setDefault(locale0);
        java.util.Calendar calendar24 = java.util.Calendar.getInstance(locale0);
        java.lang.String str25 = locale0.toLanguageTag();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar19 and calendar24", (calendar19.compareTo(calendar24) == 0) == calendar19.equals(calendar24));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str3 = timeZone2.getID();
        java.util.TimeZone.setDefault(timeZone2);
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(timeZone2);
        int int6 = calendar5.getFirstDayOfWeek();
        java.util.TimeZone timeZone7 = java.util.TimeZone.getDefault();
        int int9 = timeZone7.getOffset((long) 2);
        java.util.Locale locale13 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale14 = locale13.stripExtensions();
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone7, locale14);
        calendar5.setTimeZone(timeZone7);
        java.lang.String str17 = timeZone7.getID();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, timeZone7);
        java.util.Calendar calendar19 = java.util.Calendar.getInstance(timeZone7);
        int int20 = timeZone7.getRawOffset();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar5 and calendar15", (calendar5.compareTo(calendar15) == 0) == calendar5.equals(calendar15));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setWeekDate(5, (int) (byte) -1, 1);
        java.util.Calendar.Builder builder6 = builder4.setLenient(true);
        java.util.Calendar.Builder builder10 = builder6.setTimeOfDay(122, 11, 10);
        java.util.Calendar.Builder builder14 = builder10.setWeekDate(100, 9, 2);
        java.util.Calendar.Builder builder18 = builder14.setTimeOfDay(52, (int) (short) 10, (-1));
        java.util.Calendar.Builder builder20 = builder18.setLenient(true);
        java.util.Calendar.Builder builder23 = builder18.set(2, 54);
        java.util.TimeZone timeZone25 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone26 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone27 = java.util.TimeZone.getDefault();
        boolean boolean28 = timeZone26.hasSameRules(timeZone27);
        boolean boolean29 = timeZone25.hasSameRules(timeZone26);
        java.util.TimeZone timeZone31 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str32 = timeZone31.getID();
        boolean boolean33 = timeZone26.hasSameRules(timeZone31);
        java.util.Locale locale34 = java.util.Locale.FRANCE;
        boolean boolean35 = locale34.hasExtensions();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone31, locale34);
        java.util.Calendar.Builder builder37 = builder18.setTimeZone(timeZone31);
        java.util.TimeZone timeZone39 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str40 = timeZone39.getID();
        java.util.TimeZone.setDefault(timeZone39);
        java.util.Calendar calendar42 = java.util.Calendar.getInstance(timeZone39);
        int int43 = calendar42.getFirstDayOfWeek();
        java.util.TimeZone timeZone44 = java.util.TimeZone.getDefault();
        int int46 = timeZone44.getOffset((long) 2);
        java.util.Locale locale50 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale51 = locale50.stripExtensions();
        java.util.Calendar calendar52 = java.util.Calendar.getInstance(timeZone44, locale51);
        calendar42.setTimeZone(timeZone44);
        java.lang.String str54 = timeZone44.getID();
        java.util.Calendar calendar55 = java.util.Calendar.getInstance(timeZone44);
        java.util.TimeZone timeZone56 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone57 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone58 = java.util.TimeZone.getDefault();
        boolean boolean59 = timeZone57.hasSameRules(timeZone58);
        boolean boolean60 = timeZone56.hasSameRules(timeZone57);
        timeZone57.setID("Mon Feb 21 14:45:50 GMT 2022");
        boolean boolean63 = timeZone44.hasSameRules(timeZone57);
        boolean boolean64 = timeZone31.hasSameRules(timeZone44);
        java.util.Locale.Builder builder65 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder68 = builder65.setExtension('a', "France");
        java.util.Locale.Builder builder70 = builder65.removeUnicodeLocaleAttribute("GMT");
        java.util.Locale locale71 = java.util.Locale.FRANCE;
        java.lang.String str72 = locale71.getVariant();
        java.lang.String str73 = locale71.getDisplayCountry();
        java.util.Locale.Builder builder74 = builder65.setLocale(locale71);
        java.util.Locale locale76 = new java.util.Locale("zh");
        java.lang.String str77 = locale71.getDisplayName(locale76);
        java.lang.String str78 = locale71.getCountry();
        java.lang.String str79 = locale71.getISO3Language();
        java.util.Calendar calendar80 = java.util.Calendar.getInstance(timeZone31, locale71);
        java.util.Calendar calendar81 = java.util.Calendar.getInstance(timeZone31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar42 and calendar80", (calendar42.compareTo(calendar80) == 0) == calendar42.equals(calendar80));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        java.util.Locale locale0 = java.util.Locale.US;
        java.lang.String str1 = locale0.getDisplayVariant();
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        boolean boolean3 = locale2.hasExtensions();
        java.util.Locale locale4 = java.util.Locale.ROOT;
        java.lang.String str5 = locale2.getDisplayName(locale4);
        java.lang.String str6 = locale4.getCountry();
        java.lang.String str7 = locale0.getDisplayVariant(locale4);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale4);
        java.util.TimeZone timeZone9 = calendar8.getTimeZone();
        java.lang.String str10 = timeZone9.getID();
        java.util.Locale locale11 = java.util.Locale.GERMANY;
        java.util.Calendar calendar12 = java.util.Calendar.getInstance(timeZone9, locale11);
        java.util.Locale.LanguageRange[] languageRangeArray13 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList14 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList14, languageRangeArray13);
        java.util.Locale locale16 = java.util.Locale.GERMAN;
        java.util.Locale locale17 = java.util.Locale.FRANCE;
        boolean boolean18 = locale17.hasExtensions();
        java.util.Locale locale19 = java.util.Locale.FRANCE;
        java.util.Locale locale20 = java.util.Locale.CHINESE;
        java.lang.String str21 = locale20.getLanguage();
        java.util.Locale[] localeArray22 = new java.util.Locale[] { locale16, locale17, locale19, locale20 };
        java.util.ArrayList<java.util.Locale> localeList23 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList23, localeArray22);
        java.util.Locale.FilteringMode filteringMode25 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList26 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, (java.util.Collection<java.util.Locale>) localeList23, filteringMode25);
        java.util.Spliterator<java.util.Locale> localeSpliterator27 = localeList26.spliterator();
        java.lang.Object[] objArray28 = localeList26.toArray();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList30 = java.util.Locale.LanguageRange.parse("zho");
        java.util.Set<java.lang.String> strSet31 = java.util.Calendar.getAvailableCalendarTypes();
        java.util.stream.Stream<java.lang.String> strStream32 = strSet31.parallelStream();
        java.lang.String str33 = java.util.Locale.lookupTag(languageRangeList30, (java.util.Collection<java.lang.String>) strSet31);
        java.util.stream.Stream<java.lang.String> strStream34 = strSet31.stream();
        boolean boolean35 = localeList26.containsAll((java.util.Collection<java.lang.String>) strSet31);
        java.util.Spliterator<java.util.Locale> localeSpliterator36 = localeList26.spliterator();
        java.lang.Object[] objArray37 = localeList26.toArray();
        java.util.Locale locale38 = java.util.Locale.FRANCE;
        java.util.Locale.setDefault(locale38);
        java.util.Locale locale40 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet41 = locale40.getUnicodeLocaleKeys();
        java.lang.String str42 = locale40.getDisplayLanguage();
        java.lang.String str43 = locale38.getDisplayVariant(locale40);
        java.util.Set<java.lang.String> strSet44 = locale38.getUnicodeLocaleKeys();
        boolean boolean45 = localeList26.add(locale38);
        java.util.Calendar calendar46 = java.util.Calendar.getInstance(timeZone9, locale38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar8 and calendar12", (calendar8.compareTo(calendar12) == 0) == calendar8.equals(calendar12));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale4 = new java.util.Locale("\u4e0a\u5348 12:12:00", "Taiwan", "en");
        java.util.Locale locale6 = new java.util.Locale("2:45:52 PM UTC");
        java.util.TimeZone timeZone8 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone8);
        java.lang.String str10 = fastDateFormat9.toString();
        java.lang.Object obj11 = fastDateFormat9.clone();
        java.util.Locale locale12 = fastDateFormat9.getLocale();
        boolean boolean13 = locale12.hasExtensions();
        java.lang.String str14 = locale6.getDisplayVariant(locale12);
        java.lang.String str15 = locale4.getDisplayCountry(locale12);
        java.util.Locale.setDefault(category0, locale12);
        java.lang.String str17 = locale12.getLanguage();
        java.util.TimeZone timeZone19 = java.util.TimeZone.getDefault();
        timeZone19.setID("\uc624\ud6c4\uc2dc\ubd84\ucd08 GMT");
        java.util.Calendar calendar22 = java.util.Calendar.getInstance(timeZone19);
        java.util.Locale.LanguageRange[] languageRangeArray23 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList24 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList24, languageRangeArray23);
        java.util.Locale locale26 = java.util.Locale.GERMAN;
        java.util.Locale locale27 = java.util.Locale.FRANCE;
        boolean boolean28 = locale27.hasExtensions();
        java.util.Locale locale29 = java.util.Locale.FRANCE;
        java.util.Locale locale30 = java.util.Locale.CHINESE;
        java.lang.String str31 = locale30.getLanguage();
        java.util.Locale[] localeArray32 = new java.util.Locale[] { locale26, locale27, locale29, locale30 };
        java.util.ArrayList<java.util.Locale> localeList33 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList33, localeArray32);
        java.util.Locale.FilteringMode filteringMode35 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList36 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList24, (java.util.Collection<java.util.Locale>) localeList33, filteringMode35);
        java.util.Spliterator<java.util.Locale> localeSpliterator37 = localeList36.spliterator();
        java.lang.Object[] objArray38 = localeList36.toArray();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList40 = java.util.Locale.LanguageRange.parse("zho");
        java.util.Set<java.lang.String> strSet41 = java.util.Calendar.getAvailableCalendarTypes();
        java.util.stream.Stream<java.lang.String> strStream42 = strSet41.parallelStream();
        java.lang.String str43 = java.util.Locale.lookupTag(languageRangeList40, (java.util.Collection<java.lang.String>) strSet41);
        java.util.stream.Stream<java.lang.String> strStream44 = strSet41.stream();
        boolean boolean45 = localeList36.containsAll((java.util.Collection<java.lang.String>) strSet41);
        java.util.Locale locale49 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale50 = locale49.stripExtensions();
        boolean boolean51 = localeList36.add(locale49);
        java.util.Locale locale55 = new java.util.Locale("21 Feb 2022 14:46:12 GMT", "java.util.GregorianCalendar[time=-58180670029710,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=126,MONTH=4,WEEK_OF_YEAR=18,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=121,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=10,MILLISECOND=290,ZONE_OFFSET=0,DST_OFFSET=0]", "1 janv. 1899 00:05:00");
        java.lang.String str56 = locale49.getDisplayCountry(locale55);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat57 = org.apache.commons.lang3.time.FastDateFormat.getInstance("\u6cd5\u6587", timeZone19, locale55);
        java.util.Locale locale58 = java.util.Locale.CHINA;
        java.lang.String str59 = locale55.getDisplayScript(locale58);
        java.util.Calendar calendar60 = java.util.Calendar.getInstance(locale55);
        java.lang.String str61 = locale12.getDisplayCountry(locale55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar22 and calendar60", (calendar22.compareTo(calendar60) == 0) == calendar22.equals(calendar60));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
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
        java.util.List<java.util.Locale.LanguageRange> languageRangeList19 = java.util.Locale.LanguageRange.parse("zho");
        java.util.Set<java.lang.String> strSet20 = java.util.Calendar.getAvailableCalendarTypes();
        java.util.stream.Stream<java.lang.String> strStream21 = strSet20.parallelStream();
        java.lang.String str22 = java.util.Locale.lookupTag(languageRangeList19, (java.util.Collection<java.lang.String>) strSet20);
        java.lang.String[] strArray39 = new java.lang.String[] { "FastDateFormat[h:mm:ss a z]", "FastDateFormat[h:mm:ss a z]", "GMT", "21 Feb 2022 14:45:53 GMT", "2:45:56 PM UTC", "zh", "HI!", "Etc/UTC", "GMT", "Chinese", "zho", "21 Feb 2022 14:45:53 GMT", "21 Feb 2022 14:45:54 GMT", "Mon Feb 21 14:45:54 UTC 2022", "zh", "HI!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        java.lang.String str42 = java.util.Locale.lookupTag(languageRangeList19, (java.util.Collection<java.lang.String>) strList40);
        java.util.stream.Stream<java.lang.String> strStream43 = strList40.parallelStream();
        java.util.stream.Stream<java.lang.String> strStream44 = strList40.parallelStream();
        boolean boolean45 = localeList17.retainAll((java.util.Collection<java.lang.String>) strList40);
        java.util.Iterator<java.util.Locale> localeItor46 = localeList17.iterator();
        java.util.TimeZone timeZone48 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone48);
        java.lang.String str50 = fastDateFormat49.toString();
        java.lang.Object obj51 = fastDateFormat49.clone();
        java.util.Locale locale52 = fastDateFormat49.getLocale();
        java.lang.Object obj53 = fastDateFormat49.clone();
        java.util.TimeZone timeZone54 = java.util.TimeZone.getDefault();
        int int56 = timeZone54.getOffset((long) 2);
        java.util.Locale locale60 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale61 = locale60.stripExtensions();
        java.util.Calendar calendar62 = java.util.Calendar.getInstance(timeZone54, locale61);
        java.lang.String str63 = fastDateFormat49.format(calendar62);
        java.util.Locale locale64 = fastDateFormat49.getLocale();
        java.util.TimeZone timeZone66 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str67 = timeZone66.getID();
        java.util.TimeZone.setDefault(timeZone66);
        java.util.Calendar calendar69 = java.util.Calendar.getInstance(timeZone66);
        int int70 = calendar69.getFirstDayOfWeek();
        java.util.TimeZone timeZone71 = java.util.TimeZone.getDefault();
        int int73 = timeZone71.getOffset((long) 2);
        java.util.Locale locale77 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale78 = locale77.stripExtensions();
        java.util.Calendar calendar79 = java.util.Calendar.getInstance(timeZone71, locale78);
        calendar69.setTimeZone(timeZone71);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList82 = java.util.Locale.LanguageRange.parse("zho");
        java.util.Set<java.lang.String> strSet83 = java.util.Calendar.getAvailableCalendarTypes();
        java.util.stream.Stream<java.lang.String> strStream84 = strSet83.parallelStream();
        java.lang.String str85 = java.util.Locale.lookupTag(languageRangeList82, (java.util.Collection<java.lang.String>) strSet83);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList87 = java.util.Locale.LanguageRange.parse("zho");
        java.util.Set<java.lang.String> strSet88 = java.util.Calendar.getAvailableCalendarTypes();
        java.util.stream.Stream<java.lang.String> strStream89 = strSet88.parallelStream();
        java.lang.String str90 = java.util.Locale.lookupTag(languageRangeList87, (java.util.Collection<java.lang.String>) strSet88);
        java.util.stream.Stream<java.lang.String> strStream91 = strSet88.stream();
        java.util.List<java.lang.String> strList92 = java.util.Locale.filterTags(languageRangeList82, (java.util.Collection<java.lang.String>) strSet88);
        java.util.stream.Stream<java.lang.String> strStream93 = strSet88.stream();
        boolean boolean94 = calendar69.before((java.lang.Object) strStream93);
        java.lang.StringBuffer stringBuffer95 = null;
        java.lang.StringBuffer stringBuffer96 = fastDateFormat49.format(calendar69, stringBuffer95);
        boolean boolean97 = localeList17.contains((java.lang.Object) calendar69);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar62 and calendar79", (calendar62.compareTo(calendar79) == 0) == calendar62.equals(calendar79));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
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
        calendar37.roll((int) (short) 0, (int) (byte) 0);
        java.util.Locale.LanguageRange[] languageRangeArray43 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList44 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList44, languageRangeArray43);
        java.util.Locale locale46 = java.util.Locale.GERMAN;
        java.util.Locale locale47 = java.util.Locale.FRANCE;
        boolean boolean48 = locale47.hasExtensions();
        java.util.Locale locale49 = java.util.Locale.FRANCE;
        java.util.Locale locale50 = java.util.Locale.CHINESE;
        java.lang.String str51 = locale50.getLanguage();
        java.util.Locale[] localeArray52 = new java.util.Locale[] { locale46, locale47, locale49, locale50 };
        java.util.ArrayList<java.util.Locale> localeList53 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList53, localeArray52);
        java.util.Locale.FilteringMode filteringMode55 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList56 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList44, (java.util.Collection<java.util.Locale>) localeList53, filteringMode55);
        java.util.Spliterator<java.util.Locale> localeSpliterator57 = localeList56.spliterator();
        java.lang.Object[] objArray58 = localeList56.toArray();
        localeList56.clear();
        java.text.Format.Field field60 = null;
        java.text.FieldPosition fieldPosition61 = new java.text.FieldPosition(field60);
        boolean boolean62 = localeList56.equals((java.lang.Object) fieldPosition61);
        java.util.Locale locale63 = java.util.Locale.US;
        java.util.Locale locale64 = locale63.stripExtensions();
        java.util.Locale locale65 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet66 = locale65.getUnicodeLocaleKeys();
        java.lang.String str67 = locale64.getDisplayVariant(locale65);
        int int68 = localeList56.lastIndexOf((java.lang.Object) locale64);
        java.util.Set<java.lang.String> strSet69 = locale64.getUnicodeLocaleKeys();
        boolean boolean70 = calendar37.before((java.lang.Object) locale64);
        boolean boolean72 = calendar37.before((java.lang.Object) 9);
        java.time.Instant instant73 = calendar37.toInstant();
        java.util.Date date74 = java.util.Date.from(instant73);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar27 and calendar37", (calendar27.compareTo(calendar37) == 0) == calendar27.equals(calendar37));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone1);
        timeZone1.setID("Mon Feb 21 14:45:50 GMT 2022");
        java.util.Locale.Category category7 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale8 = java.util.Locale.TAIWAN;
        java.util.Locale locale9 = locale8.stripExtensions();
        java.util.Locale.setDefault(category7, locale8);
        java.lang.String str11 = locale8.getDisplayCountry();
        java.util.Calendar calendar12 = java.util.Calendar.getInstance(timeZone1, locale8);
        java.util.TimeZone timeZone14 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone15 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone16 = java.util.TimeZone.getDefault();
        boolean boolean17 = timeZone15.hasSameRules(timeZone16);
        boolean boolean18 = timeZone14.hasSameRules(timeZone15);
        java.util.TimeZone timeZone20 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str21 = timeZone20.getID();
        boolean boolean22 = timeZone15.hasSameRules(timeZone20);
        java.util.Locale locale23 = java.util.Locale.FRANCE;
        boolean boolean24 = locale23.hasExtensions();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone20, locale23);
        java.util.TimeZone timeZone27 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str28 = timeZone27.getID();
        java.util.TimeZone.setDefault(timeZone27);
        java.util.Calendar calendar30 = java.util.Calendar.getInstance(timeZone27);
        int int31 = calendar30.getFirstDayOfWeek();
        java.util.TimeZone timeZone32 = java.util.TimeZone.getDefault();
        int int34 = timeZone32.getOffset((long) 2);
        java.util.Locale locale38 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale39 = locale38.stripExtensions();
        java.util.Calendar calendar40 = java.util.Calendar.getInstance(timeZone32, locale39);
        calendar30.setTimeZone(timeZone32);
        java.lang.String str42 = timeZone32.getID();
        java.util.Calendar calendar43 = java.util.Calendar.getInstance(timeZone32);
        java.util.TimeZone timeZone44 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone45 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone46 = java.util.TimeZone.getDefault();
        boolean boolean47 = timeZone45.hasSameRules(timeZone46);
        boolean boolean48 = timeZone44.hasSameRules(timeZone45);
        timeZone45.setID("Mon Feb 21 14:45:50 GMT 2022");
        boolean boolean51 = timeZone32.hasSameRules(timeZone45);
        boolean boolean52 = timeZone20.hasSameRules(timeZone45);
        timeZone45.setRawOffset(0);
        int int56 = timeZone45.getOffset(1645454771619L);
        int int58 = timeZone45.getOffset(1645454796947L);
        boolean boolean59 = timeZone1.hasSameRules(timeZone45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar12 and calendar30", (calendar12.compareTo(calendar30) == 0) == calendar12.equals(calendar30));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
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
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(timeZone6);
        java.util.TimeZone timeZone18 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone19 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone20 = java.util.TimeZone.getDefault();
        boolean boolean21 = timeZone19.hasSameRules(timeZone20);
        boolean boolean22 = timeZone18.hasSameRules(timeZone19);
        timeZone19.setID("Mon Feb 21 14:45:50 GMT 2022");
        boolean boolean25 = timeZone6.hasSameRules(timeZone19);
        int int26 = timeZone6.getRawOffset();
        java.util.Locale locale28 = java.util.Locale.KOREA;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, locale28);
        java.lang.String str31 = fastDateFormat29.format((java.lang.Object) 1645454750118L);
        boolean boolean32 = fastDateFormat29.getTimeZoneOverridesCalendar();
        java.util.Locale locale33 = fastDateFormat29.getLocale();
        java.util.Locale locale34 = java.util.Locale.FRANCE;
        java.lang.String str35 = locale34.getLanguage();
        java.lang.String str36 = locale33.getDisplayVariant(locale34);
        java.util.Calendar calendar37 = java.util.Calendar.getInstance(timeZone6, locale34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar4 and calendar14", (calendar4.compareTo(calendar14) == 0) == calendar4.equals(calendar14));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone1);
        java.lang.String str5 = timeZone1.getID();
        java.lang.String str6 = timeZone1.getID();
        java.util.Calendar calendar7 = java.util.Calendar.getInstance(timeZone1);
        java.util.TimeZone timeZone9 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str10 = timeZone9.getID();
        java.util.TimeZone.setDefault(timeZone9);
        java.util.Calendar calendar12 = java.util.Calendar.getInstance(timeZone9);
        int int13 = calendar12.getFirstDayOfWeek();
        java.util.TimeZone timeZone14 = java.util.TimeZone.getDefault();
        int int16 = timeZone14.getOffset((long) 2);
        java.util.Locale locale20 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale21 = locale20.stripExtensions();
        java.util.Calendar calendar22 = java.util.Calendar.getInstance(timeZone14, locale21);
        calendar12.setTimeZone(timeZone14);
        calendar12.setTimeInMillis((long) 14);
        java.util.TimeZone timeZone26 = calendar12.getTimeZone();
        calendar12.set(16, 3);
        boolean boolean30 = calendar12.isWeekDateSupported();
        java.lang.String str31 = calendar12.getCalendarType();
        java.util.TimeZone timeZone33 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone33);
        java.lang.String str35 = fastDateFormat34.toString();
        java.util.Date date41 = new java.util.Date(3, (int) (short) 0, 6, 0, (int) (short) 1);
        java.util.Date date42 = new java.util.Date();
        int int43 = date42.getTimezoneOffset();
        long long44 = date42.getTime();
        boolean boolean45 = date41.after(date42);
        java.lang.StringBuffer stringBuffer46 = null;
        java.lang.StringBuffer stringBuffer47 = fastDateFormat34.format(date41, stringBuffer46);
        java.util.Date date48 = new java.util.Date();
        int int49 = date48.getTimezoneOffset();
        long long50 = date48.getTime();
        java.util.Date date51 = new java.util.Date();
        int int52 = date51.getSeconds();
        date51.setTime((long) 16);
        date51.setMinutes(12);
        int int57 = date51.getSeconds();
        boolean boolean58 = date48.after(date51);
        boolean boolean59 = fastDateFormat34.equals((java.lang.Object) date48);
        date48.setHours(58);
        date48.setMinutes((-1));
        calendar12.setTime(date48);
        boolean boolean65 = timeZone1.inDaylightTime(date48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar7 and calendar22", (calendar7.compareTo(calendar22) == 0) == calendar7.equals(calendar22));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
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
        java.util.TimeZone timeZone16 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone17 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone18 = java.util.TimeZone.getDefault();
        boolean boolean19 = timeZone17.hasSameRules(timeZone18);
        boolean boolean20 = timeZone16.hasSameRules(timeZone17);
        timeZone17.setID("Mon Feb 21 14:45:50 GMT 2022");
        int int24 = timeZone17.getOffset(1645454782547L);
        int int25 = timeZone17.getRawOffset();
        boolean boolean26 = timeZone1.hasSameRules(timeZone17);
        java.lang.String str27 = timeZone17.getID();
        java.util.Calendar calendar28 = java.util.Calendar.getInstance(timeZone17);
        timeZone17.setRawOffset((int) (short) -1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar14 and calendar28", (calendar14.compareTo(calendar28) == 0) == calendar14.equals(calendar28));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
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
        java.util.TimeZone timeZone14 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str15 = timeZone14.getID();
        java.util.TimeZone.setDefault(timeZone14);
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(timeZone14);
        int int18 = calendar17.getFirstDayOfWeek();
        java.util.TimeZone timeZone19 = java.util.TimeZone.getDefault();
        int int21 = timeZone19.getOffset((long) 2);
        java.util.Locale locale25 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale26 = locale25.stripExtensions();
        java.util.Calendar calendar27 = java.util.Calendar.getInstance(timeZone19, locale26);
        calendar17.setTimeZone(timeZone19);
        java.lang.String str29 = timeZone19.getID();
        java.util.Calendar calendar30 = java.util.Calendar.getInstance(timeZone19);
        java.util.TimeZone timeZone31 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone32 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone33 = java.util.TimeZone.getDefault();
        boolean boolean34 = timeZone32.hasSameRules(timeZone33);
        boolean boolean35 = timeZone31.hasSameRules(timeZone32);
        timeZone32.setID("Mon Feb 21 14:45:50 GMT 2022");
        boolean boolean38 = timeZone19.hasSameRules(timeZone32);
        boolean boolean39 = timeZone7.hasSameRules(timeZone32);
        boolean boolean40 = timeZone32.useDaylightTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar17 and calendar27", (calendar17.compareTo(calendar27) == 0) == calendar17.equals(calendar27));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
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
        java.time.ZoneId zoneId12 = timeZone7.toZoneId();
        java.util.TimeZone timeZone13 = java.util.TimeZone.getTimeZone(zoneId12);
        java.util.TimeZone timeZone15 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone15);
        java.lang.String str17 = fastDateFormat16.getPattern();
        java.text.ParsePosition parsePosition20 = new java.text.ParsePosition(16);
        parsePosition20.setIndex(11);
        java.lang.Object obj23 = fastDateFormat16.parseObject("FastDateFormat[]", parsePosition20);
        java.util.TimeZone timeZone24 = fastDateFormat16.getTimeZone();
        java.lang.String str25 = timeZone24.getID();
        java.util.Locale locale27 = new java.util.Locale("zh");
        java.lang.String str28 = locale27.getISO3Country();
        java.util.Calendar calendar29 = java.util.Calendar.getInstance(timeZone24, locale27);
        boolean boolean30 = timeZone13.hasSameRules(timeZone24);
        java.util.TimeZone timeZone31 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone32 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone33 = java.util.TimeZone.getDefault();
        boolean boolean34 = timeZone32.hasSameRules(timeZone33);
        boolean boolean35 = timeZone31.hasSameRules(timeZone32);
        timeZone32.setID("Mon Feb 21 14:45:50 GMT 2022");
        java.util.Locale.Category category38 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale39 = java.util.Locale.TAIWAN;
        java.util.Locale locale40 = locale39.stripExtensions();
        java.util.Locale.setDefault(category38, locale39);
        java.lang.String str42 = locale39.getDisplayCountry();
        java.util.Calendar calendar43 = java.util.Calendar.getInstance(timeZone32, locale39);
        timeZone32.setRawOffset((int) (short) 10);
        int int47 = timeZone32.getOffset(1645454836654L);
        boolean boolean48 = timeZone13.hasSameRules(timeZone32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar29 and calendar43", (calendar29.compareTo(calendar43) == 0) == calendar29.equals(calendar43));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone1);
        boolean boolean3 = fastDateFormat2.getTimeZoneOverridesCalendar();
        java.util.TimeZone timeZone6 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone6);
        java.lang.String str8 = fastDateFormat7.getPattern();
        java.text.ParsePosition parsePosition11 = new java.text.ParsePosition(16);
        parsePosition11.setIndex(11);
        java.lang.Object obj14 = fastDateFormat7.parseObject("FastDateFormat[]", parsePosition11);
        java.util.TimeZone timeZone17 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone17);
        java.lang.String str19 = fastDateFormat18.getPattern();
        java.text.ParsePosition parsePosition22 = new java.text.ParsePosition((int) (short) 10);
        int int23 = parsePosition22.getIndex();
        java.lang.Object obj24 = fastDateFormat18.parseObject("\uc624\uc804\uc2dc\ubd84\ucd08 UTC", parsePosition22);
        java.lang.Object obj25 = fastDateFormat7.parseObject("2:45:54 PM UTC", parsePosition22);
        java.lang.Object obj26 = fastDateFormat2.parseObject("2:45:54 PM UTC", parsePosition22);
        int int27 = fastDateFormat2.getMaxLengthEstimate();
        java.lang.String str28 = fastDateFormat2.getPattern();
        java.util.TimeZone timeZone29 = fastDateFormat2.getTimeZone();
        java.util.TimeZone.setDefault(timeZone29);
        java.util.TimeZone timeZone32 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone33 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone34 = java.util.TimeZone.getDefault();
        boolean boolean35 = timeZone33.hasSameRules(timeZone34);
        boolean boolean36 = timeZone32.hasSameRules(timeZone33);
        int int37 = timeZone33.getRawOffset();
        java.util.TimeZone timeZone38 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone39 = java.util.TimeZone.getDefault();
        boolean boolean40 = timeZone38.hasSameRules(timeZone39);
        timeZone39.setID("Etc/UTC");
        boolean boolean43 = timeZone33.hasSameRules(timeZone39);
        java.time.ZoneId zoneId44 = timeZone39.toZoneId();
        java.util.TimeZone timeZone45 = java.util.TimeZone.getTimeZone(zoneId44);
        java.util.TimeZone timeZone47 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone47);
        java.lang.String str49 = fastDateFormat48.getPattern();
        java.text.ParsePosition parsePosition52 = new java.text.ParsePosition(16);
        parsePosition52.setIndex(11);
        java.lang.Object obj55 = fastDateFormat48.parseObject("FastDateFormat[]", parsePosition52);
        java.util.TimeZone timeZone56 = fastDateFormat48.getTimeZone();
        java.lang.String str57 = timeZone56.getID();
        java.util.Locale locale59 = new java.util.Locale("zh");
        java.lang.String str60 = locale59.getISO3Country();
        java.util.Calendar calendar61 = java.util.Calendar.getInstance(timeZone56, locale59);
        boolean boolean62 = timeZone45.hasSameRules(timeZone56);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat63 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone45);
        boolean boolean64 = timeZone29.hasSameRules(timeZone45);
        java.util.TimeZone timeZone67 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str68 = timeZone67.getID();
        java.util.TimeZone.setDefault(timeZone67);
        java.util.Calendar calendar70 = java.util.Calendar.getInstance(timeZone67);
        int int71 = calendar70.getFirstDayOfWeek();
        java.util.TimeZone timeZone72 = java.util.TimeZone.getDefault();
        int int74 = timeZone72.getOffset((long) 2);
        java.util.Locale locale78 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale79 = locale78.stripExtensions();
        java.util.Calendar calendar80 = java.util.Calendar.getInstance(timeZone72, locale79);
        calendar70.setTimeZone(timeZone72);
        java.lang.String str82 = timeZone72.getID();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat83 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, timeZone72);
        java.util.Calendar calendar84 = java.util.Calendar.getInstance(timeZone72);
        timeZone72.setRawOffset(48);
        boolean boolean87 = timeZone45.hasSameRules(timeZone72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar61 and calendar70", (calendar61.compareTo(calendar70) == 0) == calendar61.equals(calendar70));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone1);
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(timeZone1);
        timeZone1.setID("java.text.AttributedCharacterIterator$Attribute(input_method_segment)");
        java.util.TimeZone timeZone10 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str11 = timeZone10.getID();
        java.util.TimeZone.setDefault(timeZone10);
        java.util.Calendar calendar13 = java.util.Calendar.getInstance(timeZone10);
        int int14 = calendar13.getFirstDayOfWeek();
        java.util.TimeZone timeZone15 = java.util.TimeZone.getDefault();
        int int17 = timeZone15.getOffset((long) 2);
        java.util.Locale locale21 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale22 = locale21.stripExtensions();
        java.util.Calendar calendar23 = java.util.Calendar.getInstance(timeZone15, locale22);
        calendar13.setTimeZone(timeZone15);
        java.lang.String str25 = timeZone15.getID();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, timeZone15);
        boolean boolean27 = timeZone1.hasSameRules(timeZone15);
        java.util.TimeZone timeZone28 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone29 = java.util.TimeZone.getDefault();
        boolean boolean30 = timeZone28.hasSameRules(timeZone29);
        int int32 = timeZone28.getOffset(1645454771619L);
        java.util.TimeZone.setDefault(timeZone28);
        java.time.ZoneId zoneId34 = timeZone28.toZoneId();
        boolean boolean35 = timeZone15.hasSameRules(timeZone28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar5 and calendar13", (calendar5.compareTo(calendar13) == 0) == calendar5.equals(calendar13));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        java.text.AttributedCharacterIterator.Attribute attribute0 = java.text.AttributedCharacterIterator.Attribute.INPUT_METHOD_SEGMENT;
        boolean boolean2 = attribute0.equals((java.lang.Object) "\uc624\ud6c4\uc2dc\ubd84\ucd08 GMT");
        java.lang.String str3 = attribute0.toString();
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar7 = java.util.Calendar.getInstance(timeZone5, locale6);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone5);
        boolean boolean9 = attribute0.equals((java.lang.Object) timeZone5);
        java.util.TimeZone timeZone12 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone13 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone14 = java.util.TimeZone.getDefault();
        boolean boolean15 = timeZone13.hasSameRules(timeZone14);
        boolean boolean16 = timeZone12.hasSameRules(timeZone13);
        java.lang.String str17 = timeZone13.getID();
        java.util.TimeZone timeZone18 = java.util.TimeZone.getDefault();
        int int20 = timeZone18.getOffset((long) 2);
        int int21 = timeZone18.getRawOffset();
        boolean boolean22 = timeZone13.hasSameRules(timeZone18);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone18);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone18);
        boolean boolean25 = attribute0.equals((java.lang.Object) (short) 1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar7 and calendar8", (calendar7.compareTo(calendar8) == 0) == calendar7.equals(calendar8));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.TAIWAN;
        java.util.Locale locale2 = locale1.stripExtensions();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale.setDefault(locale1);
        java.util.Set<java.lang.String> strSet5 = locale1.getUnicodeLocaleAttributes();
        java.lang.String str6 = locale1.getCountry();
        java.lang.String str7 = locale1.getScript();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale1);
        java.util.TimeZone timeZone10 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone11 = java.util.TimeZone.getDefault();
        boolean boolean12 = timeZone10.hasSameRules(timeZone11);
        java.util.Locale locale16 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale17 = locale16.stripExtensions();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone10, locale16);
        java.lang.Object obj19 = fastDateFormat18.clone();
        java.util.Locale locale20 = fastDateFormat18.getLocale();
        java.util.Locale locale22 = new java.util.Locale("2:45:52 PM UTC");
        java.util.Locale locale24 = new java.util.Locale("zh");
        java.lang.String str25 = locale22.getDisplayScript(locale24);
        java.util.TimeZone timeZone27 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone27);
        java.lang.String str29 = fastDateFormat28.getPattern();
        java.text.ParsePosition parsePosition32 = new java.text.ParsePosition(16);
        parsePosition32.setIndex(11);
        java.lang.Object obj35 = fastDateFormat28.parseObject("FastDateFormat[]", parsePosition32);
        java.util.TimeZone timeZone36 = fastDateFormat28.getTimeZone();
        java.lang.String str37 = timeZone36.getID();
        java.util.Locale locale39 = new java.util.Locale("zh");
        java.lang.String str40 = locale39.getISO3Country();
        java.util.Calendar calendar41 = java.util.Calendar.getInstance(timeZone36, locale39);
        java.lang.String str42 = locale22.getDisplayName(locale39);
        java.lang.String str43 = locale20.getDisplayScript(locale22);
        java.lang.String str44 = locale1.getDisplayName(locale22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar8 and calendar41", (calendar8.compareTo(calendar41) == 0) == calendar8.equals(calendar41));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        boolean boolean5 = timeZone3.hasSameRules(timeZone4);
        boolean boolean6 = timeZone2.hasSameRules(timeZone3);
        boolean boolean7 = timeZone3.observesDaylightTime();
        timeZone3.setRawOffset(52);
        timeZone3.setID("Temps universel coordonn\351");
        java.util.Locale locale13 = new java.util.Locale("zh");
        java.util.Locale locale14 = java.util.Locale.CHINESE;
        java.lang.String str15 = locale14.getLanguage();
        boolean boolean16 = locale14.hasExtensions();
        java.lang.String str17 = locale14.getDisplayCountry();
        java.lang.String str18 = locale13.getDisplayName(locale14);
        java.util.Calendar calendar19 = java.util.Calendar.getInstance(timeZone3, locale13);
        java.util.Set<java.lang.Character> charSet20 = locale13.getExtensionKeys();
        java.lang.String str21 = locale1.getDisplayCountry(locale13);
        java.lang.String str22 = locale0.getDisplayLanguage(locale1);
        java.util.Locale.setDefault(locale0);
        java.util.Locale locale24 = java.util.Locale.US;
        java.lang.String str25 = locale24.getDisplayVariant();
        java.util.Locale locale26 = java.util.Locale.FRANCE;
        boolean boolean27 = locale26.hasExtensions();
        java.util.Locale locale28 = java.util.Locale.ROOT;
        java.lang.String str29 = locale26.getDisplayName(locale28);
        java.lang.String str30 = locale28.getCountry();
        java.lang.String str31 = locale24.getDisplayVariant(locale28);
        java.util.Calendar calendar32 = java.util.Calendar.getInstance(locale28);
        java.lang.String str33 = locale28.getDisplayScript();
        java.lang.String str34 = locale28.toLanguageTag();
        java.util.Locale.LanguageRange[] languageRangeArray35 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList36 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList36, languageRangeArray35);
        java.util.Locale locale38 = java.util.Locale.GERMAN;
        java.util.Locale locale39 = java.util.Locale.FRANCE;
        boolean boolean40 = locale39.hasExtensions();
        java.util.Locale locale41 = java.util.Locale.FRANCE;
        java.util.Locale locale42 = java.util.Locale.CHINESE;
        java.lang.String str43 = locale42.getLanguage();
        java.util.Locale[] localeArray44 = new java.util.Locale[] { locale38, locale39, locale41, locale42 };
        java.util.ArrayList<java.util.Locale> localeList45 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList45, localeArray44);
        java.util.Locale.FilteringMode filteringMode47 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList48 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList36, (java.util.Collection<java.util.Locale>) localeList45, filteringMode47);
        java.util.Spliterator<java.util.Locale> localeSpliterator49 = localeList48.spliterator();
        java.lang.Object[] objArray50 = localeList48.toArray();
        localeList48.clear();
        java.text.Format.Field field52 = null;
        java.text.FieldPosition fieldPosition53 = new java.text.FieldPosition(field52);
        boolean boolean54 = localeList48.equals((java.lang.Object) fieldPosition53);
        int int56 = localeList48.lastIndexOf((java.lang.Object) 1645454769350L);
        java.util.Locale locale57 = java.util.Locale.CHINESE;
        java.lang.String str58 = locale57.getLanguage();
        boolean boolean59 = locale57.hasExtensions();
        java.lang.String str60 = locale57.getDisplayCountry();
        java.util.Set<java.lang.String> strSet61 = locale57.getUnicodeLocaleKeys();
        boolean boolean62 = localeList48.contains((java.lang.Object) locale57);
        java.util.Locale.Category category63 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale64 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(category63, locale64);
        java.util.Locale locale66 = java.util.Locale.KOREA;
        java.lang.String str67 = locale66.getScript();
        java.util.Locale locale68 = java.util.Locale.FRANCE;
        java.lang.String str69 = locale66.getDisplayVariant(locale68);
        java.util.Locale.setDefault(category63, locale66);
        java.util.Locale locale71 = java.util.Locale.US;
        java.lang.String str72 = locale71.getDisplayVariant();
        java.util.Set<java.lang.String> strSet73 = locale71.getUnicodeLocaleAttributes();
        java.lang.String str74 = locale71.getISO3Country();
        java.lang.String str75 = locale71.getLanguage();
        java.util.Locale.setDefault(category63, locale71);
        java.util.Locale locale77 = java.util.Locale.getDefault(category63);
        java.util.Locale locale78 = java.util.Locale.getDefault(category63);
        java.lang.String str79 = locale57.getDisplayVariant(locale78);
        java.util.Locale locale81 = java.util.Locale.forLanguageTag("1:08:08 AM GMT");
        java.lang.String str82 = locale81.getLanguage();
        java.lang.String str83 = locale78.getDisplayName(locale81);
        java.lang.String str84 = locale28.getDisplayName(locale81);
        java.lang.String str85 = locale0.getDisplayScript(locale81);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar19 and calendar32", (calendar19.compareTo(calendar32) == 0) == calendar19.equals(calendar32));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone1);
        java.util.TimeZone timeZone6 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str7 = timeZone6.getID();
        boolean boolean8 = timeZone1.hasSameRules(timeZone6);
        timeZone6.setRawOffset((int) 'x');
        timeZone6.setRawOffset((int) 'x');
        java.time.ZoneId zoneId13 = timeZone6.toZoneId();
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone6);
        java.util.Locale locale16 = new java.util.Locale("2:45:52 PM UTC");
        java.util.Locale locale18 = new java.util.Locale("zh");
        java.lang.String str19 = locale16.getDisplayScript(locale18);
        java.util.TimeZone timeZone21 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone21);
        java.lang.String str23 = fastDateFormat22.getPattern();
        java.text.ParsePosition parsePosition26 = new java.text.ParsePosition(16);
        parsePosition26.setIndex(11);
        java.lang.Object obj29 = fastDateFormat22.parseObject("FastDateFormat[]", parsePosition26);
        java.util.TimeZone timeZone30 = fastDateFormat22.getTimeZone();
        java.lang.String str31 = timeZone30.getID();
        java.util.Locale locale33 = new java.util.Locale("zh");
        java.lang.String str34 = locale33.getISO3Country();
        java.util.Calendar calendar35 = java.util.Calendar.getInstance(timeZone30, locale33);
        java.lang.String str36 = locale16.getDisplayName(locale33);
        java.util.Locale locale40 = new java.util.Locale("java.text.ParsePosition[index=16,errorIndex=-1]", "FastDateFormat[]", "FastDateFormat[]");
        java.util.Locale locale41 = locale40.stripExtensions();
        java.lang.String str42 = locale16.getDisplayLanguage(locale40);
        java.util.Calendar calendar43 = java.util.Calendar.getInstance(timeZone6, locale16);
        java.lang.Object obj44 = timeZone6.clone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar35 and calendar43", (calendar35.compareTo(calendar43) == 0) == calendar35.equals(calendar43));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone1);
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(timeZone1);
        timeZone1.setRawOffset(50);
        java.util.Locale locale9 = new java.util.Locale("2:45:52 PM UTC");
        java.util.Locale locale11 = new java.util.Locale("zh");
        java.lang.String str12 = locale9.getDisplayScript(locale11);
        java.util.TimeZone timeZone14 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone14);
        java.lang.String str16 = fastDateFormat15.getPattern();
        java.text.ParsePosition parsePosition19 = new java.text.ParsePosition(16);
        parsePosition19.setIndex(11);
        java.lang.Object obj22 = fastDateFormat15.parseObject("FastDateFormat[]", parsePosition19);
        java.util.TimeZone timeZone23 = fastDateFormat15.getTimeZone();
        java.lang.String str24 = timeZone23.getID();
        java.util.Locale locale26 = new java.util.Locale("zh");
        java.lang.String str27 = locale26.getISO3Country();
        java.util.Calendar calendar28 = java.util.Calendar.getInstance(timeZone23, locale26);
        java.lang.String str29 = locale9.getDisplayName(locale26);
        java.lang.String str30 = locale9.getISO3Country();
        java.lang.String str32 = locale9.getExtension('x');
        java.util.Calendar calendar33 = java.util.Calendar.getInstance(timeZone1, locale9);
        java.lang.String str35 = locale9.getExtension('x');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar5 and calendar28", (calendar5.compareTo(calendar28) == 0) == calendar5.equals(calendar28));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone1);
        java.lang.String str5 = timeZone1.getID();
        java.lang.String str6 = timeZone1.getID();
        java.util.Calendar calendar7 = java.util.Calendar.getInstance(timeZone1);
        java.util.Locale.Category category8 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale9 = java.util.Locale.TAIWAN;
        java.util.Locale locale10 = locale9.stripExtensions();
        java.util.Locale.setDefault(category8, locale9);
        java.util.Locale.setDefault(locale9);
        java.util.Set<java.lang.String> strSet13 = locale9.getUnicodeLocaleAttributes();
        java.lang.String str14 = locale9.getVariant();
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone1, locale9);
        java.util.Locale.Builder builder16 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder19 = builder16.setExtension('a', "France");
        java.util.Locale locale21 = java.util.Locale.forLanguageTag("h:mm:ss a z");
        java.util.Locale.Builder builder22 = builder19.setLocale(locale21);
        java.util.Locale.Category category23 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale24 = java.util.Locale.TAIWAN;
        java.util.Locale locale25 = locale24.stripExtensions();
        java.util.Locale.setDefault(category23, locale24);
        java.lang.String str27 = locale24.getDisplayCountry();
        java.lang.String str28 = locale21.getDisplayLanguage(locale24);
        java.lang.String str29 = locale9.getDisplayLanguage(locale21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar7 and calendar15", (calendar7.compareTo(calendar15) == 0) == calendar7.equals(calendar15));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
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
        java.util.TimeZone timeZone36 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone37 = java.util.TimeZone.getDefault();
        boolean boolean38 = timeZone36.hasSameRules(timeZone37);
        java.util.Locale locale42 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale43 = locale42.stripExtensions();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone36, locale42);
        java.lang.Object obj45 = fastDateFormat44.clone();
        java.text.ParsePosition parsePosition48 = new java.text.ParsePosition(16);
        int int49 = parsePosition48.getErrorIndex();
        java.lang.String str50 = parsePosition48.toString();
        java.lang.Object obj51 = null;
        boolean boolean52 = parsePosition48.equals(obj51);
        int int53 = parsePosition48.getIndex();
        int int54 = parsePosition48.getIndex();
        java.lang.Object obj55 = fastDateFormat44.parseObject("France", parsePosition48);
        java.lang.String str57 = fastDateFormat44.format((long) (byte) 100);
        java.util.TimeZone timeZone59 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat60 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone59);
        java.lang.String str61 = fastDateFormat60.getPattern();
        java.util.Date date62 = new java.util.Date();
        int int63 = date62.getSeconds();
        java.lang.String str64 = fastDateFormat60.format(date62);
        java.text.ParsePosition parsePosition67 = new java.text.ParsePosition(16);
        int int68 = parsePosition67.getErrorIndex();
        java.lang.Object obj69 = fastDateFormat60.parseObject("Temps universel coordonn\351", parsePosition67);
        java.util.Date date70 = new java.util.Date();
        int int71 = date70.getSeconds();
        java.util.Date date72 = new java.util.Date();
        int int73 = date72.getTimezoneOffset();
        date72.setMinutes(5);
        boolean boolean76 = date70.after(date72);
        long long77 = date72.getTime();
        java.util.Date date78 = new java.util.Date();
        int int79 = date78.getSeconds();
        boolean boolean80 = date72.before(date78);
        java.time.Instant instant81 = date78.toInstant();
        java.lang.String str82 = fastDateFormat60.format(date78);
        java.lang.StringBuffer stringBuffer83 = null;
        java.lang.StringBuffer stringBuffer84 = fastDateFormat44.format(date78, stringBuffer83);
        java.util.TimeZone timeZone86 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str87 = timeZone86.getID();
        java.util.TimeZone.setDefault(timeZone86);
        java.util.Calendar calendar89 = java.util.Calendar.getInstance(timeZone86);
        int int90 = calendar89.getFirstDayOfWeek();
        java.lang.StringBuffer stringBuffer91 = null;
        java.lang.StringBuffer stringBuffer92 = fastDateFormat44.format(calendar89, stringBuffer91);
        java.lang.String str93 = fastDateFormat2.format(calendar89);
        java.lang.String str94 = fastDateFormat2.getPattern();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar13 and calendar89", (calendar13.compareTo(calendar89) == 0) == calendar13.equals(calendar89));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        java.util.Locale locale1 = java.util.Locale.US;
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        java.util.TimeZone timeZone3 = calendar2.getTimeZone();
        java.util.Locale locale4 = java.util.Locale.US;
        java.lang.String str5 = locale4.getCountry();
        boolean boolean6 = locale4.hasExtensions();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, timeZone3, locale4);
        java.util.TimeZone timeZone8 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone9 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone10 = java.util.TimeZone.getDefault();
        boolean boolean11 = timeZone9.hasSameRules(timeZone10);
        boolean boolean12 = timeZone8.hasSameRules(timeZone9);
        boolean boolean13 = timeZone9.observesDaylightTime();
        java.util.TimeZone timeZone14 = java.util.TimeZone.getDefault();
        int int16 = timeZone14.getOffset((long) 2);
        java.util.Locale locale20 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale21 = locale20.stripExtensions();
        java.util.Calendar calendar22 = java.util.Calendar.getInstance(timeZone14, locale21);
        boolean boolean23 = timeZone9.hasSameRules(timeZone14);
        boolean boolean24 = timeZone3.hasSameRules(timeZone14);
        timeZone14.setRawOffset(21);
        java.util.Locale locale28 = java.util.Locale.forLanguageTag("\uc2dc\ubd84\ucd08' z");
        java.lang.String str29 = locale28.getCountry();
        java.util.Calendar calendar30 = java.util.Calendar.getInstance(timeZone14, locale28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar2 and calendar22", (calendar2.compareTo(calendar22) == 0) == calendar2.equals(calendar22));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
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
        java.lang.Object obj21 = fastDateFormat2.clone();
        java.util.TimeZone timeZone22 = fastDateFormat2.getTimeZone();
        java.util.Locale locale23 = java.util.Locale.CHINA;
        java.lang.String str25 = locale23.getExtension('x');
        java.util.Set<java.lang.Character> charSet26 = locale23.getExtensionKeys();
        java.util.Set<java.lang.String> strSet27 = locale23.getUnicodeLocaleAttributes();
        java.util.Calendar calendar28 = java.util.Calendar.getInstance(timeZone22, locale23);
        java.util.TimeZone.setDefault(timeZone22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar13 and calendar28", (calendar13.compareTo(calendar28) == 0) == calendar13.equals(calendar28));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
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
        calendar4.clear();
        java.util.TimeZone timeZone18 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        calendar4.setTimeZone(timeZone18);
        java.util.Locale locale21 = java.util.Locale.KOREA;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, locale21);
        java.lang.String str24 = fastDateFormat22.format((java.lang.Object) 1645454750118L);
        java.util.TimeZone timeZone25 = java.util.TimeZone.getDefault();
        int int27 = timeZone25.getOffset((long) 2);
        java.util.Locale locale31 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale32 = locale31.stripExtensions();
        java.util.Calendar calendar33 = java.util.Calendar.getInstance(timeZone25, locale32);
        int int35 = calendar33.getLeastMaximum(4);
        calendar33.setFirstDayOfWeek((-1));
        int int38 = calendar33.getFirstDayOfWeek();
        java.lang.String str39 = fastDateFormat22.format(calendar33);
        java.lang.Object obj40 = fastDateFormat22.clone();
        java.util.Date date41 = new java.util.Date();
        int int42 = date41.getSeconds();
        date41.setTime((long) 16);
        date41.setMinutes(12);
        int int47 = date41.getMinutes();
        java.util.Date date48 = new java.util.Date();
        int int49 = date48.getTimezoneOffset();
        date48.setMinutes(5);
        int int52 = date48.getMonth();
        boolean boolean53 = date41.before(date48);
        java.lang.String str54 = fastDateFormat22.format(date41);
        java.util.TimeZone timeZone55 = java.util.TimeZone.getDefault();
        int int57 = timeZone55.getOffset((long) 2);
        java.util.Locale locale61 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale62 = locale61.stripExtensions();
        java.util.Calendar calendar63 = java.util.Calendar.getInstance(timeZone55, locale62);
        calendar63.set(122, 52, (int) (byte) 1);
        calendar63.setMinimalDaysInFirstWeek(8);
        java.util.Date date75 = new java.util.Date(3, 16, 11, 8, 51);
        calendar63.setTime(date75);
        java.lang.String str77 = fastDateFormat22.format(calendar63);
        java.util.Date date78 = new java.util.Date();
        int int79 = date78.getSeconds();
        long long80 = date78.getTime();
        date78.setTime((long) (byte) 0);
        boolean boolean83 = calendar63.after((java.lang.Object) date78);
        boolean boolean84 = timeZone18.inDaylightTime(date78);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar14 and calendar33", (calendar14.compareTo(calendar33) == 0) == calendar14.equals(calendar33));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
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
        java.util.TimeZone timeZone40 = calendar37.getTimeZone();
        timeZone40.setRawOffset(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar27 and calendar37", (calendar27.compareTo(calendar37) == 0) == calendar27.equals(calendar37));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
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
        java.util.TimeZone timeZone17 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone17);
        java.lang.String str19 = fastDateFormat18.toString();
        java.util.Date date25 = new java.util.Date(3, (int) (short) 0, 6, 0, (int) (short) 1);
        java.util.Date date26 = new java.util.Date();
        int int27 = date26.getTimezoneOffset();
        long long28 = date26.getTime();
        boolean boolean29 = date25.after(date26);
        java.lang.StringBuffer stringBuffer30 = null;
        java.lang.StringBuffer stringBuffer31 = fastDateFormat18.format(date25, stringBuffer30);
        java.util.Calendar calendar32 = java.util.Calendar.getInstance();
        java.lang.StringBuffer stringBuffer33 = null;
        java.lang.StringBuffer stringBuffer34 = fastDateFormat18.format(calendar32, stringBuffer33);
        int int35 = calendar32.getWeekYear();
        java.lang.String str36 = fastDateFormat2.format((java.lang.Object) calendar32);
        java.util.TimeZone timeZone38 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str39 = timeZone38.getID();
        java.util.TimeZone.setDefault(timeZone38);
        java.util.Calendar calendar41 = java.util.Calendar.getInstance(timeZone38);
        int int42 = calendar41.getFirstDayOfWeek();
        java.util.TimeZone timeZone43 = java.util.TimeZone.getDefault();
        int int45 = timeZone43.getOffset((long) 2);
        java.util.Locale locale49 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale50 = locale49.stripExtensions();
        java.util.Calendar calendar51 = java.util.Calendar.getInstance(timeZone43, locale50);
        calendar41.setTimeZone(timeZone43);
        calendar41.set(11, 11);
        int int57 = calendar41.getGreatestMinimum(5);
        calendar41.set((int) (short) -1, 9, 50, (int) '#', 31, 9);
        java.lang.String str65 = fastDateFormat2.format(calendar41);
        calendar41.set(59, 4, 3, 102, 28);
        java.lang.String str72 = calendar41.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar32 and calendar51", (calendar32.compareTo(calendar51) == 0) == calendar32.equals(calendar51));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
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
        java.util.TimeZone timeZone36 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str37 = timeZone36.getID();
        java.util.TimeZone.setDefault(timeZone36);
        java.util.Calendar calendar39 = java.util.Calendar.getInstance(timeZone36);
        int int40 = calendar39.getFirstDayOfWeek();
        java.util.TimeZone timeZone41 = java.util.TimeZone.getDefault();
        int int43 = timeZone41.getOffset((long) 2);
        java.util.Locale locale47 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale48 = locale47.stripExtensions();
        java.util.Calendar calendar49 = java.util.Calendar.getInstance(timeZone41, locale48);
        calendar39.setTimeZone(timeZone41);
        java.lang.String str51 = timeZone41.getID();
        java.util.Calendar calendar52 = java.util.Calendar.getInstance(timeZone41);
        java.util.TimeZone timeZone53 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone54 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone55 = java.util.TimeZone.getDefault();
        boolean boolean56 = timeZone54.hasSameRules(timeZone55);
        boolean boolean57 = timeZone53.hasSameRules(timeZone54);
        timeZone54.setID("Mon Feb 21 14:45:50 GMT 2022");
        boolean boolean60 = timeZone41.hasSameRules(timeZone54);
        boolean boolean61 = timeZone32.hasSameRules(timeZone41);
        java.util.Calendar calendar62 = java.util.Calendar.getInstance(timeZone32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar39 and calendar49", (calendar39.compareTo(calendar49) == 0) == calendar39.equals(calendar49));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
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
        java.util.Locale locale18 = java.util.Locale.forLanguageTag("1 Jan 1970 00:51:00 GMT");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone7, locale18);
        java.util.Locale.setDefault(locale18);
        java.util.TimeZone timeZone21 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone23 = java.util.TimeZone.getDefault();
        boolean boolean24 = timeZone22.hasSameRules(timeZone23);
        boolean boolean25 = timeZone21.hasSameRules(timeZone22);
        java.util.TimeZone timeZone27 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str28 = timeZone27.getID();
        boolean boolean29 = timeZone22.hasSameRules(timeZone27);
        timeZone27.setRawOffset(126);
        java.util.Locale locale32 = java.util.Locale.ROOT;
        java.util.Calendar calendar33 = java.util.Calendar.getInstance(timeZone27, locale32);
        java.lang.String str34 = locale32.getCountry();
        java.lang.String str35 = locale32.getISO3Country();
        java.util.Set<java.lang.String> strSet36 = locale32.getUnicodeLocaleAttributes();
        java.lang.String str37 = locale18.getDisplayCountry(locale32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar15 and calendar33", (calendar15.compareTo(calendar33) == 0) == calendar15.equals(calendar33));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 2);
        java.util.Locale locale6 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale7 = locale6.stripExtensions();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone0, locale7);
        calendar8.set(122, 52, (int) (byte) 1);
        int int13 = calendar8.getWeeksInWeekYear();
        boolean boolean14 = calendar8.isWeekDateSupported();
        calendar8.setFirstDayOfWeek(1);
        int int17 = calendar8.getWeekYear();
        int int18 = calendar8.getMinimalDaysInFirstWeek();
        java.util.Date date22 = new java.util.Date(56, 7, 1969);
        date22.setDate(32770);
        java.util.TimeZone timeZone25 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone26 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone27 = java.util.TimeZone.getDefault();
        boolean boolean28 = timeZone26.hasSameRules(timeZone27);
        boolean boolean29 = timeZone25.hasSameRules(timeZone26);
        boolean boolean30 = timeZone26.observesDaylightTime();
        timeZone26.setRawOffset(52);
        timeZone26.setID("Temps universel coordonn\351");
        java.util.Locale locale36 = new java.util.Locale("zh");
        java.util.Locale locale37 = java.util.Locale.CHINESE;
        java.lang.String str38 = locale37.getLanguage();
        boolean boolean39 = locale37.hasExtensions();
        java.lang.String str40 = locale37.getDisplayCountry();
        java.lang.String str41 = locale36.getDisplayName(locale37);
        java.util.Calendar calendar42 = java.util.Calendar.getInstance(timeZone26, locale36);
        calendar42.clear();
        long long44 = calendar42.getTimeInMillis();
        calendar42.roll(9, 16);
        java.util.Date date48 = new java.util.Date();
        int int49 = date48.getDay();
        calendar42.setTime(date48);
        java.time.Instant instant51 = calendar42.toInstant();
        java.util.Date date52 = java.util.Date.from(instant51);
        boolean boolean53 = date22.before(date52);
        calendar8.setTime(date52);
        int int55 = date52.getDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar8 and calendar42", (calendar8.compareTo(calendar42) == 0) == calendar8.equals(calendar42));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setTimeOfDay(16, (int) ' ', 16);
        java.util.Calendar.Builder builder6 = builder4.setLenient(true);
        java.util.Calendar calendar7 = builder4.build();
        java.util.Locale locale8 = java.util.Locale.FRANCE;
        java.lang.String str9 = locale8.getLanguage();
        java.lang.String str10 = locale8.getDisplayVariant();
        java.util.Locale.setDefault(locale8);
        java.lang.String str12 = locale8.getDisplayScript();
        java.util.Calendar.Builder builder13 = builder4.setLocale(locale8);
        java.util.TimeZone timeZone14 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone15 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone16 = java.util.TimeZone.getDefault();
        boolean boolean17 = timeZone15.hasSameRules(timeZone16);
        boolean boolean18 = timeZone14.hasSameRules(timeZone15);
        java.lang.String str19 = timeZone15.getID();
        java.lang.String str20 = timeZone15.getID();
        java.util.Calendar calendar21 = java.util.Calendar.getInstance(timeZone15);
        java.util.Locale.Category category22 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale23 = java.util.Locale.TAIWAN;
        java.util.Locale locale24 = locale23.stripExtensions();
        java.util.Locale.setDefault(category22, locale23);
        java.util.Locale.setDefault(locale23);
        java.util.Set<java.lang.String> strSet27 = locale23.getUnicodeLocaleAttributes();
        java.lang.String str28 = locale23.getVariant();
        java.util.Calendar calendar29 = java.util.Calendar.getInstance(timeZone15, locale23);
        java.util.Calendar.Builder builder30 = builder4.setTimeZone(timeZone15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar21 and calendar29", (calendar21.compareTo(calendar29) == 0) == calendar21.equals(calendar29));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
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
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap32 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList33 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap32);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap34 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList35 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList33, strMap34);
        java.util.Locale.LanguageRange[] languageRangeArray36 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList37 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList37, languageRangeArray36);
        java.util.Locale locale39 = java.util.Locale.GERMAN;
        java.util.Locale locale40 = java.util.Locale.FRANCE;
        boolean boolean41 = locale40.hasExtensions();
        java.util.Locale locale42 = java.util.Locale.FRANCE;
        java.util.Locale locale43 = java.util.Locale.CHINESE;
        java.lang.String str44 = locale43.getLanguage();
        java.util.Locale[] localeArray45 = new java.util.Locale[] { locale39, locale40, locale42, locale43 };
        java.util.ArrayList<java.util.Locale> localeList46 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList46, localeArray45);
        java.util.Locale.FilteringMode filteringMode48 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList49 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, (java.util.Collection<java.util.Locale>) localeList46, filteringMode48);
        java.util.Locale.LanguageRange[] languageRangeArray50 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList51 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList51, languageRangeArray50);
        java.util.Locale locale53 = java.util.Locale.GERMAN;
        java.util.Locale locale54 = java.util.Locale.FRANCE;
        boolean boolean55 = locale54.hasExtensions();
        java.util.Locale locale56 = java.util.Locale.FRANCE;
        java.util.Locale locale57 = java.util.Locale.CHINESE;
        java.lang.String str58 = locale57.getLanguage();
        java.util.Locale[] localeArray59 = new java.util.Locale[] { locale53, locale54, locale56, locale57 };
        java.util.ArrayList<java.util.Locale> localeList60 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList60, localeArray59);
        java.util.Locale.FilteringMode filteringMode62 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList63 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList51, (java.util.Collection<java.util.Locale>) localeList60, filteringMode62);
        java.util.Spliterator<java.util.Locale> localeSpliterator64 = localeList63.spliterator();
        java.util.Iterator<java.util.Locale> localeItor65 = localeList63.iterator();
        int int66 = localeList63.size();
        java.util.Locale locale67 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, (java.util.Collection<java.util.Locale>) localeList63);
        java.util.TimeZone timeZone68 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone69 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone70 = java.util.TimeZone.getDefault();
        boolean boolean71 = timeZone69.hasSameRules(timeZone70);
        boolean boolean72 = timeZone68.hasSameRules(timeZone69);
        boolean boolean73 = timeZone69.observesDaylightTime();
        java.util.TimeZone timeZone74 = java.util.TimeZone.getDefault();
        int int76 = timeZone74.getOffset((long) 2);
        java.util.Locale locale80 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale81 = locale80.stripExtensions();
        java.util.Calendar calendar82 = java.util.Calendar.getInstance(timeZone74, locale81);
        boolean boolean83 = timeZone69.hasSameRules(timeZone74);
        java.util.Calendar calendar84 = java.util.Calendar.getInstance(timeZone74);
        timeZone74.setRawOffset(32770);
        int int87 = localeList63.lastIndexOf((java.lang.Object) 32770);
        java.util.List<java.util.Locale> localeList88 = java.util.Locale.filter(languageRangeList35, (java.util.Collection<java.util.Locale>) localeList63);
        boolean boolean90 = localeList63.equals((java.lang.Object) 97);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar82 and calendar84", (calendar82.compareTo(calendar84) == 0) == calendar82.equals(calendar84));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
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
        java.util.TimeZone timeZone17 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone18 = java.util.TimeZone.getDefault();
        boolean boolean19 = timeZone17.hasSameRules(timeZone18);
        java.util.Locale locale23 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale24 = locale23.stripExtensions();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone17, locale23);
        java.lang.Object obj26 = fastDateFormat25.clone();
        boolean boolean27 = calendar4.after((java.lang.Object) fastDateFormat25);
        java.util.Locale locale28 = fastDateFormat25.getLocale();
        java.util.Set<java.lang.Character> charSet29 = locale28.getExtensionKeys();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar4 and calendar14", (calendar4.compareTo(calendar14) == 0) == calendar4.equals(calendar14));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
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
        java.util.Calendar calendar16 = java.util.Calendar.getInstance(timeZone6);
        java.util.TimeZone timeZone20 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone20);
        java.lang.String str22 = fastDateFormat21.getPattern();
        java.text.ParsePosition parsePosition25 = new java.text.ParsePosition(16);
        parsePosition25.setIndex(11);
        java.lang.Object obj28 = fastDateFormat21.parseObject("FastDateFormat[]", parsePosition25);
        boolean boolean29 = fastDateFormat21.getTimeZoneOverridesCalendar();
        java.text.AttributedCharacterIterator attributedCharacterIterator31 = fastDateFormat21.formatToCharacterIterator((java.lang.Object) 1645454754924L);
        java.util.Locale locale32 = fastDateFormat21.getLocale();
        java.util.Map<java.lang.String, java.lang.Integer> strMap33 = calendar16.getDisplayNames(2, 0, locale32);
        java.lang.String str34 = locale32.getDisplayScript();
        java.lang.String str35 = locale32.getDisplayCountry();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar14 and calendar16", (calendar14.compareTo(calendar16) == 0) == calendar14.equals(calendar16));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
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
        calendar8.setFirstDayOfWeek(3);
        java.util.Date date19 = calendar8.getTime();
        java.util.TimeZone timeZone20 = java.util.TimeZone.getDefault();
        int int22 = timeZone20.getOffset((long) 2);
        java.util.Locale locale26 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale27 = locale26.stripExtensions();
        java.util.Calendar calendar28 = java.util.Calendar.getInstance(timeZone20, locale27);
        calendar28.set(122, 52, (int) (byte) 1);
        java.lang.String str33 = calendar28.getCalendarType();
        int int34 = calendar28.getWeekYear();
        calendar28.clear();
        calendar28.setLenient(true);
        calendar28.setLenient(true);
        java.util.Date date40 = calendar28.getTime();
        java.lang.String str41 = date40.toGMTString();
        calendar8.setTime(date40);
        int int43 = date40.getSeconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar8 and calendar28", (calendar8.compareTo(calendar28) == 0) == calendar8.equals(calendar28));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone1);
        java.lang.String str4 = fastDateFormat2.format((long) '#');
        boolean boolean5 = fastDateFormat2.getTimeZoneOverridesCalendar();
        java.lang.String str7 = fastDateFormat2.format(100L);
        java.lang.String str9 = fastDateFormat2.format((long) 8);
        java.util.Locale locale10 = fastDateFormat2.getLocale();
        java.util.Locale locale11 = java.util.Locale.US;
        java.lang.String str12 = locale11.getDisplayVariant();
        java.util.Locale locale13 = java.util.Locale.FRANCE;
        boolean boolean14 = locale13.hasExtensions();
        java.util.Locale locale15 = java.util.Locale.ROOT;
        java.lang.String str16 = locale13.getDisplayName(locale15);
        java.lang.String str17 = locale15.getCountry();
        java.lang.String str18 = locale11.getDisplayVariant(locale15);
        java.util.Calendar calendar19 = java.util.Calendar.getInstance(locale15);
        calendar19.setMinimalDaysInFirstWeek(9);
        calendar19.clear(0);
        boolean boolean24 = fastDateFormat2.equals((java.lang.Object) 0);
        java.util.TimeZone timeZone25 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone26 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone27 = java.util.TimeZone.getDefault();
        boolean boolean28 = timeZone26.hasSameRules(timeZone27);
        boolean boolean29 = timeZone25.hasSameRules(timeZone26);
        boolean boolean30 = timeZone26.observesDaylightTime();
        timeZone26.setRawOffset(52);
        java.util.Locale locale33 = java.util.Locale.CHINESE;
        java.lang.String str34 = locale33.getLanguage();
        java.util.Calendar calendar35 = java.util.Calendar.getInstance(timeZone26, locale33);
        java.lang.String str36 = fastDateFormat2.format(calendar35);
        java.lang.String str38 = fastDateFormat2.format((long) 5);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar19 and calendar35", (calendar19.compareTo(calendar35) == 0) == calendar19.equals(calendar35));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
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
        java.lang.Object obj21 = fastDateFormat2.clone();
        java.util.TimeZone timeZone22 = fastDateFormat2.getTimeZone();
        java.util.Locale locale23 = java.util.Locale.CHINA;
        java.lang.String str25 = locale23.getExtension('x');
        java.util.Set<java.lang.Character> charSet26 = locale23.getExtensionKeys();
        java.util.Set<java.lang.String> strSet27 = locale23.getUnicodeLocaleAttributes();
        java.util.Calendar calendar28 = java.util.Calendar.getInstance(timeZone22, locale23);
        java.util.Locale locale30 = new java.util.Locale("\uc624\ud6c4\uc2dc\ubd84\ucd08 UTC");
        java.util.Locale.Builder builder32 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder35 = builder32.setExtension('a', "France");
        java.util.Locale.Builder builder37 = builder32.removeUnicodeLocaleAttribute("GMT");
        java.util.Locale locale38 = builder32.build();
        java.lang.String str39 = locale38.getDisplayCountry();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang3.time.FastDateFormat.getInstance("\u53f0\u7063", locale38);
        java.util.Locale locale42 = new java.util.Locale("2:45:52 PM UTC");
        java.lang.String str43 = locale42.getDisplayVariant();
        java.lang.String str44 = locale38.getDisplayName(locale42);
        java.lang.String str45 = locale30.getDisplayLanguage(locale42);
        java.lang.String str46 = timeZone22.getDisplayName(locale42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar13 and calendar28", (calendar13.compareTo(calendar28) == 0) == calendar13.equals(calendar28));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        java.util.Locale locale0 = java.util.Locale.US;
        java.lang.String str1 = locale0.getDisplayVariant();
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        boolean boolean3 = locale2.hasExtensions();
        java.util.Locale locale4 = java.util.Locale.ROOT;
        java.lang.String str5 = locale2.getDisplayName(locale4);
        java.lang.String str6 = locale4.getCountry();
        java.lang.String str7 = locale0.getDisplayVariant(locale4);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale4);
        java.lang.String str9 = locale4.getDisplayScript();
        java.lang.String str10 = locale4.toLanguageTag();
        java.util.Locale.LanguageRange[] languageRangeArray11 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList12 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList12, languageRangeArray11);
        java.util.Locale locale14 = java.util.Locale.GERMAN;
        java.util.Locale locale15 = java.util.Locale.FRANCE;
        boolean boolean16 = locale15.hasExtensions();
        java.util.Locale locale17 = java.util.Locale.FRANCE;
        java.util.Locale locale18 = java.util.Locale.CHINESE;
        java.lang.String str19 = locale18.getLanguage();
        java.util.Locale[] localeArray20 = new java.util.Locale[] { locale14, locale15, locale17, locale18 };
        java.util.ArrayList<java.util.Locale> localeList21 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList21, localeArray20);
        java.util.Locale.FilteringMode filteringMode23 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList24 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, (java.util.Collection<java.util.Locale>) localeList21, filteringMode23);
        java.util.Spliterator<java.util.Locale> localeSpliterator25 = localeList24.spliterator();
        java.lang.Object[] objArray26 = localeList24.toArray();
        localeList24.clear();
        java.text.Format.Field field28 = null;
        java.text.FieldPosition fieldPosition29 = new java.text.FieldPosition(field28);
        boolean boolean30 = localeList24.equals((java.lang.Object) fieldPosition29);
        int int32 = localeList24.lastIndexOf((java.lang.Object) 1645454769350L);
        java.util.Locale locale33 = java.util.Locale.CHINESE;
        java.lang.String str34 = locale33.getLanguage();
        boolean boolean35 = locale33.hasExtensions();
        java.lang.String str36 = locale33.getDisplayCountry();
        java.util.Set<java.lang.String> strSet37 = locale33.getUnicodeLocaleKeys();
        boolean boolean38 = localeList24.contains((java.lang.Object) locale33);
        java.util.Locale.Category category39 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale40 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(category39, locale40);
        java.util.Locale locale42 = java.util.Locale.KOREA;
        java.lang.String str43 = locale42.getScript();
        java.util.Locale locale44 = java.util.Locale.FRANCE;
        java.lang.String str45 = locale42.getDisplayVariant(locale44);
        java.util.Locale.setDefault(category39, locale42);
        java.util.Locale locale47 = java.util.Locale.US;
        java.lang.String str48 = locale47.getDisplayVariant();
        java.util.Set<java.lang.String> strSet49 = locale47.getUnicodeLocaleAttributes();
        java.lang.String str50 = locale47.getISO3Country();
        java.lang.String str51 = locale47.getLanguage();
        java.util.Locale.setDefault(category39, locale47);
        java.util.Locale locale53 = java.util.Locale.getDefault(category39);
        java.util.Locale locale54 = java.util.Locale.getDefault(category39);
        java.lang.String str55 = locale33.getDisplayVariant(locale54);
        java.util.Locale locale57 = java.util.Locale.forLanguageTag("1:08:08 AM GMT");
        java.lang.String str58 = locale57.getLanguage();
        java.lang.String str59 = locale54.getDisplayName(locale57);
        java.lang.String str60 = locale4.getDisplayName(locale57);
        java.util.TimeZone timeZone61 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone62 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone63 = java.util.TimeZone.getDefault();
        boolean boolean64 = timeZone62.hasSameRules(timeZone63);
        boolean boolean65 = timeZone61.hasSameRules(timeZone62);
        boolean boolean66 = timeZone62.observesDaylightTime();
        timeZone62.setRawOffset(52);
        timeZone62.setID("Temps universel coordonn\351");
        java.util.Locale locale72 = new java.util.Locale("zh");
        java.util.Locale locale73 = java.util.Locale.CHINESE;
        java.lang.String str74 = locale73.getLanguage();
        boolean boolean75 = locale73.hasExtensions();
        java.lang.String str76 = locale73.getDisplayCountry();
        java.lang.String str77 = locale72.getDisplayName(locale73);
        java.util.Calendar calendar78 = java.util.Calendar.getInstance(timeZone62, locale72);
        java.lang.String str79 = locale72.getLanguage();
        java.lang.String str80 = locale72.getDisplayScript();
        java.lang.String str81 = locale57.getDisplayLanguage(locale72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar8 and calendar78", (calendar8.compareTo(calendar78) == 0) == calendar8.equals(calendar78));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 2);
        java.util.Locale locale6 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale7 = locale6.stripExtensions();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone0, locale7);
        calendar8.set(122, 52, (int) (byte) 1);
        int int13 = calendar8.getWeeksInWeekYear();
        calendar8.add(13, 0);
        calendar8.set(17, 4, 58, 32769, 7, 54);
        int int25 = calendar8.getLeastMaximum(15);
        java.util.TimeZone timeZone26 = calendar8.getTimeZone();
        java.util.TimeZone timeZone27 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone28 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone29 = java.util.TimeZone.getDefault();
        boolean boolean30 = timeZone28.hasSameRules(timeZone29);
        boolean boolean31 = timeZone27.hasSameRules(timeZone28);
        java.lang.String str32 = timeZone28.getID();
        java.lang.String str33 = timeZone28.getID();
        java.util.Calendar calendar34 = java.util.Calendar.getInstance(timeZone28);
        java.util.Locale.Category category35 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale36 = java.util.Locale.TAIWAN;
        java.util.Locale locale37 = locale36.stripExtensions();
        java.util.Locale.setDefault(category35, locale36);
        java.util.Locale.setDefault(locale36);
        java.util.Set<java.lang.String> strSet40 = locale36.getUnicodeLocaleAttributes();
        java.lang.String str41 = locale36.getVariant();
        java.util.Calendar calendar42 = java.util.Calendar.getInstance(timeZone28, locale36);
        java.lang.String str43 = timeZone28.getID();
        boolean boolean44 = timeZone26.hasSameRules(timeZone28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar34 and calendar42", (calendar34.compareTo(calendar42) == 0) == calendar34.equals(calendar42));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 2);
        java.util.Locale locale6 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale7 = locale6.stripExtensions();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone0, locale7);
        int int10 = calendar8.getLeastMaximum(4);
        calendar8.setFirstDayOfWeek((-1));
        calendar8.setMinimalDaysInFirstWeek((int) (short) -1);
        java.time.Instant instant15 = calendar8.toInstant();
        java.util.TimeZone timeZone16 = calendar8.getTimeZone();
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(timeZone16);
        int int18 = timeZone16.getDSTSavings();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar8 and calendar17", (calendar8.compareTo(calendar17) == 0) == calendar8.equals(calendar17));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        java.util.Calendar.Builder builder1 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder5 = builder1.setWeekDate(5, (int) (byte) -1, 1);
        java.util.Calendar.Builder builder7 = builder5.setLenient(true);
        java.util.Calendar.Builder builder11 = builder7.setTimeOfDay(122, 11, 10);
        java.util.Calendar.Builder builder15 = builder11.setWeekDate(100, 9, 2);
        java.util.Calendar.Builder builder19 = builder15.setTimeOfDay(52, (int) (short) 10, (-1));
        java.util.Calendar.Builder builder21 = builder19.setLenient(true);
        java.util.Calendar.Builder builder24 = builder19.set(2, 54);
        java.util.Calendar calendar25 = builder19.build();
        java.util.TimeZone timeZone26 = calendar25.getTimeZone();
        java.util.Locale locale30 = new java.util.Locale("en-US", "", "java.util.GregorianCalendar[time=1645454758976,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=45,SECOND=58,MILLISECOND=976,ZONE_OFFSET=0,DST_OFFSET=0]");
        java.lang.String str31 = locale30.getScript();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone26, locale30);
        java.util.TimeZone timeZone34 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone35 = java.util.TimeZone.getDefault();
        boolean boolean36 = timeZone34.hasSameRules(timeZone35);
        java.util.Locale locale40 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale41 = locale40.stripExtensions();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone34, locale40);
        java.util.TimeZone timeZone43 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone44 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone45 = java.util.TimeZone.getDefault();
        boolean boolean46 = timeZone44.hasSameRules(timeZone45);
        boolean boolean47 = timeZone43.hasSameRules(timeZone44);
        boolean boolean48 = timeZone44.observesDaylightTime();
        timeZone44.setRawOffset(52);
        timeZone44.setID("Temps universel coordonn\351");
        java.util.Locale locale54 = new java.util.Locale("zh");
        java.util.Locale locale55 = java.util.Locale.CHINESE;
        java.lang.String str56 = locale55.getLanguage();
        boolean boolean57 = locale55.hasExtensions();
        java.lang.String str58 = locale55.getDisplayCountry();
        java.lang.String str59 = locale54.getDisplayName(locale55);
        java.util.Calendar calendar60 = java.util.Calendar.getInstance(timeZone44, locale54);
        java.lang.String str61 = fastDateFormat42.format(calendar60);
        java.util.TimeZone timeZone62 = java.util.TimeZone.getDefault();
        int int64 = timeZone62.getOffset((long) 2);
        java.util.Locale locale68 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale69 = locale68.stripExtensions();
        java.util.Calendar calendar70 = java.util.Calendar.getInstance(timeZone62, locale69);
        java.lang.StringBuffer stringBuffer71 = null;
        java.lang.StringBuffer stringBuffer72 = fastDateFormat42.format(calendar70, stringBuffer71);
        java.util.TimeZone timeZone73 = calendar70.getTimeZone();
        java.lang.String str74 = fastDateFormat32.format((java.lang.Object) calendar70);
        boolean boolean75 = fastDateFormat32.getTimeZoneOverridesCalendar();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar60 and calendar70", (calendar60.compareTo(calendar70) == 0) == calendar60.equals(calendar70));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
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
        java.time.ZoneId zoneId13 = timeZone8.toZoneId();
        java.util.TimeZone timeZone14 = java.util.TimeZone.getTimeZone(zoneId13);
        java.util.TimeZone timeZone15 = java.util.TimeZone.getTimeZone(zoneId13);
        java.util.TimeZone timeZone16 = java.util.TimeZone.getTimeZone(zoneId13);
        timeZone16.setID("java.util.GregorianCalendar[time=1645454780717,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=20,MILLISECOND=717,ZONE_OFFSET=0,DST_OFFSET=0]");
        java.util.Locale locale21 = new java.util.Locale("Coordinated Universal Time", "h:mm:ss a z");
        java.util.Locale locale23 = java.util.Locale.forLanguageTag("2:46:18 PM UTC");
        java.lang.String str24 = locale23.getVariant();
        java.util.Locale locale25 = java.util.Locale.US;
        java.util.Locale locale26 = locale25.stripExtensions();
        java.util.Locale locale27 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet28 = locale27.getUnicodeLocaleKeys();
        java.lang.String str29 = locale26.getDisplayVariant(locale27);
        java.lang.String str30 = locale23.getDisplayVariant(locale27);
        java.lang.String str31 = locale21.getDisplayLanguage(locale27);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone16, locale27);
        int int33 = timeZone16.getRawOffset();
        java.util.TimeZone timeZone34 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone35 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone36 = java.util.TimeZone.getDefault();
        boolean boolean37 = timeZone35.hasSameRules(timeZone36);
        boolean boolean38 = timeZone34.hasSameRules(timeZone35);
        boolean boolean39 = timeZone35.observesDaylightTime();
        timeZone35.setRawOffset(52);
        timeZone35.setID("Temps universel coordonn\351");
        java.util.Locale locale45 = new java.util.Locale("zh");
        java.util.Locale locale46 = java.util.Locale.CHINESE;
        java.lang.String str47 = locale46.getLanguage();
        boolean boolean48 = locale46.hasExtensions();
        java.lang.String str49 = locale46.getDisplayCountry();
        java.lang.String str50 = locale45.getDisplayName(locale46);
        java.util.Calendar calendar51 = java.util.Calendar.getInstance(timeZone35, locale45);
        calendar51.clear();
        long long53 = calendar51.getTimeInMillis();
        java.util.Date date54 = new java.util.Date();
        int int55 = date54.getTimezoneOffset();
        date54.setMinutes(5);
        int int58 = date54.getMonth();
        calendar51.setTime(date54);
        java.util.TimeZone timeZone60 = calendar51.getTimeZone();
        java.util.Calendar calendar61 = java.util.Calendar.getInstance(timeZone60);
        boolean boolean62 = timeZone16.hasSameRules(timeZone60);
        java.util.TimeZone timeZone64 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat65 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone64);
        java.lang.String str66 = fastDateFormat65.getPattern();
        java.text.ParsePosition parsePosition69 = new java.text.ParsePosition(16);
        parsePosition69.setIndex(11);
        java.lang.Object obj72 = fastDateFormat65.parseObject("FastDateFormat[]", parsePosition69);
        java.util.TimeZone timeZone73 = fastDateFormat65.getTimeZone();
        java.util.TimeZone timeZone74 = fastDateFormat65.getTimeZone();
        java.util.TimeZone timeZone75 = null;
        boolean boolean76 = timeZone74.hasSameRules(timeZone75);
        int int78 = timeZone74.getOffset(1645454772335L);
        java.util.Calendar calendar79 = java.util.Calendar.getInstance(timeZone74);
        boolean boolean80 = timeZone60.hasSameRules(timeZone74);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar61 and calendar79", (calendar61.compareTo(calendar79) == 0) == calendar61.equals(calendar79));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        java.text.AttributedCharacterIterator.Attribute attribute0 = java.text.AttributedCharacterIterator.Attribute.INPUT_METHOD_SEGMENT;
        boolean boolean2 = attribute0.equals((java.lang.Object) "\uc624\ud6c4\uc2dc\ubd84\ucd08 GMT");
        java.lang.String str3 = attribute0.toString();
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar7 = java.util.Calendar.getInstance(timeZone5, locale6);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone5);
        boolean boolean9 = attribute0.equals((java.lang.Object) timeZone5);
        java.lang.String str10 = attribute0.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar7 and calendar8", (calendar7.compareTo(calendar8) == 0) == calendar7.equals(calendar8));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("\uc624\ud6c4\uc2dc\ubd84\ucd08 GMT");
        java.util.Locale locale5 = new java.util.Locale("\uc624\ud6c4\uc2dc\ubd84\ucd08 GMT", "Wed Mar 16 08:10:49 GMT 2022");
        java.util.TimeZone timeZone7 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone7);
        java.lang.String str9 = fastDateFormat8.getPattern();
        java.text.ParsePosition parsePosition12 = new java.text.ParsePosition(16);
        parsePosition12.setIndex(11);
        java.lang.Object obj15 = fastDateFormat8.parseObject("FastDateFormat[]", parsePosition12);
        java.util.TimeZone timeZone16 = fastDateFormat8.getTimeZone();
        java.lang.String str17 = timeZone16.getID();
        java.util.Locale locale19 = new java.util.Locale("zh");
        java.lang.String str20 = locale19.getISO3Country();
        java.util.Calendar calendar21 = java.util.Calendar.getInstance(timeZone16, locale19);
        java.lang.String str22 = locale19.getCountry();
        java.lang.String str23 = locale5.getDisplayName(locale19);
        java.util.Locale.Category category24 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale25 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(category24, locale25);
        java.util.Locale locale27 = java.util.Locale.KOREA;
        java.lang.String str28 = locale27.getScript();
        java.util.Locale locale29 = java.util.Locale.FRANCE;
        java.lang.String str30 = locale27.getDisplayVariant(locale29);
        java.util.Locale.setDefault(category24, locale27);
        java.util.Locale locale32 = java.util.Locale.ROOT;
        java.util.Locale.Builder builder33 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder36 = builder33.setExtension('a', "France");
        java.util.Locale.Builder builder38 = builder33.removeUnicodeLocaleAttribute("GMT");
        java.util.Locale locale39 = java.util.Locale.FRANCE;
        java.lang.String str40 = locale39.getVariant();
        java.lang.String str41 = locale39.getDisplayCountry();
        java.util.Locale.Builder builder42 = builder33.setLocale(locale39);
        java.util.Locale locale44 = new java.util.Locale("zh");
        java.lang.String str45 = locale39.getDisplayName(locale44);
        java.lang.String str46 = locale32.getDisplayName(locale39);
        java.lang.String str47 = locale32.getDisplayScript();
        java.util.Locale locale48 = locale32.stripExtensions();
        java.util.Locale.setDefault(category24, locale32);
        java.util.Locale locale50 = java.util.Locale.CHINESE;
        java.lang.String str51 = locale50.getLanguage();
        boolean boolean52 = locale50.hasExtensions();
        java.lang.String str53 = locale50.getDisplayCountry();
        java.lang.String str54 = locale50.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet55 = locale50.getUnicodeLocaleKeys();
        java.lang.String str56 = locale50.getCountry();
        java.util.Locale.setDefault(category24, locale50);
        java.util.Locale locale58 = java.util.Locale.CHINA;
        boolean boolean59 = locale58.hasExtensions();
        java.lang.String str60 = locale58.getDisplayVariant();
        java.lang.String str61 = locale58.getCountry();
        java.lang.String str62 = locale50.getDisplayScript(locale58);
        java.lang.String str63 = locale50.getScript();
        java.lang.String str64 = locale19.getDisplayVariant(locale50);
        java.util.Calendar calendar65 = java.util.Calendar.getInstance(timeZone2, locale50);
        java.util.Locale locale67 = new java.util.Locale("zh");
        java.util.Locale locale68 = java.util.Locale.CHINESE;
        java.lang.String str69 = locale68.getLanguage();
        boolean boolean70 = locale68.hasExtensions();
        java.lang.String str71 = locale68.getDisplayCountry();
        java.lang.String str72 = locale67.getDisplayName(locale68);
        java.lang.String str73 = locale67.toLanguageTag();
        java.lang.String str74 = locale67.getDisplayCountry();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat75 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(1, timeZone2, locale67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar21 and calendar65", (calendar21.compareTo(calendar65) == 0) == calendar21.equals(calendar65));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setWeekDate(5, (int) (byte) -1, 1);
        java.util.Calendar.Builder builder6 = builder4.setLenient(true);
        java.util.Calendar.Builder builder10 = builder6.setTimeOfDay(122, 11, 10);
        java.util.Calendar.Builder builder14 = builder10.setWeekDate(100, 9, 2);
        java.util.Calendar.Builder builder18 = builder14.setTimeOfDay(52, (int) (short) 10, (-1));
        java.util.Calendar.Builder builder20 = builder18.setLenient(true);
        java.util.Calendar.Builder builder23 = builder18.set(2, 54);
        java.util.Calendar calendar24 = builder18.build();
        java.util.Locale locale25 = java.util.Locale.US;
        java.util.Locale locale26 = java.util.Locale.CHINA;
        java.util.TimeZone timeZone27 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone28 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone29 = java.util.TimeZone.getDefault();
        boolean boolean30 = timeZone28.hasSameRules(timeZone29);
        boolean boolean31 = timeZone27.hasSameRules(timeZone28);
        boolean boolean32 = timeZone28.observesDaylightTime();
        timeZone28.setRawOffset(52);
        timeZone28.setID("Temps universel coordonn\351");
        java.util.Locale locale38 = new java.util.Locale("zh");
        java.util.Locale locale39 = java.util.Locale.CHINESE;
        java.lang.String str40 = locale39.getLanguage();
        boolean boolean41 = locale39.hasExtensions();
        java.lang.String str42 = locale39.getDisplayCountry();
        java.lang.String str43 = locale38.getDisplayName(locale39);
        java.util.Calendar calendar44 = java.util.Calendar.getInstance(timeZone28, locale38);
        java.util.Set<java.lang.Character> charSet45 = locale38.getExtensionKeys();
        java.lang.String str46 = locale26.getDisplayCountry(locale38);
        java.lang.String str47 = locale26.getLanguage();
        java.lang.String str48 = locale26.getLanguage();
        java.lang.String str49 = locale25.getDisplayCountry(locale26);
        java.util.Calendar.Builder builder50 = builder18.setLocale(locale26);
        java.util.Calendar calendar51 = java.util.Calendar.getInstance(locale26);
        java.lang.String str52 = locale26.getDisplayVariant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar44 and calendar51", (calendar44.compareTo(calendar51) == 0) == calendar44.equals(calendar51));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
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
        boolean boolean52 = localeList27.isEmpty();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar46 and calendar48", (calendar46.compareTo(calendar48) == 0) == calendar46.equals(calendar48));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
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
        java.lang.Object obj21 = fastDateFormat2.clone();
        java.util.TimeZone timeZone22 = fastDateFormat2.getTimeZone();
        java.util.Locale locale23 = java.util.Locale.CHINA;
        java.lang.String str25 = locale23.getExtension('x');
        java.util.Set<java.lang.Character> charSet26 = locale23.getExtensionKeys();
        java.util.Set<java.lang.String> strSet27 = locale23.getUnicodeLocaleAttributes();
        java.util.Calendar calendar28 = java.util.Calendar.getInstance(timeZone22, locale23);
        int int29 = timeZone22.getRawOffset();
        timeZone22.setRawOffset(100);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar13 and calendar28", (calendar13.compareTo(calendar28) == 0) == calendar13.equals(calendar28));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
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
        java.time.ZoneId zoneId13 = timeZone8.toZoneId();
        java.util.TimeZone timeZone14 = java.util.TimeZone.getTimeZone(zoneId13);
        java.util.TimeZone timeZone15 = java.util.TimeZone.getTimeZone(zoneId13);
        java.util.TimeZone timeZone16 = java.util.TimeZone.getTimeZone(zoneId13);
        timeZone16.setID("java.util.GregorianCalendar[time=1645454780717,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=20,MILLISECOND=717,ZONE_OFFSET=0,DST_OFFSET=0]");
        java.util.Locale locale21 = new java.util.Locale("Coordinated Universal Time", "h:mm:ss a z");
        java.util.Locale locale23 = java.util.Locale.forLanguageTag("2:46:18 PM UTC");
        java.lang.String str24 = locale23.getVariant();
        java.util.Locale locale25 = java.util.Locale.US;
        java.util.Locale locale26 = locale25.stripExtensions();
        java.util.Locale locale27 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet28 = locale27.getUnicodeLocaleKeys();
        java.lang.String str29 = locale26.getDisplayVariant(locale27);
        java.lang.String str30 = locale23.getDisplayVariant(locale27);
        java.lang.String str31 = locale21.getDisplayLanguage(locale27);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone16, locale27);
        int int33 = timeZone16.getRawOffset();
        java.util.TimeZone timeZone34 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone35 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone36 = java.util.TimeZone.getDefault();
        boolean boolean37 = timeZone35.hasSameRules(timeZone36);
        boolean boolean38 = timeZone34.hasSameRules(timeZone35);
        boolean boolean39 = timeZone35.observesDaylightTime();
        timeZone35.setRawOffset(52);
        timeZone35.setID("Temps universel coordonn\351");
        java.util.Locale locale45 = new java.util.Locale("zh");
        java.util.Locale locale46 = java.util.Locale.CHINESE;
        java.lang.String str47 = locale46.getLanguage();
        boolean boolean48 = locale46.hasExtensions();
        java.lang.String str49 = locale46.getDisplayCountry();
        java.lang.String str50 = locale45.getDisplayName(locale46);
        java.util.Calendar calendar51 = java.util.Calendar.getInstance(timeZone35, locale45);
        calendar51.clear();
        long long53 = calendar51.getTimeInMillis();
        java.util.Date date54 = new java.util.Date();
        int int55 = date54.getTimezoneOffset();
        date54.setMinutes(5);
        int int58 = date54.getMonth();
        calendar51.setTime(date54);
        java.util.TimeZone timeZone60 = calendar51.getTimeZone();
        java.util.Calendar calendar61 = java.util.Calendar.getInstance(timeZone60);
        boolean boolean62 = timeZone16.hasSameRules(timeZone60);
        java.util.Calendar calendar63 = java.util.Calendar.getInstance(timeZone16);
        java.lang.String str64 = timeZone16.getID();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar61 and calendar63", (calendar61.compareTo(calendar63) == 0) == calendar61.equals(calendar63));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setWeekDate(5, (int) (byte) -1, 1);
        java.util.Calendar.Builder builder6 = builder4.setLenient(true);
        java.util.Calendar.Builder builder8 = builder6.setLenient(false);
        java.util.Locale locale9 = java.util.Locale.CHINESE;
        java.lang.String str10 = locale9.getLanguage();
        boolean boolean11 = locale9.hasExtensions();
        java.lang.String str12 = locale9.getDisplayCountry();
        java.util.Set<java.lang.String> strSet13 = locale9.getUnicodeLocaleKeys();
        java.lang.String str14 = locale9.getCountry();
        java.util.Locale.setDefault(locale9);
        java.util.Calendar.Builder builder16 = builder6.setLocale(locale9);
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(locale9);
        java.util.TimeZone timeZone18 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone19 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone20 = java.util.TimeZone.getDefault();
        boolean boolean21 = timeZone19.hasSameRules(timeZone20);
        boolean boolean22 = timeZone18.hasSameRules(timeZone19);
        java.util.TimeZone timeZone24 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str25 = timeZone24.getID();
        boolean boolean26 = timeZone19.hasSameRules(timeZone24);
        boolean boolean27 = timeZone19.observesDaylightTime();
        timeZone19.setID("2:46:04 PM UTC");
        java.util.Calendar calendar30 = java.util.Calendar.getInstance(timeZone19);
        java.util.TimeZone timeZone31 = calendar30.getTimeZone();
        boolean boolean32 = calendar30.isWeekDateSupported();
        java.util.TimeZone timeZone34 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone34);
        java.lang.String str36 = fastDateFormat35.getPattern();
        java.text.ParsePosition parsePosition39 = new java.text.ParsePosition(16);
        parsePosition39.setIndex(11);
        java.lang.Object obj42 = fastDateFormat35.parseObject("FastDateFormat[]", parsePosition39);
        java.util.TimeZone timeZone43 = fastDateFormat35.getTimeZone();
        java.lang.String str44 = timeZone43.getID();
        java.util.Locale locale46 = new java.util.Locale("zh");
        java.lang.String str47 = locale46.getISO3Country();
        java.util.Calendar calendar48 = java.util.Calendar.getInstance(timeZone43, locale46);
        java.lang.String str49 = locale46.getCountry();
        boolean boolean50 = calendar30.after((java.lang.Object) locale46);
        java.lang.String str51 = locale9.getDisplayName(locale46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar17 and calendar30", (calendar17.compareTo(calendar30) == 0) == calendar17.equals(calendar30));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone1);
        java.time.ZoneId zoneId5 = timeZone0.toZoneId();
        java.util.TimeZone.setDefault(timeZone0);
        java.lang.String str7 = timeZone0.getID();
        timeZone0.setRawOffset((int) 'u');
        java.util.Calendar calendar10 = java.util.Calendar.getInstance(timeZone0);
        java.util.TimeZone timeZone12 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str13 = timeZone12.getID();
        java.util.TimeZone.setDefault(timeZone12);
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone12);
        int int16 = calendar15.getFirstDayOfWeek();
        java.util.TimeZone timeZone17 = java.util.TimeZone.getDefault();
        int int19 = timeZone17.getOffset((long) 2);
        java.util.Locale locale23 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale24 = locale23.stripExtensions();
        java.util.Calendar calendar25 = java.util.Calendar.getInstance(timeZone17, locale24);
        calendar15.setTimeZone(timeZone17);
        timeZone17.setID("2:46:52 PM UTC");
        boolean boolean29 = timeZone0.hasSameRules(timeZone17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar10 and calendar15", (calendar10.compareTo(calendar15) == 0) == calendar10.equals(calendar15));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
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
        java.util.Iterator<java.util.Locale> localeItor16 = localeList15.iterator();
        java.util.ListIterator<java.util.Locale> localeItor17 = localeList15.listIterator();
        java.util.List<java.util.Locale> localeList18 = java.util.Locale.filter(languageRangeList1, (java.util.Collection<java.util.Locale>) localeList15);
        java.util.Locale.Category category19 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale20 = java.util.Locale.TAIWAN;
        java.util.Locale locale21 = locale20.stripExtensions();
        java.util.Locale.setDefault(category19, locale20);
        java.util.Locale.setDefault(locale20);
        java.util.Set<java.lang.String> strSet24 = locale20.getUnicodeLocaleAttributes();
        java.util.stream.Stream<java.lang.String> strStream25 = strSet24.parallelStream();
        boolean boolean26 = localeList18.containsAll((java.util.Collection<java.lang.String>) strSet24);
        java.util.Locale.Category category27 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale28 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(category27, locale28);
        java.util.Locale locale30 = java.util.Locale.KOREA;
        java.lang.String str31 = locale30.getScript();
        java.util.Locale locale32 = java.util.Locale.FRANCE;
        java.lang.String str33 = locale30.getDisplayVariant(locale32);
        java.util.Locale.setDefault(category27, locale30);
        java.util.Locale locale35 = java.util.Locale.US;
        java.lang.String str36 = locale35.getDisplayVariant();
        java.util.Set<java.lang.String> strSet37 = locale35.getUnicodeLocaleAttributes();
        java.lang.String str38 = locale35.getISO3Country();
        java.lang.String str39 = locale35.getLanguage();
        java.util.Locale.setDefault(category27, locale35);
        java.util.Locale locale41 = java.util.Locale.getDefault(category27);
        boolean boolean42 = localeList18.add(locale41);
        java.util.Locale locale43 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar44 = java.util.Calendar.getInstance(locale43);
        java.util.Locale.Builder builder47 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder50 = builder47.setExtension('a', "France");
        java.util.Locale.Builder builder52 = builder47.removeUnicodeLocaleAttribute("GMT");
        java.util.Locale locale53 = java.util.Locale.FRANCE;
        java.lang.String str54 = locale53.getVariant();
        java.lang.String str55 = locale53.getDisplayCountry();
        java.util.Locale.Builder builder56 = builder47.setLocale(locale53);
        java.lang.String str57 = locale53.toLanguageTag();
        java.lang.String str58 = locale53.toLanguageTag();
        java.util.Locale locale61 = new java.util.Locale("\uc624\ud6c4\uc2dc\ubd84\ucd08 GMT", "Wed Mar 16 08:10:49 GMT 2022");
        java.util.TimeZone timeZone63 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat64 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone63);
        java.lang.String str65 = fastDateFormat64.getPattern();
        java.text.ParsePosition parsePosition68 = new java.text.ParsePosition(16);
        parsePosition68.setIndex(11);
        java.lang.Object obj71 = fastDateFormat64.parseObject("FastDateFormat[]", parsePosition68);
        java.util.TimeZone timeZone72 = fastDateFormat64.getTimeZone();
        java.lang.String str73 = timeZone72.getID();
        java.util.Locale locale75 = new java.util.Locale("zh");
        java.lang.String str76 = locale75.getISO3Country();
        java.util.Calendar calendar77 = java.util.Calendar.getInstance(timeZone72, locale75);
        java.lang.String str78 = locale75.getCountry();
        java.lang.String str79 = locale61.getDisplayName(locale75);
        java.lang.String str80 = locale53.getDisplayVariant(locale75);
        java.util.Map<java.lang.String, java.lang.Integer> strMap81 = calendar44.getDisplayNames(14, (int) (short) 1, locale75);
        int int82 = localeList18.lastIndexOf((java.lang.Object) strMap81);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar44 and calendar77", (calendar44.compareTo(calendar77) == 0) == calendar44.equals(calendar77));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone1);
        java.util.TimeZone timeZone6 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str7 = timeZone6.getID();
        boolean boolean8 = timeZone1.hasSameRules(timeZone6);
        timeZone6.setRawOffset((int) 'x');
        timeZone6.setRawOffset((int) 'x');
        java.time.ZoneId zoneId13 = timeZone6.toZoneId();
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone6);
        java.util.Locale locale16 = new java.util.Locale("2:45:52 PM UTC");
        java.util.Locale locale18 = new java.util.Locale("zh");
        java.lang.String str19 = locale16.getDisplayScript(locale18);
        java.util.TimeZone timeZone21 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone21);
        java.lang.String str23 = fastDateFormat22.getPattern();
        java.text.ParsePosition parsePosition26 = new java.text.ParsePosition(16);
        parsePosition26.setIndex(11);
        java.lang.Object obj29 = fastDateFormat22.parseObject("FastDateFormat[]", parsePosition26);
        java.util.TimeZone timeZone30 = fastDateFormat22.getTimeZone();
        java.lang.String str31 = timeZone30.getID();
        java.util.Locale locale33 = new java.util.Locale("zh");
        java.lang.String str34 = locale33.getISO3Country();
        java.util.Calendar calendar35 = java.util.Calendar.getInstance(timeZone30, locale33);
        java.lang.String str36 = locale16.getDisplayName(locale33);
        java.util.Locale locale40 = new java.util.Locale("java.text.ParsePosition[index=16,errorIndex=-1]", "FastDateFormat[]", "FastDateFormat[]");
        java.util.Locale locale41 = locale40.stripExtensions();
        java.lang.String str42 = locale16.getDisplayLanguage(locale40);
        java.util.Calendar calendar43 = java.util.Calendar.getInstance(timeZone6, locale16);
        java.util.TimeZone timeZone45 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone45);
        java.lang.String str47 = fastDateFormat46.getPattern();
        java.text.ParsePosition parsePosition50 = new java.text.ParsePosition(16);
        parsePosition50.setIndex(11);
        java.lang.Object obj53 = fastDateFormat46.parseObject("FastDateFormat[]", parsePosition50);
        java.util.TimeZone timeZone56 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat57 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone56);
        java.lang.String str58 = fastDateFormat57.getPattern();
        java.text.ParsePosition parsePosition61 = new java.text.ParsePosition((int) (short) 10);
        int int62 = parsePosition61.getIndex();
        java.lang.Object obj63 = fastDateFormat57.parseObject("\uc624\uc804\uc2dc\ubd84\ucd08 UTC", parsePosition61);
        java.lang.Object obj64 = fastDateFormat46.parseObject("2:45:54 PM UTC", parsePosition61);
        int int65 = parsePosition61.getIndex();
        java.util.Locale locale67 = new java.util.Locale("de-DE");
        boolean boolean68 = parsePosition61.equals((java.lang.Object) locale67);
        java.lang.String str69 = locale16.getDisplayLanguage(locale67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar14 and calendar35", (calendar14.compareTo(calendar35) == 0) == calendar14.equals(calendar35));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
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
        java.util.TimeZone timeZone17 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone17);
        java.lang.String str19 = fastDateFormat18.toString();
        java.util.Date date25 = new java.util.Date(3, (int) (short) 0, 6, 0, (int) (short) 1);
        java.util.Date date26 = new java.util.Date();
        int int27 = date26.getTimezoneOffset();
        long long28 = date26.getTime();
        boolean boolean29 = date25.after(date26);
        java.lang.StringBuffer stringBuffer30 = null;
        java.lang.StringBuffer stringBuffer31 = fastDateFormat18.format(date25, stringBuffer30);
        java.util.Calendar calendar32 = java.util.Calendar.getInstance();
        java.lang.StringBuffer stringBuffer33 = null;
        java.lang.StringBuffer stringBuffer34 = fastDateFormat18.format(calendar32, stringBuffer33);
        int int35 = calendar32.getWeekYear();
        java.lang.String str36 = fastDateFormat2.format((java.lang.Object) calendar32);
        java.util.Locale locale37 = java.util.Locale.KOREAN;
        java.lang.String str38 = locale37.getISO3Country();
        java.util.Calendar calendar39 = java.util.Calendar.getInstance(locale37);
        java.lang.String str40 = fastDateFormat2.format(calendar39);
        java.util.TimeZone timeZone41 = java.util.TimeZone.getDefault();
        int int43 = timeZone41.getOffset((long) 2);
        java.util.Locale locale47 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale48 = locale47.stripExtensions();
        java.util.Calendar calendar49 = java.util.Calendar.getInstance(timeZone41, locale48);
        calendar49.set(122, 52, (int) (byte) 1);
        int int54 = calendar49.getWeeksInWeekYear();
        calendar49.add(13, 0);
        calendar49.set(17, 4, 58, 32769, 7, 54);
        int int66 = calendar49.getLeastMaximum(15);
        calendar49.set(120, (int) 'a', 0, (int) '4', 17);
        int int73 = calendar49.getFirstDayOfWeek();
        java.lang.StringBuffer stringBuffer74 = null;
        java.lang.StringBuffer stringBuffer75 = fastDateFormat2.format(calendar49, stringBuffer74);
        int int76 = calendar49.getFirstDayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar32 and calendar39", (calendar32.compareTo(calendar39) == 0) == calendar32.equals(calendar39));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
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
        java.util.Calendar calendar16 = java.util.Calendar.getInstance(timeZone6);
        java.util.TimeZone timeZone20 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone20);
        java.lang.String str22 = fastDateFormat21.getPattern();
        java.text.ParsePosition parsePosition25 = new java.text.ParsePosition(16);
        parsePosition25.setIndex(11);
        java.lang.Object obj28 = fastDateFormat21.parseObject("FastDateFormat[]", parsePosition25);
        boolean boolean29 = fastDateFormat21.getTimeZoneOverridesCalendar();
        java.text.AttributedCharacterIterator attributedCharacterIterator31 = fastDateFormat21.formatToCharacterIterator((java.lang.Object) 1645454754924L);
        java.util.Locale locale32 = fastDateFormat21.getLocale();
        java.util.Map<java.lang.String, java.lang.Integer> strMap33 = calendar16.getDisplayNames(2, 0, locale32);
        int int34 = calendar16.getWeekYear();
        java.util.Date date35 = new java.util.Date();
        int int36 = date35.getTimezoneOffset();
        long long37 = date35.getTime();
        java.util.Date date38 = new java.util.Date();
        int int39 = date38.getSeconds();
        date38.setTime((long) 16);
        date38.setMinutes(12);
        int int44 = date38.getSeconds();
        boolean boolean45 = date35.after(date38);
        java.util.Date date46 = new java.util.Date();
        int int47 = date46.getSeconds();
        date46.setTime((long) 16);
        date46.setMinutes(12);
        int int52 = date46.getMinutes();
        java.util.Date date53 = new java.util.Date();
        int int54 = date53.getTimezoneOffset();
        date53.setMinutes(5);
        int int57 = date53.getMonth();
        boolean boolean58 = date46.before(date53);
        boolean boolean59 = date38.before(date46);
        java.util.TimeZone timeZone60 = java.util.TimeZone.getDefault();
        int int62 = timeZone60.getOffset((long) 2);
        java.util.Locale locale66 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale67 = locale66.stripExtensions();
        java.util.Calendar calendar68 = java.util.Calendar.getInstance(timeZone60, locale67);
        int int70 = calendar68.getLeastMaximum(4);
        int int72 = calendar68.getLeastMaximum((int) (byte) 0);
        java.util.Date date73 = new java.util.Date();
        int int74 = date73.getTimezoneOffset();
        int int75 = date73.getSeconds();
        boolean boolean76 = calendar68.after((java.lang.Object) date73);
        java.util.Date date77 = new java.util.Date();
        int int78 = date77.getSeconds();
        date77.setTime((long) 16);
        date77.setMinutes(12);
        int int83 = date77.getSeconds();
        date77.setMinutes(51);
        boolean boolean86 = date73.before(date77);
        boolean boolean87 = date46.after(date77);
        boolean boolean88 = calendar16.after((java.lang.Object) date77);
        date77.setMonth(120);
        int int91 = date77.getSeconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar14 and calendar16", (calendar14.compareTo(calendar16) == 0) == calendar14.equals(calendar16));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
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
        java.util.Calendar calendar16 = java.util.Calendar.getInstance(timeZone6);
        java.util.TimeZone timeZone20 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone20);
        java.lang.String str22 = fastDateFormat21.getPattern();
        java.text.ParsePosition parsePosition25 = new java.text.ParsePosition(16);
        parsePosition25.setIndex(11);
        java.lang.Object obj28 = fastDateFormat21.parseObject("FastDateFormat[]", parsePosition25);
        boolean boolean29 = fastDateFormat21.getTimeZoneOverridesCalendar();
        java.text.AttributedCharacterIterator attributedCharacterIterator31 = fastDateFormat21.formatToCharacterIterator((java.lang.Object) 1645454754924L);
        java.util.Locale locale32 = fastDateFormat21.getLocale();
        java.util.Map<java.lang.String, java.lang.Integer> strMap33 = calendar16.getDisplayNames(2, 0, locale32);
        int int34 = calendar16.getWeekYear();
        java.util.Date date35 = new java.util.Date();
        int int36 = date35.getTimezoneOffset();
        long long37 = date35.getTime();
        java.util.Date date38 = new java.util.Date();
        int int39 = date38.getSeconds();
        date38.setTime((long) 16);
        date38.setMinutes(12);
        int int44 = date38.getSeconds();
        boolean boolean45 = date35.after(date38);
        java.util.Date date46 = new java.util.Date();
        int int47 = date46.getSeconds();
        date46.setTime((long) 16);
        date46.setMinutes(12);
        int int52 = date46.getMinutes();
        java.util.Date date53 = new java.util.Date();
        int int54 = date53.getTimezoneOffset();
        date53.setMinutes(5);
        int int57 = date53.getMonth();
        boolean boolean58 = date46.before(date53);
        boolean boolean59 = date38.before(date46);
        java.util.TimeZone timeZone60 = java.util.TimeZone.getDefault();
        int int62 = timeZone60.getOffset((long) 2);
        java.util.Locale locale66 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale67 = locale66.stripExtensions();
        java.util.Calendar calendar68 = java.util.Calendar.getInstance(timeZone60, locale67);
        int int70 = calendar68.getLeastMaximum(4);
        int int72 = calendar68.getLeastMaximum((int) (byte) 0);
        java.util.Date date73 = new java.util.Date();
        int int74 = date73.getTimezoneOffset();
        int int75 = date73.getSeconds();
        boolean boolean76 = calendar68.after((java.lang.Object) date73);
        java.util.Date date77 = new java.util.Date();
        int int78 = date77.getSeconds();
        date77.setTime((long) 16);
        date77.setMinutes(12);
        int int83 = date77.getSeconds();
        date77.setMinutes(51);
        boolean boolean86 = date73.before(date77);
        boolean boolean87 = date46.after(date77);
        boolean boolean88 = calendar16.after((java.lang.Object) date77);
        int int89 = date77.getDate();
        int int90 = date77.getDay();
        int int91 = date77.getMonth();
        int int92 = date77.getSeconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar14 and calendar16", (calendar14.compareTo(calendar16) == 0) == calendar14.equals(calendar16));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setWeekDate(5, (int) (byte) -1, 1);
        java.util.Calendar.Builder builder6 = builder4.setLenient(true);
        java.util.Calendar.Builder builder10 = builder6.setTimeOfDay(122, 11, 10);
        java.util.Calendar.Builder builder14 = builder10.setWeekDate(100, 9, 2);
        java.util.TimeZone timeZone15 = java.util.TimeZone.getDefault();
        java.util.Calendar.Builder builder16 = builder14.setTimeZone(timeZone15);
        int int17 = timeZone15.getRawOffset();
        java.util.Locale locale21 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale22 = locale21.stripExtensions();
        java.util.Locale locale23 = java.util.Locale.US;
        java.util.Calendar calendar24 = java.util.Calendar.getInstance(locale23);
        java.lang.String str25 = locale21.getDisplayCountry(locale23);
        java.util.Calendar calendar26 = java.util.Calendar.getInstance(timeZone15, locale23);
        int int28 = timeZone15.getOffset(1645454811410L);
        boolean boolean29 = timeZone15.observesDaylightTime();
        timeZone15.setRawOffset(33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar24 and calendar26", (calendar24.compareTo(calendar26) == 0) == calendar24.equals(calendar26));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
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
        java.util.TimeZone timeZone14 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str15 = timeZone14.getID();
        java.util.TimeZone.setDefault(timeZone14);
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(timeZone14);
        int int18 = calendar17.getFirstDayOfWeek();
        java.util.TimeZone timeZone19 = java.util.TimeZone.getDefault();
        int int21 = timeZone19.getOffset((long) 2);
        java.util.Locale locale25 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale26 = locale25.stripExtensions();
        java.util.Calendar calendar27 = java.util.Calendar.getInstance(timeZone19, locale26);
        calendar17.setTimeZone(timeZone19);
        java.lang.String str29 = timeZone19.getID();
        java.util.Calendar calendar30 = java.util.Calendar.getInstance(timeZone19);
        java.util.TimeZone timeZone31 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone32 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone33 = java.util.TimeZone.getDefault();
        boolean boolean34 = timeZone32.hasSameRules(timeZone33);
        boolean boolean35 = timeZone31.hasSameRules(timeZone32);
        timeZone32.setID("Mon Feb 21 14:45:50 GMT 2022");
        boolean boolean38 = timeZone19.hasSameRules(timeZone32);
        boolean boolean39 = timeZone7.hasSameRules(timeZone32);
        java.util.Calendar calendar40 = java.util.Calendar.getInstance(timeZone7);
        java.lang.Object obj41 = timeZone7.clone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar17 and calendar27", (calendar17.compareTo(calendar27) == 0) == calendar17.equals(calendar27));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
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
        java.util.Calendar calendar16 = java.util.Calendar.getInstance(timeZone6);
        java.util.TimeZone timeZone20 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone20);
        java.lang.String str22 = fastDateFormat21.getPattern();
        java.text.ParsePosition parsePosition25 = new java.text.ParsePosition(16);
        parsePosition25.setIndex(11);
        java.lang.Object obj28 = fastDateFormat21.parseObject("FastDateFormat[]", parsePosition25);
        boolean boolean29 = fastDateFormat21.getTimeZoneOverridesCalendar();
        java.text.AttributedCharacterIterator attributedCharacterIterator31 = fastDateFormat21.formatToCharacterIterator((java.lang.Object) 1645454754924L);
        java.util.Locale locale32 = fastDateFormat21.getLocale();
        java.util.Map<java.lang.String, java.lang.Integer> strMap33 = calendar16.getDisplayNames(2, 0, locale32);
        long long34 = calendar16.getTimeInMillis();
        calendar16.setLenient(false);
        java.util.Date date38 = new java.util.Date((long) 2022);
        calendar16.setTime(date38);
        java.text.Format.Field field40 = null;
        java.text.FieldPosition fieldPosition41 = new java.text.FieldPosition(field40);
        int int42 = fieldPosition41.getField();
        boolean boolean43 = calendar16.before((java.lang.Object) fieldPosition41);
        calendar16.setWeekDate(0, 22, 6);
        calendar16.setMinimalDaysInFirstWeek((int) (short) 1);
        java.util.TimeZone timeZone51 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.util.Locale locale52 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar53 = java.util.Calendar.getInstance(timeZone51, locale52);
        timeZone51.setRawOffset(0);
        java.util.TimeZone timeZone56 = null;
        boolean boolean57 = timeZone51.hasSameRules(timeZone56);
        timeZone51.setRawOffset((int) (short) 0);
        java.util.Calendar calendar60 = java.util.Calendar.getInstance(timeZone51);
        int int61 = calendar60.getFirstDayOfWeek();
        int int62 = calendar16.compareTo(calendar60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar14 and calendar53", (calendar14.compareTo(calendar53) == 0) == calendar14.equals(calendar53));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
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
        java.util.TimeZone timeZone19 = java.util.TimeZone.getTimeZone("Etats-Unis");
        boolean boolean20 = timeZone12.hasSameRules(timeZone19);
        timeZone19.setID("21 Feb 2022 14:50:05 GMT");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar8 and calendar16", (calendar8.compareTo(calendar16) == 0) == calendar8.equals(calendar16));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setLenient(false);
        java.util.Calendar.Builder builder6 = builder0.setTimeOfDay(55, 20, 32772);
        java.util.Calendar.Builder builder10 = builder6.setTimeOfDay(1969, 25, (int) (short) 100);
        java.util.Calendar.Builder builder11 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder15 = builder11.setWeekDate(5, (int) (byte) -1, 1);
        java.util.Calendar.Builder builder17 = builder15.setLenient(true);
        java.util.Calendar.Builder builder21 = builder17.setTimeOfDay(122, 11, 10);
        java.util.Calendar.Builder builder25 = builder21.setWeekDate(100, 9, 2);
        java.util.Calendar.Builder builder29 = builder25.setTimeOfDay(52, (int) (short) 10, (-1));
        java.util.Calendar.Builder builder31 = builder29.setLenient(true);
        java.util.Calendar.Builder builder34 = builder29.set(2, 54);
        java.util.TimeZone timeZone36 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone37 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone38 = java.util.TimeZone.getDefault();
        boolean boolean39 = timeZone37.hasSameRules(timeZone38);
        boolean boolean40 = timeZone36.hasSameRules(timeZone37);
        java.util.TimeZone timeZone42 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str43 = timeZone42.getID();
        boolean boolean44 = timeZone37.hasSameRules(timeZone42);
        java.util.Locale locale45 = java.util.Locale.FRANCE;
        boolean boolean46 = locale45.hasExtensions();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone42, locale45);
        java.util.Calendar.Builder builder48 = builder29.setTimeZone(timeZone42);
        java.util.Calendar.Builder builder49 = builder10.setTimeZone(timeZone42);
        java.util.TimeZone timeZone50 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone51 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone52 = java.util.TimeZone.getDefault();
        boolean boolean53 = timeZone51.hasSameRules(timeZone52);
        boolean boolean54 = timeZone50.hasSameRules(timeZone51);
        java.lang.String str55 = timeZone51.getID();
        java.lang.String str56 = timeZone51.getID();
        int int57 = timeZone51.getRawOffset();
        java.util.Calendar calendar58 = java.util.Calendar.getInstance(timeZone51);
        boolean boolean59 = timeZone42.hasSameRules(timeZone51);
        java.util.Calendar calendar60 = java.util.Calendar.getInstance(timeZone42);
        java.util.TimeZone.setDefault(timeZone42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar58 and calendar60", (calendar58.compareTo(calendar60) == 0) == calendar58.equals(calendar60));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
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
        java.lang.String str36 = fastDateFormat2.format((long) 70);
        java.util.Locale locale37 = java.util.Locale.US;
        java.lang.String str38 = locale37.getDisplayVariant();
        java.util.Locale locale39 = java.util.Locale.FRANCE;
        boolean boolean40 = locale39.hasExtensions();
        java.util.Locale locale41 = java.util.Locale.ROOT;
        java.lang.String str42 = locale39.getDisplayName(locale41);
        java.lang.String str43 = locale41.getCountry();
        java.lang.String str44 = locale37.getDisplayVariant(locale41);
        java.util.Calendar calendar45 = java.util.Calendar.getInstance(locale41);
        calendar45.clear();
        java.lang.String str47 = fastDateFormat2.format(calendar45);
        int int49 = calendar45.getMaximum(7);
        java.util.TimeZone timeZone50 = java.util.TimeZone.getDefault();
        int int52 = timeZone50.getOffset((long) 2);
        java.util.Locale locale56 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale57 = locale56.stripExtensions();
        java.util.Calendar calendar58 = java.util.Calendar.getInstance(timeZone50, locale57);
        calendar58.set(122, 52, (int) (byte) 1);
        int int63 = calendar58.getWeeksInWeekYear();
        boolean boolean64 = calendar58.isWeekDateSupported();
        java.util.TimeZone timeZone65 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone66 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone67 = java.util.TimeZone.getDefault();
        boolean boolean68 = timeZone66.hasSameRules(timeZone67);
        boolean boolean69 = timeZone65.hasSameRules(timeZone66);
        java.util.TimeZone timeZone71 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str72 = timeZone71.getID();
        boolean boolean73 = timeZone66.hasSameRules(timeZone71);
        boolean boolean74 = timeZone66.observesDaylightTime();
        calendar58.setTimeZone(timeZone66);
        calendar45.setTimeZone(timeZone66);
        java.util.Locale.Builder builder77 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder80 = builder77.setExtension('a', "France");
        java.util.Locale.Builder builder82 = builder77.removeUnicodeLocaleAttribute("GMT");
        java.util.Locale locale83 = java.util.Locale.FRANCE;
        java.lang.String str84 = locale83.getVariant();
        java.lang.String str85 = locale83.getDisplayCountry();
        java.util.Locale.Builder builder86 = builder77.setLocale(locale83);
        java.lang.String str87 = locale83.toLanguageTag();
        java.lang.String str88 = locale83.getScript();
        java.util.Calendar calendar89 = java.util.Calendar.getInstance(timeZone66, locale83);
        java.util.Locale locale92 = new java.util.Locale("java.text.FieldPosition[field=55,attribute=null,beginIndex=0,endIndex=0]", "en_US");
        java.lang.String str93 = timeZone66.getDisplayName(locale92);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar13 and calendar89", (calendar13.compareTo(calendar89) == 0) == calendar13.equals(calendar89));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
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
        java.util.TimeZone timeZone14 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str15 = timeZone14.getID();
        java.util.TimeZone.setDefault(timeZone14);
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(timeZone14);
        int int18 = calendar17.getFirstDayOfWeek();
        java.util.TimeZone timeZone19 = java.util.TimeZone.getDefault();
        int int21 = timeZone19.getOffset((long) 2);
        java.util.Locale locale25 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale26 = locale25.stripExtensions();
        java.util.Calendar calendar27 = java.util.Calendar.getInstance(timeZone19, locale26);
        calendar17.setTimeZone(timeZone19);
        java.lang.String str29 = timeZone19.getID();
        java.util.Calendar calendar30 = java.util.Calendar.getInstance(timeZone19);
        java.util.TimeZone timeZone31 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone32 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone33 = java.util.TimeZone.getDefault();
        boolean boolean34 = timeZone32.hasSameRules(timeZone33);
        boolean boolean35 = timeZone31.hasSameRules(timeZone32);
        timeZone32.setID("Mon Feb 21 14:45:50 GMT 2022");
        boolean boolean38 = timeZone19.hasSameRules(timeZone32);
        boolean boolean39 = timeZone7.hasSameRules(timeZone32);
        timeZone32.setRawOffset(0);
        int int42 = timeZone32.getRawOffset();
        int int43 = timeZone32.getRawOffset();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar17 and calendar27", (calendar17.compareTo(calendar27) == 0) == calendar17.equals(calendar27));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
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
        java.util.Locale locale34 = new java.util.Locale("21 Feb 2022 14:46:46 GMT", "Wed Mar 16 08:10:05 GMT 2022");
        boolean boolean35 = localeList27.add(locale34);
        java.util.TimeZone timeZone37 = java.util.TimeZone.getTimeZone("\uc624\ud6c4\uc2dc\ubd84\ucd08 GMT");
        java.util.TimeZone timeZone39 = java.util.TimeZone.getTimeZone("2:45:54 PM UTC");
        boolean boolean40 = timeZone37.hasSameRules(timeZone39);
        java.util.Locale.LanguageRange[] languageRangeArray41 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList42 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList42, languageRangeArray41);
        java.util.Locale locale44 = java.util.Locale.GERMAN;
        java.util.Locale locale45 = java.util.Locale.FRANCE;
        boolean boolean46 = locale45.hasExtensions();
        java.util.Locale locale47 = java.util.Locale.FRANCE;
        java.util.Locale locale48 = java.util.Locale.CHINESE;
        java.lang.String str49 = locale48.getLanguage();
        java.util.Locale[] localeArray50 = new java.util.Locale[] { locale44, locale45, locale47, locale48 };
        java.util.ArrayList<java.util.Locale> localeList51 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList51, localeArray50);
        java.util.Locale.FilteringMode filteringMode53 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList54 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList42, (java.util.Collection<java.util.Locale>) localeList51, filteringMode53);
        java.util.Spliterator<java.util.Locale> localeSpliterator55 = localeList54.spliterator();
        java.util.Iterator<java.util.Locale> localeItor56 = localeList54.iterator();
        java.util.Set<java.lang.String> strSet57 = java.util.Calendar.getAvailableCalendarTypes();
        java.util.stream.Stream<java.lang.String> strStream58 = strSet57.parallelStream();
        boolean boolean59 = localeList54.removeAll((java.util.Collection<java.lang.String>) strSet57);
        java.util.TimeZone timeZone61 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat62 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone61);
        java.lang.String str63 = fastDateFormat62.toString();
        java.lang.Object obj64 = fastDateFormat62.clone();
        java.util.Locale locale65 = fastDateFormat62.getLocale();
        boolean boolean66 = locale65.hasExtensions();
        boolean boolean67 = localeList54.add(locale65);
        java.util.Calendar calendar68 = java.util.Calendar.getInstance(timeZone39, locale65);
        java.util.Locale locale71 = new java.util.Locale("Coordinated Universal Time", "h:mm:ss a z");
        java.util.Locale locale73 = java.util.Locale.forLanguageTag("2:46:18 PM UTC");
        java.lang.String str74 = locale73.getVariant();
        java.util.Locale locale75 = java.util.Locale.US;
        java.util.Locale locale76 = locale75.stripExtensions();
        java.util.Locale locale77 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet78 = locale77.getUnicodeLocaleKeys();
        java.lang.String str79 = locale76.getDisplayVariant(locale77);
        java.lang.String str80 = locale73.getDisplayVariant(locale77);
        java.lang.String str81 = locale71.getDisplayLanguage(locale77);
        java.util.Calendar calendar82 = java.util.Calendar.getInstance(timeZone39, locale77);
        java.util.Set<java.lang.Character> charSet83 = locale77.getExtensionKeys();
        int int84 = localeList27.indexOf((java.lang.Object) charSet83);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar68 and calendar82", (calendar68.compareTo(calendar82) == 0) == calendar68.equals(calendar82));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone1);
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(timeZone0);
        java.util.TimeZone.setDefault(timeZone0);
        java.util.TimeZone timeZone7 = java.util.TimeZone.getDefault();
        int int9 = timeZone7.getOffset((long) 2);
        java.util.Locale locale13 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale14 = locale13.stripExtensions();
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone7, locale14);
        calendar15.set(122, 52, (int) (byte) 1);
        int int20 = calendar15.getWeeksInWeekYear();
        boolean boolean21 = calendar15.isWeekDateSupported();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone23 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone24 = java.util.TimeZone.getDefault();
        boolean boolean25 = timeZone23.hasSameRules(timeZone24);
        boolean boolean26 = timeZone22.hasSameRules(timeZone23);
        java.util.TimeZone timeZone28 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str29 = timeZone28.getID();
        boolean boolean30 = timeZone23.hasSameRules(timeZone28);
        boolean boolean31 = timeZone23.observesDaylightTime();
        calendar15.setTimeZone(timeZone23);
        java.util.Locale.LanguageRange[] languageRangeArray33 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList34 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList34, languageRangeArray33);
        java.util.Locale locale36 = java.util.Locale.GERMAN;
        java.util.Locale locale37 = java.util.Locale.FRANCE;
        boolean boolean38 = locale37.hasExtensions();
        java.util.Locale locale39 = java.util.Locale.FRANCE;
        java.util.Locale locale40 = java.util.Locale.CHINESE;
        java.lang.String str41 = locale40.getLanguage();
        java.util.Locale[] localeArray42 = new java.util.Locale[] { locale36, locale37, locale39, locale40 };
        java.util.ArrayList<java.util.Locale> localeList43 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList43, localeArray42);
        java.util.Locale.FilteringMode filteringMode45 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList46 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList34, (java.util.Collection<java.util.Locale>) localeList43, filteringMode45);
        java.util.Spliterator<java.util.Locale> localeSpliterator47 = localeList46.spliterator();
        localeList46.clear();
        java.util.Date date49 = new java.util.Date();
        int int50 = date49.getTimezoneOffset();
        long long51 = date49.getTime();
        int int52 = date49.getMinutes();
        boolean boolean53 = localeList46.remove((java.lang.Object) date49);
        calendar15.setTime(date49);
        int int56 = calendar15.getMinimum(11);
        java.util.TimeZone timeZone57 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone58 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone59 = java.util.TimeZone.getDefault();
        boolean boolean60 = timeZone58.hasSameRules(timeZone59);
        boolean boolean61 = timeZone57.hasSameRules(timeZone58);
        boolean boolean62 = timeZone58.observesDaylightTime();
        timeZone58.setRawOffset(52);
        timeZone58.setID("Temps universel coordonn\351");
        java.util.Locale locale68 = new java.util.Locale("zh");
        java.util.Locale locale69 = java.util.Locale.CHINESE;
        java.lang.String str70 = locale69.getLanguage();
        boolean boolean71 = locale69.hasExtensions();
        java.lang.String str72 = locale69.getDisplayCountry();
        java.lang.String str73 = locale68.getDisplayName(locale69);
        java.util.Calendar calendar74 = java.util.Calendar.getInstance(timeZone58, locale68);
        calendar74.clear();
        long long76 = calendar74.getTimeInMillis();
        java.util.Date date77 = new java.util.Date();
        int int78 = date77.getTimezoneOffset();
        date77.setMinutes(5);
        int int81 = date77.getMonth();
        calendar74.setTime(date77);
        boolean boolean83 = calendar15.before((java.lang.Object) date77);
        long long84 = calendar15.getTimeInMillis();
        calendar15.setMinimalDaysInFirstWeek(22);
        calendar15.setLenient(false);
        java.util.TimeZone timeZone89 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone90 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone91 = java.util.TimeZone.getDefault();
        boolean boolean92 = timeZone90.hasSameRules(timeZone91);
        boolean boolean93 = timeZone89.hasSameRules(timeZone90);
        int int94 = timeZone90.getRawOffset();
        int int95 = timeZone90.getRawOffset();
        timeZone90.setID("\uc624\ud6c4\uc2dc\ubd84\ucd08 GMT");
        calendar15.setTimeZone(timeZone90);
        boolean boolean99 = timeZone0.hasSameRules(timeZone90);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar5 and calendar15", (calendar5.compareTo(calendar15) == 0) == calendar5.equals(calendar15));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone1);
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(timeZone1);
        timeZone1.setRawOffset(50);
        java.util.Locale locale9 = new java.util.Locale("2:45:52 PM UTC");
        java.util.Locale locale11 = new java.util.Locale("zh");
        java.lang.String str12 = locale9.getDisplayScript(locale11);
        java.util.TimeZone timeZone14 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone14);
        java.lang.String str16 = fastDateFormat15.getPattern();
        java.text.ParsePosition parsePosition19 = new java.text.ParsePosition(16);
        parsePosition19.setIndex(11);
        java.lang.Object obj22 = fastDateFormat15.parseObject("FastDateFormat[]", parsePosition19);
        java.util.TimeZone timeZone23 = fastDateFormat15.getTimeZone();
        java.lang.String str24 = timeZone23.getID();
        java.util.Locale locale26 = new java.util.Locale("zh");
        java.lang.String str27 = locale26.getISO3Country();
        java.util.Calendar calendar28 = java.util.Calendar.getInstance(timeZone23, locale26);
        java.lang.String str29 = locale9.getDisplayName(locale26);
        java.lang.String str30 = locale9.getISO3Country();
        java.lang.String str32 = locale9.getExtension('x');
        java.util.Calendar calendar33 = java.util.Calendar.getInstance(timeZone1, locale9);
        java.lang.String str35 = locale9.getExtension('u');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar5 and calendar28", (calendar5.compareTo(calendar28) == 0) == calendar5.equals(calendar28));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 2);
        timeZone0.setID("2:46:04 PM UTC");
        java.util.Locale locale6 = new java.util.Locale("zh");
        java.lang.String str7 = locale6.getDisplayVariant();
        java.lang.String str8 = locale6.getDisplayCountry();
        java.lang.String str9 = locale6.getDisplayVariant();
        java.lang.String str10 = locale6.getCountry();
        java.util.Calendar calendar11 = java.util.Calendar.getInstance(locale6);
        java.util.Locale.setDefault(locale6);
        java.util.Calendar calendar13 = java.util.Calendar.getInstance(timeZone0, locale6);
        int int14 = timeZone0.getDSTSavings();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar11 and calendar13", (calendar11.compareTo(calendar13) == 0) == calendar11.equals(calendar13));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        java.util.Locale locale0 = java.util.Locale.US;
        java.lang.String str1 = locale0.getDisplayVariant();
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        boolean boolean3 = locale2.hasExtensions();
        java.util.Locale locale4 = java.util.Locale.ROOT;
        java.lang.String str5 = locale2.getDisplayName(locale4);
        java.lang.String str6 = locale4.getCountry();
        java.lang.String str7 = locale0.getDisplayVariant(locale4);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale4);
        java.util.TimeZone timeZone9 = calendar8.getTimeZone();
        java.lang.String str10 = timeZone9.getID();
        java.util.Locale locale11 = java.util.Locale.GERMANY;
        java.util.Calendar calendar12 = java.util.Calendar.getInstance(timeZone9, locale11);
        java.util.TimeZone timeZone13 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone14 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone15 = java.util.TimeZone.getDefault();
        boolean boolean16 = timeZone14.hasSameRules(timeZone15);
        boolean boolean17 = timeZone13.hasSameRules(timeZone14);
        boolean boolean18 = timeZone14.observesDaylightTime();
        java.util.TimeZone timeZone19 = java.util.TimeZone.getDefault();
        int int21 = timeZone19.getOffset((long) 2);
        java.util.Locale locale25 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale26 = locale25.stripExtensions();
        java.util.Calendar calendar27 = java.util.Calendar.getInstance(timeZone19, locale26);
        boolean boolean28 = timeZone14.hasSameRules(timeZone19);
        java.util.Calendar calendar29 = java.util.Calendar.getInstance(timeZone19);
        java.util.TimeZone timeZone33 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone33);
        java.lang.String str35 = fastDateFormat34.getPattern();
        java.text.ParsePosition parsePosition38 = new java.text.ParsePosition(16);
        parsePosition38.setIndex(11);
        java.lang.Object obj41 = fastDateFormat34.parseObject("FastDateFormat[]", parsePosition38);
        boolean boolean42 = fastDateFormat34.getTimeZoneOverridesCalendar();
        java.text.AttributedCharacterIterator attributedCharacterIterator44 = fastDateFormat34.formatToCharacterIterator((java.lang.Object) 1645454754924L);
        java.util.Locale locale45 = fastDateFormat34.getLocale();
        java.util.Map<java.lang.String, java.lang.Integer> strMap46 = calendar29.getDisplayNames(2, 0, locale45);
        long long47 = calendar29.getTimeInMillis();
        calendar29.setLenient(false);
        java.util.Date date51 = new java.util.Date((long) 2022);
        calendar29.setTime(date51);
        long long53 = date51.getTime();
        int int54 = date51.getMonth();
        int int55 = date51.getTimezoneOffset();
        date51.setMinutes(13);
        java.util.Locale locale58 = java.util.Locale.US;
        java.lang.String str59 = locale58.getDisplayVariant();
        java.util.Locale locale60 = java.util.Locale.FRANCE;
        boolean boolean61 = locale60.hasExtensions();
        java.util.Locale locale62 = java.util.Locale.ROOT;
        java.lang.String str63 = locale60.getDisplayName(locale62);
        java.lang.String str64 = locale62.getCountry();
        java.lang.String str65 = locale58.getDisplayVariant(locale62);
        java.util.Calendar calendar66 = java.util.Calendar.getInstance(locale62);
        int int67 = calendar66.getWeeksInWeekYear();
        calendar66.setMinimalDaysInFirstWeek(29);
        calendar66.setTimeInMillis(1645454791286L);
        calendar66.setTimeInMillis(1645454801496L);
        java.util.Date date74 = calendar66.getTime();
        int int75 = date74.getHours();
        date74.setDate(26);
        boolean boolean78 = date51.before(date74);
        boolean boolean79 = timeZone9.inDaylightTime(date51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar8 and calendar12", (calendar8.compareTo(calendar12) == 0) == calendar8.equals(calendar12));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("21 Feb 2022 14:46:11 GMT");
        java.lang.String str2 = timeZone1.getID();
        java.time.ZoneId zoneId3 = timeZone1.toZoneId();
        java.util.Calendar.Builder builder4 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder8 = builder4.setWeekDate(5, (int) (byte) -1, 1);
        java.util.Calendar.Builder builder10 = builder8.setLenient(true);
        java.util.Calendar.Builder builder14 = builder10.setTimeOfDay(122, 11, 10);
        java.util.Calendar.Builder builder18 = builder14.setWeekDate(100, 9, 2);
        java.util.Calendar.Builder builder22 = builder18.setTimeOfDay(52, (int) (short) 10, (-1));
        java.util.Calendar.Builder builder24 = builder22.setLenient(true);
        java.util.Calendar.Builder builder27 = builder22.set(2, 54);
        java.util.Calendar.Builder builder32 = builder22.setTimeOfDay((int) 'u', 32769, 70, 5);
        java.util.TimeZone timeZone33 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone34 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone35 = java.util.TimeZone.getDefault();
        boolean boolean36 = timeZone34.hasSameRules(timeZone35);
        boolean boolean37 = timeZone33.hasSameRules(timeZone34);
        boolean boolean38 = timeZone34.observesDaylightTime();
        java.util.TimeZone timeZone39 = java.util.TimeZone.getDefault();
        int int41 = timeZone39.getOffset((long) 2);
        java.util.Locale locale45 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale46 = locale45.stripExtensions();
        java.util.Calendar calendar47 = java.util.Calendar.getInstance(timeZone39, locale46);
        boolean boolean48 = timeZone34.hasSameRules(timeZone39);
        java.util.Calendar calendar49 = java.util.Calendar.getInstance(timeZone39);
        java.util.Calendar.Builder builder50 = builder32.setTimeZone(timeZone39);
        java.util.TimeZone timeZone51 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone52 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone53 = java.util.TimeZone.getDefault();
        boolean boolean54 = timeZone52.hasSameRules(timeZone53);
        boolean boolean55 = timeZone51.hasSameRules(timeZone52);
        boolean boolean56 = timeZone52.observesDaylightTime();
        java.util.TimeZone timeZone57 = java.util.TimeZone.getDefault();
        int int59 = timeZone57.getOffset((long) 2);
        java.util.Locale locale63 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale64 = locale63.stripExtensions();
        java.util.Calendar calendar65 = java.util.Calendar.getInstance(timeZone57, locale64);
        boolean boolean66 = timeZone52.hasSameRules(timeZone57);
        java.util.Locale locale70 = new java.util.Locale("java.text.FieldPosition[field=16,attribute=null,beginIndex=52,endIndex=0]", "\uc2dc\ubd84\ucd08' z", "java.text.FieldPosition[field=-1,attribute=null,beginIndex=0,endIndex=0]");
        java.util.Calendar calendar71 = java.util.Calendar.getInstance(timeZone57, locale70);
        boolean boolean72 = timeZone39.hasSameRules(timeZone57);
        int int73 = timeZone57.getRawOffset();
        boolean boolean74 = timeZone1.hasSameRules(timeZone57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar47 and calendar49", (calendar47.compareTo(calendar49) == 0) == calendar47.equals(calendar49));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone1);
        boolean boolean5 = timeZone1.observesDaylightTime();
        timeZone1.setRawOffset(52);
        java.lang.String str8 = timeZone1.getID();
        java.util.Calendar.Builder builder9 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder11 = builder9.setLenient(false);
        java.util.Calendar.Builder builder15 = builder9.setTimeOfDay(55, 20, 32772);
        java.util.Calendar.Builder builder19 = builder15.setTimeOfDay(1969, 25, (int) (short) 100);
        java.util.Calendar.Builder builder20 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder24 = builder20.setWeekDate(5, (int) (byte) -1, 1);
        java.util.Calendar.Builder builder26 = builder24.setLenient(true);
        java.util.Calendar.Builder builder30 = builder26.setTimeOfDay(122, 11, 10);
        java.util.Calendar.Builder builder34 = builder30.setWeekDate(100, 9, 2);
        java.util.Calendar.Builder builder38 = builder34.setTimeOfDay(52, (int) (short) 10, (-1));
        java.util.Calendar.Builder builder40 = builder38.setLenient(true);
        java.util.Calendar.Builder builder43 = builder38.set(2, 54);
        java.util.TimeZone timeZone45 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone46 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone47 = java.util.TimeZone.getDefault();
        boolean boolean48 = timeZone46.hasSameRules(timeZone47);
        boolean boolean49 = timeZone45.hasSameRules(timeZone46);
        java.util.TimeZone timeZone51 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str52 = timeZone51.getID();
        boolean boolean53 = timeZone46.hasSameRules(timeZone51);
        java.util.Locale locale54 = java.util.Locale.FRANCE;
        boolean boolean55 = locale54.hasExtensions();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat56 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone51, locale54);
        java.util.Calendar.Builder builder57 = builder38.setTimeZone(timeZone51);
        java.util.Calendar.Builder builder58 = builder19.setTimeZone(timeZone51);
        java.util.TimeZone timeZone59 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone60 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone61 = java.util.TimeZone.getDefault();
        boolean boolean62 = timeZone60.hasSameRules(timeZone61);
        boolean boolean63 = timeZone59.hasSameRules(timeZone60);
        java.lang.String str64 = timeZone60.getID();
        java.lang.String str65 = timeZone60.getID();
        int int66 = timeZone60.getRawOffset();
        java.util.Calendar calendar67 = java.util.Calendar.getInstance(timeZone60);
        boolean boolean68 = timeZone51.hasSameRules(timeZone60);
        java.util.Calendar calendar69 = java.util.Calendar.getInstance(timeZone51);
        boolean boolean70 = timeZone1.hasSameRules(timeZone51);
        timeZone51.setID("1900-12-21 0:00:00");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar67 and calendar69", (calendar67.compareTo(calendar69) == 0) == calendar67.equals(calendar69));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        timeZone1.setID("\uc624\ud6c4\uc2dc\ubd84\ucd08 GMT");
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(timeZone1);
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        java.util.Locale locale8 = java.util.Locale.GERMAN;
        java.util.Locale locale9 = java.util.Locale.FRANCE;
        boolean boolean10 = locale9.hasExtensions();
        java.util.Locale locale11 = java.util.Locale.FRANCE;
        java.util.Locale locale12 = java.util.Locale.CHINESE;
        java.lang.String str13 = locale12.getLanguage();
        java.util.Locale[] localeArray14 = new java.util.Locale[] { locale8, locale9, locale11, locale12 };
        java.util.ArrayList<java.util.Locale> localeList15 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList15, localeArray14);
        java.util.Locale.FilteringMode filteringMode17 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList18 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, (java.util.Collection<java.util.Locale>) localeList15, filteringMode17);
        java.util.Spliterator<java.util.Locale> localeSpliterator19 = localeList18.spliterator();
        java.lang.Object[] objArray20 = localeList18.toArray();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList22 = java.util.Locale.LanguageRange.parse("zho");
        java.util.Set<java.lang.String> strSet23 = java.util.Calendar.getAvailableCalendarTypes();
        java.util.stream.Stream<java.lang.String> strStream24 = strSet23.parallelStream();
        java.lang.String str25 = java.util.Locale.lookupTag(languageRangeList22, (java.util.Collection<java.lang.String>) strSet23);
        java.util.stream.Stream<java.lang.String> strStream26 = strSet23.stream();
        boolean boolean27 = localeList18.containsAll((java.util.Collection<java.lang.String>) strSet23);
        java.util.Locale locale31 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale32 = locale31.stripExtensions();
        boolean boolean33 = localeList18.add(locale31);
        java.util.Locale locale37 = new java.util.Locale("21 Feb 2022 14:46:12 GMT", "java.util.GregorianCalendar[time=-58180670029710,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=126,MONTH=4,WEEK_OF_YEAR=18,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=121,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=10,MILLISECOND=290,ZONE_OFFSET=0,DST_OFFSET=0]", "1 janv. 1899 00:05:00");
        java.lang.String str38 = locale31.getDisplayCountry(locale37);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang3.time.FastDateFormat.getInstance("\u6cd5\u6587", timeZone1, locale37);
        java.util.Locale locale40 = java.util.Locale.CHINA;
        java.lang.String str41 = locale37.getDisplayScript(locale40);
        java.util.Calendar calendar42 = java.util.Calendar.getInstance(locale37);
        java.util.Locale locale44 = new java.util.Locale("java.text.FieldPosition[field=32,attribute=null,beginIndex=0,endIndex=0]");
        java.lang.String str45 = locale37.getDisplayName(locale44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar4 and calendar42", (calendar4.compareTo(calendar42) == 0) == calendar4.equals(calendar42));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        java.util.Locale locale2 = new java.util.Locale("\uc624\ud6c4\uc2dc\ubd84\ucd08 GMT", "Wed Mar 16 08:10:49 GMT 2022");
        java.util.TimeZone timeZone4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone4);
        java.lang.String str6 = fastDateFormat5.getPattern();
        java.text.ParsePosition parsePosition9 = new java.text.ParsePosition(16);
        parsePosition9.setIndex(11);
        java.lang.Object obj12 = fastDateFormat5.parseObject("FastDateFormat[]", parsePosition9);
        java.util.TimeZone timeZone13 = fastDateFormat5.getTimeZone();
        java.lang.String str14 = timeZone13.getID();
        java.util.Locale locale16 = new java.util.Locale("zh");
        java.lang.String str17 = locale16.getISO3Country();
        java.util.Calendar calendar18 = java.util.Calendar.getInstance(timeZone13, locale16);
        java.lang.String str19 = locale16.getCountry();
        java.lang.String str20 = locale2.getDisplayName(locale16);
        java.util.TimeZone timeZone22 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone22);
        java.lang.String str24 = fastDateFormat23.toString();
        java.util.Date date30 = new java.util.Date(3, (int) (short) 0, 6, 0, (int) (short) 1);
        java.util.Date date31 = new java.util.Date();
        int int32 = date31.getTimezoneOffset();
        long long33 = date31.getTime();
        boolean boolean34 = date30.after(date31);
        java.lang.StringBuffer stringBuffer35 = null;
        java.lang.StringBuffer stringBuffer36 = fastDateFormat23.format(date30, stringBuffer35);
        java.util.TimeZone timeZone38 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone38);
        java.lang.String str40 = fastDateFormat39.toString();
        java.util.Date date46 = new java.util.Date(3, (int) (short) 0, 6, 0, (int) (short) 1);
        java.util.Date date47 = new java.util.Date();
        int int48 = date47.getTimezoneOffset();
        long long49 = date47.getTime();
        boolean boolean50 = date46.after(date47);
        java.lang.StringBuffer stringBuffer51 = null;
        java.lang.StringBuffer stringBuffer52 = fastDateFormat39.format(date46, stringBuffer51);
        java.util.Calendar calendar53 = java.util.Calendar.getInstance();
        java.lang.StringBuffer stringBuffer54 = null;
        java.lang.StringBuffer stringBuffer55 = fastDateFormat39.format(calendar53, stringBuffer54);
        int int56 = calendar53.getWeekYear();
        java.lang.String str57 = fastDateFormat23.format((java.lang.Object) calendar53);
        java.util.Locale locale58 = java.util.Locale.KOREAN;
        java.lang.String str59 = locale58.getISO3Country();
        java.util.Calendar calendar60 = java.util.Calendar.getInstance(locale58);
        java.lang.String str61 = fastDateFormat23.format(calendar60);
        java.util.TimeZone timeZone62 = java.util.TimeZone.getDefault();
        int int64 = timeZone62.getOffset((long) 2);
        java.util.Locale locale68 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale69 = locale68.stripExtensions();
        java.util.Calendar calendar70 = java.util.Calendar.getInstance(timeZone62, locale69);
        calendar70.set(122, 52, (int) (byte) 1);
        int int75 = calendar70.getWeeksInWeekYear();
        calendar70.add(13, 0);
        calendar70.set(17, 4, 58, 32769, 7, 54);
        int int87 = calendar70.getLeastMaximum(15);
        calendar70.set(120, (int) 'a', 0, (int) '4', 17);
        int int94 = calendar70.getFirstDayOfWeek();
        java.lang.StringBuffer stringBuffer95 = null;
        java.lang.StringBuffer stringBuffer96 = fastDateFormat23.format(calendar70, stringBuffer95);
        boolean boolean97 = locale2.equals((java.lang.Object) stringBuffer96);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar18 and calendar53", (calendar18.compareTo(calendar53) == 0) == calendar18.equals(calendar53));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone1);
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(timeZone1);
        timeZone1.setRawOffset(50);
        java.util.Locale locale9 = new java.util.Locale("2:45:52 PM UTC");
        java.util.Locale locale11 = new java.util.Locale("zh");
        java.lang.String str12 = locale9.getDisplayScript(locale11);
        java.util.TimeZone timeZone14 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone14);
        java.lang.String str16 = fastDateFormat15.getPattern();
        java.text.ParsePosition parsePosition19 = new java.text.ParsePosition(16);
        parsePosition19.setIndex(11);
        java.lang.Object obj22 = fastDateFormat15.parseObject("FastDateFormat[]", parsePosition19);
        java.util.TimeZone timeZone23 = fastDateFormat15.getTimeZone();
        java.lang.String str24 = timeZone23.getID();
        java.util.Locale locale26 = new java.util.Locale("zh");
        java.lang.String str27 = locale26.getISO3Country();
        java.util.Calendar calendar28 = java.util.Calendar.getInstance(timeZone23, locale26);
        java.lang.String str29 = locale9.getDisplayName(locale26);
        java.lang.String str30 = locale9.getISO3Country();
        java.lang.String str32 = locale9.getExtension('x');
        java.util.Calendar calendar33 = java.util.Calendar.getInstance(timeZone1, locale9);
        java.lang.String str34 = calendar33.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar5 and calendar28", (calendar5.compareTo(calendar28) == 0) == calendar5.equals(calendar28));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone2);
        java.lang.String str4 = fastDateFormat3.toString();
        java.util.Date date10 = new java.util.Date(3, (int) (short) 0, 6, 0, (int) (short) 1);
        java.util.Date date11 = new java.util.Date();
        int int12 = date11.getTimezoneOffset();
        long long13 = date11.getTime();
        boolean boolean14 = date10.after(date11);
        java.lang.StringBuffer stringBuffer15 = null;
        java.lang.StringBuffer stringBuffer16 = fastDateFormat3.format(date10, stringBuffer15);
        java.util.Calendar calendar17 = java.util.Calendar.getInstance();
        java.lang.StringBuffer stringBuffer18 = null;
        java.lang.StringBuffer stringBuffer19 = fastDateFormat3.format(calendar17, stringBuffer18);
        int int20 = calendar17.getFirstDayOfWeek();
        java.util.TimeZone timeZone21 = calendar17.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone21);
        java.time.ZoneId zoneId23 = timeZone21.toZoneId();
        java.util.TimeZone timeZone24 = java.util.TimeZone.getTimeZone(zoneId23);
        java.util.Calendar.Builder builder25 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder29 = builder25.setWeekDate(5, (int) (byte) -1, 1);
        java.util.Calendar.Builder builder31 = builder29.setLenient(true);
        java.util.Calendar.Builder builder35 = builder31.setTimeOfDay(122, 11, 10);
        java.util.Calendar.Builder builder39 = builder35.setWeekDate(100, 9, 2);
        java.util.Calendar.Builder builder43 = builder39.setTimeOfDay(52, (int) (short) 10, (-1));
        java.util.Calendar.Builder builder45 = builder43.setLenient(true);
        java.util.Calendar.Builder builder48 = builder43.set(2, 54);
        java.util.Calendar.Builder builder50 = builder43.setLenient(false);
        java.util.TimeZone timeZone52 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str53 = timeZone52.getID();
        java.util.TimeZone.setDefault(timeZone52);
        java.util.Calendar.Builder builder55 = builder43.setTimeZone(timeZone52);
        java.util.Calendar.Builder builder59 = builder43.setDate(120, 52, (int) '#');
        java.util.Locale locale61 = new java.util.Locale("21 Feb 2022 14:46:12 GMT");
        java.util.Locale.setDefault(locale61);
        java.util.Calendar.Builder builder63 = builder43.setLocale(locale61);
        java.util.Locale locale64 = java.util.Locale.CHINA;
        java.util.TimeZone timeZone65 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone66 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone67 = java.util.TimeZone.getDefault();
        boolean boolean68 = timeZone66.hasSameRules(timeZone67);
        boolean boolean69 = timeZone65.hasSameRules(timeZone66);
        boolean boolean70 = timeZone66.observesDaylightTime();
        timeZone66.setRawOffset(52);
        timeZone66.setID("Temps universel coordonn\351");
        java.util.Locale locale76 = new java.util.Locale("zh");
        java.util.Locale locale77 = java.util.Locale.CHINESE;
        java.lang.String str78 = locale77.getLanguage();
        boolean boolean79 = locale77.hasExtensions();
        java.lang.String str80 = locale77.getDisplayCountry();
        java.lang.String str81 = locale76.getDisplayName(locale77);
        java.util.Calendar calendar82 = java.util.Calendar.getInstance(timeZone66, locale76);
        java.util.Set<java.lang.Character> charSet83 = locale76.getExtensionKeys();
        java.lang.String str84 = locale64.getDisplayCountry(locale76);
        java.lang.String str85 = locale61.getDisplayScript(locale64);
        java.util.Set<java.lang.Character> charSet86 = locale64.getExtensionKeys();
        java.util.Calendar calendar87 = java.util.Calendar.getInstance(timeZone24, locale64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar17 and calendar82", (calendar17.compareTo(calendar82) == 0) == calendar17.equals(calendar82));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
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
        java.util.Iterator<java.util.Locale> localeItor52 = localeList27.iterator();
        java.util.Iterator<java.util.Locale> localeItor53 = localeList27.iterator();
        localeList27.clear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar46 and calendar48", (calendar46.compareTo(calendar48) == 0) == calendar46.equals(calendar48));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone1);
        boolean boolean5 = timeZone1.observesDaylightTime();
        timeZone1.setRawOffset(52);
        java.lang.String str8 = timeZone1.getID();
        java.util.TimeZone timeZone9 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone10 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone11 = java.util.TimeZone.getDefault();
        boolean boolean12 = timeZone10.hasSameRules(timeZone11);
        boolean boolean13 = timeZone9.hasSameRules(timeZone10);
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone10);
        timeZone10.setID("java.text.AttributedCharacterIterator$Attribute(input_method_segment)");
        java.util.Locale locale17 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar18 = java.util.Calendar.getInstance(timeZone10, locale17);
        java.util.TimeZone.setDefault(timeZone10);
        java.util.TimeZone.setDefault(timeZone10);
        java.util.Calendar calendar21 = java.util.Calendar.getInstance(timeZone10);
        boolean boolean22 = timeZone1.hasSameRules(timeZone10);
        java.util.Locale locale25 = new java.util.Locale("fran\347ais (France)", "2:46:21 PM UTC");
        java.lang.String str26 = timeZone10.getDisplayName(locale25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar14 and calendar18", (calendar14.compareTo(calendar18) == 0) == calendar14.equals(calendar18));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
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
        java.util.TimeZone timeZone16 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone17 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone18 = java.util.TimeZone.getDefault();
        boolean boolean19 = timeZone17.hasSameRules(timeZone18);
        boolean boolean20 = timeZone16.hasSameRules(timeZone17);
        timeZone17.setID("Mon Feb 21 14:45:50 GMT 2022");
        int int24 = timeZone17.getOffset(1645454782547L);
        int int25 = timeZone17.getRawOffset();
        boolean boolean26 = timeZone1.hasSameRules(timeZone17);
        java.lang.String str27 = timeZone17.getID();
        java.util.Calendar calendar28 = java.util.Calendar.getInstance(timeZone17);
        int int29 = timeZone17.getDSTSavings();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar14 and calendar28", (calendar14.compareTo(calendar28) == 0) == calendar14.equals(calendar28));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
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
        java.lang.Object obj21 = fastDateFormat2.clone();
        java.util.TimeZone timeZone22 = fastDateFormat2.getTimeZone();
        java.util.Locale locale23 = java.util.Locale.CHINA;
        java.lang.String str25 = locale23.getExtension('x');
        java.util.Set<java.lang.Character> charSet26 = locale23.getExtensionKeys();
        java.util.Set<java.lang.String> strSet27 = locale23.getUnicodeLocaleAttributes();
        java.util.Calendar calendar28 = java.util.Calendar.getInstance(timeZone22, locale23);
        int int29 = timeZone22.getRawOffset();
        java.util.Calendar calendar30 = java.util.Calendar.getInstance();
        calendar30.setMinimalDaysInFirstWeek(12);
        calendar30.clear();
        calendar30.set(41, 5, 37);
        java.time.Instant instant38 = calendar30.toInstant();
        java.util.Date date39 = java.util.Date.from(instant38);
        java.util.TimeZone timeZone41 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone41);
        java.lang.String str43 = fastDateFormat42.toString();
        java.util.Date date49 = new java.util.Date(3, (int) (short) 0, 6, 0, (int) (short) 1);
        java.util.Date date50 = new java.util.Date();
        int int51 = date50.getTimezoneOffset();
        long long52 = date50.getTime();
        boolean boolean53 = date49.after(date50);
        java.lang.StringBuffer stringBuffer54 = null;
        java.lang.StringBuffer stringBuffer55 = fastDateFormat42.format(date49, stringBuffer54);
        java.util.Date date56 = new java.util.Date();
        int int57 = date56.getTimezoneOffset();
        long long58 = date56.getTime();
        java.util.Date date59 = new java.util.Date();
        int int60 = date59.getSeconds();
        date59.setTime((long) 16);
        date59.setMinutes(12);
        int int65 = date59.getSeconds();
        boolean boolean66 = date56.after(date59);
        boolean boolean67 = fastDateFormat42.equals((java.lang.Object) date56);
        date56.setHours(58);
        date56.setMinutes((-1));
        boolean boolean72 = date39.before(date56);
        boolean boolean73 = timeZone22.inDaylightTime(date56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar13 and calendar28", (calendar13.compareTo(calendar28) == 0) == calendar13.equals(calendar28));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone1);
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(timeZone1);
        timeZone1.setRawOffset(50);
        java.util.Locale locale9 = new java.util.Locale("2:45:52 PM UTC");
        java.util.Locale locale11 = new java.util.Locale("zh");
        java.lang.String str12 = locale9.getDisplayScript(locale11);
        java.util.TimeZone timeZone14 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone14);
        java.lang.String str16 = fastDateFormat15.getPattern();
        java.text.ParsePosition parsePosition19 = new java.text.ParsePosition(16);
        parsePosition19.setIndex(11);
        java.lang.Object obj22 = fastDateFormat15.parseObject("FastDateFormat[]", parsePosition19);
        java.util.TimeZone timeZone23 = fastDateFormat15.getTimeZone();
        java.lang.String str24 = timeZone23.getID();
        java.util.Locale locale26 = new java.util.Locale("zh");
        java.lang.String str27 = locale26.getISO3Country();
        java.util.Calendar calendar28 = java.util.Calendar.getInstance(timeZone23, locale26);
        java.lang.String str29 = locale9.getDisplayName(locale26);
        java.lang.String str30 = locale9.getISO3Country();
        java.lang.String str32 = locale9.getExtension('x');
        java.util.Calendar calendar33 = java.util.Calendar.getInstance(timeZone1, locale9);
        java.time.Instant instant34 = calendar33.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar5 and calendar28", (calendar5.compareTo(calendar28) == 0) == calendar5.equals(calendar28));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
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
        int int52 = localeList27.size();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar46 and calendar48", (calendar46.compareTo(calendar48) == 0) == calendar46.equals(calendar48));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        int int3 = timeZone1.getOffset((long) 2);
        timeZone1.setID("2:46:04 PM UTC");
        java.util.Locale locale7 = new java.util.Locale("zh");
        java.lang.String str8 = locale7.getDisplayVariant();
        java.lang.String str9 = locale7.getDisplayCountry();
        java.lang.String str10 = locale7.getDisplayVariant();
        java.lang.String str11 = locale7.getCountry();
        java.util.Calendar calendar12 = java.util.Calendar.getInstance(locale7);
        java.util.Locale.setDefault(locale7);
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone1, locale7);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar12 and calendar14", (calendar12.compareTo(calendar14) == 0) == calendar12.equals(calendar14));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
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
        java.util.Locale.LanguageRange[] languageRangeArray52 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList53 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList53, languageRangeArray52);
        java.util.Locale locale55 = java.util.Locale.GERMAN;
        java.util.Locale locale56 = java.util.Locale.FRANCE;
        boolean boolean57 = locale56.hasExtensions();
        java.util.Locale locale58 = java.util.Locale.FRANCE;
        java.util.Locale locale59 = java.util.Locale.CHINESE;
        java.lang.String str60 = locale59.getLanguage();
        java.util.Locale[] localeArray61 = new java.util.Locale[] { locale55, locale56, locale58, locale59 };
        java.util.ArrayList<java.util.Locale> localeList62 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList62, localeArray61);
        java.util.Locale.FilteringMode filteringMode64 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList65 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList53, (java.util.Collection<java.util.Locale>) localeList62, filteringMode64);
        java.util.Spliterator<java.util.Locale> localeSpliterator66 = localeList65.spliterator();
        java.util.Iterator<java.util.Locale> localeItor67 = localeList65.iterator();
        java.util.Set<java.lang.String> strSet68 = java.util.Calendar.getAvailableCalendarTypes();
        java.util.stream.Stream<java.lang.String> strStream69 = strSet68.parallelStream();
        boolean boolean70 = localeList65.removeAll((java.util.Collection<java.lang.String>) strSet68);
        java.util.TimeZone timeZone72 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat73 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone72);
        java.lang.String str74 = fastDateFormat73.toString();
        java.lang.Object obj75 = fastDateFormat73.clone();
        java.util.Locale locale76 = fastDateFormat73.getLocale();
        boolean boolean77 = locale76.hasExtensions();
        boolean boolean78 = localeList65.add(locale76);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList80 = java.util.Locale.LanguageRange.parse("zh");
        java.util.Locale locale81 = java.util.Locale.US;
        java.lang.String str82 = locale81.getDisplayVariant();
        java.util.Set<java.lang.String> strSet83 = locale81.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode84 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList85 = java.util.Locale.filterTags(languageRangeList80, (java.util.Collection<java.lang.String>) strSet83, filteringMode84);
        boolean boolean86 = localeList65.containsAll((java.util.Collection<java.lang.String>) strList85);
        boolean boolean87 = localeList27.retainAll((java.util.Collection<java.lang.String>) strList85);
        java.util.Iterator<java.util.Locale> localeItor88 = localeList27.iterator();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar46 and calendar48", (calendar46.compareTo(calendar48) == 0) == calendar46.equals(calendar48));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        java.util.Locale locale1 = java.util.Locale.US;
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        java.util.TimeZone timeZone3 = calendar2.getTimeZone();
        java.util.Locale locale4 = java.util.Locale.US;
        java.lang.String str5 = locale4.getCountry();
        boolean boolean6 = locale4.hasExtensions();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, timeZone3, locale4);
        java.util.TimeZone timeZone8 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone9 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone10 = java.util.TimeZone.getDefault();
        boolean boolean11 = timeZone9.hasSameRules(timeZone10);
        boolean boolean12 = timeZone8.hasSameRules(timeZone9);
        boolean boolean13 = timeZone9.observesDaylightTime();
        java.util.TimeZone timeZone14 = java.util.TimeZone.getDefault();
        int int16 = timeZone14.getOffset((long) 2);
        java.util.Locale locale20 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale21 = locale20.stripExtensions();
        java.util.Calendar calendar22 = java.util.Calendar.getInstance(timeZone14, locale21);
        boolean boolean23 = timeZone9.hasSameRules(timeZone14);
        boolean boolean24 = timeZone3.hasSameRules(timeZone14);
        timeZone3.setID("\uc624\ud6c4\uc2dc\ubd84\ucd08 GMT");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar2 and calendar22", (calendar2.compareTo(calendar22) == 0) == calendar2.equals(calendar22));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
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
        java.lang.String str36 = fastDateFormat2.format((long) 70);
        java.util.Locale locale37 = java.util.Locale.US;
        java.lang.String str38 = locale37.getDisplayVariant();
        java.util.Locale locale39 = java.util.Locale.FRANCE;
        boolean boolean40 = locale39.hasExtensions();
        java.util.Locale locale41 = java.util.Locale.ROOT;
        java.lang.String str42 = locale39.getDisplayName(locale41);
        java.lang.String str43 = locale41.getCountry();
        java.lang.String str44 = locale37.getDisplayVariant(locale41);
        java.util.Calendar calendar45 = java.util.Calendar.getInstance(locale41);
        calendar45.clear();
        java.lang.String str47 = fastDateFormat2.format(calendar45);
        int int49 = calendar45.getMaximum(7);
        java.util.TimeZone timeZone50 = java.util.TimeZone.getDefault();
        int int52 = timeZone50.getOffset((long) 2);
        java.util.Locale locale56 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale57 = locale56.stripExtensions();
        java.util.Calendar calendar58 = java.util.Calendar.getInstance(timeZone50, locale57);
        calendar58.set(122, 52, (int) (byte) 1);
        int int63 = calendar58.getWeeksInWeekYear();
        boolean boolean64 = calendar58.isWeekDateSupported();
        java.util.TimeZone timeZone65 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone66 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone67 = java.util.TimeZone.getDefault();
        boolean boolean68 = timeZone66.hasSameRules(timeZone67);
        boolean boolean69 = timeZone65.hasSameRules(timeZone66);
        java.util.TimeZone timeZone71 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str72 = timeZone71.getID();
        boolean boolean73 = timeZone66.hasSameRules(timeZone71);
        boolean boolean74 = timeZone66.observesDaylightTime();
        calendar58.setTimeZone(timeZone66);
        calendar45.setTimeZone(timeZone66);
        java.util.Locale.Builder builder77 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder80 = builder77.setExtension('a', "France");
        java.util.Locale.Builder builder82 = builder77.removeUnicodeLocaleAttribute("GMT");
        java.util.Locale locale83 = java.util.Locale.FRANCE;
        java.lang.String str84 = locale83.getVariant();
        java.lang.String str85 = locale83.getDisplayCountry();
        java.util.Locale.Builder builder86 = builder77.setLocale(locale83);
        java.lang.String str87 = locale83.toLanguageTag();
        java.lang.String str88 = locale83.getScript();
        java.util.Calendar calendar89 = java.util.Calendar.getInstance(timeZone66, locale83);
        java.util.Locale locale90 = locale83.stripExtensions();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar13 and calendar89", (calendar13.compareTo(calendar89) == 0) == calendar13.equals(calendar89));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone1);
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(timeZone1);
        timeZone1.setRawOffset(50);
        java.util.Locale locale9 = new java.util.Locale("2:45:52 PM UTC");
        java.util.Locale locale11 = new java.util.Locale("zh");
        java.lang.String str12 = locale9.getDisplayScript(locale11);
        java.util.TimeZone timeZone14 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone14);
        java.lang.String str16 = fastDateFormat15.getPattern();
        java.text.ParsePosition parsePosition19 = new java.text.ParsePosition(16);
        parsePosition19.setIndex(11);
        java.lang.Object obj22 = fastDateFormat15.parseObject("FastDateFormat[]", parsePosition19);
        java.util.TimeZone timeZone23 = fastDateFormat15.getTimeZone();
        java.lang.String str24 = timeZone23.getID();
        java.util.Locale locale26 = new java.util.Locale("zh");
        java.lang.String str27 = locale26.getISO3Country();
        java.util.Calendar calendar28 = java.util.Calendar.getInstance(timeZone23, locale26);
        java.lang.String str29 = locale9.getDisplayName(locale26);
        java.lang.String str30 = locale9.getISO3Country();
        java.lang.String str32 = locale9.getExtension('x');
        java.util.Calendar calendar33 = java.util.Calendar.getInstance(timeZone1, locale9);
        timeZone1.setID("2:46:18 PM UTC");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar5 and calendar28", (calendar5.compareTo(calendar28) == 0) == calendar5.equals(calendar28));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("\uc624\ud6c4\uc2dc\ubd84\ucd08 GMT");
        java.util.TimeZone timeZone3 = java.util.TimeZone.getTimeZone("2:45:54 PM UTC");
        boolean boolean4 = timeZone1.hasSameRules(timeZone3);
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        java.util.Locale locale8 = java.util.Locale.GERMAN;
        java.util.Locale locale9 = java.util.Locale.FRANCE;
        boolean boolean10 = locale9.hasExtensions();
        java.util.Locale locale11 = java.util.Locale.FRANCE;
        java.util.Locale locale12 = java.util.Locale.CHINESE;
        java.lang.String str13 = locale12.getLanguage();
        java.util.Locale[] localeArray14 = new java.util.Locale[] { locale8, locale9, locale11, locale12 };
        java.util.ArrayList<java.util.Locale> localeList15 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList15, localeArray14);
        java.util.Locale.FilteringMode filteringMode17 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList18 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, (java.util.Collection<java.util.Locale>) localeList15, filteringMode17);
        java.util.Spliterator<java.util.Locale> localeSpliterator19 = localeList18.spliterator();
        java.util.Iterator<java.util.Locale> localeItor20 = localeList18.iterator();
        java.util.Set<java.lang.String> strSet21 = java.util.Calendar.getAvailableCalendarTypes();
        java.util.stream.Stream<java.lang.String> strStream22 = strSet21.parallelStream();
        boolean boolean23 = localeList18.removeAll((java.util.Collection<java.lang.String>) strSet21);
        java.util.TimeZone timeZone25 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone25);
        java.lang.String str27 = fastDateFormat26.toString();
        java.lang.Object obj28 = fastDateFormat26.clone();
        java.util.Locale locale29 = fastDateFormat26.getLocale();
        boolean boolean30 = locale29.hasExtensions();
        boolean boolean31 = localeList18.add(locale29);
        java.util.Calendar calendar32 = java.util.Calendar.getInstance(timeZone3, locale29);
        java.util.Locale locale35 = new java.util.Locale("Coordinated Universal Time", "h:mm:ss a z");
        java.util.Locale locale37 = java.util.Locale.forLanguageTag("2:46:18 PM UTC");
        java.lang.String str38 = locale37.getVariant();
        java.util.Locale locale39 = java.util.Locale.US;
        java.util.Locale locale40 = locale39.stripExtensions();
        java.util.Locale locale41 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet42 = locale41.getUnicodeLocaleKeys();
        java.lang.String str43 = locale40.getDisplayVariant(locale41);
        java.lang.String str44 = locale37.getDisplayVariant(locale41);
        java.lang.String str45 = locale35.getDisplayLanguage(locale41);
        java.util.Calendar calendar46 = java.util.Calendar.getInstance(timeZone3, locale41);
        java.util.Set<java.lang.Character> charSet47 = locale41.getExtensionKeys();
        java.util.TimeZone timeZone50 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str51 = timeZone50.getID();
        java.util.TimeZone.setDefault(timeZone50);
        java.util.Calendar calendar53 = java.util.Calendar.getInstance(timeZone50);
        int int54 = calendar53.getFirstDayOfWeek();
        java.util.TimeZone timeZone55 = java.util.TimeZone.getDefault();
        int int57 = timeZone55.getOffset((long) 2);
        java.util.Locale locale61 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale62 = locale61.stripExtensions();
        java.util.Calendar calendar63 = java.util.Calendar.getInstance(timeZone55, locale62);
        calendar53.setTimeZone(timeZone55);
        java.lang.String str65 = timeZone55.getID();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat66 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, timeZone55);
        java.util.Calendar calendar67 = java.util.Calendar.getInstance(timeZone55);
        timeZone55.setRawOffset(48);
        int int71 = timeZone55.getOffset(1645454977568L);
        boolean boolean72 = locale41.equals((java.lang.Object) timeZone55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar32 and calendar53", (calendar32.compareTo(calendar53) == 0) == calendar32.equals(calendar53));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
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
        calendar4.setTimeInMillis((long) 14);
        int int19 = calendar4.getMaximum(11);
        int int21 = calendar4.getActualMaximum((int) (short) 0);
        int int22 = calendar4.getWeekYear();
        calendar4.setMinimalDaysInFirstWeek((-1616));
        java.util.TimeZone timeZone26 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone26);
        java.lang.String str28 = fastDateFormat27.getPattern();
        java.util.Date date29 = new java.util.Date();
        int int30 = date29.getSeconds();
        java.lang.String str31 = fastDateFormat27.format(date29);
        java.text.ParsePosition parsePosition34 = new java.text.ParsePosition(16);
        int int35 = parsePosition34.getErrorIndex();
        java.lang.Object obj36 = fastDateFormat27.parseObject("Temps universel coordonn\351", parsePosition34);
        parsePosition34.setIndex((int) (short) -1);
        parsePosition34.setIndex((int) (short) 0);
        parsePosition34.setErrorIndex((-1));
        java.util.Locale locale44 = java.util.Locale.KOREA;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, locale44);
        java.lang.String str47 = fastDateFormat45.format((java.lang.Object) 1645454750118L);
        java.util.TimeZone timeZone48 = java.util.TimeZone.getDefault();
        int int50 = timeZone48.getOffset((long) 2);
        java.util.Locale locale54 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale55 = locale54.stripExtensions();
        java.util.Calendar calendar56 = java.util.Calendar.getInstance(timeZone48, locale55);
        int int58 = calendar56.getLeastMaximum(4);
        calendar56.setFirstDayOfWeek((-1));
        int int61 = calendar56.getFirstDayOfWeek();
        java.lang.String str62 = fastDateFormat45.format(calendar56);
        java.lang.Object obj63 = fastDateFormat45.clone();
        java.util.Date date64 = new java.util.Date();
        int int65 = date64.getSeconds();
        date64.setTime((long) 16);
        date64.setMinutes(12);
        int int70 = date64.getMinutes();
        java.util.Date date71 = new java.util.Date();
        int int72 = date71.getTimezoneOffset();
        date71.setMinutes(5);
        int int75 = date71.getMonth();
        boolean boolean76 = date64.before(date71);
        java.lang.String str77 = fastDateFormat45.format(date64);
        java.lang.String str79 = fastDateFormat45.format((long) 70);
        java.util.Locale locale80 = java.util.Locale.US;
        java.lang.String str81 = locale80.getDisplayVariant();
        java.util.Locale locale82 = java.util.Locale.FRANCE;
        boolean boolean83 = locale82.hasExtensions();
        java.util.Locale locale84 = java.util.Locale.ROOT;
        java.lang.String str85 = locale82.getDisplayName(locale84);
        java.lang.String str86 = locale84.getCountry();
        java.lang.String str87 = locale80.getDisplayVariant(locale84);
        java.util.Calendar calendar88 = java.util.Calendar.getInstance(locale84);
        calendar88.clear();
        java.lang.String str90 = fastDateFormat45.format(calendar88);
        java.time.Instant instant91 = calendar88.toInstant();
        boolean boolean92 = parsePosition34.equals((java.lang.Object) instant91);
        boolean boolean94 = parsePosition34.equals((java.lang.Object) "\uc624\ud6c4\uc2dc\ubd84\ucd08 GMT");
        int int95 = parsePosition34.getIndex();
        parsePosition34.setErrorIndex(97);
        boolean boolean98 = calendar4.before((java.lang.Object) parsePosition34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar14 and calendar56", (calendar14.compareTo(calendar56) == 0) == calendar14.equals(calendar56));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
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
        java.lang.String str36 = fastDateFormat2.format((long) 70);
        java.util.Locale locale37 = java.util.Locale.US;
        java.lang.String str38 = locale37.getDisplayVariant();
        java.util.Locale locale39 = java.util.Locale.FRANCE;
        boolean boolean40 = locale39.hasExtensions();
        java.util.Locale locale41 = java.util.Locale.ROOT;
        java.lang.String str42 = locale39.getDisplayName(locale41);
        java.lang.String str43 = locale41.getCountry();
        java.lang.String str44 = locale37.getDisplayVariant(locale41);
        java.util.Calendar calendar45 = java.util.Calendar.getInstance(locale41);
        calendar45.clear();
        java.lang.String str47 = fastDateFormat2.format(calendar45);
        int int49 = calendar45.getMaximum(7);
        java.util.TimeZone timeZone50 = java.util.TimeZone.getDefault();
        int int52 = timeZone50.getOffset((long) 2);
        java.util.Locale locale56 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale57 = locale56.stripExtensions();
        java.util.Calendar calendar58 = java.util.Calendar.getInstance(timeZone50, locale57);
        calendar58.set(122, 52, (int) (byte) 1);
        int int63 = calendar58.getWeeksInWeekYear();
        boolean boolean64 = calendar58.isWeekDateSupported();
        java.util.TimeZone timeZone65 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone66 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone67 = java.util.TimeZone.getDefault();
        boolean boolean68 = timeZone66.hasSameRules(timeZone67);
        boolean boolean69 = timeZone65.hasSameRules(timeZone66);
        java.util.TimeZone timeZone71 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str72 = timeZone71.getID();
        boolean boolean73 = timeZone66.hasSameRules(timeZone71);
        boolean boolean74 = timeZone66.observesDaylightTime();
        calendar58.setTimeZone(timeZone66);
        calendar45.setTimeZone(timeZone66);
        java.util.Locale.Builder builder77 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder80 = builder77.setExtension('a', "France");
        java.util.Locale.Builder builder82 = builder77.removeUnicodeLocaleAttribute("GMT");
        java.util.Locale locale83 = java.util.Locale.FRANCE;
        java.lang.String str84 = locale83.getVariant();
        java.lang.String str85 = locale83.getDisplayCountry();
        java.util.Locale.Builder builder86 = builder77.setLocale(locale83);
        java.lang.String str87 = locale83.toLanguageTag();
        java.lang.String str88 = locale83.getScript();
        java.util.Calendar calendar89 = java.util.Calendar.getInstance(timeZone66, locale83);
        java.lang.String str90 = timeZone66.getID();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar13 and calendar89", (calendar13.compareTo(calendar89) == 0) == calendar13.equals(calendar89));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
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
        java.util.TimeZone timeZone17 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone18 = java.util.TimeZone.getDefault();
        boolean boolean19 = timeZone17.hasSameRules(timeZone18);
        java.util.Locale locale23 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale24 = locale23.stripExtensions();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone17, locale23);
        java.lang.Object obj26 = fastDateFormat25.clone();
        boolean boolean27 = calendar4.after((java.lang.Object) fastDateFormat25);
        java.util.Locale locale28 = fastDateFormat25.getLocale();
        java.util.Locale.LanguageRange[] languageRangeArray29 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList30 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList30, languageRangeArray29);
        java.util.Locale locale32 = java.util.Locale.CHINESE;
        java.lang.String str33 = locale32.getLanguage();
        boolean boolean34 = locale32.hasExtensions();
        java.lang.String str35 = locale32.getDisplayCountry();
        java.util.Set<java.lang.String> strSet36 = locale32.getUnicodeLocaleKeys();
        java.lang.String str37 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList30, (java.util.Collection<java.lang.String>) strSet36);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap38 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList39 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList30, strMap38);
        java.util.Locale.LanguageRange[] languageRangeArray40 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList41 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList41, languageRangeArray40);
        java.util.Locale locale43 = java.util.Locale.GERMAN;
        java.util.Locale locale44 = java.util.Locale.FRANCE;
        boolean boolean45 = locale44.hasExtensions();
        java.util.Locale locale46 = java.util.Locale.FRANCE;
        java.util.Locale locale47 = java.util.Locale.CHINESE;
        java.lang.String str48 = locale47.getLanguage();
        java.util.Locale[] localeArray49 = new java.util.Locale[] { locale43, locale44, locale46, locale47 };
        java.util.ArrayList<java.util.Locale> localeList50 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList50, localeArray49);
        java.util.Locale.FilteringMode filteringMode52 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList53 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList41, (java.util.Collection<java.util.Locale>) localeList50, filteringMode52);
        java.util.List<java.util.Locale> localeList54 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList30, (java.util.Collection<java.util.Locale>) localeList50);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList56 = java.util.Locale.LanguageRange.parse("zho");
        java.util.Set<java.lang.String> strSet57 = java.util.Calendar.getAvailableCalendarTypes();
        java.util.stream.Stream<java.lang.String> strStream58 = strSet57.parallelStream();
        java.lang.String str59 = java.util.Locale.lookupTag(languageRangeList56, (java.util.Collection<java.lang.String>) strSet57);
        java.lang.String[] strArray76 = new java.lang.String[] { "FastDateFormat[h:mm:ss a z]", "FastDateFormat[h:mm:ss a z]", "GMT", "21 Feb 2022 14:45:53 GMT", "2:45:56 PM UTC", "zh", "HI!", "Etc/UTC", "GMT", "Chinese", "zho", "21 Feb 2022 14:45:53 GMT", "21 Feb 2022 14:45:54 GMT", "Mon Feb 21 14:45:54 UTC 2022", "zh", "HI!" };
        java.util.ArrayList<java.lang.String> strList77 = new java.util.ArrayList<java.lang.String>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList77, strArray76);
        java.lang.String str79 = java.util.Locale.lookupTag(languageRangeList56, (java.util.Collection<java.lang.String>) strList77);
        java.util.stream.Stream<java.lang.String> strStream80 = strList77.parallelStream();
        boolean boolean81 = localeList50.retainAll((java.util.Collection<java.lang.String>) strList77);
        java.util.Iterator<java.util.Locale> localeItor82 = localeList50.iterator();
        int int83 = localeList50.size();
        boolean boolean84 = fastDateFormat25.equals((java.lang.Object) localeList50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar4 and calendar14", (calendar4.compareTo(calendar14) == 0) == calendar4.equals(calendar14));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone1);
        java.time.ZoneId zoneId5 = timeZone0.toZoneId();
        java.util.TimeZone.setDefault(timeZone0);
        java.lang.String str7 = timeZone0.getID();
        java.util.TimeZone timeZone8 = java.util.TimeZone.getDefault();
        int int10 = timeZone8.getOffset((long) 2);
        java.util.Locale locale14 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale15 = locale14.stripExtensions();
        java.util.Calendar calendar16 = java.util.Calendar.getInstance(timeZone8, locale15);
        java.lang.String str17 = timeZone8.getID();
        java.util.Locale locale18 = java.util.Locale.US;
        java.util.Calendar calendar19 = java.util.Calendar.getInstance(timeZone8, locale18);
        int int20 = timeZone8.getRawOffset();
        boolean boolean21 = timeZone0.hasSameRules(timeZone8);
        timeZone0.setRawOffset(50400000);
        java.util.TimeZone timeZone25 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone25);
        java.lang.String str27 = fastDateFormat26.toString();
        java.lang.Object obj28 = fastDateFormat26.clone();
        java.util.Locale locale29 = fastDateFormat26.getLocale();
        java.lang.Object obj30 = fastDateFormat26.clone();
        java.util.TimeZone timeZone31 = java.util.TimeZone.getDefault();
        int int33 = timeZone31.getOffset((long) 2);
        java.util.Locale locale37 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale38 = locale37.stripExtensions();
        java.util.Calendar calendar39 = java.util.Calendar.getInstance(timeZone31, locale38);
        java.lang.String str40 = fastDateFormat26.format(calendar39);
        java.util.Locale locale41 = fastDateFormat26.getLocale();
        java.util.TimeZone timeZone43 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone43);
        java.lang.String str46 = fastDateFormat44.format((long) '#');
        java.lang.String str47 = fastDateFormat44.toString();
        java.util.TimeZone timeZone48 = java.util.TimeZone.getDefault();
        int int50 = timeZone48.getOffset((long) 2);
        java.util.Locale locale54 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale55 = locale54.stripExtensions();
        java.util.Calendar calendar56 = java.util.Calendar.getInstance(timeZone48, locale55);
        int int58 = calendar56.getLeastMaximum(4);
        calendar56.setFirstDayOfWeek((-1));
        int int61 = calendar56.getFirstDayOfWeek();
        long long62 = calendar56.getTimeInMillis();
        calendar56.set((int) (byte) 0, 49, 15, (int) (short) 1, 8);
        java.lang.String str69 = fastDateFormat44.format(calendar56);
        int int70 = calendar56.getMinimalDaysInFirstWeek();
        int int71 = calendar56.getMinimalDaysInFirstWeek();
        int int73 = calendar56.getMaximum((int) (short) 1);
        java.lang.StringBuffer stringBuffer74 = null;
        java.lang.StringBuffer stringBuffer75 = fastDateFormat26.format(calendar56, stringBuffer74);
        java.util.TimeZone timeZone77 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat78 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone77);
        java.lang.String str79 = fastDateFormat78.getPattern();
        java.lang.String str80 = fastDateFormat78.toString();
        java.util.TimeZone timeZone81 = fastDateFormat78.getTimeZone();
        calendar56.setTimeZone(timeZone81);
        boolean boolean83 = timeZone0.hasSameRules(timeZone81);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar16 and calendar39", (calendar16.compareTo(calendar39) == 0) == calendar16.equals(calendar39));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
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
        java.util.TimeZone timeZone17 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone18 = java.util.TimeZone.getDefault();
        boolean boolean19 = timeZone17.hasSameRules(timeZone18);
        java.util.Locale locale23 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale24 = locale23.stripExtensions();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone17, locale23);
        java.lang.Object obj26 = fastDateFormat25.clone();
        boolean boolean27 = calendar4.after((java.lang.Object) fastDateFormat25);
        java.util.Locale locale28 = fastDateFormat25.getLocale();
        java.util.Locale locale29 = fastDateFormat25.getLocale();
        java.lang.StringBuffer stringBuffer31 = null;
        java.lang.StringBuffer stringBuffer32 = fastDateFormat25.format(1645454951074L, stringBuffer31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar4 and calendar14", (calendar4.compareTo(calendar14) == 0) == calendar4.equals(calendar14));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
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
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(timeZone6);
        java.util.TimeZone timeZone18 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone19 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone20 = java.util.TimeZone.getDefault();
        boolean boolean21 = timeZone19.hasSameRules(timeZone20);
        boolean boolean22 = timeZone18.hasSameRules(timeZone19);
        timeZone19.setID("Mon Feb 21 14:45:50 GMT 2022");
        boolean boolean25 = timeZone6.hasSameRules(timeZone19);
        boolean boolean26 = timeZone19.observesDaylightTime();
        java.util.TimeZone timeZone28 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone29 = java.util.TimeZone.getDefault();
        boolean boolean30 = timeZone28.hasSameRules(timeZone29);
        java.util.Locale locale34 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale35 = locale34.stripExtensions();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone28, locale34);
        java.util.TimeZone timeZone37 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone38 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone39 = java.util.TimeZone.getDefault();
        boolean boolean40 = timeZone38.hasSameRules(timeZone39);
        boolean boolean41 = timeZone37.hasSameRules(timeZone38);
        boolean boolean42 = timeZone38.observesDaylightTime();
        timeZone38.setRawOffset(52);
        timeZone38.setID("Temps universel coordonn\351");
        java.util.Locale locale48 = new java.util.Locale("zh");
        java.util.Locale locale49 = java.util.Locale.CHINESE;
        java.lang.String str50 = locale49.getLanguage();
        boolean boolean51 = locale49.hasExtensions();
        java.lang.String str52 = locale49.getDisplayCountry();
        java.lang.String str53 = locale48.getDisplayName(locale49);
        java.util.Calendar calendar54 = java.util.Calendar.getInstance(timeZone38, locale48);
        java.lang.String str55 = fastDateFormat36.format(calendar54);
        calendar54.set((int) (byte) 100, 17, 53, 23, 20, (int) '4');
        java.util.Calendar.Builder builder63 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder67 = builder63.setTimeOfDay(16, (int) ' ', 16);
        java.util.Locale.Builder builder68 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder71 = builder68.setExtension('a', "France");
        java.util.Locale.Builder builder73 = builder68.removeUnicodeLocaleAttribute("GMT");
        java.util.Locale locale74 = java.util.Locale.FRANCE;
        java.lang.String str75 = locale74.getVariant();
        java.lang.String str76 = locale74.getDisplayCountry();
        java.util.Locale.Builder builder77 = builder68.setLocale(locale74);
        java.util.Locale locale79 = new java.util.Locale("zh");
        java.lang.String str80 = locale74.getDisplayName(locale79);
        java.util.Calendar.Builder builder81 = builder63.setLocale(locale74);
        java.util.Calendar.Builder builder85 = builder63.setTimeOfDay((int) (byte) 1, 8, 120);
        java.util.TimeZone timeZone86 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone87 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone88 = java.util.TimeZone.getDefault();
        boolean boolean89 = timeZone87.hasSameRules(timeZone88);
        boolean boolean90 = timeZone86.hasSameRules(timeZone87);
        java.lang.String str91 = timeZone87.getID();
        java.lang.String str92 = timeZone87.getID();
        int int93 = timeZone87.getRawOffset();
        java.util.Calendar calendar94 = java.util.Calendar.getInstance(timeZone87);
        int int95 = timeZone87.getRawOffset();
        java.util.Calendar.Builder builder96 = builder85.setTimeZone(timeZone87);
        calendar54.setTimeZone(timeZone87);
        java.lang.String str98 = timeZone87.getID();
        boolean boolean99 = timeZone19.hasSameRules(timeZone87);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar4 and calendar14", (calendar4.compareTo(calendar14) == 0) == calendar4.equals(calendar14));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
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
        java.util.TimeZone timeZone14 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str15 = timeZone14.getID();
        java.util.TimeZone.setDefault(timeZone14);
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(timeZone14);
        int int18 = calendar17.getFirstDayOfWeek();
        java.util.TimeZone timeZone19 = java.util.TimeZone.getDefault();
        int int21 = timeZone19.getOffset((long) 2);
        java.util.Locale locale25 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale26 = locale25.stripExtensions();
        java.util.Calendar calendar27 = java.util.Calendar.getInstance(timeZone19, locale26);
        calendar17.setTimeZone(timeZone19);
        java.lang.String str29 = timeZone19.getID();
        java.util.Calendar calendar30 = java.util.Calendar.getInstance(timeZone19);
        java.util.TimeZone timeZone31 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone32 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone33 = java.util.TimeZone.getDefault();
        boolean boolean34 = timeZone32.hasSameRules(timeZone33);
        boolean boolean35 = timeZone31.hasSameRules(timeZone32);
        timeZone32.setID("Mon Feb 21 14:45:50 GMT 2022");
        boolean boolean38 = timeZone19.hasSameRules(timeZone32);
        boolean boolean39 = timeZone7.hasSameRules(timeZone32);
        timeZone7.setID("21 Feb 2022 14:46:31 GMT");
        java.util.Calendar calendar42 = java.util.Calendar.getInstance(timeZone7);
        java.lang.String str43 = timeZone7.getDisplayName();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar17 and calendar42", (calendar17.compareTo(calendar42) == 0) == calendar17.equals(calendar42));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone1);
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(timeZone1);
        timeZone1.setRawOffset(50);
        java.util.Locale locale9 = new java.util.Locale("2:45:52 PM UTC");
        java.util.Locale locale11 = new java.util.Locale("zh");
        java.lang.String str12 = locale9.getDisplayScript(locale11);
        java.util.TimeZone timeZone14 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone14);
        java.lang.String str16 = fastDateFormat15.getPattern();
        java.text.ParsePosition parsePosition19 = new java.text.ParsePosition(16);
        parsePosition19.setIndex(11);
        java.lang.Object obj22 = fastDateFormat15.parseObject("FastDateFormat[]", parsePosition19);
        java.util.TimeZone timeZone23 = fastDateFormat15.getTimeZone();
        java.lang.String str24 = timeZone23.getID();
        java.util.Locale locale26 = new java.util.Locale("zh");
        java.lang.String str27 = locale26.getISO3Country();
        java.util.Calendar calendar28 = java.util.Calendar.getInstance(timeZone23, locale26);
        java.lang.String str29 = locale9.getDisplayName(locale26);
        java.lang.String str30 = locale9.getISO3Country();
        java.lang.String str32 = locale9.getExtension('x');
        java.util.Calendar calendar33 = java.util.Calendar.getInstance(timeZone1, locale9);
        java.util.Locale locale37 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale38 = locale37.stripExtensions();
        boolean boolean39 = locale37.hasExtensions();
        boolean boolean40 = locale9.equals((java.lang.Object) locale37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar5 and calendar28", (calendar5.compareTo(calendar28) == 0) == calendar5.equals(calendar28));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
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
        java.util.Locale locale17 = fastDateFormat2.getLocale();
        java.util.TimeZone timeZone19 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str20 = timeZone19.getID();
        java.util.TimeZone.setDefault(timeZone19);
        java.util.Calendar calendar22 = java.util.Calendar.getInstance(timeZone19);
        int int23 = calendar22.getFirstDayOfWeek();
        java.util.TimeZone timeZone24 = java.util.TimeZone.getDefault();
        int int26 = timeZone24.getOffset((long) 2);
        java.util.Locale locale30 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale31 = locale30.stripExtensions();
        java.util.Calendar calendar32 = java.util.Calendar.getInstance(timeZone24, locale31);
        calendar22.setTimeZone(timeZone24);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList35 = java.util.Locale.LanguageRange.parse("zho");
        java.util.Set<java.lang.String> strSet36 = java.util.Calendar.getAvailableCalendarTypes();
        java.util.stream.Stream<java.lang.String> strStream37 = strSet36.parallelStream();
        java.lang.String str38 = java.util.Locale.lookupTag(languageRangeList35, (java.util.Collection<java.lang.String>) strSet36);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList40 = java.util.Locale.LanguageRange.parse("zho");
        java.util.Set<java.lang.String> strSet41 = java.util.Calendar.getAvailableCalendarTypes();
        java.util.stream.Stream<java.lang.String> strStream42 = strSet41.parallelStream();
        java.lang.String str43 = java.util.Locale.lookupTag(languageRangeList40, (java.util.Collection<java.lang.String>) strSet41);
        java.util.stream.Stream<java.lang.String> strStream44 = strSet41.stream();
        java.util.List<java.lang.String> strList45 = java.util.Locale.filterTags(languageRangeList35, (java.util.Collection<java.lang.String>) strSet41);
        java.util.stream.Stream<java.lang.String> strStream46 = strSet41.stream();
        boolean boolean47 = calendar22.before((java.lang.Object) strStream46);
        java.lang.StringBuffer stringBuffer48 = null;
        java.lang.StringBuffer stringBuffer49 = fastDateFormat2.format(calendar22, stringBuffer48);
        java.lang.String str51 = fastDateFormat2.format(1645455183995L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar15 and calendar22", (calendar15.compareTo(calendar22) == 0) == calendar15.equals(calendar22));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone1);
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(timeZone1);
        timeZone1.setID("java.text.AttributedCharacterIterator$Attribute(input_method_segment)");
        java.util.TimeZone timeZone10 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str11 = timeZone10.getID();
        java.util.TimeZone.setDefault(timeZone10);
        java.util.Calendar calendar13 = java.util.Calendar.getInstance(timeZone10);
        int int14 = calendar13.getFirstDayOfWeek();
        java.util.TimeZone timeZone15 = java.util.TimeZone.getDefault();
        int int17 = timeZone15.getOffset((long) 2);
        java.util.Locale locale21 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale22 = locale21.stripExtensions();
        java.util.Calendar calendar23 = java.util.Calendar.getInstance(timeZone15, locale22);
        calendar13.setTimeZone(timeZone15);
        java.lang.String str25 = timeZone15.getID();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, timeZone15);
        boolean boolean27 = timeZone1.hasSameRules(timeZone15);
        int int28 = timeZone1.getRawOffset();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar5 and calendar13", (calendar5.compareTo(calendar13) == 0) == calendar5.equals(calendar13));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.util.Locale locale2 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone1, locale2);
        timeZone1.setRawOffset(0);
        java.util.TimeZone timeZone6 = null;
        boolean boolean7 = timeZone1.hasSameRules(timeZone6);
        timeZone1.setRawOffset((int) (short) 0);
        java.util.Calendar calendar10 = java.util.Calendar.getInstance(timeZone1);
        java.time.ZoneId zoneId11 = timeZone1.toZoneId();
        java.util.TimeZone timeZone12 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone13 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone14 = java.util.TimeZone.getDefault();
        boolean boolean15 = timeZone13.hasSameRules(timeZone14);
        boolean boolean16 = timeZone12.hasSameRules(timeZone13);
        boolean boolean17 = timeZone13.observesDaylightTime();
        java.util.TimeZone timeZone18 = java.util.TimeZone.getDefault();
        int int20 = timeZone18.getOffset((long) 2);
        java.util.Locale locale24 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale25 = locale24.stripExtensions();
        java.util.Calendar calendar26 = java.util.Calendar.getInstance(timeZone18, locale25);
        boolean boolean27 = timeZone13.hasSameRules(timeZone18);
        java.util.TimeZone timeZone28 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone29 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone30 = java.util.TimeZone.getDefault();
        boolean boolean31 = timeZone29.hasSameRules(timeZone30);
        boolean boolean32 = timeZone28.hasSameRules(timeZone29);
        timeZone29.setID("Mon Feb 21 14:45:50 GMT 2022");
        int int36 = timeZone29.getOffset(1645454782547L);
        int int37 = timeZone29.getRawOffset();
        boolean boolean38 = timeZone13.hasSameRules(timeZone29);
        java.lang.String str39 = timeZone29.getID();
        boolean boolean40 = timeZone1.hasSameRules(timeZone29);
        java.lang.String str41 = timeZone1.getID();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar3 and calendar10", (calendar3.compareTo(calendar10) == 0) == calendar3.equals(calendar10));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone1);
        java.lang.String str5 = timeZone1.getID();
        java.lang.String str6 = timeZone1.getID();
        java.util.Calendar calendar7 = java.util.Calendar.getInstance(timeZone1);
        java.util.Locale.Category category8 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale9 = java.util.Locale.TAIWAN;
        java.util.Locale locale10 = locale9.stripExtensions();
        java.util.Locale.setDefault(category8, locale9);
        java.util.Locale.setDefault(locale9);
        java.util.Set<java.lang.String> strSet13 = locale9.getUnicodeLocaleAttributes();
        java.lang.String str14 = locale9.getVariant();
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone1, locale9);
        java.lang.String str16 = timeZone1.getID();
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(timeZone1);
        calendar17.setTimeInMillis(1645454916813L);
        calendar17.set(57, (int) '4', 355);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar7 and calendar15", (calendar7.compareTo(calendar15) == 0) == calendar7.equals(calendar15));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 2);
        java.util.Locale locale6 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale7 = locale6.stripExtensions();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone0, locale7);
        calendar8.set(122, 52, (int) (byte) 1);
        java.lang.String str13 = calendar8.getCalendarType();
        calendar8.set(32, 9, 100, (int) (byte) 100, 100, 32769);
        int int22 = calendar8.getActualMaximum(12);
        int int23 = calendar8.getWeekYear();
        java.util.TimeZone timeZone24 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone25 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone26 = java.util.TimeZone.getDefault();
        boolean boolean27 = timeZone25.hasSameRules(timeZone26);
        boolean boolean28 = timeZone24.hasSameRules(timeZone25);
        boolean boolean29 = timeZone25.observesDaylightTime();
        timeZone25.setRawOffset(52);
        java.lang.String str32 = timeZone25.getID();
        java.util.TimeZone timeZone33 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone34 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone35 = java.util.TimeZone.getDefault();
        boolean boolean36 = timeZone34.hasSameRules(timeZone35);
        boolean boolean37 = timeZone33.hasSameRules(timeZone34);
        java.util.Calendar calendar38 = java.util.Calendar.getInstance(timeZone34);
        timeZone34.setID("java.text.AttributedCharacterIterator$Attribute(input_method_segment)");
        java.util.Locale locale41 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar42 = java.util.Calendar.getInstance(timeZone34, locale41);
        java.util.TimeZone.setDefault(timeZone34);
        java.util.TimeZone.setDefault(timeZone34);
        java.util.Calendar calendar45 = java.util.Calendar.getInstance(timeZone34);
        boolean boolean46 = timeZone25.hasSameRules(timeZone34);
        boolean boolean47 = timeZone25.observesDaylightTime();
        calendar8.setTimeZone(timeZone25);
        int int49 = calendar8.getMinimalDaysInFirstWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar38 and calendar42", (calendar38.compareTo(calendar42) == 0) == calendar38.equals(calendar42));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setWeekDate(5, (int) (byte) -1, 1);
        java.util.Calendar.Builder builder6 = builder4.setLenient(true);
        java.util.Calendar.Builder builder10 = builder6.setTimeOfDay(122, 11, 10);
        java.util.Calendar.Builder builder14 = builder10.setWeekDate(100, 9, 2);
        java.util.Calendar.Builder builder18 = builder14.setTimeOfDay(52, (int) (short) 10, (-1));
        java.util.Calendar.Builder builder20 = builder18.setLenient(true);
        java.util.Calendar.Builder builder23 = builder18.set(2, 54);
        java.util.Calendar.Builder builder25 = builder18.setLenient(false);
        java.util.TimeZone timeZone27 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str28 = timeZone27.getID();
        java.util.TimeZone.setDefault(timeZone27);
        java.util.Calendar.Builder builder30 = builder18.setTimeZone(timeZone27);
        java.util.Calendar calendar31 = java.util.Calendar.getInstance(timeZone27);
        java.util.Locale.Category category32 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale33 = java.util.Locale.TAIWAN;
        java.util.Locale locale34 = locale33.stripExtensions();
        java.util.Locale.setDefault(category32, locale33);
        java.util.Locale locale36 = java.util.Locale.CHINA;
        java.util.TimeZone timeZone37 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone38 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone39 = java.util.TimeZone.getDefault();
        boolean boolean40 = timeZone38.hasSameRules(timeZone39);
        boolean boolean41 = timeZone37.hasSameRules(timeZone38);
        boolean boolean42 = timeZone38.observesDaylightTime();
        timeZone38.setRawOffset(52);
        timeZone38.setID("Temps universel coordonn\351");
        java.util.Locale locale48 = new java.util.Locale("zh");
        java.util.Locale locale49 = java.util.Locale.CHINESE;
        java.lang.String str50 = locale49.getLanguage();
        boolean boolean51 = locale49.hasExtensions();
        java.lang.String str52 = locale49.getDisplayCountry();
        java.lang.String str53 = locale48.getDisplayName(locale49);
        java.util.Calendar calendar54 = java.util.Calendar.getInstance(timeZone38, locale48);
        java.util.Set<java.lang.Character> charSet55 = locale48.getExtensionKeys();
        java.lang.String str56 = locale36.getDisplayCountry(locale48);
        java.lang.String str57 = locale36.getLanguage();
        java.lang.String str58 = locale36.getLanguage();
        java.util.Locale.setDefault(category32, locale36);
        java.util.Locale locale60 = java.util.Locale.CHINA;
        java.lang.String str61 = locale60.getDisplayVariant();
        java.util.Locale.setDefault(category32, locale60);
        java.util.Locale.Builder builder63 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder66 = builder63.setExtension('a', "France");
        java.util.Locale locale68 = java.util.Locale.forLanguageTag("h:mm:ss a z");
        java.util.Locale.Builder builder69 = builder66.setLocale(locale68);
        java.util.Locale.Category category70 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale71 = java.util.Locale.TAIWAN;
        java.util.Locale locale72 = locale71.stripExtensions();
        java.util.Locale.setDefault(category70, locale71);
        java.lang.String str74 = locale71.getDisplayCountry();
        java.lang.String str75 = locale68.getDisplayLanguage(locale71);
        java.util.Locale.setDefault(category32, locale68);
        java.util.Calendar calendar77 = java.util.Calendar.getInstance(timeZone27, locale68);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar31 and calendar54", (calendar31.compareTo(calendar54) == 0) == calendar31.equals(calendar54));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str3 = timeZone2.getID();
        java.util.TimeZone.setDefault(timeZone2);
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(timeZone2);
        int int6 = calendar5.getFirstDayOfWeek();
        java.util.TimeZone timeZone7 = java.util.TimeZone.getDefault();
        int int9 = timeZone7.getOffset((long) 2);
        java.util.Locale locale13 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale14 = locale13.stripExtensions();
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone7, locale14);
        calendar5.setTimeZone(timeZone7);
        java.lang.String str17 = timeZone7.getID();
        java.util.Calendar calendar18 = java.util.Calendar.getInstance(timeZone7);
        java.util.TimeZone timeZone19 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone20 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone21 = java.util.TimeZone.getDefault();
        boolean boolean22 = timeZone20.hasSameRules(timeZone21);
        boolean boolean23 = timeZone19.hasSameRules(timeZone20);
        timeZone20.setID("Mon Feb 21 14:45:50 GMT 2022");
        boolean boolean26 = timeZone7.hasSameRules(timeZone20);
        java.util.TimeZone.setDefault(timeZone20);
        java.util.Locale.Builder builder28 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder31 = builder28.setExtension('a', "France");
        java.util.Locale locale33 = java.util.Locale.forLanguageTag("h:mm:ss a z");
        java.util.Locale.Builder builder34 = builder31.setLocale(locale33);
        java.util.Locale.Category category35 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale36 = java.util.Locale.TAIWAN;
        java.util.Locale locale37 = locale36.stripExtensions();
        java.util.Locale.setDefault(category35, locale36);
        java.lang.String str39 = locale36.getDisplayCountry();
        java.lang.String str40 = locale33.getDisplayLanguage(locale36);
        java.util.TimeZone timeZone42 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone43 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone44 = java.util.TimeZone.getDefault();
        boolean boolean45 = timeZone43.hasSameRules(timeZone44);
        boolean boolean46 = timeZone42.hasSameRules(timeZone43);
        java.util.TimeZone timeZone48 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str49 = timeZone48.getID();
        boolean boolean50 = timeZone43.hasSameRules(timeZone48);
        java.util.Locale locale51 = java.util.Locale.FRANCE;
        boolean boolean52 = locale51.hasExtensions();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat53 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone48, locale51);
        java.lang.String str54 = locale33.getDisplayVariant(locale51);
        java.lang.String str55 = locale33.getDisplayName();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat56 = org.apache.commons.lang3.time.FastDateFormat.getInstance("\u4e0a\u5348 12:12:00", timeZone20, locale33);
        timeZone20.setID("2:49:19 PM UTC");
        timeZone20.setID("21 Feb 2022 14:48:33 GMT");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar5 and calendar15", (calendar5.compareTo(calendar15) == 0) == calendar5.equals(calendar15));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
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
        calendar37.roll((int) (short) 0, (int) (byte) 0);
        java.util.Locale.LanguageRange[] languageRangeArray43 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList44 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList44, languageRangeArray43);
        java.util.Locale locale46 = java.util.Locale.GERMAN;
        java.util.Locale locale47 = java.util.Locale.FRANCE;
        boolean boolean48 = locale47.hasExtensions();
        java.util.Locale locale49 = java.util.Locale.FRANCE;
        java.util.Locale locale50 = java.util.Locale.CHINESE;
        java.lang.String str51 = locale50.getLanguage();
        java.util.Locale[] localeArray52 = new java.util.Locale[] { locale46, locale47, locale49, locale50 };
        java.util.ArrayList<java.util.Locale> localeList53 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList53, localeArray52);
        java.util.Locale.FilteringMode filteringMode55 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList56 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList44, (java.util.Collection<java.util.Locale>) localeList53, filteringMode55);
        java.util.Spliterator<java.util.Locale> localeSpliterator57 = localeList56.spliterator();
        java.lang.Object[] objArray58 = localeList56.toArray();
        localeList56.clear();
        java.text.Format.Field field60 = null;
        java.text.FieldPosition fieldPosition61 = new java.text.FieldPosition(field60);
        boolean boolean62 = localeList56.equals((java.lang.Object) fieldPosition61);
        java.util.Locale locale63 = java.util.Locale.US;
        java.util.Locale locale64 = locale63.stripExtensions();
        java.util.Locale locale65 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet66 = locale65.getUnicodeLocaleKeys();
        java.lang.String str67 = locale64.getDisplayVariant(locale65);
        int int68 = localeList56.lastIndexOf((java.lang.Object) locale64);
        java.util.Set<java.lang.String> strSet69 = locale64.getUnicodeLocaleKeys();
        boolean boolean70 = calendar37.before((java.lang.Object) locale64);
        java.util.Date date71 = calendar37.getTime();
        int int72 = date71.getMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar27 and calendar37", (calendar27.compareTo(calendar37) == 0) == calendar27.equals(calendar37));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("\uc624\ud6c4\uc2dc\ubd84\ucd08 GMT");
        java.util.Locale locale4 = new java.util.Locale("\uc624\ud6c4\uc2dc\ubd84\ucd08 GMT", "Wed Mar 16 08:10:49 GMT 2022");
        java.util.TimeZone timeZone6 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone6);
        java.lang.String str8 = fastDateFormat7.getPattern();
        java.text.ParsePosition parsePosition11 = new java.text.ParsePosition(16);
        parsePosition11.setIndex(11);
        java.lang.Object obj14 = fastDateFormat7.parseObject("FastDateFormat[]", parsePosition11);
        java.util.TimeZone timeZone15 = fastDateFormat7.getTimeZone();
        java.lang.String str16 = timeZone15.getID();
        java.util.Locale locale18 = new java.util.Locale("zh");
        java.lang.String str19 = locale18.getISO3Country();
        java.util.Calendar calendar20 = java.util.Calendar.getInstance(timeZone15, locale18);
        java.lang.String str21 = locale18.getCountry();
        java.lang.String str22 = locale4.getDisplayName(locale18);
        java.util.Locale.Category category23 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale24 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(category23, locale24);
        java.util.Locale locale26 = java.util.Locale.KOREA;
        java.lang.String str27 = locale26.getScript();
        java.util.Locale locale28 = java.util.Locale.FRANCE;
        java.lang.String str29 = locale26.getDisplayVariant(locale28);
        java.util.Locale.setDefault(category23, locale26);
        java.util.Locale locale31 = java.util.Locale.ROOT;
        java.util.Locale.Builder builder32 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder35 = builder32.setExtension('a', "France");
        java.util.Locale.Builder builder37 = builder32.removeUnicodeLocaleAttribute("GMT");
        java.util.Locale locale38 = java.util.Locale.FRANCE;
        java.lang.String str39 = locale38.getVariant();
        java.lang.String str40 = locale38.getDisplayCountry();
        java.util.Locale.Builder builder41 = builder32.setLocale(locale38);
        java.util.Locale locale43 = new java.util.Locale("zh");
        java.lang.String str44 = locale38.getDisplayName(locale43);
        java.lang.String str45 = locale31.getDisplayName(locale38);
        java.lang.String str46 = locale31.getDisplayScript();
        java.util.Locale locale47 = locale31.stripExtensions();
        java.util.Locale.setDefault(category23, locale31);
        java.util.Locale locale49 = java.util.Locale.CHINESE;
        java.lang.String str50 = locale49.getLanguage();
        boolean boolean51 = locale49.hasExtensions();
        java.lang.String str52 = locale49.getDisplayCountry();
        java.lang.String str53 = locale49.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet54 = locale49.getUnicodeLocaleKeys();
        java.lang.String str55 = locale49.getCountry();
        java.util.Locale.setDefault(category23, locale49);
        java.util.Locale locale57 = java.util.Locale.CHINA;
        boolean boolean58 = locale57.hasExtensions();
        java.lang.String str59 = locale57.getDisplayVariant();
        java.lang.String str60 = locale57.getCountry();
        java.lang.String str61 = locale49.getDisplayScript(locale57);
        java.lang.String str62 = locale49.getScript();
        java.lang.String str63 = locale18.getDisplayVariant(locale49);
        java.util.Calendar calendar64 = java.util.Calendar.getInstance(timeZone1, locale49);
        java.lang.String str65 = locale49.getDisplayName();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar20 and calendar64", (calendar20.compareTo(calendar64) == 0) == calendar20.equals(calendar64));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
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
        java.lang.Object obj21 = fastDateFormat2.clone();
        java.util.TimeZone timeZone22 = fastDateFormat2.getTimeZone();
        java.util.Locale locale23 = java.util.Locale.CHINA;
        java.lang.String str25 = locale23.getExtension('x');
        java.util.Set<java.lang.Character> charSet26 = locale23.getExtensionKeys();
        java.util.Set<java.lang.String> strSet27 = locale23.getUnicodeLocaleAttributes();
        java.util.Calendar calendar28 = java.util.Calendar.getInstance(timeZone22, locale23);
        java.util.Locale.setDefault(locale23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar13 and calendar28", (calendar13.compareTo(calendar28) == 0) == calendar13.equals(calendar28));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
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
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(timeZone6);
        int int18 = calendar17.getWeekYear();
        long long19 = calendar17.getTimeInMillis();
        boolean boolean20 = calendar17.isLenient();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar4 and calendar14", (calendar4.compareTo(calendar14) == 0) == calendar4.equals(calendar14));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
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
        java.time.ZoneId zoneId13 = timeZone8.toZoneId();
        java.util.TimeZone timeZone14 = java.util.TimeZone.getTimeZone(zoneId13);
        java.util.TimeZone timeZone15 = java.util.TimeZone.getTimeZone(zoneId13);
        java.util.TimeZone timeZone16 = java.util.TimeZone.getTimeZone(zoneId13);
        timeZone16.setID("java.util.GregorianCalendar[time=1645454780717,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=20,MILLISECOND=717,ZONE_OFFSET=0,DST_OFFSET=0]");
        java.util.Locale locale21 = new java.util.Locale("Coordinated Universal Time", "h:mm:ss a z");
        java.util.Locale locale23 = java.util.Locale.forLanguageTag("2:46:18 PM UTC");
        java.lang.String str24 = locale23.getVariant();
        java.util.Locale locale25 = java.util.Locale.US;
        java.util.Locale locale26 = locale25.stripExtensions();
        java.util.Locale locale27 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet28 = locale27.getUnicodeLocaleKeys();
        java.lang.String str29 = locale26.getDisplayVariant(locale27);
        java.lang.String str30 = locale23.getDisplayVariant(locale27);
        java.lang.String str31 = locale21.getDisplayLanguage(locale27);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone16, locale27);
        int int33 = timeZone16.getRawOffset();
        java.util.TimeZone timeZone34 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone35 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone36 = java.util.TimeZone.getDefault();
        boolean boolean37 = timeZone35.hasSameRules(timeZone36);
        boolean boolean38 = timeZone34.hasSameRules(timeZone35);
        boolean boolean39 = timeZone35.observesDaylightTime();
        timeZone35.setRawOffset(52);
        timeZone35.setID("Temps universel coordonn\351");
        java.util.Locale locale45 = new java.util.Locale("zh");
        java.util.Locale locale46 = java.util.Locale.CHINESE;
        java.lang.String str47 = locale46.getLanguage();
        boolean boolean48 = locale46.hasExtensions();
        java.lang.String str49 = locale46.getDisplayCountry();
        java.lang.String str50 = locale45.getDisplayName(locale46);
        java.util.Calendar calendar51 = java.util.Calendar.getInstance(timeZone35, locale45);
        calendar51.clear();
        long long53 = calendar51.getTimeInMillis();
        java.util.Date date54 = new java.util.Date();
        int int55 = date54.getTimezoneOffset();
        date54.setMinutes(5);
        int int58 = date54.getMonth();
        calendar51.setTime(date54);
        java.util.TimeZone timeZone60 = calendar51.getTimeZone();
        java.util.Calendar calendar61 = java.util.Calendar.getInstance(timeZone60);
        boolean boolean62 = timeZone16.hasSameRules(timeZone60);
        java.util.Calendar calendar63 = java.util.Calendar.getInstance(timeZone16);
        java.util.Locale locale64 = java.util.Locale.US;
        java.util.Locale locale65 = locale64.stripExtensions();
        java.util.Locale locale66 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet67 = locale66.getUnicodeLocaleKeys();
        java.lang.String str68 = locale65.getDisplayVariant(locale66);
        java.util.Locale locale69 = java.util.Locale.US;
        java.lang.String str70 = locale69.getDisplayName();
        java.lang.String str71 = locale69.getLanguage();
        java.lang.String str72 = locale65.getDisplayLanguage(locale69);
        java.lang.String str73 = timeZone16.getDisplayName(locale69);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar61 and calendar63", (calendar61.compareTo(calendar63) == 0) == calendar61.equals(calendar63));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
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
        java.util.TimeZone timeZone14 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str15 = timeZone14.getID();
        java.util.TimeZone.setDefault(timeZone14);
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(timeZone14);
        int int18 = calendar17.getFirstDayOfWeek();
        java.util.TimeZone timeZone19 = java.util.TimeZone.getDefault();
        int int21 = timeZone19.getOffset((long) 2);
        java.util.Locale locale25 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale26 = locale25.stripExtensions();
        java.util.Calendar calendar27 = java.util.Calendar.getInstance(timeZone19, locale26);
        calendar17.setTimeZone(timeZone19);
        java.lang.String str29 = timeZone19.getID();
        java.util.Calendar calendar30 = java.util.Calendar.getInstance(timeZone19);
        java.util.TimeZone timeZone31 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone32 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone33 = java.util.TimeZone.getDefault();
        boolean boolean34 = timeZone32.hasSameRules(timeZone33);
        boolean boolean35 = timeZone31.hasSameRules(timeZone32);
        timeZone32.setID("Mon Feb 21 14:45:50 GMT 2022");
        boolean boolean38 = timeZone19.hasSameRules(timeZone32);
        boolean boolean39 = timeZone7.hasSameRules(timeZone32);
        int int41 = timeZone32.getOffset(1645454939875L);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList43 = java.util.Locale.LanguageRange.parse("zh");
        java.util.Locale.LanguageRange[] languageRangeArray44 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList45 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList45, languageRangeArray44);
        java.util.Locale locale47 = java.util.Locale.GERMAN;
        java.util.Locale locale48 = java.util.Locale.FRANCE;
        boolean boolean49 = locale48.hasExtensions();
        java.util.Locale locale50 = java.util.Locale.FRANCE;
        java.util.Locale locale51 = java.util.Locale.CHINESE;
        java.lang.String str52 = locale51.getLanguage();
        java.util.Locale[] localeArray53 = new java.util.Locale[] { locale47, locale48, locale50, locale51 };
        java.util.ArrayList<java.util.Locale> localeList54 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList54, localeArray53);
        java.util.Locale.FilteringMode filteringMode56 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList57 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList45, (java.util.Collection<java.util.Locale>) localeList54, filteringMode56);
        java.lang.Object[] objArray58 = localeList54.toArray();
        boolean boolean59 = localeList54.isEmpty();
        java.util.Locale locale60 = java.util.Locale.lookup(languageRangeList43, (java.util.Collection<java.util.Locale>) localeList54);
        java.util.Calendar calendar61 = java.util.Calendar.getInstance(timeZone32, locale60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar17 and calendar27", (calendar17.compareTo(calendar27) == 0) == calendar17.equals(calendar27));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        java.util.Locale locale1 = java.util.Locale.US;
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        java.util.TimeZone timeZone3 = calendar2.getTimeZone();
        java.util.Locale locale4 = java.util.Locale.US;
        java.lang.String str5 = locale4.getCountry();
        boolean boolean6 = locale4.hasExtensions();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, timeZone3, locale4);
        java.util.Locale locale9 = java.util.Locale.KOREA;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, locale9);
        java.lang.String str12 = fastDateFormat10.format((java.lang.Object) 1645454750118L);
        java.util.TimeZone timeZone13 = java.util.TimeZone.getDefault();
        int int15 = timeZone13.getOffset((long) 2);
        java.util.Locale locale19 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale20 = locale19.stripExtensions();
        java.util.Calendar calendar21 = java.util.Calendar.getInstance(timeZone13, locale20);
        int int23 = calendar21.getLeastMaximum(4);
        calendar21.setFirstDayOfWeek((-1));
        int int26 = calendar21.getFirstDayOfWeek();
        java.lang.String str27 = fastDateFormat10.format(calendar21);
        java.lang.Object obj28 = fastDateFormat10.clone();
        java.util.Date date29 = new java.util.Date();
        int int30 = date29.getSeconds();
        date29.setTime((long) 16);
        date29.setMinutes(12);
        int int35 = date29.getMinutes();
        java.util.Date date36 = new java.util.Date();
        int int37 = date36.getTimezoneOffset();
        date36.setMinutes(5);
        int int40 = date36.getMonth();
        boolean boolean41 = date29.before(date36);
        java.lang.String str42 = fastDateFormat10.format(date29);
        java.lang.String str44 = fastDateFormat10.format((long) 70);
        java.util.Locale locale45 = java.util.Locale.US;
        java.lang.String str46 = locale45.getDisplayVariant();
        java.util.Locale locale47 = java.util.Locale.FRANCE;
        boolean boolean48 = locale47.hasExtensions();
        java.util.Locale locale49 = java.util.Locale.ROOT;
        java.lang.String str50 = locale47.getDisplayName(locale49);
        java.lang.String str51 = locale49.getCountry();
        java.lang.String str52 = locale45.getDisplayVariant(locale49);
        java.util.Calendar calendar53 = java.util.Calendar.getInstance(locale49);
        calendar53.clear();
        java.lang.String str55 = fastDateFormat10.format(calendar53);
        boolean boolean56 = fastDateFormat7.equals((java.lang.Object) fastDateFormat10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar2 and calendar21", (calendar2.compareTo(calendar21) == 0) == calendar2.equals(calendar21));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
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
        calendar4.setTimeZone(timeZone28);
        timeZone28.setRawOffset(100);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar4 and calendar14", (calendar4.compareTo(calendar14) == 0) == calendar4.equals(calendar14));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setTimeOfDay(16, (int) ' ', 16);
        java.util.Calendar.Builder builder6 = builder0.setLenient(true);
        java.util.Calendar.Builder builder10 = builder0.setDate(45, 29, 29);
        java.util.Calendar calendar11 = builder0.build();
        calendar11.setLenient(false);
        java.util.TimeZone timeZone14 = calendar11.getTimeZone();
        java.util.TimeZone timeZone15 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone16 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone17 = java.util.TimeZone.getDefault();
        boolean boolean18 = timeZone16.hasSameRules(timeZone17);
        boolean boolean19 = timeZone15.hasSameRules(timeZone16);
        boolean boolean20 = timeZone16.observesDaylightTime();
        java.util.TimeZone timeZone21 = java.util.TimeZone.getDefault();
        int int23 = timeZone21.getOffset((long) 2);
        java.util.Locale locale27 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale28 = locale27.stripExtensions();
        java.util.Calendar calendar29 = java.util.Calendar.getInstance(timeZone21, locale28);
        boolean boolean30 = timeZone16.hasSameRules(timeZone21);
        java.util.Calendar calendar31 = java.util.Calendar.getInstance(timeZone21);
        timeZone21.setRawOffset(32770);
        int int35 = timeZone21.getOffset(1645454800993L);
        calendar11.setTimeZone(timeZone21);
        boolean boolean37 = timeZone21.useDaylightTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar29 and calendar31", (calendar29.compareTo(calendar31) == 0) == calendar29.equals(calendar31));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(timeZone1);
        java.util.TimeZone timeZone4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone4);
        java.lang.String str7 = fastDateFormat5.format((long) '#');
        boolean boolean8 = fastDateFormat5.getTimeZoneOverridesCalendar();
        java.lang.String str10 = fastDateFormat5.format(100L);
        java.lang.String str12 = fastDateFormat5.format((long) 8);
        java.util.Locale locale13 = fastDateFormat5.getLocale();
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone1, locale13);
        java.util.Locale.LanguageRange[] languageRangeArray15 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList16 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16, languageRangeArray15);
        java.util.Locale locale18 = java.util.Locale.GERMAN;
        java.util.Locale locale19 = java.util.Locale.FRANCE;
        boolean boolean20 = locale19.hasExtensions();
        java.util.Locale locale21 = java.util.Locale.FRANCE;
        java.util.Locale locale22 = java.util.Locale.CHINESE;
        java.lang.String str23 = locale22.getLanguage();
        java.util.Locale[] localeArray24 = new java.util.Locale[] { locale18, locale19, locale21, locale22 };
        java.util.ArrayList<java.util.Locale> localeList25 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList25, localeArray24);
        java.util.Locale.FilteringMode filteringMode27 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList28 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, (java.util.Collection<java.util.Locale>) localeList25, filteringMode27);
        java.util.Spliterator<java.util.Locale> localeSpliterator29 = localeList28.spliterator();
        java.lang.Object[] objArray30 = localeList28.toArray();
        localeList28.clear();
        java.text.Format.Field field32 = null;
        java.text.FieldPosition fieldPosition33 = new java.text.FieldPosition(field32);
        boolean boolean34 = localeList28.equals((java.lang.Object) fieldPosition33);
        java.util.Locale locale35 = java.util.Locale.US;
        java.util.Locale locale36 = locale35.stripExtensions();
        java.util.Locale locale37 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet38 = locale37.getUnicodeLocaleKeys();
        java.lang.String str39 = locale36.getDisplayVariant(locale37);
        int int40 = localeList28.lastIndexOf((java.lang.Object) locale36);
        java.util.TimeZone timeZone42 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone43 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone44 = java.util.TimeZone.getDefault();
        boolean boolean45 = timeZone43.hasSameRules(timeZone44);
        boolean boolean46 = timeZone42.hasSameRules(timeZone43);
        java.util.TimeZone timeZone48 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str49 = timeZone48.getID();
        boolean boolean50 = timeZone43.hasSameRules(timeZone48);
        timeZone48.setRawOffset(126);
        java.util.Locale locale56 = new java.util.Locale("java.text.ParsePosition[index=16,errorIndex=-1]", "FastDateFormat[]", "FastDateFormat[]");
        java.lang.String str57 = locale56.getDisplayLanguage();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat58 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, timeZone48, locale56);
        java.util.Locale locale59 = fastDateFormat58.getLocale();
        java.util.TimeZone timeZone61 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone62 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone63 = java.util.TimeZone.getDefault();
        boolean boolean64 = timeZone62.hasSameRules(timeZone63);
        boolean boolean65 = timeZone61.hasSameRules(timeZone62);
        java.util.TimeZone timeZone67 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str68 = timeZone67.getID();
        boolean boolean69 = timeZone62.hasSameRules(timeZone67);
        timeZone67.setRawOffset(126);
        java.util.Locale locale75 = new java.util.Locale("java.text.ParsePosition[index=16,errorIndex=-1]", "FastDateFormat[]", "FastDateFormat[]");
        java.lang.String str76 = locale75.getDisplayLanguage();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat77 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, timeZone67, locale75);
        java.util.Locale locale78 = fastDateFormat77.getLocale();
        java.util.Locale locale80 = new java.util.Locale("21 Feb 2022 14:46:39 GMT");
        java.lang.String str81 = locale78.getDisplayScript(locale80);
        java.lang.String str82 = locale59.getDisplayLanguage(locale78);
        java.lang.String str83 = locale36.getDisplayName(locale59);
        java.util.Set<java.lang.String> strSet84 = locale36.getUnicodeLocaleAttributes();
        java.lang.String str85 = locale13.getDisplayName(locale36);
        java.lang.String str86 = locale36.getDisplayName();
        java.util.Locale locale90 = new java.util.Locale("", "hi!", "");
        java.lang.String str91 = locale90.getCountry();
        java.util.Calendar calendar92 = java.util.Calendar.getInstance(locale90);
        java.lang.String str93 = locale36.getDisplayCountry(locale90);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar2 and calendar14", (calendar2.compareTo(calendar14) == 0) == calendar2.equals(calendar14));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone1);
        java.time.ZoneId zoneId5 = timeZone0.toZoneId();
        java.util.TimeZone.setDefault(timeZone0);
        java.lang.String str7 = timeZone0.getID();
        timeZone0.setRawOffset((int) 'u');
        java.util.Calendar calendar10 = java.util.Calendar.getInstance(timeZone0);
        java.time.ZoneId zoneId11 = timeZone0.toZoneId();
        java.util.TimeZone timeZone13 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str14 = timeZone13.getID();
        java.util.TimeZone.setDefault(timeZone13);
        java.util.Calendar calendar16 = java.util.Calendar.getInstance(timeZone13);
        int int17 = calendar16.getFirstDayOfWeek();
        java.util.TimeZone timeZone18 = java.util.TimeZone.getDefault();
        int int20 = timeZone18.getOffset((long) 2);
        java.util.Locale locale24 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale25 = locale24.stripExtensions();
        java.util.Calendar calendar26 = java.util.Calendar.getInstance(timeZone18, locale25);
        calendar16.setTimeZone(timeZone18);
        calendar16.clear();
        java.util.TimeZone timeZone30 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        calendar16.setTimeZone(timeZone30);
        java.lang.String str32 = timeZone30.getID();
        int int34 = timeZone30.getOffset(1645454832684L);
        boolean boolean35 = timeZone0.hasSameRules(timeZone30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar10 and calendar26", (calendar10.compareTo(calendar26) == 0) == calendar10.equals(calendar26));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        java.text.ParsePosition parsePosition1 = new java.text.ParsePosition(16);
        int int2 = parsePosition1.getErrorIndex();
        java.lang.String str3 = parsePosition1.toString();
        java.lang.Object obj4 = null;
        boolean boolean5 = parsePosition1.equals(obj4);
        int int6 = parsePosition1.getIndex();
        parsePosition1.setIndex(54);
        int int9 = parsePosition1.getErrorIndex();
        int int10 = parsePosition1.getIndex();
        java.util.TimeZone timeZone11 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone12 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone13 = java.util.TimeZone.getDefault();
        boolean boolean14 = timeZone12.hasSameRules(timeZone13);
        boolean boolean15 = timeZone11.hasSameRules(timeZone12);
        java.util.TimeZone timeZone16 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone17 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone18 = java.util.TimeZone.getDefault();
        boolean boolean19 = timeZone17.hasSameRules(timeZone18);
        boolean boolean20 = timeZone16.hasSameRules(timeZone17);
        java.lang.String str21 = timeZone17.getID();
        boolean boolean22 = timeZone12.hasSameRules(timeZone17);
        java.lang.String str23 = timeZone12.getID();
        java.time.ZoneId zoneId24 = timeZone12.toZoneId();
        boolean boolean25 = parsePosition1.equals((java.lang.Object) timeZone12);
        java.util.Calendar.Builder builder26 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder28 = builder26.setLenient(false);
        java.util.Calendar.Builder builder32 = builder26.setTimeOfDay(55, 20, 32772);
        java.util.Calendar.Builder builder36 = builder32.setTimeOfDay(1969, 25, (int) (short) 100);
        java.util.Calendar.Builder builder37 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder41 = builder37.setWeekDate(5, (int) (byte) -1, 1);
        java.util.Calendar.Builder builder43 = builder41.setLenient(true);
        java.util.Calendar.Builder builder47 = builder43.setTimeOfDay(122, 11, 10);
        java.util.Calendar.Builder builder51 = builder47.setWeekDate(100, 9, 2);
        java.util.Calendar.Builder builder55 = builder51.setTimeOfDay(52, (int) (short) 10, (-1));
        java.util.Calendar.Builder builder57 = builder55.setLenient(true);
        java.util.Calendar.Builder builder60 = builder55.set(2, 54);
        java.util.TimeZone timeZone62 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone63 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone64 = java.util.TimeZone.getDefault();
        boolean boolean65 = timeZone63.hasSameRules(timeZone64);
        boolean boolean66 = timeZone62.hasSameRules(timeZone63);
        java.util.TimeZone timeZone68 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str69 = timeZone68.getID();
        boolean boolean70 = timeZone63.hasSameRules(timeZone68);
        java.util.Locale locale71 = java.util.Locale.FRANCE;
        boolean boolean72 = locale71.hasExtensions();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat73 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone68, locale71);
        java.util.Calendar.Builder builder74 = builder55.setTimeZone(timeZone68);
        java.util.Calendar.Builder builder75 = builder36.setTimeZone(timeZone68);
        java.util.TimeZone timeZone76 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone77 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone78 = java.util.TimeZone.getDefault();
        boolean boolean79 = timeZone77.hasSameRules(timeZone78);
        boolean boolean80 = timeZone76.hasSameRules(timeZone77);
        java.lang.String str81 = timeZone77.getID();
        java.lang.String str82 = timeZone77.getID();
        int int83 = timeZone77.getRawOffset();
        java.util.Calendar calendar84 = java.util.Calendar.getInstance(timeZone77);
        boolean boolean85 = timeZone68.hasSameRules(timeZone77);
        java.util.Calendar calendar86 = java.util.Calendar.getInstance(timeZone68);
        boolean boolean87 = timeZone12.hasSameRules(timeZone68);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar84 and calendar86", (calendar84.compareTo(calendar86) == 0) == calendar84.equals(calendar86));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
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
        java.util.TimeZone timeZone17 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone17);
        java.lang.String str19 = fastDateFormat18.toString();
        java.util.Date date25 = new java.util.Date(3, (int) (short) 0, 6, 0, (int) (short) 1);
        java.util.Date date26 = new java.util.Date();
        int int27 = date26.getTimezoneOffset();
        long long28 = date26.getTime();
        boolean boolean29 = date25.after(date26);
        java.lang.StringBuffer stringBuffer30 = null;
        java.lang.StringBuffer stringBuffer31 = fastDateFormat18.format(date25, stringBuffer30);
        java.util.Calendar calendar32 = java.util.Calendar.getInstance();
        java.lang.StringBuffer stringBuffer33 = null;
        java.lang.StringBuffer stringBuffer34 = fastDateFormat18.format(calendar32, stringBuffer33);
        int int35 = calendar32.getWeekYear();
        java.lang.String str36 = fastDateFormat2.format((java.lang.Object) calendar32);
        java.util.TimeZone timeZone38 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str39 = timeZone38.getID();
        java.util.TimeZone.setDefault(timeZone38);
        java.util.Calendar calendar41 = java.util.Calendar.getInstance(timeZone38);
        int int42 = calendar41.getFirstDayOfWeek();
        java.util.TimeZone timeZone43 = java.util.TimeZone.getDefault();
        int int45 = timeZone43.getOffset((long) 2);
        java.util.Locale locale49 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale50 = locale49.stripExtensions();
        java.util.Calendar calendar51 = java.util.Calendar.getInstance(timeZone43, locale50);
        calendar41.setTimeZone(timeZone43);
        calendar41.set(11, 11);
        int int57 = calendar41.getGreatestMinimum(5);
        calendar41.set((int) (short) -1, 9, 50, (int) '#', 31, 9);
        java.lang.String str65 = fastDateFormat2.format(calendar41);
        java.util.TimeZone timeZone69 = java.util.TimeZone.getTimeZone("\uc624\ud6c4\uc2dc\ubd84\ucd08 GMT");
        java.util.TimeZone timeZone71 = java.util.TimeZone.getTimeZone("2:45:54 PM UTC");
        boolean boolean72 = timeZone69.hasSameRules(timeZone71);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat73 = org.apache.commons.lang3.time.FastDateFormat.getInstance("\u4e2d\u56fd", timeZone69);
        java.text.ParsePosition parsePosition76 = new java.text.ParsePosition(16);
        int int77 = parsePosition76.getErrorIndex();
        java.lang.String str78 = parsePosition76.toString();
        java.lang.Object obj79 = null;
        boolean boolean80 = parsePosition76.equals(obj79);
        int int81 = parsePosition76.getIndex();
        java.lang.Object obj82 = fastDateFormat73.parseObject("12:00:35 AM UTC", parsePosition76);
        java.lang.Object obj83 = fastDateFormat2.parseObject("2:47:07 PM UTC", parsePosition76);
        boolean boolean84 = fastDateFormat2.getTimeZoneOverridesCalendar();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar32 and calendar51", (calendar32.compareTo(calendar51) == 0) == calendar32.equals(calendar51));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("zh");
        java.util.Locale locale2 = java.util.Locale.US;
        java.lang.String str3 = locale2.getDisplayVariant();
        java.util.Set<java.lang.String> strSet4 = locale2.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode5 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList6 = java.util.Locale.filterTags(languageRangeList1, (java.util.Collection<java.lang.String>) strSet4, filteringMode5);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList8 = java.util.Locale.LanguageRange.parse("zho");
        java.util.Locale.LanguageRange[] languageRangeArray9 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList10 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList10, languageRangeArray9);
        java.util.Locale locale12 = java.util.Locale.GERMAN;
        java.util.Locale locale13 = java.util.Locale.FRANCE;
        boolean boolean14 = locale13.hasExtensions();
        java.util.Locale locale15 = java.util.Locale.FRANCE;
        java.util.Locale locale16 = java.util.Locale.CHINESE;
        java.lang.String str17 = locale16.getLanguage();
        java.util.Locale[] localeArray18 = new java.util.Locale[] { locale12, locale13, locale15, locale16 };
        java.util.ArrayList<java.util.Locale> localeList19 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList19, localeArray18);
        java.util.Locale.FilteringMode filteringMode21 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList22 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, (java.util.Collection<java.util.Locale>) localeList19, filteringMode21);
        java.util.Locale.FilteringMode filteringMode23 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList24 = java.util.Locale.filter(languageRangeList8, (java.util.Collection<java.util.Locale>) localeList19, filteringMode23);
        java.util.Locale locale29 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale30 = locale29.stripExtensions();
        java.util.Locale locale31 = java.util.Locale.US;
        java.util.Calendar calendar32 = java.util.Calendar.getInstance(locale31);
        java.lang.String str33 = locale29.getDisplayCountry(locale31);
        java.util.Set<java.lang.String> strSet34 = locale31.getUnicodeLocaleKeys();
        localeList19.add(0, locale31);
        java.util.Spliterator<java.util.Locale> localeSpliterator36 = localeList19.spliterator();
        int int37 = localeList19.size();
        boolean boolean38 = localeList19.isEmpty();
        java.util.List<java.util.Locale> localeList39 = java.util.Locale.filter(languageRangeList1, (java.util.Collection<java.util.Locale>) localeList19);
        java.util.Locale.Builder builder40 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder43 = builder40.setExtension('a', "France");
        java.util.Locale.Builder builder45 = builder40.removeUnicodeLocaleAttribute("GMT");
        java.util.Locale.Builder builder48 = builder40.setExtension('u', "en");
        java.util.Locale locale49 = builder48.build();
        int int50 = localeList19.lastIndexOf((java.lang.Object) locale49);
        java.util.Calendar.Builder builder51 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder55 = builder51.setWeekDate(5, (int) (byte) -1, 1);
        java.util.Calendar.Builder builder59 = builder55.setTimeOfDay(61, (int) 'a', 40);
        java.util.TimeZone timeZone60 = java.util.TimeZone.getDefault();
        timeZone60.setID("\uc624\ud6c4\uc2dc\ubd84\ucd08 GMT");
        java.util.Calendar calendar63 = java.util.Calendar.getInstance(timeZone60);
        boolean boolean64 = timeZone60.observesDaylightTime();
        java.util.Calendar.Builder builder65 = builder59.setTimeZone(timeZone60);
        int int66 = localeList19.lastIndexOf((java.lang.Object) builder59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar32 and calendar63", (calendar32.compareTo(calendar63) == 0) == calendar32.equals(calendar63));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "France");
        java.util.Locale.Builder builder5 = builder0.removeUnicodeLocaleAttribute("GMT");
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.lang.String str7 = locale6.getVariant();
        java.lang.String str8 = locale6.getDisplayCountry();
        java.util.Locale.Builder builder9 = builder0.setLocale(locale6);
        java.util.Locale.Builder builder10 = builder0.clearExtensions();
        java.util.Locale locale11 = java.util.Locale.FRANCE;
        java.lang.String str12 = locale11.getVariant();
        java.lang.String str13 = locale11.getDisplayCountry();
        java.util.Locale.Builder builder14 = builder10.setLocale(locale11);
        java.util.Locale.Builder builder15 = builder10.clearExtensions();
        java.util.Locale locale17 = java.util.Locale.forLanguageTag("");
        java.lang.String str18 = locale17.getScript();
        java.util.Locale.Builder builder19 = builder10.setLocale(locale17);
        java.util.Locale.Builder builder20 = builder10.clearExtensions();
        java.util.Locale locale21 = java.util.Locale.CHINA;
        java.lang.String str22 = locale21.getDisplayVariant();
        java.util.Locale.Builder builder23 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder26 = builder23.setExtension('a', "France");
        java.util.Locale locale28 = java.util.Locale.forLanguageTag("h:mm:ss a z");
        java.util.Locale.Builder builder29 = builder26.setLocale(locale28);
        java.util.Locale locale30 = locale28.stripExtensions();
        java.lang.String str31 = locale21.getDisplayCountry(locale30);
        java.util.Calendar calendar32 = java.util.Calendar.getInstance(locale30);
        java.util.Locale.Builder builder33 = builder20.setLocale(locale30);
        java.lang.String str34 = locale30.getCountry();
        java.util.TimeZone timeZone35 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone36 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone37 = java.util.TimeZone.getDefault();
        boolean boolean38 = timeZone36.hasSameRules(timeZone37);
        boolean boolean39 = timeZone35.hasSameRules(timeZone36);
        boolean boolean40 = timeZone36.observesDaylightTime();
        timeZone36.setRawOffset(52);
        timeZone36.setID("Temps universel coordonn\351");
        java.util.Locale locale46 = new java.util.Locale("zh");
        java.util.Locale locale47 = java.util.Locale.CHINESE;
        java.lang.String str48 = locale47.getLanguage();
        boolean boolean49 = locale47.hasExtensions();
        java.lang.String str50 = locale47.getDisplayCountry();
        java.lang.String str51 = locale46.getDisplayName(locale47);
        java.util.Calendar calendar52 = java.util.Calendar.getInstance(timeZone36, locale46);
        java.lang.String str53 = locale46.getLanguage();
        java.lang.String str54 = locale46.getDisplayScript();
        java.util.Locale locale55 = java.util.Locale.CHINA;
        java.util.TimeZone timeZone56 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone57 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone58 = java.util.TimeZone.getDefault();
        boolean boolean59 = timeZone57.hasSameRules(timeZone58);
        boolean boolean60 = timeZone56.hasSameRules(timeZone57);
        boolean boolean61 = timeZone57.observesDaylightTime();
        timeZone57.setRawOffset(52);
        timeZone57.setID("Temps universel coordonn\351");
        java.util.Locale locale67 = new java.util.Locale("zh");
        java.util.Locale locale68 = java.util.Locale.CHINESE;
        java.lang.String str69 = locale68.getLanguage();
        boolean boolean70 = locale68.hasExtensions();
        java.lang.String str71 = locale68.getDisplayCountry();
        java.lang.String str72 = locale67.getDisplayName(locale68);
        java.util.Calendar calendar73 = java.util.Calendar.getInstance(timeZone57, locale67);
        java.util.Set<java.lang.Character> charSet74 = locale67.getExtensionKeys();
        java.lang.String str75 = locale55.getDisplayCountry(locale67);
        java.lang.String str76 = locale55.getLanguage();
        java.lang.String str77 = locale46.getDisplayVariant(locale55);
        java.lang.String str78 = locale30.getDisplayLanguage(locale46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar32 and calendar52", (calendar32.compareTo(calendar52) == 0) == calendar32.equals(calendar52));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setWeekDate(5, (int) (byte) -1, 1);
        java.util.Calendar.Builder builder8 = builder4.setTimeOfDay(61, (int) 'a', 40);
        java.util.TimeZone timeZone9 = java.util.TimeZone.getDefault();
        timeZone9.setID("\uc624\ud6c4\uc2dc\ubd84\ucd08 GMT");
        java.util.Calendar calendar12 = java.util.Calendar.getInstance(timeZone9);
        boolean boolean13 = timeZone9.observesDaylightTime();
        java.util.Calendar.Builder builder14 = builder8.setTimeZone(timeZone9);
        java.util.Calendar.Builder builder18 = builder14.setDate(32772, (int) (byte) -1, 3);
        java.util.Locale.Builder builder19 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder22 = builder19.setExtension('a', "France");
        java.util.Locale.Builder builder24 = builder19.removeUnicodeLocaleAttribute("GMT");
        java.util.Locale locale25 = java.util.Locale.FRANCE;
        java.lang.String str26 = locale25.getVariant();
        java.lang.String str27 = locale25.getDisplayCountry();
        java.util.Locale.Builder builder28 = builder19.setLocale(locale25);
        java.util.Locale locale29 = java.util.Locale.CHINESE;
        java.lang.String str30 = locale29.getLanguage();
        boolean boolean31 = locale29.hasExtensions();
        java.lang.String str32 = locale29.getDisplayCountry();
        java.util.Set<java.lang.String> strSet33 = locale29.getUnicodeLocaleKeys();
        java.lang.String str34 = locale29.getISO3Language();
        java.util.Locale.Builder builder35 = builder19.setLocale(locale29);
        java.util.Locale.Builder builder37 = builder35.setRegion("");
        java.util.Locale.Builder builder39 = builder35.setVariant("Chinese");
        java.util.Locale.Builder builder41 = builder39.removeUnicodeLocaleAttribute("Chine");
        java.util.Locale locale42 = java.util.Locale.CHINESE;
        java.lang.String str43 = locale42.getLanguage();
        boolean boolean44 = locale42.hasExtensions();
        java.lang.String str45 = locale42.getDisplayCountry();
        java.lang.String str46 = locale42.getISO3Language();
        java.lang.String str47 = locale42.getVariant();
        java.lang.String str48 = locale42.getScript();
        java.util.Locale.LanguageRange[] languageRangeArray49 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList50 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList50, languageRangeArray49);
        java.util.Locale locale52 = java.util.Locale.GERMAN;
        java.util.Locale locale53 = java.util.Locale.FRANCE;
        boolean boolean54 = locale53.hasExtensions();
        java.util.Locale locale55 = java.util.Locale.FRANCE;
        java.util.Locale locale56 = java.util.Locale.CHINESE;
        java.lang.String str57 = locale56.getLanguage();
        java.util.Locale[] localeArray58 = new java.util.Locale[] { locale52, locale53, locale55, locale56 };
        java.util.ArrayList<java.util.Locale> localeList59 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList59, localeArray58);
        java.util.Locale.FilteringMode filteringMode61 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList62 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList50, (java.util.Collection<java.util.Locale>) localeList59, filteringMode61);
        java.util.Spliterator<java.util.Locale> localeSpliterator63 = localeList62.spliterator();
        java.lang.Object[] objArray64 = localeList62.toArray();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList66 = java.util.Locale.LanguageRange.parse("zho");
        java.util.Set<java.lang.String> strSet67 = java.util.Calendar.getAvailableCalendarTypes();
        java.util.stream.Stream<java.lang.String> strStream68 = strSet67.parallelStream();
        java.lang.String str69 = java.util.Locale.lookupTag(languageRangeList66, (java.util.Collection<java.lang.String>) strSet67);
        java.util.stream.Stream<java.lang.String> strStream70 = strSet67.stream();
        boolean boolean71 = localeList62.containsAll((java.util.Collection<java.lang.String>) strSet67);
        java.util.Locale locale75 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale76 = locale75.stripExtensions();
        boolean boolean77 = localeList62.add(locale75);
        java.lang.String str78 = locale42.getDisplayLanguage(locale75);
        java.util.Locale locale79 = java.util.Locale.CHINESE;
        java.lang.String str80 = locale79.getLanguage();
        boolean boolean81 = locale79.hasExtensions();
        java.lang.String str82 = locale79.getDisplayCountry();
        java.lang.String str83 = locale79.getDisplayLanguage();
        java.lang.String str84 = locale79.getLanguage();
        java.lang.String str85 = locale42.getDisplayLanguage(locale79);
        java.lang.String str86 = locale42.getDisplayLanguage();
        java.util.Locale.Builder builder87 = builder39.setLocale(locale42);
        java.util.Calendar.Builder builder88 = builder14.setLocale(locale42);
        java.util.Locale locale89 = null;
        java.lang.String str90 = locale42.getDisplayVariant(locale89);
        java.util.Locale locale92 = new java.util.Locale("zh");
        java.lang.String str93 = locale92.getDisplayVariant();
        java.lang.String str94 = locale92.getDisplayCountry();
        java.lang.String str95 = locale92.getDisplayVariant();
        java.lang.String str96 = locale92.getCountry();
        java.util.Calendar calendar97 = java.util.Calendar.getInstance(locale92);
        java.lang.String str98 = locale42.getDisplayLanguage(locale92);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar12 and calendar97", (calendar12.compareTo(calendar97) == 0) == calendar12.equals(calendar97));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        java.util.Locale locale2 = new java.util.Locale("", "chinois (Taiwan)");
        java.lang.String str3 = locale2.getDisplayLanguage();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str7 = timeZone6.getID();
        java.util.TimeZone.setDefault(timeZone6);
        java.util.Calendar calendar9 = java.util.Calendar.getInstance(timeZone6);
        int int10 = calendar9.getFirstDayOfWeek();
        java.util.TimeZone timeZone11 = java.util.TimeZone.getDefault();
        int int13 = timeZone11.getOffset((long) 2);
        java.util.Locale locale17 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale18 = locale17.stripExtensions();
        java.util.Calendar calendar19 = java.util.Calendar.getInstance(timeZone11, locale18);
        calendar9.setTimeZone(timeZone11);
        java.lang.String str21 = timeZone11.getID();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, timeZone11);
        java.util.Locale locale24 = java.util.Locale.forLanguageTag("21 Feb 2022 14:46:38 GMT");
        java.util.Calendar calendar25 = java.util.Calendar.getInstance(timeZone11, locale24);
        java.lang.String str26 = locale2.getDisplayVariant(locale24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar9 and calendar19", (calendar9.compareTo(calendar19) == 0) == calendar9.equals(calendar19));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        java.util.Locale locale7 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale8 = locale7.stripExtensions();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone1, locale7);
        java.lang.Object obj10 = fastDateFormat9.clone();
        java.util.TimeZone timeZone12 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str13 = timeZone12.getID();
        java.util.TimeZone.setDefault(timeZone12);
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone12);
        int int16 = calendar15.getFirstDayOfWeek();
        java.util.TimeZone timeZone17 = java.util.TimeZone.getDefault();
        int int19 = timeZone17.getOffset((long) 2);
        java.util.Locale locale23 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale24 = locale23.stripExtensions();
        java.util.Calendar calendar25 = java.util.Calendar.getInstance(timeZone17, locale24);
        calendar15.setTimeZone(timeZone17);
        java.lang.String str27 = timeZone17.getID();
        java.util.Calendar calendar28 = java.util.Calendar.getInstance(timeZone17);
        java.lang.String str29 = fastDateFormat9.format(calendar28);
        java.util.TimeZone timeZone30 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone31 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone32 = java.util.TimeZone.getDefault();
        boolean boolean33 = timeZone31.hasSameRules(timeZone32);
        boolean boolean34 = timeZone30.hasSameRules(timeZone31);
        boolean boolean35 = timeZone31.observesDaylightTime();
        timeZone31.setRawOffset(52);
        timeZone31.setID("Temps universel coordonn\351");
        java.util.Locale locale41 = new java.util.Locale("zh");
        java.util.Locale locale42 = java.util.Locale.CHINESE;
        java.lang.String str43 = locale42.getLanguage();
        boolean boolean44 = locale42.hasExtensions();
        java.lang.String str45 = locale42.getDisplayCountry();
        java.lang.String str46 = locale41.getDisplayName(locale42);
        java.util.Calendar calendar47 = java.util.Calendar.getInstance(timeZone31, locale41);
        calendar47.clear();
        long long49 = calendar47.getTimeInMillis();
        java.util.Date date50 = new java.util.Date();
        int int51 = date50.getTimezoneOffset();
        date50.setMinutes(5);
        int int54 = date50.getMonth();
        calendar47.setTime(date50);
        java.util.TimeZone timeZone56 = calendar47.getTimeZone();
        java.lang.StringBuffer stringBuffer57 = null;
        java.lang.StringBuffer stringBuffer58 = fastDateFormat9.format(calendar47, stringBuffer57);
        java.util.Locale.LanguageRange[] languageRangeArray59 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList60 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList60, languageRangeArray59);
        java.util.Locale locale62 = java.util.Locale.GERMAN;
        java.util.Locale locale63 = java.util.Locale.FRANCE;
        boolean boolean64 = locale63.hasExtensions();
        java.util.Locale locale65 = java.util.Locale.FRANCE;
        java.util.Locale locale66 = java.util.Locale.CHINESE;
        java.lang.String str67 = locale66.getLanguage();
        java.util.Locale[] localeArray68 = new java.util.Locale[] { locale62, locale63, locale65, locale66 };
        java.util.ArrayList<java.util.Locale> localeList69 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList69, localeArray68);
        java.util.Locale.FilteringMode filteringMode71 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList72 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList60, (java.util.Collection<java.util.Locale>) localeList69, filteringMode71);
        java.util.Spliterator<java.util.Locale> localeSpliterator73 = localeList72.spliterator();
        java.util.Iterator<java.util.Locale> localeItor74 = localeList72.iterator();
        java.lang.String[] strArray75 = java.util.Locale.getISOCountries();
        java.lang.CharSequence[] charSequenceArray76 = localeList72.toArray((java.lang.CharSequence[]) strArray75);
        boolean boolean77 = localeList72.isEmpty();
        boolean boolean79 = localeList72.remove((java.lang.Object) 1645454771320L);
        java.util.Spliterator<java.util.Locale> localeSpliterator80 = localeList72.spliterator();
        java.lang.Object[] objArray81 = localeList72.toArray();
        boolean boolean82 = calendar47.before((java.lang.Object) objArray81);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar15 and calendar25", (calendar15.compareTo(calendar25) == 0) == calendar15.equals(calendar25));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
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
        java.util.Locale locale20 = java.util.Locale.UK;
        boolean boolean21 = locale20.hasExtensions();
        boolean boolean22 = localeList13.add(locale20);
        java.util.TimeZone timeZone24 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone25 = java.util.TimeZone.getDefault();
        boolean boolean26 = timeZone24.hasSameRules(timeZone25);
        java.util.Locale locale30 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale31 = locale30.stripExtensions();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone24, locale30);
        java.util.TimeZone timeZone33 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone34 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone35 = java.util.TimeZone.getDefault();
        boolean boolean36 = timeZone34.hasSameRules(timeZone35);
        boolean boolean37 = timeZone33.hasSameRules(timeZone34);
        boolean boolean38 = timeZone34.observesDaylightTime();
        timeZone34.setRawOffset(52);
        timeZone34.setID("Temps universel coordonn\351");
        java.util.Locale locale44 = new java.util.Locale("zh");
        java.util.Locale locale45 = java.util.Locale.CHINESE;
        java.lang.String str46 = locale45.getLanguage();
        boolean boolean47 = locale45.hasExtensions();
        java.lang.String str48 = locale45.getDisplayCountry();
        java.lang.String str49 = locale44.getDisplayName(locale45);
        java.util.Calendar calendar50 = java.util.Calendar.getInstance(timeZone34, locale44);
        java.lang.String str51 = fastDateFormat32.format(calendar50);
        calendar50.set((int) (short) 0, 0, 58);
        java.util.TimeZone timeZone56 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone57 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone58 = java.util.TimeZone.getDefault();
        boolean boolean59 = timeZone57.hasSameRules(timeZone58);
        boolean boolean60 = timeZone56.hasSameRules(timeZone57);
        boolean boolean61 = timeZone57.observesDaylightTime();
        java.util.TimeZone timeZone62 = java.util.TimeZone.getDefault();
        int int64 = timeZone62.getOffset((long) 2);
        java.util.Locale locale68 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale69 = locale68.stripExtensions();
        java.util.Calendar calendar70 = java.util.Calendar.getInstance(timeZone62, locale69);
        boolean boolean71 = timeZone57.hasSameRules(timeZone62);
        java.util.Calendar calendar72 = java.util.Calendar.getInstance(timeZone62);
        java.util.TimeZone timeZone76 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat77 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone76);
        java.lang.String str78 = fastDateFormat77.getPattern();
        java.text.ParsePosition parsePosition81 = new java.text.ParsePosition(16);
        parsePosition81.setIndex(11);
        java.lang.Object obj84 = fastDateFormat77.parseObject("FastDateFormat[]", parsePosition81);
        boolean boolean85 = fastDateFormat77.getTimeZoneOverridesCalendar();
        java.text.AttributedCharacterIterator attributedCharacterIterator87 = fastDateFormat77.formatToCharacterIterator((java.lang.Object) 1645454754924L);
        java.util.Locale locale88 = fastDateFormat77.getLocale();
        java.util.Map<java.lang.String, java.lang.Integer> strMap89 = calendar72.getDisplayNames(2, 0, locale88);
        boolean boolean90 = calendar50.after((java.lang.Object) locale88);
        java.lang.String str91 = locale20.getDisplayLanguage(locale88);
        java.lang.String str92 = locale88.getISO3Language();
        java.lang.Object obj93 = locale88.clone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar70 and calendar72", (calendar70.compareTo(calendar72) == 0) == calendar70.equals(calendar72));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone1);
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(timeZone1);
        timeZone1.setID("java.text.AttributedCharacterIterator$Attribute(input_method_segment)");
        java.util.TimeZone timeZone10 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str11 = timeZone10.getID();
        java.util.TimeZone.setDefault(timeZone10);
        java.util.Calendar calendar13 = java.util.Calendar.getInstance(timeZone10);
        int int14 = calendar13.getFirstDayOfWeek();
        java.util.TimeZone timeZone15 = java.util.TimeZone.getDefault();
        int int17 = timeZone15.getOffset((long) 2);
        java.util.Locale locale21 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale22 = locale21.stripExtensions();
        java.util.Calendar calendar23 = java.util.Calendar.getInstance(timeZone15, locale22);
        calendar13.setTimeZone(timeZone15);
        java.lang.String str25 = timeZone15.getID();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, timeZone15);
        boolean boolean27 = timeZone1.hasSameRules(timeZone15);
        java.util.Locale locale28 = java.util.Locale.CHINA;
        boolean boolean29 = locale28.hasExtensions();
        java.lang.String str30 = timeZone1.getDisplayName(locale28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar5 and calendar13", (calendar5.compareTo(calendar13) == 0) == calendar5.equals(calendar13));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        java.util.Locale.Builder builder4 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder7 = builder4.setExtension('a', "France");
        java.util.Locale.Builder builder9 = builder4.removeUnicodeLocaleAttribute("GMT");
        java.util.Locale locale10 = java.util.Locale.FRANCE;
        java.lang.String str11 = locale10.getVariant();
        java.lang.String str12 = locale10.getDisplayCountry();
        java.util.Locale.Builder builder13 = builder4.setLocale(locale10);
        java.lang.String str14 = locale10.toLanguageTag();
        java.lang.String str15 = locale10.toLanguageTag();
        java.util.Locale locale18 = new java.util.Locale("\uc624\ud6c4\uc2dc\ubd84\ucd08 GMT", "Wed Mar 16 08:10:49 GMT 2022");
        java.util.TimeZone timeZone20 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone20);
        java.lang.String str22 = fastDateFormat21.getPattern();
        java.text.ParsePosition parsePosition25 = new java.text.ParsePosition(16);
        parsePosition25.setIndex(11);
        java.lang.Object obj28 = fastDateFormat21.parseObject("FastDateFormat[]", parsePosition25);
        java.util.TimeZone timeZone29 = fastDateFormat21.getTimeZone();
        java.lang.String str30 = timeZone29.getID();
        java.util.Locale locale32 = new java.util.Locale("zh");
        java.lang.String str33 = locale32.getISO3Country();
        java.util.Calendar calendar34 = java.util.Calendar.getInstance(timeZone29, locale32);
        java.lang.String str35 = locale32.getCountry();
        java.lang.String str36 = locale18.getDisplayName(locale32);
        java.lang.String str37 = locale10.getDisplayVariant(locale32);
        java.util.Map<java.lang.String, java.lang.Integer> strMap38 = calendar1.getDisplayNames(14, (int) (short) 1, locale32);
        java.util.Calendar calendar39 = java.util.Calendar.getInstance(locale32);
        calendar39.setFirstDayOfWeek(50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar1 and calendar34", (calendar1.compareTo(calendar34) == 0) == calendar1.equals(calendar34));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
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
        java.util.Locale locale38 = java.util.Locale.CHINA;
        java.lang.String str40 = locale38.getExtension('x');
        int int41 = localeList13.lastIndexOf((java.lang.Object) locale38);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList43 = java.util.Locale.LanguageRange.parse("zho");
        java.util.Locale.LanguageRange[] languageRangeArray44 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList45 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList45, languageRangeArray44);
        java.util.Locale locale47 = java.util.Locale.GERMAN;
        java.util.Locale locale48 = java.util.Locale.FRANCE;
        boolean boolean49 = locale48.hasExtensions();
        java.util.Locale locale50 = java.util.Locale.FRANCE;
        java.util.Locale locale51 = java.util.Locale.CHINESE;
        java.lang.String str52 = locale51.getLanguage();
        java.util.Locale[] localeArray53 = new java.util.Locale[] { locale47, locale48, locale50, locale51 };
        java.util.ArrayList<java.util.Locale> localeList54 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList54, localeArray53);
        java.util.Locale.FilteringMode filteringMode56 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList57 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList45, (java.util.Collection<java.util.Locale>) localeList54, filteringMode56);
        java.util.Locale.FilteringMode filteringMode58 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList59 = java.util.Locale.filter(languageRangeList43, (java.util.Collection<java.util.Locale>) localeList54, filteringMode58);
        java.util.Locale locale60 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.String> strSet61 = locale60.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList62 = java.util.Locale.filterTags(languageRangeList43, (java.util.Collection<java.lang.String>) strSet61);
        boolean boolean63 = localeList13.containsAll((java.util.Collection<java.lang.String>) strList62);
        java.util.Locale locale65 = java.util.Locale.GERMAN;
        java.lang.String str67 = locale65.getExtension('u');
        localeList13.add((int) (short) 0, locale65);
        java.util.Spliterator<java.util.Locale> localeSpliterator69 = localeList13.spliterator();
        java.util.Locale locale71 = new java.util.Locale("Jan 21, 2022 2:46:21 PM");
        boolean boolean72 = localeList13.add(locale71);
        java.lang.Object[] objArray73 = localeList13.toArray();
        java.util.TimeZone timeZone75 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone76 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone77 = java.util.TimeZone.getDefault();
        boolean boolean78 = timeZone76.hasSameRules(timeZone77);
        boolean boolean79 = timeZone75.hasSameRules(timeZone76);
        boolean boolean80 = timeZone76.observesDaylightTime();
        timeZone76.setRawOffset(52);
        timeZone76.setID("Temps universel coordonn\351");
        java.util.Locale locale86 = new java.util.Locale("zh");
        java.util.Locale locale87 = java.util.Locale.CHINESE;
        java.lang.String str88 = locale87.getLanguage();
        boolean boolean89 = locale87.hasExtensions();
        java.lang.String str90 = locale87.getDisplayCountry();
        java.lang.String str91 = locale86.getDisplayName(locale87);
        java.util.Calendar calendar92 = java.util.Calendar.getInstance(timeZone76, locale86);
        localeList13.add(0, locale86);
        java.util.Calendar calendar94 = java.util.Calendar.getInstance(locale86);
        java.lang.String str95 = locale86.getISO3Country();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar92 and calendar94", (calendar92.compareTo(calendar94) == 0) == calendar92.equals(calendar94));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone1);
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(timeZone1);
        timeZone1.setID("java.text.AttributedCharacterIterator$Attribute(input_method_segment)");
        java.util.TimeZone timeZone10 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str11 = timeZone10.getID();
        java.util.TimeZone.setDefault(timeZone10);
        java.util.Calendar calendar13 = java.util.Calendar.getInstance(timeZone10);
        int int14 = calendar13.getFirstDayOfWeek();
        java.util.TimeZone timeZone15 = java.util.TimeZone.getDefault();
        int int17 = timeZone15.getOffset((long) 2);
        java.util.Locale locale21 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale22 = locale21.stripExtensions();
        java.util.Calendar calendar23 = java.util.Calendar.getInstance(timeZone15, locale22);
        calendar13.setTimeZone(timeZone15);
        java.lang.String str25 = timeZone15.getID();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, timeZone15);
        boolean boolean27 = timeZone1.hasSameRules(timeZone15);
        timeZone1.setID("java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Mon Feb 21 14:45:50 GMT 2022\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=3,MONTH=28,WEEK_OF_YEAR=9,WEEK_OF_MONTH=5,DAY_OF_MONTH=4,DAY_OF_YEAR=57,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=366,MINUTE=38,SECOND=59,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar5 and calendar13", (calendar5.compareTo(calendar13) == 0) == calendar5.equals(calendar13));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
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
        java.util.Iterator<java.util.Locale> localeItor52 = localeList27.iterator();
        java.util.ListIterator<java.util.Locale> localeItor53 = localeList27.listIterator();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar46 and calendar48", (calendar46.compareTo(calendar48) == 0) == calendar46.equals(calendar48));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone1);
        java.lang.String str5 = timeZone1.getID();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        int int8 = timeZone6.getOffset((long) 2);
        int int9 = timeZone6.getRawOffset();
        boolean boolean10 = timeZone1.hasSameRules(timeZone6);
        int int12 = timeZone1.getOffset(1645454799181L);
        java.util.TimeZone timeZone14 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone15 = java.util.TimeZone.getDefault();
        boolean boolean16 = timeZone14.hasSameRules(timeZone15);
        java.util.Locale locale20 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale21 = locale20.stripExtensions();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone14, locale20);
        java.util.TimeZone timeZone23 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone24 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone25 = java.util.TimeZone.getDefault();
        boolean boolean26 = timeZone24.hasSameRules(timeZone25);
        boolean boolean27 = timeZone23.hasSameRules(timeZone24);
        boolean boolean28 = timeZone24.observesDaylightTime();
        timeZone24.setRawOffset(52);
        timeZone24.setID("Temps universel coordonn\351");
        java.util.Locale locale34 = new java.util.Locale("zh");
        java.util.Locale locale35 = java.util.Locale.CHINESE;
        java.lang.String str36 = locale35.getLanguage();
        boolean boolean37 = locale35.hasExtensions();
        java.lang.String str38 = locale35.getDisplayCountry();
        java.lang.String str39 = locale34.getDisplayName(locale35);
        java.util.Calendar calendar40 = java.util.Calendar.getInstance(timeZone24, locale34);
        java.lang.String str41 = fastDateFormat22.format(calendar40);
        calendar40.set((int) (short) 0, 0, 58);
        java.util.TimeZone timeZone46 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone47 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone48 = java.util.TimeZone.getDefault();
        boolean boolean49 = timeZone47.hasSameRules(timeZone48);
        boolean boolean50 = timeZone46.hasSameRules(timeZone47);
        boolean boolean51 = timeZone47.observesDaylightTime();
        java.util.TimeZone timeZone52 = java.util.TimeZone.getDefault();
        int int54 = timeZone52.getOffset((long) 2);
        java.util.Locale locale58 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale59 = locale58.stripExtensions();
        java.util.Calendar calendar60 = java.util.Calendar.getInstance(timeZone52, locale59);
        boolean boolean61 = timeZone47.hasSameRules(timeZone52);
        java.util.Calendar calendar62 = java.util.Calendar.getInstance(timeZone52);
        java.util.TimeZone timeZone66 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat67 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone66);
        java.lang.String str68 = fastDateFormat67.getPattern();
        java.text.ParsePosition parsePosition71 = new java.text.ParsePosition(16);
        parsePosition71.setIndex(11);
        java.lang.Object obj74 = fastDateFormat67.parseObject("FastDateFormat[]", parsePosition71);
        boolean boolean75 = fastDateFormat67.getTimeZoneOverridesCalendar();
        java.text.AttributedCharacterIterator attributedCharacterIterator77 = fastDateFormat67.formatToCharacterIterator((java.lang.Object) 1645454754924L);
        java.util.Locale locale78 = fastDateFormat67.getLocale();
        java.util.Map<java.lang.String, java.lang.Integer> strMap79 = calendar62.getDisplayNames(2, 0, locale78);
        boolean boolean80 = calendar40.after((java.lang.Object) locale78);
        java.util.Calendar calendar81 = java.util.Calendar.getInstance(timeZone1, locale78);
        java.util.Date date85 = new java.util.Date(53, (int) (short) 10, 3);
        calendar81.setTime(date85);
        calendar81.setFirstDayOfWeek(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar60 and calendar62", (calendar60.compareTo(calendar62) == 0) == calendar60.equals(calendar62));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        java.text.AttributedCharacterIterator.Attribute attribute0 = java.text.AttributedCharacterIterator.Attribute.READING;
        boolean boolean2 = attribute0.equals((java.lang.Object) 12);
        java.lang.String str3 = attribute0.toString();
        java.lang.String str4 = attribute0.toString();
        java.lang.String str5 = attribute0.toString();
        java.util.Locale locale9 = new java.util.Locale("", "hi!", "");
        java.lang.String str10 = locale9.getCountry();
        java.util.Calendar calendar11 = java.util.Calendar.getInstance(locale9);
        java.util.Locale.Builder builder12 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder15 = builder12.setExtension('a', "France");
        java.util.Locale.Builder builder17 = builder12.removeUnicodeLocaleAttribute("GMT");
        java.util.Locale locale18 = java.util.Locale.FRANCE;
        java.lang.String str19 = locale18.getVariant();
        java.lang.String str20 = locale18.getDisplayCountry();
        java.util.Locale.Builder builder21 = builder12.setLocale(locale18);
        java.util.Locale.Builder builder22 = builder12.clearExtensions();
        java.util.Locale locale23 = java.util.Locale.FRANCE;
        java.lang.String str24 = locale23.getVariant();
        java.lang.String str25 = locale23.getDisplayCountry();
        java.util.Locale.Builder builder26 = builder22.setLocale(locale23);
        java.util.Locale.Builder builder27 = builder22.clear();
        java.util.Locale.Category category28 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale29 = java.util.Locale.TAIWAN;
        java.util.Locale locale30 = locale29.stripExtensions();
        java.util.Locale.setDefault(category28, locale29);
        java.util.Locale locale32 = java.util.Locale.KOREA;
        java.lang.String str33 = locale32.getScript();
        java.util.Locale locale34 = java.util.Locale.FRANCE;
        java.lang.String str35 = locale32.getDisplayVariant(locale34);
        java.util.Locale.setDefault(category28, locale34);
        java.util.Locale locale37 = java.util.Locale.getDefault(category28);
        java.util.Locale.Builder builder38 = builder27.setLocale(locale37);
        java.lang.String str39 = locale9.getDisplayCountry(locale37);
        boolean boolean40 = attribute0.equals((java.lang.Object) locale37);
        java.util.TimeZone timeZone42 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone42);
        java.lang.String str44 = fastDateFormat43.getPattern();
        java.util.Date date45 = new java.util.Date();
        int int46 = date45.getSeconds();
        java.lang.String str47 = fastDateFormat43.format(date45);
        java.text.ParsePosition parsePosition50 = new java.text.ParsePosition(16);
        int int51 = parsePosition50.getErrorIndex();
        java.lang.Object obj52 = fastDateFormat43.parseObject("Temps universel coordonn\351", parsePosition50);
        int int53 = fastDateFormat43.getMaxLengthEstimate();
        java.util.TimeZone timeZone54 = java.util.TimeZone.getDefault();
        int int56 = timeZone54.getOffset((long) 2);
        java.util.Locale locale60 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale61 = locale60.stripExtensions();
        java.util.Calendar calendar62 = java.util.Calendar.getInstance(timeZone54, locale61);
        int int64 = calendar62.getLeastMaximum(4);
        int int66 = calendar62.getLeastMaximum((int) (byte) 0);
        long long67 = calendar62.getTimeInMillis();
        java.lang.String str68 = fastDateFormat43.format(calendar62);
        java.util.TimeZone timeZone70 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone71 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone72 = java.util.TimeZone.getDefault();
        boolean boolean73 = timeZone71.hasSameRules(timeZone72);
        boolean boolean74 = timeZone70.hasSameRules(timeZone71);
        java.lang.String str75 = timeZone71.getID();
        java.util.TimeZone timeZone76 = java.util.TimeZone.getDefault();
        int int78 = timeZone76.getOffset((long) 2);
        int int79 = timeZone76.getRawOffset();
        boolean boolean80 = timeZone71.hasSameRules(timeZone76);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat81 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone76);
        java.util.Calendar calendar82 = java.util.Calendar.getInstance(timeZone76);
        timeZone76.setID("21 Feb 2022 14:46:42 GMT");
        calendar62.setTimeZone(timeZone76);
        boolean boolean86 = attribute0.equals((java.lang.Object) timeZone76);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar11 and calendar62", (calendar11.compareTo(calendar62) == 0) == calendar11.equals(calendar62));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        java.text.ParsePosition parsePosition1 = new java.text.ParsePosition(16);
        parsePosition1.setIndex(11);
        parsePosition1.setErrorIndex(7);
        int int6 = parsePosition1.getIndex();
        java.util.Locale.Category category7 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale8 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(category7, locale8);
        java.util.Locale locale13 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale14 = locale13.stripExtensions();
        java.lang.String str15 = locale13.getLanguage();
        java.util.Locale.setDefault(category7, locale13);
        boolean boolean17 = parsePosition1.equals((java.lang.Object) category7);
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
        java.util.Locale.setDefault(category7, locale29);
        java.util.Locale.Category category38 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale39 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(category38, locale39);
        java.util.Locale locale41 = java.util.Locale.US;
        java.lang.String str42 = locale41.getDisplayVariant();
        java.util.Locale locale43 = java.util.Locale.FRANCE;
        boolean boolean44 = locale43.hasExtensions();
        java.util.Locale locale45 = java.util.Locale.ROOT;
        java.lang.String str46 = locale43.getDisplayName(locale45);
        java.lang.String str47 = locale45.getCountry();
        java.lang.String str48 = locale41.getDisplayVariant(locale45);
        java.util.Locale.setDefault(category38, locale41);
        java.util.Locale locale50 = java.util.Locale.getDefault(category38);
        java.util.Calendar calendar51 = java.util.Calendar.getInstance(locale50);
        java.lang.String str52 = locale50.getDisplayLanguage();
        java.util.Calendar.Builder builder53 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder57 = builder53.setTimeOfDay(16, (int) ' ', 16);
        java.util.Locale.Builder builder58 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder61 = builder58.setExtension('a', "France");
        java.util.Locale.Builder builder63 = builder58.removeUnicodeLocaleAttribute("GMT");
        java.util.Locale locale64 = java.util.Locale.FRANCE;
        java.lang.String str65 = locale64.getVariant();
        java.lang.String str66 = locale64.getDisplayCountry();
        java.util.Locale.Builder builder67 = builder58.setLocale(locale64);
        java.util.Locale locale69 = new java.util.Locale("zh");
        java.lang.String str70 = locale64.getDisplayName(locale69);
        java.util.Calendar.Builder builder71 = builder53.setLocale(locale64);
        java.lang.String str72 = locale50.getDisplayLanguage(locale64);
        java.util.Locale.setDefault(category7, locale50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar35 and calendar51", (calendar35.compareTo(calendar51) == 0) == calendar35.equals(calendar51));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        timeZone0.setID("\uc624\ud6c4\uc2dc\ubd84\ucd08 GMT");
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone0);
        java.time.Instant instant4 = calendar3.toInstant();
        java.util.TimeZone timeZone5 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone7 = java.util.TimeZone.getDefault();
        boolean boolean8 = timeZone6.hasSameRules(timeZone7);
        boolean boolean9 = timeZone5.hasSameRules(timeZone6);
        timeZone6.setID("Mon Feb 21 14:45:50 GMT 2022");
        java.util.TimeZone timeZone12 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone13 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone14 = java.util.TimeZone.getDefault();
        boolean boolean15 = timeZone13.hasSameRules(timeZone14);
        boolean boolean16 = timeZone12.hasSameRules(timeZone13);
        java.util.TimeZone timeZone18 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str19 = timeZone18.getID();
        boolean boolean20 = timeZone13.hasSameRules(timeZone18);
        timeZone18.setRawOffset((int) 'x');
        timeZone18.setRawOffset((int) 'x');
        java.util.TimeZone.setDefault(timeZone18);
        boolean boolean26 = timeZone6.hasSameRules(timeZone18);
        java.util.TimeZone.setDefault(timeZone6);
        calendar3.setTimeZone(timeZone6);
        int int30 = timeZone6.getOffset(1645454808177L);
        java.util.TimeZone timeZone31 = java.util.TimeZone.getDefault();
        int int33 = timeZone31.getOffset((long) 2);
        java.util.Locale locale37 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale38 = locale37.stripExtensions();
        java.util.Calendar calendar39 = java.util.Calendar.getInstance(timeZone31, locale38);
        java.lang.String str40 = timeZone31.getID();
        java.util.Locale locale41 = java.util.Locale.US;
        java.util.Calendar calendar42 = java.util.Calendar.getInstance(timeZone31, locale41);
        int int43 = timeZone31.getRawOffset();
        boolean boolean44 = timeZone6.hasSameRules(timeZone31);
        timeZone6.setID("2:50:45 PM UTC");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar3 and calendar39", (calendar3.compareTo(calendar39) == 0) == calendar3.equals(calendar39));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        java.util.Calendar.Builder builder1 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder5 = builder1.setTimeOfDay(16, (int) ' ', 16);
        java.util.Calendar.Builder builder7 = builder5.setLenient(true);
        java.util.Calendar.Builder builder12 = builder7.setTimeOfDay(126, 55, 14, 58);
        java.util.Calendar calendar13 = builder7.build();
        java.util.TimeZone timeZone14 = calendar13.getTimeZone();
        java.util.TimeZone timeZone15 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone16 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone17 = java.util.TimeZone.getDefault();
        boolean boolean18 = timeZone16.hasSameRules(timeZone17);
        boolean boolean19 = timeZone15.hasSameRules(timeZone16);
        java.util.Calendar calendar20 = java.util.Calendar.getInstance(timeZone16);
        timeZone16.setRawOffset(50);
        java.util.Locale locale24 = new java.util.Locale("2:45:52 PM UTC");
        java.util.Locale locale26 = new java.util.Locale("zh");
        java.lang.String str27 = locale24.getDisplayScript(locale26);
        java.util.TimeZone timeZone29 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone29);
        java.lang.String str31 = fastDateFormat30.getPattern();
        java.text.ParsePosition parsePosition34 = new java.text.ParsePosition(16);
        parsePosition34.setIndex(11);
        java.lang.Object obj37 = fastDateFormat30.parseObject("FastDateFormat[]", parsePosition34);
        java.util.TimeZone timeZone38 = fastDateFormat30.getTimeZone();
        java.lang.String str39 = timeZone38.getID();
        java.util.Locale locale41 = new java.util.Locale("zh");
        java.lang.String str42 = locale41.getISO3Country();
        java.util.Calendar calendar43 = java.util.Calendar.getInstance(timeZone38, locale41);
        java.lang.String str44 = locale24.getDisplayName(locale41);
        java.lang.String str45 = locale24.getISO3Country();
        java.lang.String str47 = locale24.getExtension('x');
        java.util.Calendar calendar48 = java.util.Calendar.getInstance(timeZone16, locale24);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone14, locale24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar43 and calendar48", (calendar43.compareTo(calendar48) == 0) == calendar43.equals(calendar48));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
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
        java.lang.Object[] objArray24 = localeList13.toArray();
        java.util.ListIterator<java.util.Locale> localeItor25 = localeList13.listIterator();
        java.util.Locale locale26 = java.util.Locale.FRENCH;
        java.lang.String str27 = locale26.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet28 = locale26.getUnicodeLocaleKeys();
        boolean boolean29 = localeList13.removeAll((java.util.Collection<java.lang.String>) strSet28);
        boolean boolean30 = localeList13.isEmpty();
        java.util.TimeZone timeZone31 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone32 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone33 = java.util.TimeZone.getDefault();
        boolean boolean34 = timeZone32.hasSameRules(timeZone33);
        boolean boolean35 = timeZone31.hasSameRules(timeZone32);
        boolean boolean36 = timeZone32.observesDaylightTime();
        java.lang.String str37 = timeZone32.getID();
        java.util.Locale locale38 = java.util.Locale.CHINESE;
        java.lang.String str39 = locale38.getLanguage();
        boolean boolean40 = locale38.hasExtensions();
        java.util.Locale locale41 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str42 = locale38.getDisplayLanguage(locale41);
        java.lang.String str43 = locale41.getLanguage();
        java.lang.String str44 = locale41.getDisplayScript();
        java.lang.String str45 = locale41.getLanguage();
        java.util.Calendar calendar46 = java.util.Calendar.getInstance(timeZone32, locale41);
        int int47 = localeList13.indexOf((java.lang.Object) timeZone32);
        java.util.TimeZone timeZone50 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str51 = timeZone50.getID();
        java.util.TimeZone.setDefault(timeZone50);
        java.util.Calendar calendar53 = java.util.Calendar.getInstance(timeZone50);
        int int54 = calendar53.getFirstDayOfWeek();
        java.util.TimeZone timeZone55 = java.util.TimeZone.getDefault();
        int int57 = timeZone55.getOffset((long) 2);
        java.util.Locale locale61 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale62 = locale61.stripExtensions();
        java.util.Calendar calendar63 = java.util.Calendar.getInstance(timeZone55, locale62);
        calendar53.setTimeZone(timeZone55);
        java.lang.String str65 = timeZone55.getID();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat66 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, timeZone55);
        java.util.Calendar calendar67 = java.util.Calendar.getInstance(timeZone55);
        timeZone55.setRawOffset(48);
        boolean boolean70 = timeZone32.hasSameRules(timeZone55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar46 and calendar53", (calendar46.compareTo(calendar53) == 0) == calendar46.equals(calendar53));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 2);
        java.util.Locale locale6 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale7 = locale6.stripExtensions();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone0, locale7);
        java.lang.String str9 = timeZone0.getID();
        java.util.Locale locale10 = java.util.Locale.US;
        java.util.Calendar calendar11 = java.util.Calendar.getInstance(timeZone0, locale10);
        java.util.TimeZone timeZone13 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone14 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone15 = java.util.TimeZone.getDefault();
        boolean boolean16 = timeZone14.hasSameRules(timeZone15);
        boolean boolean17 = timeZone13.hasSameRules(timeZone14);
        java.util.TimeZone timeZone19 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str20 = timeZone19.getID();
        boolean boolean21 = timeZone14.hasSameRules(timeZone19);
        java.util.Locale locale22 = java.util.Locale.FRANCE;
        boolean boolean23 = locale22.hasExtensions();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone19, locale22);
        java.util.TimeZone timeZone26 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str27 = timeZone26.getID();
        java.util.TimeZone.setDefault(timeZone26);
        java.util.Calendar calendar29 = java.util.Calendar.getInstance(timeZone26);
        int int30 = calendar29.getFirstDayOfWeek();
        java.util.TimeZone timeZone31 = java.util.TimeZone.getDefault();
        int int33 = timeZone31.getOffset((long) 2);
        java.util.Locale locale37 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale38 = locale37.stripExtensions();
        java.util.Calendar calendar39 = java.util.Calendar.getInstance(timeZone31, locale38);
        calendar29.setTimeZone(timeZone31);
        java.lang.String str41 = timeZone31.getID();
        java.util.Calendar calendar42 = java.util.Calendar.getInstance(timeZone31);
        java.util.TimeZone timeZone43 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone44 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone45 = java.util.TimeZone.getDefault();
        boolean boolean46 = timeZone44.hasSameRules(timeZone45);
        boolean boolean47 = timeZone43.hasSameRules(timeZone44);
        timeZone44.setID("Mon Feb 21 14:45:50 GMT 2022");
        boolean boolean50 = timeZone31.hasSameRules(timeZone44);
        boolean boolean51 = timeZone19.hasSameRules(timeZone44);
        calendar11.setTimeZone(timeZone19);
        java.util.Date date53 = calendar11.getTime();
        java.lang.String str54 = date53.toLocaleString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar8 and calendar11", (calendar8.compareTo(calendar11) == 0) == calendar8.equals(calendar11));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
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
        java.util.Locale locale16 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(timeZone1, locale16);
        java.util.Calendar calendar18 = java.util.Calendar.getInstance(timeZone1);
        timeZone1.setRawOffset(24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar14 and calendar17", (calendar14.compareTo(calendar17) == 0) == calendar14.equals(calendar17));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
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
        java.util.TimeZone timeZone36 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone37 = java.util.TimeZone.getDefault();
        boolean boolean38 = timeZone36.hasSameRules(timeZone37);
        java.util.Locale locale42 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale43 = locale42.stripExtensions();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone36, locale42);
        java.lang.Object obj45 = fastDateFormat44.clone();
        java.text.ParsePosition parsePosition48 = new java.text.ParsePosition(16);
        int int49 = parsePosition48.getErrorIndex();
        java.lang.String str50 = parsePosition48.toString();
        java.lang.Object obj51 = null;
        boolean boolean52 = parsePosition48.equals(obj51);
        int int53 = parsePosition48.getIndex();
        int int54 = parsePosition48.getIndex();
        java.lang.Object obj55 = fastDateFormat44.parseObject("France", parsePosition48);
        java.lang.String str57 = fastDateFormat44.format((long) (byte) 100);
        java.util.TimeZone timeZone59 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat60 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone59);
        java.lang.String str61 = fastDateFormat60.getPattern();
        java.util.Date date62 = new java.util.Date();
        int int63 = date62.getSeconds();
        java.lang.String str64 = fastDateFormat60.format(date62);
        java.text.ParsePosition parsePosition67 = new java.text.ParsePosition(16);
        int int68 = parsePosition67.getErrorIndex();
        java.lang.Object obj69 = fastDateFormat60.parseObject("Temps universel coordonn\351", parsePosition67);
        java.util.Date date70 = new java.util.Date();
        int int71 = date70.getSeconds();
        java.util.Date date72 = new java.util.Date();
        int int73 = date72.getTimezoneOffset();
        date72.setMinutes(5);
        boolean boolean76 = date70.after(date72);
        long long77 = date72.getTime();
        java.util.Date date78 = new java.util.Date();
        int int79 = date78.getSeconds();
        boolean boolean80 = date72.before(date78);
        java.time.Instant instant81 = date78.toInstant();
        java.lang.String str82 = fastDateFormat60.format(date78);
        java.lang.StringBuffer stringBuffer83 = null;
        java.lang.StringBuffer stringBuffer84 = fastDateFormat44.format(date78, stringBuffer83);
        java.util.TimeZone timeZone86 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str87 = timeZone86.getID();
        java.util.TimeZone.setDefault(timeZone86);
        java.util.Calendar calendar89 = java.util.Calendar.getInstance(timeZone86);
        int int90 = calendar89.getFirstDayOfWeek();
        java.lang.StringBuffer stringBuffer91 = null;
        java.lang.StringBuffer stringBuffer92 = fastDateFormat44.format(calendar89, stringBuffer91);
        java.lang.String str93 = fastDateFormat2.format(calendar89);
        java.lang.String str95 = fastDateFormat2.format(1645455093074L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar13 and calendar89", (calendar13.compareTo(calendar89) == 0) == calendar13.equals(calendar89));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 2);
        java.util.Locale locale6 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale7 = locale6.stripExtensions();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone0, locale7);
        calendar8.set(122, 52, (int) (byte) 1);
        java.lang.String str13 = calendar8.getCalendarType();
        calendar8.set(32, 9, 100, (int) (byte) 100, 100, 32769);
        int int22 = calendar8.getActualMaximum(12);
        int int23 = calendar8.getWeekYear();
        java.util.TimeZone timeZone24 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone25 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone26 = java.util.TimeZone.getDefault();
        boolean boolean27 = timeZone25.hasSameRules(timeZone26);
        boolean boolean28 = timeZone24.hasSameRules(timeZone25);
        boolean boolean29 = timeZone25.observesDaylightTime();
        timeZone25.setRawOffset(52);
        java.lang.String str32 = timeZone25.getID();
        java.util.TimeZone timeZone33 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone34 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone35 = java.util.TimeZone.getDefault();
        boolean boolean36 = timeZone34.hasSameRules(timeZone35);
        boolean boolean37 = timeZone33.hasSameRules(timeZone34);
        java.util.Calendar calendar38 = java.util.Calendar.getInstance(timeZone34);
        timeZone34.setID("java.text.AttributedCharacterIterator$Attribute(input_method_segment)");
        java.util.Locale locale41 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar42 = java.util.Calendar.getInstance(timeZone34, locale41);
        java.util.TimeZone.setDefault(timeZone34);
        java.util.TimeZone.setDefault(timeZone34);
        java.util.Calendar calendar45 = java.util.Calendar.getInstance(timeZone34);
        boolean boolean46 = timeZone25.hasSameRules(timeZone34);
        boolean boolean47 = timeZone25.observesDaylightTime();
        calendar8.setTimeZone(timeZone25);
        calendar8.set((int) (byte) -1, 4, 1200000, 35, 22, 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar38 and calendar42", (calendar38.compareTo(calendar42) == 0) == calendar38.equals(calendar42));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
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
        java.time.ZoneId zoneId12 = timeZone7.toZoneId();
        java.util.TimeZone timeZone13 = java.util.TimeZone.getTimeZone(zoneId12);
        java.util.TimeZone timeZone15 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone15);
        java.lang.String str17 = fastDateFormat16.getPattern();
        java.text.ParsePosition parsePosition20 = new java.text.ParsePosition(16);
        parsePosition20.setIndex(11);
        java.lang.Object obj23 = fastDateFormat16.parseObject("FastDateFormat[]", parsePosition20);
        java.util.TimeZone timeZone24 = fastDateFormat16.getTimeZone();
        java.lang.String str25 = timeZone24.getID();
        java.util.Locale locale27 = new java.util.Locale("zh");
        java.lang.String str28 = locale27.getISO3Country();
        java.util.Calendar calendar29 = java.util.Calendar.getInstance(timeZone24, locale27);
        boolean boolean30 = timeZone13.hasSameRules(timeZone24);
        java.util.Calendar calendar31 = java.util.Calendar.getInstance(timeZone24);
        int int33 = timeZone24.getOffset(1645455079188L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar29 and calendar31", (calendar29.compareTo(calendar31) == 0) == calendar29.equals(calendar31));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone1);
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(timeZone1);
        timeZone1.setID("java.text.AttributedCharacterIterator$Attribute(input_method_segment)");
        java.util.TimeZone timeZone10 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str11 = timeZone10.getID();
        java.util.TimeZone.setDefault(timeZone10);
        java.util.Calendar calendar13 = java.util.Calendar.getInstance(timeZone10);
        int int14 = calendar13.getFirstDayOfWeek();
        java.util.TimeZone timeZone15 = java.util.TimeZone.getDefault();
        int int17 = timeZone15.getOffset((long) 2);
        java.util.Locale locale21 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale22 = locale21.stripExtensions();
        java.util.Calendar calendar23 = java.util.Calendar.getInstance(timeZone15, locale22);
        calendar13.setTimeZone(timeZone15);
        java.lang.String str25 = timeZone15.getID();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, timeZone15);
        boolean boolean27 = timeZone1.hasSameRules(timeZone15);
        java.util.TimeZone.setDefault(timeZone1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar5 and calendar13", (calendar5.compareTo(calendar13) == 0) == calendar5.equals(calendar13));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        boolean boolean3 = timeZone1.hasSameRules(timeZone2);
        boolean boolean4 = timeZone0.hasSameRules(timeZone1);
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(timeZone1);
        timeZone1.setID("java.text.AttributedCharacterIterator$Attribute(input_method_segment)");
        java.util.TimeZone timeZone10 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str11 = timeZone10.getID();
        java.util.TimeZone.setDefault(timeZone10);
        java.util.Calendar calendar13 = java.util.Calendar.getInstance(timeZone10);
        int int14 = calendar13.getFirstDayOfWeek();
        java.util.TimeZone timeZone15 = java.util.TimeZone.getDefault();
        int int17 = timeZone15.getOffset((long) 2);
        java.util.Locale locale21 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale22 = locale21.stripExtensions();
        java.util.Calendar calendar23 = java.util.Calendar.getInstance(timeZone15, locale22);
        calendar13.setTimeZone(timeZone15);
        java.lang.String str25 = timeZone15.getID();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, timeZone15);
        boolean boolean27 = timeZone1.hasSameRules(timeZone15);
        java.lang.Object obj28 = timeZone15.clone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar5 and calendar13", (calendar5.compareTo(calendar13) == 0) == calendar5.equals(calendar13));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setLenient(false);
        java.util.Calendar.Builder builder6 = builder0.setTimeOfDay(55, 20, 32772);
        java.util.Calendar.Builder builder10 = builder6.setTimeOfDay(1969, 25, (int) (short) 100);
        java.util.Calendar.Builder builder11 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder15 = builder11.setWeekDate(5, (int) (byte) -1, 1);
        java.util.Calendar.Builder builder17 = builder15.setLenient(true);
        java.util.Calendar.Builder builder21 = builder17.setTimeOfDay(122, 11, 10);
        java.util.Calendar.Builder builder25 = builder21.setWeekDate(100, 9, 2);
        java.util.Calendar.Builder builder29 = builder25.setTimeOfDay(52, (int) (short) 10, (-1));
        java.util.Calendar.Builder builder31 = builder29.setLenient(true);
        java.util.Calendar.Builder builder34 = builder29.set(2, 54);
        java.util.TimeZone timeZone36 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone37 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone38 = java.util.TimeZone.getDefault();
        boolean boolean39 = timeZone37.hasSameRules(timeZone38);
        boolean boolean40 = timeZone36.hasSameRules(timeZone37);
        java.util.TimeZone timeZone42 = java.util.TimeZone.getTimeZone("h:mm:ss a z");
        java.lang.String str43 = timeZone42.getID();
        boolean boolean44 = timeZone37.hasSameRules(timeZone42);
        java.util.Locale locale45 = java.util.Locale.FRANCE;
        boolean boolean46 = locale45.hasExtensions();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone42, locale45);
        java.util.Calendar.Builder builder48 = builder29.setTimeZone(timeZone42);
        java.util.Calendar.Builder builder49 = builder10.setTimeZone(timeZone42);
        boolean boolean50 = timeZone42.observesDaylightTime();
        java.util.TimeZone timeZone52 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat53 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone52);
        java.lang.String str54 = fastDateFormat53.getPattern();
        java.text.ParsePosition parsePosition57 = new java.text.ParsePosition(16);
        parsePosition57.setIndex(11);
        java.lang.Object obj60 = fastDateFormat53.parseObject("FastDateFormat[]", parsePosition57);
        java.util.TimeZone timeZone61 = fastDateFormat53.getTimeZone();
        boolean boolean62 = timeZone42.hasSameRules(timeZone61);
        java.util.TimeZone.setDefault(timeZone42);
        java.util.Calendar calendar64 = java.util.Calendar.getInstance(timeZone42);
        java.util.Locale locale65 = java.util.Locale.US;
        java.lang.String str66 = locale65.getDisplayName();
        java.lang.String str67 = locale65.getLanguage();
        java.util.Calendar calendar68 = java.util.Calendar.getInstance(timeZone42, locale65);
        java.util.Locale locale69 = locale65.stripExtensions();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar64 and calendar68", (calendar64.compareTo(calendar68) == 0) == calendar64.equals(calendar68));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        java.util.Locale locale1 = java.util.Locale.KOREA;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, locale1);
        java.util.TimeZone timeZone4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone4);
        java.lang.String str6 = fastDateFormat5.getPattern();
        java.util.Date date7 = new java.util.Date();
        int int8 = date7.getSeconds();
        java.lang.String str9 = fastDateFormat5.format(date7);
        java.lang.String str10 = date7.toGMTString();
        int int11 = date7.getHours();
        int int12 = date7.getTimezoneOffset();
        java.lang.String str13 = fastDateFormat2.format(date7);
        java.lang.String str15 = fastDateFormat2.format(1645454831176L);
        java.util.Date date21 = new java.util.Date(3, (int) (short) 0, 6, 0, (int) (short) 1);
        java.util.Date date22 = new java.util.Date();
        int int23 = date22.getTimezoneOffset();
        long long24 = date22.getTime();
        boolean boolean25 = date21.after(date22);
        long long26 = date22.getTime();
        java.lang.String str27 = fastDateFormat2.format(date22);
        java.util.TimeZone timeZone28 = java.util.TimeZone.getDefault();
        timeZone28.setID("\uc624\ud6c4\uc2dc\ubd84\ucd08 GMT");
        java.util.Calendar calendar31 = java.util.Calendar.getInstance(timeZone28);
        boolean boolean32 = timeZone28.observesDaylightTime();
        boolean boolean33 = fastDateFormat2.equals((java.lang.Object) timeZone28);
        java.util.Calendar.Builder builder34 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder38 = builder34.setTimeOfDay(16, (int) ' ', 16);
        java.util.Locale.Builder builder39 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder42 = builder39.setExtension('a', "France");
        java.util.Locale.Builder builder44 = builder39.removeUnicodeLocaleAttribute("GMT");
        java.util.Locale locale45 = java.util.Locale.FRANCE;
        java.lang.String str46 = locale45.getVariant();
        java.lang.String str47 = locale45.getDisplayCountry();
        java.util.Locale.Builder builder48 = builder39.setLocale(locale45);
        java.util.Locale locale50 = new java.util.Locale("zh");
        java.lang.String str51 = locale45.getDisplayName(locale50);
        java.util.Calendar.Builder builder52 = builder34.setLocale(locale45);
        java.lang.String str53 = locale45.toLanguageTag();
        java.util.Calendar calendar54 = java.util.Calendar.getInstance(timeZone28, locale45);
        java.lang.Object obj55 = timeZone28.clone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar31 and calendar54", (calendar31.compareTo(calendar54) == 0) == calendar31.equals(calendar54));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 2);
        java.util.Locale locale6 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale7 = locale6.stripExtensions();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone0, locale7);
        boolean boolean9 = timeZone0.observesDaylightTime();
        boolean boolean10 = timeZone0.observesDaylightTime();
        java.util.Calendar calendar11 = java.util.Calendar.getInstance(timeZone0);
        int int12 = timeZone0.getRawOffset();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar8 and calendar11", (calendar8.compareTo(calendar11) == 0) == calendar8.equals(calendar11));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        java.util.Date date4 = new java.util.Date();
        int int5 = date4.getSeconds();
        java.lang.String str6 = fastDateFormat2.format(date4);
        java.util.TimeZone timeZone8 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone9 = java.util.TimeZone.getDefault();
        boolean boolean10 = timeZone8.hasSameRules(timeZone9);
        java.util.Locale locale14 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale15 = locale14.stripExtensions();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone8, locale14);
        java.util.TimeZone timeZone17 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone18 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone19 = java.util.TimeZone.getDefault();
        boolean boolean20 = timeZone18.hasSameRules(timeZone19);
        boolean boolean21 = timeZone17.hasSameRules(timeZone18);
        boolean boolean22 = timeZone18.observesDaylightTime();
        timeZone18.setRawOffset(52);
        timeZone18.setID("Temps universel coordonn\351");
        java.util.Locale locale28 = new java.util.Locale("zh");
        java.util.Locale locale29 = java.util.Locale.CHINESE;
        java.lang.String str30 = locale29.getLanguage();
        boolean boolean31 = locale29.hasExtensions();
        java.lang.String str32 = locale29.getDisplayCountry();
        java.lang.String str33 = locale28.getDisplayName(locale29);
        java.util.Calendar calendar34 = java.util.Calendar.getInstance(timeZone18, locale28);
        java.lang.String str35 = fastDateFormat16.format(calendar34);
        calendar34.set((int) (short) 0, 0, 58);
        java.util.TimeZone timeZone40 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone41 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone42 = java.util.TimeZone.getDefault();
        boolean boolean43 = timeZone41.hasSameRules(timeZone42);
        boolean boolean44 = timeZone40.hasSameRules(timeZone41);
        boolean boolean45 = timeZone41.observesDaylightTime();
        java.util.TimeZone timeZone46 = java.util.TimeZone.getDefault();
        int int48 = timeZone46.getOffset((long) 2);
        java.util.Locale locale52 = new java.util.Locale("", "hi!", "");
        java.util.Locale locale53 = locale52.stripExtensions();
        java.util.Calendar calendar54 = java.util.Calendar.getInstance(timeZone46, locale53);
        boolean boolean55 = timeZone41.hasSameRules(timeZone46);
        java.util.Calendar calendar56 = java.util.Calendar.getInstance(timeZone46);
        java.util.TimeZone timeZone60 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat61 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone60);
        java.lang.String str62 = fastDateFormat61.getPattern();
        java.text.ParsePosition parsePosition65 = new java.text.ParsePosition(16);
        parsePosition65.setIndex(11);
        java.lang.Object obj68 = fastDateFormat61.parseObject("FastDateFormat[]", parsePosition65);
        boolean boolean69 = fastDateFormat61.getTimeZoneOverridesCalendar();
        java.text.AttributedCharacterIterator attributedCharacterIterator71 = fastDateFormat61.formatToCharacterIterator((java.lang.Object) 1645454754924L);
        java.util.Locale locale72 = fastDateFormat61.getLocale();
        java.util.Map<java.lang.String, java.lang.Integer> strMap73 = calendar56.getDisplayNames(2, 0, locale72);
        boolean boolean74 = calendar34.after((java.lang.Object) locale72);
        java.util.Date date75 = calendar34.getTime();
        java.lang.String str76 = fastDateFormat2.format(calendar34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar54 and calendar56", (calendar54.compareTo(calendar56) == 0) == calendar54.equals(calendar56));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone1);
        java.lang.String str4 = fastDateFormat2.format((long) '#');
        boolean boolean5 = fastDateFormat2.getTimeZoneOverridesCalendar();
        java.lang.String str7 = fastDateFormat2.format(100L);
        java.lang.String str9 = fastDateFormat2.format((long) 8);
        java.util.Locale locale10 = fastDateFormat2.getLocale();
        java.util.Locale locale11 = java.util.Locale.US;
        java.lang.String str12 = locale11.getDisplayVariant();
        java.util.Locale locale13 = java.util.Locale.FRANCE;
        boolean boolean14 = locale13.hasExtensions();
        java.util.Locale locale15 = java.util.Locale.ROOT;
        java.lang.String str16 = locale13.getDisplayName(locale15);
        java.lang.String str17 = locale15.getCountry();
        java.lang.String str18 = locale11.getDisplayVariant(locale15);
        java.util.Calendar calendar19 = java.util.Calendar.getInstance(locale15);
        calendar19.setMinimalDaysInFirstWeek(9);
        calendar19.clear(0);
        boolean boolean24 = fastDateFormat2.equals((java.lang.Object) 0);
        java.util.TimeZone timeZone25 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone26 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone27 = java.util.TimeZone.getDefault();
        boolean boolean28 = timeZone26.hasSameRules(timeZone27);
        boolean boolean29 = timeZone25.hasSameRules(timeZone26);
        boolean boolean30 = timeZone26.observesDaylightTime();
        timeZone26.setRawOffset(52);
        java.util.Locale locale33 = java.util.Locale.CHINESE;
        java.lang.String str34 = locale33.getLanguage();
        java.util.Calendar calendar35 = java.util.Calendar.getInstance(timeZone26, locale33);
        java.lang.String str36 = fastDateFormat2.format(calendar35);
        int int37 = fastDateFormat2.getMaxLengthEstimate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar19 and calendar35", (calendar19.compareTo(calendar35) == 0) == calendar19.equals(calendar35));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
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
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(timeZone6);
        java.util.TimeZone timeZone18 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone19 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone20 = java.util.TimeZone.getDefault();
        boolean boolean21 = timeZone19.hasSameRules(timeZone20);
        boolean boolean22 = timeZone18.hasSameRules(timeZone19);
        timeZone19.setID("Mon Feb 21 14:45:50 GMT 2022");
        boolean boolean25 = timeZone6.hasSameRules(timeZone19);
        boolean boolean26 = timeZone19.observesDaylightTime();
        java.util.Locale locale28 = new java.util.Locale("21 Feb 2022 14:46:12 GMT");
        java.lang.String str29 = locale28.getDisplayCountry();
        java.util.Locale.Category category30 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale31 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(category30, locale31);
        java.util.Locale locale33 = java.util.Locale.KOREA;
        java.lang.String str34 = locale33.getScript();
        java.util.Locale locale35 = java.util.Locale.FRANCE;
        java.lang.String str36 = locale33.getDisplayVariant(locale35);
        java.util.Locale.setDefault(category30, locale33);
        java.util.Locale locale38 = java.util.Locale.ROOT;
        java.util.Locale.Builder builder39 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder42 = builder39.setExtension('a', "France");
        java.util.Locale.Builder builder44 = builder39.removeUnicodeLocaleAttribute("GMT");
        java.util.Locale locale45 = java.util.Locale.FRANCE;
        java.lang.String str46 = locale45.getVariant();
        java.lang.String str47 = locale45.getDisplayCountry();
        java.util.Locale.Builder builder48 = builder39.setLocale(locale45);
        java.util.Locale locale50 = new java.util.Locale("zh");
        java.lang.String str51 = locale45.getDisplayName(locale50);
        java.lang.String str52 = locale38.getDisplayName(locale45);
        java.lang.String str53 = locale38.getDisplayScript();
        java.util.Locale locale54 = locale38.stripExtensions();
        java.util.Locale.setDefault(category30, locale38);
        java.util.Locale locale56 = java.util.Locale.CHINESE;
        java.lang.String str57 = locale56.getLanguage();
        boolean boolean58 = locale56.hasExtensions();
        java.lang.String str59 = locale56.getDisplayCountry();
        java.lang.String str60 = locale56.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet61 = locale56.getUnicodeLocaleKeys();
        java.lang.String str62 = locale56.getCountry();
        java.util.Locale.setDefault(category30, locale56);
        java.util.Locale locale64 = java.util.Locale.CHINA;
        boolean boolean65 = locale64.hasExtensions();
        java.lang.String str66 = locale64.getDisplayVariant();
        java.lang.String str67 = locale64.getCountry();
        java.lang.String str68 = locale56.getDisplayScript(locale64);
        java.lang.String str69 = locale28.getDisplayLanguage(locale56);
        java.lang.String str70 = locale28.getVariant();
        java.util.Calendar calendar71 = java.util.Calendar.getInstance(timeZone19, locale28);
        java.lang.String str72 = timeZone19.getID();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar4 and calendar71", (calendar4.compareTo(calendar71) == 0) == calendar4.equals(calendar71));
    }
}

