import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService2);
        boolean boolean4 = multiBackgroundInitializer1.start();
        java.util.concurrent.ExecutorService executorService5 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService6 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService7 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService8 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture9 = multiBackgroundInitializer1.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults10 = multiBackgroundInitializer1.get();
        java.util.concurrent.ExecutorService executorService12 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer13 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService12);
        java.util.concurrent.ExecutorService executorService15 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer16 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService15);
        java.util.concurrent.ExecutorService executorService17 = null;
        multiBackgroundInitializer16.setExternalExecutor(executorService17);
        java.util.concurrent.ExecutorService executorService19 = multiBackgroundInitializer16.getExternalExecutor();
        boolean boolean20 = multiBackgroundInitializer16.isStarted();
        multiBackgroundInitializer13.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer16);
        boolean boolean22 = multiBackgroundInitializer16.isStarted();
        java.util.concurrent.ExecutorService executorService24 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer25 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService24);
        multiBackgroundInitializer16.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer25);
        boolean boolean27 = multiBackgroundInitializer25.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture28 = multiBackgroundInitializer25.getFuture();
        // The following exception was thrown during execution in test generation
        try {
            multiBackgroundInitializer1.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: addInitializer() must not be called after start()!");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(executorService5);
        org.junit.Assert.assertNull(executorService6);
        org.junit.Assert.assertNull(executorService7);
        org.junit.Assert.assertNull(executorService8);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture9);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults10);
        org.junit.Assert.assertNull(executorService19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture28);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer1.getExternalExecutor();
        boolean boolean3 = multiBackgroundInitializer1.start();
        java.util.concurrent.ExecutorService executorService4 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService5 = multiBackgroundInitializer1.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults6 = multiBackgroundInitializer1.get();
        org.junit.Assert.assertNull(executorService2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(executorService4);
        org.junit.Assert.assertNull(executorService5);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults6);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer1.getExternalExecutor();
        boolean boolean3 = multiBackgroundInitializer1.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults4 = multiBackgroundInitializer1.get();
        boolean boolean5 = multiBackgroundInitializerResults4.isSuccessful();
        boolean boolean6 = multiBackgroundInitializerResults4.isSuccessful();
        java.util.Set<java.lang.String> strSet7 = multiBackgroundInitializerResults4.initializerNames();
        java.lang.Class<?> wildcardClass8 = multiBackgroundInitializerResults4.getClass();
        org.junit.Assert.assertNull(executorService2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        boolean boolean2 = multiBackgroundInitializer1.isStarted();
        boolean boolean3 = multiBackgroundInitializer1.start();
        boolean boolean4 = multiBackgroundInitializer1.isStarted();
        boolean boolean5 = multiBackgroundInitializer1.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture6 = multiBackgroundInitializer1.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults7 = multiBackgroundInitializer1.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults8 = multiBackgroundInitializer1.get();
        boolean boolean9 = multiBackgroundInitializer1.isStarted();
        java.lang.Class<?> wildcardClass10 = multiBackgroundInitializer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture6);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults7);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService2);
        java.util.concurrent.ExecutorService executorService4 = multiBackgroundInitializer1.getExternalExecutor();
        boolean boolean5 = multiBackgroundInitializer1.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults6 = multiBackgroundInitializer1.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture7 = multiBackgroundInitializer1.getFuture();
        boolean boolean8 = multiBackgroundInitializer1.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults9 = multiBackgroundInitializer1.get();
        org.junit.Assert.assertNull(executorService4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults6);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults9);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService2);
        java.util.concurrent.ExecutorService executorService5 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer6 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService5);
        boolean boolean7 = multiBackgroundInitializer6.isStarted();
        java.util.concurrent.ExecutorService executorService8 = null;
        multiBackgroundInitializer6.setExternalExecutor(executorService8);
        java.util.concurrent.ExecutorService executorService10 = multiBackgroundInitializer6.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService12 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer13 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService12);
        boolean boolean14 = multiBackgroundInitializer13.isStarted();
        boolean boolean15 = multiBackgroundInitializer13.start();
        boolean boolean16 = multiBackgroundInitializer13.isStarted();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture17 = multiBackgroundInitializer13.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults18 = multiBackgroundInitializer13.get();
        multiBackgroundInitializer6.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer13);
        boolean boolean20 = multiBackgroundInitializer13.isStarted();
        multiBackgroundInitializer1.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer13);
        java.util.concurrent.ExecutorService executorService23 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer24 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService23);
        java.util.concurrent.ExecutorService executorService25 = null;
        multiBackgroundInitializer24.setExternalExecutor(executorService25);
        boolean boolean27 = multiBackgroundInitializer24.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture28 = multiBackgroundInitializer24.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture29 = multiBackgroundInitializer24.getFuture();
        multiBackgroundInitializer1.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer24);
        java.util.concurrent.ExecutorService executorService31 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiBackgroundInitializer24.setExternalExecutor(executorService31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot set ExecutorService after start()!");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(executorService10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture17);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture28);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture29);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService2);
        boolean boolean4 = multiBackgroundInitializer1.start();
        java.util.concurrent.ExecutorService executorService5 = multiBackgroundInitializer1.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults6 = multiBackgroundInitializer1.get();
        java.util.Set<java.lang.String> strSet7 = multiBackgroundInitializerResults6.initializerNames();
        boolean boolean8 = multiBackgroundInitializerResults6.isSuccessful();
        java.util.Set<java.lang.String> strSet9 = multiBackgroundInitializerResults6.initializerNames();
        java.util.Set<java.lang.String> strSet10 = multiBackgroundInitializerResults6.initializerNames();
        java.util.Set<java.lang.String> strSet11 = multiBackgroundInitializerResults6.initializerNames();
        boolean boolean12 = multiBackgroundInitializerResults6.isSuccessful();
        boolean boolean13 = multiBackgroundInitializerResults6.isSuccessful();
        java.lang.Class<?> wildcardClass14 = multiBackgroundInitializerResults6.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(executorService5);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        boolean boolean2 = multiBackgroundInitializer1.isStarted();
        java.util.concurrent.ExecutorService executorService3 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService3);
        java.util.concurrent.ExecutorService executorService5 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService7 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer8 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService7);
        boolean boolean9 = multiBackgroundInitializer8.isStarted();
        boolean boolean10 = multiBackgroundInitializer8.start();
        boolean boolean11 = multiBackgroundInitializer8.isStarted();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture12 = multiBackgroundInitializer8.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults13 = multiBackgroundInitializer8.get();
        multiBackgroundInitializer1.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer8);
        boolean boolean15 = multiBackgroundInitializer8.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults16 = multiBackgroundInitializer8.get();
        java.util.concurrent.ExecutorService executorService17 = multiBackgroundInitializer8.getExternalExecutor();
        boolean boolean18 = multiBackgroundInitializer8.isStarted();
        java.util.concurrent.ExecutorService executorService19 = multiBackgroundInitializer8.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService20 = multiBackgroundInitializer8.getExternalExecutor();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture21 = multiBackgroundInitializer8.getFuture();
        java.util.concurrent.ExecutorService executorService22 = multiBackgroundInitializer8.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults23 = multiBackgroundInitializer8.get();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(executorService5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture12);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults16);
        org.junit.Assert.assertNull(executorService17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(executorService19);
        org.junit.Assert.assertNull(executorService20);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture21);
        org.junit.Assert.assertNull(executorService22);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults23);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService2);
        boolean boolean4 = multiBackgroundInitializer1.start();
        java.util.concurrent.ExecutorService executorService5 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService6 = multiBackgroundInitializer1.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults7 = multiBackgroundInitializer1.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults8 = multiBackgroundInitializer1.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults9 = multiBackgroundInitializer1.get();
        boolean boolean10 = multiBackgroundInitializer1.isStarted();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture11 = multiBackgroundInitializer1.getFuture();
        boolean boolean12 = multiBackgroundInitializer1.isStarted();
        java.util.concurrent.ExecutorService executorService14 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer15 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService14);
        boolean boolean16 = multiBackgroundInitializer15.isStarted();
        boolean boolean17 = multiBackgroundInitializer15.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture18 = multiBackgroundInitializer15.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture19 = multiBackgroundInitializer15.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults20 = multiBackgroundInitializer15.get();
        // The following exception was thrown during execution in test generation
        try {
            multiBackgroundInitializer1.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: addInitializer() must not be called after start()!");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(executorService5);
        org.junit.Assert.assertNull(executorService6);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults7);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults8);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture18);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture19);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults20);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService2);
        java.util.concurrent.ExecutorService executorService4 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService6 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService6);
        multiBackgroundInitializer1.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        java.util.concurrent.ExecutorService executorService10 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer11 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService10);
        boolean boolean12 = multiBackgroundInitializer11.isStarted();
        boolean boolean13 = multiBackgroundInitializer11.start();
        boolean boolean14 = multiBackgroundInitializer11.isStarted();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture15 = multiBackgroundInitializer11.getFuture();
        multiBackgroundInitializer7.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer11);
        boolean boolean17 = multiBackgroundInitializer7.start();
        java.util.concurrent.ExecutorService executorService18 = multiBackgroundInitializer7.getExternalExecutor();
        boolean boolean19 = multiBackgroundInitializer7.isStarted();
        java.util.concurrent.ExecutorService executorService20 = multiBackgroundInitializer7.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService21 = multiBackgroundInitializer7.getExternalExecutor();
        boolean boolean22 = multiBackgroundInitializer7.start();
        org.junit.Assert.assertNull(executorService4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(executorService18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(executorService20);
        org.junit.Assert.assertNull(executorService21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService2);
        java.util.concurrent.ExecutorService executorService4 = multiBackgroundInitializer1.getExternalExecutor();
        boolean boolean5 = multiBackgroundInitializer1.isStarted();
        boolean boolean6 = multiBackgroundInitializer1.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture7 = multiBackgroundInitializer1.getFuture();
        boolean boolean8 = multiBackgroundInitializer1.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults9 = multiBackgroundInitializer1.get();
        boolean boolean10 = multiBackgroundInitializer1.isStarted();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture11 = multiBackgroundInitializer1.getFuture();
        boolean boolean12 = multiBackgroundInitializer1.isStarted();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture13 = multiBackgroundInitializer1.getFuture();
        org.junit.Assert.assertNull(executorService4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture13);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        java.util.concurrent.ExecutorService executorService1 = multiBackgroundInitializer0.getExternalExecutor();
        boolean boolean2 = multiBackgroundInitializer0.start();
        java.util.concurrent.ExecutorService executorService4 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer5 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService4);
        boolean boolean6 = multiBackgroundInitializer5.isStarted();
        java.util.concurrent.ExecutorService executorService7 = multiBackgroundInitializer5.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService8 = null;
        multiBackgroundInitializer5.setExternalExecutor(executorService8);
        java.util.concurrent.ExecutorService executorService11 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer12 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService11);
        java.util.concurrent.ExecutorService executorService13 = null;
        multiBackgroundInitializer12.setExternalExecutor(executorService13);
        java.util.concurrent.ExecutorService executorService15 = multiBackgroundInitializer12.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService17 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer18 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService17);
        multiBackgroundInitializer12.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer18);
        multiBackgroundInitializer5.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer18);
        java.util.concurrent.ExecutorService executorService21 = multiBackgroundInitializer18.getExternalExecutor();
        // The following exception was thrown during execution in test generation
        try {
            multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: addInitializer() must not be called after start()!");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executorService1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(executorService7);
        org.junit.Assert.assertNull(executorService15);
        org.junit.Assert.assertNull(executorService21);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        boolean boolean2 = multiBackgroundInitializer1.isStarted();
        boolean boolean3 = multiBackgroundInitializer1.start();
        boolean boolean4 = multiBackgroundInitializer1.isStarted();
        boolean boolean5 = multiBackgroundInitializer1.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture6 = multiBackgroundInitializer1.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults7 = multiBackgroundInitializer1.get();
        boolean boolean8 = multiBackgroundInitializerResults7.isSuccessful();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = multiBackgroundInitializerResults7.isException("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child initializer with name ");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture6);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        boolean boolean2 = multiBackgroundInitializer1.isStarted();
        java.util.concurrent.ExecutorService executorService3 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService3);
        java.util.concurrent.ExecutorService executorService6 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService6);
        java.util.concurrent.ExecutorService executorService8 = null;
        multiBackgroundInitializer7.setExternalExecutor(executorService8);
        java.util.concurrent.ExecutorService executorService10 = multiBackgroundInitializer7.getExternalExecutor();
        boolean boolean11 = multiBackgroundInitializer7.isStarted();
        boolean boolean12 = multiBackgroundInitializer7.start();
        multiBackgroundInitializer1.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        java.util.concurrent.ExecutorService executorService15 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer16 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService15);
        java.util.concurrent.ExecutorService executorService17 = multiBackgroundInitializer16.getExternalExecutor();
        boolean boolean18 = multiBackgroundInitializer16.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults19 = multiBackgroundInitializer16.get();
        multiBackgroundInitializer1.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer16);
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture21 = multiBackgroundInitializer16.getFuture();
        boolean boolean22 = multiBackgroundInitializer16.isStarted();
        java.util.concurrent.ExecutorService executorService23 = multiBackgroundInitializer16.getExternalExecutor();
        boolean boolean24 = multiBackgroundInitializer16.start();
        boolean boolean25 = multiBackgroundInitializer16.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(executorService10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(executorService17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults19);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(executorService23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService2);
        boolean boolean4 = multiBackgroundInitializer1.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture5 = multiBackgroundInitializer1.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture6 = multiBackgroundInitializer1.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults7 = multiBackgroundInitializer1.get();
        java.util.concurrent.ExecutorService executorService8 = multiBackgroundInitializer1.getExternalExecutor();
        boolean boolean9 = multiBackgroundInitializer1.start();
        boolean boolean10 = multiBackgroundInitializer1.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture11 = multiBackgroundInitializer1.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults12 = multiBackgroundInitializer1.get();
        java.util.concurrent.ExecutorService executorService13 = multiBackgroundInitializer1.getExternalExecutor();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture5);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture6);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults7);
        org.junit.Assert.assertNull(executorService8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture11);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults12);
        org.junit.Assert.assertNull(executorService13);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer1.getExternalExecutor();
        boolean boolean3 = multiBackgroundInitializer1.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults4 = multiBackgroundInitializer1.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults5 = multiBackgroundInitializer1.get();
        boolean boolean6 = multiBackgroundInitializer1.isStarted();
        java.util.concurrent.ExecutorService executorService7 = multiBackgroundInitializer1.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults8 = multiBackgroundInitializer1.get();
        boolean boolean9 = multiBackgroundInitializer1.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults10 = multiBackgroundInitializer1.get();
        java.util.concurrent.ExecutorService executorService11 = multiBackgroundInitializer1.getExternalExecutor();
        boolean boolean12 = multiBackgroundInitializer1.isStarted();
        java.util.concurrent.ExecutorService executorService13 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService15 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer16 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService15);
        java.util.concurrent.ExecutorService executorService17 = null;
        multiBackgroundInitializer16.setExternalExecutor(executorService17);
        boolean boolean19 = multiBackgroundInitializer16.start();
        java.util.concurrent.ExecutorService executorService20 = multiBackgroundInitializer16.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults21 = multiBackgroundInitializer16.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults22 = multiBackgroundInitializer16.get();
        java.util.concurrent.ExecutorService executorService23 = multiBackgroundInitializer16.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService24 = multiBackgroundInitializer16.getExternalExecutor();
        // The following exception was thrown during execution in test generation
        try {
            multiBackgroundInitializer1.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: addInitializer() must not be called after start()!");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executorService2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults4);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(executorService7);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults10);
        org.junit.Assert.assertNull(executorService11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(executorService13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(executorService20);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults21);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults22);
        org.junit.Assert.assertNull(executorService23);
        org.junit.Assert.assertNull(executorService24);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService2);
        java.util.concurrent.ExecutorService executorService4 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService5 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService7 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer8 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService7);
        boolean boolean9 = multiBackgroundInitializer8.isStarted();
        boolean boolean10 = multiBackgroundInitializer8.start();
        boolean boolean11 = multiBackgroundInitializer8.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults12 = multiBackgroundInitializer8.get();
        boolean boolean13 = multiBackgroundInitializer8.isStarted();
        multiBackgroundInitializer1.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer8);
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture15 = multiBackgroundInitializer8.getFuture();
        boolean boolean16 = multiBackgroundInitializer8.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture17 = multiBackgroundInitializer8.getFuture();
        org.junit.Assert.assertNull(executorService4);
        org.junit.Assert.assertNull(executorService5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture17);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        boolean boolean2 = multiBackgroundInitializer1.isStarted();
        boolean boolean3 = multiBackgroundInitializer1.start();
        boolean boolean4 = multiBackgroundInitializer1.isStarted();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture5 = multiBackgroundInitializer1.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults6 = multiBackgroundInitializer1.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture7 = multiBackgroundInitializer1.getFuture();
        java.util.concurrent.ExecutorService executorService8 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService9 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture10 = multiBackgroundInitializer1.getFuture();
        java.util.concurrent.ExecutorService executorService11 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService13 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer14 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService13);
        boolean boolean15 = multiBackgroundInitializer14.isStarted();
        java.util.concurrent.ExecutorService executorService16 = null;
        multiBackgroundInitializer14.setExternalExecutor(executorService16);
        boolean boolean18 = multiBackgroundInitializer14.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture19 = multiBackgroundInitializer14.getFuture();
        boolean boolean20 = multiBackgroundInitializer14.isStarted();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture21 = multiBackgroundInitializer14.getFuture();
        boolean boolean22 = multiBackgroundInitializer14.isStarted();
        boolean boolean23 = multiBackgroundInitializer14.start();
        // The following exception was thrown during execution in test generation
        try {
            multiBackgroundInitializer1.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: addInitializer() must not be called after start()!");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture5);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults6);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture7);
        org.junit.Assert.assertNull(executorService8);
        org.junit.Assert.assertNull(executorService9);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture10);
        org.junit.Assert.assertNull(executorService11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService2);
        boolean boolean4 = multiBackgroundInitializer1.start();
        java.util.concurrent.ExecutorService executorService5 = multiBackgroundInitializer1.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults6 = multiBackgroundInitializer1.get();
        boolean boolean7 = multiBackgroundInitializer1.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture8 = multiBackgroundInitializer1.getFuture();
        boolean boolean9 = multiBackgroundInitializer1.isStarted();
        org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsBackgroundInitializer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiBackgroundInitializer1.addInitializer("", multiBackgroundInitializerResultsBackgroundInitializer11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Child initializer must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(executorService5);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        boolean boolean2 = multiBackgroundInitializer1.isStarted();
        boolean boolean3 = multiBackgroundInitializer1.start();
        boolean boolean4 = multiBackgroundInitializer1.isStarted();
        boolean boolean5 = multiBackgroundInitializer1.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture6 = multiBackgroundInitializer1.getFuture();
        boolean boolean7 = multiBackgroundInitializer1.start();
        boolean boolean8 = multiBackgroundInitializer1.isStarted();
        boolean boolean9 = multiBackgroundInitializer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService3 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService3);
        java.util.concurrent.ExecutorService executorService5 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService6 = multiBackgroundInitializer1.getExternalExecutor();
        boolean boolean7 = multiBackgroundInitializer1.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer9 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        java.util.concurrent.ExecutorService executorService10 = null;
        multiBackgroundInitializer9.setExternalExecutor(executorService10);
        boolean boolean12 = multiBackgroundInitializer9.isStarted();
        java.util.concurrent.ExecutorService executorService13 = multiBackgroundInitializer9.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService14 = multiBackgroundInitializer9.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService16 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer17 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService16);
        java.util.concurrent.ExecutorService executorService18 = multiBackgroundInitializer17.getExternalExecutor();
        boolean boolean19 = multiBackgroundInitializer17.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults20 = multiBackgroundInitializer17.get();
        multiBackgroundInitializer9.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer17);
        boolean boolean22 = multiBackgroundInitializer17.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults23 = multiBackgroundInitializer17.get();
        multiBackgroundInitializer1.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer17);
        java.util.concurrent.ExecutorService executorService26 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer27 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService26);
        boolean boolean28 = multiBackgroundInitializer27.isStarted();
        boolean boolean29 = multiBackgroundInitializer27.start();
        boolean boolean30 = multiBackgroundInitializer27.isStarted();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture31 = multiBackgroundInitializer27.getFuture();
        boolean boolean32 = multiBackgroundInitializer27.isStarted();
        boolean boolean33 = multiBackgroundInitializer27.isStarted();
        boolean boolean34 = multiBackgroundInitializer27.start();
        boolean boolean35 = multiBackgroundInitializer27.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture36 = multiBackgroundInitializer27.getFuture();
        // The following exception was thrown during execution in test generation
        try {
            multiBackgroundInitializer17.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: addInitializer() must not be called after start()!");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executorService2);
        org.junit.Assert.assertNull(executorService5);
        org.junit.Assert.assertNull(executorService6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(executorService13);
        org.junit.Assert.assertNull(executorService14);
        org.junit.Assert.assertNull(executorService18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture36);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer1.getExternalExecutor();
        boolean boolean3 = multiBackgroundInitializer1.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults4 = multiBackgroundInitializer1.get();
        java.util.Set<java.lang.String> strSet5 = multiBackgroundInitializerResults4.initializerNames();
        boolean boolean6 = multiBackgroundInitializerResults4.isSuccessful();
        java.util.Set<java.lang.String> strSet7 = multiBackgroundInitializerResults4.initializerNames();
        boolean boolean8 = multiBackgroundInitializerResults4.isSuccessful();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = multiBackgroundInitializerResults4.getResultObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child initializer with name hi!");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executorService2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService2);
        boolean boolean4 = multiBackgroundInitializer1.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture5 = multiBackgroundInitializer1.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture6 = multiBackgroundInitializer1.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults7 = multiBackgroundInitializer1.get();
        java.util.concurrent.ExecutorService executorService8 = multiBackgroundInitializer1.getExternalExecutor();
        boolean boolean9 = multiBackgroundInitializer1.start();
        boolean boolean10 = multiBackgroundInitializer1.start();
        boolean boolean11 = multiBackgroundInitializer1.start();
        java.util.concurrent.ExecutorService executorService12 = multiBackgroundInitializer1.getExternalExecutor();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture5);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture6);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults7);
        org.junit.Assert.assertNull(executorService8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(executorService12);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService2);
        java.util.concurrent.ExecutorService executorService4 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService5 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService6 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService6);
        boolean boolean8 = multiBackgroundInitializer1.isStarted();
        java.util.concurrent.ExecutorService executorService10 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer11 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService10);
        java.util.concurrent.ExecutorService executorService12 = null;
        multiBackgroundInitializer11.setExternalExecutor(executorService12);
        boolean boolean14 = multiBackgroundInitializer11.start();
        java.util.concurrent.ExecutorService executorService15 = multiBackgroundInitializer11.getExternalExecutor();
        multiBackgroundInitializer1.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer11);
        boolean boolean17 = multiBackgroundInitializer11.start();
        java.util.concurrent.ExecutorService executorService18 = multiBackgroundInitializer11.getExternalExecutor();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture19 = multiBackgroundInitializer11.getFuture();
        java.lang.Class<?> wildcardClass20 = multiBackgroundInitializer11.getClass();
        org.junit.Assert.assertNull(executorService4);
        org.junit.Assert.assertNull(executorService5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(executorService15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(executorService18);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService2);
        boolean boolean4 = multiBackgroundInitializer1.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture5 = multiBackgroundInitializer1.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture6 = multiBackgroundInitializer1.getFuture();
        boolean boolean7 = multiBackgroundInitializer1.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults8 = multiBackgroundInitializer1.get();
        java.util.Set<java.lang.String> strSet9 = multiBackgroundInitializerResults8.initializerNames();
        java.util.Set<java.lang.String> strSet10 = multiBackgroundInitializerResults8.initializerNames();
        boolean boolean11 = multiBackgroundInitializerResults8.isSuccessful();
        boolean boolean12 = multiBackgroundInitializerResults8.isSuccessful();
        boolean boolean13 = multiBackgroundInitializerResults8.isSuccessful();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture5);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        boolean boolean2 = multiBackgroundInitializer1.isStarted();
        java.util.concurrent.ExecutorService executorService3 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService3);
        java.util.concurrent.ExecutorService executorService5 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService7 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer8 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService7);
        boolean boolean9 = multiBackgroundInitializer8.isStarted();
        boolean boolean10 = multiBackgroundInitializer8.start();
        boolean boolean11 = multiBackgroundInitializer8.isStarted();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture12 = multiBackgroundInitializer8.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults13 = multiBackgroundInitializer8.get();
        multiBackgroundInitializer1.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer8);
        boolean boolean15 = multiBackgroundInitializer8.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults16 = multiBackgroundInitializer8.get();
        java.util.concurrent.ExecutorService executorService17 = multiBackgroundInitializer8.getExternalExecutor();
        boolean boolean18 = multiBackgroundInitializer8.isStarted();
        java.util.concurrent.ExecutorService executorService19 = multiBackgroundInitializer8.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService20 = multiBackgroundInitializer8.getExternalExecutor();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture21 = multiBackgroundInitializer8.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture22 = multiBackgroundInitializer8.getFuture();
        java.util.concurrent.ExecutorService executorService24 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer25 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService24);
        boolean boolean26 = multiBackgroundInitializer25.isStarted();
        boolean boolean27 = multiBackgroundInitializer25.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture28 = multiBackgroundInitializer25.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture29 = multiBackgroundInitializer25.getFuture();
        boolean boolean30 = multiBackgroundInitializer25.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults31 = multiBackgroundInitializer25.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults32 = multiBackgroundInitializer25.get();
        java.util.concurrent.ExecutorService executorService33 = multiBackgroundInitializer25.getExternalExecutor();
        boolean boolean34 = multiBackgroundInitializer25.isStarted();
        boolean boolean35 = multiBackgroundInitializer25.start();
        // The following exception was thrown during execution in test generation
        try {
            multiBackgroundInitializer8.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: addInitializer() must not be called after start()!");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(executorService5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture12);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults16);
        org.junit.Assert.assertNull(executorService17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(executorService19);
        org.junit.Assert.assertNull(executorService20);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture21);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture28);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults31);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults32);
        org.junit.Assert.assertNull(executorService33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer1.getExternalExecutor();
        boolean boolean3 = multiBackgroundInitializer1.start();
        java.util.concurrent.ExecutorService executorService4 = multiBackgroundInitializer1.getExternalExecutor();
        boolean boolean5 = multiBackgroundInitializer1.isStarted();
        java.util.concurrent.ExecutorService executorService6 = multiBackgroundInitializer1.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults7 = multiBackgroundInitializer1.get();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.ConcurrentException concurrentException9 = multiBackgroundInitializerResults7.getException("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child initializer with name hi!");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executorService2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(executorService4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(executorService6);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults7);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService2);
        java.util.concurrent.ExecutorService executorService4 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService6 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService6);
        multiBackgroundInitializer1.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        java.util.concurrent.ExecutorService executorService9 = multiBackgroundInitializer1.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer11 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        java.util.concurrent.ExecutorService executorService12 = null;
        multiBackgroundInitializer11.setExternalExecutor(executorService12);
        java.util.concurrent.ExecutorService executorService14 = multiBackgroundInitializer11.getExternalExecutor();
        boolean boolean15 = multiBackgroundInitializer11.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture16 = multiBackgroundInitializer11.getFuture();
        boolean boolean17 = multiBackgroundInitializer11.isStarted();
        multiBackgroundInitializer1.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer11);
        java.util.concurrent.ExecutorService executorService19 = multiBackgroundInitializer11.getExternalExecutor();
        boolean boolean20 = multiBackgroundInitializer11.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture21 = multiBackgroundInitializer11.getFuture();
        org.junit.Assert.assertNull(executorService4);
        org.junit.Assert.assertNull(executorService9);
        org.junit.Assert.assertNull(executorService14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(executorService19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture21);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService2);
        java.util.concurrent.ExecutorService executorService4 = multiBackgroundInitializer1.getExternalExecutor();
        boolean boolean5 = multiBackgroundInitializer1.isStarted();
        boolean boolean6 = multiBackgroundInitializer1.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture7 = multiBackgroundInitializer1.getFuture();
        boolean boolean8 = multiBackgroundInitializer1.isStarted();
        boolean boolean9 = multiBackgroundInitializer1.isStarted();
        boolean boolean10 = multiBackgroundInitializer1.start();
        org.junit.Assert.assertNull(executorService4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService3 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService3);
        java.util.concurrent.ExecutorService executorService5 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService6 = multiBackgroundInitializer1.getExternalExecutor();
        boolean boolean7 = multiBackgroundInitializer1.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer9 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        java.util.concurrent.ExecutorService executorService10 = null;
        multiBackgroundInitializer9.setExternalExecutor(executorService10);
        boolean boolean12 = multiBackgroundInitializer9.isStarted();
        java.util.concurrent.ExecutorService executorService13 = multiBackgroundInitializer9.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService14 = multiBackgroundInitializer9.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService16 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer17 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService16);
        java.util.concurrent.ExecutorService executorService18 = multiBackgroundInitializer17.getExternalExecutor();
        boolean boolean19 = multiBackgroundInitializer17.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults20 = multiBackgroundInitializer17.get();
        multiBackgroundInitializer9.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer17);
        boolean boolean22 = multiBackgroundInitializer17.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults23 = multiBackgroundInitializer17.get();
        multiBackgroundInitializer1.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer17);
        java.util.concurrent.ExecutorService executorService25 = multiBackgroundInitializer1.getExternalExecutor();
        java.lang.Class<?> wildcardClass26 = multiBackgroundInitializer1.getClass();
        org.junit.Assert.assertNull(executorService2);
        org.junit.Assert.assertNull(executorService5);
        org.junit.Assert.assertNull(executorService6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(executorService13);
        org.junit.Assert.assertNull(executorService14);
        org.junit.Assert.assertNull(executorService18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults23);
        org.junit.Assert.assertNull(executorService25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService2);
        java.util.concurrent.ExecutorService executorService4 = multiBackgroundInitializer1.getExternalExecutor();
        boolean boolean5 = multiBackgroundInitializer1.isStarted();
        boolean boolean6 = multiBackgroundInitializer1.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture7 = multiBackgroundInitializer1.getFuture();
        boolean boolean8 = multiBackgroundInitializer1.start();
        boolean boolean9 = multiBackgroundInitializer1.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults10 = multiBackgroundInitializer1.get();
        java.util.Set<java.lang.String> strSet11 = multiBackgroundInitializerResults10.initializerNames();
        boolean boolean12 = multiBackgroundInitializerResults10.isSuccessful();
        org.junit.Assert.assertNull(executorService4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        boolean boolean2 = multiBackgroundInitializer1.isStarted();
        java.util.concurrent.ExecutorService executorService3 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService3);
        java.util.concurrent.ExecutorService executorService5 = multiBackgroundInitializer1.getExternalExecutor();
        boolean boolean6 = multiBackgroundInitializer1.isStarted();
        java.util.concurrent.ExecutorService executorService8 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer9 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService8);
        boolean boolean10 = multiBackgroundInitializer9.isStarted();
        java.util.concurrent.ExecutorService executorService11 = null;
        multiBackgroundInitializer9.setExternalExecutor(executorService11);
        java.util.concurrent.ExecutorService executorService14 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer15 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService14);
        java.util.concurrent.ExecutorService executorService16 = null;
        multiBackgroundInitializer15.setExternalExecutor(executorService16);
        java.util.concurrent.ExecutorService executorService18 = multiBackgroundInitializer15.getExternalExecutor();
        boolean boolean19 = multiBackgroundInitializer15.isStarted();
        boolean boolean20 = multiBackgroundInitializer15.start();
        multiBackgroundInitializer9.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer15);
        multiBackgroundInitializer1.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer15);
        java.util.concurrent.ExecutorService executorService23 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService24 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService25 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService25);
        java.util.concurrent.ExecutorService executorService28 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer29 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService28);
        java.util.concurrent.ExecutorService executorService30 = null;
        multiBackgroundInitializer29.setExternalExecutor(executorService30);
        java.util.concurrent.ExecutorService executorService32 = multiBackgroundInitializer29.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService34 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer35 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService34);
        multiBackgroundInitializer29.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer35);
        boolean boolean37 = multiBackgroundInitializer35.isStarted();
        java.util.concurrent.ExecutorService executorService39 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer40 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService39);
        java.util.concurrent.ExecutorService executorService41 = null;
        multiBackgroundInitializer40.setExternalExecutor(executorService41);
        boolean boolean43 = multiBackgroundInitializer40.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture44 = multiBackgroundInitializer40.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture45 = multiBackgroundInitializer40.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults46 = multiBackgroundInitializer40.get();
        java.util.concurrent.ExecutorService executorService47 = multiBackgroundInitializer40.getExternalExecutor();
        boolean boolean48 = multiBackgroundInitializer40.start();
        boolean boolean49 = multiBackgroundInitializer40.start();
        boolean boolean50 = multiBackgroundInitializer40.isStarted();
        multiBackgroundInitializer35.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer40);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults52 = multiBackgroundInitializer40.get();
        multiBackgroundInitializer1.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer40);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(executorService5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(executorService18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(executorService23);
        org.junit.Assert.assertNull(executorService24);
        org.junit.Assert.assertNull(executorService32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture44);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture45);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults46);
        org.junit.Assert.assertNull(executorService47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults52);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService3 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService3);
        java.util.concurrent.ExecutorService executorService6 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService6);
        java.util.concurrent.ExecutorService executorService8 = null;
        multiBackgroundInitializer7.setExternalExecutor(executorService8);
        boolean boolean10 = multiBackgroundInitializer7.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture11 = multiBackgroundInitializer7.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture12 = multiBackgroundInitializer7.getFuture();
        boolean boolean13 = multiBackgroundInitializer7.start();
        multiBackgroundInitializer1.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        java.util.concurrent.ExecutorService executorService16 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer17 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService16);
        java.util.concurrent.ExecutorService executorService18 = null;
        multiBackgroundInitializer17.setExternalExecutor(executorService18);
        java.util.concurrent.ExecutorService executorService20 = multiBackgroundInitializer17.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService22 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer23 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService22);
        multiBackgroundInitializer17.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer23);
        java.util.concurrent.ExecutorService executorService25 = multiBackgroundInitializer17.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer27 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        java.util.concurrent.ExecutorService executorService28 = null;
        multiBackgroundInitializer27.setExternalExecutor(executorService28);
        java.util.concurrent.ExecutorService executorService30 = multiBackgroundInitializer27.getExternalExecutor();
        boolean boolean31 = multiBackgroundInitializer27.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture32 = multiBackgroundInitializer27.getFuture();
        boolean boolean33 = multiBackgroundInitializer27.isStarted();
        multiBackgroundInitializer17.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer27);
        multiBackgroundInitializer1.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer27);
        java.util.concurrent.ExecutorService executorService37 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer38 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService37);
        java.util.concurrent.ExecutorService executorService39 = null;
        multiBackgroundInitializer38.setExternalExecutor(executorService39);
        boolean boolean41 = multiBackgroundInitializer38.start();
        java.util.concurrent.ExecutorService executorService42 = multiBackgroundInitializer38.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService43 = multiBackgroundInitializer38.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults44 = multiBackgroundInitializer38.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults45 = multiBackgroundInitializer38.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults46 = multiBackgroundInitializer38.get();
        boolean boolean47 = multiBackgroundInitializer38.isStarted();
        multiBackgroundInitializer1.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer38);
        java.util.concurrent.ExecutorService executorService49 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService49);
        boolean boolean51 = multiBackgroundInitializer1.start();
        java.util.concurrent.ExecutorService executorService52 = multiBackgroundInitializer1.getExternalExecutor();
        org.junit.Assert.assertNull(executorService2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture11);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(executorService20);
        org.junit.Assert.assertNull(executorService25);
        org.junit.Assert.assertNull(executorService30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(executorService42);
        org.junit.Assert.assertNull(executorService43);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults44);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults45);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNull(executorService52);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService3 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService3);
        java.util.concurrent.ExecutorService executorService6 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService6);
        java.util.concurrent.ExecutorService executorService8 = null;
        multiBackgroundInitializer7.setExternalExecutor(executorService8);
        boolean boolean10 = multiBackgroundInitializer7.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture11 = multiBackgroundInitializer7.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture12 = multiBackgroundInitializer7.getFuture();
        boolean boolean13 = multiBackgroundInitializer7.start();
        multiBackgroundInitializer1.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        java.util.concurrent.ExecutorService executorService16 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer17 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService16);
        java.util.concurrent.ExecutorService executorService18 = null;
        multiBackgroundInitializer17.setExternalExecutor(executorService18);
        java.util.concurrent.ExecutorService executorService20 = multiBackgroundInitializer17.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService22 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer23 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService22);
        multiBackgroundInitializer17.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer23);
        java.util.concurrent.ExecutorService executorService25 = multiBackgroundInitializer17.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer27 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        java.util.concurrent.ExecutorService executorService28 = null;
        multiBackgroundInitializer27.setExternalExecutor(executorService28);
        java.util.concurrent.ExecutorService executorService30 = multiBackgroundInitializer27.getExternalExecutor();
        boolean boolean31 = multiBackgroundInitializer27.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture32 = multiBackgroundInitializer27.getFuture();
        boolean boolean33 = multiBackgroundInitializer27.isStarted();
        multiBackgroundInitializer17.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer27);
        multiBackgroundInitializer1.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer27);
        java.util.concurrent.ExecutorService executorService37 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer38 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService37);
        java.util.concurrent.ExecutorService executorService39 = null;
        multiBackgroundInitializer38.setExternalExecutor(executorService39);
        boolean boolean41 = multiBackgroundInitializer38.start();
        java.util.concurrent.ExecutorService executorService42 = multiBackgroundInitializer38.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService43 = multiBackgroundInitializer38.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults44 = multiBackgroundInitializer38.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults45 = multiBackgroundInitializer38.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults46 = multiBackgroundInitializer38.get();
        boolean boolean47 = multiBackgroundInitializer38.isStarted();
        multiBackgroundInitializer1.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer38);
        java.util.concurrent.ExecutorService executorService50 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer51 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService50);
        boolean boolean52 = multiBackgroundInitializer51.isStarted();
        java.util.concurrent.ExecutorService executorService53 = multiBackgroundInitializer51.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService54 = null;
        multiBackgroundInitializer51.setExternalExecutor(executorService54);
        java.util.concurrent.ExecutorService executorService57 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer58 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService57);
        java.util.concurrent.ExecutorService executorService59 = null;
        multiBackgroundInitializer58.setExternalExecutor(executorService59);
        java.util.concurrent.ExecutorService executorService61 = multiBackgroundInitializer58.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService63 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer64 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService63);
        multiBackgroundInitializer58.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer64);
        multiBackgroundInitializer51.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer64);
        multiBackgroundInitializer1.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer64);
        java.util.concurrent.ExecutorService executorService68 = multiBackgroundInitializer64.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService69 = null;
        multiBackgroundInitializer64.setExternalExecutor(executorService69);
        org.junit.Assert.assertNull(executorService2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture11);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(executorService20);
        org.junit.Assert.assertNull(executorService25);
        org.junit.Assert.assertNull(executorService30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(executorService42);
        org.junit.Assert.assertNull(executorService43);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults44);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults45);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(executorService53);
        org.junit.Assert.assertNull(executorService61);
        org.junit.Assert.assertNull(executorService68);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService3 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService3);
        java.util.concurrent.ExecutorService executorService6 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService6);
        java.util.concurrent.ExecutorService executorService8 = null;
        multiBackgroundInitializer7.setExternalExecutor(executorService8);
        boolean boolean10 = multiBackgroundInitializer7.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture11 = multiBackgroundInitializer7.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture12 = multiBackgroundInitializer7.getFuture();
        boolean boolean13 = multiBackgroundInitializer7.start();
        multiBackgroundInitializer1.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        java.util.concurrent.ExecutorService executorService16 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer17 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService16);
        java.util.concurrent.ExecutorService executorService18 = null;
        multiBackgroundInitializer17.setExternalExecutor(executorService18);
        java.util.concurrent.ExecutorService executorService20 = multiBackgroundInitializer17.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService22 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer23 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService22);
        multiBackgroundInitializer17.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer23);
        java.util.concurrent.ExecutorService executorService25 = multiBackgroundInitializer17.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer27 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        java.util.concurrent.ExecutorService executorService28 = null;
        multiBackgroundInitializer27.setExternalExecutor(executorService28);
        java.util.concurrent.ExecutorService executorService30 = multiBackgroundInitializer27.getExternalExecutor();
        boolean boolean31 = multiBackgroundInitializer27.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture32 = multiBackgroundInitializer27.getFuture();
        boolean boolean33 = multiBackgroundInitializer27.isStarted();
        multiBackgroundInitializer17.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer27);
        multiBackgroundInitializer1.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer27);
        java.util.concurrent.ExecutorService executorService37 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer38 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService37);
        java.util.concurrent.ExecutorService executorService39 = multiBackgroundInitializer38.getExternalExecutor();
        boolean boolean40 = multiBackgroundInitializer38.start();
        java.util.concurrent.ExecutorService executorService41 = multiBackgroundInitializer38.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService42 = multiBackgroundInitializer38.getExternalExecutor();
        multiBackgroundInitializer1.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer38);
        java.util.concurrent.ExecutorService executorService45 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer46 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService45);
        java.util.concurrent.ExecutorService executorService48 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer49 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService48);
        java.util.concurrent.ExecutorService executorService50 = null;
        multiBackgroundInitializer49.setExternalExecutor(executorService50);
        java.util.concurrent.ExecutorService executorService52 = multiBackgroundInitializer49.getExternalExecutor();
        boolean boolean53 = multiBackgroundInitializer49.isStarted();
        multiBackgroundInitializer46.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer49);
        java.util.concurrent.ExecutorService executorService56 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer57 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService56);
        java.util.concurrent.ExecutorService executorService58 = null;
        multiBackgroundInitializer57.setExternalExecutor(executorService58);
        boolean boolean60 = multiBackgroundInitializer57.isStarted();
        java.util.concurrent.ExecutorService executorService61 = multiBackgroundInitializer57.getExternalExecutor();
        boolean boolean62 = multiBackgroundInitializer57.start();
        multiBackgroundInitializer49.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer57);
        multiBackgroundInitializer1.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer49);
        java.util.concurrent.ExecutorService executorService65 = multiBackgroundInitializer49.getExternalExecutor();
        boolean boolean66 = multiBackgroundInitializer49.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture67 = multiBackgroundInitializer49.getFuture();
        boolean boolean68 = multiBackgroundInitializer49.start();
        org.junit.Assert.assertNull(executorService2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture11);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(executorService20);
        org.junit.Assert.assertNull(executorService25);
        org.junit.Assert.assertNull(executorService30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(executorService39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(executorService41);
        org.junit.Assert.assertNull(executorService42);
        org.junit.Assert.assertNull(executorService52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(executorService61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNull(executorService65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer1.getExternalExecutor();
        boolean boolean3 = multiBackgroundInitializer1.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults4 = multiBackgroundInitializer1.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture5 = multiBackgroundInitializer1.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults6 = multiBackgroundInitializer1.get();
        java.util.concurrent.ExecutorService executorService7 = multiBackgroundInitializer1.getExternalExecutor();
        boolean boolean8 = multiBackgroundInitializer1.isStarted();
        org.junit.Assert.assertNull(executorService2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults4);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture5);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults6);
        org.junit.Assert.assertNull(executorService7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        boolean boolean2 = multiBackgroundInitializer1.isStarted();
        boolean boolean3 = multiBackgroundInitializer1.start();
        boolean boolean4 = multiBackgroundInitializer1.isStarted();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture5 = multiBackgroundInitializer1.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture6 = multiBackgroundInitializer1.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults7 = multiBackgroundInitializer1.get();
        java.util.Set<java.lang.String> strSet8 = multiBackgroundInitializerResults7.initializerNames();
        boolean boolean9 = multiBackgroundInitializerResults7.isSuccessful();
        boolean boolean10 = multiBackgroundInitializerResults7.isSuccessful();
        boolean boolean11 = multiBackgroundInitializerResults7.isSuccessful();
        boolean boolean12 = multiBackgroundInitializerResults7.isSuccessful();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture5);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture6);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer1.getExternalExecutor();
        boolean boolean3 = multiBackgroundInitializer1.start();
        boolean boolean4 = multiBackgroundInitializer1.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults5 = multiBackgroundInitializer1.get();
        boolean boolean6 = multiBackgroundInitializerResults5.isSuccessful();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.BackgroundInitializer<?> wildcardBackgroundInitializer8 = multiBackgroundInitializerResults5.getInitializer("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child initializer with name hi!");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executorService2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService2);
        java.util.concurrent.ExecutorService executorService4 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService6 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService6);
        multiBackgroundInitializer1.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        java.util.concurrent.ExecutorService executorService9 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService10 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService10);
        java.util.concurrent.ExecutorService executorService13 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer14 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService13);
        java.util.concurrent.ExecutorService executorService15 = null;
        multiBackgroundInitializer14.setExternalExecutor(executorService15);
        boolean boolean17 = multiBackgroundInitializer14.isStarted();
        java.util.concurrent.ExecutorService executorService18 = multiBackgroundInitializer14.getExternalExecutor();
        boolean boolean19 = multiBackgroundInitializer14.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults20 = multiBackgroundInitializer14.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture21 = multiBackgroundInitializer14.getFuture();
        multiBackgroundInitializer1.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer14);
        org.junit.Assert.assertNull(executorService4);
        org.junit.Assert.assertNull(executorService9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(executorService18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults20);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture21);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        boolean boolean2 = multiBackgroundInitializer1.isStarted();
        java.util.concurrent.ExecutorService executorService3 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService3);
        java.util.concurrent.ExecutorService executorService5 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService7 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer8 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService7);
        boolean boolean9 = multiBackgroundInitializer8.isStarted();
        boolean boolean10 = multiBackgroundInitializer8.start();
        boolean boolean11 = multiBackgroundInitializer8.isStarted();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture12 = multiBackgroundInitializer8.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults13 = multiBackgroundInitializer8.get();
        multiBackgroundInitializer1.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer8);
        boolean boolean15 = multiBackgroundInitializer8.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults16 = multiBackgroundInitializer8.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture17 = multiBackgroundInitializer8.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults18 = multiBackgroundInitializer8.get();
        java.util.concurrent.ExecutorService executorService20 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer21 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService20);
        java.util.concurrent.ExecutorService executorService22 = null;
        multiBackgroundInitializer21.setExternalExecutor(executorService22);
        java.util.concurrent.ExecutorService executorService24 = multiBackgroundInitializer21.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService26 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer27 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService26);
        multiBackgroundInitializer21.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer27);
        boolean boolean29 = multiBackgroundInitializer27.isStarted();
        boolean boolean30 = multiBackgroundInitializer27.start();
        // The following exception was thrown during execution in test generation
        try {
            multiBackgroundInitializer8.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: addInitializer() must not be called after start()!");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(executorService5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture12);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults16);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture17);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults18);
        org.junit.Assert.assertNull(executorService24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        boolean boolean2 = multiBackgroundInitializer1.isStarted();
        java.util.concurrent.ExecutorService executorService3 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService3);
        java.util.concurrent.ExecutorService executorService5 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService7 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer8 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService7);
        boolean boolean9 = multiBackgroundInitializer8.isStarted();
        boolean boolean10 = multiBackgroundInitializer8.start();
        boolean boolean11 = multiBackgroundInitializer8.isStarted();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture12 = multiBackgroundInitializer8.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults13 = multiBackgroundInitializer8.get();
        multiBackgroundInitializer1.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer8);
        boolean boolean15 = multiBackgroundInitializer8.isStarted();
        boolean boolean16 = multiBackgroundInitializer8.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture17 = multiBackgroundInitializer8.getFuture();
        java.util.concurrent.ExecutorService executorService18 = multiBackgroundInitializer8.getExternalExecutor();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture19 = multiBackgroundInitializer8.getFuture();
        boolean boolean20 = multiBackgroundInitializer8.isStarted();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(executorService5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture12);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture17);
        org.junit.Assert.assertNull(executorService18);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService2);
        boolean boolean4 = multiBackgroundInitializer1.isStarted();
        java.util.concurrent.ExecutorService executorService6 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService6);
        java.util.concurrent.ExecutorService executorService8 = multiBackgroundInitializer7.getExternalExecutor();
        boolean boolean9 = multiBackgroundInitializer7.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults10 = multiBackgroundInitializer7.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults11 = multiBackgroundInitializer7.get();
        boolean boolean12 = multiBackgroundInitializer7.isStarted();
        multiBackgroundInitializer1.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        boolean boolean14 = multiBackgroundInitializer1.start();
        boolean boolean15 = multiBackgroundInitializer1.isStarted();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(executorService8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults10);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService2);
        boolean boolean4 = multiBackgroundInitializer1.start();
        java.util.concurrent.ExecutorService executorService5 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService6 = multiBackgroundInitializer1.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults7 = multiBackgroundInitializer1.get();
        boolean boolean8 = multiBackgroundInitializer1.isStarted();
        boolean boolean9 = multiBackgroundInitializer1.isStarted();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(executorService5);
        org.junit.Assert.assertNull(executorService6);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService2);
        boolean boolean4 = multiBackgroundInitializer1.start();
        java.util.concurrent.ExecutorService executorService5 = multiBackgroundInitializer1.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults6 = multiBackgroundInitializer1.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults7 = multiBackgroundInitializer1.get();
        boolean boolean8 = multiBackgroundInitializerResults7.isSuccessful();
        java.util.Set<java.lang.String> strSet9 = multiBackgroundInitializerResults7.initializerNames();
        boolean boolean10 = multiBackgroundInitializerResults7.isSuccessful();
        boolean boolean11 = multiBackgroundInitializerResults7.isSuccessful();
        boolean boolean12 = multiBackgroundInitializerResults7.isSuccessful();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.ConcurrentException concurrentException14 = multiBackgroundInitializerResults7.getException("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child initializer with name hi!");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(executorService5);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults6);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService3 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService3);
        java.util.concurrent.ExecutorService executorService5 = multiBackgroundInitializer1.getExternalExecutor();
        boolean boolean6 = multiBackgroundInitializer1.isStarted();
        java.util.concurrent.ExecutorService executorService7 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService7);
        boolean boolean9 = multiBackgroundInitializer1.isStarted();
        boolean boolean10 = multiBackgroundInitializer1.isStarted();
        org.junit.Assert.assertNull(executorService2);
        org.junit.Assert.assertNull(executorService5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService3 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService3);
        boolean boolean5 = multiBackgroundInitializer1.isStarted();
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture6 = multiBackgroundInitializer1.getFuture();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: start() must be called first!");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executorService2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        boolean boolean2 = multiBackgroundInitializer1.isStarted();
        boolean boolean3 = multiBackgroundInitializer1.start();
        boolean boolean4 = multiBackgroundInitializer1.isStarted();
        boolean boolean5 = multiBackgroundInitializer1.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults6 = multiBackgroundInitializer1.get();
        java.lang.Class<?> wildcardClass7 = multiBackgroundInitializer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService2);
        java.util.concurrent.ExecutorService executorService4 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService5 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService7 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer8 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService7);
        boolean boolean9 = multiBackgroundInitializer8.isStarted();
        boolean boolean10 = multiBackgroundInitializer8.start();
        boolean boolean11 = multiBackgroundInitializer8.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults12 = multiBackgroundInitializer8.get();
        boolean boolean13 = multiBackgroundInitializer8.isStarted();
        multiBackgroundInitializer1.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer8);
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture15 = multiBackgroundInitializer8.getFuture();
        java.util.concurrent.ExecutorService executorService16 = multiBackgroundInitializer8.getExternalExecutor();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture17 = multiBackgroundInitializer8.getFuture();
        org.junit.Assert.assertNull(executorService4);
        org.junit.Assert.assertNull(executorService5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture15);
        org.junit.Assert.assertNull(executorService16);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture17);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        boolean boolean2 = multiBackgroundInitializer1.isStarted();
        java.util.concurrent.ExecutorService executorService3 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService3);
        java.util.concurrent.ExecutorService executorService5 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService7 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer8 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService7);
        boolean boolean9 = multiBackgroundInitializer8.isStarted();
        boolean boolean10 = multiBackgroundInitializer8.start();
        boolean boolean11 = multiBackgroundInitializer8.isStarted();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture12 = multiBackgroundInitializer8.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults13 = multiBackgroundInitializer8.get();
        multiBackgroundInitializer1.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer8);
        boolean boolean15 = multiBackgroundInitializer8.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults16 = multiBackgroundInitializer8.get();
        java.util.concurrent.ExecutorService executorService17 = multiBackgroundInitializer8.getExternalExecutor();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture18 = multiBackgroundInitializer8.getFuture();
        boolean boolean19 = multiBackgroundInitializer8.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture20 = multiBackgroundInitializer8.getFuture();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(executorService5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture12);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults16);
        org.junit.Assert.assertNull(executorService17);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture20);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService2);
        boolean boolean4 = multiBackgroundInitializer1.start();
        java.util.concurrent.ExecutorService executorService5 = multiBackgroundInitializer1.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults6 = multiBackgroundInitializer1.get();
        boolean boolean7 = multiBackgroundInitializer1.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture8 = multiBackgroundInitializer1.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults9 = multiBackgroundInitializer1.get();
        boolean boolean10 = multiBackgroundInitializer1.isStarted();
        boolean boolean11 = multiBackgroundInitializer1.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults12 = multiBackgroundInitializer1.get();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.ConcurrentException concurrentException14 = multiBackgroundInitializerResults12.getException("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child initializer with name ");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(executorService5);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture8);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults12);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        boolean boolean2 = multiBackgroundInitializer1.isStarted();
        java.util.concurrent.ExecutorService executorService3 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService3);
        java.util.concurrent.ExecutorService executorService6 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService6);
        java.util.concurrent.ExecutorService executorService8 = null;
        multiBackgroundInitializer7.setExternalExecutor(executorService8);
        java.util.concurrent.ExecutorService executorService10 = multiBackgroundInitializer7.getExternalExecutor();
        boolean boolean11 = multiBackgroundInitializer7.isStarted();
        boolean boolean12 = multiBackgroundInitializer7.start();
        multiBackgroundInitializer1.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        java.util.concurrent.ExecutorService executorService15 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer16 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService15);
        java.util.concurrent.ExecutorService executorService17 = multiBackgroundInitializer16.getExternalExecutor();
        boolean boolean18 = multiBackgroundInitializer16.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults19 = multiBackgroundInitializer16.get();
        multiBackgroundInitializer1.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer16);
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture21 = multiBackgroundInitializer16.getFuture();
        boolean boolean22 = multiBackgroundInitializer16.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults23 = multiBackgroundInitializer16.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults24 = multiBackgroundInitializer16.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults25 = multiBackgroundInitializer16.get();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(executorService10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(executorService17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults19);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults23);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults24);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults25);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService2);
        boolean boolean4 = multiBackgroundInitializer1.start();
        java.util.concurrent.ExecutorService executorService5 = multiBackgroundInitializer1.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults6 = multiBackgroundInitializer1.get();
        boolean boolean7 = multiBackgroundInitializer1.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture8 = multiBackgroundInitializer1.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture9 = multiBackgroundInitializer1.getFuture();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(executorService5);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture8);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture9);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        boolean boolean2 = multiBackgroundInitializer1.isStarted();
        boolean boolean3 = multiBackgroundInitializer1.start();
        boolean boolean4 = multiBackgroundInitializer1.isStarted();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture5 = multiBackgroundInitializer1.getFuture();
        boolean boolean6 = multiBackgroundInitializer1.isStarted();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture7 = multiBackgroundInitializer1.getFuture();
        java.util.concurrent.ExecutorService executorService8 = multiBackgroundInitializer1.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults9 = multiBackgroundInitializer1.get();
        boolean boolean10 = multiBackgroundInitializer1.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults11 = multiBackgroundInitializer1.get();
        java.util.concurrent.ExecutorService executorService13 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer14 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService13);
        java.util.concurrent.ExecutorService executorService15 = null;
        multiBackgroundInitializer14.setExternalExecutor(executorService15);
        boolean boolean17 = multiBackgroundInitializer14.isStarted();
        java.util.concurrent.ExecutorService executorService18 = multiBackgroundInitializer14.getExternalExecutor();
        boolean boolean19 = multiBackgroundInitializer14.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults20 = multiBackgroundInitializer14.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture21 = multiBackgroundInitializer14.getFuture();
        // The following exception was thrown during execution in test generation
        try {
            multiBackgroundInitializer1.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: addInitializer() must not be called after start()!");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture7);
        org.junit.Assert.assertNull(executorService8);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(executorService18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults20);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture21);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService2);
        java.util.concurrent.ExecutorService executorService4 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService6 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService6);
        multiBackgroundInitializer1.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        java.util.concurrent.ExecutorService executorService10 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer11 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService10);
        boolean boolean12 = multiBackgroundInitializer11.isStarted();
        boolean boolean13 = multiBackgroundInitializer11.start();
        boolean boolean14 = multiBackgroundInitializer11.isStarted();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture15 = multiBackgroundInitializer11.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture16 = multiBackgroundInitializer11.getFuture();
        multiBackgroundInitializer7.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer11);
        boolean boolean18 = multiBackgroundInitializer7.isStarted();
        java.util.concurrent.ExecutorService executorService19 = multiBackgroundInitializer7.getExternalExecutor();
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture20 = multiBackgroundInitializer7.getFuture();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: start() must be called first!");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executorService4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture15);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(executorService19);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService2);
        java.util.concurrent.ExecutorService executorService4 = multiBackgroundInitializer1.getExternalExecutor();
        boolean boolean5 = multiBackgroundInitializer1.isStarted();
        boolean boolean6 = multiBackgroundInitializer1.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture7 = multiBackgroundInitializer1.getFuture();
        boolean boolean8 = multiBackgroundInitializer1.isStarted();
        boolean boolean9 = multiBackgroundInitializer1.isStarted();
        boolean boolean10 = multiBackgroundInitializer1.isStarted();
        boolean boolean11 = multiBackgroundInitializer1.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults12 = multiBackgroundInitializer1.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture13 = multiBackgroundInitializer1.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults14 = multiBackgroundInitializer1.get();
        org.junit.Assert.assertNull(executorService4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults12);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture13);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults14);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService2);
        boolean boolean4 = multiBackgroundInitializer1.isStarted();
        java.util.concurrent.ExecutorService executorService5 = multiBackgroundInitializer1.getExternalExecutor();
        boolean boolean6 = multiBackgroundInitializer1.start();
        boolean boolean7 = multiBackgroundInitializer1.isStarted();
        boolean boolean8 = multiBackgroundInitializer1.isStarted();
        org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsBackgroundInitializer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiBackgroundInitializer1.addInitializer("hi!", multiBackgroundInitializerResultsBackgroundInitializer10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Child initializer must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(executorService5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService2);
        boolean boolean4 = multiBackgroundInitializer1.start();
        java.util.concurrent.ExecutorService executorService5 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService6 = multiBackgroundInitializer1.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults7 = multiBackgroundInitializer1.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults8 = multiBackgroundInitializer1.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults9 = multiBackgroundInitializer1.get();
        boolean boolean10 = multiBackgroundInitializer1.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults11 = multiBackgroundInitializer1.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults12 = multiBackgroundInitializer1.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture13 = multiBackgroundInitializer1.getFuture();
        boolean boolean14 = multiBackgroundInitializer1.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults15 = multiBackgroundInitializer1.get();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.BackgroundInitializer<?> wildcardBackgroundInitializer17 = multiBackgroundInitializerResults15.getInitializer("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child initializer with name ");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(executorService5);
        org.junit.Assert.assertNull(executorService6);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults7);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults8);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults11);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults12);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults15);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService2);
        java.util.concurrent.ExecutorService executorService4 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService6 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService6);
        multiBackgroundInitializer1.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        java.util.concurrent.ExecutorService executorService10 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer11 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService10);
        boolean boolean12 = multiBackgroundInitializer11.isStarted();
        boolean boolean13 = multiBackgroundInitializer11.start();
        boolean boolean14 = multiBackgroundInitializer11.isStarted();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture15 = multiBackgroundInitializer11.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture16 = multiBackgroundInitializer11.getFuture();
        multiBackgroundInitializer7.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer11);
        java.util.concurrent.ExecutorService executorService18 = multiBackgroundInitializer7.getExternalExecutor();
        org.junit.Assert.assertNull(executorService4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture15);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture16);
        org.junit.Assert.assertNull(executorService18);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        boolean boolean2 = multiBackgroundInitializer1.isStarted();
        java.util.concurrent.ExecutorService executorService3 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService3);
        boolean boolean5 = multiBackgroundInitializer1.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture6 = multiBackgroundInitializer1.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults7 = multiBackgroundInitializer1.get();
        boolean boolean8 = multiBackgroundInitializerResults7.isSuccessful();
        boolean boolean9 = multiBackgroundInitializerResults7.isSuccessful();
        java.util.Set<java.lang.String> strSet10 = multiBackgroundInitializerResults7.initializerNames();
        java.util.Set<java.lang.String> strSet11 = multiBackgroundInitializerResults7.initializerNames();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.ConcurrentException concurrentException13 = multiBackgroundInitializerResults7.getException("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child initializer with name hi!");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture6);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService2);
        java.util.concurrent.ExecutorService executorService4 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService6 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService6);
        multiBackgroundInitializer1.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        boolean boolean9 = multiBackgroundInitializer7.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults10 = multiBackgroundInitializer7.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults11 = multiBackgroundInitializer7.get();
        boolean boolean12 = multiBackgroundInitializerResults11.isSuccessful();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = multiBackgroundInitializerResults11.getResultObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child initializer with name hi!");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executorService4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults10);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService3 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService3);
        java.util.concurrent.ExecutorService executorService6 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService6);
        java.util.concurrent.ExecutorService executorService8 = null;
        multiBackgroundInitializer7.setExternalExecutor(executorService8);
        boolean boolean10 = multiBackgroundInitializer7.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture11 = multiBackgroundInitializer7.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture12 = multiBackgroundInitializer7.getFuture();
        boolean boolean13 = multiBackgroundInitializer7.start();
        multiBackgroundInitializer1.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        java.util.concurrent.ExecutorService executorService16 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer17 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService16);
        java.util.concurrent.ExecutorService executorService18 = null;
        multiBackgroundInitializer17.setExternalExecutor(executorService18);
        java.util.concurrent.ExecutorService executorService20 = multiBackgroundInitializer17.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService22 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer23 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService22);
        multiBackgroundInitializer17.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer23);
        java.util.concurrent.ExecutorService executorService25 = multiBackgroundInitializer17.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer27 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        java.util.concurrent.ExecutorService executorService28 = null;
        multiBackgroundInitializer27.setExternalExecutor(executorService28);
        java.util.concurrent.ExecutorService executorService30 = multiBackgroundInitializer27.getExternalExecutor();
        boolean boolean31 = multiBackgroundInitializer27.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture32 = multiBackgroundInitializer27.getFuture();
        boolean boolean33 = multiBackgroundInitializer27.isStarted();
        multiBackgroundInitializer17.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer27);
        multiBackgroundInitializer1.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer27);
        java.util.concurrent.ExecutorService executorService37 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer38 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService37);
        java.util.concurrent.ExecutorService executorService39 = multiBackgroundInitializer38.getExternalExecutor();
        boolean boolean40 = multiBackgroundInitializer38.start();
        java.util.concurrent.ExecutorService executorService41 = multiBackgroundInitializer38.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService42 = multiBackgroundInitializer38.getExternalExecutor();
        multiBackgroundInitializer1.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer38);
        java.util.concurrent.ExecutorService executorService45 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer46 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService45);
        java.util.concurrent.ExecutorService executorService48 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer49 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService48);
        java.util.concurrent.ExecutorService executorService50 = null;
        multiBackgroundInitializer49.setExternalExecutor(executorService50);
        java.util.concurrent.ExecutorService executorService52 = multiBackgroundInitializer49.getExternalExecutor();
        boolean boolean53 = multiBackgroundInitializer49.isStarted();
        multiBackgroundInitializer46.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer49);
        java.util.concurrent.ExecutorService executorService56 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer57 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService56);
        java.util.concurrent.ExecutorService executorService58 = null;
        multiBackgroundInitializer57.setExternalExecutor(executorService58);
        boolean boolean60 = multiBackgroundInitializer57.isStarted();
        java.util.concurrent.ExecutorService executorService61 = multiBackgroundInitializer57.getExternalExecutor();
        boolean boolean62 = multiBackgroundInitializer57.start();
        multiBackgroundInitializer49.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer57);
        multiBackgroundInitializer1.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer49);
        java.util.concurrent.ExecutorService executorService66 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer67 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService66);
        java.util.concurrent.ExecutorService executorService68 = null;
        multiBackgroundInitializer67.setExternalExecutor(executorService68);
        java.util.concurrent.ExecutorService executorService70 = multiBackgroundInitializer67.getExternalExecutor();
        boolean boolean71 = multiBackgroundInitializer67.isStarted();
        java.util.concurrent.ExecutorService executorService73 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer74 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService73);
        java.util.concurrent.ExecutorService executorService76 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer77 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService76);
        java.util.concurrent.ExecutorService executorService78 = null;
        multiBackgroundInitializer77.setExternalExecutor(executorService78);
        java.util.concurrent.ExecutorService executorService80 = multiBackgroundInitializer77.getExternalExecutor();
        boolean boolean81 = multiBackgroundInitializer77.isStarted();
        multiBackgroundInitializer74.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer77);
        multiBackgroundInitializer67.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer74);
        boolean boolean84 = multiBackgroundInitializer74.isStarted();
        multiBackgroundInitializer49.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer74);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture86 = multiBackgroundInitializer74.getFuture();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: start() must be called first!");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executorService2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture11);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(executorService20);
        org.junit.Assert.assertNull(executorService25);
        org.junit.Assert.assertNull(executorService30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(executorService39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(executorService41);
        org.junit.Assert.assertNull(executorService42);
        org.junit.Assert.assertNull(executorService52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(executorService61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNull(executorService70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNull(executorService80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService2);
        java.util.concurrent.ExecutorService executorService4 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService6 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService6);
        multiBackgroundInitializer1.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        java.util.concurrent.ExecutorService executorService10 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer11 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService10);
        boolean boolean12 = multiBackgroundInitializer11.isStarted();
        boolean boolean13 = multiBackgroundInitializer11.start();
        boolean boolean14 = multiBackgroundInitializer11.isStarted();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture15 = multiBackgroundInitializer11.getFuture();
        multiBackgroundInitializer7.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer11);
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults17 = multiBackgroundInitializer11.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults18 = multiBackgroundInitializer11.get();
        java.util.concurrent.ExecutorService executorService20 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer21 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService20);
        boolean boolean22 = multiBackgroundInitializer21.isStarted();
        java.util.concurrent.ExecutorService executorService23 = null;
        multiBackgroundInitializer21.setExternalExecutor(executorService23);
        java.util.concurrent.ExecutorService executorService25 = multiBackgroundInitializer21.getExternalExecutor();
        boolean boolean26 = multiBackgroundInitializer21.isStarted();
        java.util.concurrent.ExecutorService executorService28 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer29 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService28);
        boolean boolean30 = multiBackgroundInitializer29.isStarted();
        java.util.concurrent.ExecutorService executorService31 = null;
        multiBackgroundInitializer29.setExternalExecutor(executorService31);
        java.util.concurrent.ExecutorService executorService34 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer35 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService34);
        java.util.concurrent.ExecutorService executorService36 = null;
        multiBackgroundInitializer35.setExternalExecutor(executorService36);
        java.util.concurrent.ExecutorService executorService38 = multiBackgroundInitializer35.getExternalExecutor();
        boolean boolean39 = multiBackgroundInitializer35.isStarted();
        boolean boolean40 = multiBackgroundInitializer35.start();
        multiBackgroundInitializer29.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer35);
        multiBackgroundInitializer21.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer35);
        // The following exception was thrown during execution in test generation
        try {
            multiBackgroundInitializer11.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: addInitializer() must not be called after start()!");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executorService4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture15);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults17);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(executorService25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(executorService38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService3 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService3);
        java.util.concurrent.ExecutorService executorService5 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService6 = multiBackgroundInitializer1.getExternalExecutor();
        boolean boolean7 = multiBackgroundInitializer1.isStarted();
        java.util.concurrent.ExecutorService executorService8 = multiBackgroundInitializer1.getExternalExecutor();
        boolean boolean9 = multiBackgroundInitializer1.start();
        boolean boolean10 = multiBackgroundInitializer1.isStarted();
        java.util.concurrent.ExecutorService executorService11 = multiBackgroundInitializer1.getExternalExecutor();
        boolean boolean12 = multiBackgroundInitializer1.start();
        org.junit.Assert.assertNull(executorService2);
        org.junit.Assert.assertNull(executorService5);
        org.junit.Assert.assertNull(executorService6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(executorService8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(executorService11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        boolean boolean2 = multiBackgroundInitializer1.isStarted();
        java.util.concurrent.ExecutorService executorService3 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService3);
        java.util.concurrent.ExecutorService executorService5 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService7 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer8 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService7);
        boolean boolean9 = multiBackgroundInitializer8.isStarted();
        boolean boolean10 = multiBackgroundInitializer8.start();
        boolean boolean11 = multiBackgroundInitializer8.isStarted();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture12 = multiBackgroundInitializer8.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults13 = multiBackgroundInitializer8.get();
        multiBackgroundInitializer1.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer8);
        boolean boolean15 = multiBackgroundInitializer8.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults16 = multiBackgroundInitializer8.get();
        java.util.concurrent.ExecutorService executorService17 = multiBackgroundInitializer8.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults18 = multiBackgroundInitializer8.get();
        java.util.concurrent.ExecutorService executorService20 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer21 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService20);
        java.util.concurrent.ExecutorService executorService22 = multiBackgroundInitializer21.getExternalExecutor();
        boolean boolean23 = multiBackgroundInitializer21.start();
        java.util.concurrent.ExecutorService executorService24 = multiBackgroundInitializer21.getExternalExecutor();
        boolean boolean25 = multiBackgroundInitializer21.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults26 = multiBackgroundInitializer21.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults27 = multiBackgroundInitializer21.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults28 = multiBackgroundInitializer21.get();
        java.util.concurrent.ExecutorService executorService29 = multiBackgroundInitializer21.getExternalExecutor();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture30 = multiBackgroundInitializer21.getFuture();
        // The following exception was thrown during execution in test generation
        try {
            multiBackgroundInitializer8.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: addInitializer() must not be called after start()!");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(executorService5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture12);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults16);
        org.junit.Assert.assertNull(executorService17);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults18);
        org.junit.Assert.assertNull(executorService22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(executorService24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults26);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults27);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults28);
        org.junit.Assert.assertNull(executorService29);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture30);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer1.getExternalExecutor();
        boolean boolean3 = multiBackgroundInitializer1.start();
        java.util.concurrent.ExecutorService executorService4 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService5 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture6 = multiBackgroundInitializer1.getFuture();
        boolean boolean7 = multiBackgroundInitializer1.start();
        boolean boolean8 = multiBackgroundInitializer1.isStarted();
        org.junit.Assert.assertNull(executorService2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(executorService4);
        org.junit.Assert.assertNull(executorService5);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService2);
        boolean boolean4 = multiBackgroundInitializer1.start();
        java.util.concurrent.ExecutorService executorService5 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService6 = multiBackgroundInitializer1.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults7 = multiBackgroundInitializer1.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults8 = multiBackgroundInitializer1.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults9 = multiBackgroundInitializer1.get();
        boolean boolean10 = multiBackgroundInitializerResults9.isSuccessful();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = multiBackgroundInitializerResults9.getResultObject("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child initializer with name ");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(executorService5);
        org.junit.Assert.assertNull(executorService6);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults7);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults8);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        boolean boolean2 = multiBackgroundInitializer1.isStarted();
        java.util.concurrent.ExecutorService executorService3 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService3);
        boolean boolean5 = multiBackgroundInitializer1.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture6 = multiBackgroundInitializer1.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults7 = multiBackgroundInitializer1.get();
        boolean boolean8 = multiBackgroundInitializerResults7.isSuccessful();
        boolean boolean9 = multiBackgroundInitializerResults7.isSuccessful();
        boolean boolean10 = multiBackgroundInitializerResults7.isSuccessful();
        java.util.Set<java.lang.String> strSet11 = multiBackgroundInitializerResults7.initializerNames();
        java.lang.Class<?> wildcardClass12 = strSet11.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture6);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        boolean boolean2 = multiBackgroundInitializer1.isStarted();
        boolean boolean3 = multiBackgroundInitializer1.start();
        boolean boolean4 = multiBackgroundInitializer1.isStarted();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture5 = multiBackgroundInitializer1.getFuture();
        boolean boolean6 = multiBackgroundInitializer1.isStarted();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture7 = multiBackgroundInitializer1.getFuture();
        java.util.concurrent.ExecutorService executorService8 = multiBackgroundInitializer1.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults9 = multiBackgroundInitializer1.get();
        boolean boolean10 = multiBackgroundInitializer1.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults11 = multiBackgroundInitializer1.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture12 = multiBackgroundInitializer1.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults13 = multiBackgroundInitializer1.get();
        boolean boolean14 = multiBackgroundInitializerResults13.isSuccessful();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = multiBackgroundInitializerResults13.isException("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child initializer with name hi!");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture7);
        org.junit.Assert.assertNull(executorService8);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults11);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture12);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        boolean boolean2 = multiBackgroundInitializer1.isStarted();
        boolean boolean3 = multiBackgroundInitializer1.start();
        boolean boolean4 = multiBackgroundInitializer1.isStarted();
        boolean boolean5 = multiBackgroundInitializer1.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture6 = multiBackgroundInitializer1.getFuture();
        boolean boolean7 = multiBackgroundInitializer1.start();
        boolean boolean8 = multiBackgroundInitializer1.start();
        java.util.concurrent.ExecutorService executorService9 = multiBackgroundInitializer1.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults10 = multiBackgroundInitializer1.get();
        java.util.concurrent.ExecutorService executorService12 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer13 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService12);
        java.util.concurrent.ExecutorService executorService14 = null;
        multiBackgroundInitializer13.setExternalExecutor(executorService14);
        java.util.concurrent.ExecutorService executorService16 = multiBackgroundInitializer13.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService18 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer19 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService18);
        multiBackgroundInitializer13.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer19);
        java.util.concurrent.ExecutorService executorService22 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer23 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService22);
        boolean boolean24 = multiBackgroundInitializer23.isStarted();
        boolean boolean25 = multiBackgroundInitializer23.start();
        boolean boolean26 = multiBackgroundInitializer23.isStarted();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture27 = multiBackgroundInitializer23.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture28 = multiBackgroundInitializer23.getFuture();
        multiBackgroundInitializer19.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer23);
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture30 = multiBackgroundInitializer23.getFuture();
        // The following exception was thrown during execution in test generation
        try {
            multiBackgroundInitializer1.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: addInitializer() must not be called after start()!");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(executorService9);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults10);
        org.junit.Assert.assertNull(executorService16);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture27);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture28);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture30);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService3 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService4 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService4);
        boolean boolean6 = multiBackgroundInitializer1.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture7 = multiBackgroundInitializer1.getFuture();
        boolean boolean8 = multiBackgroundInitializer1.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults9 = multiBackgroundInitializer1.get();
        boolean boolean10 = multiBackgroundInitializer1.isStarted();
        org.junit.Assert.assertNull(executorService2);
        org.junit.Assert.assertNull(executorService3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }
}

