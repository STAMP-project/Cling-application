import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest33 {

    public static boolean debug = false;

    @Test
    public void test16501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16501");
        java.text.NumberFormat.Field field0 = java.text.NumberFormat.Field.PERMILLE;
        java.text.FieldPosition fieldPosition2 = new java.text.FieldPosition((java.text.Format.Field) field0, (int) (short) 0);
        java.lang.String str3 = fieldPosition2.toString();
        java.lang.String str4 = fieldPosition2.toString();
        fieldPosition2.setBeginIndex((int) (byte) 10);
        java.util.Locale locale7 = java.util.Locale.FRENCH;
        java.lang.String str8 = locale7.getDisplayLanguage();
        boolean boolean9 = fieldPosition2.equals((java.lang.Object) str8);
        boolean boolean11 = fieldPosition2.equals((java.lang.Object) (short) -1);
        fieldPosition2.setBeginIndex((-117));
        int int14 = fieldPosition2.getEndIndex();
        java.text.Format.Field field15 = fieldPosition2.getFieldAttribute();
        java.util.Locale locale17 = new java.util.Locale("Franz\366sisch");
        java.util.Locale.Builder builder18 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder19 = builder18.clear();
        java.util.Locale locale20 = java.util.Locale.TAIWAN;
        java.text.NumberFormat numberFormat21 = java.text.NumberFormat.getCurrencyInstance(locale20);
        java.lang.String str22 = locale20.getScript();
        java.util.Locale.Builder builder23 = builder18.setLocale(locale20);
        java.util.Locale.Builder builder25 = builder18.removeUnicodeLocaleAttribute("zho");
        java.util.Locale locale26 = builder18.build();
        java.lang.String str27 = locale17.getDisplayCountry(locale26);
        boolean boolean28 = locale17.hasExtensions();
        boolean boolean29 = field15.equals((java.lang.Object) locale17);
        java.util.Locale locale30 = java.util.Locale.GERMANY;
        java.lang.String str31 = locale30.getDisplayScript();
        java.util.Locale.Category category32 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale33 = java.util.Locale.KOREAN;
        java.util.Locale locale34 = java.util.Locale.KOREAN;
        java.lang.String str35 = locale33.getDisplayLanguage(locale34);
        java.lang.String str36 = locale34.getScript();
        java.lang.String str37 = locale34.getVariant();
        java.util.Locale.setDefault(category32, locale34);
        java.util.Locale locale39 = java.util.Locale.CHINESE;
        org.apache.commons.math.fraction.FractionFormat fractionFormat40 = org.apache.commons.math.fraction.FractionFormat.getImproperInstance(locale39);
        java.lang.String str41 = locale39.getDisplayScript();
        java.util.Locale.setDefault(category32, locale39);
        java.lang.String str43 = locale30.getDisplayCountry(locale39);
        java.text.NumberFormat numberFormat44 = java.text.NumberFormat.getNumberInstance(locale30);
        java.util.Locale locale45 = java.util.Locale.PRC;
        java.util.Set<java.lang.String> strSet46 = locale45.getUnicodeLocaleAttributes();
        java.lang.String str47 = locale30.getDisplayLanguage(locale45);
        boolean boolean48 = field15.equals((java.lang.Object) locale45);
        org.junit.Assert.assertNotNull(field0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.text.FieldPosition[field=0,attribute=java.text.NumberFormat$Field(per mille),beginIndex=0,endIndex=0]" + "'", str3, "java.text.FieldPosition[field=0,attribute=java.text.NumberFormat$Field(per mille),beginIndex=0,endIndex=0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.text.FieldPosition[field=0,attribute=java.text.NumberFormat$Field(per mille),beginIndex=0,endIndex=0]" + "'", str4, "java.text.FieldPosition[field=0,attribute=java.text.NumberFormat$Field(per mille),beginIndex=0,endIndex=0]");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "fran\347ais" + "'", str8, "fran\347ais");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(field15);
        org.junit.Assert.assertEquals(locale17.toString(), "franz\366sisch");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(numberFormat21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + category32 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category32.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "ko");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str35, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "zh");
        org.junit.Assert.assertNotNull(fractionFormat40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\u5fb7\u56fd" + "'", str43, "\u5fb7\u56fd");
        org.junit.Assert.assertNotNull(numberFormat44);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\u5fb7\u6587" + "'", str47, "\u5fb7\u6587");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test16502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16502");
        java.text.NumberFormat numberFormat0 = java.text.NumberFormat.getIntegerInstance();
        java.text.NumberFormat numberFormat1 = java.text.NumberFormat.getPercentInstance();
        numberFormat1.setMaximumIntegerDigits((-1));
        java.text.NumberFormat numberFormat4 = java.text.NumberFormat.getPercentInstance();
        java.text.NumberFormat numberFormat5 = java.text.NumberFormat.getPercentInstance();
        numberFormat5.setMaximumIntegerDigits((-1));
        java.util.Currency currency8 = numberFormat5.getCurrency();
        numberFormat4.setCurrency(currency8);
        numberFormat1.setCurrency(currency8);
        java.text.NumberFormat numberFormat11 = java.text.NumberFormat.getPercentInstance();
        numberFormat11.setMaximumIntegerDigits((-1));
        java.util.Currency currency14 = numberFormat11.getCurrency();
        java.lang.String str16 = numberFormat11.format((double) 10);
        org.apache.commons.math.fraction.ProperFractionFormat properFractionFormat17 = new org.apache.commons.math.fraction.ProperFractionFormat(numberFormat0, numberFormat1, numberFormat11);
        java.text.NumberFormat numberFormat19 = java.text.NumberFormat.getInstance();
        java.lang.String str21 = numberFormat19.format(100L);
        java.text.NumberFormat numberFormat23 = java.text.NumberFormat.getPercentInstance();
        java.text.ParsePosition parsePosition26 = new java.text.ParsePosition((int) (short) 10);
        java.lang.Object obj27 = numberFormat23.parseObject("hi!", parsePosition26);
        java.lang.Number number28 = numberFormat19.parse("10,000%", parsePosition26);
        int int29 = parsePosition26.getErrorIndex();
        int int30 = parsePosition26.getIndex();
        org.apache.commons.math.fraction.Fraction fraction31 = properFractionFormat17.parse("French", parsePosition26);
        java.text.NumberFormat numberFormat33 = java.text.NumberFormat.getCurrencyInstance();
        java.text.NumberFormat numberFormat34 = java.text.NumberFormat.getPercentInstance();
        java.text.NumberFormat numberFormat35 = java.text.NumberFormat.getPercentInstance();
        numberFormat35.setMaximumIntegerDigits((-1));
        java.util.Currency currency38 = numberFormat35.getCurrency();
        numberFormat34.setCurrency(currency38);
        java.lang.String str41 = numberFormat34.format((double) 100);
        org.apache.commons.math.fraction.FractionFormat fractionFormat42 = org.apache.commons.math.fraction.FractionFormat.getImproperInstance();
        java.text.NumberFormat numberFormat43 = fractionFormat42.getNumeratorFormat();
        org.apache.commons.math.fraction.ProperFractionFormat properFractionFormat44 = new org.apache.commons.math.fraction.ProperFractionFormat(numberFormat33, numberFormat34, numberFormat43);
        java.text.NumberFormat numberFormat46 = java.text.NumberFormat.getPercentInstance();
        java.text.ParsePosition parsePosition49 = new java.text.ParsePosition((int) (short) 10);
        java.lang.Object obj50 = numberFormat46.parseObject("hi!", parsePosition49);
        java.lang.String str51 = parsePosition49.toString();
        org.apache.commons.math.fraction.Fraction fraction52 = properFractionFormat44.parse("\244 32.00", parsePosition49);
        org.apache.commons.math.fraction.Fraction fraction53 = properFractionFormat17.parse("\uc911\uad6d\uc5b4", parsePosition49);
        org.apache.commons.math.fraction.FractionFormat fractionFormat54 = org.apache.commons.math.fraction.FractionFormat.getImproperInstance();
        java.text.NumberFormat numberFormat55 = fractionFormat54.getNumeratorFormat();
        java.text.NumberFormat numberFormat56 = fractionFormat54.getNumeratorFormat();
        java.lang.String str58 = numberFormat56.format((double) 1.0f);
        properFractionFormat17.setWholeFormat(numberFormat56);
        java.text.NumberFormat numberFormat60 = java.text.NumberFormat.getCurrencyInstance();
        java.util.Currency currency61 = numberFormat60.getCurrency();
        boolean boolean62 = numberFormat60.isParseIntegerOnly();
        properFractionFormat17.setWholeFormat(numberFormat60);
        java.util.Currency currency64 = numberFormat60.getCurrency();
        java.lang.String str66 = numberFormat60.format((long) 5);
        numberFormat60.setMaximumFractionDigits(7561);
        org.junit.Assert.assertNotNull(numberFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(numberFormat5);
        org.junit.Assert.assertNotNull(currency8);
// flaky:         org.junit.Assert.assertEquals(currency8.toString(), "XXX");
        org.junit.Assert.assertNotNull(numberFormat11);
        org.junit.Assert.assertNotNull(currency14);
// flaky:         org.junit.Assert.assertEquals(currency14.toString(), "XXX");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0%" + "'", str16, "0%");
        org.junit.Assert.assertNotNull(numberFormat19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "100" + "'", str21, "100");
        org.junit.Assert.assertNotNull(numberFormat23);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(number28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertNull(fraction31);
        org.junit.Assert.assertNotNull(numberFormat33);
        org.junit.Assert.assertNotNull(numberFormat34);
        org.junit.Assert.assertNotNull(numberFormat35);
        org.junit.Assert.assertNotNull(currency38);
// flaky:         org.junit.Assert.assertEquals(currency38.toString(), "XXX");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "10,000%" + "'", str41, "10,000%");
        org.junit.Assert.assertNotNull(fractionFormat42);
        org.junit.Assert.assertNotNull(numberFormat43);
        org.junit.Assert.assertNotNull(numberFormat46);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "java.text.ParsePosition[index=10,errorIndex=10]" + "'", str51, "java.text.ParsePosition[index=10,errorIndex=10]");
        org.junit.Assert.assertNull(fraction52);
        org.junit.Assert.assertNull(fraction53);
        org.junit.Assert.assertNotNull(fractionFormat54);
        org.junit.Assert.assertNotNull(numberFormat55);
        org.junit.Assert.assertNotNull(numberFormat56);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "1" + "'", str58, "1");
        org.junit.Assert.assertNotNull(numberFormat60);
        org.junit.Assert.assertNotNull(currency61);
// flaky:         org.junit.Assert.assertEquals(currency61.toString(), "XXX");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(currency64);
// flaky:         org.junit.Assert.assertEquals(currency64.toString(), "XXX");
// flaky:         org.junit.Assert.assertEquals("'" + str66 + "' != '" + "\244 5.00" + "'", str66, "\244 5.00");
    }

    @Test
    public void test16503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16503");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder2.clearExtensions();
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale locale7 = java.util.Locale.CANADA;
        java.lang.String str8 = locale7.getVariant();
        java.lang.String str9 = locale7.getDisplayVariant();
        java.util.Locale.Builder builder10 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder11 = builder10.clear();
        java.util.Locale.Builder builder13 = builder10.setVariant("");
        java.util.Locale.Builder builder15 = builder13.setVariant("Canada");
        java.util.Locale locale16 = builder15.build();
        java.util.Set<java.lang.String> strSet17 = locale16.getUnicodeLocaleAttributes();
        java.lang.String str18 = locale7.getDisplayName(locale16);
        java.lang.String str19 = locale7.getDisplayScript();
        java.util.Locale.Builder builder20 = builder6.setLocale(locale7);
        java.util.Locale.Builder builder21 = builder6.clear();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "English (Canada)" + "'", str18, "English (Canada)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test16504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16504");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.ONE;
        org.apache.commons.math.fraction.Fraction fraction3 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) 'u', (int) (byte) -1);
        java.lang.String str4 = org.apache.commons.math.fraction.FractionFormat.formatFraction(fraction3);
        org.apache.commons.math.fraction.Fraction fraction5 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction8 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) 'u', (int) (byte) -1);
        int int9 = fraction8.intValue();
        org.apache.commons.math.fraction.Fraction fraction10 = fraction5.subtract(fraction8);
        org.apache.commons.math.fraction.Fraction fraction11 = fraction3.add(fraction5);
        org.apache.commons.math.fraction.Fraction fraction12 = fraction3.abs();
        org.apache.commons.math.fraction.Fraction fraction13 = fraction0.subtract(fraction12);
        org.apache.commons.math.fraction.Fraction fraction14 = fraction0.abs();
        double double15 = fraction0.doubleValue();
        float float16 = fraction0.floatValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-117 / 1" + "'", str4, "-117 / 1");
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-117) + "'", int9 == (-117));
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
    }

    @Test
    public void test16505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16505");
        java.text.NumberFormat numberFormat0 = java.text.NumberFormat.getPercentInstance();
        numberFormat0.setMaximumIntegerDigits((-1));
        java.util.Currency currency3 = numberFormat0.getCurrency();
        java.lang.String str5 = numberFormat0.format((double) 10);
        java.util.Locale locale6 = java.util.Locale.KOREAN;
        java.util.Locale locale7 = java.util.Locale.KOREAN;
        java.lang.String str8 = locale6.getDisplayLanguage(locale7);
        java.lang.String str9 = locale7.getScript();
        java.text.NumberFormat numberFormat10 = java.text.NumberFormat.getInstance(locale7);
        java.text.NumberFormat numberFormat11 = java.text.NumberFormat.getCurrencyInstance();
        java.text.NumberFormat numberFormat12 = java.text.NumberFormat.getPercentInstance();
        numberFormat12.setMaximumIntegerDigits((-1));
        java.text.NumberFormat numberFormat15 = java.text.NumberFormat.getPercentInstance();
        java.text.NumberFormat numberFormat16 = java.text.NumberFormat.getPercentInstance();
        numberFormat16.setMaximumIntegerDigits((-1));
        java.util.Currency currency19 = numberFormat16.getCurrency();
        numberFormat15.setCurrency(currency19);
        numberFormat12.setCurrency(currency19);
        org.apache.commons.math.fraction.FractionFormat fractionFormat22 = new org.apache.commons.math.fraction.FractionFormat(numberFormat11, numberFormat12);
        java.text.NumberFormat numberFormat23 = java.text.NumberFormat.getPercentInstance();
        numberFormat23.setMaximumIntegerDigits((-1));
        numberFormat23.setMinimumIntegerDigits(0);
        java.text.NumberFormat numberFormat28 = java.text.NumberFormat.getIntegerInstance();
        boolean boolean29 = numberFormat28.isGroupingUsed();
        numberFormat28.setParseIntegerOnly(false);
        java.lang.Number number33 = numberFormat28.parse("0%");
        org.apache.commons.math.fraction.ProperFractionFormat properFractionFormat34 = new org.apache.commons.math.fraction.ProperFractionFormat(numberFormat12, numberFormat23, numberFormat28);
        java.text.NumberFormat numberFormat35 = properFractionFormat34.getWholeFormat();
        java.lang.Object obj36 = numberFormat35.clone();
        java.lang.Object obj37 = numberFormat35.clone();
        boolean boolean38 = numberFormat10.equals((java.lang.Object) numberFormat35);
        boolean boolean39 = numberFormat10.isGroupingUsed();
        boolean boolean40 = numberFormat0.equals((java.lang.Object) numberFormat10);
        org.apache.commons.math.fraction.ProperFractionFormat properFractionFormat41 = new org.apache.commons.math.fraction.ProperFractionFormat(numberFormat0);
        java.lang.Object obj42 = numberFormat0.clone();
        org.junit.Assert.assertNotNull(numberFormat0);
        org.junit.Assert.assertNotNull(currency3);
// flaky:         org.junit.Assert.assertEquals(currency3.toString(), "XXX");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0%" + "'", str5, "0%");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str8, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertNotNull(numberFormat11);
        org.junit.Assert.assertNotNull(numberFormat12);
        org.junit.Assert.assertNotNull(numberFormat15);
        org.junit.Assert.assertNotNull(numberFormat16);
        org.junit.Assert.assertNotNull(currency19);
// flaky:         org.junit.Assert.assertEquals(currency19.toString(), "XXX");
        org.junit.Assert.assertNotNull(numberFormat23);
        org.junit.Assert.assertNotNull(numberFormat28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + number33 + "' != '" + 0L + "'", number33, 0L);
        org.junit.Assert.assertNotNull(numberFormat35);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(obj42);
    }

    @Test
    public void test16506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16506");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) (short) -13689, (-4212));
    }

    @Test
    public void test16507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16507");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.text.NumberFormat numberFormat3 = java.text.NumberFormat.getCurrencyInstance(locale2);
        java.lang.String str4 = locale2.getScript();
        java.util.Locale.Builder builder5 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder7 = builder0.removeUnicodeLocaleAttribute("zho");
        java.util.Locale.Builder builder9 = builder7.removeUnicodeLocaleAttribute("china");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.setLanguage("java.text.ParseException: kor");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: java.text.ParseException: kor [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(numberFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test16508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16508");
        java.text.ParseException parseException2 = new java.text.ParseException("francese", (int) 'a');
        java.text.ParseException parseException5 = new java.text.ParseException("java.text.FieldPosition[field=0,attribute=java.text.NumberFormat$Field(per mille),beginIndex=0,endIndex=0]", 0);
        java.lang.Throwable[] throwableArray6 = parseException5.getSuppressed();
        java.text.ParseException parseException9 = new java.text.ParseException("java.text.FieldPosition[field=0,attribute=java.text.NumberFormat$Field(per mille),beginIndex=0,endIndex=0]", 0);
        java.lang.Throwable[] throwableArray10 = parseException9.getSuppressed();
        parseException5.addSuppressed((java.lang.Throwable) parseException9);
        int int12 = parseException9.getErrorOffset();
        int int13 = parseException9.getErrorOffset();
        parseException2.addSuppressed((java.lang.Throwable) parseException9);
        java.text.ParseException parseException17 = new java.text.ParseException("\uc601\uc5b4", 9);
        java.lang.Throwable[] throwableArray18 = parseException17.getSuppressed();
        parseException9.addSuppressed((java.lang.Throwable) parseException17);
        int int20 = parseException17.getErrorOffset();
        java.lang.String str21 = parseException17.toString();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\uc601\uc5b4" + "'", str21, "\uc601\uc5b4");
    }

    @Test
    public void test16509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16509");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder6 = builder4.setLanguageTag("anglais");
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale locale8 = java.util.Locale.CANADA;
        java.lang.String str9 = locale8.getDisplayCountry();
        java.text.NumberFormat numberFormat10 = java.text.NumberFormat.getCurrencyInstance(locale8);
        java.lang.String str11 = locale8.getDisplayVariant();
        java.util.Locale locale12 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale13 = java.util.Locale.CANADA;
        java.lang.String str14 = locale13.getDisplayCountry();
        java.lang.String str15 = locale12.getDisplayCountry(locale13);
        java.util.Locale locale17 = new java.util.Locale("\uce90\ub098\ub2e4");
        java.util.Locale.setDefault(locale17);
        java.lang.String str19 = locale13.getDisplayScript(locale17);
        java.lang.String str20 = locale8.getDisplayLanguage(locale17);
        java.util.Locale.Builder builder21 = builder7.setLocale(locale8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder24 = builder21.setUnicodeLocaleKeyword("java.text.ParsePosition[index=9,errorIndex=52]", "\2440.00");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: java.text.ParsePosition[index=9,errorIndex=52] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u52a0\u62ff\u5927" + "'", str9, "\u52a0\u62ff\u5927");
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u52a0\u62ff\u5927" + "'", str14, "\u52a0\u62ff\u5927");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "China" + "'", str15, "China");
        org.junit.Assert.assertEquals(locale17.toString(), "\uce90\ub098\ub2e4");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "English" + "'", str20, "English");
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test16510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16510");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction(0, 4095);
        short short3 = fraction2.shortValue();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test16511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16511");
        java.text.NumberFormat.Field field0 = java.text.NumberFormat.Field.PERMILLE;
        java.text.FieldPosition fieldPosition2 = new java.text.FieldPosition((java.text.Format.Field) field0, (int) (short) 0);
        java.lang.String str3 = fieldPosition2.toString();
        int int4 = fieldPosition2.getBeginIndex();
        java.lang.String str5 = fieldPosition2.toString();
        int int6 = fieldPosition2.getEndIndex();
        java.text.Format.Field field7 = fieldPosition2.getFieldAttribute();
        org.junit.Assert.assertNotNull(field0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.text.FieldPosition[field=0,attribute=java.text.NumberFormat$Field(per mille),beginIndex=0,endIndex=0]" + "'", str3, "java.text.FieldPosition[field=0,attribute=java.text.NumberFormat$Field(per mille),beginIndex=0,endIndex=0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.text.FieldPosition[field=0,attribute=java.text.NumberFormat$Field(per mille),beginIndex=0,endIndex=0]" + "'", str5, "java.text.FieldPosition[field=0,attribute=java.text.NumberFormat$Field(per mille),beginIndex=0,endIndex=0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(field7);
    }

    @Test
    public void test16512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16512");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) 'u', (int) (byte) -1);
        org.apache.commons.math.fraction.Fraction fraction3 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction6 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) 'u', (int) (byte) -1);
        int int7 = fraction6.intValue();
        org.apache.commons.math.fraction.Fraction fraction8 = fraction3.subtract(fraction6);
        org.apache.commons.math.fraction.Fraction fraction9 = fraction2.multiply(fraction3);
        org.apache.commons.math.fraction.Fraction fraction11 = new org.apache.commons.math.fraction.Fraction((double) (-1L));
        org.apache.commons.math.fraction.Fraction fraction12 = fraction9.add(fraction11);
        java.lang.String str13 = org.apache.commons.math.fraction.FractionFormat.formatFraction(fraction9);
        org.apache.commons.math.fraction.Fraction fraction16 = new org.apache.commons.math.fraction.Fraction((int) '4', (int) '#');
        org.apache.commons.math.fraction.Fraction fraction19 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) 'u', (int) (byte) -1);
        org.apache.commons.math.fraction.Fraction fraction20 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction23 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) 'u', (int) (byte) -1);
        int int24 = fraction23.intValue();
        org.apache.commons.math.fraction.Fraction fraction25 = fraction20.subtract(fraction23);
        org.apache.commons.math.fraction.Fraction fraction26 = fraction19.multiply(fraction20);
        org.apache.commons.math.fraction.Fraction fraction27 = fraction16.multiply(fraction20);
        org.apache.commons.math.fraction.Fraction fraction28 = fraction9.add(fraction16);
        java.text.NumberFormat.Field field29 = java.text.NumberFormat.Field.PERMILLE;
        java.text.FieldPosition fieldPosition31 = new java.text.FieldPosition((java.text.Format.Field) field29, (int) (short) 0);
        int int32 = fieldPosition31.getEndIndex();
        java.lang.String str33 = fieldPosition31.toString();
        org.apache.commons.math.fraction.Fraction fraction34 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction37 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) 'u', (int) (byte) -1);
        int int38 = fraction37.intValue();
        org.apache.commons.math.fraction.Fraction fraction39 = fraction34.subtract(fraction37);
        boolean boolean41 = fraction37.equals((java.lang.Object) 'x');
        org.apache.commons.math.fraction.Fraction fraction42 = fraction37.reciprocal();
        double double43 = fraction42.doubleValue();
        boolean boolean44 = fieldPosition31.equals((java.lang.Object) fraction42);
        org.apache.commons.math.fraction.Fraction fraction45 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction48 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) 'u', (int) (byte) -1);
        int int49 = fraction48.intValue();
        org.apache.commons.math.fraction.Fraction fraction50 = fraction45.subtract(fraction48);
        boolean boolean52 = fraction48.equals((java.lang.Object) 'x');
        org.apache.commons.math.fraction.Fraction fraction53 = fraction48.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction54 = fraction42.subtract(fraction48);
        org.apache.commons.math.fraction.Fraction fraction55 = fraction48.abs();
        org.apache.commons.math.fraction.Fraction fraction56 = fraction16.divide(fraction55);
        java.util.Locale locale58 = new java.util.Locale("fr");
        java.util.Locale locale59 = locale58.stripExtensions();
        java.lang.String str60 = locale59.getISO3Country();
        boolean boolean61 = fraction16.equals((java.lang.Object) str60);
        org.apache.commons.math.fraction.Fraction fraction62 = org.apache.commons.math.fraction.Fraction.ONE;
        org.apache.commons.math.fraction.Fraction fraction65 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) 'u', (int) (byte) -1);
        java.lang.String str66 = org.apache.commons.math.fraction.FractionFormat.formatFraction(fraction65);
        org.apache.commons.math.fraction.Fraction fraction67 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction70 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) 'u', (int) (byte) -1);
        int int71 = fraction70.intValue();
        org.apache.commons.math.fraction.Fraction fraction72 = fraction67.subtract(fraction70);
        org.apache.commons.math.fraction.Fraction fraction73 = fraction65.add(fraction67);
        int int74 = fraction73.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction77 = new org.apache.commons.math.fraction.Fraction((-1), (int) '#');
        org.apache.commons.math.fraction.Fraction fraction78 = fraction73.multiply(fraction77);
        java.text.NumberFormat numberFormat79 = java.text.NumberFormat.getNumberInstance();
        boolean boolean80 = numberFormat79.isParseIntegerOnly();
        org.apache.commons.math.fraction.FractionFormat fractionFormat81 = new org.apache.commons.math.fraction.FractionFormat(numberFormat79);
        boolean boolean82 = numberFormat79.isParseIntegerOnly();
        boolean boolean83 = fraction77.equals((java.lang.Object) boolean82);
        org.apache.commons.math.fraction.Fraction fraction84 = fraction62.multiply(fraction77);
        long long85 = fraction77.longValue();
        java.text.AttributedCharacterIterator.Attribute attribute86 = java.text.AttributedCharacterIterator.Attribute.LANGUAGE;
        java.util.Locale locale87 = java.util.Locale.TAIWAN;
        java.text.NumberFormat numberFormat88 = java.text.NumberFormat.getCurrencyInstance(locale87);
        boolean boolean89 = attribute86.equals((java.lang.Object) numberFormat88);
        boolean boolean90 = fraction77.equals((java.lang.Object) boolean89);
        int int91 = fraction77.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction92 = fraction16.add(fraction77);
        long long93 = fraction92.longValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-117) + "'", int7 == (-117));
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0 / 1" + "'", str13, "0 / 1");
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-117) + "'", int24 == (-117));
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(field29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "java.text.FieldPosition[field=0,attribute=java.text.NumberFormat$Field(per mille),beginIndex=0,endIndex=0]" + "'", str33, "java.text.FieldPosition[field=0,attribute=java.text.NumberFormat$Field(per mille),beginIndex=0,endIndex=0]");
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-117) + "'", int38 == (-117));
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-0.008547008547008548d) + "'", double43 == (-0.008547008547008548d));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-117) + "'", int49 == (-117));
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertEquals(locale58.toString(), "fr");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertNotNull(fraction65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "-117 / 1" + "'", str66, "-117 / 1");
        org.junit.Assert.assertNotNull(fraction67);
        org.junit.Assert.assertNotNull(fraction70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-117) + "'", int71 == (-117));
        org.junit.Assert.assertNotNull(fraction72);
        org.junit.Assert.assertNotNull(fraction73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertNotNull(fraction78);
        org.junit.Assert.assertNotNull(numberFormat79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(fraction84);
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 0L + "'", long85 == 0L);
        org.junit.Assert.assertNotNull(attribute86);
        org.junit.Assert.assertNotNull(locale87);
        org.junit.Assert.assertEquals(locale87.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(numberFormat88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 35 + "'", int91 == 35);
        org.junit.Assert.assertNotNull(fraction92);
        org.junit.Assert.assertTrue("'" + long93 + "' != '" + 1L + "'", long93 == 1L);
    }

    @Test
    public void test16513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16513");
        java.text.NumberFormat.Field field0 = java.text.NumberFormat.Field.PERCENT;
        java.util.Locale locale1 = java.util.Locale.FRENCH;
        java.lang.String str2 = locale1.getDisplayLanguage();
        org.apache.commons.math.fraction.FractionFormat fractionFormat3 = org.apache.commons.math.fraction.FractionFormat.getProperInstance(locale1);
        java.text.NumberFormat numberFormat4 = fractionFormat3.getNumeratorFormat();
        java.text.ParsePosition parsePosition7 = new java.text.ParsePosition((int) (short) 10);
        parsePosition7.setErrorIndex((int) (byte) 1);
        parsePosition7.setErrorIndex(0);
        org.apache.commons.math.fraction.Fraction fraction12 = fractionFormat3.parse("French", parsePosition7);
        boolean boolean13 = field0.equals((java.lang.Object) "French");
        java.text.FieldPosition fieldPosition15 = new java.text.FieldPosition((java.text.Format.Field) field0, (int) (short) 100);
        org.apache.commons.math.fraction.FractionFormat fractionFormat16 = org.apache.commons.math.fraction.FractionFormat.getImproperInstance();
        java.text.NumberFormat numberFormat17 = fractionFormat16.getNumeratorFormat();
        int int18 = numberFormat17.getMinimumFractionDigits();
        numberFormat17.setParseIntegerOnly(false);
        int int21 = numberFormat17.getMaximumIntegerDigits();
        numberFormat17.setMaximumFractionDigits(100);
        numberFormat17.setMaximumIntegerDigits(0);
        boolean boolean26 = field0.equals((java.lang.Object) 0);
        java.lang.String str27 = field0.toString();
        java.util.Locale.Builder builder28 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder30 = builder28.setVariant("");
        java.util.Locale.Builder builder31 = builder30.clearExtensions();
        java.util.Locale locale32 = builder30.build();
        java.util.Locale locale33 = java.util.Locale.KOREAN;
        java.util.Locale locale34 = java.util.Locale.KOREAN;
        java.util.Locale locale35 = java.util.Locale.KOREAN;
        java.lang.String str36 = locale34.getDisplayLanguage(locale35);
        java.lang.String str37 = locale34.getISO3Language();
        java.lang.String str38 = locale33.getDisplayCountry(locale34);
        java.util.Locale locale39 = java.util.Locale.KOREAN;
        java.util.Locale locale40 = java.util.Locale.KOREAN;
        java.util.Locale locale41 = java.util.Locale.KOREAN;
        java.lang.String str42 = locale40.getDisplayLanguage(locale41);
        java.lang.String str43 = locale40.getISO3Language();
        java.lang.String str44 = locale39.getDisplayCountry(locale40);
        java.util.Locale locale45 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str46 = locale40.getDisplayLanguage(locale45);
        java.lang.String str47 = locale34.getDisplayName(locale45);
        java.util.Locale.Builder builder48 = builder30.setLocale(locale34);
        java.text.NumberFormat numberFormat49 = java.text.NumberFormat.getPercentInstance(locale34);
        boolean boolean50 = field0.equals((java.lang.Object) locale34);
        java.text.NumberFormat numberFormat51 = java.text.NumberFormat.getCurrencyInstance(locale34);
        numberFormat51.setParseIntegerOnly(false);
        org.junit.Assert.assertNotNull(field0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "French" + "'", str2, "French");
        org.junit.Assert.assertNotNull(fractionFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(fraction12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(fractionFormat16);
        org.junit.Assert.assertNotNull(numberFormat17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "java.text.NumberFormat$Field(percent)" + "'", str27, "java.text.NumberFormat$Field(percent)");
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "ko");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "ko");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str36, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "kor" + "'", str37, "kor");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "ko");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "ko");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str42, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "kor" + "'", str43, "kor");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "\u671d\u9c9c\u6587" + "'", str46, "\u671d\u9c9c\u6587");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\u671d\u9c9c\u6587" + "'", str47, "\u671d\u9c9c\u6587");
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(numberFormat49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(numberFormat51);
    }

    @Test
    public void test16514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16514");
        java.text.NumberFormat.Field field0 = java.text.NumberFormat.Field.PERMILLE;
        java.text.FieldPosition fieldPosition2 = new java.text.FieldPosition((java.text.Format.Field) field0, (int) (short) 0);
        int int3 = fieldPosition2.getEndIndex();
        java.text.ParseException parseException6 = new java.text.ParseException("java.text.FieldPosition[field=0,attribute=java.text.NumberFormat$Field(per mille),beginIndex=0,endIndex=0]", 0);
        java.lang.Throwable[] throwableArray7 = parseException6.getSuppressed();
        int int8 = parseException6.getErrorOffset();
        boolean boolean9 = fieldPosition2.equals((java.lang.Object) parseException6);
        java.util.Locale.Builder builder10 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder12 = builder10.setVariant("");
        java.util.Locale.Builder builder13 = builder12.clear();
        java.util.Locale locale14 = java.util.Locale.KOREAN;
        java.util.Locale locale15 = java.util.Locale.KOREAN;
        java.lang.String str16 = locale14.getDisplayLanguage(locale15);
        java.lang.String str17 = locale14.getISO3Language();
        boolean boolean18 = locale14.hasExtensions();
        java.util.Locale.Builder builder19 = builder12.setLocale(locale14);
        java.util.Locale.Builder builder20 = builder19.clear();
        boolean boolean21 = fieldPosition2.equals((java.lang.Object) builder20);
        java.util.Locale.Builder builder22 = builder20.clear();
        java.util.Locale.Builder builder24 = builder20.setVariant("francese");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder26 = builder24.setLanguage("4.369");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: 4.369 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(field0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str16, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "kor" + "'", str17, "kor");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test16515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16515");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.KOREAN;
        java.util.Locale locale2 = java.util.Locale.KOREAN;
        java.lang.String str3 = locale1.getDisplayLanguage(locale2);
        java.lang.String str4 = locale2.getScript();
        java.lang.String str5 = locale2.getVariant();
        java.util.Locale.setDefault(category0, locale2);
        java.util.Locale locale7 = java.util.Locale.getDefault(category0);
        java.util.Locale locale8 = java.util.Locale.FRENCH;
        org.apache.commons.math.fraction.FractionFormat fractionFormat9 = org.apache.commons.math.fraction.FractionFormat.getProperInstance(locale8);
        java.util.Locale.setDefault(category0, locale8);
        java.text.NumberFormat numberFormat11 = java.text.NumberFormat.getIntegerInstance(locale8);
        java.text.NumberFormat numberFormat12 = java.text.NumberFormat.getPercentInstance(locale8);
        java.util.Locale locale16 = new java.util.Locale("", "java.text.ParsePosition[index=10,errorIndex=9]", "5.200%");
        org.apache.commons.math.fraction.FractionFormat fractionFormat17 = org.apache.commons.math.fraction.FractionFormat.getImproperInstance(locale16);
        java.lang.String str18 = locale8.getDisplayCountry(locale16);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str3, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ko");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr");
        org.junit.Assert.assertNotNull(fractionFormat9);
        org.junit.Assert.assertNotNull(numberFormat11);
        org.junit.Assert.assertNotNull(numberFormat12);
        org.junit.Assert.assertEquals(locale16.toString(), "_JAVA.TEXT.PARSEPOSITION[INDEX=10,ERRORINDEX=9]_5.200%");
        org.junit.Assert.assertNotNull(fractionFormat17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test16516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16516");
        java.util.Locale locale2 = new java.util.Locale("\u5fb7\u6587\u5fb7\u56fd)", "Chinesisch (China)");
        java.text.NumberFormat numberFormat3 = java.text.NumberFormat.getCurrencyInstance(locale2);
        java.text.NumberFormat.Field field5 = java.text.NumberFormat.Field.PERMILLE;
        java.text.FieldPosition fieldPosition7 = new java.text.FieldPosition((java.text.Format.Field) field5, (int) (short) 0);
        java.text.NumberFormat numberFormat8 = java.text.NumberFormat.getInstance();
        java.lang.String str10 = numberFormat8.format(100L);
        java.text.NumberFormat numberFormat12 = java.text.NumberFormat.getPercentInstance();
        java.text.ParsePosition parsePosition15 = new java.text.ParsePosition((int) (short) 10);
        java.lang.Object obj16 = numberFormat12.parseObject("hi!", parsePosition15);
        java.lang.Number number17 = numberFormat8.parse("10,000%", parsePosition15);
        boolean boolean18 = field5.equals((java.lang.Object) parsePosition15);
        java.lang.Object obj19 = numberFormat3.parseObject("117 / 1", parsePosition15);
        parsePosition15.setErrorIndex(0);
        org.junit.Assert.assertEquals(locale2.toString(), "\u5fb7\u6587\u5fb7\u56fd)_CHINESISCH (CHINA)");
        org.junit.Assert.assertNotNull(numberFormat3);
        org.junit.Assert.assertNotNull(field5);
        org.junit.Assert.assertNotNull(numberFormat8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100" + "'", str10, "100");
        org.junit.Assert.assertNotNull(numberFormat12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(number17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test16517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16517");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("it");
        java.util.Locale.LanguageRange[] languageRangeArray2 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList3 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList3, languageRangeArray2);
        java.util.Locale locale5 = java.util.Locale.KOREAN;
        java.util.Locale locale6 = java.util.Locale.KOREAN;
        java.lang.String str7 = locale5.getDisplayLanguage(locale6);
        java.lang.String str8 = locale6.getScript();
        java.util.Locale locale9 = java.util.Locale.KOREAN;
        java.util.Locale locale10 = java.util.Locale.GERMANY;
        java.util.Locale[] localeArray11 = new java.util.Locale[] { locale6, locale9, locale10 };
        java.util.ArrayList<java.util.Locale> localeList12 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList12, localeArray11);
        java.util.Locale.FilteringMode filteringMode14 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList15 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.util.Locale>) localeList12, filteringMode14);
        java.util.Locale.Builder builder16 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder18 = builder16.setVariant("");
        java.util.Locale.Builder builder19 = builder18.clear();
        java.util.Locale locale20 = java.util.Locale.KOREAN;
        java.util.Locale locale21 = java.util.Locale.KOREAN;
        java.lang.String str22 = locale20.getDisplayLanguage(locale21);
        java.lang.String str23 = locale20.getISO3Language();
        boolean boolean24 = locale20.hasExtensions();
        java.util.Locale.Builder builder25 = builder18.setLocale(locale20);
        java.util.Set<java.lang.String> strSet26 = locale20.getUnicodeLocaleKeys();
        java.util.Locale.LanguageRange[] languageRangeArray27 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList28 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList28, languageRangeArray27);
        java.util.Locale locale30 = java.util.Locale.KOREAN;
        java.util.Locale locale31 = java.util.Locale.KOREAN;
        java.lang.String str32 = locale30.getDisplayLanguage(locale31);
        java.lang.String str33 = locale31.getScript();
        java.util.Locale locale34 = java.util.Locale.KOREAN;
        java.util.Locale locale35 = java.util.Locale.GERMANY;
        java.util.Locale[] localeArray36 = new java.util.Locale[] { locale31, locale34, locale35 };
        java.util.ArrayList<java.util.Locale> localeList37 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList37, localeArray36);
        java.util.Locale.FilteringMode filteringMode39 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList40 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList28, (java.util.Collection<java.util.Locale>) localeList37, filteringMode39);
        java.util.Locale locale41 = java.util.Locale.KOREAN;
        java.util.Locale locale42 = java.util.Locale.KOREAN;
        java.lang.String str43 = locale41.getDisplayLanguage(locale42);
        java.lang.String str44 = locale42.getScript();
        java.lang.String str45 = locale42.getVariant();
        java.util.Locale locale46 = java.util.Locale.GERMANY;
        java.util.Locale locale47 = java.util.Locale.KOREAN;
        java.util.Locale locale48 = java.util.Locale.KOREAN;
        java.lang.String str49 = locale47.getDisplayLanguage(locale48);
        java.lang.String str50 = locale47.getISO3Language();
        java.util.Locale locale51 = java.util.Locale.CHINA;
        java.util.Locale locale52 = java.util.Locale.KOREAN;
        java.util.Locale locale53 = java.util.Locale.KOREAN;
        java.lang.String str54 = locale52.getDisplayLanguage(locale53);
        java.util.Locale locale55 = java.util.Locale.KOREAN;
        java.util.Locale locale56 = java.util.Locale.KOREAN;
        java.lang.String str57 = locale55.getDisplayLanguage(locale56);
        java.text.NumberFormat numberFormat58 = java.text.NumberFormat.getNumberInstance(locale56);
        java.util.Locale locale59 = java.util.Locale.KOREAN;
        java.util.Locale locale60 = java.util.Locale.KOREAN;
        java.util.Locale locale61 = java.util.Locale.KOREAN;
        java.lang.String str62 = locale60.getDisplayLanguage(locale61);
        java.lang.String str63 = locale61.getScript();
        java.util.Locale locale64 = java.util.Locale.KOREAN;
        java.util.Locale locale65 = java.util.Locale.KOREAN;
        java.lang.String str66 = locale64.getDisplayLanguage(locale65);
        java.lang.String str67 = locale65.getScript();
        java.lang.String str68 = locale65.getVariant();
        java.util.Locale[] localeArray69 = new java.util.Locale[] { locale42, locale46, locale47, locale51, locale53, locale56, locale59, locale61, locale65 };
        java.util.ArrayList<java.util.Locale> localeList70 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList70, localeArray69);
        java.util.Locale.LanguageRange[] languageRangeArray72 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList73 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList73, languageRangeArray72);
        java.util.Locale locale75 = java.util.Locale.KOREAN;
        java.util.Locale locale76 = java.util.Locale.KOREAN;
        java.lang.String str77 = locale75.getDisplayLanguage(locale76);
        java.lang.String str78 = locale76.getScript();
        java.util.Locale locale79 = java.util.Locale.KOREAN;
        java.util.Locale locale80 = java.util.Locale.GERMANY;
        java.util.Locale[] localeArray81 = new java.util.Locale[] { locale76, locale79, locale80 };
        java.util.ArrayList<java.util.Locale> localeList82 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList82, localeArray81);
        java.util.Locale.FilteringMode filteringMode84 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList85 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList73, (java.util.Collection<java.util.Locale>) localeList82, filteringMode84);
        java.util.List<java.util.Locale> localeList86 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList28, (java.util.Collection<java.util.Locale>) localeList70, filteringMode84);
        java.util.List<java.lang.String> strList87 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.lang.String>) strSet26, filteringMode84);
        java.util.List<java.lang.String> strList88 = java.util.Locale.filterTags(languageRangeList1, (java.util.Collection<java.lang.String>) strList87);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str7, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ko");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "de_DE");
        org.junit.Assert.assertNotNull(localeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + filteringMode14 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode14.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList15);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ko");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str22, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "kor" + "'", str23, "kor");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNotNull(languageRangeArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "ko");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str32, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "ko");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "de_DE");
        org.junit.Assert.assertNotNull(localeArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + filteringMode39 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode39.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList40);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "ko");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str43, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "ko");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str49, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "kor" + "'", str50, "kor");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "ko");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str54, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "ko");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str57, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertNotNull(numberFormat58);
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "ko");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "ko");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str62, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "ko");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str66, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(localeArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(languageRangeArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "ko");
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str77, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "ko");
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "de_DE");
        org.junit.Assert.assertNotNull(localeArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + filteringMode84 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode84.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList85);
        org.junit.Assert.assertNotNull(localeList86);
        org.junit.Assert.assertNotNull(strList87);
        org.junit.Assert.assertNotNull(strList88);
    }

    @Test
    public void test16518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16518");
        java.text.NumberFormat.Field field0 = java.text.NumberFormat.Field.PERMILLE;
        java.text.FieldPosition fieldPosition2 = new java.text.FieldPosition((java.text.Format.Field) field0, (int) (short) 0);
        java.lang.String str3 = fieldPosition2.toString();
        fieldPosition2.setEndIndex((int) 'a');
        java.text.NumberFormat numberFormat6 = java.text.NumberFormat.getIntegerInstance();
        java.text.NumberFormat numberFormat7 = java.text.NumberFormat.getPercentInstance();
        numberFormat7.setMaximumIntegerDigits((-1));
        java.text.NumberFormat numberFormat10 = java.text.NumberFormat.getPercentInstance();
        java.text.NumberFormat numberFormat11 = java.text.NumberFormat.getPercentInstance();
        numberFormat11.setMaximumIntegerDigits((-1));
        java.util.Currency currency14 = numberFormat11.getCurrency();
        numberFormat10.setCurrency(currency14);
        numberFormat7.setCurrency(currency14);
        java.text.NumberFormat numberFormat17 = java.text.NumberFormat.getPercentInstance();
        numberFormat17.setMaximumIntegerDigits((-1));
        java.util.Currency currency20 = numberFormat17.getCurrency();
        java.lang.String str22 = numberFormat17.format((double) 10);
        org.apache.commons.math.fraction.ProperFractionFormat properFractionFormat23 = new org.apache.commons.math.fraction.ProperFractionFormat(numberFormat6, numberFormat7, numberFormat17);
        java.text.NumberFormat numberFormat24 = java.text.NumberFormat.getInstance();
        java.lang.String str26 = numberFormat24.format(100L);
        properFractionFormat23.setWholeFormat(numberFormat24);
        java.text.NumberFormat numberFormat28 = properFractionFormat23.getWholeFormat();
        boolean boolean29 = fieldPosition2.equals((java.lang.Object) properFractionFormat23);
        java.text.NumberFormat numberFormat30 = properFractionFormat23.getWholeFormat();
        java.text.NumberFormat numberFormat32 = java.text.NumberFormat.getPercentInstance();
        java.text.ParsePosition parsePosition35 = new java.text.ParsePosition((int) (short) 10);
        java.lang.Object obj36 = numberFormat32.parseObject("hi!", parsePosition35);
        java.lang.String str37 = parsePosition35.toString();
        org.apache.commons.math.fraction.Fraction fraction38 = properFractionFormat23.parse("x-lvariant-it-IT", parsePosition35);
        java.text.NumberFormat numberFormat39 = properFractionFormat23.getWholeFormat();
        java.lang.Object obj40 = numberFormat39.clone();
        java.math.RoundingMode roundingMode41 = numberFormat39.getRoundingMode();
        boolean boolean42 = numberFormat39.isGroupingUsed();
        org.junit.Assert.assertNotNull(field0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.text.FieldPosition[field=0,attribute=java.text.NumberFormat$Field(per mille),beginIndex=0,endIndex=0]" + "'", str3, "java.text.FieldPosition[field=0,attribute=java.text.NumberFormat$Field(per mille),beginIndex=0,endIndex=0]");
        org.junit.Assert.assertNotNull(numberFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertNotNull(numberFormat11);
        org.junit.Assert.assertNotNull(currency14);
        org.junit.Assert.assertEquals(currency14.toString(), "XXX");
        org.junit.Assert.assertNotNull(numberFormat17);
        org.junit.Assert.assertNotNull(currency20);
        org.junit.Assert.assertEquals(currency20.toString(), "XXX");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0%" + "'", str22, "0%");
        org.junit.Assert.assertNotNull(numberFormat24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "100" + "'", str26, "100");
        org.junit.Assert.assertNotNull(numberFormat28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(numberFormat30);
        org.junit.Assert.assertNotNull(numberFormat32);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "java.text.ParsePosition[index=10,errorIndex=10]" + "'", str37, "java.text.ParsePosition[index=10,errorIndex=10]");
        org.junit.Assert.assertNull(fraction38);
        org.junit.Assert.assertNotNull(numberFormat39);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue("'" + roundingMode41 + "' != '" + java.math.RoundingMode.HALF_EVEN + "'", roundingMode41.equals(java.math.RoundingMode.HALF_EVEN));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test16519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16519");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("0.031", (double) (short) 13689);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=13689.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16520");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.KOREAN;
        java.util.Locale locale2 = java.util.Locale.KOREAN;
        java.lang.String str3 = locale1.getDisplayLanguage(locale2);
        java.lang.String str4 = locale2.getScript();
        java.lang.String str5 = locale2.getVariant();
        java.util.Locale.setDefault(category0, locale2);
        java.util.Locale locale7 = java.util.Locale.getDefault(category0);
        java.util.Locale locale8 = java.util.Locale.FRENCH;
        org.apache.commons.math.fraction.FractionFormat fractionFormat9 = org.apache.commons.math.fraction.FractionFormat.getProperInstance(locale8);
        java.util.Locale.setDefault(category0, locale8);
        java.util.Locale locale11 = java.util.Locale.TAIWAN;
        java.util.Locale locale12 = locale11.stripExtensions();
        java.util.Locale.setDefault(category0, locale11);
        java.util.Locale locale14 = java.util.Locale.getDefault(category0);
        java.util.Locale locale15 = java.util.Locale.KOREAN;
        java.util.Locale locale16 = java.util.Locale.KOREAN;
        java.lang.String str17 = locale15.getDisplayLanguage(locale16);
        java.lang.String str18 = locale15.getISO3Language();
        java.lang.String str19 = locale15.getCountry();
        java.lang.String str20 = locale15.getVariant();
        org.apache.commons.math.fraction.FractionFormat fractionFormat21 = org.apache.commons.math.fraction.FractionFormat.getProperInstance(locale15);
        java.util.Locale.setDefault(category0, locale15);
        java.util.Locale locale23 = null;
        java.lang.String str24 = locale15.getDisplayVariant(locale23);
        java.lang.String str25 = locale15.getISO3Language();
        java.text.NumberFormat numberFormat26 = java.text.NumberFormat.getCurrencyInstance(locale15);
        java.lang.String str27 = locale15.getDisplayName();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str3, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ko");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr");
        org.junit.Assert.assertNotNull(fractionFormat9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ko");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str17, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "kor" + "'", str18, "kor");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(fractionFormat21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "kor" + "'", str25, "kor");
        org.junit.Assert.assertNotNull(numberFormat26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str27, "\ud55c\uad6d\uc5b4");
    }

    @Test
    public void test16521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16521");
        java.util.Locale locale1 = new java.util.Locale("1 / 1_java.text.parseexception: java.text.parseexception: 100");
        java.lang.String str3 = locale1.getExtension('a');
        org.junit.Assert.assertEquals(locale1.toString(), "1 / 1_java.text.parseexception: java.text.parseexception: 100");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test16522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16522");
        java.text.NumberFormat numberFormat0 = java.text.NumberFormat.getIntegerInstance();
        java.text.NumberFormat numberFormat1 = java.text.NumberFormat.getPercentInstance();
        numberFormat1.setMaximumIntegerDigits((-1));
        java.text.NumberFormat numberFormat4 = java.text.NumberFormat.getPercentInstance();
        java.text.NumberFormat numberFormat5 = java.text.NumberFormat.getPercentInstance();
        numberFormat5.setMaximumIntegerDigits((-1));
        java.util.Currency currency8 = numberFormat5.getCurrency();
        numberFormat4.setCurrency(currency8);
        numberFormat1.setCurrency(currency8);
        java.text.NumberFormat numberFormat11 = java.text.NumberFormat.getPercentInstance();
        numberFormat11.setMaximumIntegerDigits((-1));
        java.util.Currency currency14 = numberFormat11.getCurrency();
        java.lang.String str16 = numberFormat11.format((double) 10);
        org.apache.commons.math.fraction.ProperFractionFormat properFractionFormat17 = new org.apache.commons.math.fraction.ProperFractionFormat(numberFormat0, numberFormat1, numberFormat11);
        java.text.NumberFormat numberFormat18 = java.text.NumberFormat.getInstance();
        java.lang.String str20 = numberFormat18.format(100L);
        properFractionFormat17.setWholeFormat(numberFormat18);
        java.text.NumberFormat numberFormat22 = properFractionFormat17.getWholeFormat();
        org.apache.commons.math.fraction.FractionFormat fractionFormat23 = org.apache.commons.math.fraction.FractionFormat.getImproperInstance();
        java.text.NumberFormat numberFormat24 = fractionFormat23.getNumeratorFormat();
        java.text.NumberFormat numberFormat25 = fractionFormat23.getNumeratorFormat();
        java.text.ParseException parseException28 = new java.text.ParseException("java.text.FieldPosition[field=0,attribute=java.text.NumberFormat$Field(per mille),beginIndex=0,endIndex=0]", 0);
        java.lang.Throwable[] throwableArray29 = parseException28.getSuppressed();
        boolean boolean30 = numberFormat25.equals((java.lang.Object) throwableArray29);
        numberFormat25.setMaximumFractionDigits((int) '#');
        org.apache.commons.math.fraction.ProperFractionFormat properFractionFormat33 = new org.apache.commons.math.fraction.ProperFractionFormat(numberFormat25);
        java.text.NumberFormat numberFormat34 = properFractionFormat33.getWholeFormat();
        properFractionFormat17.setWholeFormat(numberFormat34);
        java.text.NumberFormat numberFormat36 = properFractionFormat17.getDenominatorFormat();
        java.util.Locale locale37 = java.util.Locale.KOREAN;
        java.util.Locale locale38 = java.util.Locale.KOREAN;
        java.lang.String str39 = locale37.getDisplayLanguage(locale38);
        java.text.NumberFormat numberFormat40 = java.text.NumberFormat.getNumberInstance(locale38);
        java.lang.String str42 = numberFormat40.format((long) ' ');
        properFractionFormat17.setWholeFormat(numberFormat40);
        java.util.Currency currency44 = numberFormat40.getCurrency();
        org.junit.Assert.assertNotNull(numberFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(numberFormat5);
        org.junit.Assert.assertNotNull(currency8);
        org.junit.Assert.assertEquals(currency8.toString(), "XXX");
        org.junit.Assert.assertNotNull(numberFormat11);
        org.junit.Assert.assertNotNull(currency14);
        org.junit.Assert.assertEquals(currency14.toString(), "XXX");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0%" + "'", str16, "0%");
        org.junit.Assert.assertNotNull(numberFormat18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "100" + "'", str20, "100");
        org.junit.Assert.assertNotNull(numberFormat22);
        org.junit.Assert.assertNotNull(fractionFormat23);
        org.junit.Assert.assertNotNull(numberFormat24);
        org.junit.Assert.assertNotNull(numberFormat25);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(numberFormat34);
        org.junit.Assert.assertNotNull(numberFormat36);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "ko");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str39, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertNotNull(numberFormat40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "32" + "'", str42, "32");
        org.junit.Assert.assertNotNull(currency44);
        org.junit.Assert.assertEquals(currency44.toString(), "XXX");
    }

    @Test
    public void test16523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16523");
        java.util.Locale locale2 = new java.util.Locale("java.text.ParseException: java.text.ParseException: 100", "-1");
        org.apache.commons.math.fraction.FractionFormat fractionFormat3 = org.apache.commons.math.fraction.FractionFormat.getProperInstance(locale2);
        java.lang.String str4 = locale2.getLanguage();
        java.lang.String str5 = locale2.getDisplayLanguage();
        java.util.Set<java.lang.Character> charSet6 = locale2.getExtensionKeys();
        org.junit.Assert.assertEquals(locale2.toString(), "java.text.parseexception: java.text.parseexception: 100_-1");
        org.junit.Assert.assertNotNull(fractionFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.text.parseexception: java.text.parseexception: 100" + "'", str4, "java.text.parseexception: java.text.parseexception: 100");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.text.parseexception: java.text.parseexception: 100" + "'", str5, "java.text.parseexception: java.text.parseexception: 100");
        org.junit.Assert.assertNotNull(charSet6);
    }

    @Test
    public void test16524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16524");
        java.text.NumberFormat.Field field0 = java.text.NumberFormat.Field.PERMILLE;
        java.text.FieldPosition fieldPosition2 = new java.text.FieldPosition((java.text.Format.Field) field0, (int) (short) 0);
        int int3 = fieldPosition2.getEndIndex();
        fieldPosition2.setBeginIndex((int) ' ');
        int int6 = fieldPosition2.getField();
        int int7 = fieldPosition2.getBeginIndex();
        int int8 = fieldPosition2.getBeginIndex();
        org.junit.Assert.assertNotNull(field0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void test16525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16525");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        org.apache.commons.math.fraction.FractionFormat fractionFormat1 = org.apache.commons.math.fraction.FractionFormat.getProperInstance(locale0);
        java.text.NumberFormat numberFormat2 = java.text.NumberFormat.getPercentInstance();
        numberFormat2.setMaximumIntegerDigits((-1));
        java.util.Currency currency5 = numberFormat2.getCurrency();
        java.lang.String str7 = numberFormat2.format((double) 10);
        boolean boolean9 = numberFormat2.equals((java.lang.Object) "");
        fractionFormat1.setNumeratorFormat(numberFormat2);
        org.apache.commons.math.fraction.ProperFractionFormat properFractionFormat11 = new org.apache.commons.math.fraction.ProperFractionFormat(numberFormat2);
        java.util.Locale locale12 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.Character> charSet13 = locale12.getExtensionKeys();
        java.text.NumberFormat numberFormat14 = java.text.NumberFormat.getInstance(locale12);
        numberFormat14.setParseIntegerOnly(true);
        org.apache.commons.math.fraction.FractionFormat fractionFormat17 = new org.apache.commons.math.fraction.FractionFormat(numberFormat2, numberFormat14);
        java.text.NumberFormat numberFormat19 = java.text.NumberFormat.getIntegerInstance();
        java.text.NumberFormat numberFormat20 = java.text.NumberFormat.getPercentInstance();
        numberFormat20.setMaximumIntegerDigits((-1));
        java.text.NumberFormat numberFormat23 = java.text.NumberFormat.getPercentInstance();
        java.text.NumberFormat numberFormat24 = java.text.NumberFormat.getPercentInstance();
        numberFormat24.setMaximumIntegerDigits((-1));
        java.util.Currency currency27 = numberFormat24.getCurrency();
        numberFormat23.setCurrency(currency27);
        numberFormat20.setCurrency(currency27);
        java.text.NumberFormat numberFormat30 = java.text.NumberFormat.getPercentInstance();
        numberFormat30.setMaximumIntegerDigits((-1));
        java.util.Currency currency33 = numberFormat30.getCurrency();
        java.lang.String str35 = numberFormat30.format((double) 10);
        org.apache.commons.math.fraction.ProperFractionFormat properFractionFormat36 = new org.apache.commons.math.fraction.ProperFractionFormat(numberFormat19, numberFormat20, numberFormat30);
        java.text.NumberFormat numberFormat37 = java.text.NumberFormat.getInstance();
        java.lang.String str39 = numberFormat37.format(100L);
        properFractionFormat36.setWholeFormat(numberFormat37);
        java.text.NumberFormat numberFormat41 = java.text.NumberFormat.getInstance();
        java.lang.String str43 = numberFormat41.format(100L);
        int int44 = numberFormat41.getMinimumFractionDigits();
        java.util.Locale locale45 = java.util.Locale.KOREAN;
        java.util.Locale locale46 = java.util.Locale.KOREAN;
        java.lang.String str47 = locale45.getDisplayLanguage(locale46);
        java.text.NumberFormat numberFormat48 = java.text.NumberFormat.getNumberInstance(locale46);
        java.lang.String str50 = numberFormat48.format((long) ' ');
        org.apache.commons.math.fraction.ProperFractionFormat properFractionFormat51 = new org.apache.commons.math.fraction.ProperFractionFormat(numberFormat37, numberFormat41, numberFormat48);
        java.text.NumberFormat numberFormat53 = java.text.NumberFormat.getIntegerInstance();
        java.text.NumberFormat numberFormat54 = java.text.NumberFormat.getPercentInstance();
        numberFormat54.setMaximumIntegerDigits((-1));
        java.text.NumberFormat numberFormat57 = java.text.NumberFormat.getPercentInstance();
        java.text.NumberFormat numberFormat58 = java.text.NumberFormat.getPercentInstance();
        numberFormat58.setMaximumIntegerDigits((-1));
        java.util.Currency currency61 = numberFormat58.getCurrency();
        numberFormat57.setCurrency(currency61);
        numberFormat54.setCurrency(currency61);
        java.text.NumberFormat numberFormat64 = java.text.NumberFormat.getPercentInstance();
        numberFormat64.setMaximumIntegerDigits((-1));
        java.util.Currency currency67 = numberFormat64.getCurrency();
        java.lang.String str69 = numberFormat64.format((double) 10);
        org.apache.commons.math.fraction.ProperFractionFormat properFractionFormat70 = new org.apache.commons.math.fraction.ProperFractionFormat(numberFormat53, numberFormat54, numberFormat64);
        java.text.NumberFormat numberFormat72 = java.text.NumberFormat.getInstance();
        java.lang.String str74 = numberFormat72.format(100L);
        java.text.NumberFormat numberFormat76 = java.text.NumberFormat.getPercentInstance();
        java.text.ParsePosition parsePosition79 = new java.text.ParsePosition((int) (short) 10);
        java.lang.Object obj80 = numberFormat76.parseObject("hi!", parsePosition79);
        java.lang.Number number81 = numberFormat72.parse("10,000%", parsePosition79);
        int int82 = parsePosition79.getErrorIndex();
        int int83 = parsePosition79.getIndex();
        org.apache.commons.math.fraction.Fraction fraction84 = properFractionFormat70.parse("French", parsePosition79);
        int int85 = parsePosition79.getIndex();
        org.apache.commons.math.fraction.Fraction fraction86 = properFractionFormat51.parse("fran\347ais", parsePosition79);
        org.apache.commons.math.fraction.Fraction fraction87 = fractionFormat17.parse("\244 0.00", parsePosition79);
        java.lang.String str88 = parsePosition79.toString();
        int int89 = parsePosition79.getIndex();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertNotNull(fractionFormat1);
        org.junit.Assert.assertNotNull(numberFormat2);
        org.junit.Assert.assertNotNull(currency5);
        org.junit.Assert.assertEquals(currency5.toString(), "XXX");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0%" + "'", str7, "0%");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "de_DE");
        org.junit.Assert.assertNotNull(charSet13);
        org.junit.Assert.assertNotNull(numberFormat14);
        org.junit.Assert.assertNotNull(numberFormat19);
        org.junit.Assert.assertNotNull(numberFormat20);
        org.junit.Assert.assertNotNull(numberFormat23);
        org.junit.Assert.assertNotNull(numberFormat24);
        org.junit.Assert.assertNotNull(currency27);
        org.junit.Assert.assertEquals(currency27.toString(), "XXX");
        org.junit.Assert.assertNotNull(numberFormat30);
        org.junit.Assert.assertNotNull(currency33);
        org.junit.Assert.assertEquals(currency33.toString(), "XXX");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "0%" + "'", str35, "0%");
        org.junit.Assert.assertNotNull(numberFormat37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "100" + "'", str39, "100");
        org.junit.Assert.assertNotNull(numberFormat41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "100" + "'", str43, "100");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "ko");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str47, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertNotNull(numberFormat48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "32" + "'", str50, "32");
        org.junit.Assert.assertNotNull(numberFormat53);
        org.junit.Assert.assertNotNull(numberFormat54);
        org.junit.Assert.assertNotNull(numberFormat57);
        org.junit.Assert.assertNotNull(numberFormat58);
        org.junit.Assert.assertNotNull(currency61);
        org.junit.Assert.assertEquals(currency61.toString(), "XXX");
        org.junit.Assert.assertNotNull(numberFormat64);
        org.junit.Assert.assertNotNull(currency67);
        org.junit.Assert.assertEquals(currency67.toString(), "XXX");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "0%" + "'", str69, "0%");
        org.junit.Assert.assertNotNull(numberFormat72);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "100" + "'", str74, "100");
        org.junit.Assert.assertNotNull(numberFormat76);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNull(number81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 10 + "'", int82 == 10);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 10 + "'", int83 == 10);
        org.junit.Assert.assertNull(fraction84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 10 + "'", int85 == 10);
        org.junit.Assert.assertNull(fraction86);
        org.junit.Assert.assertNull(fraction87);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "java.text.ParsePosition[index=10,errorIndex=9]" + "'", str88, "java.text.ParsePosition[index=10,errorIndex=9]");
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 10 + "'", int89 == 10);
    }

    @Test
    public void test16526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16526");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) (short) 3, (int) (byte) 100);
        org.apache.commons.math.fraction.Fraction fraction5 = new org.apache.commons.math.fraction.Fraction((-117), 100);
        org.apache.commons.math.fraction.Fraction fraction6 = fraction5.abs();
        org.apache.commons.math.fraction.Fraction fraction7 = fraction2.add(fraction5);
        org.apache.commons.math.fraction.Fraction fraction8 = fraction2.negate();
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
    }

    @Test
    public void test16527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16527");
        java.text.ParsePosition parsePosition1 = new java.text.ParsePosition((int) (byte) -1);
        java.lang.String str2 = parsePosition1.toString();
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale.Builder builder6 = builder3.setVariant("");
        java.util.Locale.Builder builder7 = builder3.clearExtensions();
        java.util.Locale.Builder builder9 = builder7.setLanguageTag("anglais");
        java.util.Locale locale10 = builder9.build();
        java.util.Locale.Builder builder11 = builder9.clearExtensions();
        boolean boolean12 = parsePosition1.equals((java.lang.Object) builder11);
        java.util.Locale locale13 = builder11.build();
        java.util.Locale locale14 = builder11.build();
        java.util.Locale.Builder builder15 = builder11.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder17 = builder15.setVariant("6,084 / 35");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: 6,084 / 35 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.text.ParsePosition[index=-1,errorIndex=-1]" + "'", str2, "java.text.ParsePosition[index=-1,errorIndex=-1]");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "anglais");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "anglais");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "anglais");
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test16528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16528");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder1.setVariant("");
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale locale5 = java.util.Locale.KOREAN;
        java.util.Locale locale6 = java.util.Locale.KOREAN;
        java.lang.String str7 = locale5.getDisplayLanguage(locale6);
        java.lang.String str8 = locale5.getISO3Language();
        boolean boolean9 = locale5.hasExtensions();
        java.util.Locale.Builder builder10 = builder3.setLocale(locale5);
        java.util.Locale.Builder builder11 = builder10.clear();
        java.util.Locale.Builder builder13 = builder10.setLanguageTag("coreano");
        java.util.Locale locale14 = java.util.Locale.FRENCH;
        java.util.Locale.Builder builder15 = builder10.setLocale(locale14);
        java.util.Set<java.lang.String> strSet16 = locale14.getUnicodeLocaleAttributes();
        java.lang.String str17 = locale0.getDisplayVariant(locale14);
        boolean boolean18 = locale14.hasExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str7, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "kor" + "'", str8, "kor");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test16529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16529");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.util.Locale locale1 = java.util.Locale.KOREAN;
        java.util.Locale locale2 = java.util.Locale.KOREAN;
        java.lang.String str3 = locale1.getDisplayLanguage(locale2);
        java.lang.String str4 = locale1.getISO3Language();
        java.lang.String str5 = locale0.getDisplayCountry(locale1);
        java.util.Locale locale6 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str7 = locale1.getDisplayLanguage(locale6);
        java.lang.String str8 = locale6.getCountry();
        java.lang.String str9 = locale6.getLanguage();
        java.util.Locale locale10 = locale6.stripExtensions();
        java.text.NumberFormat numberFormat11 = java.text.NumberFormat.getPercentInstance(locale10);
        java.math.RoundingMode roundingMode12 = null;
        // The following exception was thrown during execution in test generation
        try {
            numberFormat11.setRoundingMode(roundingMode12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str3, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "kor" + "'", str4, "kor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u671d\u9c9c\u6587" + "'", str7, "\u671d\u9c9c\u6587");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CN" + "'", str8, "CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "zh" + "'", str9, "zh");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(numberFormat11);
    }

    @Test
    public void test16530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16530");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.text.NumberFormat numberFormat1 = java.text.NumberFormat.getIntegerInstance(locale0);
        java.text.NumberFormat numberFormat2 = java.text.NumberFormat.getIntegerInstance(locale0);
        java.util.Locale locale3 = java.util.Locale.KOREAN;
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.lang.String str5 = locale3.getDisplayLanguage(locale4);
        java.lang.String str6 = locale4.getScript();
        java.text.NumberFormat numberFormat7 = java.text.NumberFormat.getInstance(locale4);
        java.util.Locale locale8 = locale4.stripExtensions();
        java.util.Locale locale9 = java.util.Locale.KOREAN;
        java.util.Locale locale10 = java.util.Locale.KOREAN;
        java.lang.String str11 = locale9.getDisplayLanguage(locale10);
        java.util.Locale locale12 = java.util.Locale.ITALIAN;
        java.lang.String str13 = locale10.getDisplayName(locale12);
        java.util.Locale locale14 = java.util.Locale.ROOT;
        org.apache.commons.math.fraction.FractionFormat fractionFormat15 = org.apache.commons.math.fraction.FractionFormat.getProperInstance(locale14);
        java.lang.String str16 = locale14.getISO3Language();
        java.util.Set<java.lang.Character> charSet17 = locale14.getExtensionKeys();
        java.util.Locale.Category category18 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale19 = java.util.Locale.KOREAN;
        java.util.Locale locale20 = java.util.Locale.KOREAN;
        java.lang.String str21 = locale19.getDisplayLanguage(locale20);
        java.lang.String str22 = locale20.getScript();
        java.lang.String str23 = locale20.getVariant();
        java.util.Locale.setDefault(category18, locale20);
        java.lang.String str25 = locale20.getDisplayName();
        java.util.Locale locale26 = java.util.Locale.UK;
        java.lang.String str27 = locale26.getDisplayScript();
        java.util.Set<java.lang.String> strSet28 = locale26.getUnicodeLocaleAttributes();
        java.util.Locale locale29 = java.util.Locale.ENGLISH;
        java.lang.String str30 = locale26.getDisplayCountry(locale29);
        java.lang.String str31 = locale20.getDisplayVariant(locale26);
        java.lang.String str32 = locale14.getDisplayName(locale26);
        java.util.Locale locale33 = java.util.Locale.US;
        java.lang.String str34 = locale14.getDisplayLanguage(locale33);
        java.lang.String str35 = locale33.getDisplayLanguage();
        java.util.Locale locale36 = java.util.Locale.UK;
        java.lang.String str37 = locale36.getDisplayScript();
        java.util.Set<java.lang.String> strSet38 = locale36.getUnicodeLocaleAttributes();
        java.util.Locale locale39 = java.util.Locale.ENGLISH;
        java.lang.String str40 = locale36.getDisplayCountry(locale39);
        java.lang.String str41 = locale33.getDisplayVariant(locale39);
        java.lang.String str42 = locale10.getDisplayScript(locale39);
        java.lang.String str43 = locale8.getDisplayName(locale10);
        java.lang.String str44 = locale0.getDisplayCountry(locale10);
        java.util.Set<java.lang.String> strSet45 = locale10.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertNotNull(numberFormat2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str5, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ko");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ko");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str11, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "it");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "coreano" + "'", str13, "coreano");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNotNull(fractionFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charSet17);
        org.junit.Assert.assertTrue("'" + category18 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category18.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ko");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str21, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str25, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "United Kingdom" + "'", str30, "United Kingdom");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\uc601\uc5b4" + "'", str35, "\uc601\uc5b4");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(strSet38);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "en");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "United Kingdom" + "'", str40, "United Kingdom");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str43, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\ud504\ub791\uc2a4" + "'", str44, "\ud504\ub791\uc2a4");
        org.junit.Assert.assertNotNull(strSet45);
    }

    @Test
    public void test16531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16531");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.lang.String str1 = locale0.getDisplayScript();
        java.text.NumberFormat numberFormat2 = java.text.NumberFormat.getInstance(locale0);
        java.text.NumberFormat numberFormat3 = java.text.NumberFormat.getPercentInstance(locale0);
        java.util.Locale locale4 = locale0.stripExtensions();
        java.text.NumberFormat numberFormat5 = java.text.NumberFormat.getPercentInstance(locale4);
        java.lang.String str7 = locale4.getExtension('a');
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(numberFormat2);
        org.junit.Assert.assertNotNull(numberFormat3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(numberFormat5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test16532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16532");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction(13572, 9);
        float float3 = fraction2.floatValue();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1508.0f + "'", float3 == 1508.0f);
    }

    @Test
    public void test16533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16533");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.util.Locale locale5 = java.util.Locale.KOREAN;
        java.lang.String str6 = locale4.getDisplayLanguage(locale5);
        java.lang.String str7 = locale4.getISO3Language();
        boolean boolean8 = locale4.hasExtensions();
        java.util.Locale.Builder builder9 = builder2.setLocale(locale4);
        java.util.Locale.Builder builder10 = builder9.clear();
        java.util.Locale.Builder builder11 = builder9.clear();
        java.util.Locale.Builder builder13 = builder11.setLanguageTag("Chinese");
        java.util.Locale.Builder builder16 = builder11.setExtension('a', "Canada");
        java.util.Locale.Builder builder19 = builder11.setExtension('u', "");
        java.util.Locale locale20 = builder19.build();
        java.util.Locale.Builder builder22 = builder19.setScript("");
        java.util.Locale.Builder builder23 = builder19.clear();
        java.util.Locale locale24 = java.util.Locale.CHINESE;
        org.apache.commons.math.fraction.FractionFormat fractionFormat25 = org.apache.commons.math.fraction.FractionFormat.getImproperInstance(locale24);
        java.lang.String str26 = locale24.getDisplayScript();
        java.util.Locale.setDefault(locale24);
        java.util.Locale.Builder builder28 = builder23.setLocale(locale24);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder30 = builder23.setScript("United Kingdom");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: United Kingdom [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str6, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "kor" + "'", str7, "kor");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "chinese__#a-canada");
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh");
        org.junit.Assert.assertNotNull(fractionFormat25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(builder28);
    }

    @Test
    public void test16534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16534");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.lang.String str1 = locale0.getDisplayVariant();
        java.util.Locale locale2 = java.util.Locale.UK;
        java.lang.String str3 = locale2.getDisplayScript();
        java.util.Set<java.lang.String> strSet4 = locale2.getUnicodeLocaleAttributes();
        java.lang.String str5 = locale0.getDisplayScript(locale2);
        java.util.Locale locale6 = java.util.Locale.CHINESE;
        java.lang.String str7 = locale0.getDisplayVariant(locale6);
        java.util.Locale locale9 = java.util.Locale.forLanguageTag("java.text.AttributedCharacterIterator$Attribute(reading)");
        java.lang.String str10 = locale9.getISO3Language();
        java.util.Locale locale13 = new java.util.Locale("java.text.FieldPosition[field=0,attribute=java.text.NumberFormat$Field(per mille),beginIndex=10,endIndex=32]", "java.text.FieldPosition[field=0,attribute=java.text.NumberFormat$Field(per mille),beginIndex=10,endIndex=0]");
        java.lang.String str14 = locale9.getDisplayVariant(locale13);
        java.util.Set<java.lang.String> strSet15 = locale13.getUnicodeLocaleKeys();
        java.lang.String str16 = locale13.getDisplayScript();
        java.lang.String str17 = locale6.getDisplayName(locale13);
        java.lang.String str18 = locale6.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals(locale13.toString(), "java.text.fieldposition[field=0,attribute=java.text.numberformat$field(per mille),beginindex=10,endindex=32]_JAVA.TEXT.FIELDPOSITION[FIELD=0,ATTRIBUTE=JAVA.TEXT.NUMBERFORMAT$FIELD(PER MILLE),BEGININDEX=10,ENDINDEX=0]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Chinese" + "'", str17, "Chinese");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test16535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16535");
        java.text.NumberFormat numberFormat0 = java.text.NumberFormat.getIntegerInstance();
        java.text.NumberFormat numberFormat1 = java.text.NumberFormat.getPercentInstance();
        numberFormat1.setMaximumIntegerDigits((-1));
        java.text.NumberFormat numberFormat4 = java.text.NumberFormat.getPercentInstance();
        java.text.NumberFormat numberFormat5 = java.text.NumberFormat.getPercentInstance();
        numberFormat5.setMaximumIntegerDigits((-1));
        java.util.Currency currency8 = numberFormat5.getCurrency();
        numberFormat4.setCurrency(currency8);
        numberFormat1.setCurrency(currency8);
        java.text.NumberFormat numberFormat11 = java.text.NumberFormat.getPercentInstance();
        numberFormat11.setMaximumIntegerDigits((-1));
        java.util.Currency currency14 = numberFormat11.getCurrency();
        java.lang.String str16 = numberFormat11.format((double) 10);
        org.apache.commons.math.fraction.ProperFractionFormat properFractionFormat17 = new org.apache.commons.math.fraction.ProperFractionFormat(numberFormat0, numberFormat1, numberFormat11);
        java.text.NumberFormat numberFormat19 = java.text.NumberFormat.getInstance();
        java.lang.String str21 = numberFormat19.format(100L);
        java.text.NumberFormat numberFormat23 = java.text.NumberFormat.getPercentInstance();
        java.text.ParsePosition parsePosition26 = new java.text.ParsePosition((int) (short) 10);
        java.lang.Object obj27 = numberFormat23.parseObject("hi!", parsePosition26);
        java.lang.Number number28 = numberFormat19.parse("10,000%", parsePosition26);
        int int29 = parsePosition26.getErrorIndex();
        int int30 = parsePosition26.getIndex();
        org.apache.commons.math.fraction.Fraction fraction31 = properFractionFormat17.parse("French", parsePosition26);
        java.text.NumberFormat numberFormat32 = properFractionFormat17.getNumeratorFormat();
        java.text.NumberFormat numberFormat34 = java.text.NumberFormat.getCurrencyInstance();
        java.text.NumberFormat numberFormat35 = java.text.NumberFormat.getPercentInstance();
        java.text.NumberFormat numberFormat36 = java.text.NumberFormat.getPercentInstance();
        numberFormat36.setMaximumIntegerDigits((-1));
        java.util.Currency currency39 = numberFormat36.getCurrency();
        numberFormat35.setCurrency(currency39);
        java.lang.String str42 = numberFormat35.format((double) 100);
        org.apache.commons.math.fraction.FractionFormat fractionFormat43 = org.apache.commons.math.fraction.FractionFormat.getImproperInstance();
        java.text.NumberFormat numberFormat44 = fractionFormat43.getNumeratorFormat();
        org.apache.commons.math.fraction.ProperFractionFormat properFractionFormat45 = new org.apache.commons.math.fraction.ProperFractionFormat(numberFormat34, numberFormat35, numberFormat44);
        java.text.ParsePosition parsePosition48 = new java.text.ParsePosition((int) (short) 10);
        parsePosition48.setErrorIndex((int) (byte) 1);
        org.apache.commons.math.fraction.Fraction fraction51 = properFractionFormat45.parse("fran\347ais", parsePosition48);
        parsePosition48.setIndex(0);
        org.apache.commons.math.fraction.Fraction fraction54 = properFractionFormat17.parse("zh-TW", parsePosition48);
        java.text.NumberFormat numberFormat55 = properFractionFormat17.getDenominatorFormat();
        org.junit.Assert.assertNotNull(numberFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(numberFormat5);
        org.junit.Assert.assertNotNull(currency8);
        org.junit.Assert.assertEquals(currency8.toString(), "XXX");
        org.junit.Assert.assertNotNull(numberFormat11);
        org.junit.Assert.assertNotNull(currency14);
        org.junit.Assert.assertEquals(currency14.toString(), "XXX");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0%" + "'", str16, "0%");
        org.junit.Assert.assertNotNull(numberFormat19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "100" + "'", str21, "100");
        org.junit.Assert.assertNotNull(numberFormat23);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(number28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertNull(fraction31);
        org.junit.Assert.assertNotNull(numberFormat32);
        org.junit.Assert.assertNotNull(numberFormat34);
        org.junit.Assert.assertNotNull(numberFormat35);
        org.junit.Assert.assertNotNull(numberFormat36);
        org.junit.Assert.assertNotNull(currency39);
        org.junit.Assert.assertEquals(currency39.toString(), "XXX");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "10,000%" + "'", str42, "10,000%");
        org.junit.Assert.assertNotNull(fractionFormat43);
        org.junit.Assert.assertNotNull(numberFormat44);
        org.junit.Assert.assertNull(fraction51);
        org.junit.Assert.assertNull(fraction54);
        org.junit.Assert.assertNotNull(numberFormat55);
    }

    @Test
    public void test16536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16536");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("\244 11.00", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=?11.00");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16537");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = builder2.build();
        java.text.NumberFormat.Field field5 = java.text.NumberFormat.Field.PERMILLE;
        java.util.Locale locale6 = java.util.Locale.KOREAN;
        java.util.Locale locale7 = java.util.Locale.KOREAN;
        java.util.Locale locale8 = java.util.Locale.KOREAN;
        java.lang.String str9 = locale7.getDisplayLanguage(locale8);
        java.lang.String str10 = locale7.getISO3Language();
        java.lang.String str11 = locale6.getDisplayCountry(locale7);
        boolean boolean12 = field5.equals((java.lang.Object) locale6);
        java.lang.String str13 = locale6.getDisplayVariant();
        java.lang.String str14 = locale6.getScript();
        java.lang.String str15 = locale6.getDisplayLanguage();
        java.util.Locale.Builder builder16 = builder2.setLocale(locale6);
        java.util.Locale.Builder builder18 = builder16.setLanguageTag("France");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(field5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ko");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str9, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "kor" + "'", str10, "kor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u671d\u9c9c\u6587" + "'", str15, "\u671d\u9c9c\u6587");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test16538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16538");
        java.text.NumberFormat numberFormat0 = java.text.NumberFormat.getPercentInstance();
        numberFormat0.setMaximumIntegerDigits((-1));
        java.util.Currency currency3 = numberFormat0.getCurrency();
        org.apache.commons.math.fraction.FractionFormat fractionFormat4 = new org.apache.commons.math.fraction.FractionFormat(numberFormat0);
        int int5 = numberFormat0.getMinimumIntegerDigits();
        numberFormat0.setParseIntegerOnly(true);
        java.text.NumberFormat numberFormat9 = java.text.NumberFormat.getCurrencyInstance();
        java.text.NumberFormat numberFormat10 = java.text.NumberFormat.getPercentInstance();
        java.text.NumberFormat numberFormat11 = java.text.NumberFormat.getPercentInstance();
        numberFormat11.setMaximumIntegerDigits((-1));
        java.util.Currency currency14 = numberFormat11.getCurrency();
        numberFormat10.setCurrency(currency14);
        java.lang.String str17 = numberFormat10.format((double) 100);
        org.apache.commons.math.fraction.FractionFormat fractionFormat18 = org.apache.commons.math.fraction.FractionFormat.getImproperInstance();
        java.text.NumberFormat numberFormat19 = fractionFormat18.getNumeratorFormat();
        org.apache.commons.math.fraction.ProperFractionFormat properFractionFormat20 = new org.apache.commons.math.fraction.ProperFractionFormat(numberFormat9, numberFormat10, numberFormat19);
        java.text.ParsePosition parsePosition23 = new java.text.ParsePosition((int) (short) 10);
        parsePosition23.setErrorIndex((int) (byte) 1);
        org.apache.commons.math.fraction.Fraction fraction26 = properFractionFormat20.parse("fran\347ais", parsePosition23);
        java.text.NumberFormat numberFormat27 = java.text.NumberFormat.getPercentInstance();
        numberFormat27.setMaximumIntegerDigits((-1));
        java.util.Currency currency30 = numberFormat27.getCurrency();
        org.apache.commons.math.fraction.FractionFormat fractionFormat31 = new org.apache.commons.math.fraction.FractionFormat(numberFormat27);
        boolean boolean32 = parsePosition23.equals((java.lang.Object) fractionFormat31);
        java.lang.Object obj33 = numberFormat0.parseObject("0 / 1", parsePosition23);
        java.util.Locale locale35 = java.util.Locale.ROOT;
        org.apache.commons.math.fraction.FractionFormat fractionFormat36 = org.apache.commons.math.fraction.FractionFormat.getProperInstance(locale35);
        java.text.ParsePosition parsePosition39 = new java.text.ParsePosition((int) (short) 10);
        parsePosition39.setErrorIndex((int) (byte) 1);
        java.lang.Object obj42 = fractionFormat36.parseObject("United Kingdom", parsePosition39);
        java.text.NumberFormat numberFormat43 = java.text.NumberFormat.getPercentInstance();
        java.text.ParsePosition parsePosition46 = new java.text.ParsePosition((int) (short) 10);
        java.lang.Object obj47 = numberFormat43.parseObject("hi!", parsePosition46);
        fractionFormat36.setDenominatorFormat(numberFormat43);
        java.text.NumberFormat numberFormat50 = java.text.NumberFormat.getPercentInstance();
        java.text.ParsePosition parsePosition53 = new java.text.ParsePosition((int) (short) 10);
        java.lang.Object obj54 = numberFormat50.parseObject("hi!", parsePosition53);
        parsePosition53.setErrorIndex(10);
        org.apache.commons.math.fraction.Fraction fraction57 = fractionFormat36.parse("coreano", parsePosition53);
        java.lang.Object obj58 = numberFormat0.parseObject("en-GB", parsePosition53);
        int int59 = numberFormat0.getMinimumFractionDigits();
        int int60 = numberFormat0.getMaximumFractionDigits();
        org.apache.commons.math.fraction.FractionFormat fractionFormat61 = new org.apache.commons.math.fraction.FractionFormat(numberFormat0);
        java.util.Locale locale64 = new java.util.Locale("French");
        java.util.Locale locale65 = locale64.stripExtensions();
        java.text.NumberFormat numberFormat66 = java.text.NumberFormat.getIntegerInstance(locale64);
        java.util.Locale locale67 = java.util.Locale.ROOT;
        org.apache.commons.math.fraction.FractionFormat fractionFormat68 = org.apache.commons.math.fraction.FractionFormat.getProperInstance(locale67);
        java.text.NumberFormat numberFormat69 = fractionFormat68.getNumeratorFormat();
        java.text.NumberFormat numberFormat70 = fractionFormat68.getNumeratorFormat();
        numberFormat70.setGroupingUsed(true);
        org.apache.commons.math.fraction.FractionFormat fractionFormat73 = new org.apache.commons.math.fraction.FractionFormat(numberFormat66, numberFormat70);
        java.text.NumberFormat numberFormat75 = java.text.NumberFormat.getPercentInstance();
        numberFormat75.setMinimumIntegerDigits((int) (short) 10);
        java.util.Locale locale78 = java.util.Locale.KOREAN;
        java.util.Locale locale79 = java.util.Locale.KOREAN;
        java.lang.String str80 = locale78.getDisplayLanguage(locale79);
        boolean boolean81 = numberFormat75.equals((java.lang.Object) locale79);
        java.text.ParsePosition parsePosition84 = new java.text.ParsePosition((int) '4');
        java.lang.Object obj85 = numberFormat75.parseObject("China", parsePosition84);
        int int86 = parsePosition84.getErrorIndex();
        java.lang.String str87 = parsePosition84.toString();
        java.util.Locale.Builder builder88 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder90 = builder88.setVariant("");
        java.util.Locale.Builder builder91 = builder90.clearExtensions();
        java.util.Locale.Builder builder92 = builder90.clearExtensions();
        java.util.Locale.Builder builder93 = builder90.clearExtensions();
        boolean boolean94 = parsePosition84.equals((java.lang.Object) builder93);
        java.lang.String str95 = parsePosition84.toString();
        java.lang.Object obj96 = fractionFormat73.parseObject("", parsePosition84);
        parsePosition84.setErrorIndex((int) (byte) 10);
        java.lang.Object obj99 = fractionFormat61.parseObject("de_de", parsePosition84);
        org.junit.Assert.assertNotNull(numberFormat0);
        org.junit.Assert.assertNotNull(currency3);
        org.junit.Assert.assertEquals(currency3.toString(), "XXX");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertNotNull(numberFormat11);
        org.junit.Assert.assertNotNull(currency14);
        org.junit.Assert.assertEquals(currency14.toString(), "XXX");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10,000%" + "'", str17, "10,000%");
        org.junit.Assert.assertNotNull(fractionFormat18);
        org.junit.Assert.assertNotNull(numberFormat19);
        org.junit.Assert.assertNull(fraction26);
        org.junit.Assert.assertNotNull(numberFormat27);
        org.junit.Assert.assertNotNull(currency30);
        org.junit.Assert.assertEquals(currency30.toString(), "XXX");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "");
        org.junit.Assert.assertNotNull(fractionFormat36);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(numberFormat43);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(numberFormat50);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(fraction57);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertEquals(locale64.toString(), "french");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "french");
        org.junit.Assert.assertNotNull(numberFormat66);
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "");
        org.junit.Assert.assertNotNull(fractionFormat68);
        org.junit.Assert.assertNotNull(numberFormat69);
        org.junit.Assert.assertNotNull(numberFormat70);
        org.junit.Assert.assertNotNull(numberFormat75);
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "ko");
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str80, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 52 + "'", int86 == 52);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "java.text.ParsePosition[index=52,errorIndex=52]" + "'", str87, "java.text.ParsePosition[index=52,errorIndex=52]");
        org.junit.Assert.assertNotNull(builder90);
        org.junit.Assert.assertNotNull(builder91);
        org.junit.Assert.assertNotNull(builder92);
        org.junit.Assert.assertNotNull(builder93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "java.text.ParsePosition[index=52,errorIndex=52]" + "'", str95, "java.text.ParsePosition[index=52,errorIndex=52]");
        org.junit.Assert.assertNull(obj96);
        org.junit.Assert.assertNull(obj99);
    }

    @Test
    public void test16539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16539");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction3 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) 'u', (int) (byte) -1);
        int int4 = fraction3.intValue();
        org.apache.commons.math.fraction.Fraction fraction5 = fraction0.subtract(fraction3);
        java.util.Locale.LanguageRange[] languageRangeArray6 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList7 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7, languageRangeArray6);
        java.util.Locale locale9 = java.util.Locale.KOREAN;
        java.util.Locale locale10 = java.util.Locale.KOREAN;
        java.lang.String str11 = locale9.getDisplayLanguage(locale10);
        java.lang.String str12 = locale10.getScript();
        java.util.Locale locale13 = java.util.Locale.KOREAN;
        java.util.Locale locale14 = java.util.Locale.GERMANY;
        java.util.Locale[] localeArray15 = new java.util.Locale[] { locale10, locale13, locale14 };
        java.util.ArrayList<java.util.Locale> localeList16 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList16, localeArray15);
        java.util.Locale.FilteringMode filteringMode18 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList19 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.util.Locale>) localeList16, filteringMode18);
        boolean boolean20 = fraction5.equals((java.lang.Object) localeList19);
        org.apache.commons.math.fraction.Fraction fraction21 = fraction5.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction22 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction25 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) 'u', (int) (byte) -1);
        int int26 = fraction25.intValue();
        org.apache.commons.math.fraction.Fraction fraction27 = fraction22.subtract(fraction25);
        boolean boolean29 = fraction25.equals((java.lang.Object) 'x');
        org.apache.commons.math.fraction.Fraction fraction30 = fraction25.reciprocal();
        double double31 = fraction30.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction32 = fraction5.multiply(fraction30);
        double double33 = fraction5.doubleValue();
        int int34 = fraction5.intValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-117) + "'", int4 == (-117));
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(languageRangeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ko");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str11, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ko");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "de_DE");
        org.junit.Assert.assertNotNull(localeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + filteringMode18 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode18.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-117) + "'", int26 == (-117));
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-0.008547008547008548d) + "'", double31 == (-0.008547008547008548d));
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 117.0d + "'", double33 == 117.0d);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 117 + "'", int34 == 117);
    }

    @Test
    public void test16540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16540");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.util.Locale locale1 = java.util.Locale.KOREAN;
        java.lang.String str2 = locale0.getDisplayLanguage(locale1);
        java.text.NumberFormat numberFormat3 = java.text.NumberFormat.getNumberInstance(locale1);
        java.lang.Object obj4 = numberFormat3.clone();
        numberFormat3.setParseIntegerOnly(true);
        org.apache.commons.math.fraction.ProperFractionFormat properFractionFormat7 = new org.apache.commons.math.fraction.ProperFractionFormat(numberFormat3);
        java.text.NumberFormat.Field field9 = java.text.NumberFormat.Field.PERMILLE;
        java.text.FieldPosition fieldPosition11 = new java.text.FieldPosition((java.text.Format.Field) field9, (int) (short) 0);
        java.text.NumberFormat numberFormat12 = java.text.NumberFormat.getInstance();
        java.lang.String str14 = numberFormat12.format(100L);
        java.text.NumberFormat numberFormat16 = java.text.NumberFormat.getPercentInstance();
        java.text.ParsePosition parsePosition19 = new java.text.ParsePosition((int) (short) 10);
        java.lang.Object obj20 = numberFormat16.parseObject("hi!", parsePosition19);
        java.lang.Number number21 = numberFormat12.parse("10,000%", parsePosition19);
        boolean boolean22 = field9.equals((java.lang.Object) parsePosition19);
        int int23 = parsePosition19.getIndex();
        parsePosition19.setIndex(0);
        org.apache.commons.math.fraction.Fraction fraction26 = properFractionFormat7.parse("USA", parsePosition19);
        java.text.NumberFormat numberFormat27 = properFractionFormat7.getWholeFormat();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str2, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertNotNull(numberFormat3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(field9);
        org.junit.Assert.assertNotNull(numberFormat12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "100" + "'", str14, "100");
        org.junit.Assert.assertNotNull(numberFormat16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(number21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNull(fraction26);
        org.junit.Assert.assertNotNull(numberFormat27);
    }

    @Test
    public void test16541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16541");
        java.text.NumberFormat numberFormat0 = java.text.NumberFormat.getIntegerInstance();
        java.text.NumberFormat numberFormat1 = java.text.NumberFormat.getPercentInstance();
        numberFormat1.setMaximumIntegerDigits((-1));
        java.text.NumberFormat numberFormat4 = java.text.NumberFormat.getPercentInstance();
        java.text.NumberFormat numberFormat5 = java.text.NumberFormat.getPercentInstance();
        numberFormat5.setMaximumIntegerDigits((-1));
        java.util.Currency currency8 = numberFormat5.getCurrency();
        numberFormat4.setCurrency(currency8);
        numberFormat1.setCurrency(currency8);
        java.text.NumberFormat numberFormat11 = java.text.NumberFormat.getPercentInstance();
        numberFormat11.setMaximumIntegerDigits((-1));
        java.util.Currency currency14 = numberFormat11.getCurrency();
        java.lang.String str16 = numberFormat11.format((double) 10);
        org.apache.commons.math.fraction.ProperFractionFormat properFractionFormat17 = new org.apache.commons.math.fraction.ProperFractionFormat(numberFormat0, numberFormat1, numberFormat11);
        java.text.NumberFormat numberFormat19 = java.text.NumberFormat.getInstance();
        java.lang.String str21 = numberFormat19.format(100L);
        java.text.NumberFormat numberFormat23 = java.text.NumberFormat.getPercentInstance();
        java.text.ParsePosition parsePosition26 = new java.text.ParsePosition((int) (short) 10);
        java.lang.Object obj27 = numberFormat23.parseObject("hi!", parsePosition26);
        java.lang.Number number28 = numberFormat19.parse("10,000%", parsePosition26);
        int int29 = parsePosition26.getErrorIndex();
        java.lang.Object obj30 = properFractionFormat17.parseObject("French", parsePosition26);
        java.util.Locale locale32 = java.util.Locale.FRENCH;
        java.lang.String str33 = locale32.getDisplayLanguage();
        org.apache.commons.math.fraction.FractionFormat fractionFormat34 = org.apache.commons.math.fraction.FractionFormat.getProperInstance(locale32);
        java.text.NumberFormat numberFormat35 = fractionFormat34.getNumeratorFormat();
        java.text.ParsePosition parsePosition38 = new java.text.ParsePosition((int) (short) 10);
        parsePosition38.setErrorIndex((int) (byte) 1);
        parsePosition38.setErrorIndex(0);
        org.apache.commons.math.fraction.Fraction fraction43 = fractionFormat34.parse("French", parsePosition38);
        org.apache.commons.math.fraction.Fraction fraction44 = properFractionFormat17.parse("", parsePosition38);
        org.apache.commons.math.fraction.FractionFormat fractionFormat45 = org.apache.commons.math.fraction.FractionFormat.getImproperInstance();
        java.text.NumberFormat numberFormat46 = fractionFormat45.getNumeratorFormat();
        int int47 = numberFormat46.getMinimumFractionDigits();
        numberFormat46.setParseIntegerOnly(false);
        org.apache.commons.math.fraction.FractionFormat fractionFormat50 = new org.apache.commons.math.fraction.FractionFormat(numberFormat46);
        numberFormat46.setMaximumIntegerDigits((int) 'u');
        properFractionFormat17.setWholeFormat(numberFormat46);
        java.text.NumberFormat.Field field55 = java.text.NumberFormat.Field.PERMILLE;
        java.text.FieldPosition fieldPosition57 = new java.text.FieldPosition((java.text.Format.Field) field55, (int) (short) 0);
        java.text.NumberFormat numberFormat58 = java.text.NumberFormat.getInstance();
        java.lang.String str60 = numberFormat58.format(100L);
        java.text.NumberFormat numberFormat62 = java.text.NumberFormat.getPercentInstance();
        java.text.ParsePosition parsePosition65 = new java.text.ParsePosition((int) (short) 10);
        java.lang.Object obj66 = numberFormat62.parseObject("hi!", parsePosition65);
        java.lang.Number number67 = numberFormat58.parse("10,000%", parsePosition65);
        boolean boolean68 = field55.equals((java.lang.Object) parsePosition65);
        org.apache.commons.math.fraction.Fraction fraction69 = properFractionFormat17.parse("\ud504\ub791\uc2a4\uc5b4\ud504\ub791\uc2a4)", parsePosition65);
        java.text.NumberFormat numberFormat70 = properFractionFormat17.getWholeFormat();
        java.util.Locale locale71 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.Character> charSet72 = locale71.getExtensionKeys();
        java.text.NumberFormat numberFormat73 = java.text.NumberFormat.getInstance(locale71);
        numberFormat73.setParseIntegerOnly(true);
        java.text.NumberFormat numberFormat76 = java.text.NumberFormat.getPercentInstance();
        numberFormat76.setMaximumIntegerDigits((-1));
        java.math.RoundingMode roundingMode79 = numberFormat76.getRoundingMode();
        java.util.Locale locale80 = java.util.Locale.CANADA;
        java.lang.String str81 = locale80.getVariant();
        java.text.NumberFormat numberFormat82 = java.text.NumberFormat.getNumberInstance(locale80);
        org.apache.commons.math.fraction.ProperFractionFormat properFractionFormat83 = new org.apache.commons.math.fraction.ProperFractionFormat(numberFormat73, numberFormat76, numberFormat82);
        java.text.NumberFormat numberFormat84 = properFractionFormat83.getWholeFormat();
        properFractionFormat17.setNumeratorFormat(numberFormat84);
        java.lang.Object obj86 = numberFormat84.clone();
        org.junit.Assert.assertNotNull(numberFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(numberFormat5);
        org.junit.Assert.assertNotNull(currency8);
        org.junit.Assert.assertEquals(currency8.toString(), "XXX");
        org.junit.Assert.assertNotNull(numberFormat11);
        org.junit.Assert.assertNotNull(currency14);
        org.junit.Assert.assertEquals(currency14.toString(), "XXX");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0%" + "'", str16, "0%");
        org.junit.Assert.assertNotNull(numberFormat19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "100" + "'", str21, "100");
        org.junit.Assert.assertNotNull(numberFormat23);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(number28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\u6cd5\u6587" + "'", str33, "\u6cd5\u6587");
        org.junit.Assert.assertNotNull(fractionFormat34);
        org.junit.Assert.assertNotNull(numberFormat35);
        org.junit.Assert.assertNull(fraction43);
        org.junit.Assert.assertNull(fraction44);
        org.junit.Assert.assertNotNull(fractionFormat45);
        org.junit.Assert.assertNotNull(numberFormat46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(field55);
        org.junit.Assert.assertNotNull(numberFormat58);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "100" + "'", str60, "100");
        org.junit.Assert.assertNotNull(numberFormat62);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNull(number67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(fraction69);
        org.junit.Assert.assertNotNull(numberFormat70);
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "de_DE");
        org.junit.Assert.assertNotNull(charSet72);
        org.junit.Assert.assertNotNull(numberFormat73);
        org.junit.Assert.assertNotNull(numberFormat76);
        org.junit.Assert.assertTrue("'" + roundingMode79 + "' != '" + java.math.RoundingMode.HALF_EVEN + "'", roundingMode79.equals(java.math.RoundingMode.HALF_EVEN));
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertNotNull(numberFormat82);
        org.junit.Assert.assertNotNull(numberFormat84);
        org.junit.Assert.assertNotNull(obj86);
    }

    @Test
    public void test16542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16542");
        java.text.NumberFormat numberFormat0 = java.text.NumberFormat.getIntegerInstance();
        java.text.NumberFormat numberFormat1 = java.text.NumberFormat.getPercentInstance();
        numberFormat1.setMaximumIntegerDigits((-1));
        java.text.NumberFormat numberFormat4 = java.text.NumberFormat.getPercentInstance();
        java.text.NumberFormat numberFormat5 = java.text.NumberFormat.getPercentInstance();
        numberFormat5.setMaximumIntegerDigits((-1));
        java.util.Currency currency8 = numberFormat5.getCurrency();
        numberFormat4.setCurrency(currency8);
        numberFormat1.setCurrency(currency8);
        java.text.NumberFormat numberFormat11 = java.text.NumberFormat.getPercentInstance();
        numberFormat11.setMaximumIntegerDigits((-1));
        java.util.Currency currency14 = numberFormat11.getCurrency();
        java.lang.String str16 = numberFormat11.format((double) 10);
        org.apache.commons.math.fraction.ProperFractionFormat properFractionFormat17 = new org.apache.commons.math.fraction.ProperFractionFormat(numberFormat0, numberFormat1, numberFormat11);
        java.text.NumberFormat numberFormat19 = java.text.NumberFormat.getInstance();
        java.lang.String str21 = numberFormat19.format(100L);
        java.text.NumberFormat numberFormat23 = java.text.NumberFormat.getPercentInstance();
        java.text.ParsePosition parsePosition26 = new java.text.ParsePosition((int) (short) 10);
        java.lang.Object obj27 = numberFormat23.parseObject("hi!", parsePosition26);
        java.lang.Number number28 = numberFormat19.parse("10,000%", parsePosition26);
        int int29 = parsePosition26.getErrorIndex();
        java.lang.Object obj30 = properFractionFormat17.parseObject("French", parsePosition26);
        java.util.Locale locale32 = java.util.Locale.FRENCH;
        java.lang.String str33 = locale32.getDisplayLanguage();
        org.apache.commons.math.fraction.FractionFormat fractionFormat34 = org.apache.commons.math.fraction.FractionFormat.getProperInstance(locale32);
        java.text.NumberFormat numberFormat35 = fractionFormat34.getNumeratorFormat();
        java.text.ParsePosition parsePosition38 = new java.text.ParsePosition((int) (short) 10);
        parsePosition38.setErrorIndex((int) (byte) 1);
        parsePosition38.setErrorIndex(0);
        org.apache.commons.math.fraction.Fraction fraction43 = fractionFormat34.parse("French", parsePosition38);
        org.apache.commons.math.fraction.Fraction fraction44 = properFractionFormat17.parse("", parsePosition38);
        java.util.Locale locale45 = java.util.Locale.KOREAN;
        java.util.Locale locale46 = java.util.Locale.KOREAN;
        java.lang.String str47 = locale45.getDisplayLanguage(locale46);
        java.text.NumberFormat numberFormat48 = java.text.NumberFormat.getNumberInstance(locale46);
        java.lang.Object obj49 = numberFormat48.clone();
        properFractionFormat17.setWholeFormat(numberFormat48);
        java.util.Locale locale51 = java.util.Locale.KOREAN;
        java.util.Locale locale52 = java.util.Locale.KOREAN;
        java.util.Locale locale53 = java.util.Locale.KOREAN;
        java.lang.String str54 = locale52.getDisplayLanguage(locale53);
        java.lang.String str55 = locale52.getISO3Language();
        java.lang.String str56 = locale51.getDisplayCountry(locale52);
        java.lang.String str57 = locale52.toLanguageTag();
        java.text.NumberFormat numberFormat58 = java.text.NumberFormat.getCurrencyInstance(locale52);
        boolean boolean59 = numberFormat58.isParseIntegerOnly();
        properFractionFormat17.setDenominatorFormat(numberFormat58);
        java.text.NumberFormat numberFormat61 = java.text.NumberFormat.getPercentInstance();
        numberFormat61.setMaximumIntegerDigits((-1));
        java.text.NumberFormat numberFormat64 = java.text.NumberFormat.getPercentInstance();
        java.text.NumberFormat numberFormat65 = java.text.NumberFormat.getPercentInstance();
        numberFormat65.setMaximumIntegerDigits((-1));
        java.util.Currency currency68 = numberFormat65.getCurrency();
        numberFormat64.setCurrency(currency68);
        numberFormat61.setCurrency(currency68);
        boolean boolean71 = numberFormat61.isParseIntegerOnly();
        properFractionFormat17.setWholeFormat(numberFormat61);
        java.text.NumberFormat numberFormat73 = properFractionFormat17.getWholeFormat();
        org.apache.commons.math.fraction.FractionFormat fractionFormat74 = new org.apache.commons.math.fraction.FractionFormat(numberFormat73);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction76 = fractionFormat74.parse("java.text.FieldPosition[field=9,attribute=java.text.NumberFormat$Field(sign),beginIndex=0,endIndex=0]");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable fraction number: \"java.text.FieldPosition[field=9,attribute=java.text.NumberFormat$Field(sign),beginIndex=0,endIndex=0]\"");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(numberFormat5);
        org.junit.Assert.assertNotNull(currency8);
        org.junit.Assert.assertEquals(currency8.toString(), "XXX");
        org.junit.Assert.assertNotNull(numberFormat11);
        org.junit.Assert.assertNotNull(currency14);
        org.junit.Assert.assertEquals(currency14.toString(), "XXX");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0%" + "'", str16, "0%");
        org.junit.Assert.assertNotNull(numberFormat19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "100" + "'", str21, "100");
        org.junit.Assert.assertNotNull(numberFormat23);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(number28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\u6cd5\u6587" + "'", str33, "\u6cd5\u6587");
        org.junit.Assert.assertNotNull(fractionFormat34);
        org.junit.Assert.assertNotNull(numberFormat35);
        org.junit.Assert.assertNull(fraction43);
        org.junit.Assert.assertNull(fraction44);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "ko");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str47, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertNotNull(numberFormat48);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "ko");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "ko");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str54, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "kor" + "'", str55, "kor");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "ko" + "'", str57, "ko");
        org.junit.Assert.assertNotNull(numberFormat58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(numberFormat61);
        org.junit.Assert.assertNotNull(numberFormat64);
        org.junit.Assert.assertNotNull(numberFormat65);
        org.junit.Assert.assertNotNull(currency68);
        org.junit.Assert.assertEquals(currency68.toString(), "XXX");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(numberFormat73);
    }

    @Test
    public void test16543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16543");
        java.text.NumberFormat numberFormat0 = java.text.NumberFormat.getPercentInstance();
        numberFormat0.setMaximumIntegerDigits((-1));
        numberFormat0.setMaximumIntegerDigits((int) (short) 100);
        numberFormat0.setMinimumFractionDigits((int) (short) 0);
        org.apache.commons.math.fraction.FractionFormat fractionFormat7 = new org.apache.commons.math.fraction.FractionFormat(numberFormat0);
        java.math.RoundingMode roundingMode8 = numberFormat0.getRoundingMode();
        numberFormat0.setGroupingUsed(true);
        org.apache.commons.math.fraction.ProperFractionFormat properFractionFormat11 = new org.apache.commons.math.fraction.ProperFractionFormat(numberFormat0);
        java.text.NumberFormat numberFormat12 = properFractionFormat11.getDenominatorFormat();
        java.text.NumberFormat numberFormat13 = properFractionFormat11.getWholeFormat();
        java.text.NumberFormat numberFormat14 = properFractionFormat11.getNumeratorFormat();
        numberFormat14.setMaximumIntegerDigits((int) (byte) -32);
        numberFormat14.setMinimumIntegerDigits((int) (short) 4369);
        org.junit.Assert.assertNotNull(numberFormat0);
        org.junit.Assert.assertTrue("'" + roundingMode8 + "' != '" + java.math.RoundingMode.HALF_EVEN + "'", roundingMode8.equals(java.math.RoundingMode.HALF_EVEN));
        org.junit.Assert.assertNotNull(numberFormat12);
        org.junit.Assert.assertNotNull(numberFormat13);
        org.junit.Assert.assertNotNull(numberFormat14);
    }

    @Test
    public void test16544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16544");
        org.apache.commons.math.fraction.FractionFormat fractionFormat0 = org.apache.commons.math.fraction.FractionFormat.getImproperInstance();
        java.text.NumberFormat numberFormat1 = fractionFormat0.getNumeratorFormat();
        java.text.NumberFormat numberFormat2 = fractionFormat0.getNumeratorFormat();
        java.text.ParseException parseException5 = new java.text.ParseException("java.text.FieldPosition[field=0,attribute=java.text.NumberFormat$Field(per mille),beginIndex=0,endIndex=0]", 0);
        java.lang.Throwable[] throwableArray6 = parseException5.getSuppressed();
        boolean boolean7 = numberFormat2.equals((java.lang.Object) throwableArray6);
        numberFormat2.setMaximumFractionDigits((int) '#');
        org.apache.commons.math.fraction.ProperFractionFormat properFractionFormat10 = new org.apache.commons.math.fraction.ProperFractionFormat(numberFormat2);
        java.text.NumberFormat numberFormat11 = properFractionFormat10.getWholeFormat();
        java.text.NumberFormat numberFormat12 = properFractionFormat10.getDenominatorFormat();
        java.util.Locale locale14 = java.util.Locale.ROOT;
        org.apache.commons.math.fraction.FractionFormat fractionFormat15 = org.apache.commons.math.fraction.FractionFormat.getProperInstance(locale14);
        java.text.NumberFormat numberFormat16 = fractionFormat15.getNumeratorFormat();
        java.text.NumberFormat numberFormat17 = fractionFormat15.getNumeratorFormat();
        int int18 = numberFormat17.getMinimumIntegerDigits();
        numberFormat17.setMaximumIntegerDigits((int) ' ');
        java.lang.Object obj21 = numberFormat17.clone();
        java.text.ParsePosition parsePosition24 = new java.text.ParsePosition((int) (short) 10);
        java.lang.Number number25 = numberFormat17.parse("\uc911\uad6d\uc5b4\ub300\ub9cc)", parsePosition24);
        parsePosition24.setIndex(9);
        org.apache.commons.math.fraction.Fraction fraction28 = properFractionFormat10.parse("java.text.ParsePosition[index=10,errorIndex=10]", parsePosition24);
        org.junit.Assert.assertNotNull(fractionFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertNotNull(numberFormat2);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(numberFormat11);
        org.junit.Assert.assertNotNull(numberFormat12);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNotNull(fractionFormat15);
        org.junit.Assert.assertNotNull(numberFormat16);
        org.junit.Assert.assertNotNull(numberFormat17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNull(number25);
        org.junit.Assert.assertNull(fraction28);
    }

    @Test
    public void test16545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16545");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        java.util.Locale.setDefault(locale0);
        java.util.Set<java.lang.String> strSet2 = locale0.getUnicodeLocaleAttributes();
        org.apache.commons.math.fraction.FractionFormat fractionFormat3 = org.apache.commons.math.fraction.FractionFormat.getImproperInstance(locale0);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(fractionFormat3);
    }

    @Test
    public void test16546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16546");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.text.NumberFormat numberFormat1 = java.text.NumberFormat.getNumberInstance(locale0);
        java.util.Locale locale2 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale3 = java.util.Locale.CANADA;
        java.lang.String str4 = locale3.getDisplayCountry();
        java.lang.String str5 = locale2.getDisplayCountry(locale3);
        java.lang.String str6 = locale3.getISO3Country();
        java.lang.String str7 = locale0.getDisplayVariant(locale3);
        java.util.Locale locale8 = java.util.Locale.UK;
        java.util.Locale locale9 = java.util.Locale.KOREAN;
        java.util.Locale locale10 = java.util.Locale.KOREAN;
        java.lang.String str11 = locale9.getDisplayLanguage(locale10);
        java.lang.String str12 = locale8.getDisplayScript(locale10);
        java.lang.String str13 = locale10.toLanguageTag();
        java.lang.String str14 = locale3.getDisplayScript(locale10);
        java.lang.String str15 = locale3.getDisplayName();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u30ab\u30ca\u30c0" + "'", str4, "\u30ab\u30ca\u30c0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "China" + "'", str5, "China");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CAN" + "'", str6, "CAN");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ko");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str11, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ko" + "'", str13, "ko");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u82f1\u8a9e\u30ab\u30ca\u30c0)" + "'", str15, "\u82f1\u8a9e\u30ab\u30ca\u30c0)");
    }

    @Test
    public void test16547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16547");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.KOREAN;
        java.util.Locale locale2 = java.util.Locale.KOREAN;
        java.lang.String str3 = locale1.getDisplayLanguage(locale2);
        java.lang.String str4 = locale2.getScript();
        java.util.Locale.setDefault(category0, locale2);
        java.util.Locale locale6 = java.util.Locale.CHINESE;
        java.text.NumberFormat numberFormat7 = java.text.NumberFormat.getPercentInstance(locale6);
        java.text.NumberFormat numberFormat8 = java.text.NumberFormat.getNumberInstance(locale6);
        java.util.Locale.setDefault(category0, locale6);
        java.util.Locale locale10 = java.util.Locale.getDefault(category0);
        java.text.NumberFormat numberFormat11 = java.text.NumberFormat.getPercentInstance(locale10);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str3, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh");
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertNotNull(numberFormat8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh");
        org.junit.Assert.assertNotNull(numberFormat11);
    }

    @Test
    public void test16548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16548");
        java.text.NumberFormat numberFormat0 = java.text.NumberFormat.getIntegerInstance();
        java.text.NumberFormat numberFormat1 = java.text.NumberFormat.getPercentInstance();
        numberFormat1.setMaximumIntegerDigits((-1));
        java.text.NumberFormat numberFormat4 = java.text.NumberFormat.getPercentInstance();
        java.text.NumberFormat numberFormat5 = java.text.NumberFormat.getPercentInstance();
        numberFormat5.setMaximumIntegerDigits((-1));
        java.util.Currency currency8 = numberFormat5.getCurrency();
        numberFormat4.setCurrency(currency8);
        numberFormat1.setCurrency(currency8);
        java.text.NumberFormat numberFormat11 = java.text.NumberFormat.getPercentInstance();
        numberFormat11.setMaximumIntegerDigits((-1));
        java.util.Currency currency14 = numberFormat11.getCurrency();
        java.lang.String str16 = numberFormat11.format((double) 10);
        org.apache.commons.math.fraction.ProperFractionFormat properFractionFormat17 = new org.apache.commons.math.fraction.ProperFractionFormat(numberFormat0, numberFormat1, numberFormat11);
        java.text.NumberFormat numberFormat18 = java.text.NumberFormat.getInstance();
        java.lang.String str20 = numberFormat18.format(100L);
        properFractionFormat17.setWholeFormat(numberFormat18);
        java.text.NumberFormat numberFormat22 = properFractionFormat17.getWholeFormat();
        org.apache.commons.math.fraction.FractionFormat fractionFormat23 = org.apache.commons.math.fraction.FractionFormat.getImproperInstance();
        java.text.NumberFormat numberFormat24 = fractionFormat23.getNumeratorFormat();
        java.text.NumberFormat numberFormat25 = fractionFormat23.getNumeratorFormat();
        java.text.ParseException parseException28 = new java.text.ParseException("java.text.FieldPosition[field=0,attribute=java.text.NumberFormat$Field(per mille),beginIndex=0,endIndex=0]", 0);
        java.lang.Throwable[] throwableArray29 = parseException28.getSuppressed();
        boolean boolean30 = numberFormat25.equals((java.lang.Object) throwableArray29);
        numberFormat25.setMaximumFractionDigits((int) '#');
        org.apache.commons.math.fraction.ProperFractionFormat properFractionFormat33 = new org.apache.commons.math.fraction.ProperFractionFormat(numberFormat25);
        java.text.NumberFormat numberFormat34 = properFractionFormat33.getWholeFormat();
        properFractionFormat17.setWholeFormat(numberFormat34);
        java.text.NumberFormat numberFormat36 = properFractionFormat17.getNumeratorFormat();
        org.apache.commons.math.fraction.ProperFractionFormat properFractionFormat37 = new org.apache.commons.math.fraction.ProperFractionFormat(numberFormat36);
        java.text.NumberFormat numberFormat38 = properFractionFormat37.getWholeFormat();
        java.text.NumberFormat numberFormat40 = java.text.NumberFormat.getCurrencyInstance();
        numberFormat40.setMinimumIntegerDigits((-1));
        java.lang.String str44 = numberFormat40.format((double) 100);
        java.text.ParsePosition parsePosition47 = new java.text.ParsePosition((int) '4');
        int int48 = parsePosition47.getErrorIndex();
        int int49 = parsePosition47.getIndex();
        java.lang.Object obj50 = numberFormat40.parseObject("Canada", parsePosition47);
        org.apache.commons.math.fraction.Fraction fraction51 = properFractionFormat37.parse("-13.572", parsePosition47);
        org.junit.Assert.assertNotNull(numberFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(numberFormat5);
        org.junit.Assert.assertNotNull(currency8);
        org.junit.Assert.assertEquals(currency8.toString(), "JPY");
        org.junit.Assert.assertNotNull(numberFormat11);
        org.junit.Assert.assertNotNull(currency14);
        org.junit.Assert.assertEquals(currency14.toString(), "JPY");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0%" + "'", str16, "0%");
        org.junit.Assert.assertNotNull(numberFormat18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "100" + "'", str20, "100");
        org.junit.Assert.assertNotNull(numberFormat22);
        org.junit.Assert.assertNotNull(fractionFormat23);
        org.junit.Assert.assertNotNull(numberFormat24);
        org.junit.Assert.assertNotNull(numberFormat25);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(numberFormat34);
        org.junit.Assert.assertNotNull(numberFormat36);
        org.junit.Assert.assertNotNull(numberFormat38);
        org.junit.Assert.assertNotNull(numberFormat40);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\uffe5100" + "'", str44, "\uffe5100");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 52 + "'", int49 == 52);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(fraction51);
    }

    @Test
    public void test16549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16549");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.lang.String str1 = locale0.getScript();
        java.lang.String str2 = locale0.getDisplayScript();
        java.lang.String str3 = locale0.getDisplayLanguage();
        java.text.NumberFormat numberFormat4 = java.text.NumberFormat.getInstance(locale0);
        org.apache.commons.math.fraction.ProperFractionFormat properFractionFormat5 = new org.apache.commons.math.fraction.ProperFractionFormat(numberFormat4);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u82f1\u6587" + "'", str3, "\u82f1\u6587");
        org.junit.Assert.assertNotNull(numberFormat4);
    }

    @Test
    public void test16550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16550");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.KOREAN;
        java.util.Locale locale2 = java.util.Locale.KOREAN;
        java.lang.String str3 = locale1.getDisplayLanguage(locale2);
        java.lang.String str4 = locale2.getScript();
        java.lang.String str5 = locale2.getVariant();
        java.util.Locale.setDefault(category0, locale2);
        java.lang.String str7 = locale2.getDisplayName();
        java.text.NumberFormat numberFormat8 = java.text.NumberFormat.getIntegerInstance(locale2);
        java.text.NumberFormat numberFormat9 = java.text.NumberFormat.getIntegerInstance();
        java.text.NumberFormat numberFormat10 = java.text.NumberFormat.getPercentInstance();
        numberFormat10.setMaximumIntegerDigits((-1));
        java.text.NumberFormat numberFormat13 = java.text.NumberFormat.getPercentInstance();
        java.text.NumberFormat numberFormat14 = java.text.NumberFormat.getPercentInstance();
        numberFormat14.setMaximumIntegerDigits((-1));
        java.util.Currency currency17 = numberFormat14.getCurrency();
        numberFormat13.setCurrency(currency17);
        numberFormat10.setCurrency(currency17);
        java.text.NumberFormat numberFormat20 = java.text.NumberFormat.getPercentInstance();
        numberFormat20.setMaximumIntegerDigits((-1));
        java.util.Currency currency23 = numberFormat20.getCurrency();
        java.lang.String str25 = numberFormat20.format((double) 10);
        org.apache.commons.math.fraction.ProperFractionFormat properFractionFormat26 = new org.apache.commons.math.fraction.ProperFractionFormat(numberFormat9, numberFormat10, numberFormat20);
        java.text.NumberFormat numberFormat28 = java.text.NumberFormat.getInstance();
        java.lang.String str30 = numberFormat28.format(100L);
        java.text.NumberFormat numberFormat32 = java.text.NumberFormat.getPercentInstance();
        java.text.ParsePosition parsePosition35 = new java.text.ParsePosition((int) (short) 10);
        java.lang.Object obj36 = numberFormat32.parseObject("hi!", parsePosition35);
        java.lang.Number number37 = numberFormat28.parse("10,000%", parsePosition35);
        int int38 = parsePosition35.getErrorIndex();
        java.lang.Object obj39 = properFractionFormat26.parseObject("French", parsePosition35);
        java.util.Locale locale41 = java.util.Locale.FRENCH;
        java.lang.String str42 = locale41.getDisplayLanguage();
        org.apache.commons.math.fraction.FractionFormat fractionFormat43 = org.apache.commons.math.fraction.FractionFormat.getProperInstance(locale41);
        java.text.NumberFormat numberFormat44 = fractionFormat43.getNumeratorFormat();
        java.text.ParsePosition parsePosition47 = new java.text.ParsePosition((int) (short) 10);
        parsePosition47.setErrorIndex((int) (byte) 1);
        parsePosition47.setErrorIndex(0);
        org.apache.commons.math.fraction.Fraction fraction52 = fractionFormat43.parse("French", parsePosition47);
        org.apache.commons.math.fraction.Fraction fraction53 = properFractionFormat26.parse("", parsePosition47);
        java.util.Locale locale54 = java.util.Locale.KOREAN;
        java.util.Locale locale55 = java.util.Locale.KOREAN;
        java.lang.String str56 = locale54.getDisplayLanguage(locale55);
        java.text.NumberFormat numberFormat57 = java.text.NumberFormat.getNumberInstance(locale55);
        java.lang.Object obj58 = numberFormat57.clone();
        properFractionFormat26.setWholeFormat(numberFormat57);
        java.util.Locale locale60 = java.util.Locale.KOREAN;
        java.util.Locale locale61 = java.util.Locale.KOREAN;
        java.util.Locale locale62 = java.util.Locale.KOREAN;
        java.lang.String str63 = locale61.getDisplayLanguage(locale62);
        java.lang.String str64 = locale61.getISO3Language();
        java.lang.String str65 = locale60.getDisplayCountry(locale61);
        java.lang.String str66 = locale61.toLanguageTag();
        java.text.NumberFormat numberFormat67 = java.text.NumberFormat.getCurrencyInstance(locale61);
        boolean boolean68 = numberFormat67.isParseIntegerOnly();
        properFractionFormat26.setDenominatorFormat(numberFormat67);
        boolean boolean70 = numberFormat67.isParseIntegerOnly();
        org.apache.commons.math.fraction.FractionFormat fractionFormat71 = new org.apache.commons.math.fraction.FractionFormat(numberFormat8, numberFormat67);
        java.text.NumberFormat numberFormat72 = fractionFormat71.getDenominatorFormat();
        java.lang.Object obj73 = numberFormat72.clone();
        int int74 = numberFormat72.getMinimumFractionDigits();
        int int75 = numberFormat72.getMaximumFractionDigits();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str3, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str7, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertNotNull(numberFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertNotNull(numberFormat13);
        org.junit.Assert.assertNotNull(numberFormat14);
        org.junit.Assert.assertNotNull(currency17);
        org.junit.Assert.assertEquals(currency17.toString(), "JPY");
        org.junit.Assert.assertNotNull(numberFormat20);
        org.junit.Assert.assertNotNull(currency23);
        org.junit.Assert.assertEquals(currency23.toString(), "JPY");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "0%" + "'", str25, "0%");
        org.junit.Assert.assertNotNull(numberFormat28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "100" + "'", str30, "100");
        org.junit.Assert.assertNotNull(numberFormat32);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(number37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\ud504\ub791\uc2a4\uc5b4" + "'", str42, "\ud504\ub791\uc2a4\uc5b4");
        org.junit.Assert.assertNotNull(fractionFormat43);
        org.junit.Assert.assertNotNull(numberFormat44);
        org.junit.Assert.assertNull(fraction52);
        org.junit.Assert.assertNull(fraction53);
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "ko");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str56, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertNotNull(numberFormat57);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "ko");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "ko");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str63, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "kor" + "'", str64, "kor");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "ko" + "'", str66, "ko");
        org.junit.Assert.assertNotNull(numberFormat67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(numberFormat72);
        org.junit.Assert.assertNotNull(obj73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 2 + "'", int74 == 2);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 2 + "'", int75 == 2);
    }

    @Test
    public void test16551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16551");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.util.Locale locale1 = java.util.Locale.KOREAN;
        java.lang.String str2 = locale0.getDisplayLanguage(locale1);
        java.lang.String str3 = locale0.getISO3Language();
        java.lang.String str4 = locale0.getScript();
        org.apache.commons.math.fraction.FractionFormat fractionFormat5 = org.apache.commons.math.fraction.FractionFormat.getProperInstance(locale0);
        java.text.NumberFormat numberFormat6 = java.text.NumberFormat.getInstance(locale0);
        java.lang.String str7 = locale0.getDisplayName();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str2, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "kor" + "'", str3, "kor");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(fractionFormat5);
        org.junit.Assert.assertNotNull(numberFormat6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str7, "\ud55c\uad6d\uc5b4");
    }

    @Test
    public void test16552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16552");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.util.Locale locale1 = java.util.Locale.KOREAN;
        java.util.Locale locale2 = java.util.Locale.KOREAN;
        java.lang.String str3 = locale1.getDisplayLanguage(locale2);
        java.lang.String str4 = locale0.getDisplayScript(locale2);
        org.apache.commons.math.fraction.FractionFormat fractionFormat5 = org.apache.commons.math.fraction.FractionFormat.getProperInstance(locale2);
        java.util.Locale locale8 = new java.util.Locale("\uc774\ud0c8\ub9ac\uc544\uc5b4", "10.000%");
        org.apache.commons.math.fraction.FractionFormat fractionFormat9 = org.apache.commons.math.fraction.FractionFormat.getImproperInstance(locale8);
        java.text.NumberFormat numberFormat10 = java.text.NumberFormat.getCurrencyInstance(locale8);
        fractionFormat5.setNumeratorFormat(numberFormat10);
        numberFormat10.setGroupingUsed(false);
        numberFormat10.setGroupingUsed(false);
        java.util.Currency currency16 = numberFormat10.getCurrency();
        java.text.NumberFormat numberFormat17 = java.text.NumberFormat.getPercentInstance();
        numberFormat17.setMaximumIntegerDigits((-1));
        java.util.Currency currency20 = numberFormat17.getCurrency();
        org.apache.commons.math.fraction.FractionFormat fractionFormat21 = new org.apache.commons.math.fraction.FractionFormat(numberFormat17);
        java.text.NumberFormat numberFormat22 = fractionFormat21.getNumeratorFormat();
        java.text.AttributedCharacterIterator.Attribute attribute23 = java.text.AttributedCharacterIterator.Attribute.LANGUAGE;
        java.util.Locale locale24 = java.util.Locale.TAIWAN;
        java.text.NumberFormat numberFormat25 = java.text.NumberFormat.getCurrencyInstance(locale24);
        boolean boolean26 = attribute23.equals((java.lang.Object) numberFormat25);
        int int27 = numberFormat25.getMinimumIntegerDigits();
        fractionFormat21.setNumeratorFormat(numberFormat25);
        int int29 = numberFormat25.getMaximumIntegerDigits();
        java.text.NumberFormat numberFormat30 = java.text.NumberFormat.getIntegerInstance();
        java.text.NumberFormat numberFormat31 = java.text.NumberFormat.getPercentInstance();
        numberFormat31.setMaximumIntegerDigits((-1));
        java.text.NumberFormat numberFormat34 = java.text.NumberFormat.getPercentInstance();
        java.text.NumberFormat numberFormat35 = java.text.NumberFormat.getPercentInstance();
        numberFormat35.setMaximumIntegerDigits((-1));
        java.util.Currency currency38 = numberFormat35.getCurrency();
        numberFormat34.setCurrency(currency38);
        numberFormat31.setCurrency(currency38);
        java.text.NumberFormat numberFormat41 = java.text.NumberFormat.getPercentInstance();
        numberFormat41.setMaximumIntegerDigits((-1));
        java.util.Currency currency44 = numberFormat41.getCurrency();
        java.lang.String str46 = numberFormat41.format((double) 10);
        org.apache.commons.math.fraction.ProperFractionFormat properFractionFormat47 = new org.apache.commons.math.fraction.ProperFractionFormat(numberFormat30, numberFormat31, numberFormat41);
        java.text.NumberFormat numberFormat49 = java.text.NumberFormat.getInstance();
        java.lang.String str51 = numberFormat49.format(100L);
        java.text.NumberFormat numberFormat53 = java.text.NumberFormat.getPercentInstance();
        java.text.ParsePosition parsePosition56 = new java.text.ParsePosition((int) (short) 10);
        java.lang.Object obj57 = numberFormat53.parseObject("hi!", parsePosition56);
        java.lang.Number number58 = numberFormat49.parse("10,000%", parsePosition56);
        int int59 = parsePosition56.getErrorIndex();
        int int60 = parsePosition56.getIndex();
        org.apache.commons.math.fraction.Fraction fraction61 = properFractionFormat47.parse("French", parsePosition56);
        java.text.NumberFormat numberFormat63 = java.text.NumberFormat.getCurrencyInstance();
        java.text.NumberFormat numberFormat64 = java.text.NumberFormat.getPercentInstance();
        java.text.NumberFormat numberFormat65 = java.text.NumberFormat.getPercentInstance();
        numberFormat65.setMaximumIntegerDigits((-1));
        java.util.Currency currency68 = numberFormat65.getCurrency();
        numberFormat64.setCurrency(currency68);
        java.lang.String str71 = numberFormat64.format((double) 100);
        org.apache.commons.math.fraction.FractionFormat fractionFormat72 = org.apache.commons.math.fraction.FractionFormat.getImproperInstance();
        java.text.NumberFormat numberFormat73 = fractionFormat72.getNumeratorFormat();
        org.apache.commons.math.fraction.ProperFractionFormat properFractionFormat74 = new org.apache.commons.math.fraction.ProperFractionFormat(numberFormat63, numberFormat64, numberFormat73);
        java.text.NumberFormat numberFormat76 = java.text.NumberFormat.getPercentInstance();
        java.text.ParsePosition parsePosition79 = new java.text.ParsePosition((int) (short) 10);
        java.lang.Object obj80 = numberFormat76.parseObject("hi!", parsePosition79);
        java.lang.String str81 = parsePosition79.toString();
        org.apache.commons.math.fraction.Fraction fraction82 = properFractionFormat74.parse("\244 32.00", parsePosition79);
        org.apache.commons.math.fraction.Fraction fraction83 = properFractionFormat47.parse("\uc911\uad6d\uc5b4", parsePosition79);
        java.text.AttributedCharacterIterator.Attribute attribute84 = java.text.AttributedCharacterIterator.Attribute.LANGUAGE;
        java.util.Locale locale85 = java.util.Locale.TAIWAN;
        java.text.NumberFormat numberFormat86 = java.text.NumberFormat.getCurrencyInstance(locale85);
        boolean boolean87 = attribute84.equals((java.lang.Object) numberFormat86);
        int int88 = numberFormat86.getMinimumIntegerDigits();
        properFractionFormat47.setWholeFormat(numberFormat86);
        org.apache.commons.math.fraction.ProperFractionFormat properFractionFormat90 = new org.apache.commons.math.fraction.ProperFractionFormat(numberFormat10, numberFormat25, numberFormat86);
        numberFormat25.setGroupingUsed(false);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str3, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(fractionFormat5);
        org.junit.Assert.assertEquals(locale8.toString(), "\uc774\ud0c8\ub9ac\uc544\uc5b4_10.000%");
        org.junit.Assert.assertNotNull(fractionFormat9);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertNotNull(currency16);
        org.junit.Assert.assertEquals(currency16.toString(), "XXX");
        org.junit.Assert.assertNotNull(numberFormat17);
        org.junit.Assert.assertNotNull(currency20);
        org.junit.Assert.assertEquals(currency20.toString(), "JPY");
        org.junit.Assert.assertNotNull(numberFormat22);
        org.junit.Assert.assertNotNull(attribute23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(numberFormat25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertNotNull(numberFormat30);
        org.junit.Assert.assertNotNull(numberFormat31);
        org.junit.Assert.assertNotNull(numberFormat34);
        org.junit.Assert.assertNotNull(numberFormat35);
        org.junit.Assert.assertNotNull(currency38);
        org.junit.Assert.assertEquals(currency38.toString(), "JPY");
        org.junit.Assert.assertNotNull(numberFormat41);
        org.junit.Assert.assertNotNull(currency44);
        org.junit.Assert.assertEquals(currency44.toString(), "JPY");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "0%" + "'", str46, "0%");
        org.junit.Assert.assertNotNull(numberFormat49);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "100" + "'", str51, "100");
        org.junit.Assert.assertNotNull(numberFormat53);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(number58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 10 + "'", int59 == 10);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 10 + "'", int60 == 10);
        org.junit.Assert.assertNull(fraction61);
        org.junit.Assert.assertNotNull(numberFormat63);
        org.junit.Assert.assertNotNull(numberFormat64);
        org.junit.Assert.assertNotNull(numberFormat65);
        org.junit.Assert.assertNotNull(currency68);
        org.junit.Assert.assertEquals(currency68.toString(), "JPY");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "10,000%" + "'", str71, "10,000%");
        org.junit.Assert.assertNotNull(fractionFormat72);
        org.junit.Assert.assertNotNull(numberFormat73);
        org.junit.Assert.assertNotNull(numberFormat76);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "java.text.ParsePosition[index=10,errorIndex=10]" + "'", str81, "java.text.ParsePosition[index=10,errorIndex=10]");
        org.junit.Assert.assertNull(fraction82);
        org.junit.Assert.assertNull(fraction83);
        org.junit.Assert.assertNotNull(attribute84);
        org.junit.Assert.assertNotNull(locale85);
        org.junit.Assert.assertEquals(locale85.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(numberFormat86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
    }

    @Test
    public void test16553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16553");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) ' ', (double) (short) 10, (int) (byte) 0);
        org.apache.commons.math.fraction.Fraction fraction5 = new org.apache.commons.math.fraction.Fraction((double) 10);
        org.apache.commons.math.fraction.Fraction fraction6 = fraction5.abs();
        org.apache.commons.math.fraction.Fraction fraction7 = fraction3.multiply(fraction5);
        org.apache.commons.math.fraction.Fraction fraction10 = new org.apache.commons.math.fraction.Fraction(2, (int) ' ');
        org.apache.commons.math.fraction.Fraction fraction11 = fraction7.add(fraction10);
        org.apache.commons.math.fraction.Fraction fraction12 = fraction7.reciprocal();
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
    }

    @Test
    public void test16554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16554");
        java.text.NumberFormat numberFormat0 = java.text.NumberFormat.getCurrencyInstance();
        java.text.NumberFormat numberFormat1 = java.text.NumberFormat.getPercentInstance();
        java.text.NumberFormat numberFormat2 = java.text.NumberFormat.getPercentInstance();
        numberFormat2.setMaximumIntegerDigits((-1));
        java.util.Currency currency5 = numberFormat2.getCurrency();
        numberFormat1.setCurrency(currency5);
        java.lang.String str8 = numberFormat1.format((double) 100);
        org.apache.commons.math.fraction.FractionFormat fractionFormat9 = org.apache.commons.math.fraction.FractionFormat.getImproperInstance();
        java.text.NumberFormat numberFormat10 = fractionFormat9.getNumeratorFormat();
        org.apache.commons.math.fraction.ProperFractionFormat properFractionFormat11 = new org.apache.commons.math.fraction.ProperFractionFormat(numberFormat0, numberFormat1, numberFormat10);
        java.text.ParsePosition parsePosition14 = new java.text.ParsePosition((int) (short) 10);
        parsePosition14.setErrorIndex((int) (byte) 1);
        org.apache.commons.math.fraction.Fraction fraction17 = properFractionFormat11.parse("fran\347ais", parsePosition14);
        java.util.Locale locale18 = java.util.Locale.KOREAN;
        java.util.Locale locale19 = java.util.Locale.KOREAN;
        java.lang.String str20 = locale18.getDisplayLanguage(locale19);
        java.lang.String str21 = locale18.getISO3Language();
        java.lang.String str22 = locale18.getCountry();
        java.text.NumberFormat numberFormat23 = java.text.NumberFormat.getPercentInstance(locale18);
        java.util.Currency currency24 = numberFormat23.getCurrency();
        numberFormat23.setParseIntegerOnly(false);
        boolean boolean27 = parsePosition14.equals((java.lang.Object) false);
        parsePosition14.setIndex(116);
        java.lang.String str30 = parsePosition14.toString();
        java.lang.String str31 = parsePosition14.toString();
        org.junit.Assert.assertNotNull(numberFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertNotNull(numberFormat2);
        org.junit.Assert.assertNotNull(currency5);
        org.junit.Assert.assertEquals(currency5.toString(), "JPY");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10,000%" + "'", str8, "10,000%");
        org.junit.Assert.assertNotNull(fractionFormat9);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertNull(fraction17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "ko");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str20, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "kor" + "'", str21, "kor");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(numberFormat23);
        org.junit.Assert.assertNotNull(currency24);
        org.junit.Assert.assertEquals(currency24.toString(), "XXX");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "java.text.ParsePosition[index=116,errorIndex=9]" + "'", str30, "java.text.ParsePosition[index=116,errorIndex=9]");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "java.text.ParsePosition[index=116,errorIndex=9]" + "'", str31, "java.text.ParsePosition[index=116,errorIndex=9]");
    }

    @Test
    public void test16555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16555");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.lang.String str1 = locale0.getDisplayLanguage();
        org.apache.commons.math.fraction.FractionFormat fractionFormat2 = org.apache.commons.math.fraction.FractionFormat.getProperInstance(locale0);
        java.text.NumberFormat numberFormat3 = fractionFormat2.getNumeratorFormat();
        java.text.ParsePosition parsePosition6 = new java.text.ParsePosition((int) (short) 10);
        parsePosition6.setErrorIndex((int) (byte) 1);
        parsePosition6.setErrorIndex(0);
        org.apache.commons.math.fraction.Fraction fraction11 = fractionFormat2.parse("French", parsePosition6);
        java.text.NumberFormat numberFormat12 = fractionFormat2.getDenominatorFormat();
        int int13 = numberFormat12.getMinimumFractionDigits();
        int int14 = numberFormat12.getMaximumFractionDigits();
        org.apache.commons.math.fraction.ProperFractionFormat properFractionFormat15 = new org.apache.commons.math.fraction.ProperFractionFormat(numberFormat12);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\ud504\ub791\uc2a4\uc5b4" + "'", str1, "\ud504\ub791\uc2a4\uc5b4");
        org.junit.Assert.assertNotNull(fractionFormat2);
        org.junit.Assert.assertNotNull(numberFormat3);
        org.junit.Assert.assertNull(fraction11);
        org.junit.Assert.assertNotNull(numberFormat12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test16556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16556");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("CA");
    }

    @Test
    public void test16557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16557");
        java.text.ParseException parseException2 = new java.text.ParseException("java.text.FieldPosition[field=10,attribute=null,beginIndex=0,endIndex=0]", (int) (byte) -4);
        int int3 = parseException2.getErrorOffset();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-4) + "'", int3 == (-4));
    }

    @Test
    public void test16558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16558");
        java.text.NumberFormat numberFormat0 = java.text.NumberFormat.getInstance();
        java.util.Currency currency1 = numberFormat0.getCurrency();
        java.text.NumberFormat numberFormat2 = java.text.NumberFormat.getIntegerInstance();
        boolean boolean3 = numberFormat2.isGroupingUsed();
        numberFormat2.setParseIntegerOnly(false);
        java.util.Currency currency6 = numberFormat2.getCurrency();
        numberFormat0.setCurrency(currency6);
        java.util.Locale locale9 = java.util.Locale.KOREA;
        java.text.NumberFormat numberFormat10 = java.text.NumberFormat.getNumberInstance(locale9);
        java.text.NumberFormat numberFormat12 = java.text.NumberFormat.getPercentInstance();
        java.text.ParsePosition parsePosition15 = new java.text.ParsePosition((int) (short) 10);
        java.lang.Object obj16 = numberFormat12.parseObject("hi!", parsePosition15);
        java.lang.Object obj17 = numberFormat10.parseObject("java.text.FieldPosition[field=0,attribute=java.text.NumberFormat$Field(per mille),beginIndex=0,endIndex=0]", parsePosition15);
        java.lang.String str18 = parsePosition15.toString();
        java.lang.Object obj19 = numberFormat0.parseObject("java.text.parseposition[index=-1,errorindex=-1]", parsePosition15);
        org.junit.Assert.assertNotNull(numberFormat0);
        org.junit.Assert.assertNotNull(currency1);
        org.junit.Assert.assertEquals(currency1.toString(), "JPY");
        org.junit.Assert.assertNotNull(numberFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(currency6);
        org.junit.Assert.assertEquals(currency6.toString(), "JPY");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertNotNull(numberFormat12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java.text.ParsePosition[index=10,errorIndex=10]" + "'", str18, "java.text.ParsePosition[index=10,errorIndex=10]");
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test16559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16559");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        org.apache.commons.math.fraction.FractionFormat fractionFormat1 = org.apache.commons.math.fraction.FractionFormat.getProperInstance(locale0);
        java.text.NumberFormat numberFormat2 = java.text.NumberFormat.getPercentInstance();
        numberFormat2.setMaximumIntegerDigits((-1));
        java.util.Currency currency5 = numberFormat2.getCurrency();
        java.lang.String str7 = numberFormat2.format((double) 10);
        boolean boolean9 = numberFormat2.equals((java.lang.Object) "");
        fractionFormat1.setNumeratorFormat(numberFormat2);
        java.lang.Object obj11 = fractionFormat1.clone();
        java.text.NumberFormat numberFormat12 = fractionFormat1.getDenominatorFormat();
        int int13 = numberFormat12.getMaximumIntegerDigits();
        java.util.Locale locale15 = java.util.Locale.FRENCH;
        java.lang.String str16 = locale15.getDisplayLanguage();
        org.apache.commons.math.fraction.FractionFormat fractionFormat17 = org.apache.commons.math.fraction.FractionFormat.getProperInstance(locale15);
        java.text.NumberFormat numberFormat18 = fractionFormat17.getNumeratorFormat();
        java.text.ParsePosition parsePosition21 = new java.text.ParsePosition((int) (short) 10);
        parsePosition21.setErrorIndex((int) (byte) 1);
        parsePosition21.setErrorIndex(0);
        org.apache.commons.math.fraction.Fraction fraction26 = fractionFormat17.parse("French", parsePosition21);
        java.text.NumberFormat numberFormat27 = java.text.NumberFormat.getIntegerInstance();
        java.text.NumberFormat numberFormat28 = java.text.NumberFormat.getPercentInstance();
        numberFormat28.setMaximumIntegerDigits((-1));
        java.text.NumberFormat numberFormat31 = java.text.NumberFormat.getPercentInstance();
        java.text.NumberFormat numberFormat32 = java.text.NumberFormat.getPercentInstance();
        numberFormat32.setMaximumIntegerDigits((-1));
        java.util.Currency currency35 = numberFormat32.getCurrency();
        numberFormat31.setCurrency(currency35);
        numberFormat28.setCurrency(currency35);
        java.text.NumberFormat numberFormat38 = java.text.NumberFormat.getPercentInstance();
        numberFormat38.setMaximumIntegerDigits((-1));
        java.util.Currency currency41 = numberFormat38.getCurrency();
        java.lang.String str43 = numberFormat38.format((double) 10);
        org.apache.commons.math.fraction.ProperFractionFormat properFractionFormat44 = new org.apache.commons.math.fraction.ProperFractionFormat(numberFormat27, numberFormat28, numberFormat38);
        fractionFormat17.setDenominatorFormat(numberFormat38);
        java.text.NumberFormat numberFormat47 = java.text.NumberFormat.getPercentInstance();
        java.text.ParsePosition parsePosition50 = new java.text.ParsePosition((int) (short) 10);
        java.lang.Object obj51 = numberFormat47.parseObject("hi!", parsePosition50);
        parsePosition50.setErrorIndex(10);
        org.apache.commons.math.fraction.Fraction fraction54 = fractionFormat17.parse("anglais", parsePosition50);
        parsePosition50.setErrorIndex((-117));
        java.lang.Object obj57 = numberFormat12.parseObject("anglais (Canada)", parsePosition50);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertNotNull(fractionFormat1);
        org.junit.Assert.assertNotNull(numberFormat2);
        org.junit.Assert.assertNotNull(currency5);
        org.junit.Assert.assertEquals(currency5.toString(), "JPY");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0%" + "'", str7, "0%");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(numberFormat12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\ud504\ub791\uc2a4\uc5b4" + "'", str16, "\ud504\ub791\uc2a4\uc5b4");
        org.junit.Assert.assertNotNull(fractionFormat17);
        org.junit.Assert.assertNotNull(numberFormat18);
        org.junit.Assert.assertNull(fraction26);
        org.junit.Assert.assertNotNull(numberFormat27);
        org.junit.Assert.assertNotNull(numberFormat28);
        org.junit.Assert.assertNotNull(numberFormat31);
        org.junit.Assert.assertNotNull(numberFormat32);
        org.junit.Assert.assertNotNull(currency35);
        org.junit.Assert.assertEquals(currency35.toString(), "JPY");
        org.junit.Assert.assertNotNull(numberFormat38);
        org.junit.Assert.assertNotNull(currency41);
        org.junit.Assert.assertEquals(currency41.toString(), "JPY");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "0%" + "'", str43, "0%");
        org.junit.Assert.assertNotNull(numberFormat47);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(fraction54);
        org.junit.Assert.assertNull(obj57);
    }

    @Test
    public void test16560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16560");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.lang.String str1 = locale0.getDisplayCountry();
        java.text.NumberFormat numberFormat2 = java.text.NumberFormat.getCurrencyInstance(locale0);
        org.apache.commons.math.fraction.ProperFractionFormat properFractionFormat3 = new org.apache.commons.math.fraction.ProperFractionFormat(numberFormat2);
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.util.Locale locale5 = java.util.Locale.KOREAN;
        java.lang.String str6 = locale4.getDisplayLanguage(locale5);
        java.lang.String str7 = locale4.getISO3Language();
        java.lang.String str8 = locale4.getCountry();
        org.apache.commons.math.fraction.FractionFormat fractionFormat9 = org.apache.commons.math.fraction.FractionFormat.getImproperInstance(locale4);
        java.text.NumberFormat numberFormat10 = java.text.NumberFormat.getIntegerInstance();
        java.text.NumberFormat numberFormat11 = java.text.NumberFormat.getPercentInstance();
        numberFormat11.setMaximumIntegerDigits((-1));
        java.text.NumberFormat numberFormat14 = java.text.NumberFormat.getPercentInstance();
        java.text.NumberFormat numberFormat15 = java.text.NumberFormat.getPercentInstance();
        numberFormat15.setMaximumIntegerDigits((-1));
        java.util.Currency currency18 = numberFormat15.getCurrency();
        numberFormat14.setCurrency(currency18);
        numberFormat11.setCurrency(currency18);
        java.text.NumberFormat numberFormat21 = java.text.NumberFormat.getPercentInstance();
        numberFormat21.setMaximumIntegerDigits((-1));
        java.util.Currency currency24 = numberFormat21.getCurrency();
        java.lang.String str26 = numberFormat21.format((double) 10);
        org.apache.commons.math.fraction.ProperFractionFormat properFractionFormat27 = new org.apache.commons.math.fraction.ProperFractionFormat(numberFormat10, numberFormat11, numberFormat21);
        java.text.NumberFormat numberFormat28 = java.text.NumberFormat.getInstance();
        java.lang.String str30 = numberFormat28.format(100L);
        properFractionFormat27.setWholeFormat(numberFormat28);
        java.text.NumberFormat numberFormat32 = java.text.NumberFormat.getInstance();
        java.lang.String str34 = numberFormat32.format(100L);
        int int35 = numberFormat32.getMinimumFractionDigits();
        java.util.Locale locale36 = java.util.Locale.KOREAN;
        java.util.Locale locale37 = java.util.Locale.KOREAN;
        java.lang.String str38 = locale36.getDisplayLanguage(locale37);
        java.text.NumberFormat numberFormat39 = java.text.NumberFormat.getNumberInstance(locale37);
        java.lang.String str41 = numberFormat39.format((long) ' ');
        org.apache.commons.math.fraction.ProperFractionFormat properFractionFormat42 = new org.apache.commons.math.fraction.ProperFractionFormat(numberFormat28, numberFormat32, numberFormat39);
        java.text.NumberFormat numberFormat43 = java.text.NumberFormat.getCurrencyInstance();
        java.util.Currency currency44 = numberFormat43.getCurrency();
        numberFormat28.setCurrency(currency44);
        fractionFormat9.setDenominatorFormat(numberFormat28);
        org.apache.commons.math.fraction.FractionFormat fractionFormat47 = new org.apache.commons.math.fraction.FractionFormat(numberFormat2, numberFormat28);
        numberFormat28.setGroupingUsed(false);
        java.text.NumberFormat numberFormat51 = java.text.NumberFormat.getCurrencyInstance();
        java.util.Currency currency52 = numberFormat51.getCurrency();
        boolean boolean53 = numberFormat51.isParseIntegerOnly();
        numberFormat51.setMinimumIntegerDigits((int) '#');
        java.util.Locale locale57 = java.util.Locale.FRANCE;
        java.text.NumberFormat numberFormat58 = java.text.NumberFormat.getIntegerInstance(locale57);
        java.text.NumberFormat numberFormat59 = java.text.NumberFormat.getIntegerInstance(locale57);
        numberFormat59.setMaximumIntegerDigits(1);
        java.util.Locale locale62 = java.util.Locale.KOREAN;
        java.util.Locale locale63 = java.util.Locale.KOREAN;
        java.lang.String str64 = locale62.getDisplayLanguage(locale63);
        java.util.Locale locale65 = locale63.stripExtensions();
        java.util.Locale locale66 = java.util.Locale.ROOT;
        java.util.Locale locale67 = java.util.Locale.FRENCH;
        org.apache.commons.math.fraction.FractionFormat fractionFormat68 = org.apache.commons.math.fraction.FractionFormat.getProperInstance(locale67);
        java.lang.String str69 = locale66.getDisplayName(locale67);
        java.lang.String str70 = locale63.getDisplayName(locale67);
        java.text.NumberFormat numberFormat71 = java.text.NumberFormat.getInstance(locale67);
        java.util.Currency currency72 = numberFormat71.getCurrency();
        java.math.RoundingMode roundingMode73 = numberFormat71.getRoundingMode();
        java.text.NumberFormat numberFormat74 = null;
        org.apache.commons.math.fraction.ProperFractionFormat properFractionFormat75 = new org.apache.commons.math.fraction.ProperFractionFormat(numberFormat59, numberFormat71, numberFormat74);
        org.apache.commons.math.fraction.ProperFractionFormat properFractionFormat76 = new org.apache.commons.math.fraction.ProperFractionFormat(numberFormat71);
        java.text.ParsePosition parsePosition79 = new java.text.ParsePosition((int) (short) 10);
        parsePosition79.setErrorIndex((int) (byte) 1);
        int int82 = parsePosition79.getErrorIndex();
        parsePosition79.setErrorIndex(4095);
        org.apache.commons.math.fraction.Fraction fraction85 = properFractionFormat76.parse("Italian", parsePosition79);
        parsePosition79.setIndex(0);
        java.lang.String str88 = parsePosition79.toString();
        int int89 = parsePosition79.getErrorIndex();
        int int90 = parsePosition79.getIndex();
        java.lang.Object obj91 = numberFormat51.parseObject("13.572 / 35", parsePosition79);
        java.lang.Object obj92 = numberFormat28.parseObject("Kanada", parsePosition79);
        int int93 = parsePosition79.getIndex();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\uce90\ub098\ub2e4" + "'", str1, "\uce90\ub098\ub2e4");
        org.junit.Assert.assertNotNull(numberFormat2);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str6, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "kor" + "'", str7, "kor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(fractionFormat9);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertNotNull(numberFormat11);
        org.junit.Assert.assertNotNull(numberFormat14);
        org.junit.Assert.assertNotNull(numberFormat15);
        org.junit.Assert.assertNotNull(currency18);
        org.junit.Assert.assertEquals(currency18.toString(), "JPY");
        org.junit.Assert.assertNotNull(numberFormat21);
        org.junit.Assert.assertNotNull(currency24);
        org.junit.Assert.assertEquals(currency24.toString(), "JPY");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "0%" + "'", str26, "0%");
        org.junit.Assert.assertNotNull(numberFormat28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "100" + "'", str30, "100");
        org.junit.Assert.assertNotNull(numberFormat32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "100" + "'", str34, "100");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "ko");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str38, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertNotNull(numberFormat39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "32" + "'", str41, "32");
        org.junit.Assert.assertNotNull(numberFormat43);
        org.junit.Assert.assertNotNull(currency44);
        org.junit.Assert.assertEquals(currency44.toString(), "JPY");
        org.junit.Assert.assertNotNull(numberFormat51);
        org.junit.Assert.assertNotNull(currency52);
        org.junit.Assert.assertEquals(currency52.toString(), "JPY");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(numberFormat58);
        org.junit.Assert.assertNotNull(numberFormat59);
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "ko");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str64, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "ko");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "fr");
        org.junit.Assert.assertNotNull(fractionFormat68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "cor\351en" + "'", str70, "cor\351en");
        org.junit.Assert.assertNotNull(numberFormat71);
        org.junit.Assert.assertNotNull(currency72);
        org.junit.Assert.assertEquals(currency72.toString(), "XXX");
        org.junit.Assert.assertTrue("'" + roundingMode73 + "' != '" + java.math.RoundingMode.HALF_EVEN + "'", roundingMode73.equals(java.math.RoundingMode.HALF_EVEN));
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 1 + "'", int82 == 1);
        org.junit.Assert.assertNull(fraction85);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "java.text.ParsePosition[index=0,errorIndex=9]" + "'", str88, "java.text.ParsePosition[index=0,errorIndex=9]");
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 9 + "'", int89 == 9);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertNull(obj91);
        org.junit.Assert.assertNull(obj92);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
    }

    @Test
    public void test16561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16561");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.KOREAN;
        java.util.Locale locale2 = java.util.Locale.KOREAN;
        java.lang.String str3 = locale1.getDisplayLanguage(locale2);
        java.lang.String str4 = locale2.getScript();
        java.lang.String str5 = locale2.getVariant();
        java.util.Locale.setDefault(category0, locale2);
        java.util.Locale locale7 = java.util.Locale.getDefault(category0);
        java.util.Locale locale8 = java.util.Locale.FRENCH;
        org.apache.commons.math.fraction.FractionFormat fractionFormat9 = org.apache.commons.math.fraction.FractionFormat.getProperInstance(locale8);
        java.util.Locale.setDefault(category0, locale8);
        java.util.Locale locale14 = new java.util.Locale("\u671d\u9c9c\u6587", "\u671d\u9c9c\u6587", "");
        java.util.Locale.setDefault(category0, locale14);
        java.text.NumberFormat numberFormat16 = java.text.NumberFormat.getInstance(locale14);
        java.text.NumberFormat numberFormat17 = java.text.NumberFormat.getNumberInstance();
        boolean boolean18 = numberFormat17.isParseIntegerOnly();
        org.apache.commons.math.fraction.FractionFormat fractionFormat19 = new org.apache.commons.math.fraction.FractionFormat(numberFormat16, numberFormat17);
        java.text.NumberFormat numberFormat20 = null;
        java.util.Locale locale21 = java.util.Locale.KOREAN;
        java.util.Locale locale22 = java.util.Locale.KOREAN;
        java.lang.String str23 = locale21.getDisplayLanguage(locale22);
        java.lang.String str24 = locale21.getISO3Language();
        java.lang.String str25 = locale21.getCountry();
        org.apache.commons.math.fraction.FractionFormat fractionFormat26 = org.apache.commons.math.fraction.FractionFormat.getImproperInstance(locale21);
        java.text.NumberFormat numberFormat27 = java.text.NumberFormat.getIntegerInstance();
        java.text.NumberFormat numberFormat28 = java.text.NumberFormat.getPercentInstance();
        numberFormat28.setMaximumIntegerDigits((-1));
        java.text.NumberFormat numberFormat31 = java.text.NumberFormat.getPercentInstance();
        java.text.NumberFormat numberFormat32 = java.text.NumberFormat.getPercentInstance();
        numberFormat32.setMaximumIntegerDigits((-1));
        java.util.Currency currency35 = numberFormat32.getCurrency();
        numberFormat31.setCurrency(currency35);
        numberFormat28.setCurrency(currency35);
        java.text.NumberFormat numberFormat38 = java.text.NumberFormat.getPercentInstance();
        numberFormat38.setMaximumIntegerDigits((-1));
        java.util.Currency currency41 = numberFormat38.getCurrency();
        java.lang.String str43 = numberFormat38.format((double) 10);
        org.apache.commons.math.fraction.ProperFractionFormat properFractionFormat44 = new org.apache.commons.math.fraction.ProperFractionFormat(numberFormat27, numberFormat28, numberFormat38);
        java.text.NumberFormat numberFormat45 = java.text.NumberFormat.getInstance();
        java.lang.String str47 = numberFormat45.format(100L);
        properFractionFormat44.setWholeFormat(numberFormat45);
        java.text.NumberFormat numberFormat49 = java.text.NumberFormat.getInstance();
        java.lang.String str51 = numberFormat49.format(100L);
        int int52 = numberFormat49.getMinimumFractionDigits();
        java.util.Locale locale53 = java.util.Locale.KOREAN;
        java.util.Locale locale54 = java.util.Locale.KOREAN;
        java.lang.String str55 = locale53.getDisplayLanguage(locale54);
        java.text.NumberFormat numberFormat56 = java.text.NumberFormat.getNumberInstance(locale54);
        java.lang.String str58 = numberFormat56.format((long) ' ');
        org.apache.commons.math.fraction.ProperFractionFormat properFractionFormat59 = new org.apache.commons.math.fraction.ProperFractionFormat(numberFormat45, numberFormat49, numberFormat56);
        java.text.NumberFormat numberFormat60 = java.text.NumberFormat.getCurrencyInstance();
        java.util.Currency currency61 = numberFormat60.getCurrency();
        numberFormat45.setCurrency(currency61);
        fractionFormat26.setDenominatorFormat(numberFormat45);
        java.util.Locale locale64 = java.util.Locale.TAIWAN;
        java.text.NumberFormat numberFormat65 = java.text.NumberFormat.getCurrencyInstance(locale64);
        java.text.NumberFormat numberFormat66 = java.text.NumberFormat.getInstance();
        java.lang.String str68 = numberFormat66.format(100L);
        int int69 = numberFormat66.getMinimumFractionDigits();
        numberFormat66.setMaximumIntegerDigits(1);
        java.text.NumberFormat numberFormat72 = java.text.NumberFormat.getPercentInstance();
        numberFormat72.setMaximumIntegerDigits((-1));
        java.math.RoundingMode roundingMode75 = numberFormat72.getRoundingMode();
        numberFormat66.setRoundingMode(roundingMode75);
        numberFormat65.setRoundingMode(roundingMode75);
        numberFormat45.setRoundingMode(roundingMode75);
        java.lang.Object obj79 = numberFormat45.clone();
        numberFormat45.setMinimumFractionDigits((int) (short) -13572);
        numberFormat45.setMinimumFractionDigits(4095);
        java.lang.Object obj84 = numberFormat45.clone();
        org.apache.commons.math.fraction.ProperFractionFormat properFractionFormat85 = new org.apache.commons.math.fraction.ProperFractionFormat(numberFormat17, numberFormat20, numberFormat45);
        int int86 = numberFormat17.getMinimumFractionDigits();
        java.util.Currency currency87 = numberFormat17.getCurrency();
        java.util.Currency currency88 = numberFormat17.getCurrency();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str3, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ko");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr");
        org.junit.Assert.assertNotNull(fractionFormat9);
// flaky:         org.junit.Assert.assertEquals(locale14.toString(), "\u671d\u9c9c\u6587\u671d\u9c9c\u6587");
        org.junit.Assert.assertNotNull(numberFormat16);
        org.junit.Assert.assertNotNull(numberFormat17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "ko");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str23, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "kor" + "'", str24, "kor");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(fractionFormat26);
        org.junit.Assert.assertNotNull(numberFormat27);
        org.junit.Assert.assertNotNull(numberFormat28);
        org.junit.Assert.assertNotNull(numberFormat31);
        org.junit.Assert.assertNotNull(numberFormat32);
        org.junit.Assert.assertNotNull(currency35);
        org.junit.Assert.assertEquals(currency35.toString(), "JPY");
        org.junit.Assert.assertNotNull(numberFormat38);
        org.junit.Assert.assertNotNull(currency41);
        org.junit.Assert.assertEquals(currency41.toString(), "JPY");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "0%" + "'", str43, "0%");
        org.junit.Assert.assertNotNull(numberFormat45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "100" + "'", str47, "100");
        org.junit.Assert.assertNotNull(numberFormat49);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "100" + "'", str51, "100");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "ko");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str55, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertNotNull(numberFormat56);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "32" + "'", str58, "32");
        org.junit.Assert.assertNotNull(numberFormat60);
        org.junit.Assert.assertNotNull(currency61);
        org.junit.Assert.assertEquals(currency61.toString(), "JPY");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(numberFormat65);
        org.junit.Assert.assertNotNull(numberFormat66);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "100" + "'", str68, "100");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(numberFormat72);
        org.junit.Assert.assertTrue("'" + roundingMode75 + "' != '" + java.math.RoundingMode.HALF_EVEN + "'", roundingMode75.equals(java.math.RoundingMode.HALF_EVEN));
        org.junit.Assert.assertNotNull(obj79);
        org.junit.Assert.assertNotNull(obj84);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertNotNull(currency87);
        org.junit.Assert.assertEquals(currency87.toString(), "JPY");
        org.junit.Assert.assertNotNull(currency88);
        org.junit.Assert.assertEquals(currency88.toString(), "JPY");
    }

    @Test
    public void test16562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16562");
        java.text.NumberFormat.Field field0 = java.text.NumberFormat.Field.PERMILLE;
        java.text.FieldPosition fieldPosition2 = new java.text.FieldPosition((java.text.Format.Field) field0, (int) (short) 0);
        int int3 = fieldPosition2.getEndIndex();
        java.text.Format.Field field4 = fieldPosition2.getFieldAttribute();
        int int5 = fieldPosition2.getField();
        int int6 = fieldPosition2.getEndIndex();
        java.text.Format.Field field7 = fieldPosition2.getFieldAttribute();
        java.util.Locale locale8 = java.util.Locale.KOREA;
        java.text.NumberFormat numberFormat9 = java.text.NumberFormat.getNumberInstance(locale8);
        java.text.NumberFormat numberFormat11 = java.text.NumberFormat.getPercentInstance();
        java.text.ParsePosition parsePosition14 = new java.text.ParsePosition((int) (short) 10);
        java.lang.Object obj15 = numberFormat11.parseObject("hi!", parsePosition14);
        java.lang.Object obj16 = numberFormat9.parseObject("java.text.FieldPosition[field=0,attribute=java.text.NumberFormat$Field(per mille),beginIndex=0,endIndex=0]", parsePosition14);
        java.lang.String str18 = numberFormat9.format((double) 'x');
        numberFormat9.setMinimumIntegerDigits(1);
        java.text.ParsePosition parsePosition23 = new java.text.ParsePosition((int) (byte) -1);
        java.lang.String str24 = parsePosition23.toString();
        java.util.Locale.Builder builder25 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder26 = builder25.clear();
        java.util.Locale.Builder builder28 = builder25.setVariant("");
        java.util.Locale.Builder builder29 = builder25.clearExtensions();
        java.util.Locale.Builder builder31 = builder29.setLanguageTag("anglais");
        java.util.Locale locale32 = builder31.build();
        java.util.Locale.Builder builder33 = builder31.clearExtensions();
        boolean boolean34 = parsePosition23.equals((java.lang.Object) builder33);
        java.lang.Object obj35 = numberFormat9.parseObject("10", parsePosition23);
        boolean boolean36 = field7.equals((java.lang.Object) parsePosition23);
        java.text.FieldPosition fieldPosition37 = new java.text.FieldPosition(field7);
        org.junit.Assert.assertNotNull(field0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(field4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(field7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertNotNull(numberFormat11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "120" + "'", str18, "120");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "java.text.ParsePosition[index=-1,errorIndex=-1]" + "'", str24, "java.text.ParsePosition[index=-1,errorIndex=-1]");
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "anglais");
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test16563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16563");
        java.text.NumberFormat numberFormat0 = java.text.NumberFormat.getIntegerInstance();
        java.text.NumberFormat numberFormat1 = java.text.NumberFormat.getPercentInstance();
        numberFormat1.setMaximumIntegerDigits((-1));
        java.text.NumberFormat numberFormat4 = java.text.NumberFormat.getPercentInstance();
        java.text.NumberFormat numberFormat5 = java.text.NumberFormat.getPercentInstance();
        numberFormat5.setMaximumIntegerDigits((-1));
        java.util.Currency currency8 = numberFormat5.getCurrency();
        numberFormat4.setCurrency(currency8);
        numberFormat1.setCurrency(currency8);
        java.text.NumberFormat numberFormat11 = java.text.NumberFormat.getPercentInstance();
        numberFormat11.setMaximumIntegerDigits((-1));
        java.util.Currency currency14 = numberFormat11.getCurrency();
        java.lang.String str16 = numberFormat11.format((double) 10);
        org.apache.commons.math.fraction.ProperFractionFormat properFractionFormat17 = new org.apache.commons.math.fraction.ProperFractionFormat(numberFormat0, numberFormat1, numberFormat11);
        java.text.NumberFormat numberFormat18 = java.text.NumberFormat.getInstance();
        java.lang.String str20 = numberFormat18.format(100L);
        properFractionFormat17.setWholeFormat(numberFormat18);
        java.text.NumberFormat numberFormat22 = java.text.NumberFormat.getInstance();
        java.lang.String str24 = numberFormat22.format(100L);
        int int25 = numberFormat22.getMinimumFractionDigits();
        java.util.Locale locale26 = java.util.Locale.KOREAN;
        java.util.Locale locale27 = java.util.Locale.KOREAN;
        java.lang.String str28 = locale26.getDisplayLanguage(locale27);
        java.text.NumberFormat numberFormat29 = java.text.NumberFormat.getNumberInstance(locale27);
        java.lang.String str31 = numberFormat29.format((long) ' ');
        org.apache.commons.math.fraction.ProperFractionFormat properFractionFormat32 = new org.apache.commons.math.fraction.ProperFractionFormat(numberFormat18, numberFormat22, numberFormat29);
        java.text.NumberFormat numberFormat33 = properFractionFormat32.getWholeFormat();
        java.text.NumberFormat numberFormat34 = properFractionFormat32.getWholeFormat();
        java.text.NumberFormat numberFormat35 = properFractionFormat32.getDenominatorFormat();
        java.text.NumberFormat numberFormat36 = java.text.NumberFormat.getCurrencyInstance();
        java.text.NumberFormat numberFormat37 = java.text.NumberFormat.getPercentInstance();
        java.text.NumberFormat numberFormat38 = java.text.NumberFormat.getPercentInstance();
        numberFormat38.setMaximumIntegerDigits((-1));
        java.util.Currency currency41 = numberFormat38.getCurrency();
        numberFormat37.setCurrency(currency41);
        java.lang.String str44 = numberFormat37.format((double) 100);
        org.apache.commons.math.fraction.FractionFormat fractionFormat45 = org.apache.commons.math.fraction.FractionFormat.getImproperInstance();
        java.text.NumberFormat numberFormat46 = fractionFormat45.getNumeratorFormat();
        org.apache.commons.math.fraction.ProperFractionFormat properFractionFormat47 = new org.apache.commons.math.fraction.ProperFractionFormat(numberFormat36, numberFormat37, numberFormat46);
        org.apache.commons.math.fraction.FractionFormat fractionFormat48 = org.apache.commons.math.fraction.FractionFormat.getImproperInstance();
        java.text.NumberFormat numberFormat49 = fractionFormat48.getNumeratorFormat();
        java.text.NumberFormat numberFormat50 = fractionFormat48.getNumeratorFormat();
        java.text.ParseException parseException53 = new java.text.ParseException("java.text.FieldPosition[field=0,attribute=java.text.NumberFormat$Field(per mille),beginIndex=0,endIndex=0]", 0);
        java.lang.Throwable[] throwableArray54 = parseException53.getSuppressed();
        boolean boolean55 = numberFormat50.equals((java.lang.Object) throwableArray54);
        org.apache.commons.math.fraction.FractionFormat fractionFormat56 = org.apache.commons.math.fraction.FractionFormat.getImproperInstance();
        java.text.NumberFormat numberFormat57 = fractionFormat56.getNumeratorFormat();
        java.text.NumberFormat numberFormat58 = fractionFormat56.getNumeratorFormat();
        java.text.ParseException parseException61 = new java.text.ParseException("java.text.FieldPosition[field=0,attribute=java.text.NumberFormat$Field(per mille),beginIndex=0,endIndex=0]", 0);
        java.lang.Throwable[] throwableArray62 = parseException61.getSuppressed();
        boolean boolean63 = numberFormat58.equals((java.lang.Object) throwableArray62);
        numberFormat58.setMaximumFractionDigits((int) '#');
        org.apache.commons.math.fraction.ProperFractionFormat properFractionFormat66 = new org.apache.commons.math.fraction.ProperFractionFormat(numberFormat58);
        java.text.NumberFormat numberFormat67 = properFractionFormat66.getWholeFormat();
        org.apache.commons.math.fraction.ProperFractionFormat properFractionFormat68 = new org.apache.commons.math.fraction.ProperFractionFormat(numberFormat46, numberFormat50, numberFormat67);
        java.lang.Number number70 = numberFormat46.parse("-0%");
        org.apache.commons.math.fraction.FractionFormat fractionFormat71 = new org.apache.commons.math.fraction.FractionFormat(numberFormat35, numberFormat46);
        org.apache.commons.math.fraction.Fraction fraction74 = new org.apache.commons.math.fraction.Fraction((-1), (int) '#');
        org.apache.commons.math.fraction.Fraction fraction75 = fraction74.negate();
        org.apache.commons.math.fraction.Fraction fraction76 = fraction75.reciprocal();
        double double77 = fraction76.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction80 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) 'x', 32);
        org.apache.commons.math.fraction.Fraction fraction81 = fraction76.subtract(fraction80);
        java.lang.StringBuffer stringBuffer82 = null;
        java.text.NumberFormat.Field field83 = java.text.NumberFormat.Field.PERMILLE;
        java.text.FieldPosition fieldPosition85 = new java.text.FieldPosition((java.text.Format.Field) field83, (int) (short) 0);
        java.lang.String str86 = fieldPosition85.toString();
        int int87 = fieldPosition85.getBeginIndex();
        fieldPosition85.setEndIndex((int) (byte) 100);
        java.text.Format.Field field90 = fieldPosition85.getFieldAttribute();
        java.text.FieldPosition fieldPosition92 = new java.text.FieldPosition(field90, 2147483647);
        java.text.Format.Field field93 = fieldPosition92.getFieldAttribute();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer94 = fractionFormat71.format(fraction81, stringBuffer82, fieldPosition92);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(numberFormat5);
        org.junit.Assert.assertNotNull(currency8);
        org.junit.Assert.assertEquals(currency8.toString(), "JPY");
        org.junit.Assert.assertNotNull(numberFormat11);
        org.junit.Assert.assertNotNull(currency14);
        org.junit.Assert.assertEquals(currency14.toString(), "JPY");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0%" + "'", str16, "0%");
        org.junit.Assert.assertNotNull(numberFormat18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "100" + "'", str20, "100");
        org.junit.Assert.assertNotNull(numberFormat22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "100" + "'", str24, "100");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "ko");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str28, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertNotNull(numberFormat29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "32" + "'", str31, "32");
        org.junit.Assert.assertNotNull(numberFormat33);
        org.junit.Assert.assertNotNull(numberFormat34);
        org.junit.Assert.assertNotNull(numberFormat35);
        org.junit.Assert.assertNotNull(numberFormat36);
        org.junit.Assert.assertNotNull(numberFormat37);
        org.junit.Assert.assertNotNull(numberFormat38);
        org.junit.Assert.assertNotNull(currency41);
        org.junit.Assert.assertEquals(currency41.toString(), "JPY");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "10,000%" + "'", str44, "10,000%");
        org.junit.Assert.assertNotNull(fractionFormat45);
        org.junit.Assert.assertNotNull(numberFormat46);
        org.junit.Assert.assertNotNull(fractionFormat48);
        org.junit.Assert.assertNotNull(numberFormat49);
        org.junit.Assert.assertNotNull(numberFormat50);
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(fractionFormat56);
        org.junit.Assert.assertNotNull(numberFormat57);
        org.junit.Assert.assertNotNull(numberFormat58);
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(numberFormat67);
        org.junit.Assert.assertEquals("'" + number70 + "' != '" + 0L + "'", number70, 0L);
        org.junit.Assert.assertNotNull(fraction75);
        org.junit.Assert.assertNotNull(fraction76);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 35.0d + "'", double77 == 35.0d);
        org.junit.Assert.assertNotNull(fraction80);
        org.junit.Assert.assertNotNull(fraction81);
        org.junit.Assert.assertNotNull(field83);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "java.text.FieldPosition[field=0,attribute=java.text.NumberFormat$Field(per mille),beginIndex=0,endIndex=0]" + "'", str86, "java.text.FieldPosition[field=0,attribute=java.text.NumberFormat$Field(per mille),beginIndex=0,endIndex=0]");
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertNotNull(field90);
        org.junit.Assert.assertNotNull(field93);
    }

    @Test
    public void test16564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16564");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("\244 33.00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=? 33.00");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16565");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("ko-KR", strMap1);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.parse("en");
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap8 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, strMap8);
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        java.util.Locale locale13 = java.util.Locale.KOREAN;
        java.util.Locale locale14 = java.util.Locale.KOREAN;
        java.lang.String str15 = locale13.getDisplayLanguage(locale14);
        java.lang.String str16 = locale14.getScript();
        java.util.Locale locale17 = java.util.Locale.KOREAN;
        java.util.Locale locale18 = java.util.Locale.GERMANY;
        java.util.Locale[] localeArray19 = new java.util.Locale[] { locale14, locale17, locale18 };
        java.util.ArrayList<java.util.Locale> localeList20 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList20, localeArray19);
        java.util.Locale.FilteringMode filteringMode22 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList23 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.util.Locale>) localeList20, filteringMode22);
        java.lang.String[] strArray31 = new java.lang.String[] { "java.text.FieldPosition[field=0,attribute=java.text.NumberFormat$Field(per mille),beginIndex=0,endIndex=0]", "", "hi!", "kor", "10,000%", "\ud55c\uad6d\uc5b4", "kor" };
        java.util.ArrayList<java.lang.String> strList32 = new java.util.ArrayList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        java.util.List<java.lang.String> strList34 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.lang.String>) strList32);
        java.lang.String str35 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, (java.util.Collection<java.lang.String>) strList32);
        java.util.Locale.LanguageRange[] languageRangeArray36 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList37 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList37, languageRangeArray36);
        java.util.Collection<java.util.Locale> localeCollection39 = null;
        java.util.Locale.FilteringMode filteringMode40 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.util.Locale> localeList41 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, localeCollection39, filteringMode40);
        java.util.List<java.util.Locale> localeList42 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, localeCollection39);
        java.util.Locale locale43 = java.util.Locale.lookup(languageRangeList4, (java.util.Collection<java.util.Locale>) localeList42);
        java.util.Locale locale44 = java.util.Locale.lookup(languageRangeList2, (java.util.Collection<java.util.Locale>) localeList42);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap45 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList46 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap45);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap47 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList48 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList46, strMap47);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ko");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str15, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "ko");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "de_DE");
        org.junit.Assert.assertNotNull(localeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + filteringMode22 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode22.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList23);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(languageRangeArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + filteringMode40 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode40.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(localeList41);
        org.junit.Assert.assertNotNull(localeList42);
        org.junit.Assert.assertNull(locale43);
        org.junit.Assert.assertNull(locale44);
        org.junit.Assert.assertNotNull(languageRangeList46);
        org.junit.Assert.assertNotNull(languageRangeList48);
    }

    @Test
    public void test16566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16566");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) (short) 0, 234);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert 0 to fraction (1/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16567");
        java.text.NumberFormat.Field field0 = java.text.NumberFormat.Field.EXPONENT_SIGN;
        java.text.FieldPosition fieldPosition2 = new java.text.FieldPosition((java.text.Format.Field) field0, (int) (byte) -117);
        java.text.NumberFormat numberFormat3 = java.text.NumberFormat.getCurrencyInstance();
        java.text.NumberFormat numberFormat4 = java.text.NumberFormat.getPercentInstance();
        java.text.NumberFormat numberFormat5 = java.text.NumberFormat.getPercentInstance();
        numberFormat5.setMaximumIntegerDigits((-1));
        java.util.Currency currency8 = numberFormat5.getCurrency();
        numberFormat4.setCurrency(currency8);
        java.lang.String str11 = numberFormat4.format((double) 100);
        org.apache.commons.math.fraction.FractionFormat fractionFormat12 = org.apache.commons.math.fraction.FractionFormat.getImproperInstance();
        java.text.NumberFormat numberFormat13 = fractionFormat12.getNumeratorFormat();
        org.apache.commons.math.fraction.ProperFractionFormat properFractionFormat14 = new org.apache.commons.math.fraction.ProperFractionFormat(numberFormat3, numberFormat4, numberFormat13);
        org.apache.commons.math.fraction.FractionFormat fractionFormat15 = org.apache.commons.math.fraction.FractionFormat.getImproperInstance();
        java.text.NumberFormat numberFormat16 = fractionFormat15.getNumeratorFormat();
        java.text.NumberFormat numberFormat17 = fractionFormat15.getNumeratorFormat();
        java.text.ParseException parseException20 = new java.text.ParseException("java.text.FieldPosition[field=0,attribute=java.text.NumberFormat$Field(per mille),beginIndex=0,endIndex=0]", 0);
        java.lang.Throwable[] throwableArray21 = parseException20.getSuppressed();
        boolean boolean22 = numberFormat17.equals((java.lang.Object) throwableArray21);
        org.apache.commons.math.fraction.FractionFormat fractionFormat23 = org.apache.commons.math.fraction.FractionFormat.getImproperInstance();
        java.text.NumberFormat numberFormat24 = fractionFormat23.getNumeratorFormat();
        java.text.NumberFormat numberFormat25 = fractionFormat23.getNumeratorFormat();
        java.text.ParseException parseException28 = new java.text.ParseException("java.text.FieldPosition[field=0,attribute=java.text.NumberFormat$Field(per mille),beginIndex=0,endIndex=0]", 0);
        java.lang.Throwable[] throwableArray29 = parseException28.getSuppressed();
        boolean boolean30 = numberFormat25.equals((java.lang.Object) throwableArray29);
        numberFormat25.setMaximumFractionDigits((int) '#');
        org.apache.commons.math.fraction.ProperFractionFormat properFractionFormat33 = new org.apache.commons.math.fraction.ProperFractionFormat(numberFormat25);
        java.text.NumberFormat numberFormat34 = properFractionFormat33.getWholeFormat();
        org.apache.commons.math.fraction.ProperFractionFormat properFractionFormat35 = new org.apache.commons.math.fraction.ProperFractionFormat(numberFormat13, numberFormat17, numberFormat34);
        java.lang.String str37 = numberFormat13.format((double) (short) 0);
        java.lang.Number number39 = numberFormat13.parse("-117");
        boolean boolean40 = numberFormat13.isParseIntegerOnly();
        boolean boolean41 = field0.equals((java.lang.Object) numberFormat13);
        java.text.FieldPosition fieldPosition42 = new java.text.FieldPosition((java.text.Format.Field) field0);
        org.junit.Assert.assertNotNull(field0);
        org.junit.Assert.assertNotNull(numberFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(numberFormat5);
        org.junit.Assert.assertNotNull(currency8);
        org.junit.Assert.assertEquals(currency8.toString(), "JPY");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10,000%" + "'", str11, "10,000%");
        org.junit.Assert.assertNotNull(fractionFormat12);
        org.junit.Assert.assertNotNull(numberFormat13);
        org.junit.Assert.assertNotNull(fractionFormat15);
        org.junit.Assert.assertNotNull(numberFormat16);
        org.junit.Assert.assertNotNull(numberFormat17);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(fractionFormat23);
        org.junit.Assert.assertNotNull(numberFormat24);
        org.junit.Assert.assertNotNull(numberFormat25);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(numberFormat34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "0" + "'", str37, "0");
        org.junit.Assert.assertEquals("'" + number39 + "' != '" + (-117L) + "'", number39, (-117L));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test16568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16568");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.util.Locale locale5 = java.util.Locale.KOREAN;
        java.lang.String str6 = locale4.getDisplayLanguage(locale5);
        java.lang.String str7 = locale4.getISO3Language();
        boolean boolean8 = locale4.hasExtensions();
        java.util.Locale.Builder builder9 = builder2.setLocale(locale4);
        java.util.Locale.Builder builder10 = builder9.clear();
        java.util.Locale.Builder builder11 = builder9.clear();
        java.util.Locale.Builder builder13 = builder11.setLanguageTag("Chinese");
        java.util.Locale.Builder builder16 = builder11.setExtension('a', "Canada");
        java.util.Locale.Builder builder17 = builder11.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder19 = builder17.addUnicodeLocaleAttribute("0.00854700854700854800000000000000");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 0.00854700854700854800000000000000 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str6, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "kor" + "'", str7, "kor");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test16569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16569");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) (byte) 97);
        int int2 = fraction1.getNumerator();
        double double3 = fraction1.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction6 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) 'u', (int) (byte) -1);
        org.apache.commons.math.fraction.Fraction fraction7 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction10 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) 'u', (int) (byte) -1);
        int int11 = fraction10.intValue();
        org.apache.commons.math.fraction.Fraction fraction12 = fraction7.subtract(fraction10);
        org.apache.commons.math.fraction.Fraction fraction13 = fraction6.multiply(fraction7);
        float float14 = fraction7.floatValue();
        org.apache.commons.math.fraction.Fraction fraction15 = fraction7.negate();
        float float16 = fraction15.floatValue();
        org.apache.commons.math.fraction.Fraction fraction17 = fraction1.multiply(fraction15);
        org.apache.commons.math.fraction.Fraction fraction20 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) 'u', (int) (byte) -1);
        java.lang.String str21 = org.apache.commons.math.fraction.FractionFormat.formatFraction(fraction20);
        org.apache.commons.math.fraction.Fraction fraction22 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction25 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) 'u', (int) (byte) -1);
        int int26 = fraction25.intValue();
        org.apache.commons.math.fraction.Fraction fraction27 = fraction22.subtract(fraction25);
        org.apache.commons.math.fraction.Fraction fraction28 = fraction20.add(fraction22);
        org.apache.commons.math.fraction.Fraction fraction29 = fraction17.subtract(fraction28);
        float float30 = fraction29.floatValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-117) + "'", int11 == (-117));
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-117 / 1" + "'", str21, "-117 / 1");
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-117) + "'", int26 == (-117));
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 117.0f + "'", float30 == 117.0f);
    }

    @Test
    public void test16570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16570");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) (byte) -2, (double) (byte) 4, 315);
    }

    @Test
    public void test16571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16571");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.KOREAN;
        java.util.Locale locale2 = java.util.Locale.KOREAN;
        java.lang.String str3 = locale1.getDisplayLanguage(locale2);
        java.lang.String str4 = locale2.getScript();
        java.lang.String str5 = locale2.getVariant();
        java.util.Locale.setDefault(category0, locale2);
        java.lang.String str7 = locale2.getDisplayName();
        java.text.NumberFormat numberFormat8 = java.text.NumberFormat.getIntegerInstance(locale2);
        java.text.NumberFormat numberFormat9 = java.text.NumberFormat.getIntegerInstance();
        java.text.NumberFormat numberFormat10 = java.text.NumberFormat.getPercentInstance();
        numberFormat10.setMaximumIntegerDigits((-1));
        java.text.NumberFormat numberFormat13 = java.text.NumberFormat.getPercentInstance();
        java.text.NumberFormat numberFormat14 = java.text.NumberFormat.getPercentInstance();
        numberFormat14.setMaximumIntegerDigits((-1));
        java.util.Currency currency17 = numberFormat14.getCurrency();
        numberFormat13.setCurrency(currency17);
        numberFormat10.setCurrency(currency17);
        java.text.NumberFormat numberFormat20 = java.text.NumberFormat.getPercentInstance();
        numberFormat20.setMaximumIntegerDigits((-1));
        java.util.Currency currency23 = numberFormat20.getCurrency();
        java.lang.String str25 = numberFormat20.format((double) 10);
        org.apache.commons.math.fraction.ProperFractionFormat properFractionFormat26 = new org.apache.commons.math.fraction.ProperFractionFormat(numberFormat9, numberFormat10, numberFormat20);
        java.text.NumberFormat numberFormat28 = java.text.NumberFormat.getInstance();
        java.lang.String str30 = numberFormat28.format(100L);
        java.text.NumberFormat numberFormat32 = java.text.NumberFormat.getPercentInstance();
        java.text.ParsePosition parsePosition35 = new java.text.ParsePosition((int) (short) 10);
        java.lang.Object obj36 = numberFormat32.parseObject("hi!", parsePosition35);
        java.lang.Number number37 = numberFormat28.parse("10,000%", parsePosition35);
        int int38 = parsePosition35.getErrorIndex();
        java.lang.Object obj39 = properFractionFormat26.parseObject("French", parsePosition35);
        java.util.Locale locale41 = java.util.Locale.FRENCH;
        java.lang.String str42 = locale41.getDisplayLanguage();
        org.apache.commons.math.fraction.FractionFormat fractionFormat43 = org.apache.commons.math.fraction.FractionFormat.getProperInstance(locale41);
        java.text.NumberFormat numberFormat44 = fractionFormat43.getNumeratorFormat();
        java.text.ParsePosition parsePosition47 = new java.text.ParsePosition((int) (short) 10);
        parsePosition47.setErrorIndex((int) (byte) 1);
        parsePosition47.setErrorIndex(0);
        org.apache.commons.math.fraction.Fraction fraction52 = fractionFormat43.parse("French", parsePosition47);
        org.apache.commons.math.fraction.Fraction fraction53 = properFractionFormat26.parse("", parsePosition47);
        java.util.Locale locale54 = java.util.Locale.KOREAN;
        java.util.Locale locale55 = java.util.Locale.KOREAN;
        java.lang.String str56 = locale54.getDisplayLanguage(locale55);
        java.text.NumberFormat numberFormat57 = java.text.NumberFormat.getNumberInstance(locale55);
        java.lang.Object obj58 = numberFormat57.clone();
        properFractionFormat26.setWholeFormat(numberFormat57);
        java.util.Locale locale60 = java.util.Locale.KOREAN;
        java.util.Locale locale61 = java.util.Locale.KOREAN;
        java.util.Locale locale62 = java.util.Locale.KOREAN;
        java.lang.String str63 = locale61.getDisplayLanguage(locale62);
        java.lang.String str64 = locale61.getISO3Language();
        java.lang.String str65 = locale60.getDisplayCountry(locale61);
        java.lang.String str66 = locale61.toLanguageTag();
        java.text.NumberFormat numberFormat67 = java.text.NumberFormat.getCurrencyInstance(locale61);
        boolean boolean68 = numberFormat67.isParseIntegerOnly();
        properFractionFormat26.setDenominatorFormat(numberFormat67);
        boolean boolean70 = numberFormat67.isParseIntegerOnly();
        org.apache.commons.math.fraction.FractionFormat fractionFormat71 = new org.apache.commons.math.fraction.FractionFormat(numberFormat8, numberFormat67);
        boolean boolean72 = numberFormat67.isParseIntegerOnly();
        java.math.RoundingMode roundingMode73 = numberFormat67.getRoundingMode();
        java.util.Currency currency74 = numberFormat67.getCurrency();
        numberFormat67.setParseIntegerOnly(true);
        int int77 = numberFormat67.getMaximumIntegerDigits();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str3, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str7, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertNotNull(numberFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertNotNull(numberFormat13);
        org.junit.Assert.assertNotNull(numberFormat14);
        org.junit.Assert.assertNotNull(currency17);
        org.junit.Assert.assertEquals(currency17.toString(), "JPY");
        org.junit.Assert.assertNotNull(numberFormat20);
        org.junit.Assert.assertNotNull(currency23);
        org.junit.Assert.assertEquals(currency23.toString(), "JPY");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "0%" + "'", str25, "0%");
        org.junit.Assert.assertNotNull(numberFormat28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "100" + "'", str30, "100");
        org.junit.Assert.assertNotNull(numberFormat32);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(number37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\ud504\ub791\uc2a4\uc5b4" + "'", str42, "\ud504\ub791\uc2a4\uc5b4");
        org.junit.Assert.assertNotNull(fractionFormat43);
        org.junit.Assert.assertNotNull(numberFormat44);
        org.junit.Assert.assertNull(fraction52);
        org.junit.Assert.assertNull(fraction53);
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "ko");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str56, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertNotNull(numberFormat57);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "ko");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "ko");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str63, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "kor" + "'", str64, "kor");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "ko" + "'", str66, "ko");
        org.junit.Assert.assertNotNull(numberFormat67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + roundingMode73 + "' != '" + java.math.RoundingMode.HALF_EVEN + "'", roundingMode73.equals(java.math.RoundingMode.HALF_EVEN));
        org.junit.Assert.assertNotNull(currency74);
        org.junit.Assert.assertEquals(currency74.toString(), "XXX");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 2147483647 + "'", int77 == 2147483647);
    }

    @Test
    public void test16572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16572");
        java.text.FieldPosition fieldPosition1 = new java.text.FieldPosition((int) (short) -116);
        java.text.Format.Field field2 = fieldPosition1.getFieldAttribute();
        fieldPosition1.setBeginIndex((int) (byte) -43);
        java.text.Format.Field field5 = fieldPosition1.getFieldAttribute();
        org.junit.Assert.assertNull(field2);
        org.junit.Assert.assertNull(field5);
    }

    @Test
    public void test16573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16573");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("-\24411,700.00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=-?11,700.00");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16574");
        java.text.NumberFormat numberFormat0 = java.text.NumberFormat.getPercentInstance();
        numberFormat0.setMaximumIntegerDigits((-1));
        java.text.NumberFormat numberFormat3 = java.text.NumberFormat.getPercentInstance();
        java.text.NumberFormat numberFormat4 = java.text.NumberFormat.getPercentInstance();
        numberFormat4.setMaximumIntegerDigits((-1));
        java.util.Currency currency7 = numberFormat4.getCurrency();
        numberFormat3.setCurrency(currency7);
        numberFormat0.setCurrency(currency7);
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        java.util.Locale locale13 = java.util.Locale.KOREAN;
        java.util.Locale locale14 = java.util.Locale.KOREAN;
        java.lang.String str15 = locale13.getDisplayLanguage(locale14);
        java.lang.String str16 = locale14.getScript();
        java.util.Locale locale17 = java.util.Locale.KOREAN;
        java.util.Locale locale18 = java.util.Locale.GERMANY;
        java.util.Locale[] localeArray19 = new java.util.Locale[] { locale14, locale17, locale18 };
        java.util.ArrayList<java.util.Locale> localeList20 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList20, localeArray19);
        java.util.Locale.FilteringMode filteringMode22 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList23 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.util.Locale>) localeList20, filteringMode22);
        java.lang.String[] strArray31 = new java.lang.String[] { "java.text.FieldPosition[field=0,attribute=java.text.NumberFormat$Field(per mille),beginIndex=0,endIndex=0]", "", "hi!", "kor", "10,000%", "\ud55c\uad6d\uc5b4", "kor" };
        java.util.ArrayList<java.lang.String> strList32 = new java.util.ArrayList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        java.util.List<java.lang.String> strList34 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.lang.String>) strList32);
        boolean boolean35 = numberFormat0.equals((java.lang.Object) strList32);
        java.text.NumberFormat numberFormat36 = java.text.NumberFormat.getPercentInstance();
        java.text.NumberFormat numberFormat37 = java.text.NumberFormat.getPercentInstance();
        numberFormat37.setMaximumIntegerDigits((-1));
        java.util.Currency currency40 = numberFormat37.getCurrency();
        numberFormat36.setCurrency(currency40);
        boolean boolean42 = numberFormat0.equals((java.lang.Object) numberFormat36);
        int int43 = numberFormat0.getMaximumIntegerDigits();
        org.junit.Assert.assertNotNull(numberFormat0);
        org.junit.Assert.assertNotNull(numberFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(currency7);
        org.junit.Assert.assertEquals(currency7.toString(), "JPY");
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ko");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str15, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "ko");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "de_DE");
        org.junit.Assert.assertNotNull(localeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + filteringMode22 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode22.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList23);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(numberFormat36);
        org.junit.Assert.assertNotNull(numberFormat37);
        org.junit.Assert.assertNotNull(currency40);
        org.junit.Assert.assertEquals(currency40.toString(), "JPY");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test16575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16575");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.lang.String str1 = locale0.getDisplayScript();
        java.lang.String str2 = locale0.getDisplayScript();
        java.util.Locale locale3 = java.util.Locale.KOREAN;
        java.lang.String str4 = locale3.getDisplayVariant();
        java.lang.String str5 = locale3.getDisplayScript();
        java.lang.String str6 = locale3.getDisplayCountry();
        java.lang.String str7 = locale0.getDisplayName(locale3);
        java.lang.String str8 = locale0.getDisplayName();
        java.text.NumberFormat numberFormat9 = java.text.NumberFormat.getInstance(locale0);
        java.lang.Object obj10 = numberFormat9.clone();
        numberFormat9.setMaximumIntegerDigits(11);
        numberFormat9.setMinimumIntegerDigits((int) (short) -1);
        java.lang.StringBuffer stringBuffer16 = null;
        java.text.NumberFormat.Field field17 = java.text.NumberFormat.Field.PERMILLE;
        java.text.FieldPosition fieldPosition19 = new java.text.FieldPosition((java.text.Format.Field) field17, (int) (short) 0);
        java.lang.String str20 = fieldPosition19.toString();
        java.lang.String str21 = fieldPosition19.toString();
        fieldPosition19.setBeginIndex((int) (byte) 10);
        fieldPosition19.setBeginIndex((int) '4');
        boolean boolean27 = fieldPosition19.equals((java.lang.Object) (short) -1);
        java.text.Format.Field field28 = fieldPosition19.getFieldAttribute();
        java.text.FieldPosition fieldPosition30 = new java.text.FieldPosition(field28, 117);
        java.util.Locale locale31 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.Character> charSet32 = locale31.getExtensionKeys();
        java.text.NumberFormat numberFormat33 = java.text.NumberFormat.getInstance(locale31);
        java.util.Locale locale34 = java.util.Locale.KOREAN;
        java.util.Locale locale35 = java.util.Locale.KOREAN;
        java.util.Locale locale36 = java.util.Locale.KOREAN;
        java.lang.String str37 = locale35.getDisplayLanguage(locale36);
        java.lang.String str38 = locale35.getISO3Language();
        java.lang.String str39 = locale34.getDisplayCountry(locale35);
        java.util.Locale locale40 = java.util.Locale.KOREAN;
        java.util.Locale locale41 = java.util.Locale.KOREAN;
        java.util.Locale locale42 = java.util.Locale.KOREAN;
        java.lang.String str43 = locale41.getDisplayLanguage(locale42);
        java.lang.String str44 = locale41.getISO3Language();
        java.lang.String str45 = locale40.getDisplayCountry(locale41);
        java.util.Locale locale46 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str47 = locale41.getDisplayLanguage(locale46);
        java.lang.String str48 = locale35.getDisplayName(locale46);
        java.lang.String str49 = locale35.getDisplayCountry();
        java.lang.String str50 = locale31.getDisplayVariant(locale35);
        java.util.Locale locale51 = java.util.Locale.KOREAN;
        java.util.Locale locale52 = java.util.Locale.KOREAN;
        java.lang.String str53 = locale51.getDisplayLanguage(locale52);
        java.lang.String str54 = locale51.getISO3Language();
        java.lang.String str55 = locale51.getDisplayCountry();
        java.util.Locale locale56 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str57 = locale51.getDisplayLanguage(locale56);
        java.lang.String str58 = locale35.getDisplayVariant(locale56);
        java.text.NumberFormat numberFormat59 = java.text.NumberFormat.getIntegerInstance(locale35);
        boolean boolean60 = field28.equals((java.lang.Object) numberFormat59);
        java.text.FieldPosition fieldPosition62 = new java.text.FieldPosition(field28, 315);
        java.text.FieldPosition fieldPosition64 = new java.text.FieldPosition(field28, (int) (short) -4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer65 = numberFormat9.format((long) (byte) 115, stringBuffer16, fieldPosition64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)" + "'", str7, "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)" + "'", str8, "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)");
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(field17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "java.text.FieldPosition[field=0,attribute=java.text.NumberFormat$Field(per mille),beginIndex=0,endIndex=0]" + "'", str20, "java.text.FieldPosition[field=0,attribute=java.text.NumberFormat$Field(per mille),beginIndex=0,endIndex=0]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "java.text.FieldPosition[field=0,attribute=java.text.NumberFormat$Field(per mille),beginIndex=0,endIndex=0]" + "'", str21, "java.text.FieldPosition[field=0,attribute=java.text.NumberFormat$Field(per mille),beginIndex=0,endIndex=0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(field28);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "de_DE");
        org.junit.Assert.assertNotNull(charSet32);
        org.junit.Assert.assertNotNull(numberFormat33);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "ko");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "ko");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str37, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "kor" + "'", str38, "kor");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "ko");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "ko");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str43, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "kor" + "'", str44, "kor");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\u671d\u9c9c\u6587" + "'", str47, "\u671d\u9c9c\u6587");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "\u671d\u9c9c\u6587" + "'", str48, "\u671d\u9c9c\u6587");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "ko");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str53, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "kor" + "'", str54, "kor");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "\u97d3\u6587" + "'", str57, "\u97d3\u6587");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(numberFormat59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test16576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16576");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.lang.String str1 = locale0.getVariant();
        java.lang.String str2 = locale0.getDisplayVariant();
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale.Builder builder6 = builder3.setVariant("");
        java.util.Locale.Builder builder8 = builder6.setVariant("Canada");
        java.util.Locale locale9 = builder8.build();
        java.util.Set<java.lang.String> strSet10 = locale9.getUnicodeLocaleAttributes();
        java.lang.String str11 = locale0.getDisplayName(locale9);
        java.lang.String str12 = locale0.getScript();
        java.lang.String str13 = locale0.toLanguageTag();
        java.text.NumberFormat numberFormat14 = java.text.NumberFormat.getInstance(locale0);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "English (Canada)" + "'", str11, "English (Canada)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "en-CA" + "'", str13, "en-CA");
        org.junit.Assert.assertNotNull(numberFormat14);
    }

    @Test
    public void test16577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16577");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale locale7 = java.util.Locale.KOREAN;
        java.util.Locale locale8 = java.util.Locale.KOREAN;
        java.lang.String str9 = locale7.getDisplayLanguage(locale8);
        java.lang.String str10 = locale7.getISO3Language();
        boolean boolean11 = locale7.hasExtensions();
        java.util.Locale.Builder builder12 = builder5.setLocale(locale7);
        org.apache.commons.math.fraction.Fraction fraction13 = org.apache.commons.math.fraction.Fraction.ONE;
        org.apache.commons.math.fraction.Fraction fraction16 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) 'u', (int) (byte) -1);
        java.lang.String str17 = org.apache.commons.math.fraction.FractionFormat.formatFraction(fraction16);
        org.apache.commons.math.fraction.Fraction fraction18 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction21 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) 'u', (int) (byte) -1);
        int int22 = fraction21.intValue();
        org.apache.commons.math.fraction.Fraction fraction23 = fraction18.subtract(fraction21);
        org.apache.commons.math.fraction.Fraction fraction24 = fraction16.add(fraction18);
        org.apache.commons.math.fraction.Fraction fraction25 = fraction16.abs();
        org.apache.commons.math.fraction.Fraction fraction26 = fraction13.subtract(fraction25);
        org.apache.commons.math.fraction.Fraction fraction27 = org.apache.commons.math.fraction.Fraction.ONE;
        org.apache.commons.math.fraction.Fraction fraction30 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) 'u', (int) (byte) -1);
        java.lang.String str31 = org.apache.commons.math.fraction.FractionFormat.formatFraction(fraction30);
        org.apache.commons.math.fraction.Fraction fraction32 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction35 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) 'u', (int) (byte) -1);
        int int36 = fraction35.intValue();
        org.apache.commons.math.fraction.Fraction fraction37 = fraction32.subtract(fraction35);
        org.apache.commons.math.fraction.Fraction fraction38 = fraction30.add(fraction32);
        org.apache.commons.math.fraction.Fraction fraction39 = fraction30.abs();
        org.apache.commons.math.fraction.Fraction fraction40 = fraction27.subtract(fraction39);
        org.apache.commons.math.fraction.Fraction fraction43 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) 'u', (int) (byte) -1);
        org.apache.commons.math.fraction.Fraction fraction44 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction47 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) 'u', (int) (byte) -1);
        int int48 = fraction47.intValue();
        org.apache.commons.math.fraction.Fraction fraction49 = fraction44.subtract(fraction47);
        org.apache.commons.math.fraction.Fraction fraction50 = fraction43.multiply(fraction44);
        org.apache.commons.math.fraction.Fraction fraction51 = fraction40.add(fraction44);
        org.apache.commons.math.fraction.Fraction fraction52 = fraction25.multiply(fraction40);
        java.util.Locale locale53 = java.util.Locale.UK;
        java.util.Locale locale54 = java.util.Locale.KOREAN;
        java.util.Locale locale55 = java.util.Locale.KOREAN;
        java.lang.String str56 = locale54.getDisplayLanguage(locale55);
        java.lang.String str57 = locale53.getDisplayScript(locale55);
        java.lang.String str58 = locale55.toLanguageTag();
        java.lang.String str59 = locale55.getVariant();
        boolean boolean60 = fraction52.equals((java.lang.Object) locale55);
        java.lang.String str61 = locale7.getDisplayScript(locale55);
        java.lang.String str62 = locale55.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet63 = locale55.getUnicodeLocaleAttributes();
        org.apache.commons.math.fraction.FractionFormat fractionFormat64 = org.apache.commons.math.fraction.FractionFormat.getProperInstance(locale55);
        java.lang.String str65 = locale2.getDisplayVariant(locale55);
        boolean boolean66 = locale55.hasExtensions();
        java.util.Locale locale67 = locale55.stripExtensions();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ko");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str9, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "kor" + "'", str10, "kor");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-117 / 1" + "'", str17, "-117 / 1");
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-117) + "'", int22 == (-117));
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "-117 / 1" + "'", str31, "-117 / 1");
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-117) + "'", int36 == (-117));
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-117) + "'", int48 == (-117));
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "ko");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str56, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "ko" + "'", str58, "ko");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str62, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertNotNull(strSet63);
        org.junit.Assert.assertNotNull(fractionFormat64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "ko");
    }

    @Test
    public void test16578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16578");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.KOREAN;
        java.util.Locale locale2 = java.util.Locale.KOREAN;
        java.lang.String str3 = locale1.getDisplayLanguage(locale2);
        java.lang.String str4 = locale2.getScript();
        java.lang.String str5 = locale2.getVariant();
        java.util.Locale.setDefault(category0, locale2);
        java.util.Locale locale7 = java.util.Locale.CHINESE;
        org.apache.commons.math.fraction.FractionFormat fractionFormat8 = org.apache.commons.math.fraction.FractionFormat.getImproperInstance(locale7);
        java.lang.String str9 = locale7.getDisplayScript();
        java.util.Locale.setDefault(category0, locale7);
        java.lang.String str11 = locale7.getISO3Country();
        org.apache.commons.math.fraction.FractionFormat fractionFormat12 = org.apache.commons.math.fraction.FractionFormat.getProperInstance(locale7);
        java.text.NumberFormat numberFormat13 = fractionFormat12.getDenominatorFormat();
        numberFormat13.setMinimumIntegerDigits(387);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str3, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh");
        org.junit.Assert.assertNotNull(fractionFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(fractionFormat12);
        org.junit.Assert.assertNotNull(numberFormat13);
    }

    @Test
    public void test16579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16579");
        java.text.NumberFormat numberFormat0 = java.text.NumberFormat.getPercentInstance();
        numberFormat0.setMaximumIntegerDigits((-1));
        java.text.NumberFormat numberFormat3 = java.text.NumberFormat.getPercentInstance();
        java.text.NumberFormat numberFormat4 = java.text.NumberFormat.getPercentInstance();
        numberFormat4.setMaximumIntegerDigits((-1));
        java.util.Currency currency7 = numberFormat4.getCurrency();
        numberFormat3.setCurrency(currency7);
        numberFormat0.setCurrency(currency7);
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        java.util.Locale locale13 = java.util.Locale.KOREAN;
        java.util.Locale locale14 = java.util.Locale.KOREAN;
        java.lang.String str15 = locale13.getDisplayLanguage(locale14);
        java.lang.String str16 = locale14.getScript();
        java.util.Locale locale17 = java.util.Locale.KOREAN;
        java.util.Locale locale18 = java.util.Locale.GERMANY;
        java.util.Locale[] localeArray19 = new java.util.Locale[] { locale14, locale17, locale18 };
        java.util.ArrayList<java.util.Locale> localeList20 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList20, localeArray19);
        java.util.Locale.FilteringMode filteringMode22 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList23 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.util.Locale>) localeList20, filteringMode22);
        java.lang.String[] strArray31 = new java.lang.String[] { "java.text.FieldPosition[field=0,attribute=java.text.NumberFormat$Field(per mille),beginIndex=0,endIndex=0]", "", "hi!", "kor", "10,000%", "\ud55c\uad6d\uc5b4", "kor" };
        java.util.ArrayList<java.lang.String> strList32 = new java.util.ArrayList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        java.util.List<java.lang.String> strList34 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.lang.String>) strList32);
        boolean boolean35 = numberFormat0.equals((java.lang.Object) strList32);
        numberFormat0.setGroupingUsed(false);
        org.apache.commons.math.fraction.ProperFractionFormat properFractionFormat38 = new org.apache.commons.math.fraction.ProperFractionFormat(numberFormat0);
        java.text.NumberFormat numberFormat39 = properFractionFormat38.getNumeratorFormat();
        java.util.Currency currency40 = numberFormat39.getCurrency();
        java.util.Locale locale41 = java.util.Locale.ENGLISH;
        java.text.NumberFormat numberFormat42 = java.text.NumberFormat.getPercentInstance(locale41);
        int int43 = numberFormat42.getMaximumIntegerDigits();
        java.lang.String str45 = numberFormat42.format((long) (byte) 1);
        java.text.NumberFormat numberFormat46 = null;
        org.apache.commons.math.fraction.ProperFractionFormat properFractionFormat47 = new org.apache.commons.math.fraction.ProperFractionFormat(numberFormat39, numberFormat42, numberFormat46);
        java.text.NumberFormat numberFormat48 = properFractionFormat47.getNumeratorFormat();
        java.text.NumberFormat numberFormat49 = properFractionFormat47.getNumeratorFormat();
        org.apache.commons.math.fraction.FractionFormat fractionFormat51 = org.apache.commons.math.fraction.FractionFormat.getImproperInstance();
        java.text.NumberFormat numberFormat52 = fractionFormat51.getNumeratorFormat();
        int int53 = numberFormat52.getMinimumFractionDigits();
        java.lang.String str55 = numberFormat52.format((double) (byte) -1);
        java.text.NumberFormat numberFormat57 = java.text.NumberFormat.getPercentInstance();
        java.text.ParsePosition parsePosition60 = new java.text.ParsePosition((int) (short) 10);
        java.lang.Object obj61 = numberFormat57.parseObject("hi!", parsePosition60);
        java.lang.String str62 = parsePosition60.toString();
        java.lang.Object obj63 = numberFormat52.parseObject("", parsePosition60);
        java.lang.Object obj64 = properFractionFormat47.parseObject("1 / 1_java.text.parseexception: java.text.parseexception: 100", parsePosition60);
        parsePosition60.setIndex((int) (short) -3);
        org.junit.Assert.assertNotNull(numberFormat0);
        org.junit.Assert.assertNotNull(numberFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(currency7);
        org.junit.Assert.assertEquals(currency7.toString(), "JPY");
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ko");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str15, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "ko");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "de_DE");
        org.junit.Assert.assertNotNull(localeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + filteringMode22 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode22.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList23);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(numberFormat39);
        org.junit.Assert.assertNotNull(currency40);
        org.junit.Assert.assertEquals(currency40.toString(), "JPY");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "en");
        org.junit.Assert.assertNotNull(numberFormat42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2147483647 + "'", int43 == 2147483647);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "100%" + "'", str45, "100%");
        org.junit.Assert.assertNotNull(numberFormat48);
        org.junit.Assert.assertNotNull(numberFormat49);
        org.junit.Assert.assertNotNull(fractionFormat51);
        org.junit.Assert.assertNotNull(numberFormat52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "-1" + "'", str55, "-1");
        org.junit.Assert.assertNotNull(numberFormat57);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "java.text.ParsePosition[index=10,errorIndex=10]" + "'", str62, "java.text.ParsePosition[index=10,errorIndex=10]");
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj64);
    }

    @Test
    public void test16580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16580");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        org.apache.commons.math.fraction.FractionFormat fractionFormat1 = org.apache.commons.math.fraction.FractionFormat.getImproperInstance(locale0);
        java.util.Locale locale2 = java.util.Locale.KOREAN;
        java.util.Locale locale3 = java.util.Locale.KOREAN;
        java.lang.String str4 = locale2.getDisplayLanguage(locale3);
        java.lang.String str5 = locale2.getISO3Language();
        java.lang.String str6 = locale2.getCountry();
        java.lang.String str7 = locale0.getDisplayName(locale2);
        java.text.NumberFormat numberFormat8 = java.text.NumberFormat.getIntegerInstance(locale2);
        int int9 = numberFormat8.getMinimumFractionDigits();
        java.util.Locale locale10 = java.util.Locale.KOREAN;
        java.util.Locale locale11 = java.util.Locale.KOREAN;
        java.util.Locale locale12 = java.util.Locale.KOREAN;
        java.lang.String str13 = locale11.getDisplayLanguage(locale12);
        java.lang.String str14 = locale11.getISO3Language();
        java.lang.String str15 = locale10.getDisplayCountry(locale11);
        java.util.Locale locale16 = java.util.Locale.KOREAN;
        java.util.Locale locale17 = java.util.Locale.KOREAN;
        java.util.Locale locale18 = java.util.Locale.KOREAN;
        java.lang.String str19 = locale17.getDisplayLanguage(locale18);
        java.lang.String str20 = locale17.getISO3Language();
        java.lang.String str21 = locale16.getDisplayCountry(locale17);
        java.util.Locale locale22 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str23 = locale17.getDisplayLanguage(locale22);
        java.lang.String str24 = locale11.getDisplayName(locale22);
        java.lang.String str25 = locale11.getDisplayCountry();
        java.text.NumberFormat numberFormat26 = java.text.NumberFormat.getNumberInstance(locale11);
        java.text.NumberFormat numberFormat27 = java.text.NumberFormat.getNumberInstance(locale11);
        java.text.NumberFormat numberFormat28 = java.text.NumberFormat.getIntegerInstance();
        boolean boolean29 = numberFormat28.isGroupingUsed();
        numberFormat28.setParseIntegerOnly(false);
        java.lang.Number number33 = numberFormat28.parse("0%");
        numberFormat28.setMaximumFractionDigits((int) (byte) 0);
        numberFormat28.setParseIntegerOnly(false);
        java.lang.Number number39 = numberFormat28.parse("10,000%");
        java.util.Locale locale40 = java.util.Locale.KOREAN;
        java.util.Locale locale41 = java.util.Locale.KOREAN;
        java.lang.String str42 = locale40.getDisplayLanguage(locale41);
        java.lang.String str43 = locale41.getScript();
        java.lang.String str44 = locale41.getVariant();
        java.util.Locale locale45 = java.util.Locale.ROOT;
        org.apache.commons.math.fraction.FractionFormat fractionFormat46 = org.apache.commons.math.fraction.FractionFormat.getProperInstance(locale45);
        java.lang.String str47 = locale45.getISO3Language();
        java.util.Set<java.lang.Character> charSet48 = locale45.getExtensionKeys();
        java.util.Locale.Category category49 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale50 = java.util.Locale.KOREAN;
        java.util.Locale locale51 = java.util.Locale.KOREAN;
        java.lang.String str52 = locale50.getDisplayLanguage(locale51);
        java.lang.String str53 = locale51.getScript();
        java.lang.String str54 = locale51.getVariant();
        java.util.Locale.setDefault(category49, locale51);
        java.lang.String str56 = locale51.getDisplayName();
        java.util.Locale locale57 = java.util.Locale.UK;
        java.lang.String str58 = locale57.getDisplayScript();
        java.util.Set<java.lang.String> strSet59 = locale57.getUnicodeLocaleAttributes();
        java.util.Locale locale60 = java.util.Locale.ENGLISH;
        java.lang.String str61 = locale57.getDisplayCountry(locale60);
        java.lang.String str62 = locale51.getDisplayVariant(locale57);
        java.lang.String str63 = locale45.getDisplayName(locale57);
        java.util.Locale locale64 = java.util.Locale.US;
        java.lang.String str65 = locale45.getDisplayLanguage(locale64);
        java.lang.String str66 = locale64.getDisplayLanguage();
        java.util.Locale locale67 = java.util.Locale.UK;
        java.lang.String str68 = locale67.getDisplayScript();
        java.util.Set<java.lang.String> strSet69 = locale67.getUnicodeLocaleAttributes();
        java.util.Locale locale70 = java.util.Locale.ENGLISH;
        java.lang.String str71 = locale67.getDisplayCountry(locale70);
        java.lang.String str72 = locale64.getDisplayVariant(locale70);
        java.lang.String str73 = locale70.getDisplayScript();
        java.util.Locale locale74 = locale70.stripExtensions();
        java.lang.String str75 = locale41.getDisplayLanguage(locale74);
        org.apache.commons.math.fraction.FractionFormat fractionFormat76 = org.apache.commons.math.fraction.FractionFormat.getProperInstance(locale41);
        java.text.NumberFormat numberFormat77 = java.text.NumberFormat.getCurrencyInstance(locale41);
        boolean boolean78 = numberFormat28.equals((java.lang.Object) numberFormat77);
        org.apache.commons.math.fraction.ProperFractionFormat properFractionFormat79 = new org.apache.commons.math.fraction.ProperFractionFormat(numberFormat8, numberFormat27, numberFormat77);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction81 = properFractionFormat79.parse("java.text.ParseException: ko");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable fraction number: \"java.text.ParseException: ko\"");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertNotNull(fractionFormat1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str4, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "kor" + "'", str5, "kor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\uc911\uad6d\uc5b4" + "'", str7, "\uc911\uad6d\uc5b4");
        org.junit.Assert.assertNotNull(numberFormat8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str13, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "kor" + "'", str14, "kor");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ko");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "ko");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str19, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "kor" + "'", str20, "kor");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u671d\u9c9c\u6587" + "'", str23, "\u671d\u9c9c\u6587");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\u671d\u9c9c\u6587" + "'", str24, "\u671d\u9c9c\u6587");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(numberFormat26);
        org.junit.Assert.assertNotNull(numberFormat27);
        org.junit.Assert.assertNotNull(numberFormat28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + number33 + "' != '" + 0L + "'", number33, 0L);
        org.junit.Assert.assertEquals("'" + number39 + "' != '" + 10000L + "'", number39, 10000L);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "ko");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str42, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "");
        org.junit.Assert.assertNotNull(fractionFormat46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(charSet48);
        org.junit.Assert.assertTrue("'" + category49 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category49.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "ko");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str52, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str56, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(strSet59);
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "en");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "United Kingdom" + "'", str61, "United Kingdom");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "\uc601\uc5b4" + "'", str66, "\uc601\uc5b4");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(strSet69);
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "en");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "United Kingdom" + "'", str71, "United Kingdom");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "en");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "Korean" + "'", str75, "Korean");
        org.junit.Assert.assertNotNull(fractionFormat76);
        org.junit.Assert.assertNotNull(numberFormat77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test16581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16581");
        java.text.ParsePosition parsePosition1 = new java.text.ParsePosition((int) '4');
        java.util.Locale.LanguageRange[] languageRangeArray2 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList3 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList3, languageRangeArray2);
        java.util.Locale locale5 = java.util.Locale.KOREAN;
        java.util.Locale locale6 = java.util.Locale.KOREAN;
        java.lang.String str7 = locale5.getDisplayLanguage(locale6);
        java.lang.String str8 = locale6.getScript();
        java.util.Locale locale9 = java.util.Locale.KOREAN;
        java.util.Locale locale10 = java.util.Locale.GERMANY;
        java.util.Locale[] localeArray11 = new java.util.Locale[] { locale6, locale9, locale10 };
        java.util.ArrayList<java.util.Locale> localeList12 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList12, localeArray11);
        java.util.Locale.FilteringMode filteringMode14 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList15 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.util.Locale>) localeList12, filteringMode14);
        boolean boolean16 = parsePosition1.equals((java.lang.Object) languageRangeList3);
        java.util.Locale.LanguageRange[] languageRangeArray17 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList18 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18, languageRangeArray17);
        java.util.Locale locale20 = java.util.Locale.KOREAN;
        java.util.Locale locale21 = java.util.Locale.KOREAN;
        java.lang.String str22 = locale20.getDisplayLanguage(locale21);
        java.lang.String str23 = locale21.getScript();
        java.util.Locale locale24 = java.util.Locale.KOREAN;
        java.util.Locale locale25 = java.util.Locale.GERMANY;
        java.util.Locale[] localeArray26 = new java.util.Locale[] { locale21, locale24, locale25 };
        java.util.ArrayList<java.util.Locale> localeList27 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList27, localeArray26);
        java.util.Locale.FilteringMode filteringMode29 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList30 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.util.Locale>) localeList27, filteringMode29);
        java.lang.String[] strArray38 = new java.lang.String[] { "java.text.FieldPosition[field=0,attribute=java.text.NumberFormat$Field(per mille),beginIndex=0,endIndex=0]", "", "hi!", "kor", "10,000%", "\ud55c\uad6d\uc5b4", "kor" };
        java.util.ArrayList<java.lang.String> strList39 = new java.util.ArrayList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        java.util.List<java.lang.String> strList41 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.lang.String>) strList39);
        java.lang.String str42 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.lang.String>) strList41);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap43 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList44 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, strMap43);
        java.util.Locale.LanguageRange languageRange46 = new java.util.Locale.LanguageRange("US");
        java.util.Locale.LanguageRange languageRange48 = new java.util.Locale.LanguageRange("und-Canada");
        double double49 = languageRange48.getWeight();
        double double50 = languageRange48.getWeight();
        java.util.Locale.LanguageRange languageRange52 = new java.util.Locale.LanguageRange("CAN");
        double double53 = languageRange52.getWeight();
        double double54 = languageRange52.getWeight();
        java.util.Locale.LanguageRange languageRange56 = new java.util.Locale.LanguageRange("US");
        java.lang.String str57 = languageRange56.getRange();
        java.util.Locale.LanguageRange languageRange59 = new java.util.Locale.LanguageRange("CAN");
        java.lang.String str60 = languageRange59.getRange();
        java.lang.String str61 = languageRange59.getRange();
        double double62 = languageRange59.getWeight();
        java.lang.String str63 = languageRange59.getRange();
        java.util.Locale.LanguageRange[] languageRangeArray64 = new java.util.Locale.LanguageRange[] { languageRange46, languageRange48, languageRange52, languageRange56, languageRange59 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList65 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList65, languageRangeArray64);
        java.util.Locale.LanguageRange[] languageRangeArray67 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList68 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList68, languageRangeArray67);
        java.util.Locale locale70 = java.util.Locale.KOREAN;
        java.util.Locale locale71 = java.util.Locale.KOREAN;
        java.lang.String str72 = locale70.getDisplayLanguage(locale71);
        java.lang.String str73 = locale71.getScript();
        java.util.Locale locale74 = java.util.Locale.KOREAN;
        java.util.Locale locale75 = java.util.Locale.GERMANY;
        java.util.Locale[] localeArray76 = new java.util.Locale[] { locale71, locale74, locale75 };
        java.util.ArrayList<java.util.Locale> localeList77 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList77, localeArray76);
        java.util.Locale.FilteringMode filteringMode79 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList80 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList68, (java.util.Collection<java.util.Locale>) localeList77, filteringMode79);
        java.util.Locale.FilteringMode filteringMode81 = null;
        java.util.List<java.util.Locale> localeList82 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList65, (java.util.Collection<java.util.Locale>) localeList80, filteringMode81);
        java.util.Locale locale83 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.util.Locale>) localeList82);
        org.junit.Assert.assertNotNull(languageRangeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str7, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ko");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "de_DE");
        org.junit.Assert.assertNotNull(localeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + filteringMode14 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode14.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(languageRangeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ko");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str22, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "ko");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "de_DE");
        org.junit.Assert.assertNotNull(localeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + filteringMode29 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode29.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList30);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(languageRangeList44);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 1.0d + "'", double49 == 1.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 1.0d + "'", double50 == 1.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 1.0d + "'", double53 == 1.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 1.0d + "'", double54 == 1.0d);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "us" + "'", str57, "us");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "can" + "'", str60, "can");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "can" + "'", str61, "can");
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 1.0d + "'", double62 == 1.0d);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "can" + "'", str63, "can");
        org.junit.Assert.assertNotNull(languageRangeArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(languageRangeArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "ko");
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str72, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "ko");
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "de_DE");
        org.junit.Assert.assertNotNull(localeArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + filteringMode79 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode79.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList80);
        org.junit.Assert.assertNotNull(localeList82);
        org.junit.Assert.assertNull(locale83);
    }

    @Test
    public void test16582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16582");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) ' ', (int) 'u');
        long long3 = fraction2.longValue();
        java.util.Locale locale4 = java.util.Locale.TAIWAN;
        java.text.NumberFormat numberFormat5 = java.text.NumberFormat.getCurrencyInstance(locale4);
        java.text.NumberFormat numberFormat6 = java.text.NumberFormat.getInstance();
        java.lang.String str8 = numberFormat6.format(100L);
        int int9 = numberFormat6.getMinimumFractionDigits();
        numberFormat6.setMaximumIntegerDigits(1);
        java.text.NumberFormat numberFormat12 = java.text.NumberFormat.getPercentInstance();
        numberFormat12.setMaximumIntegerDigits((-1));
        java.math.RoundingMode roundingMode15 = numberFormat12.getRoundingMode();
        numberFormat6.setRoundingMode(roundingMode15);
        numberFormat5.setRoundingMode(roundingMode15);
        boolean boolean18 = numberFormat5.isParseIntegerOnly();
        boolean boolean19 = fraction2.equals((java.lang.Object) numberFormat5);
        java.text.NumberFormat numberFormat20 = java.text.NumberFormat.getCurrencyInstance();
        numberFormat20.setMinimumIntegerDigits((-1));
        java.lang.String str24 = numberFormat20.format((double) 100);
        org.apache.commons.math.fraction.FractionFormat fractionFormat25 = new org.apache.commons.math.fraction.FractionFormat(numberFormat5, numberFormat20);
        java.util.Locale locale27 = java.util.Locale.FRANCE;
        java.text.NumberFormat numberFormat28 = java.text.NumberFormat.getIntegerInstance(locale27);
        java.text.NumberFormat numberFormat29 = java.text.NumberFormat.getIntegerInstance(locale27);
        numberFormat29.setMaximumIntegerDigits(1);
        java.util.Locale locale32 = java.util.Locale.KOREAN;
        java.util.Locale locale33 = java.util.Locale.KOREAN;
        java.lang.String str34 = locale32.getDisplayLanguage(locale33);
        java.util.Locale locale35 = locale33.stripExtensions();
        java.util.Locale locale36 = java.util.Locale.ROOT;
        java.util.Locale locale37 = java.util.Locale.FRENCH;
        org.apache.commons.math.fraction.FractionFormat fractionFormat38 = org.apache.commons.math.fraction.FractionFormat.getProperInstance(locale37);
        java.lang.String str39 = locale36.getDisplayName(locale37);
        java.lang.String str40 = locale33.getDisplayName(locale37);
        java.text.NumberFormat numberFormat41 = java.text.NumberFormat.getInstance(locale37);
        java.util.Currency currency42 = numberFormat41.getCurrency();
        java.math.RoundingMode roundingMode43 = numberFormat41.getRoundingMode();
        java.text.NumberFormat numberFormat44 = null;
        org.apache.commons.math.fraction.ProperFractionFormat properFractionFormat45 = new org.apache.commons.math.fraction.ProperFractionFormat(numberFormat29, numberFormat41, numberFormat44);
        org.apache.commons.math.fraction.ProperFractionFormat properFractionFormat46 = new org.apache.commons.math.fraction.ProperFractionFormat(numberFormat41);
        java.text.ParsePosition parsePosition49 = new java.text.ParsePosition((int) (short) 10);
        parsePosition49.setErrorIndex((int) (byte) 1);
        int int52 = parsePosition49.getErrorIndex();
        parsePosition49.setErrorIndex(4095);
        org.apache.commons.math.fraction.Fraction fraction55 = properFractionFormat46.parse("Italian", parsePosition49);
        parsePosition49.setIndex(0);
        java.lang.String str58 = parsePosition49.toString();
        java.lang.Object obj59 = fractionFormat25.parseObject("und", parsePosition49);
        java.text.NumberFormat numberFormat60 = java.text.NumberFormat.getCurrencyInstance();
        java.text.NumberFormat numberFormat61 = java.text.NumberFormat.getPercentInstance();
        numberFormat61.setMaximumIntegerDigits((-1));
        java.text.NumberFormat numberFormat64 = java.text.NumberFormat.getPercentInstance();
        java.text.NumberFormat numberFormat65 = java.text.NumberFormat.getPercentInstance();
        numberFormat65.setMaximumIntegerDigits((-1));
        java.util.Currency currency68 = numberFormat65.getCurrency();
        numberFormat64.setCurrency(currency68);
        numberFormat61.setCurrency(currency68);
        org.apache.commons.math.fraction.FractionFormat fractionFormat71 = new org.apache.commons.math.fraction.FractionFormat(numberFormat60, numberFormat61);
        java.text.NumberFormat numberFormat72 = java.text.NumberFormat.getPercentInstance();
        numberFormat72.setMaximumIntegerDigits((-1));
        numberFormat72.setMinimumIntegerDigits(0);
        java.text.NumberFormat numberFormat77 = java.text.NumberFormat.getIntegerInstance();
        boolean boolean78 = numberFormat77.isGroupingUsed();
        numberFormat77.setParseIntegerOnly(false);
        java.lang.Number number82 = numberFormat77.parse("0%");
        org.apache.commons.math.fraction.ProperFractionFormat properFractionFormat83 = new org.apache.commons.math.fraction.ProperFractionFormat(numberFormat61, numberFormat72, numberFormat77);
        java.text.NumberFormat numberFormat84 = properFractionFormat83.getWholeFormat();
        java.text.NumberFormat numberFormat85 = properFractionFormat83.getWholeFormat();
        int int86 = numberFormat85.getMinimumFractionDigits();
        org.apache.commons.math.fraction.FractionFormat fractionFormat87 = new org.apache.commons.math.fraction.FractionFormat(numberFormat85);
        java.lang.Object obj88 = null;
        boolean boolean89 = numberFormat85.equals(obj88);
        fractionFormat25.setNumeratorFormat(numberFormat85);
        int int91 = numberFormat85.getMinimumFractionDigits();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(numberFormat5);
        org.junit.Assert.assertNotNull(numberFormat6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100" + "'", str8, "100");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(numberFormat12);
        org.junit.Assert.assertTrue("'" + roundingMode15 + "' != '" + java.math.RoundingMode.HALF_EVEN + "'", roundingMode15.equals(java.math.RoundingMode.HALF_EVEN));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(numberFormat20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\uffe5100" + "'", str24, "\uffe5100");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(numberFormat28);
        org.junit.Assert.assertNotNull(numberFormat29);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "ko");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str34, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "ko");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "fr");
        org.junit.Assert.assertNotNull(fractionFormat38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "cor\351en" + "'", str40, "cor\351en");
        org.junit.Assert.assertNotNull(numberFormat41);
        org.junit.Assert.assertNotNull(currency42);
        org.junit.Assert.assertEquals(currency42.toString(), "XXX");
        org.junit.Assert.assertTrue("'" + roundingMode43 + "' != '" + java.math.RoundingMode.HALF_EVEN + "'", roundingMode43.equals(java.math.RoundingMode.HALF_EVEN));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNull(fraction55);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "java.text.ParsePosition[index=0,errorIndex=9]" + "'", str58, "java.text.ParsePosition[index=0,errorIndex=9]");
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(numberFormat60);
        org.junit.Assert.assertNotNull(numberFormat61);
        org.junit.Assert.assertNotNull(numberFormat64);
        org.junit.Assert.assertNotNull(numberFormat65);
        org.junit.Assert.assertNotNull(currency68);
        org.junit.Assert.assertEquals(currency68.toString(), "JPY");
        org.junit.Assert.assertNotNull(numberFormat72);
        org.junit.Assert.assertNotNull(numberFormat77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertEquals("'" + number82 + "' != '" + 0L + "'", number82, 0L);
        org.junit.Assert.assertNotNull(numberFormat84);
        org.junit.Assert.assertNotNull(numberFormat85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
    }

    @Test
    public void test16583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16583");
        org.apache.commons.math.fraction.FractionFormat fractionFormat0 = org.apache.commons.math.fraction.FractionFormat.getProperInstance();
        java.util.Locale.Category category1 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale2 = java.util.Locale.KOREAN;
        java.util.Locale locale3 = java.util.Locale.KOREAN;
        java.lang.String str4 = locale2.getDisplayLanguage(locale3);
        java.lang.String str5 = locale3.getScript();
        java.lang.String str6 = locale3.getVariant();
        java.util.Locale.setDefault(category1, locale3);
        java.lang.String str8 = locale3.getDisplayName();
        java.text.NumberFormat numberFormat9 = java.text.NumberFormat.getIntegerInstance(locale3);
        java.text.NumberFormat numberFormat10 = java.text.NumberFormat.getIntegerInstance();
        java.text.NumberFormat numberFormat11 = java.text.NumberFormat.getPercentInstance();
        numberFormat11.setMaximumIntegerDigits((-1));
        java.text.NumberFormat numberFormat14 = java.text.NumberFormat.getPercentInstance();
        java.text.NumberFormat numberFormat15 = java.text.NumberFormat.getPercentInstance();
        numberFormat15.setMaximumIntegerDigits((-1));
        java.util.Currency currency18 = numberFormat15.getCurrency();
        numberFormat14.setCurrency(currency18);
        numberFormat11.setCurrency(currency18);
        java.text.NumberFormat numberFormat21 = java.text.NumberFormat.getPercentInstance();
        numberFormat21.setMaximumIntegerDigits((-1));
        java.util.Currency currency24 = numberFormat21.getCurrency();
        java.lang.String str26 = numberFormat21.format((double) 10);
        org.apache.commons.math.fraction.ProperFractionFormat properFractionFormat27 = new org.apache.commons.math.fraction.ProperFractionFormat(numberFormat10, numberFormat11, numberFormat21);
        java.text.NumberFormat numberFormat29 = java.text.NumberFormat.getInstance();
        java.lang.String str31 = numberFormat29.format(100L);
        java.text.NumberFormat numberFormat33 = java.text.NumberFormat.getPercentInstance();
        java.text.ParsePosition parsePosition36 = new java.text.ParsePosition((int) (short) 10);
        java.lang.Object obj37 = numberFormat33.parseObject("hi!", parsePosition36);
        java.lang.Number number38 = numberFormat29.parse("10,000%", parsePosition36);
        int int39 = parsePosition36.getErrorIndex();
        java.lang.Object obj40 = properFractionFormat27.parseObject("French", parsePosition36);
        java.util.Locale locale42 = java.util.Locale.FRENCH;
        java.lang.String str43 = locale42.getDisplayLanguage();
        org.apache.commons.math.fraction.FractionFormat fractionFormat44 = org.apache.commons.math.fraction.FractionFormat.getProperInstance(locale42);
        java.text.NumberFormat numberFormat45 = fractionFormat44.getNumeratorFormat();
        java.text.ParsePosition parsePosition48 = new java.text.ParsePosition((int) (short) 10);
        parsePosition48.setErrorIndex((int) (byte) 1);
        parsePosition48.setErrorIndex(0);
        org.apache.commons.math.fraction.Fraction fraction53 = fractionFormat44.parse("French", parsePosition48);
        org.apache.commons.math.fraction.Fraction fraction54 = properFractionFormat27.parse("", parsePosition48);
        java.util.Locale locale55 = java.util.Locale.KOREAN;
        java.util.Locale locale56 = java.util.Locale.KOREAN;
        java.lang.String str57 = locale55.getDisplayLanguage(locale56);
        java.text.NumberFormat numberFormat58 = java.text.NumberFormat.getNumberInstance(locale56);
        java.lang.Object obj59 = numberFormat58.clone();
        properFractionFormat27.setWholeFormat(numberFormat58);
        java.util.Locale locale61 = java.util.Locale.KOREAN;
        java.util.Locale locale62 = java.util.Locale.KOREAN;
        java.util.Locale locale63 = java.util.Locale.KOREAN;
        java.lang.String str64 = locale62.getDisplayLanguage(locale63);
        java.lang.String str65 = locale62.getISO3Language();
        java.lang.String str66 = locale61.getDisplayCountry(locale62);
        java.lang.String str67 = locale62.toLanguageTag();
        java.text.NumberFormat numberFormat68 = java.text.NumberFormat.getCurrencyInstance(locale62);
        boolean boolean69 = numberFormat68.isParseIntegerOnly();
        properFractionFormat27.setDenominatorFormat(numberFormat68);
        boolean boolean71 = numberFormat68.isParseIntegerOnly();
        org.apache.commons.math.fraction.FractionFormat fractionFormat72 = new org.apache.commons.math.fraction.FractionFormat(numberFormat9, numberFormat68);
        java.text.NumberFormat numberFormat73 = java.text.NumberFormat.getInstance();
        java.lang.String str75 = numberFormat73.format(100L);
        int int76 = numberFormat73.getMinimumFractionDigits();
        numberFormat73.setGroupingUsed(true);
        fractionFormat72.setNumeratorFormat(numberFormat73);
        fractionFormat0.setNumeratorFormat(numberFormat73);
        int int81 = numberFormat73.getMaximumFractionDigits();
        java.lang.String str83 = numberFormat73.format((long) 120);
        java.lang.String str85 = numberFormat73.format((double) (short) 116);
        org.junit.Assert.assertNotNull(fractionFormat0);
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category1.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str4, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str8, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertNotNull(numberFormat11);
        org.junit.Assert.assertNotNull(numberFormat14);
        org.junit.Assert.assertNotNull(numberFormat15);
        org.junit.Assert.assertNotNull(currency18);
        org.junit.Assert.assertEquals(currency18.toString(), "JPY");
        org.junit.Assert.assertNotNull(numberFormat21);
        org.junit.Assert.assertNotNull(currency24);
        org.junit.Assert.assertEquals(currency24.toString(), "JPY");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "0%" + "'", str26, "0%");
        org.junit.Assert.assertNotNull(numberFormat29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "100" + "'", str31, "100");
        org.junit.Assert.assertNotNull(numberFormat33);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(number38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\ud504\ub791\uc2a4\uc5b4" + "'", str43, "\ud504\ub791\uc2a4\uc5b4");
        org.junit.Assert.assertNotNull(fractionFormat44);
        org.junit.Assert.assertNotNull(numberFormat45);
        org.junit.Assert.assertNull(fraction53);
        org.junit.Assert.assertNull(fraction54);
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "ko");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str57, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertNotNull(numberFormat58);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "ko");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "ko");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str64, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "kor" + "'", str65, "kor");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "ko" + "'", str67, "ko");
        org.junit.Assert.assertNotNull(numberFormat68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(numberFormat73);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "100" + "'", str75, "100");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 3 + "'", int81 == 3);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "120" + "'", str83, "120");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "116" + "'", str85, "116");
    }

    @Test
    public void test16584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16584");
        java.text.NumberFormat numberFormat0 = java.text.NumberFormat.getPercentInstance();
        java.text.NumberFormat numberFormat1 = java.text.NumberFormat.getPercentInstance();
        numberFormat1.setMaximumIntegerDigits((-1));
        java.util.Currency currency4 = numberFormat1.getCurrency();
        numberFormat0.setCurrency(currency4);
        java.lang.String str7 = numberFormat0.format((double) 100);
        java.math.RoundingMode roundingMode8 = numberFormat0.getRoundingMode();
        int int9 = numberFormat0.getMinimumIntegerDigits();
        boolean boolean10 = numberFormat0.isParseIntegerOnly();
        org.junit.Assert.assertNotNull(numberFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertNotNull(currency4);
        org.junit.Assert.assertEquals(currency4.toString(), "JPY");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10,000%" + "'", str7, "10,000%");
        org.junit.Assert.assertTrue("'" + roundingMode8 + "' != '" + java.math.RoundingMode.HALF_EVEN + "'", roundingMode8.equals(java.math.RoundingMode.HALF_EVEN));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test16585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16585");
        java.text.ParseException parseException2 = new java.text.ParseException("Korean", (int) (byte) -117);
        java.lang.Throwable[] throwableArray3 = parseException2.getSuppressed();
        int int4 = parseException2.getErrorOffset();
        int int5 = parseException2.getErrorOffset();
        int int6 = parseException2.getErrorOffset();
        java.lang.Throwable[] throwableArray7 = parseException2.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-117) + "'", int4 == (-117));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-117) + "'", int5 == (-117));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-117) + "'", int6 == (-117));
        org.junit.Assert.assertNotNull(throwableArray7);
    }

    @Test
    public void test16586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16586");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        org.apache.commons.math.fraction.FractionFormat fractionFormat1 = org.apache.commons.math.fraction.FractionFormat.getProperInstance(locale0);
        java.lang.String str2 = locale0.getISO3Language();
        java.util.Set<java.lang.Character> charSet3 = locale0.getExtensionKeys();
        java.text.NumberFormat numberFormat4 = java.text.NumberFormat.getPercentInstance(locale0);
        java.lang.String str5 = locale0.getDisplayName();
        java.util.Set<java.lang.String> strSet6 = locale0.getUnicodeLocaleKeys();
        java.util.Locale.setDefault(locale0);
        java.util.Locale locale8 = locale0.stripExtensions();
        boolean boolean9 = locale0.hasExtensions();
        java.text.NumberFormat numberFormat10 = java.text.NumberFormat.getPercentInstance(locale0);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertNotNull(fractionFormat1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(numberFormat10);
    }

    @Test
    public void test16587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16587");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.text.NumberFormat numberFormat1 = java.text.NumberFormat.getNumberInstance(locale0);
        java.lang.String str2 = locale0.getDisplayName();
        java.lang.String str3 = locale0.getLanguage();
        java.lang.String str4 = locale0.getDisplayScript();
        java.util.Locale.setDefault(locale0);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Korean (South Korea)" + "'", str2, "Korean (South Korea)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ko" + "'", str3, "ko");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test16588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16588");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 0, (int) (short) -128);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert 0 to fraction (1/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16589");
        java.text.ParseException parseException2 = new java.text.ParseException("java.text.NumberFormat$Field(sign)", (int) (short) 13689);
        java.lang.Throwable throwable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            parseException2.addSuppressed(throwable3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16590");
        java.util.Locale locale1 = new java.util.Locale("java.text.FieldPosition[field=-1,attribute=java.text.NumberFormat$Field(per mille),beginIndex=-1,endIndex=0]");
        org.junit.Assert.assertEquals(locale1.toString(), "java.text.fieldposition[field=-1,attribute=java.text.numberformat$field(per mille),beginindex=-1,endindex=0]");
    }

    @Test
    public void test16591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16591");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.text.NumberFormat numberFormat1 = java.text.NumberFormat.getCurrencyInstance(locale0);
        numberFormat1.setMinimumIntegerDigits(3);
        java.math.RoundingMode roundingMode4 = numberFormat1.getRoundingMode();
        java.math.RoundingMode roundingMode5 = numberFormat1.getRoundingMode();
        java.lang.String str7 = numberFormat1.format((long) ' ');
        java.lang.String str9 = numberFormat1.format((-11700L));
        java.math.RoundingMode roundingMode10 = numberFormat1.getRoundingMode();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertTrue("'" + roundingMode4 + "' != '" + java.math.RoundingMode.HALF_EVEN + "'", roundingMode4.equals(java.math.RoundingMode.HALF_EVEN));
        org.junit.Assert.assertTrue("'" + roundingMode5 + "' != '" + java.math.RoundingMode.HALF_EVEN + "'", roundingMode5.equals(java.math.RoundingMode.HALF_EVEN));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\244032.00" + "'", str7, "\244032.00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-\24411,700.00" + "'", str9, "-\24411,700.00");
        org.junit.Assert.assertTrue("'" + roundingMode10 + "' != '" + java.math.RoundingMode.HALF_EVEN + "'", roundingMode10.equals(java.math.RoundingMode.HALF_EVEN));
    }

    @Test
    public void test16592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16592");
        java.text.NumberFormat.Field field0 = java.text.NumberFormat.Field.PERMILLE;
        java.text.FieldPosition fieldPosition2 = new java.text.FieldPosition((java.text.Format.Field) field0, (int) (short) 0);
        java.lang.String str3 = fieldPosition2.toString();
        java.lang.String str4 = fieldPosition2.toString();
        fieldPosition2.setBeginIndex((int) (byte) 10);
        fieldPosition2.setBeginIndex((int) '4');
        fieldPosition2.setBeginIndex((int) (short) 1);
        java.text.Format.Field field11 = fieldPosition2.getFieldAttribute();
        int int12 = fieldPosition2.getEndIndex();
        fieldPosition2.setEndIndex((int) '4');
        int int15 = fieldPosition2.getBeginIndex();
        org.junit.Assert.assertNotNull(field0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.text.FieldPosition[field=0,attribute=java.text.NumberFormat$Field(per mille),beginIndex=0,endIndex=0]" + "'", str3, "java.text.FieldPosition[field=0,attribute=java.text.NumberFormat$Field(per mille),beginIndex=0,endIndex=0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.text.FieldPosition[field=0,attribute=java.text.NumberFormat$Field(per mille),beginIndex=0,endIndex=0]" + "'", str4, "java.text.FieldPosition[field=0,attribute=java.text.NumberFormat$Field(per mille),beginIndex=0,endIndex=0]");
        org.junit.Assert.assertNotNull(field11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test16593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16593");
        java.text.ParsePosition parsePosition1 = new java.text.ParsePosition((int) '4');
        java.util.Locale.LanguageRange[] languageRangeArray2 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList3 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList3, languageRangeArray2);
        java.util.Locale locale5 = java.util.Locale.KOREAN;
        java.util.Locale locale6 = java.util.Locale.KOREAN;
        java.lang.String str7 = locale5.getDisplayLanguage(locale6);
        java.lang.String str8 = locale6.getScript();
        java.util.Locale locale9 = java.util.Locale.KOREAN;
        java.util.Locale locale10 = java.util.Locale.GERMANY;
        java.util.Locale[] localeArray11 = new java.util.Locale[] { locale6, locale9, locale10 };
        java.util.ArrayList<java.util.Locale> localeList12 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList12, localeArray11);
        java.util.Locale.FilteringMode filteringMode14 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList15 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.util.Locale>) localeList12, filteringMode14);
        boolean boolean16 = parsePosition1.equals((java.lang.Object) languageRangeList3);
        java.lang.String str17 = parsePosition1.toString();
        java.util.Locale locale18 = java.util.Locale.KOREA;
        java.text.NumberFormat numberFormat19 = java.text.NumberFormat.getNumberInstance(locale18);
        java.lang.String str20 = locale18.getDisplayName();
        java.lang.String str21 = locale18.getLanguage();
        java.text.NumberFormat numberFormat22 = java.text.NumberFormat.getInstance(locale18);
        boolean boolean23 = parsePosition1.equals((java.lang.Object) locale18);
        java.lang.String str24 = locale18.getISO3Language();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = locale18.getExtension('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str7, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ko");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "de_DE");
        org.junit.Assert.assertNotNull(localeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + filteringMode14 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode14.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java.text.ParsePosition[index=52,errorIndex=-1]" + "'", str17, "java.text.ParsePosition[index=52,errorIndex=-1]");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(numberFormat19);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\ud55c\uad6d\uc5b4\ub300\ud55c\ubbfc\uad6d)" + "'", str20, "\ud55c\uad6d\uc5b4\ub300\ud55c\ubbfc\uad6d)");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ko" + "'", str21, "ko");
        org.junit.Assert.assertNotNull(numberFormat22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "kor" + "'", str24, "kor");
    }

    @Test
    public void test16594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16594");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        org.apache.commons.math.fraction.FractionFormat fractionFormat1 = org.apache.commons.math.fraction.FractionFormat.getProperInstance(locale0);
        java.lang.String str2 = locale0.getISO3Language();
        java.util.Set<java.lang.Character> charSet3 = locale0.getExtensionKeys();
        java.util.Locale.Category category4 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale5 = java.util.Locale.KOREAN;
        java.util.Locale locale6 = java.util.Locale.KOREAN;
        java.lang.String str7 = locale5.getDisplayLanguage(locale6);
        java.lang.String str8 = locale6.getScript();
        java.lang.String str9 = locale6.getVariant();
        java.util.Locale.setDefault(category4, locale6);
        java.lang.String str11 = locale6.getDisplayName();
        java.util.Locale locale12 = java.util.Locale.UK;
        java.lang.String str13 = locale12.getDisplayScript();
        java.util.Set<java.lang.String> strSet14 = locale12.getUnicodeLocaleAttributes();
        java.util.Locale locale15 = java.util.Locale.ENGLISH;
        java.lang.String str16 = locale12.getDisplayCountry(locale15);
        java.lang.String str17 = locale6.getDisplayVariant(locale12);
        java.lang.String str18 = locale0.getDisplayName(locale12);
        java.util.Locale locale19 = java.util.Locale.US;
        java.lang.String str20 = locale0.getDisplayLanguage(locale19);
        java.lang.String str21 = locale19.getDisplayLanguage();
        java.util.Locale locale22 = java.util.Locale.UK;
        java.lang.String str23 = locale22.getDisplayScript();
        java.util.Set<java.lang.String> strSet24 = locale22.getUnicodeLocaleAttributes();
        java.util.Locale locale25 = java.util.Locale.ENGLISH;
        java.lang.String str26 = locale22.getDisplayCountry(locale25);
        java.lang.String str27 = locale19.getDisplayVariant(locale25);
        java.util.Locale locale31 = new java.util.Locale("-1", "\u610f\u5927\u5229\u6587\u610f\u5927\u5229)", "eng");
        java.lang.String str32 = locale31.getDisplayLanguage();
        java.lang.String str33 = locale25.getDisplayScript(locale31);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = locale25.getUnicodeLocaleType("-116");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: -116");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertNotNull(fractionFormat1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category4.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str7, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str11, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "United Kingdom" + "'", str16, "United Kingdom");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\uc601\uc5b4" + "'", str21, "\uc601\uc5b4");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "United Kingdom" + "'", str26, "United Kingdom");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
// flaky:         org.junit.Assert.assertEquals(locale31.toString(), "\u610f\u5927\u5229\u6587\u610f\u5927\u5229)_eng");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "-1" + "'", str32, "-1");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test16595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16595");
        java.text.NumberFormat numberFormat0 = java.text.NumberFormat.getIntegerInstance();
        java.text.NumberFormat numberFormat1 = java.text.NumberFormat.getPercentInstance();
        numberFormat1.setMaximumIntegerDigits((-1));
        java.text.NumberFormat numberFormat4 = java.text.NumberFormat.getPercentInstance();
        java.text.NumberFormat numberFormat5 = java.text.NumberFormat.getPercentInstance();
        numberFormat5.setMaximumIntegerDigits((-1));
        java.util.Currency currency8 = numberFormat5.getCurrency();
        numberFormat4.setCurrency(currency8);
        numberFormat1.setCurrency(currency8);
        java.text.NumberFormat numberFormat11 = java.text.NumberFormat.getPercentInstance();
        numberFormat11.setMaximumIntegerDigits((-1));
        java.util.Currency currency14 = numberFormat11.getCurrency();
        java.lang.String str16 = numberFormat11.format((double) 10);
        org.apache.commons.math.fraction.ProperFractionFormat properFractionFormat17 = new org.apache.commons.math.fraction.ProperFractionFormat(numberFormat0, numberFormat1, numberFormat11);
        java.text.NumberFormat numberFormat19 = java.text.NumberFormat.getInstance();
        java.lang.String str21 = numberFormat19.format(100L);
        java.text.NumberFormat numberFormat23 = java.text.NumberFormat.getPercentInstance();
        java.text.ParsePosition parsePosition26 = new java.text.ParsePosition((int) (short) 10);
        java.lang.Object obj27 = numberFormat23.parseObject("hi!", parsePosition26);
        java.lang.Number number28 = numberFormat19.parse("10,000%", parsePosition26);
        int int29 = parsePosition26.getErrorIndex();
        java.lang.Object obj30 = properFractionFormat17.parseObject("French", parsePosition26);
        java.util.Locale locale32 = java.util.Locale.FRENCH;
        java.lang.String str33 = locale32.getDisplayLanguage();
        org.apache.commons.math.fraction.FractionFormat fractionFormat34 = org.apache.commons.math.fraction.FractionFormat.getProperInstance(locale32);
        java.text.NumberFormat numberFormat35 = fractionFormat34.getNumeratorFormat();
        java.text.ParsePosition parsePosition38 = new java.text.ParsePosition((int) (short) 10);
        parsePosition38.setErrorIndex((int) (byte) 1);
        parsePosition38.setErrorIndex(0);
        org.apache.commons.math.fraction.Fraction fraction43 = fractionFormat34.parse("French", parsePosition38);
        org.apache.commons.math.fraction.Fraction fraction44 = properFractionFormat17.parse("", parsePosition38);
        java.util.Locale locale45 = java.util.Locale.KOREAN;
        java.util.Locale locale46 = java.util.Locale.KOREAN;
        java.lang.String str47 = locale45.getDisplayLanguage(locale46);
        java.text.NumberFormat numberFormat48 = java.text.NumberFormat.getNumberInstance(locale46);
        java.lang.Object obj49 = numberFormat48.clone();
        properFractionFormat17.setWholeFormat(numberFormat48);
        java.util.Locale locale51 = java.util.Locale.KOREAN;
        java.util.Locale locale52 = java.util.Locale.KOREAN;
        java.util.Locale locale53 = java.util.Locale.KOREAN;
        java.lang.String str54 = locale52.getDisplayLanguage(locale53);
        java.lang.String str55 = locale52.getISO3Language();
        java.lang.String str56 = locale51.getDisplayCountry(locale52);
        java.lang.String str57 = locale52.toLanguageTag();
        java.text.NumberFormat numberFormat58 = java.text.NumberFormat.getCurrencyInstance(locale52);
        boolean boolean59 = numberFormat58.isParseIntegerOnly();
        properFractionFormat17.setDenominatorFormat(numberFormat58);
        java.lang.Object obj61 = properFractionFormat17.clone();
        org.apache.commons.math.fraction.FractionFormat fractionFormat63 = org.apache.commons.math.fraction.FractionFormat.getImproperInstance();
        java.text.NumberFormat numberFormat64 = fractionFormat63.getNumeratorFormat();
        java.text.NumberFormat numberFormat66 = java.text.NumberFormat.getCurrencyInstance();
        java.text.NumberFormat numberFormat67 = java.text.NumberFormat.getPercentInstance();
        java.text.NumberFormat numberFormat68 = java.text.NumberFormat.getPercentInstance();
        numberFormat68.setMaximumIntegerDigits((-1));
        java.util.Currency currency71 = numberFormat68.getCurrency();
        numberFormat67.setCurrency(currency71);
        java.lang.String str74 = numberFormat67.format((double) 100);
        org.apache.commons.math.fraction.FractionFormat fractionFormat75 = org.apache.commons.math.fraction.FractionFormat.getImproperInstance();
        java.text.NumberFormat numberFormat76 = fractionFormat75.getNumeratorFormat();
        org.apache.commons.math.fraction.ProperFractionFormat properFractionFormat77 = new org.apache.commons.math.fraction.ProperFractionFormat(numberFormat66, numberFormat67, numberFormat76);
        java.text.ParsePosition parsePosition80 = new java.text.ParsePosition((int) (short) 10);
        parsePosition80.setErrorIndex((int) (byte) 1);
        org.apache.commons.math.fraction.Fraction fraction83 = properFractionFormat77.parse("fran\347ais", parsePosition80);
        java.text.NumberFormat numberFormat84 = java.text.NumberFormat.getPercentInstance();
        numberFormat84.setMaximumIntegerDigits((-1));
        java.util.Currency currency87 = numberFormat84.getCurrency();
        org.apache.commons.math.fraction.FractionFormat fractionFormat88 = new org.apache.commons.math.fraction.FractionFormat(numberFormat84);
        boolean boolean89 = parsePosition80.equals((java.lang.Object) fractionFormat88);
        java.lang.Object obj90 = numberFormat64.parseObject("java.text.ParseException: java.text.FieldPosition[field=0,attribute=java.text.NumberFormat$Field(per mille),beginIndex=0,endIndex=0]", parsePosition80);
        org.apache.commons.math.fraction.Fraction fraction91 = properFractionFormat17.parse("java.text.ParseException: java.text.ParsePosition[index=52,errorIndex=52]", parsePosition80);
        int int92 = parsePosition80.getIndex();
        org.junit.Assert.assertNotNull(numberFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(numberFormat5);
        org.junit.Assert.assertNotNull(currency8);
        org.junit.Assert.assertEquals(currency8.toString(), "KRW");
        org.junit.Assert.assertNotNull(numberFormat11);
        org.junit.Assert.assertNotNull(currency14);
        org.junit.Assert.assertEquals(currency14.toString(), "KRW");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0%" + "'", str16, "0%");
        org.junit.Assert.assertNotNull(numberFormat19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "100" + "'", str21, "100");
        org.junit.Assert.assertNotNull(numberFormat23);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(number28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\ud504\ub791\uc2a4\uc5b4" + "'", str33, "\ud504\ub791\uc2a4\uc5b4");
        org.junit.Assert.assertNotNull(fractionFormat34);
        org.junit.Assert.assertNotNull(numberFormat35);
        org.junit.Assert.assertNull(fraction43);
        org.junit.Assert.assertNull(fraction44);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "ko");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str47, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertNotNull(numberFormat48);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "ko");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "ko");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str54, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "kor" + "'", str55, "kor");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "ko" + "'", str57, "ko");
        org.junit.Assert.assertNotNull(numberFormat58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertNotNull(fractionFormat63);
        org.junit.Assert.assertNotNull(numberFormat64);
        org.junit.Assert.assertNotNull(numberFormat66);
        org.junit.Assert.assertNotNull(numberFormat67);
        org.junit.Assert.assertNotNull(numberFormat68);
        org.junit.Assert.assertNotNull(currency71);
        org.junit.Assert.assertEquals(currency71.toString(), "KRW");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "10,000%" + "'", str74, "10,000%");
        org.junit.Assert.assertNotNull(fractionFormat75);
        org.junit.Assert.assertNotNull(numberFormat76);
        org.junit.Assert.assertNull(fraction83);
        org.junit.Assert.assertNotNull(numberFormat84);
        org.junit.Assert.assertNotNull(currency87);
        org.junit.Assert.assertEquals(currency87.toString(), "KRW");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNull(obj90);
        org.junit.Assert.assertNull(fraction91);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 10 + "'", int92 == 10);
    }

    @Test
    public void test16596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16596");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder3.setVariant("Canada");
        java.util.Locale locale6 = builder5.build();
        java.util.Set<java.lang.String> strSet7 = locale6.getUnicodeLocaleAttributes();
        java.lang.String str8 = locale6.toString();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test16597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16597");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.lang.String str1 = locale0.getDisplayLanguage();
        org.apache.commons.math.fraction.FractionFormat fractionFormat2 = org.apache.commons.math.fraction.FractionFormat.getProperInstance(locale0);
        java.text.NumberFormat numberFormat3 = fractionFormat2.getNumeratorFormat();
        java.text.ParsePosition parsePosition6 = new java.text.ParsePosition((int) (short) 10);
        parsePosition6.setErrorIndex((int) (byte) 1);
        parsePosition6.setErrorIndex(0);
        org.apache.commons.math.fraction.Fraction fraction11 = fractionFormat2.parse("French", parsePosition6);
        java.text.NumberFormat numberFormat12 = java.text.NumberFormat.getIntegerInstance();
        java.text.NumberFormat numberFormat13 = java.text.NumberFormat.getPercentInstance();
        numberFormat13.setMaximumIntegerDigits((-1));
        java.text.NumberFormat numberFormat16 = java.text.NumberFormat.getPercentInstance();
        java.text.NumberFormat numberFormat17 = java.text.NumberFormat.getPercentInstance();
        numberFormat17.setMaximumIntegerDigits((-1));
        java.util.Currency currency20 = numberFormat17.getCurrency();
        numberFormat16.setCurrency(currency20);
        numberFormat13.setCurrency(currency20);
        java.text.NumberFormat numberFormat23 = java.text.NumberFormat.getPercentInstance();
        numberFormat23.setMaximumIntegerDigits((-1));
        java.util.Currency currency26 = numberFormat23.getCurrency();
        java.lang.String str28 = numberFormat23.format((double) 10);
        org.apache.commons.math.fraction.ProperFractionFormat properFractionFormat29 = new org.apache.commons.math.fraction.ProperFractionFormat(numberFormat12, numberFormat13, numberFormat23);
        fractionFormat2.setDenominatorFormat(numberFormat23);
        java.text.ParsePosition parsePosition33 = new java.text.ParsePosition((int) (short) 10);
        java.lang.Number number34 = numberFormat23.parse("java.text.AttributedCharacterIterator$Attribute(language)", parsePosition33);
        java.lang.Object obj35 = numberFormat23.clone();
        numberFormat23.setMinimumIntegerDigits((int) (byte) 97);
        numberFormat23.setGroupingUsed(true);
        numberFormat23.setMinimumFractionDigits((int) (byte) -11);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\ud504\ub791\uc2a4\uc5b4" + "'", str1, "\ud504\ub791\uc2a4\uc5b4");
        org.junit.Assert.assertNotNull(fractionFormat2);
        org.junit.Assert.assertNotNull(numberFormat3);
        org.junit.Assert.assertNull(fraction11);
        org.junit.Assert.assertNotNull(numberFormat12);
        org.junit.Assert.assertNotNull(numberFormat13);
        org.junit.Assert.assertNotNull(numberFormat16);
        org.junit.Assert.assertNotNull(numberFormat17);
        org.junit.Assert.assertNotNull(currency20);
        org.junit.Assert.assertEquals(currency20.toString(), "KRW");
        org.junit.Assert.assertNotNull(numberFormat23);
        org.junit.Assert.assertNotNull(currency26);
        org.junit.Assert.assertEquals(currency26.toString(), "KRW");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "0%" + "'", str28, "0%");
        org.junit.Assert.assertNull(number34);
        org.junit.Assert.assertNotNull(obj35);
    }

    @Test
    public void test16598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16598");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.lang.String str1 = locale0.getDisplayVariant();
        java.util.Locale locale2 = java.util.Locale.KOREAN;
        java.util.Locale locale3 = java.util.Locale.KOREAN;
        java.lang.String str4 = locale2.getDisplayLanguage(locale3);
        java.util.Locale locale5 = java.util.Locale.ITALIAN;
        java.lang.String str6 = locale3.getDisplayName(locale5);
        java.lang.String str7 = locale5.getDisplayLanguage();
        java.lang.String str8 = locale0.getDisplayName(locale5);
        java.lang.String str9 = locale0.toLanguageTag();
        java.util.Locale locale10 = java.util.Locale.US;
        java.lang.String str11 = locale0.getDisplayName(locale10);
        boolean boolean12 = locale10.hasExtensions();
        org.apache.commons.math.fraction.FractionFormat fractionFormat13 = org.apache.commons.math.fraction.FractionFormat.getImproperInstance(locale10);
        java.text.NumberFormat numberFormat14 = fractionFormat13.getDenominatorFormat();
        org.apache.commons.math.fraction.Fraction fraction17 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (byte) -43, (int) (short) 100);
        org.apache.commons.math.fraction.Fraction fraction18 = fraction17.abs();
        java.lang.StringBuffer stringBuffer19 = null;
        java.text.NumberFormat.Field field20 = java.text.NumberFormat.Field.PERMILLE;
        java.text.FieldPosition fieldPosition22 = new java.text.FieldPosition((java.text.Format.Field) field20, (int) (short) 0);
        java.lang.String str23 = fieldPosition22.toString();
        fieldPosition22.setEndIndex((int) 'a');
        java.text.NumberFormat numberFormat26 = java.text.NumberFormat.getIntegerInstance();
        java.text.NumberFormat numberFormat27 = java.text.NumberFormat.getPercentInstance();
        numberFormat27.setMaximumIntegerDigits((-1));
        java.text.NumberFormat numberFormat30 = java.text.NumberFormat.getPercentInstance();
        java.text.NumberFormat numberFormat31 = java.text.NumberFormat.getPercentInstance();
        numberFormat31.setMaximumIntegerDigits((-1));
        java.util.Currency currency34 = numberFormat31.getCurrency();
        numberFormat30.setCurrency(currency34);
        numberFormat27.setCurrency(currency34);
        java.text.NumberFormat numberFormat37 = java.text.NumberFormat.getPercentInstance();
        numberFormat37.setMaximumIntegerDigits((-1));
        java.util.Currency currency40 = numberFormat37.getCurrency();
        java.lang.String str42 = numberFormat37.format((double) 10);
        org.apache.commons.math.fraction.ProperFractionFormat properFractionFormat43 = new org.apache.commons.math.fraction.ProperFractionFormat(numberFormat26, numberFormat27, numberFormat37);
        java.text.NumberFormat numberFormat44 = java.text.NumberFormat.getInstance();
        java.lang.String str46 = numberFormat44.format(100L);
        properFractionFormat43.setWholeFormat(numberFormat44);
        java.text.NumberFormat numberFormat48 = properFractionFormat43.getWholeFormat();
        boolean boolean49 = fieldPosition22.equals((java.lang.Object) properFractionFormat43);
        int int50 = fieldPosition22.getEndIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer51 = fractionFormat13.format((java.lang.Object) fraction18, stringBuffer19, fieldPosition22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str4, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "coreano" + "'", str6, "coreano");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\uc774\ud0c8\ub9ac\uc544\uc5b4" + "'", str7, "\uc774\ud0c8\ub9ac\uc544\uc5b4");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "coreano" + "'", str8, "coreano");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ko" + "'", str9, "ko");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Korean" + "'", str11, "Korean");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(fractionFormat13);
        org.junit.Assert.assertNotNull(numberFormat14);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(field20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "java.text.FieldPosition[field=0,attribute=java.text.NumberFormat$Field(per mille),beginIndex=0,endIndex=0]" + "'", str23, "java.text.FieldPosition[field=0,attribute=java.text.NumberFormat$Field(per mille),beginIndex=0,endIndex=0]");
        org.junit.Assert.assertNotNull(numberFormat26);
        org.junit.Assert.assertNotNull(numberFormat27);
        org.junit.Assert.assertNotNull(numberFormat30);
        org.junit.Assert.assertNotNull(numberFormat31);
        org.junit.Assert.assertNotNull(currency34);
        org.junit.Assert.assertEquals(currency34.toString(), "KRW");
        org.junit.Assert.assertNotNull(numberFormat37);
        org.junit.Assert.assertNotNull(currency40);
        org.junit.Assert.assertEquals(currency40.toString(), "KRW");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "0%" + "'", str42, "0%");
        org.junit.Assert.assertNotNull(numberFormat44);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "100" + "'", str46, "100");
        org.junit.Assert.assertNotNull(numberFormat48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 97 + "'", int50 == 97);
    }

    @Test
    public void test16599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16599");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.text.NumberFormat numberFormat2 = java.text.NumberFormat.getPercentInstance();
        numberFormat2.setMinimumIntegerDigits((int) (short) 10);
        java.util.Locale locale5 = java.util.Locale.KOREAN;
        java.util.Locale locale6 = java.util.Locale.KOREAN;
        java.lang.String str7 = locale5.getDisplayLanguage(locale6);
        boolean boolean8 = numberFormat2.equals((java.lang.Object) locale6);
        org.apache.commons.math.fraction.FractionFormat fractionFormat9 = org.apache.commons.math.fraction.FractionFormat.getProperInstance(locale6);
        java.lang.String str10 = locale6.getDisplayScript();
        java.util.Locale.Builder builder11 = builder1.setLocale(locale6);
        java.util.Locale.Builder builder12 = builder11.clearExtensions();
        java.util.Locale.Category category13 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale14 = java.util.Locale.KOREAN;
        java.util.Locale locale15 = java.util.Locale.KOREAN;
        java.lang.String str16 = locale14.getDisplayLanguage(locale15);
        java.lang.String str17 = locale15.getScript();
        java.lang.String str18 = locale15.getVariant();
        java.util.Locale.setDefault(category13, locale15);
        java.util.Locale locale20 = java.util.Locale.getDefault(category13);
        java.util.Locale locale21 = java.util.Locale.FRENCH;
        org.apache.commons.math.fraction.FractionFormat fractionFormat22 = org.apache.commons.math.fraction.FractionFormat.getProperInstance(locale21);
        java.util.Locale.setDefault(category13, locale21);
        java.util.Locale.Builder builder24 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder26 = builder24.setVariant("");
        java.util.Locale.Builder builder27 = builder26.clear();
        java.util.Locale locale28 = java.util.Locale.KOREAN;
        java.util.Locale locale29 = java.util.Locale.KOREAN;
        java.lang.String str30 = locale28.getDisplayLanguage(locale29);
        java.lang.String str31 = locale28.getISO3Language();
        boolean boolean32 = locale28.hasExtensions();
        java.util.Locale.Builder builder33 = builder26.setLocale(locale28);
        java.text.NumberFormat numberFormat34 = java.text.NumberFormat.getPercentInstance(locale28);
        java.util.Locale locale35 = locale28.stripExtensions();
        java.util.Locale.setDefault(category13, locale35);
        java.util.Locale.Category category37 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale38 = java.util.Locale.KOREAN;
        java.util.Locale locale39 = java.util.Locale.KOREAN;
        java.lang.String str40 = locale38.getDisplayLanguage(locale39);
        java.lang.String str41 = locale39.getScript();
        java.lang.String str42 = locale39.getVariant();
        java.util.Locale.setDefault(category37, locale39);
        java.lang.String str44 = locale39.getDisplayName();
        java.util.Locale locale45 = java.util.Locale.UK;
        java.lang.String str46 = locale45.getDisplayScript();
        java.util.Set<java.lang.String> strSet47 = locale45.getUnicodeLocaleAttributes();
        java.util.Locale locale48 = java.util.Locale.ENGLISH;
        java.lang.String str49 = locale45.getDisplayCountry(locale48);
        java.lang.String str50 = locale39.getDisplayVariant(locale45);
        java.util.Locale locale51 = java.util.Locale.KOREAN;
        java.util.Locale locale52 = java.util.Locale.KOREAN;
        java.lang.String str53 = locale51.getDisplayLanguage(locale52);
        java.util.Locale locale54 = java.util.Locale.ITALIAN;
        java.lang.String str55 = locale52.getDisplayName(locale54);
        java.util.Locale.setDefault(locale54);
        java.lang.String str57 = locale39.getDisplayLanguage(locale54);
        java.util.Locale.setDefault(category13, locale54);
        java.util.Locale.Builder builder59 = builder11.setLocale(locale54);
        java.util.Locale locale60 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder61 = builder11.setLocale(locale60);
        java.util.Locale locale64 = new java.util.Locale("java.text.ParseException: java.text.ParseException: 100", "-1");
        org.apache.commons.math.fraction.FractionFormat fractionFormat65 = org.apache.commons.math.fraction.FractionFormat.getProperInstance(locale64);
        java.util.Locale.Category category66 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale67 = java.util.Locale.KOREAN;
        java.util.Locale locale68 = java.util.Locale.KOREAN;
        java.lang.String str69 = locale67.getDisplayLanguage(locale68);
        java.lang.String str70 = locale68.getScript();
        java.util.Locale.setDefault(category66, locale68);
        java.util.Locale locale72 = java.util.Locale.ENGLISH;
        java.text.NumberFormat numberFormat73 = java.text.NumberFormat.getPercentInstance(locale72);
        java.util.Locale locale74 = java.util.Locale.KOREAN;
        java.util.Locale locale75 = java.util.Locale.KOREAN;
        java.util.Locale locale76 = java.util.Locale.KOREAN;
        java.lang.String str77 = locale75.getDisplayLanguage(locale76);
        java.lang.String str78 = locale75.getISO3Language();
        java.lang.String str79 = locale74.getDisplayCountry(locale75);
        java.lang.String str80 = locale75.toLanguageTag();
        java.text.NumberFormat numberFormat81 = java.text.NumberFormat.getCurrencyInstance(locale75);
        java.lang.String str82 = locale72.getDisplayVariant(locale75);
        java.lang.String str83 = locale68.getDisplayCountry(locale72);
        java.lang.String str84 = locale64.getDisplayScript(locale68);
        org.apache.commons.math.fraction.FractionFormat fractionFormat85 = org.apache.commons.math.fraction.FractionFormat.getImproperInstance(locale68);
        java.lang.String str86 = locale68.getVariant();
        java.util.Locale locale87 = locale68.stripExtensions();
        java.text.NumberFormat numberFormat88 = java.text.NumberFormat.getInstance(locale68);
        java.util.Locale.Builder builder89 = builder61.setLocale(locale68);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(numberFormat2);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str7, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(fractionFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + category13 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category13.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str16, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ko");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr");
        org.junit.Assert.assertNotNull(fractionFormat22);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "ko");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str30, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "kor" + "'", str31, "kor");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(numberFormat34);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "ko");
        org.junit.Assert.assertTrue("'" + category37 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category37.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "ko");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str40, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str44, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(strSet47);
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "en");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "United Kingdom" + "'", str49, "United Kingdom");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "ko");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str53, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "it");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "coreano" + "'", str55, "coreano");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "coreano" + "'", str57, "coreano");
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "de_DE");
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertEquals(locale64.toString(), "java.text.parseexception: java.text.parseexception: 100_-1");
        org.junit.Assert.assertNotNull(fractionFormat65);
        org.junit.Assert.assertTrue("'" + category66 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category66.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "ko");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str69, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "en");
        org.junit.Assert.assertNotNull(numberFormat73);
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "ko");
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "ko");
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str77, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "kor" + "'", str78, "kor");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "ko" + "'", str80, "ko");
        org.junit.Assert.assertNotNull(numberFormat81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertNotNull(fractionFormat85);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertNotNull(locale87);
        org.junit.Assert.assertEquals(locale87.toString(), "ko");
        org.junit.Assert.assertNotNull(numberFormat88);
        org.junit.Assert.assertNotNull(builder89);
    }

    @Test
    public void test16600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16600");
        java.text.NumberFormat.Field field0 = java.text.NumberFormat.Field.PERMILLE;
        java.text.FieldPosition fieldPosition2 = new java.text.FieldPosition((java.text.Format.Field) field0, (int) (short) 0);
        java.lang.String str3 = fieldPosition2.toString();
        java.lang.String str4 = fieldPosition2.toString();
        fieldPosition2.setBeginIndex((int) (byte) 10);
        int int7 = fieldPosition2.getEndIndex();
        int int8 = fieldPosition2.getEndIndex();
        fieldPosition2.setEndIndex((int) ' ');
        fieldPosition2.setEndIndex((int) (short) -117);
        int int13 = fieldPosition2.getField();
        java.lang.String str14 = fieldPosition2.toString();
        fieldPosition2.setEndIndex((int) (short) 10);
        int int17 = fieldPosition2.getBeginIndex();
        org.junit.Assert.assertNotNull(field0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.text.FieldPosition[field=0,attribute=java.text.NumberFormat$Field(per mille),beginIndex=0,endIndex=0]" + "'", str3, "java.text.FieldPosition[field=0,attribute=java.text.NumberFormat$Field(per mille),beginIndex=0,endIndex=0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.text.FieldPosition[field=0,attribute=java.text.NumberFormat$Field(per mille),beginIndex=0,endIndex=0]" + "'", str4, "java.text.FieldPosition[field=0,attribute=java.text.NumberFormat$Field(per mille),beginIndex=0,endIndex=0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.text.FieldPosition[field=0,attribute=java.text.NumberFormat$Field(per mille),beginIndex=10,endIndex=-117]" + "'", str14, "java.text.FieldPosition[field=0,attribute=java.text.NumberFormat$Field(per mille),beginIndex=10,endIndex=-117]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test16601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16601");
        java.text.NumberFormat numberFormat0 = java.text.NumberFormat.getPercentInstance();
        numberFormat0.setMinimumIntegerDigits((int) (short) 10);
        java.util.Locale locale3 = java.util.Locale.KOREAN;
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.lang.String str5 = locale3.getDisplayLanguage(locale4);
        boolean boolean6 = numberFormat0.equals((java.lang.Object) locale4);
        java.text.ParsePosition parsePosition9 = new java.text.ParsePosition((int) '4');
        java.lang.Object obj10 = numberFormat0.parseObject("China", parsePosition9);
        int int11 = parsePosition9.getErrorIndex();
        java.lang.String str12 = parsePosition9.toString();
        int int13 = parsePosition9.getErrorIndex();
        java.text.NumberFormat.Field field14 = java.text.NumberFormat.Field.PERMILLE;
        java.text.FieldPosition fieldPosition16 = new java.text.FieldPosition((java.text.Format.Field) field14, (int) (short) 0);
        int int17 = fieldPosition16.getEndIndex();
        java.text.ParseException parseException20 = new java.text.ParseException("java.text.FieldPosition[field=0,attribute=java.text.NumberFormat$Field(per mille),beginIndex=0,endIndex=0]", 0);
        java.lang.Throwable[] throwableArray21 = parseException20.getSuppressed();
        int int22 = parseException20.getErrorOffset();
        boolean boolean23 = fieldPosition16.equals((java.lang.Object) parseException20);
        java.util.Locale.Builder builder24 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder26 = builder24.setVariant("");
        java.util.Locale.Builder builder27 = builder26.clear();
        java.util.Locale locale28 = java.util.Locale.KOREAN;
        java.util.Locale locale29 = java.util.Locale.KOREAN;
        java.lang.String str30 = locale28.getDisplayLanguage(locale29);
        java.lang.String str31 = locale28.getISO3Language();
        boolean boolean32 = locale28.hasExtensions();
        java.util.Locale.Builder builder33 = builder26.setLocale(locale28);
        java.util.Locale.Builder builder34 = builder33.clear();
        boolean boolean35 = fieldPosition16.equals((java.lang.Object) builder34);
        java.util.Locale.Builder builder36 = builder34.clear();
        java.util.Locale.Builder builder38 = builder34.setVariant("francese");
        java.util.Locale.Builder builder40 = builder38.addUnicodeLocaleAttribute("anglais");
        boolean boolean41 = parsePosition9.equals((java.lang.Object) builder38);
        java.util.Locale locale43 = new java.util.Locale("GBR");
        java.util.Locale locale44 = locale43.stripExtensions();
        java.util.Locale.Builder builder45 = builder38.setLocale(locale43);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder47 = builder45.removeUnicodeLocaleAttribute("java.text.ParseException: 10\240000 %");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: java.text.ParseException: 10?000 % [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberFormat0);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str5, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "java.text.ParsePosition[index=52,errorIndex=52]" + "'", str12, "java.text.ParsePosition[index=52,errorIndex=52]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(field14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "ko");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str30, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "kor" + "'", str31, "kor");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals(locale43.toString(), "gbr");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "gbr");
        org.junit.Assert.assertNotNull(builder45);
    }

    @Test
    public void test16602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16602");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.util.Locale locale1 = java.util.Locale.KOREAN;
        java.lang.String str2 = locale0.getDisplayLanguage(locale1);
        java.lang.String str3 = locale0.getISO3Language();
        java.lang.String str4 = locale0.getCountry();
        org.apache.commons.math.fraction.FractionFormat fractionFormat5 = org.apache.commons.math.fraction.FractionFormat.getImproperInstance(locale0);
        java.text.NumberFormat numberFormat6 = java.text.NumberFormat.getIntegerInstance();
        java.text.NumberFormat numberFormat7 = java.text.NumberFormat.getPercentInstance();
        numberFormat7.setMaximumIntegerDigits((-1));
        java.text.NumberFormat numberFormat10 = java.text.NumberFormat.getPercentInstance();
        java.text.NumberFormat numberFormat11 = java.text.NumberFormat.getPercentInstance();
        numberFormat11.setMaximumIntegerDigits((-1));
        java.util.Currency currency14 = numberFormat11.getCurrency();
        numberFormat10.setCurrency(currency14);
        numberFormat7.setCurrency(currency14);
        java.text.NumberFormat numberFormat17 = java.text.NumberFormat.getPercentInstance();
        numberFormat17.setMaximumIntegerDigits((-1));
        java.util.Currency currency20 = numberFormat17.getCurrency();
        java.lang.String str22 = numberFormat17.format((double) 10);
        org.apache.commons.math.fraction.ProperFractionFormat properFractionFormat23 = new org.apache.commons.math.fraction.ProperFractionFormat(numberFormat6, numberFormat7, numberFormat17);
        java.text.NumberFormat numberFormat24 = java.text.NumberFormat.getInstance();
        java.lang.String str26 = numberFormat24.format(100L);
        properFractionFormat23.setWholeFormat(numberFormat24);
        java.text.NumberFormat numberFormat28 = java.text.NumberFormat.getInstance();
        java.lang.String str30 = numberFormat28.format(100L);
        int int31 = numberFormat28.getMinimumFractionDigits();
        java.util.Locale locale32 = java.util.Locale.KOREAN;
        java.util.Locale locale33 = java.util.Locale.KOREAN;
        java.lang.String str34 = locale32.getDisplayLanguage(locale33);
        java.text.NumberFormat numberFormat35 = java.text.NumberFormat.getNumberInstance(locale33);
        java.lang.String str37 = numberFormat35.format((long) ' ');
        org.apache.commons.math.fraction.ProperFractionFormat properFractionFormat38 = new org.apache.commons.math.fraction.ProperFractionFormat(numberFormat24, numberFormat28, numberFormat35);
        java.text.NumberFormat numberFormat39 = java.text.NumberFormat.getCurrencyInstance();
        java.util.Currency currency40 = numberFormat39.getCurrency();
        numberFormat24.setCurrency(currency40);
        fractionFormat5.setDenominatorFormat(numberFormat24);
        java.util.Locale locale43 = java.util.Locale.TAIWAN;
        java.text.NumberFormat numberFormat44 = java.text.NumberFormat.getCurrencyInstance(locale43);
        java.text.NumberFormat numberFormat45 = java.text.NumberFormat.getInstance();
        java.lang.String str47 = numberFormat45.format(100L);
        int int48 = numberFormat45.getMinimumFractionDigits();
        numberFormat45.setMaximumIntegerDigits(1);
        java.text.NumberFormat numberFormat51 = java.text.NumberFormat.getPercentInstance();
        numberFormat51.setMaximumIntegerDigits((-1));
        java.math.RoundingMode roundingMode54 = numberFormat51.getRoundingMode();
        numberFormat45.setRoundingMode(roundingMode54);
        numberFormat44.setRoundingMode(roundingMode54);
        numberFormat24.setRoundingMode(roundingMode54);
        java.lang.Object obj58 = numberFormat24.clone();
        numberFormat24.setMinimumFractionDigits((int) (short) -13572);
        java.lang.Object obj61 = numberFormat24.clone();
        numberFormat24.setGroupingUsed(false);
        java.math.RoundingMode roundingMode64 = numberFormat24.getRoundingMode();
        numberFormat24.setMinimumIntegerDigits((-35));
        java.lang.String str68 = numberFormat24.format((double) (short) -117);
        int int69 = numberFormat24.getMaximumFractionDigits();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str2, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "kor" + "'", str3, "kor");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(fractionFormat5);
        org.junit.Assert.assertNotNull(numberFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertNotNull(numberFormat11);
        org.junit.Assert.assertNotNull(currency14);
        org.junit.Assert.assertEquals(currency14.toString(), "XXX");
        org.junit.Assert.assertNotNull(numberFormat17);
        org.junit.Assert.assertNotNull(currency20);
        org.junit.Assert.assertEquals(currency20.toString(), "XXX");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0%" + "'", str22, "0%");
        org.junit.Assert.assertNotNull(numberFormat24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "100" + "'", str26, "100");
        org.junit.Assert.assertNotNull(numberFormat28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "100" + "'", str30, "100");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "ko");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str34, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertNotNull(numberFormat35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "32" + "'", str37, "32");
        org.junit.Assert.assertNotNull(numberFormat39);
        org.junit.Assert.assertNotNull(currency40);
        org.junit.Assert.assertEquals(currency40.toString(), "XXX");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(numberFormat44);
        org.junit.Assert.assertNotNull(numberFormat45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "100" + "'", str47, "100");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(numberFormat51);
        org.junit.Assert.assertTrue("'" + roundingMode54 + "' != '" + java.math.RoundingMode.HALF_EVEN + "'", roundingMode54.equals(java.math.RoundingMode.HALF_EVEN));
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertTrue("'" + roundingMode64 + "' != '" + java.math.RoundingMode.HALF_EVEN + "'", roundingMode64.equals(java.math.RoundingMode.HALF_EVEN));
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "-117" + "'", str68, "-117");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 3 + "'", int69 == 3);
    }

    @Test
    public void test16603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16603");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((-13572.0d), (double) 1.0002443f, (int) (short) -117);
    }

    @Test
    public void test16604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16604");
        java.text.NumberFormat.Field field0 = java.text.NumberFormat.Field.PERMILLE;
        java.text.FieldPosition fieldPosition2 = new java.text.FieldPosition((java.text.Format.Field) field0, (int) (short) 0);
        java.lang.String str3 = fieldPosition2.toString();
        java.lang.String str4 = fieldPosition2.toString();
        fieldPosition2.setBeginIndex((int) (byte) 10);
        fieldPosition2.setBeginIndex((int) '4');
        boolean boolean10 = fieldPosition2.equals((java.lang.Object) (short) -1);
        java.text.Format.Field field11 = fieldPosition2.getFieldAttribute();
        java.text.FieldPosition fieldPosition13 = new java.text.FieldPosition(field11, 117);
        java.lang.String str14 = field11.toString();
        java.text.FieldPosition fieldPosition16 = new java.text.FieldPosition(field11, 120);
        int int17 = fieldPosition16.getField();
        java.lang.String str18 = fieldPosition16.toString();
        java.lang.String str19 = fieldPosition16.toString();
        org.junit.Assert.assertNotNull(field0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.text.FieldPosition[field=0,attribute=java.text.NumberFormat$Field(per mille),beginIndex=0,endIndex=0]" + "'", str3, "java.text.FieldPosition[field=0,attribute=java.text.NumberFormat$Field(per mille),beginIndex=0,endIndex=0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.text.FieldPosition[field=0,attribute=java.text.NumberFormat$Field(per mille),beginIndex=0,endIndex=0]" + "'", str4, "java.text.FieldPosition[field=0,attribute=java.text.NumberFormat$Field(per mille),beginIndex=0,endIndex=0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(field11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.text.NumberFormat$Field(per mille)" + "'", str14, "java.text.NumberFormat$Field(per mille)");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 120 + "'", int17 == 120);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java.text.FieldPosition[field=120,attribute=java.text.NumberFormat$Field(per mille),beginIndex=0,endIndex=0]" + "'", str18, "java.text.FieldPosition[field=120,attribute=java.text.NumberFormat$Field(per mille),beginIndex=0,endIndex=0]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "java.text.FieldPosition[field=120,attribute=java.text.NumberFormat$Field(per mille),beginIndex=0,endIndex=0]" + "'", str19, "java.text.FieldPosition[field=120,attribute=java.text.NumberFormat$Field(per mille),beginIndex=0,endIndex=0]");
    }

    @Test
    public void test16605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16605");
        java.util.Locale locale3 = new java.util.Locale("JAVA.TEXT.ATTRIBUTEDCHARACTERITERATOR$ATTRIBUTE(INPUT_METHOD_SEGMENT)", "13,455", "java.text.FieldPosition[field=32,attribute=null,beginIndex=0,endIndex=0]");
        org.junit.Assert.assertEquals(locale3.toString(), "java.text.attributedcharacteriterator$attribute(input_method_segment)_13,455_java.text.FieldPosition[field=32,attribute=null,beginIndex=0,endIndex=0]");
    }

    @Test
    public void test16606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16606");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("java.text.AttributedCharacterIterator$Attribute(reading)");
        java.lang.String str2 = locale1.getISO3Language();
        java.util.Locale locale5 = new java.util.Locale("java.text.FieldPosition[field=0,attribute=java.text.NumberFormat$Field(per mille),beginIndex=10,endIndex=32]", "java.text.FieldPosition[field=0,attribute=java.text.NumberFormat$Field(per mille),beginIndex=10,endIndex=0]");
        java.lang.String str6 = locale1.getDisplayVariant(locale5);
        java.util.Locale.setDefault(locale5);
        java.lang.String str8 = locale5.getScript();
        java.util.Locale.Builder builder9 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder11 = builder9.setVariant("");
        java.util.Locale.Builder builder12 = builder11.clear();
        java.util.Locale locale13 = java.util.Locale.KOREAN;
        java.util.Locale locale14 = java.util.Locale.KOREAN;
        java.lang.String str15 = locale13.getDisplayLanguage(locale14);
        java.lang.String str16 = locale13.getISO3Language();
        boolean boolean17 = locale13.hasExtensions();
        java.util.Locale.Builder builder18 = builder11.setLocale(locale13);
        java.util.Locale.Builder builder19 = builder18.clear();
        java.util.Locale.Builder builder20 = builder18.clear();
        java.util.Locale.Builder builder22 = builder20.setLanguageTag("Chinese");
        java.util.Locale.Builder builder25 = builder20.setExtension('a', "Canada");
        java.util.Locale.Builder builder28 = builder20.setExtension('u', "");
        java.util.Locale locale29 = builder28.build();
        java.util.Locale.Builder builder30 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder32 = builder30.setVariant("");
        java.util.Locale.Builder builder33 = builder32.clear();
        java.util.Locale locale34 = java.util.Locale.KOREAN;
        java.util.Locale locale35 = java.util.Locale.KOREAN;
        java.lang.String str36 = locale34.getDisplayLanguage(locale35);
        java.lang.String str37 = locale34.getISO3Language();
        boolean boolean38 = locale34.hasExtensions();
        java.util.Locale.Builder builder39 = builder32.setLocale(locale34);
        java.util.Locale.Builder builder40 = builder39.clear();
        java.util.Locale.Builder builder41 = builder39.clear();
        java.util.Locale.Builder builder43 = builder41.setLanguageTag("Chinese");
        java.util.Locale.Builder builder46 = builder41.setExtension('a', "Canada");
        java.util.Locale.Builder builder49 = builder41.setExtension('u', "");
        java.util.Locale locale50 = builder49.build();
        java.util.Set<java.lang.String> strSet51 = locale50.getUnicodeLocaleKeys();
        java.lang.String str52 = locale29.getDisplayLanguage(locale50);
        org.apache.commons.math.fraction.FractionFormat fractionFormat53 = org.apache.commons.math.fraction.FractionFormat.getProperInstance(locale50);
        java.lang.String str54 = locale5.getDisplayName(locale50);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals(locale5.toString(), "java.text.fieldposition[field=0,attribute=java.text.numberformat$field(per mille),beginindex=10,endindex=32]_JAVA.TEXT.FIELDPOSITION[FIELD=0,ATTRIBUTE=JAVA.TEXT.NUMBERFORMAT$FIELD(PER MILLE),BEGININDEX=10,ENDINDEX=0]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ko");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str15, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "kor" + "'", str16, "kor");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "chinese__#a-canada");
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "ko");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str36, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "kor" + "'", str37, "kor");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "chinese__#a-canada");
        org.junit.Assert.assertNotNull(strSet51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "chinese" + "'", str52, "chinese");
        org.junit.Assert.assertNotNull(fractionFormat53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "java.text.fieldposition[field=0,attribute=java.text.numberformat$field(per mille),beginindex=10,endindex=32] (JAVA.TEXT.FIELDPOSITION[FIELD=0,ATTRIBUTE=JAVA.TEXT.NUMBERFORMAT$FIELD(PER MILLE),BEGININDEX=10,ENDINDEX=0])" + "'", str54, "java.text.fieldposition[field=0,attribute=java.text.numberformat$field(per mille),beginindex=10,endindex=32] (JAVA.TEXT.FIELDPOSITION[FIELD=0,ATTRIBUTE=JAVA.TEXT.NUMBERFORMAT$FIELD(PER MILLE),BEGININDEX=10,ENDINDEX=0])");
    }

    @Test
    public void test16607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16607");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.addUnicodeLocaleAttribute("francese");
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale5 = java.util.Locale.KOREAN;
        java.util.Locale locale6 = java.util.Locale.KOREAN;
        java.lang.String str7 = locale5.getDisplayLanguage(locale6);
        java.lang.String str8 = locale6.getScript();
        java.lang.String str9 = locale6.getCountry();
        java.text.NumberFormat numberFormat10 = java.text.NumberFormat.getNumberInstance(locale6);
        java.util.Locale.Builder builder11 = builder3.setLocale(locale6);
        java.lang.String str12 = locale6.getScript();
        java.util.Locale.Builder builder13 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder15 = builder13.setVariant("");
        java.util.Locale.Builder builder16 = builder15.clear();
        java.util.Locale locale17 = java.util.Locale.KOREAN;
        java.util.Locale locale18 = java.util.Locale.KOREAN;
        java.lang.String str19 = locale17.getDisplayLanguage(locale18);
        java.lang.String str20 = locale17.getISO3Language();
        boolean boolean21 = locale17.hasExtensions();
        java.util.Locale.Builder builder22 = builder15.setLocale(locale17);
        java.text.NumberFormat numberFormat23 = java.text.NumberFormat.getPercentInstance(locale17);
        java.util.Locale locale24 = locale17.stripExtensions();
        java.text.NumberFormat numberFormat25 = java.text.NumberFormat.getCurrencyInstance(locale17);
        java.lang.String str26 = locale17.getDisplayScript();
        org.apache.commons.math.fraction.FractionFormat fractionFormat27 = org.apache.commons.math.fraction.FractionFormat.getProperInstance(locale17);
        java.util.Locale locale28 = java.util.Locale.KOREAN;
        java.util.Locale locale29 = java.util.Locale.KOREAN;
        java.lang.String str30 = locale28.getDisplayLanguage(locale29);
        java.lang.String str31 = locale28.getISO3Language();
        java.lang.String str32 = locale28.getCountry();
        java.lang.String str33 = locale28.getVariant();
        org.apache.commons.math.fraction.FractionFormat fractionFormat34 = org.apache.commons.math.fraction.FractionFormat.getProperInstance(locale28);
        java.util.Set<java.lang.Character> charSet35 = locale28.getExtensionKeys();
        java.util.Set<java.lang.Character> charSet36 = locale28.getExtensionKeys();
        java.lang.String str37 = locale17.getDisplayCountry(locale28);
        java.text.NumberFormat numberFormat38 = java.text.NumberFormat.getNumberInstance(locale17);
        java.lang.String str39 = locale6.getDisplayVariant(locale17);
        java.util.Locale locale40 = java.util.Locale.GERMANY;
        java.lang.String str41 = locale40.getDisplayScript();
        java.lang.String str42 = locale40.getDisplayScript();
        java.util.Locale locale43 = java.util.Locale.KOREAN;
        java.lang.String str44 = locale43.getDisplayVariant();
        java.lang.String str45 = locale43.getDisplayScript();
        java.lang.String str46 = locale43.getDisplayCountry();
        java.lang.String str47 = locale40.getDisplayName(locale43);
        java.lang.String str48 = locale40.getDisplayName();
        java.util.Locale locale49 = java.util.Locale.KOREAN;
        java.util.Locale locale50 = java.util.Locale.KOREAN;
        java.lang.String str51 = locale49.getDisplayLanguage(locale50);
        java.lang.String str52 = locale49.getISO3Language();
        java.lang.String str53 = locale49.getScript();
        java.lang.String str54 = locale49.getDisplayScript();
        java.lang.String str55 = locale49.getDisplayVariant();
        java.lang.String str56 = locale40.getDisplayLanguage(locale49);
        java.util.Locale.Builder builder57 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder59 = builder57.setVariant("");
        java.util.Locale.Builder builder61 = builder59.setVariant("French");
        java.util.Locale.Builder builder63 = builder59.setLanguageTag("Kanada");
        java.util.Locale locale64 = builder63.build();
        java.lang.String str65 = locale49.getDisplayLanguage(locale64);
        java.lang.String str66 = locale17.getDisplayVariant(locale49);
        java.lang.String str67 = locale49.getDisplayLanguage();
        java.text.NumberFormat numberFormat68 = java.text.NumberFormat.getPercentInstance(locale49);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str7, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "ko");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str19, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "kor" + "'", str20, "kor");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(numberFormat23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "ko");
        org.junit.Assert.assertNotNull(numberFormat25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(fractionFormat27);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "ko");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str30, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "kor" + "'", str31, "kor");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(fractionFormat34);
        org.junit.Assert.assertNotNull(charSet35);
        org.junit.Assert.assertNotNull(charSet36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(numberFormat38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
// flaky:         org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)" + "'", str47, "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "German (Germany)" + "'", str48, "German (Germany)");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "ko");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str51, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "kor" + "'", str52, "kor");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "\ub3c5\uc77c\uc5b4" + "'", str56, "\ub3c5\uc77c\uc5b4");
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "kanada");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Korean" + "'", str65, "Korean");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Korean" + "'", str67, "Korean");
        org.junit.Assert.assertNotNull(numberFormat68);
    }

    @Test
    public void test16608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16608");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.ONE;
        org.apache.commons.math.fraction.Fraction fraction3 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) 'u', (int) (byte) -1);
        java.lang.String str4 = org.apache.commons.math.fraction.FractionFormat.formatFraction(fraction3);
        org.apache.commons.math.fraction.Fraction fraction5 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction8 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) 'u', (int) (byte) -1);
        int int9 = fraction8.intValue();
        org.apache.commons.math.fraction.Fraction fraction10 = fraction5.subtract(fraction8);
        org.apache.commons.math.fraction.Fraction fraction11 = fraction3.add(fraction5);
        org.apache.commons.math.fraction.Fraction fraction12 = fraction3.abs();
        org.apache.commons.math.fraction.Fraction fraction13 = fraction0.subtract(fraction12);
        org.apache.commons.math.fraction.Fraction fraction16 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) 'u', (int) (byte) -1);
        org.apache.commons.math.fraction.Fraction fraction17 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction20 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) 'u', (int) (byte) -1);
        int int21 = fraction20.intValue();
        org.apache.commons.math.fraction.Fraction fraction22 = fraction17.subtract(fraction20);
        org.apache.commons.math.fraction.Fraction fraction23 = fraction16.multiply(fraction17);
        org.apache.commons.math.fraction.Fraction fraction24 = fraction13.add(fraction17);
        org.apache.commons.math.fraction.Fraction fraction27 = new org.apache.commons.math.fraction.Fraction((int) '4', (int) '#');
        org.apache.commons.math.fraction.Fraction fraction30 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) 'u', (int) (byte) -1);
        org.apache.commons.math.fraction.Fraction fraction31 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction34 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) 'u', (int) (byte) -1);
        int int35 = fraction34.intValue();
        org.apache.commons.math.fraction.Fraction fraction36 = fraction31.subtract(fraction34);
        org.apache.commons.math.fraction.Fraction fraction37 = fraction30.multiply(fraction31);
        org.apache.commons.math.fraction.Fraction fraction38 = fraction27.multiply(fraction31);
        int int39 = fraction24.compareTo((java.lang.Object) fraction38);
        org.apache.commons.math.fraction.Fraction fraction40 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction43 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) 'u', (int) (byte) -1);
        int int44 = fraction43.intValue();
        org.apache.commons.math.fraction.Fraction fraction45 = fraction40.subtract(fraction43);
        boolean boolean47 = fraction43.equals((java.lang.Object) 'x');
        org.apache.commons.math.fraction.Fraction fraction48 = fraction38.multiply(fraction43);
        org.apache.commons.math.fraction.Fraction fraction49 = fraction43.abs();
        org.apache.commons.math.fraction.Fraction fraction52 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) 'u', (int) (byte) -1);
        org.apache.commons.math.fraction.Fraction fraction53 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction56 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) 'u', (int) (byte) -1);
        int int57 = fraction56.intValue();
        org.apache.commons.math.fraction.Fraction fraction58 = fraction53.subtract(fraction56);
        org.apache.commons.math.fraction.Fraction fraction59 = fraction52.multiply(fraction53);
        org.apache.commons.math.fraction.Fraction fraction61 = new org.apache.commons.math.fraction.Fraction((double) (-1L));
        org.apache.commons.math.fraction.Fraction fraction62 = fraction59.add(fraction61);
        org.apache.commons.math.fraction.Fraction fraction63 = fraction43.subtract(fraction61);
        double double64 = fraction43.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction66 = new org.apache.commons.math.fraction.Fraction((double) 0.0f);
        org.apache.commons.math.fraction.Fraction fraction67 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction70 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) 'u', (int) (byte) -1);
        int int71 = fraction70.intValue();
        org.apache.commons.math.fraction.Fraction fraction72 = fraction67.subtract(fraction70);
        boolean boolean74 = fraction70.equals((java.lang.Object) 'x');
        org.apache.commons.math.fraction.Fraction fraction75 = fraction70.reciprocal();
        float float76 = fraction70.floatValue();
        org.apache.commons.math.fraction.Fraction fraction77 = fraction66.multiply(fraction70);
        long long78 = fraction77.longValue();
        org.apache.commons.math.fraction.Fraction fraction81 = new org.apache.commons.math.fraction.Fraction((int) '#', 100);
        org.apache.commons.math.fraction.Fraction fraction82 = fraction77.add(fraction81);
        org.apache.commons.math.fraction.Fraction fraction83 = fraction43.multiply(fraction81);
        org.apache.commons.math.fraction.Fraction fraction84 = fraction43.abs();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-117 / 1" + "'", str4, "-117 / 1");
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-117) + "'", int9 == (-117));
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-117) + "'", int21 == (-117));
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-117) + "'", int35 == (-117));
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-117) + "'", int44 == (-117));
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-117) + "'", int57 == (-117));
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertNotNull(fraction63);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + (-117.0d) + "'", double64 == (-117.0d));
        org.junit.Assert.assertNotNull(fraction67);
        org.junit.Assert.assertNotNull(fraction70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-117) + "'", int71 == (-117));
        org.junit.Assert.assertNotNull(fraction72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(fraction75);
        org.junit.Assert.assertTrue("'" + float76 + "' != '" + (-117.0f) + "'", float76 == (-117.0f));
        org.junit.Assert.assertNotNull(fraction77);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 0L + "'", long78 == 0L);
        org.junit.Assert.assertNotNull(fraction82);
        org.junit.Assert.assertNotNull(fraction83);
        org.junit.Assert.assertNotNull(fraction84);
    }

    @Test
    public void test16609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16609");
        java.text.NumberFormat numberFormat0 = java.text.NumberFormat.getCurrencyInstance();
        java.util.Currency currency1 = numberFormat0.getCurrency();
        boolean boolean2 = numberFormat0.isParseIntegerOnly();
        java.text.NumberFormat numberFormat3 = java.text.NumberFormat.getPercentInstance();
        numberFormat3.setMaximumIntegerDigits((-1));
        java.util.Currency currency6 = numberFormat3.getCurrency();
        java.lang.String str8 = numberFormat3.format((double) 10);
        org.apache.commons.math.fraction.FractionFormat fractionFormat9 = org.apache.commons.math.fraction.FractionFormat.getImproperInstance();
        java.text.NumberFormat numberFormat10 = fractionFormat9.getNumeratorFormat();
        java.text.NumberFormat numberFormat11 = java.text.NumberFormat.getPercentInstance();
        java.text.NumberFormat numberFormat12 = java.text.NumberFormat.getPercentInstance();
        numberFormat12.setMaximumIntegerDigits((-1));
        java.util.Currency currency15 = numberFormat12.getCurrency();
        numberFormat11.setCurrency(currency15);
        numberFormat10.setCurrency(currency15);
        java.math.RoundingMode roundingMode18 = numberFormat10.getRoundingMode();
        numberFormat3.setRoundingMode(roundingMode18);
        numberFormat0.setRoundingMode(roundingMode18);
        numberFormat0.setMinimumFractionDigits(7);
        java.lang.StringBuffer stringBuffer24 = null;
        java.text.FieldPosition fieldPosition26 = new java.text.FieldPosition(315);
        int int27 = fieldPosition26.getEndIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer28 = numberFormat0.format((java.lang.Object) "-135,720,000%", stringBuffer24, fieldPosition26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberFormat0);
        org.junit.Assert.assertNotNull(currency1);
        org.junit.Assert.assertEquals(currency1.toString(), "XXX");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(numberFormat3);
        org.junit.Assert.assertNotNull(currency6);
        org.junit.Assert.assertEquals(currency6.toString(), "XXX");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0%" + "'", str8, "0%");
        org.junit.Assert.assertNotNull(fractionFormat9);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertNotNull(numberFormat11);
        org.junit.Assert.assertNotNull(numberFormat12);
        org.junit.Assert.assertNotNull(currency15);
        org.junit.Assert.assertEquals(currency15.toString(), "XXX");
        org.junit.Assert.assertTrue("'" + roundingMode18 + "' != '" + java.math.RoundingMode.HALF_EVEN + "'", roundingMode18.equals(java.math.RoundingMode.HALF_EVEN));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test16610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16610");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.KOREAN;
        java.util.Locale locale2 = java.util.Locale.KOREAN;
        java.lang.String str3 = locale1.getDisplayLanguage(locale2);
        java.lang.String str4 = locale2.getScript();
        java.lang.String str5 = locale2.getVariant();
        java.util.Locale.setDefault(category0, locale2);
        java.util.Locale locale7 = java.util.Locale.getDefault(category0);
        java.util.Locale locale8 = java.util.Locale.FRENCH;
        org.apache.commons.math.fraction.FractionFormat fractionFormat9 = org.apache.commons.math.fraction.FractionFormat.getProperInstance(locale8);
        java.util.Locale.setDefault(category0, locale8);
        java.util.Locale locale11 = java.util.Locale.getDefault(category0);
        java.util.Locale locale13 = java.util.Locale.forLanguageTag("\ud504\ub791\uc2a4\uc5b4");
        java.lang.String str14 = locale13.getDisplayScript();
        java.util.Locale locale15 = locale13.stripExtensions();
        java.util.Locale.setDefault(category0, locale13);
        java.util.Locale locale17 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.Character> charSet18 = locale17.getExtensionKeys();
        java.text.NumberFormat numberFormat19 = java.text.NumberFormat.getInstance(locale17);
        java.util.Locale locale20 = java.util.Locale.KOREAN;
        java.util.Locale locale21 = java.util.Locale.KOREAN;
        java.util.Locale locale22 = java.util.Locale.KOREAN;
        java.lang.String str23 = locale21.getDisplayLanguage(locale22);
        java.lang.String str24 = locale21.getISO3Language();
        java.lang.String str25 = locale20.getDisplayCountry(locale21);
        java.util.Locale locale26 = java.util.Locale.KOREAN;
        java.util.Locale locale27 = java.util.Locale.KOREAN;
        java.util.Locale locale28 = java.util.Locale.KOREAN;
        java.lang.String str29 = locale27.getDisplayLanguage(locale28);
        java.lang.String str30 = locale27.getISO3Language();
        java.lang.String str31 = locale26.getDisplayCountry(locale27);
        java.util.Locale locale32 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str33 = locale27.getDisplayLanguage(locale32);
        java.lang.String str34 = locale21.getDisplayName(locale32);
        java.lang.String str35 = locale21.getDisplayCountry();
        java.lang.String str36 = locale17.getDisplayVariant(locale21);
        java.util.Locale locale37 = java.util.Locale.KOREAN;
        java.util.Locale locale38 = java.util.Locale.KOREAN;
        java.lang.String str39 = locale37.getDisplayLanguage(locale38);
        java.lang.String str40 = locale37.getISO3Language();
        java.lang.String str41 = locale37.getDisplayCountry();
        java.util.Locale locale42 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str43 = locale37.getDisplayLanguage(locale42);
        java.lang.String str44 = locale21.getDisplayVariant(locale42);
        java.util.Locale locale46 = new java.util.Locale("Korean (South Korea)");
        java.lang.String str47 = locale46.getDisplayName();
        java.lang.String str48 = locale42.getDisplayName(locale46);
        java.util.Locale.setDefault(category0, locale42);
        java.util.Locale locale50 = java.util.Locale.getDefault(category0);
        java.util.Locale locale51 = java.util.Locale.getDefault(category0);
        java.util.Locale locale53 = new java.util.Locale("French");
        java.util.Locale locale54 = locale53.stripExtensions();
        java.text.NumberFormat numberFormat55 = java.text.NumberFormat.getIntegerInstance(locale53);
        java.util.Set<java.lang.String> strSet56 = locale53.getUnicodeLocaleKeys();
        java.text.NumberFormat numberFormat57 = java.text.NumberFormat.getNumberInstance(locale53);
        java.lang.String str58 = locale53.getDisplayVariant();
        java.util.Locale.setDefault(category0, locale53);
        java.text.NumberFormat numberFormat60 = java.text.NumberFormat.getNumberInstance(locale53);
        java.text.NumberFormat numberFormat61 = java.text.NumberFormat.getCurrencyInstance(locale53);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str3, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ko");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr");
        org.junit.Assert.assertNotNull(fractionFormat9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "de_DE");
        org.junit.Assert.assertNotNull(charSet18);
        org.junit.Assert.assertNotNull(numberFormat19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ko");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "ko");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str23, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "kor" + "'", str24, "kor");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "ko");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "ko");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str29, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "kor" + "'", str30, "kor");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\u671d\u9c9c\u6587" + "'", str33, "\u671d\u9c9c\u6587");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\u671d\u9c9c\u6587" + "'", str34, "\u671d\u9c9c\u6587");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "ko");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str39, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "kor" + "'", str40, "kor");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\u97d3\u6587" + "'", str43, "\u97d3\u6587");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals(locale46.toString(), "korean (south korea)");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "korean (south korea)" + "'", str47, "korean (south korea)");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Chinese (Taiwan)" + "'", str48, "Chinese (Taiwan)");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "zh_TW");
        org.junit.Assert.assertEquals(locale53.toString(), "french");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "french");
        org.junit.Assert.assertNotNull(numberFormat55);
        org.junit.Assert.assertNotNull(strSet56);
        org.junit.Assert.assertNotNull(numberFormat57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(numberFormat60);
        org.junit.Assert.assertNotNull(numberFormat61);
    }

    @Test
    public void test16611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16611");
        java.text.NumberFormat.Field field0 = java.text.NumberFormat.Field.PERCENT;
        java.util.Locale locale1 = java.util.Locale.FRENCH;
        java.lang.String str2 = locale1.getDisplayLanguage();
        org.apache.commons.math.fraction.FractionFormat fractionFormat3 = org.apache.commons.math.fraction.FractionFormat.getProperInstance(locale1);
        java.text.NumberFormat numberFormat4 = fractionFormat3.getNumeratorFormat();
        java.text.ParsePosition parsePosition7 = new java.text.ParsePosition((int) (short) 10);
        parsePosition7.setErrorIndex((int) (byte) 1);
        parsePosition7.setErrorIndex(0);
        org.apache.commons.math.fraction.Fraction fraction12 = fractionFormat3.parse("French", parsePosition7);
        boolean boolean13 = field0.equals((java.lang.Object) "French");
        java.text.NumberFormat numberFormat14 = java.text.NumberFormat.getIntegerInstance();
        java.text.NumberFormat numberFormat15 = java.text.NumberFormat.getPercentInstance();
        numberFormat15.setMaximumIntegerDigits((-1));
        java.text.NumberFormat numberFormat18 = java.text.NumberFormat.getPercentInstance();
        java.text.NumberFormat numberFormat19 = java.text.NumberFormat.getPercentInstance();
        numberFormat19.setMaximumIntegerDigits((-1));
        java.util.Currency currency22 = numberFormat19.getCurrency();
        numberFormat18.setCurrency(currency22);
        numberFormat15.setCurrency(currency22);
        java.text.NumberFormat numberFormat25 = java.text.NumberFormat.getPercentInstance();
        numberFormat25.setMaximumIntegerDigits((-1));
        java.util.Currency currency28 = numberFormat25.getCurrency();
        java.lang.String str30 = numberFormat25.format((double) 10);
        org.apache.commons.math.fraction.ProperFractionFormat properFractionFormat31 = new org.apache.commons.math.fraction.ProperFractionFormat(numberFormat14, numberFormat15, numberFormat25);
        java.text.NumberFormat numberFormat32 = java.text.NumberFormat.getPercentInstance();
        numberFormat32.setMaximumIntegerDigits((-1));
        java.util.Currency currency35 = numberFormat32.getCurrency();
        java.lang.String str37 = numberFormat32.format((double) 10);
        boolean boolean39 = numberFormat32.equals((java.lang.Object) "");
        org.apache.commons.math.fraction.FractionFormat fractionFormat40 = new org.apache.commons.math.fraction.FractionFormat(numberFormat15, numberFormat32);
        java.util.Locale locale41 = java.util.Locale.FRENCH;
        java.lang.String str42 = locale41.getDisplayLanguage();
        org.apache.commons.math.fraction.FractionFormat fractionFormat43 = org.apache.commons.math.fraction.FractionFormat.getProperInstance(locale41);
        java.text.NumberFormat numberFormat44 = fractionFormat43.getNumeratorFormat();
        java.text.ParsePosition parsePosition47 = new java.text.ParsePosition((int) (short) 10);
        parsePosition47.setErrorIndex((int) (byte) 1);
        parsePosition47.setErrorIndex(0);
        org.apache.commons.math.fraction.Fraction fraction52 = fractionFormat43.parse("French", parsePosition47);
        java.text.NumberFormat numberFormat53 = java.text.NumberFormat.getIntegerInstance();
        java.text.NumberFormat numberFormat54 = java.text.NumberFormat.getPercentInstance();
        numberFormat54.setMaximumIntegerDigits((-1));
        java.text.NumberFormat numberFormat57 = java.text.NumberFormat.getPercentInstance();
        java.text.NumberFormat numberFormat58 = java.text.NumberFormat.getPercentInstance();
        numberFormat58.setMaximumIntegerDigits((-1));
        java.util.Currency currency61 = numberFormat58.getCurrency();
        numberFormat57.setCurrency(currency61);
        numberFormat54.setCurrency(currency61);
        java.text.NumberFormat numberFormat64 = java.text.NumberFormat.getPercentInstance();
        numberFormat64.setMaximumIntegerDigits((-1));
        java.util.Currency currency67 = numberFormat64.getCurrency();
        java.lang.String str69 = numberFormat64.format((double) 10);
        org.apache.commons.math.fraction.ProperFractionFormat properFractionFormat70 = new org.apache.commons.math.fraction.ProperFractionFormat(numberFormat53, numberFormat54, numberFormat64);
        fractionFormat43.setDenominatorFormat(numberFormat64);
        int int72 = numberFormat64.getMaximumIntegerDigits();
        fractionFormat40.setDenominatorFormat(numberFormat64);
        boolean boolean74 = field0.equals((java.lang.Object) numberFormat64);
        org.apache.commons.math.fraction.FractionFormat fractionFormat75 = new org.apache.commons.math.fraction.FractionFormat(numberFormat64);
        org.junit.Assert.assertNotNull(field0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "French" + "'", str2, "French");
        org.junit.Assert.assertNotNull(fractionFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(fraction12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(numberFormat14);
        org.junit.Assert.assertNotNull(numberFormat15);
        org.junit.Assert.assertNotNull(numberFormat18);
        org.junit.Assert.assertNotNull(numberFormat19);
        org.junit.Assert.assertNotNull(currency22);
        org.junit.Assert.assertEquals(currency22.toString(), "XXX");
        org.junit.Assert.assertNotNull(numberFormat25);
        org.junit.Assert.assertNotNull(currency28);
        org.junit.Assert.assertEquals(currency28.toString(), "XXX");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "0%" + "'", str30, "0%");
        org.junit.Assert.assertNotNull(numberFormat32);
        org.junit.Assert.assertNotNull(currency35);
        org.junit.Assert.assertEquals(currency35.toString(), "XXX");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "0%" + "'", str37, "0%");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "French" + "'", str42, "French");
        org.junit.Assert.assertNotNull(fractionFormat43);
        org.junit.Assert.assertNotNull(numberFormat44);
        org.junit.Assert.assertNull(fraction52);
        org.junit.Assert.assertNotNull(numberFormat53);
        org.junit.Assert.assertNotNull(numberFormat54);
        org.junit.Assert.assertNotNull(numberFormat57);
        org.junit.Assert.assertNotNull(numberFormat58);
        org.junit.Assert.assertNotNull(currency61);
        org.junit.Assert.assertEquals(currency61.toString(), "XXX");
        org.junit.Assert.assertNotNull(numberFormat64);
        org.junit.Assert.assertNotNull(currency67);
        org.junit.Assert.assertEquals(currency67.toString(), "XXX");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "0%" + "'", str69, "0%");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test16612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16612");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.util.Locale locale1 = java.util.Locale.KOREAN;
        java.lang.String str2 = locale0.getDisplayLanguage(locale1);
        java.util.Locale locale3 = locale1.stripExtensions();
        java.lang.String str4 = locale1.getISO3Language();
        org.apache.commons.math.fraction.FractionFormat fractionFormat5 = org.apache.commons.math.fraction.FractionFormat.getProperInstance(locale1);
        java.util.Set<java.lang.Character> charSet6 = locale1.getExtensionKeys();
        java.util.Locale locale7 = java.util.Locale.KOREAN;
        java.lang.String str8 = locale7.getDisplayVariant();
        java.util.Locale locale9 = java.util.Locale.UK;
        java.lang.String str10 = locale9.getDisplayScript();
        java.util.Set<java.lang.String> strSet11 = locale9.getUnicodeLocaleAttributes();
        java.lang.String str12 = locale7.getDisplayScript(locale9);
        java.util.Locale locale13 = java.util.Locale.CHINESE;
        java.lang.String str14 = locale7.getDisplayVariant(locale13);
        java.lang.String str15 = locale7.getISO3Language();
        java.lang.String str16 = locale7.getScript();
        java.lang.String str17 = locale1.getDisplayVariant(locale7);
        java.util.Set<java.lang.String> strSet18 = locale1.getUnicodeLocaleKeys();
        java.lang.String str19 = locale1.getDisplayLanguage();
        java.lang.String str20 = locale1.getDisplayLanguage();
        java.lang.String str21 = locale1.getISO3Country();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str2, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "kor" + "'", str4, "kor");
        org.junit.Assert.assertNotNull(fractionFormat5);
        org.junit.Assert.assertNotNull(charSet6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "kor" + "'", str15, "kor");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Korean" + "'", str19, "Korean");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Korean" + "'", str20, "Korean");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test16613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16613");
        java.text.NumberFormat.Field field0 = java.text.NumberFormat.Field.GROUPING_SEPARATOR;
        java.lang.String str1 = field0.toString();
        java.text.FieldPosition fieldPosition3 = new java.text.FieldPosition((java.text.Format.Field) field0, (int) (byte) 116);
        java.text.FieldPosition fieldPosition5 = new java.text.FieldPosition((java.text.Format.Field) field0, (-35));
        java.text.Format.Field field6 = fieldPosition5.getFieldAttribute();
        java.text.FieldPosition fieldPosition8 = new java.text.FieldPosition(field6, (int) (byte) -4);
        java.text.FieldPosition fieldPosition9 = new java.text.FieldPosition(field6);
        java.text.Format.Field field10 = fieldPosition9.getFieldAttribute();
        java.lang.String str11 = fieldPosition9.toString();
        org.junit.Assert.assertNotNull(field0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java.text.NumberFormat$Field(grouping separator)" + "'", str1, "java.text.NumberFormat$Field(grouping separator)");
        org.junit.Assert.assertNotNull(field6);
        org.junit.Assert.assertNotNull(field10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.text.FieldPosition[field=-1,attribute=java.text.NumberFormat$Field(grouping separator),beginIndex=0,endIndex=0]" + "'", str11, "java.text.FieldPosition[field=-1,attribute=java.text.NumberFormat$Field(grouping separator),beginIndex=0,endIndex=0]");
    }

    @Test
    public void test16614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16614");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.lang.String str1 = locale0.getDisplayLanguage();
        org.apache.commons.math.fraction.FractionFormat fractionFormat2 = org.apache.commons.math.fraction.FractionFormat.getProperInstance(locale0);
        java.text.NumberFormat numberFormat3 = fractionFormat2.getNumeratorFormat();
        java.text.ParsePosition parsePosition6 = new java.text.ParsePosition((int) (short) 10);
        parsePosition6.setErrorIndex((int) (byte) 1);
        parsePosition6.setErrorIndex(0);
        org.apache.commons.math.fraction.Fraction fraction11 = fractionFormat2.parse("French", parsePosition6);
        java.text.NumberFormat numberFormat12 = java.text.NumberFormat.getIntegerInstance();
        java.text.NumberFormat numberFormat13 = java.text.NumberFormat.getPercentInstance();
        numberFormat13.setMaximumIntegerDigits((-1));
        java.text.NumberFormat numberFormat16 = java.text.NumberFormat.getPercentInstance();
        java.text.NumberFormat numberFormat17 = java.text.NumberFormat.getPercentInstance();
        numberFormat17.setMaximumIntegerDigits((-1));
        java.util.Currency currency20 = numberFormat17.getCurrency();
        numberFormat16.setCurrency(currency20);
        numberFormat13.setCurrency(currency20);
        java.text.NumberFormat numberFormat23 = java.text.NumberFormat.getPercentInstance();
        numberFormat23.setMaximumIntegerDigits((-1));
        java.util.Currency currency26 = numberFormat23.getCurrency();
        java.lang.String str28 = numberFormat23.format((double) 10);
        org.apache.commons.math.fraction.ProperFractionFormat properFractionFormat29 = new org.apache.commons.math.fraction.ProperFractionFormat(numberFormat12, numberFormat13, numberFormat23);
        fractionFormat2.setDenominatorFormat(numberFormat23);
        int int31 = numberFormat23.getMaximumIntegerDigits();
        java.text.NumberFormat numberFormat32 = null;
        org.apache.commons.math.fraction.FractionFormat fractionFormat33 = new org.apache.commons.math.fraction.FractionFormat(numberFormat23, numberFormat32);
        java.text.NumberFormat.Field field34 = java.text.NumberFormat.Field.PERMILLE;
        java.text.FieldPosition fieldPosition36 = new java.text.FieldPosition((java.text.Format.Field) field34, (int) (short) 0);
        java.lang.String str37 = fieldPosition36.toString();
        java.lang.String str38 = fieldPosition36.toString();
        fieldPosition36.setBeginIndex((int) (byte) 10);
        int int41 = fieldPosition36.getBeginIndex();
        java.text.Format.Field field42 = fieldPosition36.getFieldAttribute();
        java.lang.Object obj43 = null;
        boolean boolean44 = field42.equals(obj43);
        java.lang.String str45 = field42.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator46 = numberFormat23.formatToCharacterIterator((java.lang.Object) str45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "French" + "'", str1, "French");
        org.junit.Assert.assertNotNull(fractionFormat2);
        org.junit.Assert.assertNotNull(numberFormat3);
        org.junit.Assert.assertNull(fraction11);
        org.junit.Assert.assertNotNull(numberFormat12);
        org.junit.Assert.assertNotNull(numberFormat13);
        org.junit.Assert.assertNotNull(numberFormat16);
        org.junit.Assert.assertNotNull(numberFormat17);
        org.junit.Assert.assertNotNull(currency20);
        org.junit.Assert.assertEquals(currency20.toString(), "XXX");
        org.junit.Assert.assertNotNull(numberFormat23);
        org.junit.Assert.assertNotNull(currency26);
        org.junit.Assert.assertEquals(currency26.toString(), "XXX");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "0%" + "'", str28, "0%");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(field34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "java.text.FieldPosition[field=0,attribute=java.text.NumberFormat$Field(per mille),beginIndex=0,endIndex=0]" + "'", str37, "java.text.FieldPosition[field=0,attribute=java.text.NumberFormat$Field(per mille),beginIndex=0,endIndex=0]");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "java.text.FieldPosition[field=0,attribute=java.text.NumberFormat$Field(per mille),beginIndex=0,endIndex=0]" + "'", str38, "java.text.FieldPosition[field=0,attribute=java.text.NumberFormat$Field(per mille),beginIndex=0,endIndex=0]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertNotNull(field42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "java.text.NumberFormat$Field(per mille)" + "'", str45, "java.text.NumberFormat$Field(per mille)");
    }

    @Test
    public void test16615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16615");
        java.util.Locale locale3 = new java.util.Locale("\ub3c5\uc77c\uc5b4\ub3c5\uc77c)", "", "java.text.AttributedCharacterIterator$Attribute(reading)");
        java.lang.String str4 = locale3.getVariant();
        java.text.NumberFormat numberFormat5 = java.text.NumberFormat.getNumberInstance(locale3);
        java.lang.String str7 = locale3.getExtension('x');
        java.lang.String str8 = locale3.getDisplayScript();
        org.junit.Assert.assertEquals(locale3.toString(), "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)__java.text.AttributedCharacterIterator$Attribute(reading)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.text.AttributedCharacterIterator$Attribute(reading)" + "'", str4, "java.text.AttributedCharacterIterator$Attribute(reading)");
        org.junit.Assert.assertNotNull(numberFormat5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test16616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16616");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) ' ', (double) (short) 10, (int) (byte) 0);
        org.apache.commons.math.fraction.Fraction fraction5 = new org.apache.commons.math.fraction.Fraction((double) 'a');
        org.apache.commons.math.fraction.Fraction fraction6 = fraction3.divide(fraction5);
        org.apache.commons.math.fraction.Fraction fraction7 = fraction5.abs();
        org.apache.commons.math.fraction.Fraction fraction10 = new org.apache.commons.math.fraction.Fraction(52, (-117));
        org.apache.commons.math.fraction.Fraction fraction11 = fraction10.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction12 = fraction7.subtract(fraction11);
        int int13 = fraction11.getNumerator();
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-9) + "'", int13 == (-9));
    }

    @Test
    public void test16617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16617");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.util.Locale locale1 = java.util.Locale.KOREAN;
        java.lang.String str2 = locale0.getDisplayLanguage(locale1);
        java.lang.String str3 = locale0.getISO3Language();
        java.lang.String str4 = locale0.getDisplayCountry();
        java.util.Locale locale5 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str6 = locale0.getDisplayLanguage(locale5);
        java.util.Locale locale7 = java.util.Locale.CANADA;
        java.lang.String str8 = locale7.getVariant();
        boolean boolean9 = locale7.hasExtensions();
        java.lang.String str10 = locale5.getDisplayLanguage(locale7);
        java.util.Locale locale11 = java.util.Locale.ROOT;
        org.apache.commons.math.fraction.FractionFormat fractionFormat12 = org.apache.commons.math.fraction.FractionFormat.getProperInstance(locale11);
        java.lang.String str13 = locale11.getISO3Language();
        java.util.Set<java.lang.Character> charSet14 = locale11.getExtensionKeys();
        java.util.Locale.Category category15 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale16 = java.util.Locale.KOREAN;
        java.util.Locale locale17 = java.util.Locale.KOREAN;
        java.lang.String str18 = locale16.getDisplayLanguage(locale17);
        java.lang.String str19 = locale17.getScript();
        java.lang.String str20 = locale17.getVariant();
        java.util.Locale.setDefault(category15, locale17);
        java.lang.String str22 = locale17.getDisplayName();
        java.util.Locale locale23 = java.util.Locale.UK;
        java.lang.String str24 = locale23.getDisplayScript();
        java.util.Set<java.lang.String> strSet25 = locale23.getUnicodeLocaleAttributes();
        java.util.Locale locale26 = java.util.Locale.ENGLISH;
        java.lang.String str27 = locale23.getDisplayCountry(locale26);
        java.lang.String str28 = locale17.getDisplayVariant(locale23);
        java.lang.String str29 = locale11.getDisplayName(locale23);
        java.util.Locale locale30 = java.util.Locale.US;
        java.lang.String str31 = locale11.getDisplayLanguage(locale30);
        java.util.Locale locale32 = locale11.stripExtensions();
        java.util.Set<java.lang.String> strSet33 = locale11.getUnicodeLocaleKeys();
        java.text.NumberFormat numberFormat34 = java.text.NumberFormat.getInstance(locale11);
        java.lang.String str35 = locale5.getDisplayVariant(locale11);
        boolean boolean36 = locale5.hasExtensions();
        java.lang.String str37 = locale5.getVariant();
        java.util.Locale locale38 = java.util.Locale.ROOT;
        org.apache.commons.math.fraction.FractionFormat fractionFormat39 = org.apache.commons.math.fraction.FractionFormat.getProperInstance(locale38);
        java.lang.String str40 = locale38.getISO3Language();
        java.util.Set<java.lang.Character> charSet41 = locale38.getExtensionKeys();
        java.text.NumberFormat numberFormat42 = java.text.NumberFormat.getPercentInstance(locale38);
        java.lang.String str43 = locale38.getDisplayName();
        java.util.Locale locale44 = java.util.Locale.KOREAN;
        java.lang.String str45 = locale44.getDisplayVariant();
        java.util.Locale locale46 = java.util.Locale.UK;
        java.lang.String str47 = locale46.getDisplayScript();
        java.util.Set<java.lang.String> strSet48 = locale46.getUnicodeLocaleAttributes();
        java.lang.String str49 = locale44.getDisplayScript(locale46);
        java.lang.String str50 = locale38.getDisplayVariant(locale46);
        java.lang.String str51 = locale5.getDisplayVariant(locale46);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str2, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "kor" + "'", str3, "kor");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u97d3\u6587" + "'", str6, "\u97d3\u6587");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Chinese" + "'", str10, "Chinese");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(fractionFormat12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charSet14);
        org.junit.Assert.assertTrue("'" + category15 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category15.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ko");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str18, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str22, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "United Kingdom" + "'", str27, "United Kingdom");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "");
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertNotNull(numberFormat34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertNotNull(fractionFormat39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(charSet41);
        org.junit.Assert.assertNotNull(numberFormat42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(strSet48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
    }

    @Test
    public void test16618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16618");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("\ud504\ub791\uc2a4\uc5b4\ud504\ub791\uc2a4)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=?????????(???????)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16619");
        java.text.ParsePosition parsePosition1 = new java.text.ParsePosition((int) (byte) -32);
    }

    @Test
    public void test16620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16620");
        java.text.NumberFormat numberFormat0 = java.text.NumberFormat.getPercentInstance();
        numberFormat0.setMinimumIntegerDigits((int) (short) 10);
        java.util.Locale locale3 = java.util.Locale.KOREAN;
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.lang.String str5 = locale3.getDisplayLanguage(locale4);
        boolean boolean6 = numberFormat0.equals((java.lang.Object) locale4);
        java.text.ParsePosition parsePosition9 = new java.text.ParsePosition((int) '4');
        java.lang.Object obj10 = numberFormat0.parseObject("China", parsePosition9);
        int int11 = parsePosition9.getErrorIndex();
        java.lang.String str12 = parsePosition9.toString();
        int int13 = parsePosition9.getErrorIndex();
        java.text.NumberFormat.Field field14 = java.text.NumberFormat.Field.PERMILLE;
        java.text.FieldPosition fieldPosition16 = new java.text.FieldPosition((java.text.Format.Field) field14, (int) (short) 0);
        int int17 = fieldPosition16.getEndIndex();
        java.text.ParseException parseException20 = new java.text.ParseException("java.text.FieldPosition[field=0,attribute=java.text.NumberFormat$Field(per mille),beginIndex=0,endIndex=0]", 0);
        java.lang.Throwable[] throwableArray21 = parseException20.getSuppressed();
        int int22 = parseException20.getErrorOffset();
        boolean boolean23 = fieldPosition16.equals((java.lang.Object) parseException20);
        java.util.Locale.Builder builder24 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder26 = builder24.setVariant("");
        java.util.Locale.Builder builder27 = builder26.clear();
        java.util.Locale locale28 = java.util.Locale.KOREAN;
        java.util.Locale locale29 = java.util.Locale.KOREAN;
        java.lang.String str30 = locale28.getDisplayLanguage(locale29);
        java.lang.String str31 = locale28.getISO3Language();
        boolean boolean32 = locale28.hasExtensions();
        java.util.Locale.Builder builder33 = builder26.setLocale(locale28);
        java.util.Locale.Builder builder34 = builder33.clear();
        boolean boolean35 = fieldPosition16.equals((java.lang.Object) builder34);
        java.util.Locale.Builder builder36 = builder34.clear();
        java.util.Locale.Builder builder38 = builder34.setVariant("francese");
        java.util.Locale.Builder builder40 = builder38.addUnicodeLocaleAttribute("anglais");
        boolean boolean41 = parsePosition9.equals((java.lang.Object) builder38);
        parsePosition9.setErrorIndex((int) (short) 48);
        org.junit.Assert.assertNotNull(numberFormat0);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str5, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "java.text.ParsePosition[index=52,errorIndex=52]" + "'", str12, "java.text.ParsePosition[index=52,errorIndex=52]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(field14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "ko");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str30, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "kor" + "'", str31, "kor");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test16621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16621");
        java.util.Locale locale1 = new java.util.Locale("java.text.ParsePosition[index=120,errorIndex=-1]");
        org.apache.commons.math.fraction.FractionFormat fractionFormat2 = org.apache.commons.math.fraction.FractionFormat.getImproperInstance(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "java.text.parseposition[index=120,errorindex=-1]");
        org.junit.Assert.assertNotNull(fractionFormat2);
    }

    @Test
    public void test16622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16622");
        org.apache.commons.math.fraction.FractionFormat fractionFormat0 = org.apache.commons.math.fraction.FractionFormat.getImproperInstance();
        java.text.NumberFormat numberFormat1 = fractionFormat0.getNumeratorFormat();
        java.text.NumberFormat numberFormat2 = java.text.NumberFormat.getPercentInstance();
        java.text.NumberFormat numberFormat3 = java.text.NumberFormat.getPercentInstance();
        numberFormat3.setMaximumIntegerDigits((-1));
        java.util.Currency currency6 = numberFormat3.getCurrency();
        numberFormat2.setCurrency(currency6);
        numberFormat1.setCurrency(currency6);
        int int9 = numberFormat1.getMaximumIntegerDigits();
        java.text.NumberFormat numberFormat10 = java.text.NumberFormat.getCurrencyInstance();
        java.text.NumberFormat numberFormat11 = java.text.NumberFormat.getPercentInstance();
        numberFormat11.setMaximumIntegerDigits((-1));
        java.text.NumberFormat numberFormat14 = java.text.NumberFormat.getPercentInstance();
        java.text.NumberFormat numberFormat15 = java.text.NumberFormat.getPercentInstance();
        numberFormat15.setMaximumIntegerDigits((-1));
        java.util.Currency currency18 = numberFormat15.getCurrency();
        numberFormat14.setCurrency(currency18);
        numberFormat11.setCurrency(currency18);
        org.apache.commons.math.fraction.FractionFormat fractionFormat21 = new org.apache.commons.math.fraction.FractionFormat(numberFormat10, numberFormat11);
        java.text.NumberFormat numberFormat22 = java.text.NumberFormat.getPercentInstance();
        numberFormat22.setMaximumIntegerDigits((-1));
        numberFormat22.setMinimumIntegerDigits(0);
        java.text.NumberFormat numberFormat27 = java.text.NumberFormat.getIntegerInstance();
        boolean boolean28 = numberFormat27.isGroupingUsed();
        numberFormat27.setParseIntegerOnly(false);
        java.lang.Number number32 = numberFormat27.parse("0%");
        org.apache.commons.math.fraction.ProperFractionFormat properFractionFormat33 = new org.apache.commons.math.fraction.ProperFractionFormat(numberFormat11, numberFormat22, numberFormat27);
        java.text.NumberFormat numberFormat34 = properFractionFormat33.getWholeFormat();
        numberFormat34.setParseIntegerOnly(false);
        org.apache.commons.math.fraction.ProperFractionFormat properFractionFormat37 = new org.apache.commons.math.fraction.ProperFractionFormat(numberFormat34);
        java.util.Locale locale38 = java.util.Locale.TAIWAN;
        java.lang.String str39 = locale38.getDisplayScript();
        java.text.NumberFormat numberFormat40 = java.text.NumberFormat.getInstance(locale38);
        properFractionFormat37.setWholeFormat(numberFormat40);
        org.apache.commons.math.fraction.FractionFormat fractionFormat42 = new org.apache.commons.math.fraction.FractionFormat(numberFormat1, numberFormat40);
        numberFormat40.setGroupingUsed(true);
        numberFormat40.setGroupingUsed(true);
        java.math.RoundingMode roundingMode47 = numberFormat40.getRoundingMode();
        numberFormat40.setGroupingUsed(true);
        org.junit.Assert.assertNotNull(fractionFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertNotNull(numberFormat2);
        org.junit.Assert.assertNotNull(numberFormat3);
        org.junit.Assert.assertNotNull(currency6);
        org.junit.Assert.assertEquals(currency6.toString(), "XXX");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertNotNull(numberFormat11);
        org.junit.Assert.assertNotNull(numberFormat14);
        org.junit.Assert.assertNotNull(numberFormat15);
        org.junit.Assert.assertNotNull(currency18);
        org.junit.Assert.assertEquals(currency18.toString(), "XXX");
        org.junit.Assert.assertNotNull(numberFormat22);
        org.junit.Assert.assertNotNull(numberFormat27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + number32 + "' != '" + 0L + "'", number32, 0L);
        org.junit.Assert.assertNotNull(numberFormat34);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(numberFormat40);
        org.junit.Assert.assertTrue("'" + roundingMode47 + "' != '" + java.math.RoundingMode.HALF_EVEN + "'", roundingMode47.equals(java.math.RoundingMode.HALF_EVEN));
    }

    @Test
    public void test16623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16623");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("\uc77c\ubcf8\uc5b4");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=????????");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16624");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("ko-KR");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap2);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap4 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList5 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList3, strMap4);
        java.util.Locale.LanguageRange[] languageRangeArray6 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList7 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7, languageRangeArray6);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap9 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList10 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, strMap9);
        java.util.Locale locale11 = java.util.Locale.UK;
        java.lang.String str12 = locale11.getDisplayScript();
        java.util.Set<java.lang.String> strSet13 = locale11.getUnicodeLocaleAttributes();
        java.lang.String str14 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.lang.String>) strSet13);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap16 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList17 = java.util.Locale.LanguageRange.parse("eng", strMap16);
        java.util.Locale.Category category18 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale19 = java.util.Locale.KOREAN;
        java.util.Locale locale20 = java.util.Locale.KOREAN;
        java.lang.String str21 = locale19.getDisplayLanguage(locale20);
        java.lang.String str22 = locale20.getScript();
        java.lang.String str23 = locale20.getVariant();
        java.util.Locale.setDefault(category18, locale20);
        java.lang.String str25 = locale20.getDisplayName();
        java.util.Locale locale26 = java.util.Locale.UK;
        java.lang.String str27 = locale26.getDisplayScript();
        java.util.Set<java.lang.String> strSet28 = locale26.getUnicodeLocaleAttributes();
        java.util.Locale locale29 = java.util.Locale.ENGLISH;
        java.lang.String str30 = locale26.getDisplayCountry(locale29);
        java.lang.String str31 = locale20.getDisplayVariant(locale26);
        java.util.Locale locale32 = java.util.Locale.KOREAN;
        java.util.Locale locale33 = java.util.Locale.KOREAN;
        java.lang.String str34 = locale32.getDisplayLanguage(locale33);
        java.util.Locale locale35 = java.util.Locale.ITALIAN;
        java.lang.String str36 = locale33.getDisplayName(locale35);
        java.util.Locale.setDefault(locale35);
        java.lang.String str38 = locale20.getDisplayLanguage(locale35);
        java.text.NumberFormat numberFormat39 = java.text.NumberFormat.getCurrencyInstance(locale35);
        java.lang.String str40 = locale35.getLanguage();
        java.util.Set<java.lang.String> strSet41 = locale35.getUnicodeLocaleKeys();
        java.lang.String str42 = java.util.Locale.lookupTag(languageRangeList17, (java.util.Collection<java.lang.String>) strSet41);
        java.util.Locale.FilteringMode filteringMode43 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList44 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.lang.String>) strSet41, filteringMode43);
        java.util.Locale.LanguageRange[] languageRangeArray45 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList46 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList46, languageRangeArray45);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap48 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList49 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList46, strMap48);
        java.util.Locale locale50 = java.util.Locale.FRENCH;
        java.lang.String str51 = locale50.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet52 = locale50.getUnicodeLocaleAttributes();
        java.lang.String str53 = java.util.Locale.lookupTag(languageRangeList49, (java.util.Collection<java.lang.String>) strSet52);
        java.util.Locale.LanguageRange[] languageRangeArray54 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList55 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList55, languageRangeArray54);
        java.util.Locale.LanguageRange[] languageRangeArray57 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList58 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList58, languageRangeArray57);
        java.util.Locale locale60 = java.util.Locale.KOREAN;
        java.util.Locale locale61 = java.util.Locale.KOREAN;
        java.lang.String str62 = locale60.getDisplayLanguage(locale61);
        java.lang.String str63 = locale61.getScript();
        java.util.Locale locale64 = java.util.Locale.KOREAN;
        java.util.Locale locale65 = java.util.Locale.GERMANY;
        java.util.Locale[] localeArray66 = new java.util.Locale[] { locale61, locale64, locale65 };
        java.util.ArrayList<java.util.Locale> localeList67 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList67, localeArray66);
        java.util.Locale.FilteringMode filteringMode69 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList70 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList58, (java.util.Collection<java.util.Locale>) localeList67, filteringMode69);
        java.util.List<java.util.Locale> localeList71 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList55, (java.util.Collection<java.util.Locale>) localeList67);
        java.util.Locale.FilteringMode filteringMode72 = null;
        java.util.List<java.util.Locale> localeList73 = java.util.Locale.filter(languageRangeList49, (java.util.Collection<java.util.Locale>) localeList71, filteringMode72);
        java.util.Locale.FilteringMode filteringMode74 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList75 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.util.Locale>) localeList71, filteringMode74);
        java.util.Locale locale76 = java.util.Locale.lookup(languageRangeList5, (java.util.Collection<java.util.Locale>) localeList75);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertNotNull(languageRangeList5);
        org.junit.Assert.assertNotNull(languageRangeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(languageRangeList10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(languageRangeList17);
        org.junit.Assert.assertTrue("'" + category18 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category18.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ko");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str21, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str25, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "United Kingdom" + "'", str30, "United Kingdom");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "ko");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str34, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "it");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "coreano" + "'", str36, "coreano");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "coreano" + "'", str38, "coreano");
        org.junit.Assert.assertNotNull(numberFormat39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "it" + "'", str40, "it");
        org.junit.Assert.assertNotNull(strSet41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + filteringMode43 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode43.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertNotNull(languageRangeArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(languageRangeList49);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "francese" + "'", str51, "francese");
        org.junit.Assert.assertNotNull(strSet52);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(languageRangeArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(languageRangeArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "ko");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str62, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "ko");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "de_DE");
        org.junit.Assert.assertNotNull(localeArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + filteringMode69 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode69.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList70);
        org.junit.Assert.assertNotNull(localeList71);
        org.junit.Assert.assertNotNull(localeList73);
        org.junit.Assert.assertTrue("'" + filteringMode74 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode74.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList75);
        org.junit.Assert.assertNull(locale76);
    }

    @Test
    public void test16625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16625");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.util.Locale locale1 = java.util.Locale.KOREAN;
        java.util.Locale locale2 = java.util.Locale.KOREAN;
        java.lang.String str3 = locale1.getDisplayLanguage(locale2);
        java.lang.String str4 = locale0.getDisplayScript(locale2);
        java.lang.String str5 = locale2.getISO3Language();
        java.text.NumberFormat numberFormat6 = java.text.NumberFormat.getInstance(locale2);
        java.util.Locale locale7 = java.util.Locale.CHINESE;
        java.text.NumberFormat numberFormat8 = java.text.NumberFormat.getInstance(locale7);
        org.apache.commons.math.fraction.FractionFormat fractionFormat9 = new org.apache.commons.math.fraction.FractionFormat(numberFormat6, numberFormat8);
        numberFormat8.setGroupingUsed(true);
        java.lang.Number number13 = numberFormat8.parse("4 / 1");
        boolean boolean14 = numberFormat8.isParseIntegerOnly();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str3, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "kor" + "'", str5, "kor");
        org.junit.Assert.assertNotNull(numberFormat6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh");
        org.junit.Assert.assertNotNull(numberFormat8);
        org.junit.Assert.assertEquals("'" + number13 + "' != '" + 4L + "'", number13, 4L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test16626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16626");
        java.util.Locale locale1 = new java.util.Locale("French");
        java.util.Locale locale2 = locale1.stripExtensions();
        java.text.NumberFormat numberFormat3 = java.text.NumberFormat.getIntegerInstance(locale1);
        java.lang.String str4 = locale1.toLanguageTag();
        java.text.NumberFormat numberFormat5 = java.text.NumberFormat.getIntegerInstance(locale1);
        java.text.NumberFormat numberFormat6 = java.text.NumberFormat.getPercentInstance(locale1);
        boolean boolean7 = locale1.hasExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = locale1.getUnicodeLocaleType("java.text.FieldPosition[field=2147483647,attribute=java.text.NumberFormat$Field(per mille),beginIndex=0,endIndex=0]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: java.text.FieldPosition[field=2147483647,attribute=java.text.NumberFormat$Field(per mille),beginIndex=0,endIndex=0]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "french");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "french");
        org.junit.Assert.assertNotNull(numberFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "french" + "'", str4, "french");
        org.junit.Assert.assertNotNull(numberFormat5);
        org.junit.Assert.assertNotNull(numberFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test16627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16627");
        java.text.NumberFormat.Field field0 = java.text.NumberFormat.Field.PERMILLE;
        java.text.FieldPosition fieldPosition2 = new java.text.FieldPosition((java.text.Format.Field) field0, (int) (short) 0);
        java.lang.String str3 = fieldPosition2.toString();
        java.lang.String str4 = fieldPosition2.toString();
        fieldPosition2.setBeginIndex((int) (byte) 10);
        int int7 = fieldPosition2.getBeginIndex();
        java.text.Format.Field field8 = fieldPosition2.getFieldAttribute();
        java.lang.Object obj9 = null;
        boolean boolean10 = field8.equals(obj9);
        java.util.Locale.Category category11 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale12 = java.util.Locale.KOREAN;
        java.util.Locale locale13 = java.util.Locale.KOREAN;
        java.lang.String str14 = locale12.getDisplayLanguage(locale13);
        java.lang.String str15 = locale13.getScript();
        java.lang.String str16 = locale13.getVariant();
        java.util.Locale.setDefault(category11, locale13);
        java.util.Locale locale18 = java.util.Locale.getDefault(category11);
        java.util.Locale locale19 = java.util.Locale.FRENCH;
        org.apache.commons.math.fraction.FractionFormat fractionFormat20 = org.apache.commons.math.fraction.FractionFormat.getProperInstance(locale19);
        java.util.Locale.setDefault(category11, locale19);
        java.util.Locale locale22 = java.util.Locale.TAIWAN;
        java.util.Locale locale23 = locale22.stripExtensions();
        java.util.Locale.setDefault(category11, locale22);
        java.util.Locale locale25 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale26 = java.util.Locale.CANADA;
        java.lang.String str27 = locale26.getDisplayCountry();
        java.lang.String str28 = locale25.getDisplayCountry(locale26);
        java.lang.String str29 = locale26.getISO3Country();
        java.lang.String str30 = locale26.getLanguage();
        java.util.Locale.setDefault(category11, locale26);
        java.util.Locale.Builder builder32 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder34 = builder32.setVariant("");
        java.util.Locale.Builder builder35 = builder34.clear();
        java.util.Locale locale36 = java.util.Locale.KOREAN;
        java.util.Locale locale37 = java.util.Locale.KOREAN;
        java.util.Locale locale38 = java.util.Locale.KOREAN;
        java.lang.String str39 = locale37.getDisplayLanguage(locale38);
        java.lang.String str40 = locale37.getISO3Language();
        java.lang.String str41 = locale36.getDisplayCountry(locale37);
        java.util.Locale locale42 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str43 = locale37.getDisplayLanguage(locale42);
        java.util.Locale.Builder builder44 = builder34.setLocale(locale42);
        java.util.Locale.setDefault(category11, locale42);
        java.util.Locale.setDefault(locale42);
        boolean boolean47 = field8.equals((java.lang.Object) locale42);
        org.junit.Assert.assertNotNull(field0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.text.FieldPosition[field=0,attribute=java.text.NumberFormat$Field(per mille),beginIndex=0,endIndex=0]" + "'", str3, "java.text.FieldPosition[field=0,attribute=java.text.NumberFormat$Field(per mille),beginIndex=0,endIndex=0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.text.FieldPosition[field=0,attribute=java.text.NumberFormat$Field(per mille),beginIndex=0,endIndex=0]" + "'", str4, "java.text.FieldPosition[field=0,attribute=java.text.NumberFormat$Field(per mille),beginIndex=0,endIndex=0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(field8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + category11 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category11.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "ko");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str14, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "ko");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr");
        org.junit.Assert.assertNotNull(fractionFormat20);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\u52a0\u62ff\u5927" + "'", str27, "\u52a0\u62ff\u5927");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "China" + "'", str28, "China");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "CAN" + "'", str29, "CAN");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "en" + "'", str30, "en");
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "ko");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "ko");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str39, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "kor" + "'", str40, "kor");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\u671d\u9c9c\u6587" + "'", str43, "\u671d\u9c9c\u6587");
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test16628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16628");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("anglais");
        java.lang.String str2 = locale1.toLanguageTag();
        java.lang.String str3 = locale1.getLanguage();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "anglais");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "anglais" + "'", str2, "anglais");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "anglais" + "'", str3, "anglais");
    }

    @Test
    public void test16629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16629");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.lang.String str1 = locale0.getDisplayScript();
        java.lang.String str2 = locale0.getDisplayLanguage();
        boolean boolean3 = locale0.hasExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u6587" + "'", str2, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test16630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16630");
        java.text.NumberFormat.Field field0 = java.text.NumberFormat.Field.PERMILLE;
        java.lang.String str1 = field0.toString();
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        java.text.NumberFormat numberFormat3 = java.text.NumberFormat.getIntegerInstance(locale2);
        java.text.NumberFormat numberFormat4 = java.text.NumberFormat.getIntegerInstance(locale2);
        boolean boolean5 = field0.equals((java.lang.Object) numberFormat4);
        java.text.NumberFormat.Field field6 = java.text.NumberFormat.Field.SIGN;
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = field6.equals(obj7);
        boolean boolean9 = field0.equals((java.lang.Object) field6);
        java.text.NumberFormat numberFormat10 = java.text.NumberFormat.getIntegerInstance();
        java.text.NumberFormat numberFormat11 = java.text.NumberFormat.getPercentInstance();
        numberFormat11.setMaximumIntegerDigits((-1));
        java.text.NumberFormat numberFormat14 = java.text.NumberFormat.getPercentInstance();
        java.text.NumberFormat numberFormat15 = java.text.NumberFormat.getPercentInstance();
        numberFormat15.setMaximumIntegerDigits((-1));
        java.util.Currency currency18 = numberFormat15.getCurrency();
        numberFormat14.setCurrency(currency18);
        numberFormat11.setCurrency(currency18);
        java.text.NumberFormat numberFormat21 = java.text.NumberFormat.getPercentInstance();
        numberFormat21.setMaximumIntegerDigits((-1));
        java.util.Currency currency24 = numberFormat21.getCurrency();
        java.lang.String str26 = numberFormat21.format((double) 10);
        org.apache.commons.math.fraction.ProperFractionFormat properFractionFormat27 = new org.apache.commons.math.fraction.ProperFractionFormat(numberFormat10, numberFormat11, numberFormat21);
        java.text.NumberFormat numberFormat28 = java.text.NumberFormat.getInstance();
        java.lang.String str30 = numberFormat28.format(100L);
        properFractionFormat27.setWholeFormat(numberFormat28);
        java.text.NumberFormat numberFormat32 = properFractionFormat27.getWholeFormat();
        org.apache.commons.math.fraction.FractionFormat fractionFormat33 = org.apache.commons.math.fraction.FractionFormat.getImproperInstance();
        java.text.NumberFormat numberFormat34 = fractionFormat33.getNumeratorFormat();
        java.text.NumberFormat numberFormat35 = fractionFormat33.getNumeratorFormat();
        java.text.ParseException parseException38 = new java.text.ParseException("java.text.FieldPosition[field=0,attribute=java.text.NumberFormat$Field(per mille),beginIndex=0,endIndex=0]", 0);
        java.lang.Throwable[] throwableArray39 = parseException38.getSuppressed();
        boolean boolean40 = numberFormat35.equals((java.lang.Object) throwableArray39);
        numberFormat35.setMaximumFractionDigits((int) '#');
        org.apache.commons.math.fraction.ProperFractionFormat properFractionFormat43 = new org.apache.commons.math.fraction.ProperFractionFormat(numberFormat35);
        java.text.NumberFormat numberFormat44 = properFractionFormat43.getWholeFormat();
        properFractionFormat27.setWholeFormat(numberFormat44);
        java.text.NumberFormat numberFormat46 = properFractionFormat27.getNumeratorFormat();
        boolean boolean47 = field6.equals((java.lang.Object) numberFormat46);
        java.text.FieldPosition fieldPosition48 = new java.text.FieldPosition((java.text.Format.Field) field6);
        int int49 = fieldPosition48.getBeginIndex();
        java.text.Format.Field field50 = fieldPosition48.getFieldAttribute();
        java.text.FieldPosition fieldPosition52 = new java.text.FieldPosition(field50, 35);
        java.text.FieldPosition fieldPosition53 = new java.text.FieldPosition(field50);
        org.junit.Assert.assertNotNull(field0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java.text.NumberFormat$Field(per mille)" + "'", str1, "java.text.NumberFormat$Field(per mille)");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(numberFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(field6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertNotNull(numberFormat11);
        org.junit.Assert.assertNotNull(numberFormat14);
        org.junit.Assert.assertNotNull(numberFormat15);
        org.junit.Assert.assertNotNull(currency18);
        org.junit.Assert.assertEquals(currency18.toString(), "CNY");
        org.junit.Assert.assertNotNull(numberFormat21);
        org.junit.Assert.assertNotNull(currency24);
        org.junit.Assert.assertEquals(currency24.toString(), "CNY");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "0%" + "'", str26, "0%");
        org.junit.Assert.assertNotNull(numberFormat28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "100" + "'", str30, "100");
        org.junit.Assert.assertNotNull(numberFormat32);
        org.junit.Assert.assertNotNull(fractionFormat33);
        org.junit.Assert.assertNotNull(numberFormat34);
        org.junit.Assert.assertNotNull(numberFormat35);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(numberFormat44);
        org.junit.Assert.assertNotNull(numberFormat46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(field50);
    }

    @Test
    public void test16631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16631");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.lang.String str1 = locale0.getDisplayVariant();
        java.util.Locale locale2 = java.util.Locale.KOREAN;
        java.util.Locale locale3 = java.util.Locale.KOREAN;
        java.lang.String str4 = locale2.getDisplayLanguage(locale3);
        java.util.Locale locale5 = java.util.Locale.ITALIAN;
        java.lang.String str6 = locale3.getDisplayName(locale5);
        java.lang.String str7 = locale5.getDisplayLanguage();
        java.lang.String str8 = locale0.getDisplayName(locale5);
        java.lang.String str9 = locale5.getCountry();
        org.apache.commons.math.fraction.FractionFormat fractionFormat10 = org.apache.commons.math.fraction.FractionFormat.getImproperInstance(locale5);
        java.lang.String str11 = locale5.getCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str4, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "coreano" + "'", str6, "coreano");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u610f\u5927\u5229\u6587" + "'", str7, "\u610f\u5927\u5229\u6587");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "coreano" + "'", str8, "coreano");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(fractionFormat10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test16632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16632");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction(52, (-117));
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test16633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16633");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("java.text.ParsePosition[index=10,errorIndex=52]", (double) (-11L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-11.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16634");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        org.apache.commons.math.fraction.FractionFormat fractionFormat1 = org.apache.commons.math.fraction.FractionFormat.getProperInstance(locale0);
        java.text.NumberFormat numberFormat2 = fractionFormat1.getNumeratorFormat();
        java.text.NumberFormat numberFormat3 = fractionFormat1.getNumeratorFormat();
        int int4 = numberFormat3.getMinimumFractionDigits();
        java.lang.String str6 = numberFormat3.format((long) (byte) -116);
        java.util.Locale.Builder builder7 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder9 = builder7.setVariant("");
        java.util.Locale.Builder builder10 = builder9.clearExtensions();
        java.util.Locale locale11 = builder9.build();
        java.util.Locale locale12 = java.util.Locale.KOREAN;
        java.util.Locale locale13 = java.util.Locale.KOREAN;
        java.util.Locale locale14 = java.util.Locale.KOREAN;
        java.lang.String str15 = locale13.getDisplayLanguage(locale14);
        java.lang.String str16 = locale13.getISO3Language();
        java.lang.String str17 = locale12.getDisplayCountry(locale13);
        java.util.Locale locale18 = java.util.Locale.KOREAN;
        java.util.Locale locale19 = java.util.Locale.KOREAN;
        java.util.Locale locale20 = java.util.Locale.KOREAN;
        java.lang.String str21 = locale19.getDisplayLanguage(locale20);
        java.lang.String str22 = locale19.getISO3Language();
        java.lang.String str23 = locale18.getDisplayCountry(locale19);
        java.util.Locale locale24 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str25 = locale19.getDisplayLanguage(locale24);
        java.lang.String str26 = locale13.getDisplayName(locale24);
        java.util.Locale.Builder builder27 = builder9.setLocale(locale13);
        java.text.NumberFormat numberFormat28 = java.text.NumberFormat.getPercentInstance(locale13);
        org.apache.commons.math.fraction.FractionFormat fractionFormat29 = org.apache.commons.math.fraction.FractionFormat.getImproperInstance();
        java.text.NumberFormat numberFormat30 = fractionFormat29.getNumeratorFormat();
        java.text.NumberFormat numberFormat31 = fractionFormat29.getNumeratorFormat();
        java.text.ParseException parseException34 = new java.text.ParseException("java.text.FieldPosition[field=0,attribute=java.text.NumberFormat$Field(per mille),beginIndex=0,endIndex=0]", 0);
        java.lang.Throwable[] throwableArray35 = parseException34.getSuppressed();
        boolean boolean36 = numberFormat31.equals((java.lang.Object) throwableArray35);
        numberFormat31.setMaximumFractionDigits((int) '#');
        org.apache.commons.math.fraction.ProperFractionFormat properFractionFormat39 = new org.apache.commons.math.fraction.ProperFractionFormat(numberFormat31);
        java.text.NumberFormat numberFormat40 = properFractionFormat39.getWholeFormat();
        java.text.NumberFormat numberFormat41 = null;
        java.text.NumberFormat numberFormat42 = java.text.NumberFormat.getIntegerInstance();
        java.text.NumberFormat numberFormat43 = java.text.NumberFormat.getPercentInstance();
        numberFormat43.setMaximumIntegerDigits((-1));
        java.text.NumberFormat numberFormat46 = java.text.NumberFormat.getPercentInstance();
        java.text.NumberFormat numberFormat47 = java.text.NumberFormat.getPercentInstance();
        numberFormat47.setMaximumIntegerDigits((-1));
        java.util.Currency currency50 = numberFormat47.getCurrency();
        numberFormat46.setCurrency(currency50);
        numberFormat43.setCurrency(currency50);
        java.text.NumberFormat numberFormat53 = java.text.NumberFormat.getPercentInstance();
        numberFormat53.setMaximumIntegerDigits((-1));
        java.util.Currency currency56 = numberFormat53.getCurrency();
        java.lang.String str58 = numberFormat53.format((double) 10);
        org.apache.commons.math.fraction.ProperFractionFormat properFractionFormat59 = new org.apache.commons.math.fraction.ProperFractionFormat(numberFormat42, numberFormat43, numberFormat53);
        numberFormat43.setMinimumIntegerDigits((int) 'x');
        org.apache.commons.math.fraction.ProperFractionFormat properFractionFormat62 = new org.apache.commons.math.fraction.ProperFractionFormat(numberFormat40, numberFormat41, numberFormat43);
        org.apache.commons.math.fraction.ProperFractionFormat properFractionFormat63 = new org.apache.commons.math.fraction.ProperFractionFormat(numberFormat40);
        org.apache.commons.math.fraction.FractionFormat fractionFormat64 = new org.apache.commons.math.fraction.FractionFormat(numberFormat28, numberFormat40);
        java.lang.Object obj65 = numberFormat40.clone();
        org.apache.commons.math.fraction.FractionFormat fractionFormat66 = new org.apache.commons.math.fraction.FractionFormat(numberFormat3, numberFormat40);
        java.lang.String str68 = numberFormat3.format(1.4857142857142858d);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertNotNull(fractionFormat1);
        org.junit.Assert.assertNotNull(numberFormat2);
        org.junit.Assert.assertNotNull(numberFormat3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-116" + "'", str6, "-116");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "ko");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ko");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str15, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "kor" + "'", str16, "kor");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "ko");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ko");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str21, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "kor" + "'", str22, "kor");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\u671d\u9c9c\u6587" + "'", str25, "\u671d\u9c9c\u6587");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\u671d\u9c9c\u6587" + "'", str26, "\u671d\u9c9c\u6587");
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(numberFormat28);
        org.junit.Assert.assertNotNull(fractionFormat29);
        org.junit.Assert.assertNotNull(numberFormat30);
        org.junit.Assert.assertNotNull(numberFormat31);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(numberFormat40);
        org.junit.Assert.assertNotNull(numberFormat42);
        org.junit.Assert.assertNotNull(numberFormat43);
        org.junit.Assert.assertNotNull(numberFormat46);
        org.junit.Assert.assertNotNull(numberFormat47);
        org.junit.Assert.assertNotNull(currency50);
        org.junit.Assert.assertEquals(currency50.toString(), "CNY");
        org.junit.Assert.assertNotNull(numberFormat53);
        org.junit.Assert.assertNotNull(currency56);
        org.junit.Assert.assertEquals(currency56.toString(), "CNY");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "0%" + "'", str58, "0%");
        org.junit.Assert.assertNotNull(obj65);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "1" + "'", str68, "1");
    }

    @Test
    public void test16635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16635");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.String str1 = locale0.getDisplayScript();
        java.util.Set<java.lang.String> strSet2 = locale0.getUnicodeLocaleAttributes();
        java.util.Locale locale3 = java.util.Locale.ENGLISH;
        java.lang.String str4 = locale0.getDisplayCountry(locale3);
        java.lang.String str5 = locale3.getISO3Country();
        java.lang.String str6 = locale3.getDisplayName();
        java.lang.String str7 = locale3.getISO3Language();
        boolean boolean8 = locale3.hasExtensions();
        java.util.Locale locale9 = locale3.stripExtensions();
        java.lang.Object obj10 = locale3.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "United Kingdom" + "'", str4, "United Kingdom");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u82f1\u6587" + "'", str6, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "eng" + "'", str7, "eng");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "en");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "en");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "en");
    }
}
