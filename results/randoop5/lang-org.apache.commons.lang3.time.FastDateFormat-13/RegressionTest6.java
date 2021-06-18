import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale10);
        java.util.TimeZone timeZone12 = fastDateFormat11.getTimeZone();
        java.util.Locale locale13 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone12, locale13);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale16 = fastDateFormat15.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone12, locale16);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone12);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone12);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale21 = fastDateFormat20.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", timeZone12, locale21);
        java.util.Locale locale26 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale26);
        java.util.TimeZone timeZone28 = fastDateFormat27.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale30 = fastDateFormat29.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone28, locale30);
        int int32 = fastDateFormat31.getMaxLengthEstimate();
        java.util.Locale locale33 = fastDateFormat31.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, locale33);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone12, locale33);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone12);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy h:mm:ss a z", timeZone12);
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(fastDateFormat37);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale9);
        java.util.TimeZone timeZone11 = fastDateFormat10.getTimeZone();
        java.util.Locale locale12 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone11, locale12);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale15 = fastDateFormat14.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone11, locale15);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone11);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone11);
        java.util.Locale locale21 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale21);
        java.util.TimeZone timeZone23 = fastDateFormat22.getTimeZone();
        java.util.Locale locale32 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale32);
        java.util.TimeZone timeZone34 = fastDateFormat33.getTimeZone();
        java.util.Locale locale35 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone34, locale35);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale38 = fastDateFormat37.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone34, locale38);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone34);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone34);
        java.util.Locale locale45 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale45);
        java.util.TimeZone timeZone47 = fastDateFormat46.getTimeZone();
        java.util.Locale locale48 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone47, locale48);
        java.util.Locale locale54 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat55 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale54);
        java.util.TimeZone timeZone56 = fastDateFormat55.getTimeZone();
        java.util.Locale locale57 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat58 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone56, locale57);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat59 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale60 = fastDateFormat59.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat61 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone56, locale60);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat62 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone47, locale60);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat63 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone34, locale60);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat64 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale65 = fastDateFormat64.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat66 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone34, locale65);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat67 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone23, locale65);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat68 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0, timeZone11, locale65);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat69 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(13, timeZone11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 13");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(timeZone34);
        org.junit.Assert.assertEquals(timeZone34.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNotNull(timeZone47);
        org.junit.Assert.assertEquals(timeZone47.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat49);
        org.junit.Assert.assertNotNull(fastDateFormat55);
        org.junit.Assert.assertNotNull(timeZone56);
        org.junit.Assert.assertEquals(timeZone56.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat58);
        org.junit.Assert.assertNotNull(fastDateFormat59);
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat61);
        org.junit.Assert.assertNotNull(fastDateFormat62);
        org.junit.Assert.assertNotNull(fastDateFormat63);
        org.junit.Assert.assertNotNull(fastDateFormat64);
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat66);
        org.junit.Assert.assertNotNull(fastDateFormat67);
        org.junit.Assert.assertNotNull(fastDateFormat68);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar2 = null;
        java.lang.StringBuffer stringBuffer3 = null;
        java.lang.StringBuffer stringBuffer4 = fastDateFormat1.format(calendar2, stringBuffer3);
        java.util.Calendar calendar5 = null;
        java.lang.StringBuffer stringBuffer6 = null;
        java.lang.StringBuffer stringBuffer7 = fastDateFormat1.format(calendar5, stringBuffer6);
        java.lang.String str8 = fastDateFormat1.toString();
        java.lang.Object obj9 = fastDateFormat1.clone();
        java.lang.Object obj10 = fastDateFormat1.clone();
        java.lang.String str12 = fastDateFormat1.format(10L);
        java.lang.Object obj13 = fastDateFormat1.clone();
        java.lang.StringBuffer stringBuffer15 = null;
        java.lang.StringBuffer stringBuffer16 = fastDateFormat1.format((long) (byte) 100, stringBuffer15);
        java.lang.Object obj17 = fastDateFormat1.clone();
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertNull(stringBuffer4);
        org.junit.Assert.assertNull(stringBuffer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "FastDateFormat[]" + "'", str8, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "FastDateFormat[]");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "FastDateFormat[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "FastDateFormat[]");
        org.junit.Assert.assertNull(stringBuffer16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "FastDateFormat[]");
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar2 = null;
        java.lang.String str3 = fastDateFormat1.format(calendar2);
        java.lang.String str4 = fastDateFormat1.toString();
        boolean boolean5 = fastDateFormat1.getTimeZoneOverridesCalendar();
        java.util.Calendar calendar6 = null;
        java.lang.StringBuffer stringBuffer7 = null;
        java.lang.StringBuffer stringBuffer8 = fastDateFormat1.format(calendar6, stringBuffer7);
        java.util.TimeZone timeZone9 = fastDateFormat1.getTimeZone();
        int int10 = fastDateFormat1.getMaxLengthEstimate();
        java.util.Calendar calendar11 = null;
        java.lang.String str12 = fastDateFormat1.format(calendar11);
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "FastDateFormat[]" + "'", str4, "FastDateFormat[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(stringBuffer8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar6 = null;
        java.lang.StringBuffer stringBuffer7 = null;
        java.lang.StringBuffer stringBuffer8 = fastDateFormat5.format(calendar6, stringBuffer7);
        java.util.Calendar calendar9 = null;
        java.lang.StringBuffer stringBuffer10 = null;
        java.lang.StringBuffer stringBuffer11 = fastDateFormat5.format(calendar9, stringBuffer10);
        java.util.Calendar calendar12 = null;
        java.lang.StringBuffer stringBuffer13 = null;
        java.lang.StringBuffer stringBuffer14 = fastDateFormat5.format(calendar12, stringBuffer13);
        int int15 = fastDateFormat5.getMaxLengthEstimate();
        java.lang.String str16 = fastDateFormat5.toString();
        boolean boolean17 = fastDateFormat3.equals((java.lang.Object) fastDateFormat5);
        int int18 = fastDateFormat3.getMaxLengthEstimate();
        java.util.Locale locale19 = fastDateFormat3.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(2, (int) (byte) 10, locale19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNull(stringBuffer8);
        org.junit.Assert.assertNull(stringBuffer11);
        org.junit.Assert.assertNull(stringBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "FastDateFormat[]" + "'", str16, "FastDateFormat[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 18 + "'", int18 == 18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone1, locale2);
        java.util.Calendar calendar4 = null;
        java.lang.String str5 = fastDateFormat3.format(calendar4);
        java.util.Calendar calendar6 = null;
        java.lang.StringBuffer stringBuffer7 = null;
        java.lang.StringBuffer stringBuffer8 = fastDateFormat3.format(calendar6, stringBuffer7);
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(stringBuffer8);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone3 = fastDateFormat2.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone3);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        java.lang.String str7 = fastDateFormat4.format((long) 18);
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "12:00:00 AM UTC" + "'", str7, "12:00:00 AM UTC");
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        java.util.Locale locale7 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale7);
        java.util.TimeZone timeZone9 = fastDateFormat8.getTimeZone();
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone9, locale10);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale13 = fastDateFormat12.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone9, locale13);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone9);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, timeZone9);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale19 = fastDateFormat18.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, locale19);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm a", timeZone9, locale19);
        int int22 = fastDateFormat21.getMaxLengthEstimate();
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        java.util.Locale locale5 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale5);
        java.util.TimeZone timeZone7 = fastDateFormat6.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale9 = fastDateFormat8.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone7, locale9);
        int int11 = fastDateFormat10.getMaxLengthEstimate();
        java.util.Locale locale12 = fastDateFormat10.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, locale12);
        java.util.TimeZone timeZone14 = fastDateFormat13.getTimeZone();
        java.util.TimeZone timeZone16 = null;
        java.util.Locale locale17 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone16, locale17);
        java.util.Calendar calendar19 = null;
        java.lang.StringBuffer stringBuffer20 = null;
        java.lang.StringBuffer stringBuffer21 = fastDateFormat18.format(calendar19, stringBuffer20);
        java.lang.StringBuffer stringBuffer23 = null;
        java.lang.StringBuffer stringBuffer24 = fastDateFormat18.format(10L, stringBuffer23);
        java.util.Locale locale25 = fastDateFormat18.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 1, timeZone14, locale25);
        java.lang.String str27 = fastDateFormat26.getPattern();
        boolean boolean28 = fastDateFormat26.getTimeZoneOverridesCalendar();
        java.util.TimeZone timeZone29 = fastDateFormat26.getTimeZone();
        java.util.TimeZone timeZone30 = fastDateFormat26.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang3.time.FastDateFormat.getInstance("FastDateFormat[EEEE, MMMM d, yyyy h:mm:ss a]", timeZone30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNull(stringBuffer21);
        org.junit.Assert.assertNull(stringBuffer24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "MMMM d, yyyy" + "'", str27, "MMMM d, yyyy");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale2 = fastDateFormat1.getLocale();
        boolean boolean3 = fastDateFormat1.getTimeZoneOverridesCalendar();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar6 = null;
        java.lang.String str7 = fastDateFormat5.format(calendar6);
        java.lang.Object obj8 = fastDateFormat5.clone();
        int int9 = fastDateFormat5.getMaxLengthEstimate();
        boolean boolean10 = fastDateFormat1.equals((java.lang.Object) fastDateFormat5);
        java.lang.StringBuffer stringBuffer12 = null;
        java.lang.StringBuffer stringBuffer13 = fastDateFormat5.format(0L, stringBuffer12);
        java.util.Locale locale14 = fastDateFormat5.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) '#', locale14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 35");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "FastDateFormat[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(stringBuffer13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        java.util.Locale locale5 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale5);
        java.util.TimeZone timeZone7 = fastDateFormat6.getTimeZone();
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone7, locale8);
        java.util.Locale locale14 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale14);
        java.util.TimeZone timeZone16 = fastDateFormat15.getTimeZone();
        java.util.Locale locale17 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone16, locale17);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale20 = fastDateFormat19.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone16, locale20);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone7, locale20);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone7);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone7);
        java.lang.String str25 = fastDateFormat24.getPattern();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang3.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar28 = null;
        java.lang.String str29 = fastDateFormat27.format(calendar28);
        java.lang.StringBuffer stringBuffer31 = null;
        java.lang.StringBuffer stringBuffer32 = fastDateFormat27.format((long) 'a', stringBuffer31);
        boolean boolean33 = fastDateFormat27.getTimeZoneOverridesCalendar();
        java.lang.String str34 = fastDateFormat27.toString();
        java.util.TimeZone timeZone35 = fastDateFormat27.getTimeZone();
        java.lang.StringBuffer stringBuffer37 = null;
        java.lang.StringBuffer stringBuffer38 = fastDateFormat27.format(0L, stringBuffer37);
        java.lang.String str40 = fastDateFormat27.format((long) (short) 100);
        java.util.Locale locale41 = fastDateFormat27.getLocale();
        java.lang.String str42 = fastDateFormat27.toString();
        boolean boolean43 = fastDateFormat24.equals((java.lang.Object) str42);
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "h:mm:ss a z" + "'", str25, "h:mm:ss a z");
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(stringBuffer32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "FastDateFormat[]" + "'", str34, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone35);
        org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNull(stringBuffer38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "FastDateFormat[]" + "'", str42, "FastDateFormat[]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale8);
        java.util.TimeZone timeZone10 = fastDateFormat9.getTimeZone();
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone10, locale11);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale14 = fastDateFormat13.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone10, locale14);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone10);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone10);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale19 = fastDateFormat18.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", timeZone10, locale19);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone10);
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(fastDateFormat21);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0);
        java.util.TimeZone timeZone3 = fastDateFormat2.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar8 = null;
        java.lang.StringBuffer stringBuffer9 = null;
        java.lang.StringBuffer stringBuffer10 = fastDateFormat7.format(calendar8, stringBuffer9);
        java.util.Calendar calendar11 = null;
        java.lang.StringBuffer stringBuffer12 = null;
        java.lang.StringBuffer stringBuffer13 = fastDateFormat7.format(calendar11, stringBuffer12);
        java.lang.String str14 = fastDateFormat7.toString();
        java.lang.Object obj15 = fastDateFormat7.clone();
        java.lang.Object obj16 = fastDateFormat7.clone();
        java.lang.String str18 = fastDateFormat7.format(10L);
        int int19 = fastDateFormat7.getMaxLengthEstimate();
        java.util.Locale locale21 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2, locale21);
        java.util.TimeZone timeZone23 = fastDateFormat22.getTimeZone();
        boolean boolean24 = fastDateFormat7.equals((java.lang.Object) timeZone23);
        java.util.TimeZone timeZone27 = null;
        java.util.Locale locale28 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone27, locale28);
        int int30 = fastDateFormat29.getMaxLengthEstimate();
        java.util.Locale locale31 = fastDateFormat29.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, locale31);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(1, 0, timeZone23, locale31);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) 'a', timeZone3, locale31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 97");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNull(stringBuffer10);
        org.junit.Assert.assertNull(stringBuffer13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "FastDateFormat[]" + "'", str14, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "FastDateFormat[]");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "FastDateFormat[]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(fastDateFormat33);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale11);
        java.util.TimeZone timeZone13 = fastDateFormat12.getTimeZone();
        java.util.Locale locale14 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone13, locale14);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale17 = fastDateFormat16.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone13, locale17);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone13);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone13);
        java.util.Locale locale24 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale24);
        java.util.TimeZone timeZone26 = fastDateFormat25.getTimeZone();
        java.util.Locale locale27 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone26, locale27);
        java.util.Locale locale33 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale33);
        java.util.TimeZone timeZone35 = fastDateFormat34.getTimeZone();
        java.util.Locale locale36 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone35, locale36);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale39 = fastDateFormat38.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone35, locale39);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone26, locale39);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone13, locale39);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale44 = fastDateFormat43.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone13, locale44);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(3, (int) (byte) 0, timeZone13);
        java.util.Locale locale52 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat53 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale52);
        java.util.TimeZone timeZone54 = fastDateFormat53.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat55 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale56 = fastDateFormat55.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat57 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone54, locale56);
        int int58 = fastDateFormat57.getMaxLengthEstimate();
        java.util.Locale locale59 = fastDateFormat57.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat60 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, locale59);
        java.util.TimeZone timeZone61 = fastDateFormat60.getTimeZone();
        java.util.TimeZone timeZone63 = null;
        java.util.Locale locale64 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat65 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone63, locale64);
        java.util.Calendar calendar66 = null;
        java.lang.StringBuffer stringBuffer67 = null;
        java.lang.StringBuffer stringBuffer68 = fastDateFormat65.format(calendar66, stringBuffer67);
        java.lang.StringBuffer stringBuffer70 = null;
        java.lang.StringBuffer stringBuffer71 = fastDateFormat65.format(10L, stringBuffer70);
        java.util.Locale locale72 = fastDateFormat65.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat73 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 1, timeZone61, locale72);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat74 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, locale72);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat75 = org.apache.commons.lang3.time.FastDateFormat.getInstance("Thursday, January 1, 1970 12:00:00 AM UTC", timeZone13, locale72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(timeZone35);
        org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNotNull(fastDateFormat53);
        org.junit.Assert.assertNotNull(timeZone54);
        org.junit.Assert.assertEquals(timeZone54.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat55);
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat60);
        org.junit.Assert.assertNotNull(timeZone61);
        org.junit.Assert.assertEquals(timeZone61.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat65);
        org.junit.Assert.assertNull(stringBuffer68);
        org.junit.Assert.assertNull(stringBuffer71);
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat73);
        org.junit.Assert.assertNotNull(fastDateFormat74);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        java.util.Locale locale7 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale7);
        java.util.TimeZone timeZone9 = fastDateFormat8.getTimeZone();
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone9, locale10);
        java.util.Locale locale12 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone9, locale12);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone9);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone9);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone9);
        java.util.Locale locale24 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale24);
        java.util.TimeZone timeZone26 = fastDateFormat25.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale28 = fastDateFormat27.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone26, locale28);
        int int30 = fastDateFormat29.getMaxLengthEstimate();
        java.util.Locale locale31 = fastDateFormat29.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, locale31);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale31);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, locale31);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(2, (int) (byte) 0, locale31);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone9, locale31);
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(fastDateFormat36);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        java.util.Locale locale6 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale6);
        java.util.TimeZone timeZone8 = fastDateFormat7.getTimeZone();
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone8, locale9);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale12 = fastDateFormat11.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone8, locale12);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2, timeZone8);
        java.util.Locale locale20 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale20);
        java.util.TimeZone timeZone22 = fastDateFormat21.getTimeZone();
        java.util.Locale locale23 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone22, locale23);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale26 = fastDateFormat25.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone22, locale26);
        java.util.Locale locale33 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale33);
        java.util.TimeZone timeZone35 = fastDateFormat34.getTimeZone();
        java.util.Locale locale36 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone35, locale36);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale39 = fastDateFormat38.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone35, locale39);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2, timeZone35);
        int int42 = fastDateFormat41.getMaxLengthEstimate();
        java.util.Locale locale43 = fastDateFormat41.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone22, locale43);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone8, locale43);
        java.lang.String str46 = fastDateFormat45.getPattern();
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(timeZone35);
        org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 13 + "'", int42 == 13);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "h:mm:ss a z" + "'", str46, "h:mm:ss a z");
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale8);
        java.util.TimeZone timeZone10 = fastDateFormat9.getTimeZone();
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone10, locale11);
        java.util.Locale locale13 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone10, locale13);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone10);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", timeZone10);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        boolean boolean18 = fastDateFormat17.getTimeZoneOverridesCalendar();
        java.util.Locale locale19 = fastDateFormat17.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone10, locale19);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale19);
        java.util.TimeZone timeZone22 = fastDateFormat21.getTimeZone();
        java.util.Locale locale24 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale24);
        java.lang.String str27 = fastDateFormat25.format((long) (short) 0);
        boolean boolean28 = fastDateFormat25.getTimeZoneOverridesCalendar();
        java.util.Locale locale29 = fastDateFormat25.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(39, timeZone22, locale29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 39");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Thursday, January 1, 1970" + "'", str27, "Thursday, January 1, 1970");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_US");
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone2, locale3);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) '#', timeZone5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 35");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        java.util.Locale locale7 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale7);
        java.util.TimeZone timeZone9 = fastDateFormat8.getTimeZone();
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone9, locale10);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale13 = fastDateFormat12.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone9, locale13);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone9);
        java.util.Locale locale16 = fastDateFormat15.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 1, locale16);
        boolean boolean18 = fastDateFormat17.getTimeZoneOverridesCalendar();
        int int19 = fastDateFormat17.getMaxLengthEstimate();
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 39 + "'", int19 == 39);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        java.util.Locale locale6 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale6);
        java.util.TimeZone timeZone8 = fastDateFormat7.getTimeZone();
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone8, locale9);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale12 = fastDateFormat11.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone8, locale12);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone8);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone8);
        java.util.Locale locale19 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale19);
        java.util.TimeZone timeZone21 = fastDateFormat20.getTimeZone();
        java.util.Locale locale29 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale29);
        java.util.TimeZone timeZone31 = fastDateFormat30.getTimeZone();
        java.util.Locale locale32 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone31, locale32);
        java.util.Locale locale34 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone31, locale34);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone31);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone31);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone31);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone31);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z");
        int int42 = fastDateFormat41.getMaxLengthEstimate();
        boolean boolean43 = fastDateFormat39.equals((java.lang.Object) int42);
        java.util.TimeZone timeZone44 = fastDateFormat39.getTimeZone();
        java.lang.Object obj45 = fastDateFormat39.clone();
        java.util.Locale locale46 = fastDateFormat39.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", timeZone21, locale46);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(1, locale46);
        boolean boolean49 = fastDateFormat15.equals((java.lang.Object) fastDateFormat48);
        java.lang.String str51 = fastDateFormat15.format((long) 39);
        java.util.TimeZone timeZone52 = fastDateFormat15.getTimeZone();
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 18 + "'", int42 == 18);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(timeZone44);
        org.junit.Assert.assertEquals(timeZone44.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertEquals(obj45.toString(), "FastDateFormat[EEEE, MMMM d, yyyy]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj45), "FastDateFormat[EEEE, MMMM d, yyyy]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj45), "FastDateFormat[EEEE, MMMM d, yyyy]");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertNotNull(fastDateFormat48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Thursday, January 1, 1970" + "'", str51, "Thursday, January 1, 1970");
        org.junit.Assert.assertNotNull(timeZone52);
        org.junit.Assert.assertEquals(timeZone52.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        java.util.Locale locale7 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale7);
        java.util.TimeZone timeZone9 = fastDateFormat8.getTimeZone();
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone9, locale10);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale13 = fastDateFormat12.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone9, locale13);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone9);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone9);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale18 = fastDateFormat17.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", timeZone9, locale18);
        java.util.Locale locale20 = fastDateFormat19.getLocale();
        java.util.TimeZone timeZone21 = fastDateFormat19.getTimeZone();
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_US");
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 1);
        java.lang.Object obj2 = fastDateFormat1.clone();
        java.util.Locale locale3 = fastDateFormat1.getLocale();
        java.lang.String str4 = fastDateFormat1.toString();
        java.util.Locale locale14 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale14);
        java.util.TimeZone timeZone16 = fastDateFormat15.getTimeZone();
        java.util.Locale locale17 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone16, locale17);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale20 = fastDateFormat19.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone16, locale20);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone16);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone16);
        java.util.Locale locale26 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale26);
        java.util.TimeZone timeZone28 = fastDateFormat27.getTimeZone();
        java.util.Locale locale37 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale37);
        java.util.TimeZone timeZone39 = fastDateFormat38.getTimeZone();
        java.util.Locale locale40 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone39, locale40);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale43 = fastDateFormat42.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone39, locale43);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone39);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone39);
        java.util.Locale locale50 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat51 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale50);
        java.util.TimeZone timeZone52 = fastDateFormat51.getTimeZone();
        java.util.Locale locale53 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat54 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone52, locale53);
        java.util.Locale locale59 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat60 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale59);
        java.util.TimeZone timeZone61 = fastDateFormat60.getTimeZone();
        java.util.Locale locale62 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat63 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone61, locale62);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat64 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale65 = fastDateFormat64.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat66 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone61, locale65);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat67 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone52, locale65);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat68 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone39, locale65);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat69 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale70 = fastDateFormat69.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat71 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone39, locale70);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat72 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone28, locale70);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat73 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0, timeZone16, locale70);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat74 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, locale70);
        int int75 = fastDateFormat74.getMaxLengthEstimate();
        int int76 = fastDateFormat74.getMaxLengthEstimate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str77 = fastDateFormat1.format((java.lang.Object) fastDateFormat74);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: org.apache.commons.lang3.time.FastDateFormat");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "FastDateFormat[MMMM d, yyyy]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "FastDateFormat[MMMM d, yyyy]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "FastDateFormat[MMMM d, yyyy]");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "FastDateFormat[MMMM d, yyyy]" + "'", str4, "FastDateFormat[MMMM d, yyyy]");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(timeZone39);
        org.junit.Assert.assertEquals(timeZone39.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNotNull(fastDateFormat51);
        org.junit.Assert.assertNotNull(timeZone52);
        org.junit.Assert.assertEquals(timeZone52.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat54);
        org.junit.Assert.assertNotNull(fastDateFormat60);
        org.junit.Assert.assertNotNull(timeZone61);
        org.junit.Assert.assertEquals(timeZone61.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat63);
        org.junit.Assert.assertNotNull(fastDateFormat64);
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat66);
        org.junit.Assert.assertNotNull(fastDateFormat67);
        org.junit.Assert.assertNotNull(fastDateFormat68);
        org.junit.Assert.assertNotNull(fastDateFormat69);
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat71);
        org.junit.Assert.assertNotNull(fastDateFormat72);
        org.junit.Assert.assertNotNull(fastDateFormat73);
        org.junit.Assert.assertNotNull(fastDateFormat74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 18 + "'", int75 == 18);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 18 + "'", int76 == 18);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        java.util.Locale locale6 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale6);
        java.util.TimeZone timeZone8 = fastDateFormat7.getTimeZone();
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone8, locale9);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale12 = fastDateFormat11.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone8, locale12);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone8);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, timeZone8);
        boolean boolean17 = fastDateFormat15.equals((java.lang.Object) 100);
        java.util.Locale locale21 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale21);
        java.util.TimeZone timeZone23 = fastDateFormat22.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale25 = fastDateFormat24.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone23, locale25);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone23);
        java.lang.String str28 = fastDateFormat27.getPattern();
        boolean boolean29 = fastDateFormat15.equals((java.lang.Object) fastDateFormat27);
        java.util.TimeZone timeZone30 = fastDateFormat27.getTimeZone();
        java.util.Locale locale38 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale38);
        java.util.TimeZone timeZone40 = fastDateFormat39.getTimeZone();
        java.util.Locale locale41 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone40, locale41);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale44 = fastDateFormat43.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone40, locale44);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone40);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone40);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale49 = fastDateFormat48.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat50 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", timeZone40, locale49);
        int int51 = fastDateFormat50.getMaxLengthEstimate();
        java.lang.String str53 = fastDateFormat50.format((long) (byte) 0);
        java.util.Locale locale58 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat59 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale58);
        java.util.TimeZone timeZone60 = fastDateFormat59.getTimeZone();
        java.util.Locale locale61 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat62 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone60, locale61);
        java.util.Locale locale63 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat64 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone60, locale63);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat65 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone60);
        boolean boolean66 = fastDateFormat50.equals((java.lang.Object) timeZone60);
        java.lang.StringBuffer stringBuffer67 = null;
        java.text.FieldPosition fieldPosition68 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer69 = fastDateFormat27.format((java.lang.Object) boolean66, stringBuffer67, fieldPosition68);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "h:mm a" + "'", str28, "h:mm a");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(timeZone40);
        org.junit.Assert.assertEquals(timeZone40.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertNotNull(fastDateFormat48);
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 17 + "'", int51 == 17);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "12:00:00 AM UTC" + "'", str53, "12:00:00 AM UTC");
        org.junit.Assert.assertNotNull(fastDateFormat59);
        org.junit.Assert.assertNotNull(timeZone60);
        org.junit.Assert.assertEquals(timeZone60.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat62);
        org.junit.Assert.assertNotNull(fastDateFormat64);
        org.junit.Assert.assertNotNull(fastDateFormat65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar6 = null;
        java.lang.StringBuffer stringBuffer7 = null;
        java.lang.StringBuffer stringBuffer8 = fastDateFormat5.format(calendar6, stringBuffer7);
        java.util.Calendar calendar9 = null;
        java.lang.StringBuffer stringBuffer10 = null;
        java.lang.StringBuffer stringBuffer11 = fastDateFormat5.format(calendar9, stringBuffer10);
        java.lang.String str12 = fastDateFormat5.toString();
        java.lang.Object obj13 = fastDateFormat5.clone();
        java.lang.Object obj14 = fastDateFormat5.clone();
        java.lang.String str16 = fastDateFormat5.format(10L);
        int int17 = fastDateFormat5.getMaxLengthEstimate();
        java.util.Locale locale19 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2, locale19);
        java.util.TimeZone timeZone21 = fastDateFormat20.getTimeZone();
        boolean boolean22 = fastDateFormat5.equals((java.lang.Object) timeZone21);
        java.util.TimeZone timeZone25 = null;
        java.util.Locale locale26 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone25, locale26);
        int int28 = fastDateFormat27.getMaxLengthEstimate();
        java.util.Locale locale29 = fastDateFormat27.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, locale29);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(1, 0, timeZone21, locale29);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy", timeZone21);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone21);
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNull(stringBuffer8);
        org.junit.Assert.assertNull(stringBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "FastDateFormat[]" + "'", str12, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "FastDateFormat[]");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "FastDateFormat[]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(fastDateFormat33);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale10);
        java.util.TimeZone timeZone12 = fastDateFormat11.getTimeZone();
        java.util.Locale locale13 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone12, locale13);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale16 = fastDateFormat15.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone12, locale16);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone12);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone12);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone12);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone12);
        java.util.TimeZone timeZone23 = null;
        java.util.Locale locale24 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone23, locale24);
        java.util.Calendar calendar26 = null;
        java.lang.StringBuffer stringBuffer27 = null;
        java.lang.StringBuffer stringBuffer28 = fastDateFormat25.format(calendar26, stringBuffer27);
        java.lang.StringBuffer stringBuffer30 = null;
        java.lang.StringBuffer stringBuffer31 = fastDateFormat25.format(10L, stringBuffer30);
        java.util.Locale locale32 = fastDateFormat25.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang3.time.FastDateFormat.getInstance("12/31/69", timeZone12, locale32);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale32);
        java.lang.Class<?> wildcardClass35 = locale32.getClass();
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNull(stringBuffer28);
        org.junit.Assert.assertNull(stringBuffer31);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        java.util.Locale locale6 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale6);
        java.util.TimeZone timeZone8 = fastDateFormat7.getTimeZone();
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone8, locale9);
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", timeZone8, locale11);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy");
        java.util.Locale locale15 = fastDateFormat14.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, timeZone8, locale15);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone8);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getInstance("");
        boolean boolean23 = fastDateFormat21.equals((java.lang.Object) 100.0f);
        boolean boolean24 = fastDateFormat21.getTimeZoneOverridesCalendar();
        java.util.TimeZone timeZone25 = fastDateFormat21.getTimeZone();
        java.util.Locale locale27 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale27);
        java.lang.String str30 = fastDateFormat28.format((long) (short) 0);
        boolean boolean31 = fastDateFormat28.getTimeZoneOverridesCalendar();
        java.util.Locale locale32 = fastDateFormat28.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone25, locale32);
        java.util.Locale locale39 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale39);
        java.util.TimeZone timeZone41 = fastDateFormat40.getTimeZone();
        java.util.Locale locale42 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone41, locale42);
        java.util.Locale locale44 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", timeZone41, locale44);
        java.util.TimeZone timeZone46 = fastDateFormat45.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2);
        java.lang.String str50 = fastDateFormat48.format(0L);
        java.util.Locale locale51 = fastDateFormat48.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat52 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone46, locale51);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat53 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, locale51);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat54 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy h:mm:ss a z", timeZone25, locale51);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat55 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 10, timeZone8, locale51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Thursday, January 1, 1970" + "'", str30, "Thursday, January 1, 1970");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(timeZone41);
        org.junit.Assert.assertEquals(timeZone41.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNotNull(timeZone46);
        org.junit.Assert.assertEquals(timeZone46.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "12:00:00 AM" + "'", str50, "12:00:00 AM");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat52);
        org.junit.Assert.assertNotNull(fastDateFormat53);
        org.junit.Assert.assertNotNull(fastDateFormat54);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) 'a', locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 97");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        java.util.Locale locale6 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale6);
        java.util.TimeZone timeZone8 = fastDateFormat7.getTimeZone();
        java.util.Locale locale17 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale17);
        java.util.TimeZone timeZone19 = fastDateFormat18.getTimeZone();
        java.util.Locale locale20 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone19, locale20);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale23 = fastDateFormat22.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone19, locale23);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone19);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone19);
        java.util.Locale locale30 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale30);
        java.util.TimeZone timeZone32 = fastDateFormat31.getTimeZone();
        java.util.Locale locale33 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone32, locale33);
        java.util.Locale locale39 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale39);
        java.util.TimeZone timeZone41 = fastDateFormat40.getTimeZone();
        java.util.Locale locale42 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone41, locale42);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale45 = fastDateFormat44.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone41, locale45);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone32, locale45);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone19, locale45);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale50 = fastDateFormat49.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat51 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone19, locale50);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat52 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone8, locale50);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat54 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale55 = fastDateFormat54.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat56 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, locale55);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat57 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy", timeZone8, locale55);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat58 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 1, timeZone8);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat59 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone8);
        java.util.Locale locale65 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat66 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale65);
        java.util.TimeZone timeZone67 = fastDateFormat66.getTimeZone();
        java.util.Locale locale68 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat69 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone67, locale68);
        java.util.Locale locale70 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat71 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone67, locale70);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat72 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone67);
        java.util.Locale locale76 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat77 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale76);
        java.util.TimeZone timeZone78 = fastDateFormat77.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat79 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale80 = fastDateFormat79.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat81 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone78, locale80);
        int int82 = fastDateFormat81.getMaxLengthEstimate();
        java.util.Locale locale83 = fastDateFormat81.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat84 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, locale83);
        java.util.Locale locale85 = fastDateFormat84.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat86 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone67, locale85);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat87 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(17, timeZone8, locale85);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 17");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(timeZone32);
        org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(timeZone41);
        org.junit.Assert.assertEquals(timeZone41.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertNotNull(fastDateFormat48);
        org.junit.Assert.assertNotNull(fastDateFormat49);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat51);
        org.junit.Assert.assertNotNull(fastDateFormat52);
        org.junit.Assert.assertNotNull(fastDateFormat54);
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat56);
        org.junit.Assert.assertNotNull(fastDateFormat57);
        org.junit.Assert.assertNotNull(fastDateFormat58);
        org.junit.Assert.assertNotNull(fastDateFormat59);
        org.junit.Assert.assertNotNull(fastDateFormat66);
        org.junit.Assert.assertNotNull(timeZone67);
        org.junit.Assert.assertEquals(timeZone67.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat69);
        org.junit.Assert.assertNotNull(fastDateFormat71);
        org.junit.Assert.assertNotNull(fastDateFormat72);
        org.junit.Assert.assertNotNull(fastDateFormat77);
        org.junit.Assert.assertNotNull(timeZone78);
        org.junit.Assert.assertEquals(timeZone78.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat79);
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertNotNull(locale83);
        org.junit.Assert.assertEquals(locale83.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat84);
        org.junit.Assert.assertNotNull(locale85);
        org.junit.Assert.assertEquals(locale85.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat86);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale4);
        java.util.TimeZone timeZone6 = fastDateFormat5.getTimeZone();
        java.util.Locale locale7 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone6, locale7);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 2, timeZone6);
        java.util.TimeZone timeZone10 = fastDateFormat9.getTimeZone();
        java.util.Date date11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = fastDateFormat9.format(date11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        java.util.Locale locale5 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale5);
        java.util.TimeZone timeZone7 = fastDateFormat6.getTimeZone();
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone7, locale8);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale11 = fastDateFormat10.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone7, locale11);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2, timeZone7);
        java.lang.String str14 = fastDateFormat13.getPattern();
        boolean boolean15 = fastDateFormat13.getTimeZoneOverridesCalendar();
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h:mm:ss a" + "'", str14, "h:mm:ss a");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        boolean boolean1 = fastDateFormat0.getTimeZoneOverridesCalendar();
        java.util.Date date2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = fastDateFormat0.format(date2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale10);
        java.util.TimeZone timeZone12 = fastDateFormat11.getTimeZone();
        java.util.Locale locale13 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone12, locale13);
        java.util.Locale locale15 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone12, locale15);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone12);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3);
        boolean boolean20 = fastDateFormat19.getTimeZoneOverridesCalendar();
        java.util.Locale locale21 = fastDateFormat19.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, 0, timeZone12, locale21);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 1, timeZone12);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone12);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, timeZone12);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy h:mm a", timeZone12);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0);
        java.lang.Class<?> wildcardClass29 = fastDateFormat28.getClass();
        boolean boolean30 = fastDateFormat26.equals((java.lang.Object) wildcardClass29);
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale9);
        java.util.TimeZone timeZone11 = fastDateFormat10.getTimeZone();
        java.util.Locale locale12 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone11, locale12);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale15 = fastDateFormat14.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone11, locale15);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone11);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone11);
        java.util.Locale locale22 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale22);
        java.util.TimeZone timeZone24 = fastDateFormat23.getTimeZone();
        java.util.Locale locale25 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone24, locale25);
        java.util.Locale locale31 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale31);
        java.util.TimeZone timeZone33 = fastDateFormat32.getTimeZone();
        java.util.Locale locale34 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone33, locale34);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale37 = fastDateFormat36.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone33, locale37);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone24, locale37);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone11, locale37);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0);
        java.util.Locale locale44 = fastDateFormat43.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, locale44);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone11, locale44);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang3.time.FastDateFormat.getInstance("MMMM d, yyyy", timeZone11);
        java.util.TimeZone timeZone48 = fastDateFormat47.getTimeZone();
        java.util.TimeZone timeZone50 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat51 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone50);
        boolean boolean53 = fastDateFormat51.equals((java.lang.Object) "FastDateFormat[]");
        boolean boolean54 = fastDateFormat51.getTimeZoneOverridesCalendar();
        java.lang.String str56 = fastDateFormat51.format((java.lang.Object) 1L);
        java.lang.String str57 = fastDateFormat51.getPattern();
        boolean boolean58 = fastDateFormat47.equals((java.lang.Object) fastDateFormat51);
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertNotNull(timeZone48);
        org.junit.Assert.assertEquals(timeZone48.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "12:00:00 AM UTC" + "'", str56, "12:00:00 AM UTC");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "h:mm:ss a z" + "'", str57, "h:mm:ss a z");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale9);
        java.util.TimeZone timeZone11 = fastDateFormat10.getTimeZone();
        java.util.Locale locale12 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone11, locale12);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale15 = fastDateFormat14.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone11, locale15);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone11);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone11);
        java.util.Locale locale22 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale22);
        java.util.TimeZone timeZone24 = fastDateFormat23.getTimeZone();
        java.util.Locale locale25 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone24, locale25);
        java.util.Locale locale31 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale31);
        java.util.TimeZone timeZone33 = fastDateFormat32.getTimeZone();
        java.util.Locale locale34 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone33, locale34);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale37 = fastDateFormat36.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone33, locale37);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone24, locale37);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone11, locale37);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale42 = fastDateFormat41.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone11, locale42);
        java.util.Locale locale55 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat56 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale55);
        java.util.TimeZone timeZone57 = fastDateFormat56.getTimeZone();
        java.util.Locale locale58 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat59 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone57, locale58);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat60 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale61 = fastDateFormat60.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat62 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone57, locale61);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat63 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone57);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat64 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone57);
        java.util.Locale locale68 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat69 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale68);
        java.util.TimeZone timeZone70 = fastDateFormat69.getTimeZone();
        java.util.Locale locale71 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat72 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone70, locale71);
        java.util.Locale locale77 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat78 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale77);
        java.util.TimeZone timeZone79 = fastDateFormat78.getTimeZone();
        java.util.Locale locale80 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat81 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone79, locale80);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat82 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale83 = fastDateFormat82.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat84 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone79, locale83);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat85 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone70, locale83);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat86 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone57, locale83);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat87 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale88 = fastDateFormat87.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat89 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone57, locale88);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat90 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, locale88);
        java.util.Locale locale91 = fastDateFormat90.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat92 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, (int) (byte) 0, locale91);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat93 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy h:mm a", timeZone11, locale91);
        java.util.Date date94 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str95 = fastDateFormat93.format(date94);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(fastDateFormat56);
        org.junit.Assert.assertNotNull(timeZone57);
        org.junit.Assert.assertEquals(timeZone57.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat59);
        org.junit.Assert.assertNotNull(fastDateFormat60);
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat62);
        org.junit.Assert.assertNotNull(fastDateFormat63);
        org.junit.Assert.assertNotNull(fastDateFormat64);
        org.junit.Assert.assertNotNull(fastDateFormat69);
        org.junit.Assert.assertNotNull(timeZone70);
        org.junit.Assert.assertEquals(timeZone70.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat72);
        org.junit.Assert.assertNotNull(fastDateFormat78);
        org.junit.Assert.assertNotNull(timeZone79);
        org.junit.Assert.assertEquals(timeZone79.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat81);
        org.junit.Assert.assertNotNull(fastDateFormat82);
        org.junit.Assert.assertNotNull(locale83);
        org.junit.Assert.assertEquals(locale83.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat84);
        org.junit.Assert.assertNotNull(fastDateFormat85);
        org.junit.Assert.assertNotNull(fastDateFormat86);
        org.junit.Assert.assertNotNull(fastDateFormat87);
        org.junit.Assert.assertNotNull(locale88);
        org.junit.Assert.assertEquals(locale88.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat89);
        org.junit.Assert.assertNotNull(fastDateFormat90);
        org.junit.Assert.assertNotNull(locale91);
        org.junit.Assert.assertEquals(locale91.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat92);
        org.junit.Assert.assertNotNull(fastDateFormat93);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2);
        java.lang.String str5 = fastDateFormat3.format(0L);
        java.util.Locale locale6 = fastDateFormat3.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale6);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale6);
        java.util.TimeZone timeZone10 = null;
        java.util.Locale locale20 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale20);
        java.util.TimeZone timeZone22 = fastDateFormat21.getTimeZone();
        java.util.Locale locale23 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone22, locale23);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale26 = fastDateFormat25.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone22, locale26);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone22);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone22);
        java.util.Locale locale32 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale32);
        java.util.TimeZone timeZone34 = fastDateFormat33.getTimeZone();
        java.util.Locale locale43 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale43);
        java.util.TimeZone timeZone45 = fastDateFormat44.getTimeZone();
        java.util.Locale locale46 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone45, locale46);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale49 = fastDateFormat48.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat50 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone45, locale49);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat51 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone45);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat52 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone45);
        java.util.Locale locale56 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat57 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale56);
        java.util.TimeZone timeZone58 = fastDateFormat57.getTimeZone();
        java.util.Locale locale59 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat60 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone58, locale59);
        java.util.Locale locale65 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat66 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale65);
        java.util.TimeZone timeZone67 = fastDateFormat66.getTimeZone();
        java.util.Locale locale68 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat69 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone67, locale68);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat70 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale71 = fastDateFormat70.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat72 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone67, locale71);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat73 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone58, locale71);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat74 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone45, locale71);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat75 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale76 = fastDateFormat75.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat77 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone45, locale76);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat78 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone34, locale76);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat79 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0, timeZone22, locale76);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat80 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, locale76);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat81 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 1, timeZone10, locale76);
        boolean boolean82 = fastDateFormat8.equals((java.lang.Object) timeZone10);
        int int83 = fastDateFormat8.getMaxLengthEstimate();
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "12:00:00 AM" + "'", str5, "12:00:00 AM");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(timeZone34);
        org.junit.Assert.assertEquals(timeZone34.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(timeZone45);
        org.junit.Assert.assertEquals(timeZone45.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertNotNull(fastDateFormat48);
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat50);
        org.junit.Assert.assertNotNull(fastDateFormat51);
        org.junit.Assert.assertNotNull(fastDateFormat52);
        org.junit.Assert.assertNotNull(fastDateFormat57);
        org.junit.Assert.assertNotNull(timeZone58);
        org.junit.Assert.assertEquals(timeZone58.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat60);
        org.junit.Assert.assertNotNull(fastDateFormat66);
        org.junit.Assert.assertNotNull(timeZone67);
        org.junit.Assert.assertEquals(timeZone67.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat69);
        org.junit.Assert.assertNotNull(fastDateFormat70);
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat72);
        org.junit.Assert.assertNotNull(fastDateFormat73);
        org.junit.Assert.assertNotNull(fastDateFormat74);
        org.junit.Assert.assertNotNull(fastDateFormat75);
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat77);
        org.junit.Assert.assertNotNull(fastDateFormat78);
        org.junit.Assert.assertNotNull(fastDateFormat79);
        org.junit.Assert.assertNotNull(fastDateFormat80);
        org.junit.Assert.assertNotNull(fastDateFormat81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 31 + "'", int83 == 31);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        java.util.Locale locale6 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale6);
        java.util.TimeZone timeZone8 = fastDateFormat7.getTimeZone();
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone8, locale9);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale12 = fastDateFormat11.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone8, locale12);
        java.util.Locale locale19 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale19);
        java.util.TimeZone timeZone21 = fastDateFormat20.getTimeZone();
        java.util.Locale locale22 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone21, locale22);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale25 = fastDateFormat24.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone21, locale25);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone21);
        java.util.Locale locale28 = fastDateFormat27.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, (int) (byte) 1, timeZone8, locale28);
        java.lang.Object obj30 = fastDateFormat29.clone();
        boolean boolean31 = fastDateFormat29.getTimeZoneOverridesCalendar();
        java.lang.String str32 = fastDateFormat29.toString();
        java.util.Date date33 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = fastDateFormat29.format(date33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "FastDateFormat[EEEE, MMMM d, yyyy h:mm:ss a z]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "FastDateFormat[EEEE, MMMM d, yyyy h:mm:ss a z]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "FastDateFormat[EEEE, MMMM d, yyyy h:mm:ss a z]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "FastDateFormat[EEEE, MMMM d, yyyy h:mm:ss a z]" + "'", str32, "FastDateFormat[EEEE, MMMM d, yyyy h:mm:ss a z]");
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(2, (int) (byte) 0);
        java.util.Calendar calendar3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = fastDateFormat2.format(calendar3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat2);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale8);
        java.util.TimeZone timeZone10 = fastDateFormat9.getTimeZone();
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone10, locale11);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale14 = fastDateFormat13.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone10, locale14);
        java.util.Locale locale21 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale21);
        java.util.TimeZone timeZone23 = fastDateFormat22.getTimeZone();
        java.util.Locale locale24 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone23, locale24);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale27 = fastDateFormat26.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone23, locale27);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone23);
        java.util.Locale locale30 = fastDateFormat29.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, (int) (byte) 1, timeZone10, locale30);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, timeZone10);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 1, timeZone10);
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(fastDateFormat33);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        java.util.Locale locale6 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale6);
        java.util.TimeZone timeZone8 = fastDateFormat7.getTimeZone();
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone8, locale9);
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone8, locale11);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone8);
        java.lang.String str14 = fastDateFormat13.getPattern();
        java.util.Locale locale20 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale20);
        java.util.TimeZone timeZone22 = fastDateFormat21.getTimeZone();
        java.util.Locale locale23 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone22, locale23);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale26 = fastDateFormat25.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone22, locale26);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone22);
        boolean boolean29 = fastDateFormat13.equals((java.lang.Object) timeZone22);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(49, (int) (short) 1, timeZone22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 49");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EEEE, MMMM d, yyyy" + "'", str14, "EEEE, MMMM d, yyyy");
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        boolean boolean2 = fastDateFormat1.getTimeZoneOverridesCalendar();
        java.util.Locale locale3 = fastDateFormat1.getLocale();
        java.util.TimeZone timeZone4 = fastDateFormat1.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone4);
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer8 = fastDateFormat5.format((long) 45, stringBuffer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat5);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale4);
        java.util.TimeZone timeZone6 = fastDateFormat5.getTimeZone();
        java.util.Locale locale7 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone6, locale7);
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone6, locale9);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone6);
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(fastDateFormat11);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale10);
        java.util.TimeZone timeZone12 = fastDateFormat11.getTimeZone();
        java.util.Locale locale13 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone12, locale13);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale16 = fastDateFormat15.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone12, locale16);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone12);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone12);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone12);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone12);
        java.util.TimeZone timeZone23 = null;
        java.util.Locale locale24 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone23, locale24);
        java.util.Calendar calendar26 = null;
        java.lang.StringBuffer stringBuffer27 = null;
        java.lang.StringBuffer stringBuffer28 = fastDateFormat25.format(calendar26, stringBuffer27);
        java.lang.StringBuffer stringBuffer30 = null;
        java.lang.StringBuffer stringBuffer31 = fastDateFormat25.format(10L, stringBuffer30);
        java.util.Locale locale32 = fastDateFormat25.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang3.time.FastDateFormat.getInstance("12/31/69", timeZone12, locale32);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", locale32);
        boolean boolean35 = fastDateFormat34.getTimeZoneOverridesCalendar();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang3.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar39 = null;
        java.lang.String str40 = fastDateFormat38.format(calendar39);
        java.lang.StringBuffer stringBuffer42 = null;
        java.lang.StringBuffer stringBuffer43 = fastDateFormat38.format((long) 'a', stringBuffer42);
        boolean boolean44 = fastDateFormat38.getTimeZoneOverridesCalendar();
        java.lang.String str45 = fastDateFormat38.toString();
        boolean boolean46 = fastDateFormat38.getTimeZoneOverridesCalendar();
        java.util.TimeZone timeZone47 = fastDateFormat38.getTimeZone();
        java.util.Locale locale53 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat54 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale53);
        java.util.TimeZone timeZone55 = fastDateFormat54.getTimeZone();
        java.util.Locale locale56 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat57 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone55, locale56);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat58 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale59 = fastDateFormat58.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat60 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone55, locale59);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat61 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone55);
        java.util.Locale locale62 = fastDateFormat61.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat63 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone47, locale62);
        java.lang.Class<?> wildcardClass64 = fastDateFormat63.getClass();
        java.lang.StringBuffer stringBuffer65 = null;
        java.text.FieldPosition fieldPosition66 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer67 = fastDateFormat34.format((java.lang.Object) fastDateFormat63, stringBuffer65, fieldPosition66);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: org.apache.commons.lang3.time.FastDateFormat");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNull(stringBuffer28);
        org.junit.Assert.assertNull(stringBuffer31);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNull(stringBuffer43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "FastDateFormat[]" + "'", str45, "FastDateFormat[]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(timeZone47);
        org.junit.Assert.assertEquals(timeZone47.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat54);
        org.junit.Assert.assertNotNull(timeZone55);
        org.junit.Assert.assertEquals(timeZone55.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat57);
        org.junit.Assert.assertNotNull(fastDateFormat58);
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat60);
        org.junit.Assert.assertNotNull(fastDateFormat61);
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat63);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        java.util.Locale locale5 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale5);
        java.util.TimeZone timeZone7 = fastDateFormat6.getTimeZone();
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone7, locale8);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale11 = fastDateFormat10.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone7, locale11);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone7);
        java.lang.String str14 = fastDateFormat13.toString();
        java.lang.String str15 = fastDateFormat13.getPattern();
        boolean boolean16 = fastDateFormat13.getTimeZoneOverridesCalendar();
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "FastDateFormat[h:mm a]" + "'", str14, "FastDateFormat[h:mm a]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h:mm a" + "'", str15, "h:mm a");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(20, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 20");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar5 = null;
        java.lang.String str6 = fastDateFormat4.format(calendar5);
        java.lang.StringBuffer stringBuffer8 = null;
        java.lang.StringBuffer stringBuffer9 = fastDateFormat4.format((long) 'a', stringBuffer8);
        boolean boolean10 = fastDateFormat4.getTimeZoneOverridesCalendar();
        java.lang.String str11 = fastDateFormat4.toString();
        boolean boolean12 = fastDateFormat4.getTimeZoneOverridesCalendar();
        java.util.TimeZone timeZone13 = fastDateFormat4.getTimeZone();
        boolean boolean14 = fastDateFormat4.getTimeZoneOverridesCalendar();
        java.util.TimeZone timeZone15 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getInstance("MMM d, yyyy", timeZone15);
        java.util.Locale locale25 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale25);
        java.util.TimeZone timeZone27 = fastDateFormat26.getTimeZone();
        java.util.Locale locale28 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone27, locale28);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale31 = fastDateFormat30.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone27, locale31);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone27);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone27);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang3.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar37 = null;
        java.lang.String str38 = fastDateFormat36.format(calendar37);
        java.lang.String str39 = fastDateFormat36.toString();
        java.lang.StringBuffer stringBuffer41 = null;
        java.lang.StringBuffer stringBuffer42 = fastDateFormat36.format((long) (byte) 0, stringBuffer41);
        java.lang.String str44 = fastDateFormat36.format((long) (byte) 10);
        java.util.Locale locale45 = fastDateFormat36.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone27, locale45);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale45);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 1, (int) (short) 0, timeZone15, locale45);
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(stringBuffer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "FastDateFormat[]" + "'", str11, "FastDateFormat[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "FastDateFormat[]" + "'", str39, "FastDateFormat[]");
        org.junit.Assert.assertNull(stringBuffer42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertNotNull(fastDateFormat48);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        java.util.Locale locale6 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale6);
        java.util.TimeZone timeZone8 = fastDateFormat7.getTimeZone();
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone8, locale9);
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone8, locale11);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone8);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 1, timeZone8);
        java.util.Locale locale20 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale20);
        java.util.TimeZone timeZone22 = fastDateFormat21.getTimeZone();
        java.util.Locale locale23 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone22, locale23);
        java.util.Locale locale25 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", timeZone22, locale25);
        java.util.TimeZone timeZone27 = fastDateFormat26.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2);
        java.lang.String str31 = fastDateFormat29.format(0L);
        java.util.Locale locale32 = fastDateFormat29.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone27, locale32);
        java.util.Locale locale37 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale37);
        java.util.TimeZone timeZone39 = fastDateFormat38.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale41 = fastDateFormat40.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone39, locale41);
        int int43 = fastDateFormat42.getMaxLengthEstimate();
        java.util.Locale locale44 = fastDateFormat42.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, locale44);
        java.util.Locale locale46 = fastDateFormat45.getLocale();
        java.lang.Object obj47 = fastDateFormat45.clone();
        java.util.Locale locale48 = fastDateFormat45.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, timeZone27, locale48);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat50 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(45, timeZone8, locale48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 45");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "12:00:00 AM" + "'", str31, "12:00:00 AM");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(timeZone39);
        org.junit.Assert.assertEquals(timeZone39.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "en_US");
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertEquals(obj47.toString(), "FastDateFormat[h:mm a]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj47), "FastDateFormat[h:mm a]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj47), "FastDateFormat[h:mm a]");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat49);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar2 = null;
        java.lang.String str3 = fastDateFormat1.format(calendar2);
        java.lang.StringBuffer stringBuffer5 = null;
        java.lang.StringBuffer stringBuffer6 = fastDateFormat1.format((long) 'a', stringBuffer5);
        int int7 = fastDateFormat1.getMaxLengthEstimate();
        boolean boolean8 = fastDateFormat1.getTimeZoneOverridesCalendar();
        java.util.Calendar calendar9 = null;
        java.lang.StringBuffer stringBuffer10 = null;
        java.lang.StringBuffer stringBuffer11 = fastDateFormat1.format(calendar9, stringBuffer10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = stringBuffer11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(stringBuffer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(stringBuffer11);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale9);
        java.util.TimeZone timeZone11 = fastDateFormat10.getTimeZone();
        java.util.Locale locale12 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone11, locale12);
        java.util.Locale locale14 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone11, locale14);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone11);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone11);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone11);
        java.util.TimeZone timeZone19 = fastDateFormat18.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone19);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 1, timeZone19);
        java.util.Locale locale28 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale28);
        java.util.TimeZone timeZone30 = fastDateFormat29.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale32 = fastDateFormat31.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone30, locale32);
        int int34 = fastDateFormat33.getMaxLengthEstimate();
        java.util.Locale locale35 = fastDateFormat33.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, locale35);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale35);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(3, 0, locale35);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(10, timeZone19, locale35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(fastDateFormat38);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        java.util.Locale locale5 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale5);
        java.util.TimeZone timeZone7 = fastDateFormat6.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale9 = fastDateFormat8.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone7, locale9);
        java.util.TimeZone timeZone12 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone12);
        boolean boolean15 = fastDateFormat13.equals((java.lang.Object) "FastDateFormat[]");
        boolean boolean16 = fastDateFormat13.getTimeZoneOverridesCalendar();
        java.lang.Object obj17 = fastDateFormat13.clone();
        boolean boolean18 = fastDateFormat10.equals((java.lang.Object) fastDateFormat13);
        java.util.Locale locale25 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale25);
        java.util.TimeZone timeZone27 = fastDateFormat26.getTimeZone();
        java.util.Locale locale28 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone27, locale28);
        java.util.Locale locale34 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale34);
        java.util.TimeZone timeZone36 = fastDateFormat35.getTimeZone();
        java.util.Locale locale37 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone36, locale37);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale40 = fastDateFormat39.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone36, locale40);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone27, locale40);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone27);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone27);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone27);
        boolean boolean46 = fastDateFormat10.equals((java.lang.Object) timeZone27);
        java.util.Locale locale55 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat56 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale55);
        java.util.TimeZone timeZone57 = fastDateFormat56.getTimeZone();
        java.util.Locale locale58 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat59 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone57, locale58);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat60 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale61 = fastDateFormat60.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat62 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone57, locale61);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat63 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone57);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat64 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone57);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat65 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale66 = fastDateFormat65.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat67 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", timeZone57, locale66);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat68 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", locale66);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat69 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 1, timeZone27, locale66);
        java.util.Locale locale74 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat75 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale74);
        java.util.TimeZone timeZone76 = fastDateFormat75.getTimeZone();
        java.util.Locale locale77 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat78 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone76, locale77);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat79 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale80 = fastDateFormat79.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat81 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone76, locale80);
        java.util.Locale locale82 = fastDateFormat81.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat83 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, timeZone27, locale82);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat84 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone27);
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "FastDateFormat[h:mm:ss a z]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "FastDateFormat[h:mm:ss a z]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "FastDateFormat[h:mm:ss a z]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(timeZone36);
        org.junit.Assert.assertEquals(timeZone36.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(fastDateFormat56);
        org.junit.Assert.assertNotNull(timeZone57);
        org.junit.Assert.assertEquals(timeZone57.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat59);
        org.junit.Assert.assertNotNull(fastDateFormat60);
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat62);
        org.junit.Assert.assertNotNull(fastDateFormat63);
        org.junit.Assert.assertNotNull(fastDateFormat64);
        org.junit.Assert.assertNotNull(fastDateFormat65);
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat67);
        org.junit.Assert.assertNotNull(fastDateFormat68);
        org.junit.Assert.assertNotNull(fastDateFormat69);
        org.junit.Assert.assertNotNull(fastDateFormat75);
        org.junit.Assert.assertNotNull(timeZone76);
        org.junit.Assert.assertEquals(timeZone76.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat78);
        org.junit.Assert.assertNotNull(fastDateFormat79);
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat81);
        org.junit.Assert.assertNotNull(locale82);
        org.junit.Assert.assertEquals(locale82.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat83);
        org.junit.Assert.assertNotNull(fastDateFormat84);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone1, locale2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.util.Locale locale5 = fastDateFormat3.getLocale();
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h:mm:ss a z" + "'", str4, "h:mm:ss a z");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getInstance("");
        boolean boolean7 = fastDateFormat5.equals((java.lang.Object) 100.0f);
        boolean boolean8 = fastDateFormat5.getTimeZoneOverridesCalendar();
        java.lang.String str10 = fastDateFormat5.format((long) (byte) 100);
        java.util.TimeZone timeZone11 = fastDateFormat5.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm a", timeZone11);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2);
        java.lang.String str17 = fastDateFormat15.format(0L);
        java.util.Locale locale18 = fastDateFormat15.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale18);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone11, locale18);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone11);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang3.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar25 = null;
        java.lang.StringBuffer stringBuffer26 = null;
        java.lang.StringBuffer stringBuffer27 = fastDateFormat24.format(calendar25, stringBuffer26);
        java.util.Calendar calendar28 = null;
        java.lang.StringBuffer stringBuffer29 = null;
        java.lang.StringBuffer stringBuffer30 = fastDateFormat24.format(calendar28, stringBuffer29);
        java.lang.StringBuffer stringBuffer32 = null;
        java.lang.StringBuffer stringBuffer33 = fastDateFormat24.format((long) (byte) 100, stringBuffer32);
        java.lang.String str34 = fastDateFormat24.toString();
        java.lang.Object obj35 = fastDateFormat24.clone();
        java.util.Locale locale36 = fastDateFormat24.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, locale36);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) -1, timeZone11, locale36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "12:00:00 AM" + "'", str17, "12:00:00 AM");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNull(stringBuffer27);
        org.junit.Assert.assertNull(stringBuffer30);
        org.junit.Assert.assertNull(stringBuffer33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "FastDateFormat[]" + "'", str34, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertEquals(obj35.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj35), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj35), "FastDateFormat[]");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat37);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale4);
        java.util.TimeZone timeZone6 = fastDateFormat5.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale8 = fastDateFormat7.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone6, locale8);
        int int10 = fastDateFormat9.getMaxLengthEstimate();
        java.util.Locale locale11 = fastDateFormat9.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, locale11);
        java.util.TimeZone timeZone13 = fastDateFormat12.getTimeZone();
        java.util.TimeZone timeZone15 = null;
        java.util.Locale locale16 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone15, locale16);
        java.util.Calendar calendar18 = null;
        java.lang.StringBuffer stringBuffer19 = null;
        java.lang.StringBuffer stringBuffer20 = fastDateFormat17.format(calendar18, stringBuffer19);
        java.lang.StringBuffer stringBuffer22 = null;
        java.lang.StringBuffer stringBuffer23 = fastDateFormat17.format(10L, stringBuffer22);
        java.util.Locale locale24 = fastDateFormat17.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 1, timeZone13, locale24);
        java.lang.String str26 = fastDateFormat25.getPattern();
        int int27 = fastDateFormat25.getMaxLengthEstimate();
        java.lang.Object obj28 = fastDateFormat25.clone();
        java.lang.String str30 = fastDateFormat25.format((long) (short) 0);
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNull(stringBuffer20);
        org.junit.Assert.assertNull(stringBuffer23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "MMMM d, yyyy" + "'", str26, "MMMM d, yyyy");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 20 + "'", int27 == 20);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "FastDateFormat[MMMM d, yyyy]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "FastDateFormat[MMMM d, yyyy]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "FastDateFormat[MMMM d, yyyy]");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "January 1, 1970" + "'", str30, "January 1, 1970");
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("");
        boolean boolean5 = fastDateFormat3.equals((java.lang.Object) 100.0f);
        boolean boolean6 = fastDateFormat3.getTimeZoneOverridesCalendar();
        java.util.Locale locale7 = fastDateFormat3.getLocale();
        java.util.Locale locale8 = fastDateFormat3.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2, locale8);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getInstance("1/1/70", locale8);
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(fastDateFormat10);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar2 = null;
        java.lang.String str3 = fastDateFormat1.format(calendar2);
        java.lang.StringBuffer stringBuffer5 = null;
        java.lang.StringBuffer stringBuffer6 = fastDateFormat1.format((long) 'a', stringBuffer5);
        boolean boolean7 = fastDateFormat1.getTimeZoneOverridesCalendar();
        java.lang.String str8 = fastDateFormat1.toString();
        java.lang.Object obj9 = fastDateFormat1.clone();
        java.lang.StringBuffer stringBuffer11 = null;
        java.lang.StringBuffer stringBuffer12 = fastDateFormat1.format(0L, stringBuffer11);
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(stringBuffer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "FastDateFormat[]" + "'", str8, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "FastDateFormat[]");
        org.junit.Assert.assertNull(stringBuffer12);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar5 = null;
        java.lang.StringBuffer stringBuffer6 = null;
        java.lang.StringBuffer stringBuffer7 = fastDateFormat4.format(calendar5, stringBuffer6);
        java.util.Calendar calendar8 = null;
        java.lang.StringBuffer stringBuffer9 = null;
        java.lang.StringBuffer stringBuffer10 = fastDateFormat4.format(calendar8, stringBuffer9);
        java.lang.String str11 = fastDateFormat4.toString();
        java.lang.Object obj12 = fastDateFormat4.clone();
        java.lang.Object obj13 = fastDateFormat4.clone();
        java.lang.String str15 = fastDateFormat4.format(10L);
        int int16 = fastDateFormat4.getMaxLengthEstimate();
        java.util.Locale locale18 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2, locale18);
        java.util.TimeZone timeZone20 = fastDateFormat19.getTimeZone();
        boolean boolean21 = fastDateFormat4.equals((java.lang.Object) timeZone20);
        java.util.TimeZone timeZone24 = null;
        java.util.Locale locale25 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone24, locale25);
        int int27 = fastDateFormat26.getMaxLengthEstimate();
        java.util.Locale locale28 = fastDateFormat26.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, locale28);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(1, 0, timeZone20, locale28);
        java.util.Locale locale31 = fastDateFormat30.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(21, locale31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 21");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNull(stringBuffer7);
        org.junit.Assert.assertNull(stringBuffer10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "FastDateFormat[]" + "'", str11, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "FastDateFormat[]");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "FastDateFormat[]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_US");
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale8);
        java.util.TimeZone timeZone10 = fastDateFormat9.getTimeZone();
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone10, locale11);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale14 = fastDateFormat13.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone10, locale14);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone10);
        java.util.Locale locale19 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale19);
        java.util.TimeZone timeZone21 = fastDateFormat20.getTimeZone();
        java.util.Locale locale30 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale30);
        java.util.TimeZone timeZone32 = fastDateFormat31.getTimeZone();
        java.util.Locale locale33 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone32, locale33);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale36 = fastDateFormat35.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone32, locale36);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone32);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone32);
        java.util.Locale locale43 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale43);
        java.util.TimeZone timeZone45 = fastDateFormat44.getTimeZone();
        java.util.Locale locale46 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone45, locale46);
        java.util.Locale locale52 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat53 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale52);
        java.util.TimeZone timeZone54 = fastDateFormat53.getTimeZone();
        java.util.Locale locale55 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat56 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone54, locale55);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat57 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale58 = fastDateFormat57.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat59 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone54, locale58);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat60 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone45, locale58);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat61 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone32, locale58);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat62 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale63 = fastDateFormat62.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat64 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone32, locale63);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat65 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone21, locale63);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat66 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone10, locale63);
        java.util.Locale locale67 = fastDateFormat66.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat68 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(3, (int) (short) 1, locale67);
        java.lang.StringBuffer stringBuffer70 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer71 = fastDateFormat68.format((long) (byte) 0, stringBuffer70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(timeZone32);
        org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(timeZone45);
        org.junit.Assert.assertEquals(timeZone45.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertNotNull(fastDateFormat53);
        org.junit.Assert.assertNotNull(timeZone54);
        org.junit.Assert.assertEquals(timeZone54.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat56);
        org.junit.Assert.assertNotNull(fastDateFormat57);
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat59);
        org.junit.Assert.assertNotNull(fastDateFormat60);
        org.junit.Assert.assertNotNull(fastDateFormat61);
        org.junit.Assert.assertNotNull(fastDateFormat62);
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat64);
        org.junit.Assert.assertNotNull(fastDateFormat65);
        org.junit.Assert.assertNotNull(fastDateFormat66);
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat68);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("");
        boolean boolean3 = fastDateFormat1.equals((java.lang.Object) 100.0f);
        java.lang.String str5 = fastDateFormat1.format(0L);
        java.lang.String str6 = fastDateFormat1.getPattern();
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale11);
        java.util.TimeZone timeZone13 = fastDateFormat12.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale15 = fastDateFormat14.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone13, locale15);
        int int17 = fastDateFormat16.getMaxLengthEstimate();
        java.util.Locale locale18 = fastDateFormat16.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, locale18);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale18);
        boolean boolean21 = fastDateFormat1.equals((java.lang.Object) fastDateFormat20);
        java.lang.String str22 = fastDateFormat20.toString();
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "FastDateFormat[EEEE, MMMM d, yyyy]" + "'", str22, "FastDateFormat[EEEE, MMMM d, yyyy]");
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2);
        java.lang.String str10 = fastDateFormat8.format(0L);
        java.util.Locale locale11 = fastDateFormat8.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale11);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(2, (int) (short) 0, locale11);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, 2, locale11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, (int) '4', locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 52");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "12:00:00 AM" + "'", str10, "12:00:00 AM");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat14);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale3);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale7 = fastDateFormat6.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone5, locale7);
        int int9 = fastDateFormat8.getMaxLengthEstimate();
        java.util.Locale locale10 = fastDateFormat8.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, locale10);
        java.lang.String str12 = fastDateFormat11.getPattern();
        java.lang.String str13 = fastDateFormat11.toString();
        java.lang.String str15 = fastDateFormat11.format((long) '#');
        java.util.TimeZone timeZone16 = fastDateFormat11.getTimeZone();
        java.util.Date date17 = null;
        java.lang.StringBuffer stringBuffer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer19 = fastDateFormat11.format(date17, stringBuffer18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h:mm a" + "'", str12, "h:mm a");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "FastDateFormat[h:mm a]" + "'", str13, "FastDateFormat[h:mm a]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "12:00 AM" + "'", str15, "12:00 AM");
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale3);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale7 = fastDateFormat6.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone5, locale7);
        int int9 = fastDateFormat8.getMaxLengthEstimate();
        java.util.Locale locale10 = fastDateFormat8.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, locale10);
        java.util.TimeZone timeZone12 = fastDateFormat11.getTimeZone();
        java.lang.String str13 = fastDateFormat11.toString();
        java.util.TimeZone timeZone14 = fastDateFormat11.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = fastDateFormat11.parseObject("FastDateFormat[]");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "FastDateFormat[h:mm a]" + "'", str13, "FastDateFormat[h:mm a]");
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        java.util.Locale locale5 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale5);
        java.util.TimeZone timeZone7 = fastDateFormat6.getTimeZone();
        java.util.Locale locale16 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale16);
        java.util.TimeZone timeZone18 = fastDateFormat17.getTimeZone();
        java.util.Locale locale19 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone18, locale19);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale22 = fastDateFormat21.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone18, locale22);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone18);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone18);
        java.util.Locale locale29 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale29);
        java.util.TimeZone timeZone31 = fastDateFormat30.getTimeZone();
        java.util.Locale locale32 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone31, locale32);
        java.util.Locale locale38 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale38);
        java.util.TimeZone timeZone40 = fastDateFormat39.getTimeZone();
        java.util.Locale locale41 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone40, locale41);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale44 = fastDateFormat43.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone40, locale44);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone31, locale44);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone18, locale44);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale49 = fastDateFormat48.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat50 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone18, locale49);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat51 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone7, locale49);
        java.lang.String str52 = fastDateFormat51.toString();
        java.util.Locale locale59 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat60 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale59);
        java.util.TimeZone timeZone61 = fastDateFormat60.getTimeZone();
        java.util.Locale locale62 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat63 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone61, locale62);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat64 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale65 = fastDateFormat64.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat66 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone61, locale65);
        java.util.Locale locale72 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat73 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale72);
        java.util.TimeZone timeZone74 = fastDateFormat73.getTimeZone();
        java.util.Locale locale75 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat76 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone74, locale75);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat77 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale78 = fastDateFormat77.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat79 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone74, locale78);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat80 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2, timeZone74);
        int int81 = fastDateFormat80.getMaxLengthEstimate();
        java.util.Locale locale82 = fastDateFormat80.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat83 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone61, locale82);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat84 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2, locale82);
        boolean boolean85 = fastDateFormat51.equals((java.lang.Object) locale82);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat86 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", locale82);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat87 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale82);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat88 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, locale82);
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(timeZone40);
        org.junit.Assert.assertEquals(timeZone40.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertNotNull(fastDateFormat48);
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat50);
        org.junit.Assert.assertNotNull(fastDateFormat51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "FastDateFormat[h:mm:ss a z]" + "'", str52, "FastDateFormat[h:mm:ss a z]");
        org.junit.Assert.assertNotNull(fastDateFormat60);
        org.junit.Assert.assertNotNull(timeZone61);
        org.junit.Assert.assertEquals(timeZone61.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat63);
        org.junit.Assert.assertNotNull(fastDateFormat64);
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat66);
        org.junit.Assert.assertNotNull(fastDateFormat73);
        org.junit.Assert.assertNotNull(timeZone74);
        org.junit.Assert.assertEquals(timeZone74.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat76);
        org.junit.Assert.assertNotNull(fastDateFormat77);
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat79);
        org.junit.Assert.assertNotNull(fastDateFormat80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 13 + "'", int81 == 13);
        org.junit.Assert.assertNotNull(locale82);
        org.junit.Assert.assertEquals(locale82.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat83);
        org.junit.Assert.assertNotNull(fastDateFormat84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(fastDateFormat86);
        org.junit.Assert.assertNotNull(fastDateFormat87);
        org.junit.Assert.assertNotNull(fastDateFormat88);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        java.util.Locale locale7 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale7);
        java.util.TimeZone timeZone9 = fastDateFormat8.getTimeZone();
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone9, locale10);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale13 = fastDateFormat12.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone9, locale13);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone9);
        java.util.Locale locale16 = fastDateFormat15.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 1, locale16);
        boolean boolean18 = fastDateFormat17.getTimeZoneOverridesCalendar();
        java.lang.StringBuffer stringBuffer20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer21 = fastDateFormat17.format((long) (byte) 1, stringBuffer20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale8);
        java.util.TimeZone timeZone10 = fastDateFormat9.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale12 = fastDateFormat11.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone10, locale12);
        int int14 = fastDateFormat13.getMaxLengthEstimate();
        java.util.Locale locale15 = fastDateFormat13.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, locale15);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale15);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(3, 0, locale15);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, locale15);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale15);
        java.lang.String str21 = fastDateFormat20.getPattern();
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "EEEE, MMMM d, yyyy" + "'", str21, "EEEE, MMMM d, yyyy");
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale3);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        java.util.Locale locale6 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone5, locale6);
        java.util.Locale locale12 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale12);
        java.util.TimeZone timeZone14 = fastDateFormat13.getTimeZone();
        java.util.Locale locale15 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone14, locale15);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale18 = fastDateFormat17.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone14, locale18);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone5, locale18);
        java.lang.Object obj21 = fastDateFormat20.clone();
        java.lang.String str22 = fastDateFormat20.getPattern();
        java.lang.StringBuffer stringBuffer24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer25 = fastDateFormat20.format(0L, stringBuffer24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "FastDateFormat[h:mm:ss a z]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "FastDateFormat[h:mm:ss a z]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "FastDateFormat[h:mm:ss a z]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "h:mm:ss a z" + "'", str22, "h:mm:ss a z");
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 0, 2, locale2);
        java.util.Calendar calendar4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = fastDateFormat3.format(calendar4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat3);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        java.util.Locale locale6 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale6);
        java.util.TimeZone timeZone8 = fastDateFormat7.getTimeZone();
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone8, locale9);
        java.util.Locale locale15 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale15);
        java.util.TimeZone timeZone17 = fastDateFormat16.getTimeZone();
        java.util.Locale locale18 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone17, locale18);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale21 = fastDateFormat20.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone17, locale21);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone8, locale21);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone8);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone8);
        int int26 = fastDateFormat25.getMaxLengthEstimate();
        java.lang.String str27 = fastDateFormat25.getPattern();
        java.util.Locale locale28 = fastDateFormat25.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(31, locale28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 31");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 17 + "'", int26 == 17);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "h:mm:ss a z" + "'", str27, "h:mm:ss a z");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en_US");
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        java.util.Locale locale13 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale13);
        java.util.TimeZone timeZone15 = fastDateFormat14.getTimeZone();
        java.util.Locale locale16 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone15, locale16);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale19 = fastDateFormat18.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone15, locale19);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone15);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone15);
        java.util.Locale locale26 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale26);
        java.util.TimeZone timeZone28 = fastDateFormat27.getTimeZone();
        java.util.Locale locale29 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone28, locale29);
        java.util.Locale locale35 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale35);
        java.util.TimeZone timeZone37 = fastDateFormat36.getTimeZone();
        java.util.Locale locale38 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone37, locale38);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale41 = fastDateFormat40.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone37, locale41);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone28, locale41);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone15, locale41);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale46 = fastDateFormat45.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone15, locale46);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, locale46);
        java.lang.Object obj49 = fastDateFormat48.clone();
        java.util.TimeZone timeZone50 = fastDateFormat48.getTimeZone();
        java.util.Locale locale58 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat59 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale58);
        java.util.TimeZone timeZone60 = fastDateFormat59.getTimeZone();
        java.util.Locale locale61 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat62 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone60, locale61);
        java.util.Locale locale63 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat64 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone60, locale63);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat65 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone60);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat66 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone60);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat67 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone60);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat68 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone60);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat70 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z");
        int int71 = fastDateFormat70.getMaxLengthEstimate();
        boolean boolean72 = fastDateFormat68.equals((java.lang.Object) int71);
        java.util.TimeZone timeZone73 = fastDateFormat68.getTimeZone();
        java.lang.Object obj74 = fastDateFormat68.clone();
        java.util.Locale locale75 = fastDateFormat68.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat76 = org.apache.commons.lang3.time.FastDateFormat.getInstance("MMMM d, yyyy h:mm:ss a z", timeZone50, locale75);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat77 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy h:mm:ss a z", timeZone50);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat78 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 17, timeZone50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 17");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(timeZone37);
        org.junit.Assert.assertEquals(timeZone37.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertNotNull(fastDateFormat48);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertEquals(obj49.toString(), "FastDateFormat[h:mm:ss a z]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj49), "FastDateFormat[h:mm:ss a z]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj49), "FastDateFormat[h:mm:ss a z]");
        org.junit.Assert.assertNotNull(timeZone50);
        org.junit.Assert.assertEquals(timeZone50.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat59);
        org.junit.Assert.assertNotNull(timeZone60);
        org.junit.Assert.assertEquals(timeZone60.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat62);
        org.junit.Assert.assertNotNull(fastDateFormat64);
        org.junit.Assert.assertNotNull(fastDateFormat65);
        org.junit.Assert.assertNotNull(fastDateFormat66);
        org.junit.Assert.assertNotNull(fastDateFormat67);
        org.junit.Assert.assertNotNull(fastDateFormat68);
        org.junit.Assert.assertNotNull(fastDateFormat70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 18 + "'", int71 == 18);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(timeZone73);
        org.junit.Assert.assertEquals(timeZone73.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(obj74);
        org.junit.Assert.assertEquals(obj74.toString(), "FastDateFormat[EEEE, MMMM d, yyyy]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj74), "FastDateFormat[EEEE, MMMM d, yyyy]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj74), "FastDateFormat[EEEE, MMMM d, yyyy]");
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat76);
        org.junit.Assert.assertNotNull(fastDateFormat77);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale3);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        java.util.Locale locale6 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone5, locale6);
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", timeZone5, locale8);
        java.util.TimeZone timeZone10 = fastDateFormat9.getTimeZone();
        java.lang.Object obj11 = fastDateFormat9.clone();
        java.lang.String str12 = fastDateFormat9.getPattern();
        java.util.Date date13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = fastDateFormat9.format(date13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "FastDateFormat[h:mm:ss a z]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "FastDateFormat[h:mm:ss a z]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "FastDateFormat[h:mm:ss a z]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h:mm:ss a z" + "'", str12, "h:mm:ss a z");
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale4);
        java.util.TimeZone timeZone6 = fastDateFormat5.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale8 = fastDateFormat7.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone6, locale8);
        int int10 = fastDateFormat9.getMaxLengthEstimate();
        java.util.Locale locale11 = fastDateFormat9.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, locale11);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale11);
        boolean boolean14 = fastDateFormat13.getTimeZoneOverridesCalendar();
        java.lang.String str16 = fastDateFormat13.format((long) 49);
        java.util.Calendar calendar17 = null;
        java.lang.StringBuffer stringBuffer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer19 = fastDateFormat13.format(calendar17, stringBuffer18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Thursday, January 1, 1970" + "'", str16, "Thursday, January 1, 1970");
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        java.util.Locale locale5 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale5);
        java.util.TimeZone timeZone7 = fastDateFormat6.getTimeZone();
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone7, locale8);
        java.util.Locale locale14 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale14);
        java.util.TimeZone timeZone16 = fastDateFormat15.getTimeZone();
        java.util.Locale locale17 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone16, locale17);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale20 = fastDateFormat19.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone16, locale20);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone7, locale20);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone7);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone7);
        java.util.Locale locale25 = fastDateFormat24.getLocale();
        java.util.Calendar calendar26 = null;
        java.lang.StringBuffer stringBuffer27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer28 = fastDateFormat24.format(calendar26, stringBuffer27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_US");
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale3);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        java.util.Locale locale6 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone5, locale6);
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone5, locale8);
        java.lang.String str10 = fastDateFormat9.toString();
        java.util.Date date11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = fastDateFormat9.format(date11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "FastDateFormat[]" + "'", str10, "FastDateFormat[]");
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale10);
        java.util.TimeZone timeZone12 = fastDateFormat11.getTimeZone();
        java.util.Locale locale13 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone12, locale13);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale16 = fastDateFormat15.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone12, locale16);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone12);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone12);
        java.util.Locale locale22 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale22);
        java.util.TimeZone timeZone24 = fastDateFormat23.getTimeZone();
        java.util.Locale locale33 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale33);
        java.util.TimeZone timeZone35 = fastDateFormat34.getTimeZone();
        java.util.Locale locale36 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone35, locale36);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale39 = fastDateFormat38.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone35, locale39);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone35);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone35);
        java.util.Locale locale46 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale46);
        java.util.TimeZone timeZone48 = fastDateFormat47.getTimeZone();
        java.util.Locale locale49 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat50 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone48, locale49);
        java.util.Locale locale55 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat56 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale55);
        java.util.TimeZone timeZone57 = fastDateFormat56.getTimeZone();
        java.util.Locale locale58 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat59 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone57, locale58);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat60 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale61 = fastDateFormat60.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat62 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone57, locale61);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat63 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone48, locale61);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat64 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone35, locale61);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat65 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale66 = fastDateFormat65.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat67 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone35, locale66);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat68 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone24, locale66);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat69 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0, timeZone12, locale66);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat70 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale71 = fastDateFormat70.getLocale();
        boolean boolean72 = fastDateFormat70.getTimeZoneOverridesCalendar();
        java.util.Locale locale73 = fastDateFormat70.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat74 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone12, locale73);
        java.util.Locale locale75 = fastDateFormat74.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat76 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale75);
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(timeZone35);
        org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertNotNull(timeZone48);
        org.junit.Assert.assertEquals(timeZone48.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat50);
        org.junit.Assert.assertNotNull(fastDateFormat56);
        org.junit.Assert.assertNotNull(timeZone57);
        org.junit.Assert.assertEquals(timeZone57.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat59);
        org.junit.Assert.assertNotNull(fastDateFormat60);
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat62);
        org.junit.Assert.assertNotNull(fastDateFormat63);
        org.junit.Assert.assertNotNull(fastDateFormat64);
        org.junit.Assert.assertNotNull(fastDateFormat65);
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat67);
        org.junit.Assert.assertNotNull(fastDateFormat68);
        org.junit.Assert.assertNotNull(fastDateFormat69);
        org.junit.Assert.assertNotNull(fastDateFormat70);
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat74);
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat76);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        java.util.Locale locale7 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale7);
        java.util.TimeZone timeZone9 = fastDateFormat8.getTimeZone();
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone9, locale10);
        java.util.Locale locale12 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone9, locale12);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone9);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", timeZone9);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        boolean boolean17 = fastDateFormat16.getTimeZoneOverridesCalendar();
        java.util.Locale locale18 = fastDateFormat16.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone9, locale18);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone9);
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(fastDateFormat20);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale9);
        java.util.TimeZone timeZone11 = fastDateFormat10.getTimeZone();
        java.util.Locale locale12 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone11, locale12);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 2, timeZone11);
        java.util.Locale locale18 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale18);
        java.util.TimeZone timeZone20 = fastDateFormat19.getTimeZone();
        java.util.Locale locale21 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone20, locale21);
        java.util.Locale locale27 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale27);
        java.util.TimeZone timeZone29 = fastDateFormat28.getTimeZone();
        java.util.Locale locale30 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone29, locale30);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale33 = fastDateFormat32.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone29, locale33);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone20, locale33);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(3, 3, timeZone11, locale33);
        java.util.Locale locale45 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale45);
        java.util.TimeZone timeZone47 = fastDateFormat46.getTimeZone();
        java.util.Locale locale48 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone47, locale48);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat50 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale51 = fastDateFormat50.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat52 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone47, locale51);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat53 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone47);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat54 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone47);
        java.util.Locale locale58 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat59 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale58);
        java.util.TimeZone timeZone60 = fastDateFormat59.getTimeZone();
        java.util.Locale locale61 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat62 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone60, locale61);
        java.util.Locale locale67 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat68 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale67);
        java.util.TimeZone timeZone69 = fastDateFormat68.getTimeZone();
        java.util.Locale locale70 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat71 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone69, locale70);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat72 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale73 = fastDateFormat72.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat74 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone69, locale73);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat75 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone60, locale73);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat76 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone47, locale73);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat77 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, timeZone47);
        java.util.Locale locale78 = fastDateFormat77.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat79 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy", timeZone11, locale78);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat80 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, 0, locale78);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat82 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy");
        java.util.Locale locale83 = fastDateFormat82.getLocale();
        java.lang.String str84 = fastDateFormat82.toString();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat86 = org.apache.commons.lang3.time.FastDateFormat.getInstance("12/31/69");
        boolean boolean87 = fastDateFormat82.equals((java.lang.Object) "12/31/69");
        java.lang.StringBuffer stringBuffer88 = null;
        java.text.FieldPosition fieldPosition89 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer90 = fastDateFormat80.format((java.lang.Object) fastDateFormat82, stringBuffer88, fieldPosition89);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: org.apache.commons.lang3.time.FastDateFormat");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNotNull(timeZone47);
        org.junit.Assert.assertEquals(timeZone47.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat49);
        org.junit.Assert.assertNotNull(fastDateFormat50);
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat52);
        org.junit.Assert.assertNotNull(fastDateFormat53);
        org.junit.Assert.assertNotNull(fastDateFormat54);
        org.junit.Assert.assertNotNull(fastDateFormat59);
        org.junit.Assert.assertNotNull(timeZone60);
        org.junit.Assert.assertEquals(timeZone60.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat62);
        org.junit.Assert.assertNotNull(fastDateFormat68);
        org.junit.Assert.assertNotNull(timeZone69);
        org.junit.Assert.assertEquals(timeZone69.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat71);
        org.junit.Assert.assertNotNull(fastDateFormat72);
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat74);
        org.junit.Assert.assertNotNull(fastDateFormat75);
        org.junit.Assert.assertNotNull(fastDateFormat76);
        org.junit.Assert.assertNotNull(fastDateFormat77);
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat79);
        org.junit.Assert.assertNotNull(fastDateFormat80);
        org.junit.Assert.assertNotNull(fastDateFormat82);
        org.junit.Assert.assertNotNull(locale83);
        org.junit.Assert.assertEquals(locale83.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "FastDateFormat[EEEE, MMMM d, yyyy]" + "'", str84, "FastDateFormat[EEEE, MMMM d, yyyy]");
        org.junit.Assert.assertNotNull(fastDateFormat86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale8);
        java.util.TimeZone timeZone10 = fastDateFormat9.getTimeZone();
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone10, locale11);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale14 = fastDateFormat13.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone10, locale14);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone10);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone10);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale19 = fastDateFormat18.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", timeZone10, locale19);
        int int21 = fastDateFormat20.getMaxLengthEstimate();
        java.lang.String str23 = fastDateFormat20.format((long) (byte) 0);
        java.util.Locale locale28 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale28);
        java.util.TimeZone timeZone30 = fastDateFormat29.getTimeZone();
        java.util.Locale locale31 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone30, locale31);
        java.util.Locale locale33 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone30, locale33);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone30);
        boolean boolean36 = fastDateFormat20.equals((java.lang.Object) timeZone30);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone42 = fastDateFormat41.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone42);
        java.util.Locale locale46 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale46);
        java.util.TimeZone timeZone48 = fastDateFormat47.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale50 = fastDateFormat49.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat51 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone48, locale50);
        int int52 = fastDateFormat51.getMaxLengthEstimate();
        boolean boolean53 = fastDateFormat51.getTimeZoneOverridesCalendar();
        java.util.Locale locale62 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat63 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale62);
        java.util.TimeZone timeZone64 = fastDateFormat63.getTimeZone();
        java.util.Locale locale65 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat66 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone64, locale65);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat67 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale68 = fastDateFormat67.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat69 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone64, locale68);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat70 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone64);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat71 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone64);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat72 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale73 = fastDateFormat72.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat74 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", timeZone64, locale73);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat75 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", locale73);
        boolean boolean76 = fastDateFormat51.equals((java.lang.Object) locale73);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat77 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, timeZone42, locale73);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat78 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale73);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat79 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((-1), timeZone30, locale73);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 17 + "'", int21 == 17);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "12:00:00 AM UTC" + "'", str23, "12:00:00 AM UTC");
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertNotNull(timeZone42);
        org.junit.Assert.assertEquals(timeZone42.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertNotNull(timeZone48);
        org.junit.Assert.assertEquals(timeZone48.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat49);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(fastDateFormat63);
        org.junit.Assert.assertNotNull(timeZone64);
        org.junit.Assert.assertEquals(timeZone64.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat66);
        org.junit.Assert.assertNotNull(fastDateFormat67);
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat69);
        org.junit.Assert.assertNotNull(fastDateFormat70);
        org.junit.Assert.assertNotNull(fastDateFormat71);
        org.junit.Assert.assertNotNull(fastDateFormat72);
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat74);
        org.junit.Assert.assertNotNull(fastDateFormat75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(fastDateFormat77);
        org.junit.Assert.assertNotNull(fastDateFormat78);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale3 = fastDateFormat2.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, locale3);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 1, locale3);
        java.util.TimeZone timeZone6 = fastDateFormat5.getTimeZone();
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar5 = null;
        java.lang.StringBuffer stringBuffer6 = null;
        java.lang.StringBuffer stringBuffer7 = fastDateFormat4.format(calendar5, stringBuffer6);
        java.util.Calendar calendar8 = null;
        java.lang.StringBuffer stringBuffer9 = null;
        java.lang.StringBuffer stringBuffer10 = fastDateFormat4.format(calendar8, stringBuffer9);
        java.util.Calendar calendar11 = null;
        java.lang.StringBuffer stringBuffer12 = null;
        java.lang.StringBuffer stringBuffer13 = fastDateFormat4.format(calendar11, stringBuffer12);
        int int14 = fastDateFormat4.getMaxLengthEstimate();
        java.lang.String str15 = fastDateFormat4.toString();
        boolean boolean16 = fastDateFormat2.equals((java.lang.Object) fastDateFormat4);
        int int17 = fastDateFormat2.getMaxLengthEstimate();
        java.util.Locale locale18 = fastDateFormat2.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, locale18);
        java.lang.String str21 = fastDateFormat19.format((long) (-1));
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNull(stringBuffer7);
        org.junit.Assert.assertNull(stringBuffer10);
        org.junit.Assert.assertNull(stringBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "FastDateFormat[]" + "'", str15, "FastDateFormat[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 18 + "'", int17 == 18);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "11:59:59 PM UTC" + "'", str21, "11:59:59 PM UTC");
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar2 = null;
        java.lang.String str3 = fastDateFormat1.format(calendar2);
        java.lang.StringBuffer stringBuffer5 = null;
        java.lang.StringBuffer stringBuffer6 = fastDateFormat1.format((long) 'a', stringBuffer5);
        boolean boolean7 = fastDateFormat1.getTimeZoneOverridesCalendar();
        java.lang.String str8 = fastDateFormat1.toString();
        java.lang.Object obj9 = fastDateFormat1.clone();
        java.util.Locale locale10 = fastDateFormat1.getLocale();
        boolean boolean11 = fastDateFormat1.getTimeZoneOverridesCalendar();
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(stringBuffer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "FastDateFormat[]" + "'", str8, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "FastDateFormat[]");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar2 = null;
        java.lang.String str3 = fastDateFormat1.format(calendar2);
        java.lang.Object obj4 = fastDateFormat1.clone();
        int int5 = fastDateFormat1.getMaxLengthEstimate();
        java.lang.Object obj6 = fastDateFormat1.clone();
        java.util.Calendar calendar7 = null;
        java.lang.String str8 = fastDateFormat1.format(calendar7);
        boolean boolean9 = fastDateFormat1.getTimeZoneOverridesCalendar();
        java.util.Locale locale16 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale16);
        java.util.TimeZone timeZone18 = fastDateFormat17.getTimeZone();
        java.util.Locale locale19 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone18, locale19);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale22 = fastDateFormat21.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone18, locale22);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone18);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, timeZone18);
        boolean boolean27 = fastDateFormat25.equals((java.lang.Object) 100);
        java.util.Locale locale31 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale31);
        java.util.TimeZone timeZone33 = fastDateFormat32.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale35 = fastDateFormat34.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone33, locale35);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone33);
        java.lang.String str38 = fastDateFormat37.getPattern();
        boolean boolean39 = fastDateFormat25.equals((java.lang.Object) fastDateFormat37);
        java.lang.Object obj40 = fastDateFormat37.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator41 = fastDateFormat1.formatToCharacterIterator((java.lang.Object) fastDateFormat37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: org.apache.commons.lang3.time.FastDateFormat");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "FastDateFormat[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "FastDateFormat[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "h:mm a" + "'", str38, "h:mm a");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertEquals(obj40.toString(), "FastDateFormat[h:mm a]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj40), "FastDateFormat[h:mm a]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj40), "FastDateFormat[h:mm a]");
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        java.util.Locale locale6 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale6);
        java.util.TimeZone timeZone8 = fastDateFormat7.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale10 = fastDateFormat9.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone8, locale10);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone8);
        java.util.Locale locale18 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale18);
        java.util.TimeZone timeZone20 = fastDateFormat19.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale22 = fastDateFormat21.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone20, locale22);
        int int24 = fastDateFormat23.getMaxLengthEstimate();
        java.util.Locale locale25 = fastDateFormat23.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, locale25);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale25);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, locale25);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy", timeZone8, locale25);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) ' ', 20, locale25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 20");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(fastDateFormat29);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy");
        java.lang.String str2 = fastDateFormat1.toString();
        java.util.Locale locale3 = fastDateFormat1.getLocale();
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FastDateFormat[EEEE, MMMM d, yyyy]" + "'", str2, "FastDateFormat[EEEE, MMMM d, yyyy]");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        java.util.Locale locale13 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale13);
        java.util.TimeZone timeZone15 = fastDateFormat14.getTimeZone();
        java.util.Locale locale16 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone15, locale16);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale19 = fastDateFormat18.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone15, locale19);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone15);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone15);
        java.util.Locale locale26 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale26);
        java.util.TimeZone timeZone28 = fastDateFormat27.getTimeZone();
        java.util.Locale locale29 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone28, locale29);
        java.util.Locale locale35 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale35);
        java.util.TimeZone timeZone37 = fastDateFormat36.getTimeZone();
        java.util.Locale locale38 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone37, locale38);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale41 = fastDateFormat40.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone37, locale41);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone28, locale41);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone15, locale41);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale46 = fastDateFormat45.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone15, locale46);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(3, (int) (byte) 0, timeZone15);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat50 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3);
        boolean boolean51 = fastDateFormat50.getTimeZoneOverridesCalendar();
        java.util.Locale locale52 = fastDateFormat50.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat53 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone15, locale52);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat54 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 1, (int) '4', timeZone15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 52");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(timeZone37);
        org.junit.Assert.assertEquals(timeZone37.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertNotNull(fastDateFormat48);
        org.junit.Assert.assertNotNull(fastDateFormat50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat53);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale3);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale7 = fastDateFormat6.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone5, locale7);
        int int9 = fastDateFormat8.getMaxLengthEstimate();
        java.util.Locale locale10 = fastDateFormat8.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, locale10);
        java.util.TimeZone timeZone12 = fastDateFormat11.getTimeZone();
        java.lang.String str14 = fastDateFormat11.format((long) '#');
        java.util.TimeZone timeZone15 = fastDateFormat11.getTimeZone();
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "12:00 AM" + "'", str14, "12:00 AM");
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z");
        int int3 = fastDateFormat2.getMaxLengthEstimate();
        java.util.TimeZone timeZone4 = fastDateFormat2.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getInstance("January 1, 1970 12:00:00 AM UTC", timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: J");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 18 + "'", int3 == 18);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale2);
        java.util.TimeZone timeZone4 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale6 = fastDateFormat5.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone4, locale6);
        java.util.Locale locale8 = fastDateFormat7.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (short) 1);
        java.util.Locale locale12 = fastDateFormat11.getLocale();
        boolean boolean13 = fastDateFormat7.equals((java.lang.Object) locale12);
        java.lang.String str14 = fastDateFormat7.getPattern();
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0);
        java.lang.String str2 = fastDateFormat1.toString();
        java.util.TimeZone timeZone3 = fastDateFormat1.getTimeZone();
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = fastDateFormat1.parseObject("FastDateFormat[M/d/yy h:mm a]", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FastDateFormat[EEEE, MMMM d, yyyy]" + "'", str2, "FastDateFormat[EEEE, MMMM d, yyyy]");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        java.util.Locale locale6 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale6);
        java.util.TimeZone timeZone8 = fastDateFormat7.getTimeZone();
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone8, locale9);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale12 = fastDateFormat11.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone8, locale12);
        java.util.Locale locale19 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale19);
        java.util.TimeZone timeZone21 = fastDateFormat20.getTimeZone();
        java.util.Locale locale22 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone21, locale22);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale25 = fastDateFormat24.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone21, locale25);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2, timeZone21);
        int int28 = fastDateFormat27.getMaxLengthEstimate();
        java.util.Locale locale29 = fastDateFormat27.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone8, locale29);
        java.util.Locale locale31 = fastDateFormat30.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 1, locale31);
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 13 + "'", int28 == 13);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat32);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        java.util.Locale locale5 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale5);
        java.util.TimeZone timeZone7 = fastDateFormat6.getTimeZone();
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone7, locale8);
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone7, locale10);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone7);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", timeZone7);
        java.lang.String str14 = fastDateFormat13.getPattern();
        java.lang.String str15 = fastDateFormat13.getPattern();
        java.util.Locale locale21 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale21);
        java.util.TimeZone timeZone23 = fastDateFormat22.getTimeZone();
        java.util.Locale locale24 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone23, locale24);
        java.util.Locale locale30 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale30);
        java.util.TimeZone timeZone32 = fastDateFormat31.getTimeZone();
        java.util.Locale locale33 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone32, locale33);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale36 = fastDateFormat35.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone32, locale36);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone23, locale36);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone23);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone23);
        int int41 = fastDateFormat40.getMaxLengthEstimate();
        boolean boolean42 = fastDateFormat40.getTimeZoneOverridesCalendar();
        java.lang.StringBuffer stringBuffer43 = null;
        java.text.FieldPosition fieldPosition44 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer45 = fastDateFormat13.format((java.lang.Object) fastDateFormat40, stringBuffer43, fieldPosition44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: org.apache.commons.lang3.time.FastDateFormat");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h:mm:ss a z" + "'", str14, "h:mm:ss a z");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h:mm:ss a z" + "'", str15, "h:mm:ss a z");
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(timeZone32);
        org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 17 + "'", int41 == 17);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale4);
        java.util.TimeZone timeZone6 = fastDateFormat5.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale8 = fastDateFormat7.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone6, locale8);
        int int10 = fastDateFormat9.getMaxLengthEstimate();
        java.util.Locale locale11 = fastDateFormat9.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, locale11);
        java.util.TimeZone timeZone13 = fastDateFormat12.getTimeZone();
        java.util.TimeZone timeZone15 = null;
        java.util.Locale locale16 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone15, locale16);
        java.util.Calendar calendar18 = null;
        java.lang.StringBuffer stringBuffer19 = null;
        java.lang.StringBuffer stringBuffer20 = fastDateFormat17.format(calendar18, stringBuffer19);
        java.lang.StringBuffer stringBuffer22 = null;
        java.lang.StringBuffer stringBuffer23 = fastDateFormat17.format(10L, stringBuffer22);
        java.util.Locale locale24 = fastDateFormat17.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 1, timeZone13, locale24);
        java.lang.String str26 = fastDateFormat25.getPattern();
        java.lang.Class<?> wildcardClass27 = fastDateFormat25.getClass();
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNull(stringBuffer20);
        org.junit.Assert.assertNull(stringBuffer23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "MMMM d, yyyy" + "'", str26, "MMMM d, yyyy");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        java.util.Locale locale5 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale5);
        java.util.TimeZone timeZone7 = fastDateFormat6.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale9 = fastDateFormat8.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone7, locale9);
        java.util.TimeZone timeZone11 = fastDateFormat10.getTimeZone();
        java.util.Locale locale12 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone11, locale12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(3, 10, timeZone11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat13);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale3);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        java.util.Locale locale14 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale14);
        java.util.TimeZone timeZone16 = fastDateFormat15.getTimeZone();
        java.util.Locale locale17 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone16, locale17);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale20 = fastDateFormat19.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone16, locale20);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone16);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone16);
        java.util.Locale locale27 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale27);
        java.util.TimeZone timeZone29 = fastDateFormat28.getTimeZone();
        java.util.Locale locale30 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone29, locale30);
        java.util.Locale locale36 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale36);
        java.util.TimeZone timeZone38 = fastDateFormat37.getTimeZone();
        java.util.Locale locale39 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone38, locale39);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale42 = fastDateFormat41.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone38, locale42);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone29, locale42);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone16, locale42);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale47 = fastDateFormat46.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone16, locale47);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone5, locale47);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat50 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(1, locale47);
        java.lang.String str52 = fastDateFormat50.format((long) 2);
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(timeZone38);
        org.junit.Assert.assertEquals(timeZone38.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat48);
        org.junit.Assert.assertNotNull(fastDateFormat49);
        org.junit.Assert.assertNotNull(fastDateFormat50);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "January 1, 1970" + "'", str52, "January 1, 1970");
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("");
        boolean boolean5 = fastDateFormat3.equals((java.lang.Object) 100.0f);
        boolean boolean6 = fastDateFormat3.getTimeZoneOverridesCalendar();
        java.lang.String str8 = fastDateFormat3.format((long) (byte) 100);
        java.util.TimeZone timeZone9 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm a", timeZone9);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2);
        java.lang.String str15 = fastDateFormat13.format(0L);
        java.util.Locale locale16 = fastDateFormat13.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale16);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone9, locale16);
        java.util.Date date19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = fastDateFormat18.format(date19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "12:00:00 AM" + "'", str15, "12:00:00 AM");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat18);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        java.util.Locale locale6 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale6);
        java.util.TimeZone timeZone8 = fastDateFormat7.getTimeZone();
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone8, locale9);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale12 = fastDateFormat11.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone8, locale12);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone8);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, timeZone8);
        boolean boolean17 = fastDateFormat15.equals((java.lang.Object) 100);
        java.util.Locale locale21 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale21);
        java.util.TimeZone timeZone23 = fastDateFormat22.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale25 = fastDateFormat24.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone23, locale25);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone23);
        java.lang.String str28 = fastDateFormat27.getPattern();
        boolean boolean29 = fastDateFormat15.equals((java.lang.Object) fastDateFormat27);
        boolean boolean30 = fastDateFormat15.getTimeZoneOverridesCalendar();
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "h:mm a" + "'", str28, "h:mm a");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale9);
        java.util.TimeZone timeZone11 = fastDateFormat10.getTimeZone();
        java.util.Locale locale12 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone11, locale12);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale15 = fastDateFormat14.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone11, locale15);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone11);
        java.util.Locale locale20 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale20);
        java.util.TimeZone timeZone22 = fastDateFormat21.getTimeZone();
        java.util.Locale locale31 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale31);
        java.util.TimeZone timeZone33 = fastDateFormat32.getTimeZone();
        java.util.Locale locale34 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone33, locale34);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale37 = fastDateFormat36.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone33, locale37);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone33);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone33);
        java.util.Locale locale44 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale44);
        java.util.TimeZone timeZone46 = fastDateFormat45.getTimeZone();
        java.util.Locale locale47 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone46, locale47);
        java.util.Locale locale53 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat54 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale53);
        java.util.TimeZone timeZone55 = fastDateFormat54.getTimeZone();
        java.util.Locale locale56 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat57 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone55, locale56);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat58 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale59 = fastDateFormat58.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat60 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone55, locale59);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat61 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone46, locale59);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat62 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone33, locale59);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat63 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale64 = fastDateFormat63.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat65 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone33, locale64);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat66 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone22, locale64);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat67 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone11, locale64);
        java.util.Locale locale68 = fastDateFormat67.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat69 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale68);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat70 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(100, 3, locale68);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNotNull(timeZone46);
        org.junit.Assert.assertEquals(timeZone46.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat48);
        org.junit.Assert.assertNotNull(fastDateFormat54);
        org.junit.Assert.assertNotNull(timeZone55);
        org.junit.Assert.assertEquals(timeZone55.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat57);
        org.junit.Assert.assertNotNull(fastDateFormat58);
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat60);
        org.junit.Assert.assertNotNull(fastDateFormat61);
        org.junit.Assert.assertNotNull(fastDateFormat62);
        org.junit.Assert.assertNotNull(fastDateFormat63);
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat65);
        org.junit.Assert.assertNotNull(fastDateFormat66);
        org.junit.Assert.assertNotNull(fastDateFormat67);
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat69);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1);
        boolean boolean4 = fastDateFormat2.equals((java.lang.Object) "FastDateFormat[]");
        boolean boolean5 = fastDateFormat2.getTimeZoneOverridesCalendar();
        java.lang.String str7 = fastDateFormat2.format((java.lang.Object) 1L);
        java.lang.String str8 = fastDateFormat2.toString();
        java.text.ParsePosition parsePosition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = fastDateFormat2.parseObject("11:59:59 PM UTC", parsePosition10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "12:00:00 AM UTC" + "'", str7, "12:00:00 AM UTC");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "FastDateFormat[h:mm:ss a z]" + "'", str8, "FastDateFormat[h:mm:ss a z]");
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar4 = null;
        java.lang.String str5 = fastDateFormat3.format(calendar4);
        java.lang.StringBuffer stringBuffer7 = null;
        java.lang.StringBuffer stringBuffer8 = fastDateFormat3.format((long) 'a', stringBuffer7);
        boolean boolean9 = fastDateFormat3.getTimeZoneOverridesCalendar();
        java.lang.String str10 = fastDateFormat3.toString();
        java.util.TimeZone timeZone11 = fastDateFormat3.getTimeZone();
        java.util.Locale locale18 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale18);
        java.util.TimeZone timeZone20 = fastDateFormat19.getTimeZone();
        java.util.Locale locale21 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone20, locale21);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale24 = fastDateFormat23.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone20, locale24);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2, timeZone20);
        java.util.Locale locale32 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale32);
        java.util.TimeZone timeZone34 = fastDateFormat33.getTimeZone();
        java.util.Locale locale35 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone34, locale35);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale38 = fastDateFormat37.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone34, locale38);
        java.util.Locale locale45 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale45);
        java.util.TimeZone timeZone47 = fastDateFormat46.getTimeZone();
        java.util.Locale locale48 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone47, locale48);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat50 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale51 = fastDateFormat50.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat52 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone47, locale51);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat53 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2, timeZone47);
        int int54 = fastDateFormat53.getMaxLengthEstimate();
        java.util.Locale locale55 = fastDateFormat53.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat56 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone34, locale55);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat57 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone20, locale55);
        java.util.Locale locale58 = fastDateFormat57.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat59 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone11, locale58);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat60 = org.apache.commons.lang3.time.FastDateFormat.getInstance("1/1/70", timeZone11);
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(stringBuffer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "FastDateFormat[]" + "'", str10, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(timeZone34);
        org.junit.Assert.assertEquals(timeZone34.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNotNull(timeZone47);
        org.junit.Assert.assertEquals(timeZone47.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat49);
        org.junit.Assert.assertNotNull(fastDateFormat50);
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat52);
        org.junit.Assert.assertNotNull(fastDateFormat53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 13 + "'", int54 == 13);
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat56);
        org.junit.Assert.assertNotNull(fastDateFormat57);
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat59);
        org.junit.Assert.assertNotNull(fastDateFormat60);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale4);
        java.util.TimeZone timeZone6 = fastDateFormat5.getTimeZone();
        java.util.Locale locale15 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale15);
        java.util.TimeZone timeZone17 = fastDateFormat16.getTimeZone();
        java.util.Locale locale18 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone17, locale18);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale21 = fastDateFormat20.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone17, locale21);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone17);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone17);
        java.util.Locale locale28 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale28);
        java.util.TimeZone timeZone30 = fastDateFormat29.getTimeZone();
        java.util.Locale locale31 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone30, locale31);
        java.util.Locale locale37 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale37);
        java.util.TimeZone timeZone39 = fastDateFormat38.getTimeZone();
        java.util.Locale locale40 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone39, locale40);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale43 = fastDateFormat42.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone39, locale43);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone30, locale43);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone17, locale43);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale48 = fastDateFormat47.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone17, locale48);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat50 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone6, locale48);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat51 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", locale48);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat52 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((-1), locale48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(timeZone39);
        org.junit.Assert.assertEquals(timeZone39.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat49);
        org.junit.Assert.assertNotNull(fastDateFormat50);
        org.junit.Assert.assertNotNull(fastDateFormat51);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("");
        boolean boolean3 = fastDateFormat1.equals((java.lang.Object) 100.0f);
        boolean boolean4 = fastDateFormat1.getTimeZoneOverridesCalendar();
        java.util.TimeZone timeZone5 = fastDateFormat1.getTimeZone();
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale8);
        java.util.TimeZone timeZone10 = fastDateFormat9.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale12 = fastDateFormat11.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone10, locale12);
        boolean boolean14 = fastDateFormat13.getTimeZoneOverridesCalendar();
        java.lang.String str16 = fastDateFormat13.format((long) '#');
        java.util.Locale locale17 = fastDateFormat13.getLocale();
        java.lang.String str18 = fastDateFormat13.getPattern();
        boolean boolean19 = fastDateFormat1.equals((java.lang.Object) str18);
        java.lang.String str20 = fastDateFormat1.getPattern();
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        java.util.Locale locale7 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale7);
        java.util.TimeZone timeZone9 = fastDateFormat8.getTimeZone();
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone9, locale10);
        java.util.Locale locale12 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone9, locale12);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone9);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", timeZone9);
        java.util.Locale locale21 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale21);
        java.util.TimeZone timeZone23 = fastDateFormat22.getTimeZone();
        java.util.Locale locale24 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone23, locale24);
        java.util.Locale locale26 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone23, locale26);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone23);
        java.util.Locale locale32 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale32);
        java.util.TimeZone timeZone34 = fastDateFormat33.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale36 = fastDateFormat35.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone34, locale36);
        int int38 = fastDateFormat37.getMaxLengthEstimate();
        java.util.Locale locale39 = fastDateFormat37.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, locale39);
        java.util.Locale locale41 = fastDateFormat40.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone23, locale41);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone9, locale41);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy h:mm a", timeZone9);
        java.lang.String str45 = fastDateFormat44.getPattern();
        java.lang.StringBuffer stringBuffer47 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer48 = fastDateFormat44.format((long) (-1), stringBuffer47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(timeZone34);
        org.junit.Assert.assertEquals(timeZone34.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "EEEE, MMMM d, yyyy h:mm a" + "'", str45, "EEEE, MMMM d, yyyy h:mm a");
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        java.util.TimeZone timeZone1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("FastDateFormat[EEEE, MMMM d, yyyy h:mm:ss a z]", timeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        java.util.Locale locale6 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale6);
        java.util.TimeZone timeZone8 = fastDateFormat7.getTimeZone();
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone8, locale9);
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone8, locale11);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone8);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone8);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone8);
        java.util.Calendar calendar16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = fastDateFormat15.format(calendar16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat15);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale3);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        java.util.Locale locale6 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone5, locale6);
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", timeZone5, locale8);
        java.util.TimeZone timeZone10 = fastDateFormat9.getTimeZone();
        java.text.ParsePosition parsePosition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = fastDateFormat9.parseObject("FastDateFormat[MMMM d, yyyy h:mm a]", parsePosition12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale8);
        java.util.TimeZone timeZone10 = fastDateFormat9.getTimeZone();
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone10, locale11);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale14 = fastDateFormat13.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone10, locale14);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone10);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone10);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale19 = fastDateFormat18.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", timeZone10, locale19);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", locale19);
        java.lang.Object obj22 = fastDateFormat21.clone();
        java.lang.String str23 = fastDateFormat21.toString();
        java.lang.String str25 = fastDateFormat21.format((long) 100);
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "FastDateFormat[]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "FastDateFormat[]" + "'", str23, "FastDateFormat[]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        boolean boolean3 = fastDateFormat2.getTimeZoneOverridesCalendar();
        java.util.Locale locale4 = fastDateFormat2.getLocale();
        java.util.TimeZone timeZone5 = fastDateFormat2.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(17, 3, timeZone5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 17");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale10);
        java.util.TimeZone timeZone12 = fastDateFormat11.getTimeZone();
        java.util.Locale locale13 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone12, locale13);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale16 = fastDateFormat15.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone12, locale16);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone12);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone12);
        java.util.Locale locale23 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale23);
        java.util.TimeZone timeZone25 = fastDateFormat24.getTimeZone();
        java.util.Locale locale26 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone25, locale26);
        java.util.Locale locale32 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale32);
        java.util.TimeZone timeZone34 = fastDateFormat33.getTimeZone();
        java.util.Locale locale35 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone34, locale35);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale38 = fastDateFormat37.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone34, locale38);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone25, locale38);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone12, locale38);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale43 = fastDateFormat42.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone12, locale43);
        java.util.Locale locale56 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat57 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale56);
        java.util.TimeZone timeZone58 = fastDateFormat57.getTimeZone();
        java.util.Locale locale59 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat60 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone58, locale59);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat61 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale62 = fastDateFormat61.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat63 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone58, locale62);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat64 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone58);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat65 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone58);
        java.util.Locale locale69 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat70 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale69);
        java.util.TimeZone timeZone71 = fastDateFormat70.getTimeZone();
        java.util.Locale locale72 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat73 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone71, locale72);
        java.util.Locale locale78 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat79 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale78);
        java.util.TimeZone timeZone80 = fastDateFormat79.getTimeZone();
        java.util.Locale locale81 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat82 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone80, locale81);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat83 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale84 = fastDateFormat83.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat85 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone80, locale84);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat86 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone71, locale84);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat87 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone58, locale84);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat88 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale89 = fastDateFormat88.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat90 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone58, locale89);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat91 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, locale89);
        java.util.Locale locale92 = fastDateFormat91.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat93 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, (int) (byte) 0, locale92);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat94 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy h:mm a", timeZone12, locale92);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat95 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", locale92);
        java.lang.String str96 = fastDateFormat95.getPattern();
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(timeZone34);
        org.junit.Assert.assertEquals(timeZone34.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(fastDateFormat57);
        org.junit.Assert.assertNotNull(timeZone58);
        org.junit.Assert.assertEquals(timeZone58.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat60);
        org.junit.Assert.assertNotNull(fastDateFormat61);
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat63);
        org.junit.Assert.assertNotNull(fastDateFormat64);
        org.junit.Assert.assertNotNull(fastDateFormat65);
        org.junit.Assert.assertNotNull(fastDateFormat70);
        org.junit.Assert.assertNotNull(timeZone71);
        org.junit.Assert.assertEquals(timeZone71.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat73);
        org.junit.Assert.assertNotNull(fastDateFormat79);
        org.junit.Assert.assertNotNull(timeZone80);
        org.junit.Assert.assertEquals(timeZone80.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat82);
        org.junit.Assert.assertNotNull(fastDateFormat83);
        org.junit.Assert.assertNotNull(locale84);
        org.junit.Assert.assertEquals(locale84.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat85);
        org.junit.Assert.assertNotNull(fastDateFormat86);
        org.junit.Assert.assertNotNull(fastDateFormat87);
        org.junit.Assert.assertNotNull(fastDateFormat88);
        org.junit.Assert.assertNotNull(locale89);
        org.junit.Assert.assertEquals(locale89.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat90);
        org.junit.Assert.assertNotNull(fastDateFormat91);
        org.junit.Assert.assertNotNull(locale92);
        org.junit.Assert.assertEquals(locale92.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat93);
        org.junit.Assert.assertNotNull(fastDateFormat94);
        org.junit.Assert.assertNotNull(fastDateFormat95);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "M/d/yy h:mm a" + "'", str96, "M/d/yy h:mm a");
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (short) 1);
        java.lang.String str4 = fastDateFormat2.format((long) (byte) 100);
        java.util.Locale locale5 = fastDateFormat2.getLocale();
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "January 1, 1970 12:00:00 AM UTC" + "'", str4, "January 1, 1970 12:00:00 AM UTC");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale3);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale7 = fastDateFormat6.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone5, locale7);
        int int9 = fastDateFormat8.getMaxLengthEstimate();
        java.util.Locale locale10 = fastDateFormat8.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, locale10);
        java.util.Locale locale12 = fastDateFormat11.getLocale();
        java.lang.String str13 = fastDateFormat11.toString();
        java.util.TimeZone timeZone14 = fastDateFormat11.getTimeZone();
        java.lang.String str15 = fastDateFormat11.toString();
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "FastDateFormat[h:mm a]" + "'", str13, "FastDateFormat[h:mm a]");
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "FastDateFormat[h:mm a]" + "'", str15, "FastDateFormat[h:mm a]");
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar5 = null;
        java.lang.StringBuffer stringBuffer6 = null;
        java.lang.StringBuffer stringBuffer7 = fastDateFormat4.format(calendar5, stringBuffer6);
        java.util.Calendar calendar8 = null;
        java.lang.StringBuffer stringBuffer9 = null;
        java.lang.StringBuffer stringBuffer10 = fastDateFormat4.format(calendar8, stringBuffer9);
        java.lang.String str11 = fastDateFormat4.toString();
        java.lang.Object obj12 = fastDateFormat4.clone();
        java.lang.Object obj13 = fastDateFormat4.clone();
        java.lang.String str15 = fastDateFormat4.format(10L);
        int int16 = fastDateFormat4.getMaxLengthEstimate();
        java.util.Locale locale18 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2, locale18);
        java.util.TimeZone timeZone20 = fastDateFormat19.getTimeZone();
        boolean boolean21 = fastDateFormat4.equals((java.lang.Object) timeZone20);
        java.util.TimeZone timeZone24 = null;
        java.util.Locale locale25 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone24, locale25);
        int int27 = fastDateFormat26.getMaxLengthEstimate();
        java.util.Locale locale28 = fastDateFormat26.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, locale28);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(1, 0, timeZone20, locale28);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, locale28);
        java.util.Locale locale32 = fastDateFormat31.getLocale();
        java.util.Date date33 = null;
        java.lang.StringBuffer stringBuffer34 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer35 = fastDateFormat31.format(date33, stringBuffer34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNull(stringBuffer7);
        org.junit.Assert.assertNull(stringBuffer10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "FastDateFormat[]" + "'", str11, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "FastDateFormat[]");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "FastDateFormat[]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en_US");
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("");
        java.lang.String str3 = fastDateFormat1.format((long) (byte) 1);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 1);
        java.lang.StringBuffer stringBuffer6 = null;
        java.text.FieldPosition fieldPosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer8 = fastDateFormat1.format((java.lang.Object) fastDateFormat5, stringBuffer6, fieldPosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: org.apache.commons.lang3.time.FastDateFormat");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(fastDateFormat5);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        java.util.Locale locale12 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale12);
        java.util.TimeZone timeZone14 = fastDateFormat13.getTimeZone();
        java.util.Locale locale15 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone14, locale15);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale18 = fastDateFormat17.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone14, locale18);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone14);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone14);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale23 = fastDateFormat22.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", timeZone14, locale23);
        java.util.Locale locale28 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale28);
        java.util.TimeZone timeZone30 = fastDateFormat29.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale32 = fastDateFormat31.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone30, locale32);
        int int34 = fastDateFormat33.getMaxLengthEstimate();
        java.util.Locale locale35 = fastDateFormat33.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, locale35);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone14, locale35);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone14);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone14);
        java.util.TimeZone timeZone42 = null;
        java.util.Locale locale49 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat50 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale49);
        java.util.TimeZone timeZone51 = fastDateFormat50.getTimeZone();
        java.util.Locale locale52 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat53 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone51, locale52);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat54 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale55 = fastDateFormat54.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat56 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone51, locale55);
        java.util.Locale locale62 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat63 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale62);
        java.util.TimeZone timeZone64 = fastDateFormat63.getTimeZone();
        java.util.Locale locale65 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat66 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone64, locale65);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat67 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale68 = fastDateFormat67.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat69 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone64, locale68);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat70 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2, timeZone64);
        int int71 = fastDateFormat70.getMaxLengthEstimate();
        java.util.Locale locale72 = fastDateFormat70.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat73 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone51, locale72);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat74 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", locale72);
        java.util.Locale locale75 = fastDateFormat74.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat76 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 0, timeZone42, locale75);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat77 = org.apache.commons.lang3.time.FastDateFormat.getInstance("MMMM d, yyyy", timeZone14, locale75);
        java.util.TimeZone timeZone81 = null;
        java.util.Locale locale82 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat83 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone81, locale82);
        int int84 = fastDateFormat83.getMaxLengthEstimate();
        java.util.Locale locale85 = fastDateFormat83.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat86 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, locale85);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat87 = org.apache.commons.lang3.time.FastDateFormat.getInstance("1/1/70", locale85);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat88 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone14, locale85);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(fastDateFormat50);
        org.junit.Assert.assertNotNull(timeZone51);
        org.junit.Assert.assertEquals(timeZone51.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat53);
        org.junit.Assert.assertNotNull(fastDateFormat54);
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat56);
        org.junit.Assert.assertNotNull(fastDateFormat63);
        org.junit.Assert.assertNotNull(timeZone64);
        org.junit.Assert.assertEquals(timeZone64.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat66);
        org.junit.Assert.assertNotNull(fastDateFormat67);
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat69);
        org.junit.Assert.assertNotNull(fastDateFormat70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 13 + "'", int71 == 13);
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat73);
        org.junit.Assert.assertNotNull(fastDateFormat74);
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat76);
        org.junit.Assert.assertNotNull(fastDateFormat77);
        org.junit.Assert.assertNotNull(fastDateFormat83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertNotNull(locale85);
        org.junit.Assert.assertEquals(locale85.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat86);
        org.junit.Assert.assertNotNull(fastDateFormat87);
        org.junit.Assert.assertNotNull(fastDateFormat88);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0);
        java.lang.String str4 = fastDateFormat3.toString();
        java.util.TimeZone timeZone5 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, (int) 'a', timeZone5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 97");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "FastDateFormat[EEEE, MMMM d, yyyy]" + "'", str4, "FastDateFormat[EEEE, MMMM d, yyyy]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale8);
        java.util.TimeZone timeZone10 = fastDateFormat9.getTimeZone();
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone10, locale11);
        java.util.Locale locale13 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone10, locale13);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone10);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3);
        boolean boolean18 = fastDateFormat17.getTimeZoneOverridesCalendar();
        java.util.Locale locale19 = fastDateFormat17.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, 0, timeZone10, locale19);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (short) 1);
        java.util.Locale locale25 = fastDateFormat24.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy h:mm:ss a z", locale25);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy h:mm a", timeZone10, locale25);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(42, locale25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 42");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(fastDateFormat27);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1);
        java.lang.Object obj2 = fastDateFormat1.clone();
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "FastDateFormat[h:mm:ss a z]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "FastDateFormat[h:mm:ss a z]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "FastDateFormat[h:mm:ss a z]");
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        java.util.TimeZone timeZone3 = null;
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone3, locale4);
        java.util.Calendar calendar6 = null;
        java.lang.String str7 = fastDateFormat5.format(calendar6);
        java.util.TimeZone timeZone8 = fastDateFormat5.getTimeZone();
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale11);
        java.util.TimeZone timeZone13 = fastDateFormat12.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale15 = fastDateFormat14.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone13, locale15);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy h:mm a", timeZone8, locale15);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone8);
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat18);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        java.util.Locale locale6 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale6);
        java.util.TimeZone timeZone8 = fastDateFormat7.getTimeZone();
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone8, locale9);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 2, timeZone8);
        java.util.Locale locale15 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale15);
        java.util.TimeZone timeZone17 = fastDateFormat16.getTimeZone();
        java.util.Locale locale18 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone17, locale18);
        java.util.Locale locale24 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale24);
        java.util.TimeZone timeZone26 = fastDateFormat25.getTimeZone();
        java.util.Locale locale27 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone26, locale27);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale30 = fastDateFormat29.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone26, locale30);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone17, locale30);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(3, 3, timeZone8, locale30);
        boolean boolean34 = fastDateFormat33.getTimeZoneOverridesCalendar();
        boolean boolean35 = fastDateFormat33.getTimeZoneOverridesCalendar();
        java.util.TimeZone timeZone36 = fastDateFormat33.getTimeZone();
        java.lang.String str37 = fastDateFormat33.getPattern();
        java.text.ParsePosition parsePosition39 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj40 = fastDateFormat33.parseObject("FastDateFormat[h:mm a]", parsePosition39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(timeZone36);
        org.junit.Assert.assertEquals(timeZone36.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "M/d/yy h:mm a" + "'", str37, "M/d/yy h:mm a");
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3);
        java.util.Locale locale2 = fastDateFormat1.getLocale();
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        java.util.Locale locale7 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale7);
        java.util.TimeZone timeZone9 = fastDateFormat8.getTimeZone();
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone9, locale10);
        java.util.Locale locale12 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone9, locale12);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone9);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, timeZone9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 100, 100, timeZone9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat15);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) 'a', 29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 29");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale2 = fastDateFormat1.getLocale();
        java.util.Locale locale5 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale5);
        java.util.TimeZone timeZone7 = fastDateFormat6.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(1, timeZone7);
        boolean boolean9 = fastDateFormat1.equals((java.lang.Object) timeZone7);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getInstance("1/1/70", timeZone7);
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(fastDateFormat10);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar2 = null;
        java.lang.StringBuffer stringBuffer3 = null;
        java.lang.StringBuffer stringBuffer4 = fastDateFormat1.format(calendar2, stringBuffer3);
        java.util.Calendar calendar5 = null;
        java.lang.StringBuffer stringBuffer6 = null;
        java.lang.StringBuffer stringBuffer7 = fastDateFormat1.format(calendar5, stringBuffer6);
        java.util.Calendar calendar8 = null;
        java.lang.String str9 = fastDateFormat1.format(calendar8);
        java.util.Locale locale13 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale13);
        java.util.TimeZone timeZone15 = fastDateFormat14.getTimeZone();
        java.util.Locale locale16 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone15, locale16);
        java.util.Locale locale22 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale22);
        java.util.TimeZone timeZone24 = fastDateFormat23.getTimeZone();
        java.util.Locale locale25 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone24, locale25);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale28 = fastDateFormat27.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone24, locale28);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone15, locale28);
        java.lang.Object obj31 = fastDateFormat30.clone();
        int int32 = fastDateFormat30.getMaxLengthEstimate();
        boolean boolean33 = fastDateFormat1.equals((java.lang.Object) fastDateFormat30);
        java.util.Date date34 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = fastDateFormat30.format(date34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertNull(stringBuffer4);
        org.junit.Assert.assertNull(stringBuffer7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "FastDateFormat[h:mm:ss a z]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "FastDateFormat[h:mm:ss a z]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "FastDateFormat[h:mm:ss a z]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 17 + "'", int32 == 17);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone2, locale3);
        java.util.Calendar calendar5 = null;
        java.lang.String str6 = fastDateFormat4.format(calendar5);
        java.util.TimeZone timeZone7 = fastDateFormat4.getTimeZone();
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale10);
        java.util.TimeZone timeZone12 = fastDateFormat11.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale14 = fastDateFormat13.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone12, locale14);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy h:mm a", timeZone7, locale14);
        java.util.Locale locale19 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale19);
        java.util.TimeZone timeZone21 = fastDateFormat20.getTimeZone();
        java.util.Locale locale22 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone21, locale22);
        java.lang.Object obj24 = fastDateFormat23.clone();
        java.lang.StringBuffer stringBuffer25 = null;
        java.text.FieldPosition fieldPosition26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer27 = fastDateFormat16.format(obj24, stringBuffer25, fieldPosition26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: org.apache.commons.lang3.time.FastDateFormat");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "FastDateFormat[EEEE, MMMM d, yyyy]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "FastDateFormat[EEEE, MMMM d, yyyy]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "FastDateFormat[EEEE, MMMM d, yyyy]");
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(39, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("");
        boolean boolean3 = fastDateFormat1.equals((java.lang.Object) 100.0f);
        java.lang.String str5 = fastDateFormat1.format(0L);
        java.lang.String str6 = fastDateFormat1.getPattern();
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale11);
        java.util.TimeZone timeZone13 = fastDateFormat12.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale15 = fastDateFormat14.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone13, locale15);
        int int17 = fastDateFormat16.getMaxLengthEstimate();
        java.util.Locale locale18 = fastDateFormat16.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, locale18);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale18);
        boolean boolean21 = fastDateFormat1.equals((java.lang.Object) fastDateFormat20);
        int int22 = fastDateFormat20.getMaxLengthEstimate();
        java.util.Locale locale23 = fastDateFormat20.getLocale();
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 31 + "'", int22 == 31);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_US");
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        java.util.Locale locale13 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale13);
        java.util.TimeZone timeZone15 = fastDateFormat14.getTimeZone();
        java.util.Locale locale16 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone15, locale16);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale19 = fastDateFormat18.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone15, locale19);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone15);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone15);
        java.util.Locale locale26 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale26);
        java.util.TimeZone timeZone28 = fastDateFormat27.getTimeZone();
        java.util.Locale locale29 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone28, locale29);
        java.util.Locale locale35 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale35);
        java.util.TimeZone timeZone37 = fastDateFormat36.getTimeZone();
        java.util.Locale locale38 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone37, locale38);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale41 = fastDateFormat40.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone37, locale41);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone28, locale41);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone15, locale41);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale46 = fastDateFormat45.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone15, locale46);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(3, (int) (byte) 0, timeZone15);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat50 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3);
        boolean boolean51 = fastDateFormat50.getTimeZoneOverridesCalendar();
        java.util.Locale locale52 = fastDateFormat50.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat53 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone15, locale52);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat54 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) -1, (int) (byte) 10, locale52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(timeZone37);
        org.junit.Assert.assertEquals(timeZone37.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertNotNull(fastDateFormat48);
        org.junit.Assert.assertNotNull(fastDateFormat50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat53);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar2 = null;
        java.lang.StringBuffer stringBuffer3 = null;
        java.lang.StringBuffer stringBuffer4 = fastDateFormat1.format(calendar2, stringBuffer3);
        java.util.Calendar calendar5 = null;
        java.lang.StringBuffer stringBuffer6 = null;
        java.lang.StringBuffer stringBuffer7 = fastDateFormat1.format(calendar5, stringBuffer6);
        java.lang.String str8 = fastDateFormat1.toString();
        java.lang.String str10 = fastDateFormat1.format((long) 20);
        java.util.Locale locale11 = fastDateFormat1.getLocale();
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertNull(stringBuffer4);
        org.junit.Assert.assertNull(stringBuffer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "FastDateFormat[]" + "'", str8, "FastDateFormat[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 97");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale2);
        java.util.TimeZone timeZone4 = fastDateFormat3.getTimeZone();
        java.util.Locale locale5 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone4, locale5);
        java.lang.Object obj7 = fastDateFormat6.clone();
        java.lang.Object obj8 = fastDateFormat6.clone();
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer11 = fastDateFormat6.format((long) (byte) 1, stringBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "FastDateFormat[EEEE, MMMM d, yyyy]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "FastDateFormat[EEEE, MMMM d, yyyy]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "FastDateFormat[EEEE, MMMM d, yyyy]");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "FastDateFormat[EEEE, MMMM d, yyyy]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "FastDateFormat[EEEE, MMMM d, yyyy]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "FastDateFormat[EEEE, MMMM d, yyyy]");
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale8);
        java.util.TimeZone timeZone10 = fastDateFormat9.getTimeZone();
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone10, locale11);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale14 = fastDateFormat13.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone10, locale14);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone10);
        java.util.Locale locale19 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale19);
        java.util.TimeZone timeZone21 = fastDateFormat20.getTimeZone();
        java.util.Locale locale30 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale30);
        java.util.TimeZone timeZone32 = fastDateFormat31.getTimeZone();
        java.util.Locale locale33 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone32, locale33);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale36 = fastDateFormat35.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone32, locale36);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone32);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone32);
        java.util.Locale locale43 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale43);
        java.util.TimeZone timeZone45 = fastDateFormat44.getTimeZone();
        java.util.Locale locale46 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone45, locale46);
        java.util.Locale locale52 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat53 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale52);
        java.util.TimeZone timeZone54 = fastDateFormat53.getTimeZone();
        java.util.Locale locale55 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat56 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone54, locale55);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat57 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale58 = fastDateFormat57.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat59 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone54, locale58);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat60 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone45, locale58);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat61 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone32, locale58);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat62 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale63 = fastDateFormat62.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat64 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone32, locale63);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat65 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone21, locale63);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat66 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone10, locale63);
        java.util.Locale locale67 = fastDateFormat66.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat68 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale67);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat69 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm a", locale67);
        java.util.TimeZone timeZone70 = fastDateFormat69.getTimeZone();
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(timeZone32);
        org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(timeZone45);
        org.junit.Assert.assertEquals(timeZone45.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertNotNull(fastDateFormat53);
        org.junit.Assert.assertNotNull(timeZone54);
        org.junit.Assert.assertEquals(timeZone54.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat56);
        org.junit.Assert.assertNotNull(fastDateFormat57);
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat59);
        org.junit.Assert.assertNotNull(fastDateFormat60);
        org.junit.Assert.assertNotNull(fastDateFormat61);
        org.junit.Assert.assertNotNull(fastDateFormat62);
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat64);
        org.junit.Assert.assertNotNull(fastDateFormat65);
        org.junit.Assert.assertNotNull(fastDateFormat66);
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat68);
        org.junit.Assert.assertNotNull(fastDateFormat69);
        org.junit.Assert.assertNotNull(timeZone70);
        org.junit.Assert.assertEquals(timeZone70.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale3);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale7 = fastDateFormat6.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone5, locale7);
        int int9 = fastDateFormat8.getMaxLengthEstimate();
        java.util.Locale locale10 = fastDateFormat8.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, locale10);
        java.lang.String str12 = fastDateFormat11.getPattern();
        java.lang.Object obj13 = fastDateFormat11.clone();
        java.lang.Object obj14 = fastDateFormat11.clone();
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h:mm a" + "'", str12, "h:mm a");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "FastDateFormat[h:mm a]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "FastDateFormat[h:mm a]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "FastDateFormat[h:mm a]");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "FastDateFormat[h:mm a]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "FastDateFormat[h:mm a]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "FastDateFormat[h:mm a]");
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        java.util.Locale locale7 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale7);
        java.util.TimeZone timeZone9 = fastDateFormat8.getTimeZone();
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone9, locale10);
        java.util.Locale locale12 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone9, locale12);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone9);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", timeZone9);
        java.util.Locale locale21 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale21);
        java.util.TimeZone timeZone23 = fastDateFormat22.getTimeZone();
        java.util.Locale locale24 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone23, locale24);
        java.util.Locale locale26 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone23, locale26);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone23);
        java.util.Locale locale32 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale32);
        java.util.TimeZone timeZone34 = fastDateFormat33.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale36 = fastDateFormat35.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone34, locale36);
        int int38 = fastDateFormat37.getMaxLengthEstimate();
        java.util.Locale locale39 = fastDateFormat37.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, locale39);
        java.util.Locale locale41 = fastDateFormat40.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone23, locale41);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone9, locale41);
        java.util.TimeZone timeZone46 = null;
        java.util.Locale locale47 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone46, locale47);
        int int49 = fastDateFormat48.getMaxLengthEstimate();
        java.util.Locale locale50 = fastDateFormat48.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat51 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, locale50);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat52 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone9, locale50);
        java.util.Date date53 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str54 = fastDateFormat52.format(date53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(timeZone34);
        org.junit.Assert.assertEquals(timeZone34.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(fastDateFormat48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat51);
        org.junit.Assert.assertNotNull(fastDateFormat52);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale4 = fastDateFormat3.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, locale4);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 1, locale4);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", locale4);
        java.lang.String str8 = fastDateFormat7.toString();
        java.lang.Object obj9 = fastDateFormat7.clone();
        java.lang.String str10 = fastDateFormat7.toString();
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer13 = fastDateFormat7.format((long) (short) -1, stringBuffer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "FastDateFormat[h:mm:ss a z]" + "'", str8, "FastDateFormat[h:mm:ss a z]");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "FastDateFormat[h:mm:ss a z]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "FastDateFormat[h:mm:ss a z]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "FastDateFormat[h:mm:ss a z]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "FastDateFormat[h:mm:ss a z]" + "'", str10, "FastDateFormat[h:mm:ss a z]");
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        java.util.Locale locale6 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale6);
        java.util.TimeZone timeZone8 = fastDateFormat7.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale10 = fastDateFormat9.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone8, locale10);
        int int12 = fastDateFormat11.getMaxLengthEstimate();
        java.util.Locale locale13 = fastDateFormat11.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, locale13);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale13);
        java.lang.Object obj16 = fastDateFormat15.clone();
        java.util.Locale locale17 = fastDateFormat15.getLocale();
        java.util.TimeZone timeZone18 = fastDateFormat15.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang3.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar24 = null;
        java.lang.StringBuffer stringBuffer25 = null;
        java.lang.StringBuffer stringBuffer26 = fastDateFormat23.format(calendar24, stringBuffer25);
        java.util.Calendar calendar27 = null;
        java.lang.StringBuffer stringBuffer28 = null;
        java.lang.StringBuffer stringBuffer29 = fastDateFormat23.format(calendar27, stringBuffer28);
        java.util.Calendar calendar30 = null;
        java.lang.StringBuffer stringBuffer31 = null;
        java.lang.StringBuffer stringBuffer32 = fastDateFormat23.format(calendar30, stringBuffer31);
        int int33 = fastDateFormat23.getMaxLengthEstimate();
        java.lang.String str34 = fastDateFormat23.toString();
        boolean boolean35 = fastDateFormat21.equals((java.lang.Object) fastDateFormat23);
        int int36 = fastDateFormat21.getMaxLengthEstimate();
        java.util.Locale locale37 = fastDateFormat21.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, locale37);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(42, 39, timeZone18, locale37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 39");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "FastDateFormat[EEEE, MMMM d, yyyy]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "FastDateFormat[EEEE, MMMM d, yyyy]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "FastDateFormat[EEEE, MMMM d, yyyy]");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_US");
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNull(stringBuffer26);
        org.junit.Assert.assertNull(stringBuffer29);
        org.junit.Assert.assertNull(stringBuffer32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "FastDateFormat[]" + "'", str34, "FastDateFormat[]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 18 + "'", int36 == 18);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat38);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale2);
        java.util.TimeZone timeZone4 = fastDateFormat3.getTimeZone();
        java.util.Locale locale13 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale13);
        java.util.TimeZone timeZone15 = fastDateFormat14.getTimeZone();
        java.util.Locale locale16 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone15, locale16);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale19 = fastDateFormat18.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone15, locale19);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone15);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone15);
        java.util.Locale locale26 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale26);
        java.util.TimeZone timeZone28 = fastDateFormat27.getTimeZone();
        java.util.Locale locale29 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone28, locale29);
        java.util.Locale locale35 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale35);
        java.util.TimeZone timeZone37 = fastDateFormat36.getTimeZone();
        java.util.Locale locale38 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone37, locale38);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale41 = fastDateFormat40.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone37, locale41);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone28, locale41);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone15, locale41);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale46 = fastDateFormat45.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone15, locale46);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone4, locale46);
        java.lang.String str49 = fastDateFormat48.toString();
        java.util.Locale locale56 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat57 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale56);
        java.util.TimeZone timeZone58 = fastDateFormat57.getTimeZone();
        java.util.Locale locale59 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat60 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone58, locale59);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat61 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale62 = fastDateFormat61.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat63 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone58, locale62);
        java.util.Locale locale69 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat70 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale69);
        java.util.TimeZone timeZone71 = fastDateFormat70.getTimeZone();
        java.util.Locale locale72 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat73 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone71, locale72);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat74 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale75 = fastDateFormat74.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat76 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone71, locale75);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat77 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2, timeZone71);
        int int78 = fastDateFormat77.getMaxLengthEstimate();
        java.util.Locale locale79 = fastDateFormat77.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat80 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone58, locale79);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat81 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2, locale79);
        boolean boolean82 = fastDateFormat48.equals((java.lang.Object) locale79);
        int int83 = fastDateFormat48.getMaxLengthEstimate();
        java.lang.String str84 = fastDateFormat48.toString();
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(timeZone37);
        org.junit.Assert.assertEquals(timeZone37.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertNotNull(fastDateFormat48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "FastDateFormat[h:mm:ss a z]" + "'", str49, "FastDateFormat[h:mm:ss a z]");
        org.junit.Assert.assertNotNull(fastDateFormat57);
        org.junit.Assert.assertNotNull(timeZone58);
        org.junit.Assert.assertEquals(timeZone58.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat60);
        org.junit.Assert.assertNotNull(fastDateFormat61);
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat63);
        org.junit.Assert.assertNotNull(fastDateFormat70);
        org.junit.Assert.assertNotNull(timeZone71);
        org.junit.Assert.assertEquals(timeZone71.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat73);
        org.junit.Assert.assertNotNull(fastDateFormat74);
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat76);
        org.junit.Assert.assertNotNull(fastDateFormat77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 13 + "'", int78 == 13);
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat80);
        org.junit.Assert.assertNotNull(fastDateFormat81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 17 + "'", int83 == 17);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "FastDateFormat[h:mm:ss a z]" + "'", str84, "FastDateFormat[h:mm:ss a z]");
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        java.util.Locale locale6 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale6);
        java.util.TimeZone timeZone8 = fastDateFormat7.getTimeZone();
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone8, locale9);
        java.util.Locale locale15 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale15);
        java.util.TimeZone timeZone17 = fastDateFormat16.getTimeZone();
        java.util.Locale locale18 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone17, locale18);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale21 = fastDateFormat20.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone17, locale21);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone8, locale21);
        java.lang.Object obj24 = fastDateFormat23.clone();
        java.util.TimeZone timeZone25 = fastDateFormat23.getTimeZone();
        java.util.Locale locale29 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale29);
        java.util.TimeZone timeZone31 = fastDateFormat30.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale33 = fastDateFormat32.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone31, locale33);
        int int35 = fastDateFormat34.getMaxLengthEstimate();
        java.util.Locale locale36 = fastDateFormat34.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, locale36);
        java.util.Locale locale38 = fastDateFormat37.getLocale();
        java.lang.Object obj39 = fastDateFormat37.clone();
        java.util.Locale locale40 = fastDateFormat37.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone25, locale40);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 10, 3, locale40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "FastDateFormat[h:mm:ss a z]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "FastDateFormat[h:mm:ss a z]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "FastDateFormat[h:mm:ss a z]");
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "en_US");
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertEquals(obj39.toString(), "FastDateFormat[h:mm a]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj39), "FastDateFormat[h:mm a]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj39), "FastDateFormat[h:mm a]");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat41);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        java.util.Locale locale5 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale5);
        java.util.TimeZone timeZone7 = fastDateFormat6.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(1, timeZone7);
        java.util.Locale locale15 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale15);
        java.util.TimeZone timeZone17 = fastDateFormat16.getTimeZone();
        java.util.Locale locale18 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone17, locale18);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 2, timeZone17);
        java.util.Locale locale24 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale24);
        java.util.TimeZone timeZone26 = fastDateFormat25.getTimeZone();
        java.util.Locale locale27 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone26, locale27);
        java.util.Locale locale33 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale33);
        java.util.TimeZone timeZone35 = fastDateFormat34.getTimeZone();
        java.util.Locale locale36 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone35, locale36);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale39 = fastDateFormat38.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone35, locale39);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone26, locale39);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(3, 3, timeZone17, locale39);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, timeZone7, locale39);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, locale39);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang3.time.FastDateFormat.getInstance("11:59:59 PM UTC", locale39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(timeZone35);
        org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(fastDateFormat44);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 1);
        java.util.TimeZone timeZone3 = fastDateFormat2.getTimeZone();
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getInstance("hi!", timeZone3, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale1 = fastDateFormat0.getLocale();
        boolean boolean2 = fastDateFormat0.getTimeZoneOverridesCalendar();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar5 = null;
        java.lang.String str6 = fastDateFormat4.format(calendar5);
        java.lang.Object obj7 = fastDateFormat4.clone();
        int int8 = fastDateFormat4.getMaxLengthEstimate();
        boolean boolean9 = fastDateFormat0.equals((java.lang.Object) fastDateFormat4);
        boolean boolean10 = fastDateFormat0.getTimeZoneOverridesCalendar();
        org.junit.Assert.assertNotNull(fastDateFormat0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "FastDateFormat[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone2, locale3);
        int int5 = fastDateFormat4.getMaxLengthEstimate();
        boolean boolean7 = fastDateFormat4.equals((java.lang.Object) 1.0f);
        java.lang.String str9 = fastDateFormat4.format((long) (byte) 0);
        java.lang.String str10 = fastDateFormat4.getPattern();
        int int11 = fastDateFormat4.getMaxLengthEstimate();
        boolean boolean12 = fastDateFormat4.getTimeZoneOverridesCalendar();
        java.util.Locale locale13 = fastDateFormat4.getLocale();
        java.lang.Object obj14 = fastDateFormat4.clone();
        java.lang.String str15 = fastDateFormat4.getPattern();
        java.util.TimeZone timeZone16 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang3.time.FastDateFormat.getInstance("");
        boolean boolean21 = fastDateFormat19.equals((java.lang.Object) 100.0f);
        boolean boolean22 = fastDateFormat19.getTimeZoneOverridesCalendar();
        java.util.Locale locale23 = fastDateFormat19.getLocale();
        java.util.Locale locale24 = fastDateFormat19.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2, locale24);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, timeZone16, locale24);
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "FastDateFormat[]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(fastDateFormat26);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale2);
        java.util.TimeZone timeZone4 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale6 = fastDateFormat5.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone4, locale6);
        java.lang.String str8 = fastDateFormat7.toString();
        boolean boolean9 = fastDateFormat7.getTimeZoneOverridesCalendar();
        java.lang.String str11 = fastDateFormat7.format((long) '4');
        java.lang.String str12 = fastDateFormat7.getPattern();
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "FastDateFormat[]" + "'", str8, "FastDateFormat[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        java.util.Locale locale7 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale7);
        java.util.TimeZone timeZone9 = fastDateFormat8.getTimeZone();
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone9, locale10);
        java.util.Locale locale12 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone9, locale12);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone9);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3);
        boolean boolean17 = fastDateFormat16.getTimeZoneOverridesCalendar();
        java.util.Locale locale18 = fastDateFormat16.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, 0, timeZone9, locale18);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 1, timeZone9);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar23 = null;
        java.lang.StringBuffer stringBuffer24 = null;
        java.lang.StringBuffer stringBuffer25 = fastDateFormat22.format(calendar23, stringBuffer24);
        java.util.Calendar calendar26 = null;
        java.lang.StringBuffer stringBuffer27 = null;
        java.lang.StringBuffer stringBuffer28 = fastDateFormat22.format(calendar26, stringBuffer27);
        java.lang.String str29 = fastDateFormat22.toString();
        java.lang.Object obj30 = fastDateFormat22.clone();
        java.lang.Object obj31 = fastDateFormat22.clone();
        java.lang.String str33 = fastDateFormat22.format(10L);
        java.lang.Object obj34 = fastDateFormat22.clone();
        boolean boolean35 = fastDateFormat20.equals((java.lang.Object) fastDateFormat22);
        java.lang.String str36 = fastDateFormat20.toString();
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNull(stringBuffer25);
        org.junit.Assert.assertNull(stringBuffer28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "FastDateFormat[]" + "'", str29, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "FastDateFormat[]");
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "FastDateFormat[]");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertEquals(obj34.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj34), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj34), "FastDateFormat[]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "FastDateFormat[MMMM d, yyyy]" + "'", str36, "FastDateFormat[MMMM d, yyyy]");
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale4);
        java.util.TimeZone timeZone6 = fastDateFormat5.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale8 = fastDateFormat7.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone6, locale8);
        int int10 = fastDateFormat9.getMaxLengthEstimate();
        boolean boolean11 = fastDateFormat9.getTimeZoneOverridesCalendar();
        java.util.Locale locale20 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale20);
        java.util.TimeZone timeZone22 = fastDateFormat21.getTimeZone();
        java.util.Locale locale23 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone22, locale23);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale26 = fastDateFormat25.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone22, locale26);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone22);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone22);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale31 = fastDateFormat30.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", timeZone22, locale31);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", locale31);
        boolean boolean34 = fastDateFormat9.equals((java.lang.Object) locale31);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale31);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(42, locale31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 42");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(fastDateFormat35);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale5 = fastDateFormat4.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, locale5);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 1, locale5);
        boolean boolean8 = fastDateFormat1.equals((java.lang.Object) fastDateFormat7);
        java.lang.Object obj9 = fastDateFormat1.clone();
        java.lang.String str10 = fastDateFormat1.toString();
        int int11 = fastDateFormat1.getMaxLengthEstimate();
        java.lang.Object obj12 = fastDateFormat1.clone();
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "FastDateFormat[h:mm:ss a z]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "FastDateFormat[h:mm:ss a z]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "FastDateFormat[h:mm:ss a z]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "FastDateFormat[h:mm:ss a z]" + "'", str10, "FastDateFormat[h:mm:ss a z]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 18 + "'", int11 == 18);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "FastDateFormat[h:mm:ss a z]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "FastDateFormat[h:mm:ss a z]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "FastDateFormat[h:mm:ss a z]");
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("");
        java.lang.Object obj2 = fastDateFormat1.clone();
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "FastDateFormat[]");
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        java.util.Locale locale6 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale6);
        java.util.TimeZone timeZone8 = fastDateFormat7.getTimeZone();
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone8, locale9);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale12 = fastDateFormat11.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone8, locale12);
        java.util.Locale locale19 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale19);
        java.util.TimeZone timeZone21 = fastDateFormat20.getTimeZone();
        java.util.Locale locale22 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone21, locale22);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale25 = fastDateFormat24.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone21, locale25);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2, timeZone21);
        int int28 = fastDateFormat27.getMaxLengthEstimate();
        java.util.Locale locale29 = fastDateFormat27.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone8, locale29);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2, locale29);
        java.util.Locale locale38 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale38);
        java.util.TimeZone timeZone40 = fastDateFormat39.getTimeZone();
        java.util.Locale locale41 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone40, locale41);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale44 = fastDateFormat43.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone40, locale44);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone40);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, timeZone40);
        boolean boolean48 = fastDateFormat31.equals((java.lang.Object) fastDateFormat47);
        java.lang.Class<?> wildcardClass49 = fastDateFormat31.getClass();
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 13 + "'", int28 == 13);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(timeZone40);
        org.junit.Assert.assertEquals(timeZone40.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale8);
        java.util.TimeZone timeZone10 = fastDateFormat9.getTimeZone();
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone10, locale11);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale14 = fastDateFormat13.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone10, locale14);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone10);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone10);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale19 = fastDateFormat18.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", timeZone10, locale19);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", locale19);
        java.lang.Object obj22 = fastDateFormat21.clone();
        java.util.TimeZone timeZone23 = fastDateFormat21.getTimeZone();
        java.util.Calendar calendar24 = null;
        java.lang.String str25 = fastDateFormat21.format(calendar24);
        java.util.Locale locale26 = fastDateFormat21.getLocale();
        java.util.Calendar calendar27 = null;
        java.lang.StringBuffer stringBuffer28 = null;
        java.lang.StringBuffer stringBuffer29 = fastDateFormat21.format(calendar27, stringBuffer28);
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_US");
        org.junit.Assert.assertNull(stringBuffer29);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale4);
        java.util.TimeZone timeZone6 = fastDateFormat5.getTimeZone();
        java.util.Locale locale7 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone6, locale7);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 2, timeZone6);
        java.util.TimeZone timeZone10 = fastDateFormat9.getTimeZone();
        int int11 = fastDateFormat9.getMaxLengthEstimate();
        int int12 = fastDateFormat9.getMaxLengthEstimate();
        java.util.Calendar calendar13 = null;
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer15 = fastDateFormat9.format(calendar13, stringBuffer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 45 + "'", int11 == 45);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 45 + "'", int12 == 45);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone1, locale2);
        int int4 = fastDateFormat3.getMaxLengthEstimate();
        boolean boolean6 = fastDateFormat3.equals((java.lang.Object) 1.0f);
        java.util.Calendar calendar7 = null;
        java.lang.StringBuffer stringBuffer8 = null;
        java.lang.StringBuffer stringBuffer9 = fastDateFormat3.format(calendar7, stringBuffer8);
        java.util.Date date10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = fastDateFormat3.format(date10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(stringBuffer9);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        java.util.Locale locale6 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale6);
        java.util.TimeZone timeZone8 = fastDateFormat7.getTimeZone();
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone8, locale9);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale12 = fastDateFormat11.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone8, locale12);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone8);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone8);
        java.util.Locale locale19 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale19);
        java.util.TimeZone timeZone21 = fastDateFormat20.getTimeZone();
        java.util.Locale locale29 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale29);
        java.util.TimeZone timeZone31 = fastDateFormat30.getTimeZone();
        java.util.Locale locale32 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone31, locale32);
        java.util.Locale locale34 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone31, locale34);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone31);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone31);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone31);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone31);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z");
        int int42 = fastDateFormat41.getMaxLengthEstimate();
        boolean boolean43 = fastDateFormat39.equals((java.lang.Object) int42);
        java.util.TimeZone timeZone44 = fastDateFormat39.getTimeZone();
        java.lang.Object obj45 = fastDateFormat39.clone();
        java.util.Locale locale46 = fastDateFormat39.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", timeZone21, locale46);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(1, locale46);
        boolean boolean49 = fastDateFormat15.equals((java.lang.Object) fastDateFormat48);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat51 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale52 = fastDateFormat51.getLocale();
        java.util.Locale locale55 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat56 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale55);
        java.util.TimeZone timeZone57 = fastDateFormat56.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat58 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(1, timeZone57);
        boolean boolean59 = fastDateFormat51.equals((java.lang.Object) timeZone57);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat60 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, timeZone57);
        java.lang.StringBuffer stringBuffer61 = null;
        java.text.FieldPosition fieldPosition62 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer63 = fastDateFormat15.format((java.lang.Object) 1, stringBuffer61, fieldPosition62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 18 + "'", int42 == 18);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(timeZone44);
        org.junit.Assert.assertEquals(timeZone44.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertEquals(obj45.toString(), "FastDateFormat[EEEE, MMMM d, yyyy]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj45), "FastDateFormat[EEEE, MMMM d, yyyy]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj45), "FastDateFormat[EEEE, MMMM d, yyyy]");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertNotNull(fastDateFormat48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(fastDateFormat51);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat56);
        org.junit.Assert.assertNotNull(timeZone57);
        org.junit.Assert.assertEquals(timeZone57.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(fastDateFormat60);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        java.util.Locale locale7 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale7);
        java.util.TimeZone timeZone9 = fastDateFormat8.getTimeZone();
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone9, locale10);
        java.util.Locale locale12 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone9, locale12);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone9);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone9);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone9);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2, timeZone9);
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat17);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale3);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        java.util.Locale locale6 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone5, locale6);
        java.util.Locale locale12 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale12);
        java.util.TimeZone timeZone14 = fastDateFormat13.getTimeZone();
        java.util.Locale locale15 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone14, locale15);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale18 = fastDateFormat17.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone14, locale18);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone5, locale18);
        java.lang.Object obj21 = fastDateFormat20.clone();
        int int22 = fastDateFormat20.getMaxLengthEstimate();
        boolean boolean23 = fastDateFormat20.getTimeZoneOverridesCalendar();
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "FastDateFormat[h:mm:ss a z]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "FastDateFormat[h:mm:ss a z]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "FastDateFormat[h:mm:ss a z]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 17 + "'", int22 == 17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale4);
        java.util.TimeZone timeZone6 = fastDateFormat5.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale8 = fastDateFormat7.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone6, locale8);
        int int10 = fastDateFormat9.getMaxLengthEstimate();
        java.util.Locale locale11 = fastDateFormat9.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, locale11);
        java.util.TimeZone timeZone13 = fastDateFormat12.getTimeZone();
        java.util.TimeZone timeZone15 = null;
        java.util.Locale locale16 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone15, locale16);
        java.util.Calendar calendar18 = null;
        java.lang.StringBuffer stringBuffer19 = null;
        java.lang.StringBuffer stringBuffer20 = fastDateFormat17.format(calendar18, stringBuffer19);
        java.lang.StringBuffer stringBuffer22 = null;
        java.lang.StringBuffer stringBuffer23 = fastDateFormat17.format(10L, stringBuffer22);
        java.util.Locale locale24 = fastDateFormat17.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 1, timeZone13, locale24);
        java.lang.String str26 = fastDateFormat25.getPattern();
        int int27 = fastDateFormat25.getMaxLengthEstimate();
        java.lang.StringBuffer stringBuffer29 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer30 = fastDateFormat25.format((long) (-1), stringBuffer29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNull(stringBuffer20);
        org.junit.Assert.assertNull(stringBuffer23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "MMMM d, yyyy" + "'", str26, "MMMM d, yyyy");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 20 + "'", int27 == 20);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar3 = null;
        java.lang.String str4 = fastDateFormat2.format(calendar3);
        java.lang.StringBuffer stringBuffer6 = null;
        java.lang.StringBuffer stringBuffer7 = fastDateFormat2.format((long) 'a', stringBuffer6);
        boolean boolean8 = fastDateFormat2.getTimeZoneOverridesCalendar();
        java.lang.String str9 = fastDateFormat2.toString();
        java.util.TimeZone timeZone10 = fastDateFormat2.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getInstance("MMMM d, yyyy h:mm a", timeZone10);
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(stringBuffer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "FastDateFormat[]" + "'", str9, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat11);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale3);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale7 = fastDateFormat6.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone5, locale7);
        java.util.TimeZone timeZone10 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone10);
        boolean boolean13 = fastDateFormat11.equals((java.lang.Object) "FastDateFormat[]");
        boolean boolean14 = fastDateFormat11.getTimeZoneOverridesCalendar();
        java.lang.Object obj15 = fastDateFormat11.clone();
        boolean boolean16 = fastDateFormat8.equals((java.lang.Object) fastDateFormat11);
        java.util.Locale locale23 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale23);
        java.util.TimeZone timeZone25 = fastDateFormat24.getTimeZone();
        java.util.Locale locale26 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone25, locale26);
        java.util.Locale locale32 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale32);
        java.util.TimeZone timeZone34 = fastDateFormat33.getTimeZone();
        java.util.Locale locale35 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone34, locale35);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale38 = fastDateFormat37.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone34, locale38);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone25, locale38);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone25);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone25);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone25);
        boolean boolean44 = fastDateFormat8.equals((java.lang.Object) timeZone25);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(10, timeZone25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "FastDateFormat[h:mm:ss a z]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "FastDateFormat[h:mm:ss a z]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "FastDateFormat[h:mm:ss a z]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(timeZone34);
        org.junit.Assert.assertEquals(timeZone34.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale4);
        java.util.TimeZone timeZone6 = fastDateFormat5.getTimeZone();
        java.util.Locale locale7 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone6, locale7);
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", timeZone6, locale9);
        java.util.TimeZone timeZone11 = fastDateFormat10.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2);
        java.lang.String str15 = fastDateFormat13.format(0L);
        java.util.Locale locale16 = fastDateFormat13.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone11, locale16);
        java.util.Locale locale18 = fastDateFormat17.getLocale();
        java.util.Locale locale29 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale29);
        java.util.TimeZone timeZone31 = fastDateFormat30.getTimeZone();
        java.util.Locale locale32 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone31, locale32);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale35 = fastDateFormat34.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone31, locale35);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone31);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone31);
        java.util.Locale locale42 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale42);
        java.util.TimeZone timeZone44 = fastDateFormat43.getTimeZone();
        java.util.Locale locale45 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone44, locale45);
        java.util.Locale locale51 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat52 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale51);
        java.util.TimeZone timeZone53 = fastDateFormat52.getTimeZone();
        java.util.Locale locale54 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat55 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone53, locale54);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat56 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale57 = fastDateFormat56.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat58 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone53, locale57);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat59 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone44, locale57);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat60 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone31, locale57);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat61 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale62 = fastDateFormat61.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat63 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone31, locale62);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat64 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(3, (int) (byte) 0, timeZone31);
        boolean boolean65 = fastDateFormat17.equals((java.lang.Object) (byte) 0);
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "12:00:00 AM" + "'", str15, "12:00:00 AM");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(timeZone44);
        org.junit.Assert.assertEquals(timeZone44.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNotNull(fastDateFormat52);
        org.junit.Assert.assertNotNull(timeZone53);
        org.junit.Assert.assertEquals(timeZone53.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat55);
        org.junit.Assert.assertNotNull(fastDateFormat56);
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat58);
        org.junit.Assert.assertNotNull(fastDateFormat59);
        org.junit.Assert.assertNotNull(fastDateFormat60);
        org.junit.Assert.assertNotNull(fastDateFormat61);
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat63);
        org.junit.Assert.assertNotNull(fastDateFormat64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("");
        boolean boolean4 = fastDateFormat2.equals((java.lang.Object) 100.0f);
        java.lang.String str6 = fastDateFormat2.format(0L);
        java.lang.String str7 = fastDateFormat2.getPattern();
        java.lang.Object obj8 = fastDateFormat2.clone();
        java.lang.String str9 = fastDateFormat2.getPattern();
        java.lang.StringBuffer stringBuffer11 = null;
        java.lang.StringBuffer stringBuffer12 = fastDateFormat2.format(100L, stringBuffer11);
        java.util.Locale locale20 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale20);
        java.util.TimeZone timeZone22 = fastDateFormat21.getTimeZone();
        java.util.Locale locale23 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone22, locale23);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale26 = fastDateFormat25.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone22, locale26);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone22);
        java.util.Locale locale31 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale31);
        java.util.TimeZone timeZone33 = fastDateFormat32.getTimeZone();
        java.util.Locale locale42 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale42);
        java.util.TimeZone timeZone44 = fastDateFormat43.getTimeZone();
        java.util.Locale locale45 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone44, locale45);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale48 = fastDateFormat47.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone44, locale48);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat50 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone44);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat51 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone44);
        java.util.Locale locale55 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat56 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale55);
        java.util.TimeZone timeZone57 = fastDateFormat56.getTimeZone();
        java.util.Locale locale58 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat59 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone57, locale58);
        java.util.Locale locale64 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat65 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale64);
        java.util.TimeZone timeZone66 = fastDateFormat65.getTimeZone();
        java.util.Locale locale67 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat68 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone66, locale67);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat69 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale70 = fastDateFormat69.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat71 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone66, locale70);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat72 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone57, locale70);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat73 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone44, locale70);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat74 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale75 = fastDateFormat74.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat76 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone44, locale75);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat77 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone33, locale75);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat78 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone22, locale75);
        java.util.Locale locale79 = fastDateFormat78.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat80 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale79);
        int int81 = fastDateFormat80.getMaxLengthEstimate();
        java.util.Locale locale82 = fastDateFormat80.getLocale();
        boolean boolean83 = fastDateFormat2.equals((java.lang.Object) fastDateFormat80);
        java.util.TimeZone timeZone84 = fastDateFormat2.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat85 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone84);
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "FastDateFormat[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(stringBuffer12);
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(timeZone44);
        org.junit.Assert.assertEquals(timeZone44.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat49);
        org.junit.Assert.assertNotNull(fastDateFormat50);
        org.junit.Assert.assertNotNull(fastDateFormat51);
        org.junit.Assert.assertNotNull(fastDateFormat56);
        org.junit.Assert.assertNotNull(timeZone57);
        org.junit.Assert.assertEquals(timeZone57.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat59);
        org.junit.Assert.assertNotNull(fastDateFormat65);
        org.junit.Assert.assertNotNull(timeZone66);
        org.junit.Assert.assertEquals(timeZone66.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat68);
        org.junit.Assert.assertNotNull(fastDateFormat69);
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat71);
        org.junit.Assert.assertNotNull(fastDateFormat72);
        org.junit.Assert.assertNotNull(fastDateFormat73);
        org.junit.Assert.assertNotNull(fastDateFormat74);
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat76);
        org.junit.Assert.assertNotNull(fastDateFormat77);
        org.junit.Assert.assertNotNull(fastDateFormat78);
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 31 + "'", int81 == 31);
        org.junit.Assert.assertNotNull(locale82);
        org.junit.Assert.assertEquals(locale82.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(timeZone84);
        org.junit.Assert.assertEquals(timeZone84.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat85);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 10, (int) '#', locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 35");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar2 = null;
        java.lang.StringBuffer stringBuffer3 = null;
        java.lang.StringBuffer stringBuffer4 = fastDateFormat1.format(calendar2, stringBuffer3);
        java.util.Calendar calendar5 = null;
        java.lang.StringBuffer stringBuffer6 = null;
        java.lang.StringBuffer stringBuffer7 = fastDateFormat1.format(calendar5, stringBuffer6);
        java.lang.StringBuffer stringBuffer9 = null;
        java.lang.StringBuffer stringBuffer10 = fastDateFormat1.format((long) (byte) 100, stringBuffer9);
        java.lang.String str11 = fastDateFormat1.toString();
        java.lang.Object obj12 = fastDateFormat1.clone();
        java.lang.StringBuffer stringBuffer14 = null;
        java.lang.StringBuffer stringBuffer15 = fastDateFormat1.format((long) 'a', stringBuffer14);
        java.lang.String str16 = fastDateFormat1.toString();
        java.util.Calendar calendar17 = null;
        java.lang.String str18 = fastDateFormat1.format(calendar17);
        java.util.Date date19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = fastDateFormat1.format(date19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertNull(stringBuffer4);
        org.junit.Assert.assertNull(stringBuffer7);
        org.junit.Assert.assertNull(stringBuffer10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "FastDateFormat[]" + "'", str11, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "FastDateFormat[]");
        org.junit.Assert.assertNull(stringBuffer15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "FastDateFormat[]" + "'", str16, "FastDateFormat[]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale11);
        java.util.TimeZone timeZone13 = fastDateFormat12.getTimeZone();
        java.util.Locale locale14 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone13, locale14);
        java.util.Locale locale16 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone13, locale16);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone13);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone13);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone13);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone13);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z");
        int int24 = fastDateFormat23.getMaxLengthEstimate();
        boolean boolean25 = fastDateFormat21.equals((java.lang.Object) int24);
        java.util.TimeZone timeZone26 = fastDateFormat21.getTimeZone();
        java.util.Locale locale31 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale31);
        java.util.TimeZone timeZone33 = fastDateFormat32.getTimeZone();
        java.util.Locale locale34 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone33, locale34);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale37 = fastDateFormat36.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone33, locale37);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone26, locale37);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, timeZone26);
        java.util.TimeZone timeZone44 = null;
        java.util.Locale locale45 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone44, locale45);
        java.util.Calendar calendar47 = null;
        java.lang.String str48 = fastDateFormat46.format(calendar47);
        java.util.TimeZone timeZone49 = fastDateFormat46.getTimeZone();
        java.util.Locale locale58 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat59 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale58);
        java.util.TimeZone timeZone60 = fastDateFormat59.getTimeZone();
        java.util.Locale locale61 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat62 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone60, locale61);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat63 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale64 = fastDateFormat63.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat65 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone60, locale64);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat66 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone60);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat67 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone60);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat68 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale69 = fastDateFormat68.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat70 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", timeZone60, locale69);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat71 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale69);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat72 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone49, locale69);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat73 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, locale69);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat74 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 2, timeZone26, locale69);
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 18 + "'", int24 == 18);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(timeZone49);
        org.junit.Assert.assertEquals(timeZone49.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat59);
        org.junit.Assert.assertNotNull(timeZone60);
        org.junit.Assert.assertEquals(timeZone60.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat62);
        org.junit.Assert.assertNotNull(fastDateFormat63);
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat65);
        org.junit.Assert.assertNotNull(fastDateFormat66);
        org.junit.Assert.assertNotNull(fastDateFormat67);
        org.junit.Assert.assertNotNull(fastDateFormat68);
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat70);
        org.junit.Assert.assertNotNull(fastDateFormat71);
        org.junit.Assert.assertNotNull(fastDateFormat72);
        org.junit.Assert.assertNotNull(fastDateFormat73);
        org.junit.Assert.assertNotNull(fastDateFormat74);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        java.util.Locale locale6 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale6);
        java.util.TimeZone timeZone8 = fastDateFormat7.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale10 = fastDateFormat9.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone8, locale10);
        int int12 = fastDateFormat11.getMaxLengthEstimate();
        java.util.Locale locale13 = fastDateFormat11.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, locale13);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale13);
        java.lang.Object obj16 = fastDateFormat15.clone();
        java.util.Locale locale17 = fastDateFormat15.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) -1, 42, locale17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 42");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "FastDateFormat[EEEE, MMMM d, yyyy]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "FastDateFormat[EEEE, MMMM d, yyyy]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "FastDateFormat[EEEE, MMMM d, yyyy]");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_US");
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale10);
        java.util.TimeZone timeZone12 = fastDateFormat11.getTimeZone();
        java.util.Locale locale13 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone12, locale13);
        java.util.Locale locale15 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone12, locale15);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone12);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3);
        boolean boolean20 = fastDateFormat19.getTimeZoneOverridesCalendar();
        java.util.Locale locale21 = fastDateFormat19.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, 0, timeZone12, locale21);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (short) 1);
        java.util.Locale locale27 = fastDateFormat26.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy h:mm:ss a z", locale27);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy h:mm a", timeZone12, locale27);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone12);
        java.util.Locale locale36 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale36);
        java.util.TimeZone timeZone38 = fastDateFormat37.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale40 = fastDateFormat39.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone38, locale40);
        int int42 = fastDateFormat41.getMaxLengthEstimate();
        java.util.Locale locale43 = fastDateFormat41.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, locale43);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale43);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, locale43);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (short) 1, timeZone12, locale43);
        boolean boolean48 = fastDateFormat47.getTimeZoneOverridesCalendar();
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(timeZone38);
        org.junit.Assert.assertEquals(timeZone38.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale4);
        java.util.TimeZone timeZone6 = fastDateFormat5.getTimeZone();
        java.util.Locale locale7 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone6, locale7);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale10 = fastDateFormat9.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone6, locale10);
        java.lang.String str13 = fastDateFormat11.format(0L);
        java.util.TimeZone timeZone14 = fastDateFormat11.getTimeZone();
        java.lang.Object obj15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator16 = fastDateFormat11.formatToCharacterIterator(obj15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: <null>");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Thursday, January 1, 1970 12:00 AM" + "'", str13, "Thursday, January 1, 1970 12:00 AM");
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale10);
        java.util.TimeZone timeZone12 = fastDateFormat11.getTimeZone();
        java.util.Locale locale13 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone12, locale13);
        java.util.Locale locale15 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone12, locale15);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone12);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3);
        boolean boolean20 = fastDateFormat19.getTimeZoneOverridesCalendar();
        java.util.Locale locale21 = fastDateFormat19.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, 0, timeZone12, locale21);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (short) 1);
        java.util.Locale locale27 = fastDateFormat26.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy h:mm:ss a z", locale27);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy h:mm a", timeZone12, locale27);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone12);
        java.util.Locale locale36 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale36);
        java.util.TimeZone timeZone38 = fastDateFormat37.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale40 = fastDateFormat39.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone38, locale40);
        int int42 = fastDateFormat41.getMaxLengthEstimate();
        java.util.Locale locale43 = fastDateFormat41.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, locale43);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale43);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, locale43);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (short) 1, timeZone12, locale43);
        java.util.TimeZone timeZone48 = fastDateFormat47.getTimeZone();
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(timeZone38);
        org.junit.Assert.assertEquals(timeZone38.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertNotNull(timeZone48);
        org.junit.Assert.assertEquals(timeZone48.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar3 = null;
        java.lang.String str4 = fastDateFormat2.format(calendar3);
        java.lang.Object obj5 = fastDateFormat2.clone();
        int int6 = fastDateFormat2.getMaxLengthEstimate();
        java.lang.Object obj7 = fastDateFormat2.clone();
        java.util.Locale locale8 = fastDateFormat2.getLocale();
        java.util.TimeZone timeZone9 = fastDateFormat2.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone9);
        boolean boolean11 = fastDateFormat10.getTimeZoneOverridesCalendar();
        int int12 = fastDateFormat10.getMaxLengthEstimate();
        java.util.Locale locale17 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale17);
        java.util.TimeZone timeZone19 = fastDateFormat18.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale21 = fastDateFormat20.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone19, locale21);
        int int23 = fastDateFormat22.getMaxLengthEstimate();
        java.util.Locale locale24 = fastDateFormat22.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, locale24);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy h:mm:ss a z", locale24);
        java.lang.Class<?> wildcardClass27 = fastDateFormat26.getClass();
        boolean boolean28 = fastDateFormat10.equals((java.lang.Object) wildcardClass27);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = fastDateFormat10.parseObject("12:00 AM");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "FastDateFormat[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "FastDateFormat[]");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 31 + "'", int12 == 31);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar2 = null;
        java.lang.StringBuffer stringBuffer3 = null;
        java.lang.StringBuffer stringBuffer4 = fastDateFormat1.format(calendar2, stringBuffer3);
        java.util.Calendar calendar5 = null;
        java.lang.StringBuffer stringBuffer6 = null;
        java.lang.StringBuffer stringBuffer7 = fastDateFormat1.format(calendar5, stringBuffer6);
        java.lang.StringBuffer stringBuffer9 = null;
        java.lang.StringBuffer stringBuffer10 = fastDateFormat1.format((long) (byte) 100, stringBuffer9);
        java.lang.String str11 = fastDateFormat1.getPattern();
        java.util.TimeZone timeZone12 = fastDateFormat1.getTimeZone();
        java.lang.StringBuffer stringBuffer14 = null;
        java.lang.StringBuffer stringBuffer15 = fastDateFormat1.format((long) (byte) 0, stringBuffer14);
        java.util.TimeZone timeZone16 = fastDateFormat1.getTimeZone();
        java.util.Calendar calendar17 = null;
        java.lang.StringBuffer stringBuffer18 = null;
        java.lang.StringBuffer stringBuffer19 = fastDateFormat1.format(calendar17, stringBuffer18);
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertNull(stringBuffer4);
        org.junit.Assert.assertNull(stringBuffer7);
        org.junit.Assert.assertNull(stringBuffer10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNull(stringBuffer15);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNull(stringBuffer19);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (short) 1);
        java.util.Locale locale5 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale5);
        java.util.TimeZone timeZone7 = fastDateFormat6.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale9 = fastDateFormat8.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone7, locale9);
        boolean boolean11 = fastDateFormat10.getTimeZoneOverridesCalendar();
        java.lang.String str13 = fastDateFormat10.format((long) '#');
        java.util.Locale locale14 = fastDateFormat10.getLocale();
        java.lang.StringBuffer stringBuffer16 = null;
        java.lang.StringBuffer stringBuffer17 = fastDateFormat10.format((long) (byte) 0, stringBuffer16);
        boolean boolean18 = fastDateFormat2.equals((java.lang.Object) fastDateFormat10);
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertNull(stringBuffer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale4);
        java.util.TimeZone timeZone6 = fastDateFormat5.getTimeZone();
        java.util.Locale locale7 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone6, locale7);
        java.util.Locale locale13 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale13);
        java.util.TimeZone timeZone15 = fastDateFormat14.getTimeZone();
        java.util.Locale locale16 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone15, locale16);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale19 = fastDateFormat18.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone15, locale19);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone6, locale19);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone6);
        int int23 = fastDateFormat22.getMaxLengthEstimate();
        boolean boolean24 = fastDateFormat22.getTimeZoneOverridesCalendar();
        java.lang.Object obj25 = fastDateFormat22.clone();
        java.util.Calendar calendar26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = fastDateFormat22.format(calendar26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "FastDateFormat[]");
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        java.util.Locale locale7 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale7);
        java.util.TimeZone timeZone9 = fastDateFormat8.getTimeZone();
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone9, locale10);
        java.util.Locale locale12 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone9, locale12);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone9);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone9);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) '#', timeZone9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 35");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat16);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale3);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale7 = fastDateFormat6.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone5, locale7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(17, locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 17");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat8);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale2 = fastDateFormat1.getLocale();
        boolean boolean3 = fastDateFormat1.getTimeZoneOverridesCalendar();
        java.lang.Object obj4 = fastDateFormat1.clone();
        java.util.Locale locale5 = fastDateFormat1.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(21, locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 21");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[M/d/yy h:mm a]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "FastDateFormat[M/d/yy h:mm a]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "FastDateFormat[M/d/yy h:mm a]");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone1, locale2);
        int int4 = fastDateFormat3.getMaxLengthEstimate();
        java.util.Locale locale5 = fastDateFormat3.getLocale();
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale11);
        java.util.TimeZone timeZone13 = fastDateFormat12.getTimeZone();
        java.util.Locale locale14 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone13, locale14);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale17 = fastDateFormat16.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone13, locale17);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone13);
        boolean boolean20 = fastDateFormat3.equals((java.lang.Object) timeZone13);
        int int21 = fastDateFormat3.getMaxLengthEstimate();
        int int22 = fastDateFormat3.getMaxLengthEstimate();
        java.util.Calendar calendar23 = null;
        java.lang.String str24 = fastDateFormat3.format(calendar23);
        java.util.Calendar calendar25 = null;
        java.lang.StringBuffer stringBuffer26 = null;
        java.lang.StringBuffer stringBuffer27 = fastDateFormat3.format(calendar25, stringBuffer26);
        java.lang.String str29 = fastDateFormat3.format((long) 'a');
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(stringBuffer27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(17, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 35");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone4 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) '4', timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 52");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat5);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar2 = null;
        java.lang.String str3 = fastDateFormat1.format(calendar2);
        java.lang.StringBuffer stringBuffer5 = null;
        java.lang.StringBuffer stringBuffer6 = fastDateFormat1.format((long) 'a', stringBuffer5);
        boolean boolean7 = fastDateFormat1.getTimeZoneOverridesCalendar();
        java.lang.String str8 = fastDateFormat1.toString();
        boolean boolean9 = fastDateFormat1.getTimeZoneOverridesCalendar();
        java.util.TimeZone timeZone10 = fastDateFormat1.getTimeZone();
        java.util.Locale locale18 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale18);
        java.util.TimeZone timeZone20 = fastDateFormat19.getTimeZone();
        java.util.Locale locale21 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone20, locale21);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale24 = fastDateFormat23.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone20, locale24);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone20);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone20);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale29 = fastDateFormat28.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", timeZone20, locale29);
        int int31 = fastDateFormat30.getMaxLengthEstimate();
        java.lang.String str33 = fastDateFormat30.format((long) (byte) 0);
        java.util.Locale locale38 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale38);
        java.util.TimeZone timeZone40 = fastDateFormat39.getTimeZone();
        java.util.Locale locale41 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone40, locale41);
        java.util.Locale locale43 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone40, locale43);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone40);
        boolean boolean46 = fastDateFormat30.equals((java.lang.Object) timeZone40);
        boolean boolean47 = fastDateFormat1.equals((java.lang.Object) boolean46);
        java.lang.String str48 = fastDateFormat1.toString();
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(stringBuffer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "FastDateFormat[]" + "'", str8, "FastDateFormat[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 17 + "'", int31 == 17);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "12:00:00 AM UTC" + "'", str33, "12:00:00 AM UTC");
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(timeZone40);
        org.junit.Assert.assertEquals(timeZone40.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "FastDateFormat[]" + "'", str48, "FastDateFormat[]");
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        java.util.Locale locale6 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale6);
        java.util.TimeZone timeZone8 = fastDateFormat7.getTimeZone();
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone8, locale9);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale12 = fastDateFormat11.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone8, locale12);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone8);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, timeZone8);
        boolean boolean17 = fastDateFormat15.equals((java.lang.Object) 100);
        java.util.Locale locale21 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale21);
        java.util.TimeZone timeZone23 = fastDateFormat22.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale25 = fastDateFormat24.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone23, locale25);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone23);
        java.lang.String str28 = fastDateFormat27.getPattern();
        boolean boolean29 = fastDateFormat15.equals((java.lang.Object) fastDateFormat27);
        java.lang.Object obj30 = fastDateFormat27.clone();
        java.util.TimeZone timeZone31 = fastDateFormat27.getTimeZone();
        java.util.Locale locale39 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale39);
        java.util.TimeZone timeZone41 = fastDateFormat40.getTimeZone();
        java.util.Locale locale42 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone41, locale42);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale45 = fastDateFormat44.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone41, locale45);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone41);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone41);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale50 = fastDateFormat49.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat51 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", timeZone41, locale50);
        int int52 = fastDateFormat51.getMaxLengthEstimate();
        java.lang.String str54 = fastDateFormat51.format((long) (byte) 0);
        boolean boolean55 = fastDateFormat51.getTimeZoneOverridesCalendar();
        boolean boolean56 = fastDateFormat51.getTimeZoneOverridesCalendar();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator57 = fastDateFormat27.formatToCharacterIterator((java.lang.Object) boolean56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "h:mm a" + "'", str28, "h:mm a");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "FastDateFormat[h:mm a]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "FastDateFormat[h:mm a]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "FastDateFormat[h:mm a]");
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(timeZone41);
        org.junit.Assert.assertEquals(timeZone41.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertNotNull(fastDateFormat48);
        org.junit.Assert.assertNotNull(fastDateFormat49);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 17 + "'", int52 == 17);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "12:00:00 AM UTC" + "'", str54, "12:00:00 AM UTC");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 0, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 13");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        java.util.TimeZone timeZone3 = null;
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone3, locale4);
        int int6 = fastDateFormat5.getMaxLengthEstimate();
        java.util.Locale locale7 = fastDateFormat5.getLocale();
        java.util.Locale locale13 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale13);
        java.util.TimeZone timeZone15 = fastDateFormat14.getTimeZone();
        java.util.Locale locale16 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone15, locale16);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale19 = fastDateFormat18.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone15, locale19);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone15);
        boolean boolean22 = fastDateFormat5.equals((java.lang.Object) timeZone15);
        java.util.Locale locale31 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale31);
        java.util.TimeZone timeZone33 = fastDateFormat32.getTimeZone();
        java.util.Locale locale34 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone33, locale34);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale37 = fastDateFormat36.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone33, locale37);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone33);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone33);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale42 = fastDateFormat41.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", timeZone33, locale42);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", locale42);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone15, locale42);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang3.time.FastDateFormat.getInstance("1/1/70", timeZone15);
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNotNull(fastDateFormat46);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        java.util.Locale locale7 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale7);
        java.util.TimeZone timeZone9 = fastDateFormat8.getTimeZone();
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone9, locale10);
        java.util.Locale locale12 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone9, locale12);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone9);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone9);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2);
        java.lang.String str19 = fastDateFormat17.format(0L);
        java.util.Locale locale20 = fastDateFormat17.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, timeZone9, locale20);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone9);
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "12:00:00 AM" + "'", str19, "12:00:00 AM");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(fastDateFormat22);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale4);
        java.util.TimeZone timeZone6 = fastDateFormat5.getTimeZone();
        java.util.Locale locale7 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone6, locale7);
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone6, locale9);
        java.util.Locale locale16 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale16);
        java.util.TimeZone timeZone18 = fastDateFormat17.getTimeZone();
        java.util.Locale locale19 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone18, locale19);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale22 = fastDateFormat21.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone18, locale22);
        java.util.Locale locale29 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale29);
        java.util.TimeZone timeZone31 = fastDateFormat30.getTimeZone();
        java.util.Locale locale32 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone31, locale32);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale35 = fastDateFormat34.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone31, locale35);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2, timeZone31);
        int int38 = fastDateFormat37.getMaxLengthEstimate();
        java.util.Locale locale39 = fastDateFormat37.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone18, locale39);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone6, locale39);
        int int42 = fastDateFormat41.getMaxLengthEstimate();
        java.text.ParsePosition parsePosition44 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj45 = fastDateFormat41.parseObject("h:mm:ss a z", parsePosition44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 13 + "'", int38 == 13);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 17 + "'", int42 == 17);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale9);
        java.util.TimeZone timeZone11 = fastDateFormat10.getTimeZone();
        java.util.Locale locale12 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone11, locale12);
        java.util.Locale locale14 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone11, locale14);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone11);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone11);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2);
        java.lang.String str21 = fastDateFormat19.format(0L);
        java.util.Locale locale22 = fastDateFormat19.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, timeZone11, locale22);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone11);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy h:mm:ss a z", timeZone11);
        java.util.Locale locale34 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale34);
        java.util.TimeZone timeZone36 = fastDateFormat35.getTimeZone();
        java.util.Locale locale37 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone36, locale37);
        java.util.Locale locale39 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone36, locale39);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone36);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone36);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone36);
        java.util.Locale locale49 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat50 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale49);
        java.util.TimeZone timeZone51 = fastDateFormat50.getTimeZone();
        java.util.Locale locale52 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat53 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone51, locale52);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat54 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale55 = fastDateFormat54.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat56 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone51, locale55);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat57 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone51);
        java.util.Locale locale58 = fastDateFormat57.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat59 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a", timeZone36, locale58);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat60 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a", locale58);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat61 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone11, locale58);
        java.util.Date date62 = null;
        java.lang.StringBuffer stringBuffer63 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer64 = fastDateFormat61.format(date62, stringBuffer63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "12:00:00 AM" + "'", str21, "12:00:00 AM");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(timeZone36);
        org.junit.Assert.assertEquals(timeZone36.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(fastDateFormat50);
        org.junit.Assert.assertNotNull(timeZone51);
        org.junit.Assert.assertEquals(timeZone51.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat53);
        org.junit.Assert.assertNotNull(fastDateFormat54);
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat56);
        org.junit.Assert.assertNotNull(fastDateFormat57);
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat59);
        org.junit.Assert.assertNotNull(fastDateFormat60);
        org.junit.Assert.assertNotNull(fastDateFormat61);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale2 = fastDateFormat1.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, locale2);
        java.lang.String str5 = fastDateFormat3.format((long) 31);
        java.util.Calendar calendar6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = fastDateFormat3.format(calendar6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Thursday, January 1, 1970" + "'", str5, "Thursday, January 1, 1970");
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar2 = null;
        java.lang.StringBuffer stringBuffer3 = null;
        java.lang.StringBuffer stringBuffer4 = fastDateFormat1.format(calendar2, stringBuffer3);
        java.util.Calendar calendar5 = null;
        java.lang.StringBuffer stringBuffer6 = null;
        java.lang.StringBuffer stringBuffer7 = fastDateFormat1.format(calendar5, stringBuffer6);
        java.lang.StringBuffer stringBuffer9 = null;
        java.lang.StringBuffer stringBuffer10 = fastDateFormat1.format((long) (byte) 100, stringBuffer9);
        java.lang.String str11 = fastDateFormat1.getPattern();
        java.util.TimeZone timeZone12 = fastDateFormat1.getTimeZone();
        java.lang.StringBuffer stringBuffer14 = null;
        java.lang.StringBuffer stringBuffer15 = fastDateFormat1.format((long) (byte) 0, stringBuffer14);
        java.util.TimeZone timeZone16 = fastDateFormat1.getTimeZone();
        java.util.Locale locale17 = fastDateFormat1.getLocale();
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertNull(stringBuffer4);
        org.junit.Assert.assertNull(stringBuffer7);
        org.junit.Assert.assertNull(stringBuffer10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNull(stringBuffer15);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_US");
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("");
        boolean boolean3 = fastDateFormat1.equals((java.lang.Object) 100.0f);
        java.lang.String str5 = fastDateFormat1.format(0L);
        java.lang.String str6 = fastDateFormat1.getPattern();
        java.lang.String str7 = fastDateFormat1.toString();
        java.lang.String str8 = fastDateFormat1.toString();
        int int9 = fastDateFormat1.getMaxLengthEstimate();
        java.lang.Class<?> wildcardClass10 = fastDateFormat1.getClass();
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FastDateFormat[]" + "'", str7, "FastDateFormat[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "FastDateFormat[]" + "'", str8, "FastDateFormat[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(29, 17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 17");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale4);
        java.util.TimeZone timeZone6 = fastDateFormat5.getTimeZone();
        java.util.Locale locale15 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale15);
        java.util.TimeZone timeZone17 = fastDateFormat16.getTimeZone();
        java.util.Locale locale18 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone17, locale18);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale21 = fastDateFormat20.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone17, locale21);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone17);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone17);
        java.util.Locale locale28 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale28);
        java.util.TimeZone timeZone30 = fastDateFormat29.getTimeZone();
        java.util.Locale locale31 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone30, locale31);
        java.util.Locale locale37 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale37);
        java.util.TimeZone timeZone39 = fastDateFormat38.getTimeZone();
        java.util.Locale locale40 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone39, locale40);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale43 = fastDateFormat42.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone39, locale43);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone30, locale43);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone17, locale43);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale48 = fastDateFormat47.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone17, locale48);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat50 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone6, locale48);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat52 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale53 = fastDateFormat52.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat54 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, locale53);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat55 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy", timeZone6, locale53);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat56 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 1, timeZone6);
        java.lang.Object obj57 = fastDateFormat56.clone();
        boolean boolean58 = fastDateFormat56.getTimeZoneOverridesCalendar();
        int int59 = fastDateFormat56.getMaxLengthEstimate();
        java.lang.String str60 = fastDateFormat56.toString();
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(timeZone39);
        org.junit.Assert.assertEquals(timeZone39.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat49);
        org.junit.Assert.assertNotNull(fastDateFormat50);
        org.junit.Assert.assertNotNull(fastDateFormat52);
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat54);
        org.junit.Assert.assertNotNull(fastDateFormat55);
        org.junit.Assert.assertNotNull(fastDateFormat56);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertEquals(obj57.toString(), "FastDateFormat[MMMM d, yyyy]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj57), "FastDateFormat[MMMM d, yyyy]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj57), "FastDateFormat[MMMM d, yyyy]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 20 + "'", int59 == 20);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "FastDateFormat[MMMM d, yyyy]" + "'", str60, "FastDateFormat[MMMM d, yyyy]");
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale3);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        java.util.Locale locale14 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale14);
        java.util.TimeZone timeZone16 = fastDateFormat15.getTimeZone();
        java.util.Locale locale17 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone16, locale17);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale20 = fastDateFormat19.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone16, locale20);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone16);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone16);
        java.util.Locale locale27 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale27);
        java.util.TimeZone timeZone29 = fastDateFormat28.getTimeZone();
        java.util.Locale locale30 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone29, locale30);
        java.util.Locale locale36 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale36);
        java.util.TimeZone timeZone38 = fastDateFormat37.getTimeZone();
        java.util.Locale locale39 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone38, locale39);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale42 = fastDateFormat41.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone38, locale42);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone29, locale42);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone16, locale42);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale47 = fastDateFormat46.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone16, locale47);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone5, locale47);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat50 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", locale47);
        java.util.TimeZone timeZone51 = fastDateFormat50.getTimeZone();
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(timeZone38);
        org.junit.Assert.assertEquals(timeZone38.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat48);
        org.junit.Assert.assertNotNull(fastDateFormat49);
        org.junit.Assert.assertNotNull(fastDateFormat50);
        org.junit.Assert.assertNotNull(timeZone51);
        org.junit.Assert.assertEquals(timeZone51.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale10);
        java.util.TimeZone timeZone12 = fastDateFormat11.getTimeZone();
        java.util.Locale locale13 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone12, locale13);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale16 = fastDateFormat15.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone12, locale16);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone12);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone12);
        java.util.Locale locale23 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale23);
        java.util.TimeZone timeZone25 = fastDateFormat24.getTimeZone();
        java.util.Locale locale26 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone25, locale26);
        java.util.Locale locale32 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale32);
        java.util.TimeZone timeZone34 = fastDateFormat33.getTimeZone();
        java.util.Locale locale35 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone34, locale35);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale38 = fastDateFormat37.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone34, locale38);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone25, locale38);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone12, locale38);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale43 = fastDateFormat42.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone12, locale43);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, locale43);
        java.util.Locale locale46 = fastDateFormat45.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, locale46);
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(timeZone34);
        org.junit.Assert.assertEquals(timeZone34.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat47);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale2 = fastDateFormat1.getLocale();
        java.util.Locale locale5 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale5);
        java.util.TimeZone timeZone7 = fastDateFormat6.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(1, timeZone7);
        boolean boolean9 = fastDateFormat1.equals((java.lang.Object) timeZone7);
        java.util.TimeZone timeZone10 = fastDateFormat1.getTimeZone();
        java.util.Locale locale11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(18, timeZone10, locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 18");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        java.util.Locale locale5 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale5);
        java.util.TimeZone timeZone7 = fastDateFormat6.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale9 = fastDateFormat8.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone7, locale9);
        int int11 = fastDateFormat10.getMaxLengthEstimate();
        java.util.Locale locale12 = fastDateFormat10.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, locale12);
        java.util.TimeZone timeZone14 = fastDateFormat13.getTimeZone();
        java.util.Locale locale21 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale21);
        java.util.TimeZone timeZone23 = fastDateFormat22.getTimeZone();
        java.util.Locale locale24 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone23, locale24);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale27 = fastDateFormat26.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone23, locale27);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2, timeZone23);
        java.util.Locale locale35 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale35);
        java.util.TimeZone timeZone37 = fastDateFormat36.getTimeZone();
        java.util.Locale locale38 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone37, locale38);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale41 = fastDateFormat40.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone37, locale41);
        java.util.Locale locale48 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale48);
        java.util.TimeZone timeZone50 = fastDateFormat49.getTimeZone();
        java.util.Locale locale51 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat52 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone50, locale51);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat53 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale54 = fastDateFormat53.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat55 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone50, locale54);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat56 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2, timeZone50);
        int int57 = fastDateFormat56.getMaxLengthEstimate();
        java.util.Locale locale58 = fastDateFormat56.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat59 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone37, locale58);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat60 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone23, locale58);
        boolean boolean61 = fastDateFormat13.equals((java.lang.Object) timeZone23);
        java.util.Locale locale70 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat71 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale70);
        java.util.TimeZone timeZone72 = fastDateFormat71.getTimeZone();
        java.util.Locale locale73 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat74 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone72, locale73);
        java.util.Locale locale75 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat76 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone72, locale75);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat77 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone72);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat78 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone72);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat79 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone72);
        java.util.Locale locale85 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat86 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale85);
        java.util.TimeZone timeZone87 = fastDateFormat86.getTimeZone();
        java.util.Locale locale88 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat89 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone87, locale88);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat90 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale91 = fastDateFormat90.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat92 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone87, locale91);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat93 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone87);
        java.util.Locale locale94 = fastDateFormat93.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat95 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a", timeZone72, locale94);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat96 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a", locale94);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat97 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(3, 0, timeZone23, locale94);
        java.util.Locale locale98 = fastDateFormat97.getLocale();
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(timeZone37);
        org.junit.Assert.assertEquals(timeZone37.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(fastDateFormat49);
        org.junit.Assert.assertNotNull(timeZone50);
        org.junit.Assert.assertEquals(timeZone50.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat52);
        org.junit.Assert.assertNotNull(fastDateFormat53);
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat55);
        org.junit.Assert.assertNotNull(fastDateFormat56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 13 + "'", int57 == 13);
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat59);
        org.junit.Assert.assertNotNull(fastDateFormat60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(fastDateFormat71);
        org.junit.Assert.assertNotNull(timeZone72);
        org.junit.Assert.assertEquals(timeZone72.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat74);
        org.junit.Assert.assertNotNull(fastDateFormat76);
        org.junit.Assert.assertNotNull(fastDateFormat77);
        org.junit.Assert.assertNotNull(fastDateFormat78);
        org.junit.Assert.assertNotNull(fastDateFormat79);
        org.junit.Assert.assertNotNull(fastDateFormat86);
        org.junit.Assert.assertNotNull(timeZone87);
        org.junit.Assert.assertEquals(timeZone87.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat89);
        org.junit.Assert.assertNotNull(fastDateFormat90);
        org.junit.Assert.assertNotNull(locale91);
        org.junit.Assert.assertEquals(locale91.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat92);
        org.junit.Assert.assertNotNull(fastDateFormat93);
        org.junit.Assert.assertNotNull(locale94);
        org.junit.Assert.assertEquals(locale94.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat95);
        org.junit.Assert.assertNotNull(fastDateFormat96);
        org.junit.Assert.assertNotNull(fastDateFormat97);
        org.junit.Assert.assertNotNull(locale98);
        org.junit.Assert.assertEquals(locale98.toString(), "en_US");
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        java.util.Locale locale5 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale5);
        java.util.TimeZone timeZone7 = fastDateFormat6.getTimeZone();
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone7, locale8);
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", timeZone7, locale10);
        java.util.TimeZone timeZone12 = fastDateFormat11.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2);
        java.lang.String str16 = fastDateFormat14.format(0L);
        java.util.Locale locale17 = fastDateFormat14.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone12, locale17);
        java.util.Locale locale19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(17, timeZone12, locale19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 17");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "12:00:00 AM" + "'", str16, "12:00:00 AM");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat18);
    }
}

