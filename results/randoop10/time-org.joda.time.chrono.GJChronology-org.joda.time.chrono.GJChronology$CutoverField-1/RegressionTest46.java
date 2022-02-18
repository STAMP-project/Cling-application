import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest46 {

    public static boolean debug = false;

    @Test
    public void test23001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23001");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.monthOfYear();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.dayOfMonth();
        org.joda.time.DurationField durationField7 = gJChronology2.months();
        boolean boolean8 = durationField7.isPrecise();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test23002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23002");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 100);
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        int int6 = gJChronology5.getMinimumDaysInFirstWeek();
        java.lang.String str7 = gJChronology5.toString();
        org.joda.time.DurationField durationField8 = gJChronology5.hours();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology5.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology5.yearOfEra();
        org.joda.time.DurationField durationField11 = gJChronology5.seconds();
        org.joda.time.DurationField durationField12 = gJChronology5.halfdays();
        org.joda.time.DateTimeZone dateTimeZone13 = gJChronology5.getZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GJChronology[+00:00:00.052]" + "'", str7, "GJChronology[+00:00:00.052]");
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
    }

    @Test
    public void test23003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23003");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str1 = locale0.getLanguage();
        java.util.Set<java.lang.Character> charSet2 = locale0.getExtensionKeys();
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getVariant();
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str8 = locale7.toLanguageTag();
        java.lang.String str9 = locale4.getDisplayName(locale7);
        java.lang.String str10 = locale0.getDisplayScript(locale7);
        java.lang.String str11 = locale7.getISO3Language();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh" + "'", str1, "zh");
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "und" + "'", str8, "und");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test23004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23004");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.setVariant("halfdays");
        java.util.Locale.Builder builder6 = builder0.setScript("");
        java.util.Locale.Builder builder9 = builder0.setExtension('u', "fr_CA");
        java.util.Locale locale11 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str12 = locale11.toLanguageTag();
        java.lang.String str13 = locale11.getCountry();
        java.util.Locale locale15 = java.util.Locale.forLanguageTag("");
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone17);
        org.joda.time.DurationField durationField19 = gJChronology18.halfdays();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology18.millisOfDay();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology18.minuteOfDay();
        org.joda.time.DurationField durationField22 = gJChronology18.centuries();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology18.halfdayOfDay();
        java.util.Locale locale24 = java.util.Locale.ITALIAN;
        java.util.Locale locale25 = locale24.stripExtensions();
        java.util.Locale locale26 = java.util.Locale.CANADA;
        java.lang.String str27 = locale24.getDisplayVariant(locale26);
        boolean boolean28 = gJChronology18.equals((java.lang.Object) locale26);
        java.lang.String str29 = locale15.getDisplayLanguage(locale26);
        java.lang.String str31 = locale26.getUnicodeLocaleType("en");
        java.lang.String str32 = locale11.getDisplayName(locale26);
        java.lang.String str33 = locale26.getISO3Country();
        java.util.Locale.Builder builder34 = builder9.setLocale(locale26);
        java.util.Locale.Builder builder36 = builder34.setVariant("");
        java.util.Locale.Builder builder38 = builder36.addUnicodeLocaleAttribute("DEU");
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "und" + "'", str12, "und");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(gJChronology18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "it");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "it");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "CAN" + "'", str33, "CAN");
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
    }

    @Test
    public void test23005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23005");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.dayOfYear();
        java.lang.String str8 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.dayOfMonth();
        org.joda.time.DurationField durationField11 = gJChronology2.years();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.minuteOfHour();
        org.joda.time.DurationField durationField13 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology2.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology2.dayOfMonth();
        org.joda.time.DurationField durationField16 = gJChronology2.millis();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology2.millisOfSecond();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GJChronology[+00:00:00.052]" + "'", str8, "GJChronology[+00:00:00.052]");
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test23006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23006");
        java.util.Locale locale2 = new java.util.Locale("cinese (Taiwan)", "DurationField[weekyears]");
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str5 = locale4.toLanguageTag();
        java.lang.String str6 = locale4.getCountry();
        java.util.Locale locale7 = java.util.Locale.ROOT;
        java.util.Locale locale8 = java.util.Locale.GERMAN;
        java.lang.String str9 = locale8.getDisplayCountry();
        java.lang.String str10 = locale7.getDisplayLanguage(locale8);
        java.lang.String str11 = locale4.getDisplayVariant(locale7);
        java.lang.String str12 = locale2.getDisplayVariant(locale4);
        java.lang.String str13 = locale4.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet14 = locale4.getUnicodeLocaleAttributes();
        java.lang.String str15 = locale4.getDisplayCountry();
        org.junit.Assert.assertEquals(locale2.toString(), "cinese (taiwan)_DURATIONFIELD[WEEKYEARS]");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "und" + "'", str5, "und");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "de");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test23007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23007");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("1970-01-01t00:00:00.104+00:00:00.052 (EN)", (double) 523151711714L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=5.23151711714E11");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test23008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23008");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology4.millisOfSecond();
        int int6 = instant1.get(dateTimeField5);
        org.joda.time.Instant instant8 = instant1.plus(0L);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone10);
        org.joda.time.DurationField durationField12 = gJChronology11.halfdays();
        org.joda.time.Chronology chronology13 = gJChronology11.withUTC();
        java.lang.String str14 = gJChronology11.toString();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology11.hourOfHalfday();
        int int16 = instant1.get(dateTimeField15);
        org.joda.time.Instant instant18 = new org.joda.time.Instant(52L);
        boolean boolean19 = instant18.isEqualNow();
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.Instant instant21 = instant18.plus(readableDuration20);
        org.joda.time.Instant instant23 = new org.joda.time.Instant(52L);
        org.joda.time.Instant instant25 = instant23.withMillis((long) 'u');
        boolean boolean26 = instant18.isBefore((org.joda.time.ReadableInstant) instant23);
        boolean boolean27 = instant1.isEqual((org.joda.time.ReadableInstant) instant23);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = null;
        boolean boolean29 = instant23.isSupported(dateTimeFieldType28);
        java.util.TimeZone timeZone30 = null;
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forTimeZone(timeZone30);
        org.joda.time.chrono.GJChronology gJChronology32 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone31);
        org.joda.time.DateTimeField dateTimeField33 = gJChronology32.era();
        org.joda.time.DateTimeField dateTimeField34 = gJChronology32.centuryOfEra();
        java.util.TimeZone timeZone35 = null;
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forTimeZone(timeZone35);
        org.joda.time.chrono.GJChronology gJChronology37 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone36);
        int int39 = dateTimeZone36.getOffsetFromLocal((long) (-1));
        int int41 = dateTimeZone36.getOffset((-61827926399999L));
        org.joda.time.Chronology chronology42 = gJChronology32.withZone(dateTimeZone36);
        org.joda.time.DateTimeField dateTimeField43 = gJChronology32.dayOfMonth();
        org.joda.time.DurationField durationField44 = gJChronology32.centuries();
        org.joda.time.DurationField durationField45 = gJChronology32.halfdays();
        org.joda.time.DurationField durationField46 = gJChronology32.hours();
        org.joda.time.DurationField durationField47 = gJChronology32.weeks();
        boolean boolean48 = instant23.equals((java.lang.Object) durationField47);
        org.joda.time.Instant instant50 = instant23.minus((long) (short) 100);
        org.joda.time.Instant instant52 = new org.joda.time.Instant((-15553443375288000L));
        org.joda.time.Instant instant54 = instant52.withMillis((-402362257043848L));
        boolean boolean55 = instant23.isAfter((org.joda.time.ReadableInstant) instant54);
        boolean boolean57 = instant23.isEqual((-2177280000000L));
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(gJChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 104 + "'", int6 == 104);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(gJChronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(chronology13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "GJChronology[+00:00:00.052]" + "'", str14, "GJChronology[+00:00:00.052]");
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(instant21);
        org.junit.Assert.assertNotNull(instant25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(gJChronology32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(gJChronology37);
// flaky:         org.junit.Assert.assertTrue("'" + int39 + "' != '" + 52 + "'", int39 == 52);
// flaky:         org.junit.Assert.assertTrue("'" + int41 + "' != '" + 52 + "'", int41 == 52);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(durationField44);
        org.junit.Assert.assertNotNull(durationField45);
        org.junit.Assert.assertNotNull(durationField46);
        org.junit.Assert.assertNotNull(durationField47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(instant50);
        org.junit.Assert.assertNotNull(instant54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test23009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23009");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 1431201);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology4.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology4.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology4.secondOfMinute();
        org.joda.time.Instant instant8 = gJChronology4.getGregorianCutover();
        boolean boolean9 = instant1.isEqual((org.joda.time.ReadableInstant) instant8);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1, 10);
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        long long16 = dateTimeZone12.getMillisKeepLocal(dateTimeZone14, 4320000000L);
        org.joda.time.Instant instant18 = new org.joda.time.Instant(52L);
        boolean boolean19 = instant18.isEqualNow();
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.Instant instant21 = instant18.plus(readableDuration20);
        long long22 = instant18.getMillis();
        java.lang.String str23 = instant18.toString();
        org.joda.time.Instant instant24 = instant18.toInstant();
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.Instant instant27 = instant18.withDurationAdded(readableDuration25, (int) 'x');
        org.joda.time.Instant instant28 = instant18.toInstant();
        int int29 = dateTimeZone12.getOffset((org.joda.time.ReadableInstant) instant18);
        org.joda.time.Instant instant31 = new org.joda.time.Instant(52L);
        boolean boolean32 = instant31.isEqualNow();
        org.joda.time.ReadableDuration readableDuration33 = null;
        org.joda.time.Instant instant34 = instant31.plus(readableDuration33);
        long long35 = instant31.getMillis();
        java.lang.String str36 = instant31.toString();
        boolean boolean38 = instant31.isAfter((long) (-1));
        java.lang.Object obj39 = null;
        boolean boolean40 = instant31.equals(obj39);
        org.joda.time.ReadableDuration readableDuration41 = null;
        org.joda.time.Instant instant42 = instant31.minus(readableDuration41);
        org.joda.time.chrono.GJChronology gJChronology43 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12, (org.joda.time.ReadableInstant) instant31);
        java.util.TimeZone timeZone44 = null;
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forTimeZone(timeZone44);
        org.joda.time.chrono.GJChronology gJChronology46 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone45);
        org.joda.time.DateTimeField dateTimeField47 = gJChronology46.era();
        org.joda.time.DurationField durationField48 = gJChronology46.months();
        java.lang.String str49 = durationField48.getName();
        java.util.TimeZone timeZone50 = null;
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forTimeZone(timeZone50);
        org.joda.time.chrono.GJChronology gJChronology52 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone51);
        org.joda.time.DurationField durationField53 = gJChronology52.halfdays();
        long long56 = durationField53.add((long) 100, 100L);
        boolean boolean57 = durationField53.isPrecise();
        long long60 = durationField53.getValueAsLong(1L, (long) 0);
        int int61 = durationField48.compareTo(durationField53);
        boolean boolean62 = instant31.equals((java.lang.Object) int61);
        org.joda.time.Instant instant64 = instant31.plus(259200006000000L);
        org.joda.time.Instant instant66 = instant64.withMillis(26328952801764L);
        int int67 = instant8.compareTo((org.joda.time.ReadableInstant) instant64);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(gJChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 4324199948L + "'", long16 == 4324199948L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(instant21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 52L + "'", long22 == 52L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str23, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertNotNull(instant27);
        org.junit.Assert.assertNotNull(instant28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4200000 + "'", int29 == 4200000);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(instant34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 52L + "'", long35 == 52L);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str36, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(instant42);
        org.junit.Assert.assertNotNull(gJChronology43);
        org.junit.Assert.assertNotNull(dateTimeZone45);
        org.junit.Assert.assertNotNull(gJChronology46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(durationField48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "months" + "'", str49, "months");
        org.junit.Assert.assertNotNull(dateTimeZone51);
        org.junit.Assert.assertNotNull(gJChronology52);
        org.junit.Assert.assertNotNull(durationField53);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 4320000100L + "'", long56 == 4320000100L);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(instant64);
        org.junit.Assert.assertNotNull(instant66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
    }

    @Test
    public void test23010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23010");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology4.millisOfSecond();
        int int6 = instant1.get(dateTimeField5);
        boolean boolean7 = instant1.isEqualNow();
        org.joda.time.tz.NameProvider nameProvider8 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider8);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider8);
        boolean boolean11 = instant1.equals((java.lang.Object) nameProvider8);
        org.joda.time.Instant instant13 = new org.joda.time.Instant(52L);
        boolean boolean14 = instant13.isEqualNow();
        java.lang.String str15 = instant13.toString();
        org.joda.time.DateTimeZone dateTimeZone16 = instant13.getZone();
        org.joda.time.DateTime dateTime17 = instant1.toDateTime(dateTimeZone16);
        java.lang.String str18 = instant1.toString();
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.Instant instant20 = instant1.plus(readableDuration19);
        org.joda.time.Instant instant22 = instant20.withMillis(220898620800000L);
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.Instant instant24 = instant20.minus(readableDuration23);
        org.joda.time.DateTime dateTime25 = instant24.toDateTime();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(gJChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 104 + "'", int6 == 104);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(nameProvider8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str15, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str18, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertNotNull(instant20);
        org.junit.Assert.assertNotNull(instant22);
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertNotNull(dateTime25);
    }

    @Test
    public void test23011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23011");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1, 10);
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        long long6 = dateTimeZone2.getMillisKeepLocal(dateTimeZone4, 4320000000L);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.lang.String str10 = dateTimeZone8.getNameKey((long) 100);
        boolean boolean11 = dateTimeZone8.isFixed();
        java.lang.String str12 = dateTimeZone8.toString();
        java.lang.String str13 = dateTimeZone8.getID();
        long long15 = dateTimeZone4.getMillisKeepLocal(dateTimeZone8, (long) (byte) -1);
        java.util.Locale locale17 = java.util.Locale.getDefault();
        boolean boolean18 = locale17.hasExtensions();
        java.lang.String str19 = dateTimeZone8.getName((-99L), locale17);
        java.lang.String str20 = dateTimeZone8.getID();
        long long22 = dateTimeZone8.previousTransition(60141101835680949L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4324199948L + "'", long6 == 4324199948L);
        org.junit.Assert.assertNotNull(dateTimeZone8);
// flaky:         org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.052" + "'", str12, "+00:00:00.052");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.052" + "'", str13, "+00:00:00.052");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertNotNull(locale17);
// flaky:         org.junit.Assert.assertEquals(locale17.toString(), "zh_EN");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.052" + "'", str19, "+00:00:00.052");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.052" + "'", str20, "+00:00:00.052");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 60141101835680949L + "'", long22 == 60141101835680949L);
    }

    @Test
    public void test23012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23012");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.era();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.weekyear();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.weekyearOfCentury();
        org.joda.time.DurationField durationField6 = gJChronology2.millis();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.dayOfWeek();
        org.joda.time.DurationField durationField8 = gJChronology2.millis();
        org.joda.time.Instant instant9 = gJChronology2.getGregorianCutover();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.minuteOfHour();
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = gJChronology13.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology13.weekyear();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology13.halfdayOfDay();
        org.joda.time.DurationField durationField17 = gJChronology13.years();
        org.joda.time.DurationField durationField18 = gJChronology13.minutes();
        java.util.TimeZone timeZone19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        java.lang.String str22 = dateTimeZone20.getNameKey((long) 100);
        boolean boolean23 = dateTimeZone20.isFixed();
        org.joda.time.chrono.GJChronology gJChronology24 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone20);
        int int25 = gJChronology24.getMinimumDaysInFirstWeek();
        java.lang.String str26 = gJChronology24.toString();
        org.joda.time.DateTimeField dateTimeField27 = gJChronology24.yearOfEra();
        org.joda.time.DateTimeField dateTimeField28 = gJChronology24.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField29 = gJChronology24.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology31 = gJChronology24.withZone(dateTimeZone30);
        org.joda.time.Chronology chronology32 = gJChronology13.withZone(dateTimeZone30);
        long long35 = dateTimeZone30.convertLocalToUTC((-3155673600000L), false);
        org.joda.time.Chronology chronology36 = gJChronology2.withZone(dateTimeZone30);
        org.joda.time.DurationField durationField37 = gJChronology2.months();
        long long41 = gJChronology2.add(32054400010L, (-43081870L), (int) (short) -1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(gJChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeZone20);
// flaky:         org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(gJChronology24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "GJChronology[+00:00:00.052]" + "'", str26, "GJChronology[+00:00:00.052]");
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(chronology32);
// flaky:         org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-3155673600052L) + "'", long35 == (-3155673600052L));
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(durationField37);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 32097481880L + "'", long41 == 32097481880L);
    }

    @Test
    public void test23013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23013");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        int int4 = dateTimeZone1.getOffsetFromLocal((long) (-1));
        int int6 = dateTimeZone1.getOffset((-61827926399999L));
        int int8 = dateTimeZone1.getOffset((-244872043829L));
        java.util.Locale locale11 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str12 = dateTimeZone1.getShortName(3061065600000L, locale11);
        int int14 = dateTimeZone1.getOffsetFromLocal(38948L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "italian");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.052" + "'", str12, "+00:00:00.052");
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test23014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23014");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.setVariant("halfdays");
        java.util.Locale.Builder builder6 = builder0.setScript("");
        java.util.Locale.Builder builder7 = builder0.clearExtensions();
        java.util.Locale.Builder builder8 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale.Builder builder10 = builder8.clearExtensions();
        java.util.Locale.Builder builder12 = builder8.setVariant("halfdays");
        java.util.Locale.Builder builder14 = builder8.setScript("");
        java.util.Locale.Builder builder15 = builder8.clearExtensions();
        java.util.Locale.Builder builder17 = builder8.setRegion("CN");
        java.util.Locale.Builder builder18 = builder8.clear();
        java.util.Locale.Builder builder20 = builder8.addUnicodeLocaleAttribute("und");
        java.util.Locale.Builder builder21 = builder20.clearExtensions();
        java.util.Locale locale22 = java.util.Locale.ITALIAN;
        java.util.Locale locale23 = locale22.stripExtensions();
        java.lang.String str24 = locale22.getDisplayVariant();
        java.lang.String str25 = locale22.getDisplayName();
        java.lang.String str26 = locale22.getVariant();
        java.util.Locale.Builder builder27 = builder20.setLocale(locale22);
        java.util.Locale.Builder builder28 = builder0.setLocale(locale22);
        java.util.Locale.Builder builder31 = builder28.setExtension('x', "Chinese");
        java.util.Locale.Builder builder32 = builder31.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder34 = builder32.setVariant("United Kingdom");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: United Kingdom [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "it");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "it");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\u610f\u5927\u5229\u6587" + "'", str25, "\u610f\u5927\u5229\u6587");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder32);
    }

    @Test
    public void test23015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23015");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.centuryOfEra();
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.chrono.GJChronology gJChronology7 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone6);
        org.joda.time.DurationField durationField8 = gJChronology7.halfdays();
        long long12 = gJChronology7.add((long) 'a', (-1L), (int) (short) 0);
        long long16 = gJChronology7.add((long) (byte) 0, (long) '4', 100);
        org.joda.time.DateTimeField dateTimeField17 = gJChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology7.year();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology7.era();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology7.minuteOfHour();
        org.joda.time.DurationField durationField21 = gJChronology7.hours();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone24 = dateTimeZone23.toTimeZone();
        long long27 = dateTimeZone23.adjustOffset((long) 0, false);
        int int29 = dateTimeZone23.getOffsetFromLocal((-26438399999L));
        java.util.TimeZone timeZone30 = dateTimeZone23.toTimeZone();
        java.lang.String str32 = dateTimeZone23.getShortName((-53L));
        org.joda.time.Chronology chronology33 = gJChronology7.withZone(dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        long long36 = dateTimeZone23.getMillisKeepLocal(dateTimeZone34, (long) 0);
        org.joda.time.Chronology chronology37 = gJChronology2.withZone(dateTimeZone34);
        org.joda.time.DateTimeField dateTimeField38 = gJChronology2.weekOfWeekyear();
        org.joda.time.DurationField durationField39 = gJChronology2.minutes();
        int int42 = durationField39.getDifference(4492799983L, 2246400000L);
        long long45 = durationField39.getMillis((-535079), 45224821756101L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(gJChronology7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 5200L + "'", long16 == 5200L);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00:00.052" + "'", str32, "+00:00:00.052");
        org.junit.Assert.assertNotNull(chronology33);
// flaky:         org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(durationField39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 37439 + "'", int42 == 37439);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-32104740000L) + "'", long45 == (-32104740000L));
    }

    @Test
    public void test23016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23016");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.years();
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        org.joda.time.chrono.GJChronology gJChronology6 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone5);
        org.joda.time.DurationField durationField7 = gJChronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology6.millisOfDay();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology6.minuteOfDay();
        org.joda.time.DurationField durationField10 = gJChronology6.centuries();
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12);
        org.joda.time.DurationField durationField14 = gJChronology13.halfdays();
        long long17 = durationField14.add((long) 100, 100L);
        boolean boolean18 = durationField14.isPrecise();
        int int19 = durationField10.compareTo(durationField14);
        boolean boolean20 = gJChronology2.equals((java.lang.Object) durationField10);
        org.joda.time.DateTimeField dateTimeField21 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology2.hourOfDay();
        java.lang.String str23 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField24 = gJChronology2.yearOfCentury();
        org.joda.time.DurationField durationField25 = gJChronology2.months();
        org.joda.time.DurationField durationField26 = gJChronology2.weeks();
        org.joda.time.DateTimeField dateTimeField27 = gJChronology2.millisOfSecond();
        org.joda.time.DurationField durationField28 = gJChronology2.weekyears();
        java.lang.String str29 = durationField28.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(gJChronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(gJChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 4320000100L + "'", long17 == 4320000100L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "GJChronology[+00:00:00.052]" + "'", str23, "GJChronology[+00:00:00.052]");
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "DurationField[weekyears]" + "'", str29, "DurationField[weekyears]");
    }

    @Test
    public void test23017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23017");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 100);
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        int int6 = gJChronology5.getMinimumDaysInFirstWeek();
        java.lang.String str7 = gJChronology5.toString();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology5.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology5.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology5.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology12 = gJChronology5.withZone(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField13 = gJChronology5.clockhourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        long long17 = gJChronology5.add(readablePeriod14, (long) (byte) 0, (-1916));
        org.joda.time.DateTimeField dateTimeField18 = gJChronology5.hourOfHalfday();
        long long22 = gJChronology5.add(3732479993280000L, 1155627000L, (-34508851));
        java.lang.String str23 = gJChronology5.toString();
        org.joda.time.DateTimeField dateTimeField24 = gJChronology5.hourOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GJChronology[+00:00:00.052]" + "'", str7, "GJChronology[+00:00:00.052]");
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-36146879961297000L) + "'", long22 == (-36146879961297000L));
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "GJChronology[+00:00:00.052]" + "'", str23, "GJChronology[+00:00:00.052]");
        org.junit.Assert.assertNotNull(dateTimeField24);
    }

    @Test
    public void test23018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23018");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.halfdayOfDay();
        java.util.Locale locale8 = java.util.Locale.ITALIAN;
        java.util.Locale locale9 = locale8.stripExtensions();
        java.util.Locale locale10 = java.util.Locale.CANADA;
        java.lang.String str11 = locale8.getDisplayVariant(locale10);
        boolean boolean12 = gJChronology2.equals((java.lang.Object) locale10);
        org.joda.time.DateTimeField dateTimeField13 = gJChronology2.weekyear();
        org.joda.time.DurationField durationField14 = gJChronology2.weeks();
        org.joda.time.DurationField durationField15 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology2.dayOfYear();
        org.joda.time.DurationField durationField18 = gJChronology2.seconds();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology2.minuteOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test23019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23019");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        long long11 = gJChronology2.add((long) (byte) 0, (long) '4', 100);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology2.year();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology2.era();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology2.dayOfYear();
        org.joda.time.Instant instant16 = gJChronology2.getGregorianCutover();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5200L + "'", long11 == 5200L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(instant16);
    }

    @Test
    public void test23020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23020");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.dayOfYear();
        java.lang.String str8 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone10 = gJChronology2.getZone();
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12);
        java.util.Locale locale15 = new java.util.Locale("hi!");
        java.lang.String str16 = locale15.getCountry();
        java.util.Locale locale17 = java.util.Locale.getDefault();
        java.lang.String str18 = locale17.getDisplayName();
        java.lang.String str19 = locale15.getDisplayScript(locale17);
        boolean boolean20 = dateTimeZone12.equals((java.lang.Object) locale17);
        org.joda.time.Chronology chronology21 = gJChronology2.withZone(dateTimeZone12);
        org.joda.time.DurationField durationField22 = gJChronology2.seconds();
        org.joda.time.DurationField durationField23 = gJChronology2.years();
        org.joda.time.DateTimeField dateTimeField24 = gJChronology2.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long30 = gJChronology2.getDateTimeMillis((long) 24, 28800104, 70, (-308571432), 240);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 28800104 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GJChronology[+00:00:00.052]" + "'", str8, "GJChronology[+00:00:00.052]");
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(gJChronology13);
        org.junit.Assert.assertEquals(locale15.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
// flaky:         org.junit.Assert.assertEquals(locale17.toString(), "zh_EN");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u4e2d\u6587 (EN)" + "'", str18, "\u4e2d\u6587 (EN)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
    }

    @Test
    public void test23021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23021");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        boolean boolean2 = instant1.isEqualNow();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant4 = instant1.plus(readableDuration3);
        org.joda.time.Instant instant6 = instant1.withMillis((long) 4);
        org.joda.time.Instant instant8 = instant6.withMillis((-5919628L));
        org.joda.time.Instant instant10 = instant8.minus(4324199948L);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Instant instant13 = instant8.withDurationAdded(readableDuration11, 2);
        org.joda.time.Instant instant14 = instant8.toInstant();
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        org.joda.time.chrono.GJChronology gJChronology17 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone16);
        org.joda.time.DurationField durationField18 = gJChronology17.halfdays();
        long long22 = gJChronology17.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean24 = gJChronology17.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField25 = gJChronology17.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField26 = gJChronology17.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField27 = gJChronology17.clockhourOfDay();
        long long32 = gJChronology17.getDateTimeMillis(10, (int) (short) 10, 4, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField33 = gJChronology17.millisOfDay();
        java.lang.String str34 = gJChronology17.toString();
        org.joda.time.DateTimeField dateTimeField35 = gJChronology17.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField36 = gJChronology17.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField37 = gJChronology17.halfdayOfDay();
        java.util.TimeZone timeZone38 = null;
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forTimeZone(timeZone38);
        org.joda.time.chrono.GJChronology gJChronology40 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone39);
        org.joda.time.DurationField durationField41 = gJChronology40.halfdays();
        long long45 = gJChronology40.add((long) 'a', (-1L), (int) (short) 0);
        long long49 = gJChronology40.add((long) (byte) 0, (long) '4', 100);
        org.joda.time.DurationField durationField50 = gJChronology40.years();
        org.joda.time.DateTimeField dateTimeField51 = gJChronology40.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone52 = gJChronology40.getZone();
        org.joda.time.Chronology chronology53 = gJChronology17.withZone(dateTimeZone52);
        org.joda.time.chrono.GJChronology gJChronology54 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone52);
        org.joda.time.DateTime dateTime55 = instant14.toDateTime(dateTimeZone52);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(gJChronology17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 97L + "'", long22 == 97L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
// flaky:         org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-61827926400051L) + "'", long32 == (-61827926400051L));
        org.junit.Assert.assertNotNull(dateTimeField33);
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "GJChronology[+00:00:00.052]" + "'", str34, "GJChronology[+00:00:00.052]");
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(gJChronology40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 97L + "'", long45 == 97L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 5200L + "'", long49 == 5200L);
        org.junit.Assert.assertNotNull(durationField50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(dateTimeZone52);
        org.junit.Assert.assertNotNull(chronology53);
        org.junit.Assert.assertNotNull(gJChronology54);
        org.junit.Assert.assertNotNull(dateTime55);
    }

    @Test
    public void test23022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23022");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.dayOfYear();
        java.lang.String str8 = gJChronology2.toString();
        org.joda.time.DurationField durationField9 = gJChronology2.years();
        int int10 = gJChronology2.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField11 = gJChronology2.hours();
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        java.lang.String str15 = dateTimeZone13.getNameKey((long) 100);
        boolean boolean16 = dateTimeZone13.isFixed();
        org.joda.time.chrono.GJChronology gJChronology17 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone13);
        int int18 = gJChronology17.getMinimumDaysInFirstWeek();
        java.lang.String str19 = gJChronology17.toString();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology17.yearOfEra();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology17.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology17.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology17.clockhourOfHalfday();
        java.lang.String str24 = gJChronology17.toString();
        org.joda.time.DateTimeField dateTimeField25 = gJChronology17.dayOfMonth();
        boolean boolean26 = gJChronology2.equals((java.lang.Object) dateTimeField25);
        // The following exception was thrown during execution in test generation
        try {
            long long34 = gJChronology2.getDateTimeMillis(80, (-294543), (-25), (-166), (-69), (-1314), 985);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -166 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GJChronology[+00:00:00.052]" + "'", str8, "GJChronology[+00:00:00.052]");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
// flaky:         org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(gJChronology17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "GJChronology[+00:00:00.052]" + "'", str19, "GJChronology[+00:00:00.052]");
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "GJChronology[+00:00:00.052]" + "'", str24, "GJChronology[+00:00:00.052]");
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test23023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23023");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant1 = org.joda.time.Instant.parse("TEDESCO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"TEDESCO\" is malformed at \"EDESCO\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test23024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23024");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getCountry();
        java.util.Locale locale6 = java.util.Locale.getDefault();
        java.lang.String str7 = locale6.getDisplayName();
        java.lang.String str8 = locale4.getDisplayScript(locale6);
        boolean boolean9 = dateTimeZone1.equals((java.lang.Object) locale6);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone12 = dateTimeZone11.toTimeZone();
        long long15 = dateTimeZone11.adjustOffset((long) 0, false);
        int int17 = dateTimeZone11.getOffsetFromLocal((-26438399999L));
        long long19 = dateTimeZone1.getMillisKeepLocal(dateTimeZone11, (long) (byte) 10);
        org.joda.time.Instant instant21 = new org.joda.time.Instant(52L);
        boolean boolean22 = instant21.isEqualNow();
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.Instant instant24 = instant21.plus(readableDuration23);
        long long25 = instant21.getMillis();
        java.lang.String str26 = instant21.toString();
        org.joda.time.Instant instant27 = instant21.toInstant();
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.Instant instant30 = instant21.withDurationAdded(readableDuration28, (int) 'x');
        java.util.TimeZone timeZone31 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forTimeZone(timeZone31);
        org.joda.time.chrono.GJChronology gJChronology33 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone32);
        org.joda.time.DateTimeField dateTimeField34 = gJChronology33.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField35 = gJChronology33.yearOfCentury();
        int int36 = instant30.get(dateTimeField35);
        org.joda.time.chrono.GJChronology gJChronology37 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11, (org.joda.time.ReadableInstant) instant30);
        org.joda.time.DurationField durationField38 = gJChronology37.days();
        org.joda.time.DurationField durationField39 = gJChronology37.minutes();
        int int40 = gJChronology37.getMinimumDaysInFirstWeek();
        java.lang.String str41 = gJChronology37.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
// flaky:         org.junit.Assert.assertEquals(locale6.toString(), "zh_EN");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u6587 (EN)" + "'", str7, "\u4e2d\u6587 (EN)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 52L + "'", long25 == 52L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str26, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertNotNull(instant27);
        org.junit.Assert.assertNotNull(instant30);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(gJChronology33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 70 + "'", int36 == 70);
        org.junit.Assert.assertNotNull(gJChronology37);
        org.junit.Assert.assertNotNull(durationField38);
        org.junit.Assert.assertNotNull(durationField39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 4 + "'", int40 == 4);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "GJChronology[+00:00:00.052,cutover=1970-01-01T00:00:00.052Z]" + "'", str41, "GJChronology[+00:00:00.052,cutover=1970-01-01T00:00:00.052Z]");
    }

    @Test
    public void test23025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23025");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        long long11 = gJChronology2.add((long) (byte) 0, (long) '4', 100);
        org.joda.time.DurationField durationField12 = gJChronology2.years();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        long long16 = gJChronology2.add(readablePeriod13, (long) '#', (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField17 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone18 = gJChronology2.getZone();
        org.joda.time.Instant instant20 = new org.joda.time.Instant(3600000L);
        boolean boolean21 = instant20.isBeforeNow();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (short) 10);
        java.lang.String str26 = dateTimeZone24.getNameKey(5983L);
        long long28 = dateTimeZone24.previousTransition((-43881L));
        org.joda.time.chrono.GJChronology gJChronology29 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone24);
        org.joda.time.MutableDateTime mutableDateTime30 = instant20.toMutableDateTime(dateTimeZone24);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology32 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone18, (org.joda.time.ReadableInstant) instant20, 55299599);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 55299599");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5200L + "'", long11 == 5200L);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 35L + "'", long16 == 35L);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-43881L) + "'", long28 == (-43881L));
        org.junit.Assert.assertNotNull(gJChronology29);
        org.junit.Assert.assertNotNull(mutableDateTime30);
    }

    @Test
    public void test23026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23026");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone2);
        org.joda.time.DurationField durationField4 = gJChronology3.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.halfdayOfDay();
        int int7 = instant0.get(dateTimeField6);
        org.joda.time.Instant instant9 = instant0.minus(4156171L);
        org.joda.time.Instant instant11 = instant0.plus(259168556400000L);
        org.joda.time.Instant instant12 = instant0.toInstant();
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(instant12);
    }

    @Test
    public void test23027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23027");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) '#');
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology4.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology4.weekyearOfCentury();
        org.joda.time.Instant instant7 = gJChronology4.getGregorianCutover();
        boolean boolean8 = instant1.equals((java.lang.Object) gJChronology4);
        org.joda.time.DateTimeField dateTimeField9 = gJChronology4.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology4.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology4.year();
        org.joda.time.DurationField durationField12 = gJChronology4.years();
        org.joda.time.DurationField durationField13 = gJChronology4.years();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(gJChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test23028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23028");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        long long11 = gJChronology2.add((long) (byte) 0, (long) '4', 100);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.minuteOfHour();
        org.joda.time.DurationField durationField13 = gJChronology2.hours();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology2.millisOfSecond();
        org.joda.time.DurationField durationField16 = gJChronology2.seconds();
        java.lang.String str17 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology2.minuteOfHour();
        org.joda.time.DurationField durationField20 = gJChronology2.seconds();
        java.lang.String str21 = gJChronology2.toString();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        long long25 = gJChronology2.add(readablePeriod22, 252001869L, (int) (byte) 10);
        org.joda.time.DurationField durationField26 = gJChronology2.weeks();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5200L + "'", long11 == 5200L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "GJChronology[+00:00:00.052]" + "'", str17, "GJChronology[+00:00:00.052]");
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "GJChronology[+00:00:00.052]" + "'", str21, "GJChronology[+00:00:00.052]");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 252001869L + "'", long25 == 252001869L);
        org.junit.Assert.assertNotNull(durationField26);
    }

    @Test
    public void test23029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23029");
        java.util.Locale locale3 = new java.util.Locale("-116313-08-02T23:50:00.104Z", "zh-cn_INGLESE (CANADA)_zh", "durationfield[hours]_+00:10_DurationField[days]");
        org.junit.Assert.assertEquals(locale3.toString(), "-116313-08-02t23:50:00.104z_ZH-CN_INGLESE (CANADA)_ZH_durationfield[hours]_+00:10_DurationField[days]");
    }

    @Test
    public void test23030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23030");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((-61827739199999L));
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        java.lang.String str4 = dateTimeZone2.getShortName((-4023623458387L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
    }

    @Test
    public void test23031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23031");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.weekyearOfCentury();
        org.joda.time.Instant instant5 = gJChronology2.getGregorianCutover();
        org.joda.time.Instant instant7 = instant5.withMillis(0L);
        org.joda.time.Instant instant9 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.chrono.GJChronology gJChronology12 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField13 = gJChronology12.millisOfSecond();
        int int14 = instant9.get(dateTimeField13);
        org.joda.time.Instant instant16 = instant9.plus(0L);
        int int17 = instant7.compareTo((org.joda.time.ReadableInstant) instant16);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = null;
        boolean boolean19 = instant16.isSupported(dateTimeFieldType18);
        org.joda.time.Instant instant21 = new org.joda.time.Instant(52L);
        boolean boolean22 = instant21.isEqualNow();
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.Instant instant24 = instant21.plus(readableDuration23);
        int int25 = instant16.compareTo((org.joda.time.ReadableInstant) instant21);
        org.joda.time.Chronology chronology26 = instant16.getChronology();
        org.joda.time.Instant instant28 = new org.joda.time.Instant(52L);
        boolean boolean29 = instant28.isEqualNow();
        java.lang.String str30 = instant28.toString();
        org.joda.time.Instant instant32 = new org.joda.time.Instant(52L);
        boolean boolean33 = instant32.isEqualNow();
        java.lang.String str34 = instant32.toString();
        java.lang.String str35 = instant32.toString();
        org.joda.time.Instant instant38 = instant32.withDurationAdded(115200000L, (int) (short) 1);
        int int39 = instant28.compareTo((org.joda.time.ReadableInstant) instant32);
        org.joda.time.Instant instant41 = new org.joda.time.Instant(52L);
        boolean boolean42 = instant41.isEqualNow();
        org.joda.time.ReadableDuration readableDuration43 = null;
        org.joda.time.Instant instant44 = instant41.plus(readableDuration43);
        boolean boolean46 = instant44.equals((java.lang.Object) ' ');
        boolean boolean47 = instant32.isAfter((org.joda.time.ReadableInstant) instant44);
        org.joda.time.DateTime dateTime48 = instant32.toDateTime();
        boolean boolean49 = instant16.isBefore((org.joda.time.ReadableInstant) dateTime48);
        boolean boolean50 = dateTime48.isAfterNow();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(gJChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str30, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str34, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str35, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertNotNull(instant38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(instant44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test23032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23032");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.millisOfSecond();
        org.joda.time.DurationField durationField4 = gJChronology2.millis();
        org.joda.time.DurationField durationField5 = gJChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone9 = gJChronology2.getZone();
        java.util.Locale locale14 = new java.util.Locale("zh", "en", "");
        boolean boolean15 = locale14.hasExtensions();
        java.lang.String str16 = locale14.getScript();
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        org.joda.time.chrono.GJChronology gJChronology19 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone18);
        long long23 = dateTimeZone18.convertLocalToUTC((long) (byte) -1, true, 0L);
        boolean boolean25 = dateTimeZone18.equals((java.lang.Object) true);
        java.util.Locale locale27 = java.util.Locale.getDefault();
        java.lang.String str28 = locale27.getDisplayLanguage();
        java.lang.String str29 = locale27.toLanguageTag();
        java.lang.String str30 = dateTimeZone18.getShortName(0L, locale27);
        java.lang.String str31 = locale14.getDisplayVariant(locale27);
        java.lang.String str32 = dateTimeZone9.getName((-1431201L), locale27);
        long long35 = dateTimeZone9.adjustOffset((-5919628L), true);
        int int37 = dateTimeZone9.getOffset((-2766263482957958564L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_EN");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(gJChronology19);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(locale27);
// flaky:         org.junit.Assert.assertEquals(locale27.toString(), "zh_EN");
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\u4e2d\u6587" + "'", str28, "\u4e2d\u6587");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "zh-EN" + "'", str29, "zh-EN");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00" + "'", str30, "+00:00");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00" + "'", str32, "+00:00");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-5919628L) + "'", long35 == (-5919628L));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test23033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23033");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 100);
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        long long7 = dateTimeZone1.convertUTCToLocal(5200L);
        java.util.Locale.LanguageRange[] languageRangeArray8 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList9 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9, languageRangeArray8);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap11 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList12 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, strMap11);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap13 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList14 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList12, strMap13);
        java.util.Locale.LanguageRange[] languageRangeArray15 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList16 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16, languageRangeArray15);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap18 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList19 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, strMap18);
        java.lang.String[] strArray23 = new java.lang.String[] { "English", "English", "hi!" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        java.util.List<java.lang.String> strList26 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, (java.util.Collection<java.lang.String>) strList24);
        java.util.Locale.FilteringMode filteringMode27 = null;
        java.util.List<java.lang.String> strList28 = java.util.Locale.filterTags(languageRangeList14, (java.util.Collection<java.lang.String>) strList24, filteringMode27);
        java.util.Locale.LanguageRange[] languageRangeArray29 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList30 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList30, languageRangeArray29);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap32 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList33 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList30, strMap32);
        java.util.Locale.LanguageRange[] languageRangeArray34 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList35 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList35, languageRangeArray34);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap37 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList38 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, strMap37);
        java.lang.String[] strArray42 = new java.lang.String[] { "English", "English", "hi!" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        java.util.List<java.lang.String> strList45 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, (java.util.Collection<java.lang.String>) strList43);
        java.util.List<java.lang.String> strList46 = java.util.Locale.filterTags(languageRangeList33, (java.util.Collection<java.lang.String>) strList45);
        java.util.List<java.lang.String> strList47 = java.util.Locale.filterTags(languageRangeList14, (java.util.Collection<java.lang.String>) strList46);
        java.util.Locale.LanguageRange[] languageRangeArray48 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList49 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList49, languageRangeArray48);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap51 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList52 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList49, strMap51);
        java.lang.String[] strArray56 = new java.lang.String[] { "English", "English", "hi!" };
        java.util.ArrayList<java.lang.String> strList57 = new java.util.ArrayList<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList57, strArray56);
        java.util.List<java.lang.String> strList59 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList49, (java.util.Collection<java.lang.String>) strList57);
        java.util.List<java.lang.String> strList60 = java.util.Locale.filterTags(languageRangeList14, (java.util.Collection<java.lang.String>) strList59);
        boolean boolean61 = dateTimeZone1.equals((java.lang.Object) languageRangeList14);
        java.lang.String str62 = dateTimeZone1.getID();
        java.util.Locale locale64 = java.util.Locale.UK;
        java.lang.String str65 = locale64.getScript();
        java.lang.String str67 = locale64.getUnicodeLocaleType("it");
        java.util.Set<java.lang.String> strSet68 = locale64.getUnicodeLocaleAttributes();
        java.util.Locale locale70 = java.util.Locale.forLanguageTag("und");
        java.lang.String str71 = locale64.getDisplayScript(locale70);
        java.lang.String str72 = dateTimeZone1.getName((-25575169557600000L), locale64);
        java.util.Locale.setDefault(locale64);
        java.util.Locale.setDefault(locale64);
        java.util.Locale locale78 = new java.util.Locale("zh_tw (EN-US,English)", "1970-02-20T00:00:00.100Z", "united kingdom");
        java.lang.String str79 = locale64.getDisplayLanguage(locale78);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5200L + "'", long7 == 5200L);
        org.junit.Assert.assertNotNull(languageRangeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(languageRangeList12);
        org.junit.Assert.assertNotNull(languageRangeList14);
        org.junit.Assert.assertNotNull(languageRangeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(languageRangeList19);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNotNull(languageRangeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(languageRangeList33);
        org.junit.Assert.assertNotNull(languageRangeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(languageRangeList38);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertNotNull(languageRangeArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(languageRangeList52);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(strList59);
        org.junit.Assert.assertNotNull(strList60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "UTC" + "'", str62, "UTC");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNotNull(strSet68);
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "+00:00" + "'", str72, "+00:00");
        org.junit.Assert.assertEquals(locale78.toString(), "zh_tw (en-us,english)_1970-02-20T00:00:00.100Z_united kingdom");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "English" + "'", str79, "English");
    }

    @Test
    public void test23034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23034");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.secondOfDay();
        org.joda.time.Chronology chronology8 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.weekyear();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.monthOfYear();
        org.joda.time.DurationField durationField12 = gJChronology2.weeks();
        org.joda.time.Instant instant13 = gJChronology2.getGregorianCutover();
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        org.joda.time.chrono.GJChronology gJChronology16 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone15);
        org.joda.time.DurationField durationField17 = gJChronology16.years();
        java.util.TimeZone timeZone18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        org.joda.time.chrono.GJChronology gJChronology20 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone19);
        org.joda.time.DurationField durationField21 = gJChronology20.halfdays();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology20.millisOfDay();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology20.minuteOfDay();
        org.joda.time.DurationField durationField24 = gJChronology20.centuries();
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        org.joda.time.chrono.GJChronology gJChronology27 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone26);
        org.joda.time.DurationField durationField28 = gJChronology27.halfdays();
        long long31 = durationField28.add((long) 100, 100L);
        boolean boolean32 = durationField28.isPrecise();
        int int33 = durationField24.compareTo(durationField28);
        boolean boolean34 = gJChronology16.equals((java.lang.Object) durationField24);
        org.joda.time.DateTimeField dateTimeField35 = gJChronology16.dayOfYear();
        org.joda.time.DateTimeField dateTimeField36 = gJChronology16.era();
        org.joda.time.DateTimeZone dateTimeZone37 = gJChronology16.getZone();
        java.lang.String str38 = dateTimeZone37.getID();
        org.joda.time.Instant instant40 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone41 = null;
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forTimeZone(timeZone41);
        org.joda.time.chrono.GJChronology gJChronology43 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone42);
        org.joda.time.DateTimeField dateTimeField44 = gJChronology43.millisOfSecond();
        int int45 = instant40.get(dateTimeField44);
        boolean boolean46 = instant40.isEqualNow();
        org.joda.time.Instant instant48 = new org.joda.time.Instant(52L);
        boolean boolean49 = instant48.isEqualNow();
        org.joda.time.ReadableDuration readableDuration50 = null;
        org.joda.time.Instant instant51 = instant48.plus(readableDuration50);
        long long52 = instant48.getMillis();
        java.lang.Object obj53 = null;
        boolean boolean54 = instant48.equals(obj53);
        org.joda.time.Instant instant56 = new org.joda.time.Instant(52L);
        boolean boolean57 = instant56.isEqualNow();
        org.joda.time.ReadableDuration readableDuration58 = null;
        org.joda.time.Instant instant59 = instant56.plus(readableDuration58);
        long long60 = instant56.getMillis();
        java.lang.String str61 = instant56.toString();
        org.joda.time.Instant instant62 = instant56.toInstant();
        org.joda.time.ReadableDuration readableDuration63 = null;
        org.joda.time.Instant instant65 = instant56.withDurationAdded(readableDuration63, (int) 'x');
        org.joda.time.Instant instant66 = instant56.toInstant();
        int int67 = instant48.compareTo((org.joda.time.ReadableInstant) instant56);
        boolean boolean68 = instant40.isBefore((org.joda.time.ReadableInstant) instant56);
        java.util.TimeZone timeZone69 = null;
        org.joda.time.DateTimeZone dateTimeZone70 = org.joda.time.DateTimeZone.forTimeZone(timeZone69);
        org.joda.time.chrono.GJChronology gJChronology71 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone70);
        org.joda.time.DurationField durationField72 = gJChronology71.halfdays();
        long long76 = gJChronology71.add((long) 'a', (-1L), (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField77 = gJChronology71.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField78 = gJChronology71.secondOfMinute();
        org.joda.time.Instant instant80 = new org.joda.time.Instant(52L);
        boolean boolean81 = instant80.isEqualNow();
        org.joda.time.ReadableDuration readableDuration82 = null;
        org.joda.time.Instant instant83 = instant80.plus(readableDuration82);
        boolean boolean84 = gJChronology71.equals((java.lang.Object) instant80);
        org.joda.time.DateTimeFieldType dateTimeFieldType85 = null;
        boolean boolean86 = instant80.isSupported(dateTimeFieldType85);
        org.joda.time.DateTimeFieldType dateTimeFieldType87 = null;
        boolean boolean88 = instant80.isSupported(dateTimeFieldType87);
        java.lang.String str89 = instant80.toString();
        boolean boolean90 = instant40.isAfter((org.joda.time.ReadableInstant) instant80);
        org.joda.time.MutableDateTime mutableDateTime91 = instant80.toMutableDateTimeISO();
        org.joda.time.chrono.GJChronology gJChronology93 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone37, (org.joda.time.ReadableInstant) mutableDateTime91, (int) (byte) 1);
        boolean boolean94 = instant13.equals((java.lang.Object) dateTimeZone37);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(gJChronology16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(gJChronology20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(gJChronology27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 4320000100L + "'", long31 == 4320000100L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "UTC" + "'", str38, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertNotNull(gJChronology43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 52 + "'", int45 == 52);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(instant51);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 52L + "'", long52 == 52L);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(instant59);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 52L + "'", long60 == 52L);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str61, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertNotNull(instant62);
        org.junit.Assert.assertNotNull(instant65);
        org.junit.Assert.assertNotNull(instant66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(dateTimeZone70);
        org.junit.Assert.assertNotNull(gJChronology71);
        org.junit.Assert.assertNotNull(durationField72);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 97L + "'", long76 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField77);
        org.junit.Assert.assertNotNull(dateTimeField78);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(instant83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str89, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(mutableDateTime91);
        org.junit.Assert.assertNotNull(gJChronology93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test23035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23035");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        long long11 = gJChronology2.add((long) (byte) 0, (long) '4', 100);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.minuteOfHour();
        org.joda.time.DurationField durationField13 = gJChronology2.hours();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology2.hourOfHalfday();
        org.joda.time.Chronology chronology15 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology2.secondOfMinute();
        org.joda.time.DurationField durationField18 = gJChronology2.months();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology2.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology2.dayOfYear();
        java.lang.String str21 = gJChronology2.toString();
        org.joda.time.ReadablePartial readablePartial22 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = gJChronology2.get(readablePartial22, 3692217001970L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5200L + "'", long11 == 5200L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "GJChronology[UTC]" + "'", str21, "GJChronology[UTC]");
    }

    @Test
    public void test23036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23036");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1970, 432149);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 432149");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test23037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23037");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1155627, (-93));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -93");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test23038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23038");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        long long11 = gJChronology2.add((long) (byte) 0, (long) '4', 100);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone15 = dateTimeZone14.toTimeZone();
        long long18 = dateTimeZone14.adjustOffset((long) 0, false);
        int int20 = dateTimeZone14.getOffsetFromLocal((-26438399999L));
        long long22 = dateTimeZone14.previousTransition((long) (byte) 1);
        java.lang.String str23 = dateTimeZone14.getID();
        org.joda.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = dateTimeZone14.isLocalDateTimeGap(localDateTime24);
        org.joda.time.Chronology chronology26 = gJChronology2.withZone(dateTimeZone14);
        java.util.Locale.Builder builder28 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder29 = builder28.clear();
        java.util.Locale.Builder builder31 = builder29.removeUnicodeLocaleAttribute("und");
        java.util.Locale.Builder builder32 = builder31.clear();
        java.util.Locale.Builder builder33 = builder32.clear();
        java.util.Locale.Builder builder34 = builder32.clearExtensions();
        java.util.Locale locale35 = builder34.build();
        java.lang.String str36 = dateTimeZone14.getName(187205200L, locale35);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5200L + "'", long11 == 5200L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00:00.052" + "'", str23, "+00:00:00.052");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:00:00.052" + "'", str36, "+00:00:00.052");
    }

    @Test
    public void test23039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23039");
        java.util.Locale locale2 = new java.util.Locale("\u4e2d\u6587\u53f0\u7063)", "Italian");
        java.util.Locale.setDefault(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "\u4e2d\u6587\u53f0\u7063)_ITALIAN");
    }

    @Test
    public void test23040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23040");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 100);
        boolean boolean4 = dateTimeZone1.isFixed();
        java.util.Locale locale8 = new java.util.Locale("DurationField[halfdays]", "\u82f1\u6587");
        java.lang.String str9 = dateTimeZone1.getName((long) (short) 10, locale8);
        org.joda.time.Instant instant11 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField15 = gJChronology14.millisOfSecond();
        int int16 = instant11.get(dateTimeField15);
        org.joda.time.Chronology chronology17 = instant11.getChronology();
        org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, (org.joda.time.ReadableInstant) instant11);
        long long19 = instant11.getMillis();
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.Instant instant21 = instant11.minus(readableDuration20);
        java.lang.String str22 = instant11.toString();
        boolean boolean24 = instant11.isBefore((-43881L));
        org.joda.time.DateTimeZone dateTimeZone25 = instant11.getZone();
        java.lang.String str27 = dateTimeZone25.getShortName(50716800000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky:         org.junit.Assert.assertEquals(locale8.toString(), "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(gJChronology18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 52L + "'", long19 == 52L);
        org.junit.Assert.assertNotNull(instant21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str22, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00" + "'", str27, "+00:00");
    }

    @Test
    public void test23041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23041");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.removeUnicodeLocaleAttribute("und");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder6 = builder4.setLanguage("de");
        java.util.Locale locale7 = java.util.Locale.FRENCH;
        java.util.Locale locale8 = java.util.Locale.ITALIAN;
        java.util.Locale locale9 = locale8.stripExtensions();
        java.util.Locale locale10 = java.util.Locale.CANADA;
        java.lang.String str11 = locale8.getDisplayVariant(locale10);
        java.lang.String str12 = locale7.getDisplayScript(locale8);
        java.util.Set<java.lang.Character> charSet13 = locale8.getExtensionKeys();
        java.util.Locale.Builder builder14 = builder4.setLocale(locale8);
        java.util.Locale locale15 = builder4.build();
        java.util.Locale.Builder builder16 = builder4.clearExtensions();
        java.util.Locale.Builder builder17 = builder4.clear();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charSet13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "it");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test23042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23042");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 100);
        boolean boolean4 = dateTimeZone1.isFixed();
        java.util.Locale locale8 = new java.util.Locale("DurationField[halfdays]", "\u82f1\u6587");
        java.lang.String str9 = dateTimeZone1.getName((long) (short) 10, locale8);
        org.joda.time.Instant instant11 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField15 = gJChronology14.millisOfSecond();
        int int16 = instant11.get(dateTimeField15);
        org.joda.time.Chronology chronology17 = instant11.getChronology();
        org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, (org.joda.time.ReadableInstant) instant11);
        long long19 = instant11.getMillis();
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.Instant instant21 = instant11.minus(readableDuration20);
        java.lang.String str22 = instant11.toString();
        org.joda.time.Instant instant25 = instant11.withDurationAdded((-17419228677157418L), (int) (byte) 1);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = instant25.toMutableDateTime(chronology26);
        boolean boolean29 = instant25.isAfter(33443020800000000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky:         org.junit.Assert.assertEquals(locale8.toString(), "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(gJChronology18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 52L + "'", long19 == 52L);
        org.junit.Assert.assertNotNull(instant21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str22, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertNotNull(instant25);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test23043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23043");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.years();
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        org.joda.time.chrono.GJChronology gJChronology6 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone5);
        org.joda.time.DurationField durationField7 = gJChronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology6.millisOfDay();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology6.minuteOfDay();
        org.joda.time.DurationField durationField10 = gJChronology6.centuries();
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12);
        org.joda.time.DurationField durationField14 = gJChronology13.halfdays();
        long long17 = durationField14.add((long) 100, 100L);
        boolean boolean18 = durationField14.isPrecise();
        int int19 = durationField10.compareTo(durationField14);
        boolean boolean20 = gJChronology2.equals((java.lang.Object) durationField10);
        org.joda.time.DateTimeField dateTimeField21 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology2.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone23 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField24 = gJChronology2.yearOfEra();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(gJChronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(gJChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 4320000100L + "'", long17 == 4320000100L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeField24);
    }

    @Test
    public void test23044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23044");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        boolean boolean2 = instant1.isEqualNow();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant4 = instant1.plus(readableDuration3);
        long long5 = instant1.getMillis();
        java.lang.String str6 = instant1.toString();
        boolean boolean8 = instant1.isAfter((long) (-1));
        java.lang.Object obj9 = null;
        boolean boolean10 = instant1.equals(obj9);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        boolean boolean12 = instant1.isSupported(dateTimeFieldType11);
        org.joda.time.DateTimeZone dateTimeZone13 = instant1.getZone();
        long long15 = dateTimeZone13.previousTransition((-6724243829L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str6, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-6724243829L) + "'", long15 == (-6724243829L));
    }

    @Test
    public void test23045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23045");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.secondOfMinute();
        org.joda.time.Instant instant11 = new org.joda.time.Instant(52L);
        boolean boolean12 = instant11.isEqualNow();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.Instant instant14 = instant11.plus(readableDuration13);
        boolean boolean15 = gJChronology2.equals((java.lang.Object) instant11);
        org.joda.time.DurationField durationField16 = gJChronology2.minutes();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone18 = gJChronology2.getZone();
        java.lang.String str19 = dateTimeZone18.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTC" + "'", str19, "UTC");
    }

    @Test
    public void test23046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23046");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        long long11 = gJChronology2.add((long) (byte) 0, (long) '4', 100);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.minuteOfHour();
        org.joda.time.DurationField durationField13 = gJChronology2.hours();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology2.monthOfYear();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology2.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology2.yearOfEra();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5200L + "'", long11 == 5200L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test23047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23047");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getCountry();
        java.util.Locale locale6 = java.util.Locale.getDefault();
        java.lang.String str7 = locale6.getDisplayName();
        java.lang.String str8 = locale4.getDisplayScript(locale6);
        boolean boolean9 = dateTimeZone1.equals((java.lang.Object) locale6);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone12 = dateTimeZone11.toTimeZone();
        long long15 = dateTimeZone11.adjustOffset((long) 0, false);
        int int17 = dateTimeZone11.getOffsetFromLocal((-26438399999L));
        long long19 = dateTimeZone1.getMillisKeepLocal(dateTimeZone11, (long) (byte) 10);
        org.joda.time.Instant instant21 = new org.joda.time.Instant(52L);
        boolean boolean22 = instant21.isEqualNow();
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.Instant instant24 = instant21.plus(readableDuration23);
        long long25 = instant21.getMillis();
        java.lang.String str26 = instant21.toString();
        org.joda.time.Instant instant27 = instant21.toInstant();
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.Instant instant30 = instant21.withDurationAdded(readableDuration28, (int) 'x');
        java.util.TimeZone timeZone31 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forTimeZone(timeZone31);
        org.joda.time.chrono.GJChronology gJChronology33 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone32);
        org.joda.time.DateTimeField dateTimeField34 = gJChronology33.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField35 = gJChronology33.yearOfCentury();
        int int36 = instant30.get(dateTimeField35);
        org.joda.time.chrono.GJChronology gJChronology37 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11, (org.joda.time.ReadableInstant) instant30);
        org.joda.time.DateTimeField dateTimeField38 = gJChronology37.minuteOfDay();
        java.util.TimeZone timeZone39 = null;
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forTimeZone(timeZone39);
        org.joda.time.chrono.GJChronology gJChronology41 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone40);
        org.joda.time.DurationField durationField42 = gJChronology41.halfdays();
        org.joda.time.DateTimeField dateTimeField43 = gJChronology41.millisOfDay();
        org.joda.time.DateTimeField dateTimeField44 = gJChronology41.minuteOfDay();
        org.joda.time.DurationField durationField45 = gJChronology41.centuries();
        org.joda.time.DateTimeField dateTimeField46 = gJChronology41.dayOfYear();
        java.lang.String str47 = gJChronology41.toString();
        org.joda.time.DateTimeField dateTimeField48 = gJChronology41.dayOfYear();
        org.joda.time.Chronology chronology49 = gJChronology41.withUTC();
        org.joda.time.DateTimeZone dateTimeZone50 = gJChronology41.getZone();
        org.joda.time.Chronology chronology51 = gJChronology37.withZone(dateTimeZone50);
        org.joda.time.DurationField durationField52 = gJChronology37.years();
        java.lang.String str53 = gJChronology37.toString();
        org.joda.time.DateTimeField dateTimeField54 = gJChronology37.era();
        java.util.TimeZone timeZone55 = null;
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forTimeZone(timeZone55);
        org.joda.time.chrono.GJChronology gJChronology57 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone56);
        org.joda.time.DurationField durationField58 = gJChronology57.halfdays();
        long long62 = gJChronology57.add((long) 'a', (-1L), (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField63 = gJChronology57.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField64 = gJChronology57.centuryOfEra();
        long long68 = gJChronology57.add(262974600000L, (long) (byte) 100, (int) '4');
        org.joda.time.DurationField durationField69 = gJChronology57.hours();
        java.util.TimeZone timeZone70 = null;
        org.joda.time.DateTimeZone dateTimeZone71 = org.joda.time.DateTimeZone.forTimeZone(timeZone70);
        org.joda.time.Chronology chronology72 = gJChronology57.withZone(dateTimeZone71);
        org.joda.time.DurationField durationField73 = gJChronology57.centuries();
        org.joda.time.DateTimeZone dateTimeZone74 = gJChronology57.getZone();
        org.joda.time.Chronology chronology75 = gJChronology37.withZone(dateTimeZone74);
        long long79 = chronology75.add((-7104214235L), (long) (-43081870), (-122764));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "\u4e2d\u6587\u53f0\u7063)_ITALIAN");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u6587\u53f0\u7063) (ITALIAN)" + "'", str7, "\u4e2d\u6587\u53f0\u7063) (ITALIAN)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-42L) + "'", long19 == (-42L));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 52L + "'", long25 == 52L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str26, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertNotNull(instant27);
        org.junit.Assert.assertNotNull(instant30);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(gJChronology33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 70 + "'", int36 == 70);
        org.junit.Assert.assertNotNull(gJChronology37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(gJChronology41);
        org.junit.Assert.assertNotNull(durationField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(durationField45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "GJChronology[UTC]" + "'", str47, "GJChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertNotNull(durationField52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "GJChronology[+00:00:00.052,cutover=1970-01-01T00:00:00.052Z]" + "'", str53, "GJChronology[+00:00:00.052,cutover=1970-01-01T00:00:00.052Z]");
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertNotNull(dateTimeZone56);
        org.junit.Assert.assertNotNull(gJChronology57);
        org.junit.Assert.assertNotNull(durationField58);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 97L + "'", long62 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField63);
        org.junit.Assert.assertNotNull(dateTimeField64);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 262974605200L + "'", long68 == 262974605200L);
        org.junit.Assert.assertNotNull(durationField69);
        org.junit.Assert.assertNotNull(dateTimeZone71);
        org.junit.Assert.assertNotNull(chronology72);
        org.junit.Assert.assertNotNull(durationField73);
        org.junit.Assert.assertNotNull(dateTimeZone74);
        org.junit.Assert.assertNotNull(chronology75);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 5281798474445L + "'", long79 == 5281798474445L);
    }

    @Test
    public void test23048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23048");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.dayOfYear();
        java.lang.String str8 = gJChronology2.toString();
        org.joda.time.DurationField durationField9 = gJChronology2.years();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.clockhourOfHalfday();
        java.lang.String str12 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology2.weekyear();
        org.joda.time.DurationField durationField14 = gJChronology2.years();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology2.monthOfYear();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology2.monthOfYear();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GJChronology[UTC]" + "'", str8, "GJChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "GJChronology[UTC]" + "'", str12, "GJChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test23049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23049");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(91L);
        org.joda.time.ReadableInstant readableInstant2 = null;
        boolean boolean3 = instant1.isEqual(readableInstant2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = null;
        java.lang.String str5 = instant1.toString(dateTimeFormatter4);
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        java.lang.String str9 = dateTimeZone7.getNameKey((long) 100);
        boolean boolean10 = dateTimeZone7.isFixed();
        java.util.Locale locale14 = new java.util.Locale("DurationField[halfdays]", "\u82f1\u6587");
        java.lang.String str15 = dateTimeZone7.getName((long) (short) 10, locale14);
        org.joda.time.Instant instant17 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        org.joda.time.chrono.GJChronology gJChronology20 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone19);
        org.joda.time.DateTimeField dateTimeField21 = gJChronology20.millisOfSecond();
        int int22 = instant17.get(dateTimeField21);
        org.joda.time.Chronology chronology23 = instant17.getChronology();
        org.joda.time.chrono.GJChronology gJChronology24 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, (org.joda.time.ReadableInstant) instant17);
        long long25 = instant17.getMillis();
        boolean boolean27 = instant17.isBefore(863999948L);
        java.util.TimeZone timeZone28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        org.joda.time.chrono.GJChronology gJChronology30 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone29);
        org.joda.time.DurationField durationField31 = gJChronology30.halfdays();
        long long35 = gJChronology30.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean37 = gJChronology30.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField38 = gJChronology30.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField39 = gJChronology30.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField40 = gJChronology30.clockhourOfDay();
        long long45 = gJChronology30.getDateTimeMillis(10, (int) (short) 10, 4, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField46 = gJChronology30.millisOfDay();
        java.lang.String str47 = gJChronology30.toString();
        org.joda.time.DateTimeField dateTimeField48 = gJChronology30.clockhourOfHalfday();
        org.joda.time.DateTime dateTime49 = instant17.toDateTime((org.joda.time.Chronology) gJChronology30);
        int int50 = instant1.compareTo((org.joda.time.ReadableInstant) instant17);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01T00:00:00.091Z" + "'", str5, "1970-01-01T00:00:00.091Z");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky:         org.junit.Assert.assertEquals(locale14.toString(), "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(gJChronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(gJChronology24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 52L + "'", long25 == 52L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(gJChronology30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 97L + "'", long35 == 97L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-61827926399999L) + "'", long45 == (-61827926399999L));
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "GJChronology[UTC]" + "'", str47, "GJChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
    }

    @Test
    public void test23050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23050");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.secondOfMinute();
        org.joda.time.Instant instant11 = new org.joda.time.Instant(52L);
        boolean boolean12 = instant11.isEqualNow();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.Instant instant14 = instant11.plus(readableDuration13);
        boolean boolean15 = gJChronology2.equals((java.lang.Object) instant11);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = null;
        boolean boolean17 = instant11.isSupported(dateTimeFieldType16);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = null;
        boolean boolean19 = instant11.isSupported(dateTimeFieldType18);
        org.joda.time.DateTimeZone dateTimeZone20 = instant11.getZone();
        org.joda.time.Instant instant22 = instant11.plus((long) 'a');
        org.joda.time.Instant instant24 = instant22.minus((-7077547900L));
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        java.lang.String str28 = dateTimeZone26.getNameKey((long) 100);
        boolean boolean29 = dateTimeZone26.isFixed();
        org.joda.time.chrono.GJChronology gJChronology30 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone26);
        long long32 = dateTimeZone26.convertUTCToLocal(5200L);
        java.util.Locale.LanguageRange[] languageRangeArray33 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList34 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList34, languageRangeArray33);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap36 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList37 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList34, strMap36);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap38 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList39 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList37, strMap38);
        java.util.Locale.LanguageRange[] languageRangeArray40 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList41 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList41, languageRangeArray40);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap43 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList44 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList41, strMap43);
        java.lang.String[] strArray48 = new java.lang.String[] { "English", "English", "hi!" };
        java.util.ArrayList<java.lang.String> strList49 = new java.util.ArrayList<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList49, strArray48);
        java.util.List<java.lang.String> strList51 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList41, (java.util.Collection<java.lang.String>) strList49);
        java.util.Locale.FilteringMode filteringMode52 = null;
        java.util.List<java.lang.String> strList53 = java.util.Locale.filterTags(languageRangeList39, (java.util.Collection<java.lang.String>) strList49, filteringMode52);
        java.util.Locale.LanguageRange[] languageRangeArray54 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList55 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList55, languageRangeArray54);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap57 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList58 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList55, strMap57);
        java.util.Locale.LanguageRange[] languageRangeArray59 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList60 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList60, languageRangeArray59);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap62 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList63 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList60, strMap62);
        java.lang.String[] strArray67 = new java.lang.String[] { "English", "English", "hi!" };
        java.util.ArrayList<java.lang.String> strList68 = new java.util.ArrayList<java.lang.String>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList68, strArray67);
        java.util.List<java.lang.String> strList70 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList60, (java.util.Collection<java.lang.String>) strList68);
        java.util.List<java.lang.String> strList71 = java.util.Locale.filterTags(languageRangeList58, (java.util.Collection<java.lang.String>) strList70);
        java.util.List<java.lang.String> strList72 = java.util.Locale.filterTags(languageRangeList39, (java.util.Collection<java.lang.String>) strList71);
        java.util.Locale.LanguageRange[] languageRangeArray73 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList74 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList74, languageRangeArray73);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap76 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList77 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList74, strMap76);
        java.lang.String[] strArray81 = new java.lang.String[] { "English", "English", "hi!" };
        java.util.ArrayList<java.lang.String> strList82 = new java.util.ArrayList<java.lang.String>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList82, strArray81);
        java.util.List<java.lang.String> strList84 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList74, (java.util.Collection<java.lang.String>) strList82);
        java.util.List<java.lang.String> strList85 = java.util.Locale.filterTags(languageRangeList39, (java.util.Collection<java.lang.String>) strList84);
        boolean boolean86 = dateTimeZone26.equals((java.lang.Object) languageRangeList39);
        java.lang.String str87 = dateTimeZone26.getID();
        java.lang.String str89 = dateTimeZone26.getName(0L);
        java.lang.String str91 = dateTimeZone26.getNameKey(474600000L);
        org.joda.time.chrono.GJChronology gJChronology92 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone26);
        org.joda.time.MutableDateTime mutableDateTime93 = instant22.toMutableDateTime((org.joda.time.Chronology) gJChronology92);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(instant22);
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "UTC" + "'", str28, "UTC");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(gJChronology30);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 5200L + "'", long32 == 5200L);
        org.junit.Assert.assertNotNull(languageRangeArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(languageRangeList37);
        org.junit.Assert.assertNotNull(languageRangeList39);
        org.junit.Assert.assertNotNull(languageRangeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(languageRangeList44);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertNotNull(strList53);
        org.junit.Assert.assertNotNull(languageRangeArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(languageRangeList58);
        org.junit.Assert.assertNotNull(languageRangeArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(languageRangeList63);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(strList70);
        org.junit.Assert.assertNotNull(strList71);
        org.junit.Assert.assertNotNull(strList72);
        org.junit.Assert.assertNotNull(languageRangeArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(languageRangeList77);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(strList84);
        org.junit.Assert.assertNotNull(strList85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "UTC" + "'", str87, "UTC");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "+00:00" + "'", str89, "+00:00");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "UTC" + "'", str91, "UTC");
        org.junit.Assert.assertNotNull(gJChronology92);
        org.junit.Assert.assertNotNull(mutableDateTime93);
    }

    @Test
    public void test23051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23051");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        long long11 = gJChronology2.add((long) (byte) 0, (long) '4', 100);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.minuteOfHour();
        org.joda.time.DurationField durationField13 = gJChronology2.hours();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology2.millisOfSecond();
        org.joda.time.DurationField durationField16 = gJChronology2.seconds();
        java.lang.String str17 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology2.halfdayOfDay();
        java.lang.String str20 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology2.secondOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5200L + "'", long11 == 5200L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "GJChronology[UTC]" + "'", str17, "GJChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "GJChronology[UTC]" + "'", str20, "GJChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField21);
    }

    @Test
    public void test23052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23052");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.centuryOfEra();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test23053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23053");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("weekyears", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=weekyears");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test23054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23054");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology4.millisOfSecond();
        int int6 = instant1.get(dateTimeField5);
        boolean boolean7 = instant1.isEqualNow();
        org.joda.time.Instant instant8 = instant1.toInstant();
        org.joda.time.Instant instant10 = new org.joda.time.Instant(52L);
        boolean boolean11 = instant10.isEqualNow();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Instant instant13 = instant10.plus(readableDuration12);
        org.joda.time.Instant instant15 = new org.joda.time.Instant(52L);
        org.joda.time.Instant instant17 = instant15.withMillis((long) 'u');
        boolean boolean18 = instant10.isBefore((org.joda.time.ReadableInstant) instant15);
        org.joda.time.ReadableInstant readableInstant19 = null;
        boolean boolean20 = instant10.isEqual(readableInstant19);
        org.joda.time.Instant instant22 = instant10.plus(85905030L);
        boolean boolean23 = instant8.isAfter((org.joda.time.ReadableInstant) instant10);
        java.util.Date date24 = instant10.toDate();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(gJChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(instant17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(instant22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:00 UTC 1970");
    }

    @Test
    public void test23055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23055");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean9 = gJChronology2.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology2.clockhourOfHalfday();
        org.joda.time.DurationField durationField14 = gJChronology2.weekyears();
        org.joda.time.DurationField durationField15 = gJChronology2.seconds();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology2.yearOfEra();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test23056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23056");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.millisOfSecond();
        org.joda.time.DurationField durationField4 = gJChronology2.millis();
        org.joda.time.DurationField durationField5 = gJChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = gJChronology2.getZone();
        java.lang.String str10 = dateTimeZone8.getNameKey((-3703934725113598131L));
        java.util.Locale locale14 = new java.util.Locale("english (united states)", "weeks");
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1, 10);
        java.util.TimeZone timeZone18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        long long21 = dateTimeZone17.getMillisKeepLocal(dateTimeZone19, 4320000000L);
        java.lang.String str22 = dateTimeZone17.getID();
        int int24 = dateTimeZone17.getOffset(7816188L);
        int int26 = dateTimeZone17.getOffsetFromLocal((long) 100);
        java.util.Locale locale28 = java.util.Locale.ITALIAN;
        java.lang.String str29 = locale28.getCountry();
        java.util.Locale locale30 = java.util.Locale.UK;
        java.lang.String str31 = locale30.getDisplayCountry();
        java.util.Set<java.lang.Character> charSet32 = locale30.getExtensionKeys();
        java.util.Locale locale33 = locale30.stripExtensions();
        java.lang.String str34 = locale28.getDisplayVariant(locale33);
        java.lang.String str36 = locale33.getUnicodeLocaleType("de");
        java.util.Locale locale38 = new java.util.Locale("hi!");
        java.lang.String str39 = locale38.getVariant();
        java.util.Locale locale41 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str42 = locale41.toLanguageTag();
        java.lang.String str43 = locale38.getDisplayName(locale41);
        java.util.Locale locale44 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale45 = java.util.Locale.ENGLISH;
        java.lang.String str46 = locale44.getDisplayLanguage(locale45);
        java.util.Locale locale47 = java.util.Locale.CANADA;
        java.lang.String str48 = locale47.getISO3Language();
        java.lang.String str49 = locale44.getDisplayVariant(locale47);
        java.lang.String str50 = locale41.getDisplayCountry(locale47);
        java.lang.String str51 = locale33.getDisplayCountry(locale41);
        java.lang.String str52 = dateTimeZone17.getName(3155760000052L, locale41);
        java.lang.String str53 = locale14.getDisplayName(locale41);
        java.lang.String str54 = locale41.getLanguage();
        java.lang.String str55 = dateTimeZone8.getName(1104493320L, locale41);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertEquals(locale14.toString(), "english (united states)_WEEKS");
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 4324200000L + "'", long21 == 4324200000L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+01:10" + "'", str22, "+01:10");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4200000 + "'", int24 == 4200000);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4200000 + "'", int26 == 4200000);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "it");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "United Kingdom" + "'", str31, "United Kingdom");
        org.junit.Assert.assertNotNull(charSet32);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertEquals(locale38.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "und" + "'", str42, "und");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "en");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Chinese" + "'", str46, "Chinese");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "eng" + "'", str48, "eng");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "United Kingdom" + "'", str51, "United Kingdom");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "+01:10" + "'", str52, "+01:10");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "english (united states) (WEEKS)" + "'", str53, "english (united states) (WEEKS)");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "+00:00" + "'", str55, "+00:00");
    }

    @Test
    public void test23057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23057");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        long long11 = gJChronology2.add((long) (byte) 0, (long) '4', 100);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology2.year();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology2.era();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology2.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology2.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology2.yearOfEra();
        boolean boolean19 = dateTimeField18.isLenient();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5200L + "'", long11 == 5200L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test23058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23058");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        long long11 = gJChronology2.add((long) (byte) 0, (long) '4', 100);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.minuteOfHour();
        org.joda.time.DurationField durationField13 = gJChronology2.hours();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology2.hourOfHalfday();
        org.joda.time.Chronology chronology15 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology2.secondOfMinute();
        org.joda.time.DurationField durationField18 = gJChronology2.months();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology2.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology2.dayOfYear();
        java.lang.String str21 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology2.centuryOfEra();
        org.joda.time.DurationField durationField23 = gJChronology2.weeks();
        org.joda.time.DurationField durationField24 = gJChronology2.halfdays();
        org.joda.time.DurationField durationField25 = gJChronology2.weeks();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5200L + "'", long11 == 5200L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "GJChronology[UTC]" + "'", str21, "GJChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(durationField25);
    }

    @Test
    public void test23059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23059");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean9 = gJChronology2.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.clockhourOfDay();
        long long17 = gJChronology2.getDateTimeMillis(10, (int) (short) 10, 4, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField18 = gJChronology2.millisOfDay();
        java.lang.String str19 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology2.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology2.halfdayOfDay();
        java.util.TimeZone timeZone23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        org.joda.time.chrono.GJChronology gJChronology25 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone24);
        org.joda.time.DurationField durationField26 = gJChronology25.halfdays();
        long long30 = gJChronology25.add((long) 'a', (-1L), (int) (short) 0);
        long long34 = gJChronology25.add((long) (byte) 0, (long) '4', 100);
        org.joda.time.DurationField durationField35 = gJChronology25.years();
        org.joda.time.DateTimeField dateTimeField36 = gJChronology25.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone37 = gJChronology25.getZone();
        org.joda.time.Chronology chronology38 = gJChronology2.withZone(dateTimeZone37);
        org.joda.time.DurationField durationField39 = gJChronology2.days();
        org.joda.time.DurationField durationField40 = gJChronology2.years();
        org.joda.time.Chronology chronology41 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField42 = chronology41.months();
        boolean boolean43 = durationField42.isSupported();
        long long46 = durationField42.getMillis((int) 'a', 31556952000L);
        boolean boolean47 = durationField42.isPrecise();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-61827926399999L) + "'", long17 == (-61827926399999L));
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "GJChronology[UTC]" + "'", str19, "GJChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(gJChronology25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 97L + "'", long30 == 97L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 5200L + "'", long34 == 5200L);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(durationField39);
        org.junit.Assert.assertNotNull(durationField40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(durationField42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 255139200000L + "'", long46 == 255139200000L);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test23060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23060");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.millisOfSecond();
        org.joda.time.DurationField durationField4 = gJChronology2.millis();
        org.joda.time.DurationField durationField5 = gJChronology2.weeks();
        org.joda.time.DurationField durationField6 = gJChronology2.days();
        int int7 = gJChronology2.getMinimumDaysInFirstWeek();
        long long11 = gJChronology2.add(289240205200L, (long) (short) 1, 7200);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology2.secondOfMinute();
        org.joda.time.DurationField durationField14 = gJChronology2.millis();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 289240212400L + "'", long11 == 289240212400L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test23061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23061");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.weekyear();
        org.joda.time.DurationField durationField5 = gJChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.millisOfDay();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = gJChronology2.add(readablePeriod7, (long) '4', (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.hourOfHalfday();
        org.joda.time.DurationField durationField12 = gJChronology2.hours();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology2.year();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology2.dayOfYear();
        long long19 = gJChronology2.add((-64983772800051L), (-2558725110791859L), 0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-64983772800051L) + "'", long19 == (-64983772800051L));
    }

    @Test
    public void test23062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23062");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.lang.String str1 = locale0.getCountry();
        java.lang.String str2 = locale0.getDisplayName();
        java.util.Locale locale3 = java.util.Locale.CANADA;
        java.lang.String str4 = locale3.getDisplayVariant();
        java.lang.String str5 = locale0.getDisplayCountry(locale3);
        java.lang.String str6 = locale3.getCountry();
        boolean boolean7 = locale3.hasExtensions();
        java.lang.String str8 = locale3.getDisplayVariant();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = locale3.getExtension(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "German" + "'", str2, "German");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CA" + "'", str6, "CA");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test23063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23063");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        boolean boolean2 = instant1.isEqualNow();
        java.lang.String str3 = instant1.toString();
        org.joda.time.Instant instant5 = new org.joda.time.Instant(52L);
        boolean boolean6 = instant5.isEqualNow();
        java.lang.String str7 = instant5.toString();
        java.lang.String str8 = instant5.toString();
        org.joda.time.Instant instant11 = instant5.withDurationAdded(115200000L, (int) (short) 1);
        int int12 = instant1.compareTo((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Instant instant14 = new org.joda.time.Instant(52L);
        boolean boolean15 = instant14.isEqualNow();
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.Instant instant17 = instant14.plus(readableDuration16);
        boolean boolean19 = instant17.equals((java.lang.Object) ' ');
        boolean boolean20 = instant5.isAfter((org.joda.time.ReadableInstant) instant17);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.Instant instant22 = instant17.plus(readableDuration21);
        org.joda.time.MutableDateTime mutableDateTime23 = instant22.toMutableDateTime();
        boolean boolean24 = mutableDateTime23.isBeforeNow();
        org.joda.time.Instant instant25 = mutableDateTime23.toInstant();
        org.joda.time.Instant instant27 = instant25.minus((long) 100);
        org.joda.time.DateTime dateTime28 = instant27.toDateTimeISO();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str3, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str7, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str8, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(instant17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(instant22);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(instant25);
        org.junit.Assert.assertNotNull(instant27);
        org.junit.Assert.assertNotNull(dateTime28);
    }

    @Test
    public void test23064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23064");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.dayOfYear();
        java.lang.String str8 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.dayOfWeek();
        org.joda.time.DurationField durationField12 = gJChronology2.centuries();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1, 10);
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        long long19 = dateTimeZone15.getMillisKeepLocal(dateTimeZone17, 4320000000L);
        long long22 = dateTimeZone17.adjustOffset((-60479999900000L), true);
        org.joda.time.Chronology chronology23 = gJChronology2.withZone(dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone24 = chronology23.getZone();
        int int26 = dateTimeZone24.getStandardOffset((-62090467200000L));
        int int28 = dateTimeZone24.getOffset(3786834240000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GJChronology[UTC]" + "'", str8, "GJChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 4324200000L + "'", long19 == 4324200000L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-60479999900000L) + "'", long22 == (-60479999900000L));
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test23065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23065");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean9 = gJChronology2.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.clockhourOfDay();
        long long17 = gJChronology2.getDateTimeMillis(10, (int) (short) 10, 4, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField18 = gJChronology2.millisOfSecond();
        org.joda.time.DurationField durationField19 = gJChronology2.seconds();
        org.joda.time.ReadablePartial readablePartial20 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long22 = gJChronology2.set(readablePartial20, 21362416152L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-61827926399999L) + "'", long17 == (-61827926399999L));
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
    }

    @Test
    public void test23066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23066");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((-17295368605L));
    }

    @Test
    public void test23067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23067");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1, 10);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        long long15 = dateTimeZone11.getMillisKeepLocal(dateTimeZone13, 4320000000L);
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        java.lang.String str19 = dateTimeZone17.getNameKey((long) 100);
        boolean boolean20 = dateTimeZone17.isFixed();
        java.lang.String str21 = dateTimeZone17.toString();
        java.lang.String str22 = dateTimeZone17.getID();
        long long24 = dateTimeZone13.getMillisKeepLocal(dateTimeZone17, (long) (byte) -1);
        org.joda.time.Chronology chronology25 = gJChronology2.withZone(dateTimeZone17);
        org.joda.time.DurationField durationField26 = gJChronology2.halfdays();
        org.joda.time.Chronology chronology27 = gJChronology2.withUTC();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone30 = dateTimeZone29.toTimeZone();
        long long33 = dateTimeZone29.adjustOffset((long) 0, false);
        int int35 = dateTimeZone29.getOffsetFromLocal((-26438399999L));
        java.util.TimeZone timeZone36 = dateTimeZone29.toTimeZone();
        java.lang.String str38 = dateTimeZone29.getShortName((-53L));
        java.util.Locale locale40 = null;
        java.lang.String str41 = dateTimeZone29.getName((long) 1970, locale40);
        long long44 = dateTimeZone29.adjustOffset((-61352915L), false);
        java.util.Locale locale47 = java.util.Locale.forLanguageTag("zho");
        java.lang.String str48 = locale47.toLanguageTag();
        java.lang.String str49 = locale47.getDisplayVariant();
        java.lang.String str50 = dateTimeZone29.getShortName(262975270000L, locale47);
        org.joda.time.Chronology chronology51 = chronology27.withZone(dateTimeZone29);
        org.joda.time.chrono.GJChronology gJChronology52 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone29);
        org.joda.time.ReadablePartial readablePartial53 = null;
        int[] intArray54 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            gJChronology52.validate(readablePartial53, intArray54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4324200000L + "'", long15 == 4324200000L);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTC" + "'", str19, "UTC");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTC" + "'", str21, "UTC");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTC" + "'", str22, "UTC");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 52 + "'", int35 == 52);
        org.junit.Assert.assertNotNull(timeZone36);
        org.junit.Assert.assertEquals(timeZone36.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+00:00:00.052" + "'", str38, "+00:00:00.052");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+00:00:00.052" + "'", str41, "+00:00:00.052");
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-61352915L) + "'", long44 == (-61352915L));
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "zho");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "zho" + "'", str48, "zho");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "+00:00:00.052" + "'", str50, "+00:00:00.052");
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertNotNull(gJChronology52);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[]");
    }

    @Test
    public void test23068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23068");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 100);
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        long long9 = gJChronology5.add(43200100L, (long) ' ', 52);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology5.year();
        long long14 = gJChronology5.add(5185792L, 181440000000000L, 1582);
        java.lang.String str15 = gJChronology5.toString();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology5.millisOfDay();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology5.clockhourOfDay();
        org.joda.time.DurationField durationField18 = gJChronology5.weeks();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 43201764L + "'", long9 == 43201764L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 287038080005185792L + "'", long14 == 287038080005185792L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "GJChronology[UTC]" + "'", str15, "GJChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
    }

    @Test
    public void test23069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23069");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.removeUnicodeLocaleAttribute("und");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale locale6 = builder4.build();
        java.util.Locale locale7 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale8 = java.util.Locale.ENGLISH;
        java.lang.String str9 = locale7.getDisplayLanguage(locale8);
        java.util.Locale locale10 = java.util.Locale.CANADA;
        java.lang.String str11 = locale10.getISO3Language();
        java.lang.String str12 = locale7.getDisplayVariant(locale10);
        java.util.Set<java.lang.String> strSet13 = locale7.getUnicodeLocaleKeys();
        java.util.Locale locale17 = new java.util.Locale("zh", "en", "");
        java.lang.String str18 = locale7.getDisplayName(locale17);
        java.lang.String str19 = locale17.getVariant();
        java.lang.String str20 = locale6.getDisplayName(locale17);
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        org.joda.time.chrono.GJChronology gJChronology23 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone22);
        org.joda.time.DurationField durationField24 = gJChronology23.halfdays();
        long long28 = gJChronology23.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean30 = gJChronology23.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField31 = gJChronology23.dayOfMonth();
        org.joda.time.DurationField durationField32 = gJChronology23.days();
        org.joda.time.DateTimeZone dateTimeZone33 = gJChronology23.getZone();
        java.lang.String str34 = dateTimeZone33.toString();
        java.util.Locale locale36 = java.util.Locale.FRENCH;
        java.util.Locale locale37 = java.util.Locale.getDefault();
        boolean boolean38 = locale37.hasExtensions();
        java.lang.String str39 = locale36.getDisplayLanguage(locale37);
        boolean boolean40 = locale37.hasExtensions();
        java.lang.String str41 = dateTimeZone33.getName((-61827739199999L), locale37);
        java.util.Locale locale42 = java.util.Locale.TAIWAN;
        java.lang.String str43 = locale42.getVariant();
        java.lang.String str44 = locale42.getDisplayLanguage();
        java.lang.String str45 = locale37.getDisplayVariant(locale42);
        java.util.Locale locale46 = java.util.Locale.ROOT;
        java.util.Locale locale47 = java.util.Locale.GERMAN;
        java.lang.String str48 = locale47.getDisplayCountry();
        java.lang.String str49 = locale46.getDisplayLanguage(locale47);
        java.lang.String str50 = locale47.getCountry();
        java.lang.String str51 = locale42.getDisplayVariant(locale47);
        java.lang.String str52 = locale6.getDisplayScript(locale42);
        java.util.Locale locale53 = locale6.stripExtensions();
        java.util.Locale.Builder builder54 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder55 = builder54.clear();
        java.util.Locale.Builder builder57 = builder55.removeUnicodeLocaleAttribute("und");
        java.util.Locale locale58 = builder57.build();
        java.lang.String str59 = locale58.getDisplayName();
        java.util.Locale locale60 = java.util.Locale.FRENCH;
        java.util.Locale locale61 = java.util.Locale.getDefault();
        boolean boolean62 = locale61.hasExtensions();
        java.lang.String str63 = locale60.getDisplayLanguage(locale61);
        java.util.Set<java.lang.Character> charSet64 = locale60.getExtensionKeys();
        java.lang.String str65 = locale58.getDisplayVariant(locale60);
        java.util.Locale locale67 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str68 = locale67.toLanguageTag();
        java.lang.String str69 = locale67.getDisplayName();
        java.lang.String str70 = locale58.getDisplayVariant(locale67);
        java.lang.String str71 = locale58.toLanguageTag();
        java.util.Set<java.lang.String> strSet72 = locale58.getUnicodeLocaleAttributes();
        java.lang.String str73 = locale58.getDisplayLanguage();
        java.lang.String str74 = locale6.getDisplayCountry(locale58);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Chinese" + "'", str9, "Chinese");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "eng" + "'", str11, "eng");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_EN");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u4e2d\u6587\u53f0\u6e7e\u5730\u533a)" + "'", str18, "\u4e2d\u6587\u53f0\u6e7e\u5730\u533a)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(gJChronology23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 97L + "'", long28 == 97L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "UTC" + "'", str34, "UTC");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "fr");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "\u4e2d\u6587\u53f0\u7063)_ITALIAN");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "French" + "'", str39, "French");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+00:00" + "'", str41, "+00:00");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Chinese" + "'", str44, "Chinese");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "de");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "");
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "fr");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "\u4e2d\u6587\u53f0\u7063)_ITALIAN");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "French" + "'", str63, "French");
        org.junit.Assert.assertNotNull(charSet64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "und" + "'", str68, "und");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "und" + "'", str71, "und");
        org.junit.Assert.assertNotNull(strSet72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
    }

    @Test
    public void test23070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23070");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        boolean boolean2 = instant1.isEqualNow();
        java.lang.String str3 = instant1.toString();
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        org.joda.time.chrono.GJChronology gJChronology6 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone5);
        java.util.Locale locale8 = new java.util.Locale("hi!");
        java.lang.String str9 = locale8.getCountry();
        java.util.Locale locale10 = java.util.Locale.getDefault();
        java.lang.String str11 = locale10.getDisplayName();
        java.lang.String str12 = locale8.getDisplayScript(locale10);
        boolean boolean13 = dateTimeZone5.equals((java.lang.Object) locale10);
        int int15 = dateTimeZone5.getOffsetFromLocal((long) (short) 10);
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone17);
        org.joda.time.DateTimeField dateTimeField19 = gJChronology18.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology18.weekyearOfCentury();
        org.joda.time.Instant instant21 = gJChronology18.getGregorianCutover();
        org.joda.time.Instant instant23 = instant21.withMillis(0L);
        org.joda.time.Instant instant25 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        org.joda.time.chrono.GJChronology gJChronology28 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone27);
        org.joda.time.DateTimeField dateTimeField29 = gJChronology28.millisOfSecond();
        int int30 = instant25.get(dateTimeField29);
        org.joda.time.Instant instant32 = instant25.plus(0L);
        int int33 = instant23.compareTo((org.joda.time.ReadableInstant) instant32);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = null;
        boolean boolean35 = instant32.isSupported(dateTimeFieldType34);
        int int36 = dateTimeZone5.getOffset((org.joda.time.ReadableInstant) instant32);
        boolean boolean37 = instant1.isAfter((org.joda.time.ReadableInstant) instant32);
        org.joda.time.ReadableDuration readableDuration38 = null;
        org.joda.time.Instant instant40 = instant1.withDurationAdded(readableDuration38, 1);
        boolean boolean41 = instant40.isBeforeNow();
        org.joda.time.ReadableDuration readableDuration42 = null;
        org.joda.time.Instant instant43 = instant40.minus(readableDuration42);
        org.joda.time.DateTimeZone dateTimeZone44 = instant43.getZone();
        long long47 = dateTimeZone44.convertLocalToUTC((-17520001L), true);
        java.util.TimeZone timeZone48 = null;
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forTimeZone(timeZone48);
        org.joda.time.chrono.GJChronology gJChronology50 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone49);
        org.joda.time.DurationField durationField51 = gJChronology50.halfdays();
        long long55 = gJChronology50.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean57 = gJChronology50.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField58 = gJChronology50.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField59 = gJChronology50.halfdayOfDay();
        java.util.TimeZone timeZone60 = null;
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.forTimeZone(timeZone60);
        org.joda.time.chrono.GJChronology gJChronology62 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone61);
        org.joda.time.DurationField durationField63 = gJChronology62.halfdays();
        org.joda.time.DateTimeField dateTimeField64 = gJChronology62.millisOfDay();
        org.joda.time.DateTimeField dateTimeField65 = gJChronology62.minuteOfDay();
        org.joda.time.DurationField durationField66 = gJChronology62.centuries();
        org.joda.time.DateTimeField dateTimeField67 = gJChronology62.dayOfYear();
        java.lang.String str68 = gJChronology62.toString();
        org.joda.time.DateTimeField dateTimeField69 = gJChronology62.dayOfYear();
        org.joda.time.DateTimeField dateTimeField70 = gJChronology62.dayOfMonth();
        org.joda.time.DurationField durationField71 = gJChronology62.years();
        org.joda.time.DateTimeField dateTimeField72 = gJChronology62.minuteOfHour();
        org.joda.time.DurationField durationField73 = gJChronology62.halfdays();
        org.joda.time.DateTimeField dateTimeField74 = gJChronology62.yearOfCentury();
        java.util.TimeZone timeZone75 = null;
        org.joda.time.DateTimeZone dateTimeZone76 = org.joda.time.DateTimeZone.forTimeZone(timeZone75);
        org.joda.time.chrono.GJChronology gJChronology77 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone76);
        long long81 = dateTimeZone76.convertLocalToUTC((long) (byte) -1, true, 0L);
        boolean boolean83 = dateTimeZone76.equals((java.lang.Object) true);
        org.joda.time.chrono.GJChronology gJChronology84 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone76);
        org.joda.time.DateTimeField dateTimeField85 = gJChronology84.weekyear();
        org.joda.time.DateTimeField dateTimeField86 = gJChronology84.era();
        org.joda.time.DateTimeZone dateTimeZone87 = gJChronology84.getZone();
        org.joda.time.Chronology chronology88 = gJChronology62.withZone(dateTimeZone87);
        org.joda.time.Chronology chronology89 = gJChronology50.withZone(dateTimeZone87);
        long long91 = dateTimeZone44.getMillisKeepLocal(dateTimeZone87, (long) (-69));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str3, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(gJChronology6);
        org.junit.Assert.assertEquals(locale8.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "\u4e2d\u6587\u53f0\u7063)_ITALIAN");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u4e2d\u6587\u53f0\u7063) (ITALIAN)" + "'", str11, "\u4e2d\u6587\u53f0\u7063) (ITALIAN)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(gJChronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(instant21);
        org.junit.Assert.assertNotNull(instant23);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(gJChronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
        org.junit.Assert.assertNotNull(instant32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(instant40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(instant43);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-17520001L) + "'", long47 == (-17520001L));
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertNotNull(gJChronology50);
        org.junit.Assert.assertNotNull(durationField51);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 97L + "'", long55 == 97L);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(dateTimeField58);
        org.junit.Assert.assertNotNull(dateTimeField59);
        org.junit.Assert.assertNotNull(dateTimeZone61);
        org.junit.Assert.assertNotNull(gJChronology62);
        org.junit.Assert.assertNotNull(durationField63);
        org.junit.Assert.assertNotNull(dateTimeField64);
        org.junit.Assert.assertNotNull(dateTimeField65);
        org.junit.Assert.assertNotNull(durationField66);
        org.junit.Assert.assertNotNull(dateTimeField67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "GJChronology[UTC]" + "'", str68, "GJChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField69);
        org.junit.Assert.assertNotNull(dateTimeField70);
        org.junit.Assert.assertNotNull(durationField71);
        org.junit.Assert.assertNotNull(dateTimeField72);
        org.junit.Assert.assertNotNull(durationField73);
        org.junit.Assert.assertNotNull(dateTimeField74);
        org.junit.Assert.assertNotNull(dateTimeZone76);
        org.junit.Assert.assertNotNull(gJChronology77);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + (-1L) + "'", long81 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(gJChronology84);
        org.junit.Assert.assertNotNull(dateTimeField85);
        org.junit.Assert.assertNotNull(dateTimeField86);
        org.junit.Assert.assertNotNull(dateTimeZone87);
        org.junit.Assert.assertNotNull(chronology88);
        org.junit.Assert.assertNotNull(chronology89);
        org.junit.Assert.assertTrue("'" + long91 + "' != '" + (-69L) + "'", long91 == (-69L));
    }

    @Test
    public void test23071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23071");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant1 = org.joda.time.Instant.parse("\u65e5\u6587");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"??\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test23072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23072");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.millisOfSecond();
        org.joda.time.DurationField durationField4 = gJChronology2.millis();
        org.joda.time.DurationField durationField5 = gJChronology2.weekyears();
        long long8 = durationField5.subtract((-61827926399999L), 100);
        long long11 = durationField5.add((long) 'x', 4);
        long long14 = durationField5.getValueAsLong(600393600000L, (-373248000000000000L));
        long long17 = durationField5.add(87748L, (-99137));
        int int19 = durationField5.getValue((long) 118277);
        long long22 = durationField5.getValueAsLong(28800000L, (-1000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-64983772799999L) + "'", long8 == (-64983772799999L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 126403200120L + "'", long11 == 126403200120L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 19L + "'", long14 == 19L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-3128493110312252L) + "'", long17 == (-3128493110312252L));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test23073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23073");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.Chronology chronology4 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField5 = chronology4.years();
        org.joda.time.DateTimeField dateTimeField6 = chronology4.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = chronology4.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField8 = chronology4.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = chronology4.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField10 = chronology4.yearOfEra();
        org.joda.time.DurationField durationField11 = chronology4.weekyears();
        org.joda.time.DurationFieldType durationFieldType12 = durationField11.getType();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationFieldType12);
    }

    @Test
    public void test23074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23074");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.setVariant("halfdays");
        java.util.Locale.Builder builder6 = builder0.setScript("");
        java.util.Locale.Builder builder7 = builder0.clearExtensions();
        java.util.Locale.Builder builder9 = builder7.setLanguageTag("eng");
        java.util.Locale locale10 = builder7.build();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "eng");
    }

    @Test
    public void test23075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23075");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        long long11 = gJChronology2.add((long) (byte) 0, (long) '4', 100);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology2.year();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology2.era();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology2.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology2.millisOfDay();
        long long20 = gJChronology2.add((-60479999900L), 115200000L, 1155627);
        org.joda.time.DateTimeField dateTimeField21 = gJChronology2.dayOfWeek();
        org.joda.time.Chronology chronology22 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField23 = gJChronology2.minutes();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5200L + "'", long11 == 5200L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 133067750400100L + "'", long20 == 133067750400100L);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(durationField23);
    }

    @Test
    public void test23076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23076");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        long long11 = gJChronology2.add((long) (byte) 0, (long) '4', 100);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology2.year();
        org.joda.time.DurationField durationField14 = gJChronology2.centuries();
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        org.joda.time.chrono.GJChronology gJChronology17 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone16);
        long long21 = dateTimeZone16.convertLocalToUTC((long) (byte) -1, true, 0L);
        boolean boolean23 = dateTimeZone16.equals((java.lang.Object) true);
        long long25 = dateTimeZone16.nextTransition((long) '4');
        java.lang.String str27 = dateTimeZone16.getShortName(432000001L);
        java.util.TimeZone timeZone28 = dateTimeZone16.toTimeZone();
        org.joda.time.Chronology chronology29 = gJChronology2.withZone(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField30 = gJChronology2.hourOfHalfday();
        org.joda.time.DurationField durationField31 = gJChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField32 = gJChronology2.hourOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5200L + "'", long11 == 5200L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(gJChronology17);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 52L + "'", long25 == 52L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00" + "'", str27, "+00:00");
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
    }

    @Test
    public void test23077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23077");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.hourOfHalfday();
        int int7 = gJChronology2.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeZone dateTimeZone8 = gJChronology2.getZone();
        boolean boolean10 = dateTimeZone8.isStandardOffset(1555189977600000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test23078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23078");
        java.util.Locale locale2 = new java.util.Locale("UTC", "zh_TW");
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        boolean boolean4 = locale3.hasExtensions();
        java.util.Locale.setDefault(locale3);
        java.lang.String str6 = locale2.getDisplayLanguage(locale3);
        boolean boolean7 = locale2.hasExtensions();
        java.lang.Object obj8 = locale2.clone();
        org.junit.Assert.assertEquals(locale2.toString(), "utc_ZH_TW");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "utc" + "'", str6, "utc");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "utc_ZH_TW");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "utc_ZH_TW");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "utc_ZH_TW");
    }

    @Test
    public void test23079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23079");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.dayOfYear();
        java.lang.String str8 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone10 = gJChronology2.getZone();
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12);
        java.util.Locale locale15 = new java.util.Locale("hi!");
        java.lang.String str16 = locale15.getCountry();
        java.util.Locale locale17 = java.util.Locale.getDefault();
        java.lang.String str18 = locale17.getDisplayName();
        java.lang.String str19 = locale15.getDisplayScript(locale17);
        boolean boolean20 = dateTimeZone12.equals((java.lang.Object) locale17);
        org.joda.time.Chronology chronology21 = gJChronology2.withZone(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis(1582);
        long long25 = dateTimeZone12.getMillisKeepLocal(dateTimeZone23, 3600000L);
        long long27 = dateTimeZone12.nextTransition(4156171L);
        int int29 = dateTimeZone12.getOffsetFromLocal((-290299507272963L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GJChronology[UTC]" + "'", str8, "GJChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(gJChronology13);
        org.junit.Assert.assertEquals(locale15.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u4e2d\u6587" + "'", str18, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 3598418L + "'", long25 == 3598418L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 4156171L + "'", long27 == 4156171L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test23080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23080");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        long long6 = dateTimeZone1.convertLocalToUTC((long) (byte) -1, true, 0L);
        boolean boolean8 = dateTimeZone1.equals((java.lang.Object) true);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology9.weekyear();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology9.era();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology9.centuryOfEra();
        org.joda.time.Chronology chronology13 = gJChronology9.withUTC();
        org.joda.time.DurationField durationField14 = gJChronology9.years();
        org.joda.time.DurationField durationField15 = gJChronology9.minutes();
        long long18 = durationField15.subtract(31556952000L, 3282249600000L);
        long long21 = durationField15.getMillis((long) (-75428), (-1916L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(gJChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-196934944443048000L) + "'", long18 == (-196934944443048000L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-4525680000L) + "'", long21 == (-4525680000L));
    }

    @Test
    public void test23081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23081");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        boolean boolean1 = locale0.hasExtensions();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.lang.String str3 = locale0.getLanguage();
        java.util.Locale.Builder builder4 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder7 = builder5.removeUnicodeLocaleAttribute("und");
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        java.util.Locale locale9 = builder8.build();
        java.lang.String str10 = locale0.getDisplayVariant(locale9);
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str13 = locale12.toLanguageTag();
        java.util.Set<java.lang.String> strSet14 = locale12.getUnicodeLocaleKeys();
        java.util.Locale locale15 = java.util.Locale.ITALIAN;
        java.lang.String str16 = locale15.getCountry();
        java.util.Locale locale17 = java.util.Locale.UK;
        java.lang.String str18 = locale17.getDisplayCountry();
        java.util.Set<java.lang.Character> charSet19 = locale17.getExtensionKeys();
        java.util.Locale locale20 = locale17.stripExtensions();
        java.lang.String str21 = locale15.getDisplayVariant(locale20);
        java.lang.String str22 = locale20.getScript();
        java.lang.String str23 = locale12.getDisplayLanguage(locale20);
        java.lang.String str24 = locale0.getDisplayScript(locale12);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ja" + "'", str3, "ja");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "und" + "'", str13, "und");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "it");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u82f1\u56fd" + "'", str18, "\u82f1\u56fd");
        org.junit.Assert.assertNotNull(charSet19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test23082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23082");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        long long11 = gJChronology2.add((long) (byte) 0, (long) '4', 100);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology2.year();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology2.era();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology2.minuteOfHour();
        org.joda.time.Instant instant16 = gJChronology2.getGregorianCutover();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology2.era();
        org.joda.time.Instant instant18 = gJChronology2.getGregorianCutover();
        long long22 = gJChronology2.add((-61827926473049L), 683127600L, 27);
        org.joda.time.DateTimeField dateTimeField23 = gJChronology2.monthOfYear();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5200L + "'", long11 == 5200L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(instant18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-61809482027849L) + "'", long22 == (-61809482027849L));
        org.junit.Assert.assertNotNull(dateTimeField23);
    }

    @Test
    public void test23083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23083");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.era();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.centuryOfEra();
        org.joda.time.DurationField durationField5 = gJChronology2.hours();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.dayOfWeek();
        org.joda.time.Chronology chronology8 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField9 = gJChronology2.years();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test23084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23084");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) '#');
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology4.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology4.weekyearOfCentury();
        org.joda.time.Instant instant7 = gJChronology4.getGregorianCutover();
        boolean boolean8 = instant1.equals((java.lang.Object) gJChronology4);
        org.joda.time.DateTimeField dateTimeField9 = gJChronology4.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology4.weekOfWeekyear();
        java.lang.String str11 = gJChronology4.toString();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = gJChronology4.add(readablePeriod12, (-61827926999999L), 2100000);
        org.joda.time.DurationField durationField16 = gJChronology4.seconds();
        long long19 = durationField16.getValueAsLong((-608750L), 615600000000L);
        boolean boolean20 = durationField16.isPrecise();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(gJChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "GJChronology[UTC]" + "'", str11, "GJChronology[UTC]");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-61827926999999L) + "'", long15 == (-61827926999999L));
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-608L) + "'", long19 == (-608L));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test23085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23085");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        boolean boolean2 = instant1.isEqualNow();
        java.lang.String str3 = instant1.toString();
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        org.joda.time.chrono.GJChronology gJChronology6 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone5);
        java.util.Locale locale8 = new java.util.Locale("hi!");
        java.lang.String str9 = locale8.getCountry();
        java.util.Locale locale10 = java.util.Locale.getDefault();
        java.lang.String str11 = locale10.getDisplayName();
        java.lang.String str12 = locale8.getDisplayScript(locale10);
        boolean boolean13 = dateTimeZone5.equals((java.lang.Object) locale10);
        int int15 = dateTimeZone5.getOffsetFromLocal((long) (short) 10);
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone17);
        org.joda.time.DateTimeField dateTimeField19 = gJChronology18.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology18.weekyearOfCentury();
        org.joda.time.Instant instant21 = gJChronology18.getGregorianCutover();
        org.joda.time.Instant instant23 = instant21.withMillis(0L);
        org.joda.time.Instant instant25 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        org.joda.time.chrono.GJChronology gJChronology28 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone27);
        org.joda.time.DateTimeField dateTimeField29 = gJChronology28.millisOfSecond();
        int int30 = instant25.get(dateTimeField29);
        org.joda.time.Instant instant32 = instant25.plus(0L);
        int int33 = instant23.compareTo((org.joda.time.ReadableInstant) instant32);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = null;
        boolean boolean35 = instant32.isSupported(dateTimeFieldType34);
        int int36 = dateTimeZone5.getOffset((org.joda.time.ReadableInstant) instant32);
        boolean boolean37 = instant1.isAfter((org.joda.time.ReadableInstant) instant32);
        org.joda.time.ReadableDuration readableDuration38 = null;
        org.joda.time.Instant instant39 = instant1.minus(readableDuration38);
        java.util.TimeZone timeZone40 = null;
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forTimeZone(timeZone40);
        org.joda.time.chrono.GJChronology gJChronology42 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone41);
        org.joda.time.DurationField durationField43 = gJChronology42.halfdays();
        long long47 = gJChronology42.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean49 = gJChronology42.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField50 = gJChronology42.dayOfMonth();
        org.joda.time.DurationField durationField51 = gJChronology42.days();
        org.joda.time.DurationField durationField52 = gJChronology42.seconds();
        java.util.TimeZone timeZone53 = null;
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forTimeZone(timeZone53);
        int int56 = dateTimeZone54.getOffsetFromLocal((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (short) 10);
        long long61 = dateTimeZone54.getMillisKeepLocal(dateTimeZone59, (-61827926399999L));
        java.util.Locale locale63 = new java.util.Locale("hi!");
        boolean boolean64 = dateTimeZone54.equals((java.lang.Object) locale63);
        org.joda.time.Chronology chronology65 = gJChronology42.withZone(dateTimeZone54);
        org.joda.time.Instant instant66 = gJChronology42.getGregorianCutover();
        org.joda.time.Instant instant67 = instant66.toInstant();
        boolean boolean68 = instant1.isAfter((org.joda.time.ReadableInstant) instant67);
        java.util.TimeZone timeZone69 = null;
        org.joda.time.DateTimeZone dateTimeZone70 = org.joda.time.DateTimeZone.forTimeZone(timeZone69);
        org.joda.time.chrono.GJChronology gJChronology71 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone70);
        org.joda.time.DateTimeField dateTimeField72 = gJChronology71.era();
        org.joda.time.DateTimeField dateTimeField73 = gJChronology71.centuryOfEra();
        org.joda.time.DurationField durationField74 = gJChronology71.hours();
        org.joda.time.DateTimeField dateTimeField75 = gJChronology71.monthOfYear();
        org.joda.time.DurationField durationField76 = gJChronology71.weekyears();
        org.joda.time.DateTimeField dateTimeField77 = gJChronology71.halfdayOfDay();
        boolean boolean78 = instant67.equals((java.lang.Object) dateTimeField77);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str3, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(gJChronology6);
        org.junit.Assert.assertEquals(locale8.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u4e2d\u6587" + "'", str11, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(gJChronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(instant21);
        org.junit.Assert.assertNotNull(instant23);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(gJChronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
        org.junit.Assert.assertNotNull(instant32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(instant39);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertNotNull(gJChronology42);
        org.junit.Assert.assertNotNull(durationField43);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 97L + "'", long47 == 97L);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(durationField51);
        org.junit.Assert.assertNotNull(durationField52);
        org.junit.Assert.assertNotNull(dateTimeZone54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone59);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + (-61827926999999L) + "'", long61 == (-61827926999999L));
        org.junit.Assert.assertEquals(locale63.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(chronology65);
        org.junit.Assert.assertNotNull(instant66);
        org.junit.Assert.assertNotNull(instant67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(dateTimeZone70);
        org.junit.Assert.assertNotNull(gJChronology71);
        org.junit.Assert.assertNotNull(dateTimeField72);
        org.junit.Assert.assertNotNull(dateTimeField73);
        org.junit.Assert.assertNotNull(durationField74);
        org.junit.Assert.assertNotNull(dateTimeField75);
        org.junit.Assert.assertNotNull(durationField76);
        org.junit.Assert.assertNotNull(dateTimeField77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test23086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23086");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1, 10);
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        long long6 = dateTimeZone2.getMillisKeepLocal(dateTimeZone4, 4320000000L);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.lang.String str10 = dateTimeZone8.getNameKey((long) 100);
        boolean boolean11 = dateTimeZone8.isFixed();
        java.lang.String str12 = dateTimeZone8.toString();
        java.lang.String str13 = dateTimeZone8.getID();
        long long15 = dateTimeZone4.getMillisKeepLocal(dateTimeZone8, (long) (byte) -1);
        java.util.Locale locale17 = java.util.Locale.getDefault();
        boolean boolean18 = locale17.hasExtensions();
        java.lang.String str19 = dateTimeZone8.getName((-99L), locale17);
        java.lang.String str20 = dateTimeZone8.getID();
        org.joda.time.Instant instant22 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        org.joda.time.chrono.GJChronology gJChronology25 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone24);
        org.joda.time.DateTimeField dateTimeField26 = gJChronology25.millisOfSecond();
        int int27 = instant22.get(dateTimeField26);
        boolean boolean28 = instant22.isEqualNow();
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.Instant instant31 = instant22.withDurationAdded(readableDuration29, (int) (short) 0);
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.Instant instant33 = instant22.plus(readableDuration32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = null;
        java.lang.String str35 = instant22.toString(dateTimeFormatter34);
        org.joda.time.Instant instant38 = instant22.withDurationAdded((long) (byte) 1, 0);
        org.joda.time.chrono.GJChronology gJChronology39 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8, (org.joda.time.ReadableInstant) instant38);
        java.lang.String str40 = gJChronology39.toString();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4324200000L + "'", long6 == 4324200000L);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTC" + "'", str20, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(gJChronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(instant31);
        org.junit.Assert.assertNotNull(instant33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str35, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertNotNull(instant38);
        org.junit.Assert.assertNotNull(gJChronology39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "GJChronology[UTC,cutover=1970-01-01T00:00:00.052Z]" + "'", str40, "GJChronology[UTC,cutover=1970-01-01T00:00:00.052Z]");
    }

    @Test
    public void test23087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23087");
        org.joda.time.Instant instant1 = org.joda.time.Instant.parse("3929-04-02T00:00:00.051Z");
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        boolean boolean4 = instant1.isEqual((long) 18984);
        org.joda.time.Instant instant5 = instant1.toInstant();
        org.joda.time.Chronology chronology6 = instant1.getChronology();
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertNotNull(chronology6);
    }

    @Test
    public void test23088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23088");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean9 = gJChronology2.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.clockhourOfDay();
        long long17 = gJChronology2.getDateTimeMillis(10, (int) (short) 10, 4, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField18 = gJChronology2.millisOfDay();
        java.lang.String str19 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology2.dayOfYear();
        org.joda.time.DurationField durationField21 = gJChronology2.days();
        org.joda.time.DurationField durationField22 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology2.clockhourOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-61827926399999L) + "'", long17 == (-61827926399999L));
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "GJChronology[UTC]" + "'", str19, "GJChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
    }

    @Test
    public void test23089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23089");
        java.util.Locale locale2 = new java.util.Locale("cinese (Taiwan)", "DurationField[weekyears]");
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str5 = locale4.toLanguageTag();
        java.lang.String str6 = locale4.getCountry();
        java.util.Locale locale7 = java.util.Locale.ROOT;
        java.util.Locale locale8 = java.util.Locale.GERMAN;
        java.lang.String str9 = locale8.getDisplayCountry();
        java.lang.String str10 = locale7.getDisplayLanguage(locale8);
        java.lang.String str11 = locale4.getDisplayVariant(locale7);
        java.lang.String str12 = locale2.getDisplayVariant(locale4);
        java.lang.String str13 = locale2.getDisplayScript();
        java.lang.String str14 = locale2.toLanguageTag();
        java.lang.String str15 = locale2.getCountry();
        org.junit.Assert.assertEquals(locale2.toString(), "cinese (taiwan)_DURATIONFIELD[WEEKYEARS]");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "und" + "'", str5, "und");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "de");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "und" + "'", str14, "und");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "DURATIONFIELD[WEEKYEARS]" + "'", str15, "DURATIONFIELD[WEEKYEARS]");
    }

    @Test
    public void test23090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23090");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GJChronology gJChronology1 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = gJChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology1.minuteOfHour();
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.chrono.GJChronology gJChronology7 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone6);
        org.joda.time.DurationField durationField8 = gJChronology7.halfdays();
        long long12 = gJChronology7.add((long) 'a', (-1L), (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField13 = gJChronology7.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology7.year();
        org.joda.time.DurationField durationField15 = gJChronology7.millis();
        org.joda.time.DurationField durationField16 = gJChronology7.seconds();
        boolean boolean17 = gJChronology1.equals((java.lang.Object) gJChronology7);
        org.joda.time.DurationField durationField18 = gJChronology7.weekyears();
        org.junit.Assert.assertNotNull(gJChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(gJChronology7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(durationField18);
    }

    @Test
    public void test23091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23091");
        java.util.Locale locale2 = new java.util.Locale("Chinese", "+00:00:00.052");
        java.lang.String str3 = locale2.getDisplayCountry();
        java.util.Locale locale4 = locale2.stripExtensions();
        java.lang.String str5 = locale4.getLanguage();
        java.util.Set<java.lang.String> strSet6 = locale4.getUnicodeLocaleAttributes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = locale4.getUnicodeLocaleType("\u4e2d\u6587\u53f0\u6e7e\u5730\u533a)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ?? (????)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "chinese_+00:00:00.052");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00:00.052" + "'", str3, "+00:00:00.052");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "chinese_+00:00:00.052");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chinese" + "'", str5, "chinese");
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test23092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23092");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("2086-12-31T08:56:24.052Z");
        java.lang.String str2 = locale1.getCountry();
        java.util.Locale locale3 = java.util.Locale.FRENCH;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        boolean boolean5 = locale4.hasExtensions();
        java.lang.String str6 = locale3.getDisplayLanguage(locale4);
        java.util.Locale locale7 = java.util.Locale.ITALIAN;
        java.util.Locale locale8 = locale7.stripExtensions();
        java.lang.String str9 = locale4.getDisplayScript(locale7);
        java.lang.String str10 = locale1.getDisplayName(locale4);
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("inglese (Canada)");
        java.util.Set<java.lang.Character> charSet13 = locale12.getExtensionKeys();
        java.util.Locale.Builder builder14 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder15 = builder14.clear();
        java.util.Locale.Builder builder17 = builder15.removeUnicodeLocaleAttribute("und");
        java.util.Locale locale18 = builder17.build();
        java.util.Locale.Builder builder20 = builder17.setLanguage("inglese");
        java.util.Locale locale21 = builder20.build();
        java.util.Locale locale22 = java.util.Locale.CHINESE;
        boolean boolean23 = locale22.hasExtensions();
        java.lang.String str25 = locale22.getExtension('a');
        java.util.Set<java.lang.String> strSet26 = locale22.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder27 = builder20.setLocale(locale22);
        java.lang.String str29 = locale22.getExtension('a');
        java.lang.String str30 = locale12.getDisplayScript(locale22);
        java.lang.String str31 = locale22.getISO3Language();
        java.lang.String str32 = locale4.getDisplayLanguage(locale22);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u6cd5\u6587" + "'", str6, "\u6cd5\u6587");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(charSet13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "inglese");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "zho" + "'", str31, "zho");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\u4e2d\u6587" + "'", str32, "\u4e2d\u6587");
    }

    @Test
    public void test23093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23093");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.removeUnicodeLocaleAttribute("und");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale locale6 = builder4.build();
        java.util.Locale.Builder builder8 = builder4.setLanguageTag("en-US");
        java.util.Locale.Builder builder10 = builder4.addUnicodeLocaleAttribute("deu");
        java.util.Locale.Builder builder11 = builder10.clearExtensions();
        java.util.Locale.Builder builder12 = builder11.clear();
        java.util.Locale.Builder builder13 = builder12.clear();
        java.util.Locale locale14 = java.util.Locale.getDefault();
        boolean boolean15 = locale14.hasExtensions();
        java.lang.String str16 = locale14.getISO3Language();
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        org.joda.time.chrono.GJChronology gJChronology19 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField20 = gJChronology19.millisOfSecond();
        org.joda.time.DurationField durationField21 = gJChronology19.millis();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology19.hourOfHalfday();
        java.util.TimeZone timeZone23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        java.lang.String str26 = dateTimeZone24.getNameKey((long) 100);
        boolean boolean27 = dateTimeZone24.isFixed();
        org.joda.time.chrono.GJChronology gJChronology28 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone24);
        long long30 = dateTimeZone24.convertUTCToLocal(5200L);
        java.util.Locale.LanguageRange[] languageRangeArray31 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList32 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList32, languageRangeArray31);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap34 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList35 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList32, strMap34);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap36 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList37 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList35, strMap36);
        java.util.Locale.LanguageRange[] languageRangeArray38 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList39 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList39, languageRangeArray38);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap41 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList42 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList39, strMap41);
        java.lang.String[] strArray46 = new java.lang.String[] { "English", "English", "hi!" };
        java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        java.util.List<java.lang.String> strList49 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList39, (java.util.Collection<java.lang.String>) strList47);
        java.util.Locale.FilteringMode filteringMode50 = null;
        java.util.List<java.lang.String> strList51 = java.util.Locale.filterTags(languageRangeList37, (java.util.Collection<java.lang.String>) strList47, filteringMode50);
        java.util.Locale.LanguageRange[] languageRangeArray52 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList53 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList53, languageRangeArray52);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap55 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList56 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList53, strMap55);
        java.util.Locale.LanguageRange[] languageRangeArray57 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList58 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList58, languageRangeArray57);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap60 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList61 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList58, strMap60);
        java.lang.String[] strArray65 = new java.lang.String[] { "English", "English", "hi!" };
        java.util.ArrayList<java.lang.String> strList66 = new java.util.ArrayList<java.lang.String>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList66, strArray65);
        java.util.List<java.lang.String> strList68 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList58, (java.util.Collection<java.lang.String>) strList66);
        java.util.List<java.lang.String> strList69 = java.util.Locale.filterTags(languageRangeList56, (java.util.Collection<java.lang.String>) strList68);
        java.util.List<java.lang.String> strList70 = java.util.Locale.filterTags(languageRangeList37, (java.util.Collection<java.lang.String>) strList69);
        java.util.Locale.LanguageRange[] languageRangeArray71 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList72 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList72, languageRangeArray71);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap74 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList75 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList72, strMap74);
        java.lang.String[] strArray79 = new java.lang.String[] { "English", "English", "hi!" };
        java.util.ArrayList<java.lang.String> strList80 = new java.util.ArrayList<java.lang.String>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList80, strArray79);
        java.util.List<java.lang.String> strList82 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList72, (java.util.Collection<java.lang.String>) strList80);
        java.util.List<java.lang.String> strList83 = java.util.Locale.filterTags(languageRangeList37, (java.util.Collection<java.lang.String>) strList82);
        boolean boolean84 = dateTimeZone24.equals((java.lang.Object) languageRangeList37);
        java.util.Locale locale86 = java.util.Locale.CANADA;
        java.lang.String str87 = locale86.getISO3Language();
        java.lang.String str88 = dateTimeZone24.getShortName((long) 'a', locale86);
        boolean boolean89 = gJChronology19.equals((java.lang.Object) locale86);
        java.util.Locale locale90 = java.util.Locale.CHINA;
        java.lang.String str91 = locale90.toLanguageTag();
        java.lang.String str92 = locale86.getDisplayVariant(locale90);
        java.lang.String str93 = locale14.getDisplayLanguage(locale90);
        boolean boolean94 = locale14.hasExtensions();
        java.util.Locale.Builder builder95 = builder13.setLocale(locale14);
        java.lang.String str96 = locale14.getDisplayVariant();
        java.lang.String str97 = locale14.getDisplayLanguage();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "zho" + "'", str16, "zho");
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(gJChronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "UTC" + "'", str26, "UTC");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(gJChronology28);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 5200L + "'", long30 == 5200L);
        org.junit.Assert.assertNotNull(languageRangeArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(languageRangeList35);
        org.junit.Assert.assertNotNull(languageRangeList37);
        org.junit.Assert.assertNotNull(languageRangeArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(languageRangeList42);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(strList49);
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertNotNull(languageRangeArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(languageRangeList56);
        org.junit.Assert.assertNotNull(languageRangeArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(languageRangeList61);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(strList68);
        org.junit.Assert.assertNotNull(strList69);
        org.junit.Assert.assertNotNull(strList70);
        org.junit.Assert.assertNotNull(languageRangeArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(languageRangeList75);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(strList82);
        org.junit.Assert.assertNotNull(strList83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(locale86);
        org.junit.Assert.assertEquals(locale86.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "eng" + "'", str87, "eng");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "+00:00" + "'", str88, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(locale90);
        org.junit.Assert.assertEquals(locale90.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "zh-CN" + "'", str91, "zh-CN");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "\u4e2d\u6587" + "'", str93, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(builder95);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "" + "'", str96, "");
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "\u4e2d\u6587" + "'", str97, "\u4e2d\u6587");
    }

    @Test
    public void test23094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23094");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.setVariant("halfdays");
        java.util.Locale.Builder builder6 = builder0.setScript("");
        java.util.Locale.Builder builder7 = builder0.clearExtensions();
        java.util.Locale.Builder builder9 = builder0.setRegion("CN");
        java.util.Locale.Builder builder10 = builder0.clear();
        java.util.Locale.Builder builder11 = builder0.clearExtensions();
        java.util.Locale.Builder builder12 = builder11.clear();
        java.util.Locale.Builder builder13 = builder12.clear();
        java.util.Locale.Builder builder14 = builder12.clear();
        java.util.Locale.Builder builder16 = builder14.setLanguage("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder19 = builder16.setUnicodeLocaleKeyword("UnsupportedDurationField[eras]", "972022-02-11t09:43:15.789z");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: UnsupportedDurationField[eras] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test23095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23095");
        java.util.Locale locale2 = new java.util.Locale("fr", "-01:52_CANADA");
        org.junit.Assert.assertEquals(locale2.toString(), "fr_-01:52_CANADA");
    }

    @Test
    public void test23096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23096");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.weekOfWeekyear();
        org.joda.time.Chronology chronology9 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.dayOfYear();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test23097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23097");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean9 = gJChronology2.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.clockhourOfDay();
        long long17 = gJChronology2.getDateTimeMillis(10, (int) (short) 10, 4, (int) (byte) 1);
        org.joda.time.Instant instant18 = gJChronology2.getGregorianCutover();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology2.yearOfEra();
        org.joda.time.DurationField durationField20 = gJChronology2.minutes();
        org.joda.time.DurationField durationField21 = gJChronology2.centuries();
        java.lang.String str22 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology2.weekyear();
        org.joda.time.DateTimeField dateTimeField24 = gJChronology2.dayOfMonth();
        org.joda.time.DurationField durationField25 = gJChronology2.years();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-61827926399999L) + "'", long17 == (-61827926399999L));
        org.junit.Assert.assertNotNull(instant18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "GJChronology[UTC]" + "'", str22, "GJChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(durationField25);
    }

    @Test
    public void test23098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23098");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(1577455689601869L);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTime();
        org.joda.time.Instant instant4 = instant1.plus(4599307521620L);
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(instant4);
    }

    @Test
    public void test23099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23099");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean9 = gJChronology2.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.dayOfMonth();
        org.joda.time.DurationField durationField11 = gJChronology2.seconds();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.weekOfWeekyear();
        org.joda.time.DurationField durationField13 = gJChronology2.days();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology2.dayOfMonth();
        org.joda.time.DurationField durationField15 = gJChronology2.years();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology2.yearOfEra();
        int int17 = gJChronology2.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology2.era();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test23100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23100");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("1582-10-15T00:00:00.052+00:00:00.052", (double) (-60479999300000L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-6.04799993E13");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test23101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23101");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.dayOfYear();
        java.lang.String str8 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.dayOfMonth();
        org.joda.time.DurationField durationField11 = gJChronology2.years();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.minuteOfHour();
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        org.joda.time.chrono.GJChronology gJChronology15 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone14);
        org.joda.time.DurationField durationField16 = gJChronology15.halfdays();
        long long20 = gJChronology15.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean22 = gJChronology15.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField23 = gJChronology15.dayOfMonth();
        org.joda.time.DurationField durationField24 = gJChronology15.days();
        long long28 = gJChronology15.add((long) '4', 432000000L, (int) (short) 0);
        org.joda.time.DurationField durationField29 = gJChronology15.years();
        java.util.TimeZone timeZone30 = null;
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forTimeZone(timeZone30);
        java.lang.String str33 = dateTimeZone31.getNameKey((long) 100);
        boolean boolean34 = dateTimeZone31.isFixed();
        java.lang.String str35 = dateTimeZone31.toString();
        boolean boolean37 = dateTimeZone31.isStandardOffset((long) (byte) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone31);
        org.joda.time.Chronology chronology39 = gJChronology15.withZone(dateTimeZone31);
        org.joda.time.Chronology chronology40 = gJChronology2.withZone(dateTimeZone31);
        org.joda.time.DateTimeField dateTimeField41 = gJChronology2.hourOfHalfday();
        org.joda.time.DurationField durationField42 = gJChronology2.weeks();
        org.joda.time.DateTimeField dateTimeField43 = gJChronology2.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField44 = gJChronology2.clockhourOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GJChronology[UTC]" + "'", str8, "GJChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(gJChronology15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 52L + "'", long28 == 52L);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "UTC" + "'", str33, "UTC");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "UTC" + "'", str35, "UTC");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(durationField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(dateTimeField44);
    }

    @Test
    public void test23102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23102");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.CANADA;
        java.lang.String str2 = locale1.getISO3Language();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("halfdays");
        boolean boolean6 = locale5.hasExtensions();
        java.util.Set<java.lang.Character> charSet7 = locale5.getExtensionKeys();
        java.util.Locale.setDefault(category0, locale5);
        java.util.Locale locale10 = new java.util.Locale("hi!");
        java.lang.String str11 = locale10.getCountry();
        java.util.Locale locale12 = java.util.Locale.getDefault();
        java.lang.String str13 = locale12.getDisplayName();
        java.lang.String str14 = locale10.getDisplayScript(locale12);
        java.util.Set<java.lang.Character> charSet15 = locale12.getExtensionKeys();
        java.util.Locale.setDefault(category0, locale12);
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        java.util.Locale locale20 = java.util.Locale.ENGLISH;
        java.lang.String str21 = dateTimeZone18.getShortName((-2246399965L), locale20);
        java.util.Locale.setDefault(category0, locale20);
        java.util.Set<java.lang.Character> charSet23 = locale20.getExtensionKeys();
        java.util.Locale.Category category24 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale25 = java.util.Locale.CANADA;
        java.lang.String str26 = locale25.getISO3Language();
        java.util.Locale.setDefault(category24, locale25);
        java.util.Locale locale28 = java.util.Locale.getDefault(category24);
        java.util.Locale locale29 = java.util.Locale.getDefault(category24);
        java.lang.String str30 = locale20.getDisplayCountry(locale29);
        java.lang.String str31 = locale29.getDisplayLanguage();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "eng" + "'", str2, "eng");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "halfdays");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charSet7);
        org.junit.Assert.assertEquals(locale10.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Chinese" + "'", str13, "Chinese");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charSet15);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00" + "'", str21, "+00:00");
        org.junit.Assert.assertNotNull(charSet23);
        org.junit.Assert.assertTrue("'" + category24 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category24.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "eng" + "'", str26, "eng");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "English" + "'", str31, "English");
    }

    @Test
    public void test23103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23103");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.millisOfSecond();
        org.joda.time.DurationField durationField4 = gJChronology2.millis();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = gJChronology2.add(readablePeriod5, (long) 'a', (int) '4');
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.dayOfWeek();
        java.lang.String str10 = gJChronology2.toString();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = gJChronology2.add(readablePeriod11, 1000L, 73050);
        org.joda.time.Chronology chronology15 = gJChronology2.withUTC();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "GJChronology[UTC]" + "'", str10, "GJChronology[UTC]");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1000L + "'", long14 == 1000L);
        org.junit.Assert.assertNotNull(chronology15);
    }

    @Test
    public void test23104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23104");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean9 = gJChronology2.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.millisOfDay();
        org.joda.time.DurationField durationField12 = gJChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology2.monthOfYear();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology2.yearOfEra();
        org.joda.time.DurationField durationField15 = gJChronology2.days();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test23105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23105");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.dayOfYear();
        java.lang.String str8 = gJChronology2.toString();
        org.joda.time.DurationField durationField9 = gJChronology2.years();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.clockhourOfHalfday();
        java.lang.String str12 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology2.hourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        long long17 = gJChronology2.add(readablePeriod14, (-760648578829200000L), (-92));
        org.joda.time.DurationField durationField18 = gJChronology2.days();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GJChronology[UTC]" + "'", str8, "GJChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "GJChronology[UTC]" + "'", str12, "GJChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-760648578829200000L) + "'", long17 == (-760648578829200000L));
        org.junit.Assert.assertNotNull(durationField18);
    }

    @Test
    public void test23106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23106");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean9 = gJChronology2.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.clockhourOfDay();
        long long17 = gJChronology2.getDateTimeMillis(10, (int) (short) 10, 4, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField18 = gJChronology2.millisOfDay();
        java.lang.String str19 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology2.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology2.minuteOfDay();
        org.joda.time.Chronology chronology23 = gJChronology2.withUTC();
        org.joda.time.Instant instant24 = gJChronology2.getGregorianCutover();
        org.joda.time.DateTime dateTime25 = instant24.toDateTime();
        java.util.TimeZone timeZone26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        org.joda.time.chrono.GJChronology gJChronology28 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone27);
        org.joda.time.DateTimeField dateTimeField29 = gJChronology28.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField30 = gJChronology28.weekyear();
        org.joda.time.DurationField durationField31 = gJChronology28.centuries();
        org.joda.time.DateTimeField dateTimeField32 = gJChronology28.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField33 = gJChronology28.era();
        org.joda.time.DurationField durationField34 = gJChronology28.weekyears();
        org.joda.time.DurationField durationField35 = gJChronology28.halfdays();
        boolean boolean36 = instant24.equals((java.lang.Object) gJChronology28);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-61827926399999L) + "'", long17 == (-61827926399999L));
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "GJChronology[UTC]" + "'", str19, "GJChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(gJChronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test23107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23107");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology4.millisOfSecond();
        int int6 = instant1.get(dateTimeField5);
        boolean boolean7 = instant1.isEqualNow();
        org.joda.time.Instant instant9 = new org.joda.time.Instant(52L);
        boolean boolean10 = instant9.isEqualNow();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Instant instant12 = instant9.plus(readableDuration11);
        long long13 = instant9.getMillis();
        java.lang.Object obj14 = null;
        boolean boolean15 = instant9.equals(obj14);
        org.joda.time.Instant instant17 = new org.joda.time.Instant(52L);
        boolean boolean18 = instant17.isEqualNow();
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.Instant instant20 = instant17.plus(readableDuration19);
        long long21 = instant17.getMillis();
        java.lang.String str22 = instant17.toString();
        org.joda.time.Instant instant23 = instant17.toInstant();
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.Instant instant26 = instant17.withDurationAdded(readableDuration24, (int) 'x');
        org.joda.time.Instant instant27 = instant17.toInstant();
        int int28 = instant9.compareTo((org.joda.time.ReadableInstant) instant17);
        boolean boolean29 = instant1.isBefore((org.joda.time.ReadableInstant) instant17);
        java.util.TimeZone timeZone30 = null;
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forTimeZone(timeZone30);
        org.joda.time.chrono.GJChronology gJChronology32 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone31);
        org.joda.time.DurationField durationField33 = gJChronology32.halfdays();
        long long37 = gJChronology32.add((long) 'a', (-1L), (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField38 = gJChronology32.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField39 = gJChronology32.secondOfMinute();
        org.joda.time.Instant instant41 = new org.joda.time.Instant(52L);
        boolean boolean42 = instant41.isEqualNow();
        org.joda.time.ReadableDuration readableDuration43 = null;
        org.joda.time.Instant instant44 = instant41.plus(readableDuration43);
        boolean boolean45 = gJChronology32.equals((java.lang.Object) instant41);
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = null;
        boolean boolean47 = instant41.isSupported(dateTimeFieldType46);
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = null;
        boolean boolean49 = instant41.isSupported(dateTimeFieldType48);
        java.lang.String str50 = instant41.toString();
        boolean boolean51 = instant1.isAfter((org.joda.time.ReadableInstant) instant41);
        java.util.TimeZone timeZone52 = null;
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forTimeZone(timeZone52);
        java.lang.String str55 = dateTimeZone53.getNameKey((long) 100);
        boolean boolean56 = dateTimeZone53.isFixed();
        org.joda.time.chrono.GJChronology gJChronology57 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone53);
        int int58 = gJChronology57.getMinimumDaysInFirstWeek();
        java.lang.String str59 = gJChronology57.toString();
        org.joda.time.DateTimeField dateTimeField60 = gJChronology57.yearOfEra();
        org.joda.time.DateTime dateTime61 = instant1.toDateTime((org.joda.time.Chronology) gJChronology57);
        boolean boolean62 = dateTime61.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone63 = dateTime61.getZone();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(gJChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 52L + "'", long13 == 52L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(instant20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 52L + "'", long21 == 52L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str22, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertNotNull(instant23);
        org.junit.Assert.assertNotNull(instant26);
        org.junit.Assert.assertNotNull(instant27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(gJChronology32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 97L + "'", long37 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(instant44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str50, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(dateTimeZone53);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "UTC" + "'", str55, "UTC");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(gJChronology57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 4 + "'", int58 == 4);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "GJChronology[UTC]" + "'", str59, "GJChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField60);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(dateTimeZone63);
    }

    @Test
    public void test23108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23108");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        org.joda.time.chrono.GJChronology gJChronology6 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone5);
        long long10 = dateTimeZone5.convertLocalToUTC((long) (byte) -1, true, 0L);
        boolean boolean12 = dateTimeZone5.equals((java.lang.Object) true);
        org.joda.time.Chronology chronology13 = gJChronology2.withZone(dateTimeZone5);
        java.lang.String str15 = dateTimeZone5.getName((long) (-5914428));
        long long17 = dateTimeZone5.previousTransition(171253440000000000L);
        long long19 = dateTimeZone5.nextTransition(5261760000L);
        boolean boolean21 = dateTimeZone5.isStandardOffset(1684488270937199880L);
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        org.joda.time.chrono.GJChronology gJChronology24 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField25 = gJChronology24.era();
        org.joda.time.DateTimeField dateTimeField26 = gJChronology24.centuryOfEra();
        org.joda.time.DurationField durationField27 = gJChronology24.hours();
        org.joda.time.DateTimeField dateTimeField28 = gJChronology24.weekyear();
        org.joda.time.DurationField durationField29 = gJChronology24.minutes();
        boolean boolean30 = dateTimeZone5.equals((java.lang.Object) durationField29);
        org.joda.time.Instant instant32 = new org.joda.time.Instant(52L);
        boolean boolean33 = instant32.isEqualNow();
        java.lang.String str34 = instant32.toString();
        java.util.TimeZone timeZone35 = null;
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forTimeZone(timeZone35);
        org.joda.time.chrono.GJChronology gJChronology37 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone36);
        java.util.Locale locale39 = new java.util.Locale("hi!");
        java.lang.String str40 = locale39.getCountry();
        java.util.Locale locale41 = java.util.Locale.getDefault();
        java.lang.String str42 = locale41.getDisplayName();
        java.lang.String str43 = locale39.getDisplayScript(locale41);
        boolean boolean44 = dateTimeZone36.equals((java.lang.Object) locale41);
        int int46 = dateTimeZone36.getOffsetFromLocal((long) (short) 10);
        java.util.TimeZone timeZone47 = null;
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forTimeZone(timeZone47);
        org.joda.time.chrono.GJChronology gJChronology49 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone48);
        org.joda.time.DateTimeField dateTimeField50 = gJChronology49.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField51 = gJChronology49.weekyearOfCentury();
        org.joda.time.Instant instant52 = gJChronology49.getGregorianCutover();
        org.joda.time.Instant instant54 = instant52.withMillis(0L);
        org.joda.time.Instant instant56 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone57 = null;
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forTimeZone(timeZone57);
        org.joda.time.chrono.GJChronology gJChronology59 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone58);
        org.joda.time.DateTimeField dateTimeField60 = gJChronology59.millisOfSecond();
        int int61 = instant56.get(dateTimeField60);
        org.joda.time.Instant instant63 = instant56.plus(0L);
        int int64 = instant54.compareTo((org.joda.time.ReadableInstant) instant63);
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = null;
        boolean boolean66 = instant63.isSupported(dateTimeFieldType65);
        int int67 = dateTimeZone36.getOffset((org.joda.time.ReadableInstant) instant63);
        boolean boolean68 = instant32.isAfter((org.joda.time.ReadableInstant) instant63);
        org.joda.time.DateTimeFieldType dateTimeFieldType69 = null;
        boolean boolean70 = instant32.isSupported(dateTimeFieldType69);
        org.joda.time.Chronology chronology71 = instant32.getChronology();
        java.util.TimeZone timeZone72 = null;
        org.joda.time.DateTimeZone dateTimeZone73 = org.joda.time.DateTimeZone.forTimeZone(timeZone72);
        org.joda.time.chrono.GJChronology gJChronology74 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone73);
        org.joda.time.DurationField durationField75 = gJChronology74.halfdays();
        long long79 = gJChronology74.add((long) 'a', (-1L), (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField80 = gJChronology74.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField81 = gJChronology74.secondOfMinute();
        org.joda.time.Instant instant83 = new org.joda.time.Instant(52L);
        boolean boolean84 = instant83.isEqualNow();
        org.joda.time.ReadableDuration readableDuration85 = null;
        org.joda.time.Instant instant86 = instant83.plus(readableDuration85);
        boolean boolean87 = gJChronology74.equals((java.lang.Object) instant83);
        org.joda.time.DateTimeFieldType dateTimeFieldType88 = null;
        boolean boolean89 = instant83.isSupported(dateTimeFieldType88);
        org.joda.time.DateTimeFieldType dateTimeFieldType90 = null;
        boolean boolean91 = instant83.isSupported(dateTimeFieldType90);
        org.joda.time.DateTimeZone dateTimeZone92 = instant83.getZone();
        org.joda.time.Instant instant94 = instant83.plus((long) 'a');
        org.joda.time.ReadableDuration readableDuration95 = null;
        org.joda.time.Instant instant96 = instant83.minus(readableDuration95);
        int int97 = instant32.compareTo((org.joda.time.ReadableInstant) instant96);
        int int98 = dateTimeZone5.getOffset((org.joda.time.ReadableInstant) instant96);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(gJChronology6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 171253440000000000L + "'", long17 == 171253440000000000L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 5261760000L + "'", long19 == 5261760000L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(gJChronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str34, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(gJChronology37);
        org.junit.Assert.assertEquals(locale39.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Chinese" + "'", str42, "Chinese");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertNotNull(gJChronology49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(instant52);
        org.junit.Assert.assertNotNull(instant54);
        org.junit.Assert.assertNotNull(dateTimeZone58);
        org.junit.Assert.assertNotNull(gJChronology59);
        org.junit.Assert.assertNotNull(dateTimeField60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 52 + "'", int61 == 52);
        org.junit.Assert.assertNotNull(instant63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(chronology71);
        org.junit.Assert.assertNotNull(dateTimeZone73);
        org.junit.Assert.assertNotNull(gJChronology74);
        org.junit.Assert.assertNotNull(durationField75);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 97L + "'", long79 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField80);
        org.junit.Assert.assertNotNull(dateTimeField81);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(instant86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(dateTimeZone92);
        org.junit.Assert.assertNotNull(instant94);
        org.junit.Assert.assertNotNull(instant96);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 0 + "'", int97 == 0);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 0 + "'", int98 == 0);
    }

    @Test
    public void test23109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23109");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.setVariant("halfdays");
        java.util.Locale.Builder builder6 = builder0.setScript("");
        java.util.Locale.Builder builder8 = builder6.removeUnicodeLocaleAttribute("seconds");
        java.util.Locale.Builder builder9 = builder8.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder8.setLanguage("en_GB");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: en_GB [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test23110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23110");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.era();
        org.joda.time.Chronology chronology12 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology2.weekOfWeekyear();
        org.joda.time.Instant instant14 = gJChronology2.getGregorianCutover();
        org.joda.time.DurationField durationField15 = gJChronology2.hours();
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone17);
        org.joda.time.DurationField durationField19 = gJChronology18.halfdays();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology18.millisOfDay();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology18.minuteOfDay();
        org.joda.time.DurationField durationField22 = gJChronology18.centuries();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology18.yearOfCentury();
        org.joda.time.Chronology chronology24 = gJChronology18.withUTC();
        org.joda.time.DateTimeZone dateTimeZone25 = gJChronology18.getZone();
        int int27 = dateTimeZone25.getOffset((long) 73050);
        java.lang.String str29 = dateTimeZone25.getShortName((long) (byte) 1);
        boolean boolean31 = dateTimeZone25.isStandardOffset(28800104L);
        org.joda.time.Chronology chronology32 = gJChronology2.withZone(dateTimeZone25);
        // The following exception was thrown during execution in test generation
        try {
            long long40 = chronology32.getDateTimeMillis((-313), 0, 492, 22, 102, 521345, 33000052);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 102 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(gJChronology18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00" + "'", str29, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(chronology32);
    }

    @Test
    public void test23111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23111");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.millisOfSecond();
        org.joda.time.DurationField durationField6 = gJChronology2.days();
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.lang.String str10 = dateTimeZone8.getNameKey((long) 100);
        boolean boolean11 = dateTimeZone8.isFixed();
        java.util.Locale locale15 = new java.util.Locale("DurationField[halfdays]", "\u82f1\u6587");
        java.lang.String str16 = dateTimeZone8.getName((long) (short) 10, locale15);
        java.lang.String str18 = dateTimeZone8.getNameKey(17296800000L);
        org.joda.time.Chronology chronology19 = gJChronology2.withZone(dateTimeZone8);
        java.lang.String str20 = gJChronology2.toString();
        org.joda.time.DurationField durationField21 = gJChronology2.hours();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology2.centuryOfEra();
        java.util.TimeZone timeZone24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        org.joda.time.chrono.GJChronology gJChronology26 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone25);
        org.joda.time.DurationField durationField27 = gJChronology26.halfdays();
        long long31 = gJChronology26.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean33 = gJChronology26.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField34 = gJChronology26.dayOfMonth();
        org.joda.time.DurationField durationField35 = gJChronology26.millis();
        org.joda.time.DateTimeField dateTimeField36 = gJChronology26.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone37 = gJChronology26.getZone();
        int int39 = dateTimeZone37.getStandardOffset((long) 0);
        org.joda.time.Chronology chronology40 = gJChronology2.withZone(dateTimeZone37);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky:         org.junit.Assert.assertEquals(locale15.toString(), "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTC" + "'", str18, "UTC");
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "GJChronology[UTC]" + "'", str20, "GJChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(gJChronology26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 97L + "'", long31 == 97L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(chronology40);
    }

    @Test
    public void test23112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23112");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.removeUnicodeLocaleAttribute("und");
        java.util.Locale locale4 = java.util.Locale.CHINESE;
        boolean boolean5 = locale4.hasExtensions();
        java.util.Locale.Builder builder6 = builder1.setLocale(locale4);
        java.util.Locale.Builder builder8 = builder6.removeUnicodeLocaleAttribute("months");
        java.util.Locale.Builder builder9 = builder8.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.setLanguageTag("cn (ENGLISH (UNITED STATES))");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: cn (ENGLISH (UNITED STATES)) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test23113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23113");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 100);
        boolean boolean4 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.chrono.GJChronology gJChronology7 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone6);
        org.joda.time.DurationField durationField8 = gJChronology7.halfdays();
        long long12 = gJChronology7.add((long) 'a', (-1L), (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField13 = gJChronology7.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology7.secondOfMinute();
        org.joda.time.Instant instant16 = new org.joda.time.Instant(52L);
        boolean boolean17 = instant16.isEqualNow();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Instant instant19 = instant16.plus(readableDuration18);
        boolean boolean20 = gJChronology7.equals((java.lang.Object) instant16);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = null;
        boolean boolean22 = instant16.isSupported(dateTimeFieldType21);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = null;
        boolean boolean24 = instant16.isSupported(dateTimeFieldType23);
        org.joda.time.DateTimeZone dateTimeZone25 = instant16.getZone();
        int int26 = dateTimeZone1.getOffset((org.joda.time.ReadableInstant) instant16);
        java.util.TimeZone timeZone27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        java.lang.String str30 = dateTimeZone28.getNameKey((long) 100);
        boolean boolean31 = dateTimeZone28.isFixed();
        org.joda.time.Instant instant33 = new org.joda.time.Instant(52L);
        boolean boolean34 = instant33.isEqualNow();
        java.lang.String str35 = instant33.toString();
        java.lang.String str36 = instant33.toString();
        org.joda.time.Instant instant39 = instant33.withDurationAdded(115200000L, (int) (short) 1);
        java.util.TimeZone timeZone40 = null;
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forTimeZone(timeZone40);
        java.lang.String str43 = dateTimeZone41.getNameKey((long) 100);
        boolean boolean44 = dateTimeZone41.isFixed();
        org.joda.time.DateTime dateTime45 = instant33.toDateTime(dateTimeZone41);
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = null;
        boolean boolean47 = instant33.isSupported(dateTimeFieldType46);
        int int48 = dateTimeZone28.getOffset((org.joda.time.ReadableInstant) instant33);
        long long50 = dateTimeZone1.getMillisKeepLocal(dateTimeZone28, 86400000L);
        boolean boolean51 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(gJChronology7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(instant19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "UTC" + "'", str30, "UTC");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str35, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str36, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertNotNull(instant39);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "UTC" + "'", str43, "UTC");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 86400000L + "'", long50 == 86400000L);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test23114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23114");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.era();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.weekyear();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.clockhourOfDay();
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = gJChronology10.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology10.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology10.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology10.hourOfHalfday();
        int int15 = gJChronology10.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeZone dateTimeZone16 = gJChronology10.getZone();
        java.lang.String str17 = dateTimeZone16.getID();
        org.joda.time.Chronology chronology18 = gJChronology2.withZone(dateTimeZone16);
        java.util.Locale locale20 = java.util.Locale.ENGLISH;
        java.lang.String str22 = locale20.getUnicodeLocaleType("zh");
        java.lang.String str23 = dateTimeZone16.getShortName(2099520004860000L, locale20);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(gJChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00" + "'", str23, "+00:00");
    }

    @Test
    public void test23115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23115");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant1 = org.joda.time.Instant.parse("+00:00:00.120 (+00:00:00.120)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+00:00:00.120 (+00:00:00.120)\" is malformed at \":00:00.120 (+00:00:00.120)\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test23116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23116");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getCountry();
        java.util.Locale locale6 = java.util.Locale.getDefault();
        java.lang.String str7 = locale6.getDisplayName();
        java.lang.String str8 = locale4.getDisplayScript(locale6);
        boolean boolean9 = dateTimeZone1.equals((java.lang.Object) locale6);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone12 = dateTimeZone11.toTimeZone();
        long long15 = dateTimeZone11.adjustOffset((long) 0, false);
        int int17 = dateTimeZone11.getOffsetFromLocal((-26438399999L));
        long long19 = dateTimeZone1.getMillisKeepLocal(dateTimeZone11, (long) (byte) 10);
        org.joda.time.chrono.GJChronology gJChronology20 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11);
        org.joda.time.DurationField durationField21 = gJChronology20.seconds();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = gJChronology20.get(readablePeriod22, 2246399900L, 110449353599L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Chinese" + "'", str7, "Chinese");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-42L) + "'", long19 == (-42L));
        org.junit.Assert.assertNotNull(gJChronology20);
        org.junit.Assert.assertNotNull(durationField21);
    }

    @Test
    public void test23117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23117");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 100);
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        int int6 = gJChronology5.getMinimumDaysInFirstWeek();
        java.lang.String str7 = gJChronology5.toString();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology5.minuteOfHour();
        org.joda.time.DurationField durationField9 = gJChronology5.months();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology5.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology5.weekyearOfCentury();
        java.lang.String str12 = gJChronology5.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GJChronology[UTC]" + "'", str7, "GJChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "GJChronology[UTC]" + "'", str12, "GJChronology[UTC]");
    }

    @Test
    public void test23118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23118");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        long long6 = dateTimeZone1.convertLocalToUTC((long) (byte) -1, true, 0L);
        boolean boolean8 = dateTimeZone1.equals((java.lang.Object) true);
        java.util.Locale locale10 = java.util.Locale.getDefault();
        java.lang.String str11 = locale10.getDisplayLanguage();
        java.lang.String str12 = locale10.toLanguageTag();
        java.lang.String str13 = dateTimeZone1.getShortName(0L, locale10);
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        org.joda.time.chrono.GJChronology gJChronology16 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField17 = gJChronology16.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology16.weekyearOfCentury();
        org.joda.time.Instant instant19 = gJChronology16.getGregorianCutover();
        org.joda.time.Instant instant21 = instant19.withMillis(0L);
        org.joda.time.chrono.GJChronology gJChronology23 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, (org.joda.time.ReadableInstant) instant19, 4);
        org.joda.time.Instant instant25 = instant19.minus((-2208729599948L));
        boolean boolean27 = instant25.isBefore(864000000L);
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.Instant instant29 = instant25.minus(readableDuration28);
        org.joda.time.DateTimeZone dateTimeZone30 = instant29.getZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Chinese" + "'", str11, "Chinese");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "zh" + "'", str12, "zh");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(gJChronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(instant19);
        org.junit.Assert.assertNotNull(instant21);
        org.junit.Assert.assertNotNull(gJChronology23);
        org.junit.Assert.assertNotNull(instant25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(instant29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
    }

    @Test
    public void test23119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23119");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean9 = gJChronology2.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.hourOfHalfday();
        org.joda.time.DurationField durationField12 = gJChronology2.millis();
        org.joda.time.DurationField durationField13 = gJChronology2.months();
        org.joda.time.DurationField durationField14 = gJChronology2.days();
        java.lang.String str15 = durationField14.toString();
        long long18 = durationField14.getDifferenceAsLong((-6719900L), 35052L);
        int int21 = durationField14.getValue((-310781400000L), 5432130000000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "DurationField[days]" + "'", str15, "DurationField[days]");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3597) + "'", int21 == (-3597));
    }

    @Test
    public void test23120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23120");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.weekyearOfCentury();
        org.joda.time.Instant instant5 = gJChronology2.getGregorianCutover();
        org.joda.time.Instant instant7 = instant5.withMillis(0L);
        org.joda.time.Instant instant9 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.chrono.GJChronology gJChronology12 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField13 = gJChronology12.millisOfSecond();
        int int14 = instant9.get(dateTimeField13);
        org.joda.time.Instant instant16 = instant9.plus(0L);
        int int17 = instant7.compareTo((org.joda.time.ReadableInstant) instant16);
        org.joda.time.Instant instant19 = new org.joda.time.Instant(52L);
        boolean boolean20 = instant19.isEqualNow();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.Instant instant22 = instant19.plus(readableDuration21);
        boolean boolean24 = instant22.equals((java.lang.Object) ' ');
        boolean boolean25 = instant16.isEqual((org.joda.time.ReadableInstant) instant22);
        java.lang.String str26 = instant16.toString();
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.Instant instant29 = instant16.withDurationAdded(readableDuration27, 1431201);
        java.lang.Object obj30 = null;
        boolean boolean31 = instant16.equals(obj30);
        java.util.Date date32 = instant16.toDate();
        java.util.Date date33 = instant16.toDate();
        org.joda.time.Chronology chronology34 = instant16.getChronology();
        org.joda.time.MutableDateTime mutableDateTime35 = instant16.toMutableDateTime();
        boolean boolean36 = instant16.isAfterNow();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(gJChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(instant22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str26, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertNotNull(instant29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(mutableDateTime35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test23121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23121");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.millisOfSecond();
        org.joda.time.DurationField durationField4 = gJChronology2.millis();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = gJChronology2.add(readablePeriod5, (long) 'a', (int) '4');
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.yearOfEra();
        org.joda.time.DurationField durationField13 = gJChronology2.weeks();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology2.era();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        long long19 = gJChronology2.add(readablePeriod16, 792000000L, (-343860));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 792000000L + "'", long19 == 792000000L);
    }

    @Test
    public void test23122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23122");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault();
        boolean boolean2 = locale1.hasExtensions();
        java.lang.String str3 = locale1.getISO3Language();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale5 = java.util.Locale.getDefault(category0);
        java.util.Locale.Builder builder6 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale.Builder builder9 = builder7.removeUnicodeLocaleAttribute("und");
        java.util.Locale.Builder builder10 = builder9.clearExtensions();
        java.util.Locale.Builder builder11 = builder10.clearExtensions();
        java.util.Locale locale12 = builder10.build();
        java.util.Locale locale13 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale14 = java.util.Locale.ENGLISH;
        java.lang.String str15 = locale13.getDisplayLanguage(locale14);
        java.util.Locale locale16 = java.util.Locale.CANADA;
        java.lang.String str17 = locale16.getISO3Language();
        java.lang.String str18 = locale13.getDisplayVariant(locale16);
        java.util.Set<java.lang.String> strSet19 = locale13.getUnicodeLocaleKeys();
        java.util.Locale locale23 = new java.util.Locale("zh", "en", "");
        java.lang.String str24 = locale13.getDisplayName(locale23);
        java.lang.String str25 = locale23.getVariant();
        java.lang.String str26 = locale12.getDisplayName(locale23);
        java.util.Locale locale27 = java.util.Locale.ROOT;
        java.util.Locale locale28 = java.util.Locale.ITALIAN;
        java.lang.String str29 = locale27.getDisplayName(locale28);
        java.lang.String str30 = locale12.getDisplayVariant(locale28);
        java.util.Locale locale31 = java.util.Locale.ENGLISH;
        java.lang.String str32 = locale31.getDisplayScript();
        java.lang.String str33 = locale31.getDisplayVariant();
        java.util.Locale locale35 = new java.util.Locale("hi!");
        java.lang.String str36 = locale35.getCountry();
        java.lang.String str37 = locale35.getScript();
        java.util.Locale locale38 = java.util.Locale.ITALIAN;
        java.util.Locale locale39 = locale38.stripExtensions();
        java.util.Locale locale40 = java.util.Locale.CANADA;
        java.lang.String str41 = locale38.getDisplayVariant(locale40);
        java.lang.String str42 = locale35.getDisplayScript(locale38);
        java.lang.String str43 = locale35.getVariant();
        java.lang.String str44 = locale31.getDisplayCountry(locale35);
        java.util.Locale.Builder builder45 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder46 = builder45.clear();
        java.util.Locale.Builder builder48 = builder46.removeUnicodeLocaleAttribute("und");
        java.util.Locale.Builder builder49 = builder48.clearExtensions();
        java.util.Locale.Builder builder50 = builder49.clearExtensions();
        java.util.Locale locale51 = builder49.build();
        java.util.Locale.Builder builder53 = builder49.setLanguageTag("en-US");
        java.util.Locale.Builder builder55 = builder49.addUnicodeLocaleAttribute("deu");
        java.util.Locale.Builder builder56 = builder55.clearExtensions();
        java.util.Locale.Builder builder57 = builder55.clear();
        java.util.Locale locale58 = builder55.build();
        java.lang.String str59 = locale58.toLanguageTag();
        java.lang.String str60 = locale31.getDisplayName(locale58);
        java.lang.String str61 = locale28.getDisplayLanguage(locale31);
        java.util.Locale locale62 = java.util.Locale.CHINA;
        java.lang.String str63 = locale62.getCountry();
        java.lang.String str64 = locale62.getISO3Country();
        java.lang.String str65 = locale31.getDisplayScript(locale62);
        java.util.Locale.setDefault(category0, locale31);
        java.util.Locale locale68 = java.util.Locale.forLanguageTag("");
        java.util.TimeZone timeZone69 = null;
        org.joda.time.DateTimeZone dateTimeZone70 = org.joda.time.DateTimeZone.forTimeZone(timeZone69);
        org.joda.time.chrono.GJChronology gJChronology71 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone70);
        org.joda.time.DurationField durationField72 = gJChronology71.halfdays();
        org.joda.time.DateTimeField dateTimeField73 = gJChronology71.millisOfDay();
        org.joda.time.DateTimeField dateTimeField74 = gJChronology71.minuteOfDay();
        org.joda.time.DurationField durationField75 = gJChronology71.centuries();
        org.joda.time.DateTimeField dateTimeField76 = gJChronology71.halfdayOfDay();
        java.util.Locale locale77 = java.util.Locale.ITALIAN;
        java.util.Locale locale78 = locale77.stripExtensions();
        java.util.Locale locale79 = java.util.Locale.CANADA;
        java.lang.String str80 = locale77.getDisplayVariant(locale79);
        boolean boolean81 = gJChronology71.equals((java.lang.Object) locale79);
        java.lang.String str82 = locale68.getDisplayLanguage(locale79);
        java.util.Locale.setDefault(category0, locale79);
        java.util.Locale locale85 = java.util.Locale.forLanguageTag("Italienisch");
        java.util.Locale.setDefault(category0, locale85);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zho" + "'", str3, "zho");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Chinese" + "'", str15, "Chinese");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "eng" + "'", str17, "eng");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_EN");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\u4e2d\u6587\u53f0\u6e7e\u5730\u533a)" + "'", str24, "\u4e2d\u6587\u53f0\u6e7e\u5730\u533a)");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "it");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals(locale35.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "it");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "it");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "");
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "und" + "'", str59, "und");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "English" + "'", str60, "English");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Italian" + "'", str61, "Italian");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "CN" + "'", str63, "CN");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "CHN" + "'", str64, "CHN");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "");
        org.junit.Assert.assertNotNull(dateTimeZone70);
        org.junit.Assert.assertNotNull(gJChronology71);
        org.junit.Assert.assertNotNull(durationField72);
        org.junit.Assert.assertNotNull(dateTimeField73);
        org.junit.Assert.assertNotNull(dateTimeField74);
        org.junit.Assert.assertNotNull(durationField75);
        org.junit.Assert.assertNotNull(dateTimeField76);
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "it");
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "it");
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertNotNull(locale85);
        org.junit.Assert.assertEquals(locale85.toString(), "");
    }

    @Test
    public void test23123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23123");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getCountry();
        java.util.Locale locale6 = java.util.Locale.getDefault();
        java.lang.String str7 = locale6.getDisplayName();
        java.lang.String str8 = locale4.getDisplayScript(locale6);
        boolean boolean9 = dateTimeZone1.equals((java.lang.Object) locale6);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone12 = dateTimeZone11.toTimeZone();
        long long15 = dateTimeZone11.adjustOffset((long) 0, false);
        int int17 = dateTimeZone11.getOffsetFromLocal((-26438399999L));
        long long19 = dateTimeZone1.getMillisKeepLocal(dateTimeZone11, (long) (byte) 10);
        org.joda.time.Instant instant21 = new org.joda.time.Instant(52L);
        boolean boolean22 = instant21.isEqualNow();
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.Instant instant24 = instant21.plus(readableDuration23);
        long long25 = instant21.getMillis();
        java.lang.String str26 = instant21.toString();
        org.joda.time.Instant instant27 = instant21.toInstant();
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.Instant instant30 = instant21.withDurationAdded(readableDuration28, (int) 'x');
        java.util.TimeZone timeZone31 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forTimeZone(timeZone31);
        org.joda.time.chrono.GJChronology gJChronology33 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone32);
        org.joda.time.DateTimeField dateTimeField34 = gJChronology33.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField35 = gJChronology33.yearOfCentury();
        int int36 = instant30.get(dateTimeField35);
        org.joda.time.chrono.GJChronology gJChronology37 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11, (org.joda.time.ReadableInstant) instant30);
        org.joda.time.DateTimeField dateTimeField38 = gJChronology37.hourOfHalfday();
        org.joda.time.DurationField durationField39 = gJChronology37.eras();
        java.lang.String str40 = gJChronology37.toString();
        org.joda.time.DateTimeField dateTimeField41 = gJChronology37.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray44 = gJChronology37.get(readablePeriod42, 36000010L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Chinese" + "'", str7, "Chinese");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-42L) + "'", long19 == (-42L));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 52L + "'", long25 == 52L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str26, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertNotNull(instant27);
        org.junit.Assert.assertNotNull(instant30);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(gJChronology33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 70 + "'", int36 == 70);
        org.junit.Assert.assertNotNull(gJChronology37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(durationField39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "GJChronology[+00:00:00.052,cutover=1970-01-01T00:00:00.052Z]" + "'", str40, "GJChronology[+00:00:00.052,cutover=1970-01-01T00:00:00.052Z]");
        org.junit.Assert.assertNotNull(dateTimeField41);
    }

    @Test
    public void test23124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23124");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.millisOfSecond();
        org.joda.time.DurationField durationField4 = gJChronology2.millis();
        org.joda.time.DateTimeZone dateTimeZone5 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.hourOfHalfday();
        org.joda.time.DurationField durationField7 = gJChronology2.halfdays();
        org.joda.time.DurationField durationField8 = gJChronology2.millis();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.era();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.monthOfYear();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test23125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23125");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.millisOfDay();
        boolean boolean7 = dateTimeField6.isLenient();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test23126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23126");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        long long6 = dateTimeZone1.convertLocalToUTC((long) (byte) -1, true, 0L);
        boolean boolean8 = dateTimeZone1.equals((java.lang.Object) true);
        java.util.Locale locale10 = java.util.Locale.getDefault();
        java.lang.String str11 = locale10.getDisplayLanguage();
        java.lang.String str12 = locale10.toLanguageTag();
        java.lang.String str13 = dateTimeZone1.getShortName(0L, locale10);
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        org.joda.time.chrono.GJChronology gJChronology16 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField17 = gJChronology16.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology16.weekyearOfCentury();
        org.joda.time.Instant instant19 = gJChronology16.getGregorianCutover();
        org.joda.time.Instant instant21 = instant19.withMillis(0L);
        org.joda.time.chrono.GJChronology gJChronology23 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, (org.joda.time.ReadableInstant) instant19, 4);
        java.util.TimeZone timeZone24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        org.joda.time.chrono.GJChronology gJChronology26 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone25);
        org.joda.time.DateTimeField dateTimeField27 = gJChronology26.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField28 = gJChronology26.weekyearOfCentury();
        org.joda.time.Instant instant29 = gJChronology26.getGregorianCutover();
        org.joda.time.Instant instant31 = instant29.withMillis(0L);
        org.joda.time.Instant instant33 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone34 = null;
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forTimeZone(timeZone34);
        org.joda.time.chrono.GJChronology gJChronology36 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone35);
        org.joda.time.DateTimeField dateTimeField37 = gJChronology36.millisOfSecond();
        int int38 = instant33.get(dateTimeField37);
        org.joda.time.Instant instant40 = instant33.plus(0L);
        int int41 = instant31.compareTo((org.joda.time.ReadableInstant) instant40);
        org.joda.time.Instant instant43 = new org.joda.time.Instant(52L);
        boolean boolean44 = instant43.isEqualNow();
        org.joda.time.ReadableDuration readableDuration45 = null;
        org.joda.time.Instant instant46 = instant43.plus(readableDuration45);
        boolean boolean48 = instant46.equals((java.lang.Object) ' ');
        boolean boolean49 = instant40.isEqual((org.joda.time.ReadableInstant) instant46);
        java.lang.String str50 = instant40.toString();
        org.joda.time.ReadableDuration readableDuration51 = null;
        org.joda.time.Instant instant53 = instant40.withDurationAdded(readableDuration51, 1431201);
        int int54 = dateTimeZone1.getOffset((org.joda.time.ReadableInstant) instant40);
        java.util.TimeZone timeZone55 = dateTimeZone1.toTimeZone();
        java.lang.String str57 = dateTimeZone1.getNameKey((-3755709063476L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Chinese" + "'", str11, "Chinese");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "zh" + "'", str12, "zh");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(gJChronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(instant19);
        org.junit.Assert.assertNotNull(instant21);
        org.junit.Assert.assertNotNull(gJChronology23);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(gJChronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(instant29);
        org.junit.Assert.assertNotNull(instant31);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertNotNull(gJChronology36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 52 + "'", int38 == 52);
        org.junit.Assert.assertNotNull(instant40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(instant46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str50, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertNotNull(instant53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(timeZone55);
        org.junit.Assert.assertEquals(timeZone55.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "UTC" + "'", str57, "UTC");
    }

    @Test
    public void test23127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23127");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        boolean boolean2 = instant1.isEqualNow();
        org.joda.time.Instant instant4 = new org.joda.time.Instant(52L);
        org.joda.time.Instant instant6 = instant4.withMillis((long) 'u');
        boolean boolean7 = instant1.isAfter((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Instant instant10 = instant1.withDurationAdded(747221751619200000L, (int) (byte) 0);
        java.util.Locale locale11 = java.util.Locale.ITALIAN;
        java.util.Locale locale12 = locale11.stripExtensions();
        java.util.Locale locale13 = java.util.Locale.CANADA;
        java.lang.String str14 = locale11.getDisplayVariant(locale13);
        java.lang.String str15 = locale13.getDisplayLanguage();
        java.lang.String str16 = locale13.getDisplayCountry();
        boolean boolean17 = instant10.equals((java.lang.Object) str16);
        org.joda.time.Instant instant19 = new org.joda.time.Instant(52L);
        boolean boolean20 = instant19.isEqualNow();
        java.lang.String str21 = instant19.toString();
        java.lang.String str22 = instant19.toString();
        org.joda.time.Instant instant24 = new org.joda.time.Instant(52L);
        boolean boolean25 = instant24.isEqualNow();
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.Instant instant27 = instant24.plus(readableDuration26);
        boolean boolean28 = instant19.isBefore((org.joda.time.ReadableInstant) instant27);
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.Instant instant30 = instant27.minus(readableDuration29);
        int int31 = instant10.compareTo((org.joda.time.ReadableInstant) instant27);
        long long32 = instant27.getMillis();
        java.util.TimeZone timeZone33 = null;
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forTimeZone(timeZone33);
        org.joda.time.chrono.GJChronology gJChronology35 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone34);
        org.joda.time.DurationField durationField36 = gJChronology35.halfdays();
        long long40 = gJChronology35.add((long) 'a', (-1L), (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField41 = gJChronology35.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField42 = gJChronology35.secondOfMinute();
        org.joda.time.Instant instant44 = new org.joda.time.Instant(52L);
        boolean boolean45 = instant44.isEqualNow();
        org.joda.time.ReadableDuration readableDuration46 = null;
        org.joda.time.Instant instant47 = instant44.plus(readableDuration46);
        boolean boolean48 = gJChronology35.equals((java.lang.Object) instant44);
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = null;
        boolean boolean50 = instant44.isSupported(dateTimeFieldType49);
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = null;
        boolean boolean52 = instant44.isSupported(dateTimeFieldType51);
        org.joda.time.DateTimeZone dateTimeZone53 = instant44.getZone();
        org.joda.time.Instant instant55 = instant44.plus((long) 'a');
        org.joda.time.ReadableDuration readableDuration56 = null;
        org.joda.time.Instant instant57 = instant44.minus(readableDuration56);
        boolean boolean58 = instant57.isBeforeNow();
        boolean boolean59 = instant27.isEqual((org.joda.time.ReadableInstant) instant57);
        org.joda.time.Instant instant61 = new org.joda.time.Instant(52L);
        boolean boolean62 = instant61.isEqualNow();
        java.lang.String str63 = instant61.toString();
        java.lang.String str64 = instant61.toString();
        org.joda.time.Instant instant67 = instant61.withDurationAdded(115200000L, (int) (short) 1);
        java.util.TimeZone timeZone68 = null;
        org.joda.time.DateTimeZone dateTimeZone69 = org.joda.time.DateTimeZone.forTimeZone(timeZone68);
        java.lang.String str71 = dateTimeZone69.getNameKey((long) 100);
        boolean boolean72 = dateTimeZone69.isFixed();
        org.joda.time.DateTime dateTime73 = instant61.toDateTime(dateTimeZone69);
        org.joda.time.DateTimeFieldType dateTimeFieldType74 = null;
        boolean boolean75 = instant61.isSupported(dateTimeFieldType74);
        org.joda.time.ReadableDuration readableDuration76 = null;
        org.joda.time.Instant instant77 = instant61.minus(readableDuration76);
        org.joda.time.DateTimeFieldType dateTimeFieldType78 = null;
        boolean boolean79 = instant77.isSupported(dateTimeFieldType78);
        boolean boolean80 = instant27.isAfter((org.joda.time.ReadableInstant) instant77);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "it");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "it");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "English" + "'", str15, "English");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Canada" + "'", str16, "Canada");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str21, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str22, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(instant27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(instant30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 52L + "'", long32 == 52L);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(gJChronology35);
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 97L + "'", long40 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(instant47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(dateTimeZone53);
        org.junit.Assert.assertNotNull(instant55);
        org.junit.Assert.assertNotNull(instant57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str63, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str64, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertNotNull(instant67);
        org.junit.Assert.assertNotNull(dateTimeZone69);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "UTC" + "'", str71, "UTC");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(dateTime73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(instant77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test23128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23128");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.weekyearOfCentury();
        org.joda.time.Instant instant5 = gJChronology2.getGregorianCutover();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.hourOfHalfday();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test23129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23129");
        java.util.Locale locale3 = new java.util.Locale("\u610f\u5927\u5229\u6587", "deu", "en");
        boolean boolean4 = locale3.hasExtensions();
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.chrono.GJChronology gJChronology7 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone6);
        org.joda.time.DurationField durationField8 = gJChronology7.halfdays();
        long long12 = gJChronology7.add((long) 'a', (-1L), (int) (short) 0);
        long long16 = gJChronology7.add((long) (byte) 0, (long) '4', 100);
        org.joda.time.DateTimeField dateTimeField17 = gJChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology7.year();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology7.monthOfYear();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology7.year();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology7.clockhourOfHalfday();
        org.joda.time.DurationField durationField22 = gJChronology7.weekyears();
        org.joda.time.DurationField durationField23 = gJChronology7.weeks();
        long long26 = durationField23.getValueAsLong(0L, (long) (-1916));
        boolean boolean27 = durationField23.isPrecise();
        boolean boolean28 = durationField23.isPrecise();
        boolean boolean29 = locale3.equals((java.lang.Object) boolean28);
        org.junit.Assert.assertEquals(locale3.toString(), "\u610f\u5927\u5229\u6587_DEU_en");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(gJChronology7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 5200L + "'", long16 == 5200L);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test23130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23130");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        boolean boolean2 = instant1.isEqualNow();
        java.lang.String str3 = instant1.toString();
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        org.joda.time.chrono.GJChronology gJChronology6 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone5);
        java.util.Locale locale8 = new java.util.Locale("hi!");
        java.lang.String str9 = locale8.getCountry();
        java.util.Locale locale10 = java.util.Locale.getDefault();
        java.lang.String str11 = locale10.getDisplayName();
        java.lang.String str12 = locale8.getDisplayScript(locale10);
        boolean boolean13 = dateTimeZone5.equals((java.lang.Object) locale10);
        int int15 = dateTimeZone5.getOffsetFromLocal((long) (short) 10);
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone17);
        org.joda.time.DateTimeField dateTimeField19 = gJChronology18.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology18.weekyearOfCentury();
        org.joda.time.Instant instant21 = gJChronology18.getGregorianCutover();
        org.joda.time.Instant instant23 = instant21.withMillis(0L);
        org.joda.time.Instant instant25 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        org.joda.time.chrono.GJChronology gJChronology28 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone27);
        org.joda.time.DateTimeField dateTimeField29 = gJChronology28.millisOfSecond();
        int int30 = instant25.get(dateTimeField29);
        org.joda.time.Instant instant32 = instant25.plus(0L);
        int int33 = instant23.compareTo((org.joda.time.ReadableInstant) instant32);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = null;
        boolean boolean35 = instant32.isSupported(dateTimeFieldType34);
        int int36 = dateTimeZone5.getOffset((org.joda.time.ReadableInstant) instant32);
        boolean boolean37 = instant1.isAfter((org.joda.time.ReadableInstant) instant32);
        org.joda.time.ReadableDuration readableDuration38 = null;
        org.joda.time.Instant instant40 = instant1.withDurationAdded(readableDuration38, 1);
        boolean boolean41 = instant40.isEqualNow();
        org.joda.time.Instant instant42 = instant40.toInstant();
        long long43 = instant42.getMillis();
        java.lang.String str44 = instant42.toString();
        org.joda.time.Instant instant45 = instant42.toInstant();
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = null;
        boolean boolean47 = instant45.isSupported(dateTimeFieldType46);
        org.joda.time.MutableDateTime mutableDateTime48 = instant45.toMutableDateTime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str3, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(gJChronology6);
        org.junit.Assert.assertEquals(locale8.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Chinese" + "'", str11, "Chinese");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(gJChronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(instant21);
        org.junit.Assert.assertNotNull(instant23);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(gJChronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
        org.junit.Assert.assertNotNull(instant32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(instant40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(instant42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 52L + "'", long43 == 52L);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str44, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertNotNull(instant45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(mutableDateTime48);
    }

    @Test
    public void test23131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23131");
        java.util.Locale locale3 = new java.util.Locale("1574-06-15T08:39:54.800Z", "2022-02-11T08:38:45.718Z", "");
        java.lang.String str4 = locale3.toLanguageTag();
        org.junit.Assert.assertEquals(locale3.toString(), "1574-06-15t08:39:54.800z_2022-02-11T08:38:45.718Z");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "und" + "'", str4, "und");
    }

    @Test
    public void test23132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23132");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.centuries();
        int int7 = gJChronology2.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.weekyear();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.weekyearOfCentury();
        org.joda.time.DurationField durationField10 = gJChronology2.halfdays();
        org.joda.time.Instant instant11 = gJChronology2.getGregorianCutover();
        java.lang.String str12 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology2.weekyear();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology2.minuteOfHour();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "GJChronology[UTC]" + "'", str12, "GJChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test23133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23133");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean9 = gJChronology2.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.hourOfHalfday();
        org.joda.time.Instant instant12 = gJChronology2.getGregorianCutover();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology2.minuteOfDay();
        org.joda.time.DurationField durationField14 = gJChronology2.minutes();
        org.joda.time.DurationField durationField15 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology2.millisOfSecond();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test23134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23134");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant2 = org.joda.time.Instant.parse("2022-02-11T09:52:20.464Z", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test23135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23135");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.Chronology chronology4 = gJChronology2.withUTC();
        long long8 = gJChronology2.add((long) (byte) 0, 4324200000L, 4);
        long long12 = gJChronology2.add(3155760000000L, (long) (short) 10, (int) 'u');
        org.joda.time.Chronology chronology13 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology2.era();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = gJChronology2.get(readablePeriod15, 88948800000L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 17296800000L + "'", long8 == 17296800000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3155760001170L + "'", long12 == 3155760001170L);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test23136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23136");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        boolean boolean2 = instant1.isEqualNow();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant4 = instant1.plus(readableDuration3);
        boolean boolean6 = instant4.equals((java.lang.Object) ' ');
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1, 10);
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        long long13 = dateTimeZone9.getMillisKeepLocal(dateTimeZone11, 4320000000L);
        boolean boolean14 = instant4.equals((java.lang.Object) 4320000000L);
        org.joda.time.Instant instant16 = instant4.withMillis(10L);
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        org.joda.time.chrono.GJChronology gJChronology19 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone18);
        long long23 = dateTimeZone18.convertLocalToUTC((long) (byte) -1, true, 0L);
        boolean boolean25 = dateTimeZone18.equals((java.lang.Object) true);
        org.joda.time.chrono.GJChronology gJChronology26 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField27 = gJChronology26.weekyear();
        org.joda.time.DateTimeField dateTimeField28 = gJChronology26.era();
        int int29 = instant16.get(dateTimeField28);
        org.joda.time.Instant instant31 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone32 = null;
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forTimeZone(timeZone32);
        org.joda.time.chrono.GJChronology gJChronology34 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone33);
        org.joda.time.DateTimeField dateTimeField35 = gJChronology34.millisOfSecond();
        int int36 = instant31.get(dateTimeField35);
        org.joda.time.Instant instant38 = instant31.plus(0L);
        org.joda.time.Instant instant39 = instant38.toInstant();
        org.joda.time.Instant instant41 = new org.joda.time.Instant(52L);
        boolean boolean42 = instant41.isEqualNow();
        java.lang.String str43 = instant41.toString();
        java.lang.String str44 = instant41.toString();
        org.joda.time.Instant instant46 = new org.joda.time.Instant(52L);
        boolean boolean47 = instant46.isEqualNow();
        org.joda.time.ReadableDuration readableDuration48 = null;
        org.joda.time.Instant instant49 = instant46.plus(readableDuration48);
        boolean boolean50 = instant41.isBefore((org.joda.time.ReadableInstant) instant49);
        org.joda.time.Instant instant52 = instant41.minus((long) 0);
        int int53 = instant38.compareTo((org.joda.time.ReadableInstant) instant41);
        org.joda.time.Instant instant56 = instant41.withDurationAdded((long) (short) 100, 70);
        org.joda.time.MutableDateTime mutableDateTime57 = instant56.toMutableDateTimeISO();
        boolean boolean58 = instant16.isBefore((org.joda.time.ReadableInstant) instant56);
        org.joda.time.Instant instant60 = instant56.plus(747217518019207000L);
        org.joda.time.DateTimeZone dateTimeZone61 = instant56.getZone();
        java.util.TimeZone timeZone62 = dateTimeZone61.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.forTimeZone(timeZone62);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 4324200000L + "'", long13 == 4324200000L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(gJChronology19);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(gJChronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(gJChronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 52 + "'", int36 == 52);
        org.junit.Assert.assertNotNull(instant38);
        org.junit.Assert.assertNotNull(instant39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str43, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str44, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(instant49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(instant52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(instant56);
        org.junit.Assert.assertNotNull(mutableDateTime57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(instant60);
        org.junit.Assert.assertNotNull(dateTimeZone61);
        org.junit.Assert.assertNotNull(timeZone62);
        org.junit.Assert.assertEquals(timeZone62.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone63);
    }

    @Test
    public void test23137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23137");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology4.millisOfSecond();
        int int6 = instant1.get(dateTimeField5);
        org.joda.time.Instant instant8 = instant1.plus(0L);
        org.joda.time.Instant instant9 = instant8.toInstant();
        org.joda.time.Instant instant11 = new org.joda.time.Instant(52L);
        boolean boolean12 = instant11.isEqualNow();
        java.lang.String str13 = instant11.toString();
        java.lang.String str14 = instant11.toString();
        org.joda.time.Instant instant16 = new org.joda.time.Instant(52L);
        boolean boolean17 = instant16.isEqualNow();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Instant instant19 = instant16.plus(readableDuration18);
        boolean boolean20 = instant11.isBefore((org.joda.time.ReadableInstant) instant19);
        org.joda.time.Instant instant22 = instant11.minus((long) 0);
        int int23 = instant8.compareTo((org.joda.time.ReadableInstant) instant11);
        org.joda.time.Instant instant26 = instant11.withDurationAdded((long) (short) 100, 70);
        org.joda.time.MutableDateTime mutableDateTime27 = instant26.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone28 = instant26.getZone();
        org.joda.time.Instant instant30 = instant26.minus((long) (short) 0);
        boolean boolean32 = instant30.isEqual(3732480000000000L);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(gJChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str13, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str14, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(instant19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(instant22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(instant26);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(instant30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test23138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23138");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 100);
        long long6 = dateTimeZone1.convertLocalToUTC((-2246399965L), true);
        long long10 = dateTimeZone1.convertLocalToUTC(4320000000L, true, (long) 'a');
        boolean boolean11 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone13);
        org.joda.time.DurationField durationField15 = gJChronology14.halfdays();
        long long19 = gJChronology14.add((long) 'a', (-1L), (int) (short) 0);
        long long23 = gJChronology14.add((long) (byte) 0, (long) '4', 100);
        org.joda.time.DateTimeField dateTimeField24 = gJChronology14.minuteOfHour();
        org.joda.time.DurationField durationField25 = gJChronology14.hours();
        org.joda.time.DateTimeField dateTimeField26 = gJChronology14.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField27 = gJChronology14.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField28 = gJChronology14.secondOfDay();
        org.joda.time.DateTimeField dateTimeField29 = gJChronology14.secondOfMinute();
        boolean boolean30 = dateTimeZone1.equals((java.lang.Object) dateTimeField29);
        long long33 = dateTimeZone1.adjustOffset((-52L), true);
        boolean boolean35 = dateTimeZone1.isStandardOffset(7816188L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology38 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, 595728097000L, (-92));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: -92");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-2246399965L) + "'", long6 == (-2246399965L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 4320000000L + "'", long10 == 4320000000L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 97L + "'", long19 == 97L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 5200L + "'", long23 == 5200L);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-52L) + "'", long33 == (-52L));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test23139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23139");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone7 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.millisOfSecond();
        org.joda.time.DurationField durationField9 = gJChronology2.days();
        org.joda.time.DateTimeZone dateTimeZone10 = gJChronology2.getZone();
        long long14 = gJChronology2.add(432000001L, 164096150400000L, 0);
        org.joda.time.DurationField durationField15 = gJChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology2.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology2.halfdayOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 432000001L + "'", long14 == 432000001L);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test23140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23140");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.weekyear();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.halfdayOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.years();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.yearOfCentury();
        org.joda.time.DurationField durationField9 = gJChronology2.months();
        org.joda.time.DurationField durationField10 = gJChronology2.minutes();
        int int11 = gJChronology2.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField12 = gJChronology2.weekyears();
        long long14 = durationField12.getMillis(209);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 6595402968000L + "'", long14 == 6595402968000L);
    }

    @Test
    public void test23141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23141");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.halfdayOfDay();
        java.util.Locale locale8 = java.util.Locale.ITALIAN;
        java.util.Locale locale9 = locale8.stripExtensions();
        java.util.Locale locale10 = java.util.Locale.CANADA;
        java.lang.String str11 = locale8.getDisplayVariant(locale10);
        boolean boolean12 = gJChronology2.equals((java.lang.Object) locale10);
        org.joda.time.DurationField durationField13 = gJChronology2.months();
        org.joda.time.Chronology chronology14 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology2.yearOfCentury();
        org.joda.time.Chronology chronology16 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology2.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology2.monthOfYear();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test23142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23142");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.year();
        org.joda.time.DurationField durationField9 = gJChronology2.years();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone12 = gJChronology2.getZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
    }

    @Test
    public void test23143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23143");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.clockhourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = gJChronology2.add(readablePeriod8, (long) 42, 717);
        org.joda.time.DurationField durationField12 = gJChronology2.weekyears();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = gJChronology2.get(readablePeriod13, (long) 115200);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 42L + "'", long11 == 42L);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test23144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23144");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 100);
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField6 = gJChronology5.hours();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology5.weekyear();
        org.joda.time.DurationField durationField8 = gJChronology5.centuries();
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        int int12 = dateTimeZone10.getOffsetFromLocal((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (short) 10);
        long long17 = dateTimeZone10.getMillisKeepLocal(dateTimeZone15, (-61827926399999L));
        java.util.TimeZone timeZone18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        java.lang.String str21 = dateTimeZone19.getNameKey((long) 100);
        boolean boolean22 = dateTimeZone19.isFixed();
        org.joda.time.chrono.GJChronology gJChronology23 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone19);
        long long25 = dateTimeZone19.convertUTCToLocal(5200L);
        java.util.Locale.LanguageRange[] languageRangeArray26 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList27 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27, languageRangeArray26);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap29 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList30 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, strMap29);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap31 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList32 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList30, strMap31);
        java.util.Locale.LanguageRange[] languageRangeArray33 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList34 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList34, languageRangeArray33);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap36 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList37 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList34, strMap36);
        java.lang.String[] strArray41 = new java.lang.String[] { "English", "English", "hi!" };
        java.util.ArrayList<java.lang.String> strList42 = new java.util.ArrayList<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList42, strArray41);
        java.util.List<java.lang.String> strList44 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList34, (java.util.Collection<java.lang.String>) strList42);
        java.util.Locale.FilteringMode filteringMode45 = null;
        java.util.List<java.lang.String> strList46 = java.util.Locale.filterTags(languageRangeList32, (java.util.Collection<java.lang.String>) strList42, filteringMode45);
        java.util.Locale.LanguageRange[] languageRangeArray47 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList48 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList48, languageRangeArray47);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap50 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList51 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList48, strMap50);
        java.util.Locale.LanguageRange[] languageRangeArray52 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList53 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList53, languageRangeArray52);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap55 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList56 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList53, strMap55);
        java.lang.String[] strArray60 = new java.lang.String[] { "English", "English", "hi!" };
        java.util.ArrayList<java.lang.String> strList61 = new java.util.ArrayList<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList61, strArray60);
        java.util.List<java.lang.String> strList63 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList53, (java.util.Collection<java.lang.String>) strList61);
        java.util.List<java.lang.String> strList64 = java.util.Locale.filterTags(languageRangeList51, (java.util.Collection<java.lang.String>) strList63);
        java.util.List<java.lang.String> strList65 = java.util.Locale.filterTags(languageRangeList32, (java.util.Collection<java.lang.String>) strList64);
        java.util.Locale.LanguageRange[] languageRangeArray66 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList67 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList67, languageRangeArray66);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap69 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList70 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList67, strMap69);
        java.lang.String[] strArray74 = new java.lang.String[] { "English", "English", "hi!" };
        java.util.ArrayList<java.lang.String> strList75 = new java.util.ArrayList<java.lang.String>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList75, strArray74);
        java.util.List<java.lang.String> strList77 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList67, (java.util.Collection<java.lang.String>) strList75);
        java.util.List<java.lang.String> strList78 = java.util.Locale.filterTags(languageRangeList32, (java.util.Collection<java.lang.String>) strList77);
        boolean boolean79 = dateTimeZone19.equals((java.lang.Object) languageRangeList32);
        long long81 = dateTimeZone10.getMillisKeepLocal(dateTimeZone19, (long) 'u');
        java.lang.String str82 = dateTimeZone10.getID();
        org.joda.time.Chronology chronology83 = gJChronology5.withZone(dateTimeZone10);
        org.joda.time.DurationField durationField84 = chronology83.hours();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-61827926999999L) + "'", long17 == (-61827926999999L));
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTC" + "'", str21, "UTC");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(gJChronology23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 5200L + "'", long25 == 5200L);
        org.junit.Assert.assertNotNull(languageRangeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(languageRangeList30);
        org.junit.Assert.assertNotNull(languageRangeList32);
        org.junit.Assert.assertNotNull(languageRangeArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(languageRangeList37);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertNotNull(languageRangeArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(languageRangeList51);
        org.junit.Assert.assertNotNull(languageRangeArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(languageRangeList56);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(strList63);
        org.junit.Assert.assertNotNull(strList64);
        org.junit.Assert.assertNotNull(strList65);
        org.junit.Assert.assertNotNull(languageRangeArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(languageRangeList70);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(strList77);
        org.junit.Assert.assertNotNull(strList78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 117L + "'", long81 == 117L);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "UTC" + "'", str82, "UTC");
        org.junit.Assert.assertNotNull(chronology83);
        org.junit.Assert.assertNotNull(durationField84);
    }

    @Test
    public void test23145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23145");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 100);
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField6 = gJChronology5.hours();
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8);
        org.joda.time.DurationField durationField10 = gJChronology9.halfdays();
        long long14 = gJChronology9.add((long) 'a', (-1L), (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField15 = gJChronology9.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology9.secondOfMinute();
        org.joda.time.Instant instant18 = new org.joda.time.Instant(52L);
        boolean boolean19 = instant18.isEqualNow();
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.Instant instant21 = instant18.plus(readableDuration20);
        boolean boolean22 = gJChronology9.equals((java.lang.Object) instant18);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = null;
        boolean boolean24 = instant18.isSupported(dateTimeFieldType23);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = null;
        boolean boolean26 = instant18.isSupported(dateTimeFieldType25);
        org.joda.time.DateTimeZone dateTimeZone27 = instant18.getZone();
        long long29 = dateTimeZone27.nextTransition(349200L);
        org.joda.time.Chronology chronology30 = gJChronology5.withZone(dateTimeZone27);
        org.joda.time.DurationField durationField31 = gJChronology5.hours();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(gJChronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(instant21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 349200L + "'", long29 == 349200L);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(durationField31);
    }

    @Test
    public void test23146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23146");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.weekyear();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.halfdayOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.years();
        org.joda.time.DurationField durationField7 = gJChronology2.minutes();
        org.joda.time.DurationField durationField8 = gJChronology2.centuries();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test23147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23147");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.weekyear();
        org.joda.time.DurationField durationField5 = gJChronology2.centuries();
        org.joda.time.Chronology chronology6 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField7 = gJChronology2.minutes();
        org.joda.time.DateTimeZone dateTimeZone8 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.hourOfHalfday();
        org.joda.time.ReadablePartial readablePartial10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = gJChronology2.get(readablePartial10, 4260256330402L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test23148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23148");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Locale locale1 = java.util.Locale.getDefault();
        boolean boolean2 = locale1.hasExtensions();
        java.lang.String str3 = locale0.getDisplayLanguage(locale1);
        java.util.Locale locale4 = java.util.Locale.ITALIAN;
        java.util.Locale locale5 = locale4.stripExtensions();
        java.lang.String str6 = locale1.getDisplayScript(locale4);
        java.util.Locale locale7 = java.util.Locale.getDefault();
        java.lang.String str8 = locale7.getDisplayName();
        java.util.Locale locale9 = java.util.Locale.CHINESE;
        boolean boolean10 = locale9.hasExtensions();
        java.util.Locale.setDefault(locale9);
        java.lang.String str12 = locale9.getCountry();
        java.lang.String str13 = locale7.getDisplayScript(locale9);
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        org.joda.time.chrono.GJChronology gJChronology16 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone15);
        org.joda.time.DurationField durationField17 = gJChronology16.halfdays();
        long long21 = gJChronology16.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean23 = gJChronology16.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField24 = gJChronology16.dayOfMonth();
        org.joda.time.DurationField durationField25 = gJChronology16.days();
        org.joda.time.DateTimeZone dateTimeZone26 = gJChronology16.getZone();
        java.lang.String str27 = dateTimeZone26.toString();
        java.util.Locale locale29 = java.util.Locale.FRENCH;
        java.util.Locale locale30 = java.util.Locale.getDefault();
        boolean boolean31 = locale30.hasExtensions();
        java.lang.String str32 = locale29.getDisplayLanguage(locale30);
        boolean boolean33 = locale30.hasExtensions();
        java.lang.String str34 = dateTimeZone26.getName((-61827739199999L), locale30);
        java.lang.String str35 = locale9.getDisplayName(locale30);
        java.lang.String str36 = locale4.getDisplayName(locale9);
        java.lang.String str37 = locale9.getDisplayScript();
        java.util.Locale locale38 = java.util.Locale.GERMAN;
        java.lang.String str39 = locale38.getCountry();
        java.lang.String str40 = locale38.getDisplayName();
        java.util.Locale locale41 = java.util.Locale.CANADA;
        java.lang.String str42 = locale41.getDisplayVariant();
        java.lang.String str43 = locale38.getDisplayCountry(locale41);
        boolean boolean44 = locale41.hasExtensions();
        java.util.Locale locale45 = java.util.Locale.CHINA;
        java.lang.String str46 = locale45.toLanguageTag();
        java.lang.String str47 = locale41.getDisplayScript(locale45);
        java.util.Locale locale48 = locale45.stripExtensions();
        java.lang.String str49 = locale9.getDisplayVariant(locale48);
        java.util.Locale.Builder builder50 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder51 = builder50.clear();
        java.util.Locale.Builder builder53 = builder51.removeUnicodeLocaleAttribute("und");
        java.util.Locale.Builder builder54 = builder53.clearExtensions();
        java.util.Locale.Builder builder55 = builder54.clearExtensions();
        java.util.Locale locale56 = builder54.build();
        java.util.Locale.Builder builder58 = builder54.setLanguageTag("en-US");
        java.util.Locale.Builder builder60 = builder54.addUnicodeLocaleAttribute("deu");
        java.util.Locale.Builder builder61 = builder60.clearExtensions();
        java.util.Locale.Builder builder62 = builder61.clear();
        java.util.Locale.Builder builder63 = builder62.clear();
        java.util.Locale.Builder builder65 = builder63.setRegion("zh");
        java.util.Locale.Builder builder66 = builder63.clearExtensions();
        java.util.Locale.Builder builder67 = builder66.clear();
        java.util.Locale locale68 = builder67.build();
        java.lang.String str69 = locale48.getDisplayScript(locale68);
        java.lang.Class<?> wildcardClass70 = locale68.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6cd5\u6587" + "'", str3, "\u6cd5\u6587");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Chinese" + "'", str8, "Chinese");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(gJChronology16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 97L + "'", long21 == 97L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "UTC" + "'", str27, "UTC");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "fr");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\u6cd5\u6587" + "'", str32, "\u6cd5\u6587");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:00" + "'", str34, "+00:00");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\u4e2d\u6587" + "'", str35, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\u610f\u5927\u5229\u6587" + "'", str36, "\u610f\u5927\u5229\u6587");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "de");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\u5fb7\u6587" + "'", str40, "\u5fb7\u6587");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "zh-CN" + "'", str46, "zh-CN");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "");
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test23149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23149");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        boolean boolean2 = instant1.isEqualNow();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant4 = instant1.plus(readableDuration3);
        boolean boolean6 = instant4.equals((java.lang.Object) ' ');
        org.joda.time.Instant instant8 = instant4.plus(3600000L);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology11.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology11.weekyear();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology11.dayOfMonth();
        long long18 = gJChronology11.add((long) 52, 100L, (int) (byte) 1);
        int int19 = gJChronology11.getMinimumDaysInFirstWeek();
        boolean boolean20 = instant4.equals((java.lang.Object) int19);
        org.joda.time.Instant instant21 = instant4.toInstant();
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.Instant instant24 = instant4.withDurationAdded(readableDuration22, 60000);
        boolean boolean26 = instant24.isEqual((long) 985);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.Instant instant28 = instant24.plus(readableDuration27);
        org.joda.time.Instant instant30 = instant24.plus((-8297012650094970L));
        org.joda.time.Instant instant31 = instant30.toInstant();
        org.joda.time.Chronology chronology32 = instant30.getChronology();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(gJChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 152L + "'", long18 == 152L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(instant21);
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(instant28);
        org.junit.Assert.assertNotNull(instant30);
        org.junit.Assert.assertNotNull(instant31);
        org.junit.Assert.assertNotNull(chronology32);
    }

    @Test
    public void test23150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23150");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean9 = gJChronology2.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology2.clockhourOfHalfday();
        org.joda.time.DurationField durationField14 = gJChronology2.weekyears();
        org.joda.time.DurationField durationField15 = gJChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology2.minuteOfDay();
        org.joda.time.DurationField durationField17 = gJChronology2.weeks();
        org.joda.time.DurationField durationField18 = gJChronology2.millis();
        org.joda.time.Chronology chronology19 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology2.weekyear();
        org.joda.time.DurationField durationField21 = gJChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology2.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology2.era();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
    }

    @Test
    public void test23151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23151");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(12846, 720000000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 720000000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test23152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23152");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.millisOfSecond();
        org.joda.time.DurationField durationField4 = gJChronology2.millis();
        org.joda.time.DurationField durationField5 = gJChronology2.weeks();
        org.joda.time.DurationField durationField6 = gJChronology2.days();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.yearOfCentury();
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone9);
        org.joda.time.DurationField durationField11 = gJChronology10.halfdays();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology10.yearOfCentury();
        org.joda.time.DurationField durationField13 = gJChronology10.minutes();
        org.joda.time.DateTimeZone dateTimeZone14 = gJChronology10.getZone();
        int int16 = dateTimeZone14.getOffset((-3155695200000L));
        org.joda.time.Chronology chronology17 = gJChronology2.withZone(dateTimeZone14);
        org.joda.time.ReadablePartial readablePartial18 = null;
        int[] intArray22 = new int[] { (-70), 136, (-1314) };
        // The following exception was thrown during execution in test generation
        try {
            gJChronology2.validate(readablePartial18, intArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(gJChronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-70, 136, -1314]");
    }

    @Test
    public void test23153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23153");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        boolean boolean2 = instant1.isEqualNow();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant4 = instant1.plus(readableDuration3);
        long long5 = instant1.getMillis();
        java.lang.String str6 = instant1.toString();
        org.joda.time.Instant instant7 = instant1.toInstant();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.Instant instant10 = instant1.withDurationAdded(readableDuration8, (int) 'x');
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = gJChronology13.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology13.yearOfCentury();
        int int16 = instant10.get(dateTimeField15);
        org.joda.time.Instant instant17 = instant10.toInstant();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Instant instant19 = instant10.minus(readableDuration18);
        org.joda.time.Instant instant21 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        org.joda.time.chrono.GJChronology gJChronology24 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField25 = gJChronology24.millisOfSecond();
        int int26 = instant21.get(dateTimeField25);
        org.joda.time.Instant instant28 = instant21.plus(0L);
        java.util.TimeZone timeZone29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forTimeZone(timeZone29);
        org.joda.time.chrono.GJChronology gJChronology31 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone30);
        org.joda.time.DurationField durationField32 = gJChronology31.halfdays();
        org.joda.time.Chronology chronology33 = gJChronology31.withUTC();
        java.lang.String str34 = gJChronology31.toString();
        org.joda.time.DateTimeField dateTimeField35 = gJChronology31.hourOfHalfday();
        int int36 = instant21.get(dateTimeField35);
        org.joda.time.Instant instant38 = new org.joda.time.Instant(52L);
        boolean boolean39 = instant38.isEqualNow();
        org.joda.time.ReadableDuration readableDuration40 = null;
        org.joda.time.Instant instant41 = instant38.plus(readableDuration40);
        org.joda.time.Instant instant43 = new org.joda.time.Instant(52L);
        org.joda.time.Instant instant45 = instant43.withMillis((long) 'u');
        boolean boolean46 = instant38.isBefore((org.joda.time.ReadableInstant) instant43);
        boolean boolean47 = instant21.isEqual((org.joda.time.ReadableInstant) instant43);
        boolean boolean48 = instant10.isBefore((org.joda.time.ReadableInstant) instant21);
        org.joda.time.Instant instant50 = new org.joda.time.Instant(52L);
        boolean boolean51 = instant50.isEqualNow();
        java.lang.String str52 = instant50.toString();
        java.lang.String str53 = instant50.toString();
        org.joda.time.Instant instant55 = new org.joda.time.Instant(52L);
        boolean boolean56 = instant55.isEqualNow();
        org.joda.time.ReadableDuration readableDuration57 = null;
        org.joda.time.Instant instant58 = instant55.plus(readableDuration57);
        boolean boolean59 = instant50.isBefore((org.joda.time.ReadableInstant) instant58);
        org.joda.time.Instant instant61 = instant58.plus((long) (short) 100);
        java.lang.String str62 = instant58.toString();
        boolean boolean64 = instant58.isBefore((-3155695200000L));
        boolean boolean65 = instant58.isBeforeNow();
        boolean boolean67 = instant58.isEqual(7020000L);
        org.joda.time.Instant instant69 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone70 = null;
        org.joda.time.DateTimeZone dateTimeZone71 = org.joda.time.DateTimeZone.forTimeZone(timeZone70);
        org.joda.time.chrono.GJChronology gJChronology72 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone71);
        org.joda.time.DateTimeField dateTimeField73 = gJChronology72.millisOfSecond();
        int int74 = instant69.get(dateTimeField73);
        org.joda.time.Chronology chronology75 = instant69.getChronology();
        int int76 = instant58.compareTo((org.joda.time.ReadableInstant) instant69);
        boolean boolean77 = instant10.equals((java.lang.Object) instant69);
        java.util.TimeZone timeZone78 = null;
        org.joda.time.DateTimeZone dateTimeZone79 = org.joda.time.DateTimeZone.forTimeZone(timeZone78);
        org.joda.time.chrono.GJChronology gJChronology80 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone79);
        org.joda.time.DateTimeField dateTimeField81 = gJChronology80.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField82 = gJChronology80.weekyear();
        org.joda.time.DurationField durationField83 = gJChronology80.centuries();
        org.joda.time.DateTimeField dateTimeField84 = gJChronology80.millisOfDay();
        org.joda.time.DateTimeField dateTimeField85 = gJChronology80.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField86 = gJChronology80.clockhourOfHalfday();
        org.joda.time.DurationField durationField87 = gJChronology80.years();
        org.joda.time.ReadablePeriod readablePeriod88 = null;
        long long91 = gJChronology80.add(readablePeriod88, 0L, 7816188);
        org.joda.time.DateTimeField dateTimeField92 = gJChronology80.yearOfCentury();
        org.joda.time.Chronology chronology93 = gJChronology80.withUTC();
        boolean boolean94 = instant69.equals((java.lang.Object) gJChronology80);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str6, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(gJChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 70 + "'", int16 == 70);
        org.junit.Assert.assertNotNull(instant17);
        org.junit.Assert.assertNotNull(instant19);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(gJChronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
        org.junit.Assert.assertNotNull(instant28);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(gJChronology31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "GJChronology[UTC]" + "'", str34, "GJChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(instant41);
        org.junit.Assert.assertNotNull(instant45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str52, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str53, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(instant58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(instant61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str62, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(dateTimeZone71);
        org.junit.Assert.assertNotNull(gJChronology72);
        org.junit.Assert.assertNotNull(dateTimeField73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 52 + "'", int74 == 52);
        org.junit.Assert.assertNotNull(chronology75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(dateTimeZone79);
        org.junit.Assert.assertNotNull(gJChronology80);
        org.junit.Assert.assertNotNull(dateTimeField81);
        org.junit.Assert.assertNotNull(dateTimeField82);
        org.junit.Assert.assertNotNull(durationField83);
        org.junit.Assert.assertNotNull(dateTimeField84);
        org.junit.Assert.assertNotNull(dateTimeField85);
        org.junit.Assert.assertNotNull(dateTimeField86);
        org.junit.Assert.assertNotNull(durationField87);
        org.junit.Assert.assertTrue("'" + long91 + "' != '" + 0L + "'", long91 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField92);
        org.junit.Assert.assertNotNull(chronology93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test23154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23154");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean9 = gJChronology2.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.clockhourOfDay();
        long long17 = gJChronology2.getDateTimeMillis(10, (int) (short) 10, 4, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField18 = gJChronology2.millisOfDay();
        java.lang.String str19 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology2.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone22 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology2.millisOfSecond();
        org.joda.time.DurationField durationField24 = gJChronology2.days();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-61827926399999L) + "'", long17 == (-61827926399999L));
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "GJChronology[UTC]" + "'", str19, "GJChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(durationField24);
    }

    @Test
    public void test23155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23155");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.weekyear();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.era();
        org.joda.time.Chronology chronology8 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField9 = gJChronology2.years();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test23156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23156");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        long long11 = gJChronology2.add((long) (byte) 0, (long) '4', 100);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.minuteOfHour();
        org.joda.time.DurationField durationField13 = gJChronology2.hours();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology2.era();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology2.hourOfHalfday();
        org.joda.time.DurationField durationField21 = gJChronology2.weeks();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology2.clockhourOfHalfday();
        java.lang.String str24 = gJChronology2.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5200L + "'", long11 == 5200L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "GJChronology[UTC]" + "'", str24, "GJChronology[UTC]");
    }

    @Test
    public void test23157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23157");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) '#');
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology4.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology4.weekyearOfCentury();
        org.joda.time.Instant instant7 = gJChronology4.getGregorianCutover();
        boolean boolean8 = instant1.equals((java.lang.Object) gJChronology4);
        org.joda.time.DateTimeField dateTimeField9 = gJChronology4.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology4.weekOfWeekyear();
        java.lang.String str11 = gJChronology4.toString();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = gJChronology4.add(readablePeriod12, (-61827926999999L), 2100000);
        org.joda.time.Instant instant16 = gJChronology4.getGregorianCutover();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = instant16.toString(dateTimeFormatter17);
        java.util.TimeZone timeZone19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        org.joda.time.chrono.GJChronology gJChronology21 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone20);
        org.joda.time.DurationField durationField22 = gJChronology21.halfdays();
        long long26 = gJChronology21.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean28 = gJChronology21.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField29 = gJChronology21.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField30 = gJChronology21.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField31 = gJChronology21.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField32 = gJChronology21.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField33 = gJChronology21.secondOfMinute();
        java.util.TimeZone timeZone34 = null;
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forTimeZone(timeZone34);
        java.lang.String str37 = dateTimeZone35.getNameKey((long) 100);
        boolean boolean38 = dateTimeZone35.isFixed();
        long long41 = dateTimeZone35.adjustOffset((long) (short) 10, true);
        int int43 = dateTimeZone35.getOffset(1L);
        org.joda.time.Chronology chronology44 = gJChronology21.withZone(dateTimeZone35);
        long long47 = dateTimeZone35.adjustOffset(120L, true);
        java.util.TimeZone timeZone48 = null;
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forTimeZone(timeZone48);
        java.lang.String str51 = dateTimeZone49.getNameKey((long) 100);
        long long54 = dateTimeZone49.convertLocalToUTC((-2246399965L), true);
        long long58 = dateTimeZone49.convertLocalToUTC(4320000000L, true, (long) 'a');
        boolean boolean59 = dateTimeZone49.isFixed();
        long long61 = dateTimeZone49.nextTransition((long) 0);
        java.util.Locale locale66 = new java.util.Locale("zh-CN", "CA", "-01:52");
        java.lang.String str67 = dateTimeZone49.getName((-72948L), locale66);
        java.util.TimeZone timeZone68 = null;
        org.joda.time.DateTimeZone dateTimeZone69 = org.joda.time.DateTimeZone.forTimeZone(timeZone68);
        org.joda.time.chrono.GJChronology gJChronology70 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone69);
        org.joda.time.DurationField durationField71 = gJChronology70.halfdays();
        org.joda.time.DateTimeField dateTimeField72 = gJChronology70.millisOfDay();
        org.joda.time.DateTimeField dateTimeField73 = gJChronology70.minuteOfDay();
        org.joda.time.DurationField durationField74 = gJChronology70.centuries();
        org.joda.time.DateTimeField dateTimeField75 = gJChronology70.millisOfSecond();
        org.joda.time.Chronology chronology76 = gJChronology70.withUTC();
        org.joda.time.DateTimeField dateTimeField77 = gJChronology70.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField78 = gJChronology70.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField79 = gJChronology70.millisOfSecond();
        boolean boolean80 = dateTimeZone49.equals((java.lang.Object) dateTimeField79);
        long long82 = dateTimeZone35.getMillisKeepLocal(dateTimeZone49, 0L);
        long long86 = dateTimeZone35.convertLocalToUTC(42600100L, false, (-4023623458387L));
        org.joda.time.MutableDateTime mutableDateTime87 = instant16.toMutableDateTime(dateTimeZone35);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(gJChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "GJChronology[UTC]" + "'", str11, "GJChronology[UTC]");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-61827926999999L) + "'", long15 == (-61827926999999L));
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1582-10-15T00:00:00.000Z" + "'", str18, "1582-10-15T00:00:00.000Z");
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(gJChronology21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 97L + "'", long26 == 97L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "UTC" + "'", str37, "UTC");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 10L + "'", long41 == 10L);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 120L + "'", long47 == 120L);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "UTC" + "'", str51, "UTC");
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + (-2246399965L) + "'", long54 == (-2246399965L));
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 4320000000L + "'", long58 == 4320000000L);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertEquals(locale66.toString(), "zh-cn_CA_-01:52");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "+00:00" + "'", str67, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone69);
        org.junit.Assert.assertNotNull(gJChronology70);
        org.junit.Assert.assertNotNull(durationField71);
        org.junit.Assert.assertNotNull(dateTimeField72);
        org.junit.Assert.assertNotNull(dateTimeField73);
        org.junit.Assert.assertNotNull(durationField74);
        org.junit.Assert.assertNotNull(dateTimeField75);
        org.junit.Assert.assertNotNull(chronology76);
        org.junit.Assert.assertNotNull(dateTimeField77);
        org.junit.Assert.assertNotNull(dateTimeField78);
        org.junit.Assert.assertNotNull(dateTimeField79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 0L + "'", long82 == 0L);
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 42600100L + "'", long86 == 42600100L);
        org.junit.Assert.assertNotNull(mutableDateTime87);
    }

    @Test
    public void test23158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23158");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:01");
        org.joda.time.Instant instant3 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        org.joda.time.chrono.GJChronology gJChronology6 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone5);
        org.joda.time.DateTimeField dateTimeField7 = gJChronology6.millisOfSecond();
        int int8 = instant3.get(dateTimeField7);
        org.joda.time.Instant instant10 = instant3.plus(0L);
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12);
        org.joda.time.DurationField durationField14 = gJChronology13.halfdays();
        org.joda.time.Chronology chronology15 = gJChronology13.withUTC();
        java.lang.String str16 = gJChronology13.toString();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology13.hourOfHalfday();
        int int18 = instant3.get(dateTimeField17);
        org.joda.time.Instant instant20 = new org.joda.time.Instant(52L);
        boolean boolean21 = instant20.isEqualNow();
        java.lang.String str22 = instant20.toString();
        org.joda.time.Instant instant24 = new org.joda.time.Instant(52L);
        boolean boolean25 = instant24.isEqualNow();
        java.lang.String str26 = instant24.toString();
        java.lang.String str27 = instant24.toString();
        org.joda.time.Instant instant30 = instant24.withDurationAdded(115200000L, (int) (short) 1);
        int int31 = instant20.compareTo((org.joda.time.ReadableInstant) instant24);
        org.joda.time.Instant instant33 = new org.joda.time.Instant(52L);
        boolean boolean34 = instant33.isEqualNow();
        org.joda.time.ReadableDuration readableDuration35 = null;
        org.joda.time.Instant instant36 = instant33.plus(readableDuration35);
        boolean boolean38 = instant36.equals((java.lang.Object) ' ');
        boolean boolean39 = instant24.isAfter((org.joda.time.ReadableInstant) instant36);
        int int40 = instant3.compareTo((org.joda.time.ReadableInstant) instant24);
        org.joda.time.Instant instant42 = instant24.minus(10699L);
        org.joda.time.chrono.GJChronology gJChronology43 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, (org.joda.time.ReadableInstant) instant24);
        org.joda.time.DateTimeField dateTimeField44 = gJChronology43.hourOfHalfday();
        org.joda.time.DurationField durationField45 = gJChronology43.months();
        org.joda.time.DateTimeField dateTimeField46 = gJChronology43.hourOfHalfday();
        org.joda.time.DurationField durationField47 = gJChronology43.hours();
        org.joda.time.DateTimeField dateTimeField48 = gJChronology43.dayOfYear();
        java.util.TimeZone timeZone49 = null;
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forTimeZone(timeZone49);
        org.joda.time.chrono.GJChronology gJChronology51 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone50);
        org.joda.time.DateTimeField dateTimeField52 = gJChronology51.era();
        org.joda.time.DateTimeField dateTimeField53 = gJChronology51.year();
        org.joda.time.DateTimeZone dateTimeZone54 = gJChronology51.getZone();
        org.joda.time.Instant instant56 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone57 = null;
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forTimeZone(timeZone57);
        org.joda.time.chrono.GJChronology gJChronology59 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone58);
        org.joda.time.DateTimeField dateTimeField60 = gJChronology59.millisOfSecond();
        int int61 = instant56.get(dateTimeField60);
        boolean boolean62 = instant56.isEqualNow();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter63 = null;
        java.lang.String str64 = instant56.toString(dateTimeFormatter63);
        org.joda.time.Instant instant66 = instant56.plus(262974605200L);
        java.util.TimeZone timeZone67 = null;
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.forTimeZone(timeZone67);
        org.joda.time.chrono.GJChronology gJChronology69 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone68);
        long long73 = dateTimeZone68.convertLocalToUTC((long) (byte) -1, true, 0L);
        boolean boolean75 = dateTimeZone68.equals((java.lang.Object) true);
        java.util.Locale locale77 = java.util.Locale.getDefault();
        java.lang.String str78 = locale77.getDisplayLanguage();
        java.lang.String str79 = locale77.toLanguageTag();
        java.lang.String str80 = dateTimeZone68.getShortName(0L, locale77);
        java.util.TimeZone timeZone81 = null;
        org.joda.time.DateTimeZone dateTimeZone82 = org.joda.time.DateTimeZone.forTimeZone(timeZone81);
        org.joda.time.chrono.GJChronology gJChronology83 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone82);
        org.joda.time.DateTimeField dateTimeField84 = gJChronology83.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField85 = gJChronology83.weekyearOfCentury();
        org.joda.time.Instant instant86 = gJChronology83.getGregorianCutover();
        org.joda.time.Instant instant88 = instant86.withMillis(0L);
        org.joda.time.chrono.GJChronology gJChronology90 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone68, (org.joda.time.ReadableInstant) instant86, 4);
        org.joda.time.Instant instant92 = instant86.minus((-2208729599948L));
        boolean boolean93 = instant56.isEqual((org.joda.time.ReadableInstant) instant86);
        org.joda.time.ReadableDuration readableDuration94 = null;
        org.joda.time.Instant instant96 = instant86.withDurationAdded(readableDuration94, (int) (short) 1);
        int int97 = dateTimeZone54.getOffset((org.joda.time.ReadableInstant) instant86);
        org.joda.time.Chronology chronology98 = gJChronology43.withZone(dateTimeZone54);
        org.joda.time.DateTimeField dateTimeField99 = gJChronology43.dayOfYear();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(gJChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(gJChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "GJChronology[UTC]" + "'", str16, "GJChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str22, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str26, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str27, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertNotNull(instant30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(instant36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(instant42);
        org.junit.Assert.assertNotNull(gJChronology43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(durationField45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(durationField47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertNotNull(gJChronology51);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertNotNull(dateTimeZone54);
        org.junit.Assert.assertNotNull(dateTimeZone58);
        org.junit.Assert.assertNotNull(gJChronology59);
        org.junit.Assert.assertNotNull(dateTimeField60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 52 + "'", int61 == 52);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str64, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertNotNull(instant66);
        org.junit.Assert.assertNotNull(dateTimeZone68);
        org.junit.Assert.assertNotNull(gJChronology69);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + (-1L) + "'", long73 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "\u4e2d\u6587" + "'", str78, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "zh" + "'", str79, "zh");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "+00:00" + "'", str80, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone82);
        org.junit.Assert.assertNotNull(gJChronology83);
        org.junit.Assert.assertNotNull(dateTimeField84);
        org.junit.Assert.assertNotNull(dateTimeField85);
        org.junit.Assert.assertNotNull(instant86);
        org.junit.Assert.assertNotNull(instant88);
        org.junit.Assert.assertNotNull(gJChronology90);
        org.junit.Assert.assertNotNull(instant92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(instant96);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 0 + "'", int97 == 0);
        org.junit.Assert.assertNotNull(chronology98);
        org.junit.Assert.assertNotNull(dateTimeField99);
    }

    @Test
    public void test23159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23159");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.year();
        org.joda.time.DurationField durationField10 = gJChronology2.millis();
        org.joda.time.DurationField durationField11 = gJChronology2.seconds();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology2.secondOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test23160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23160");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1, 10);
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        long long8 = dateTimeZone2.convertLocalToUTC((-26438399999L), false, (long) 10);
        long long11 = dateTimeZone2.convertLocalToUTC(120L, true);
        java.util.TimeZone timeZone12 = dateTimeZone2.toTimeZone();
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField14 = gJChronology13.hourOfHalfday();
        java.lang.String str15 = gJChronology13.toString();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology13.clockhourOfDay();
        org.joda.time.DurationField durationField17 = gJChronology13.halfdays();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology13.clockhourOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-26442599999L) + "'", long8 == (-26442599999L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-4199880L) + "'", long11 == (-4199880L));
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "GMT+01:10");
        org.junit.Assert.assertNotNull(gJChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "GJChronology[+01:10]" + "'", str15, "GJChronology[+01:10]");
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test23161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23161");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean9 = gJChronology2.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology2.clockhourOfHalfday();
        org.joda.time.DurationField durationField14 = gJChronology2.weekyears();
        org.joda.time.DurationField durationField15 = gJChronology2.weekyears();
        org.joda.time.DurationField durationField16 = gJChronology2.months();
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        org.joda.time.chrono.GJChronology gJChronology19 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone18);
        org.joda.time.DurationField durationField20 = gJChronology19.halfdays();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology19.millisOfDay();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology19.minuteOfDay();
        org.joda.time.DurationField durationField23 = gJChronology19.centuries();
        org.joda.time.DateTimeField dateTimeField24 = gJChronology19.yearOfCentury();
        org.joda.time.DurationField durationField25 = gJChronology19.millis();
        boolean boolean26 = durationField25.isPrecise();
        boolean boolean27 = durationField25.isPrecise();
        long long30 = durationField25.getMillis((-3600011), 65200L);
        int int31 = durationField16.compareTo(durationField25);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(gJChronology19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-3600011L) + "'", long30 == (-3600011L));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
    }

    @Test
    public void test23162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23162");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((java.lang.Object) 3732479999999948L);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology4.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology4.weekyearOfCentury();
        org.joda.time.Instant instant7 = gJChronology4.getGregorianCutover();
        org.joda.time.Instant instant9 = instant7.withMillis(0L);
        org.joda.time.Instant instant11 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField15 = gJChronology14.millisOfSecond();
        int int16 = instant11.get(dateTimeField15);
        org.joda.time.Instant instant18 = instant11.plus(0L);
        int int19 = instant9.compareTo((org.joda.time.ReadableInstant) instant18);
        org.joda.time.Instant instant21 = new org.joda.time.Instant(52L);
        boolean boolean22 = instant21.isEqualNow();
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.Instant instant24 = instant21.plus(readableDuration23);
        boolean boolean26 = instant24.equals((java.lang.Object) ' ');
        boolean boolean27 = instant18.isEqual((org.joda.time.ReadableInstant) instant24);
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.Instant instant30 = instant18.withDurationAdded(readableDuration28, 0);
        int int31 = instant1.compareTo((org.joda.time.ReadableInstant) instant18);
        org.joda.time.DateTimeZone dateTimeZone32 = instant18.getZone();
        org.joda.time.DateTime dateTime33 = instant18.toDateTime();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(gJChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertNotNull(instant18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(instant30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(dateTime33);
    }

    @Test
    public void test23163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23163");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        long long6 = dateTimeZone1.convertLocalToUTC((long) (byte) -1, true, 0L);
        boolean boolean8 = dateTimeZone1.equals((java.lang.Object) true);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology9.weekyear();
        java.lang.String str11 = gJChronology9.toString();
        long long15 = gJChronology9.add((long) 120, (-330912000462910L), 0);
        org.joda.time.DateTimeField dateTimeField16 = gJChronology9.yearOfEra();
        org.joda.time.Chronology chronology17 = gJChronology9.withUTC();
        org.joda.time.DurationField durationField18 = gJChronology9.hours();
        long long20 = durationField18.getMillis((-98L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(gJChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "GJChronology[UTC]" + "'", str11, "GJChronology[UTC]");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 120L + "'", long15 == 120L);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-352800000L) + "'", long20 == (-352800000L));
    }

    @Test
    public void test23164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23164");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.secondOfMinute();
        org.joda.time.Instant instant11 = new org.joda.time.Instant(52L);
        boolean boolean12 = instant11.isEqualNow();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.Instant instant14 = instant11.plus(readableDuration13);
        boolean boolean15 = gJChronology2.equals((java.lang.Object) instant11);
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.Instant instant18 = instant11.withDurationAdded(readableDuration16, 52);
        java.util.TimeZone timeZone19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        org.joda.time.chrono.GJChronology gJChronology21 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone20);
        org.joda.time.DurationField durationField22 = gJChronology21.halfdays();
        long long26 = gJChronology21.add((long) 'a', (-1L), (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField27 = gJChronology21.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField28 = gJChronology21.secondOfMinute();
        org.joda.time.Instant instant30 = new org.joda.time.Instant(52L);
        boolean boolean31 = instant30.isEqualNow();
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.Instant instant33 = instant30.plus(readableDuration32);
        boolean boolean34 = gJChronology21.equals((java.lang.Object) instant30);
        long long35 = instant30.getMillis();
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.Instant instant38 = instant30.withDurationAdded(readableDuration36, 10);
        boolean boolean39 = instant18.isAfter((org.joda.time.ReadableInstant) instant30);
        org.joda.time.Instant instant42 = instant18.withDurationAdded(0L, (int) (byte) -1);
        org.joda.time.DateTime dateTime43 = instant42.toDateTime();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(instant18);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(gJChronology21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 97L + "'", long26 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(instant33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 52L + "'", long35 == 52L);
        org.junit.Assert.assertNotNull(instant38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(instant42);
        org.junit.Assert.assertNotNull(dateTime43);
    }

    @Test
    public void test23165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23165");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.millisOfSecond();
        org.joda.time.Chronology chronology8 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.monthOfYear();
        org.joda.time.Chronology chronology13 = gJChronology2.withUTC();
        java.lang.String str14 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology2.centuryOfEra();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "GJChronology[UTC]" + "'", str14, "GJChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test23166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23166");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean9 = gJChronology2.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.dayOfMonth();
        org.joda.time.DurationField durationField11 = gJChronology2.days();
        long long15 = gJChronology2.add((long) '4', 432000000L, (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField16 = gJChronology2.yearOfEra();
        org.joda.time.DurationField durationField17 = gJChronology2.months();
        org.joda.time.DurationField durationField18 = gJChronology2.weekyears();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 52L + "'", long15 == 52L);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(durationField18);
    }

    @Test
    public void test23167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23167");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.millisOfSecond();
        org.joda.time.DurationField durationField4 = gJChronology2.millis();
        org.joda.time.DurationField durationField5 = gJChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.hourOfHalfday();
        org.joda.time.DurationField durationField8 = gJChronology2.days();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone11 = gJChronology2.getZone();
        java.lang.String str13 = dateTimeZone11.getShortName(315569563200000L);
        java.lang.String str15 = dateTimeZone11.getName(181025280000000000L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11, 255138600000L, 328332);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 328332");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
    }

    @Test
    public void test23168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23168");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.monthOfYear();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test23169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23169");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.era();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.centuryOfEra();
        org.joda.time.DurationField durationField5 = gJChronology2.hours();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.dayOfWeek();
        org.joda.time.Chronology chronology8 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField9 = gJChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.secondOfMinute();
        org.joda.time.Chronology chronology11 = gJChronology2.withUTC();
        org.joda.time.Chronology chronology12 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology2.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology2.hourOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test23170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23170");
        java.util.Locale locale2 = new java.util.Locale("+52:00", "");
        java.lang.String str3 = locale2.getDisplayName();
        java.lang.String str4 = locale2.toLanguageTag();
        java.lang.String str5 = locale2.getScript();
        org.junit.Assert.assertEquals(locale2.toString(), "+52:00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+52:00" + "'", str3, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "und" + "'", str4, "und");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test23171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23171");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'u', 24);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone2, (-1431201L), (-1020));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: -1020");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test23172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23172");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.millisOfSecond();
        org.joda.time.DurationField durationField4 = gJChronology2.millis();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = gJChronology2.add(readablePeriod5, (long) 'a', (int) '4');
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.dayOfWeek();
        java.lang.String str10 = gJChronology2.toString();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = gJChronology2.add(readablePeriod11, 1000L, 73050);
        org.joda.time.DurationField durationField15 = gJChronology2.weekyears();
        org.joda.time.DurationField durationField16 = gJChronology2.weeks();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology2.halfdayOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "GJChronology[UTC]" + "'", str10, "GJChronology[UTC]");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1000L + "'", long14 == 1000L);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test23173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23173");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.CANADA;
        java.lang.String str2 = locale1.getISO3Language();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale4 = java.util.Locale.getDefault(category0);
        java.util.Locale locale5 = java.util.Locale.getDefault(category0);
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleAttributes();
        java.util.Locale locale8 = new java.util.Locale("hi!");
        java.lang.String str9 = locale8.getCountry();
        java.util.Locale locale10 = java.util.Locale.getDefault();
        java.lang.String str11 = locale10.getDisplayName();
        java.lang.String str12 = locale8.getDisplayScript(locale10);
        java.util.Set<java.lang.Character> charSet13 = locale10.getExtensionKeys();
        java.util.Set<java.lang.String> strSet14 = locale10.getUnicodeLocaleAttributes();
        java.util.Locale locale15 = java.util.Locale.JAPAN;
        java.lang.String str16 = locale15.getCountry();
        java.util.Set<java.lang.String> strSet17 = locale15.getUnicodeLocaleKeys();
        java.lang.String str18 = locale10.getDisplayCountry(locale15);
        java.lang.String str19 = locale5.getDisplayScript(locale15);
        java.util.Locale locale21 = java.util.Locale.forLanguageTag("GJChronology[+00:10]");
        java.lang.String str22 = locale21.getDisplayVariant();
        java.lang.String str23 = locale15.getDisplayCountry(locale21);
        java.util.TimeZone timeZone24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        org.joda.time.chrono.GJChronology gJChronology26 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone25);
        org.joda.time.DateTimeField dateTimeField27 = gJChronology26.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField28 = gJChronology26.weekyearOfCentury();
        org.joda.time.Instant instant29 = gJChronology26.getGregorianCutover();
        org.joda.time.Instant instant31 = instant29.withMillis(0L);
        org.joda.time.Instant instant33 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone34 = null;
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forTimeZone(timeZone34);
        org.joda.time.chrono.GJChronology gJChronology36 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone35);
        org.joda.time.DateTimeField dateTimeField37 = gJChronology36.millisOfSecond();
        int int38 = instant33.get(dateTimeField37);
        org.joda.time.Instant instant40 = instant33.plus(0L);
        int int41 = instant31.compareTo((org.joda.time.ReadableInstant) instant40);
        org.joda.time.Instant instant43 = new org.joda.time.Instant(52L);
        boolean boolean44 = instant43.isEqualNow();
        org.joda.time.ReadableDuration readableDuration45 = null;
        org.joda.time.Instant instant46 = instant43.plus(readableDuration45);
        boolean boolean48 = instant46.equals((java.lang.Object) ' ');
        boolean boolean49 = instant40.isEqual((org.joda.time.ReadableInstant) instant46);
        org.joda.time.ReadableDuration readableDuration50 = null;
        org.joda.time.Instant instant52 = instant40.withDurationAdded(readableDuration50, 0);
        org.joda.time.ReadableDuration readableDuration53 = null;
        org.joda.time.Instant instant55 = instant40.withDurationAdded(readableDuration53, 73050);
        java.util.Locale locale56 = java.util.Locale.FRENCH;
        java.util.Locale locale57 = java.util.Locale.getDefault();
        boolean boolean58 = locale57.hasExtensions();
        java.lang.String str59 = locale56.getDisplayLanguage(locale57);
        java.util.Locale locale60 = java.util.Locale.ITALIAN;
        java.util.Locale locale61 = locale60.stripExtensions();
        java.lang.String str62 = locale57.getDisplayScript(locale60);
        java.util.Locale locale63 = java.util.Locale.getDefault();
        java.lang.String str64 = locale63.getDisplayName();
        java.util.Locale locale65 = java.util.Locale.CHINESE;
        boolean boolean66 = locale65.hasExtensions();
        java.util.Locale.setDefault(locale65);
        java.lang.String str68 = locale65.getCountry();
        java.lang.String str69 = locale63.getDisplayScript(locale65);
        java.util.TimeZone timeZone70 = null;
        org.joda.time.DateTimeZone dateTimeZone71 = org.joda.time.DateTimeZone.forTimeZone(timeZone70);
        org.joda.time.chrono.GJChronology gJChronology72 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone71);
        org.joda.time.DurationField durationField73 = gJChronology72.halfdays();
        long long77 = gJChronology72.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean79 = gJChronology72.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField80 = gJChronology72.dayOfMonth();
        org.joda.time.DurationField durationField81 = gJChronology72.days();
        org.joda.time.DateTimeZone dateTimeZone82 = gJChronology72.getZone();
        java.lang.String str83 = dateTimeZone82.toString();
        java.util.Locale locale85 = java.util.Locale.FRENCH;
        java.util.Locale locale86 = java.util.Locale.getDefault();
        boolean boolean87 = locale86.hasExtensions();
        java.lang.String str88 = locale85.getDisplayLanguage(locale86);
        boolean boolean89 = locale86.hasExtensions();
        java.lang.String str90 = dateTimeZone82.getName((-61827739199999L), locale86);
        java.lang.String str91 = locale65.getDisplayName(locale86);
        java.lang.String str92 = locale60.getDisplayName(locale65);
        boolean boolean93 = instant55.equals((java.lang.Object) locale60);
        java.lang.String str94 = locale60.getDisplayLanguage();
        java.lang.String str95 = locale21.getDisplayName(locale60);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "eng" + "'", str2, "eng");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_CA");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals(locale8.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Chinese" + "'", str11, "Chinese");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charSet13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "JP" + "'", str16, "JP");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Japan" + "'", str23, "Japan");
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(gJChronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(instant29);
        org.junit.Assert.assertNotNull(instant31);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertNotNull(gJChronology36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 52 + "'", int38 == 52);
        org.junit.Assert.assertNotNull(instant40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(instant46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(instant52);
        org.junit.Assert.assertNotNull(instant55);
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "fr");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "zh");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "\u6cd5\u6587" + "'", str59, "\u6cd5\u6587");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "it");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "it");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Chinese" + "'", str64, "Chinese");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "zh");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNotNull(dateTimeZone71);
        org.junit.Assert.assertNotNull(gJChronology72);
        org.junit.Assert.assertNotNull(durationField73);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 97L + "'", long77 == 97L);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(dateTimeField80);
        org.junit.Assert.assertNotNull(durationField81);
        org.junit.Assert.assertNotNull(dateTimeZone82);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "UTC" + "'", str83, "UTC");
        org.junit.Assert.assertNotNull(locale85);
        org.junit.Assert.assertEquals(locale85.toString(), "fr");
        org.junit.Assert.assertNotNull(locale86);
        org.junit.Assert.assertEquals(locale86.toString(), "zh");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "\u6cd5\u6587" + "'", str88, "\u6cd5\u6587");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "+00:00" + "'", str90, "+00:00");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "\u4e2d\u6587" + "'", str91, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "\u610f\u5927\u5229\u6587" + "'", str92, "\u610f\u5927\u5229\u6587");
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "\u610f\u5927\u5229\u6587" + "'", str94, "\u610f\u5927\u5229\u6587");
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "" + "'", str95, "");
    }

    @Test
    public void test23174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23174");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfWeek();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test23175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23175");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.removeUnicodeLocaleAttribute("und");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale locale6 = builder4.build();
        java.util.Locale.Builder builder8 = builder4.setLanguageTag("en-US");
        java.util.Locale.Builder builder10 = builder4.addUnicodeLocaleAttribute("deu");
        java.util.Locale locale11 = builder10.build();
        java.util.Locale.Builder builder14 = builder10.setExtension('x', "de");
        java.util.Locale.Builder builder16 = builder14.setLanguageTag("en-GB");
        java.util.Locale.Builder builder17 = builder14.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder19 = builder14.addUnicodeLocaleAttribute("1970-01-01T00:00:00.087+00:00:00.052");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 1970-01-01T00:00:00.087+00:00:00.052 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US_#u-deu");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test23176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23176");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap5 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList6 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList4, strMap5);
        java.util.Locale locale7 = java.util.Locale.CHINA;
        java.lang.String str8 = locale7.toLanguageTag();
        java.util.Set<java.lang.String> strSet9 = locale7.getUnicodeLocaleAttributes();
        java.lang.String str10 = java.util.Locale.lookupTag(languageRangeList6, (java.util.Collection<java.lang.String>) strSet9);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap11 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList12 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList6, strMap11);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap13 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList14 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList12, strMap13);
        java.util.Collection<java.lang.String> strCollection15 = null;
        java.lang.String str16 = java.util.Locale.lookupTag(languageRangeList12, strCollection15);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap17 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList18 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList12, strMap17);
        java.util.Collection<java.util.Locale> localeCollection19 = null;
        java.util.List<java.util.Locale> localeList20 = java.util.Locale.filter(languageRangeList12, localeCollection19);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap22 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList23 = java.util.Locale.LanguageRange.parse("DE", strMap22);
        java.util.Locale.LanguageRange[] languageRangeArray24 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList25 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList25, languageRangeArray24);
        java.util.Set<java.lang.String> strSet27 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.String str28 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList25, (java.util.Collection<java.lang.String>) strSet27);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap29 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList30 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList25, strMap29);
        java.util.Locale.LanguageRange[] languageRangeArray31 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList32 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList32, languageRangeArray31);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap34 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList35 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList32, strMap34);
        java.lang.String[] strArray39 = new java.lang.String[] { "English", "English", "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        java.util.List<java.lang.String> strList42 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList32, (java.util.Collection<java.lang.String>) strList40);
        java.util.Locale.FilteringMode filteringMode43 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList44 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList25, (java.util.Collection<java.lang.String>) strList40, filteringMode43);
        java.util.Locale.LanguageRange[] languageRangeArray45 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList46 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList46, languageRangeArray45);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap48 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList49 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList46, strMap48);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap50 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList51 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList49, strMap50);
        java.util.Locale.LanguageRange[] languageRangeArray52 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList53 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList53, languageRangeArray52);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap55 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList56 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList53, strMap55);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap57 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList58 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList56, strMap57);
        java.util.Locale.LanguageRange[] languageRangeArray59 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList60 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList60, languageRangeArray59);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap62 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList63 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList60, strMap62);
        java.lang.String[] strArray67 = new java.lang.String[] { "English", "English", "hi!" };
        java.util.ArrayList<java.lang.String> strList68 = new java.util.ArrayList<java.lang.String>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList68, strArray67);
        java.util.List<java.lang.String> strList70 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList60, (java.util.Collection<java.lang.String>) strList68);
        java.util.Locale.FilteringMode filteringMode71 = null;
        java.util.List<java.lang.String> strList72 = java.util.Locale.filterTags(languageRangeList58, (java.util.Collection<java.lang.String>) strList68, filteringMode71);
        java.util.Locale.LanguageRange[] languageRangeArray73 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList74 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList74, languageRangeArray73);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap76 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList77 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList74, strMap76);
        java.util.Locale.LanguageRange[] languageRangeArray78 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList79 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList79, languageRangeArray78);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap81 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList82 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList79, strMap81);
        java.lang.String[] strArray86 = new java.lang.String[] { "English", "English", "hi!" };
        java.util.ArrayList<java.lang.String> strList87 = new java.util.ArrayList<java.lang.String>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList87, strArray86);
        java.util.List<java.lang.String> strList89 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList79, (java.util.Collection<java.lang.String>) strList87);
        java.util.List<java.lang.String> strList90 = java.util.Locale.filterTags(languageRangeList77, (java.util.Collection<java.lang.String>) strList89);
        java.util.List<java.lang.String> strList91 = java.util.Locale.filterTags(languageRangeList58, (java.util.Collection<java.lang.String>) strList90);
        java.util.List<java.lang.String> strList92 = java.util.Locale.filterTags(languageRangeList49, (java.util.Collection<java.lang.String>) strList90);
        java.util.List<java.lang.String> strList93 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList25, (java.util.Collection<java.lang.String>) strList90);
        java.util.List<java.lang.String> strList94 = java.util.Locale.filterTags(languageRangeList23, (java.util.Collection<java.lang.String>) strList90);
        java.lang.String str95 = java.util.Locale.lookupTag(languageRangeList12, (java.util.Collection<java.lang.String>) strList94);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeList6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh-CN" + "'", str8, "zh-CN");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(languageRangeList12);
        org.junit.Assert.assertNotNull(languageRangeList14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(languageRangeList18);
        org.junit.Assert.assertNotNull(localeList20);
        org.junit.Assert.assertNotNull(languageRangeList23);
        org.junit.Assert.assertNotNull(languageRangeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(languageRangeList30);
        org.junit.Assert.assertNotNull(languageRangeArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(languageRangeList35);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertTrue("'" + filteringMode43 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode43.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertNotNull(languageRangeArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(languageRangeList49);
        org.junit.Assert.assertNotNull(languageRangeList51);
        org.junit.Assert.assertNotNull(languageRangeArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(languageRangeList56);
        org.junit.Assert.assertNotNull(languageRangeList58);
        org.junit.Assert.assertNotNull(languageRangeArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(languageRangeList63);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(strList70);
        org.junit.Assert.assertNotNull(strList72);
        org.junit.Assert.assertNotNull(languageRangeArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(languageRangeList77);
        org.junit.Assert.assertNotNull(languageRangeArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(languageRangeList82);
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(strList89);
        org.junit.Assert.assertNotNull(strList90);
        org.junit.Assert.assertNotNull(strList91);
        org.junit.Assert.assertNotNull(strList92);
        org.junit.Assert.assertNotNull(strList93);
        org.junit.Assert.assertNotNull(strList94);
        org.junit.Assert.assertNull(str95);
    }

    @Test
    public void test23177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23177");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        int int3 = dateTimeZone1.getOffsetFromLocal((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (short) 10);
        long long8 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (-61827926399999L));
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.lang.String str12 = dateTimeZone10.getNameKey((long) 100);
        boolean boolean13 = dateTimeZone10.isFixed();
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone10);
        long long16 = dateTimeZone10.convertUTCToLocal(5200L);
        java.util.Locale.LanguageRange[] languageRangeArray17 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList18 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18, languageRangeArray17);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap20 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList21 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, strMap20);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap22 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList23 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList21, strMap22);
        java.util.Locale.LanguageRange[] languageRangeArray24 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList25 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList25, languageRangeArray24);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap27 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList28 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList25, strMap27);
        java.lang.String[] strArray32 = new java.lang.String[] { "English", "English", "hi!" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        java.util.List<java.lang.String> strList35 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList25, (java.util.Collection<java.lang.String>) strList33);
        java.util.Locale.FilteringMode filteringMode36 = null;
        java.util.List<java.lang.String> strList37 = java.util.Locale.filterTags(languageRangeList23, (java.util.Collection<java.lang.String>) strList33, filteringMode36);
        java.util.Locale.LanguageRange[] languageRangeArray38 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList39 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList39, languageRangeArray38);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap41 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList42 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList39, strMap41);
        java.util.Locale.LanguageRange[] languageRangeArray43 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList44 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList44, languageRangeArray43);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap46 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList47 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList44, strMap46);
        java.lang.String[] strArray51 = new java.lang.String[] { "English", "English", "hi!" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        java.util.List<java.lang.String> strList54 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList44, (java.util.Collection<java.lang.String>) strList52);
        java.util.List<java.lang.String> strList55 = java.util.Locale.filterTags(languageRangeList42, (java.util.Collection<java.lang.String>) strList54);
        java.util.List<java.lang.String> strList56 = java.util.Locale.filterTags(languageRangeList23, (java.util.Collection<java.lang.String>) strList55);
        java.util.Locale.LanguageRange[] languageRangeArray57 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList58 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList58, languageRangeArray57);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap60 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList61 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList58, strMap60);
        java.lang.String[] strArray65 = new java.lang.String[] { "English", "English", "hi!" };
        java.util.ArrayList<java.lang.String> strList66 = new java.util.ArrayList<java.lang.String>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList66, strArray65);
        java.util.List<java.lang.String> strList68 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList58, (java.util.Collection<java.lang.String>) strList66);
        java.util.List<java.lang.String> strList69 = java.util.Locale.filterTags(languageRangeList23, (java.util.Collection<java.lang.String>) strList68);
        boolean boolean70 = dateTimeZone10.equals((java.lang.Object) languageRangeList23);
        long long72 = dateTimeZone1.getMillisKeepLocal(dateTimeZone10, (long) 'u');
        java.util.TimeZone timeZone74 = null;
        org.joda.time.DateTimeZone dateTimeZone75 = org.joda.time.DateTimeZone.forTimeZone(timeZone74);
        org.joda.time.chrono.GJChronology gJChronology76 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone75);
        org.joda.time.DurationField durationField77 = gJChronology76.halfdays();
        java.util.TimeZone timeZone78 = null;
        org.joda.time.DateTimeZone dateTimeZone79 = org.joda.time.DateTimeZone.forTimeZone(timeZone78);
        org.joda.time.chrono.GJChronology gJChronology80 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone79);
        long long84 = dateTimeZone79.convertLocalToUTC((long) (byte) -1, true, 0L);
        boolean boolean86 = dateTimeZone79.equals((java.lang.Object) true);
        org.joda.time.Chronology chronology87 = gJChronology76.withZone(dateTimeZone79);
        org.joda.time.LocalDateTime localDateTime88 = null;
        boolean boolean89 = dateTimeZone79.isLocalDateTimeGap(localDateTime88);
        org.joda.time.chrono.GJChronology gJChronology90 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone79);
        java.util.Locale locale92 = java.util.Locale.KOREA;
        java.lang.String str93 = dateTimeZone79.getName(4492800100L, locale92);
        java.lang.String str94 = dateTimeZone1.getShortName(5185792L, locale92);
        java.lang.String str95 = locale92.getVariant();
        java.lang.String str96 = locale92.getDisplayVariant();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-61827926999999L) + "'", long8 == (-61827926999999L));
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 5200L + "'", long16 == 5200L);
        org.junit.Assert.assertNotNull(languageRangeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(languageRangeList21);
        org.junit.Assert.assertNotNull(languageRangeList23);
        org.junit.Assert.assertNotNull(languageRangeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(languageRangeList28);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertNotNull(languageRangeArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(languageRangeList42);
        org.junit.Assert.assertNotNull(languageRangeArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(languageRangeList47);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertNotNull(strList55);
        org.junit.Assert.assertNotNull(strList56);
        org.junit.Assert.assertNotNull(languageRangeArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(languageRangeList61);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(strList68);
        org.junit.Assert.assertNotNull(strList69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 117L + "'", long72 == 117L);
        org.junit.Assert.assertNotNull(dateTimeZone75);
        org.junit.Assert.assertNotNull(gJChronology76);
        org.junit.Assert.assertNotNull(durationField77);
        org.junit.Assert.assertNotNull(dateTimeZone79);
        org.junit.Assert.assertNotNull(gJChronology80);
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + (-1L) + "'", long84 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(chronology87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(gJChronology90);
        org.junit.Assert.assertNotNull(locale92);
        org.junit.Assert.assertEquals(locale92.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "+00:00" + "'", str93, "+00:00");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "+00:00" + "'", str94, "+00:00");
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "" + "'", str95, "");
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "" + "'", str96, "");
    }

    @Test
    public void test23178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23178");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        boolean boolean1 = locale0.hasExtensions();
        java.lang.String str3 = locale0.getExtension('a');
        boolean boolean4 = locale0.hasExtensions();
        java.util.Locale locale5 = java.util.Locale.GERMANY;
        java.lang.String str6 = locale5.getDisplayLanguage();
        java.lang.String str7 = locale5.getISO3Language();
        java.lang.String str8 = locale0.getDisplayScript(locale5);
        java.util.Locale locale9 = locale5.stripExtensions();
        java.lang.String str10 = locale5.getDisplayName();
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str13 = locale12.toLanguageTag();
        java.lang.String str14 = locale12.getCountry();
        java.lang.String str15 = locale12.getDisplayName();
        java.lang.String str16 = locale12.toLanguageTag();
        java.util.Locale locale18 = new java.util.Locale("ZH_TW");
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1, 10);
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long25 = dateTimeZone21.getMillisKeepLocal(dateTimeZone23, 4320000000L);
        java.util.TimeZone timeZone26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        java.lang.String str29 = dateTimeZone27.getNameKey((long) 100);
        boolean boolean30 = dateTimeZone27.isFixed();
        java.lang.String str31 = dateTimeZone27.toString();
        java.lang.String str32 = dateTimeZone27.getID();
        long long34 = dateTimeZone23.getMillisKeepLocal(dateTimeZone27, (long) (byte) -1);
        java.util.Locale locale36 = java.util.Locale.getDefault();
        boolean boolean37 = locale36.hasExtensions();
        java.lang.String str38 = dateTimeZone27.getName((-99L), locale36);
        boolean boolean39 = locale36.hasExtensions();
        java.lang.String str40 = locale18.getDisplayLanguage(locale36);
        java.lang.String str41 = locale12.getDisplayName(locale18);
        java.lang.String str42 = locale5.getDisplayScript(locale12);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u5fb7\u6587" + "'", str6, "\u5fb7\u6587");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "deu" + "'", str7, "deu");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u5fb7\u6587\u5fb7\u56fd)" + "'", str10, "\u5fb7\u6587\u5fb7\u56fd)");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "und" + "'", str13, "und");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "und" + "'", str16, "und");
        org.junit.Assert.assertEquals(locale18.toString(), "zh_tw");
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 4324200000L + "'", long25 == 4324200000L);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "UTC" + "'", str29, "UTC");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "UTC" + "'", str31, "UTC");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "UTC" + "'", str32, "UTC");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-1L) + "'", long34 == (-1L));
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+00:00" + "'", str38, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "zh_tw" + "'", str40, "zh_tw");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test23179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23179");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        long long11 = gJChronology2.add((long) (byte) 0, (long) '4', 100);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.weekyearOfCentury();
        java.lang.String str13 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology2.hourOfHalfday();
        org.joda.time.DurationField durationField15 = gJChronology2.hours();
        org.joda.time.ReadablePartial readablePartial16 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long18 = gJChronology2.set(readablePartial16, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5200L + "'", long11 == 5200L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "GJChronology[UTC]" + "'", str13, "GJChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test23180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23180");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone9 = gJChronology2.getZone();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = gJChronology2.get(readablePeriod10, 0L, 198724382753400L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
    }

    @Test
    public void test23181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23181");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 100);
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        int int6 = gJChronology5.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology5.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = gJChronology5.add(readablePeriod8, (long) (short) -1, (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology5.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology5.minuteOfDay();
        java.lang.String str14 = gJChronology5.toString();
        org.joda.time.DurationField durationField15 = gJChronology5.halfdays();
        org.joda.time.DateTimeZone dateTimeZone16 = gJChronology5.getZone();
        org.joda.time.DateTimeZone dateTimeZone17 = gJChronology5.getZone();
        org.joda.time.DateTimeZone dateTimeZone18 = gJChronology5.getZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "GJChronology[UTC]" + "'", str14, "GJChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
    }

    @Test
    public void test23182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23182");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        long long11 = gJChronology2.add((long) (byte) 0, (long) '4', 100);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology2.year();
        org.joda.time.DurationField durationField14 = gJChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology2.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology2.era();
        org.joda.time.DurationField durationField20 = gJChronology2.halfdays();
        // The following exception was thrown during execution in test generation
        try {
            long long23 = durationField20.getMillis((-53038108800000L), (-5007297052800000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -53038108800000 * 43200000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5200L + "'", long11 == 5200L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
    }

    @Test
    public void test23183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23183");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology4.millisOfSecond();
        int int6 = instant1.get(dateTimeField5);
        org.joda.time.Instant instant8 = instant1.plus(0L);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone10);
        org.joda.time.DurationField durationField12 = gJChronology11.halfdays();
        org.joda.time.Chronology chronology13 = gJChronology11.withUTC();
        java.lang.String str14 = gJChronology11.toString();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology11.hourOfHalfday();
        int int16 = instant1.get(dateTimeField15);
        org.joda.time.Instant instant18 = new org.joda.time.Instant(52L);
        boolean boolean19 = instant18.isEqualNow();
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.Instant instant21 = instant18.plus(readableDuration20);
        org.joda.time.Instant instant23 = new org.joda.time.Instant(52L);
        org.joda.time.Instant instant25 = instant23.withMillis((long) 'u');
        boolean boolean26 = instant18.isBefore((org.joda.time.ReadableInstant) instant23);
        boolean boolean27 = instant1.isEqual((org.joda.time.ReadableInstant) instant23);
        org.joda.time.Chronology chronology28 = instant23.getChronology();
        long long32 = chronology28.add((-3151353599998L), 12L, 28800052);
        org.joda.time.DateTimeField dateTimeField33 = chronology28.millisOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(gJChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(gJChronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "GJChronology[UTC]" + "'", str14, "GJChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(instant21);
        org.junit.Assert.assertNotNull(instant25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-3151007999374L) + "'", long32 == (-3151007999374L));
        org.junit.Assert.assertNotNull(dateTimeField33);
    }

    @Test
    public void test23184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23184");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getCountry();
        java.lang.String str3 = locale1.getScript();
        java.util.Locale locale4 = java.util.Locale.ITALIAN;
        java.util.Locale locale5 = locale4.stripExtensions();
        java.util.Locale locale6 = java.util.Locale.CANADA;
        java.lang.String str7 = locale4.getDisplayVariant(locale6);
        java.lang.String str8 = locale1.getDisplayScript(locale4);
        java.lang.String str9 = locale1.getVariant();
        java.lang.String str10 = locale1.getDisplayVariant();
        java.lang.String str12 = locale1.getExtension('x');
        java.util.Locale.setDefault(locale1);
        java.util.Locale locale15 = new java.util.Locale("1970-01-01T01:00:00.000Z");
        java.util.Locale.Builder builder16 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder17 = builder16.clear();
        java.util.Locale.Builder builder19 = builder17.removeUnicodeLocaleAttribute("und");
        java.util.Locale locale20 = builder19.build();
        java.lang.String str21 = locale20.getDisplayName();
        java.util.Locale locale22 = java.util.Locale.ITALIAN;
        java.util.Locale locale23 = locale22.stripExtensions();
        java.lang.String str24 = locale22.getDisplayVariant();
        java.util.Set<java.lang.String> strSet25 = locale22.getUnicodeLocaleKeys();
        java.lang.String str26 = locale20.getDisplayName(locale22);
        java.lang.String str27 = locale22.toLanguageTag();
        java.lang.String str28 = locale15.getDisplayScript(locale22);
        java.lang.String str29 = locale1.getDisplayVariant(locale22);
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals(locale15.toString(), "1970-01-01t01:00:00.000z");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "it");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "it");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "it" + "'", str27, "it");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test23185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23185");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean9 = gJChronology2.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.dayOfMonth();
        org.joda.time.DurationField durationField11 = gJChronology2.seconds();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology2.era();
        org.joda.time.DurationField durationField14 = gJChronology2.minutes();
        long long17 = durationField14.subtract(12L, 360000000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-21599999999988L) + "'", long17 == (-21599999999988L));
    }

    @Test
    public void test23186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23186");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        long long11 = gJChronology2.add((long) (byte) 0, (long) '4', 100);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.weekyearOfCentury();
        org.joda.time.Chronology chronology13 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology2.secondOfDay();
        java.lang.String str16 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology2.weekyearOfCentury();
        long long21 = gJChronology2.add(252380734603L, 2584860000L, 1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5200L + "'", long11 == 5200L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "GJChronology[UTC]" + "'", str16, "GJChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 254965594603L + "'", long21 == 254965594603L);
    }

    @Test
    public void test23187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23187");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("\u82f1\u6587\u52a0\u62ff\u5927)", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=??(???)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test23188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23188");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 100);
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        int int6 = gJChronology5.getMinimumDaysInFirstWeek();
        java.lang.String str7 = gJChronology5.toString();
        org.joda.time.Chronology chronology8 = gJChronology5.withUTC();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology5.weekyearOfCentury();
        org.joda.time.DurationField durationField10 = gJChronology5.weekyears();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology5.monthOfYear();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GJChronology[UTC]" + "'", str7, "GJChronology[UTC]");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test23189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23189");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        boolean boolean2 = instant1.isEqualNow();
        boolean boolean4 = instant1.isEqual(0L);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        boolean boolean6 = instant1.isSupported(dateTimeFieldType5);
        org.joda.time.Instant instant9 = instant1.withDurationAdded((-61827926399999L), (int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone10 = instant1.getZone();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Instant instant13 = instant1.withDurationAdded(readableDuration11, 600000);
        org.joda.time.Instant instant15 = instant1.withMillis((-3155324400000L));
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = null;
        boolean boolean17 = instant1.isSupported(dateTimeFieldType16);
        org.joda.time.Instant instant18 = instant1.toInstant();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(instant18);
    }

    @Test
    public void test23190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23190");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 100);
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        long long9 = gJChronology5.add(43200100L, (long) ' ', 52);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology5.year();
        long long14 = gJChronology5.add(5185792L, 181440000000000L, 1582);
        java.lang.String str15 = gJChronology5.toString();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology5.millisOfDay();
        org.joda.time.DurationField durationField17 = gJChronology5.weekyears();
        org.joda.time.DateTimeZone dateTimeZone18 = gJChronology5.getZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 43201764L + "'", long9 == 43201764L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 287038080005185792L + "'", long14 == 287038080005185792L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "GJChronology[UTC]" + "'", str15, "GJChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
    }

    @Test
    public void test23191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23191");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1, 10);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        long long15 = dateTimeZone11.getMillisKeepLocal(dateTimeZone13, 4320000000L);
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        java.lang.String str19 = dateTimeZone17.getNameKey((long) 100);
        boolean boolean20 = dateTimeZone17.isFixed();
        java.lang.String str21 = dateTimeZone17.toString();
        java.lang.String str22 = dateTimeZone17.getID();
        long long24 = dateTimeZone13.getMillisKeepLocal(dateTimeZone17, (long) (byte) -1);
        org.joda.time.Chronology chronology25 = gJChronology2.withZone(dateTimeZone17);
        org.joda.time.DurationField durationField26 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField27 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField28 = gJChronology2.monthOfYear();
        org.joda.time.DateTimeField dateTimeField29 = gJChronology2.weekOfWeekyear();
        org.joda.time.DurationField durationField30 = gJChronology2.years();
        org.joda.time.DateTimeField dateTimeField31 = gJChronology2.clockhourOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4324200000L + "'", long15 == 4324200000L);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTC" + "'", str19, "UTC");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTC" + "'", str21, "UTC");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTC" + "'", str22, "UTC");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
    }

    @Test
    public void test23192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23192");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.era();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.centuryOfEra();
        org.joda.time.DurationField durationField5 = gJChronology2.hours();
        org.joda.time.DateTimeZone dateTimeZone6 = gJChronology2.getZone();
        org.joda.time.DurationField durationField7 = gJChronology2.millis();
        org.joda.time.DateTimeZone dateTimeZone8 = gJChronology2.getZone();
        org.joda.time.DateTimeZone dateTimeZone9 = gJChronology2.getZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
    }

    @Test
    public void test23193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23193");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("English (Canada)", (double) 111600000L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=1.116E8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test23194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23194");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.millisOfSecond();
        org.joda.time.DurationField durationField4 = gJChronology2.millis();
        org.joda.time.DurationField durationField5 = gJChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.minuteOfDay();
        org.joda.time.DurationField durationField12 = gJChronology2.hours();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test23195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23195");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.centuryOfEra();
        long long13 = gJChronology2.add(4492800100L, 43201764L, 0);
        org.joda.time.Instant instant15 = new org.joda.time.Instant(52L);
        boolean boolean16 = instant15.isEqualNow();
        java.lang.String str17 = instant15.toString();
        java.lang.String str18 = instant15.toString();
        org.joda.time.Instant instant21 = instant15.withDurationAdded(115200000L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone22 = instant15.getZone();
        org.joda.time.Chronology chronology23 = gJChronology2.withZone(dateTimeZone22);
        org.joda.time.chrono.GJChronology gJChronology24 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone22);
        org.joda.time.DateTimeField dateTimeField25 = gJChronology24.era();
        org.joda.time.DurationField durationField26 = gJChronology24.weekyears();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 4492800100L + "'", long13 == 4492800100L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str17, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str18, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertNotNull(instant21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(gJChronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(durationField26);
    }

    @Test
    public void test23196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23196");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean9 = gJChronology2.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.clockhourOfDay();
        long long17 = gJChronology2.getDateTimeMillis(10, (int) (short) 10, 4, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField18 = gJChronology2.millisOfDay();
        java.lang.String str19 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology2.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology2.minuteOfDay();
        org.joda.time.DurationField durationField22 = gJChronology2.seconds();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField24 = gJChronology2.millisOfSecond();
        org.joda.time.DurationField durationField25 = gJChronology2.weeks();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-61827926399999L) + "'", long17 == (-61827926399999L));
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "GJChronology[UTC]" + "'", str19, "GJChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(durationField25);
    }

    @Test
    public void test23197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23197");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale locale2 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str3 = locale0.getDisplayVariant(locale2);
        boolean boolean4 = locale0.hasExtensions();
        java.util.Locale.Category category5 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale6 = java.util.Locale.CANADA;
        java.lang.String str7 = locale6.getISO3Language();
        java.util.Locale.setDefault(category5, locale6);
        java.util.Locale locale11 = new java.util.Locale("UTC", "zh_TW");
        java.util.Locale locale12 = java.util.Locale.CHINESE;
        boolean boolean13 = locale12.hasExtensions();
        java.util.Locale.setDefault(locale12);
        java.lang.String str15 = locale11.getDisplayLanguage(locale12);
        java.lang.String str16 = locale12.getVariant();
        java.lang.String str17 = locale12.getCountry();
        java.util.Locale.setDefault(category5, locale12);
        java.util.Locale locale19 = java.util.Locale.CANADA_FRENCH;
        boolean boolean20 = locale19.hasExtensions();
        java.lang.String str21 = locale19.getDisplayLanguage();
        java.util.Locale.setDefault(category5, locale19);
        java.util.Locale locale26 = new java.util.Locale("\u4e2d\u6587\u53f0\u6e7e\u5730\u533a)", "\u4e2d\u6587\u53f0\u6e7e\u5730\u533a)", "zh_TW");
        java.util.Locale.setDefault(category5, locale26);
        java.util.Locale locale28 = java.util.Locale.getDefault(category5);
        java.util.Locale locale29 = java.util.Locale.ITALIAN;
        java.util.Locale locale30 = locale29.stripExtensions();
        java.util.Locale locale31 = java.util.Locale.CANADA;
        java.lang.String str32 = locale29.getDisplayVariant(locale31);
        java.lang.String str33 = locale31.getDisplayLanguage();
        java.lang.String str34 = locale31.getDisplayCountry();
        java.lang.String str35 = locale31.getDisplayVariant();
        java.util.Locale.setDefault(locale31);
        java.util.Locale locale37 = java.util.Locale.CANADA;
        java.lang.String str38 = locale37.getCountry();
        java.lang.String str39 = locale31.getDisplayVariant(locale37);
        java.util.Locale.setDefault(category5, locale37);
        java.util.Locale locale41 = java.util.Locale.FRENCH;
        java.util.Locale locale42 = java.util.Locale.getDefault();
        boolean boolean43 = locale42.hasExtensions();
        java.lang.String str44 = locale41.getDisplayLanguage(locale42);
        java.util.Locale locale45 = java.util.Locale.ITALIAN;
        java.util.Locale locale46 = locale45.stripExtensions();
        java.lang.String str47 = locale42.getDisplayScript(locale45);
        java.util.Locale locale48 = java.util.Locale.getDefault();
        java.lang.String str49 = locale48.getDisplayName();
        java.util.Locale locale50 = java.util.Locale.CHINESE;
        boolean boolean51 = locale50.hasExtensions();
        java.util.Locale.setDefault(locale50);
        java.lang.String str53 = locale50.getCountry();
        java.lang.String str54 = locale48.getDisplayScript(locale50);
        java.util.TimeZone timeZone55 = null;
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forTimeZone(timeZone55);
        org.joda.time.chrono.GJChronology gJChronology57 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone56);
        org.joda.time.DurationField durationField58 = gJChronology57.halfdays();
        long long62 = gJChronology57.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean64 = gJChronology57.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField65 = gJChronology57.dayOfMonth();
        org.joda.time.DurationField durationField66 = gJChronology57.days();
        org.joda.time.DateTimeZone dateTimeZone67 = gJChronology57.getZone();
        java.lang.String str68 = dateTimeZone67.toString();
        java.util.Locale locale70 = java.util.Locale.FRENCH;
        java.util.Locale locale71 = java.util.Locale.getDefault();
        boolean boolean72 = locale71.hasExtensions();
        java.lang.String str73 = locale70.getDisplayLanguage(locale71);
        boolean boolean74 = locale71.hasExtensions();
        java.lang.String str75 = dateTimeZone67.getName((-61827739199999L), locale71);
        java.lang.String str76 = locale50.getDisplayName(locale71);
        java.lang.String str77 = locale45.getDisplayName(locale50);
        java.lang.String str78 = locale50.getDisplayScript();
        java.lang.String str79 = locale50.getDisplayLanguage();
        java.util.Locale.setDefault(category5, locale50);
        java.lang.String str81 = locale0.getDisplayCountry(locale50);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "German" + "'", str1, "German");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + category5 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category5.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "eng" + "'", str7, "eng");
        org.junit.Assert.assertEquals(locale11.toString(), "utc_ZH_TW");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "utc" + "'", str15, "utc");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr_CA");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\u6cd5\u6587" + "'", str21, "\u6cd5\u6587");
// flaky:         org.junit.Assert.assertEquals(locale26.toString(), "\u4e2d\u6587\u53f0\u6e7e\u5730\u533a\u4e2d\u6587\u53f0\u6e7e\u5730\u533a)_zh_TW");
        org.junit.Assert.assertNotNull(locale28);
// flaky:         org.junit.Assert.assertEquals(locale28.toString(), "\u4e2d\u6587\u53f0\u6e7e\u5730\u533a\u4e2d\u6587\u53f0\u6e7e\u5730\u533a)_zh_TW");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "it");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "it");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "English" + "'", str33, "English");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Canada" + "'", str34, "Canada");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "CA" + "'", str38, "CA");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "fr");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "French" + "'", str44, "French");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "it");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "it");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "English (Canada)" + "'", str49, "English (Canada)");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "zh");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(dateTimeZone56);
        org.junit.Assert.assertNotNull(gJChronology57);
        org.junit.Assert.assertNotNull(durationField58);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 97L + "'", long62 == 97L);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(dateTimeField65);
        org.junit.Assert.assertNotNull(durationField66);
        org.junit.Assert.assertNotNull(dateTimeZone67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "UTC" + "'", str68, "UTC");
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "fr");
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "zh");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "\u6cd5\u6587" + "'", str73, "\u6cd5\u6587");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "+00:00" + "'", str75, "+00:00");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "\u4e2d\u6587" + "'", str76, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "\u610f\u5927\u5229\u6587" + "'", str77, "\u610f\u5927\u5229\u6587");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "\u4e2d\u6587" + "'", str79, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "\u5fb7\u56fd" + "'", str81, "\u5fb7\u56fd");
    }

    @Test
    public void test23198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23198");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        boolean boolean1 = locale0.hasExtensions();
        java.util.Locale locale2 = java.util.Locale.FRENCH;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        boolean boolean4 = locale3.hasExtensions();
        java.lang.String str5 = locale2.getDisplayLanguage(locale3);
        java.util.Set<java.lang.Character> charSet6 = locale2.getExtensionKeys();
        java.lang.String str7 = locale0.getDisplayName(locale2);
        java.util.Set<java.lang.Character> charSet8 = locale0.getExtensionKeys();
        boolean boolean9 = locale0.hasExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u6cd5\u6587" + "'", str5, "\u6cd5\u6587");
        org.junit.Assert.assertNotNull(charSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "japonais (Japon)" + "'", str7, "japonais (Japon)");
        org.junit.Assert.assertNotNull(charSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test23199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23199");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.removeUnicodeLocaleAttribute("und");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.setLanguage("inglese");
        java.util.Locale locale7 = builder6.build();
        java.util.Locale.Builder builder9 = builder6.addUnicodeLocaleAttribute("cinese");
        java.util.Locale.Builder builder11 = builder9.setLanguage("jp");
        java.util.Locale.Builder builder13 = builder9.addUnicodeLocaleAttribute("years");
        java.util.Locale.Builder builder15 = builder9.removeUnicodeLocaleAttribute("inglese");
        java.util.Locale locale16 = builder9.build();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "inglese");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "jp__#u-cinese-years");
    }

    @Test
    public void test23200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23200");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean9 = gJChronology2.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.dayOfMonth();
        org.joda.time.DurationField durationField11 = gJChronology2.days();
        long long15 = gJChronology2.add((long) '4', 432000000L, (int) (short) 0);
        org.joda.time.DurationField durationField16 = gJChronology2.minutes();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology2.hourOfHalfday();
        org.joda.time.DurationField durationField19 = gJChronology2.minutes();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology2.minuteOfHour();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 52L + "'", long15 == 52L);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test23201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23201");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("+00:35");
        java.lang.String str2 = locale1.getCountry();
        java.util.Locale.Category category3 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale4 = java.util.Locale.CANADA;
        java.lang.String str5 = locale4.getISO3Language();
        java.util.Locale.setDefault(category3, locale4);
        java.util.Locale locale9 = new java.util.Locale("UTC", "zh_TW");
        java.util.Locale locale10 = java.util.Locale.CHINESE;
        boolean boolean11 = locale10.hasExtensions();
        java.util.Locale.setDefault(locale10);
        java.lang.String str13 = locale9.getDisplayLanguage(locale10);
        java.lang.String str14 = locale10.getVariant();
        java.lang.String str15 = locale10.getCountry();
        java.util.Locale.setDefault(category3, locale10);
        java.util.Locale locale17 = java.util.Locale.CANADA_FRENCH;
        boolean boolean18 = locale17.hasExtensions();
        java.lang.String str19 = locale17.getDisplayLanguage();
        java.util.Locale.setDefault(category3, locale17);
        java.lang.String str21 = locale17.getScript();
        java.util.Set<java.lang.Character> charSet22 = locale17.getExtensionKeys();
        java.lang.String str23 = locale1.getDisplayCountry(locale17);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category3.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "eng" + "'", str5, "eng");
        org.junit.Assert.assertEquals(locale9.toString(), "utc_ZH_TW");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "utc" + "'", str13, "utc");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr_CA");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\u6cd5\u6587" + "'", str19, "\u6cd5\u6587");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(charSet22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test23202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23202");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        long long11 = gJChronology2.add((long) (byte) 0, (long) '4', 100);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.minuteOfHour();
        org.joda.time.DurationField durationField13 = gJChronology2.hours();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology2.minuteOfDay();
        long long20 = gJChronology2.add(220870496998333L, 0L, 35);
        long long24 = gJChronology2.add((long) 432086114, 72599948L, 7200);
        long long28 = gJChronology2.add((-21483106719628L), 46L, (int) '#');
        java.util.TimeZone timeZone29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forTimeZone(timeZone29);
        org.joda.time.chrono.GJChronology gJChronology31 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone30);
        org.joda.time.DateTimeField dateTimeField32 = gJChronology31.era();
        org.joda.time.DateTimeField dateTimeField33 = gJChronology31.era();
        org.joda.time.DurationField durationField34 = gJChronology31.years();
        org.joda.time.DurationField durationField35 = gJChronology31.halfdays();
        org.joda.time.DateTimeField dateTimeField36 = gJChronology31.minuteOfDay();
        boolean boolean37 = gJChronology2.equals((java.lang.Object) gJChronology31);
        java.util.TimeZone timeZone38 = null;
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forTimeZone(timeZone38);
        org.joda.time.chrono.GJChronology gJChronology40 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone39);
        org.joda.time.DurationField durationField41 = gJChronology40.halfdays();
        long long45 = gJChronology40.add((long) 'a', (-1L), (int) (short) 0);
        long long49 = gJChronology40.add((long) (byte) 0, (long) '4', 100);
        org.joda.time.DateTimeField dateTimeField50 = gJChronology40.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField51 = gJChronology40.year();
        org.joda.time.DurationField durationField52 = gJChronology40.centuries();
        java.util.TimeZone timeZone53 = null;
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forTimeZone(timeZone53);
        org.joda.time.chrono.GJChronology gJChronology55 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone54);
        long long59 = dateTimeZone54.convertLocalToUTC((long) (byte) -1, true, 0L);
        boolean boolean61 = dateTimeZone54.equals((java.lang.Object) true);
        long long63 = dateTimeZone54.nextTransition((long) '4');
        java.lang.String str65 = dateTimeZone54.getShortName(432000001L);
        java.util.TimeZone timeZone66 = dateTimeZone54.toTimeZone();
        org.joda.time.Chronology chronology67 = gJChronology40.withZone(dateTimeZone54);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap69 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList70 = java.util.Locale.LanguageRange.parse("French", strMap69);
        java.util.Locale locale72 = new java.util.Locale("hi!");
        java.lang.String str73 = locale72.getCountry();
        java.util.Set<java.lang.String> strSet74 = locale72.getUnicodeLocaleKeys();
        java.util.Locale.FilteringMode filteringMode75 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.lang.String> strList76 = java.util.Locale.filterTags(languageRangeList70, (java.util.Collection<java.lang.String>) strSet74, filteringMode75);
        boolean boolean77 = dateTimeZone54.equals((java.lang.Object) filteringMode75);
        boolean boolean78 = dateTimeZone54.isFixed();
        java.lang.String str79 = dateTimeZone54.toString();
        org.joda.time.Chronology chronology80 = gJChronology31.withZone(dateTimeZone54);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5200L + "'", long11 == 5200L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 220870496998333L + "'", long20 == 220870496998333L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 523151711714L + "'", long24 == 523151711714L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-21483106718018L) + "'", long28 == (-21483106718018L));
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(gJChronology31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(gJChronology40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 97L + "'", long45 == 97L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 5200L + "'", long49 == 5200L);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(durationField52);
        org.junit.Assert.assertNotNull(dateTimeZone54);
        org.junit.Assert.assertNotNull(gJChronology55);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + (-1L) + "'", long59 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 52L + "'", long63 == 52L);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "+00:00" + "'", str65, "+00:00");
        org.junit.Assert.assertNotNull(timeZone66);
        org.junit.Assert.assertEquals(timeZone66.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(chronology67);
        org.junit.Assert.assertNotNull(languageRangeList70);
        org.junit.Assert.assertEquals(locale72.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertNotNull(strSet74);
        org.junit.Assert.assertTrue("'" + filteringMode75 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode75.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(strList76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "UTC" + "'", str79, "UTC");
        org.junit.Assert.assertNotNull(chronology80);
    }

    @Test
    public void test23203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23203");
        java.util.Locale locale3 = new java.util.Locale("isochronology[utc]", "972022-02-11T09:52:21.882Z", "en-GB");
        org.junit.Assert.assertEquals(locale3.toString(), "isochronology[utc]_972022-02-11T09:52:21.882Z_en-GB");
    }

    @Test
    public void test23204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23204");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean9 = gJChronology2.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology2.clockhourOfHalfday();
        org.joda.time.DurationField durationField14 = gJChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology2.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology2.monthOfYear();
        org.joda.time.Instant instant18 = new org.joda.time.Instant((long) '#');
        java.util.TimeZone timeZone19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        org.joda.time.chrono.GJChronology gJChronology21 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone20);
        org.joda.time.DateTimeField dateTimeField22 = gJChronology21.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology21.weekyearOfCentury();
        org.joda.time.Instant instant24 = gJChronology21.getGregorianCutover();
        boolean boolean25 = instant18.equals((java.lang.Object) gJChronology21);
        org.joda.time.DateTime dateTime26 = instant18.toDateTime();
        java.util.TimeZone timeZone27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        java.lang.String str30 = dateTimeZone28.getNameKey((long) 100);
        boolean boolean31 = dateTimeZone28.isFixed();
        long long34 = dateTimeZone28.adjustOffset((long) (short) 10, true);
        int int36 = dateTimeZone28.getOffset(1L);
        java.util.Locale locale39 = java.util.Locale.forLanguageTag("");
        java.util.TimeZone timeZone40 = null;
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forTimeZone(timeZone40);
        org.joda.time.chrono.GJChronology gJChronology42 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone41);
        org.joda.time.DurationField durationField43 = gJChronology42.halfdays();
        org.joda.time.DateTimeField dateTimeField44 = gJChronology42.millisOfDay();
        org.joda.time.DateTimeField dateTimeField45 = gJChronology42.minuteOfDay();
        org.joda.time.DurationField durationField46 = gJChronology42.centuries();
        org.joda.time.DateTimeField dateTimeField47 = gJChronology42.halfdayOfDay();
        java.util.Locale locale48 = java.util.Locale.ITALIAN;
        java.util.Locale locale49 = locale48.stripExtensions();
        java.util.Locale locale50 = java.util.Locale.CANADA;
        java.lang.String str51 = locale48.getDisplayVariant(locale50);
        boolean boolean52 = gJChronology42.equals((java.lang.Object) locale50);
        java.lang.String str53 = locale39.getDisplayLanguage(locale50);
        java.lang.String str55 = locale50.getUnicodeLocaleType("en");
        java.lang.String str56 = dateTimeZone28.getShortName(3692163384000L, locale50);
        org.joda.time.MutableDateTime mutableDateTime57 = dateTime26.toMutableDateTime(dateTimeZone28);
        org.joda.time.Chronology chronology58 = gJChronology2.withZone(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(gJChronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "UTC" + "'", str30, "UTC");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 10L + "'", long34 == 10L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "");
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertNotNull(gJChronology42);
        org.junit.Assert.assertNotNull(durationField43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(durationField46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "it");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "it");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "+00:00" + "'", str56, "+00:00");
        org.junit.Assert.assertNotNull(mutableDateTime57);
        org.junit.Assert.assertNotNull(chronology58);
    }

    @Test
    public void test23205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23205");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        boolean boolean2 = instant1.isEqualNow();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant4 = instant1.plus(readableDuration3);
        boolean boolean6 = instant4.equals((java.lang.Object) ' ');
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1, 10);
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        long long13 = dateTimeZone9.getMillisKeepLocal(dateTimeZone11, 4320000000L);
        boolean boolean14 = instant4.equals((java.lang.Object) 4320000000L);
        boolean boolean15 = instant4.isEqualNow();
        org.joda.time.DateTime dateTime16 = instant4.toDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = null;
        boolean boolean18 = dateTime16.isSupported(dateTimeFieldType17);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = null;
        boolean boolean20 = dateTime16.isSupported(dateTimeFieldType19);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 4324200000L + "'", long13 == 4324200000L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test23206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23206");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.era();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.weekyear();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.centuryOfEra();
        org.joda.time.DurationField durationField8 = gJChronology2.years();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test23207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23207");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.era();
        org.joda.time.DurationField durationField4 = gJChronology2.months();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.weekyearOfCentury();
        org.joda.time.DurationField durationField6 = gJChronology2.months();
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8);
        long long13 = dateTimeZone8.convertLocalToUTC((long) (byte) -1, true, 0L);
        boolean boolean15 = dateTimeZone8.equals((java.lang.Object) true);
        org.joda.time.chrono.GJChronology gJChronology16 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField17 = gJChronology16.weekyear();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology16.era();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology16.centuryOfEra();
        org.joda.time.Chronology chronology20 = gJChronology16.withUTC();
        org.joda.time.DurationField durationField21 = gJChronology16.years();
        org.joda.time.DateTimeZone dateTimeZone22 = gJChronology16.getZone();
        org.joda.time.Chronology chronology23 = gJChronology2.withZone(dateTimeZone22);
        org.joda.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = dateTimeZone22.isLocalDateTimeGap(localDateTime24);
        org.joda.time.chrono.GJChronology gJChronology26 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone22);
        org.joda.time.DurationField durationField27 = gJChronology26.halfdays();
        org.joda.time.DurationField durationField28 = gJChronology26.months();
        org.joda.time.DateTimeField dateTimeField29 = gJChronology26.centuryOfEra();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(gJChronology9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(gJChronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(gJChronology26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
    }

    @Test
    public void test23208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23208");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(683127600L);
    }

    @Test
    public void test23209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23209");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.halfdayOfDay();
        org.joda.time.Chronology chronology9 = gJChronology2.withUTC();
        java.lang.String str10 = gJChronology2.toString();
        int int11 = gJChronology2.getMinimumDaysInFirstWeek();
        org.joda.time.Chronology chronology12 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField13 = gJChronology2.minutes();
        org.joda.time.DurationField durationField14 = gJChronology2.weeks();
        org.joda.time.DateTimeZone dateTimeZone15 = gJChronology2.getZone();
        org.joda.time.DurationField durationField16 = gJChronology2.weekyears();
        int int19 = durationField16.getDifference((long) 3500, (long) (-1));
        java.lang.String str20 = durationField16.getName();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "GJChronology[UTC]" + "'", str10, "GJChronology[UTC]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "weekyears" + "'", str20, "weekyears");
    }

    @Test
    public void test23210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23210");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Chinese", strMap1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap3);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap5 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList6 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap5);
        java.util.Locale.LanguageRange[] languageRangeArray7 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList8 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8, languageRangeArray7);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap10 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList11 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, strMap10);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList13 = java.util.Locale.LanguageRange.parse("German");
        java.util.Locale locale15 = new java.util.Locale("hi!");
        java.lang.String str16 = locale15.getCountry();
        java.lang.String str17 = locale15.getScript();
        java.util.Locale locale18 = java.util.Locale.ITALIAN;
        java.util.Locale locale19 = locale18.stripExtensions();
        java.util.Locale locale20 = java.util.Locale.CANADA;
        java.lang.String str21 = locale18.getDisplayVariant(locale20);
        java.lang.String str22 = locale15.getDisplayScript(locale18);
        java.util.Locale locale24 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale25 = java.util.Locale.GERMAN;
        java.lang.String str26 = locale25.getDisplayCountry();
        java.lang.String str27 = locale24.getDisplayLanguage(locale25);
        java.lang.String str28 = locale15.getDisplayScript(locale25);
        java.util.Locale locale29 = locale25.stripExtensions();
        java.util.Set<java.lang.String> strSet30 = locale29.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList31 = java.util.Locale.filterTags(languageRangeList13, (java.util.Collection<java.lang.String>) strSet30);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap33 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList34 = java.util.Locale.LanguageRange.parse("Chinese", strMap33);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap35 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList36 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList34, strMap35);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap37 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList38 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList34, strMap37);
        java.util.Locale.Category category39 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale40 = java.util.Locale.getDefault();
        boolean boolean41 = locale40.hasExtensions();
        java.lang.String str42 = locale40.getISO3Language();
        java.util.Locale.setDefault(category39, locale40);
        java.util.Locale locale44 = java.util.Locale.ITALIAN;
        java.util.Locale locale45 = locale44.stripExtensions();
        java.util.Locale.setDefault(category39, locale45);
        java.util.Locale locale48 = java.util.Locale.forLanguageTag("halfdays");
        boolean boolean49 = locale48.hasExtensions();
        java.util.Set<java.lang.Character> charSet50 = locale48.getExtensionKeys();
        java.lang.String str51 = locale45.getDisplayLanguage(locale48);
        java.util.Set<java.lang.String> strSet52 = locale48.getUnicodeLocaleAttributes();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList54 = java.util.Locale.LanguageRange.parse("halfdays");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap55 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList56 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList54, strMap55);
        java.util.TimeZone timeZone57 = null;
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forTimeZone(timeZone57);
        org.joda.time.chrono.GJChronology gJChronology59 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone58);
        java.util.Locale locale61 = new java.util.Locale("hi!");
        java.lang.String str62 = locale61.getCountry();
        java.util.Locale locale63 = java.util.Locale.getDefault();
        java.lang.String str64 = locale63.getDisplayName();
        java.lang.String str65 = locale61.getDisplayScript(locale63);
        boolean boolean66 = dateTimeZone58.equals((java.lang.Object) locale63);
        java.util.Set<java.lang.String> strSet67 = locale63.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet68 = locale63.getUnicodeLocaleKeys();
        java.util.Locale.FilteringMode filteringMode69 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList70 = java.util.Locale.filterTags(languageRangeList54, (java.util.Collection<java.lang.String>) strSet68, filteringMode69);
        java.util.List<java.lang.String> strList71 = java.util.Locale.filterTags(languageRangeList38, (java.util.Collection<java.lang.String>) strSet52, filteringMode69);
        java.util.List<java.lang.String> strList72 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.lang.String>) strSet30, filteringMode69);
        java.lang.String str73 = java.util.Locale.lookupTag(languageRangeList2, (java.util.Collection<java.lang.String>) strList72);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeList6);
        org.junit.Assert.assertNotNull(languageRangeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(languageRangeList11);
        org.junit.Assert.assertNotNull(languageRangeList13);
        org.junit.Assert.assertEquals(locale15.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "it");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "it");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "de");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "de");
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(languageRangeList34);
        org.junit.Assert.assertNotNull(languageRangeList36);
        org.junit.Assert.assertNotNull(languageRangeList38);
        org.junit.Assert.assertTrue("'" + category39 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category39.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "zh");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "zho" + "'", str42, "zho");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "it");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "it");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "halfdays");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(charSet50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Italian" + "'", str51, "Italian");
        org.junit.Assert.assertNotNull(strSet52);
        org.junit.Assert.assertNotNull(languageRangeList54);
        org.junit.Assert.assertNotNull(languageRangeList56);
        org.junit.Assert.assertNotNull(dateTimeZone58);
        org.junit.Assert.assertNotNull(gJChronology59);
        org.junit.Assert.assertEquals(locale61.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "cinese" + "'", str64, "cinese");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(strSet67);
        org.junit.Assert.assertNotNull(strSet68);
        org.junit.Assert.assertTrue("'" + filteringMode69 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode69.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList70);
        org.junit.Assert.assertNotNull(strList71);
        org.junit.Assert.assertNotNull(strList72);
        org.junit.Assert.assertNull(str73);
    }

    @Test
    public void test23211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23211");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.era();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.clockhourOfDay();
        org.joda.time.DurationField durationField12 = gJChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology2.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology2.secondOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test23212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23212");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.weekyear();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.halfdayOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.years();
        org.joda.time.DurationField durationField7 = gJChronology2.minutes();
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        java.lang.String str11 = dateTimeZone9.getNameKey((long) 100);
        boolean boolean12 = dateTimeZone9.isFixed();
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone9);
        int int14 = gJChronology13.getMinimumDaysInFirstWeek();
        java.lang.String str15 = gJChronology13.toString();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology13.yearOfEra();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology13.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology13.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology20 = gJChronology13.withZone(dateTimeZone19);
        org.joda.time.Chronology chronology21 = gJChronology2.withZone(dateTimeZone19);
        long long24 = dateTimeZone19.convertLocalToUTC((-3155673600000L), false);
        long long26 = dateTimeZone19.previousTransition((-3155695200000L));
        java.lang.String str27 = dateTimeZone19.toString();
        int int29 = dateTimeZone19.getOffsetFromLocal((-825600000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(gJChronology13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "GJChronology[UTC]" + "'", str15, "GJChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-3155673600000L) + "'", long24 == (-3155673600000L));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-3155695200000L) + "'", long26 == (-3155695200000L));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "UTC" + "'", str27, "UTC");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test23213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23213");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology4.millisOfSecond();
        int int6 = instant1.get(dateTimeField5);
        org.joda.time.Instant instant8 = instant1.plus(0L);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone10);
        org.joda.time.DurationField durationField12 = gJChronology11.halfdays();
        org.joda.time.Chronology chronology13 = gJChronology11.withUTC();
        java.lang.String str14 = gJChronology11.toString();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology11.hourOfHalfday();
        int int16 = instant1.get(dateTimeField15);
        org.joda.time.Instant instant18 = new org.joda.time.Instant(52L);
        boolean boolean19 = instant18.isEqualNow();
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.Instant instant21 = instant18.plus(readableDuration20);
        org.joda.time.Instant instant23 = new org.joda.time.Instant(52L);
        org.joda.time.Instant instant25 = instant23.withMillis((long) 'u');
        boolean boolean26 = instant18.isBefore((org.joda.time.ReadableInstant) instant23);
        boolean boolean27 = instant1.isEqual((org.joda.time.ReadableInstant) instant23);
        org.joda.time.DateTime dateTime28 = instant1.toDateTimeISO();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = null;
        boolean boolean30 = dateTime28.isSupported(dateTimeFieldType29);
        long long31 = dateTime28.getMillis();
        boolean boolean33 = dateTime28.equals((java.lang.Object) "2022-02-11T08:35:58.840Z");
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(gJChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(gJChronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "GJChronology[UTC]" + "'", str14, "GJChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(instant21);
        org.junit.Assert.assertNotNull(instant25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 52L + "'", long31 == 52L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test23214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23214");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology4.millisOfSecond();
        int int6 = instant1.get(dateTimeField5);
        org.joda.time.Instant instant8 = instant1.plus(0L);
        org.joda.time.Instant instant9 = instant8.toInstant();
        org.joda.time.Instant instant11 = new org.joda.time.Instant(52L);
        boolean boolean12 = instant11.isEqualNow();
        java.lang.String str13 = instant11.toString();
        java.lang.String str14 = instant11.toString();
        org.joda.time.Instant instant16 = new org.joda.time.Instant(52L);
        boolean boolean17 = instant16.isEqualNow();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Instant instant19 = instant16.plus(readableDuration18);
        boolean boolean20 = instant11.isBefore((org.joda.time.ReadableInstant) instant19);
        org.joda.time.Instant instant22 = instant11.minus((long) 0);
        int int23 = instant8.compareTo((org.joda.time.ReadableInstant) instant11);
        org.joda.time.Instant instant26 = instant11.withDurationAdded((long) (short) 100, 70);
        org.joda.time.ReadableInstant readableInstant27 = null;
        boolean boolean28 = instant11.isBefore(readableInstant27);
        java.lang.String str29 = instant11.toString();
        org.joda.time.Chronology chronology30 = instant11.getChronology();
        org.joda.time.DateTimeZone dateTimeZone31 = instant11.getZone();
        org.joda.time.Instant instant33 = new org.joda.time.Instant(43200152L);
        org.joda.time.Instant instant36 = instant33.withDurationAdded(0L, (int) (short) 100);
        long long37 = instant33.getMillis();
        org.joda.time.ReadableDuration readableDuration38 = null;
        org.joda.time.Instant instant39 = instant33.plus(readableDuration38);
        boolean boolean40 = instant11.isAfter((org.joda.time.ReadableInstant) instant33);
        org.joda.time.Instant instant42 = instant33.minus((-2768799L));
        org.joda.time.ReadableDuration readableDuration43 = null;
        org.joda.time.Instant instant44 = instant42.minus(readableDuration43);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(gJChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str13, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str14, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(instant19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(instant22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(instant26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str29, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(instant36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 43200152L + "'", long37 == 43200152L);
        org.junit.Assert.assertNotNull(instant39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(instant42);
        org.junit.Assert.assertNotNull(instant44);
    }

    @Test
    public void test23215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23215");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean9 = gJChronology2.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology2.hourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant14 = new org.joda.time.Instant((java.lang.Object) dateTimeField13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.chrono.GJChronology$CutoverField");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test23216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23216");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 100);
        long long6 = dateTimeZone1.convertLocalToUTC((-2246399965L), true);
        long long9 = dateTimeZone1.adjustOffset((long) '#', true);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, readableInstant10);
        org.joda.time.DurationField durationField12 = gJChronology11.years();
        org.joda.time.DurationField durationField13 = gJChronology11.hours();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology11.yearOfEra();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology11.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology11.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology11.centuryOfEra();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-2246399965L) + "'", long6 == (-2246399965L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertNotNull(gJChronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test23217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23217");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.removeUnicodeLocaleAttribute("und");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.setLanguage("inglese");
        java.util.Locale locale7 = builder6.build();
        java.util.Locale.Builder builder9 = builder6.addUnicodeLocaleAttribute("cinese");
        java.util.Locale.Builder builder11 = builder9.setLanguage("jp");
        java.util.Locale.Builder builder13 = builder11.addUnicodeLocaleAttribute("German");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder11.removeUnicodeLocaleAttribute("GJChronology[+01:10,cutover=1970-01-01T00:00:00.052Z]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: GJChronology[+01:10,cutover=1970-01-01T00:00:00.052Z] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "inglese");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test23218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23218");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Italian");
        double double2 = languageRange1.getWeight();
        double double3 = languageRange1.getWeight();
        double double4 = languageRange1.getWeight();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test23219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23219");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.weekyear();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.halfdayOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.years();
        org.joda.time.DurationField durationField7 = gJChronology2.minutes();
        org.joda.time.DateTimeZone dateTimeZone8 = gJChronology2.getZone();
        boolean boolean9 = dateTimeZone8.isFixed();
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone11 = gJChronology10.getZone();
        java.lang.String str13 = dateTimeZone11.getShortName(1515600000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(gJChronology10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
    }

    @Test
    public void test23220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23220");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.yearOfEra();
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology9.millisOfSecond();
        org.joda.time.DurationField durationField11 = gJChronology9.millis();
        org.joda.time.DurationField durationField12 = gJChronology9.weekyears();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology9.hourOfHalfday();
        org.joda.time.DurationField durationField15 = gJChronology9.days();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology9.yearOfEra();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology9.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone18 = gJChronology9.getZone();
        org.joda.time.Chronology chronology19 = gJChronology2.withZone(dateTimeZone18);
        org.joda.time.Instant instant20 = org.joda.time.Instant.now();
        org.joda.time.Instant instant23 = instant20.withDurationAdded(306102434400000L, (int) (short) 100);
        org.joda.time.Instant instant25 = instant20.plus((-1236765231753976678L));
        org.joda.time.chrono.GJChronology gJChronology26 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone18, (org.joda.time.ReadableInstant) instant20);
        java.lang.String str28 = dateTimeZone18.getName((-13125348978L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(gJChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(instant20);
        org.junit.Assert.assertNotNull(instant23);
        org.junit.Assert.assertNotNull(instant25);
        org.junit.Assert.assertNotNull(gJChronology26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00" + "'", str28, "+00:00");
    }

    @Test
    public void test23221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23221");
        java.util.Locale locale2 = new java.util.Locale("hours", "\u5fb7\u56fd");
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\u5fb7\u56fd");
    }

    @Test
    public void test23222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23222");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean9 = gJChronology2.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.dayOfMonth();
        org.joda.time.DurationField durationField11 = gJChronology2.days();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology2.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology2.dayOfMonth();
        org.joda.time.DurationField durationField16 = gJChronology2.halfdays();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
    }

    @Test
    public void test23223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23223");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        long long11 = gJChronology2.add((long) (byte) 0, (long) '4', 100);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology2.year();
        org.joda.time.DurationField durationField14 = gJChronology2.centuries();
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        org.joda.time.chrono.GJChronology gJChronology17 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone16);
        long long21 = dateTimeZone16.convertLocalToUTC((long) (byte) -1, true, 0L);
        boolean boolean23 = dateTimeZone16.equals((java.lang.Object) true);
        long long25 = dateTimeZone16.nextTransition((long) '4');
        java.lang.String str27 = dateTimeZone16.getShortName(432000001L);
        java.util.TimeZone timeZone28 = dateTimeZone16.toTimeZone();
        org.joda.time.Chronology chronology29 = gJChronology2.withZone(dateTimeZone16);
        org.joda.time.DurationField durationField30 = gJChronology2.millis();
        org.joda.time.DateTimeField dateTimeField31 = gJChronology2.monthOfYear();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5200L + "'", long11 == 5200L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(gJChronology17);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 52L + "'", long25 == 52L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00" + "'", str27, "+00:00");
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "Tempo universale coordinato");
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
    }

    @Test
    public void test23224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23224");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 10);
        boolean boolean3 = dateTimeZone1.isStandardOffset((-740275192556424000L));
        boolean boolean5 = dateTimeZone1.isStandardOffset(7816188L);
        boolean boolean7 = dateTimeZone1.isStandardOffset((long) (-3));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }
}
