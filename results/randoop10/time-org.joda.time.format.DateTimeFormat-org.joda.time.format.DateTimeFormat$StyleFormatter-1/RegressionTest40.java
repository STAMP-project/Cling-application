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
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.monthOfYear();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.yearOfCentury();
        org.joda.time.DurationField durationField13 = chronology8.eras();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField15 = chronology8.hourOfHalfday();
        long long19 = chronology8.add(124L, (long) 1969, (-36));
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str22 = dateTimeZone20.getName((long) 2000);
        long long24 = dateTimeZone20.nextTransition((long) 'a');
        java.lang.String str26 = dateTimeZone20.getNameKey((long) 2000);
        java.lang.String str28 = dateTimeZone20.getNameKey((long) (short) 0);
        long long30 = dateTimeZone20.nextTransition((long) (byte) -1);
        java.util.Locale locale33 = new java.util.Locale("+00:00:00.035");
        java.lang.String str34 = dateTimeZone20.getName(385L, locale33);
        int int36 = dateTimeZone20.getOffset((long) (-3600000));
        long long40 = dateTimeZone20.convertLocalToUTC((long) (-1), false, (-115200033L));
        org.joda.time.Chronology chronology41 = chronology8.withZone(dateTimeZone20);
        java.util.TimeZone timeZone42 = dateTimeZone20.toTimeZone();
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-70760L) + "'", long19 == (-70760L));
        org.junit.Assert.assertNotNull(dateTimeZone20);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-04:01" + "'", str22, "-04:01");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 97L + "'", long24 == 97L);
// flaky:         org.junit.Assert.assertNull(str26);
// flaky:         org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1L) + "'", long30 == (-1L));
        org.junit.Assert.assertEquals(locale33.toString(), "+00:00:00.035");
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "-04:01" + "'", str34, "-04:01");
// flaky:         org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-14460000) + "'", int36 == (-14460000));
// flaky:         org.junit.Assert.assertTrue("'" + long40 + "' != '" + 14459999L + "'", long40 == 14459999L);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(timeZone42);
// flaky:         org.junit.Assert.assertEquals(timeZone42.getDisplayName(), "GMT-04:01");
    }

    @Test
    public void test20002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20002");
        java.util.Locale locale3 = new java.util.Locale("coreano (Corea del Sud)", "-13:00", "\u4e0b\u534810:00");
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u4e0b\u534810:00");
    }

    @Test
    public void test20003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20003");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone4 = dateTimeFormatter3.getZone();
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = dateTimeFormatter3.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone6 = dateTimeFormatter3.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter3.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter3.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withPivotYear((java.lang.Integer) 36000000);
        java.lang.StringBuffer stringBuffer12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter13.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str17 = dateTimeZone15.getName((long) 2000);
        boolean boolean18 = dateTimeZone15.isFixed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter13.withZone(dateTimeZone15);
        org.joda.time.format.DateTimeParser dateTimeParser20 = dateTimeFormatter13.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter21 = dateTimeFormatter13.getPrinter();
        org.joda.time.Chronology chronology22 = dateTimeFormatter13.getChronolgy();
        org.joda.time.LocalDate localDate24 = null; // flaky: dateTimeFormatter13.parseLocalDate("69-12-31");
        java.util.Locale.Builder builder25 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder28 = builder25.setExtension('a', "en-US");
        java.util.Locale.Builder builder30 = builder28.setVariant("");
        java.util.Locale.Builder builder31 = builder30.clear();
        java.util.Locale.Builder builder32 = builder30.clearExtensions();
        java.util.Locale.Builder builder33 = builder32.clearExtensions();
        java.util.Locale.Builder builder35 = builder32.setVariant("Italian");
        java.util.Locale.Builder builder36 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder39 = builder36.setExtension('a', "en-US");
        java.util.Locale.Builder builder41 = builder39.setLanguageTag("it");
        java.util.Locale.Builder builder42 = builder39.clear();
        java.util.Locale.Builder builder44 = builder39.setRegion("");
        java.util.Locale locale45 = builder44.build();
        java.util.Locale.Builder builder46 = builder35.setLocale(locale45);
        java.lang.String str47 = locale45.getISO3Language();
        java.lang.String str48 = locale45.getLanguage();
        java.lang.String str49 = locale45.getDisplayCountry();
        java.util.Locale locale50 = java.util.Locale.getDefault();
        java.util.Set<java.lang.Character> charSet51 = locale50.getExtensionKeys();
        java.lang.String str53 = locale50.getExtension('a');
        java.lang.String str54 = locale45.getDisplayCountry(locale50);
        java.util.Set<java.lang.Character> charSet55 = locale50.getExtensionKeys();
        boolean boolean56 = false; // flaky: localDate24.equals((java.lang.Object) charSet55);
        org.joda.time.Chronology chronology57 = null; // flaky: localDate24.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter58 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter59 = dateTimeFormatter58.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str62 = dateTimeZone60.getName((long) 2000);
        boolean boolean63 = dateTimeZone60.isFixed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter64 = dateTimeFormatter58.withZone(dateTimeZone60);
        org.joda.time.format.DateTimeParser dateTimeParser65 = dateTimeFormatter58.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter66 = dateTimeFormatter58.getPrinter();
        org.joda.time.Chronology chronology67 = dateTimeFormatter58.getChronolgy();
        org.joda.time.LocalDate localDate69 = null; // flaky: dateTimeFormatter58.parseLocalDate("69-12-31");
        org.joda.time.Chronology chronology70 = null; // flaky: localDate69.getChronology();
        int int72 = 0; // flaky: localDate69.getValue(1);
        java.lang.String str73 = null; // flaky: localDate69.toString();
        int int75 = 0; // flaky: localDate69.getValue(0);
        java.lang.String str76 = null; // flaky: localDate69.toString();
        int int77 = 0; // flaky: localDate69.size();
        int int78 = 0; // flaky: localDate24.compareTo((org.joda.time.ReadablePartial) localDate69);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             dateTimeFormatter9.printTo(stringBuffer12, (org.joda.time.ReadablePartial) localDate69);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimePrinter5);
        org.junit.Assert.assertNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-04:01" + "'", str17, "-04:01");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNotNull(dateTimeParser20);
        org.junit.Assert.assertNotNull(dateTimePrinter21);
        org.junit.Assert.assertNull(chronology22);
// flaky:         org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "");
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(locale50);
// flaky:         org.junit.Assert.assertEquals(locale50.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(charSet51);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(charSet55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
// flaky:         org.junit.Assert.assertNotNull(chronology57);
        org.junit.Assert.assertNotNull(dateTimeFormatter58);
        org.junit.Assert.assertNotNull(dateTimeFormatter59);
        org.junit.Assert.assertNotNull(dateTimeZone60);
// flaky:         org.junit.Assert.assertEquals("'" + str62 + "' != '" + "-04:01" + "'", str62, "-04:01");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter64);
        org.junit.Assert.assertNotNull(dateTimeParser65);
        org.junit.Assert.assertNotNull(dateTimePrinter66);
        org.junit.Assert.assertNull(chronology67);
// flaky:         org.junit.Assert.assertNotNull(localDate69);
// flaky:         org.junit.Assert.assertNotNull(chronology70);
// flaky:         org.junit.Assert.assertTrue("'" + int72 + "' != '" + 12 + "'", int72 == 12);
// flaky:         org.junit.Assert.assertEquals("'" + str73 + "' != '" + "1969-12-31" + "'", str73, "1969-12-31");
// flaky:         org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1969 + "'", int75 == 1969);
// flaky:         org.junit.Assert.assertEquals("'" + str76 + "' != '" + "1969-12-31" + "'", str76, "1969-12-31");
// flaky:         org.junit.Assert.assertTrue("'" + int77 + "' != '" + 3 + "'", int77 == 3);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
    }

    @Test
    public void test20004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20004");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.clockhourOfDay();
        org.joda.time.DurationField durationField10 = chronology8.halfdays();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.secondOfDay();
        org.joda.time.DurationField durationField12 = chronology8.years();
        org.joda.time.Chronology chronology14 = null;
        java.util.Locale locale16 = new java.util.Locale("hi!");
        java.lang.String str17 = locale16.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket(0L, chronology14, locale16, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology21 = dateTimeParserBucket20.getChronology();
        org.joda.time.DateTimeField dateTimeField22 = chronology21.weekyear();
        org.joda.time.DateTimeField dateTimeField23 = chronology21.monthOfYear();
        org.joda.time.DateTimeField dateTimeField24 = chronology21.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField25 = chronology21.secondOfDay();
        org.joda.time.DateTimeField dateTimeField26 = chronology21.dayOfWeek();
        org.joda.time.DurationField durationField27 = chronology21.months();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatter28.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str32 = dateTimeZone30.getName((long) 2000);
        boolean boolean33 = dateTimeZone30.isFixed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = dateTimeFormatter28.withZone(dateTimeZone30);
        org.joda.time.format.DateTimeParser dateTimeParser35 = dateTimeFormatter28.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter36 = dateTimeFormatter28.getPrinter();
        org.joda.time.Chronology chronology37 = dateTimeFormatter28.getChronolgy();
        org.joda.time.LocalDate localDate39 = null; // flaky: dateTimeFormatter28.parseLocalDate("69-12-31");
        org.joda.time.Chronology chronology40 = null; // flaky: localDate39.getChronology();
        long long42 = 0L; // flaky: chronology21.set((org.joda.time.ReadablePartial) localDate39, 2040L);
        long long44 = 0L; // flaky: chronology8.set((org.joda.time.ReadablePartial) localDate39, 0L);
        java.lang.String str45 = null; // flaky: localDate39.toString();
        java.lang.String str46 = null; // flaky: localDate39.toString();
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertEquals(locale16.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertNotNull(dateTimeFormatter29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "-04:01" + "'", str32, "-04:01");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter34);
        org.junit.Assert.assertNotNull(dateTimeParser35);
        org.junit.Assert.assertNotNull(dateTimePrinter36);
        org.junit.Assert.assertNull(chronology37);
// flaky:         org.junit.Assert.assertNotNull(localDate39);
// flaky:         org.junit.Assert.assertNotNull(chronology40);
// flaky:         org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-86397960L) + "'", long42 == (-86397960L));
// flaky:         org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-86400000L) + "'", long44 == (-86400000L));
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "1969-12-31" + "'", str45, "1969-12-31");
// flaky:         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "1969-12-31" + "'", str46, "1969-12-31");
    }

    @Test
    public void test20005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20005");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullDate();
        boolean boolean1 = dateTimeFormatter0.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear(2000);
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter0.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter5.withPivotYear((int) (short) 1);
        boolean boolean10 = dateTimeFormatter9.isPrinter();
        java.util.Locale.Builder builder11 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder14 = builder11.setExtension('a', "en-US");
        java.util.Locale.Builder builder15 = builder11.clear();
        java.util.Locale locale17 = new java.util.Locale("eng");
        boolean boolean18 = locale17.hasExtensions();
        java.lang.String str19 = locale17.getDisplayCountry();
        java.util.Locale.Builder builder20 = builder15.setLocale(locale17);
        java.util.Locale locale21 = builder15.build();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter9.withLocale(locale21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter9.withDefaultYear(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate26 = dateTimeFormatter9.parseLocalDate("java.io.IOException: 70-1-1");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"java.io.IOException: 70-1-1\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko");
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertEquals(locale17.toString(), "eng");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "eng");
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
    }

    @Test
    public void test20006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20006");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.mediumTime();
        org.joda.time.Chronology chronology1 = dateTimeFormatter0.getChronolgy();
        org.joda.time.Chronology chronology2 = dateTimeFormatter0.getChronology();
        org.joda.time.Chronology chronology3 = dateTimeFormatter0.getChronolgy();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis((-101));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter0.withZone(dateTimeZone5);
        org.joda.time.Chronology chronology7 = dateTimeFormatter6.getChronology();
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = dateTimeFormatter6.getPrinter();
        java.lang.StringBuffer stringBuffer9 = null;
        org.joda.time.Chronology chronology11 = null;
        java.util.Locale locale13 = new java.util.Locale("hi!");
        java.lang.String str14 = locale13.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket(0L, chronology11, locale13, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology18 = dateTimeParserBucket17.getChronology();
        org.joda.time.DurationField durationField19 = chronology18.days();
        org.joda.time.DateTimeField dateTimeField20 = chronology18.year();
        org.joda.time.DateTimeField dateTimeField21 = chronology18.millisOfDay();
        org.joda.time.DateTimeField dateTimeField22 = chronology18.millisOfDay();
        org.joda.time.DateTimeField dateTimeField23 = chronology18.secondOfDay();
        org.joda.time.DateTimeField dateTimeField24 = chronology18.halfdayOfDay();
        org.joda.time.DurationField durationField25 = chronology18.centuries();
        org.joda.time.DurationField durationField26 = chronology18.hours();
        org.joda.time.DateTimeField dateTimeField27 = chronology18.weekyear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatter28.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str32 = dateTimeZone30.getName((long) 2000);
        boolean boolean33 = dateTimeZone30.isFixed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = dateTimeFormatter28.withZone(dateTimeZone30);
        org.joda.time.format.DateTimeParser dateTimeParser35 = dateTimeFormatter28.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter36 = dateTimeFormatter28.getPrinter();
        org.joda.time.Chronology chronology37 = dateTimeFormatter28.getChronolgy();
        org.joda.time.LocalDate localDate39 = null; // flaky: dateTimeFormatter28.parseLocalDate("69-12-31");
        org.joda.time.Chronology chronology42 = null;
        java.util.Locale locale44 = new java.util.Locale("hi!");
        java.lang.String str45 = locale44.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket48 = new org.joda.time.format.DateTimeParserBucket(0L, chronology42, locale44, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology49 = dateTimeParserBucket48.getChronology();
        java.util.Locale locale51 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket53 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology49, locale51, (java.lang.Integer) 10);
        org.joda.time.DurationField durationField54 = chronology49.days();
        org.joda.time.DurationField durationField55 = chronology49.halfdays();
        long long59 = chronology49.add(0L, (long) (short) 0, (-1));
        org.joda.time.DateTimeField dateTimeField60 = chronology49.hourOfDay();
        boolean boolean61 = false; // flaky: localDate39.equals((java.lang.Object) dateTimeField60);
        int[] intArray63 = null; // flaky: chronology18.get((org.joda.time.ReadablePartial) localDate39, (-86397960L));
        java.lang.Object obj64 = null;
        boolean boolean65 = false; // flaky: localDate39.equals(obj64);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             dateTimeFormatter6.printTo(stringBuffer9, (org.joda.time.ReadablePartial) localDate39);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNull(chronology1);
        org.junit.Assert.assertNull(chronology2);
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimePrinter8);
        org.junit.Assert.assertEquals(locale13.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertNotNull(dateTimeFormatter29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "-04:01" + "'", str32, "-04:01");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter34);
        org.junit.Assert.assertNotNull(dateTimeParser35);
        org.junit.Assert.assertNotNull(dateTimePrinter36);
        org.junit.Assert.assertNull(chronology37);
// flaky:         org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertEquals(locale44.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertEquals(locale51.toString(), "eng");
        org.junit.Assert.assertNotNull(durationField54);
        org.junit.Assert.assertNotNull(durationField55);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
// flaky:         org.junit.Assert.assertNotNull(intArray63);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[1969, 12, 31]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test20007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20007");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DurationField durationField10 = chronology8.days();
        long long16 = chronology8.getDateTimeMillis((long) (-121), (int) (short) 1, (int) (byte) 10, 0, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField17 = chronology8.weekOfWeekyear();
        org.joda.time.DurationField durationField18 = chronology8.seconds();
        org.joda.time.DateTimeField dateTimeField19 = chronology8.hourOfHalfday();
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-82200000L) + "'", long16 == (-82200000L));
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test20008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20008");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.clockhourOfDay();
        org.joda.time.DurationField durationField10 = chronology8.halfdays();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.hourOfHalfday();
        org.joda.time.DurationField durationField12 = chronology8.halfdays();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.secondOfDay();
        org.joda.time.DurationField durationField14 = chronology8.minutes();
        org.joda.time.DateTimeField dateTimeField15 = chronology8.hourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = chronology8.millisOfDay();
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test20009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20009");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.era();
        org.joda.time.DurationField durationField13 = chronology8.halfdays();
        org.joda.time.DurationField durationField14 = chronology8.minutes();
        org.joda.time.DurationField durationField15 = chronology8.seconds();
        java.lang.String str16 = chronology8.toString();
        org.joda.time.Chronology chronology17 = chronology8.withUTC();
        org.joda.time.DurationField durationField18 = chronology17.weekyears();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.weekyear();
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ISOChronology[UTC]" + "'", str16, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test20010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20010");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        java.util.Locale locale11 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology9, locale11, (java.lang.Integer) 10);
        org.joda.time.DurationField durationField14 = chronology9.millis();
        org.joda.time.DurationField durationField15 = chronology9.minutes();
        org.joda.time.DurationField durationField16 = chronology9.hours();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        long long20 = dateTimeZone17.adjustOffset((long) 0, true);
        java.lang.String str22 = dateTimeZone17.getNameKey((long) (-1));
        boolean boolean23 = dateTimeZone17.isFixed();
        int int25 = dateTimeZone17.getOffset((long) (short) 0);
        long long28 = dateTimeZone17.convertLocalToUTC(0L, true);
        long long31 = dateTimeZone17.adjustOffset((long) (short) 1, true);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        long long35 = dateTimeZone32.adjustOffset((long) 0, true);
        java.util.TimeZone timeZone36 = dateTimeZone32.toTimeZone();
        int int38 = dateTimeZone32.getOffsetFromLocal(100L);
        long long40 = dateTimeZone32.nextTransition((long) ' ');
        long long42 = dateTimeZone17.getMillisKeepLocal(dateTimeZone32, (long) 40);
        long long44 = dateTimeZone17.previousTransition((long) 100);
        java.util.TimeZone timeZone45 = dateTimeZone17.toTimeZone();
        org.joda.time.Chronology chronology46 = chronology9.withZone(dateTimeZone17);
        org.joda.time.DateTimeField dateTimeField47 = chronology46.dayOfYear();
        org.joda.time.DateTimeField dateTimeField48 = chronology46.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField49 = chronology46.secondOfDay();
        org.joda.time.DateTimeField dateTimeField50 = chronology46.yearOfCentury();
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertEquals(locale11.toString(), "eng");
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
// flaky:         org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-14460000) + "'", int25 == (-14460000));
// flaky:         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 14460000L + "'", long28 == 14460000L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNotNull(timeZone36);
// flaky:         org.junit.Assert.assertEquals(timeZone36.getDisplayName(), "GMT-04:01");
// flaky:         org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-14460000) + "'", int38 == (-14460000));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 32L + "'", long40 == 32L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 40L + "'", long42 == 40L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 100L + "'", long44 == 100L);
        org.junit.Assert.assertNotNull(timeZone45);
// flaky:         org.junit.Assert.assertEquals(timeZone45.getDisplayName(), "GMT-04:01");
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(dateTimeField50);
    }

    @Test
    public void test20011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20011");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.clockhourOfDay();
        org.joda.time.DurationField durationField10 = chronology8.halfdays();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.weekyearOfCentury();
        org.joda.time.DurationField durationField14 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField15 = chronology8.millisOfSecond();
        long long19 = chronology8.add((-59082132244428L), (-655860000L), 0);
        org.joda.time.DurationField durationField20 = chronology8.minutes();
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-59082132244428L) + "'", long19 == (-59082132244428L));
        org.junit.Assert.assertNotNull(durationField20);
    }

    @Test
    public void test20012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20012");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withChronology(chronology4);
        java.util.Locale locale6 = dateTimeFormatter5.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withZoneUTC();
        java.lang.String str9 = dateTimeFormatter7.print((long) (byte) 1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter7.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter7.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter12.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str16 = dateTimeZone14.getName((long) 2000);
        boolean boolean17 = dateTimeZone14.isFixed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter12.withZone(dateTimeZone14);
        org.joda.time.format.DateTimeParser dateTimeParser19 = dateTimeFormatter12.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter20 = dateTimeFormatter12.getPrinter();
        org.joda.time.Chronology chronology21 = dateTimeFormatter12.getChronolgy();
        org.joda.time.LocalDate localDate23 = null; // flaky: dateTimeFormatter12.parseLocalDate("69-12-31");
        java.lang.String str24 = null; // flaky: localDate23.toString();
        int int25 = 0; // flaky: localDate23.size();
        java.lang.String str26 = null; // flaky: dateTimeFormatter7.print((org.joda.time.ReadablePartial) localDate23);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType28 = null; // flaky: localDate23.getFieldType(1969);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 1969");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "70-1-1" + "'", str9, "70-1-1");
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-04:01" + "'", str16, "-04:01");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(dateTimeParser19);
        org.junit.Assert.assertNotNull(dateTimePrinter20);
        org.junit.Assert.assertNull(chronology21);
// flaky:         org.junit.Assert.assertNotNull(localDate23);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1969-12-31" + "'", str24, "1969-12-31");
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "69-12-31" + "'", str26, "69-12-31");
    }

    @Test
    public void test20013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20013");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withChronology(chronology4);
        java.util.Locale locale6 = dateTimeFormatter5.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withZoneUTC();
        org.joda.time.Chronology chronology11 = null;
        java.util.Locale locale13 = new java.util.Locale("hi!");
        java.lang.String str14 = locale13.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket(0L, chronology11, locale13, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology18 = dateTimeParserBucket17.getChronology();
        java.util.Locale locale20 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology18, locale20, (java.lang.Integer) 10);
        org.joda.time.DurationField durationField23 = chronology18.days();
        org.joda.time.DurationField durationField24 = chronology18.halfdays();
        long long28 = chronology18.add(0L, (long) (short) 0, (-1));
        org.joda.time.DurationField durationField29 = chronology18.centuries();
        org.joda.time.DateTimeField dateTimeField30 = chronology18.yearOfEra();
        org.joda.time.DateTimeField dateTimeField31 = chronology18.year();
        java.util.Locale locale34 = new java.util.Locale("english (united states) (UND,en-US)", "Japanese");
        java.lang.String str35 = locale34.getDisplayScript();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket(120L, chronology18, locale34, (java.lang.Integer) (-13));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = dateTimeFormatter7.withChronology(chronology18);
        org.joda.time.Chronology chronology40 = null;
        java.util.Locale locale42 = new java.util.Locale("hi!");
        java.lang.String str43 = locale42.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket46 = new org.joda.time.format.DateTimeParserBucket(0L, chronology40, locale42, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology47 = dateTimeParserBucket46.getChronology();
        org.joda.time.DateTimeField dateTimeField48 = chronology47.centuryOfEra();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter49 = dateTimeFormatter38.withChronology(chronology47);
        org.joda.time.DateTimeField dateTimeField50 = chronology47.era();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertEquals(locale13.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertEquals(locale20.toString(), "eng");
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertEquals(locale34.toString(), "english (united states) (und,en-us)_JAPANESE");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter38);
        org.junit.Assert.assertEquals(locale42.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(dateTimeFormatter49);
        org.junit.Assert.assertNotNull(dateTimeField50);
    }

    @Test
    public void test20014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20014");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.year();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.millisOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.millisOfDay();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.secondOfDay();
        org.joda.time.DateTimeField dateTimeField15 = chronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField16 = chronology9.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField17 = chronology9.hourOfHalfday();
        java.util.Locale locale18 = java.util.Locale.CHINESE;
        java.util.Locale locale19 = java.util.Locale.FRANCE;
        java.lang.String str20 = locale18.getDisplayScript(locale19);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((-99L), chronology9, locale19, (java.lang.Integer) (-53));
        org.joda.time.DateTimeField dateTimeField23 = chronology9.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField24 = chronology9.hourOfDay();
        org.joda.time.DateTimeField dateTimeField25 = chronology9.secondOfDay();
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
    }

    @Test
    public void test20015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20015");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("taiwan", strMap1);
        java.util.Collection<java.util.Locale> localeCollection3 = null;
        java.util.Locale.FilteringMode filteringMode4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale> localeList5 = java.util.Locale.filter(languageRangeList2, localeCollection3, filteringMode4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList2);
    }

    @Test
    public void test20016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20016");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        long long10 = dateTimeParserBucket7.computeMillis(true, "hi!");
        long long12 = dateTimeParserBucket7.computeMillis(true);
        org.joda.time.Chronology chronology14 = null;
        java.util.Locale locale16 = new java.util.Locale("hi!");
        java.lang.String str17 = locale16.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket(0L, chronology14, locale16, (java.lang.Integer) 10, (int) 'a');
        int int21 = dateTimeParserBucket20.getOffset();
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeParserBucket20.getZone();
        long long25 = dateTimeZone22.adjustOffset((-1L), true);
        long long28 = dateTimeZone22.adjustOffset((long) 'a', true);
        boolean boolean30 = dateTimeZone22.isStandardOffset((long) 100);
        long long33 = dateTimeZone22.adjustOffset((long) (byte) 10, false);
        dateTimeParserBucket7.setZone(dateTimeZone22);
        long long38 = dateTimeZone22.convertLocalToUTC((-2000L), false, 2000L);
        java.lang.String str40 = dateTimeZone22.getName((long) ' ');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = org.joda.time.format.DateTimeFormat.mediumDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = dateTimeFormatter41.withZoneUTC();
        org.joda.time.Chronology chronology43 = dateTimeFormatter42.getChronology();
        boolean boolean44 = dateTimeFormatter42.isPrinter();
        boolean boolean45 = dateTimeZone22.equals((java.lang.Object) dateTimeFormatter42);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter47 = dateTimeFormatter42.withPivotYear((-3600000));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime49 = dateTimeFormatter42.parseLocalDateTime("\u5e74\u6708\u65e5\u661f\u671f\u4e8c\u4e0a\u5348\u65f6\u5206\u79d2 -04:01");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"1969?12?30? ??? ??11?34?00? -04:01\" is malformed at \"?12?30? ??? ??11?34?00? -04:01\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 14460000L + "'", long10 == 14460000L);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 14460000L + "'", long12 == 14460000L);
        org.junit.Assert.assertEquals(locale16.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 97L + "'", long28 == 97L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 10L + "'", long33 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long38 + "' != '" + 14458000L + "'", long38 == 14458000L);
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "-04:01" + "'", str40, "-04:01");
        org.junit.Assert.assertNotNull(dateTimeFormatter41);
        org.junit.Assert.assertNotNull(dateTimeFormatter42);
        org.junit.Assert.assertNull(chronology43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter47);
    }

    @Test
    public void test20017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20017");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullDate();
        boolean boolean1 = dateTimeFormatter0.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear(2000);
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter3.getParser();
        org.joda.time.Chronology chronology7 = null;
        java.util.Locale locale9 = new java.util.Locale("hi!");
        java.lang.String str10 = locale9.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket(0L, chronology7, locale9, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology14 = dateTimeParserBucket13.getChronology();
        java.util.Locale locale16 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology14, locale16, (java.lang.Integer) 10);
        java.lang.Integer int19 = dateTimeParserBucket18.getOffsetInteger();
        long long22 = dateTimeParserBucket18.computeMillis(true, "\u82f1\u6587\u7f8e\u570b)");
        int int23 = dateTimeParserBucket18.getOffset();
        java.lang.Object obj24 = dateTimeParserBucket18.saveState();
        int int27 = dateTimeParser4.parseInto(dateTimeParserBucket18, "USA", (int) (byte) 100);
        long long30 = dateTimeParserBucket18.computeMillis(true, "+52:00");
        org.joda.time.Chronology chronology31 = dateTimeParserBucket18.getChronology();
        org.joda.time.Chronology chronology33 = null;
        java.util.Locale locale35 = new java.util.Locale("hi!");
        java.lang.String str36 = locale35.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket(0L, chronology33, locale35, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology40 = dateTimeParserBucket39.getChronology();
        org.joda.time.DurationField durationField41 = chronology40.days();
        org.joda.time.DateTimeField dateTimeField42 = chronology40.year();
        org.joda.time.DateTimeField dateTimeField43 = chronology40.millisOfDay();
        org.joda.time.DateTimeField dateTimeField44 = chronology40.millisOfDay();
        org.joda.time.DateTimeField dateTimeField45 = chronology40.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField46 = chronology40.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField47 = chronology40.era();
        boolean boolean48 = dateTimeParserBucket18.restoreState((java.lang.Object) dateTimeField47);
        java.lang.Integer int49 = dateTimeParserBucket18.getOffsetInteger();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeParser4);
        org.junit.Assert.assertEquals(locale9.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertEquals(locale16.toString(), "eng");
        org.junit.Assert.assertNull(int19);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-101) + "'", int27 == (-101));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertEquals(locale35.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(int49);
    }

    @Test
    public void test20018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20018");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 1);
        org.joda.time.Chronology chronology6 = null;
        java.util.Locale locale8 = new java.util.Locale("hi!");
        java.lang.String str9 = locale8.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket(0L, chronology6, locale8, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology13 = dateTimeParserBucket12.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.days();
        org.joda.time.DateTimeField dateTimeField15 = chronology13.year();
        org.joda.time.DateTimeField dateTimeField16 = chronology13.weekyearOfCentury();
        org.joda.time.Chronology chronology17 = chronology13.withUTC();
        org.joda.time.DurationField durationField18 = chronology13.minutes();
        java.util.Locale locale22 = new java.util.Locale("UTC", "1/1/70", "it");
        java.lang.String str23 = locale22.getDisplayVariant();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket((long) ' ', chronology13, locale22, (java.lang.Integer) 10, (int) (short) 100);
        java.lang.String str27 = locale22.getDisplayScript();
        java.lang.String str28 = dateTimeZone2.getShortName((-346200000L), locale22);
        long long30 = dateTimeZone2.convertUTCToLocal(4519200000L);
        java.lang.String str31 = dateTimeZone2.getID();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals(locale8.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertEquals(locale22.toString(), "utc_1/1/70_it");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "it" + "'", str23, "it");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+32:01" + "'", str28, "+32:01");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 4634460000L + "'", long30 == 4634460000L);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+32:01" + "'", str31, "+32:01");
    }

    @Test
    public void test20019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20019");
        java.util.Locale locale2 = new java.util.Locale("2022-02-13", "\u65e5\u672c\u8a9e_english");
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\u65e5\u672c\u8a9e_ENGLISH");
    }

    @Test
    public void test20020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20020");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalDateTime localDateTime1 = null;
        boolean boolean2 = dateTimeZone0.isLocalDateTimeGap(localDateTime1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        long long8 = dateTimeZone0.convertLocalToUTC(3659999L, false, 203761L);
        long long10 = dateTimeZone0.previousTransition((-115259965L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 18119999L + "'", long8 == 18119999L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115259965L) + "'", long10 == (-115259965L));
    }

    @Test
    public void test20021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20021");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DurationField durationField10 = chronology8.days();
        long long16 = chronology8.getDateTimeMillis((long) (-121), (int) (short) 1, (int) (byte) 10, 0, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField17 = chronology8.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            long long23 = chronology8.getDateTimeMillis(115138000L, 360000000, (-1), (-33), 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 360000000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-82200000L) + "'", long16 == (-82200000L));
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test20022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20022");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        int int8 = dateTimeParserBucket7.getOffset();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeParserBucket7.getZone();
        long long12 = dateTimeZone9.adjustOffset((-1L), true);
        long long15 = dateTimeZone9.adjustOffset((long) 'a', true);
        boolean boolean17 = dateTimeZone9.isStandardOffset((long) 100);
        long long20 = dateTimeZone9.convertLocalToUTC((long) 0, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone9);
        java.lang.String str23 = dateTimeZone9.getNameKey((-351080487L));
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 14460000L + "'", long20 == 14460000L);
// flaky:         org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test20023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20023");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.era();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.dayOfYear();
        org.joda.time.DurationField durationField15 = chronology8.minutes();
        org.joda.time.DateTimeField dateTimeField16 = chronology8.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField17 = chronology8.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField18 = chronology8.yearOfCentury();
        org.joda.time.DurationField durationField19 = chronology8.months();
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
    }

    @Test
    public void test20024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20024");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.monthOfYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = org.joda.time.format.DateTimeFormat.fullDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter12.withPivotYear((java.lang.Integer) 1);
        int int15 = dateTimeFormatter12.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        long long19 = dateTimeZone16.adjustOffset((long) 0, true);
        java.lang.String str21 = dateTimeZone16.getNameKey((long) (-1));
        boolean boolean22 = dateTimeZone16.isFixed();
        int int24 = dateTimeZone16.getOffset((long) (short) 0);
        long long27 = dateTimeZone16.convertLocalToUTC(0L, true);
        java.util.TimeZone timeZone28 = dateTimeZone16.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter12.withZone(dateTimeZone29);
        org.joda.time.Chronology chronology31 = chronology8.withZone(dateTimeZone29);
        org.joda.time.DateTimeField dateTimeField32 = chronology31.weekyear();
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2000 + "'", int15 == 2000);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
// flaky:         org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-14460000) + "'", int24 == (-14460000));
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 14460000L + "'", long27 == 14460000L);
        org.junit.Assert.assertNotNull(timeZone28);
// flaky:         org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "GMT-04:01");
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTimeField32);
    }

    @Test
    public void test20025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20025");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder7 = builder3.setScript("");
        java.util.Locale.Builder builder9 = builder3.addUnicodeLocaleAttribute("eng");
        java.util.Locale.Builder builder10 = builder3.clear();
        java.util.Locale.Builder builder11 = builder10.clearExtensions();
        java.util.Locale.Builder builder13 = builder10.setLanguage("italiano");
        java.util.Locale.Builder builder15 = builder10.setLanguageTag("fr-FR");
        java.util.Locale locale16 = java.util.Locale.getDefault();
        java.util.Set<java.lang.Character> charSet17 = locale16.getExtensionKeys();
        java.util.Locale locale18 = locale16.stripExtensions();
        java.util.Locale locale19 = java.util.Locale.CHINA;
        java.lang.String str20 = locale18.getDisplayScript(locale19);
        java.util.Locale.setDefault(locale18);
        java.util.Locale.setDefault(locale18);
        java.util.Locale.Builder builder23 = builder15.setLocale(locale18);
        java.util.Locale.Builder builder24 = builder23.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder26 = builder23.addUnicodeLocaleAttribute("01/01/70 (ZH_CN)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 01/01/70 (ZH_CN) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(locale16);
// flaky:         org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(charSet17);
        org.junit.Assert.assertNotNull(locale18);
// flaky:         org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test20026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20026");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.year();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.millisOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.era();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = chronology9.dayOfYear();
        org.joda.time.DurationField durationField16 = chronology9.years();
        org.joda.time.Chronology chronology17 = chronology9.withUTC();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        long long21 = chronology17.add(readablePeriod18, (long) 40, (int) (short) 0);
        java.lang.String str22 = chronology17.toString();
        org.joda.time.DurationField durationField23 = chronology17.hours();
        java.util.Locale locale27 = new java.util.Locale("UTC", "1/1/70", "it");
        java.lang.String str28 = locale27.getCountry();
        java.util.Locale locale29 = java.util.Locale.ENGLISH;
        java.lang.String str30 = locale27.getDisplayCountry(locale29);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket33 = new org.joda.time.format.DateTimeParserBucket((-2000L), chronology17, locale27, (java.lang.Integer) 10, (-53));
        long long34 = dateTimeParserBucket33.computeMillis();
        java.util.Locale locale35 = dateTimeParserBucket33.getLocale();
        java.lang.String str36 = locale35.toLanguageTag();
        java.util.Locale locale37 = locale35.stripExtensions();
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 40L + "'", long21 == 40L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ISOChronology[UTC]" + "'", str22, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertEquals(locale27.toString(), "utc_1/1/70_it");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1/1/70" + "'", str28, "1/1/70");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1/1/70" + "'", str30, "1/1/70");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-2000L) + "'", long34 == (-2000L));
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "utc_1/1/70_it");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "utc-x-lvariant-it" + "'", str36, "utc-x-lvariant-it");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "utc_1/1/70_it");
    }

    @Test
    public void test20027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20027");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.weekyear();
        org.joda.time.DurationField durationField10 = chronology8.minutes();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.hourOfDay();
        long long16 = chronology8.add((-62111231999999L), 1L, 10);
        org.joda.time.DurationField durationField17 = chronology8.hours();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter18.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str22 = dateTimeZone20.getName((long) 2000);
        boolean boolean23 = dateTimeZone20.isFixed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter18.withZone(dateTimeZone20);
        org.joda.time.format.DateTimeParser dateTimeParser25 = dateTimeFormatter18.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter26 = dateTimeFormatter18.getPrinter();
        org.joda.time.Chronology chronology27 = dateTimeFormatter18.getChronolgy();
        org.joda.time.LocalDate localDate29 = null; // flaky: dateTimeFormatter18.parseLocalDate("69-12-31");
        org.joda.time.Chronology chronology32 = null;
        java.util.Locale locale34 = new java.util.Locale("hi!");
        java.lang.String str35 = locale34.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket38 = new org.joda.time.format.DateTimeParserBucket(0L, chronology32, locale34, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology39 = dateTimeParserBucket38.getChronology();
        java.util.Locale locale41 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket43 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology39, locale41, (java.lang.Integer) 10);
        org.joda.time.DurationField durationField44 = chronology39.days();
        org.joda.time.DurationField durationField45 = chronology39.halfdays();
        long long49 = chronology39.add(0L, (long) (short) 0, (-1));
        org.joda.time.DateTimeField dateTimeField50 = chronology39.hourOfDay();
        boolean boolean51 = false; // flaky: localDate29.equals((java.lang.Object) dateTimeField50);
        org.joda.time.DateTimeField dateTimeField53 = null; // flaky: localDate29.getField((int) (byte) 1);
        int[] intArray55 = null; // flaky: chronology8.get((org.joda.time.ReadablePartial) localDate29, (long) 117);
        org.joda.time.Chronology chronology56 = null; // flaky: localDate29.getChronology();
        int int57 = 0; // flaky: localDate29.size();
        org.joda.time.Chronology chronology58 = null; // flaky: localDate29.getChronology();
        java.lang.String str59 = null; // flaky: localDate29.toString();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter60 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter61 = dateTimeFormatter60.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str64 = dateTimeZone62.getName((long) 2000);
        boolean boolean65 = dateTimeZone62.isFixed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter66 = dateTimeFormatter60.withZone(dateTimeZone62);
        org.joda.time.format.DateTimeParser dateTimeParser67 = dateTimeFormatter60.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter68 = dateTimeFormatter60.getPrinter();
        org.joda.time.Chronology chronology69 = dateTimeFormatter60.getChronolgy();
        org.joda.time.LocalDate localDate71 = null; // flaky: dateTimeFormatter60.parseLocalDate("69-12-31");
        org.joda.time.Chronology chronology72 = null; // flaky: localDate71.getChronology();
        int int74 = 0; // flaky: localDate71.getValue(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType76 = null; // flaky: localDate71.getFieldType(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter77 = org.joda.time.format.DateTimeFormat.fullDate();
        boolean boolean78 = dateTimeFormatter77.isOffsetParsed();
        java.lang.Integer int79 = dateTimeFormatter77.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser80 = dateTimeFormatter77.getParser();
        boolean boolean81 = false; // flaky: localDate71.equals((java.lang.Object) dateTimeFormatter77);
        java.util.Locale.LanguageRange languageRange83 = new java.util.Locale.LanguageRange("en-US");
        java.lang.String str84 = languageRange83.getRange();
        java.lang.String str85 = languageRange83.getRange();
        double double86 = languageRange83.getWeight();
        java.lang.String str87 = languageRange83.getRange();
        boolean boolean88 = false; // flaky: localDate71.equals((java.lang.Object) languageRange83);
        boolean boolean89 = false; // flaky: localDate29.equals((java.lang.Object) boolean88);
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-62111231999989L) + "'", long16 == (-62111231999989L));
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-04:01" + "'", str22, "-04:01");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
        org.junit.Assert.assertNotNull(dateTimeParser25);
        org.junit.Assert.assertNotNull(dateTimePrinter26);
        org.junit.Assert.assertNull(chronology27);
// flaky:         org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertEquals(locale34.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertEquals(locale41.toString(), "eng");
        org.junit.Assert.assertNotNull(durationField44);
        org.junit.Assert.assertNotNull(durationField45);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
// flaky:         org.junit.Assert.assertNotNull(dateTimeField53);
// flaky:         org.junit.Assert.assertNotNull(intArray55);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[1970, 1, 1]");
// flaky:         org.junit.Assert.assertNotNull(chronology56);
// flaky:         org.junit.Assert.assertTrue("'" + int57 + "' != '" + 3 + "'", int57 == 3);
// flaky:         org.junit.Assert.assertNotNull(chronology58);
// flaky:         org.junit.Assert.assertEquals("'" + str59 + "' != '" + "1969-12-31" + "'", str59, "1969-12-31");
        org.junit.Assert.assertNotNull(dateTimeFormatter60);
        org.junit.Assert.assertNotNull(dateTimeFormatter61);
        org.junit.Assert.assertNotNull(dateTimeZone62);
// flaky:         org.junit.Assert.assertEquals("'" + str64 + "' != '" + "-04:01" + "'", str64, "-04:01");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter66);
        org.junit.Assert.assertNotNull(dateTimeParser67);
        org.junit.Assert.assertNotNull(dateTimePrinter68);
        org.junit.Assert.assertNull(chronology69);
// flaky:         org.junit.Assert.assertNotNull(localDate71);
// flaky:         org.junit.Assert.assertNotNull(chronology72);
// flaky:         org.junit.Assert.assertTrue("'" + int74 + "' != '" + 12 + "'", int74 == 12);
// flaky:         org.junit.Assert.assertNotNull(dateTimeFieldType76);
        org.junit.Assert.assertNotNull(dateTimeFormatter77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNull(int79);
        org.junit.Assert.assertNotNull(dateTimeParser80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "en-us" + "'", str84, "en-us");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "en-us" + "'", str85, "en-us");
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 1.0d + "'", double86 == 1.0d);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "en-us" + "'", str87, "en-us");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test20028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20028");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "en-US");
        java.util.Locale.Builder builder6 = builder4.setLanguageTag("it");
        java.util.Locale locale7 = builder4.build();
        java.util.Locale.setDefault(category0, locale7);
        java.util.Locale locale9 = java.util.Locale.getDefault(category0);
        java.util.Locale locale10 = locale9.stripExtensions();
        java.lang.String str11 = locale10.getISO3Country();
        java.lang.String str12 = locale10.getDisplayCountry();
        java.util.Set<java.lang.String> strSet13 = locale10.getUnicodeLocaleAttributes();
        java.lang.String str14 = locale10.getLanguage();
        java.io.IOException iOException16 = new java.io.IOException("\u4e2d\u6587");
        java.lang.Throwable[] throwableArray17 = iOException16.getSuppressed();
        java.io.IOException iOException18 = new java.io.IOException((java.lang.Throwable) iOException16);
        java.io.IOException iOException20 = new java.io.IOException("Chinese");
        java.io.IOException iOException21 = new java.io.IOException((java.lang.Throwable) iOException20);
        iOException18.addSuppressed((java.lang.Throwable) iOException20);
        boolean boolean23 = locale10.equals((java.lang.Object) iOException18);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "it");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "it" + "'", str14, "it");
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test20029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20029");
        java.io.IOException iOException2 = new java.io.IOException("\u4e2d\u6587");
        java.lang.Throwable[] throwableArray3 = iOException2.getSuppressed();
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) iOException2);
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) iOException2);
        java.io.IOException iOException6 = new java.io.IOException("englisch", (java.lang.Throwable) iOException2);
        org.junit.Assert.assertNotNull(throwableArray3);
    }

    @Test
    public void test20030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20030");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.clockhourOfDay();
        org.joda.time.DurationField durationField10 = chronology8.halfdays();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone12 = chronology8.getZone();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.hourOfDay();
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test20031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20031");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DurationField durationField10 = chronology8.weekyears();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.weekyearOfCentury();
        org.joda.time.DurationField durationField13 = chronology8.years();
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test20032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20032");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        int int2 = dateTimeZone0.getOffset(115259999L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test20033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20033");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("-101:32", (double) 493259999L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=4.93259999E8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20034");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        java.util.Locale locale11 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology9, locale11, (java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.Chronology chronology15 = chronology9.withZone(dateTimeZone14);
        org.joda.time.DateTimeField dateTimeField16 = chronology9.hourOfDay();
        org.joda.time.DateTimeField dateTimeField17 = chronology9.minuteOfHour();
        long long21 = chronology9.add(35L, 10L, (int) '#');
        org.joda.time.DateTimeField dateTimeField22 = chronology9.secondOfMinute();
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertEquals(locale11.toString(), "eng");
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 385L + "'", long21 == 385L);
        org.junit.Assert.assertNotNull(dateTimeField22);
    }

    @Test
    public void test20035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20035");
        java.util.Locale locale2 = new java.util.Locale("france", "\u5e74\u6708\u65e5\u661f\u671f\u56db\u4e0a\u5348\u65f6\u5206\u79d2 +00:00:00.035");
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\u5e74\u6708\u65e5\u661f\u671f\u56db\u4e0a\u5348\u65f6\u5206\u79d2 +00:00:00.035");
    }

    @Test
    public void test20036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20036");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.clockhourOfDay();
        org.joda.time.DurationField durationField10 = chronology8.halfdays();
        org.joda.time.DurationField durationField11 = chronology8.years();
        org.joda.time.Chronology chronology14 = null;
        java.util.Locale locale16 = new java.util.Locale("hi!");
        java.lang.String str17 = locale16.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket(0L, chronology14, locale16, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology21 = dateTimeParserBucket20.getChronology();
        java.util.Locale locale23 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology21, locale23, (java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.Chronology chronology27 = chronology21.withZone(dateTimeZone26);
        org.joda.time.DateTimeZone dateTimeZone28 = chronology27.getZone();
        java.util.Locale locale30 = java.util.Locale.PRC;
        java.util.Locale.setDefault(locale30);
        java.lang.String str32 = dateTimeZone28.getShortName((long) 'u', locale30);
        org.joda.time.Chronology chronology33 = chronology8.withZone(dateTimeZone28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = dateTimeFormatter34.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str38 = dateTimeZone36.getName((long) 2000);
        boolean boolean39 = dateTimeZone36.isFixed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = dateTimeFormatter34.withZone(dateTimeZone36);
        org.joda.time.format.DateTimeParser dateTimeParser41 = dateTimeFormatter34.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter42 = dateTimeFormatter34.getPrinter();
        org.joda.time.Chronology chronology43 = dateTimeFormatter34.getChronolgy();
        org.joda.time.LocalDate localDate45 = dateTimeFormatter34.parseLocalDate("69-12-31");
        int[] intArray47 = chronology8.get((org.joda.time.ReadablePartial) localDate45, (-33L));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter49 = dateTimeFormatter48.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str52 = dateTimeZone50.getName((long) 2000);
        boolean boolean53 = dateTimeZone50.isFixed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter54 = dateTimeFormatter48.withZone(dateTimeZone50);
        org.joda.time.format.DateTimeParser dateTimeParser55 = dateTimeFormatter48.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter56 = dateTimeFormatter48.getPrinter();
        org.joda.time.Chronology chronology57 = dateTimeFormatter48.getChronolgy();
        org.joda.time.LocalDate localDate59 = dateTimeFormatter48.parseLocalDate("69-12-31");
        org.joda.time.Chronology chronology62 = null;
        java.util.Locale locale64 = new java.util.Locale("hi!");
        java.lang.String str65 = locale64.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket68 = new org.joda.time.format.DateTimeParserBucket(0L, chronology62, locale64, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology69 = dateTimeParserBucket68.getChronology();
        java.util.Locale locale71 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket73 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology69, locale71, (java.lang.Integer) 10);
        org.joda.time.DurationField durationField74 = chronology69.days();
        org.joda.time.DurationField durationField75 = chronology69.halfdays();
        long long79 = chronology69.add(0L, (long) (short) 0, (-1));
        org.joda.time.DateTimeField dateTimeField80 = chronology69.hourOfDay();
        boolean boolean81 = localDate59.equals((java.lang.Object) dateTimeField80);
        org.joda.time.DateTimeFieldType dateTimeFieldType83 = localDate59.getFieldType((int) (byte) 1);
        boolean boolean84 = localDate45.isSupported(dateTimeFieldType83);
        int int85 = localDate45.size();
        int int86 = localDate45.size();
        int int87 = localDate45.size();
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertEquals(locale16.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertEquals(locale23.toString(), "eng");
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "-04:01" + "'", str32, "-04:01");
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(dateTimeFormatter34);
        org.junit.Assert.assertNotNull(dateTimeFormatter35);
        org.junit.Assert.assertNotNull(dateTimeZone36);
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "-04:01" + "'", str38, "-04:01");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter40);
        org.junit.Assert.assertNotNull(dateTimeParser41);
        org.junit.Assert.assertNotNull(dateTimePrinter42);
        org.junit.Assert.assertNull(chronology43);
        org.junit.Assert.assertNotNull(localDate45);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[1969, 12, 31]");
        org.junit.Assert.assertNotNull(dateTimeFormatter48);
        org.junit.Assert.assertNotNull(dateTimeFormatter49);
        org.junit.Assert.assertNotNull(dateTimeZone50);
// flaky:         org.junit.Assert.assertEquals("'" + str52 + "' != '" + "-04:01" + "'", str52, "-04:01");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter54);
        org.junit.Assert.assertNotNull(dateTimeParser55);
        org.junit.Assert.assertNotNull(dateTimePrinter56);
        org.junit.Assert.assertNull(chronology57);
        org.junit.Assert.assertNotNull(localDate59);
        org.junit.Assert.assertEquals(locale64.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(chronology69);
        org.junit.Assert.assertEquals(locale71.toString(), "eng");
        org.junit.Assert.assertNotNull(durationField74);
        org.junit.Assert.assertNotNull(durationField75);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 0L + "'", long79 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 3 + "'", int85 == 3);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 3 + "'", int86 == 3);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 3 + "'", int87 == 3);
    }

    @Test
    public void test20037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20037");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology2, locale3, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str7 = locale0.getDisplayCountry(locale3);
        java.util.Locale locale8 = java.util.Locale.ITALIAN;
        java.lang.String str9 = locale0.getDisplayLanguage(locale8);
        java.lang.String str10 = locale8.getDisplayScript();
        java.util.Set<java.lang.Character> charSet11 = locale8.getExtensionKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "giapponese" + "'", str9, "giapponese");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charSet11);
    }

    @Test
    public void test20038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20038");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str4 = dateTimeZone2.getName((long) 2000);
        boolean boolean5 = dateTimeZone2.isFixed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter0.withZone(dateTimeZone2);
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter0.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = dateTimeFormatter0.getPrinter();
        org.joda.time.Chronology chronology9 = dateTimeFormatter0.getChronolgy();
        org.joda.time.LocalDate localDate11 = dateTimeFormatter0.parseLocalDate("69-12-31");
        org.joda.time.Chronology chronology12 = localDate11.getChronology();
        int int14 = localDate11.getValue(1);
        org.joda.time.Chronology chronology17 = null;
        java.util.Locale locale19 = new java.util.Locale("hi!");
        java.lang.String str20 = locale19.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket(0L, chronology17, locale19, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology24 = dateTimeParserBucket23.getChronology();
        org.joda.time.DurationField durationField25 = chronology24.days();
        org.joda.time.DateTimeField dateTimeField26 = chronology24.year();
        org.joda.time.DateTimeField dateTimeField27 = chronology24.millisOfDay();
        org.joda.time.DateTimeField dateTimeField28 = chronology24.hourOfHalfday();
        org.joda.time.DurationField durationField29 = chronology24.minutes();
        java.util.Locale locale31 = java.util.Locale.forLanguageTag("zh-CN");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology24, locale31, (java.lang.Integer) 40, 10);
        org.joda.time.DateTimeField dateTimeField35 = chronology24.yearOfCentury();
        java.lang.String str36 = chronology24.toString();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = dateTimeFormatter37.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str41 = dateTimeZone39.getName((long) 2000);
        boolean boolean42 = dateTimeZone39.isFixed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = dateTimeFormatter37.withZone(dateTimeZone39);
        org.joda.time.format.DateTimeParser dateTimeParser44 = dateTimeFormatter37.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter45 = dateTimeFormatter37.getPrinter();
        org.joda.time.Chronology chronology46 = dateTimeFormatter37.getChronolgy();
        org.joda.time.LocalDate localDate48 = dateTimeFormatter37.parseLocalDate("69-12-31");
        java.lang.String str49 = localDate48.toString();
        long long51 = chronology24.set((org.joda.time.ReadablePartial) localDate48, 2040L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter52 = org.joda.time.format.DateTimeFormat.fullDate();
        boolean boolean53 = dateTimeFormatter52.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter55 = dateTimeFormatter52.withPivotYear(2000);
        org.joda.time.format.DateTimeParser dateTimeParser56 = dateTimeFormatter55.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter57 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter58 = dateTimeFormatter57.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str61 = dateTimeZone59.getName((long) 2000);
        boolean boolean62 = dateTimeZone59.isFixed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter63 = dateTimeFormatter57.withZone(dateTimeZone59);
        org.joda.time.format.DateTimeParser dateTimeParser64 = dateTimeFormatter57.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter65 = dateTimeFormatter57.getPrinter();
        org.joda.time.Chronology chronology66 = dateTimeFormatter57.getChronolgy();
        org.joda.time.LocalDate localDate68 = dateTimeFormatter57.parseLocalDate("69-12-31");
        java.lang.String str69 = localDate68.toString();
        int int70 = localDate68.size();
        java.lang.String str71 = dateTimeFormatter55.print((org.joda.time.ReadablePartial) localDate68);
        int int72 = localDate48.compareTo((org.joda.time.ReadablePartial) localDate68);
        int int73 = localDate11.compareTo((org.joda.time.ReadablePartial) localDate68);
        org.joda.time.DateTimeField dateTimeField75 = localDate68.getField((int) (byte) 1);
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-04:01" + "'", str4, "-04:01");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeParser7);
        org.junit.Assert.assertNotNull(dateTimePrinter8);
        org.junit.Assert.assertNull(chronology9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 12 + "'", int14 == 12);
        org.junit.Assert.assertEquals(locale19.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "ISOChronology[UTC]" + "'", str36, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeFormatter37);
        org.junit.Assert.assertNotNull(dateTimeFormatter38);
        org.junit.Assert.assertNotNull(dateTimeZone39);
// flaky:         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "-04:01" + "'", str41, "-04:01");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter43);
        org.junit.Assert.assertNotNull(dateTimeParser44);
        org.junit.Assert.assertNotNull(dateTimePrinter45);
        org.junit.Assert.assertNull(chronology46);
        org.junit.Assert.assertNotNull(localDate48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "1969-12-31" + "'", str49, "1969-12-31");
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + (-86397960L) + "'", long51 == (-86397960L));
        org.junit.Assert.assertNotNull(dateTimeFormatter52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter55);
        org.junit.Assert.assertNotNull(dateTimeParser56);
        org.junit.Assert.assertNotNull(dateTimeFormatter57);
        org.junit.Assert.assertNotNull(dateTimeFormatter58);
        org.junit.Assert.assertNotNull(dateTimeZone59);
// flaky:         org.junit.Assert.assertEquals("'" + str61 + "' != '" + "-04:01" + "'", str61, "-04:01");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter63);
        org.junit.Assert.assertNotNull(dateTimeParser64);
        org.junit.Assert.assertNotNull(dateTimePrinter65);
        org.junit.Assert.assertNull(chronology66);
        org.junit.Assert.assertNotNull(localDate68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "1969-12-31" + "'", str69, "1969-12-31");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 3 + "'", int70 == 3);
// flaky:         org.junit.Assert.assertEquals("'" + str71 + "' != '" + "\u5e74\u6708\u65e5\u661f\u671f\u4e09" + "'", str71, "\u5e74\u6708\u65e5\u661f\u671f\u4e09");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(dateTimeField75);
    }

    @Test
    public void test20039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20039");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("it");
        java.util.Locale.Builder builder6 = builder3.clear();
        java.util.Locale locale7 = java.util.Locale.CHINESE;
        java.util.Locale locale8 = java.util.Locale.FRANCE;
        java.lang.String str9 = locale7.getDisplayScript(locale8);
        java.util.Locale.Builder builder10 = builder3.setLocale(locale7);
        java.util.Locale locale11 = java.util.Locale.PRC;
        java.util.Locale.setDefault(locale11);
        java.util.Locale.setDefault(locale11);
        java.util.Locale.Builder builder14 = builder10.setLocale(locale11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter15.withOffsetParsed();
        org.joda.time.Chronology chronology19 = null;
        java.util.Locale locale21 = new java.util.Locale("hi!");
        java.lang.String str22 = locale21.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket(0L, chronology19, locale21, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology26 = dateTimeParserBucket25.getChronology();
        java.util.Locale locale28 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology26, locale28, (java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.Chronology chronology32 = chronology26.withZone(dateTimeZone31);
        org.joda.time.DateTimeZone dateTimeZone33 = chronology32.getZone();
        java.util.Locale locale35 = java.util.Locale.PRC;
        java.util.Locale.setDefault(locale35);
        java.lang.String str37 = dateTimeZone33.getShortName((long) 'u', locale35);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = dateTimeFormatter16.withLocale(locale35);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = dateTimeFormatter38.withPivotYear((java.lang.Integer) 40);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = dateTimeFormatter40.withPivotYear(0);
        java.util.Locale locale43 = dateTimeFormatter40.getLocale();
        java.util.Locale.Builder builder44 = builder10.setLocale(locale43);
        java.util.Locale locale45 = builder10.build();
        java.util.Locale locale46 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.Character> charSet47 = locale46.getExtensionKeys();
        java.lang.String str49 = locale46.getExtension('u');
        boolean boolean50 = locale46.hasExtensions();
        java.lang.String str51 = locale45.getDisplayCountry(locale46);
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.getDefault();
        long long55 = dateTimeZone52.adjustOffset((long) 0, true);
        java.lang.String str57 = dateTimeZone52.getNameKey((long) (-1));
        java.lang.String str59 = dateTimeZone52.getNameKey((long) 0);
        boolean boolean61 = dateTimeZone52.isStandardOffset((long) ' ');
        java.lang.String str62 = dateTimeZone52.getID();
        java.util.Locale locale64 = new java.util.Locale("hi!");
        boolean boolean65 = dateTimeZone52.equals((java.lang.Object) locale64);
        java.lang.String str66 = locale64.getScript();
        java.lang.String str67 = locale64.getScript();
        java.util.Locale locale68 = java.util.Locale.getDefault();
        java.util.Set<java.lang.Character> charSet69 = locale68.getExtensionKeys();
        java.util.Locale locale70 = java.util.Locale.getDefault();
        java.lang.String str71 = locale70.toLanguageTag();
        java.util.Locale locale73 = new java.util.Locale("hi!");
        java.lang.String str74 = locale73.getDisplayCountry();
        java.lang.String str75 = locale73.toLanguageTag();
        java.lang.String str76 = locale70.getDisplayName(locale73);
        java.lang.String str77 = locale68.getDisplayCountry(locale73);
        java.lang.String str78 = locale64.getDisplayCountry(locale73);
        java.util.Locale locale79 = locale73.stripExtensions();
        java.lang.String str80 = locale45.getDisplayCountry(locale79);
        java.util.Locale locale81 = java.util.Locale.PRC;
        java.util.Locale.setDefault(locale81);
        java.lang.String str83 = locale81.getDisplayName();
        java.lang.String str84 = locale81.getISO3Language();
        java.lang.String str85 = locale79.getDisplayCountry(locale81);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertEquals(locale21.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertEquals(locale28.toString(), "eng");
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "-04:01" + "'", str37, "-04:01");
        org.junit.Assert.assertNotNull(dateTimeFormatter38);
        org.junit.Assert.assertNotNull(dateTimeFormatter40);
        org.junit.Assert.assertNotNull(dateTimeFormatter42);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(charSet47);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd" + "'", str51, "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd");
        org.junit.Assert.assertNotNull(dateTimeZone52);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
// flaky:         org.junit.Assert.assertNull(str57);
// flaky:         org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str62 + "' != '" + "-04:01" + "'", str62, "-04:01");
        org.junit.Assert.assertEquals(locale64.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(charSet69);
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "zh-CN" + "'", str71, "zh-CN");
        org.junit.Assert.assertEquals(locale73.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "und" + "'", str75, "und");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "Chinese (China)" + "'", str76, "Chinese (China)");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "China" + "'", str77, "China");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "China" + "'", str80, "China");
        org.junit.Assert.assertNotNull(locale81);
        org.junit.Assert.assertEquals(locale81.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str83 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str83, "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "zho" + "'", str84, "zho");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
    }

    @Test
    public void test20040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20040");
        java.io.IOException iOException1 = new java.io.IOException("java.io.IOException");
        java.io.IOException iOException2 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.io.IOException iOException3 = new java.io.IOException();
        java.io.IOException iOException4 = new java.io.IOException();
        iOException3.addSuppressed((java.lang.Throwable) iOException4);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) iOException3);
        java.lang.Throwable[] throwableArray7 = iOException3.getSuppressed();
        iOException2.addSuppressed((java.lang.Throwable) iOException3);
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) iOException3);
        java.io.IOException iOException10 = new java.io.IOException((java.lang.Throwable) iOException9);
        java.lang.Throwable[] throwableArray11 = iOException10.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray11);
    }

    @Test
    public void test20041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20041");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("\u4e2d\u570b");
        java.lang.String str2 = locale1.getScript();
        java.lang.String str3 = locale1.getDisplayName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale1.getUnicodeLocaleType("en-gb");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: en-gb");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test20042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20042");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.year();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.millisOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.millisOfDay();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.secondOfMinute();
        java.util.Locale locale17 = new java.util.Locale("United States", "hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket(10L, chronology9, locale17, (java.lang.Integer) 0);
        java.lang.String str21 = locale17.getExtension('a');
        java.lang.String str22 = locale17.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet23 = locale17.getUnicodeLocaleKeys();
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertEquals(locale17.toString(), "united states_HI!");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "united states" + "'", str22, "united states");
        org.junit.Assert.assertNotNull(strSet23);
    }

    @Test
    public void test20043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20043");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("it");
        java.util.Locale locale6 = builder3.build();
        java.util.Locale.Builder builder7 = builder3.clear();
        java.util.Locale locale8 = java.util.Locale.CHINESE;
        java.util.Locale locale9 = java.util.Locale.FRANCE;
        java.lang.String str10 = locale8.getDisplayScript(locale9);
        java.lang.String str11 = locale9.getLanguage();
        java.util.Locale.Builder builder12 = builder7.setLocale(locale9);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        long long16 = dateTimeZone13.adjustOffset((long) 0, true);
        java.lang.String str18 = dateTimeZone13.getNameKey((long) (-1));
        java.lang.String str20 = dateTimeZone13.getNameKey((long) 0);
        boolean boolean22 = dateTimeZone13.isStandardOffset((long) ' ');
        java.lang.String str23 = dateTimeZone13.getID();
        java.util.Locale locale25 = new java.util.Locale("hi!");
        boolean boolean26 = dateTimeZone13.equals((java.lang.Object) locale25);
        java.lang.String str27 = locale25.getScript();
        java.lang.String str28 = locale25.getScript();
        java.util.Locale locale29 = java.util.Locale.getDefault();
        java.util.Set<java.lang.Character> charSet30 = locale29.getExtensionKeys();
        java.util.Locale locale31 = java.util.Locale.getDefault();
        java.lang.String str32 = locale31.toLanguageTag();
        java.util.Locale locale34 = new java.util.Locale("hi!");
        java.lang.String str35 = locale34.getDisplayCountry();
        java.lang.String str36 = locale34.toLanguageTag();
        java.lang.String str37 = locale31.getDisplayName(locale34);
        java.lang.String str38 = locale29.getDisplayCountry(locale34);
        java.lang.String str39 = locale25.getDisplayCountry(locale34);
        java.util.Locale locale40 = locale34.stripExtensions();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.getDefault();
        long long44 = dateTimeZone41.adjustOffset((long) 0, true);
        java.lang.String str46 = dateTimeZone41.getNameKey((long) (-1));
        java.lang.String str48 = dateTimeZone41.getNameKey((long) 0);
        boolean boolean50 = dateTimeZone41.isStandardOffset((long) ' ');
        java.lang.String str51 = dateTimeZone41.getID();
        java.util.Locale locale53 = new java.util.Locale("hi!");
        boolean boolean54 = dateTimeZone41.equals((java.lang.Object) locale53);
        java.lang.String str55 = locale53.getScript();
        java.util.Locale locale56 = java.util.Locale.ENGLISH;
        java.util.Locale locale57 = locale56.stripExtensions();
        java.lang.String str58 = locale53.getDisplayLanguage(locale57);
        java.lang.String str59 = locale40.getDisplayCountry(locale57);
        java.lang.String str60 = locale9.getDisplayName(locale40);
        java.lang.String str61 = locale9.getDisplayVariant();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "fr" + "'", str11, "fr");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
// flaky:         org.junit.Assert.assertNull(str18);
// flaky:         org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-04:01" + "'", str23, "-04:01");
        org.junit.Assert.assertEquals(locale25.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(charSet30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "zh-CN" + "'", str32, "zh-CN");
        org.junit.Assert.assertEquals(locale34.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "und" + "'", str36, "und");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Chinese (China)" + "'", str37, "Chinese (China)");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "China" + "'", str38, "China");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "hi!");
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
// flaky:         org.junit.Assert.assertNull(str46);
// flaky:         org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str51 + "' != '" + "-04:01" + "'", str51, "-04:01");
        org.junit.Assert.assertEquals(locale53.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "en");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "en");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "French (France)" + "'", str60, "French (France)");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
    }

    @Test
    public void test20044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20044");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        java.util.Locale locale11 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology9, locale11, (java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.Chronology chronology15 = chronology9.withZone(dateTimeZone14);
        org.joda.time.DurationField durationField16 = chronology15.days();
        java.lang.String str17 = chronology15.toString();
        org.joda.time.DateTimeField dateTimeField18 = chronology15.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField19 = chronology15.weekyear();
        org.joda.time.DurationField durationField20 = chronology15.hours();
        org.joda.time.DurationField durationField21 = chronology15.seconds();
        org.joda.time.DurationField durationField22 = chronology15.seconds();
        org.joda.time.DateTimeField dateTimeField23 = chronology15.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField24 = chronology15.halfdayOfDay();
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertEquals(locale11.toString(), "eng");
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(durationField16);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ISOChronology[-04:01]" + "'", str17, "ISOChronology[-04:01]");
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
    }

    @Test
    public void test20045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20045");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.era();
        org.joda.time.DurationField durationField13 = chronology8.halfdays();
        org.joda.time.DurationField durationField14 = chronology8.minutes();
        org.joda.time.DurationField durationField15 = chronology8.seconds();
        java.lang.String str16 = chronology8.toString();
        org.joda.time.Chronology chronology17 = chronology8.withUTC();
        org.joda.time.DateTimeField dateTimeField18 = chronology8.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField19 = chronology8.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField20 = chronology8.minuteOfHour();
        org.joda.time.DurationField durationField21 = chronology8.months();
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ISOChronology[UTC]" + "'", str16, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
    }

    @Test
    public void test20046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20046");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale5 = new java.util.Locale("hi!");
        java.lang.String str6 = locale5.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket(0L, chronology3, locale5, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology10 = dateTimeParserBucket9.getChronology();
        java.util.Locale locale12 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology10, locale12, (java.lang.Integer) 10);
        org.joda.time.DurationField durationField15 = chronology10.days();
        org.joda.time.DurationField durationField16 = chronology10.halfdays();
        org.joda.time.DateTimeField dateTimeField17 = chronology10.weekyear();
        java.util.Locale locale19 = new java.util.Locale("China");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 0, chronology10, locale19, (java.lang.Integer) (-1), (int) 'x');
        org.joda.time.DurationField durationField23 = chronology10.years();
        org.joda.time.DateTimeZone dateTimeZone24 = chronology10.getZone();
        org.junit.Assert.assertEquals(locale5.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertEquals(locale12.toString(), "eng");
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertEquals(locale19.toString(), "china");
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
    }

    @Test
    public void test20047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20047");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullDate();
        boolean boolean1 = dateTimeFormatter0.isOffsetParsed();
        java.lang.Integer int2 = dateTimeFormatter0.getPivotYear();
        org.joda.time.Chronology chronology3 = dateTimeFormatter0.getChronology();
        org.joda.time.Chronology chronology4 = dateTimeFormatter0.getChronology();
        org.joda.time.Chronology chronology5 = dateTimeFormatter0.getChronolgy();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertNull(chronology5);
    }

    @Test
    public void test20048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20048");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "en-US");
        java.util.Locale.Builder builder6 = builder4.setLanguageTag("it");
        java.util.Locale locale7 = builder4.build();
        java.util.Locale.setDefault(category0, locale7);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        long long12 = dateTimeZone9.adjustOffset((long) 0, true);
        java.lang.String str14 = dateTimeZone9.getNameKey((long) (-1));
        java.lang.String str16 = dateTimeZone9.getNameKey((long) 0);
        boolean boolean18 = dateTimeZone9.isStandardOffset((long) ' ');
        java.lang.String str19 = dateTimeZone9.getID();
        java.util.Locale locale21 = new java.util.Locale("hi!");
        boolean boolean22 = dateTimeZone9.equals((java.lang.Object) locale21);
        java.util.Locale locale23 = locale21.stripExtensions();
        java.util.Locale.setDefault(category0, locale23);
        java.util.Locale locale26 = new java.util.Locale("11.02.22");
        java.util.Locale.setDefault(category0, locale26);
        java.util.Locale locale28 = java.util.Locale.getDefault(category0);
        java.util.Locale locale29 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
// flaky:         org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-04:01" + "'", str19, "-04:01");
        org.junit.Assert.assertEquals(locale21.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "hi!");
        org.junit.Assert.assertEquals(locale26.toString(), "11.02.22");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "11.02.22");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "11.02.22");
    }

    @Test
    public void test20049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20049");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale5 = new java.util.Locale("hi!");
        java.lang.String str6 = locale5.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket(0L, chronology3, locale5, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology10 = dateTimeParserBucket9.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.days();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.year();
        org.joda.time.DateTimeField dateTimeField13 = chronology10.millisOfDay();
        org.joda.time.DateTimeField dateTimeField14 = chronology10.era();
        org.joda.time.DateTimeField dateTimeField15 = chronology10.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField16 = chronology10.dayOfYear();
        org.joda.time.DurationField durationField17 = chronology10.years();
        long long21 = chronology10.add((long) 1, (long) (short) 10, (int) '4');
        org.joda.time.DurationField durationField22 = chronology10.centuries();
        org.joda.time.DateTimeField dateTimeField23 = chronology10.year();
        java.util.Locale.Category category24 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder25 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder28 = builder25.setExtension('a', "en-US");
        java.util.Locale.Builder builder30 = builder28.setLanguageTag("it");
        java.util.Locale locale31 = builder28.build();
        java.util.Locale.setDefault(category24, locale31);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        long long36 = dateTimeZone33.adjustOffset((long) 0, true);
        java.lang.String str37 = dateTimeZone33.toString();
        java.util.Locale.Builder builder39 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder42 = builder39.setExtension('a', "en-US");
        java.util.Locale.Builder builder44 = builder42.setVariant("");
        java.util.Locale.Builder builder45 = builder44.clear();
        java.util.Locale.Builder builder46 = builder45.clearExtensions();
        java.util.Locale.Builder builder49 = builder45.setExtension('a', "it");
        java.util.Locale locale50 = builder49.build();
        java.lang.String str51 = dateTimeZone33.getShortName((long) (short) 1, locale50);
        java.util.Set<java.lang.String> strSet52 = locale50.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder53 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder56 = builder53.setExtension('a', "en-US");
        java.util.Locale.Builder builder57 = builder56.clearExtensions();
        java.util.Locale locale58 = java.util.Locale.JAPANESE;
        org.joda.time.Chronology chronology60 = null;
        java.util.Locale locale61 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket64 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology60, locale61, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str65 = locale58.getDisplayCountry(locale61);
        java.util.Locale locale66 = java.util.Locale.ITALIAN;
        java.lang.String str67 = locale58.getDisplayLanguage(locale66);
        org.joda.time.Chronology chronology69 = null;
        java.util.Locale locale70 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket73 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology69, locale70, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str74 = locale70.toLanguageTag();
        java.lang.String str75 = locale58.getDisplayCountry(locale70);
        java.util.Locale.Builder builder76 = builder56.setLocale(locale70);
        java.lang.String str77 = locale50.getDisplayVariant(locale70);
        java.lang.String str78 = locale50.getISO3Language();
        java.util.Locale.setDefault(category24, locale50);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket80 = new org.joda.time.format.DateTimeParserBucket(0L, chronology10, locale50);
        java.util.Locale locale82 = new java.util.Locale("it");
        java.lang.String str84 = locale82.getExtension('a');
        java.util.Set<java.lang.String> strSet85 = locale82.getUnicodeLocaleAttributes();
        java.lang.String str86 = locale82.getVariant();
        java.lang.String str87 = locale82.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket88 = new org.joda.time.format.DateTimeParserBucket((-144060003L), chronology10, locale82);
        org.junit.Assert.assertEquals(locale5.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 521L + "'", long21 == 521L);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertTrue("'" + category24 + "' != '" + java.util.Locale.Category.FORMAT + "'", category24.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "it");
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "-04:01" + "'", str37, "-04:01");
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "");
// flaky:         org.junit.Assert.assertEquals("'" + str51 + "' != '" + "-04:01" + "'", str51, "-04:01");
        org.junit.Assert.assertNotNull(strSet52);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "ja");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "it");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "it");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "giapponese" + "'", str67, "giapponese");
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "it");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "it" + "'", str74, "it");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals(locale82.toString(), "it");
        org.junit.Assert.assertNull(str84);
        org.junit.Assert.assertNotNull(strSet85);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
    }

    @Test
    public void test20050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20050");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.secondOfDay();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.dayOfYear();
        org.joda.time.DateTimeField dateTimeField15 = chronology8.monthOfYear();
        java.lang.String str16 = chronology8.toString();
        org.joda.time.DateTimeField dateTimeField17 = chronology8.clockhourOfHalfday();
        org.joda.time.Chronology chronology18 = chronology8.withUTC();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.millisOfDay();
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ISOChronology[UTC]" + "'", str16, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test20051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20051");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 1);
        org.joda.time.Chronology chronology6 = null;
        java.util.Locale locale8 = new java.util.Locale("hi!");
        java.lang.String str9 = locale8.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket(0L, chronology6, locale8, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology13 = dateTimeParserBucket12.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.days();
        org.joda.time.DateTimeField dateTimeField15 = chronology13.year();
        org.joda.time.DateTimeField dateTimeField16 = chronology13.weekyearOfCentury();
        org.joda.time.Chronology chronology17 = chronology13.withUTC();
        org.joda.time.DurationField durationField18 = chronology13.minutes();
        java.util.Locale locale22 = new java.util.Locale("UTC", "1/1/70", "it");
        java.lang.String str23 = locale22.getDisplayVariant();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket((long) ' ', chronology13, locale22, (java.lang.Integer) 10, (int) (short) 100);
        java.lang.String str27 = locale22.getDisplayScript();
        java.lang.String str28 = dateTimeZone2.getShortName((-346200000L), locale22);
        org.joda.time.Chronology chronology30 = null;
        java.util.Locale locale32 = new java.util.Locale("hi!");
        java.lang.String str33 = locale32.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket36 = new org.joda.time.format.DateTimeParserBucket(0L, chronology30, locale32, (java.lang.Integer) 10, (int) 'a');
        long long39 = dateTimeParserBucket36.computeMillis(true, "hi!");
        long long41 = dateTimeParserBucket36.computeMillis(true);
        org.joda.time.Chronology chronology43 = null;
        java.util.Locale locale45 = new java.util.Locale("hi!");
        java.lang.String str46 = locale45.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket49 = new org.joda.time.format.DateTimeParserBucket(0L, chronology43, locale45, (java.lang.Integer) 10, (int) 'a');
        int int50 = dateTimeParserBucket49.getOffset();
        org.joda.time.DateTimeZone dateTimeZone51 = dateTimeParserBucket49.getZone();
        long long54 = dateTimeZone51.adjustOffset((-1L), true);
        long long57 = dateTimeZone51.adjustOffset((long) 'a', true);
        boolean boolean59 = dateTimeZone51.isStandardOffset((long) 100);
        long long62 = dateTimeZone51.adjustOffset((long) (byte) 10, false);
        dateTimeParserBucket36.setZone(dateTimeZone51);
        boolean boolean64 = dateTimeZone2.equals((java.lang.Object) dateTimeParserBucket36);
        java.lang.String str66 = dateTimeZone2.getNameKey((-72000000L));
        org.joda.time.Chronology chronology68 = null;
        java.util.Locale locale70 = new java.util.Locale("hi!");
        java.lang.String str71 = locale70.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket74 = new org.joda.time.format.DateTimeParserBucket(0L, chronology68, locale70, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology75 = dateTimeParserBucket74.getChronology();
        org.joda.time.DurationField durationField76 = chronology75.days();
        org.joda.time.DateTimeField dateTimeField77 = chronology75.year();
        org.joda.time.DateTimeField dateTimeField78 = chronology75.monthOfYear();
        boolean boolean79 = dateTimeZone2.equals((java.lang.Object) dateTimeField78);
        java.util.Locale locale84 = new java.util.Locale("Twi (en-us)", "japanisch", "und-DE");
        java.lang.String str85 = dateTimeZone2.getShortName(100L, locale84);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals(locale8.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertEquals(locale22.toString(), "utc_1/1/70_it");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "it" + "'", str23, "it");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+32:01" + "'", str28, "+32:01");
        org.junit.Assert.assertEquals(locale32.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
// flaky:         org.junit.Assert.assertTrue("'" + long39 + "' != '" + 14460000L + "'", long39 == 14460000L);
// flaky:         org.junit.Assert.assertTrue("'" + long41 + "' != '" + 14460000L + "'", long41 == 14460000L);
        org.junit.Assert.assertEquals(locale45.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone51);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + (-1L) + "'", long54 == (-1L));
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 97L + "'", long57 == 97L);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 10L + "'", long62 == 10L);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertEquals(locale70.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(chronology75);
        org.junit.Assert.assertNotNull(durationField76);
        org.junit.Assert.assertNotNull(dateTimeField77);
        org.junit.Assert.assertNotNull(dateTimeField78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals(locale84.toString(), "twi (en-us)_JAPANISCH_und-DE");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "+32:01" + "'", str85, "+32:01");
    }

    @Test
    public void test20052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20052");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withChronology(chronology4);
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter5.getPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser7);
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale12 = new java.util.Locale("hi!");
        java.lang.String str13 = locale12.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket(0L, chronology10, locale12, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekyear();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.monthOfYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter8.withChronology(chronology17);
        int int21 = dateTimeFormatter20.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter20.withPivotYear((java.lang.Integer) 144060000);
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimePrinter6);
        org.junit.Assert.assertEquals(locale12.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2000 + "'", int21 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
    }

    @Test
    public void test20053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20053");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.DateTimeField dateTimeField8 = null;
        dateTimeParserBucket7.saveField(dateTimeField8, 10);
        java.lang.Integer int11 = dateTimeParserBucket7.getOffsetInteger();
        dateTimeParserBucket7.setOffset((java.lang.Integer) 1);
        dateTimeParserBucket7.setOffset((java.lang.Integer) 1);
        dateTimeParserBucket7.setPivotYear((java.lang.Integer) 100);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        dateTimeParserBucket7.setZone(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHours((int) '4');
        boolean boolean24 = dateTimeZone22.isStandardOffset((long) '#');
        dateTimeParserBucket7.setZone(dateTimeZone22);
        int int27 = dateTimeZone22.getStandardOffset(0L);
        org.joda.time.format.DateTimePrinter dateTimePrinter28 = null;
        org.joda.time.format.DateTimeParser dateTimeParser29 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter28, dateTimeParser29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = dateTimeFormatter30.withPivotYear((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = dateTimeFormatter32.withZone(dateTimeZone33);
        org.joda.time.Chronology chronology35 = dateTimeFormatter32.getChronology();
        org.joda.time.DateTimeZone dateTimeZone36 = dateTimeFormatter32.getZone();
        org.joda.time.format.DateTimeParser dateTimeParser37 = dateTimeFormatter32.getParser();
        org.joda.time.Chronology chronology39 = null;
        java.util.Locale locale41 = new java.util.Locale("hi!");
        java.lang.String str42 = locale41.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket45 = new org.joda.time.format.DateTimeParserBucket(0L, chronology39, locale41, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology46 = dateTimeParserBucket45.getChronology();
        org.joda.time.DurationField durationField47 = chronology46.days();
        org.joda.time.DateTimeField dateTimeField48 = chronology46.year();
        org.joda.time.DateTimeField dateTimeField49 = chronology46.weekyearOfCentury();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter50 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = dateTimeFormatter50.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str54 = dateTimeZone52.getName((long) 2000);
        boolean boolean55 = dateTimeZone52.isFixed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter56 = dateTimeFormatter50.withZone(dateTimeZone52);
        org.joda.time.Chronology chronology57 = chronology46.withZone(dateTimeZone52);
        org.joda.time.ReadablePeriod readablePeriod58 = null;
        long long61 = chronology57.add(readablePeriod58, (long) (short) -1, 10);
        org.joda.time.DateTimeField dateTimeField62 = chronology57.weekyear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter63 = dateTimeFormatter32.withChronology(chronology57);
        boolean boolean64 = dateTimeZone22.equals((java.lang.Object) dateTimeFormatter32);
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 187200000 + "'", int27 == 187200000);
        org.junit.Assert.assertNotNull(dateTimeFormatter32);
        org.junit.Assert.assertNotNull(dateTimeFormatter34);
        org.junit.Assert.assertNull(chronology35);
        org.junit.Assert.assertNull(dateTimeZone36);
        org.junit.Assert.assertNull(dateTimeParser37);
        org.junit.Assert.assertEquals(locale41.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(durationField47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(dateTimeFormatter50);
        org.junit.Assert.assertNotNull(dateTimeFormatter51);
        org.junit.Assert.assertNotNull(dateTimeZone52);
// flaky:         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "-04:01" + "'", str54, "-04:01");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter56);
        org.junit.Assert.assertNotNull(chronology57);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + (-1L) + "'", long61 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField62);
        org.junit.Assert.assertNotNull(dateTimeFormatter63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test20054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20054");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        long long3 = dateTimeZone0.adjustOffset((long) 0, true);
        java.lang.String str5 = dateTimeZone0.getNameKey((long) (-1));
        java.lang.String str7 = dateTimeZone0.getNameKey((long) 0);
        boolean boolean9 = dateTimeZone0.isStandardOffset((long) ' ');
        java.util.Locale locale11 = java.util.Locale.getDefault();
        java.util.Set<java.lang.Character> charSet12 = locale11.getExtensionKeys();
        java.util.Locale locale13 = locale11.stripExtensions();
        java.lang.String str14 = dateTimeZone0.getShortName(117L, locale11);
        long long16 = dateTimeZone0.nextTransition((-2L));
        long long19 = dateTimeZone0.convertLocalToUTC((-199L), false);
        long long22 = dateTimeZone0.convertLocalToUTC((-58380393600000L), false);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
// flaky:         org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(charSet12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-04:01" + "'", str14, "-04:01");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-2L) + "'", long16 == (-2L));
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 14459801L + "'", long19 == 14459801L);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-58380379140000L) + "'", long22 == (-58380379140000L));
    }

    @Test
    public void test20055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20055");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withChronology(chronology4);
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter5.getPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser7);
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale12 = new java.util.Locale("hi!");
        java.lang.String str13 = locale12.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket(0L, chronology10, locale12, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekyear();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.monthOfYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter8.withChronology(chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter20.withZoneUTC();
        java.util.Locale locale22 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale23 = locale22.stripExtensions();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter20.withLocale(locale23);
        org.joda.time.Chronology chronology26 = null;
        java.util.Locale locale28 = new java.util.Locale("hi!");
        java.lang.String str29 = locale28.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket(0L, chronology26, locale28, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology33 = dateTimeParserBucket32.getChronology();
        org.joda.time.DateTimeField dateTimeField34 = chronology33.weekyear();
        org.joda.time.DateTimeField dateTimeField35 = chronology33.monthOfYear();
        org.joda.time.DateTimeField dateTimeField36 = chronology33.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField37 = chronology33.secondOfDay();
        org.joda.time.DateTimeField dateTimeField38 = chronology33.dayOfWeek();
        org.joda.time.DurationField durationField39 = chronology33.months();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = dateTimeFormatter40.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str44 = dateTimeZone42.getName((long) 2000);
        boolean boolean45 = dateTimeZone42.isFixed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = dateTimeFormatter40.withZone(dateTimeZone42);
        org.joda.time.format.DateTimeParser dateTimeParser47 = dateTimeFormatter40.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter48 = dateTimeFormatter40.getPrinter();
        org.joda.time.Chronology chronology49 = dateTimeFormatter40.getChronolgy();
        org.joda.time.LocalDate localDate51 = dateTimeFormatter40.parseLocalDate("69-12-31");
        org.joda.time.Chronology chronology52 = localDate51.getChronology();
        long long54 = chronology33.set((org.joda.time.ReadablePartial) localDate51, 2040L);
        java.lang.String str55 = dateTimeFormatter20.print((org.joda.time.ReadablePartial) localDate51);
        java.lang.String str56 = localDate51.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = localDate51.getFieldType(0);
        org.joda.time.Chronology chronology59 = localDate51.getChronology();
        org.joda.time.Chronology chronology61 = null;
        java.util.Locale locale63 = new java.util.Locale("hi!");
        java.lang.String str64 = locale63.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket67 = new org.joda.time.format.DateTimeParserBucket(0L, chronology61, locale63, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology68 = dateTimeParserBucket67.getChronology();
        org.joda.time.DurationField durationField69 = chronology68.days();
        long long73 = chronology68.add((long) 1, 100L, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField74 = chronology68.secondOfMinute();
        org.joda.time.DurationField durationField75 = chronology68.millis();
        org.joda.time.DurationField durationField76 = chronology68.seconds();
        org.joda.time.DateTimeField dateTimeField77 = chronology68.yearOfCentury();
        boolean boolean78 = localDate51.equals((java.lang.Object) dateTimeField77);
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimePrinter6);
        org.junit.Assert.assertEquals(locale12.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
        org.junit.Assert.assertEquals(locale28.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(durationField39);
        org.junit.Assert.assertNotNull(dateTimeFormatter40);
        org.junit.Assert.assertNotNull(dateTimeFormatter41);
        org.junit.Assert.assertNotNull(dateTimeZone42);
// flaky:         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "-04:01" + "'", str44, "-04:01");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter46);
        org.junit.Assert.assertNotNull(dateTimeParser47);
        org.junit.Assert.assertNotNull(dateTimePrinter48);
        org.junit.Assert.assertNull(chronology49);
        org.junit.Assert.assertNotNull(localDate51);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + (-86397960L) + "'", long54 == (-86397960L));
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "69-12-31" + "'", str55, "69-12-31");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "1969-12-31" + "'", str56, "1969-12-31");
        org.junit.Assert.assertNotNull(dateTimeFieldType58);
        org.junit.Assert.assertNotNull(chronology59);
        org.junit.Assert.assertEquals(locale63.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(chronology68);
        org.junit.Assert.assertNotNull(durationField69);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + (-99L) + "'", long73 == (-99L));
        org.junit.Assert.assertNotNull(dateTimeField74);
        org.junit.Assert.assertNotNull(durationField75);
        org.junit.Assert.assertNotNull(durationField76);
        org.junit.Assert.assertNotNull(dateTimeField77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test20056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20056");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder10 = builder6.setExtension('a', "it");
        java.util.Locale locale11 = builder6.build();
        java.util.Locale.Builder builder13 = builder6.setLanguageTag("en-us");
        java.util.Locale.Builder builder14 = builder13.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder13.addUnicodeLocaleAttribute("9:56:40 AM");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 9:56:40 AM [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test20057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20057");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.util.Locale.FilteringMode filteringMode10 = null;
        java.util.List<java.lang.String> strList11 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList8, filteringMode10);
        java.lang.String str12 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList8);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap13 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList14 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap13);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap15 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList16 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap15);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap17 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList18 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap17);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap19 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList20 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList18, strMap19);
        java.util.Locale.LanguageRange[] languageRangeArray21 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList22 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList22, languageRangeArray21);
        java.util.Locale locale24 = java.util.Locale.getDefault();
        java.lang.String str25 = locale24.toLanguageTag();
        java.util.Locale[] localeArray26 = new java.util.Locale[] { locale24 };
        java.util.ArrayList<java.util.Locale> localeList27 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList27, localeArray26);
        java.util.List<java.util.Locale> localeList29 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList22, (java.util.Collection<java.util.Locale>) localeList27);
        java.util.List<java.util.Locale> localeList30 = java.util.Locale.filter(languageRangeList20, (java.util.Collection<java.util.Locale>) localeList27);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap31 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList32 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList20, strMap31);
        java.util.Locale locale36 = new java.util.Locale("UTC", "1/1/70", "it");
        java.util.Locale locale37 = java.util.Locale.getDefault();
        java.util.Set<java.lang.Character> charSet38 = locale37.getExtensionKeys();
        java.util.Locale locale39 = java.util.Locale.getDefault();
        java.lang.String str40 = locale39.toLanguageTag();
        java.util.Locale locale42 = new java.util.Locale("hi!");
        java.lang.String str43 = locale42.getDisplayCountry();
        java.lang.String str44 = locale42.toLanguageTag();
        java.lang.String str45 = locale39.getDisplayName(locale42);
        java.lang.String str46 = locale37.getDisplayCountry(locale42);
        java.util.Locale locale47 = java.util.Locale.getDefault();
        java.util.Set<java.lang.Character> charSet48 = locale47.getExtensionKeys();
        java.lang.String str49 = locale42.getDisplayVariant(locale47);
        java.lang.String str50 = locale36.getDisplayVariant(locale47);
        java.lang.String str51 = locale36.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet52 = locale36.getUnicodeLocaleKeys();
        java.lang.String str53 = java.util.Locale.lookupTag(languageRangeList20, (java.util.Collection<java.lang.String>) strSet52);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(languageRangeList14);
        org.junit.Assert.assertNotNull(languageRangeList16);
        org.junit.Assert.assertNotNull(languageRangeList18);
        org.junit.Assert.assertNotNull(languageRangeList20);
        org.junit.Assert.assertNotNull(languageRangeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "zh-CN" + "'", str25, "zh-CN");
        org.junit.Assert.assertNotNull(localeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(localeList29);
        org.junit.Assert.assertNotNull(localeList30);
        org.junit.Assert.assertNotNull(languageRangeList32);
        org.junit.Assert.assertEquals(locale36.toString(), "utc_1/1/70_it");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(charSet38);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "zh-CN" + "'", str40, "zh-CN");
        org.junit.Assert.assertEquals(locale42.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "und" + "'", str44, "und");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Chinese (China)" + "'", str45, "Chinese (China)");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "China" + "'", str46, "China");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(charSet48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "it" + "'", str50, "it");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "utc" + "'", str51, "utc");
        org.junit.Assert.assertNotNull(strSet52);
        org.junit.Assert.assertNull(str53);
    }

    @Test
    public void test20058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20058");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale5 = new java.util.Locale("hi!");
        java.lang.String str6 = locale5.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket(0L, chronology3, locale5, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology10 = dateTimeParserBucket9.getChronology();
        java.util.Locale locale12 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology10, locale12, (java.lang.Integer) 10);
        org.joda.time.DurationField durationField15 = chronology10.days();
        org.joda.time.DurationField durationField16 = chronology10.halfdays();
        org.joda.time.DateTimeField dateTimeField17 = chronology10.weekyear();
        java.util.Locale locale19 = new java.util.Locale("China");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 0, chronology10, locale19, (java.lang.Integer) (-1), (int) 'x');
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        long long26 = chronology10.add(readablePeriod23, 769989L, (-148200000));
        org.junit.Assert.assertEquals(locale5.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertEquals(locale12.toString(), "eng");
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertEquals(locale19.toString(), "china");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 769989L + "'", long26 == 769989L);
    }

    @Test
    public void test20059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20059");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.clockhourOfDay();
        org.joda.time.DurationField durationField10 = chronology8.halfdays();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone12 = chronology8.getZone();
        org.joda.time.DurationField durationField13 = chronology8.hours();
        org.joda.time.DurationField durationField14 = chronology8.years();
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test20060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20060");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        long long3 = dateTimeZone0.adjustOffset((long) 0, true);
        java.util.TimeZone timeZone4 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        java.lang.String str9 = dateTimeZone6.getName(52L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(timeZone4);
// flaky:         org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT-04:01");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-04:01" + "'", str9, "-04:01");
    }

    @Test
    public void test20061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20061");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.weekyear();
        org.joda.time.DurationField durationField11 = chronology9.years();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.monthOfYear();
        java.util.Locale.Category category13 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale14 = java.util.Locale.getDefault(category13);
        java.util.Locale locale15 = java.util.Locale.JAPANESE;
        org.joda.time.Chronology chronology17 = null;
        java.util.Locale locale18 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology17, locale18, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str22 = locale15.getDisplayCountry(locale18);
        java.util.Locale.setDefault(category13, locale15);
        java.util.Locale.Category category24 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale25 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.Character> charSet26 = locale25.getExtensionKeys();
        java.util.Locale.setDefault(category24, locale25);
        java.util.Locale locale28 = java.util.Locale.getDefault(category24);
        java.lang.String str29 = locale15.getDisplayName(locale28);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket((long) (short) 1, chronology9, locale28);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        long long34 = dateTimeZone31.adjustOffset((long) 0, true);
        java.util.TimeZone timeZone35 = dateTimeZone31.toTimeZone();
        boolean boolean36 = dateTimeZone31.isFixed();
        boolean boolean37 = dateTimeZone31.isFixed();
        long long39 = dateTimeZone31.convertUTCToLocal((long) (short) -1);
        long long43 = dateTimeZone31.convertLocalToUTC((long) (short) 100, false, (long) (-121));
        java.lang.String str45 = dateTimeZone31.getNameKey((-346200000L));
        java.lang.String str47 = dateTimeZone31.getNameKey((-115254991L));
        long long51 = dateTimeZone31.convertLocalToUTC(612059999L, false, (-36000035L));
        boolean boolean52 = dateTimeParserBucket30.restoreState((java.lang.Object) (-36000035L));
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + category13 + "' != '" + java.util.Locale.Category.FORMAT + "'", category13.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ja");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "it");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + category24 + "' != '" + java.util.Locale.Category.FORMAT + "'", category24.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(charSet26);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "japonais" + "'", str29, "japonais");
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(timeZone35);
// flaky:         org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "GMT-04:01");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-14460001L) + "'", long39 == (-14460001L));
// flaky:         org.junit.Assert.assertTrue("'" + long43 + "' != '" + 14460100L + "'", long43 == 14460100L);
// flaky:         org.junit.Assert.assertNull(str45);
// flaky:         org.junit.Assert.assertNull(str47);
// flaky:         org.junit.Assert.assertTrue("'" + long51 + "' != '" + 626519999L + "'", long51 == 626519999L);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test20062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20062");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.era();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.clockhourOfHalfday();
        org.joda.time.Chronology chronology14 = chronology8.withUTC();
        org.joda.time.DateTimeField dateTimeField15 = chronology8.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = chronology8.minuteOfHour();
        org.joda.time.DurationField durationField17 = chronology8.minutes();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        long long21 = chronology8.add(readablePeriod18, 4797L, (-49920000));
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = chronology8.get(readablePeriod22, (-86399883L), (-3662000L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 4797L + "'", long21 == 4797L);
    }

    @Test
    public void test20063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20063");
        java.util.Locale locale3 = new java.util.Locale("+10:00", "java.io.IOException: en-US", "+00:00");
        java.util.Locale locale7 = new java.util.Locale("Chinese (China)", "CAN", "italiano");
        java.lang.String str8 = locale3.getDisplayScript(locale7);
        java.lang.String str9 = locale7.getDisplayName();
        java.lang.String str10 = locale7.getLanguage();
        org.junit.Assert.assertEquals(locale3.toString(), "+10:00_JAVA.IO.IOEXCEPTION: EN-US_+00:00");
        org.junit.Assert.assertEquals(locale7.toString(), "chinese (china)_CAN_italiano");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chinese (china) (CAN,italiano)" + "'", str9, "chinese (china) (CAN,italiano)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chinese (china)" + "'", str10, "chinese (china)");
    }

    @Test
    public void test20064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20064");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder7 = builder3.setScript("");
        java.util.Locale locale8 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet9 = locale8.getUnicodeLocaleKeys();
        java.lang.String str10 = locale8.getISO3Country();
        java.util.Locale.Builder builder11 = builder7.setLocale(locale8);
        java.util.Locale locale12 = builder11.build();
        java.util.Locale.Builder builder13 = builder11.clearExtensions();
        java.util.Locale locale14 = builder13.build();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh");
    }

    @Test
    public void test20065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20065");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.weekyearOfCentury();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter12.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str16 = dateTimeZone14.getName((long) 2000);
        boolean boolean17 = dateTimeZone14.isFixed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter12.withZone(dateTimeZone14);
        org.joda.time.Chronology chronology19 = chronology8.withZone(dateTimeZone14);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        long long23 = chronology19.add(readablePeriod20, (long) (short) -1, 10);
        org.joda.time.DateTimeField dateTimeField24 = chronology19.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        long long28 = dateTimeZone25.adjustOffset((long) 0, true);
        java.util.TimeZone timeZone29 = dateTimeZone25.toTimeZone();
        boolean boolean30 = dateTimeZone25.isFixed();
        boolean boolean31 = dateTimeZone25.isFixed();
        org.joda.time.Chronology chronology32 = chronology19.withZone(dateTimeZone25);
        org.joda.time.DateTimeField dateTimeField33 = chronology32.monthOfYear();
        org.joda.time.Chronology chronology34 = chronology32.withUTC();
        org.joda.time.DateTimeField dateTimeField35 = chronology32.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField36 = chronology32.secondOfMinute();
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-04:01" + "'", str16, "-04:01");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(timeZone29);
// flaky:         org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "GMT-04:01");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
    }

    @Test
    public void test20066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20066");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter3.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withZoneUTC();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter5.printTo(stringBuffer6, (-461460000L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
    }

    @Test
    public void test20067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20067");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder5.clear();
        java.util.Locale.Builder builder10 = builder5.setLanguage("Japanese");
        java.util.Locale.Builder builder12 = builder10.setRegion("ja");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder12.setRegion("\u5e74\u6708\u65e5\u661f\u671f\u56db\u4e0a\u5348\u65f6\u5206\u79d2 +00:00 (USA,11.02.22)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: 1970?1?1? ??? ??12?00?00? +00:00 (USA,11.02.22) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test20068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20068");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.year();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.millisOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.era();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = chronology9.dayOfYear();
        org.joda.time.DurationField durationField16 = chronology9.years();
        org.joda.time.Chronology chronology17 = chronology9.withUTC();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        long long21 = chronology17.add(readablePeriod18, (long) 40, (int) (short) 0);
        java.lang.String str22 = chronology17.toString();
        org.joda.time.DurationField durationField23 = chronology17.hours();
        java.util.Locale locale27 = new java.util.Locale("UTC", "1/1/70", "it");
        java.lang.String str28 = locale27.getCountry();
        java.util.Locale locale29 = java.util.Locale.ENGLISH;
        java.lang.String str30 = locale27.getDisplayCountry(locale29);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket33 = new org.joda.time.format.DateTimeParserBucket((-2000L), chronology17, locale27, (java.lang.Integer) 10, (-53));
        long long34 = dateTimeParserBucket33.computeMillis();
        int int35 = dateTimeParserBucket33.getOffset();
        long long36 = dateTimeParserBucket33.computeMillis();
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 40L + "'", long21 == 40L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ISOChronology[UTC]" + "'", str22, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertEquals(locale27.toString(), "utc_1/1/70_it");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1/1/70" + "'", str28, "1/1/70");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1/1/70" + "'", str30, "1/1/70");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-2000L) + "'", long34 == (-2000L));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-2000L) + "'", long36 == (-2000L));
    }

    @Test
    public void test20069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20069");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.forStyle("\u671d\u9c9c\u6587");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid style specification: ???");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20070");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        boolean boolean3 = dateTimeZone1.isStandardOffset((long) (short) -1);
        java.lang.String str5 = dateTimeZone1.getName(0L);
        java.lang.String str6 = dateTimeZone1.toString();
        boolean boolean8 = dateTimeZone1.isStandardOffset(187200000L);
        int int10 = dateTimeZone1.getOffset((-432180003L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.035" + "'", str5, "+00:00:00.035");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.035" + "'", str6, "+00:00:00.035");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test20071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20071");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.Chronology chronology9 = chronology8.withUTC();
        org.joda.time.Chronology chronology10 = chronology8.withUTC();
        org.joda.time.DurationField durationField11 = chronology8.minutes();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.dayOfYear();
        org.joda.time.DurationField durationField13 = chronology8.weeks();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField15 = chronology8.minuteOfDay();
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test20072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20072");
        java.util.Locale locale2 = new java.util.Locale("12/30/69", "\u5e74\u6708\u65e5\u661f\u671f\u4e94\u4e0b\u5348\u65f6\u5206\u79d2 +40:01");
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\u5e74\u6708\u65e5\u661f\u671f\u4e94\u4e0b\u5348\u65f6\u5206\u79d2 +40:01");
    }

    @Test
    public void test20073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20073");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.weekyear();
        org.joda.time.DurationField durationField10 = chronology8.minutes();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.hourOfDay();
        long long16 = chronology8.add((-62111231999999L), 1L, 10);
        org.joda.time.DurationField durationField17 = chronology8.hours();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter18.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str22 = dateTimeZone20.getName((long) 2000);
        boolean boolean23 = dateTimeZone20.isFixed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter18.withZone(dateTimeZone20);
        org.joda.time.format.DateTimeParser dateTimeParser25 = dateTimeFormatter18.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter26 = dateTimeFormatter18.getPrinter();
        org.joda.time.Chronology chronology27 = dateTimeFormatter18.getChronolgy();
        org.joda.time.LocalDate localDate29 = dateTimeFormatter18.parseLocalDate("69-12-31");
        org.joda.time.Chronology chronology32 = null;
        java.util.Locale locale34 = new java.util.Locale("hi!");
        java.lang.String str35 = locale34.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket38 = new org.joda.time.format.DateTimeParserBucket(0L, chronology32, locale34, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology39 = dateTimeParserBucket38.getChronology();
        java.util.Locale locale41 = new java.util.Locale("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket43 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology39, locale41, (java.lang.Integer) 10);
        org.joda.time.DurationField durationField44 = chronology39.days();
        org.joda.time.DurationField durationField45 = chronology39.halfdays();
        long long49 = chronology39.add(0L, (long) (short) 0, (-1));
        org.joda.time.DateTimeField dateTimeField50 = chronology39.hourOfDay();
        boolean boolean51 = localDate29.equals((java.lang.Object) dateTimeField50);
        org.joda.time.DateTimeField dateTimeField53 = localDate29.getField((int) (byte) 1);
        int[] intArray55 = chronology8.get((org.joda.time.ReadablePartial) localDate29, (long) 117);
        org.joda.time.DateTimeField dateTimeField56 = chronology8.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField57 = chronology8.centuryOfEra();
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-62111231999989L) + "'", long16 == (-62111231999989L));
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-04:01" + "'", str22, "-04:01");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
        org.junit.Assert.assertNotNull(dateTimeParser25);
        org.junit.Assert.assertNotNull(dateTimePrinter26);
        org.junit.Assert.assertNull(chronology27);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertEquals(locale34.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertEquals(locale41.toString(), "eng");
        org.junit.Assert.assertNotNull(durationField44);
        org.junit.Assert.assertNotNull(durationField45);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[1970, 1, 1]");
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(dateTimeField57);
    }

    @Test
    public void test20074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20074");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale4, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.weekyear();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.monthOfYear();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.secondOfDay();
        java.util.Locale.Category category14 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale15 = java.util.Locale.getDefault(category14);
        java.util.Locale locale16 = java.util.Locale.TAIWAN;
        java.lang.String str17 = locale15.getDisplayVariant(locale16);
        java.lang.String str18 = locale16.getScript();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket((long) 40, chronology9, locale16);
        long long22 = dateTimeParserBucket19.computeMillis(false, "");
        org.joda.time.DateTimeField dateTimeField23 = null;
        dateTimeParserBucket19.saveField(dateTimeField23, (-118800000));
        dateTimeParserBucket19.setPivotYear((java.lang.Integer) (-3600000));
        org.joda.time.Chronology chronology28 = dateTimeParserBucket19.getChronology();
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + category14 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category14.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 40L + "'", long22 == 40L);
        org.junit.Assert.assertNotNull(chronology28);
    }

    @Test
    public void test20075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20075");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.monthOfYear();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.year();
        org.joda.time.DurationField durationField14 = chronology8.millis();
        org.joda.time.DurationField durationField15 = chronology8.seconds();
        org.joda.time.DateTimeField dateTimeField16 = chronology8.weekyearOfCentury();
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test20076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20076");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.util.Locale locale2 = java.util.Locale.getDefault();
        java.lang.String str3 = locale2.toLanguageTag();
        java.util.Locale locale5 = new java.util.Locale("hi!");
        java.lang.String str6 = locale5.getDisplayCountry();
        java.lang.String str7 = locale5.toLanguageTag();
        java.lang.String str8 = locale2.getDisplayName(locale5);
        java.lang.String str9 = locale0.getDisplayCountry(locale5);
        java.util.Locale locale10 = java.util.Locale.getDefault();
        java.util.Set<java.lang.Character> charSet11 = locale10.getExtensionKeys();
        java.lang.String str12 = locale5.getDisplayVariant(locale10);
        java.util.Set<java.lang.String> strSet13 = locale10.getUnicodeLocaleKeys();
        java.util.Set<java.lang.Character> charSet14 = locale10.getExtensionKeys();
        java.util.Locale.Builder builder15 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder18 = builder15.setExtension('a', "en-US");
        java.util.Locale.Builder builder20 = builder18.setLanguageTag("it");
        java.util.Locale.Builder builder21 = builder18.clear();
        java.util.Locale locale22 = java.util.Locale.CHINESE;
        java.util.Locale locale23 = java.util.Locale.FRANCE;
        java.lang.String str24 = locale22.getDisplayScript(locale23);
        java.util.Locale.Builder builder25 = builder18.setLocale(locale22);
        java.util.Locale.Builder builder27 = builder18.addUnicodeLocaleAttribute("Japanese");
        java.util.Locale.Builder builder29 = builder27.setLanguage("it");
        java.util.Locale.Builder builder30 = builder29.clearExtensions();
        java.util.Locale.Builder builder32 = builder30.setScript("");
        java.util.Locale.Builder builder34 = builder30.setRegion("");
        java.util.Locale locale35 = java.util.Locale.CHINA;
        java.lang.String str36 = locale35.getDisplayCountry();
        java.util.Locale.Category category37 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale38 = java.util.Locale.getDefault(category37);
        java.util.Locale locale39 = java.util.Locale.JAPANESE;
        org.joda.time.Chronology chronology41 = null;
        java.util.Locale locale42 = java.util.Locale.ITALIAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket45 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology41, locale42, (java.lang.Integer) (-1), (int) (byte) 10);
        java.lang.String str46 = locale39.getDisplayCountry(locale42);
        java.util.Locale.setDefault(category37, locale39);
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone49 = dateTimeZone48.toTimeZone();
        java.util.Locale.Category category51 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder52 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder55 = builder52.setExtension('a', "en-US");
        java.util.Locale.Builder builder57 = builder55.setLanguageTag("it");
        java.util.Locale locale58 = builder55.build();
        java.util.Locale.setDefault(category51, locale58);
        java.util.Locale locale60 = java.util.Locale.getDefault(category51);
        java.util.Locale locale61 = locale60.stripExtensions();
        java.lang.String str62 = dateTimeZone48.getName((long) 0, locale60);
        java.util.Locale.setDefault(category37, locale60);
        java.lang.String str64 = locale35.getDisplayScript(locale60);
        java.util.Locale.Builder builder65 = builder34.setLocale(locale35);
        java.lang.String str66 = locale10.getDisplayLanguage(locale35);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh-CN" + "'", str3, "zh-CN");
        org.junit.Assert.assertEquals(locale5.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "und" + "'", str7, "und");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Chinese (China)" + "'", str8, "Chinese (China)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "China" + "'", str9, "China");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(charSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(charSet14);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\u4e2d\u56fd" + "'", str36, "\u4e2d\u56fd");
        org.junit.Assert.assertTrue("'" + category37 + "' != '" + java.util.Locale.Category.FORMAT + "'", category37.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "ja");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "it");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertNotNull(timeZone49);
// flaky:         org.junit.Assert.assertEquals(timeZone49.getDisplayName(), "GMT-04:01");
        org.junit.Assert.assertTrue("'" + category51 + "' != '" + java.util.Locale.Category.FORMAT + "'", category51.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "it");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "it");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str62 + "' != '" + "-04:01" + "'", str62, "-04:01");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "\u4e2d\u6587" + "'", str66, "\u4e2d\u6587");
    }

    @Test
    public void test20077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20077");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "en-US");
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder9 = builder6.setExtension('a', "de-de");
        java.util.Locale.Builder builder10 = builder9.clear();
        java.util.Locale.Builder builder12 = builder9.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder14 = builder12.setVariant("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder17 = builder12.setExtension('a', "deutsch_JAVA.IO.IOEXCEPTION: ITA_java.io.IOException: java.io.IOException: 22/02/11");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: JAVA.IO.IOEXCEPTION: ITA [at index 8]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test20078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20078");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DurationField durationField10 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.minuteOfHour();
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test20079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20079");
        java.lang.Throwable throwable2 = null;
        java.io.IOException iOException3 = new java.io.IOException("\u5e74\u6708\u65e5", throwable2);
        java.lang.Throwable[] throwableArray4 = iOException3.getSuppressed();
        java.io.IOException iOException5 = new java.io.IOException("\ub144\uc6d4\uc77c\uc218\uc694\uc77c", (java.lang.Throwable) iOException3);
        java.io.IOException iOException7 = new java.io.IOException("Chinese");
        iOException5.addSuppressed((java.lang.Throwable) iOException7);
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test20080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20080");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(144060000, 1969);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 1969");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20081");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale3, (java.lang.Integer) 10, (int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.secondOfDay();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.dayOfYear();
        org.joda.time.DateTimeField dateTimeField15 = chronology8.era();
        org.joda.time.DateTimeField dateTimeField16 = chronology8.millisOfDay();
        org.joda.time.DurationField durationField17 = chronology8.centuries();
        org.joda.time.DateTimeZone dateTimeZone18 = chronology8.getZone();
        org.joda.time.DurationField durationField19 = chronology8.hours();
        org.joda.time.DateTimeField dateTimeField20 = chronology8.minuteOfHour();
        org.joda.time.DurationField durationField21 = chronology8.days();
        org.joda.time.DateTimeZone dateTimeZone22 = chronology8.getZone();
        java.lang.String str24 = dateTimeZone22.getShortName((-1004L));
        long long28 = dateTimeZone22.convertLocalToUTC((-36000000L), false, 11L);
        java.util.Locale locale30 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet31 = locale30.getUnicodeLocaleAttributes();
        org.joda.time.Chronology chronology33 = null;
        java.util.Locale locale35 = new java.util.Locale("hi!");
        java.lang.String str36 = locale35.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket(0L, chronology33, locale35, (java.lang.Integer) 10, (int) 'a');
        int int40 = dateTimeParserBucket39.getOffset();
        org.joda.time.DateTimeZone dateTimeZone41 = dateTimeParserBucket39.getZone();
        long long44 = dateTimeZone41.adjustOffset((-1L), true);
        long long47 = dateTimeZone41.adjustOffset((long) 'a', true);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        java.util.Locale locale52 = java.util.Locale.getDefault();
        java.util.Set<java.lang.Character> charSet53 = locale52.getExtensionKeys();
        java.util.Locale locale54 = java.util.Locale.getDefault();
        java.lang.String str55 = locale54.toLanguageTag();
        java.util.Locale locale57 = new java.util.Locale("hi!");
        java.lang.String str58 = locale57.getDisplayCountry();
        java.lang.String str59 = locale57.toLanguageTag();
        java.lang.String str60 = locale54.getDisplayName(locale57);
        java.lang.String str61 = locale52.getDisplayCountry(locale57);
        java.lang.String str62 = locale57.getScript();
        java.util.Locale locale63 = java.util.Locale.getDefault();
        java.util.Locale locale64 = java.util.Locale.getDefault();
        java.util.Set<java.lang.Character> charSet65 = locale64.getExtensionKeys();
        java.util.Locale locale66 = java.util.Locale.getDefault();
        java.lang.String str67 = locale66.toLanguageTag();
        java.util.Locale locale69 = new java.util.Locale("hi!");
        java.lang.String str70 = locale69.getDisplayCountry();
        java.lang.String str71 = locale69.toLanguageTag();
        java.lang.String str72 = locale66.getDisplayName(locale69);
        java.lang.String str73 = locale64.getDisplayCountry(locale69);
        java.lang.String str74 = locale63.getDisplayScript(locale64);
        java.util.Locale.Category category75 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale76 = java.util.Locale.getDefault(category75);
        java.util.Locale locale77 = java.util.Locale.TAIWAN;
        java.lang.String str78 = locale76.getDisplayVariant(locale77);
        java.lang.String str79 = locale63.getDisplayName(locale77);
        java.lang.String str80 = locale57.getDisplayScript(locale63);
        java.lang.String str81 = dateTimeZone50.getName((long) 'x', locale63);
        java.lang.String str82 = dateTimeZone41.getName(3600000L, locale63);
        java.lang.String str83 = locale30.getDisplayScript(locale63);
        java.lang.String str84 = dateTimeZone22.getName((-24060733485L), locale63);
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00" + "'", str24, "+00:00");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-36000000L) + "'", long28 == (-36000000L));
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "de_DE");
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertEquals(locale35.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-1L) + "'", long44 == (-1L));
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 97L + "'", long47 == 97L);
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertNotNull(locale52);
// flaky:         org.junit.Assert.assertEquals(locale52.toString(), "java.io.ioexception: en-us_JPN_22/02/11");
        org.junit.Assert.assertNotNull(charSet53);
        org.junit.Assert.assertNotNull(locale54);
// flaky:         org.junit.Assert.assertEquals(locale54.toString(), "java.io.ioexception: en-us_JPN_22/02/11");
// flaky:         org.junit.Assert.assertEquals("'" + str55 + "' != '" + "und" + "'", str55, "und");
        org.junit.Assert.assertEquals(locale57.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "und" + "'", str59, "und");
// flaky:         org.junit.Assert.assertEquals("'" + str60 + "' != '" + "java.io.ioexception: en-us (JPN,22/02/11)" + "'", str60, "java.io.ioexception: en-us (JPN,22/02/11)");
// flaky:         org.junit.Assert.assertEquals("'" + str61 + "' != '" + "JPN" + "'", str61, "JPN");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(locale63);
// flaky:         org.junit.Assert.assertEquals(locale63.toString(), "java.io.ioexception: en-us_JPN_22/02/11");
        org.junit.Assert.assertNotNull(locale64);
// flaky:         org.junit.Assert.assertEquals(locale64.toString(), "java.io.ioexception: en-us_JPN_22/02/11");
        org.junit.Assert.assertNotNull(charSet65);
        org.junit.Assert.assertNotNull(locale66);
// flaky:         org.junit.Assert.assertEquals(locale66.toString(), "java.io.ioexception: en-us_JPN_22/02/11");
// flaky:         org.junit.Assert.assertEquals("'" + str67 + "' != '" + "und" + "'", str67, "und");
        org.junit.Assert.assertEquals(locale69.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "und" + "'", str71, "und");
// flaky:         org.junit.Assert.assertEquals("'" + str72 + "' != '" + "java.io.ioexception: en-us (JPN,22/02/11)" + "'", str72, "java.io.ioexception: en-us (JPN,22/02/11)");
// flaky:         org.junit.Assert.assertEquals("'" + str73 + "' != '" + "JPN" + "'", str73, "JPN");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertTrue("'" + category75 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category75.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale76);
// flaky:         org.junit.Assert.assertEquals(locale76.toString(), "java.io.ioexception: en-us_JPN_22/02/11");
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str78 + "' != '" + "22/02/11" + "'", str78, "22/02/11");
// flaky:         org.junit.Assert.assertEquals("'" + str79 + "' != '" + "java.io.ioexception: en-us (JPN,22/02/11)" + "'", str79, "java.io.ioexception: en-us (JPN,22/02/11)");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "+00:00:00.010" + "'", str81, "+00:00:00.010");
// flaky:         org.junit.Assert.assertEquals("'" + str82 + "' != '" + "-04:01" + "'", str82, "-04:01");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "+00:00" + "'", str84, "+00:00");
    }
}
