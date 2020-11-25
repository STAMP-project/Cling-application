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
        boolean boolean2 = multiBackgroundInitializer1.isStarted();
        java.util.concurrent.ExecutorService executorService3 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService3);
        boolean boolean5 = multiBackgroundInitializer1.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture6 = multiBackgroundInitializer1.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults7 = multiBackgroundInitializer1.get();
        boolean boolean8 = multiBackgroundInitializer1.isStarted();
        boolean boolean9 = multiBackgroundInitializer1.isStarted();
        boolean boolean10 = multiBackgroundInitializer1.isStarted();
        boolean boolean11 = multiBackgroundInitializer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture6);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService3 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService3);
        java.util.concurrent.ExecutorService executorService5 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService6 = multiBackgroundInitializer1.getExternalExecutor();
        boolean boolean7 = multiBackgroundInitializer1.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults8 = multiBackgroundInitializer1.get();
        java.util.concurrent.ExecutorService executorService9 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService10 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture11 = multiBackgroundInitializer1.getFuture();
        java.lang.Class<?> wildcardClass12 = multiBackgroundInitializerResultsFuture11.getClass();
        org.junit.Assert.assertNull(executorService2);
        org.junit.Assert.assertNull(executorService5);
        org.junit.Assert.assertNull(executorService6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults8);
        org.junit.Assert.assertNull(executorService9);
        org.junit.Assert.assertNull(executorService10);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService2);
        java.util.concurrent.ExecutorService executorService4 = null;
        multiBackgroundInitializer3.setExternalExecutor(executorService4);
        java.util.concurrent.ExecutorService executorService6 = multiBackgroundInitializer3.getExternalExecutor();
        boolean boolean7 = multiBackgroundInitializer3.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults8 = multiBackgroundInitializer3.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture9 = multiBackgroundInitializer3.getFuture();
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer3);
        java.util.concurrent.ExecutorService executorService11 = multiBackgroundInitializer0.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService13 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer14 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService13);
        boolean boolean15 = multiBackgroundInitializer14.isStarted();
        java.util.concurrent.ExecutorService executorService16 = null;
        multiBackgroundInitializer14.setExternalExecutor(executorService16);
        java.util.concurrent.ExecutorService executorService19 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer20 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService19);
        java.util.concurrent.ExecutorService executorService21 = null;
        multiBackgroundInitializer20.setExternalExecutor(executorService21);
        java.util.concurrent.ExecutorService executorService23 = multiBackgroundInitializer20.getExternalExecutor();
        boolean boolean24 = multiBackgroundInitializer20.isStarted();
        boolean boolean25 = multiBackgroundInitializer20.start();
        multiBackgroundInitializer14.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer20);
        java.util.concurrent.ExecutorService executorService28 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer29 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService28);
        java.util.concurrent.ExecutorService executorService30 = multiBackgroundInitializer29.getExternalExecutor();
        boolean boolean31 = multiBackgroundInitializer29.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults32 = multiBackgroundInitializer29.get();
        multiBackgroundInitializer14.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer29);
        boolean boolean34 = multiBackgroundInitializer14.isStarted();
        java.util.concurrent.ExecutorService executorService36 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer37 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService36);
        java.util.concurrent.ExecutorService executorService38 = null;
        multiBackgroundInitializer37.setExternalExecutor(executorService38);
        java.util.concurrent.ExecutorService executorService40 = multiBackgroundInitializer37.getExternalExecutor();
        boolean boolean41 = multiBackgroundInitializer37.isStarted();
        java.util.concurrent.ExecutorService executorService43 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer44 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService43);
        java.util.concurrent.ExecutorService executorService46 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer47 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService46);
        java.util.concurrent.ExecutorService executorService48 = null;
        multiBackgroundInitializer47.setExternalExecutor(executorService48);
        java.util.concurrent.ExecutorService executorService50 = multiBackgroundInitializer47.getExternalExecutor();
        boolean boolean51 = multiBackgroundInitializer47.isStarted();
        multiBackgroundInitializer44.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer47);
        multiBackgroundInitializer37.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer44);
        boolean boolean54 = multiBackgroundInitializer44.isStarted();
        multiBackgroundInitializer14.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer44);
        java.util.concurrent.ExecutorService executorService57 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer58 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService57);
        java.util.concurrent.ExecutorService executorService59 = null;
        multiBackgroundInitializer58.setExternalExecutor(executorService59);
        java.util.concurrent.ExecutorService executorService61 = null;
        multiBackgroundInitializer58.setExternalExecutor(executorService61);
        java.util.concurrent.ExecutorService executorService64 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer65 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService64);
        boolean boolean66 = multiBackgroundInitializer65.isStarted();
        java.util.concurrent.ExecutorService executorService67 = null;
        multiBackgroundInitializer65.setExternalExecutor(executorService67);
        java.util.concurrent.ExecutorService executorService69 = multiBackgroundInitializer65.getExternalExecutor();
        boolean boolean70 = multiBackgroundInitializer65.isStarted();
        java.util.concurrent.ExecutorService executorService72 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer73 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService72);
        boolean boolean74 = multiBackgroundInitializer73.isStarted();
        java.util.concurrent.ExecutorService executorService75 = null;
        multiBackgroundInitializer73.setExternalExecutor(executorService75);
        java.util.concurrent.ExecutorService executorService78 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer79 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService78);
        java.util.concurrent.ExecutorService executorService80 = null;
        multiBackgroundInitializer79.setExternalExecutor(executorService80);
        java.util.concurrent.ExecutorService executorService82 = multiBackgroundInitializer79.getExternalExecutor();
        boolean boolean83 = multiBackgroundInitializer79.isStarted();
        boolean boolean84 = multiBackgroundInitializer79.start();
        multiBackgroundInitializer73.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer79);
        multiBackgroundInitializer65.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer79);
        multiBackgroundInitializer58.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer79);
        java.util.concurrent.ExecutorService executorService88 = null;
        multiBackgroundInitializer58.setExternalExecutor(executorService88);
        multiBackgroundInitializer44.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer58);
        multiBackgroundInitializer0.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer44);
        org.junit.Assert.assertNull(executorService6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults8);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture9);
        org.junit.Assert.assertNull(executorService11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(executorService23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(executorService30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(executorService40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(executorService50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNull(executorService69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNull(executorService82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        boolean boolean2 = multiBackgroundInitializer1.isStarted();
        java.util.concurrent.ExecutorService executorService3 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService4 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService4);
        java.util.concurrent.ExecutorService executorService7 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer8 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService7);
        java.util.concurrent.ExecutorService executorService9 = null;
        multiBackgroundInitializer8.setExternalExecutor(executorService9);
        java.util.concurrent.ExecutorService executorService11 = multiBackgroundInitializer8.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService13 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer14 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService13);
        multiBackgroundInitializer8.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer14);
        multiBackgroundInitializer1.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer14);
        java.util.concurrent.ExecutorService executorService17 = multiBackgroundInitializer14.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService18 = multiBackgroundInitializer14.getExternalExecutor();
        boolean boolean19 = multiBackgroundInitializer14.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(executorService3);
        org.junit.Assert.assertNull(executorService11);
        org.junit.Assert.assertNull(executorService17);
        org.junit.Assert.assertNull(executorService18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        boolean boolean2 = multiBackgroundInitializer1.isStarted();
        boolean boolean3 = multiBackgroundInitializer1.start();
        boolean boolean4 = multiBackgroundInitializer1.isStarted();
        boolean boolean5 = multiBackgroundInitializer1.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture6 = multiBackgroundInitializer1.getFuture();
        boolean boolean7 = multiBackgroundInitializer1.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture8 = multiBackgroundInitializer1.getFuture();
        boolean boolean9 = multiBackgroundInitializer1.isStarted();
        boolean boolean10 = multiBackgroundInitializer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        boolean boolean2 = multiBackgroundInitializer1.isStarted();
        boolean boolean3 = multiBackgroundInitializer1.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture4 = multiBackgroundInitializer1.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture5 = multiBackgroundInitializer1.getFuture();
        java.util.concurrent.ExecutorService executorService6 = multiBackgroundInitializer1.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults7 = multiBackgroundInitializer1.get();
        java.util.Set<java.lang.String> strSet8 = multiBackgroundInitializerResults7.initializerNames();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.BackgroundInitializer<?> wildcardBackgroundInitializer10 = multiBackgroundInitializerResults7.getInitializer("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child initializer with name ");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture4);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture5);
        org.junit.Assert.assertNull(executorService6);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults7);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        boolean boolean2 = multiBackgroundInitializer1.isStarted();
        java.util.concurrent.ExecutorService executorService3 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService4 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService5 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService5);
        java.util.concurrent.ExecutorService executorService7 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService7);
        boolean boolean9 = multiBackgroundInitializer1.isStarted();
        boolean boolean10 = multiBackgroundInitializer1.start();
        java.util.concurrent.ExecutorService executorService11 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiBackgroundInitializer1.setExternalExecutor(executorService11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot set ExecutorService after start()!");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(executorService3);
        org.junit.Assert.assertNull(executorService4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService2);
        java.util.concurrent.ExecutorService executorService4 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService5 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService6 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService6);
        java.util.concurrent.ExecutorService executorService9 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer10 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService9);
        java.util.concurrent.ExecutorService executorService11 = multiBackgroundInitializer10.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService12 = null;
        multiBackgroundInitializer10.setExternalExecutor(executorService12);
        java.util.concurrent.ExecutorService executorService15 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer16 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService15);
        java.util.concurrent.ExecutorService executorService17 = null;
        multiBackgroundInitializer16.setExternalExecutor(executorService17);
        boolean boolean19 = multiBackgroundInitializer16.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture20 = multiBackgroundInitializer16.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture21 = multiBackgroundInitializer16.getFuture();
        boolean boolean22 = multiBackgroundInitializer16.start();
        multiBackgroundInitializer10.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer16);
        boolean boolean24 = multiBackgroundInitializer16.isStarted();
        multiBackgroundInitializer1.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer16);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults26 = multiBackgroundInitializer1.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: start() must be called first!");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executorService4);
        org.junit.Assert.assertNull(executorService5);
        org.junit.Assert.assertNull(executorService11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture20);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
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
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults22 = multiBackgroundInitializer16.get();
        java.util.Set<java.lang.String> strSet23 = multiBackgroundInitializerResults22.initializerNames();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(executorService10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(executorService17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults19);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture21);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults22);
        org.junit.Assert.assertNotNull(strSet23);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = multiBackgroundInitializerResults12.getResultObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child initializer with name hi!");
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
        boolean boolean8 = multiBackgroundInitializer1.isStarted();
        boolean boolean9 = multiBackgroundInitializer1.isStarted();
        boolean boolean10 = multiBackgroundInitializer1.isStarted();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture11 = multiBackgroundInitializer1.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults12 = multiBackgroundInitializer1.get();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.BackgroundInitializer<?> wildcardBackgroundInitializer14 = multiBackgroundInitializerResults12.getInitializer("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child initializer with name ");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executorService4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture11);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults12);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        boolean boolean2 = multiBackgroundInitializer1.isStarted();
        java.util.concurrent.ExecutorService executorService3 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService4 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService4);
        java.util.concurrent.ExecutorService executorService7 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer8 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService7);
        java.util.concurrent.ExecutorService executorService9 = null;
        multiBackgroundInitializer8.setExternalExecutor(executorService9);
        java.util.concurrent.ExecutorService executorService11 = multiBackgroundInitializer8.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService13 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer14 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService13);
        multiBackgroundInitializer8.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer14);
        multiBackgroundInitializer1.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer14);
        java.util.concurrent.ExecutorService executorService17 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService17);
        boolean boolean19 = multiBackgroundInitializer1.start();
        boolean boolean20 = multiBackgroundInitializer1.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults21 = multiBackgroundInitializer1.get();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(executorService3);
        org.junit.Assert.assertNull(executorService11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults21);
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
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture5 = multiBackgroundInitializer1.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults6 = multiBackgroundInitializer1.get();
        boolean boolean7 = multiBackgroundInitializerResults6.isSuccessful();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.ConcurrentException concurrentException9 = multiBackgroundInitializerResults6.getException("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child initializer with name ");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture5);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.BackgroundInitializer<?> wildcardBackgroundInitializer15 = multiBackgroundInitializerResults6.getInitializer("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child initializer with name hi!");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        boolean boolean2 = multiBackgroundInitializer1.isStarted();
        boolean boolean3 = multiBackgroundInitializer1.start();
        boolean boolean4 = multiBackgroundInitializer1.isStarted();
        boolean boolean5 = multiBackgroundInitializer1.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture6 = multiBackgroundInitializer1.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults7 = multiBackgroundInitializer1.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture8 = multiBackgroundInitializer1.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture9 = multiBackgroundInitializer1.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults10 = multiBackgroundInitializer1.get();
        boolean boolean11 = multiBackgroundInitializer1.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults12 = multiBackgroundInitializer1.get();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture6);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults7);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture8);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture9);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults12);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
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
        boolean boolean22 = multiBackgroundInitializer7.isStarted();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
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
        java.util.concurrent.ExecutorService executorService6 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService6);
        java.util.concurrent.ExecutorService executorService8 = multiBackgroundInitializer1.getExternalExecutor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = executorService8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executorService4);
        org.junit.Assert.assertNull(executorService5);
        org.junit.Assert.assertNull(executorService8);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService2);
        boolean boolean4 = multiBackgroundInitializer1.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture5 = multiBackgroundInitializer1.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture6 = multiBackgroundInitializer1.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults7 = multiBackgroundInitializer1.get();
        java.util.concurrent.ExecutorService executorService8 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService9 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService10 = multiBackgroundInitializer1.getExternalExecutor();
        boolean boolean11 = multiBackgroundInitializer1.isStarted();
        boolean boolean12 = multiBackgroundInitializer1.isStarted();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture5);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture6);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults7);
        org.junit.Assert.assertNull(executorService8);
        org.junit.Assert.assertNull(executorService9);
        org.junit.Assert.assertNull(executorService10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
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
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults22 = multiBackgroundInitializer16.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults23 = multiBackgroundInitializer16.get();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(executorService10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(executorService17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults19);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture21);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults22);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults23);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService2);
        java.util.concurrent.ExecutorService executorService4 = multiBackgroundInitializer1.getExternalExecutor();
        boolean boolean5 = multiBackgroundInitializer1.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults6 = multiBackgroundInitializer1.get();
        java.util.Set<java.lang.String> strSet7 = multiBackgroundInitializerResults6.initializerNames();
        java.lang.Class<?> wildcardClass8 = strSet7.getClass();
        org.junit.Assert.assertNull(executorService4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        boolean boolean2 = multiBackgroundInitializer1.isStarted();
        java.util.concurrent.ExecutorService executorService3 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService3);
        boolean boolean5 = multiBackgroundInitializer1.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture6 = multiBackgroundInitializer1.getFuture();
        boolean boolean7 = multiBackgroundInitializer1.isStarted();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture8 = multiBackgroundInitializer1.getFuture();
        boolean boolean9 = multiBackgroundInitializer1.isStarted();
        boolean boolean10 = multiBackgroundInitializer1.isStarted();
        boolean boolean11 = multiBackgroundInitializer1.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults12 = multiBackgroundInitializer1.get();
        boolean boolean13 = multiBackgroundInitializerResults12.isSuccessful();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        boolean boolean2 = multiBackgroundInitializer1.isStarted();
        boolean boolean3 = multiBackgroundInitializer1.start();
        boolean boolean4 = multiBackgroundInitializer1.isStarted();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture5 = multiBackgroundInitializer1.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults6 = multiBackgroundInitializer1.get();
        boolean boolean7 = multiBackgroundInitializer1.isStarted();
        java.util.concurrent.ExecutorService executorService8 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService10 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer11 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService10);
        java.util.concurrent.ExecutorService executorService12 = multiBackgroundInitializer11.getExternalExecutor();
        boolean boolean13 = multiBackgroundInitializer11.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults14 = multiBackgroundInitializer11.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture15 = multiBackgroundInitializer11.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults16 = multiBackgroundInitializer11.get();
        java.util.concurrent.ExecutorService executorService17 = multiBackgroundInitializer11.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService18 = multiBackgroundInitializer11.getExternalExecutor();
        boolean boolean19 = multiBackgroundInitializer11.isStarted();
        boolean boolean20 = multiBackgroundInitializer11.start();
        java.util.concurrent.ExecutorService executorService21 = multiBackgroundInitializer11.getExternalExecutor();
        // The following exception was thrown during execution in test generation
        try {
            multiBackgroundInitializer1.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: addInitializer() must not be called after start()!");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture5);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(executorService8);
        org.junit.Assert.assertNull(executorService12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults14);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture15);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults16);
        org.junit.Assert.assertNull(executorService17);
        org.junit.Assert.assertNull(executorService18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(executorService21);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        boolean boolean2 = multiBackgroundInitializer1.isStarted();
        boolean boolean3 = multiBackgroundInitializer1.start();
        boolean boolean4 = multiBackgroundInitializer1.isStarted();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture5 = multiBackgroundInitializer1.getFuture();
        java.util.concurrent.ExecutorService executorService6 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture7 = multiBackgroundInitializer1.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults8 = multiBackgroundInitializer1.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults9 = multiBackgroundInitializer1.get();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.ConcurrentException concurrentException11 = multiBackgroundInitializerResults9.getException("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child initializer with name ");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture5);
        org.junit.Assert.assertNull(executorService6);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture7);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults8);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults9);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService3 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService3);
        java.util.concurrent.ExecutorService executorService5 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService6 = multiBackgroundInitializer1.getExternalExecutor();
        boolean boolean7 = multiBackgroundInitializer1.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults8 = multiBackgroundInitializer1.get();
        java.util.concurrent.ExecutorService executorService9 = multiBackgroundInitializer1.getExternalExecutor();
        boolean boolean10 = multiBackgroundInitializer1.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults11 = multiBackgroundInitializer1.get();
        java.util.Set<java.lang.String> strSet12 = multiBackgroundInitializerResults11.initializerNames();
        java.util.Set<java.lang.String> strSet13 = multiBackgroundInitializerResults11.initializerNames();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = multiBackgroundInitializerResults11.getResultObject("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child initializer with name ");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(executorService2);
        org.junit.Assert.assertNull(executorService5);
        org.junit.Assert.assertNull(executorService6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults8);
        org.junit.Assert.assertNull(executorService9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strSet13);
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
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults7 = multiBackgroundInitializer1.get();
        boolean boolean8 = multiBackgroundInitializerResults7.isSuccessful();
        boolean boolean9 = multiBackgroundInitializerResults7.isSuccessful();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = multiBackgroundInitializerResults7.getResultObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child initializer with name hi!");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture5);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture6);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        java.util.concurrent.ExecutorService executorService1 = null;
        multiBackgroundInitializer0.setExternalExecutor(executorService1);
        java.util.concurrent.ExecutorService executorService3 = multiBackgroundInitializer0.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService4 = multiBackgroundInitializer0.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService5 = multiBackgroundInitializer0.getExternalExecutor();
        org.junit.Assert.assertNull(executorService3);
        org.junit.Assert.assertNull(executorService4);
        org.junit.Assert.assertNull(executorService5);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        boolean boolean2 = multiBackgroundInitializer1.isStarted();
        boolean boolean3 = multiBackgroundInitializer1.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture4 = multiBackgroundInitializer1.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture5 = multiBackgroundInitializer1.getFuture();
        boolean boolean6 = multiBackgroundInitializer1.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults7 = multiBackgroundInitializer1.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults8 = multiBackgroundInitializer1.get();
        java.util.concurrent.ExecutorService executorService9 = multiBackgroundInitializer1.getExternalExecutor();
        boolean boolean10 = multiBackgroundInitializer1.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults11 = multiBackgroundInitializer1.get();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture4);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults7);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults8);
        org.junit.Assert.assertNull(executorService9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults11);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
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
        boolean boolean19 = multiBackgroundInitializerResults18.isSuccessful();
        boolean boolean20 = multiBackgroundInitializerResults18.isSuccessful();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService2);
        boolean boolean4 = multiBackgroundInitializer1.start();
        boolean boolean5 = multiBackgroundInitializer1.isStarted();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture6 = multiBackgroundInitializer1.getFuture();
        java.util.concurrent.ExecutorService executorService7 = multiBackgroundInitializer1.getExternalExecutor();
        java.lang.Class<?> wildcardClass8 = multiBackgroundInitializer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture6);
        org.junit.Assert.assertNull(executorService7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer1.getExternalExecutor();
        boolean boolean3 = multiBackgroundInitializer1.start();
        boolean boolean4 = multiBackgroundInitializer1.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults5 = multiBackgroundInitializer1.get();
        boolean boolean6 = multiBackgroundInitializer1.start();
        org.junit.Assert.assertNull(executorService2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        java.util.concurrent.ExecutorService executorService1 = null;
        multiBackgroundInitializer0.setExternalExecutor(executorService1);
        boolean boolean3 = multiBackgroundInitializer0.isStarted();
        boolean boolean4 = multiBackgroundInitializer0.isStarted();
        java.util.concurrent.ExecutorService executorService6 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer7 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService6);
        java.util.concurrent.ExecutorService executorService8 = multiBackgroundInitializer7.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService9 = multiBackgroundInitializer7.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService10 = null;
        multiBackgroundInitializer7.setExternalExecutor(executorService10);
        multiBackgroundInitializer0.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer7);
        boolean boolean13 = multiBackgroundInitializer7.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(executorService8);
        org.junit.Assert.assertNull(executorService9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
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
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
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
}

