import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = null;
        dateTimeParserBucket5.saveField(dateTimeField9, 0);
        dateTimeParserBucket5.setOffset((int) (short) 100);
        int int14 = dateTimeParserBucket5.getOffset();
        org.joda.time.DateTimeField dateTimeField15 = null;
        dateTimeParserBucket5.saveField(dateTimeField15, 52);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = dateTimeParserBucket5.computeMillis(false, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology2, locale3);
        org.joda.time.DateTimeField dateTimeField5 = null;
        dateTimeParserBucket4.saveField(dateTimeField5, (int) (byte) 1);
        dateTimeParserBucket4.setOffset((java.lang.Integer) 10);
        dateTimeParserBucket4.setPivotYear((java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone12 = dateTimeParserBucket4.getZone();
        org.joda.time.Chronology chronology13 = dateTimeParserBucket4.getChronology();
        java.util.Locale locale14 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((-90L), chronology13, locale14, (java.lang.Integer) 35, (int) '4');
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale3, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket6.setOffset((int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket6.getChronology();
        long long10 = dateTimeParserBucket6.computeMillis();
        dateTimeParserBucket6.setOffset((java.lang.Integer) (-1));
        long long14 = dateTimeParserBucket6.computeMillis(false);
        org.joda.time.Chronology chronology15 = dateTimeParserBucket6.getChronology();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket(0L, chronology18, locale19, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        dateTimeParserBucket22.setZone(dateTimeZone23);
        int int25 = dateTimeParserBucket22.getOffset();
        org.joda.time.Chronology chronology26 = dateTimeParserBucket22.getChronology();
        org.joda.time.Chronology chronology28 = null;
        java.util.Locale locale29 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket(0L, chronology28, locale29, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket32.setOffset((int) 'a');
        org.joda.time.Chronology chronology35 = dateTimeParserBucket32.getChronology();
        java.util.Locale locale36 = dateTimeParserBucket32.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology26, locale36, (java.lang.Integer) 10, (int) '4');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology15, locale36, (java.lang.Integer) 10);
        long long44 = dateTimeParserBucket41.computeMillis(false, "hi!");
        int int45 = dateTimeParserBucket41.getOffset();
        int int46 = dateTimeParserBucket41.getOffset();
        org.joda.time.Chronology chronology47 = dateTimeParserBucket41.getChronology();
        dateTimeParserBucket41.setOffset((java.lang.Integer) 97);
        dateTimeParserBucket41.setOffset((java.lang.Integer) 100);
        org.joda.time.Chronology chronology52 = dateTimeParserBucket41.getChronology();
        long long55 = dateTimeParserBucket41.computeMillis(false, "hi!");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-97L) + "'", long10 == (-97L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-1L) + "'", long44 == (-1L));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + (-101L) + "'", long55 == (-101L));
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        int int7 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setOffset((int) (short) 10);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 10);
        long long12 = dateTimeParserBucket3.computeMillis();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-11L) + "'", long12 == (-11L));
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale3, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket6.setOffset((int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket6.getChronology();
        long long10 = dateTimeParserBucket6.computeMillis();
        dateTimeParserBucket6.setOffset((java.lang.Integer) (-1));
        long long14 = dateTimeParserBucket6.computeMillis(false);
        org.joda.time.Chronology chronology15 = dateTimeParserBucket6.getChronology();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket(0L, chronology18, locale19, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        dateTimeParserBucket22.setZone(dateTimeZone23);
        int int25 = dateTimeParserBucket22.getOffset();
        org.joda.time.Chronology chronology26 = dateTimeParserBucket22.getChronology();
        org.joda.time.Chronology chronology28 = null;
        java.util.Locale locale29 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket(0L, chronology28, locale29, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket32.setOffset((int) 'a');
        org.joda.time.Chronology chronology35 = dateTimeParserBucket32.getChronology();
        java.util.Locale locale36 = dateTimeParserBucket32.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology26, locale36, (java.lang.Integer) 10, (int) '4');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology15, locale36, (java.lang.Integer) 10);
        dateTimeParserBucket41.setOffset(1);
        java.util.Locale locale44 = dateTimeParserBucket41.getLocale();
        long long45 = dateTimeParserBucket41.computeMillis();
        int int46 = dateTimeParserBucket41.getOffset();
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-97L) + "'", long10 == (-97L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-2L) + "'", long45 == (-2L));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) (byte) 1);
        int int7 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) (-1));
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        org.joda.time.Chronology chronology12 = null;
        java.util.Locale locale13 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology12, locale13);
        java.lang.Integer int15 = dateTimeParserBucket14.getPivotYear();
        long long18 = dateTimeParserBucket14.computeMillis(false, "hi!");
        dateTimeParserBucket14.setOffset((java.lang.Integer) 10);
        boolean boolean21 = dateTimeParserBucket3.restoreState((java.lang.Object) 10);
        java.util.Locale locale22 = dateTimeParserBucket3.getLocale();
        java.lang.Integer int23 = dateTimeParserBucket3.getOffsetInteger();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNull(int15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
        org.junit.Assert.assertNull(int23);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((java.lang.Integer) 0);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket5.getZone();
        int int9 = dateTimeParserBucket5.getOffset();
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        long long8 = dateTimeParserBucket5.computeMillis();
        long long9 = dateTimeParserBucket5.computeMillis();
        org.joda.time.Chronology chronology11 = null;
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket(0L, chronology11, locale12, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket15.setOffset((int) 'a');
        long long19 = dateTimeParserBucket15.computeMillis(true);
        java.util.Locale locale20 = dateTimeParserBucket15.getLocale();
        dateTimeParserBucket15.setPivotYear((java.lang.Integer) 1);
        boolean boolean23 = dateTimeParserBucket5.restoreState((java.lang.Object) 1);
        long long24 = dateTimeParserBucket5.computeMillis();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-97L) + "'", long8 == (-97L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-97L) + "'", long19 == (-97L));
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-97L) + "'", long24 == (-97L));
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology2, locale3);
        dateTimeParserBucket4.setOffset((int) (byte) 100);
        org.joda.time.Chronology chronology7 = dateTimeParserBucket4.getChronology();
        int int8 = dateTimeParserBucket4.getOffset();
        org.joda.time.Chronology chronology9 = dateTimeParserBucket4.getChronology();
        org.joda.time.Chronology chronology12 = null;
        java.util.Locale locale13 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket(0L, chronology12, locale13, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        dateTimeParserBucket16.setZone(dateTimeZone17);
        int int19 = dateTimeParserBucket16.getOffset();
        org.joda.time.Chronology chronology20 = dateTimeParserBucket16.getChronology();
        org.joda.time.Chronology chronology22 = null;
        java.util.Locale locale23 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket(0L, chronology22, locale23, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket26.setOffset((int) 'a');
        org.joda.time.Chronology chronology29 = dateTimeParserBucket26.getChronology();
        java.util.Locale locale30 = dateTimeParserBucket26.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket33 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology20, locale30, (java.lang.Integer) 10, (int) '4');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket((-100L), chronology9, locale30);
        org.joda.time.DateTimeField dateTimeField35 = null;
        dateTimeParserBucket34.saveField(dateTimeField35, 1);
        java.lang.Integer int38 = dateTimeParserBucket34.getPivotYear();
        java.lang.Integer int39 = dateTimeParserBucket34.getOffsetInteger();
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "en_US");
        org.junit.Assert.assertNull(int38);
        org.junit.Assert.assertNull(int39);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long5 = dateTimeParserBucket3.computeMillis(false);
        dateTimeParserBucket3.setOffset((int) (byte) 100);
        int int8 = dateTimeParserBucket3.getOffset();
        long long10 = dateTimeParserBucket3.computeMillis(false);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeParserBucket3.getZone();
        long long12 = dateTimeParserBucket3.computeMillis();
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeParserBucket3.getZone();
        long long14 = dateTimeParserBucket3.computeMillis();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-101L) + "'", long10 == (-101L));
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-101L) + "'", long12 == (-101L));
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-101L) + "'", long14 == (-101L));
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.lang.Integer int9 = dateTimeParserBucket3.getPivotYear();
        java.lang.Object obj10 = dateTimeParserBucket3.saveState();
        int int11 = dateTimeParserBucket3.getOffset();
        long long14 = dateTimeParserBucket3.computeMillis(false, "hi!");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        int int4 = dateTimeParserBucket3.getOffset();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        dateTimeParserBucket3.setZone(dateTimeZone5);
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology8, locale9);
        long long13 = dateTimeParserBucket10.computeMillis(false, "hi!");
        java.lang.Object obj14 = dateTimeParserBucket10.saveState();
        org.joda.time.DateTimeZone dateTimeZone15 = dateTimeParserBucket10.getZone();
        dateTimeParserBucket3.setZone(dateTimeZone15);
        long long17 = dateTimeParserBucket3.computeMillis();
        java.lang.Integer int18 = dateTimeParserBucket3.getPivotYear();
        long long21 = dateTimeParserBucket3.computeMillis(true, "");
        java.lang.Object obj22 = dateTimeParserBucket3.saveState();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNull(int18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        int int7 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setOffset((int) (short) 10);
        java.util.Locale locale10 = dateTimeParserBucket3.getLocale();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) (-1));
        long long13 = dateTimeParserBucket3.computeMillis();
        org.joda.time.Chronology chronology14 = dateTimeParserBucket3.getChronology();
        org.joda.time.DateTimeZone dateTimeZone15 = dateTimeParserBucket3.getZone();
        long long18 = dateTimeParserBucket3.computeMillis(false, "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-11L) + "'", long13 == (-11L));
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-11L) + "'", long18 == (-11L));
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.lang.Object obj9 = dateTimeParserBucket3.saveState();
        java.util.Locale locale10 = dateTimeParserBucket3.getLocale();
        dateTimeParserBucket3.setOffset((int) (byte) -1);
        java.lang.Object obj13 = dateTimeParserBucket3.saveState();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale3, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        dateTimeParserBucket6.setZone(dateTimeZone7);
        int int9 = dateTimeParserBucket6.getOffset();
        org.joda.time.Chronology chronology10 = dateTimeParserBucket6.getChronology();
        org.joda.time.Chronology chronology12 = null;
        java.util.Locale locale13 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket(0L, chronology12, locale13, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket16.setOffset((int) 'a');
        org.joda.time.Chronology chronology19 = dateTimeParserBucket16.getChronology();
        java.util.Locale locale20 = dateTimeParserBucket16.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology10, locale20, (java.lang.Integer) 10, (int) '4');
        long long26 = dateTimeParserBucket23.computeMillis(true, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField7 = null;
        dateTimeParserBucket3.saveField(dateTimeField7, (int) (byte) 100);
        org.joda.time.Chronology chronology11 = null;
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology11, locale12);
        long long16 = dateTimeParserBucket13.computeMillis(false, "hi!");
        dateTimeParserBucket13.setOffset(0);
        java.util.Locale locale19 = dateTimeParserBucket13.getLocale();
        org.joda.time.DateTimeZone dateTimeZone20 = dateTimeParserBucket13.getZone();
        org.joda.time.Chronology chronology22 = null;
        java.util.Locale locale23 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket(0L, chronology22, locale23, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket26.setOffset((int) 'a');
        dateTimeParserBucket26.setPivotYear((java.lang.Integer) 0);
        org.joda.time.DateTimeZone dateTimeZone31 = dateTimeParserBucket26.getZone();
        boolean boolean32 = dateTimeParserBucket13.restoreState((java.lang.Object) dateTimeParserBucket26);
        org.joda.time.DateTimeZone dateTimeZone33 = dateTimeParserBucket13.getZone();
        dateTimeParserBucket3.setZone(dateTimeZone33);
        org.joda.time.Chronology chronology35 = dateTimeParserBucket3.getChronology();
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(chronology35);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 100);
        int int11 = dateTimeParserBucket5.getOffset();
        dateTimeParserBucket5.setOffset((java.lang.Integer) 35);
        org.joda.time.Chronology chronology14 = dateTimeParserBucket5.getChronology();
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(chronology14);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        org.joda.time.Chronology chronology6 = dateTimeParserBucket5.getChronology();
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket(0L, chronology8, locale9, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket12.setOffset((int) 'a');
        org.joda.time.Chronology chronology15 = dateTimeParserBucket12.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = null;
        dateTimeParserBucket12.saveField(dateTimeField16, 0);
        dateTimeParserBucket12.setOffset((int) (short) 100);
        dateTimeParserBucket12.setOffset((int) (short) 100);
        boolean boolean23 = dateTimeParserBucket5.restoreState((java.lang.Object) (short) 100);
        java.lang.Integer int24 = dateTimeParserBucket5.getOffsetInteger();
        dateTimeParserBucket5.setOffset((int) (short) 1);
        org.joda.time.Chronology chronology27 = dateTimeParserBucket5.getChronology();
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(int24);
        org.junit.Assert.assertNotNull(chronology27);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        dateTimeParserBucket5.setOffset((int) (byte) 100);
        int int10 = dateTimeParserBucket5.getOffset();
        java.util.Locale locale11 = dateTimeParserBucket5.getLocale();
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology13, locale14);
        long long18 = dateTimeParserBucket15.computeMillis(false, "hi!");
        dateTimeParserBucket15.setOffset(0);
        java.lang.Object obj21 = dateTimeParserBucket15.saveState();
        long long23 = dateTimeParserBucket15.computeMillis(false);
        org.joda.time.Chronology chronology25 = null;
        java.util.Locale locale26 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology25, locale26);
        int int28 = dateTimeParserBucket27.getOffset();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        dateTimeParserBucket27.setZone(dateTimeZone29);
        org.joda.time.Chronology chronology32 = null;
        java.util.Locale locale33 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology32, locale33);
        long long37 = dateTimeParserBucket34.computeMillis(false, "hi!");
        java.lang.Object obj38 = dateTimeParserBucket34.saveState();
        org.joda.time.DateTimeZone dateTimeZone39 = dateTimeParserBucket34.getZone();
        dateTimeParserBucket27.setZone(dateTimeZone39);
        dateTimeParserBucket15.setZone(dateTimeZone39);
        boolean boolean42 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeZone39);
        long long44 = dateTimeParserBucket5.computeMillis(false);
        java.util.Locale locale45 = dateTimeParserBucket5.getLocale();
        java.util.Locale locale46 = dateTimeParserBucket5.getLocale();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-1L) + "'", long37 == (-1L));
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-100L) + "'", long44 == (-100L));
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "en_US");
    }
}

