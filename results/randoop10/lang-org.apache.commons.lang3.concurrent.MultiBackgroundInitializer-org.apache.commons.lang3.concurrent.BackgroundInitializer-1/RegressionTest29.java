import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest29 {

    public static boolean debug = false;

    @Test
    public void test14501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14501");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture2 = multiBackgroundInitializer0.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults3 = multiBackgroundInitializer0.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture4 = multiBackgroundInitializer0.getFuture();
        java.util.concurrent.ExecutorService executorService5 = multiBackgroundInitializer0.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults6 = multiBackgroundInitializer0.get();
        java.util.Set<java.lang.String> strSet7 = multiBackgroundInitializerResults6.initializerNames();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture2);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults3);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture4);
        org.junit.Assert.assertNull(executorService5);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults6);
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void test14502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14502");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture2 = multiBackgroundInitializer0.getFuture();
        boolean boolean3 = multiBackgroundInitializerResultsFuture2.isDone();
        boolean boolean4 = multiBackgroundInitializerResultsFuture2.isCancelled();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults5 = multiBackgroundInitializerResultsFuture2.get();
        boolean boolean6 = multiBackgroundInitializerResultsFuture2.isCancelled();
        boolean boolean8 = multiBackgroundInitializerResultsFuture2.cancel(false);
        boolean boolean9 = multiBackgroundInitializerResultsFuture2.isDone();
        boolean boolean11 = multiBackgroundInitializerResultsFuture2.cancel(false);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults12 = multiBackgroundInitializerResultsFuture2.get();
        boolean boolean14 = multiBackgroundInitializerResultsFuture2.cancel(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test14503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14503");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        java.util.concurrent.ExecutorService executorService10 = null;
        multiBackgroundInitializer3.setExternalExecutor(executorService10);
        java.util.concurrent.ExecutorService executorService12 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean13 = multiBackgroundInitializer3.start();
        boolean boolean14 = multiBackgroundInitializer3.start();
        boolean boolean15 = multiBackgroundInitializer3.start();
        boolean boolean16 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults17 = multiBackgroundInitializer3.get();
        boolean boolean18 = multiBackgroundInitializer3.start();
        java.util.concurrent.ExecutorService executorService19 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean20 = multiBackgroundInitializer3.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture21 = multiBackgroundInitializer3.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture22 = multiBackgroundInitializer3.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults23 = multiBackgroundInitializer3.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture24 = multiBackgroundInitializer3.getFuture();
        boolean boolean25 = multiBackgroundInitializer3.isStarted();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture26 = multiBackgroundInitializer3.getFuture();
        boolean boolean27 = multiBackgroundInitializer3.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults28 = multiBackgroundInitializer3.get();
        boolean boolean29 = multiBackgroundInitializer3.isStarted();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executorService12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(executorService19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture21);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture22);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults23);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test14504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14504");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture2 = multiBackgroundInitializer0.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults3 = multiBackgroundInitializer0.get();
        java.util.concurrent.ExecutorService executorService4 = multiBackgroundInitializer0.getExternalExecutor();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture5 = multiBackgroundInitializer0.getFuture();
        boolean boolean6 = multiBackgroundInitializer0.isStarted();
        java.util.concurrent.ExecutorService executorService7 = multiBackgroundInitializer0.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults8 = multiBackgroundInitializer0.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults9 = multiBackgroundInitializer0.get();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.ConcurrentException concurrentException11 = multiBackgroundInitializerResults9.getException("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child initializer with name ");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture2);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults3);
        org.junit.Assert.assertNull(executorService4);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(executorService7);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults8);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults9);
    }

    @Test
    public void test14505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14505");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        boolean boolean6 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer8 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean9 = multiBackgroundInitializer8.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer11 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean12 = multiBackgroundInitializer11.isStarted();
        multiBackgroundInitializer8.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer11);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer15 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean16 = multiBackgroundInitializer15.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer18 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean19 = multiBackgroundInitializer18.isStarted();
        multiBackgroundInitializer15.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer18);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer22 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean23 = multiBackgroundInitializer22.isStarted();
        multiBackgroundInitializer18.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer22);
        boolean boolean25 = multiBackgroundInitializer18.start();
        multiBackgroundInitializer8.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer18);
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer18);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults28 = multiBackgroundInitializer18.get();
        boolean boolean29 = multiBackgroundInitializer18.isStarted();
        boolean boolean30 = multiBackgroundInitializer18.start();
        boolean boolean31 = multiBackgroundInitializer18.isStarted();
        java.util.concurrent.ExecutorService executorService32 = multiBackgroundInitializer18.getExternalExecutor();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture33 = multiBackgroundInitializer18.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults34 = multiBackgroundInitializer18.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults35 = multiBackgroundInitializer18.get();
        boolean boolean36 = multiBackgroundInitializer18.isStarted();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(executorService32);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture33);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults34);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test14506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14506");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer10 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean11 = multiBackgroundInitializer10.isStarted();
        multiBackgroundInitializer7.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer10);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer14 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean15 = multiBackgroundInitializer14.isStarted();
        multiBackgroundInitializer10.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer14);
        boolean boolean17 = multiBackgroundInitializer10.start();
        multiBackgroundInitializer0.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer10);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer20 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean21 = multiBackgroundInitializer20.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer23 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean24 = multiBackgroundInitializer23.isStarted();
        multiBackgroundInitializer20.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer23);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer27 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean28 = multiBackgroundInitializer27.isStarted();
        multiBackgroundInitializer23.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer27);
        java.util.concurrent.ExecutorService executorService30 = null;
        multiBackgroundInitializer23.setExternalExecutor(executorService30);
        java.util.concurrent.ExecutorService executorService32 = multiBackgroundInitializer23.getExternalExecutor();
        multiBackgroundInitializer0.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer23);
        boolean boolean34 = multiBackgroundInitializer0.start();
        boolean boolean35 = multiBackgroundInitializer0.isStarted();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture36 = multiBackgroundInitializer0.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture37 = multiBackgroundInitializer0.getFuture();
        boolean boolean38 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults39 = multiBackgroundInitializer0.get();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(executorService32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture36);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults39);
    }

    @Test
    public void test14507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14507");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        boolean boolean10 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults11 = multiBackgroundInitializer3.get();
        boolean boolean12 = multiBackgroundInitializer3.isStarted();
        java.util.concurrent.ExecutorService executorService13 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService14 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean15 = multiBackgroundInitializer3.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults16 = multiBackgroundInitializer3.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture17 = multiBackgroundInitializer3.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture18 = multiBackgroundInitializer3.getFuture();
        boolean boolean19 = multiBackgroundInitializer3.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture20 = multiBackgroundInitializer3.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture21 = multiBackgroundInitializer3.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture22 = multiBackgroundInitializer3.getFuture();
        boolean boolean24 = multiBackgroundInitializerResultsFuture22.cancel(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(executorService13);
        org.junit.Assert.assertNull(executorService14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults16);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture17);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture20);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture21);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test14508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14508");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer10 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean11 = multiBackgroundInitializer10.isStarted();
        multiBackgroundInitializer7.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer10);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer14 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean15 = multiBackgroundInitializer14.isStarted();
        multiBackgroundInitializer10.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer14);
        boolean boolean17 = multiBackgroundInitializer10.start();
        multiBackgroundInitializer0.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer10);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer20 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean21 = multiBackgroundInitializer20.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer23 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean24 = multiBackgroundInitializer23.isStarted();
        multiBackgroundInitializer20.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer23);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer27 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean28 = multiBackgroundInitializer27.isStarted();
        multiBackgroundInitializer23.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer27);
        java.util.concurrent.ExecutorService executorService30 = null;
        multiBackgroundInitializer23.setExternalExecutor(executorService30);
        java.util.concurrent.ExecutorService executorService32 = multiBackgroundInitializer23.getExternalExecutor();
        multiBackgroundInitializer0.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer23);
        boolean boolean34 = multiBackgroundInitializer0.start();
        boolean boolean35 = multiBackgroundInitializer0.start();
        java.util.concurrent.ExecutorService executorService36 = multiBackgroundInitializer0.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults37 = multiBackgroundInitializer0.get();
        java.util.concurrent.ExecutorService executorService38 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiBackgroundInitializer0.setExternalExecutor(executorService38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot set ExecutorService after start()!");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(executorService32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(executorService36);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults37);
    }

    @Test
    public void test14509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14509");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer10 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean11 = multiBackgroundInitializer10.isStarted();
        multiBackgroundInitializer7.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer10);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer14 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean15 = multiBackgroundInitializer14.isStarted();
        multiBackgroundInitializer10.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer14);
        boolean boolean17 = multiBackgroundInitializer10.start();
        multiBackgroundInitializer0.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer10);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer20 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean21 = multiBackgroundInitializer20.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer23 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean24 = multiBackgroundInitializer23.isStarted();
        multiBackgroundInitializer20.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer23);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer27 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean28 = multiBackgroundInitializer27.isStarted();
        multiBackgroundInitializer23.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer27);
        java.util.concurrent.ExecutorService executorService30 = null;
        multiBackgroundInitializer23.setExternalExecutor(executorService30);
        java.util.concurrent.ExecutorService executorService32 = multiBackgroundInitializer23.getExternalExecutor();
        multiBackgroundInitializer0.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer23);
        boolean boolean34 = multiBackgroundInitializer0.start();
        boolean boolean35 = multiBackgroundInitializer0.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults36 = multiBackgroundInitializer0.get();
        boolean boolean37 = multiBackgroundInitializer0.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture38 = multiBackgroundInitializer0.getFuture();
        boolean boolean39 = multiBackgroundInitializerResultsFuture38.isDone();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(executorService32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test14510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14510");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        boolean boolean10 = multiBackgroundInitializer3.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture11 = multiBackgroundInitializer3.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture12 = multiBackgroundInitializer3.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults13 = multiBackgroundInitializer3.get();
        boolean boolean14 = multiBackgroundInitializer3.isStarted();
        java.util.concurrent.ExecutorService executorService15 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiBackgroundInitializer3.setExternalExecutor(executorService15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot set ExecutorService after start()!");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture11);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture12);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test14511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14511");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        boolean boolean10 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults11 = multiBackgroundInitializer3.get();
        boolean boolean12 = multiBackgroundInitializer3.isStarted();
        java.util.concurrent.ExecutorService executorService13 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture14 = multiBackgroundInitializer3.getFuture();
        java.util.concurrent.ExecutorService executorService15 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean16 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults17 = multiBackgroundInitializer3.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults18 = multiBackgroundInitializer3.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture19 = multiBackgroundInitializer3.getFuture();
        java.util.concurrent.TimeUnit timeUnit21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults22 = multiBackgroundInitializerResultsFuture19.get((long) (byte) 100, timeUnit21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(executorService13);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture14);
        org.junit.Assert.assertNull(executorService15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults17);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults18);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture19);
    }

    @Test
    public void test14512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14512");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        boolean boolean10 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults11 = multiBackgroundInitializer3.get();
        boolean boolean12 = multiBackgroundInitializer3.isStarted();
        java.util.concurrent.ExecutorService executorService13 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture14 = multiBackgroundInitializer3.getFuture();
        boolean boolean15 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults16 = multiBackgroundInitializer3.get();
        java.util.concurrent.ExecutorService executorService17 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService18 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService19 = multiBackgroundInitializer3.getExternalExecutor();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(executorService13);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults16);
        org.junit.Assert.assertNull(executorService17);
        org.junit.Assert.assertNull(executorService18);
        org.junit.Assert.assertNull(executorService19);
    }

    @Test
    public void test14513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14513");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture2 = multiBackgroundInitializer0.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults3 = multiBackgroundInitializer0.get();
        java.util.concurrent.ExecutorService executorService4 = multiBackgroundInitializer0.getExternalExecutor();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture5 = multiBackgroundInitializer0.getFuture();
        java.util.concurrent.ExecutorService executorService6 = multiBackgroundInitializer0.getExternalExecutor();
        boolean boolean7 = multiBackgroundInitializer0.isStarted();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture8 = multiBackgroundInitializer0.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults9 = multiBackgroundInitializerResultsFuture8.get();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture2);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults3);
        org.junit.Assert.assertNull(executorService4);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture5);
        org.junit.Assert.assertNull(executorService6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture8);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults9);
    }

    @Test
    public void test14514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14514");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture2 = multiBackgroundInitializer0.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults3 = multiBackgroundInitializer0.get();
        java.util.concurrent.ExecutorService executorService4 = multiBackgroundInitializer0.getExternalExecutor();
        boolean boolean5 = multiBackgroundInitializer0.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture6 = multiBackgroundInitializer0.getFuture();
        boolean boolean7 = multiBackgroundInitializer0.isStarted();
        boolean boolean8 = multiBackgroundInitializer0.isStarted();
        boolean boolean9 = multiBackgroundInitializer0.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture10 = multiBackgroundInitializer0.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults11 = multiBackgroundInitializer0.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults12 = multiBackgroundInitializer0.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture13 = multiBackgroundInitializer0.getFuture();
        boolean boolean14 = multiBackgroundInitializer0.start();
        boolean boolean15 = multiBackgroundInitializer0.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults16 = multiBackgroundInitializer0.get();
        java.util.concurrent.ExecutorService executorService17 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiBackgroundInitializer0.setExternalExecutor(executorService17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot set ExecutorService after start()!");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture2);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults3);
        org.junit.Assert.assertNull(executorService4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture10);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults11);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults12);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults16);
    }

    @Test
    public void test14515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14515");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer10 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean11 = multiBackgroundInitializer10.isStarted();
        multiBackgroundInitializer7.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer10);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer14 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean15 = multiBackgroundInitializer14.isStarted();
        multiBackgroundInitializer10.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer14);
        boolean boolean17 = multiBackgroundInitializer10.start();
        multiBackgroundInitializer0.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer10);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer20 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean21 = multiBackgroundInitializer20.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer23 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean24 = multiBackgroundInitializer23.isStarted();
        multiBackgroundInitializer20.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer23);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer27 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean28 = multiBackgroundInitializer27.isStarted();
        multiBackgroundInitializer23.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer27);
        java.util.concurrent.ExecutorService executorService30 = null;
        multiBackgroundInitializer23.setExternalExecutor(executorService30);
        java.util.concurrent.ExecutorService executorService32 = multiBackgroundInitializer23.getExternalExecutor();
        multiBackgroundInitializer0.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer23);
        boolean boolean34 = multiBackgroundInitializer23.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults35 = multiBackgroundInitializer23.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults36 = multiBackgroundInitializer23.get();
        java.util.concurrent.ExecutorService executorService37 = multiBackgroundInitializer23.getExternalExecutor();
        boolean boolean38 = multiBackgroundInitializer23.start();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(executorService32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults35);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults36);
        org.junit.Assert.assertNull(executorService37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test14516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14516");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        java.util.concurrent.ExecutorService executorService10 = null;
        multiBackgroundInitializer3.setExternalExecutor(executorService10);
        boolean boolean12 = multiBackgroundInitializer3.start();
        java.util.concurrent.ExecutorService executorService13 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture14 = multiBackgroundInitializer3.getFuture();
        boolean boolean15 = multiBackgroundInitializer3.isStarted();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture16 = multiBackgroundInitializer3.getFuture();
        java.util.concurrent.ExecutorService executorService17 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService18 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean19 = multiBackgroundInitializer3.start();
        boolean boolean20 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults21 = multiBackgroundInitializer3.get();
        java.util.concurrent.ExecutorService executorService22 = multiBackgroundInitializer3.getExternalExecutor();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(executorService13);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture16);
        org.junit.Assert.assertNull(executorService17);
        org.junit.Assert.assertNull(executorService18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults21);
        org.junit.Assert.assertNull(executorService22);
    }

    @Test
    public void test14517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14517");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        boolean boolean6 = multiBackgroundInitializer0.isStarted();
        java.util.concurrent.ExecutorService executorService7 = null;
        multiBackgroundInitializer0.setExternalExecutor(executorService7);
        boolean boolean9 = multiBackgroundInitializer0.start();
        java.util.concurrent.ExecutorService executorService10 = multiBackgroundInitializer0.getExternalExecutor();
        boolean boolean11 = multiBackgroundInitializer0.start();
        java.util.concurrent.ExecutorService executorService12 = multiBackgroundInitializer0.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService13 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiBackgroundInitializer0.setExternalExecutor(executorService13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot set ExecutorService after start()!");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(executorService10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(executorService12);
    }

    @Test
    public void test14518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14518");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        java.util.concurrent.ExecutorService executorService10 = null;
        multiBackgroundInitializer3.setExternalExecutor(executorService10);
        java.util.concurrent.ExecutorService executorService12 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean13 = multiBackgroundInitializer3.start();
        boolean boolean14 = multiBackgroundInitializer3.start();
        boolean boolean15 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults16 = multiBackgroundInitializer3.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults17 = multiBackgroundInitializer3.get();
        boolean boolean18 = multiBackgroundInitializer3.isStarted();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture19 = multiBackgroundInitializer3.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults20 = multiBackgroundInitializer3.get();
        org.apache.commons.lang3.concurrent.BackgroundInitializer<?> wildcardBackgroundInitializer22 = multiBackgroundInitializerResults20.getInitializer("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executorService12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults16);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture19);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults20);
        org.junit.Assert.assertNotNull(wildcardBackgroundInitializer22);
    }

    @Test
    public void test14519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14519");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        java.util.concurrent.ExecutorService executorService6 = multiBackgroundInitializer3.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer8 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean9 = multiBackgroundInitializer8.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer11 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean12 = multiBackgroundInitializer11.isStarted();
        multiBackgroundInitializer8.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer11);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer15 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean16 = multiBackgroundInitializer15.isStarted();
        multiBackgroundInitializer11.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer15);
        multiBackgroundInitializer3.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer15);
        java.util.concurrent.ExecutorService executorService19 = null;
        multiBackgroundInitializer15.setExternalExecutor(executorService19);
        boolean boolean21 = multiBackgroundInitializer15.start();
        boolean boolean22 = multiBackgroundInitializer15.isStarted();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture23 = multiBackgroundInitializer15.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults24 = multiBackgroundInitializer15.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults25 = multiBackgroundInitializer15.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults26 = multiBackgroundInitializer15.get();
        boolean boolean27 = multiBackgroundInitializer15.start();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(executorService6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture23);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults24);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults25);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test14520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14520");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        boolean boolean10 = multiBackgroundInitializer7.isStarted();
        java.util.concurrent.ExecutorService executorService11 = multiBackgroundInitializer7.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService12 = null;
        multiBackgroundInitializer7.setExternalExecutor(executorService12);
        boolean boolean14 = multiBackgroundInitializer7.isStarted();
        java.util.concurrent.ExecutorService executorService15 = multiBackgroundInitializer7.getExternalExecutor();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(executorService11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(executorService15);
    }

    @Test
    public void test14521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14521");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        boolean boolean6 = multiBackgroundInitializer3.isStarted();
        boolean boolean7 = multiBackgroundInitializer3.start();
        java.util.concurrent.ExecutorService executorService8 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean9 = multiBackgroundInitializer3.start();
        boolean boolean10 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults11 = multiBackgroundInitializer3.get();
        java.util.concurrent.ExecutorService executorService12 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean13 = multiBackgroundInitializer3.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults14 = multiBackgroundInitializer3.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults15 = multiBackgroundInitializer3.get();
        boolean boolean16 = multiBackgroundInitializerResults15.isSuccessful();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(executorService8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults11);
        org.junit.Assert.assertNull(executorService12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults14);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test14522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14522");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer11 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean12 = multiBackgroundInitializer11.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer14 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean15 = multiBackgroundInitializer14.isStarted();
        multiBackgroundInitializer11.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer14);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer18 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean19 = multiBackgroundInitializer18.isStarted();
        multiBackgroundInitializer14.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer18);
        boolean boolean21 = multiBackgroundInitializer14.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture22 = multiBackgroundInitializer14.getFuture();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer14);
        boolean boolean24 = multiBackgroundInitializer14.isStarted();
        boolean boolean25 = multiBackgroundInitializer14.start();
        boolean boolean26 = multiBackgroundInitializer14.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults27 = multiBackgroundInitializer14.get();
        boolean boolean29 = multiBackgroundInitializerResults27.isException("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = multiBackgroundInitializerResults27.getResultObject("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child initializer with name ");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test14523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14523");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer11 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean12 = multiBackgroundInitializer11.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer14 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean15 = multiBackgroundInitializer14.isStarted();
        multiBackgroundInitializer11.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer14);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer18 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean19 = multiBackgroundInitializer18.isStarted();
        multiBackgroundInitializer14.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer18);
        java.util.concurrent.ExecutorService executorService21 = null;
        multiBackgroundInitializer14.setExternalExecutor(executorService21);
        java.util.concurrent.ExecutorService executorService23 = multiBackgroundInitializer14.getExternalExecutor();
        boolean boolean24 = multiBackgroundInitializer14.start();
        multiBackgroundInitializer7.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer14);
        java.util.concurrent.ExecutorService executorService26 = null;
        multiBackgroundInitializer7.setExternalExecutor(executorService26);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer29 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean30 = multiBackgroundInitializer29.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer32 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean33 = multiBackgroundInitializer32.isStarted();
        multiBackgroundInitializer29.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer32);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer36 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean37 = multiBackgroundInitializer36.isStarted();
        multiBackgroundInitializer32.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer36);
        java.util.concurrent.ExecutorService executorService39 = null;
        multiBackgroundInitializer32.setExternalExecutor(executorService39);
        java.util.concurrent.ExecutorService executorService41 = multiBackgroundInitializer32.getExternalExecutor();
        boolean boolean42 = multiBackgroundInitializer32.start();
        boolean boolean43 = multiBackgroundInitializer32.start();
        boolean boolean44 = multiBackgroundInitializer32.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture45 = multiBackgroundInitializer32.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults46 = multiBackgroundInitializer32.get();
        multiBackgroundInitializer7.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer32);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults48 = multiBackgroundInitializer32.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture49 = multiBackgroundInitializer32.getFuture();
        java.util.concurrent.ExecutorService executorService50 = multiBackgroundInitializer32.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService51 = multiBackgroundInitializer32.getExternalExecutor();
        boolean boolean52 = multiBackgroundInitializer32.start();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(executorService23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(executorService41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture45);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults46);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults48);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture49);
        org.junit.Assert.assertNull(executorService50);
        org.junit.Assert.assertNull(executorService51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test14524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14524");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture2 = multiBackgroundInitializer0.getFuture();
        boolean boolean3 = multiBackgroundInitializer0.start();
        java.util.concurrent.ExecutorService executorService4 = multiBackgroundInitializer0.getExternalExecutor();
        boolean boolean5 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults6 = multiBackgroundInitializer0.get();
        boolean boolean7 = multiBackgroundInitializer0.isStarted();
        boolean boolean8 = multiBackgroundInitializer0.start();
        boolean boolean9 = multiBackgroundInitializer0.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults10 = multiBackgroundInitializer0.get();
        java.util.concurrent.ExecutorService executorService11 = multiBackgroundInitializer0.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults12 = multiBackgroundInitializer0.get();
        java.util.Set<java.lang.String> strSet13 = multiBackgroundInitializerResults12.initializerNames();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(executorService4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults10);
        org.junit.Assert.assertNull(executorService11);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults12);
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test14525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14525");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        java.util.concurrent.ExecutorService executorService1 = multiBackgroundInitializer0.getExternalExecutor();
        boolean boolean2 = multiBackgroundInitializer0.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults3 = multiBackgroundInitializer0.get();
        java.util.concurrent.ExecutorService executorService4 = multiBackgroundInitializer0.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults5 = multiBackgroundInitializer0.get();
        java.util.Set<java.lang.String> strSet6 = multiBackgroundInitializerResults5.initializerNames();
        org.junit.Assert.assertNull(executorService1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults3);
        org.junit.Assert.assertNull(executorService4);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults5);
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test14526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14526");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer10 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean11 = multiBackgroundInitializer10.isStarted();
        multiBackgroundInitializer7.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer10);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer14 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean15 = multiBackgroundInitializer14.isStarted();
        multiBackgroundInitializer10.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer14);
        boolean boolean17 = multiBackgroundInitializer10.start();
        multiBackgroundInitializer0.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer10);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer20 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean21 = multiBackgroundInitializer20.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer23 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean24 = multiBackgroundInitializer23.isStarted();
        multiBackgroundInitializer20.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer23);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer27 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean28 = multiBackgroundInitializer27.isStarted();
        multiBackgroundInitializer23.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer27);
        java.util.concurrent.ExecutorService executorService30 = null;
        multiBackgroundInitializer23.setExternalExecutor(executorService30);
        java.util.concurrent.ExecutorService executorService32 = multiBackgroundInitializer23.getExternalExecutor();
        multiBackgroundInitializer0.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer23);
        boolean boolean34 = multiBackgroundInitializer0.start();
        boolean boolean35 = multiBackgroundInitializer0.start();
        boolean boolean36 = multiBackgroundInitializer0.isStarted();
        boolean boolean37 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults38 = multiBackgroundInitializer0.get();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(executorService32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults38);
    }

    @Test
    public void test14527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14527");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        boolean boolean10 = multiBackgroundInitializer3.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture11 = multiBackgroundInitializer3.getFuture();
        java.util.concurrent.ExecutorService executorService12 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean13 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults14 = multiBackgroundInitializer3.get();
        boolean boolean15 = multiBackgroundInitializer3.isStarted();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture16 = multiBackgroundInitializer3.getFuture();
        java.util.concurrent.ExecutorService executorService17 = multiBackgroundInitializer3.getExternalExecutor();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture11);
        org.junit.Assert.assertNull(executorService12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture16);
        org.junit.Assert.assertNull(executorService17);
    }

    @Test
    public void test14528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14528");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        java.util.concurrent.ExecutorService executorService6 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService7 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean8 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults9 = multiBackgroundInitializer3.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults10 = multiBackgroundInitializer3.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults11 = multiBackgroundInitializer3.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture12 = multiBackgroundInitializer3.getFuture();
        boolean boolean13 = multiBackgroundInitializer3.start();
        boolean boolean14 = multiBackgroundInitializer3.start();
        java.util.concurrent.ExecutorService executorService15 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService16 = multiBackgroundInitializer3.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults17 = multiBackgroundInitializer3.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture18 = multiBackgroundInitializer3.getFuture();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(executorService6);
        org.junit.Assert.assertNull(executorService7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults9);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults10);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults11);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(executorService15);
        org.junit.Assert.assertNull(executorService16);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults17);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture18);
    }

    @Test
    public void test14529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14529");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        java.util.concurrent.ExecutorService executorService6 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService7 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean8 = multiBackgroundInitializer3.start();
        boolean boolean9 = multiBackgroundInitializer3.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults10 = multiBackgroundInitializer3.get();
        java.util.Set<java.lang.String> strSet11 = multiBackgroundInitializerResults10.initializerNames();
        java.lang.Class<?> wildcardClass12 = multiBackgroundInitializerResults10.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(executorService6);
        org.junit.Assert.assertNull(executorService7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test14530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14530");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture2 = multiBackgroundInitializer0.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults3 = multiBackgroundInitializer0.get();
        boolean boolean4 = multiBackgroundInitializer0.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults5 = multiBackgroundInitializer0.get();
        boolean boolean6 = multiBackgroundInitializer0.start();
        boolean boolean7 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults8 = multiBackgroundInitializer0.get();
        boolean boolean9 = multiBackgroundInitializer0.isStarted();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture2);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test14531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14531");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer11 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean12 = multiBackgroundInitializer11.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer14 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean15 = multiBackgroundInitializer14.isStarted();
        multiBackgroundInitializer11.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer14);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer18 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean19 = multiBackgroundInitializer18.isStarted();
        multiBackgroundInitializer14.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer18);
        boolean boolean21 = multiBackgroundInitializer14.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture22 = multiBackgroundInitializer14.getFuture();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer14);
        boolean boolean24 = multiBackgroundInitializer14.isStarted();
        boolean boolean25 = multiBackgroundInitializer14.start();
        boolean boolean26 = multiBackgroundInitializer14.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults27 = multiBackgroundInitializer14.get();
        org.apache.commons.lang3.concurrent.BackgroundInitializer<?> wildcardBackgroundInitializer29 = multiBackgroundInitializerResults27.getInitializer("hi!");
        org.apache.commons.lang3.concurrent.BackgroundInitializer<?> wildcardBackgroundInitializer31 = multiBackgroundInitializerResults27.getInitializer("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults27);
        org.junit.Assert.assertNotNull(wildcardBackgroundInitializer29);
        org.junit.Assert.assertNotNull(wildcardBackgroundInitializer31);
    }

    @Test
    public void test14532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14532");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        boolean boolean6 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer8 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean9 = multiBackgroundInitializer8.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer11 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean12 = multiBackgroundInitializer11.isStarted();
        multiBackgroundInitializer8.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer11);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer15 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean16 = multiBackgroundInitializer15.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer18 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean19 = multiBackgroundInitializer18.isStarted();
        multiBackgroundInitializer15.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer18);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer22 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean23 = multiBackgroundInitializer22.isStarted();
        multiBackgroundInitializer18.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer22);
        boolean boolean25 = multiBackgroundInitializer18.start();
        multiBackgroundInitializer8.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer18);
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer18);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults28 = multiBackgroundInitializer18.get();
        boolean boolean29 = multiBackgroundInitializer18.isStarted();
        boolean boolean30 = multiBackgroundInitializer18.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture31 = multiBackgroundInitializer18.getFuture();
        boolean boolean32 = multiBackgroundInitializer18.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults33 = multiBackgroundInitializer18.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture34 = multiBackgroundInitializer18.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture35 = multiBackgroundInitializer18.getFuture();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults33);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture34);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture35);
    }

    @Test
    public void test14533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14533");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        boolean boolean6 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer8 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean9 = multiBackgroundInitializer8.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer11 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean12 = multiBackgroundInitializer11.isStarted();
        multiBackgroundInitializer8.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer11);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer15 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean16 = multiBackgroundInitializer15.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer18 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean19 = multiBackgroundInitializer18.isStarted();
        multiBackgroundInitializer15.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer18);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer22 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean23 = multiBackgroundInitializer22.isStarted();
        multiBackgroundInitializer18.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer22);
        boolean boolean25 = multiBackgroundInitializer18.start();
        multiBackgroundInitializer8.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer18);
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer18);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults28 = multiBackgroundInitializer18.get();
        boolean boolean29 = multiBackgroundInitializer18.isStarted();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture30 = multiBackgroundInitializer18.getFuture();
        boolean boolean31 = multiBackgroundInitializer18.start();
        boolean boolean32 = multiBackgroundInitializer18.isStarted();
        boolean boolean33 = multiBackgroundInitializer18.start();
        boolean boolean34 = multiBackgroundInitializer18.isStarted();
        java.util.concurrent.ExecutorService executorService35 = multiBackgroundInitializer18.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer37 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean38 = multiBackgroundInitializer37.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer40 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean41 = multiBackgroundInitializer40.isStarted();
        multiBackgroundInitializer37.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer40);
        java.util.concurrent.ExecutorService executorService43 = multiBackgroundInitializer40.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService44 = null;
        multiBackgroundInitializer40.setExternalExecutor(executorService44);
        java.util.concurrent.ExecutorService executorService46 = null;
        multiBackgroundInitializer40.setExternalExecutor(executorService46);
        boolean boolean48 = multiBackgroundInitializer40.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture49 = multiBackgroundInitializer40.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture50 = multiBackgroundInitializer40.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture51 = multiBackgroundInitializer40.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture52 = multiBackgroundInitializer40.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults53 = multiBackgroundInitializer40.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture54 = multiBackgroundInitializer40.getFuture();
        java.util.concurrent.ExecutorService executorService55 = multiBackgroundInitializer40.getExternalExecutor();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture56 = multiBackgroundInitializer40.getFuture();
        // The following exception was thrown during execution in test generation
        try {
            multiBackgroundInitializer18.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: addInitializer() must not be called after start()!");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(executorService35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(executorService43);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture49);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture50);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture51);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture52);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults53);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture54);
        org.junit.Assert.assertNull(executorService55);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture56);
    }

    @Test
    public void test14534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14534");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        boolean boolean6 = multiBackgroundInitializer3.isStarted();
        boolean boolean7 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults8 = multiBackgroundInitializer3.get();
        java.util.concurrent.ExecutorService executorService9 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean10 = multiBackgroundInitializer3.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture11 = multiBackgroundInitializer3.getFuture();
        java.util.concurrent.ExecutorService executorService12 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean13 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults14 = multiBackgroundInitializer3.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer16 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean17 = multiBackgroundInitializer16.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture18 = multiBackgroundInitializer16.getFuture();
        boolean boolean19 = multiBackgroundInitializer16.start();
        java.util.concurrent.ExecutorService executorService20 = multiBackgroundInitializer16.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService21 = multiBackgroundInitializer16.getExternalExecutor();
        boolean boolean22 = multiBackgroundInitializer16.start();
        boolean boolean23 = multiBackgroundInitializer16.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults24 = multiBackgroundInitializer16.get();
        // The following exception was thrown during execution in test generation
        try {
            multiBackgroundInitializer3.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: addInitializer() must not be called after start()!");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults8);
        org.junit.Assert.assertNull(executorService9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture11);
        org.junit.Assert.assertNull(executorService12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(executorService20);
        org.junit.Assert.assertNull(executorService21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults24);
    }

    @Test
    public void test14535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14535");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        boolean boolean10 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults11 = multiBackgroundInitializer3.get();
        boolean boolean12 = multiBackgroundInitializer3.isStarted();
        java.util.concurrent.ExecutorService executorService13 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture14 = multiBackgroundInitializer3.getFuture();
        boolean boolean15 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults16 = multiBackgroundInitializer3.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults17 = multiBackgroundInitializer3.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture18 = multiBackgroundInitializer3.getFuture();
        boolean boolean19 = multiBackgroundInitializerResultsFuture18.isDone();
        boolean boolean21 = multiBackgroundInitializerResultsFuture18.cancel(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(executorService13);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults16);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults17);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test14536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14536");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        java.util.concurrent.ExecutorService executorService6 = null;
        multiBackgroundInitializer3.setExternalExecutor(executorService6);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer9 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean10 = multiBackgroundInitializer9.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer12 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean13 = multiBackgroundInitializer12.isStarted();
        multiBackgroundInitializer9.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer12);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer16 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean17 = multiBackgroundInitializer16.isStarted();
        multiBackgroundInitializer12.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer16);
        boolean boolean19 = multiBackgroundInitializer12.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults20 = multiBackgroundInitializer12.get();
        boolean boolean21 = multiBackgroundInitializer12.isStarted();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture22 = multiBackgroundInitializer12.getFuture();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer12);
        java.util.concurrent.ExecutorService executorService24 = multiBackgroundInitializer3.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer26 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean27 = multiBackgroundInitializer26.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer29 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean30 = multiBackgroundInitializer29.isStarted();
        multiBackgroundInitializer26.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer29);
        boolean boolean32 = multiBackgroundInitializer26.isStarted();
        boolean boolean33 = multiBackgroundInitializer26.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture34 = multiBackgroundInitializer26.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture35 = multiBackgroundInitializer26.getFuture();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer26);
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture37 = multiBackgroundInitializer26.getFuture();
        java.util.concurrent.ExecutorService executorService38 = multiBackgroundInitializer26.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults39 = multiBackgroundInitializer26.get();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture22);
        org.junit.Assert.assertNull(executorService24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture34);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture35);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture37);
        org.junit.Assert.assertNull(executorService38);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults39);
    }

    @Test
    public void test14537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14537");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        boolean boolean10 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults11 = multiBackgroundInitializer3.get();
        boolean boolean12 = multiBackgroundInitializer3.isStarted();
        java.util.concurrent.ExecutorService executorService13 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture14 = multiBackgroundInitializer3.getFuture();
        boolean boolean15 = multiBackgroundInitializer3.start();
        boolean boolean16 = multiBackgroundInitializer3.isStarted();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture17 = multiBackgroundInitializer3.getFuture();
        boolean boolean18 = multiBackgroundInitializer3.isStarted();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(executorService13);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test14538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14538");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        java.util.concurrent.ExecutorService executorService1 = multiBackgroundInitializer0.getExternalExecutor();
        boolean boolean2 = multiBackgroundInitializer0.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults3 = multiBackgroundInitializer0.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture4 = multiBackgroundInitializer0.getFuture();
        boolean boolean5 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults6 = multiBackgroundInitializer0.get();
        boolean boolean7 = multiBackgroundInitializer0.start();
        boolean boolean8 = multiBackgroundInitializer0.start();
        boolean boolean9 = multiBackgroundInitializer0.start();
        java.util.concurrent.ExecutorService executorService10 = multiBackgroundInitializer0.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults11 = multiBackgroundInitializer0.get();
        java.lang.Class<?> wildcardClass12 = multiBackgroundInitializerResults11.getClass();
        org.junit.Assert.assertNull(executorService1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults3);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(executorService10);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test14539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14539");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        boolean boolean10 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults11 = multiBackgroundInitializer3.get();
        boolean boolean12 = multiBackgroundInitializer3.isStarted();
        java.util.concurrent.ExecutorService executorService13 = multiBackgroundInitializer3.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults14 = multiBackgroundInitializer3.get();
        java.util.concurrent.ExecutorService executorService15 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean16 = multiBackgroundInitializer3.start();
        java.util.concurrent.ExecutorService executorService17 = multiBackgroundInitializer3.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults18 = multiBackgroundInitializer3.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults19 = multiBackgroundInitializer3.get();
        boolean boolean20 = multiBackgroundInitializer3.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults21 = multiBackgroundInitializer3.get();
        java.util.concurrent.ExecutorService executorService22 = multiBackgroundInitializer3.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults23 = multiBackgroundInitializer3.get();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(executorService13);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults14);
        org.junit.Assert.assertNull(executorService15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(executorService17);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults18);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults21);
        org.junit.Assert.assertNull(executorService22);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults23);
    }

    @Test
    public void test14540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14540");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture2 = multiBackgroundInitializer0.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults3 = multiBackgroundInitializerResultsFuture2.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults4 = multiBackgroundInitializerResultsFuture2.get();
        boolean boolean6 = multiBackgroundInitializerResultsFuture2.cancel(false);
        boolean boolean8 = multiBackgroundInitializerResultsFuture2.cancel(true);
        boolean boolean10 = multiBackgroundInitializerResultsFuture2.cancel(true);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults11 = multiBackgroundInitializerResultsFuture2.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults12 = multiBackgroundInitializerResultsFuture2.get();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture2);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults3);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults11);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults12);
    }

    @Test
    public void test14541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14541");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.start();
        boolean boolean2 = multiBackgroundInitializer0.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults3 = multiBackgroundInitializer0.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture4 = multiBackgroundInitializer0.getFuture();
        java.util.concurrent.ExecutorService executorService5 = multiBackgroundInitializer0.getExternalExecutor();
        boolean boolean6 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults7 = multiBackgroundInitializer0.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture8 = multiBackgroundInitializer0.getFuture();
        java.util.concurrent.ExecutorService executorService9 = multiBackgroundInitializer0.getExternalExecutor();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults3);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture4);
        org.junit.Assert.assertNull(executorService5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults7);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture8);
        org.junit.Assert.assertNull(executorService9);
    }

    @Test
    public void test14542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14542");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        java.util.concurrent.ExecutorService executorService10 = null;
        multiBackgroundInitializer3.setExternalExecutor(executorService10);
        java.util.concurrent.ExecutorService executorService12 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean13 = multiBackgroundInitializer3.start();
        boolean boolean14 = multiBackgroundInitializer3.start();
        boolean boolean15 = multiBackgroundInitializer3.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture16 = multiBackgroundInitializer3.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults17 = multiBackgroundInitializer3.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults18 = multiBackgroundInitializer3.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture19 = multiBackgroundInitializer3.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults20 = multiBackgroundInitializer3.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults21 = multiBackgroundInitializer3.get();
        boolean boolean22 = multiBackgroundInitializer3.start();
        boolean boolean23 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults24 = multiBackgroundInitializer3.get();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executorService12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture16);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults17);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults18);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture19);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults20);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults24);
    }

    @Test
    public void test14543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14543");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        java.util.concurrent.ExecutorService executorService10 = null;
        multiBackgroundInitializer3.setExternalExecutor(executorService10);
        boolean boolean12 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults13 = multiBackgroundInitializer3.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture14 = multiBackgroundInitializer3.getFuture();
        boolean boolean16 = multiBackgroundInitializerResultsFuture14.cancel(true);
        boolean boolean17 = multiBackgroundInitializerResultsFuture14.isDone();
        boolean boolean18 = multiBackgroundInitializerResultsFuture14.isDone();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults19 = multiBackgroundInitializerResultsFuture14.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults20 = multiBackgroundInitializerResultsFuture14.get();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults13);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults19);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults20);
    }

    @Test
    public void test14544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14544");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture2 = multiBackgroundInitializer0.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults3 = multiBackgroundInitializer0.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults4 = multiBackgroundInitializer0.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults5 = multiBackgroundInitializer0.get();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = multiBackgroundInitializerResults5.getResultObject("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child initializer with name ");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture2);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults3);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults4);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults5);
    }

    @Test
    public void test14545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14545");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        java.util.concurrent.ExecutorService executorService10 = null;
        multiBackgroundInitializer3.setExternalExecutor(executorService10);
        java.util.concurrent.ExecutorService executorService12 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean13 = multiBackgroundInitializer3.start();
        java.util.concurrent.ExecutorService executorService14 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture15 = multiBackgroundInitializer3.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults16 = multiBackgroundInitializer3.get();
        boolean boolean18 = multiBackgroundInitializerResults16.isException("hi!");
        java.lang.Object obj20 = multiBackgroundInitializerResults16.getResultObject("hi!");
        boolean boolean21 = multiBackgroundInitializerResults16.isSuccessful();
        org.apache.commons.lang3.concurrent.BackgroundInitializer<?> wildcardBackgroundInitializer23 = multiBackgroundInitializerResults16.getInitializer("hi!");
        org.apache.commons.lang3.concurrent.BackgroundInitializer<?> wildcardBackgroundInitializer25 = multiBackgroundInitializerResults16.getInitializer("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executorService12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(executorService14);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture15);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardBackgroundInitializer23);
        org.junit.Assert.assertNotNull(wildcardBackgroundInitializer25);
    }

    @Test
    public void test14546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14546");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        java.util.concurrent.ExecutorService executorService6 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService7 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean8 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults9 = multiBackgroundInitializer3.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults10 = multiBackgroundInitializer3.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults11 = multiBackgroundInitializer3.get();
        boolean boolean12 = multiBackgroundInitializer3.isStarted();
        java.util.concurrent.ExecutorService executorService13 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean14 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults15 = multiBackgroundInitializer3.get();
        java.util.concurrent.ExecutorService executorService16 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean17 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults18 = multiBackgroundInitializer3.get();
        java.util.concurrent.ExecutorService executorService19 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean20 = multiBackgroundInitializer3.isStarted();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(executorService6);
        org.junit.Assert.assertNull(executorService7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults9);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults10);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(executorService13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults15);
        org.junit.Assert.assertNull(executorService16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults18);
        org.junit.Assert.assertNull(executorService19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test14547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14547");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture2 = multiBackgroundInitializer0.getFuture();
        boolean boolean3 = multiBackgroundInitializer0.start();
        java.util.concurrent.ExecutorService executorService4 = multiBackgroundInitializer0.getExternalExecutor();
        boolean boolean5 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults6 = multiBackgroundInitializer0.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults7 = multiBackgroundInitializer0.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture8 = multiBackgroundInitializer0.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults9 = multiBackgroundInitializer0.get();
        boolean boolean10 = multiBackgroundInitializerResults9.isSuccessful();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(executorService4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults6);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults7);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture8);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test14548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14548");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture2 = multiBackgroundInitializer0.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults3 = multiBackgroundInitializer0.get();
        java.util.concurrent.ExecutorService executorService4 = multiBackgroundInitializer0.getExternalExecutor();
        boolean boolean5 = multiBackgroundInitializer0.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture6 = multiBackgroundInitializer0.getFuture();
        boolean boolean7 = multiBackgroundInitializer0.isStarted();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture8 = multiBackgroundInitializer0.getFuture();
        java.util.concurrent.ExecutorService executorService9 = multiBackgroundInitializer0.getExternalExecutor();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture10 = multiBackgroundInitializer0.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture11 = multiBackgroundInitializer0.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture12 = multiBackgroundInitializer0.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults13 = multiBackgroundInitializerResultsFuture12.get();
        java.util.Set<java.lang.String> strSet14 = multiBackgroundInitializerResults13.initializerNames();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture2);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults3);
        org.junit.Assert.assertNull(executorService4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture8);
        org.junit.Assert.assertNull(executorService9);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture10);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture11);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture12);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults13);
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test14549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14549");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        boolean boolean6 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults7 = multiBackgroundInitializer3.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults8 = multiBackgroundInitializer3.get();
        boolean boolean9 = multiBackgroundInitializer3.start();
        java.util.concurrent.ExecutorService executorService10 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture11 = multiBackgroundInitializer3.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture12 = multiBackgroundInitializer3.getFuture();
        boolean boolean13 = multiBackgroundInitializer3.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults14 = multiBackgroundInitializer3.get();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults7);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(executorService10);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture11);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults14);
    }

    @Test
    public void test14550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14550");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer10 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean11 = multiBackgroundInitializer10.isStarted();
        multiBackgroundInitializer7.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer10);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer14 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean15 = multiBackgroundInitializer14.isStarted();
        multiBackgroundInitializer10.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer14);
        boolean boolean17 = multiBackgroundInitializer10.start();
        multiBackgroundInitializer0.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer10);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer20 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean21 = multiBackgroundInitializer20.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer23 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean24 = multiBackgroundInitializer23.isStarted();
        multiBackgroundInitializer20.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer23);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer27 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean28 = multiBackgroundInitializer27.isStarted();
        multiBackgroundInitializer23.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer27);
        java.util.concurrent.ExecutorService executorService30 = null;
        multiBackgroundInitializer23.setExternalExecutor(executorService30);
        java.util.concurrent.ExecutorService executorService32 = multiBackgroundInitializer23.getExternalExecutor();
        multiBackgroundInitializer0.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer23);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer35 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean36 = multiBackgroundInitializer35.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer38 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean39 = multiBackgroundInitializer38.isStarted();
        multiBackgroundInitializer35.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer38);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer42 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean43 = multiBackgroundInitializer42.isStarted();
        multiBackgroundInitializer38.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer42);
        java.util.concurrent.ExecutorService executorService45 = null;
        multiBackgroundInitializer38.setExternalExecutor(executorService45);
        java.util.concurrent.ExecutorService executorService47 = multiBackgroundInitializer38.getExternalExecutor();
        boolean boolean48 = multiBackgroundInitializer38.start();
        boolean boolean49 = multiBackgroundInitializer38.isStarted();
        boolean boolean50 = multiBackgroundInitializer38.start();
        java.util.concurrent.ExecutorService executorService51 = multiBackgroundInitializer38.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService52 = multiBackgroundInitializer38.getExternalExecutor();
        boolean boolean53 = multiBackgroundInitializer38.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults54 = multiBackgroundInitializer38.get();
        multiBackgroundInitializer0.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer38);
        java.util.concurrent.ExecutorService executorService56 = multiBackgroundInitializer38.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults57 = multiBackgroundInitializer38.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults58 = multiBackgroundInitializer38.get();
        boolean boolean59 = multiBackgroundInitializerResults58.isSuccessful();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean61 = multiBackgroundInitializerResults58.isException("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child initializer with name ");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(executorService32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(executorService47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(executorService51);
        org.junit.Assert.assertNull(executorService52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults54);
        org.junit.Assert.assertNull(executorService56);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults57);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test14551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14551");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture2 = multiBackgroundInitializer0.getFuture();
        boolean boolean3 = multiBackgroundInitializer0.start();
        java.util.concurrent.ExecutorService executorService4 = multiBackgroundInitializer0.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService5 = multiBackgroundInitializer0.getExternalExecutor();
        boolean boolean6 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults7 = multiBackgroundInitializer0.get();
        boolean boolean8 = multiBackgroundInitializer0.start();
        boolean boolean9 = multiBackgroundInitializer0.isStarted();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture10 = multiBackgroundInitializer0.getFuture();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(executorService4);
        org.junit.Assert.assertNull(executorService5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture10);
    }

    @Test
    public void test14552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14552");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        boolean boolean2 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer4 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean5 = multiBackgroundInitializer4.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer4.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer11 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean12 = multiBackgroundInitializer11.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer14 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean15 = multiBackgroundInitializer14.isStarted();
        multiBackgroundInitializer11.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer14);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer18 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean19 = multiBackgroundInitializer18.isStarted();
        multiBackgroundInitializer14.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer18);
        boolean boolean21 = multiBackgroundInitializer14.start();
        multiBackgroundInitializer4.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer14);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer24 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean25 = multiBackgroundInitializer24.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer27 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean28 = multiBackgroundInitializer27.isStarted();
        multiBackgroundInitializer24.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer27);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer31 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean32 = multiBackgroundInitializer31.isStarted();
        multiBackgroundInitializer27.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer31);
        java.util.concurrent.ExecutorService executorService34 = null;
        multiBackgroundInitializer27.setExternalExecutor(executorService34);
        java.util.concurrent.ExecutorService executorService36 = multiBackgroundInitializer27.getExternalExecutor();
        multiBackgroundInitializer4.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer27);
        boolean boolean38 = multiBackgroundInitializer4.start();
        multiBackgroundInitializer0.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer4);
        boolean boolean40 = multiBackgroundInitializer0.isStarted();
        boolean boolean41 = multiBackgroundInitializer0.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture42 = multiBackgroundInitializer0.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture43 = multiBackgroundInitializer0.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture44 = multiBackgroundInitializer0.getFuture();
        java.lang.Class<?> wildcardClass45 = multiBackgroundInitializer0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(executorService36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture42);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture43);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture44);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test14553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14553");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture2 = multiBackgroundInitializer0.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults3 = multiBackgroundInitializer0.get();
        boolean boolean4 = multiBackgroundInitializer0.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults5 = multiBackgroundInitializer0.get();
        boolean boolean6 = multiBackgroundInitializer0.start();
        boolean boolean7 = multiBackgroundInitializer0.isStarted();
        boolean boolean8 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults9 = multiBackgroundInitializer0.get();
        java.util.concurrent.ExecutorService executorService10 = multiBackgroundInitializer0.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService11 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiBackgroundInitializer0.setExternalExecutor(executorService11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot set ExecutorService after start()!");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture2);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults9);
        org.junit.Assert.assertNull(executorService10);
    }

    @Test
    public void test14554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14554");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture2 = multiBackgroundInitializer0.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults3 = multiBackgroundInitializer0.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults4 = multiBackgroundInitializer0.get();
        java.util.Set<java.lang.String> strSet5 = multiBackgroundInitializerResults4.initializerNames();
        boolean boolean6 = multiBackgroundInitializerResults4.isSuccessful();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = multiBackgroundInitializerResults4.isException("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child initializer with name hi!");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture2);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults3);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test14555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14555");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer10 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean11 = multiBackgroundInitializer10.isStarted();
        multiBackgroundInitializer7.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer10);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer14 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean15 = multiBackgroundInitializer14.isStarted();
        multiBackgroundInitializer10.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer14);
        boolean boolean17 = multiBackgroundInitializer10.start();
        multiBackgroundInitializer0.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer10);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer20 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean21 = multiBackgroundInitializer20.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer23 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean24 = multiBackgroundInitializer23.isStarted();
        multiBackgroundInitializer20.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer23);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer27 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean28 = multiBackgroundInitializer27.isStarted();
        multiBackgroundInitializer23.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer27);
        java.util.concurrent.ExecutorService executorService30 = null;
        multiBackgroundInitializer23.setExternalExecutor(executorService30);
        java.util.concurrent.ExecutorService executorService32 = multiBackgroundInitializer23.getExternalExecutor();
        multiBackgroundInitializer0.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer23);
        java.util.concurrent.ExecutorService executorService34 = null;
        multiBackgroundInitializer23.setExternalExecutor(executorService34);
        boolean boolean36 = multiBackgroundInitializer23.start();
        java.util.concurrent.ExecutorService executorService37 = multiBackgroundInitializer23.getExternalExecutor();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture38 = multiBackgroundInitializer23.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults39 = multiBackgroundInitializer23.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults40 = multiBackgroundInitializer23.get();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(executorService32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(executorService37);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture38);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults39);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults40);
    }

    @Test
    public void test14556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14556");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        boolean boolean6 = multiBackgroundInitializer3.start();
        boolean boolean7 = multiBackgroundInitializer3.start();
        boolean boolean8 = multiBackgroundInitializer3.start();
        boolean boolean9 = multiBackgroundInitializer3.isStarted();
        java.util.concurrent.ExecutorService executorService10 = multiBackgroundInitializer3.getExternalExecutor();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(executorService10);
    }

    @Test
    public void test14557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14557");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        boolean boolean10 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults11 = multiBackgroundInitializer3.get();
        boolean boolean12 = multiBackgroundInitializer3.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults13 = multiBackgroundInitializer3.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults14 = multiBackgroundInitializer3.get();
        org.apache.commons.lang3.concurrent.BackgroundInitializer<?> wildcardBackgroundInitializer16 = multiBackgroundInitializerResults14.getInitializer("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults13);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults14);
        org.junit.Assert.assertNotNull(wildcardBackgroundInitializer16);
    }

    @Test
    public void test14558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14558");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture2 = multiBackgroundInitializer0.getFuture();
        boolean boolean3 = multiBackgroundInitializerResultsFuture2.isCancelled();
        boolean boolean4 = multiBackgroundInitializerResultsFuture2.isDone();
        boolean boolean5 = multiBackgroundInitializerResultsFuture2.isCancelled();
        boolean boolean6 = multiBackgroundInitializerResultsFuture2.isDone();
        boolean boolean8 = multiBackgroundInitializerResultsFuture2.cancel(false);
        boolean boolean10 = multiBackgroundInitializerResultsFuture2.cancel(true);
        boolean boolean11 = multiBackgroundInitializerResultsFuture2.isCancelled();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky:         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky:         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky:         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test14559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14559");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        java.util.concurrent.ExecutorService executorService6 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService7 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean8 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults9 = multiBackgroundInitializer3.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults10 = multiBackgroundInitializer3.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults11 = multiBackgroundInitializer3.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture12 = multiBackgroundInitializer3.getFuture();
        boolean boolean13 = multiBackgroundInitializer3.isStarted();
        boolean boolean14 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults15 = multiBackgroundInitializer3.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults16 = multiBackgroundInitializer3.get();
        java.util.concurrent.ExecutorService executorService17 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean18 = multiBackgroundInitializer3.start();
        java.util.concurrent.ExecutorService executorService19 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean20 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer22 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean23 = multiBackgroundInitializer22.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture24 = multiBackgroundInitializer22.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults25 = multiBackgroundInitializer22.get();
        java.util.concurrent.ExecutorService executorService26 = multiBackgroundInitializer22.getExternalExecutor();
        boolean boolean27 = multiBackgroundInitializer22.start();
        java.util.concurrent.ExecutorService executorService28 = multiBackgroundInitializer22.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults29 = multiBackgroundInitializer22.get();
        // The following exception was thrown during execution in test generation
        try {
            multiBackgroundInitializer3.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: addInitializer() must not be called after start()!");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(executorService6);
        org.junit.Assert.assertNull(executorService7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults9);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults10);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults11);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults15);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults16);
        org.junit.Assert.assertNull(executorService17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(executorService19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture24);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults25);
        org.junit.Assert.assertNull(executorService26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(executorService28);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults29);
    }

    @Test
    public void test14560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14560");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        java.util.concurrent.ExecutorService executorService6 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService7 = null;
        multiBackgroundInitializer3.setExternalExecutor(executorService7);
        boolean boolean9 = multiBackgroundInitializer3.start();
        boolean boolean10 = multiBackgroundInitializer3.start();
        boolean boolean11 = multiBackgroundInitializer3.isStarted();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture12 = multiBackgroundInitializer3.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture13 = multiBackgroundInitializer3.getFuture();
        boolean boolean15 = multiBackgroundInitializerResultsFuture13.cancel(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(executorService6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture12);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test14561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14561");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        java.util.concurrent.ExecutorService executorService10 = null;
        multiBackgroundInitializer3.setExternalExecutor(executorService10);
        java.util.concurrent.ExecutorService executorService12 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean13 = multiBackgroundInitializer3.start();
        boolean boolean14 = multiBackgroundInitializer3.start();
        boolean boolean15 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults16 = multiBackgroundInitializer3.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults17 = multiBackgroundInitializer3.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults18 = multiBackgroundInitializer3.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture19 = multiBackgroundInitializer3.getFuture();
        boolean boolean20 = multiBackgroundInitializerResultsFuture19.isDone();
        boolean boolean22 = multiBackgroundInitializerResultsFuture19.cancel(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executorService12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults16);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults17);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults18);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test14562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14562");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        java.util.concurrent.ExecutorService executorService6 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService7 = null;
        multiBackgroundInitializer3.setExternalExecutor(executorService7);
        boolean boolean9 = multiBackgroundInitializer3.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture10 = multiBackgroundInitializer3.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture11 = multiBackgroundInitializer3.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults12 = multiBackgroundInitializer3.get();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(executorService6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture10);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture11);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults12);
    }

    @Test
    public void test14563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14563");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer10 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean11 = multiBackgroundInitializer10.isStarted();
        multiBackgroundInitializer7.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer10);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer14 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean15 = multiBackgroundInitializer14.isStarted();
        multiBackgroundInitializer10.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer14);
        boolean boolean17 = multiBackgroundInitializer10.start();
        multiBackgroundInitializer0.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer10);
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture19 = multiBackgroundInitializer10.getFuture();
        java.util.concurrent.ExecutorService executorService20 = multiBackgroundInitializer10.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults21 = multiBackgroundInitializer10.get();
        boolean boolean22 = multiBackgroundInitializer10.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults23 = multiBackgroundInitializer10.get();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.BackgroundInitializer<?> wildcardBackgroundInitializer25 = multiBackgroundInitializerResults23.getInitializer("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child initializer with name ");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture19);
        org.junit.Assert.assertNull(executorService20);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults23);
    }

    @Test
    public void test14564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14564");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        boolean boolean6 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer8 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean9 = multiBackgroundInitializer8.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer11 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean12 = multiBackgroundInitializer11.isStarted();
        multiBackgroundInitializer8.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer11);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer15 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean16 = multiBackgroundInitializer15.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer18 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean19 = multiBackgroundInitializer18.isStarted();
        multiBackgroundInitializer15.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer18);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer22 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean23 = multiBackgroundInitializer22.isStarted();
        multiBackgroundInitializer18.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer22);
        boolean boolean25 = multiBackgroundInitializer18.start();
        multiBackgroundInitializer8.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer18);
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer18);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults28 = multiBackgroundInitializer18.get();
        boolean boolean29 = multiBackgroundInitializer18.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults30 = multiBackgroundInitializer18.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults31 = multiBackgroundInitializer18.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture32 = multiBackgroundInitializer18.getFuture();
        boolean boolean33 = multiBackgroundInitializer18.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults34 = multiBackgroundInitializer18.get();
        boolean boolean35 = multiBackgroundInitializer18.isStarted();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults30);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults31);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test14565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14565");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        boolean boolean6 = multiBackgroundInitializer3.start();
        boolean boolean7 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults8 = multiBackgroundInitializer3.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults9 = multiBackgroundInitializer3.get();
        boolean boolean10 = multiBackgroundInitializer3.isStarted();
        boolean boolean11 = multiBackgroundInitializer3.isStarted();
        boolean boolean12 = multiBackgroundInitializer3.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture13 = multiBackgroundInitializer3.getFuture();
        boolean boolean14 = multiBackgroundInitializerResultsFuture13.isDone();
        boolean boolean15 = multiBackgroundInitializerResultsFuture13.isCancelled();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults8);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test14566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14566");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        java.util.concurrent.ExecutorService executorService1 = multiBackgroundInitializer0.getExternalExecutor();
        boolean boolean2 = multiBackgroundInitializer0.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults3 = multiBackgroundInitializer0.get();
        boolean boolean4 = multiBackgroundInitializer0.isStarted();
        boolean boolean5 = multiBackgroundInitializer0.isStarted();
        boolean boolean6 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults7 = multiBackgroundInitializer0.get();
        java.util.Set<java.lang.String> strSet8 = multiBackgroundInitializerResults7.initializerNames();
        java.util.Set<java.lang.String> strSet9 = multiBackgroundInitializerResults7.initializerNames();
        org.junit.Assert.assertNull(executorService1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test14567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14567");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        boolean boolean2 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer4 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean5 = multiBackgroundInitializer4.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer4.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer11 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean12 = multiBackgroundInitializer11.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer14 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean15 = multiBackgroundInitializer14.isStarted();
        multiBackgroundInitializer11.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer14);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer18 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean19 = multiBackgroundInitializer18.isStarted();
        multiBackgroundInitializer14.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer18);
        boolean boolean21 = multiBackgroundInitializer14.start();
        multiBackgroundInitializer4.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer14);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer24 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean25 = multiBackgroundInitializer24.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer27 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean28 = multiBackgroundInitializer27.isStarted();
        multiBackgroundInitializer24.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer27);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer31 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean32 = multiBackgroundInitializer31.isStarted();
        multiBackgroundInitializer27.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer31);
        java.util.concurrent.ExecutorService executorService34 = null;
        multiBackgroundInitializer27.setExternalExecutor(executorService34);
        java.util.concurrent.ExecutorService executorService36 = multiBackgroundInitializer27.getExternalExecutor();
        multiBackgroundInitializer4.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer27);
        boolean boolean38 = multiBackgroundInitializer4.start();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer4);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults40 = multiBackgroundInitializer4.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults41 = multiBackgroundInitializer4.get();
        java.util.concurrent.ExecutorService executorService42 = multiBackgroundInitializer4.getExternalExecutor();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture43 = multiBackgroundInitializer4.getFuture();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(executorService36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults40);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults41);
        org.junit.Assert.assertNull(executorService42);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture43);
    }

    @Test
    public void test14568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14568");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        java.util.concurrent.ExecutorService executorService6 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService7 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean8 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults9 = multiBackgroundInitializer3.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults10 = multiBackgroundInitializer3.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults11 = multiBackgroundInitializer3.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture12 = multiBackgroundInitializer3.getFuture();
        boolean boolean13 = multiBackgroundInitializer3.isStarted();
        java.util.concurrent.ExecutorService executorService14 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService15 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService16 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiBackgroundInitializer3.setExternalExecutor(executorService16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot set ExecutorService after start()!");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(executorService6);
        org.junit.Assert.assertNull(executorService7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults9);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults10);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults11);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(executorService14);
        org.junit.Assert.assertNull(executorService15);
    }

    @Test
    public void test14569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14569");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer10 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean11 = multiBackgroundInitializer10.isStarted();
        multiBackgroundInitializer7.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer10);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer14 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean15 = multiBackgroundInitializer14.isStarted();
        multiBackgroundInitializer10.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer14);
        boolean boolean17 = multiBackgroundInitializer10.start();
        multiBackgroundInitializer0.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer10);
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture19 = multiBackgroundInitializer10.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture20 = multiBackgroundInitializer10.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults21 = multiBackgroundInitializer10.get();
        boolean boolean22 = multiBackgroundInitializer10.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture23 = multiBackgroundInitializer10.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults24 = multiBackgroundInitializer10.get();
        java.util.concurrent.ExecutorService executorService25 = multiBackgroundInitializer10.getExternalExecutor();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture26 = multiBackgroundInitializer10.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults27 = multiBackgroundInitializerResultsFuture26.get();
        java.util.Set<java.lang.String> strSet28 = multiBackgroundInitializerResults27.initializerNames();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture19);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture20);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture23);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults24);
        org.junit.Assert.assertNull(executorService25);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture26);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults27);
        org.junit.Assert.assertNotNull(strSet28);
    }

    @Test
    public void test14570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14570");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        boolean boolean10 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults11 = multiBackgroundInitializer3.get();
        java.util.Set<java.lang.String> strSet12 = multiBackgroundInitializerResults11.initializerNames();
        java.util.Set<java.lang.String> strSet13 = multiBackgroundInitializerResults11.initializerNames();
        org.apache.commons.lang3.concurrent.ConcurrentException concurrentException15 = multiBackgroundInitializerResults11.getException("hi!");
        boolean boolean16 = multiBackgroundInitializerResults11.isSuccessful();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(concurrentException15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test14571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14571");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        java.util.concurrent.ExecutorService executorService6 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean7 = multiBackgroundInitializer3.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture8 = multiBackgroundInitializer3.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults9 = multiBackgroundInitializer3.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults10 = multiBackgroundInitializer3.get();
        boolean boolean11 = multiBackgroundInitializer3.isStarted();
        java.util.concurrent.ExecutorService executorService12 = multiBackgroundInitializer3.getExternalExecutor();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(executorService6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture8);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults9);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(executorService12);
    }

    @Test
    public void test14572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14572");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture2 = multiBackgroundInitializer0.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults3 = multiBackgroundInitializer0.get();
        java.util.concurrent.ExecutorService executorService4 = multiBackgroundInitializer0.getExternalExecutor();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture5 = multiBackgroundInitializer0.getFuture();
        java.util.concurrent.ExecutorService executorService6 = multiBackgroundInitializer0.getExternalExecutor();
        boolean boolean7 = multiBackgroundInitializer0.isStarted();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture8 = multiBackgroundInitializer0.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults9 = multiBackgroundInitializer0.get();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture2);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults3);
        org.junit.Assert.assertNull(executorService4);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture5);
        org.junit.Assert.assertNull(executorService6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture8);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults9);
    }

    @Test
    public void test14573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14573");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        boolean boolean6 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer8 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean9 = multiBackgroundInitializer8.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer11 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean12 = multiBackgroundInitializer11.isStarted();
        multiBackgroundInitializer8.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer11);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer15 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean16 = multiBackgroundInitializer15.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer18 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean19 = multiBackgroundInitializer18.isStarted();
        multiBackgroundInitializer15.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer18);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer22 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean23 = multiBackgroundInitializer22.isStarted();
        multiBackgroundInitializer18.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer22);
        boolean boolean25 = multiBackgroundInitializer18.start();
        multiBackgroundInitializer8.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer18);
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer18);
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture28 = multiBackgroundInitializer18.getFuture();
        java.lang.Class<?> wildcardClass29 = multiBackgroundInitializerResultsFuture28.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test14574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14574");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer10 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean11 = multiBackgroundInitializer10.isStarted();
        multiBackgroundInitializer7.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer10);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer14 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean15 = multiBackgroundInitializer14.isStarted();
        multiBackgroundInitializer10.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer14);
        boolean boolean17 = multiBackgroundInitializer10.start();
        multiBackgroundInitializer0.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer10);
        boolean boolean19 = multiBackgroundInitializer0.isStarted();
        java.util.concurrent.ExecutorService executorService20 = null;
        multiBackgroundInitializer0.setExternalExecutor(executorService20);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer23 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean24 = multiBackgroundInitializer23.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer26 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean27 = multiBackgroundInitializer26.isStarted();
        multiBackgroundInitializer23.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer26);
        boolean boolean29 = multiBackgroundInitializer23.isStarted();
        boolean boolean30 = multiBackgroundInitializer23.start();
        multiBackgroundInitializer0.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer23);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults32 = multiBackgroundInitializer23.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults33 = multiBackgroundInitializer23.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture34 = multiBackgroundInitializer23.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults35 = multiBackgroundInitializer23.get();
        boolean boolean36 = multiBackgroundInitializer23.start();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults32);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults33);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture34);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test14575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14575");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        boolean boolean6 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer8 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean9 = multiBackgroundInitializer8.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer11 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean12 = multiBackgroundInitializer11.isStarted();
        multiBackgroundInitializer8.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer11);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer15 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean16 = multiBackgroundInitializer15.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer18 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean19 = multiBackgroundInitializer18.isStarted();
        multiBackgroundInitializer15.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer18);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer22 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean23 = multiBackgroundInitializer22.isStarted();
        multiBackgroundInitializer18.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer22);
        boolean boolean25 = multiBackgroundInitializer18.start();
        multiBackgroundInitializer8.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer18);
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer18);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults28 = multiBackgroundInitializer18.get();
        boolean boolean29 = multiBackgroundInitializer18.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults30 = multiBackgroundInitializer18.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults31 = multiBackgroundInitializer18.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults32 = multiBackgroundInitializer18.get();
        java.util.concurrent.ExecutorService executorService33 = multiBackgroundInitializer18.getExternalExecutor();
        boolean boolean34 = multiBackgroundInitializer18.start();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults30);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults31);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults32);
        org.junit.Assert.assertNull(executorService33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test14576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14576");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        boolean boolean6 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer8 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean9 = multiBackgroundInitializer8.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer11 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean12 = multiBackgroundInitializer11.isStarted();
        multiBackgroundInitializer8.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer11);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer15 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean16 = multiBackgroundInitializer15.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer18 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean19 = multiBackgroundInitializer18.isStarted();
        multiBackgroundInitializer15.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer18);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer22 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean23 = multiBackgroundInitializer22.isStarted();
        multiBackgroundInitializer18.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer22);
        boolean boolean25 = multiBackgroundInitializer18.start();
        multiBackgroundInitializer8.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer18);
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer18);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults28 = multiBackgroundInitializer18.get();
        java.util.concurrent.ExecutorService executorService29 = multiBackgroundInitializer18.getExternalExecutor();
        boolean boolean30 = multiBackgroundInitializer18.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults31 = multiBackgroundInitializer18.get();
        org.apache.commons.lang3.concurrent.BackgroundInitializer<?> wildcardBackgroundInitializer33 = multiBackgroundInitializerResults31.getInitializer("hi!");
        boolean boolean34 = multiBackgroundInitializerResults31.isSuccessful();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults28);
        org.junit.Assert.assertNull(executorService29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults31);
        org.junit.Assert.assertNotNull(wildcardBackgroundInitializer33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test14577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14577");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        java.util.concurrent.ExecutorService executorService6 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService7 = null;
        multiBackgroundInitializer3.setExternalExecutor(executorService7);
        boolean boolean9 = multiBackgroundInitializer3.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture10 = multiBackgroundInitializer3.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture11 = multiBackgroundInitializer3.getFuture();
        boolean boolean12 = multiBackgroundInitializerResultsFuture11.isDone();
        boolean boolean13 = multiBackgroundInitializerResultsFuture11.isCancelled();
        boolean boolean14 = multiBackgroundInitializerResultsFuture11.isDone();
        boolean boolean15 = multiBackgroundInitializerResultsFuture11.isDone();
        boolean boolean16 = multiBackgroundInitializerResultsFuture11.isDone();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(executorService6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture10);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test14578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14578");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer10 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean11 = multiBackgroundInitializer10.isStarted();
        multiBackgroundInitializer7.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer10);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer14 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean15 = multiBackgroundInitializer14.isStarted();
        multiBackgroundInitializer10.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer14);
        boolean boolean17 = multiBackgroundInitializer10.start();
        multiBackgroundInitializer0.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer10);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer20 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean21 = multiBackgroundInitializer20.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer23 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean24 = multiBackgroundInitializer23.isStarted();
        multiBackgroundInitializer20.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer23);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer27 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean28 = multiBackgroundInitializer27.isStarted();
        multiBackgroundInitializer23.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer27);
        java.util.concurrent.ExecutorService executorService30 = null;
        multiBackgroundInitializer23.setExternalExecutor(executorService30);
        java.util.concurrent.ExecutorService executorService32 = multiBackgroundInitializer23.getExternalExecutor();
        multiBackgroundInitializer0.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer23);
        boolean boolean34 = multiBackgroundInitializer0.start();
        boolean boolean35 = multiBackgroundInitializer0.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults36 = multiBackgroundInitializer0.get();
        java.util.concurrent.ExecutorService executorService37 = multiBackgroundInitializer0.getExternalExecutor();
        boolean boolean38 = multiBackgroundInitializer0.start();
        java.util.concurrent.ExecutorService executorService39 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiBackgroundInitializer0.setExternalExecutor(executorService39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot set ExecutorService after start()!");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(executorService32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults36);
        org.junit.Assert.assertNull(executorService37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test14579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14579");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        boolean boolean6 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer8 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean9 = multiBackgroundInitializer8.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer11 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean12 = multiBackgroundInitializer11.isStarted();
        multiBackgroundInitializer8.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer11);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer15 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean16 = multiBackgroundInitializer15.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer18 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean19 = multiBackgroundInitializer18.isStarted();
        multiBackgroundInitializer15.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer18);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer22 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean23 = multiBackgroundInitializer22.isStarted();
        multiBackgroundInitializer18.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer22);
        boolean boolean25 = multiBackgroundInitializer18.start();
        multiBackgroundInitializer8.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer18);
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer18);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults28 = multiBackgroundInitializer18.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults29 = multiBackgroundInitializer18.get();
        boolean boolean30 = multiBackgroundInitializer18.isStarted();
        java.util.concurrent.ExecutorService executorService31 = multiBackgroundInitializer18.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService32 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiBackgroundInitializer18.setExternalExecutor(executorService32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot set ExecutorService after start()!");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults28);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(executorService31);
    }

    @Test
    public void test14580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14580");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture2 = multiBackgroundInitializer0.getFuture();
        boolean boolean3 = multiBackgroundInitializer0.start();
        java.util.concurrent.ExecutorService executorService4 = multiBackgroundInitializer0.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService5 = multiBackgroundInitializer0.getExternalExecutor();
        boolean boolean6 = multiBackgroundInitializer0.start();
        boolean boolean7 = multiBackgroundInitializer0.start();
        boolean boolean8 = multiBackgroundInitializer0.start();
        boolean boolean9 = multiBackgroundInitializer0.isStarted();
        boolean boolean10 = multiBackgroundInitializer0.isStarted();
        boolean boolean11 = multiBackgroundInitializer0.start();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(executorService4);
        org.junit.Assert.assertNull(executorService5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test14581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14581");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        boolean boolean6 = multiBackgroundInitializer3.isStarted();
        boolean boolean7 = multiBackgroundInitializer3.start();
        java.util.concurrent.ExecutorService executorService8 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean9 = multiBackgroundInitializer3.start();
        boolean boolean10 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults11 = multiBackgroundInitializer3.get();
        java.util.concurrent.ExecutorService executorService12 = multiBackgroundInitializer3.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults13 = multiBackgroundInitializer3.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults14 = multiBackgroundInitializer3.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture15 = multiBackgroundInitializer3.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults16 = multiBackgroundInitializer3.get();
        boolean boolean17 = multiBackgroundInitializer3.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults18 = multiBackgroundInitializer3.get();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(executorService8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults11);
        org.junit.Assert.assertNull(executorService12);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults13);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults14);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture15);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults18);
    }

    @Test
    public void test14582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14582");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        boolean boolean6 = multiBackgroundInitializer3.isStarted();
        boolean boolean7 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults8 = multiBackgroundInitializer3.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults9 = multiBackgroundInitializer3.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture10 = multiBackgroundInitializer3.getFuture();
        boolean boolean11 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults12 = multiBackgroundInitializer3.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults13 = multiBackgroundInitializer3.get();
        boolean boolean14 = multiBackgroundInitializerResults13.isSuccessful();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults8);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults9);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults12);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test14583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14583");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        java.util.concurrent.ExecutorService executorService6 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService7 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean8 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults9 = multiBackgroundInitializer3.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults10 = multiBackgroundInitializer3.get();
        java.util.concurrent.ExecutorService executorService11 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean12 = multiBackgroundInitializer3.start();
        java.util.concurrent.ExecutorService executorService13 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean14 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults15 = multiBackgroundInitializer3.get();
        boolean boolean16 = multiBackgroundInitializer3.start();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(executorService6);
        org.junit.Assert.assertNull(executorService7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults9);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults10);
        org.junit.Assert.assertNull(executorService11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(executorService13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test14584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14584");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        boolean boolean6 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer8 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean9 = multiBackgroundInitializer8.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer11 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean12 = multiBackgroundInitializer11.isStarted();
        multiBackgroundInitializer8.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer11);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer15 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean16 = multiBackgroundInitializer15.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer18 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean19 = multiBackgroundInitializer18.isStarted();
        multiBackgroundInitializer15.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer18);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer22 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean23 = multiBackgroundInitializer22.isStarted();
        multiBackgroundInitializer18.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer22);
        boolean boolean25 = multiBackgroundInitializer18.start();
        multiBackgroundInitializer8.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer18);
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer18);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults28 = multiBackgroundInitializer18.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture29 = multiBackgroundInitializer18.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults30 = multiBackgroundInitializer18.get();
        java.util.concurrent.ExecutorService executorService31 = multiBackgroundInitializer18.getExternalExecutor();
        boolean boolean32 = multiBackgroundInitializer18.isStarted();
        boolean boolean33 = multiBackgroundInitializer18.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture34 = multiBackgroundInitializer18.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults35 = multiBackgroundInitializer18.get();
        java.util.Set<java.lang.String> strSet36 = multiBackgroundInitializerResults35.initializerNames();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults28);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture29);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults30);
        org.junit.Assert.assertNull(executorService31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture34);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults35);
        org.junit.Assert.assertNotNull(strSet36);
    }

    @Test
    public void test14585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14585");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        java.util.concurrent.ExecutorService executorService6 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService7 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean8 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults9 = multiBackgroundInitializer3.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults10 = multiBackgroundInitializer3.get();
        boolean boolean11 = multiBackgroundInitializer3.start();
        boolean boolean12 = multiBackgroundInitializer3.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults13 = multiBackgroundInitializer3.get();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.ConcurrentException concurrentException15 = multiBackgroundInitializerResults13.getException("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child initializer with name ");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(executorService6);
        org.junit.Assert.assertNull(executorService7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults9);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults13);
    }

    @Test
    public void test14586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14586");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        java.util.concurrent.ExecutorService executorService6 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService7 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean8 = multiBackgroundInitializer3.start();
        java.util.concurrent.ExecutorService executorService9 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean10 = multiBackgroundInitializer3.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults11 = multiBackgroundInitializer3.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture12 = multiBackgroundInitializer3.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults13 = multiBackgroundInitializerResultsFuture12.get();
        java.util.Set<java.lang.String> strSet14 = multiBackgroundInitializerResults13.initializerNames();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.ConcurrentException concurrentException16 = multiBackgroundInitializerResults13.getException("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child initializer with name ");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(executorService6);
        org.junit.Assert.assertNull(executorService7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(executorService9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults11);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture12);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults13);
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test14587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14587");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        java.util.concurrent.ExecutorService executorService6 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService7 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean8 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults9 = multiBackgroundInitializer3.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults10 = multiBackgroundInitializer3.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults11 = multiBackgroundInitializer3.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture12 = multiBackgroundInitializer3.getFuture();
        boolean boolean13 = multiBackgroundInitializer3.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture14 = multiBackgroundInitializer3.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults15 = multiBackgroundInitializer3.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults16 = multiBackgroundInitializer3.get();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(executorService6);
        org.junit.Assert.assertNull(executorService7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults9);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults10);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults11);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture14);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults15);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults16);
    }

    @Test
    public void test14588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14588");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        boolean boolean6 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer8 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean9 = multiBackgroundInitializer8.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer11 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean12 = multiBackgroundInitializer11.isStarted();
        multiBackgroundInitializer8.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer11);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer15 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean16 = multiBackgroundInitializer15.isStarted();
        multiBackgroundInitializer11.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer15);
        java.util.concurrent.ExecutorService executorService18 = null;
        multiBackgroundInitializer11.setExternalExecutor(executorService18);
        java.util.concurrent.ExecutorService executorService20 = multiBackgroundInitializer11.getExternalExecutor();
        boolean boolean21 = multiBackgroundInitializer11.start();
        java.util.concurrent.ExecutorService executorService22 = multiBackgroundInitializer11.getExternalExecutor();
        boolean boolean23 = multiBackgroundInitializer11.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer11);
        java.util.concurrent.ExecutorService executorService25 = null;
        multiBackgroundInitializer0.setExternalExecutor(executorService25);
        boolean boolean27 = multiBackgroundInitializer0.isStarted();
        boolean boolean28 = multiBackgroundInitializer0.isStarted();
        boolean boolean29 = multiBackgroundInitializer0.isStarted();
        java.util.concurrent.ExecutorService executorService30 = null;
        multiBackgroundInitializer0.setExternalExecutor(executorService30);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(executorService20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(executorService22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test14589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14589");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        java.util.concurrent.ExecutorService executorService10 = null;
        multiBackgroundInitializer3.setExternalExecutor(executorService10);
        java.util.concurrent.ExecutorService executorService12 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean13 = multiBackgroundInitializer3.start();
        boolean boolean14 = multiBackgroundInitializer3.start();
        boolean boolean15 = multiBackgroundInitializer3.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture16 = multiBackgroundInitializer3.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults17 = multiBackgroundInitializer3.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults18 = multiBackgroundInitializer3.get();
        boolean boolean19 = multiBackgroundInitializer3.start();
        java.util.concurrent.ExecutorService executorService20 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture21 = multiBackgroundInitializer3.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults22 = multiBackgroundInitializerResultsFuture21.get();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executorService12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture16);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults17);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(executorService20);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture21);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults22);
    }

    @Test
    public void test14590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14590");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture2 = multiBackgroundInitializer0.getFuture();
        boolean boolean3 = multiBackgroundInitializer0.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture4 = multiBackgroundInitializer0.getFuture();
        boolean boolean6 = multiBackgroundInitializerResultsFuture4.cancel(false);
        boolean boolean7 = multiBackgroundInitializerResultsFuture4.isDone();
        boolean boolean9 = multiBackgroundInitializerResultsFuture4.cancel(true);
        boolean boolean10 = multiBackgroundInitializerResultsFuture4.isCancelled();
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults13 = multiBackgroundInitializerResultsFuture4.get((long) (byte) 10, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test14591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14591");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture2 = multiBackgroundInitializer0.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults3 = multiBackgroundInitializer0.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture4 = multiBackgroundInitializer0.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults5 = multiBackgroundInitializer0.get();
        boolean boolean6 = multiBackgroundInitializer0.isStarted();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture7 = multiBackgroundInitializer0.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults8 = multiBackgroundInitializer0.get();
        java.util.concurrent.ExecutorService executorService9 = multiBackgroundInitializer0.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService10 = multiBackgroundInitializer0.getExternalExecutor();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture11 = multiBackgroundInitializer0.getFuture();
        boolean boolean12 = multiBackgroundInitializer0.start();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture2);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults3);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture4);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture7);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults8);
        org.junit.Assert.assertNull(executorService9);
        org.junit.Assert.assertNull(executorService10);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test14592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14592");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        java.util.concurrent.ExecutorService executorService10 = null;
        multiBackgroundInitializer3.setExternalExecutor(executorService10);
        java.util.concurrent.ExecutorService executorService12 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean13 = multiBackgroundInitializer3.start();
        boolean boolean14 = multiBackgroundInitializer3.start();
        boolean boolean15 = multiBackgroundInitializer3.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture16 = multiBackgroundInitializer3.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults17 = multiBackgroundInitializer3.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults18 = multiBackgroundInitializer3.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture19 = multiBackgroundInitializer3.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture20 = multiBackgroundInitializer3.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture21 = multiBackgroundInitializer3.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults22 = multiBackgroundInitializerResultsFuture21.get();
        boolean boolean23 = multiBackgroundInitializerResults22.isSuccessful();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executorService12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture16);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults17);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults18);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture19);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture20);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture21);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test14593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14593");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        boolean boolean10 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults11 = multiBackgroundInitializer3.get();
        boolean boolean12 = multiBackgroundInitializer3.isStarted();
        java.util.concurrent.ExecutorService executorService13 = multiBackgroundInitializer3.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults14 = multiBackgroundInitializer3.get();
        java.util.concurrent.ExecutorService executorService15 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean16 = multiBackgroundInitializer3.start();
        java.util.concurrent.ExecutorService executorService17 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture18 = multiBackgroundInitializer3.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture19 = multiBackgroundInitializer3.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults20 = multiBackgroundInitializer3.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults21 = multiBackgroundInitializer3.get();
        java.lang.Object obj23 = multiBackgroundInitializerResults21.getResultObject("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(executorService13);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults14);
        org.junit.Assert.assertNull(executorService15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(executorService17);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture18);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture19);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults20);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults21);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test14594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14594");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer11 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean12 = multiBackgroundInitializer11.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer14 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean15 = multiBackgroundInitializer14.isStarted();
        multiBackgroundInitializer11.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer14);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer18 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean19 = multiBackgroundInitializer18.isStarted();
        multiBackgroundInitializer14.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer18);
        boolean boolean21 = multiBackgroundInitializer14.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults22 = multiBackgroundInitializer14.get();
        boolean boolean23 = multiBackgroundInitializer14.isStarted();
        java.util.concurrent.ExecutorService executorService24 = multiBackgroundInitializer14.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults25 = multiBackgroundInitializer14.get();
        java.util.concurrent.ExecutorService executorService26 = multiBackgroundInitializer14.getExternalExecutor();
        boolean boolean27 = multiBackgroundInitializer14.start();
        java.util.concurrent.ExecutorService executorService28 = multiBackgroundInitializer14.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults29 = multiBackgroundInitializer14.get();
        boolean boolean30 = multiBackgroundInitializer14.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults31 = multiBackgroundInitializer14.get();
        multiBackgroundInitializer7.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer14);
        boolean boolean33 = multiBackgroundInitializer14.start();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(executorService24);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults25);
        org.junit.Assert.assertNull(executorService26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(executorService28);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test14595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14595");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer10 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean11 = multiBackgroundInitializer10.isStarted();
        multiBackgroundInitializer7.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer10);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer14 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean15 = multiBackgroundInitializer14.isStarted();
        multiBackgroundInitializer10.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer14);
        boolean boolean17 = multiBackgroundInitializer10.start();
        multiBackgroundInitializer0.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer10);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer20 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean21 = multiBackgroundInitializer20.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer23 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean24 = multiBackgroundInitializer23.isStarted();
        multiBackgroundInitializer20.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer23);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer27 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean28 = multiBackgroundInitializer27.isStarted();
        multiBackgroundInitializer23.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer27);
        java.util.concurrent.ExecutorService executorService30 = null;
        multiBackgroundInitializer23.setExternalExecutor(executorService30);
        java.util.concurrent.ExecutorService executorService32 = multiBackgroundInitializer23.getExternalExecutor();
        multiBackgroundInitializer0.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer23);
        boolean boolean34 = multiBackgroundInitializer0.start();
        boolean boolean35 = multiBackgroundInitializer0.isStarted();
        boolean boolean36 = multiBackgroundInitializer0.start();
        java.util.concurrent.ExecutorService executorService37 = multiBackgroundInitializer0.getExternalExecutor();
        boolean boolean38 = multiBackgroundInitializer0.isStarted();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture39 = multiBackgroundInitializer0.getFuture();
        boolean boolean41 = multiBackgroundInitializerResultsFuture39.cancel(true);
        boolean boolean43 = multiBackgroundInitializerResultsFuture39.cancel(false);
        boolean boolean45 = multiBackgroundInitializerResultsFuture39.cancel(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(executorService32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(executorService37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test14596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14596");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        boolean boolean6 = multiBackgroundInitializer3.start();
        boolean boolean7 = multiBackgroundInitializer3.start();
        boolean boolean8 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults9 = multiBackgroundInitializer3.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture10 = multiBackgroundInitializer3.getFuture();
        java.util.concurrent.ExecutorService executorService11 = multiBackgroundInitializer3.getExternalExecutor();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults9);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture10);
        org.junit.Assert.assertNull(executorService11);
    }

    @Test
    public void test14597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14597");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture2 = multiBackgroundInitializer0.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults3 = multiBackgroundInitializer0.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture4 = multiBackgroundInitializer0.getFuture();
        boolean boolean5 = multiBackgroundInitializerResultsFuture4.isCancelled();
        boolean boolean6 = multiBackgroundInitializerResultsFuture4.isCancelled();
        boolean boolean8 = multiBackgroundInitializerResultsFuture4.cancel(false);
        boolean boolean9 = multiBackgroundInitializerResultsFuture4.isCancelled();
        boolean boolean10 = multiBackgroundInitializerResultsFuture4.isDone();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults11 = multiBackgroundInitializerResultsFuture4.get();
        boolean boolean12 = multiBackgroundInitializerResultsFuture4.isDone();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults13 = multiBackgroundInitializerResultsFuture4.get();
        boolean boolean15 = multiBackgroundInitializerResultsFuture4.cancel(true);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults16 = multiBackgroundInitializerResultsFuture4.get();
        boolean boolean18 = multiBackgroundInitializerResultsFuture4.cancel(true);
        boolean boolean19 = multiBackgroundInitializerResultsFuture4.isCancelled();
        java.lang.Class<?> wildcardClass20 = multiBackgroundInitializerResultsFuture4.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture2);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults3);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test14598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14598");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture2 = multiBackgroundInitializer0.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults3 = multiBackgroundInitializer0.get();
        java.util.concurrent.ExecutorService executorService4 = multiBackgroundInitializer0.getExternalExecutor();
        boolean boolean5 = multiBackgroundInitializer0.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture6 = multiBackgroundInitializer0.getFuture();
        boolean boolean7 = multiBackgroundInitializer0.isStarted();
        boolean boolean8 = multiBackgroundInitializer0.isStarted();
        java.util.concurrent.ExecutorService executorService9 = multiBackgroundInitializer0.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults10 = multiBackgroundInitializer0.get();
        boolean boolean11 = multiBackgroundInitializer0.start();
        java.util.concurrent.ExecutorService executorService12 = multiBackgroundInitializer0.getExternalExecutor();
        boolean boolean13 = multiBackgroundInitializer0.isStarted();
        java.lang.Class<?> wildcardClass14 = multiBackgroundInitializer0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture2);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults3);
        org.junit.Assert.assertNull(executorService4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(executorService9);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(executorService12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test14599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14599");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer10 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean11 = multiBackgroundInitializer10.isStarted();
        multiBackgroundInitializer7.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer10);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer14 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean15 = multiBackgroundInitializer14.isStarted();
        multiBackgroundInitializer10.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer14);
        boolean boolean17 = multiBackgroundInitializer10.start();
        multiBackgroundInitializer0.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer10);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer20 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean21 = multiBackgroundInitializer20.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer23 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean24 = multiBackgroundInitializer23.isStarted();
        multiBackgroundInitializer20.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer23);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer27 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean28 = multiBackgroundInitializer27.isStarted();
        multiBackgroundInitializer23.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer27);
        java.util.concurrent.ExecutorService executorService30 = null;
        multiBackgroundInitializer23.setExternalExecutor(executorService30);
        java.util.concurrent.ExecutorService executorService32 = multiBackgroundInitializer23.getExternalExecutor();
        multiBackgroundInitializer0.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer23);
        boolean boolean34 = multiBackgroundInitializer0.start();
        boolean boolean35 = multiBackgroundInitializer0.isStarted();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture36 = multiBackgroundInitializer0.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture37 = multiBackgroundInitializer0.getFuture();
        boolean boolean38 = multiBackgroundInitializer0.isStarted();
        boolean boolean39 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults40 = multiBackgroundInitializer0.get();
        boolean boolean41 = multiBackgroundInitializer0.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults42 = multiBackgroundInitializer0.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults43 = multiBackgroundInitializer0.get();
        java.util.concurrent.ExecutorService executorService44 = multiBackgroundInitializer0.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults45 = multiBackgroundInitializer0.get();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(executorService32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture36);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults42);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults43);
        org.junit.Assert.assertNull(executorService44);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults45);
    }

    @Test
    public void test14600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14600");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture2 = multiBackgroundInitializer0.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults3 = multiBackgroundInitializer0.get();
        boolean boolean4 = multiBackgroundInitializer0.start();
        java.util.concurrent.ExecutorService executorService5 = multiBackgroundInitializer0.getExternalExecutor();
        boolean boolean6 = multiBackgroundInitializer0.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults7 = multiBackgroundInitializer0.get();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture2);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(executorService5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults7);
    }

    @Test
    public void test14601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14601");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        java.util.concurrent.ExecutorService executorService6 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService7 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean8 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults9 = multiBackgroundInitializer3.get();
        boolean boolean10 = multiBackgroundInitializer3.start();
        boolean boolean11 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults12 = multiBackgroundInitializer3.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults13 = multiBackgroundInitializer3.get();
        java.util.concurrent.ExecutorService executorService14 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean15 = multiBackgroundInitializer3.start();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(executorService6);
        org.junit.Assert.assertNull(executorService7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults12);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults13);
        org.junit.Assert.assertNull(executorService14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test14602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14602");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        boolean boolean6 = multiBackgroundInitializer3.isStarted();
        boolean boolean7 = multiBackgroundInitializer3.isStarted();
        java.util.concurrent.ExecutorService executorService8 = null;
        multiBackgroundInitializer3.setExternalExecutor(executorService8);
        boolean boolean10 = multiBackgroundInitializer3.start();
        boolean boolean11 = multiBackgroundInitializer3.start();
        boolean boolean12 = multiBackgroundInitializer3.start();
        java.util.concurrent.ExecutorService executorService13 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiBackgroundInitializer3.setExternalExecutor(executorService13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot set ExecutorService after start()!");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test14603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14603");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        java.util.concurrent.ExecutorService executorService10 = null;
        multiBackgroundInitializer3.setExternalExecutor(executorService10);
        java.util.concurrent.ExecutorService executorService12 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean13 = multiBackgroundInitializer3.isStarted();
        java.util.concurrent.ExecutorService executorService14 = multiBackgroundInitializer3.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer16 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean17 = multiBackgroundInitializer16.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer19 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean20 = multiBackgroundInitializer19.isStarted();
        multiBackgroundInitializer16.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer19);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer23 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean24 = multiBackgroundInitializer23.isStarted();
        multiBackgroundInitializer19.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer23);
        java.util.concurrent.ExecutorService executorService26 = null;
        multiBackgroundInitializer19.setExternalExecutor(executorService26);
        java.util.concurrent.ExecutorService executorService28 = multiBackgroundInitializer19.getExternalExecutor();
        boolean boolean29 = multiBackgroundInitializer19.start();
        boolean boolean30 = multiBackgroundInitializer19.start();
        boolean boolean31 = multiBackgroundInitializer19.start();
        boolean boolean32 = multiBackgroundInitializer19.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults33 = multiBackgroundInitializer19.get();
        boolean boolean34 = multiBackgroundInitializer19.start();
        java.util.concurrent.ExecutorService executorService35 = multiBackgroundInitializer19.getExternalExecutor();
        boolean boolean36 = multiBackgroundInitializer19.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture37 = multiBackgroundInitializer19.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture38 = multiBackgroundInitializer19.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults39 = multiBackgroundInitializer19.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults40 = multiBackgroundInitializer19.get();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer19);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer43 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean44 = multiBackgroundInitializer43.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer46 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean47 = multiBackgroundInitializer46.isStarted();
        multiBackgroundInitializer43.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer46);
        boolean boolean49 = multiBackgroundInitializer46.isStarted();
        boolean boolean50 = multiBackgroundInitializer46.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults51 = multiBackgroundInitializer46.get();
        boolean boolean52 = multiBackgroundInitializer46.start();
        boolean boolean53 = multiBackgroundInitializer46.isStarted();
        boolean boolean54 = multiBackgroundInitializer46.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults55 = multiBackgroundInitializer46.get();
        // The following exception was thrown during execution in test generation
        try {
            multiBackgroundInitializer19.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: addInitializer() must not be called after start()!");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executorService12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(executorService14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(executorService28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(executorService35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture37);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture38);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults39);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults40);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults55);
    }

    @Test
    public void test14604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14604");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        boolean boolean6 = multiBackgroundInitializer3.isStarted();
        java.util.concurrent.ExecutorService executorService7 = null;
        multiBackgroundInitializer3.setExternalExecutor(executorService7);
        boolean boolean9 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults10 = multiBackgroundInitializer3.get();
        java.util.concurrent.ExecutorService executorService11 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean12 = multiBackgroundInitializer3.start();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults10);
        org.junit.Assert.assertNull(executorService11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test14605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14605");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer10 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean11 = multiBackgroundInitializer10.isStarted();
        multiBackgroundInitializer7.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer10);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer14 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean15 = multiBackgroundInitializer14.isStarted();
        multiBackgroundInitializer10.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer14);
        boolean boolean17 = multiBackgroundInitializer10.start();
        multiBackgroundInitializer0.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer10);
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture19 = multiBackgroundInitializer10.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture20 = multiBackgroundInitializer10.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults21 = multiBackgroundInitializer10.get();
        boolean boolean22 = multiBackgroundInitializer10.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture23 = multiBackgroundInitializer10.getFuture();
        java.util.concurrent.ExecutorService executorService24 = multiBackgroundInitializer10.getExternalExecutor();
        boolean boolean25 = multiBackgroundInitializer10.start();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture19);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture20);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture23);
        org.junit.Assert.assertNull(executorService24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test14606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14606");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        boolean boolean6 = multiBackgroundInitializer3.isStarted();
        boolean boolean7 = multiBackgroundInitializer3.isStarted();
        java.util.concurrent.ExecutorService executorService8 = null;
        multiBackgroundInitializer3.setExternalExecutor(executorService8);
        boolean boolean10 = multiBackgroundInitializer3.start();
        boolean boolean11 = multiBackgroundInitializer3.isStarted();
        java.util.concurrent.ExecutorService executorService12 = multiBackgroundInitializer3.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults13 = multiBackgroundInitializer3.get();
        java.util.concurrent.ExecutorService executorService14 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiBackgroundInitializer3.setExternalExecutor(executorService14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot set ExecutorService after start()!");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(executorService12);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults13);
    }

    @Test
    public void test14607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14607");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        java.util.concurrent.ExecutorService executorService6 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService7 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean8 = multiBackgroundInitializer3.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture9 = multiBackgroundInitializer3.getFuture();
        boolean boolean10 = multiBackgroundInitializer3.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture11 = multiBackgroundInitializer3.getFuture();
        boolean boolean12 = multiBackgroundInitializer3.isStarted();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(executorService6);
        org.junit.Assert.assertNull(executorService7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test14608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14608");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        boolean boolean6 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer8 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean9 = multiBackgroundInitializer8.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer11 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean12 = multiBackgroundInitializer11.isStarted();
        multiBackgroundInitializer8.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer11);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer15 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean16 = multiBackgroundInitializer15.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer18 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean19 = multiBackgroundInitializer18.isStarted();
        multiBackgroundInitializer15.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer18);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer22 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean23 = multiBackgroundInitializer22.isStarted();
        multiBackgroundInitializer18.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer22);
        boolean boolean25 = multiBackgroundInitializer18.start();
        multiBackgroundInitializer8.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer18);
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer18);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults28 = multiBackgroundInitializer18.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture29 = multiBackgroundInitializer18.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults30 = multiBackgroundInitializer18.get();
        java.util.concurrent.ExecutorService executorService31 = multiBackgroundInitializer18.getExternalExecutor();
        boolean boolean32 = multiBackgroundInitializer18.isStarted();
        java.util.concurrent.ExecutorService executorService33 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiBackgroundInitializer18.setExternalExecutor(executorService33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot set ExecutorService after start()!");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults28);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture29);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults30);
        org.junit.Assert.assertNull(executorService31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test14609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14609");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        boolean boolean10 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults11 = multiBackgroundInitializer3.get();
        boolean boolean12 = multiBackgroundInitializer3.isStarted();
        java.util.concurrent.ExecutorService executorService13 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture14 = multiBackgroundInitializer3.getFuture();
        boolean boolean15 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults16 = multiBackgroundInitializer3.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults17 = multiBackgroundInitializer3.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture18 = multiBackgroundInitializer3.getFuture();
        boolean boolean20 = multiBackgroundInitializerResultsFuture18.cancel(true);
        boolean boolean22 = multiBackgroundInitializerResultsFuture18.cancel(false);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults23 = multiBackgroundInitializerResultsFuture18.get();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(executorService13);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults16);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults17);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults23);
    }

    @Test
    public void test14610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14610");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture2 = multiBackgroundInitializer0.getFuture();
        boolean boolean3 = multiBackgroundInitializer0.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults4 = multiBackgroundInitializer0.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture5 = multiBackgroundInitializer0.getFuture();
        boolean boolean6 = multiBackgroundInitializer0.start();
        boolean boolean7 = multiBackgroundInitializer0.start();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults4);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test14611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14611");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        java.util.concurrent.ExecutorService executorService6 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService7 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService8 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService9 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean10 = multiBackgroundInitializer3.isStarted();
        java.util.concurrent.ExecutorService executorService11 = null;
        multiBackgroundInitializer3.setExternalExecutor(executorService11);
        java.util.concurrent.ExecutorService executorService13 = null;
        multiBackgroundInitializer3.setExternalExecutor(executorService13);
        java.util.concurrent.ExecutorService executorService15 = null;
        multiBackgroundInitializer3.setExternalExecutor(executorService15);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(executorService6);
        org.junit.Assert.assertNull(executorService7);
        org.junit.Assert.assertNull(executorService8);
        org.junit.Assert.assertNull(executorService9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test14612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14612");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        boolean boolean6 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults7 = multiBackgroundInitializer3.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults8 = multiBackgroundInitializer3.get();
        boolean boolean9 = multiBackgroundInitializer3.start();
        java.util.concurrent.ExecutorService executorService10 = multiBackgroundInitializer3.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults11 = multiBackgroundInitializer3.get();
        java.util.concurrent.ExecutorService executorService12 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture13 = multiBackgroundInitializer3.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture14 = multiBackgroundInitializer3.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer16 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean17 = multiBackgroundInitializer16.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer19 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean20 = multiBackgroundInitializer19.isStarted();
        multiBackgroundInitializer16.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer19);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer23 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean24 = multiBackgroundInitializer23.isStarted();
        multiBackgroundInitializer19.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer23);
        java.util.concurrent.ExecutorService executorService26 = null;
        multiBackgroundInitializer19.setExternalExecutor(executorService26);
        java.util.concurrent.ExecutorService executorService28 = multiBackgroundInitializer19.getExternalExecutor();
        boolean boolean29 = multiBackgroundInitializer19.start();
        boolean boolean30 = multiBackgroundInitializer19.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture31 = multiBackgroundInitializer19.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults32 = multiBackgroundInitializer19.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults33 = multiBackgroundInitializer19.get();
        boolean boolean34 = multiBackgroundInitializer19.start();
        // The following exception was thrown during execution in test generation
        try {
            multiBackgroundInitializer3.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: addInitializer() must not be called after start()!");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults7);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(executorService10);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults11);
        org.junit.Assert.assertNull(executorService12);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture13);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(executorService28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture31);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults32);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test14613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14613");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture2 = multiBackgroundInitializer0.getFuture();
        boolean boolean3 = multiBackgroundInitializer0.start();
        java.util.concurrent.ExecutorService executorService4 = multiBackgroundInitializer0.getExternalExecutor();
        boolean boolean5 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults6 = multiBackgroundInitializer0.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults7 = multiBackgroundInitializer0.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture8 = multiBackgroundInitializer0.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture9 = multiBackgroundInitializer0.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults10 = multiBackgroundInitializer0.get();
        boolean boolean11 = multiBackgroundInitializer0.start();
        java.util.concurrent.ExecutorService executorService12 = multiBackgroundInitializer0.getExternalExecutor();
        boolean boolean13 = multiBackgroundInitializer0.isStarted();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(executorService4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults6);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults7);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture8);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture9);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(executorService12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test14614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14614");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        boolean boolean6 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer8 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean9 = multiBackgroundInitializer8.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer11 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean12 = multiBackgroundInitializer11.isStarted();
        multiBackgroundInitializer8.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer11);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer15 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean16 = multiBackgroundInitializer15.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer18 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean19 = multiBackgroundInitializer18.isStarted();
        multiBackgroundInitializer15.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer18);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer22 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean23 = multiBackgroundInitializer22.isStarted();
        multiBackgroundInitializer18.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer22);
        boolean boolean25 = multiBackgroundInitializer18.start();
        multiBackgroundInitializer8.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer18);
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer18);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults28 = multiBackgroundInitializer18.get();
        boolean boolean29 = multiBackgroundInitializer18.isStarted();
        boolean boolean30 = multiBackgroundInitializer18.start();
        boolean boolean31 = multiBackgroundInitializer18.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults32 = multiBackgroundInitializer18.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture33 = multiBackgroundInitializer18.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer35 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean36 = multiBackgroundInitializer35.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer38 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean39 = multiBackgroundInitializer38.isStarted();
        multiBackgroundInitializer35.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer38);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer42 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean43 = multiBackgroundInitializer42.isStarted();
        multiBackgroundInitializer38.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer42);
        boolean boolean45 = multiBackgroundInitializer38.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults46 = multiBackgroundInitializer38.get();
        boolean boolean47 = multiBackgroundInitializer38.isStarted();
        java.util.concurrent.ExecutorService executorService48 = multiBackgroundInitializer38.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults49 = multiBackgroundInitializer38.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults50 = multiBackgroundInitializer38.get();
        // The following exception was thrown during execution in test generation
        try {
            multiBackgroundInitializer18.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: addInitializer() must not be called after start()!");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults32);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNull(executorService48);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults49);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults50);
    }

    @Test
    public void test14615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14615");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        java.util.concurrent.ExecutorService executorService10 = null;
        multiBackgroundInitializer3.setExternalExecutor(executorService10);
        java.util.concurrent.ExecutorService executorService12 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean13 = multiBackgroundInitializer3.start();
        boolean boolean14 = multiBackgroundInitializer3.isStarted();
        boolean boolean15 = multiBackgroundInitializer3.start();
        java.util.concurrent.ExecutorService executorService16 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService17 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean18 = multiBackgroundInitializer3.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults19 = multiBackgroundInitializer3.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults20 = multiBackgroundInitializer3.get();
        boolean boolean21 = multiBackgroundInitializer3.isStarted();
        boolean boolean22 = multiBackgroundInitializer3.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture23 = multiBackgroundInitializer3.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture24 = multiBackgroundInitializer3.getFuture();
        boolean boolean25 = multiBackgroundInitializerResultsFuture24.isCancelled();
        boolean boolean26 = multiBackgroundInitializerResultsFuture24.isDone();
        boolean boolean28 = multiBackgroundInitializerResultsFuture24.cancel(true);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults29 = multiBackgroundInitializerResultsFuture24.get();
        boolean boolean31 = multiBackgroundInitializerResultsFuture24.cancel(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executorService12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(executorService16);
        org.junit.Assert.assertNull(executorService17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults19);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture23);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test14616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14616");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer10 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean11 = multiBackgroundInitializer10.isStarted();
        multiBackgroundInitializer7.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer10);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer14 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean15 = multiBackgroundInitializer14.isStarted();
        multiBackgroundInitializer10.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer14);
        boolean boolean17 = multiBackgroundInitializer10.start();
        multiBackgroundInitializer0.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer10);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer20 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean21 = multiBackgroundInitializer20.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer23 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean24 = multiBackgroundInitializer23.isStarted();
        multiBackgroundInitializer20.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer23);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer27 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean28 = multiBackgroundInitializer27.isStarted();
        multiBackgroundInitializer23.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer27);
        java.util.concurrent.ExecutorService executorService30 = null;
        multiBackgroundInitializer23.setExternalExecutor(executorService30);
        java.util.concurrent.ExecutorService executorService32 = multiBackgroundInitializer23.getExternalExecutor();
        multiBackgroundInitializer0.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer23);
        boolean boolean34 = multiBackgroundInitializer0.start();
        boolean boolean35 = multiBackgroundInitializer0.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults36 = multiBackgroundInitializer0.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults37 = multiBackgroundInitializer0.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture38 = multiBackgroundInitializer0.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults39 = multiBackgroundInitializer0.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults40 = multiBackgroundInitializer0.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults41 = multiBackgroundInitializer0.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults42 = multiBackgroundInitializer0.get();
        boolean boolean43 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults44 = multiBackgroundInitializer0.get();
        org.apache.commons.lang3.concurrent.ConcurrentException concurrentException46 = multiBackgroundInitializerResults44.getException("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(executorService32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults36);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults37);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture38);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults39);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults40);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults41);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults44);
        org.junit.Assert.assertNull(concurrentException46);
    }

    @Test
    public void test14617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14617");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        boolean boolean10 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults11 = multiBackgroundInitializer3.get();
        boolean boolean12 = multiBackgroundInitializer3.isStarted();
        java.util.concurrent.ExecutorService executorService13 = multiBackgroundInitializer3.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults14 = multiBackgroundInitializer3.get();
        java.util.concurrent.ExecutorService executorService15 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean16 = multiBackgroundInitializer3.start();
        java.util.concurrent.ExecutorService executorService17 = multiBackgroundInitializer3.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults18 = multiBackgroundInitializer3.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults19 = multiBackgroundInitializer3.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults20 = multiBackgroundInitializer3.get();
        boolean boolean21 = multiBackgroundInitializerResults20.isSuccessful();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(executorService13);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults14);
        org.junit.Assert.assertNull(executorService15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(executorService17);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults18);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults19);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test14618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14618");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        java.util.concurrent.ExecutorService executorService6 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean7 = multiBackgroundInitializer3.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture8 = multiBackgroundInitializer3.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults9 = multiBackgroundInitializerResultsFuture8.get();
        boolean boolean10 = multiBackgroundInitializerResults9.isSuccessful();
        boolean boolean11 = multiBackgroundInitializerResults9.isSuccessful();
        boolean boolean12 = multiBackgroundInitializerResults9.isSuccessful();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.ConcurrentException concurrentException14 = multiBackgroundInitializerResults9.getException("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child initializer with name hi!");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(executorService6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture8);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test14619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14619");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer10 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean11 = multiBackgroundInitializer10.isStarted();
        multiBackgroundInitializer7.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer10);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer14 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean15 = multiBackgroundInitializer14.isStarted();
        multiBackgroundInitializer10.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer14);
        boolean boolean17 = multiBackgroundInitializer10.start();
        multiBackgroundInitializer0.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer10);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer20 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean21 = multiBackgroundInitializer20.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer23 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean24 = multiBackgroundInitializer23.isStarted();
        multiBackgroundInitializer20.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer23);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer27 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean28 = multiBackgroundInitializer27.isStarted();
        multiBackgroundInitializer23.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer27);
        java.util.concurrent.ExecutorService executorService30 = null;
        multiBackgroundInitializer23.setExternalExecutor(executorService30);
        java.util.concurrent.ExecutorService executorService32 = multiBackgroundInitializer23.getExternalExecutor();
        multiBackgroundInitializer0.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer23);
        boolean boolean34 = multiBackgroundInitializer0.start();
        boolean boolean35 = multiBackgroundInitializer0.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults36 = multiBackgroundInitializer0.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture37 = multiBackgroundInitializer0.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture38 = multiBackgroundInitializer0.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults39 = multiBackgroundInitializerResultsFuture38.get();
        org.apache.commons.lang3.concurrent.ConcurrentException concurrentException41 = multiBackgroundInitializerResults39.getException("hi!");
        org.apache.commons.lang3.concurrent.BackgroundInitializer<?> wildcardBackgroundInitializer43 = multiBackgroundInitializerResults39.getInitializer("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(executorService32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults36);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture37);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture38);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults39);
        org.junit.Assert.assertNull(concurrentException41);
        org.junit.Assert.assertNotNull(wildcardBackgroundInitializer43);
    }

    @Test
    public void test14620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14620");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        java.util.concurrent.ExecutorService executorService10 = null;
        multiBackgroundInitializer3.setExternalExecutor(executorService10);
        java.util.concurrent.ExecutorService executorService12 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean13 = multiBackgroundInitializer3.start();
        java.util.concurrent.ExecutorService executorService14 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture15 = multiBackgroundInitializer3.getFuture();
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults18 = multiBackgroundInitializerResultsFuture15.get((long) (byte) 10, timeUnit17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executorService12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(executorService14);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture15);
    }

    @Test
    public void test14621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14621");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        boolean boolean6 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer8 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean9 = multiBackgroundInitializer8.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer11 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean12 = multiBackgroundInitializer11.isStarted();
        multiBackgroundInitializer8.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer11);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer15 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean16 = multiBackgroundInitializer15.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer18 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean19 = multiBackgroundInitializer18.isStarted();
        multiBackgroundInitializer15.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer18);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer22 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean23 = multiBackgroundInitializer22.isStarted();
        multiBackgroundInitializer18.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer22);
        boolean boolean25 = multiBackgroundInitializer18.start();
        multiBackgroundInitializer8.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer18);
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer18);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults28 = multiBackgroundInitializer18.get();
        boolean boolean29 = multiBackgroundInitializer18.isStarted();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture30 = multiBackgroundInitializer18.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture31 = multiBackgroundInitializer18.getFuture();
        boolean boolean32 = multiBackgroundInitializer18.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults33 = multiBackgroundInitializer18.get();
        java.util.concurrent.ExecutorService executorService34 = multiBackgroundInitializer18.getExternalExecutor();
        boolean boolean35 = multiBackgroundInitializer18.isStarted();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture36 = multiBackgroundInitializer18.getFuture();
        java.util.concurrent.ExecutorService executorService37 = multiBackgroundInitializer18.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService38 = multiBackgroundInitializer18.getExternalExecutor();
        boolean boolean39 = multiBackgroundInitializer18.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults40 = multiBackgroundInitializer18.get();
        java.util.concurrent.ExecutorService executorService41 = multiBackgroundInitializer18.getExternalExecutor();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture30);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults33);
        org.junit.Assert.assertNull(executorService34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture36);
        org.junit.Assert.assertNull(executorService37);
        org.junit.Assert.assertNull(executorService38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults40);
        org.junit.Assert.assertNull(executorService41);
    }

    @Test
    public void test14622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14622");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        boolean boolean6 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer8 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean9 = multiBackgroundInitializer8.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer11 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean12 = multiBackgroundInitializer11.isStarted();
        multiBackgroundInitializer8.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer11);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer15 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean16 = multiBackgroundInitializer15.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer18 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean19 = multiBackgroundInitializer18.isStarted();
        multiBackgroundInitializer15.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer18);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer22 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean23 = multiBackgroundInitializer22.isStarted();
        multiBackgroundInitializer18.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer22);
        boolean boolean25 = multiBackgroundInitializer18.start();
        multiBackgroundInitializer8.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer18);
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer18);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults28 = multiBackgroundInitializer18.get();
        boolean boolean29 = multiBackgroundInitializer18.isStarted();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture30 = multiBackgroundInitializer18.getFuture();
        boolean boolean31 = multiBackgroundInitializer18.start();
        boolean boolean32 = multiBackgroundInitializer18.isStarted();
        java.util.concurrent.ExecutorService executorService33 = multiBackgroundInitializer18.getExternalExecutor();
        boolean boolean34 = multiBackgroundInitializer18.isStarted();
        boolean boolean35 = multiBackgroundInitializer18.isStarted();
        java.util.concurrent.ExecutorService executorService36 = multiBackgroundInitializer18.getExternalExecutor();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture37 = multiBackgroundInitializer18.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults38 = multiBackgroundInitializer18.get();
        boolean boolean39 = multiBackgroundInitializerResults38.isSuccessful();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(executorService33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(executorService36);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture37);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test14623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14623");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        boolean boolean10 = multiBackgroundInitializer3.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture11 = multiBackgroundInitializer3.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults12 = multiBackgroundInitializer3.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture13 = multiBackgroundInitializer3.getFuture();
        boolean boolean14 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults15 = multiBackgroundInitializer3.get();
        org.apache.commons.lang3.concurrent.ConcurrentException concurrentException17 = multiBackgroundInitializerResults15.getException("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture11);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults12);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults15);
        org.junit.Assert.assertNull(concurrentException17);
    }

    @Test
    public void test14624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14624");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        java.util.concurrent.ExecutorService executorService10 = null;
        multiBackgroundInitializer3.setExternalExecutor(executorService10);
        java.util.concurrent.ExecutorService executorService12 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean13 = multiBackgroundInitializer3.start();
        boolean boolean14 = multiBackgroundInitializer3.isStarted();
        boolean boolean15 = multiBackgroundInitializer3.start();
        boolean boolean16 = multiBackgroundInitializer3.start();
        java.util.concurrent.ExecutorService executorService17 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture18 = multiBackgroundInitializer3.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture19 = multiBackgroundInitializer3.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults20 = multiBackgroundInitializer3.get();
        java.util.concurrent.ExecutorService executorService21 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiBackgroundInitializer3.setExternalExecutor(executorService21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot set ExecutorService after start()!");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executorService12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(executorService17);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture18);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture19);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults20);
    }

    @Test
    public void test14625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14625");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture2 = multiBackgroundInitializer0.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults3 = multiBackgroundInitializer0.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture4 = multiBackgroundInitializer0.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults5 = multiBackgroundInitializer0.get();
        boolean boolean6 = multiBackgroundInitializer0.isStarted();
        java.util.concurrent.ExecutorService executorService7 = multiBackgroundInitializer0.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService8 = multiBackgroundInitializer0.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService9 = multiBackgroundInitializer0.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults10 = multiBackgroundInitializer0.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture11 = multiBackgroundInitializer0.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults12 = multiBackgroundInitializer0.get();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture2);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults3);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture4);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(executorService7);
        org.junit.Assert.assertNull(executorService8);
        org.junit.Assert.assertNull(executorService9);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults10);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture11);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults12);
    }

    @Test
    public void test14626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14626");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        boolean boolean6 = multiBackgroundInitializer3.start();
        boolean boolean7 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults8 = multiBackgroundInitializer3.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults9 = multiBackgroundInitializer3.get();
        boolean boolean10 = multiBackgroundInitializer3.isStarted();
        boolean boolean11 = multiBackgroundInitializer3.isStarted();
        boolean boolean12 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults13 = multiBackgroundInitializer3.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults14 = multiBackgroundInitializer3.get();
        java.lang.Class<?> wildcardClass15 = multiBackgroundInitializer3.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults8);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults13);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test14627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14627");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        boolean boolean6 = multiBackgroundInitializer3.isStarted();
        boolean boolean7 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults8 = multiBackgroundInitializer3.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults9 = multiBackgroundInitializer3.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture10 = multiBackgroundInitializer3.getFuture();
        boolean boolean12 = multiBackgroundInitializerResultsFuture10.cancel(false);
        boolean boolean13 = multiBackgroundInitializerResultsFuture10.isDone();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults14 = multiBackgroundInitializerResultsFuture10.get();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = multiBackgroundInitializerResults14.isException("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child initializer with name hi!");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults8);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults9);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults14);
    }

    @Test
    public void test14628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14628");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        java.util.concurrent.ExecutorService executorService10 = null;
        multiBackgroundInitializer3.setExternalExecutor(executorService10);
        java.util.concurrent.ExecutorService executorService12 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean13 = multiBackgroundInitializer3.start();
        boolean boolean14 = multiBackgroundInitializer3.isStarted();
        boolean boolean15 = multiBackgroundInitializer3.start();
        boolean boolean16 = multiBackgroundInitializer3.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture17 = multiBackgroundInitializer3.getFuture();
        boolean boolean18 = multiBackgroundInitializer3.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults19 = multiBackgroundInitializer3.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture20 = multiBackgroundInitializer3.getFuture();
        boolean boolean21 = multiBackgroundInitializer3.start();
        java.util.concurrent.ExecutorService executorService22 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean23 = multiBackgroundInitializer3.isStarted();
        boolean boolean24 = multiBackgroundInitializer3.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture25 = multiBackgroundInitializer3.getFuture();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executorService12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults19);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(executorService22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture25);
    }

    @Test
    public void test14629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14629");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture2 = multiBackgroundInitializer0.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults3 = multiBackgroundInitializer0.get();
        boolean boolean4 = multiBackgroundInitializer0.start();
        java.util.concurrent.ExecutorService executorService5 = multiBackgroundInitializer0.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults6 = multiBackgroundInitializer0.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture7 = multiBackgroundInitializer0.getFuture();
        java.util.concurrent.ExecutorService executorService8 = multiBackgroundInitializer0.getExternalExecutor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = executorService8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture2);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(executorService5);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults6);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture7);
        org.junit.Assert.assertNull(executorService8);
    }

    @Test
    public void test14630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14630");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer10 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean11 = multiBackgroundInitializer10.isStarted();
        multiBackgroundInitializer7.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer10);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer14 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean15 = multiBackgroundInitializer14.isStarted();
        multiBackgroundInitializer10.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer14);
        boolean boolean17 = multiBackgroundInitializer10.start();
        multiBackgroundInitializer0.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer10);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer20 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean21 = multiBackgroundInitializer20.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer23 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean24 = multiBackgroundInitializer23.isStarted();
        multiBackgroundInitializer20.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer23);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer27 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean28 = multiBackgroundInitializer27.isStarted();
        multiBackgroundInitializer23.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer27);
        java.util.concurrent.ExecutorService executorService30 = null;
        multiBackgroundInitializer23.setExternalExecutor(executorService30);
        java.util.concurrent.ExecutorService executorService32 = multiBackgroundInitializer23.getExternalExecutor();
        multiBackgroundInitializer0.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer23);
        boolean boolean34 = multiBackgroundInitializer0.start();
        boolean boolean35 = multiBackgroundInitializer0.isStarted();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture36 = multiBackgroundInitializer0.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture37 = multiBackgroundInitializer0.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture38 = multiBackgroundInitializer0.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults39 = multiBackgroundInitializer0.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture40 = multiBackgroundInitializer0.getFuture();
        java.lang.Class<?> wildcardClass41 = multiBackgroundInitializerResultsFuture40.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(executorService32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture36);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture37);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture38);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults39);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture40);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test14631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14631");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer11 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean12 = multiBackgroundInitializer11.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture13 = multiBackgroundInitializer11.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults14 = multiBackgroundInitializer11.get();
        boolean boolean15 = multiBackgroundInitializer11.start();
        multiBackgroundInitializer7.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer11);
        boolean boolean17 = multiBackgroundInitializer11.isStarted();
        boolean boolean18 = multiBackgroundInitializer11.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults19 = multiBackgroundInitializer11.get();
        boolean boolean20 = multiBackgroundInitializer11.start();
        boolean boolean21 = multiBackgroundInitializer11.start();
        boolean boolean22 = multiBackgroundInitializer11.isStarted();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture13);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test14632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14632");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        java.util.concurrent.ExecutorService executorService10 = null;
        multiBackgroundInitializer3.setExternalExecutor(executorService10);
        java.util.concurrent.ExecutorService executorService12 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean13 = multiBackgroundInitializer3.start();
        boolean boolean14 = multiBackgroundInitializer3.start();
        boolean boolean15 = multiBackgroundInitializer3.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture16 = multiBackgroundInitializer3.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture17 = multiBackgroundInitializer3.getFuture();
        boolean boolean18 = multiBackgroundInitializer3.start();
        java.util.concurrent.ExecutorService executorService19 = multiBackgroundInitializer3.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults20 = multiBackgroundInitializer3.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults21 = multiBackgroundInitializer3.get();
        java.util.concurrent.ExecutorService executorService22 = multiBackgroundInitializer3.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults23 = multiBackgroundInitializer3.get();
        boolean boolean25 = multiBackgroundInitializerResults23.isException("hi!");
        boolean boolean27 = multiBackgroundInitializerResults23.isException("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executorService12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture16);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(executorService19);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults20);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults21);
        org.junit.Assert.assertNull(executorService22);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test14633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14633");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        java.util.concurrent.ExecutorService executorService6 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean7 = multiBackgroundInitializer3.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture8 = multiBackgroundInitializer3.getFuture();
        boolean boolean9 = multiBackgroundInitializer3.isStarted();
        boolean boolean10 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults11 = multiBackgroundInitializer3.get();
        boolean boolean12 = multiBackgroundInitializer3.isStarted();
        java.util.concurrent.ExecutorService executorService13 = multiBackgroundInitializer3.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults14 = multiBackgroundInitializer3.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture15 = multiBackgroundInitializer3.getFuture();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(executorService6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(executorService13);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults14);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture15);
    }

    @Test
    public void test14634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14634");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        java.util.concurrent.ExecutorService executorService6 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService7 = null;
        multiBackgroundInitializer3.setExternalExecutor(executorService7);
        java.util.concurrent.ExecutorService executorService9 = null;
        multiBackgroundInitializer3.setExternalExecutor(executorService9);
        boolean boolean11 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults12 = multiBackgroundInitializer3.get();
        boolean boolean13 = multiBackgroundInitializer3.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture14 = multiBackgroundInitializer3.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults15 = multiBackgroundInitializerResultsFuture14.get();
        java.util.Set<java.lang.String> strSet16 = multiBackgroundInitializerResults15.initializerNames();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(executorService6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture14);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults15);
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test14635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14635");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        java.util.concurrent.ExecutorService executorService10 = null;
        multiBackgroundInitializer3.setExternalExecutor(executorService10);
        boolean boolean12 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults13 = multiBackgroundInitializer3.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture14 = multiBackgroundInitializer3.getFuture();
        boolean boolean15 = multiBackgroundInitializer3.isStarted();
        java.util.concurrent.ExecutorService executorService16 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService17 = multiBackgroundInitializer3.getExternalExecutor();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults13);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(executorService16);
        org.junit.Assert.assertNull(executorService17);
    }

    @Test
    public void test14636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14636");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture2 = multiBackgroundInitializer0.getFuture();
        boolean boolean3 = multiBackgroundInitializerResultsFuture2.isCancelled();
        boolean boolean4 = multiBackgroundInitializerResultsFuture2.isCancelled();
        boolean boolean5 = multiBackgroundInitializerResultsFuture2.isCancelled();
        boolean boolean6 = multiBackgroundInitializerResultsFuture2.isDone();
        boolean boolean7 = multiBackgroundInitializerResultsFuture2.isDone();
        boolean boolean8 = multiBackgroundInitializerResultsFuture2.isDone();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults9 = multiBackgroundInitializerResultsFuture2.get();
        boolean boolean11 = multiBackgroundInitializerResultsFuture2.cancel(true);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults12 = multiBackgroundInitializerResultsFuture2.get();
        boolean boolean13 = multiBackgroundInitializerResultsFuture2.isDone();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test14637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14637");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        java.util.concurrent.ExecutorService executorService10 = null;
        multiBackgroundInitializer3.setExternalExecutor(executorService10);
        java.util.concurrent.ExecutorService executorService12 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean13 = multiBackgroundInitializer3.start();
        boolean boolean14 = multiBackgroundInitializer3.isStarted();
        boolean boolean15 = multiBackgroundInitializer3.isStarted();
        boolean boolean16 = multiBackgroundInitializer3.start();
        boolean boolean17 = multiBackgroundInitializer3.isStarted();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture18 = multiBackgroundInitializer3.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer20 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean21 = multiBackgroundInitializer20.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer23 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean24 = multiBackgroundInitializer23.isStarted();
        multiBackgroundInitializer20.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer23);
        java.util.concurrent.ExecutorService executorService26 = multiBackgroundInitializer23.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService27 = multiBackgroundInitializer23.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService28 = null;
        multiBackgroundInitializer23.setExternalExecutor(executorService28);
        boolean boolean30 = multiBackgroundInitializer23.start();
        java.util.concurrent.ExecutorService executorService31 = multiBackgroundInitializer23.getExternalExecutor();
        boolean boolean32 = multiBackgroundInitializer23.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults33 = multiBackgroundInitializer23.get();
        boolean boolean34 = multiBackgroundInitializer23.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults35 = multiBackgroundInitializer23.get();
        // The following exception was thrown during execution in test generation
        try {
            multiBackgroundInitializer3.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: addInitializer() must not be called after start()!");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executorService12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(executorService26);
        org.junit.Assert.assertNull(executorService27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(executorService31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults35);
    }

    @Test
    public void test14638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14638");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        java.util.concurrent.ExecutorService executorService6 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService7 = null;
        multiBackgroundInitializer3.setExternalExecutor(executorService7);
        boolean boolean9 = multiBackgroundInitializer3.start();
        boolean boolean10 = multiBackgroundInitializer3.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture11 = multiBackgroundInitializer3.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture12 = multiBackgroundInitializer3.getFuture();
        boolean boolean13 = multiBackgroundInitializerResultsFuture12.isCancelled();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults14 = multiBackgroundInitializerResultsFuture12.get();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(executorService6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture11);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults14);
    }

    @Test
    public void test14639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14639");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        boolean boolean6 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer8 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean9 = multiBackgroundInitializer8.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer11 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean12 = multiBackgroundInitializer11.isStarted();
        multiBackgroundInitializer8.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer11);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer15 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean16 = multiBackgroundInitializer15.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer18 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean19 = multiBackgroundInitializer18.isStarted();
        multiBackgroundInitializer15.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer18);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer22 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean23 = multiBackgroundInitializer22.isStarted();
        multiBackgroundInitializer18.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer22);
        boolean boolean25 = multiBackgroundInitializer18.start();
        multiBackgroundInitializer8.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer18);
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer18);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults28 = multiBackgroundInitializer18.get();
        java.util.concurrent.ExecutorService executorService29 = multiBackgroundInitializer18.getExternalExecutor();
        boolean boolean30 = multiBackgroundInitializer18.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults31 = multiBackgroundInitializer18.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture32 = multiBackgroundInitializer18.getFuture();
        boolean boolean33 = multiBackgroundInitializer18.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture34 = multiBackgroundInitializer18.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture35 = multiBackgroundInitializer18.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults36 = multiBackgroundInitializer18.get();
        java.util.Set<java.lang.String> strSet37 = multiBackgroundInitializerResults36.initializerNames();
        java.util.Set<java.lang.String> strSet38 = multiBackgroundInitializerResults36.initializerNames();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults28);
        org.junit.Assert.assertNull(executorService29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults31);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture34);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture35);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults36);
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertNotNull(strSet38);
    }

    @Test
    public void test14640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14640");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        boolean boolean6 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer8 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean9 = multiBackgroundInitializer8.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer11 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean12 = multiBackgroundInitializer11.isStarted();
        multiBackgroundInitializer8.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer11);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer15 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean16 = multiBackgroundInitializer15.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer18 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean19 = multiBackgroundInitializer18.isStarted();
        multiBackgroundInitializer15.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer18);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer22 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean23 = multiBackgroundInitializer22.isStarted();
        multiBackgroundInitializer18.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer22);
        boolean boolean25 = multiBackgroundInitializer18.start();
        multiBackgroundInitializer8.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer18);
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer18);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults28 = multiBackgroundInitializer18.get();
        boolean boolean29 = multiBackgroundInitializer18.isStarted();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture30 = multiBackgroundInitializer18.getFuture();
        boolean boolean31 = multiBackgroundInitializer18.start();
        boolean boolean32 = multiBackgroundInitializer18.isStarted();
        java.util.concurrent.ExecutorService executorService33 = multiBackgroundInitializer18.getExternalExecutor();
        boolean boolean34 = multiBackgroundInitializer18.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture35 = multiBackgroundInitializer18.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults36 = multiBackgroundInitializerResultsFuture35.get();
        boolean boolean38 = multiBackgroundInitializerResultsFuture35.cancel(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(executorService33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture35);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test14641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14641");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        boolean boolean10 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults11 = multiBackgroundInitializer3.get();
        boolean boolean12 = multiBackgroundInitializer3.isStarted();
        java.util.concurrent.ExecutorService executorService13 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture14 = multiBackgroundInitializer3.getFuture();
        java.util.concurrent.ExecutorService executorService15 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean16 = multiBackgroundInitializer3.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture17 = multiBackgroundInitializer3.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture18 = multiBackgroundInitializer3.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture19 = multiBackgroundInitializer3.getFuture();
        boolean boolean20 = multiBackgroundInitializer3.isStarted();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(executorService13);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture14);
        org.junit.Assert.assertNull(executorService15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture17);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture18);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test14642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14642");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        java.util.concurrent.ExecutorService executorService6 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService7 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService8 = null;
        multiBackgroundInitializer3.setExternalExecutor(executorService8);
        boolean boolean10 = multiBackgroundInitializer3.start();
        java.util.concurrent.ExecutorService executorService11 = multiBackgroundInitializer3.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults12 = multiBackgroundInitializer3.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture13 = multiBackgroundInitializer3.getFuture();
        java.util.concurrent.ExecutorService executorService14 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean15 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults16 = multiBackgroundInitializer3.get();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = multiBackgroundInitializerResults16.isException("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child initializer with name ");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(executorService6);
        org.junit.Assert.assertNull(executorService7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(executorService11);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults12);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture13);
        org.junit.Assert.assertNull(executorService14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults16);
    }

    @Test
    public void test14643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14643");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture2 = multiBackgroundInitializer0.getFuture();
        boolean boolean3 = multiBackgroundInitializer0.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults4 = multiBackgroundInitializer0.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture5 = multiBackgroundInitializer0.getFuture();
        boolean boolean7 = multiBackgroundInitializerResultsFuture5.cancel(true);
        boolean boolean8 = multiBackgroundInitializerResultsFuture5.isCancelled();
        boolean boolean10 = multiBackgroundInitializerResultsFuture5.cancel(true);
        boolean boolean12 = multiBackgroundInitializerResultsFuture5.cancel(false);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults13 = multiBackgroundInitializerResultsFuture5.get();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults4);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults13);
    }

    @Test
    public void test14644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14644");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.start();
        boolean boolean2 = multiBackgroundInitializer0.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults3 = multiBackgroundInitializer0.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture4 = multiBackgroundInitializer0.getFuture();
        boolean boolean6 = multiBackgroundInitializerResultsFuture4.cancel(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults3);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test14645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14645");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        boolean boolean6 = multiBackgroundInitializer3.isStarted();
        boolean boolean7 = multiBackgroundInitializer3.isStarted();
        java.util.concurrent.ExecutorService executorService8 = null;
        multiBackgroundInitializer3.setExternalExecutor(executorService8);
        java.util.concurrent.ExecutorService executorService10 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean11 = multiBackgroundInitializer3.start();
        boolean boolean12 = multiBackgroundInitializer3.start();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(executorService10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test14646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14646");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer10 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean11 = multiBackgroundInitializer10.isStarted();
        multiBackgroundInitializer7.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer10);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer14 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean15 = multiBackgroundInitializer14.isStarted();
        multiBackgroundInitializer10.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer14);
        boolean boolean17 = multiBackgroundInitializer10.start();
        multiBackgroundInitializer0.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer10);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer20 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean21 = multiBackgroundInitializer20.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer23 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean24 = multiBackgroundInitializer23.isStarted();
        multiBackgroundInitializer20.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer23);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer27 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean28 = multiBackgroundInitializer27.isStarted();
        multiBackgroundInitializer23.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer27);
        java.util.concurrent.ExecutorService executorService30 = null;
        multiBackgroundInitializer23.setExternalExecutor(executorService30);
        java.util.concurrent.ExecutorService executorService32 = multiBackgroundInitializer23.getExternalExecutor();
        multiBackgroundInitializer0.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer23);
        boolean boolean34 = multiBackgroundInitializer0.start();
        boolean boolean35 = multiBackgroundInitializer0.isStarted();
        java.util.concurrent.ExecutorService executorService36 = multiBackgroundInitializer0.getExternalExecutor();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture37 = multiBackgroundInitializer0.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture38 = multiBackgroundInitializer0.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults39 = multiBackgroundInitializerResultsFuture38.get();
        org.apache.commons.lang3.concurrent.ConcurrentException concurrentException41 = multiBackgroundInitializerResults39.getException("hi!");
        org.apache.commons.lang3.concurrent.ConcurrentException concurrentException43 = multiBackgroundInitializerResults39.getException("hi!");
        boolean boolean44 = multiBackgroundInitializerResults39.isSuccessful();
        boolean boolean45 = multiBackgroundInitializerResults39.isSuccessful();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(executorService32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(executorService36);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture37);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture38);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults39);
        org.junit.Assert.assertNull(concurrentException41);
        org.junit.Assert.assertNull(concurrentException43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test14647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14647");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer10 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean11 = multiBackgroundInitializer10.isStarted();
        multiBackgroundInitializer7.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer10);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer14 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean15 = multiBackgroundInitializer14.isStarted();
        multiBackgroundInitializer10.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer14);
        boolean boolean17 = multiBackgroundInitializer10.start();
        multiBackgroundInitializer0.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer10);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer20 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean21 = multiBackgroundInitializer20.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer23 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean24 = multiBackgroundInitializer23.isStarted();
        multiBackgroundInitializer20.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer23);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer27 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean28 = multiBackgroundInitializer27.isStarted();
        multiBackgroundInitializer23.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer27);
        java.util.concurrent.ExecutorService executorService30 = null;
        multiBackgroundInitializer23.setExternalExecutor(executorService30);
        java.util.concurrent.ExecutorService executorService32 = multiBackgroundInitializer23.getExternalExecutor();
        multiBackgroundInitializer0.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer23);
        boolean boolean34 = multiBackgroundInitializer0.start();
        boolean boolean35 = multiBackgroundInitializer0.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults36 = multiBackgroundInitializer0.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults37 = multiBackgroundInitializer0.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture38 = multiBackgroundInitializer0.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults39 = multiBackgroundInitializer0.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults40 = multiBackgroundInitializer0.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture41 = multiBackgroundInitializer0.getFuture();
        java.lang.Class<?> wildcardClass42 = multiBackgroundInitializerResultsFuture41.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(executorService32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults36);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults37);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture38);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults39);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults40);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture41);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test14648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14648");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        boolean boolean6 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer8 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean9 = multiBackgroundInitializer8.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer11 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean12 = multiBackgroundInitializer11.isStarted();
        multiBackgroundInitializer8.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer11);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer15 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean16 = multiBackgroundInitializer15.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer18 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean19 = multiBackgroundInitializer18.isStarted();
        multiBackgroundInitializer15.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer18);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer22 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean23 = multiBackgroundInitializer22.isStarted();
        multiBackgroundInitializer18.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer22);
        boolean boolean25 = multiBackgroundInitializer18.start();
        multiBackgroundInitializer8.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer18);
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer18);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults28 = multiBackgroundInitializer18.get();
        boolean boolean29 = multiBackgroundInitializer18.isStarted();
        boolean boolean30 = multiBackgroundInitializer18.start();
        boolean boolean31 = multiBackgroundInitializer18.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults32 = multiBackgroundInitializer18.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults33 = multiBackgroundInitializer18.get();
        java.util.concurrent.ExecutorService executorService34 = multiBackgroundInitializer18.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults35 = multiBackgroundInitializer18.get();
        boolean boolean36 = multiBackgroundInitializerResults35.isSuccessful();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults32);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults33);
        org.junit.Assert.assertNull(executorService34);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test14649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14649");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        java.util.concurrent.ExecutorService executorService1 = multiBackgroundInitializer0.getExternalExecutor();
        boolean boolean2 = multiBackgroundInitializer0.start();
        java.util.concurrent.ExecutorService executorService3 = multiBackgroundInitializer0.getExternalExecutor();
        boolean boolean4 = multiBackgroundInitializer0.isStarted();
        java.util.concurrent.ExecutorService executorService5 = multiBackgroundInitializer0.getExternalExecutor();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture6 = multiBackgroundInitializer0.getFuture();
        java.util.concurrent.ExecutorService executorService7 = multiBackgroundInitializer0.getExternalExecutor();
        boolean boolean8 = multiBackgroundInitializer0.isStarted();
        boolean boolean9 = multiBackgroundInitializer0.isStarted();
        java.util.concurrent.ExecutorService executorService10 = multiBackgroundInitializer0.getExternalExecutor();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture11 = multiBackgroundInitializer0.getFuture();
        org.junit.Assert.assertNull(executorService1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(executorService3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(executorService5);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture6);
        org.junit.Assert.assertNull(executorService7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(executorService10);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture11);
    }

    @Test
    public void test14650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14650");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        java.util.concurrent.ExecutorService executorService10 = null;
        multiBackgroundInitializer3.setExternalExecutor(executorService10);
        boolean boolean12 = multiBackgroundInitializer3.start();
        java.util.concurrent.ExecutorService executorService13 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture14 = multiBackgroundInitializer3.getFuture();
        boolean boolean15 = multiBackgroundInitializerResultsFuture14.isDone();
        boolean boolean16 = multiBackgroundInitializerResultsFuture14.isDone();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults17 = multiBackgroundInitializerResultsFuture14.get();
        java.util.Set<java.lang.String> strSet18 = multiBackgroundInitializerResults17.initializerNames();
        boolean boolean19 = multiBackgroundInitializerResults17.isSuccessful();
        org.apache.commons.lang3.concurrent.ConcurrentException concurrentException21 = multiBackgroundInitializerResults17.getException("hi!");
        boolean boolean22 = multiBackgroundInitializerResults17.isSuccessful();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = multiBackgroundInitializerResults17.isException("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child initializer with name ");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(executorService13);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(concurrentException21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test14651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14651");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture2 = multiBackgroundInitializer0.getFuture();
        boolean boolean3 = multiBackgroundInitializer0.start();
        java.util.concurrent.ExecutorService executorService4 = multiBackgroundInitializer0.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService5 = multiBackgroundInitializer0.getExternalExecutor();
        boolean boolean6 = multiBackgroundInitializer0.start();
        boolean boolean7 = multiBackgroundInitializer0.isStarted();
        java.util.concurrent.ExecutorService executorService8 = multiBackgroundInitializer0.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService9 = multiBackgroundInitializer0.getExternalExecutor();
        boolean boolean10 = multiBackgroundInitializer0.start();
        boolean boolean11 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults12 = multiBackgroundInitializer0.get();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(executorService4);
        org.junit.Assert.assertNull(executorService5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(executorService8);
        org.junit.Assert.assertNull(executorService9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults12);
    }

    @Test
    public void test14652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14652");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        boolean boolean10 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults11 = multiBackgroundInitializer3.get();
        boolean boolean12 = multiBackgroundInitializer3.isStarted();
        java.util.concurrent.ExecutorService executorService13 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean14 = multiBackgroundInitializer3.isStarted();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(executorService13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test14653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14653");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        boolean boolean10 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults11 = multiBackgroundInitializer3.get();
        java.util.concurrent.ExecutorService executorService12 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture13 = multiBackgroundInitializer3.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults14 = multiBackgroundInitializer3.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture15 = multiBackgroundInitializer3.getFuture();
        java.util.concurrent.ExecutorService executorService16 = multiBackgroundInitializer3.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults17 = multiBackgroundInitializer3.get();
        java.util.concurrent.ExecutorService executorService18 = multiBackgroundInitializer3.getExternalExecutor();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults11);
        org.junit.Assert.assertNull(executorService12);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture13);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults14);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture15);
        org.junit.Assert.assertNull(executorService16);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults17);
        org.junit.Assert.assertNull(executorService18);
    }

    @Test
    public void test14654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14654");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        java.util.concurrent.ExecutorService executorService10 = null;
        multiBackgroundInitializer3.setExternalExecutor(executorService10);
        java.util.concurrent.ExecutorService executorService12 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean13 = multiBackgroundInitializer3.start();
        boolean boolean14 = multiBackgroundInitializer3.isStarted();
        boolean boolean15 = multiBackgroundInitializer3.start();
        java.util.concurrent.ExecutorService executorService16 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService17 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture18 = multiBackgroundInitializer3.getFuture();
        boolean boolean19 = multiBackgroundInitializerResultsFuture18.isDone();
        boolean boolean20 = multiBackgroundInitializerResultsFuture18.isCancelled();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults21 = multiBackgroundInitializerResultsFuture18.get();
        org.apache.commons.lang3.concurrent.BackgroundInitializer<?> wildcardBackgroundInitializer23 = multiBackgroundInitializerResults21.getInitializer("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executorService12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(executorService16);
        org.junit.Assert.assertNull(executorService17);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults21);
        org.junit.Assert.assertNotNull(wildcardBackgroundInitializer23);
    }

    @Test
    public void test14655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14655");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        java.util.concurrent.ExecutorService executorService6 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService7 = null;
        multiBackgroundInitializer3.setExternalExecutor(executorService7);
        boolean boolean9 = multiBackgroundInitializer3.start();
        boolean boolean10 = multiBackgroundInitializer3.start();
        java.util.concurrent.ExecutorService executorService11 = multiBackgroundInitializer3.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults12 = multiBackgroundInitializer3.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture13 = multiBackgroundInitializer3.getFuture();
        boolean boolean14 = multiBackgroundInitializer3.isStarted();
        boolean boolean15 = multiBackgroundInitializer3.isStarted();
        boolean boolean16 = multiBackgroundInitializer3.isStarted();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(executorService6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(executorService11);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults12);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test14656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14656");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer10 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean11 = multiBackgroundInitializer10.isStarted();
        multiBackgroundInitializer7.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer10);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer14 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean15 = multiBackgroundInitializer14.isStarted();
        multiBackgroundInitializer10.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer14);
        boolean boolean17 = multiBackgroundInitializer10.start();
        multiBackgroundInitializer0.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer10);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer20 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean21 = multiBackgroundInitializer20.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer23 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean24 = multiBackgroundInitializer23.isStarted();
        multiBackgroundInitializer20.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer23);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer27 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean28 = multiBackgroundInitializer27.isStarted();
        multiBackgroundInitializer23.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer27);
        java.util.concurrent.ExecutorService executorService30 = null;
        multiBackgroundInitializer23.setExternalExecutor(executorService30);
        java.util.concurrent.ExecutorService executorService32 = multiBackgroundInitializer23.getExternalExecutor();
        multiBackgroundInitializer0.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer23);
        boolean boolean34 = multiBackgroundInitializer0.start();
        boolean boolean35 = multiBackgroundInitializer0.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults36 = multiBackgroundInitializer0.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture37 = multiBackgroundInitializer0.getFuture();
        java.util.concurrent.ExecutorService executorService38 = multiBackgroundInitializer0.getExternalExecutor();
        boolean boolean39 = multiBackgroundInitializer0.start();
        java.util.concurrent.ExecutorService executorService40 = multiBackgroundInitializer0.getExternalExecutor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass41 = executorService40.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(executorService32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults36);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture37);
        org.junit.Assert.assertNull(executorService38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(executorService40);
    }

    @Test
    public void test14657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14657");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        java.util.concurrent.ExecutorService executorService10 = null;
        multiBackgroundInitializer3.setExternalExecutor(executorService10);
        java.util.concurrent.ExecutorService executorService12 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean13 = multiBackgroundInitializer3.start();
        boolean boolean14 = multiBackgroundInitializer3.isStarted();
        boolean boolean15 = multiBackgroundInitializer3.start();
        java.util.concurrent.ExecutorService executorService16 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService17 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean18 = multiBackgroundInitializer3.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults19 = multiBackgroundInitializer3.get();
        boolean boolean20 = multiBackgroundInitializer3.start();
        boolean boolean21 = multiBackgroundInitializer3.isStarted();
        boolean boolean22 = multiBackgroundInitializer3.start();
        boolean boolean23 = multiBackgroundInitializer3.start();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executorService12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(executorService16);
        org.junit.Assert.assertNull(executorService17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test14658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14658");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        boolean boolean10 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults11 = multiBackgroundInitializer3.get();
        boolean boolean12 = multiBackgroundInitializer3.isStarted();
        java.util.concurrent.ExecutorService executorService13 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture14 = multiBackgroundInitializer3.getFuture();
        java.util.concurrent.ExecutorService executorService15 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean16 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults17 = multiBackgroundInitializer3.get();
        java.lang.Object obj19 = multiBackgroundInitializerResults17.getResultObject("hi!");
        java.lang.Object obj21 = multiBackgroundInitializerResults17.getResultObject("hi!");
        boolean boolean23 = multiBackgroundInitializerResults17.isException("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(executorService13);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture14);
        org.junit.Assert.assertNull(executorService15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults17);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test14659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14659");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer10 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean11 = multiBackgroundInitializer10.isStarted();
        multiBackgroundInitializer7.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer10);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer14 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean15 = multiBackgroundInitializer14.isStarted();
        multiBackgroundInitializer10.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer14);
        boolean boolean17 = multiBackgroundInitializer10.start();
        multiBackgroundInitializer0.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer10);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer20 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean21 = multiBackgroundInitializer20.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer23 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean24 = multiBackgroundInitializer23.isStarted();
        multiBackgroundInitializer20.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer23);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer27 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean28 = multiBackgroundInitializer27.isStarted();
        multiBackgroundInitializer23.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer27);
        java.util.concurrent.ExecutorService executorService30 = null;
        multiBackgroundInitializer23.setExternalExecutor(executorService30);
        java.util.concurrent.ExecutorService executorService32 = multiBackgroundInitializer23.getExternalExecutor();
        multiBackgroundInitializer0.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer23);
        boolean boolean34 = multiBackgroundInitializer0.start();
        boolean boolean35 = multiBackgroundInitializer0.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults36 = multiBackgroundInitializer0.get();
        java.util.concurrent.ExecutorService executorService37 = multiBackgroundInitializer0.getExternalExecutor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass38 = executorService37.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(executorService32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults36);
        org.junit.Assert.assertNull(executorService37);
    }

    @Test
    public void test14660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14660");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        java.util.concurrent.ExecutorService executorService6 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService7 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean8 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults9 = multiBackgroundInitializer3.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults10 = multiBackgroundInitializer3.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults11 = multiBackgroundInitializer3.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture12 = multiBackgroundInitializer3.getFuture();
        boolean boolean13 = multiBackgroundInitializer3.start();
        boolean boolean14 = multiBackgroundInitializer3.start();
        java.util.concurrent.ExecutorService executorService15 = multiBackgroundInitializer3.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults16 = multiBackgroundInitializer3.get();
        java.util.concurrent.ExecutorService executorService17 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean18 = multiBackgroundInitializer3.isStarted();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(executorService6);
        org.junit.Assert.assertNull(executorService7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults9);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults10);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults11);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(executorService15);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults16);
        org.junit.Assert.assertNull(executorService17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test14661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14661");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        java.util.concurrent.ExecutorService executorService6 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService7 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean8 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults9 = multiBackgroundInitializer3.get();
        boolean boolean10 = multiBackgroundInitializer3.start();
        boolean boolean11 = multiBackgroundInitializer3.start();
        java.util.concurrent.ExecutorService executorService12 = multiBackgroundInitializer3.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults13 = multiBackgroundInitializer3.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture14 = multiBackgroundInitializer3.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults15 = multiBackgroundInitializerResultsFuture14.get();
        java.util.Set<java.lang.String> strSet16 = multiBackgroundInitializerResults15.initializerNames();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(executorService6);
        org.junit.Assert.assertNull(executorService7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(executorService12);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults13);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture14);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults15);
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test14662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14662");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        boolean boolean6 = multiBackgroundInitializer3.isStarted();
        boolean boolean7 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults8 = multiBackgroundInitializer3.get();
        java.util.concurrent.ExecutorService executorService9 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean10 = multiBackgroundInitializer3.start();
        java.util.concurrent.ExecutorService executorService11 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture12 = multiBackgroundInitializer3.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults13 = multiBackgroundInitializer3.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture14 = multiBackgroundInitializer3.getFuture();
        boolean boolean15 = multiBackgroundInitializerResultsFuture14.isCancelled();
        boolean boolean17 = multiBackgroundInitializerResultsFuture14.cancel(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults8);
        org.junit.Assert.assertNull(executorService9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(executorService11);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture12);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults13);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test14663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14663");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer10 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean11 = multiBackgroundInitializer10.isStarted();
        multiBackgroundInitializer7.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer10);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer14 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean15 = multiBackgroundInitializer14.isStarted();
        multiBackgroundInitializer10.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer14);
        boolean boolean17 = multiBackgroundInitializer10.start();
        multiBackgroundInitializer0.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer10);
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture19 = multiBackgroundInitializer10.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults20 = multiBackgroundInitializerResultsFuture19.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults21 = multiBackgroundInitializerResultsFuture19.get();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = multiBackgroundInitializerResults21.getResultObject("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child initializer with name ");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture19);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults20);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults21);
    }

    @Test
    public void test14664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14664");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        boolean boolean6 = multiBackgroundInitializer3.isStarted();
        boolean boolean7 = multiBackgroundInitializer3.start();
        boolean boolean8 = multiBackgroundInitializer3.start();
        boolean boolean9 = multiBackgroundInitializer3.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults10 = multiBackgroundInitializer3.get();
        boolean boolean11 = multiBackgroundInitializer3.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults12 = multiBackgroundInitializer3.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults13 = multiBackgroundInitializer3.get();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = multiBackgroundInitializerResults13.getResultObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child initializer with name hi!");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults12);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults13);
    }

    @Test
    public void test14665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14665");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        boolean boolean6 = multiBackgroundInitializer3.isStarted();
        boolean boolean7 = multiBackgroundInitializer3.isStarted();
        java.util.concurrent.ExecutorService executorService8 = null;
        multiBackgroundInitializer3.setExternalExecutor(executorService8);
        boolean boolean10 = multiBackgroundInitializer3.start();
        boolean boolean11 = multiBackgroundInitializer3.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture12 = multiBackgroundInitializer3.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults13 = multiBackgroundInitializer3.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults14 = multiBackgroundInitializer3.get();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture12);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults13);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults14);
    }

    @Test
    public void test14666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14666");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        java.util.concurrent.ExecutorService executorService6 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService7 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean8 = multiBackgroundInitializer3.start();
        boolean boolean9 = multiBackgroundInitializer3.isStarted();
        boolean boolean10 = multiBackgroundInitializer3.isStarted();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture11 = multiBackgroundInitializer3.getFuture();
        boolean boolean13 = multiBackgroundInitializerResultsFuture11.cancel(false);
        java.lang.Class<?> wildcardClass14 = multiBackgroundInitializerResultsFuture11.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(executorService6);
        org.junit.Assert.assertNull(executorService7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test14667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14667");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture2 = multiBackgroundInitializer0.getFuture();
        boolean boolean3 = multiBackgroundInitializerResultsFuture2.isCancelled();
        boolean boolean4 = multiBackgroundInitializerResultsFuture2.isDone();
        boolean boolean5 = multiBackgroundInitializerResultsFuture2.isDone();
        boolean boolean7 = multiBackgroundInitializerResultsFuture2.cancel(false);
        boolean boolean8 = multiBackgroundInitializerResultsFuture2.isCancelled();
        boolean boolean9 = multiBackgroundInitializerResultsFuture2.isDone();
        boolean boolean11 = multiBackgroundInitializerResultsFuture2.cancel(true);
        boolean boolean12 = multiBackgroundInitializerResultsFuture2.isCancelled();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test14668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14668");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer11 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean12 = multiBackgroundInitializer11.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture13 = multiBackgroundInitializer11.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults14 = multiBackgroundInitializer11.get();
        boolean boolean15 = multiBackgroundInitializer11.start();
        multiBackgroundInitializer7.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer11);
        boolean boolean17 = multiBackgroundInitializer11.isStarted();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture18 = multiBackgroundInitializer11.getFuture();
        boolean boolean19 = multiBackgroundInitializer11.isStarted();
        java.util.concurrent.ExecutorService executorService20 = multiBackgroundInitializer11.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults21 = multiBackgroundInitializer11.get();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture13);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(executorService20);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults21);
    }

    @Test
    public void test14669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14669");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        java.util.concurrent.ExecutorService executorService10 = null;
        multiBackgroundInitializer7.setExternalExecutor(executorService10);
        java.util.concurrent.ExecutorService executorService12 = null;
        multiBackgroundInitializer7.setExternalExecutor(executorService12);
        boolean boolean14 = multiBackgroundInitializer7.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults15 = multiBackgroundInitializer7.get();
        java.util.concurrent.ExecutorService executorService16 = multiBackgroundInitializer7.getExternalExecutor();
        boolean boolean17 = multiBackgroundInitializer7.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults18 = multiBackgroundInitializer7.get();
        java.util.concurrent.ExecutorService executorService19 = multiBackgroundInitializer7.getExternalExecutor();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture20 = multiBackgroundInitializer7.getFuture();
        boolean boolean21 = multiBackgroundInitializer7.start();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults15);
        org.junit.Assert.assertNull(executorService16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults18);
        org.junit.Assert.assertNull(executorService19);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test14670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14670");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        boolean boolean10 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults11 = multiBackgroundInitializer3.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults12 = multiBackgroundInitializer3.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture13 = multiBackgroundInitializer3.getFuture();
        boolean boolean14 = multiBackgroundInitializer3.isStarted();
        java.util.concurrent.ExecutorService executorService15 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean16 = multiBackgroundInitializer3.start();
        java.util.concurrent.ExecutorService executorService17 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean18 = multiBackgroundInitializer3.isStarted();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture19 = multiBackgroundInitializer3.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults20 = multiBackgroundInitializer3.get();
        org.apache.commons.lang3.concurrent.ConcurrentException concurrentException22 = multiBackgroundInitializerResults20.getException("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = multiBackgroundInitializerResults20.isException("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child initializer with name ");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults11);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults12);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(executorService15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(executorService17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture19);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults20);
        org.junit.Assert.assertNull(concurrentException22);
    }

    @Test
    public void test14671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14671");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        boolean boolean10 = multiBackgroundInitializer7.isStarted();
        java.util.concurrent.ExecutorService executorService11 = null;
        multiBackgroundInitializer7.setExternalExecutor(executorService11);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer14 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean15 = multiBackgroundInitializer14.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer17 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean18 = multiBackgroundInitializer17.isStarted();
        multiBackgroundInitializer14.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer17);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer21 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean22 = multiBackgroundInitializer21.isStarted();
        multiBackgroundInitializer17.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer21);
        java.util.concurrent.ExecutorService executorService24 = null;
        multiBackgroundInitializer17.setExternalExecutor(executorService24);
        java.util.concurrent.ExecutorService executorService26 = multiBackgroundInitializer17.getExternalExecutor();
        boolean boolean27 = multiBackgroundInitializer17.start();
        boolean boolean28 = multiBackgroundInitializer17.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture29 = multiBackgroundInitializer17.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults30 = multiBackgroundInitializer17.get();
        java.util.concurrent.ExecutorService executorService31 = multiBackgroundInitializer17.getExternalExecutor();
        multiBackgroundInitializer7.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer17);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults33 = multiBackgroundInitializer17.get();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(executorService26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture29);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults30);
        org.junit.Assert.assertNull(executorService31);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults33);
    }

    @Test
    public void test14672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14672");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        java.util.concurrent.ExecutorService executorService10 = null;
        multiBackgroundInitializer3.setExternalExecutor(executorService10);
        java.util.concurrent.ExecutorService executorService12 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean13 = multiBackgroundInitializer3.start();
        java.util.concurrent.ExecutorService executorService14 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService15 = multiBackgroundInitializer3.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults16 = multiBackgroundInitializer3.get();
        boolean boolean17 = multiBackgroundInitializer3.start();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executorService12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(executorService14);
        org.junit.Assert.assertNull(executorService15);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test14673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14673");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture2 = multiBackgroundInitializer0.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults3 = multiBackgroundInitializer0.get();
        java.util.concurrent.ExecutorService executorService4 = multiBackgroundInitializer0.getExternalExecutor();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture5 = multiBackgroundInitializer0.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults6 = multiBackgroundInitializer0.get();
        boolean boolean7 = multiBackgroundInitializer0.isStarted();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture8 = multiBackgroundInitializer0.getFuture();
        boolean boolean9 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults10 = multiBackgroundInitializer0.get();
        boolean boolean11 = multiBackgroundInitializer0.start();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture2);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults3);
        org.junit.Assert.assertNull(executorService4);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture5);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test14674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14674");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        boolean boolean6 = multiBackgroundInitializer3.isStarted();
        boolean boolean7 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults8 = multiBackgroundInitializer3.get();
        java.util.concurrent.ExecutorService executorService9 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean10 = multiBackgroundInitializer3.start();
        java.util.concurrent.ExecutorService executorService11 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean12 = multiBackgroundInitializer3.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults13 = multiBackgroundInitializer3.get();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults8);
        org.junit.Assert.assertNull(executorService9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(executorService11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults13);
    }

    @Test
    public void test14675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14675");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer10 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean11 = multiBackgroundInitializer10.isStarted();
        multiBackgroundInitializer7.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer10);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer14 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean15 = multiBackgroundInitializer14.isStarted();
        multiBackgroundInitializer10.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer14);
        boolean boolean17 = multiBackgroundInitializer10.start();
        multiBackgroundInitializer0.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer10);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer20 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean21 = multiBackgroundInitializer20.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer23 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean24 = multiBackgroundInitializer23.isStarted();
        multiBackgroundInitializer20.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer23);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer27 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean28 = multiBackgroundInitializer27.isStarted();
        multiBackgroundInitializer23.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer27);
        java.util.concurrent.ExecutorService executorService30 = null;
        multiBackgroundInitializer23.setExternalExecutor(executorService30);
        java.util.concurrent.ExecutorService executorService32 = multiBackgroundInitializer23.getExternalExecutor();
        multiBackgroundInitializer0.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer23);
        boolean boolean34 = multiBackgroundInitializer0.start();
        boolean boolean35 = multiBackgroundInitializer0.start();
        java.util.concurrent.ExecutorService executorService36 = multiBackgroundInitializer0.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults37 = multiBackgroundInitializer0.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults38 = multiBackgroundInitializer0.get();
        boolean boolean39 = multiBackgroundInitializer0.isStarted();
        boolean boolean40 = multiBackgroundInitializer0.start();
        boolean boolean41 = multiBackgroundInitializer0.start();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(executorService32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(executorService36);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults37);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test14676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14676");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        boolean boolean6 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer8 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean9 = multiBackgroundInitializer8.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer11 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean12 = multiBackgroundInitializer11.isStarted();
        multiBackgroundInitializer8.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer11);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer15 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean16 = multiBackgroundInitializer15.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer18 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean19 = multiBackgroundInitializer18.isStarted();
        multiBackgroundInitializer15.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer18);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer22 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean23 = multiBackgroundInitializer22.isStarted();
        multiBackgroundInitializer18.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer22);
        boolean boolean25 = multiBackgroundInitializer18.start();
        multiBackgroundInitializer8.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer18);
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer18);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults28 = multiBackgroundInitializer18.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture29 = multiBackgroundInitializer18.getFuture();
        boolean boolean30 = multiBackgroundInitializer18.isStarted();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture31 = multiBackgroundInitializer18.getFuture();
        boolean boolean32 = multiBackgroundInitializer18.start();
        boolean boolean33 = multiBackgroundInitializer18.start();
        boolean boolean34 = multiBackgroundInitializer18.start();
        boolean boolean35 = multiBackgroundInitializer18.isStarted();
        java.util.concurrent.ExecutorService executorService36 = multiBackgroundInitializer18.getExternalExecutor();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults28);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(executorService36);
    }

    @Test
    public void test14677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14677");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        boolean boolean6 = multiBackgroundInitializer3.start();
        boolean boolean7 = multiBackgroundInitializer3.start();
        boolean boolean8 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults9 = multiBackgroundInitializer3.get();
        boolean boolean10 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults11 = multiBackgroundInitializer3.get();
        boolean boolean12 = multiBackgroundInitializer3.start();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test14678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14678");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        boolean boolean2 = multiBackgroundInitializer0.start();
        boolean boolean3 = multiBackgroundInitializer0.isStarted();
        boolean boolean4 = multiBackgroundInitializer0.start();
        java.util.concurrent.ExecutorService executorService5 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiBackgroundInitializer0.setExternalExecutor(executorService5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot set ExecutorService after start()!");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test14679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14679");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture2 = multiBackgroundInitializer0.getFuture();
        boolean boolean3 = multiBackgroundInitializer0.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults4 = multiBackgroundInitializer0.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture5 = multiBackgroundInitializer0.getFuture();
        boolean boolean6 = multiBackgroundInitializer0.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults7 = multiBackgroundInitializer0.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults8 = multiBackgroundInitializer0.get();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults4);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults7);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults8);
    }

    @Test
    public void test14680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14680");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        boolean boolean6 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer8 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean9 = multiBackgroundInitializer8.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer11 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean12 = multiBackgroundInitializer11.isStarted();
        multiBackgroundInitializer8.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer11);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer15 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean16 = multiBackgroundInitializer15.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer18 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean19 = multiBackgroundInitializer18.isStarted();
        multiBackgroundInitializer15.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer18);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer22 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean23 = multiBackgroundInitializer22.isStarted();
        multiBackgroundInitializer18.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer22);
        boolean boolean25 = multiBackgroundInitializer18.start();
        multiBackgroundInitializer8.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer18);
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer18);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults28 = multiBackgroundInitializer18.get();
        boolean boolean29 = multiBackgroundInitializer18.isStarted();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture30 = multiBackgroundInitializer18.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture31 = multiBackgroundInitializer18.getFuture();
        boolean boolean32 = multiBackgroundInitializer18.start();
        java.util.concurrent.ExecutorService executorService33 = multiBackgroundInitializer18.getExternalExecutor();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture34 = multiBackgroundInitializer18.getFuture();
        java.util.concurrent.ExecutorService executorService35 = multiBackgroundInitializer18.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService36 = multiBackgroundInitializer18.getExternalExecutor();
        boolean boolean37 = multiBackgroundInitializer18.isStarted();
        java.util.concurrent.ExecutorService executorService38 = multiBackgroundInitializer18.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults39 = multiBackgroundInitializer18.get();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture30);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(executorService33);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture34);
        org.junit.Assert.assertNull(executorService35);
        org.junit.Assert.assertNull(executorService36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(executorService38);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults39);
    }

    @Test
    public void test14681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14681");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        boolean boolean6 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults7 = multiBackgroundInitializer3.get();
        boolean boolean8 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults9 = multiBackgroundInitializer3.get();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults9);
    }

    @Test
    public void test14682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14682");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        boolean boolean10 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults11 = multiBackgroundInitializer3.get();
        boolean boolean12 = multiBackgroundInitializer3.isStarted();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture13 = multiBackgroundInitializer3.getFuture();
        boolean boolean14 = multiBackgroundInitializer3.start();
        boolean boolean15 = multiBackgroundInitializer3.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults16 = multiBackgroundInitializer3.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults17 = multiBackgroundInitializer3.get();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults16);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults17);
    }

    @Test
    public void test14683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14683");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture2 = multiBackgroundInitializer0.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults3 = multiBackgroundInitializer0.get();
        java.util.concurrent.ExecutorService executorService4 = multiBackgroundInitializer0.getExternalExecutor();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture5 = multiBackgroundInitializer0.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture6 = multiBackgroundInitializer0.getFuture();
        boolean boolean7 = multiBackgroundInitializer0.start();
        java.util.concurrent.ExecutorService executorService8 = multiBackgroundInitializer0.getExternalExecutor();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture9 = multiBackgroundInitializer0.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults10 = multiBackgroundInitializer0.get();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture2);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults3);
        org.junit.Assert.assertNull(executorService4);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture5);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(executorService8);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture9);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults10);
    }

    @Test
    public void test14684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14684");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        java.util.concurrent.ExecutorService executorService10 = null;
        multiBackgroundInitializer3.setExternalExecutor(executorService10);
        java.util.concurrent.ExecutorService executorService12 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean13 = multiBackgroundInitializer3.start();
        boolean boolean14 = multiBackgroundInitializer3.start();
        boolean boolean15 = multiBackgroundInitializer3.start();
        boolean boolean16 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults17 = multiBackgroundInitializer3.get();
        boolean boolean18 = multiBackgroundInitializer3.start();
        java.util.concurrent.ExecutorService executorService19 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean20 = multiBackgroundInitializer3.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture21 = multiBackgroundInitializer3.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults22 = multiBackgroundInitializerResultsFuture21.get();
        java.util.concurrent.TimeUnit timeUnit24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults25 = multiBackgroundInitializerResultsFuture21.get((long) (byte) 1, timeUnit24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executorService12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(executorService19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture21);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults22);
    }

    @Test
    public void test14685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14685");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        java.util.concurrent.ExecutorService executorService10 = null;
        multiBackgroundInitializer3.setExternalExecutor(executorService10);
        java.util.concurrent.ExecutorService executorService12 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean13 = multiBackgroundInitializer3.start();
        java.util.concurrent.ExecutorService executorService14 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean15 = multiBackgroundInitializer3.isStarted();
        boolean boolean16 = multiBackgroundInitializer3.start();
        java.util.concurrent.ExecutorService executorService17 = multiBackgroundInitializer3.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults18 = multiBackgroundInitializer3.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults19 = multiBackgroundInitializer3.get();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executorService12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(executorService14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(executorService17);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults18);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults19);
    }

    @Test
    public void test14686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14686");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        java.util.concurrent.ExecutorService executorService10 = null;
        multiBackgroundInitializer3.setExternalExecutor(executorService10);
        java.util.concurrent.ExecutorService executorService12 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean13 = multiBackgroundInitializer3.start();
        boolean boolean14 = multiBackgroundInitializer3.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture15 = multiBackgroundInitializer3.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture16 = multiBackgroundInitializer3.getFuture();
        boolean boolean17 = multiBackgroundInitializer3.isStarted();
        boolean boolean18 = multiBackgroundInitializer3.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture19 = multiBackgroundInitializer3.getFuture();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executorService12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture15);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture19);
    }

    @Test
    public void test14687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14687");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        java.util.concurrent.ExecutorService executorService10 = null;
        multiBackgroundInitializer3.setExternalExecutor(executorService10);
        java.util.concurrent.ExecutorService executorService12 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean13 = multiBackgroundInitializer3.start();
        java.util.concurrent.ExecutorService executorService14 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean15 = multiBackgroundInitializer3.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults16 = multiBackgroundInitializer3.get();
        boolean boolean17 = multiBackgroundInitializer3.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults18 = multiBackgroundInitializer3.get();
        java.util.concurrent.ExecutorService executorService19 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture20 = multiBackgroundInitializer3.getFuture();
        boolean boolean21 = multiBackgroundInitializer3.isStarted();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executorService12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(executorService14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults18);
        org.junit.Assert.assertNull(executorService19);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test14688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14688");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture2 = multiBackgroundInitializer0.getFuture();
        boolean boolean3 = multiBackgroundInitializer0.start();
        java.util.concurrent.ExecutorService executorService4 = multiBackgroundInitializer0.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService5 = multiBackgroundInitializer0.getExternalExecutor();
        boolean boolean6 = multiBackgroundInitializer0.isStarted();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture7 = multiBackgroundInitializer0.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults8 = multiBackgroundInitializerResultsFuture7.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults9 = multiBackgroundInitializerResultsFuture7.get();
        boolean boolean11 = multiBackgroundInitializerResultsFuture7.cancel(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(executorService4);
        org.junit.Assert.assertNull(executorService5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture7);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults8);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test14689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14689");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        java.util.concurrent.ExecutorService executorService10 = null;
        multiBackgroundInitializer3.setExternalExecutor(executorService10);
        boolean boolean12 = multiBackgroundInitializer3.start();
        java.util.concurrent.ExecutorService executorService13 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture14 = multiBackgroundInitializer3.getFuture();
        boolean boolean15 = multiBackgroundInitializer3.isStarted();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture16 = multiBackgroundInitializer3.getFuture();
        java.util.concurrent.ExecutorService executorService17 = multiBackgroundInitializer3.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults18 = multiBackgroundInitializer3.get();
        java.util.concurrent.ExecutorService executorService19 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean20 = multiBackgroundInitializer3.isStarted();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture21 = multiBackgroundInitializer3.getFuture();
        boolean boolean22 = multiBackgroundInitializer3.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture23 = multiBackgroundInitializer3.getFuture();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(executorService13);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture16);
        org.junit.Assert.assertNull(executorService17);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults18);
        org.junit.Assert.assertNull(executorService19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture23);
    }

    @Test
    public void test14690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14690");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        boolean boolean6 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer8 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean9 = multiBackgroundInitializer8.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer11 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean12 = multiBackgroundInitializer11.isStarted();
        multiBackgroundInitializer8.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer11);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer15 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean16 = multiBackgroundInitializer15.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer18 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean19 = multiBackgroundInitializer18.isStarted();
        multiBackgroundInitializer15.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer18);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer22 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean23 = multiBackgroundInitializer22.isStarted();
        multiBackgroundInitializer18.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer22);
        boolean boolean25 = multiBackgroundInitializer18.start();
        multiBackgroundInitializer8.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer18);
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer18);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults28 = multiBackgroundInitializer18.get();
        boolean boolean29 = multiBackgroundInitializer18.isStarted();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture30 = multiBackgroundInitializer18.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture31 = multiBackgroundInitializer18.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults32 = multiBackgroundInitializerResultsFuture31.get();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture30);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture31);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults32);
    }

    @Test
    public void test14691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14691");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture2 = multiBackgroundInitializer0.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults3 = multiBackgroundInitializer0.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture4 = multiBackgroundInitializer0.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults5 = multiBackgroundInitializer0.get();
        boolean boolean6 = multiBackgroundInitializer0.isStarted();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture7 = multiBackgroundInitializer0.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults8 = multiBackgroundInitializer0.get();
        boolean boolean9 = multiBackgroundInitializer0.start();
        boolean boolean10 = multiBackgroundInitializer0.isStarted();
        java.util.concurrent.ExecutorService executorService11 = multiBackgroundInitializer0.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService12 = multiBackgroundInitializer0.getExternalExecutor();
        boolean boolean13 = multiBackgroundInitializer0.isStarted();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture2);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults3);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture4);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture7);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(executorService11);
        org.junit.Assert.assertNull(executorService12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test14692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14692");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        boolean boolean10 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults11 = multiBackgroundInitializer3.get();
        boolean boolean12 = multiBackgroundInitializer3.isStarted();
        java.util.concurrent.ExecutorService executorService13 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture14 = multiBackgroundInitializer3.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults15 = multiBackgroundInitializerResultsFuture14.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults16 = multiBackgroundInitializerResultsFuture14.get();
        java.util.Set<java.lang.String> strSet17 = multiBackgroundInitializerResults16.initializerNames();
        boolean boolean19 = multiBackgroundInitializerResults16.isException("hi!");
        boolean boolean20 = multiBackgroundInitializerResults16.isSuccessful();
        boolean boolean21 = multiBackgroundInitializerResults16.isSuccessful();
        boolean boolean22 = multiBackgroundInitializerResults16.isSuccessful();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(executorService13);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture14);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults15);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test14693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14693");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        boolean boolean2 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer4 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean5 = multiBackgroundInitializer4.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer4.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer11 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean12 = multiBackgroundInitializer11.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer14 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean15 = multiBackgroundInitializer14.isStarted();
        multiBackgroundInitializer11.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer14);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer18 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean19 = multiBackgroundInitializer18.isStarted();
        multiBackgroundInitializer14.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer18);
        boolean boolean21 = multiBackgroundInitializer14.start();
        multiBackgroundInitializer4.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer14);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer24 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean25 = multiBackgroundInitializer24.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer27 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean28 = multiBackgroundInitializer27.isStarted();
        multiBackgroundInitializer24.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer27);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer31 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean32 = multiBackgroundInitializer31.isStarted();
        multiBackgroundInitializer27.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer31);
        java.util.concurrent.ExecutorService executorService34 = null;
        multiBackgroundInitializer27.setExternalExecutor(executorService34);
        java.util.concurrent.ExecutorService executorService36 = multiBackgroundInitializer27.getExternalExecutor();
        multiBackgroundInitializer4.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer27);
        boolean boolean38 = multiBackgroundInitializer4.start();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer4);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults40 = multiBackgroundInitializer4.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture41 = multiBackgroundInitializer4.getFuture();
        boolean boolean42 = multiBackgroundInitializer4.isStarted();
        boolean boolean43 = multiBackgroundInitializer4.isStarted();
        java.util.concurrent.ExecutorService executorService44 = multiBackgroundInitializer4.getExternalExecutor();
        boolean boolean45 = multiBackgroundInitializer4.start();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(executorService36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults40);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNull(executorService44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test14694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14694");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        java.util.concurrent.ExecutorService executorService10 = null;
        multiBackgroundInitializer3.setExternalExecutor(executorService10);
        boolean boolean12 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults13 = multiBackgroundInitializer3.get();
        boolean boolean14 = multiBackgroundInitializer3.isStarted();
        boolean boolean15 = multiBackgroundInitializer3.isStarted();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test14695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14695");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        java.util.concurrent.ExecutorService executorService10 = null;
        multiBackgroundInitializer7.setExternalExecutor(executorService10);
        boolean boolean12 = multiBackgroundInitializer7.isStarted();
        boolean boolean13 = multiBackgroundInitializer7.start();
        java.util.concurrent.ExecutorService executorService14 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiBackgroundInitializer7.setExternalExecutor(executorService14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot set ExecutorService after start()!");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test14696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14696");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        boolean boolean10 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults11 = multiBackgroundInitializer3.get();
        boolean boolean12 = multiBackgroundInitializer3.isStarted();
        java.util.concurrent.ExecutorService executorService13 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture14 = multiBackgroundInitializer3.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults15 = multiBackgroundInitializerResultsFuture14.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults16 = multiBackgroundInitializerResultsFuture14.get();
        boolean boolean17 = multiBackgroundInitializerResultsFuture14.isDone();
        boolean boolean18 = multiBackgroundInitializerResultsFuture14.isCancelled();
        boolean boolean20 = multiBackgroundInitializerResultsFuture14.cancel(false);
        boolean boolean22 = multiBackgroundInitializerResultsFuture14.cancel(false);
        java.util.concurrent.TimeUnit timeUnit24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults25 = multiBackgroundInitializerResultsFuture14.get(10L, timeUnit24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(executorService13);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture14);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults15);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test14697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14697");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        java.util.concurrent.ExecutorService executorService6 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService7 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean8 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults9 = multiBackgroundInitializer3.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults10 = multiBackgroundInitializer3.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults11 = multiBackgroundInitializer3.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture12 = multiBackgroundInitializer3.getFuture();
        boolean boolean13 = multiBackgroundInitializerResultsFuture12.isDone();
        boolean boolean14 = multiBackgroundInitializerResultsFuture12.isDone();
        boolean boolean15 = multiBackgroundInitializerResultsFuture12.isDone();
        boolean boolean16 = multiBackgroundInitializerResultsFuture12.isCancelled();
        boolean boolean18 = multiBackgroundInitializerResultsFuture12.cancel(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(executorService6);
        org.junit.Assert.assertNull(executorService7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults9);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults10);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults11);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test14698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14698");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer10 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean11 = multiBackgroundInitializer10.isStarted();
        multiBackgroundInitializer7.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer10);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer14 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean15 = multiBackgroundInitializer14.isStarted();
        multiBackgroundInitializer10.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer14);
        boolean boolean17 = multiBackgroundInitializer10.start();
        multiBackgroundInitializer0.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer10);
        boolean boolean19 = multiBackgroundInitializer0.isStarted();
        java.util.concurrent.ExecutorService executorService20 = multiBackgroundInitializer0.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService21 = multiBackgroundInitializer0.getExternalExecutor();
        boolean boolean22 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer24 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean25 = multiBackgroundInitializer24.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer27 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean28 = multiBackgroundInitializer27.isStarted();
        multiBackgroundInitializer24.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer27);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer31 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean32 = multiBackgroundInitializer31.isStarted();
        multiBackgroundInitializer27.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer31);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer35 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean36 = multiBackgroundInitializer35.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture37 = multiBackgroundInitializer35.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults38 = multiBackgroundInitializer35.get();
        boolean boolean39 = multiBackgroundInitializer35.start();
        multiBackgroundInitializer31.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer35);
        boolean boolean41 = multiBackgroundInitializer35.isStarted();
        multiBackgroundInitializer0.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer35);
        java.util.concurrent.ExecutorService executorService43 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiBackgroundInitializer35.setExternalExecutor(executorService43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot set ExecutorService after start()!");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(executorService20);
        org.junit.Assert.assertNull(executorService21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture37);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test14699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14699");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        java.util.concurrent.ExecutorService executorService10 = null;
        multiBackgroundInitializer3.setExternalExecutor(executorService10);
        java.util.concurrent.ExecutorService executorService12 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean13 = multiBackgroundInitializer3.start();
        boolean boolean14 = multiBackgroundInitializer3.start();
        boolean boolean15 = multiBackgroundInitializer3.start();
        boolean boolean16 = multiBackgroundInitializer3.start();
        boolean boolean17 = multiBackgroundInitializer3.start();
        java.util.concurrent.ExecutorService executorService18 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean19 = multiBackgroundInitializer3.start();
        java.util.concurrent.ExecutorService executorService20 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture21 = multiBackgroundInitializer3.getFuture();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executorService12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(executorService18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(executorService20);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture21);
    }

    @Test
    public void test14700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14700");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        java.util.concurrent.ExecutorService executorService10 = null;
        multiBackgroundInitializer3.setExternalExecutor(executorService10);
        java.util.concurrent.ExecutorService executorService12 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean13 = multiBackgroundInitializer3.start();
        boolean boolean14 = multiBackgroundInitializer3.start();
        boolean boolean15 = multiBackgroundInitializer3.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture16 = multiBackgroundInitializer3.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults17 = multiBackgroundInitializer3.get();
        boolean boolean18 = multiBackgroundInitializer3.start();
        boolean boolean19 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults20 = multiBackgroundInitializer3.get();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executorService12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture16);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults20);
    }

    @Test
    public void test14701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14701");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        boolean boolean10 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults11 = multiBackgroundInitializer3.get();
        boolean boolean12 = multiBackgroundInitializer3.isStarted();
        java.util.concurrent.ExecutorService executorService13 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture14 = multiBackgroundInitializer3.getFuture();
        boolean boolean15 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults16 = multiBackgroundInitializer3.get();
        java.util.concurrent.ExecutorService executorService17 = multiBackgroundInitializer3.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults18 = multiBackgroundInitializer3.get();
        boolean boolean19 = multiBackgroundInitializer3.start();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(executorService13);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults16);
        org.junit.Assert.assertNull(executorService17);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test14702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14702");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        boolean boolean2 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer4 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean5 = multiBackgroundInitializer4.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer4.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer11 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean12 = multiBackgroundInitializer11.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer14 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean15 = multiBackgroundInitializer14.isStarted();
        multiBackgroundInitializer11.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer14);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer18 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean19 = multiBackgroundInitializer18.isStarted();
        multiBackgroundInitializer14.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer18);
        boolean boolean21 = multiBackgroundInitializer14.start();
        multiBackgroundInitializer4.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer14);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer24 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean25 = multiBackgroundInitializer24.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer27 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean28 = multiBackgroundInitializer27.isStarted();
        multiBackgroundInitializer24.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer27);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer31 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean32 = multiBackgroundInitializer31.isStarted();
        multiBackgroundInitializer27.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer31);
        java.util.concurrent.ExecutorService executorService34 = null;
        multiBackgroundInitializer27.setExternalExecutor(executorService34);
        java.util.concurrent.ExecutorService executorService36 = multiBackgroundInitializer27.getExternalExecutor();
        multiBackgroundInitializer4.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer27);
        boolean boolean38 = multiBackgroundInitializer4.start();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer4);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults40 = multiBackgroundInitializer4.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults41 = multiBackgroundInitializer4.get();
        org.apache.commons.lang3.concurrent.BackgroundInitializer<?> wildcardBackgroundInitializer43 = multiBackgroundInitializerResults41.getInitializer("hi!");
        boolean boolean45 = multiBackgroundInitializerResults41.isException("hi!");
        java.util.Set<java.lang.String> strSet46 = multiBackgroundInitializerResults41.initializerNames();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(executorService36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults40);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults41);
        org.junit.Assert.assertNotNull(wildcardBackgroundInitializer43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(strSet46);
    }

    @Test
    public void test14703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14703");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        java.util.concurrent.ExecutorService executorService10 = null;
        multiBackgroundInitializer3.setExternalExecutor(executorService10);
        java.util.concurrent.ExecutorService executorService12 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean13 = multiBackgroundInitializer3.start();
        boolean boolean14 = multiBackgroundInitializer3.isStarted();
        boolean boolean15 = multiBackgroundInitializer3.start();
        boolean boolean16 = multiBackgroundInitializer3.start();
        java.util.concurrent.ExecutorService executorService17 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture18 = multiBackgroundInitializer3.getFuture();
        boolean boolean19 = multiBackgroundInitializer3.start();
        boolean boolean20 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults21 = multiBackgroundInitializer3.get();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executorService12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(executorService17);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults21);
    }

    @Test
    public void test14704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14704");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        boolean boolean10 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults11 = multiBackgroundInitializer3.get();
        boolean boolean12 = multiBackgroundInitializer3.isStarted();
        java.util.concurrent.ExecutorService executorService13 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture14 = multiBackgroundInitializer3.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults15 = multiBackgroundInitializerResultsFuture14.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults16 = multiBackgroundInitializerResultsFuture14.get();
        boolean boolean17 = multiBackgroundInitializerResultsFuture14.isDone();
        boolean boolean18 = multiBackgroundInitializerResultsFuture14.isCancelled();
        boolean boolean20 = multiBackgroundInitializerResultsFuture14.cancel(false);
        java.lang.Class<?> wildcardClass21 = multiBackgroundInitializerResultsFuture14.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(executorService13);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture14);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults15);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test14705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14705");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        boolean boolean6 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer8 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean9 = multiBackgroundInitializer8.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer11 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean12 = multiBackgroundInitializer11.isStarted();
        multiBackgroundInitializer8.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer11);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer15 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean16 = multiBackgroundInitializer15.isStarted();
        multiBackgroundInitializer11.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer15);
        java.util.concurrent.ExecutorService executorService18 = null;
        multiBackgroundInitializer11.setExternalExecutor(executorService18);
        java.util.concurrent.ExecutorService executorService20 = multiBackgroundInitializer11.getExternalExecutor();
        boolean boolean21 = multiBackgroundInitializer11.start();
        java.util.concurrent.ExecutorService executorService22 = multiBackgroundInitializer11.getExternalExecutor();
        boolean boolean23 = multiBackgroundInitializer11.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer11);
        boolean boolean25 = multiBackgroundInitializer11.isStarted();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(executorService20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(executorService22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test14706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14706");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture2 = multiBackgroundInitializer0.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults3 = multiBackgroundInitializer0.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults4 = multiBackgroundInitializer0.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults5 = multiBackgroundInitializer0.get();
        java.util.concurrent.ExecutorService executorService6 = multiBackgroundInitializer0.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults7 = multiBackgroundInitializer0.get();
        boolean boolean8 = multiBackgroundInitializer0.isStarted();
        java.util.concurrent.ExecutorService executorService9 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiBackgroundInitializer0.setExternalExecutor(executorService9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot set ExecutorService after start()!");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture2);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults3);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults4);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults5);
        org.junit.Assert.assertNull(executorService6);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test14707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14707");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        java.util.concurrent.ExecutorService executorService10 = null;
        multiBackgroundInitializer3.setExternalExecutor(executorService10);
        java.util.concurrent.ExecutorService executorService12 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean13 = multiBackgroundInitializer3.start();
        boolean boolean14 = multiBackgroundInitializer3.isStarted();
        boolean boolean15 = multiBackgroundInitializer3.start();
        java.util.concurrent.ExecutorService executorService16 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService17 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture18 = multiBackgroundInitializer3.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture19 = multiBackgroundInitializer3.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults20 = multiBackgroundInitializer3.get();
        java.util.concurrent.ExecutorService executorService21 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture22 = multiBackgroundInitializer3.getFuture();
        java.util.concurrent.TimeUnit timeUnit24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults25 = multiBackgroundInitializerResultsFuture22.get(10L, timeUnit24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executorService12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(executorService16);
        org.junit.Assert.assertNull(executorService17);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture18);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture19);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults20);
        org.junit.Assert.assertNull(executorService21);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture22);
    }

    @Test
    public void test14708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14708");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        java.util.concurrent.ExecutorService executorService6 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService7 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean8 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults9 = multiBackgroundInitializer3.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults10 = multiBackgroundInitializer3.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults11 = multiBackgroundInitializer3.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults12 = multiBackgroundInitializer3.get();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.ConcurrentException concurrentException14 = multiBackgroundInitializerResults12.getException("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child initializer with name hi!");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(executorService6);
        org.junit.Assert.assertNull(executorService7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults9);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults10);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults11);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults12);
    }

    @Test
    public void test14709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14709");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        java.util.concurrent.ExecutorService executorService6 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService7 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean8 = multiBackgroundInitializer3.start();
        boolean boolean9 = multiBackgroundInitializer3.isStarted();
        boolean boolean10 = multiBackgroundInitializer3.isStarted();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture11 = multiBackgroundInitializer3.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults12 = multiBackgroundInitializer3.get();
        boolean boolean13 = multiBackgroundInitializer3.isStarted();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture14 = multiBackgroundInitializer3.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture15 = multiBackgroundInitializer3.getFuture();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(executorService6);
        org.junit.Assert.assertNull(executorService7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture11);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture14);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture15);
    }

    @Test
    public void test14710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14710");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        java.util.concurrent.ExecutorService executorService10 = null;
        multiBackgroundInitializer3.setExternalExecutor(executorService10);
        java.util.concurrent.ExecutorService executorService12 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean13 = multiBackgroundInitializer3.start();
        boolean boolean14 = multiBackgroundInitializer3.isStarted();
        boolean boolean15 = multiBackgroundInitializer3.start();
        java.util.concurrent.ExecutorService executorService16 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService17 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean18 = multiBackgroundInitializer3.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults19 = multiBackgroundInitializer3.get();
        boolean boolean20 = multiBackgroundInitializer3.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults21 = multiBackgroundInitializer3.get();
        java.util.Set<java.lang.String> strSet22 = multiBackgroundInitializerResults21.initializerNames();
        org.apache.commons.lang3.concurrent.BackgroundInitializer<?> wildcardBackgroundInitializer24 = multiBackgroundInitializerResults21.getInitializer("hi!");
        org.apache.commons.lang3.concurrent.ConcurrentException concurrentException26 = multiBackgroundInitializerResults21.getException("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executorService12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(executorService16);
        org.junit.Assert.assertNull(executorService17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults21);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(wildcardBackgroundInitializer24);
        org.junit.Assert.assertNull(concurrentException26);
    }

    @Test
    public void test14711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14711");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer10 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean11 = multiBackgroundInitializer10.isStarted();
        multiBackgroundInitializer7.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer10);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer14 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean15 = multiBackgroundInitializer14.isStarted();
        multiBackgroundInitializer10.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer14);
        boolean boolean17 = multiBackgroundInitializer10.start();
        multiBackgroundInitializer0.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer10);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer20 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean21 = multiBackgroundInitializer20.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer23 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean24 = multiBackgroundInitializer23.isStarted();
        multiBackgroundInitializer20.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer23);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer27 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean28 = multiBackgroundInitializer27.isStarted();
        multiBackgroundInitializer23.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer27);
        java.util.concurrent.ExecutorService executorService30 = null;
        multiBackgroundInitializer23.setExternalExecutor(executorService30);
        java.util.concurrent.ExecutorService executorService32 = multiBackgroundInitializer23.getExternalExecutor();
        multiBackgroundInitializer0.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer23);
        boolean boolean34 = multiBackgroundInitializer0.start();
        boolean boolean35 = multiBackgroundInitializer0.start();
        boolean boolean36 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults37 = multiBackgroundInitializer0.get();
        boolean boolean38 = multiBackgroundInitializerResults37.isSuccessful();
        java.util.Set<java.lang.String> strSet39 = multiBackgroundInitializerResults37.initializerNames();
        java.util.Set<java.lang.String> strSet40 = multiBackgroundInitializerResults37.initializerNames();
        boolean boolean42 = multiBackgroundInitializerResults37.isException("");
        java.util.Set<java.lang.String> strSet43 = multiBackgroundInitializerResults37.initializerNames();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(executorService32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(strSet39);
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(strSet43);
    }

    @Test
    public void test14712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14712");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        boolean boolean6 = multiBackgroundInitializer3.isStarted();
        boolean boolean7 = multiBackgroundInitializer3.start();
        java.util.concurrent.ExecutorService executorService8 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean9 = multiBackgroundInitializer3.start();
        boolean boolean10 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults11 = multiBackgroundInitializer3.get();
        java.util.concurrent.ExecutorService executorService12 = multiBackgroundInitializer3.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults13 = multiBackgroundInitializer3.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults14 = multiBackgroundInitializer3.get();
        boolean boolean15 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults16 = multiBackgroundInitializer3.get();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(executorService8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults11);
        org.junit.Assert.assertNull(executorService12);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults13);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults16);
    }

    @Test
    public void test14713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14713");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        java.util.concurrent.ExecutorService executorService10 = null;
        multiBackgroundInitializer3.setExternalExecutor(executorService10);
        java.util.concurrent.ExecutorService executorService12 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean13 = multiBackgroundInitializer3.start();
        boolean boolean14 = multiBackgroundInitializer3.isStarted();
        boolean boolean15 = multiBackgroundInitializer3.start();
        boolean boolean16 = multiBackgroundInitializer3.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture17 = multiBackgroundInitializer3.getFuture();
        boolean boolean18 = multiBackgroundInitializer3.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults19 = multiBackgroundInitializer3.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture20 = multiBackgroundInitializer3.getFuture();
        boolean boolean21 = multiBackgroundInitializer3.start();
        java.util.concurrent.ExecutorService executorService22 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean23 = multiBackgroundInitializer3.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults24 = multiBackgroundInitializer3.get();
        boolean boolean25 = multiBackgroundInitializer3.start();
        boolean boolean26 = multiBackgroundInitializer3.isStarted();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executorService12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults19);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(executorService22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test14714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14714");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        java.util.concurrent.ExecutorService executorService10 = null;
        multiBackgroundInitializer3.setExternalExecutor(executorService10);
        java.util.concurrent.ExecutorService executorService12 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean13 = multiBackgroundInitializer3.start();
        boolean boolean14 = multiBackgroundInitializer3.isStarted();
        boolean boolean15 = multiBackgroundInitializer3.start();
        java.util.concurrent.ExecutorService executorService16 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService17 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture18 = multiBackgroundInitializer3.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture19 = multiBackgroundInitializer3.getFuture();
        java.util.concurrent.ExecutorService executorService20 = multiBackgroundInitializer3.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults21 = multiBackgroundInitializer3.get();
        java.util.concurrent.ExecutorService executorService22 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService23 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiBackgroundInitializer3.setExternalExecutor(executorService23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot set ExecutorService after start()!");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executorService12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(executorService16);
        org.junit.Assert.assertNull(executorService17);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture18);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture19);
        org.junit.Assert.assertNull(executorService20);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults21);
        org.junit.Assert.assertNull(executorService22);
    }

    @Test
    public void test14715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14715");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture2 = multiBackgroundInitializer0.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults3 = multiBackgroundInitializer0.get();
        java.util.concurrent.ExecutorService executorService4 = multiBackgroundInitializer0.getExternalExecutor();
        boolean boolean5 = multiBackgroundInitializer0.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture6 = multiBackgroundInitializer0.getFuture();
        boolean boolean7 = multiBackgroundInitializer0.isStarted();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture8 = multiBackgroundInitializer0.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults9 = multiBackgroundInitializer0.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture10 = multiBackgroundInitializer0.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults11 = multiBackgroundInitializer0.get();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = multiBackgroundInitializerResults11.getResultObject("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child initializer with name ");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture2);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults3);
        org.junit.Assert.assertNull(executorService4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture8);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults9);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture10);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults11);
    }

    @Test
    public void test14716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14716");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        boolean boolean10 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults11 = multiBackgroundInitializer3.get();
        java.util.Set<java.lang.String> strSet12 = multiBackgroundInitializerResults11.initializerNames();
        java.util.Set<java.lang.String> strSet13 = multiBackgroundInitializerResults11.initializerNames();
        java.util.Set<java.lang.String> strSet14 = multiBackgroundInitializerResults11.initializerNames();
        java.lang.Object obj16 = multiBackgroundInitializerResults11.getResultObject("hi!");
        java.util.Set<java.lang.String> strSet17 = multiBackgroundInitializerResults11.initializerNames();
        boolean boolean18 = multiBackgroundInitializerResults11.isSuccessful();
        org.apache.commons.lang3.concurrent.BackgroundInitializer<?> wildcardBackgroundInitializer20 = multiBackgroundInitializerResults11.getInitializer("hi!");
        org.apache.commons.lang3.concurrent.ConcurrentException concurrentException22 = multiBackgroundInitializerResults11.getException("hi!");
        java.util.Set<java.lang.String> strSet23 = multiBackgroundInitializerResults11.initializerNames();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardBackgroundInitializer20);
        org.junit.Assert.assertNull(concurrentException22);
        org.junit.Assert.assertNotNull(strSet23);
    }

    @Test
    public void test14717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14717");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        java.util.concurrent.ExecutorService executorService10 = null;
        multiBackgroundInitializer3.setExternalExecutor(executorService10);
        java.util.concurrent.ExecutorService executorService12 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService13 = null;
        multiBackgroundInitializer3.setExternalExecutor(executorService13);
        boolean boolean15 = multiBackgroundInitializer3.isStarted();
        java.lang.Class<?> wildcardClass16 = multiBackgroundInitializer3.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executorService12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test14718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14718");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer10 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean11 = multiBackgroundInitializer10.isStarted();
        multiBackgroundInitializer7.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer10);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer14 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean15 = multiBackgroundInitializer14.isStarted();
        multiBackgroundInitializer10.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer14);
        boolean boolean17 = multiBackgroundInitializer10.start();
        multiBackgroundInitializer0.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer10);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer20 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean21 = multiBackgroundInitializer20.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer23 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean24 = multiBackgroundInitializer23.isStarted();
        multiBackgroundInitializer20.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer23);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer27 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean28 = multiBackgroundInitializer27.isStarted();
        multiBackgroundInitializer23.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer27);
        java.util.concurrent.ExecutorService executorService30 = null;
        multiBackgroundInitializer23.setExternalExecutor(executorService30);
        java.util.concurrent.ExecutorService executorService32 = multiBackgroundInitializer23.getExternalExecutor();
        multiBackgroundInitializer0.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer23);
        boolean boolean34 = multiBackgroundInitializer0.start();
        boolean boolean35 = multiBackgroundInitializer0.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults36 = multiBackgroundInitializer0.get();
        java.util.concurrent.ExecutorService executorService37 = multiBackgroundInitializer0.getExternalExecutor();
        boolean boolean38 = multiBackgroundInitializer0.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture39 = multiBackgroundInitializer0.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults40 = multiBackgroundInitializerResultsFuture39.get();
        boolean boolean41 = multiBackgroundInitializerResults40.isSuccessful();
        org.apache.commons.lang3.concurrent.ConcurrentException concurrentException43 = multiBackgroundInitializerResults40.getException("hi!");
        java.lang.Object obj45 = multiBackgroundInitializerResults40.getResultObject("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(executorService32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults36);
        org.junit.Assert.assertNull(executorService37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture39);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(concurrentException43);
        org.junit.Assert.assertNotNull(obj45);
    }

    @Test
    public void test14719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14719");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        boolean boolean2 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer4 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean5 = multiBackgroundInitializer4.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer4.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer11 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean12 = multiBackgroundInitializer11.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer14 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean15 = multiBackgroundInitializer14.isStarted();
        multiBackgroundInitializer11.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer14);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer18 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean19 = multiBackgroundInitializer18.isStarted();
        multiBackgroundInitializer14.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer18);
        boolean boolean21 = multiBackgroundInitializer14.start();
        multiBackgroundInitializer4.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer14);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer24 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean25 = multiBackgroundInitializer24.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer27 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean28 = multiBackgroundInitializer27.isStarted();
        multiBackgroundInitializer24.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer27);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer31 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean32 = multiBackgroundInitializer31.isStarted();
        multiBackgroundInitializer27.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer31);
        java.util.concurrent.ExecutorService executorService34 = null;
        multiBackgroundInitializer27.setExternalExecutor(executorService34);
        java.util.concurrent.ExecutorService executorService36 = multiBackgroundInitializer27.getExternalExecutor();
        multiBackgroundInitializer4.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer27);
        boolean boolean38 = multiBackgroundInitializer4.start();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer4);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults40 = multiBackgroundInitializer4.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture41 = multiBackgroundInitializer4.getFuture();
        boolean boolean42 = multiBackgroundInitializerResultsFuture41.isCancelled();
        boolean boolean43 = multiBackgroundInitializerResultsFuture41.isCancelled();
        boolean boolean45 = multiBackgroundInitializerResultsFuture41.cancel(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(executorService36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults40);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test14720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14720");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        java.util.concurrent.ExecutorService executorService6 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService7 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean8 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults9 = multiBackgroundInitializer3.get();
        boolean boolean10 = multiBackgroundInitializer3.start();
        java.util.concurrent.ExecutorService executorService11 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean12 = multiBackgroundInitializer3.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture13 = multiBackgroundInitializer3.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture14 = multiBackgroundInitializer3.getFuture();
        boolean boolean15 = multiBackgroundInitializer3.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture16 = multiBackgroundInitializer3.getFuture();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(executorService6);
        org.junit.Assert.assertNull(executorService7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(executorService11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture13);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture16);
    }

    @Test
    public void test14721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14721");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        java.util.concurrent.ExecutorService executorService6 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService7 = null;
        multiBackgroundInitializer3.setExternalExecutor(executorService7);
        boolean boolean9 = multiBackgroundInitializer3.start();
        boolean boolean10 = multiBackgroundInitializer3.start();
        java.util.concurrent.ExecutorService executorService11 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService12 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean13 = multiBackgroundInitializer3.isStarted();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture14 = multiBackgroundInitializer3.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults15 = multiBackgroundInitializer3.get();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(executorService6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(executorService11);
        org.junit.Assert.assertNull(executorService12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture14);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults15);
    }

    @Test
    public void test14722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14722");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture2 = multiBackgroundInitializer0.getFuture();
        boolean boolean3 = multiBackgroundInitializerResultsFuture2.isDone();
        boolean boolean4 = multiBackgroundInitializerResultsFuture2.isDone();
        boolean boolean5 = multiBackgroundInitializerResultsFuture2.isDone();
        boolean boolean6 = multiBackgroundInitializerResultsFuture2.isCancelled();
        boolean boolean7 = multiBackgroundInitializerResultsFuture2.isCancelled();
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults10 = multiBackgroundInitializerResultsFuture2.get(10L, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test14723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14723");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        java.util.concurrent.ExecutorService executorService6 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean7 = multiBackgroundInitializer3.isStarted();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults8 = multiBackgroundInitializer3.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: start() must be called first!");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(executorService6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test14724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14724");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture2 = multiBackgroundInitializer0.getFuture();
        boolean boolean3 = multiBackgroundInitializer0.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults4 = multiBackgroundInitializer0.get();
        boolean boolean5 = multiBackgroundInitializer0.start();
        boolean boolean6 = multiBackgroundInitializer0.isStarted();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test14725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14725");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        boolean boolean6 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer8 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean9 = multiBackgroundInitializer8.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer11 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean12 = multiBackgroundInitializer11.isStarted();
        multiBackgroundInitializer8.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer11);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer15 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean16 = multiBackgroundInitializer15.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer18 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean19 = multiBackgroundInitializer18.isStarted();
        multiBackgroundInitializer15.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer18);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer22 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean23 = multiBackgroundInitializer22.isStarted();
        multiBackgroundInitializer18.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer22);
        boolean boolean25 = multiBackgroundInitializer18.start();
        multiBackgroundInitializer8.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer18);
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer18);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults28 = multiBackgroundInitializer18.get();
        boolean boolean29 = multiBackgroundInitializer18.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults30 = multiBackgroundInitializer18.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults31 = multiBackgroundInitializer18.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults32 = multiBackgroundInitializer18.get();
        boolean boolean33 = multiBackgroundInitializerResults32.isSuccessful();
        boolean boolean35 = multiBackgroundInitializerResults32.isException("hi!");
        java.lang.Object obj37 = multiBackgroundInitializerResults32.getResultObject("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults30);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults31);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(obj37);
    }

    @Test
    public void test14726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14726");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture2 = multiBackgroundInitializer0.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults3 = multiBackgroundInitializer0.get();
        java.util.concurrent.ExecutorService executorService4 = multiBackgroundInitializer0.getExternalExecutor();
        boolean boolean5 = multiBackgroundInitializer0.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture6 = multiBackgroundInitializer0.getFuture();
        boolean boolean7 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults8 = multiBackgroundInitializer0.get();
        java.util.concurrent.ExecutorService executorService9 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiBackgroundInitializer0.setExternalExecutor(executorService9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot set ExecutorService after start()!");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture2);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults3);
        org.junit.Assert.assertNull(executorService4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults8);
    }

    @Test
    public void test14727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14727");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.start();
        boolean boolean2 = multiBackgroundInitializer0.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture3 = multiBackgroundInitializer0.getFuture();
        boolean boolean4 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults5 = multiBackgroundInitializer0.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults6 = multiBackgroundInitializer0.get();
        boolean boolean7 = multiBackgroundInitializerResults6.isSuccessful();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults5);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test14728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14728");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        boolean boolean10 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults11 = multiBackgroundInitializer3.get();
        boolean boolean12 = multiBackgroundInitializer3.isStarted();
        java.util.concurrent.ExecutorService executorService13 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture14 = multiBackgroundInitializer3.getFuture();
        java.util.concurrent.ExecutorService executorService15 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean16 = multiBackgroundInitializer3.isStarted();
        java.util.concurrent.ExecutorService executorService17 = multiBackgroundInitializer3.getExternalExecutor();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture18 = multiBackgroundInitializer3.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture19 = multiBackgroundInitializer3.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults20 = multiBackgroundInitializer3.get();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.BackgroundInitializer<?> wildcardBackgroundInitializer22 = multiBackgroundInitializerResults20.getInitializer("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child initializer with name ");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(executorService13);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture14);
        org.junit.Assert.assertNull(executorService15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(executorService17);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture18);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture19);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults20);
    }

    @Test
    public void test14729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14729");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer10 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean11 = multiBackgroundInitializer10.isStarted();
        multiBackgroundInitializer7.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer10);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer14 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean15 = multiBackgroundInitializer14.isStarted();
        multiBackgroundInitializer10.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer14);
        boolean boolean17 = multiBackgroundInitializer10.start();
        multiBackgroundInitializer0.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer10);
        boolean boolean19 = multiBackgroundInitializer0.isStarted();
        java.util.concurrent.ExecutorService executorService20 = null;
        multiBackgroundInitializer0.setExternalExecutor(executorService20);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer23 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean24 = multiBackgroundInitializer23.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer26 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean27 = multiBackgroundInitializer26.isStarted();
        multiBackgroundInitializer23.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer26);
        boolean boolean29 = multiBackgroundInitializer23.isStarted();
        boolean boolean30 = multiBackgroundInitializer23.start();
        multiBackgroundInitializer0.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer23);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults32 = multiBackgroundInitializer23.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults33 = multiBackgroundInitializer23.get();
        boolean boolean34 = multiBackgroundInitializer23.isStarted();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture35 = multiBackgroundInitializer23.getFuture();
        boolean boolean37 = multiBackgroundInitializerResultsFuture35.cancel(false);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults38 = multiBackgroundInitializerResultsFuture35.get();
        java.lang.Object obj40 = multiBackgroundInitializerResults38.getResultObject("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults32);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults38);
        org.junit.Assert.assertNotNull(obj40);
    }

    @Test
    public void test14730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14730");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        java.util.concurrent.ExecutorService executorService10 = null;
        multiBackgroundInitializer3.setExternalExecutor(executorService10);
        boolean boolean12 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults13 = multiBackgroundInitializer3.get();
        boolean boolean14 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults15 = multiBackgroundInitializer3.get();
        java.util.concurrent.ExecutorService executorService16 = multiBackgroundInitializer3.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults17 = multiBackgroundInitializer3.get();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults15);
        org.junit.Assert.assertNull(executorService16);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults17);
    }

    @Test
    public void test14731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14731");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        java.util.concurrent.ExecutorService executorService10 = null;
        multiBackgroundInitializer3.setExternalExecutor(executorService10);
        java.util.concurrent.ExecutorService executorService12 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean13 = multiBackgroundInitializer3.start();
        boolean boolean14 = multiBackgroundInitializer3.start();
        boolean boolean15 = multiBackgroundInitializer3.start();
        boolean boolean16 = multiBackgroundInitializer3.start();
        boolean boolean17 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults18 = multiBackgroundInitializer3.get();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executorService12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults18);
    }

    @Test
    public void test14732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14732");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        boolean boolean10 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults11 = multiBackgroundInitializer3.get();
        boolean boolean12 = multiBackgroundInitializer3.isStarted();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture13 = multiBackgroundInitializer3.getFuture();
        boolean boolean14 = multiBackgroundInitializerResultsFuture13.isDone();
        boolean boolean16 = multiBackgroundInitializerResultsFuture13.cancel(true);
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults19 = multiBackgroundInitializerResultsFuture13.get(0L, timeUnit18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test14733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14733");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        boolean boolean10 = multiBackgroundInitializer3.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture11 = multiBackgroundInitializer3.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults12 = multiBackgroundInitializer3.get();
        org.apache.commons.lang3.concurrent.ConcurrentException concurrentException14 = multiBackgroundInitializerResults12.getException("hi!");
        boolean boolean15 = multiBackgroundInitializerResults12.isSuccessful();
        boolean boolean16 = multiBackgroundInitializerResults12.isSuccessful();
        boolean boolean17 = multiBackgroundInitializerResults12.isSuccessful();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture11);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults12);
        org.junit.Assert.assertNull(concurrentException14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test14734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14734");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer10 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean11 = multiBackgroundInitializer10.isStarted();
        multiBackgroundInitializer7.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer10);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer14 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean15 = multiBackgroundInitializer14.isStarted();
        multiBackgroundInitializer10.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer14);
        boolean boolean17 = multiBackgroundInitializer10.start();
        multiBackgroundInitializer0.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer10);
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture19 = multiBackgroundInitializer10.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture20 = multiBackgroundInitializer10.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults21 = multiBackgroundInitializer10.get();
        boolean boolean22 = multiBackgroundInitializer10.start();
        java.util.concurrent.ExecutorService executorService23 = multiBackgroundInitializer10.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService24 = multiBackgroundInitializer10.getExternalExecutor();
        boolean boolean25 = multiBackgroundInitializer10.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults26 = multiBackgroundInitializer10.get();
        java.util.concurrent.ExecutorService executorService27 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiBackgroundInitializer10.setExternalExecutor(executorService27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot set ExecutorService after start()!");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture19);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture20);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(executorService23);
        org.junit.Assert.assertNull(executorService24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults26);
    }

    @Test
    public void test14735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14735");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture2 = multiBackgroundInitializer0.getFuture();
        boolean boolean3 = multiBackgroundInitializer0.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults4 = multiBackgroundInitializer0.get();
        boolean boolean5 = multiBackgroundInitializer0.start();
        java.util.concurrent.ExecutorService executorService6 = multiBackgroundInitializer0.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults7 = multiBackgroundInitializer0.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture8 = multiBackgroundInitializer0.getFuture();
        boolean boolean9 = multiBackgroundInitializer0.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults10 = multiBackgroundInitializer0.get();
        java.util.Set<java.lang.String> strSet11 = multiBackgroundInitializerResults10.initializerNames();
        java.lang.Class<?> wildcardClass12 = multiBackgroundInitializerResults10.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(executorService6);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults7);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test14736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14736");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        java.util.concurrent.ExecutorService executorService10 = null;
        multiBackgroundInitializer3.setExternalExecutor(executorService10);
        java.util.concurrent.ExecutorService executorService12 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean13 = multiBackgroundInitializer3.start();
        boolean boolean14 = multiBackgroundInitializer3.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture15 = multiBackgroundInitializer3.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults16 = multiBackgroundInitializer3.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults17 = multiBackgroundInitializer3.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults18 = multiBackgroundInitializer3.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults19 = multiBackgroundInitializer3.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults20 = multiBackgroundInitializer3.get();
        boolean boolean22 = multiBackgroundInitializerResults20.isException("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executorService12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture15);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults16);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults17);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults18);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults19);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test14737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14737");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean4 = multiBackgroundInitializer3.isStarted();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean8 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer3.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        java.util.concurrent.ExecutorService executorService10 = null;
        multiBackgroundInitializer3.setExternalExecutor(executorService10);
        java.util.concurrent.ExecutorService executorService12 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean13 = multiBackgroundInitializer3.start();
        boolean boolean14 = multiBackgroundInitializer3.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture15 = multiBackgroundInitializer3.getFuture();
        java.util.concurrent.ExecutorService executorService16 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean17 = multiBackgroundInitializer3.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture18 = multiBackgroundInitializer3.getFuture();
        boolean boolean19 = multiBackgroundInitializerResultsFuture18.isDone();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executorService12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture15);
        org.junit.Assert.assertNull(executorService16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }
}
