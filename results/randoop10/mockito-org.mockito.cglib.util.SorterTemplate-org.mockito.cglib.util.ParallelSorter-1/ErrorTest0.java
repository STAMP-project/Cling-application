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
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = generator0.getStrategy();
        java.lang.ClassLoader classLoader2 = generator0.getClassLoader();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter3 = generator0.create();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator1 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator1.setUseCache(true);
        boolean boolean4 = generator1.getAttemptLoad();
        boolean boolean5 = generator1.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator1.getStrategy();
        generator0.setStrategy(generatorStrategy6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter8 = generator0.create();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        generator0.setUseCache(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter6 = generator0.create();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = generator0.getStrategy();
        org.mockito.cglib.util.ParallelSorter.Generator generator6 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator6.setUseCache(true);
        boolean boolean9 = generator6.getAttemptLoad();
        boolean boolean10 = generator6.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = generator6.getStrategy();
        generator0.setStrategy(generatorStrategy11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter13 = generator0.create();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = generator0.getStrategy();
        org.mockito.cglib.util.ParallelSorter.Generator generator6 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator6.setUseCache(true);
        boolean boolean9 = generator6.getAttemptLoad();
        boolean boolean10 = generator6.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = generator6.getStrategy();
        generator0.setStrategy(generatorStrategy11);
        java.lang.ClassLoader classLoader13 = generator0.getClassLoader();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter14 = generator0.create();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = generator0.getStrategy();
        generator0.setUseCache(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter8 = generator0.create();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        generator0.setUseCache(true);
        generator0.setAttemptLoad(true);
        boolean boolean11 = generator0.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy12 = generator0.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter13 = generator0.create();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        generator0.setUseCache(true);
        generator0.setAttemptLoad(true);
        generator0.setUseCache(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter13 = generator0.create();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator1 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator1.setUseCache(true);
        boolean boolean4 = generator1.getAttemptLoad();
        boolean boolean5 = generator1.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator1.getStrategy();
        generator0.setStrategy(generatorStrategy6);
        org.mockito.cglib.util.ParallelSorter.Generator generator8 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator8.setUseCache(true);
        boolean boolean11 = generator8.getAttemptLoad();
        boolean boolean12 = generator8.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator8.getStrategy();
        generator0.setStrategy(generatorStrategy13);
        generator0.setAttemptLoad(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter17 = generator0.create();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        generator0.setUseCache(true);
        generator0.setAttemptLoad(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter11 = generator0.create();
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        boolean boolean7 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter10 = generator0.create();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = generator0.getStrategy();
        java.lang.ClassLoader classLoader2 = generator0.getClassLoader();
        generator0.setUseCache(false);
        boolean boolean5 = generator0.getUseCache();
        boolean boolean6 = generator0.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter7 = generator0.create();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        java.lang.ClassLoader classLoader2 = generator0.getClassLoader();
        java.lang.ClassLoader classLoader3 = generator0.getClassLoader();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter4 = generator0.create();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator1 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator1.setUseCache(true);
        boolean boolean4 = generator1.getAttemptLoad();
        boolean boolean5 = generator1.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator1.getStrategy();
        generator0.setStrategy(generatorStrategy6);
        org.mockito.cglib.util.ParallelSorter.Generator generator8 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator8.setUseCache(true);
        boolean boolean11 = generator8.getAttemptLoad();
        boolean boolean12 = generator8.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator8.getStrategy();
        generator0.setStrategy(generatorStrategy13);
        generator0.setAttemptLoad(false);
        boolean boolean17 = generator0.getUseCache();
        java.lang.ClassLoader classLoader18 = generator0.getClassLoader();
        boolean boolean19 = generator0.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter20 = generator0.create();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        generator0.setUseCache(true);
        generator0.setAttemptLoad(true);
        boolean boolean11 = generator0.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy12 = generator0.getNamingPolicy();
        generator0.setUseCache(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter15 = generator0.create();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy5 = generator0.getNamingPolicy();
        org.mockito.cglib.util.ParallelSorter.Generator generator6 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator6.setUseCache(true);
        boolean boolean9 = generator6.getAttemptLoad();
        boolean boolean10 = generator6.getUseCache();
        generator6.setAttemptLoad(true);
        org.mockito.cglib.util.ParallelSorter.Generator generator13 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy14 = generator13.getStrategy();
        generator6.setStrategy(generatorStrategy14);
        org.mockito.cglib.util.ParallelSorter.Generator generator16 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator16.setUseCache(true);
        java.lang.ClassLoader classLoader19 = generator16.getClassLoader();
        generator6.setClassLoader(classLoader19);
        generator0.setClassLoader(classLoader19);
        generator0.setAttemptLoad(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter24 = generator0.create();
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        generator0.setUseCache(true);
        generator0.setUseCache(false);
        boolean boolean11 = generator0.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter12 = generator0.create();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        generator0.setAttemptLoad(true);
        generator0.setUseCache(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter11 = generator0.create();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        org.mockito.cglib.util.ParallelSorter.Generator generator3 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator4 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator4.setUseCache(true);
        boolean boolean7 = generator4.getAttemptLoad();
        boolean boolean8 = generator4.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = generator4.getStrategy();
        generator3.setStrategy(generatorStrategy9);
        org.mockito.cglib.util.ParallelSorter.Generator generator11 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator11.setUseCache(true);
        boolean boolean14 = generator11.getAttemptLoad();
        boolean boolean15 = generator11.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = generator11.getStrategy();
        generator3.setStrategy(generatorStrategy16);
        generator0.setStrategy(generatorStrategy16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter19 = generator0.create();
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        generator0.setUseCache(true);
        generator0.setAttemptLoad(true);
        generator0.setUseCache(false);
        boolean boolean13 = generator0.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter14 = generator0.create();
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        java.util.Comparator<java.lang.String> strComparator0 = java.util.Comparator.reverseOrder();
        org.mockito.cglib.util.ParallelSorter.Generator generator1 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator1.setUseCache(true);
        boolean boolean4 = generator1.getAttemptLoad();
        boolean boolean5 = generator1.getUseCache();
        org.mockito.cglib.util.ParallelSorter.Generator generator6 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator6.setUseCache(true);
        boolean boolean9 = generator6.getAttemptLoad();
        boolean boolean10 = generator6.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = generator6.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = generator6.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator6.getStrategy();
        generator1.setStrategy(generatorStrategy13);
        boolean boolean15 = strComparator0.equals((java.lang.Object) generator1);
        org.mockito.cglib.core.NamingPolicy namingPolicy16 = generator1.getNamingPolicy();
        generator1.setAttemptLoad(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter19 = generator1.create();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        org.mockito.cglib.util.ParallelSorter.Generator generator3 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator4 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator4.setUseCache(true);
        boolean boolean7 = generator4.getAttemptLoad();
        boolean boolean8 = generator4.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = generator4.getStrategy();
        generator3.setStrategy(generatorStrategy9);
        org.mockito.cglib.util.ParallelSorter.Generator generator11 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator11.setUseCache(true);
        boolean boolean14 = generator11.getAttemptLoad();
        boolean boolean15 = generator11.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = generator11.getStrategy();
        generator3.setStrategy(generatorStrategy16);
        generator0.setStrategy(generatorStrategy16);
        java.lang.ClassLoader classLoader19 = generator0.getClassLoader();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter20 = generator0.create();
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        java.lang.ClassLoader classLoader2 = generator0.getClassLoader();
        boolean boolean3 = generator0.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter4 = generator0.create();
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = generator0.getStrategy();
        java.lang.ClassLoader classLoader2 = generator0.getClassLoader();
        generator0.setAttemptLoad(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter5 = generator0.create();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = generator0.getStrategy();
        java.lang.ClassLoader classLoader2 = generator0.getClassLoader();
        generator0.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy5 = generator0.getNamingPolicy();
        org.mockito.cglib.util.ParallelSorter.Generator generator6 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator7 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator7.setUseCache(true);
        boolean boolean10 = generator7.getAttemptLoad();
        boolean boolean11 = generator7.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = generator7.getStrategy();
        generator6.setStrategy(generatorStrategy12);
        generator0.setStrategy(generatorStrategy12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter15 = generator0.create();
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = generator0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = generator0.getNamingPolicy();
        boolean boolean7 = generator0.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter8 = generator0.create();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        org.mockito.cglib.util.ParallelSorter.Generator generator3 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator4 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator4.setUseCache(true);
        boolean boolean7 = generator4.getAttemptLoad();
        boolean boolean8 = generator4.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = generator4.getStrategy();
        generator3.setStrategy(generatorStrategy9);
        org.mockito.cglib.util.ParallelSorter.Generator generator11 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator11.setUseCache(true);
        boolean boolean14 = generator11.getAttemptLoad();
        boolean boolean15 = generator11.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = generator11.getStrategy();
        generator3.setStrategy(generatorStrategy16);
        generator0.setStrategy(generatorStrategy16);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy19 = generator0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy20 = generator0.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter21 = generator0.create();
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        java.util.Comparator<java.lang.String> strComparator0 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator1 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator2 = strComparator0.thenComparing(strComparator1);
        org.mockito.cglib.util.ParallelSorter.Generator generator3 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator3.setUseCache(true);
        boolean boolean6 = generator3.getAttemptLoad();
        boolean boolean7 = generator3.getUseCache();
        generator3.setAttemptLoad(true);
        generator3.setUseCache(true);
        boolean boolean12 = strComparator0.equals((java.lang.Object) generator3);
        generator3.setAttemptLoad(false);
        boolean boolean15 = generator3.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter16 = generator3.create();
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator1 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator1.setUseCache(true);
        boolean boolean4 = generator1.getAttemptLoad();
        boolean boolean5 = generator1.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator1.getStrategy();
        generator0.setStrategy(generatorStrategy6);
        org.mockito.cglib.util.ParallelSorter.Generator generator8 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator8.setUseCache(true);
        boolean boolean11 = generator8.getAttemptLoad();
        boolean boolean12 = generator8.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator8.getStrategy();
        generator0.setStrategy(generatorStrategy13);
        generator0.setAttemptLoad(false);
        boolean boolean17 = generator0.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter18 = generator0.create();
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = generator0.getStrategy();
        org.mockito.cglib.util.ParallelSorter.Generator generator6 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator6.setUseCache(true);
        boolean boolean9 = generator6.getAttemptLoad();
        boolean boolean10 = generator6.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = generator6.getStrategy();
        generator0.setStrategy(generatorStrategy11);
        org.mockito.cglib.util.ParallelSorter.Generator generator13 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator13.setUseCache(true);
        java.lang.ClassLoader classLoader16 = generator13.getClassLoader();
        generator0.setClassLoader(classLoader16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter18 = generator0.create();
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = generator0.getStrategy();
        java.lang.ClassLoader classLoader2 = generator0.getClassLoader();
        generator0.setUseCache(false);
        boolean boolean5 = generator0.getUseCache();
        java.lang.ClassLoader classLoader6 = generator0.getClassLoader();
        generator0.setAttemptLoad(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter9 = generator0.create();
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = generator0.getStrategy();
        org.mockito.cglib.util.ParallelSorter.Generator generator6 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator6.setUseCache(true);
        boolean boolean9 = generator6.getAttemptLoad();
        boolean boolean10 = generator6.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = generator6.getStrategy();
        generator0.setStrategy(generatorStrategy11);
        java.lang.ClassLoader classLoader13 = generator0.getClassLoader();
        generator0.setUseCache(false);
        org.mockito.cglib.util.ParallelSorter.Generator generator16 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator16.setUseCache(true);
        boolean boolean19 = generator16.getAttemptLoad();
        boolean boolean20 = generator16.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy21 = generator16.getStrategy();
        org.mockito.cglib.util.ParallelSorter.Generator generator22 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator22.setUseCache(true);
        boolean boolean25 = generator22.getAttemptLoad();
        boolean boolean26 = generator22.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy27 = generator22.getStrategy();
        generator16.setStrategy(generatorStrategy27);
        java.lang.ClassLoader classLoader29 = generator16.getClassLoader();
        generator0.setClassLoader(classLoader29);
        boolean boolean31 = generator0.getAttemptLoad();
        generator0.setUseCache(true);
        generator0.setUseCache(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter36 = generator0.create();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        org.mockito.cglib.util.ParallelSorter.Generator generator3 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator4 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator4.setUseCache(true);
        boolean boolean7 = generator4.getAttemptLoad();
        boolean boolean8 = generator4.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = generator4.getStrategy();
        generator3.setStrategy(generatorStrategy9);
        org.mockito.cglib.util.ParallelSorter.Generator generator11 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator11.setUseCache(true);
        boolean boolean14 = generator11.getAttemptLoad();
        boolean boolean15 = generator11.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = generator11.getStrategy();
        generator3.setStrategy(generatorStrategy16);
        generator0.setStrategy(generatorStrategy16);
        boolean boolean19 = generator0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy20 = generator0.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter21 = generator0.create();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        java.util.Comparator<java.lang.String> strComparator0 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator1 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator2 = strComparator0.thenComparing(strComparator1);
        java.util.Comparator<java.lang.String> strComparator3 = strComparator0.reversed();
        java.util.Comparator<java.lang.String> strComparator4 = strComparator3.reversed();
        java.util.Comparator<java.lang.String> strComparator5 = strComparator3.reversed();
        org.mockito.cglib.util.ParallelSorter.Generator generator6 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator6.setUseCache(true);
        java.lang.ClassLoader classLoader9 = generator6.getClassLoader();
        org.mockito.cglib.util.ParallelSorter.Generator generator10 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator10.setUseCache(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator10.getStrategy();
        generator6.setStrategy(generatorStrategy13);
        boolean boolean15 = strComparator5.equals((java.lang.Object) generator6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter16 = generator6.create();
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = generator0.getStrategy();
        boolean boolean8 = generator0.getAttemptLoad();
        boolean boolean9 = generator0.getAttemptLoad();
        java.lang.ClassLoader classLoader10 = generator0.getClassLoader();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter11 = generator0.create();
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator1 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator1.setUseCache(true);
        boolean boolean4 = generator1.getAttemptLoad();
        boolean boolean5 = generator1.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator1.getStrategy();
        generator0.setStrategy(generatorStrategy6);
        generator0.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy10 = generator0.getNamingPolicy();
        boolean boolean11 = generator0.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter12 = generator0.create();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        generator0.setUseCache(false);
        boolean boolean7 = generator0.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter8 = generator0.create();
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        generator0.setUseCache(true);
        generator0.setAttemptLoad(true);
        generator0.setUseCache(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator0.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter14 = generator0.create();
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        java.util.Comparator<java.lang.String> strComparator0 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator1 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator2 = strComparator0.thenComparing(strComparator1);
        org.mockito.cglib.util.ParallelSorter.Generator generator3 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator3.setUseCache(true);
        boolean boolean6 = generator3.getAttemptLoad();
        boolean boolean7 = generator3.getUseCache();
        generator3.setAttemptLoad(true);
        generator3.setUseCache(true);
        boolean boolean12 = strComparator0.equals((java.lang.Object) generator3);
        generator3.setAttemptLoad(false);
        boolean boolean15 = generator3.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy16 = generator3.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter17 = generator3.create();
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy4 = generator0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy5 = generator0.getNamingPolicy();
        boolean boolean6 = generator0.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter7 = generator0.create();
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.util.ParallelSorter.Generator generator5 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator5.setUseCache(true);
        boolean boolean8 = generator5.getAttemptLoad();
        boolean boolean9 = generator5.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy10 = generator5.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = generator5.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = generator5.getStrategy();
        generator0.setStrategy(generatorStrategy12);
        org.mockito.cglib.util.ParallelSorter.Generator generator14 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator14.setUseCache(true);
        boolean boolean17 = generator14.getAttemptLoad();
        boolean boolean18 = generator14.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy19 = generator14.getStrategy();
        org.mockito.cglib.util.ParallelSorter.Generator generator20 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator20.setUseCache(true);
        boolean boolean23 = generator20.getAttemptLoad();
        boolean boolean24 = generator20.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy25 = generator20.getStrategy();
        generator14.setStrategy(generatorStrategy25);
        java.lang.ClassLoader classLoader27 = generator14.getClassLoader();
        generator14.setUseCache(false);
        org.mockito.cglib.util.ParallelSorter.Generator generator30 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator30.setUseCache(true);
        boolean boolean33 = generator30.getAttemptLoad();
        boolean boolean34 = generator30.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy35 = generator30.getStrategy();
        org.mockito.cglib.util.ParallelSorter.Generator generator36 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator36.setUseCache(true);
        boolean boolean39 = generator36.getAttemptLoad();
        boolean boolean40 = generator36.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy41 = generator36.getStrategy();
        generator30.setStrategy(generatorStrategy41);
        java.lang.ClassLoader classLoader43 = generator30.getClassLoader();
        generator14.setClassLoader(classLoader43);
        generator0.setClassLoader(classLoader43);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter46 = generator0.create();
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        java.lang.ClassLoader classLoader2 = generator0.getClassLoader();
        generator0.setUseCache(false);
        generator0.setUseCache(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter7 = generator0.create();
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.util.ParallelSorter.Generator generator5 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator5.setUseCache(true);
        boolean boolean8 = generator5.getAttemptLoad();
        boolean boolean9 = generator5.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy10 = generator5.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = generator5.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = generator5.getStrategy();
        generator0.setStrategy(generatorStrategy12);
        java.lang.ClassLoader classLoader14 = generator0.getClassLoader();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter15 = generator0.create();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        java.lang.ClassLoader classLoader3 = generator0.getClassLoader();
        org.mockito.cglib.util.ParallelSorter.Generator generator4 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator4.setUseCache(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = generator4.getStrategy();
        generator0.setStrategy(generatorStrategy7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter9 = generator0.create();
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        java.util.Comparator<java.lang.String> strComparator0 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator1 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator2 = strComparator0.thenComparing(strComparator1);
        java.util.Comparator<java.lang.String> strComparator3 = strComparator0.reversed();
        java.util.Comparator<java.lang.String> strComparator4 = strComparator3.reversed();
        java.util.Comparator<java.lang.String> strComparator5 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator6 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator7 = strComparator5.thenComparing(strComparator6);
        java.util.Comparator<java.lang.String> strComparator8 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator9 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator10 = strComparator8.thenComparing(strComparator9);
        java.util.Comparator<java.lang.String> strComparator11 = strComparator7.thenComparing(strComparator8);
        boolean boolean13 = strComparator8.equals((java.lang.Object) "");
        java.util.Comparator<java.lang.String> strComparator14 = strComparator8.reversed();
        java.util.Comparator<java.lang.String> strComparator15 = strComparator3.thenComparing(strComparator14);
        java.util.Comparator<java.lang.String> strComparator16 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator17 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator18 = strComparator16.thenComparing(strComparator17);
        java.util.Comparator<java.lang.String> strComparator19 = strComparator16.reversed();
        java.util.Comparator<java.lang.String> strComparator20 = strComparator19.reversed();
        java.util.Comparator<java.lang.String> strComparator21 = strComparator15.thenComparing(strComparator20);
        org.mockito.cglib.util.ParallelSorter.Generator generator22 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator22.setUseCache(true);
        org.mockito.cglib.util.ParallelSorter.Generator generator25 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator26 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator26.setUseCache(true);
        boolean boolean29 = generator26.getAttemptLoad();
        boolean boolean30 = generator26.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy31 = generator26.getStrategy();
        generator25.setStrategy(generatorStrategy31);
        org.mockito.cglib.util.ParallelSorter.Generator generator33 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator33.setUseCache(true);
        boolean boolean36 = generator33.getAttemptLoad();
        boolean boolean37 = generator33.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy38 = generator33.getStrategy();
        generator25.setStrategy(generatorStrategy38);
        generator22.setStrategy(generatorStrategy38);
        boolean boolean41 = generator22.getAttemptLoad();
        org.mockito.cglib.util.ParallelSorter.Generator generator42 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator43 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator43.setUseCache(true);
        boolean boolean46 = generator43.getAttemptLoad();
        boolean boolean47 = generator43.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy48 = generator43.getStrategy();
        generator42.setStrategy(generatorStrategy48);
        org.mockito.cglib.util.ParallelSorter.Generator generator50 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator50.setUseCache(true);
        boolean boolean53 = generator50.getAttemptLoad();
        boolean boolean54 = generator50.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy55 = generator50.getStrategy();
        generator42.setStrategy(generatorStrategy55);
        generator42.setAttemptLoad(false);
        boolean boolean59 = generator42.getUseCache();
        java.lang.ClassLoader classLoader60 = generator42.getClassLoader();
        generator22.setClassLoader(classLoader60);
        boolean boolean62 = strComparator15.equals((java.lang.Object) generator22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter63 = generator22.create();
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        java.util.Comparator<java.lang.String> strComparator0 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator1 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator2 = strComparator0.thenComparing(strComparator1);
        java.util.Comparator<java.lang.String> strComparator3 = strComparator0.reversed();
        java.util.Comparator<java.lang.String> strComparator4 = strComparator3.reversed();
        java.util.Comparator<java.lang.String> strComparator5 = strComparator3.reversed();
        org.mockito.cglib.util.ParallelSorter.Generator generator6 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator6.setUseCache(true);
        java.lang.ClassLoader classLoader9 = generator6.getClassLoader();
        org.mockito.cglib.util.ParallelSorter.Generator generator10 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator10.setUseCache(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator10.getStrategy();
        generator6.setStrategy(generatorStrategy13);
        boolean boolean15 = strComparator5.equals((java.lang.Object) generator6);
        java.lang.ClassLoader classLoader16 = generator6.getClassLoader();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter17 = generator6.create();
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        java.util.Comparator<java.lang.String> strComparator0 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator1 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator2 = strComparator0.thenComparing(strComparator1);
        org.mockito.cglib.util.ParallelSorter.Generator generator3 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator3.setUseCache(true);
        boolean boolean6 = generator3.getAttemptLoad();
        boolean boolean7 = generator3.getUseCache();
        generator3.setAttemptLoad(true);
        generator3.setUseCache(true);
        boolean boolean12 = strComparator0.equals((java.lang.Object) generator3);
        org.mockito.cglib.util.ParallelSorter.Generator generator13 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator13.setUseCache(true);
        java.lang.ClassLoader classLoader16 = generator13.getClassLoader();
        org.mockito.cglib.util.ParallelSorter.Generator generator17 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator17.setUseCache(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy20 = generator17.getStrategy();
        generator13.setStrategy(generatorStrategy20);
        generator3.setStrategy(generatorStrategy20);
        java.lang.ClassLoader classLoader23 = generator3.getClassLoader();
        generator3.setUseCache(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy26 = generator3.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter27 = generator3.create();
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        generator0.setUseCache(true);
        generator0.setAttemptLoad(true);
        generator0.setUseCache(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator0.getStrategy();
        java.lang.ClassLoader classLoader14 = generator0.getClassLoader();
        org.mockito.cglib.util.ParallelSorter.Generator generator15 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = generator15.getStrategy();
        java.lang.ClassLoader classLoader17 = generator15.getClassLoader();
        generator15.setUseCache(false);
        org.mockito.cglib.util.ParallelSorter.Generator generator20 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator20.setUseCache(true);
        boolean boolean23 = generator20.getAttemptLoad();
        boolean boolean24 = generator20.getUseCache();
        org.mockito.cglib.util.ParallelSorter.Generator generator25 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator25.setUseCache(true);
        boolean boolean28 = generator25.getAttemptLoad();
        boolean boolean29 = generator25.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy30 = generator25.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy31 = generator25.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy32 = generator25.getStrategy();
        generator20.setStrategy(generatorStrategy32);
        org.mockito.cglib.util.ParallelSorter.Generator generator34 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator34.setUseCache(true);
        boolean boolean37 = generator34.getAttemptLoad();
        boolean boolean38 = generator34.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy39 = generator34.getStrategy();
        org.mockito.cglib.util.ParallelSorter.Generator generator40 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator40.setUseCache(true);
        boolean boolean43 = generator40.getAttemptLoad();
        boolean boolean44 = generator40.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy45 = generator40.getStrategy();
        generator34.setStrategy(generatorStrategy45);
        java.lang.ClassLoader classLoader47 = generator34.getClassLoader();
        generator34.setUseCache(false);
        org.mockito.cglib.util.ParallelSorter.Generator generator50 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator50.setUseCache(true);
        boolean boolean53 = generator50.getAttemptLoad();
        boolean boolean54 = generator50.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy55 = generator50.getStrategy();
        org.mockito.cglib.util.ParallelSorter.Generator generator56 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator56.setUseCache(true);
        boolean boolean59 = generator56.getAttemptLoad();
        boolean boolean60 = generator56.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy61 = generator56.getStrategy();
        generator50.setStrategy(generatorStrategy61);
        java.lang.ClassLoader classLoader63 = generator50.getClassLoader();
        generator34.setClassLoader(classLoader63);
        generator20.setClassLoader(classLoader63);
        generator15.setClassLoader(classLoader63);
        generator0.setClassLoader(classLoader63);
        generator0.setAttemptLoad(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter70 = generator0.create();
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = generator0.getStrategy();
        org.mockito.cglib.util.ParallelSorter.Generator generator6 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator6.setUseCache(true);
        boolean boolean9 = generator6.getAttemptLoad();
        boolean boolean10 = generator6.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = generator6.getStrategy();
        generator0.setStrategy(generatorStrategy11);
        boolean boolean13 = generator0.getAttemptLoad();
        generator0.setUseCache(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter16 = generator0.create();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        generator0.setUseCache(true);
        generator0.setAttemptLoad(true);
        generator0.setUseCache(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator0.getStrategy();
        java.lang.ClassLoader classLoader14 = generator0.getClassLoader();
        org.mockito.cglib.util.ParallelSorter.Generator generator15 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = generator15.getStrategy();
        java.lang.ClassLoader classLoader17 = generator15.getClassLoader();
        generator15.setUseCache(false);
        org.mockito.cglib.util.ParallelSorter.Generator generator20 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator20.setUseCache(true);
        boolean boolean23 = generator20.getAttemptLoad();
        boolean boolean24 = generator20.getUseCache();
        org.mockito.cglib.util.ParallelSorter.Generator generator25 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator25.setUseCache(true);
        boolean boolean28 = generator25.getAttemptLoad();
        boolean boolean29 = generator25.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy30 = generator25.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy31 = generator25.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy32 = generator25.getStrategy();
        generator20.setStrategy(generatorStrategy32);
        org.mockito.cglib.util.ParallelSorter.Generator generator34 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator34.setUseCache(true);
        boolean boolean37 = generator34.getAttemptLoad();
        boolean boolean38 = generator34.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy39 = generator34.getStrategy();
        org.mockito.cglib.util.ParallelSorter.Generator generator40 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator40.setUseCache(true);
        boolean boolean43 = generator40.getAttemptLoad();
        boolean boolean44 = generator40.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy45 = generator40.getStrategy();
        generator34.setStrategy(generatorStrategy45);
        java.lang.ClassLoader classLoader47 = generator34.getClassLoader();
        generator34.setUseCache(false);
        org.mockito.cglib.util.ParallelSorter.Generator generator50 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator50.setUseCache(true);
        boolean boolean53 = generator50.getAttemptLoad();
        boolean boolean54 = generator50.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy55 = generator50.getStrategy();
        org.mockito.cglib.util.ParallelSorter.Generator generator56 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator56.setUseCache(true);
        boolean boolean59 = generator56.getAttemptLoad();
        boolean boolean60 = generator56.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy61 = generator56.getStrategy();
        generator50.setStrategy(generatorStrategy61);
        java.lang.ClassLoader classLoader63 = generator50.getClassLoader();
        generator34.setClassLoader(classLoader63);
        generator20.setClassLoader(classLoader63);
        generator15.setClassLoader(classLoader63);
        generator0.setClassLoader(classLoader63);
        org.mockito.cglib.core.NamingPolicy namingPolicy68 = generator0.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter69 = generator0.create();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = generator0.getStrategy();
        java.lang.ClassLoader classLoader2 = generator0.getClassLoader();
        generator0.setUseCache(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = generator0.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter6 = generator0.create();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = generator0.getStrategy();
        java.lang.ClassLoader classLoader3 = generator0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy4 = generator0.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter5 = generator0.create();
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = generator0.getStrategy();
        org.mockito.cglib.util.ParallelSorter.Generator generator6 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator6.setUseCache(true);
        boolean boolean9 = generator6.getAttemptLoad();
        boolean boolean10 = generator6.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = generator6.getStrategy();
        generator0.setStrategy(generatorStrategy11);
        java.lang.ClassLoader classLoader13 = generator0.getClassLoader();
        generator0.setUseCache(false);
        org.mockito.cglib.util.ParallelSorter.Generator generator16 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator16.setUseCache(true);
        boolean boolean19 = generator16.getAttemptLoad();
        boolean boolean20 = generator16.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy21 = generator16.getStrategy();
        org.mockito.cglib.util.ParallelSorter.Generator generator22 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator22.setUseCache(true);
        boolean boolean25 = generator22.getAttemptLoad();
        boolean boolean26 = generator22.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy27 = generator22.getStrategy();
        generator16.setStrategy(generatorStrategy27);
        java.lang.ClassLoader classLoader29 = generator16.getClassLoader();
        generator0.setClassLoader(classLoader29);
        boolean boolean31 = generator0.getAttemptLoad();
        boolean boolean32 = generator0.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy33 = generator0.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter34 = generator0.create();
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator1 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator1.setUseCache(true);
        boolean boolean4 = generator1.getAttemptLoad();
        boolean boolean5 = generator1.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator1.getStrategy();
        generator0.setStrategy(generatorStrategy6);
        org.mockito.cglib.util.ParallelSorter.Generator generator8 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator8.setUseCache(true);
        boolean boolean11 = generator8.getAttemptLoad();
        boolean boolean12 = generator8.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator8.getStrategy();
        generator0.setStrategy(generatorStrategy13);
        generator0.setAttemptLoad(false);
        boolean boolean17 = generator0.getUseCache();
        java.lang.ClassLoader classLoader18 = generator0.getClassLoader();
        boolean boolean19 = generator0.getUseCache();
        boolean boolean20 = generator0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy21 = generator0.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter22 = generator0.create();
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        java.lang.ClassLoader classLoader3 = generator0.getClassLoader();
        org.mockito.cglib.util.ParallelSorter.Generator generator4 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator4.setUseCache(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = generator4.getStrategy();
        generator0.setStrategy(generatorStrategy7);
        org.mockito.cglib.core.NamingPolicy namingPolicy9 = generator0.getNamingPolicy();
        generator0.setUseCache(false);
        generator0.setUseCache(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter14 = generator0.create();
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator1 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator1.setUseCache(true);
        boolean boolean4 = generator1.getAttemptLoad();
        boolean boolean5 = generator1.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator1.getStrategy();
        generator0.setStrategy(generatorStrategy6);
        org.mockito.cglib.util.ParallelSorter.Generator generator8 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator8.setUseCache(true);
        boolean boolean11 = generator8.getAttemptLoad();
        boolean boolean12 = generator8.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator8.getStrategy();
        generator0.setStrategy(generatorStrategy13);
        generator0.setAttemptLoad(true);
        generator0.setUseCache(false);
        generator0.setUseCache(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter21 = generator0.create();
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        java.lang.ClassLoader classLoader2 = generator0.getClassLoader();
        java.lang.ClassLoader classLoader3 = generator0.getClassLoader();
        org.mockito.cglib.core.NamingPolicy namingPolicy4 = generator0.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter5 = generator0.create();
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator1 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator1.setUseCache(true);
        boolean boolean4 = generator1.getAttemptLoad();
        boolean boolean5 = generator1.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator1.getStrategy();
        generator0.setStrategy(generatorStrategy6);
        org.mockito.cglib.util.ParallelSorter.Generator generator8 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator8.setUseCache(true);
        boolean boolean11 = generator8.getAttemptLoad();
        boolean boolean12 = generator8.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator8.getStrategy();
        generator0.setStrategy(generatorStrategy13);
        generator0.setAttemptLoad(false);
        boolean boolean17 = generator0.getUseCache();
        java.lang.ClassLoader classLoader18 = generator0.getClassLoader();
        boolean boolean19 = generator0.getUseCache();
        boolean boolean20 = generator0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy21 = generator0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy22 = generator0.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter23 = generator0.create();
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        java.util.Comparator<java.lang.String> strComparator0 = java.util.Comparator.reverseOrder();
        org.mockito.cglib.util.ParallelSorter.Generator generator1 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator1.setUseCache(true);
        boolean boolean4 = generator1.getAttemptLoad();
        boolean boolean5 = generator1.getUseCache();
        org.mockito.cglib.util.ParallelSorter.Generator generator6 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator6.setUseCache(true);
        boolean boolean9 = generator6.getAttemptLoad();
        boolean boolean10 = generator6.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = generator6.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = generator6.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator6.getStrategy();
        generator1.setStrategy(generatorStrategy13);
        boolean boolean15 = strComparator0.equals((java.lang.Object) generator1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter16 = generator1.create();
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = generator0.getStrategy();
        boolean boolean8 = generator0.getAttemptLoad();
        boolean boolean9 = generator0.getAttemptLoad();
        generator0.setUseCache(false);
        boolean boolean12 = generator0.getUseCache();
        boolean boolean13 = generator0.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter14 = generator0.create();
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = generator0.getStrategy();
        java.lang.ClassLoader classLoader2 = generator0.getClassLoader();
        generator0.setUseCache(false);
        org.mockito.cglib.util.ParallelSorter.Generator generator5 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator5.setUseCache(true);
        boolean boolean8 = generator5.getAttemptLoad();
        boolean boolean9 = generator5.getUseCache();
        org.mockito.cglib.util.ParallelSorter.Generator generator10 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator10.setUseCache(true);
        boolean boolean13 = generator10.getAttemptLoad();
        boolean boolean14 = generator10.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy15 = generator10.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = generator10.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy17 = generator10.getStrategy();
        generator5.setStrategy(generatorStrategy17);
        org.mockito.cglib.util.ParallelSorter.Generator generator19 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator19.setUseCache(true);
        boolean boolean22 = generator19.getAttemptLoad();
        boolean boolean23 = generator19.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy24 = generator19.getStrategy();
        org.mockito.cglib.util.ParallelSorter.Generator generator25 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator25.setUseCache(true);
        boolean boolean28 = generator25.getAttemptLoad();
        boolean boolean29 = generator25.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy30 = generator25.getStrategy();
        generator19.setStrategy(generatorStrategy30);
        java.lang.ClassLoader classLoader32 = generator19.getClassLoader();
        generator19.setUseCache(false);
        org.mockito.cglib.util.ParallelSorter.Generator generator35 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator35.setUseCache(true);
        boolean boolean38 = generator35.getAttemptLoad();
        boolean boolean39 = generator35.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy40 = generator35.getStrategy();
        org.mockito.cglib.util.ParallelSorter.Generator generator41 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator41.setUseCache(true);
        boolean boolean44 = generator41.getAttemptLoad();
        boolean boolean45 = generator41.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy46 = generator41.getStrategy();
        generator35.setStrategy(generatorStrategy46);
        java.lang.ClassLoader classLoader48 = generator35.getClassLoader();
        generator19.setClassLoader(classLoader48);
        generator5.setClassLoader(classLoader48);
        generator0.setClassLoader(classLoader48);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter52 = generator0.create();
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        java.lang.ClassLoader classLoader2 = generator0.getClassLoader();
        generator0.setUseCache(false);
        generator0.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy7 = generator0.getNamingPolicy();
        org.mockito.cglib.util.ParallelSorter.Generator generator8 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = generator8.getStrategy();
        java.lang.ClassLoader classLoader10 = generator8.getClassLoader();
        generator8.setUseCache(false);
        boolean boolean13 = generator8.getUseCache();
        java.lang.ClassLoader classLoader14 = generator8.getClassLoader();
        generator0.setClassLoader(classLoader14);
        boolean boolean16 = generator0.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter17 = generator0.create();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy5 = generator0.getNamingPolicy();
        org.mockito.cglib.util.ParallelSorter.Generator generator6 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator6.setUseCache(true);
        boolean boolean9 = generator6.getAttemptLoad();
        boolean boolean10 = generator6.getUseCache();
        generator6.setAttemptLoad(true);
        org.mockito.cglib.util.ParallelSorter.Generator generator13 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy14 = generator13.getStrategy();
        generator6.setStrategy(generatorStrategy14);
        org.mockito.cglib.util.ParallelSorter.Generator generator16 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator16.setUseCache(true);
        java.lang.ClassLoader classLoader19 = generator16.getClassLoader();
        generator6.setClassLoader(classLoader19);
        generator0.setClassLoader(classLoader19);
        java.lang.ClassLoader classLoader22 = generator0.getClassLoader();
        java.lang.ClassLoader classLoader23 = generator0.getClassLoader();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter24 = generator0.create();
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        org.mockito.cglib.util.ParallelSorter.Generator generator3 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator4 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator4.setUseCache(true);
        boolean boolean7 = generator4.getAttemptLoad();
        boolean boolean8 = generator4.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = generator4.getStrategy();
        generator3.setStrategy(generatorStrategy9);
        org.mockito.cglib.util.ParallelSorter.Generator generator11 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator11.setUseCache(true);
        boolean boolean14 = generator11.getAttemptLoad();
        boolean boolean15 = generator11.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = generator11.getStrategy();
        generator3.setStrategy(generatorStrategy16);
        generator0.setStrategy(generatorStrategy16);
        boolean boolean19 = generator0.getAttemptLoad();
        org.mockito.cglib.util.ParallelSorter.Generator generator20 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator21 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator21.setUseCache(true);
        boolean boolean24 = generator21.getAttemptLoad();
        boolean boolean25 = generator21.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy26 = generator21.getStrategy();
        generator20.setStrategy(generatorStrategy26);
        org.mockito.cglib.util.ParallelSorter.Generator generator28 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator28.setUseCache(true);
        boolean boolean31 = generator28.getAttemptLoad();
        boolean boolean32 = generator28.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy33 = generator28.getStrategy();
        generator20.setStrategy(generatorStrategy33);
        generator20.setAttemptLoad(false);
        boolean boolean37 = generator20.getUseCache();
        java.lang.ClassLoader classLoader38 = generator20.getClassLoader();
        generator0.setClassLoader(classLoader38);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy40 = generator0.getStrategy();
        generator0.setAttemptLoad(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter43 = generator0.create();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.util.ParallelSorter.Generator generator5 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator5.setUseCache(true);
        boolean boolean8 = generator5.getAttemptLoad();
        boolean boolean9 = generator5.getUseCache();
        generator5.setAttemptLoad(true);
        generator5.setUseCache(true);
        generator5.setAttemptLoad(true);
        generator5.setUseCache(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy18 = generator5.getStrategy();
        java.lang.ClassLoader classLoader19 = generator5.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy20 = generator5.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy21 = generator5.getNamingPolicy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy22 = generator5.getStrategy();
        generator0.setStrategy(generatorStrategy22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter24 = generator0.create();
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = generator0.getStrategy();
        org.mockito.cglib.util.ParallelSorter.Generator generator6 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator6.setUseCache(true);
        boolean boolean9 = generator6.getAttemptLoad();
        boolean boolean10 = generator6.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = generator6.getStrategy();
        generator0.setStrategy(generatorStrategy11);
        java.lang.ClassLoader classLoader13 = generator0.getClassLoader();
        generator0.setUseCache(false);
        org.mockito.cglib.util.ParallelSorter.Generator generator16 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator16.setUseCache(true);
        boolean boolean19 = generator16.getAttemptLoad();
        boolean boolean20 = generator16.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy21 = generator16.getStrategy();
        org.mockito.cglib.util.ParallelSorter.Generator generator22 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator22.setUseCache(true);
        boolean boolean25 = generator22.getAttemptLoad();
        boolean boolean26 = generator22.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy27 = generator22.getStrategy();
        generator16.setStrategy(generatorStrategy27);
        java.lang.ClassLoader classLoader29 = generator16.getClassLoader();
        generator0.setClassLoader(classLoader29);
        boolean boolean31 = generator0.getAttemptLoad();
        generator0.setUseCache(true);
        boolean boolean34 = generator0.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter35 = generator0.create();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator0.getStrategy();
        generator0.setAttemptLoad(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = generator0.getStrategy();
        java.lang.ClassLoader classLoader10 = generator0.getClassLoader();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter11 = generator0.create();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        org.mockito.cglib.util.ParallelSorter.Generator generator3 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator4 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator4.setUseCache(true);
        boolean boolean7 = generator4.getAttemptLoad();
        boolean boolean8 = generator4.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = generator4.getStrategy();
        generator3.setStrategy(generatorStrategy9);
        org.mockito.cglib.util.ParallelSorter.Generator generator11 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator11.setUseCache(true);
        boolean boolean14 = generator11.getAttemptLoad();
        boolean boolean15 = generator11.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = generator11.getStrategy();
        generator3.setStrategy(generatorStrategy16);
        generator0.setStrategy(generatorStrategy16);
        boolean boolean19 = generator0.getAttemptLoad();
        org.mockito.cglib.util.ParallelSorter.Generator generator20 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator21 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator21.setUseCache(true);
        boolean boolean24 = generator21.getAttemptLoad();
        boolean boolean25 = generator21.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy26 = generator21.getStrategy();
        generator20.setStrategy(generatorStrategy26);
        org.mockito.cglib.util.ParallelSorter.Generator generator28 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator28.setUseCache(true);
        boolean boolean31 = generator28.getAttemptLoad();
        boolean boolean32 = generator28.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy33 = generator28.getStrategy();
        generator20.setStrategy(generatorStrategy33);
        generator20.setAttemptLoad(false);
        boolean boolean37 = generator20.getUseCache();
        java.lang.ClassLoader classLoader38 = generator20.getClassLoader();
        generator0.setClassLoader(classLoader38);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy40 = generator0.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter41 = generator0.create();
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        java.util.Comparator<java.lang.String> strComparator0 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator1 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator2 = strComparator0.thenComparing(strComparator1);
        java.util.Comparator<java.lang.String> strComparator3 = strComparator0.reversed();
        java.util.Comparator<java.lang.String> strComparator4 = strComparator3.reversed();
        java.util.Comparator<java.lang.String> strComparator5 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator6 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator7 = strComparator5.thenComparing(strComparator6);
        java.util.Comparator<java.lang.String> strComparator8 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator9 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator10 = strComparator8.thenComparing(strComparator9);
        java.util.Comparator<java.lang.String> strComparator11 = strComparator7.thenComparing(strComparator8);
        boolean boolean13 = strComparator8.equals((java.lang.Object) "");
        java.util.Comparator<java.lang.String> strComparator14 = strComparator8.reversed();
        java.util.Comparator<java.lang.String> strComparator15 = strComparator3.thenComparing(strComparator14);
        java.util.Comparator<java.lang.String> strComparator16 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator17 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator18 = strComparator16.thenComparing(strComparator17);
        java.util.Comparator<java.lang.String> strComparator19 = strComparator16.reversed();
        java.util.Comparator<java.lang.String> strComparator20 = strComparator19.reversed();
        java.util.Comparator<java.lang.String> strComparator21 = strComparator15.thenComparing(strComparator20);
        org.mockito.cglib.util.ParallelSorter.Generator generator22 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator22.setUseCache(true);
        org.mockito.cglib.util.ParallelSorter.Generator generator25 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator26 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator26.setUseCache(true);
        boolean boolean29 = generator26.getAttemptLoad();
        boolean boolean30 = generator26.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy31 = generator26.getStrategy();
        generator25.setStrategy(generatorStrategy31);
        org.mockito.cglib.util.ParallelSorter.Generator generator33 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator33.setUseCache(true);
        boolean boolean36 = generator33.getAttemptLoad();
        boolean boolean37 = generator33.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy38 = generator33.getStrategy();
        generator25.setStrategy(generatorStrategy38);
        generator22.setStrategy(generatorStrategy38);
        boolean boolean41 = generator22.getAttemptLoad();
        org.mockito.cglib.util.ParallelSorter.Generator generator42 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator43 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator43.setUseCache(true);
        boolean boolean46 = generator43.getAttemptLoad();
        boolean boolean47 = generator43.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy48 = generator43.getStrategy();
        generator42.setStrategy(generatorStrategy48);
        org.mockito.cglib.util.ParallelSorter.Generator generator50 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator50.setUseCache(true);
        boolean boolean53 = generator50.getAttemptLoad();
        boolean boolean54 = generator50.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy55 = generator50.getStrategy();
        generator42.setStrategy(generatorStrategy55);
        generator42.setAttemptLoad(false);
        boolean boolean59 = generator42.getUseCache();
        java.lang.ClassLoader classLoader60 = generator42.getClassLoader();
        generator22.setClassLoader(classLoader60);
        boolean boolean62 = strComparator15.equals((java.lang.Object) generator22);
        org.mockito.cglib.util.ParallelSorter.Generator generator63 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator63.setUseCache(true);
        boolean boolean66 = generator63.getAttemptLoad();
        boolean boolean67 = generator63.getUseCache();
        generator63.setAttemptLoad(true);
        generator63.setUseCache(true);
        generator63.setUseCache(false);
        generator63.setUseCache(false);
        boolean boolean76 = generator63.getUseCache();
        org.mockito.cglib.util.ParallelSorter.Generator generator77 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator77.setUseCache(true);
        boolean boolean80 = generator77.getAttemptLoad();
        boolean boolean81 = generator77.getUseCache();
        generator77.setAttemptLoad(true);
        generator77.setUseCache(true);
        generator77.setUseCache(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy88 = generator77.getStrategy();
        generator63.setStrategy(generatorStrategy88);
        generator22.setStrategy(generatorStrategy88);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter91 = generator22.create();
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        generator0.setUseCache(true);
        generator0.setAttemptLoad(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter6 = generator0.create();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        java.util.Comparator<java.lang.String> strComparator0 = java.util.Comparator.reverseOrder();
        org.mockito.cglib.util.ParallelSorter.Generator generator1 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator1.setUseCache(true);
        boolean boolean4 = generator1.getAttemptLoad();
        boolean boolean5 = generator1.getUseCache();
        org.mockito.cglib.util.ParallelSorter.Generator generator6 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator6.setUseCache(true);
        boolean boolean9 = generator6.getAttemptLoad();
        boolean boolean10 = generator6.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = generator6.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = generator6.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator6.getStrategy();
        generator1.setStrategy(generatorStrategy13);
        boolean boolean15 = strComparator0.equals((java.lang.Object) generator1);
        org.mockito.cglib.core.NamingPolicy namingPolicy16 = generator1.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter17 = generator1.create();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        java.util.Comparator<java.lang.String> strComparator0 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator1 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator2 = strComparator0.thenComparing(strComparator1);
        org.mockito.cglib.util.ParallelSorter.Generator generator3 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator3.setUseCache(true);
        boolean boolean6 = generator3.getAttemptLoad();
        boolean boolean7 = generator3.getUseCache();
        generator3.setAttemptLoad(true);
        generator3.setUseCache(true);
        boolean boolean12 = strComparator0.equals((java.lang.Object) generator3);
        generator3.setUseCache(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter15 = generator3.create();
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy4 = generator0.getNamingPolicy();
        boolean boolean5 = generator0.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter6 = generator0.create();
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = generator0.getStrategy();
        java.lang.ClassLoader classLoader2 = generator0.getClassLoader();
        generator0.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy5 = generator0.getNamingPolicy();
        org.mockito.cglib.util.ParallelSorter.Generator generator6 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator7 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator7.setUseCache(true);
        boolean boolean10 = generator7.getAttemptLoad();
        boolean boolean11 = generator7.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = generator7.getStrategy();
        generator6.setStrategy(generatorStrategy12);
        generator0.setStrategy(generatorStrategy12);
        generator0.setAttemptLoad(true);
        boolean boolean17 = generator0.getAttemptLoad();
        boolean boolean18 = generator0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy19 = generator0.getStrategy();
        generator0.setAttemptLoad(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter22 = generator0.create();
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = generator0.getStrategy();
        generator0.setAttemptLoad(false);
        generator0.setUseCache(false);
        generator0.setUseCache(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter8 = generator0.create();
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = generator0.getStrategy();
        java.lang.ClassLoader classLoader2 = generator0.getClassLoader();
        generator0.setUseCache(false);
        boolean boolean5 = generator0.getAttemptLoad();
        boolean boolean6 = generator0.getAttemptLoad();
        boolean boolean7 = generator0.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter8 = generator0.create();
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        generator0.setUseCache(true);
        generator0.setUseCache(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter11 = generator0.create();
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        org.mockito.cglib.util.ParallelSorter.Generator generator3 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator4 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator4.setUseCache(true);
        boolean boolean7 = generator4.getAttemptLoad();
        boolean boolean8 = generator4.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = generator4.getStrategy();
        generator3.setStrategy(generatorStrategy9);
        org.mockito.cglib.util.ParallelSorter.Generator generator11 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator11.setUseCache(true);
        boolean boolean14 = generator11.getAttemptLoad();
        boolean boolean15 = generator11.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = generator11.getStrategy();
        generator3.setStrategy(generatorStrategy16);
        generator0.setStrategy(generatorStrategy16);
        boolean boolean19 = generator0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy20 = generator0.getStrategy();
        generator0.setUseCache(false);
        java.lang.ClassLoader classLoader23 = generator0.getClassLoader();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter24 = generator0.create();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = generator0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = generator0.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter4 = generator0.create();
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy5 = generator0.getNamingPolicy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator0.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter7 = generator0.create();
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator1 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator1.setUseCache(true);
        boolean boolean4 = generator1.getAttemptLoad();
        boolean boolean5 = generator1.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator1.getStrategy();
        generator0.setStrategy(generatorStrategy6);
        org.mockito.cglib.util.ParallelSorter.Generator generator8 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator8.setUseCache(true);
        boolean boolean11 = generator8.getAttemptLoad();
        boolean boolean12 = generator8.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator8.getStrategy();
        generator0.setStrategy(generatorStrategy13);
        generator0.setAttemptLoad(false);
        boolean boolean17 = generator0.getUseCache();
        java.lang.ClassLoader classLoader18 = generator0.getClassLoader();
        generator0.setAttemptLoad(true);
        org.mockito.cglib.util.ParallelSorter.Generator generator21 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator22 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator22.setUseCache(true);
        boolean boolean25 = generator22.getAttemptLoad();
        boolean boolean26 = generator22.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy27 = generator22.getStrategy();
        generator21.setStrategy(generatorStrategy27);
        org.mockito.cglib.util.ParallelSorter.Generator generator29 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator29.setUseCache(true);
        boolean boolean32 = generator29.getAttemptLoad();
        boolean boolean33 = generator29.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy34 = generator29.getStrategy();
        generator21.setStrategy(generatorStrategy34);
        generator21.setAttemptLoad(false);
        boolean boolean38 = generator21.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy39 = generator21.getStrategy();
        generator0.setStrategy(generatorStrategy39);
        boolean boolean41 = generator0.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter42 = generator0.create();
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        generator0.setUseCache(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter9 = generator0.create();
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        java.lang.ClassLoader classLoader2 = generator0.getClassLoader();
        java.lang.ClassLoader classLoader3 = generator0.getClassLoader();
        java.lang.ClassLoader classLoader4 = generator0.getClassLoader();
        boolean boolean5 = generator0.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter6 = generator0.create();
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        org.mockito.cglib.util.ParallelSorter.Generator generator3 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator4 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator4.setUseCache(true);
        boolean boolean7 = generator4.getAttemptLoad();
        boolean boolean8 = generator4.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = generator4.getStrategy();
        generator3.setStrategy(generatorStrategy9);
        org.mockito.cglib.util.ParallelSorter.Generator generator11 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator11.setUseCache(true);
        boolean boolean14 = generator11.getAttemptLoad();
        boolean boolean15 = generator11.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = generator11.getStrategy();
        generator3.setStrategy(generatorStrategy16);
        generator0.setStrategy(generatorStrategy16);
        boolean boolean19 = generator0.getAttemptLoad();
        org.mockito.cglib.util.ParallelSorter.Generator generator20 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator21 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator21.setUseCache(true);
        boolean boolean24 = generator21.getAttemptLoad();
        boolean boolean25 = generator21.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy26 = generator21.getStrategy();
        generator20.setStrategy(generatorStrategy26);
        org.mockito.cglib.util.ParallelSorter.Generator generator28 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator28.setUseCache(true);
        boolean boolean31 = generator28.getAttemptLoad();
        boolean boolean32 = generator28.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy33 = generator28.getStrategy();
        generator20.setStrategy(generatorStrategy33);
        generator20.setAttemptLoad(false);
        boolean boolean37 = generator20.getUseCache();
        java.lang.ClassLoader classLoader38 = generator20.getClassLoader();
        generator0.setClassLoader(classLoader38);
        org.mockito.cglib.util.ParallelSorter.Generator generator40 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy41 = generator40.getStrategy();
        java.lang.ClassLoader classLoader42 = generator40.getClassLoader();
        generator0.setClassLoader(classLoader42);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter44 = generator0.create();
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = generator0.getStrategy();
        generator0.setAttemptLoad(false);
        generator0.setUseCache(false);
        generator0.setUseCache(false);
        generator0.setAttemptLoad(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter10 = generator0.create();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        boolean boolean7 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        java.lang.ClassLoader classLoader10 = generator0.getClassLoader();
        boolean boolean11 = generator0.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter12 = generator0.create();
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = generator0.getStrategy();
        java.lang.ClassLoader classLoader2 = generator0.getClassLoader();
        generator0.setUseCache(false);
        boolean boolean5 = generator0.getAttemptLoad();
        generator0.setUseCache(true);
        java.lang.ClassLoader classLoader8 = generator0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = generator0.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter10 = generator0.create();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        generator0.setUseCache(true);
        generator0.setAttemptLoad(true);
        boolean boolean11 = generator0.getAttemptLoad();
        java.lang.ClassLoader classLoader12 = generator0.getClassLoader();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter13 = generator0.create();
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = generator0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = generator0.getNamingPolicy();
        org.mockito.cglib.util.ParallelSorter.Generator generator4 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator4.setUseCache(true);
        boolean boolean7 = generator4.getAttemptLoad();
        boolean boolean8 = generator4.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = generator4.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy10 = generator4.getNamingPolicy();
        org.mockito.cglib.util.ParallelSorter.Generator generator11 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator11.setUseCache(true);
        boolean boolean14 = generator11.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy15 = generator11.getStrategy();
        generator4.setStrategy(generatorStrategy15);
        generator0.setStrategy(generatorStrategy15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter18 = generator0.create();
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        generator0.setUseCache(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy4 = generator0.getNamingPolicy();
        boolean boolean5 = generator0.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter6 = generator0.create();
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = generator0.getStrategy();
        org.mockito.cglib.util.ParallelSorter.Generator generator6 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator6.setUseCache(true);
        boolean boolean9 = generator6.getAttemptLoad();
        boolean boolean10 = generator6.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = generator6.getStrategy();
        generator0.setStrategy(generatorStrategy11);
        java.lang.ClassLoader classLoader13 = generator0.getClassLoader();
        generator0.setUseCache(false);
        org.mockito.cglib.util.ParallelSorter.Generator generator16 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator16.setUseCache(true);
        boolean boolean19 = generator16.getAttemptLoad();
        boolean boolean20 = generator16.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy21 = generator16.getStrategy();
        org.mockito.cglib.util.ParallelSorter.Generator generator22 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator22.setUseCache(true);
        boolean boolean25 = generator22.getAttemptLoad();
        boolean boolean26 = generator22.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy27 = generator22.getStrategy();
        generator16.setStrategy(generatorStrategy27);
        java.lang.ClassLoader classLoader29 = generator16.getClassLoader();
        generator0.setClassLoader(classLoader29);
        generator0.setAttemptLoad(false);
        org.mockito.cglib.util.ParallelSorter.Generator generator33 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator33.setUseCache(true);
        boolean boolean36 = generator33.getAttemptLoad();
        boolean boolean37 = generator33.getUseCache();
        org.mockito.cglib.util.ParallelSorter.Generator generator38 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator38.setUseCache(true);
        boolean boolean41 = generator38.getAttemptLoad();
        boolean boolean42 = generator38.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy43 = generator38.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy44 = generator38.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy45 = generator38.getStrategy();
        generator33.setStrategy(generatorStrategy45);
        org.mockito.cglib.util.ParallelSorter.Generator generator47 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator47.setUseCache(true);
        boolean boolean50 = generator47.getAttemptLoad();
        boolean boolean51 = generator47.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy52 = generator47.getStrategy();
        org.mockito.cglib.util.ParallelSorter.Generator generator53 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator53.setUseCache(true);
        boolean boolean56 = generator53.getAttemptLoad();
        boolean boolean57 = generator53.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy58 = generator53.getStrategy();
        generator47.setStrategy(generatorStrategy58);
        java.lang.ClassLoader classLoader60 = generator47.getClassLoader();
        generator47.setUseCache(false);
        org.mockito.cglib.util.ParallelSorter.Generator generator63 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator63.setUseCache(true);
        boolean boolean66 = generator63.getAttemptLoad();
        boolean boolean67 = generator63.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy68 = generator63.getStrategy();
        org.mockito.cglib.util.ParallelSorter.Generator generator69 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator69.setUseCache(true);
        boolean boolean72 = generator69.getAttemptLoad();
        boolean boolean73 = generator69.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy74 = generator69.getStrategy();
        generator63.setStrategy(generatorStrategy74);
        java.lang.ClassLoader classLoader76 = generator63.getClassLoader();
        generator47.setClassLoader(classLoader76);
        generator33.setClassLoader(classLoader76);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy79 = generator33.getStrategy();
        generator0.setStrategy(generatorStrategy79);
        java.lang.ClassLoader classLoader81 = generator0.getClassLoader();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter82 = generator0.create();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator0.getStrategy();
        generator0.setAttemptLoad(true);
        java.lang.ClassLoader classLoader9 = generator0.getClassLoader();
        boolean boolean10 = generator0.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter11 = generator0.create();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        org.mockito.cglib.util.ParallelSorter.Generator generator3 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator4 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator4.setUseCache(true);
        boolean boolean7 = generator4.getAttemptLoad();
        boolean boolean8 = generator4.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = generator4.getStrategy();
        generator3.setStrategy(generatorStrategy9);
        org.mockito.cglib.util.ParallelSorter.Generator generator11 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator11.setUseCache(true);
        boolean boolean14 = generator11.getAttemptLoad();
        boolean boolean15 = generator11.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = generator11.getStrategy();
        generator3.setStrategy(generatorStrategy16);
        generator0.setStrategy(generatorStrategy16);
        boolean boolean19 = generator0.getAttemptLoad();
        org.mockito.cglib.util.ParallelSorter.Generator generator20 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator21 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator21.setUseCache(true);
        boolean boolean24 = generator21.getAttemptLoad();
        boolean boolean25 = generator21.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy26 = generator21.getStrategy();
        generator20.setStrategy(generatorStrategy26);
        org.mockito.cglib.util.ParallelSorter.Generator generator28 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator28.setUseCache(true);
        boolean boolean31 = generator28.getAttemptLoad();
        boolean boolean32 = generator28.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy33 = generator28.getStrategy();
        generator20.setStrategy(generatorStrategy33);
        generator20.setAttemptLoad(false);
        boolean boolean37 = generator20.getUseCache();
        java.lang.ClassLoader classLoader38 = generator20.getClassLoader();
        generator0.setClassLoader(classLoader38);
        org.mockito.cglib.core.NamingPolicy namingPolicy40 = generator0.getNamingPolicy();
        boolean boolean41 = generator0.getUseCache();
        boolean boolean42 = generator0.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter43 = generator0.create();
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        generator0.setUseCache(true);
        generator0.setAttemptLoad(true);
        generator0.setUseCache(false);
        boolean boolean13 = generator0.getUseCache();
        org.mockito.cglib.util.ParallelSorter.Generator generator14 = new org.mockito.cglib.util.ParallelSorter.Generator();
        boolean boolean15 = generator14.getAttemptLoad();
        java.lang.ClassLoader classLoader16 = generator14.getClassLoader();
        java.lang.ClassLoader classLoader17 = generator14.getClassLoader();
        org.mockito.cglib.util.ParallelSorter.Generator generator18 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator19 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator19.setUseCache(true);
        boolean boolean22 = generator19.getAttemptLoad();
        boolean boolean23 = generator19.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy24 = generator19.getStrategy();
        generator18.setStrategy(generatorStrategy24);
        org.mockito.cglib.util.ParallelSorter.Generator generator26 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator26.setUseCache(true);
        boolean boolean29 = generator26.getAttemptLoad();
        boolean boolean30 = generator26.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy31 = generator26.getStrategy();
        generator18.setStrategy(generatorStrategy31);
        generator14.setStrategy(generatorStrategy31);
        org.mockito.cglib.util.ParallelSorter.Generator generator34 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy35 = generator34.getStrategy();
        generator14.setStrategy(generatorStrategy35);
        generator0.setStrategy(generatorStrategy35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter38 = generator0.create();
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator1 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator1.setUseCache(true);
        boolean boolean4 = generator1.getAttemptLoad();
        boolean boolean5 = generator1.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator1.getStrategy();
        generator0.setStrategy(generatorStrategy6);
        generator0.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy10 = generator0.getNamingPolicy();
        boolean boolean11 = generator0.getAttemptLoad();
        generator0.setAttemptLoad(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter14 = generator0.create();
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = generator0.getStrategy();
        java.lang.ClassLoader classLoader2 = generator0.getClassLoader();
        generator0.setAttemptLoad(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = generator0.getStrategy();
        generator0.setUseCache(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter8 = generator0.create();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        generator0.setUseCache(true);
        generator0.setAttemptLoad(true);
        generator0.setUseCache(false);
        boolean boolean13 = generator0.getUseCache();
        java.lang.ClassLoader classLoader14 = generator0.getClassLoader();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter15 = generator0.create();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator1 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator1.setUseCache(true);
        boolean boolean4 = generator1.getAttemptLoad();
        boolean boolean5 = generator1.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator1.getStrategy();
        generator0.setStrategy(generatorStrategy6);
        org.mockito.cglib.util.ParallelSorter.Generator generator8 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator8.setUseCache(true);
        boolean boolean11 = generator8.getAttemptLoad();
        boolean boolean12 = generator8.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator8.getStrategy();
        generator0.setStrategy(generatorStrategy13);
        generator0.setAttemptLoad(false);
        boolean boolean17 = generator0.getUseCache();
        java.lang.ClassLoader classLoader18 = generator0.getClassLoader();
        generator0.setAttemptLoad(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter21 = generator0.create();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = generator0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = generator0.getNamingPolicy();
        org.mockito.cglib.util.ParallelSorter.Generator generator4 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator4.setUseCache(true);
        java.lang.ClassLoader classLoader7 = generator4.getClassLoader();
        org.mockito.cglib.util.ParallelSorter.Generator generator8 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator8.setUseCache(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = generator8.getStrategy();
        generator4.setStrategy(generatorStrategy11);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator4.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy14 = generator4.getNamingPolicy();
        generator0.setNamingPolicy(namingPolicy14);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = generator0.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter17 = generator0.create();
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        generator0.setUseCache(true);
        generator0.setAttemptLoad(true);
        generator0.setAttemptLoad(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter13 = generator0.create();
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        org.mockito.cglib.util.ParallelSorter.Generator generator7 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy8 = generator7.getStrategy();
        generator0.setStrategy(generatorStrategy8);
        org.mockito.cglib.util.ParallelSorter.Generator generator10 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator10.setUseCache(true);
        java.lang.ClassLoader classLoader13 = generator10.getClassLoader();
        generator0.setClassLoader(classLoader13);
        boolean boolean15 = generator0.getAttemptLoad();
        boolean boolean16 = generator0.getUseCache();
        generator0.setUseCache(false);
        generator0.setUseCache(false);
        java.lang.ClassLoader classLoader21 = generator0.getClassLoader();
        java.lang.ClassLoader classLoader22 = generator0.getClassLoader();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter23 = generator0.create();
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        org.mockito.cglib.util.ParallelSorter.Generator generator3 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator4 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator4.setUseCache(true);
        boolean boolean7 = generator4.getAttemptLoad();
        boolean boolean8 = generator4.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = generator4.getStrategy();
        generator3.setStrategy(generatorStrategy9);
        org.mockito.cglib.util.ParallelSorter.Generator generator11 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator11.setUseCache(true);
        boolean boolean14 = generator11.getAttemptLoad();
        boolean boolean15 = generator11.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = generator11.getStrategy();
        generator3.setStrategy(generatorStrategy16);
        generator0.setStrategy(generatorStrategy16);
        boolean boolean19 = generator0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy20 = generator0.getStrategy();
        generator0.setUseCache(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter23 = generator0.create();
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator1 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator1.setUseCache(true);
        boolean boolean4 = generator1.getAttemptLoad();
        boolean boolean5 = generator1.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator1.getStrategy();
        generator0.setStrategy(generatorStrategy6);
        org.mockito.cglib.util.ParallelSorter.Generator generator8 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator8.setUseCache(true);
        boolean boolean11 = generator8.getAttemptLoad();
        boolean boolean12 = generator8.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator8.getStrategy();
        generator0.setStrategy(generatorStrategy13);
        org.mockito.cglib.util.ParallelSorter.Generator generator15 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator15.setUseCache(true);
        boolean boolean18 = generator15.getAttemptLoad();
        boolean boolean19 = generator15.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy20 = generator15.getStrategy();
        org.mockito.cglib.util.ParallelSorter.Generator generator21 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator21.setUseCache(true);
        boolean boolean24 = generator21.getAttemptLoad();
        boolean boolean25 = generator21.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy26 = generator21.getStrategy();
        generator15.setStrategy(generatorStrategy26);
        generator0.setStrategy(generatorStrategy26);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy29 = generator0.getStrategy();
        boolean boolean30 = generator0.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter31 = generator0.create();
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.util.ParallelSorter.Generator generator5 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator5.setUseCache(true);
        boolean boolean8 = generator5.getAttemptLoad();
        boolean boolean9 = generator5.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy10 = generator5.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = generator5.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = generator5.getStrategy();
        generator0.setStrategy(generatorStrategy12);
        org.mockito.cglib.util.ParallelSorter.Generator generator14 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator14.setUseCache(true);
        boolean boolean17 = generator14.getAttemptLoad();
        boolean boolean18 = generator14.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy19 = generator14.getStrategy();
        org.mockito.cglib.util.ParallelSorter.Generator generator20 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator20.setUseCache(true);
        boolean boolean23 = generator20.getAttemptLoad();
        boolean boolean24 = generator20.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy25 = generator20.getStrategy();
        generator14.setStrategy(generatorStrategy25);
        java.lang.ClassLoader classLoader27 = generator14.getClassLoader();
        generator14.setUseCache(false);
        org.mockito.cglib.util.ParallelSorter.Generator generator30 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator30.setUseCache(true);
        boolean boolean33 = generator30.getAttemptLoad();
        boolean boolean34 = generator30.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy35 = generator30.getStrategy();
        org.mockito.cglib.util.ParallelSorter.Generator generator36 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator36.setUseCache(true);
        boolean boolean39 = generator36.getAttemptLoad();
        boolean boolean40 = generator36.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy41 = generator36.getStrategy();
        generator30.setStrategy(generatorStrategy41);
        java.lang.ClassLoader classLoader43 = generator30.getClassLoader();
        generator14.setClassLoader(classLoader43);
        generator0.setClassLoader(classLoader43);
        org.mockito.cglib.core.NamingPolicy namingPolicy46 = generator0.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter47 = generator0.create();
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        java.util.Comparator<java.lang.String> strComparator0 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator1 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator2 = strComparator0.thenComparing(strComparator1);
        java.util.Comparator<java.lang.String> strComparator3 = strComparator0.reversed();
        java.util.Comparator<java.lang.String> strComparator4 = strComparator3.reversed();
        java.util.Comparator<java.lang.String> strComparator5 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator6 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator7 = strComparator5.thenComparing(strComparator6);
        java.util.Comparator<java.lang.String> strComparator8 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator9 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator10 = strComparator8.thenComparing(strComparator9);
        java.util.Comparator<java.lang.String> strComparator11 = strComparator7.thenComparing(strComparator8);
        boolean boolean13 = strComparator8.equals((java.lang.Object) "");
        java.util.Comparator<java.lang.String> strComparator14 = strComparator8.reversed();
        java.util.Comparator<java.lang.String> strComparator15 = strComparator3.thenComparing(strComparator14);
        java.util.Comparator<java.lang.String> strComparator16 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator17 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator18 = strComparator16.thenComparing(strComparator17);
        java.util.Comparator<java.lang.String> strComparator19 = strComparator16.reversed();
        java.util.Comparator<java.lang.String> strComparator20 = strComparator19.reversed();
        java.util.Comparator<java.lang.String> strComparator21 = strComparator15.thenComparing(strComparator20);
        org.mockito.cglib.util.ParallelSorter.Generator generator22 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator22.setUseCache(true);
        org.mockito.cglib.util.ParallelSorter.Generator generator25 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator26 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator26.setUseCache(true);
        boolean boolean29 = generator26.getAttemptLoad();
        boolean boolean30 = generator26.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy31 = generator26.getStrategy();
        generator25.setStrategy(generatorStrategy31);
        org.mockito.cglib.util.ParallelSorter.Generator generator33 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator33.setUseCache(true);
        boolean boolean36 = generator33.getAttemptLoad();
        boolean boolean37 = generator33.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy38 = generator33.getStrategy();
        generator25.setStrategy(generatorStrategy38);
        generator22.setStrategy(generatorStrategy38);
        boolean boolean41 = generator22.getAttemptLoad();
        org.mockito.cglib.util.ParallelSorter.Generator generator42 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator43 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator43.setUseCache(true);
        boolean boolean46 = generator43.getAttemptLoad();
        boolean boolean47 = generator43.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy48 = generator43.getStrategy();
        generator42.setStrategy(generatorStrategy48);
        org.mockito.cglib.util.ParallelSorter.Generator generator50 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator50.setUseCache(true);
        boolean boolean53 = generator50.getAttemptLoad();
        boolean boolean54 = generator50.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy55 = generator50.getStrategy();
        generator42.setStrategy(generatorStrategy55);
        generator42.setAttemptLoad(false);
        boolean boolean59 = generator42.getUseCache();
        java.lang.ClassLoader classLoader60 = generator42.getClassLoader();
        generator22.setClassLoader(classLoader60);
        boolean boolean62 = strComparator15.equals((java.lang.Object) generator22);
        org.mockito.cglib.util.ParallelSorter.Generator generator63 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator63.setUseCache(true);
        boolean boolean66 = generator63.getAttemptLoad();
        boolean boolean67 = generator63.getUseCache();
        generator63.setAttemptLoad(true);
        generator63.setUseCache(true);
        generator63.setUseCache(false);
        generator63.setUseCache(false);
        boolean boolean76 = generator63.getUseCache();
        org.mockito.cglib.util.ParallelSorter.Generator generator77 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator77.setUseCache(true);
        boolean boolean80 = generator77.getAttemptLoad();
        boolean boolean81 = generator77.getUseCache();
        generator77.setAttemptLoad(true);
        generator77.setUseCache(true);
        generator77.setUseCache(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy88 = generator77.getStrategy();
        generator63.setStrategy(generatorStrategy88);
        generator22.setStrategy(generatorStrategy88);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy91 = generator22.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter92 = generator22.create();
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        generator0.setUseCache(true);
        generator0.setAttemptLoad(true);
        generator0.setUseCache(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator0.getStrategy();
        java.lang.ClassLoader classLoader14 = generator0.getClassLoader();
        boolean boolean15 = generator0.getUseCache();
        boolean boolean16 = generator0.getAttemptLoad();
        java.util.Comparator<java.lang.String> strComparator17 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator18 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator19 = strComparator17.thenComparing(strComparator18);
        java.util.Comparator<java.lang.String> strComparator20 = strComparator17.reversed();
        java.util.Comparator<java.lang.String> strComparator21 = strComparator20.reversed();
        java.util.Comparator<java.lang.String> strComparator22 = strComparator20.reversed();
        org.mockito.cglib.util.ParallelSorter.Generator generator23 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator23.setUseCache(true);
        java.lang.ClassLoader classLoader26 = generator23.getClassLoader();
        org.mockito.cglib.util.ParallelSorter.Generator generator27 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator27.setUseCache(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy30 = generator27.getStrategy();
        generator23.setStrategy(generatorStrategy30);
        boolean boolean32 = strComparator22.equals((java.lang.Object) generator23);
        java.lang.ClassLoader classLoader33 = generator23.getClassLoader();
        generator0.setClassLoader(classLoader33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter35 = generator0.create();
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = generator0.getStrategy();
        org.mockito.cglib.util.ParallelSorter.Generator generator6 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator6.setUseCache(true);
        boolean boolean9 = generator6.getAttemptLoad();
        boolean boolean10 = generator6.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = generator6.getStrategy();
        generator0.setStrategy(generatorStrategy11);
        java.lang.ClassLoader classLoader13 = generator0.getClassLoader();
        org.mockito.cglib.core.NamingPolicy namingPolicy14 = generator0.getNamingPolicy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy15 = generator0.getStrategy();
        generator0.setUseCache(true);
        generator0.setAttemptLoad(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter20 = generator0.create();
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = generator0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = generator0.getNamingPolicy();
        generator0.setAttemptLoad(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter9 = generator0.create();
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = generator0.getStrategy();
        boolean boolean8 = generator0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = generator0.getStrategy();
        generator0.setUseCache(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter12 = generator0.create();
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        java.lang.ClassLoader classLoader2 = generator0.getClassLoader();
        java.lang.ClassLoader classLoader3 = generator0.getClassLoader();
        org.mockito.cglib.util.ParallelSorter.Generator generator4 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator5 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator5.setUseCache(true);
        boolean boolean8 = generator5.getAttemptLoad();
        boolean boolean9 = generator5.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy10 = generator5.getStrategy();
        generator4.setStrategy(generatorStrategy10);
        org.mockito.cglib.util.ParallelSorter.Generator generator12 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator12.setUseCache(true);
        boolean boolean15 = generator12.getAttemptLoad();
        boolean boolean16 = generator12.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy17 = generator12.getStrategy();
        generator4.setStrategy(generatorStrategy17);
        generator0.setStrategy(generatorStrategy17);
        org.mockito.cglib.util.ParallelSorter.Generator generator20 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy21 = generator20.getStrategy();
        generator0.setStrategy(generatorStrategy21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter23 = generator0.create();
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        java.util.Comparator<java.lang.String> strComparator0 = java.util.Comparator.reverseOrder();
        org.mockito.cglib.util.ParallelSorter.Generator generator1 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator1.setUseCache(true);
        boolean boolean4 = strComparator0.equals((java.lang.Object) generator1);
        org.mockito.cglib.util.ParallelSorter.Generator generator5 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator5.setUseCache(true);
        boolean boolean8 = generator5.getAttemptLoad();
        boolean boolean9 = generator5.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy10 = generator5.getStrategy();
        org.mockito.cglib.util.ParallelSorter.Generator generator11 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator11.setUseCache(true);
        boolean boolean14 = generator11.getAttemptLoad();
        boolean boolean15 = generator11.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = generator11.getStrategy();
        generator5.setStrategy(generatorStrategy16);
        java.lang.ClassLoader classLoader18 = generator5.getClassLoader();
        generator5.setUseCache(false);
        org.mockito.cglib.util.ParallelSorter.Generator generator21 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator21.setUseCache(true);
        boolean boolean24 = generator21.getAttemptLoad();
        boolean boolean25 = generator21.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy26 = generator21.getStrategy();
        org.mockito.cglib.util.ParallelSorter.Generator generator27 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator27.setUseCache(true);
        boolean boolean30 = generator27.getAttemptLoad();
        boolean boolean31 = generator27.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy32 = generator27.getStrategy();
        generator21.setStrategy(generatorStrategy32);
        java.lang.ClassLoader classLoader34 = generator21.getClassLoader();
        generator5.setClassLoader(classLoader34);
        boolean boolean36 = generator5.getAttemptLoad();
        boolean boolean37 = generator5.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy38 = generator5.getNamingPolicy();
        generator1.setNamingPolicy(namingPolicy38);
        java.lang.ClassLoader classLoader40 = generator1.getClassLoader();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter41 = generator1.create();
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = generator0.getStrategy();
        java.lang.ClassLoader classLoader2 = generator0.getClassLoader();
        generator0.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy5 = generator0.getNamingPolicy();
        org.mockito.cglib.util.ParallelSorter.Generator generator6 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator7 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator7.setUseCache(true);
        boolean boolean10 = generator7.getAttemptLoad();
        boolean boolean11 = generator7.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = generator7.getStrategy();
        generator6.setStrategy(generatorStrategy12);
        generator0.setStrategy(generatorStrategy12);
        org.mockito.cglib.core.NamingPolicy namingPolicy15 = generator0.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter16 = generator0.create();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = generator0.getStrategy();
        java.lang.ClassLoader classLoader2 = generator0.getClassLoader();
        generator0.setUseCache(false);
        boolean boolean5 = generator0.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter6 = generator0.create();
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        java.lang.ClassLoader classLoader2 = generator0.getClassLoader();
        java.lang.ClassLoader classLoader3 = generator0.getClassLoader();
        org.mockito.cglib.util.ParallelSorter.Generator generator4 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator5 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator5.setUseCache(true);
        boolean boolean8 = generator5.getAttemptLoad();
        boolean boolean9 = generator5.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy10 = generator5.getStrategy();
        generator4.setStrategy(generatorStrategy10);
        org.mockito.cglib.util.ParallelSorter.Generator generator12 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator12.setUseCache(true);
        boolean boolean15 = generator12.getAttemptLoad();
        boolean boolean16 = generator12.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy17 = generator12.getStrategy();
        generator4.setStrategy(generatorStrategy17);
        generator0.setStrategy(generatorStrategy17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter20 = generator0.create();
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator1 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator1.setUseCache(true);
        boolean boolean4 = generator1.getAttemptLoad();
        boolean boolean5 = generator1.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator1.getStrategy();
        generator0.setStrategy(generatorStrategy6);
        org.mockito.cglib.util.ParallelSorter.Generator generator8 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator8.setUseCache(true);
        boolean boolean11 = generator8.getAttemptLoad();
        boolean boolean12 = generator8.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator8.getStrategy();
        generator0.setStrategy(generatorStrategy13);
        generator0.setAttemptLoad(false);
        boolean boolean17 = generator0.getUseCache();
        boolean boolean18 = generator0.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter19 = generator0.create();
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        generator0.setUseCache(true);
        generator0.setUseCache(false);
        generator0.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy13 = generator0.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter14 = generator0.create();
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = generator0.getStrategy();
        java.lang.ClassLoader classLoader2 = generator0.getClassLoader();
        generator0.setUseCache(false);
        generator0.setUseCache(true);
        boolean boolean7 = generator0.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter8 = generator0.create();
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        boolean boolean7 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        java.lang.ClassLoader classLoader10 = generator0.getClassLoader();
        boolean boolean11 = generator0.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy12 = generator0.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter13 = generator0.create();
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        generator0.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy7 = generator0.getNamingPolicy();
        generator0.setUseCache(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter10 = generator0.create();
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator1 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator1.setUseCache(true);
        boolean boolean4 = generator1.getAttemptLoad();
        boolean boolean5 = generator1.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator1.getStrategy();
        generator0.setStrategy(generatorStrategy6);
        org.mockito.cglib.util.ParallelSorter.Generator generator8 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator8.setUseCache(true);
        boolean boolean11 = generator8.getAttemptLoad();
        boolean boolean12 = generator8.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator8.getStrategy();
        generator0.setStrategy(generatorStrategy13);
        generator0.setAttemptLoad(false);
        boolean boolean17 = generator0.getUseCache();
        java.lang.ClassLoader classLoader18 = generator0.getClassLoader();
        boolean boolean19 = generator0.getUseCache();
        boolean boolean20 = generator0.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy21 = generator0.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter22 = generator0.create();
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        boolean boolean7 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        generator0.setUseCache(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter12 = generator0.create();
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator1 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator1.setUseCache(true);
        boolean boolean4 = generator1.getAttemptLoad();
        boolean boolean5 = generator1.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator1.getStrategy();
        generator0.setStrategy(generatorStrategy6);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy8 = generator0.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter9 = generator0.create();
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = generator0.getStrategy();
        org.mockito.cglib.util.ParallelSorter.Generator generator6 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator6.setUseCache(true);
        boolean boolean9 = generator6.getAttemptLoad();
        boolean boolean10 = generator6.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = generator6.getStrategy();
        generator0.setStrategy(generatorStrategy11);
        java.lang.ClassLoader classLoader13 = generator0.getClassLoader();
        generator0.setUseCache(false);
        org.mockito.cglib.util.ParallelSorter.Generator generator16 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator16.setUseCache(true);
        boolean boolean19 = generator16.getAttemptLoad();
        boolean boolean20 = generator16.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy21 = generator16.getStrategy();
        org.mockito.cglib.util.ParallelSorter.Generator generator22 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator22.setUseCache(true);
        boolean boolean25 = generator22.getAttemptLoad();
        boolean boolean26 = generator22.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy27 = generator22.getStrategy();
        generator16.setStrategy(generatorStrategy27);
        java.lang.ClassLoader classLoader29 = generator16.getClassLoader();
        generator0.setClassLoader(classLoader29);
        boolean boolean31 = generator0.getAttemptLoad();
        generator0.setUseCache(true);
        boolean boolean34 = generator0.getAttemptLoad();
        boolean boolean35 = generator0.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter36 = generator0.create();
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = generator0.getStrategy();
        java.lang.ClassLoader classLoader2 = generator0.getClassLoader();
        java.lang.ClassLoader classLoader3 = generator0.getClassLoader();
        org.mockito.cglib.util.ParallelSorter.Generator generator4 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator4.setUseCache(true);
        boolean boolean7 = generator4.getAttemptLoad();
        boolean boolean8 = generator4.getUseCache();
        generator4.setAttemptLoad(true);
        generator4.setUseCache(true);
        generator4.setAttemptLoad(true);
        generator4.setUseCache(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy17 = generator4.getStrategy();
        java.lang.ClassLoader classLoader18 = generator4.getClassLoader();
        generator0.setClassLoader(classLoader18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter20 = generator0.create();
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator1 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator1.setUseCache(true);
        boolean boolean4 = generator1.getAttemptLoad();
        boolean boolean5 = generator1.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator1.getStrategy();
        generator0.setStrategy(generatorStrategy6);
        generator0.setUseCache(false);
        generator0.setAttemptLoad(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = generator0.getStrategy();
        java.lang.ClassLoader classLoader13 = generator0.getClassLoader();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter14 = generator0.create();
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator1 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator1.setUseCache(true);
        boolean boolean4 = generator1.getAttemptLoad();
        boolean boolean5 = generator1.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator1.getStrategy();
        generator0.setStrategy(generatorStrategy6);
        org.mockito.cglib.util.ParallelSorter.Generator generator8 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator8.setUseCache(true);
        boolean boolean11 = generator8.getAttemptLoad();
        boolean boolean12 = generator8.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator8.getStrategy();
        generator0.setStrategy(generatorStrategy13);
        org.mockito.cglib.util.ParallelSorter.Generator generator15 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator15.setUseCache(true);
        boolean boolean18 = generator15.getAttemptLoad();
        boolean boolean19 = generator15.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy20 = generator15.getStrategy();
        org.mockito.cglib.util.ParallelSorter.Generator generator21 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator21.setUseCache(true);
        boolean boolean24 = generator21.getAttemptLoad();
        boolean boolean25 = generator21.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy26 = generator21.getStrategy();
        generator15.setStrategy(generatorStrategy26);
        generator0.setStrategy(generatorStrategy26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter29 = generator0.create();
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        java.lang.ClassLoader classLoader2 = generator0.getClassLoader();
        generator0.setUseCache(false);
        org.mockito.cglib.util.ParallelSorter.Generator generator5 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator6 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator6.setUseCache(true);
        boolean boolean9 = generator6.getAttemptLoad();
        boolean boolean10 = generator6.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = generator6.getStrategy();
        generator5.setStrategy(generatorStrategy11);
        generator0.setStrategy(generatorStrategy11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter14 = generator0.create();
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator1 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator1.setUseCache(true);
        boolean boolean4 = generator1.getAttemptLoad();
        boolean boolean5 = generator1.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator1.getStrategy();
        generator0.setStrategy(generatorStrategy6);
        org.mockito.cglib.util.ParallelSorter.Generator generator8 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator8.setUseCache(true);
        boolean boolean11 = generator8.getAttemptLoad();
        boolean boolean12 = generator8.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator8.getStrategy();
        generator0.setStrategy(generatorStrategy13);
        generator0.setAttemptLoad(false);
        java.lang.ClassLoader classLoader17 = generator0.getClassLoader();
        generator0.setAttemptLoad(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter20 = generator0.create();
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy5 = generator0.getNamingPolicy();
        org.mockito.cglib.util.ParallelSorter.Generator generator6 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator6.setUseCache(true);
        boolean boolean9 = generator6.getAttemptLoad();
        boolean boolean10 = generator6.getUseCache();
        generator6.setAttemptLoad(true);
        org.mockito.cglib.util.ParallelSorter.Generator generator13 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy14 = generator13.getStrategy();
        generator6.setStrategy(generatorStrategy14);
        org.mockito.cglib.util.ParallelSorter.Generator generator16 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator16.setUseCache(true);
        java.lang.ClassLoader classLoader19 = generator16.getClassLoader();
        generator6.setClassLoader(classLoader19);
        generator0.setClassLoader(classLoader19);
        org.mockito.cglib.core.NamingPolicy namingPolicy22 = generator0.getNamingPolicy();
        generator0.setAttemptLoad(false);
        java.lang.ClassLoader classLoader25 = generator0.getClassLoader();
        boolean boolean26 = generator0.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter27 = generator0.create();
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator0.getStrategy();
        generator0.setAttemptLoad(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = generator0.getStrategy();
        boolean boolean10 = generator0.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter11 = generator0.create();
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        java.util.Comparator<java.lang.String> strComparator0 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator1 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator2 = strComparator0.thenComparing(strComparator1);
        org.mockito.cglib.util.ParallelSorter.Generator generator3 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator3.setUseCache(true);
        boolean boolean6 = generator3.getAttemptLoad();
        boolean boolean7 = generator3.getUseCache();
        generator3.setAttemptLoad(true);
        generator3.setUseCache(true);
        boolean boolean12 = strComparator0.equals((java.lang.Object) generator3);
        java.lang.ClassLoader classLoader13 = generator3.getClassLoader();
        boolean boolean14 = generator3.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter15 = generator3.create();
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator1 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator1.setUseCache(true);
        boolean boolean4 = generator1.getAttemptLoad();
        boolean boolean5 = generator1.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator1.getStrategy();
        generator0.setStrategy(generatorStrategy6);
        org.mockito.cglib.util.ParallelSorter.Generator generator8 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator8.setUseCache(true);
        boolean boolean11 = generator8.getAttemptLoad();
        boolean boolean12 = generator8.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator8.getStrategy();
        generator0.setStrategy(generatorStrategy13);
        java.lang.ClassLoader classLoader15 = generator0.getClassLoader();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter16 = generator0.create();
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        java.util.Comparator<java.lang.String> strComparator0 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator1 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator2 = strComparator0.thenComparing(strComparator1);
        java.util.Comparator<java.lang.String> strComparator3 = strComparator0.reversed();
        java.util.Comparator<java.lang.String> strComparator4 = strComparator3.reversed();
        java.util.Comparator<java.lang.String> strComparator5 = strComparator3.reversed();
        org.mockito.cglib.util.ParallelSorter.Generator generator6 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator6.setUseCache(true);
        java.lang.ClassLoader classLoader9 = generator6.getClassLoader();
        org.mockito.cglib.util.ParallelSorter.Generator generator10 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator10.setUseCache(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator10.getStrategy();
        generator6.setStrategy(generatorStrategy13);
        boolean boolean15 = strComparator5.equals((java.lang.Object) generator6);
        boolean boolean16 = generator6.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter17 = generator6.create();
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        generator0.setAttemptLoad(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter9 = generator0.create();
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator0.getStrategy();
        generator0.setAttemptLoad(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = generator0.getStrategy();
        java.lang.ClassLoader classLoader10 = generator0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = generator0.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter12 = generator0.create();
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator1 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator1.setUseCache(true);
        boolean boolean4 = generator1.getAttemptLoad();
        boolean boolean5 = generator1.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator1.getStrategy();
        generator0.setStrategy(generatorStrategy6);
        org.mockito.cglib.util.ParallelSorter.Generator generator8 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator8.setUseCache(true);
        boolean boolean11 = generator8.getAttemptLoad();
        boolean boolean12 = generator8.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator8.getStrategy();
        generator0.setStrategy(generatorStrategy13);
        generator0.setAttemptLoad(false);
        java.lang.ClassLoader classLoader17 = generator0.getClassLoader();
        org.mockito.cglib.core.NamingPolicy namingPolicy18 = generator0.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter19 = generator0.create();
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        org.mockito.cglib.util.ParallelSorter.Generator generator7 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy8 = generator7.getStrategy();
        generator0.setStrategy(generatorStrategy8);
        org.mockito.cglib.util.ParallelSorter.Generator generator10 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator10.setUseCache(true);
        java.lang.ClassLoader classLoader13 = generator10.getClassLoader();
        generator0.setClassLoader(classLoader13);
        boolean boolean15 = generator0.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy16 = generator0.getNamingPolicy();
        generator0.setUseCache(true);
        boolean boolean19 = generator0.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter20 = generator0.create();
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        java.lang.ClassLoader classLoader3 = generator0.getClassLoader();
        org.mockito.cglib.core.NamingPolicy namingPolicy4 = generator0.getNamingPolicy();
        org.mockito.cglib.util.ParallelSorter.Generator generator5 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator5.setUseCache(true);
        boolean boolean8 = generator5.getAttemptLoad();
        boolean boolean9 = generator5.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy10 = generator5.getStrategy();
        org.mockito.cglib.util.ParallelSorter.Generator generator11 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator11.setUseCache(true);
        boolean boolean14 = generator11.getAttemptLoad();
        boolean boolean15 = generator11.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = generator11.getStrategy();
        generator5.setStrategy(generatorStrategy16);
        java.lang.ClassLoader classLoader18 = generator5.getClassLoader();
        org.mockito.cglib.core.NamingPolicy namingPolicy19 = generator5.getNamingPolicy();
        generator5.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy22 = generator5.getNamingPolicy();
        generator0.setNamingPolicy(namingPolicy22);
        java.lang.ClassLoader classLoader24 = generator0.getClassLoader();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter25 = generator0.create();
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        org.mockito.cglib.util.ParallelSorter.Generator generator3 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator4 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator4.setUseCache(true);
        boolean boolean7 = generator4.getAttemptLoad();
        boolean boolean8 = generator4.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = generator4.getStrategy();
        generator3.setStrategy(generatorStrategy9);
        org.mockito.cglib.util.ParallelSorter.Generator generator11 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator11.setUseCache(true);
        boolean boolean14 = generator11.getAttemptLoad();
        boolean boolean15 = generator11.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = generator11.getStrategy();
        generator3.setStrategy(generatorStrategy16);
        generator0.setStrategy(generatorStrategy16);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy19 = generator0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy20 = generator0.getNamingPolicy();
        java.lang.ClassLoader classLoader21 = generator0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy22 = generator0.getStrategy();
        java.lang.ClassLoader classLoader23 = generator0.getClassLoader();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter24 = generator0.create();
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = generator0.getStrategy();
        generator0.setUseCache(true);
        boolean boolean4 = generator0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = generator0.getStrategy();
        generator0.setAttemptLoad(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter8 = generator0.create();
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator1 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator1.setUseCache(true);
        boolean boolean4 = generator1.getAttemptLoad();
        boolean boolean5 = generator1.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator1.getStrategy();
        generator0.setStrategy(generatorStrategy6);
        boolean boolean8 = generator0.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy9 = generator0.getNamingPolicy();
        boolean boolean10 = generator0.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter11 = generator0.create();
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        java.lang.ClassLoader classLoader2 = generator0.getClassLoader();
        java.lang.ClassLoader classLoader3 = generator0.getClassLoader();
        org.mockito.cglib.util.ParallelSorter.Generator generator4 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator5 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator5.setUseCache(true);
        boolean boolean8 = generator5.getAttemptLoad();
        boolean boolean9 = generator5.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy10 = generator5.getStrategy();
        generator4.setStrategy(generatorStrategy10);
        org.mockito.cglib.util.ParallelSorter.Generator generator12 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator12.setUseCache(true);
        boolean boolean15 = generator12.getAttemptLoad();
        boolean boolean16 = generator12.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy17 = generator12.getStrategy();
        generator4.setStrategy(generatorStrategy17);
        generator0.setStrategy(generatorStrategy17);
        org.mockito.cglib.util.ParallelSorter.Generator generator20 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy21 = generator20.getStrategy();
        generator0.setStrategy(generatorStrategy21);
        boolean boolean23 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        org.mockito.cglib.util.ParallelSorter.Generator generator26 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator26.setUseCache(true);
        boolean boolean29 = generator26.getAttemptLoad();
        boolean boolean30 = generator26.getUseCache();
        generator26.setAttemptLoad(true);
        boolean boolean33 = generator26.getUseCache();
        generator26.setAttemptLoad(true);
        generator26.setUseCache(true);
        org.mockito.cglib.util.ParallelSorter.Generator generator38 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator38.setUseCache(true);
        boolean boolean41 = generator38.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy42 = generator38.getStrategy();
        generator26.setStrategy(generatorStrategy42);
        java.lang.ClassLoader classLoader44 = generator26.getClassLoader();
        generator0.setClassLoader(classLoader44);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter46 = generator0.create();
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = generator0.getStrategy();
        org.mockito.cglib.util.ParallelSorter.Generator generator6 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator6.setUseCache(true);
        boolean boolean9 = generator6.getAttemptLoad();
        boolean boolean10 = generator6.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = generator6.getStrategy();
        generator0.setStrategy(generatorStrategy11);
        java.lang.ClassLoader classLoader13 = generator0.getClassLoader();
        org.mockito.cglib.core.NamingPolicy namingPolicy14 = generator0.getNamingPolicy();
        generator0.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy17 = generator0.getNamingPolicy();
        boolean boolean18 = generator0.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy19 = generator0.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter20 = generator0.create();
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = generator0.getStrategy();
        boolean boolean8 = generator0.getAttemptLoad();
        boolean boolean9 = generator0.getAttemptLoad();
        generator0.setUseCache(false);
        boolean boolean12 = generator0.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter13 = generator0.create();
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        generator0.setUseCache(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = generator0.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter10 = generator0.create();
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        java.util.Comparator<java.lang.String> strComparator0 = java.util.Comparator.reverseOrder();
        org.mockito.cglib.util.ParallelSorter.Generator generator1 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator1.setUseCache(true);
        boolean boolean4 = strComparator0.equals((java.lang.Object) generator1);
        java.util.Comparator<java.lang.String> strComparator5 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator6 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator7 = strComparator5.thenComparing(strComparator6);
        java.util.Comparator<java.lang.String> strComparator8 = strComparator5.reversed();
        java.util.Comparator<java.lang.String> strComparator9 = strComparator8.reversed();
        java.util.Comparator<java.lang.String> strComparator10 = strComparator8.reversed();
        java.util.Comparator<java.lang.String> strComparator11 = strComparator10.reversed();
        java.util.Comparator<java.lang.String> strComparator12 = java.util.Comparator.nullsFirst(strComparator10);
        java.util.Comparator<java.lang.String> strComparator13 = strComparator0.thenComparing(strComparator12);
        java.util.Comparator<java.lang.String> strComparator14 = strComparator0.reversed();
        org.mockito.cglib.util.ParallelSorter.Generator generator15 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator15.setUseCache(true);
        org.mockito.cglib.util.ParallelSorter.Generator generator18 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator19 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator19.setUseCache(true);
        boolean boolean22 = generator19.getAttemptLoad();
        boolean boolean23 = generator19.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy24 = generator19.getStrategy();
        generator18.setStrategy(generatorStrategy24);
        org.mockito.cglib.util.ParallelSorter.Generator generator26 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator26.setUseCache(true);
        boolean boolean29 = generator26.getAttemptLoad();
        boolean boolean30 = generator26.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy31 = generator26.getStrategy();
        generator18.setStrategy(generatorStrategy31);
        generator15.setStrategy(generatorStrategy31);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy34 = generator15.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy35 = generator15.getNamingPolicy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy36 = generator15.getStrategy();
        boolean boolean37 = strComparator14.equals((java.lang.Object) generator15);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy38 = generator15.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter39 = generator15.create();
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        org.mockito.cglib.util.ParallelSorter.Generator generator7 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy8 = generator7.getStrategy();
        generator0.setStrategy(generatorStrategy8);
        org.mockito.cglib.util.ParallelSorter.Generator generator10 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator10.setUseCache(true);
        java.lang.ClassLoader classLoader13 = generator10.getClassLoader();
        generator0.setClassLoader(classLoader13);
        generator0.setUseCache(false);
        java.lang.ClassLoader classLoader17 = generator0.getClassLoader();
        boolean boolean18 = generator0.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter19 = generator0.create();
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy5 = generator0.getNamingPolicy();
        org.mockito.cglib.util.ParallelSorter.Generator generator6 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator6.setUseCache(true);
        boolean boolean9 = generator6.getAttemptLoad();
        boolean boolean10 = generator6.getUseCache();
        generator6.setAttemptLoad(true);
        org.mockito.cglib.util.ParallelSorter.Generator generator13 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy14 = generator13.getStrategy();
        generator6.setStrategy(generatorStrategy14);
        org.mockito.cglib.util.ParallelSorter.Generator generator16 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator16.setUseCache(true);
        java.lang.ClassLoader classLoader19 = generator16.getClassLoader();
        generator6.setClassLoader(classLoader19);
        generator0.setClassLoader(classLoader19);
        generator0.setAttemptLoad(false);
        org.mockito.cglib.util.ParallelSorter.Generator generator24 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator24.setUseCache(true);
        org.mockito.cglib.util.ParallelSorter.Generator generator27 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator28 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator28.setUseCache(true);
        boolean boolean31 = generator28.getAttemptLoad();
        boolean boolean32 = generator28.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy33 = generator28.getStrategy();
        generator27.setStrategy(generatorStrategy33);
        org.mockito.cglib.util.ParallelSorter.Generator generator35 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator35.setUseCache(true);
        boolean boolean38 = generator35.getAttemptLoad();
        boolean boolean39 = generator35.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy40 = generator35.getStrategy();
        generator27.setStrategy(generatorStrategy40);
        generator24.setStrategy(generatorStrategy40);
        boolean boolean43 = generator24.getAttemptLoad();
        org.mockito.cglib.util.ParallelSorter.Generator generator44 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator45 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator45.setUseCache(true);
        boolean boolean48 = generator45.getAttemptLoad();
        boolean boolean49 = generator45.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy50 = generator45.getStrategy();
        generator44.setStrategy(generatorStrategy50);
        org.mockito.cglib.util.ParallelSorter.Generator generator52 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator52.setUseCache(true);
        boolean boolean55 = generator52.getAttemptLoad();
        boolean boolean56 = generator52.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy57 = generator52.getStrategy();
        generator44.setStrategy(generatorStrategy57);
        generator44.setAttemptLoad(false);
        boolean boolean61 = generator44.getUseCache();
        java.lang.ClassLoader classLoader62 = generator44.getClassLoader();
        generator24.setClassLoader(classLoader62);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy64 = generator24.getStrategy();
        generator0.setStrategy(generatorStrategy64);
        boolean boolean66 = generator0.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter67 = generator0.create();
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator1 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator1.setUseCache(true);
        boolean boolean4 = generator1.getAttemptLoad();
        boolean boolean5 = generator1.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator1.getStrategy();
        generator0.setStrategy(generatorStrategy6);
        org.mockito.cglib.util.ParallelSorter.Generator generator8 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator8.setUseCache(true);
        boolean boolean11 = generator8.getAttemptLoad();
        boolean boolean12 = generator8.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator8.getStrategy();
        generator0.setStrategy(generatorStrategy13);
        generator0.setAttemptLoad(false);
        boolean boolean17 = generator0.getUseCache();
        java.lang.ClassLoader classLoader18 = generator0.getClassLoader();
        boolean boolean19 = generator0.getUseCache();
        boolean boolean20 = generator0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy21 = generator0.getStrategy();
        boolean boolean22 = generator0.getAttemptLoad();
        java.lang.ClassLoader classLoader23 = generator0.getClassLoader();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter24 = generator0.create();
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        generator0.setUseCache(true);
        generator0.setUseCache(false);
        boolean boolean11 = generator0.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy12 = generator0.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy13 = generator0.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter14 = generator0.create();
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = generator0.getStrategy();
        generator0.setUseCache(true);
        generator0.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = generator0.getNamingPolicy();
        boolean boolean7 = generator0.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy8 = generator0.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter9 = generator0.create();
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        org.mockito.cglib.util.ParallelSorter.Generator generator3 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator4 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator4.setUseCache(true);
        boolean boolean7 = generator4.getAttemptLoad();
        boolean boolean8 = generator4.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = generator4.getStrategy();
        generator3.setStrategy(generatorStrategy9);
        org.mockito.cglib.util.ParallelSorter.Generator generator11 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator11.setUseCache(true);
        boolean boolean14 = generator11.getAttemptLoad();
        boolean boolean15 = generator11.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = generator11.getStrategy();
        generator3.setStrategy(generatorStrategy16);
        generator0.setStrategy(generatorStrategy16);
        org.mockito.cglib.util.ParallelSorter.Generator generator19 = new org.mockito.cglib.util.ParallelSorter.Generator();
        boolean boolean20 = generator19.getAttemptLoad();
        java.lang.ClassLoader classLoader21 = generator19.getClassLoader();
        generator0.setClassLoader(classLoader21);
        java.lang.ClassLoader classLoader23 = generator0.getClassLoader();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter24 = generator0.create();
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        java.util.Comparator<java.lang.String> strComparator0 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator1 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator2 = strComparator0.thenComparing(strComparator1);
        org.mockito.cglib.util.ParallelSorter.Generator generator3 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator3.setUseCache(true);
        boolean boolean6 = generator3.getAttemptLoad();
        boolean boolean7 = generator3.getUseCache();
        generator3.setAttemptLoad(true);
        generator3.setUseCache(true);
        boolean boolean12 = strComparator0.equals((java.lang.Object) generator3);
        org.mockito.cglib.util.ParallelSorter.Generator generator13 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator13.setUseCache(true);
        java.lang.ClassLoader classLoader16 = generator13.getClassLoader();
        org.mockito.cglib.util.ParallelSorter.Generator generator17 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator17.setUseCache(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy20 = generator17.getStrategy();
        generator13.setStrategy(generatorStrategy20);
        generator3.setStrategy(generatorStrategy20);
        java.lang.ClassLoader classLoader23 = generator3.getClassLoader();
        generator3.setAttemptLoad(true);
        generator3.setAttemptLoad(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter28 = generator3.create();
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = generator0.getStrategy();
        java.lang.ClassLoader classLoader2 = generator0.getClassLoader();
        generator0.setUseCache(false);
        boolean boolean5 = generator0.getUseCache();
        java.lang.ClassLoader classLoader6 = generator0.getClassLoader();
        org.mockito.cglib.core.NamingPolicy namingPolicy7 = generator0.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter8 = generator0.create();
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        org.mockito.cglib.util.ParallelSorter.Generator generator7 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy8 = generator7.getStrategy();
        generator0.setStrategy(generatorStrategy8);
        org.mockito.cglib.util.ParallelSorter.Generator generator10 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator10.setUseCache(true);
        java.lang.ClassLoader classLoader13 = generator10.getClassLoader();
        generator0.setClassLoader(classLoader13);
        generator0.setAttemptLoad(false);
        boolean boolean17 = generator0.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter18 = generator0.create();
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        generator0.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy7 = generator0.getNamingPolicy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy8 = generator0.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter9 = generator0.create();
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator1 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator1.setUseCache(true);
        boolean boolean4 = generator1.getAttemptLoad();
        boolean boolean5 = generator1.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator1.getStrategy();
        generator0.setStrategy(generatorStrategy6);
        generator0.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy10 = generator0.getNamingPolicy();
        org.mockito.cglib.util.ParallelSorter.Generator generator11 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator11.setUseCache(true);
        boolean boolean14 = generator11.getAttemptLoad();
        boolean boolean15 = generator11.getUseCache();
        generator11.setAttemptLoad(true);
        generator11.setUseCache(true);
        generator11.setUseCache(false);
        generator11.setUseCache(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy24 = generator11.getStrategy();
        generator0.setStrategy(generatorStrategy24);
        boolean boolean26 = generator0.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter27 = generator0.create();
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        generator0.setUseCache(true);
        generator0.setUseCache(false);
        org.mockito.cglib.util.ParallelSorter.Generator generator11 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator12 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator12.setUseCache(true);
        boolean boolean15 = generator12.getAttemptLoad();
        boolean boolean16 = generator12.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy17 = generator12.getStrategy();
        generator11.setStrategy(generatorStrategy17);
        org.mockito.cglib.util.ParallelSorter.Generator generator19 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator19.setUseCache(true);
        boolean boolean22 = generator19.getAttemptLoad();
        boolean boolean23 = generator19.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy24 = generator19.getStrategy();
        generator11.setStrategy(generatorStrategy24);
        org.mockito.cglib.util.ParallelSorter.Generator generator26 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator26.setUseCache(true);
        boolean boolean29 = generator26.getAttemptLoad();
        boolean boolean30 = generator26.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy31 = generator26.getStrategy();
        org.mockito.cglib.util.ParallelSorter.Generator generator32 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator32.setUseCache(true);
        boolean boolean35 = generator32.getAttemptLoad();
        boolean boolean36 = generator32.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy37 = generator32.getStrategy();
        generator26.setStrategy(generatorStrategy37);
        generator11.setStrategy(generatorStrategy37);
        generator0.setStrategy(generatorStrategy37);
        org.mockito.cglib.core.NamingPolicy namingPolicy41 = generator0.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter42 = generator0.create();
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator1 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator1.setUseCache(true);
        boolean boolean4 = generator1.getAttemptLoad();
        boolean boolean5 = generator1.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator1.getStrategy();
        generator0.setStrategy(generatorStrategy6);
        boolean boolean8 = generator0.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy9 = generator0.getNamingPolicy();
        boolean boolean10 = generator0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = generator0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy12 = generator0.getNamingPolicy();
        org.mockito.cglib.util.ParallelSorter.Generator generator13 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator13.setUseCache(true);
        boolean boolean16 = generator13.getAttemptLoad();
        boolean boolean17 = generator13.getUseCache();
        generator13.setAttemptLoad(true);
        boolean boolean20 = generator13.getUseCache();
        generator13.setAttemptLoad(true);
        java.lang.ClassLoader classLoader23 = generator13.getClassLoader();
        generator0.setClassLoader(classLoader23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter25 = generator0.create();
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator1 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator1.setUseCache(true);
        boolean boolean4 = generator1.getAttemptLoad();
        boolean boolean5 = generator1.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator1.getStrategy();
        generator0.setStrategy(generatorStrategy6);
        boolean boolean8 = generator0.getAttemptLoad();
        boolean boolean9 = generator0.getAttemptLoad();
        org.mockito.cglib.util.ParallelSorter.Generator generator10 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator10.setUseCache(true);
        boolean boolean13 = generator10.getAttemptLoad();
        boolean boolean14 = generator10.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy15 = generator10.getStrategy();
        org.mockito.cglib.util.ParallelSorter.Generator generator16 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator16.setUseCache(true);
        boolean boolean19 = generator16.getAttemptLoad();
        boolean boolean20 = generator16.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy21 = generator16.getStrategy();
        generator10.setStrategy(generatorStrategy21);
        java.lang.ClassLoader classLoader23 = generator10.getClassLoader();
        generator10.setUseCache(false);
        org.mockito.cglib.util.ParallelSorter.Generator generator26 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator26.setUseCache(true);
        boolean boolean29 = generator26.getAttemptLoad();
        boolean boolean30 = generator26.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy31 = generator26.getStrategy();
        org.mockito.cglib.util.ParallelSorter.Generator generator32 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator32.setUseCache(true);
        boolean boolean35 = generator32.getAttemptLoad();
        boolean boolean36 = generator32.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy37 = generator32.getStrategy();
        generator26.setStrategy(generatorStrategy37);
        java.lang.ClassLoader classLoader39 = generator26.getClassLoader();
        generator10.setClassLoader(classLoader39);
        boolean boolean41 = generator10.getAttemptLoad();
        generator10.setUseCache(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy44 = generator10.getStrategy();
        java.lang.ClassLoader classLoader45 = generator10.getClassLoader();
        org.mockito.cglib.util.ParallelSorter.Generator generator46 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy47 = generator46.getStrategy();
        java.lang.ClassLoader classLoader48 = generator46.getClassLoader();
        generator46.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy51 = generator46.getNamingPolicy();
        org.mockito.cglib.util.ParallelSorter.Generator generator52 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator53 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator53.setUseCache(true);
        boolean boolean56 = generator53.getAttemptLoad();
        boolean boolean57 = generator53.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy58 = generator53.getStrategy();
        generator52.setStrategy(generatorStrategy58);
        generator46.setStrategy(generatorStrategy58);
        generator10.setStrategy(generatorStrategy58);
        generator0.setStrategy(generatorStrategy58);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter63 = generator0.create();
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator0.getStrategy();
        generator0.setAttemptLoad(true);
        org.mockito.cglib.util.ParallelSorter.Generator generator9 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator9.setUseCache(true);
        boolean boolean12 = generator9.getAttemptLoad();
        boolean boolean13 = generator9.getUseCache();
        generator9.setAttemptLoad(true);
        generator9.setUseCache(true);
        generator9.setAttemptLoad(true);
        generator9.setUseCache(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy22 = generator9.getStrategy();
        java.lang.ClassLoader classLoader23 = generator9.getClassLoader();
        generator0.setClassLoader(classLoader23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter25 = generator0.create();
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        generator0.setUseCache(true);
        generator0.setUseCache(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = generator0.getStrategy();
        generator0.setAttemptLoad(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter14 = generator0.create();
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator1 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator1.setUseCache(true);
        boolean boolean4 = generator1.getAttemptLoad();
        boolean boolean5 = generator1.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator1.getStrategy();
        generator0.setStrategy(generatorStrategy6);
        org.mockito.cglib.util.ParallelSorter.Generator generator8 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator8.setUseCache(true);
        boolean boolean11 = generator8.getAttemptLoad();
        boolean boolean12 = generator8.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator8.getStrategy();
        generator0.setStrategy(generatorStrategy13);
        generator0.setAttemptLoad(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy17 = generator0.getStrategy();
        boolean boolean18 = generator0.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter19 = generator0.create();
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        java.util.Comparator<java.lang.String> strComparator0 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator1 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator2 = strComparator0.thenComparing(strComparator1);
        org.mockito.cglib.util.ParallelSorter.Generator generator3 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator3.setUseCache(true);
        boolean boolean6 = generator3.getAttemptLoad();
        boolean boolean7 = generator3.getUseCache();
        generator3.setAttemptLoad(true);
        generator3.setUseCache(true);
        boolean boolean12 = strComparator0.equals((java.lang.Object) generator3);
        generator3.setAttemptLoad(false);
        boolean boolean15 = generator3.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy16 = generator3.getNamingPolicy();
        generator3.setAttemptLoad(true);
        java.lang.ClassLoader classLoader19 = generator3.getClassLoader();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter20 = generator3.create();
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        java.lang.ClassLoader classLoader3 = generator0.getClassLoader();
        boolean boolean4 = generator0.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter5 = generator0.create();
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator1 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator1.setUseCache(true);
        boolean boolean4 = generator1.getAttemptLoad();
        boolean boolean5 = generator1.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator1.getStrategy();
        generator0.setStrategy(generatorStrategy6);
        generator0.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy10 = generator0.getNamingPolicy();
        org.mockito.cglib.util.ParallelSorter.Generator generator11 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator11.setUseCache(true);
        boolean boolean14 = generator11.getAttemptLoad();
        boolean boolean15 = generator11.getUseCache();
        generator11.setAttemptLoad(true);
        generator11.setUseCache(true);
        generator11.setUseCache(false);
        generator11.setUseCache(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy24 = generator11.getStrategy();
        generator0.setStrategy(generatorStrategy24);
        generator0.setAttemptLoad(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter28 = generator0.create();
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        java.lang.ClassLoader classLoader4 = generator0.getClassLoader();
        generator0.setUseCache(true);
        generator0.setAttemptLoad(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter9 = generator0.create();
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = generator0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = generator0.getNamingPolicy();
        boolean boolean7 = generator0.getAttemptLoad();
        generator0.setAttemptLoad(false);
        boolean boolean10 = generator0.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter11 = generator0.create();
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        org.mockito.cglib.util.ParallelSorter.Generator generator3 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator4 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator4.setUseCache(true);
        boolean boolean7 = generator4.getAttemptLoad();
        boolean boolean8 = generator4.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = generator4.getStrategy();
        generator3.setStrategy(generatorStrategy9);
        org.mockito.cglib.util.ParallelSorter.Generator generator11 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator11.setUseCache(true);
        boolean boolean14 = generator11.getAttemptLoad();
        boolean boolean15 = generator11.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = generator11.getStrategy();
        generator3.setStrategy(generatorStrategy16);
        generator0.setStrategy(generatorStrategy16);
        boolean boolean19 = generator0.getAttemptLoad();
        org.mockito.cglib.util.ParallelSorter.Generator generator20 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator21 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator21.setUseCache(true);
        boolean boolean24 = generator21.getAttemptLoad();
        boolean boolean25 = generator21.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy26 = generator21.getStrategy();
        generator20.setStrategy(generatorStrategy26);
        org.mockito.cglib.util.ParallelSorter.Generator generator28 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator28.setUseCache(true);
        boolean boolean31 = generator28.getAttemptLoad();
        boolean boolean32 = generator28.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy33 = generator28.getStrategy();
        generator20.setStrategy(generatorStrategy33);
        generator20.setAttemptLoad(false);
        boolean boolean37 = generator20.getUseCache();
        java.lang.ClassLoader classLoader38 = generator20.getClassLoader();
        generator0.setClassLoader(classLoader38);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter40 = generator0.create();
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator1 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator1.setUseCache(true);
        boolean boolean4 = generator1.getAttemptLoad();
        boolean boolean5 = generator1.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator1.getStrategy();
        generator0.setStrategy(generatorStrategy6);
        org.mockito.cglib.util.ParallelSorter.Generator generator8 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator8.setUseCache(true);
        boolean boolean11 = generator8.getAttemptLoad();
        boolean boolean12 = generator8.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator8.getStrategy();
        generator0.setStrategy(generatorStrategy13);
        generator0.setAttemptLoad(false);
        boolean boolean17 = generator0.getUseCache();
        java.lang.ClassLoader classLoader18 = generator0.getClassLoader();
        boolean boolean19 = generator0.getUseCache();
        boolean boolean20 = generator0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy21 = generator0.getStrategy();
        java.lang.ClassLoader classLoader22 = generator0.getClassLoader();
        java.lang.ClassLoader classLoader23 = generator0.getClassLoader();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter24 = generator0.create();
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        generator0.setUseCache(true);
        generator0.setAttemptLoad(true);
        boolean boolean11 = generator0.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter12 = generator0.create();
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = generator0.getStrategy();
        org.mockito.cglib.util.ParallelSorter.Generator generator6 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator6.setUseCache(true);
        boolean boolean9 = generator6.getAttemptLoad();
        boolean boolean10 = generator6.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = generator6.getStrategy();
        generator0.setStrategy(generatorStrategy11);
        java.lang.ClassLoader classLoader13 = generator0.getClassLoader();
        generator0.setUseCache(false);
        org.mockito.cglib.util.ParallelSorter.Generator generator16 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator16.setUseCache(true);
        boolean boolean19 = generator16.getAttemptLoad();
        boolean boolean20 = generator16.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy21 = generator16.getStrategy();
        org.mockito.cglib.util.ParallelSorter.Generator generator22 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator22.setUseCache(true);
        boolean boolean25 = generator22.getAttemptLoad();
        boolean boolean26 = generator22.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy27 = generator22.getStrategy();
        generator16.setStrategy(generatorStrategy27);
        java.lang.ClassLoader classLoader29 = generator16.getClassLoader();
        generator0.setClassLoader(classLoader29);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy31 = generator0.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter32 = generator0.create();
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        org.mockito.cglib.util.ParallelSorter.Generator generator3 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator4 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator4.setUseCache(true);
        boolean boolean7 = generator4.getAttemptLoad();
        boolean boolean8 = generator4.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = generator4.getStrategy();
        generator3.setStrategy(generatorStrategy9);
        org.mockito.cglib.util.ParallelSorter.Generator generator11 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator11.setUseCache(true);
        boolean boolean14 = generator11.getAttemptLoad();
        boolean boolean15 = generator11.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = generator11.getStrategy();
        generator3.setStrategy(generatorStrategy16);
        generator0.setStrategy(generatorStrategy16);
        boolean boolean19 = generator0.getAttemptLoad();
        org.mockito.cglib.util.ParallelSorter.Generator generator20 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator21 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator21.setUseCache(true);
        boolean boolean24 = generator21.getAttemptLoad();
        boolean boolean25 = generator21.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy26 = generator21.getStrategy();
        generator20.setStrategy(generatorStrategy26);
        org.mockito.cglib.util.ParallelSorter.Generator generator28 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator28.setUseCache(true);
        boolean boolean31 = generator28.getAttemptLoad();
        boolean boolean32 = generator28.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy33 = generator28.getStrategy();
        generator20.setStrategy(generatorStrategy33);
        generator20.setAttemptLoad(false);
        boolean boolean37 = generator20.getUseCache();
        java.lang.ClassLoader classLoader38 = generator20.getClassLoader();
        generator0.setClassLoader(classLoader38);
        org.mockito.cglib.util.ParallelSorter.Generator generator40 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy41 = generator40.getStrategy();
        java.lang.ClassLoader classLoader42 = generator40.getClassLoader();
        generator0.setClassLoader(classLoader42);
        boolean boolean44 = generator0.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter45 = generator0.create();
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        org.mockito.cglib.util.ParallelSorter.Generator generator3 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator4 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator4.setUseCache(true);
        boolean boolean7 = generator4.getAttemptLoad();
        boolean boolean8 = generator4.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = generator4.getStrategy();
        generator3.setStrategy(generatorStrategy9);
        org.mockito.cglib.util.ParallelSorter.Generator generator11 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator11.setUseCache(true);
        boolean boolean14 = generator11.getAttemptLoad();
        boolean boolean15 = generator11.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = generator11.getStrategy();
        generator3.setStrategy(generatorStrategy16);
        generator0.setStrategy(generatorStrategy16);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy19 = generator0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy20 = generator0.getNamingPolicy();
        java.lang.ClassLoader classLoader21 = generator0.getClassLoader();
        org.mockito.cglib.util.ParallelSorter.Generator generator22 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator22.setUseCache(true);
        boolean boolean25 = generator22.getAttemptLoad();
        boolean boolean26 = generator22.getUseCache();
        generator22.setAttemptLoad(true);
        generator22.setUseCache(true);
        generator22.setAttemptLoad(true);
        generator22.setUseCache(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy35 = generator22.getStrategy();
        generator0.setStrategy(generatorStrategy35);
        generator0.setUseCache(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy39 = generator0.getStrategy();
        boolean boolean40 = generator0.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter41 = generator0.create();
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        generator0.setUseCache(true);
        generator0.setAttemptLoad(true);
        generator0.setUseCache(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator0.getStrategy();
        java.lang.ClassLoader classLoader14 = generator0.getClassLoader();
        org.mockito.cglib.util.ParallelSorter.Generator generator15 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = generator15.getStrategy();
        java.lang.ClassLoader classLoader17 = generator15.getClassLoader();
        generator15.setUseCache(false);
        org.mockito.cglib.util.ParallelSorter.Generator generator20 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator20.setUseCache(true);
        boolean boolean23 = generator20.getAttemptLoad();
        boolean boolean24 = generator20.getUseCache();
        org.mockito.cglib.util.ParallelSorter.Generator generator25 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator25.setUseCache(true);
        boolean boolean28 = generator25.getAttemptLoad();
        boolean boolean29 = generator25.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy30 = generator25.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy31 = generator25.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy32 = generator25.getStrategy();
        generator20.setStrategy(generatorStrategy32);
        org.mockito.cglib.util.ParallelSorter.Generator generator34 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator34.setUseCache(true);
        boolean boolean37 = generator34.getAttemptLoad();
        boolean boolean38 = generator34.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy39 = generator34.getStrategy();
        org.mockito.cglib.util.ParallelSorter.Generator generator40 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator40.setUseCache(true);
        boolean boolean43 = generator40.getAttemptLoad();
        boolean boolean44 = generator40.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy45 = generator40.getStrategy();
        generator34.setStrategy(generatorStrategy45);
        java.lang.ClassLoader classLoader47 = generator34.getClassLoader();
        generator34.setUseCache(false);
        org.mockito.cglib.util.ParallelSorter.Generator generator50 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator50.setUseCache(true);
        boolean boolean53 = generator50.getAttemptLoad();
        boolean boolean54 = generator50.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy55 = generator50.getStrategy();
        org.mockito.cglib.util.ParallelSorter.Generator generator56 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator56.setUseCache(true);
        boolean boolean59 = generator56.getAttemptLoad();
        boolean boolean60 = generator56.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy61 = generator56.getStrategy();
        generator50.setStrategy(generatorStrategy61);
        java.lang.ClassLoader classLoader63 = generator50.getClassLoader();
        generator34.setClassLoader(classLoader63);
        generator20.setClassLoader(classLoader63);
        generator15.setClassLoader(classLoader63);
        generator0.setClassLoader(classLoader63);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter68 = generator0.create();
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        generator0.setUseCache(true);
        generator0.setUseCache(false);
        boolean boolean11 = generator0.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy12 = generator0.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy13 = generator0.getNamingPolicy();
        boolean boolean14 = generator0.getAttemptLoad();
        boolean boolean15 = generator0.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter16 = generator0.create();
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = generator0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = generator0.getNamingPolicy();
        org.mockito.cglib.util.ParallelSorter.Generator generator4 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator4.setUseCache(true);
        java.lang.ClassLoader classLoader7 = generator4.getClassLoader();
        org.mockito.cglib.util.ParallelSorter.Generator generator8 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator8.setUseCache(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = generator8.getStrategy();
        generator4.setStrategy(generatorStrategy11);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator4.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy14 = generator4.getNamingPolicy();
        generator0.setNamingPolicy(namingPolicy14);
        org.mockito.cglib.core.NamingPolicy namingPolicy16 = generator0.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter17 = generator0.create();
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        org.mockito.cglib.util.ParallelSorter.Generator generator3 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator4 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator4.setUseCache(true);
        boolean boolean7 = generator4.getAttemptLoad();
        boolean boolean8 = generator4.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = generator4.getStrategy();
        generator3.setStrategy(generatorStrategy9);
        org.mockito.cglib.util.ParallelSorter.Generator generator11 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator11.setUseCache(true);
        boolean boolean14 = generator11.getAttemptLoad();
        boolean boolean15 = generator11.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = generator11.getStrategy();
        generator3.setStrategy(generatorStrategy16);
        generator0.setStrategy(generatorStrategy16);
        org.mockito.cglib.util.ParallelSorter.Generator generator19 = new org.mockito.cglib.util.ParallelSorter.Generator();
        boolean boolean20 = generator19.getAttemptLoad();
        java.lang.ClassLoader classLoader21 = generator19.getClassLoader();
        generator0.setClassLoader(classLoader21);
        org.mockito.cglib.util.ParallelSorter.Generator generator23 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator23.setUseCache(true);
        org.mockito.cglib.util.ParallelSorter.Generator generator26 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator27 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator27.setUseCache(true);
        boolean boolean30 = generator27.getAttemptLoad();
        boolean boolean31 = generator27.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy32 = generator27.getStrategy();
        generator26.setStrategy(generatorStrategy32);
        org.mockito.cglib.util.ParallelSorter.Generator generator34 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator34.setUseCache(true);
        boolean boolean37 = generator34.getAttemptLoad();
        boolean boolean38 = generator34.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy39 = generator34.getStrategy();
        generator26.setStrategy(generatorStrategy39);
        generator23.setStrategy(generatorStrategy39);
        boolean boolean42 = generator23.getUseCache();
        org.mockito.cglib.util.ParallelSorter.Generator generator43 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy44 = generator43.getStrategy();
        generator43.setUseCache(true);
        generator43.setUseCache(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy49 = generator43.getStrategy();
        generator23.setStrategy(generatorStrategy49);
        boolean boolean51 = generator23.getAttemptLoad();
        java.lang.ClassLoader classLoader52 = generator23.getClassLoader();
        generator0.setClassLoader(classLoader52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter54 = generator0.create();
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = generator0.getStrategy();
        org.mockito.cglib.util.ParallelSorter.Generator generator6 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator6.setUseCache(true);
        boolean boolean9 = generator6.getAttemptLoad();
        boolean boolean10 = generator6.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = generator6.getStrategy();
        generator0.setStrategy(generatorStrategy11);
        java.lang.ClassLoader classLoader13 = generator0.getClassLoader();
        generator0.setUseCache(false);
        org.mockito.cglib.util.ParallelSorter.Generator generator16 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator16.setUseCache(true);
        boolean boolean19 = generator16.getAttemptLoad();
        boolean boolean20 = generator16.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy21 = generator16.getStrategy();
        org.mockito.cglib.util.ParallelSorter.Generator generator22 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator22.setUseCache(true);
        boolean boolean25 = generator22.getAttemptLoad();
        boolean boolean26 = generator22.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy27 = generator22.getStrategy();
        generator16.setStrategy(generatorStrategy27);
        java.lang.ClassLoader classLoader29 = generator16.getClassLoader();
        generator0.setClassLoader(classLoader29);
        org.mockito.cglib.util.ParallelSorter.Generator generator31 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator31.setUseCache(true);
        boolean boolean34 = generator31.getAttemptLoad();
        boolean boolean35 = generator31.getUseCache();
        generator31.setAttemptLoad(true);
        boolean boolean38 = generator31.getUseCache();
        generator31.setAttemptLoad(true);
        generator31.setUseCache(true);
        org.mockito.cglib.util.ParallelSorter.Generator generator43 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator43.setUseCache(true);
        boolean boolean46 = generator43.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy47 = generator43.getStrategy();
        generator31.setStrategy(generatorStrategy47);
        generator0.setStrategy(generatorStrategy47);
        java.lang.ClassLoader classLoader50 = generator0.getClassLoader();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter51 = generator0.create();
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator1 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator1.setUseCache(true);
        boolean boolean4 = generator1.getAttemptLoad();
        boolean boolean5 = generator1.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator1.getStrategy();
        generator0.setStrategy(generatorStrategy6);
        org.mockito.cglib.util.ParallelSorter.Generator generator8 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator8.setUseCache(true);
        boolean boolean11 = generator8.getAttemptLoad();
        boolean boolean12 = generator8.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator8.getStrategy();
        generator0.setStrategy(generatorStrategy13);
        generator0.setAttemptLoad(false);
        boolean boolean17 = generator0.getUseCache();
        java.lang.ClassLoader classLoader18 = generator0.getClassLoader();
        boolean boolean19 = generator0.getUseCache();
        boolean boolean20 = generator0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy21 = generator0.getStrategy();
        boolean boolean22 = generator0.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy23 = generator0.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter24 = generator0.create();
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        org.mockito.cglib.util.ParallelSorter.Generator generator3 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator4 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator4.setUseCache(true);
        boolean boolean7 = generator4.getAttemptLoad();
        boolean boolean8 = generator4.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = generator4.getStrategy();
        generator3.setStrategy(generatorStrategy9);
        org.mockito.cglib.util.ParallelSorter.Generator generator11 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator11.setUseCache(true);
        boolean boolean14 = generator11.getAttemptLoad();
        boolean boolean15 = generator11.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = generator11.getStrategy();
        generator3.setStrategy(generatorStrategy16);
        generator0.setStrategy(generatorStrategy16);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy19 = generator0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy20 = generator0.getNamingPolicy();
        java.lang.ClassLoader classLoader21 = generator0.getClassLoader();
        org.mockito.cglib.util.ParallelSorter.Generator generator22 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator22.setUseCache(true);
        boolean boolean25 = generator22.getAttemptLoad();
        boolean boolean26 = generator22.getUseCache();
        generator22.setAttemptLoad(true);
        generator22.setUseCache(true);
        generator22.setAttemptLoad(true);
        generator22.setUseCache(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy35 = generator22.getStrategy();
        generator0.setStrategy(generatorStrategy35);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy37 = generator0.getStrategy();
        boolean boolean38 = generator0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy39 = generator0.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter40 = generator0.create();
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        org.mockito.cglib.util.ParallelSorter.Generator generator3 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator4 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator4.setUseCache(true);
        boolean boolean7 = generator4.getAttemptLoad();
        boolean boolean8 = generator4.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = generator4.getStrategy();
        generator3.setStrategy(generatorStrategy9);
        org.mockito.cglib.util.ParallelSorter.Generator generator11 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator11.setUseCache(true);
        boolean boolean14 = generator11.getAttemptLoad();
        boolean boolean15 = generator11.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = generator11.getStrategy();
        generator3.setStrategy(generatorStrategy16);
        generator0.setStrategy(generatorStrategy16);
        boolean boolean19 = generator0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy20 = generator0.getStrategy();
        generator0.setUseCache(false);
        java.lang.ClassLoader classLoader23 = generator0.getClassLoader();
        boolean boolean24 = generator0.getUseCache();
        generator0.setUseCache(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter27 = generator0.create();
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = generator0.getStrategy();
        java.lang.ClassLoader classLoader2 = generator0.getClassLoader();
        generator0.setUseCache(false);
        boolean boolean5 = generator0.getUseCache();
        java.lang.ClassLoader classLoader6 = generator0.getClassLoader();
        java.lang.ClassLoader classLoader7 = generator0.getClassLoader();
        org.mockito.cglib.core.NamingPolicy namingPolicy8 = generator0.getNamingPolicy();
        boolean boolean9 = generator0.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter10 = generator0.create();
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = generator0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = generator0.getNamingPolicy();
        java.lang.ClassLoader classLoader7 = generator0.getClassLoader();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter8 = generator0.create();
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        generator0.setUseCache(true);
        generator0.setAttemptLoad(true);
        boolean boolean11 = generator0.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy12 = generator0.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy13 = generator0.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter14 = generator0.create();
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        java.lang.ClassLoader classLoader2 = generator0.getClassLoader();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter3 = generator0.create();
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = generator0.getStrategy();
        org.mockito.cglib.util.ParallelSorter.Generator generator6 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator6.setUseCache(true);
        boolean boolean9 = generator6.getAttemptLoad();
        boolean boolean10 = generator6.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = generator6.getStrategy();
        generator0.setStrategy(generatorStrategy11);
        java.lang.ClassLoader classLoader13 = generator0.getClassLoader();
        org.mockito.cglib.core.NamingPolicy namingPolicy14 = generator0.getNamingPolicy();
        generator0.setUseCache(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter17 = generator0.create();
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = generator0.getStrategy();
        java.lang.ClassLoader classLoader2 = generator0.getClassLoader();
        generator0.setUseCache(false);
        boolean boolean5 = generator0.getUseCache();
        boolean boolean6 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = generator0.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter8 = generator0.create();
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = generator0.getStrategy();
        java.lang.ClassLoader classLoader2 = generator0.getClassLoader();
        java.lang.ClassLoader classLoader3 = generator0.getClassLoader();
        boolean boolean4 = generator0.getUseCache();
        boolean boolean5 = generator0.getAttemptLoad();
        generator0.setAttemptLoad(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter8 = generator0.create();
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        java.util.Comparator<java.lang.String> strComparator0 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator1 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator2 = strComparator0.thenComparing(strComparator1);
        org.mockito.cglib.util.ParallelSorter.Generator generator3 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator3.setUseCache(true);
        boolean boolean6 = generator3.getAttemptLoad();
        boolean boolean7 = generator3.getUseCache();
        generator3.setAttemptLoad(true);
        generator3.setUseCache(true);
        boolean boolean12 = strComparator0.equals((java.lang.Object) generator3);
        generator3.setAttemptLoad(false);
        org.mockito.cglib.util.ParallelSorter.Generator generator15 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = generator15.getStrategy();
        generator15.setUseCache(true);
        generator15.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy21 = generator15.getNamingPolicy();
        generator3.setNamingPolicy(namingPolicy21);
        generator3.setAttemptLoad(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy25 = generator3.getStrategy();
        generator3.setAttemptLoad(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter28 = generator3.create();
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = generator0.getStrategy();
        java.lang.ClassLoader classLoader2 = generator0.getClassLoader();
        generator0.setUseCache(false);
        generator0.setUseCache(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy7 = generator0.getNamingPolicy();
        generator0.setUseCache(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy10 = generator0.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter11 = generator0.create();
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        generator0.setUseCache(true);
        generator0.setUseCache(false);
        boolean boolean11 = generator0.getUseCache();
        java.lang.ClassLoader classLoader12 = generator0.getClassLoader();
        boolean boolean13 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy14 = generator0.getStrategy();
        boolean boolean15 = generator0.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter16 = generator0.create();
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = generator0.getStrategy();
        org.mockito.cglib.util.ParallelSorter.Generator generator6 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator6.setUseCache(true);
        boolean boolean9 = generator6.getAttemptLoad();
        boolean boolean10 = generator6.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = generator6.getStrategy();
        generator0.setStrategy(generatorStrategy11);
        boolean boolean13 = generator0.getAttemptLoad();
        generator0.setUseCache(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy16 = generator0.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter17 = generator0.create();
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        java.lang.ClassLoader classLoader4 = generator0.getClassLoader();
        generator0.setUseCache(true);
        java.lang.ClassLoader classLoader7 = generator0.getClassLoader();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter8 = generator0.create();
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        java.util.Comparator<java.lang.String> strComparator0 = java.util.Comparator.reverseOrder();
        org.mockito.cglib.util.ParallelSorter.Generator generator1 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator1.setUseCache(true);
        boolean boolean4 = strComparator0.equals((java.lang.Object) generator1);
        boolean boolean5 = generator1.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator1.getStrategy();
        boolean boolean7 = generator1.getUseCache();
        java.lang.ClassLoader classLoader8 = generator1.getClassLoader();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter9 = generator1.create();
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        java.lang.ClassLoader classLoader3 = generator0.getClassLoader();
        generator0.setUseCache(false);
        boolean boolean6 = generator0.getAttemptLoad();
        java.lang.ClassLoader classLoader7 = generator0.getClassLoader();
        org.mockito.cglib.core.NamingPolicy namingPolicy8 = generator0.getNamingPolicy();
        boolean boolean9 = generator0.getAttemptLoad();
        boolean boolean10 = generator0.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter11 = generator0.create();
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        java.util.Comparator<java.lang.String> strComparator0 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator1 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator2 = strComparator0.thenComparing(strComparator1);
        org.mockito.cglib.util.ParallelSorter.Generator generator3 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator3.setUseCache(true);
        boolean boolean6 = generator3.getAttemptLoad();
        boolean boolean7 = generator3.getUseCache();
        generator3.setAttemptLoad(true);
        generator3.setUseCache(true);
        boolean boolean12 = strComparator0.equals((java.lang.Object) generator3);
        org.mockito.cglib.util.ParallelSorter.Generator generator13 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator13.setUseCache(true);
        java.lang.ClassLoader classLoader16 = generator13.getClassLoader();
        org.mockito.cglib.util.ParallelSorter.Generator generator17 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator17.setUseCache(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy20 = generator17.getStrategy();
        generator13.setStrategy(generatorStrategy20);
        generator3.setStrategy(generatorStrategy20);
        java.lang.ClassLoader classLoader23 = generator3.getClassLoader();
        generator3.setUseCache(false);
        generator3.setAttemptLoad(true);
        generator3.setAttemptLoad(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter30 = generator3.create();
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        generator0.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy7 = generator0.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy8 = generator0.getNamingPolicy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = generator0.getStrategy();
        boolean boolean10 = generator0.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy11 = generator0.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter12 = generator0.create();
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = generator0.getStrategy();
        generator0.setAttemptLoad(false);
        generator0.setUseCache(false);
        generator0.setUseCache(false);
        generator0.setUseCache(false);
        boolean boolean10 = generator0.getAttemptLoad();
        generator0.setAttemptLoad(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter13 = generator0.create();
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        org.mockito.cglib.util.ParallelSorter.Generator generator7 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy8 = generator7.getStrategy();
        generator0.setStrategy(generatorStrategy8);
        org.mockito.cglib.util.ParallelSorter.Generator generator10 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator10.setUseCache(true);
        java.lang.ClassLoader classLoader13 = generator10.getClassLoader();
        generator0.setClassLoader(classLoader13);
        generator0.setUseCache(false);
        generator0.setAttemptLoad(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter19 = generator0.create();
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        generator0.setUseCache(true);
        generator0.setAttemptLoad(true);
        generator0.setUseCache(false);
        boolean boolean13 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy14 = generator0.getStrategy();
        boolean boolean15 = generator0.getAttemptLoad();
        generator0.setUseCache(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter18 = generator0.create();
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy4 = generator0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy5 = generator0.getNamingPolicy();
        generator0.setAttemptLoad(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter8 = generator0.create();
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        generator0.setUseCache(true);
        generator0.setAttemptLoad(true);
        generator0.setUseCache(true);
        org.mockito.cglib.util.ParallelSorter.Generator generator8 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator8.setUseCache(true);
        boolean boolean11 = generator8.getAttemptLoad();
        boolean boolean12 = generator8.getUseCache();
        generator8.setUseCache(false);
        boolean boolean15 = generator8.getUseCache();
        java.lang.ClassLoader classLoader16 = generator8.getClassLoader();
        generator0.setClassLoader(classLoader16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter18 = generator0.create();
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = generator0.getStrategy();
        org.mockito.cglib.util.ParallelSorter.Generator generator6 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator6.setUseCache(true);
        boolean boolean9 = generator6.getAttemptLoad();
        boolean boolean10 = generator6.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = generator6.getStrategy();
        generator0.setStrategy(generatorStrategy11);
        java.lang.ClassLoader classLoader13 = generator0.getClassLoader();
        org.mockito.cglib.core.NamingPolicy namingPolicy14 = generator0.getNamingPolicy();
        generator0.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy17 = generator0.getNamingPolicy();
        boolean boolean18 = generator0.getAttemptLoad();
        java.lang.ClassLoader classLoader19 = generator0.getClassLoader();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter20 = generator0.create();
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = generator0.getStrategy();
        java.lang.ClassLoader classLoader2 = generator0.getClassLoader();
        generator0.setUseCache(false);
        boolean boolean5 = generator0.getUseCache();
        boolean boolean6 = generator0.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter7 = generator0.create();
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        java.util.Comparator<java.lang.String> strComparator0 = java.util.Comparator.reverseOrder();
        org.mockito.cglib.util.ParallelSorter.Generator generator1 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator1.setUseCache(true);
        boolean boolean4 = generator1.getAttemptLoad();
        boolean boolean5 = generator1.getUseCache();
        org.mockito.cglib.util.ParallelSorter.Generator generator6 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator6.setUseCache(true);
        boolean boolean9 = generator6.getAttemptLoad();
        boolean boolean10 = generator6.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = generator6.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = generator6.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator6.getStrategy();
        generator1.setStrategy(generatorStrategy13);
        boolean boolean15 = strComparator0.equals((java.lang.Object) generator1);
        org.mockito.cglib.core.NamingPolicy namingPolicy16 = generator1.getNamingPolicy();
        generator1.setAttemptLoad(false);
        generator1.setUseCache(false);
        generator1.setUseCache(true);
        org.mockito.cglib.util.ParallelSorter.Generator generator23 = new org.mockito.cglib.util.ParallelSorter.Generator();
        boolean boolean24 = generator23.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy25 = generator23.getStrategy();
        java.lang.ClassLoader classLoader26 = generator23.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy27 = generator23.getStrategy();
        generator1.setStrategy(generatorStrategy27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter29 = generator1.create();
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        org.mockito.cglib.util.ParallelSorter.Generator generator7 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy8 = generator7.getStrategy();
        generator0.setStrategy(generatorStrategy8);
        org.mockito.cglib.util.ParallelSorter.Generator generator10 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator10.setUseCache(true);
        java.lang.ClassLoader classLoader13 = generator10.getClassLoader();
        generator0.setClassLoader(classLoader13);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy15 = generator0.getStrategy();
        generator0.setAttemptLoad(false);
        org.mockito.cglib.util.ParallelSorter.Generator generator18 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator18.setUseCache(true);
        boolean boolean21 = generator18.getAttemptLoad();
        boolean boolean22 = generator18.getUseCache();
        generator18.setAttemptLoad(true);
        org.mockito.cglib.util.ParallelSorter.Generator generator25 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy26 = generator25.getStrategy();
        generator18.setStrategy(generatorStrategy26);
        org.mockito.cglib.util.ParallelSorter.Generator generator28 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator28.setUseCache(true);
        java.lang.ClassLoader classLoader31 = generator28.getClassLoader();
        generator18.setClassLoader(classLoader31);
        boolean boolean33 = generator18.getAttemptLoad();
        java.lang.ClassLoader classLoader34 = generator18.getClassLoader();
        generator0.setClassLoader(classLoader34);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter36 = generator0.create();
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy5 = generator0.getNamingPolicy();
        org.mockito.cglib.util.ParallelSorter.Generator generator6 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator6.setUseCache(true);
        boolean boolean9 = generator6.getAttemptLoad();
        boolean boolean10 = generator6.getUseCache();
        generator6.setAttemptLoad(true);
        org.mockito.cglib.util.ParallelSorter.Generator generator13 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy14 = generator13.getStrategy();
        generator6.setStrategy(generatorStrategy14);
        org.mockito.cglib.util.ParallelSorter.Generator generator16 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator16.setUseCache(true);
        java.lang.ClassLoader classLoader19 = generator16.getClassLoader();
        generator6.setClassLoader(classLoader19);
        generator0.setClassLoader(classLoader19);
        java.lang.ClassLoader classLoader22 = generator0.getClassLoader();
        java.lang.ClassLoader classLoader23 = generator0.getClassLoader();
        generator0.setUseCache(false);
        java.lang.ClassLoader classLoader26 = generator0.getClassLoader();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter27 = generator0.create();
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        java.lang.ClassLoader classLoader3 = generator0.getClassLoader();
        org.mockito.cglib.util.ParallelSorter.Generator generator4 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator4.setUseCache(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = generator4.getStrategy();
        generator0.setStrategy(generatorStrategy7);
        org.mockito.cglib.core.NamingPolicy namingPolicy9 = generator0.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy10 = generator0.getNamingPolicy();
        boolean boolean11 = generator0.getAttemptLoad();
        boolean boolean12 = generator0.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter13 = generator0.create();
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        java.lang.ClassLoader classLoader2 = generator0.getClassLoader();
        boolean boolean3 = generator0.getAttemptLoad();
        java.lang.ClassLoader classLoader4 = generator0.getClassLoader();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter5 = generator0.create();
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy5 = generator0.getNamingPolicy();
        org.mockito.cglib.util.ParallelSorter.Generator generator6 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator6.setUseCache(true);
        boolean boolean9 = generator6.getAttemptLoad();
        boolean boolean10 = generator6.getUseCache();
        generator6.setAttemptLoad(true);
        org.mockito.cglib.util.ParallelSorter.Generator generator13 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy14 = generator13.getStrategy();
        generator6.setStrategy(generatorStrategy14);
        org.mockito.cglib.util.ParallelSorter.Generator generator16 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator16.setUseCache(true);
        java.lang.ClassLoader classLoader19 = generator16.getClassLoader();
        generator6.setClassLoader(classLoader19);
        generator0.setClassLoader(classLoader19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter22 = generator0.create();
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator0.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter7 = generator0.create();
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        org.mockito.cglib.util.ParallelSorter.Generator generator7 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy8 = generator7.getStrategy();
        generator0.setStrategy(generatorStrategy8);
        org.mockito.cglib.util.ParallelSorter.Generator generator10 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator10.setUseCache(true);
        java.lang.ClassLoader classLoader13 = generator10.getClassLoader();
        generator0.setClassLoader(classLoader13);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy15 = generator0.getStrategy();
        java.util.Comparator<java.lang.String> strComparator16 = java.util.Comparator.reverseOrder();
        org.mockito.cglib.util.ParallelSorter.Generator generator17 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator17.setUseCache(true);
        boolean boolean20 = generator17.getAttemptLoad();
        boolean boolean21 = generator17.getUseCache();
        org.mockito.cglib.util.ParallelSorter.Generator generator22 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator22.setUseCache(true);
        boolean boolean25 = generator22.getAttemptLoad();
        boolean boolean26 = generator22.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy27 = generator22.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy28 = generator22.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy29 = generator22.getStrategy();
        generator17.setStrategy(generatorStrategy29);
        boolean boolean31 = strComparator16.equals((java.lang.Object) generator17);
        org.mockito.cglib.core.NamingPolicy namingPolicy32 = generator17.getNamingPolicy();
        generator17.setAttemptLoad(false);
        java.lang.ClassLoader classLoader35 = generator17.getClassLoader();
        generator0.setClassLoader(classLoader35);
        boolean boolean37 = generator0.getAttemptLoad();
        generator0.setAttemptLoad(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter40 = generator0.create();
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        boolean boolean7 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        generator0.setUseCache(true);
        java.lang.ClassLoader classLoader12 = generator0.getClassLoader();
        org.mockito.cglib.util.ParallelSorter.Generator generator13 = new org.mockito.cglib.util.ParallelSorter.Generator();
        boolean boolean14 = generator13.getAttemptLoad();
        generator13.setUseCache(true);
        generator13.setAttemptLoad(true);
        generator13.setUseCache(true);
        org.mockito.cglib.util.ParallelSorter.Generator generator21 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator21.setUseCache(true);
        boolean boolean24 = generator21.getAttemptLoad();
        boolean boolean25 = generator21.getUseCache();
        generator21.setUseCache(false);
        boolean boolean28 = generator21.getUseCache();
        java.lang.ClassLoader classLoader29 = generator21.getClassLoader();
        generator13.setClassLoader(classLoader29);
        generator0.setClassLoader(classLoader29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter32 = generator0.create();
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        java.util.Comparator<java.lang.String> strComparator0 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator1 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator2 = strComparator0.thenComparing(strComparator1);
        org.mockito.cglib.util.ParallelSorter.Generator generator3 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator3.setUseCache(true);
        boolean boolean6 = generator3.getAttemptLoad();
        boolean boolean7 = generator3.getUseCache();
        generator3.setAttemptLoad(true);
        generator3.setUseCache(true);
        boolean boolean12 = strComparator0.equals((java.lang.Object) generator3);
        generator3.setAttemptLoad(false);
        boolean boolean15 = generator3.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy16 = generator3.getNamingPolicy();
        generator3.setAttemptLoad(true);
        java.lang.ClassLoader classLoader19 = generator3.getClassLoader();
        org.mockito.cglib.core.NamingPolicy namingPolicy20 = generator3.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter21 = generator3.create();
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        boolean boolean2 = generator0.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter3 = generator0.create();
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator1 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator1.setUseCache(true);
        boolean boolean4 = generator1.getAttemptLoad();
        boolean boolean5 = generator1.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator1.getStrategy();
        generator0.setStrategy(generatorStrategy6);
        org.mockito.cglib.util.ParallelSorter.Generator generator8 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator8.setUseCache(true);
        boolean boolean11 = generator8.getAttemptLoad();
        boolean boolean12 = generator8.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator8.getStrategy();
        generator0.setStrategy(generatorStrategy13);
        generator0.setAttemptLoad(false);
        boolean boolean17 = generator0.getUseCache();
        java.lang.ClassLoader classLoader18 = generator0.getClassLoader();
        generator0.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy21 = generator0.getNamingPolicy();
        boolean boolean22 = generator0.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy23 = generator0.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter24 = generator0.create();
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        generator0.setUseCache(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = generator0.getNamingPolicy();
        boolean boolean7 = generator0.getUseCache();
        boolean boolean8 = generator0.getUseCache();
        boolean boolean9 = generator0.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter10 = generator0.create();
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        generator0.setUseCache(true);
        generator0.setAttemptLoad(true);
        boolean boolean11 = generator0.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy12 = generator0.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy13 = generator0.getNamingPolicy();
        java.lang.ClassLoader classLoader14 = generator0.getClassLoader();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter15 = generator0.create();
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = generator0.getStrategy();
        boolean boolean8 = generator0.getAttemptLoad();
        boolean boolean9 = generator0.getAttemptLoad();
        generator0.setUseCache(false);
        boolean boolean12 = generator0.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter13 = generator0.create();
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = generator0.getStrategy();
        boolean boolean8 = generator0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = generator0.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter10 = generator0.create();
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        generator0.setUseCache(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy7 = generator0.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter8 = generator0.create();
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy4 = generator0.getNamingPolicy();
        boolean boolean5 = generator0.getAttemptLoad();
        java.util.Comparator<java.lang.String> strComparator6 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator7 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator8 = strComparator6.thenComparing(strComparator7);
        org.mockito.cglib.util.ParallelSorter.Generator generator9 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator9.setUseCache(true);
        boolean boolean12 = generator9.getAttemptLoad();
        boolean boolean13 = generator9.getUseCache();
        generator9.setAttemptLoad(true);
        generator9.setUseCache(true);
        boolean boolean18 = strComparator6.equals((java.lang.Object) generator9);
        org.mockito.cglib.util.ParallelSorter.Generator generator19 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator19.setUseCache(true);
        java.lang.ClassLoader classLoader22 = generator19.getClassLoader();
        org.mockito.cglib.util.ParallelSorter.Generator generator23 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator23.setUseCache(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy26 = generator23.getStrategy();
        generator19.setStrategy(generatorStrategy26);
        generator9.setStrategy(generatorStrategy26);
        java.lang.ClassLoader classLoader29 = generator9.getClassLoader();
        generator0.setClassLoader(classLoader29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter31 = generator0.create();
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = generator0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = generator0.getNamingPolicy();
        java.lang.ClassLoader classLoader7 = generator0.getClassLoader();
        boolean boolean8 = generator0.getUseCache();
        boolean boolean9 = generator0.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter10 = generator0.create();
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = generator0.getStrategy();
        java.lang.ClassLoader classLoader2 = generator0.getClassLoader();
        generator0.setUseCache(false);
        boolean boolean5 = generator0.getUseCache();
        java.lang.ClassLoader classLoader6 = generator0.getClassLoader();
        boolean boolean7 = generator0.getUseCache();
        java.lang.ClassLoader classLoader8 = generator0.getClassLoader();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter9 = generator0.create();
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        java.util.Comparator<java.lang.String> strComparator0 = java.util.Comparator.reverseOrder();
        org.mockito.cglib.util.ParallelSorter.Generator generator1 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator1.setUseCache(true);
        boolean boolean4 = generator1.getAttemptLoad();
        boolean boolean5 = generator1.getUseCache();
        org.mockito.cglib.util.ParallelSorter.Generator generator6 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator6.setUseCache(true);
        boolean boolean9 = generator6.getAttemptLoad();
        boolean boolean10 = generator6.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = generator6.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = generator6.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator6.getStrategy();
        generator1.setStrategy(generatorStrategy13);
        boolean boolean15 = strComparator0.equals((java.lang.Object) generator1);
        org.mockito.cglib.core.NamingPolicy namingPolicy16 = generator1.getNamingPolicy();
        generator1.setAttemptLoad(false);
        boolean boolean19 = generator1.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter20 = generator1.create();
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        org.mockito.cglib.util.ParallelSorter.Generator generator7 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy8 = generator7.getStrategy();
        generator0.setStrategy(generatorStrategy8);
        java.lang.ClassLoader classLoader10 = generator0.getClassLoader();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter11 = generator0.create();
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator1 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator1.setUseCache(true);
        boolean boolean4 = generator1.getAttemptLoad();
        boolean boolean5 = generator1.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator1.getStrategy();
        generator0.setStrategy(generatorStrategy6);
        boolean boolean8 = generator0.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy9 = generator0.getNamingPolicy();
        boolean boolean10 = generator0.getAttemptLoad();
        generator0.setAttemptLoad(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter13 = generator0.create();
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = generator0.getStrategy();
        generator0.setUseCache(true);
        generator0.setAttemptLoad(false);
        boolean boolean6 = generator0.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter7 = generator0.create();
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = generator0.getStrategy();
        java.lang.ClassLoader classLoader2 = generator0.getClassLoader();
        generator0.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy5 = generator0.getNamingPolicy();
        org.mockito.cglib.util.ParallelSorter.Generator generator6 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator7 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator7.setUseCache(true);
        boolean boolean10 = generator7.getAttemptLoad();
        boolean boolean11 = generator7.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = generator7.getStrategy();
        generator6.setStrategy(generatorStrategy12);
        generator0.setStrategy(generatorStrategy12);
        generator0.setAttemptLoad(true);
        boolean boolean17 = generator0.getAttemptLoad();
        boolean boolean18 = generator0.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy19 = generator0.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter20 = generator0.create();
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        org.mockito.cglib.util.ParallelSorter.Generator generator7 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy8 = generator7.getStrategy();
        generator0.setStrategy(generatorStrategy8);
        org.mockito.cglib.util.ParallelSorter.Generator generator10 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator10.setUseCache(true);
        java.lang.ClassLoader classLoader13 = generator10.getClassLoader();
        generator0.setClassLoader(classLoader13);
        boolean boolean15 = generator0.getAttemptLoad();
        boolean boolean16 = generator0.getUseCache();
        java.lang.ClassLoader classLoader17 = generator0.getClassLoader();
        boolean boolean18 = generator0.getAttemptLoad();
        boolean boolean19 = generator0.getUseCache();
        java.lang.ClassLoader classLoader20 = generator0.getClassLoader();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter21 = generator0.create();
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = generator0.getStrategy();
        org.mockito.cglib.util.ParallelSorter.Generator generator6 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator6.setUseCache(true);
        boolean boolean9 = generator6.getAttemptLoad();
        boolean boolean10 = generator6.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = generator6.getStrategy();
        generator0.setStrategy(generatorStrategy11);
        java.lang.ClassLoader classLoader13 = generator0.getClassLoader();
        generator0.setUseCache(false);
        org.mockito.cglib.util.ParallelSorter.Generator generator16 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator16.setUseCache(true);
        boolean boolean19 = generator16.getAttemptLoad();
        boolean boolean20 = generator16.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy21 = generator16.getStrategy();
        org.mockito.cglib.util.ParallelSorter.Generator generator22 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator22.setUseCache(true);
        boolean boolean25 = generator22.getAttemptLoad();
        boolean boolean26 = generator22.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy27 = generator22.getStrategy();
        generator16.setStrategy(generatorStrategy27);
        java.lang.ClassLoader classLoader29 = generator16.getClassLoader();
        generator0.setClassLoader(classLoader29);
        boolean boolean31 = generator0.getAttemptLoad();
        boolean boolean32 = generator0.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy33 = generator0.getNamingPolicy();
        generator0.setAttemptLoad(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy36 = generator0.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter37 = generator0.create();
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator1 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator1.setUseCache(true);
        boolean boolean4 = generator1.getAttemptLoad();
        boolean boolean5 = generator1.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator1.getStrategy();
        generator0.setStrategy(generatorStrategy6);
        org.mockito.cglib.util.ParallelSorter.Generator generator8 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator8.setUseCache(true);
        boolean boolean11 = generator8.getAttemptLoad();
        boolean boolean12 = generator8.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator8.getStrategy();
        generator0.setStrategy(generatorStrategy13);
        generator0.setAttemptLoad(true);
        java.lang.ClassLoader classLoader17 = generator0.getClassLoader();
        java.lang.ClassLoader classLoader18 = generator0.getClassLoader();
        org.mockito.cglib.core.NamingPolicy namingPolicy19 = generator0.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy20 = generator0.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter21 = generator0.create();
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        generator0.setUseCache(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = generator0.getStrategy();
        generator0.setAttemptLoad(false);
        generator0.setUseCache(false);
        generator0.setUseCache(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter16 = generator0.create();
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        java.lang.ClassLoader classLoader2 = generator0.getClassLoader();
        java.lang.ClassLoader classLoader3 = generator0.getClassLoader();
        boolean boolean4 = generator0.getAttemptLoad();
        generator0.setAttemptLoad(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter7 = generator0.create();
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        java.lang.ClassLoader classLoader2 = generator0.getClassLoader();
        java.lang.ClassLoader classLoader3 = generator0.getClassLoader();
        org.mockito.cglib.core.NamingPolicy namingPolicy4 = generator0.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy5 = generator0.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter6 = generator0.create();
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        generator0.setAttemptLoad(true);
        boolean boolean9 = generator0.getAttemptLoad();
        org.mockito.cglib.util.ParallelSorter.Generator generator10 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator11 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator11.setUseCache(true);
        boolean boolean14 = generator11.getAttemptLoad();
        boolean boolean15 = generator11.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = generator11.getStrategy();
        generator10.setStrategy(generatorStrategy16);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy18 = generator10.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy19 = generator10.getNamingPolicy();
        generator0.setNamingPolicy(namingPolicy19);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy21 = generator0.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter22 = generator0.create();
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = generator0.getStrategy();
        java.lang.ClassLoader classLoader2 = generator0.getClassLoader();
        generator0.setUseCache(false);
        boolean boolean5 = generator0.getUseCache();
        java.lang.ClassLoader classLoader6 = generator0.getClassLoader();
        boolean boolean7 = generator0.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter8 = generator0.create();
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        java.lang.ClassLoader classLoader2 = generator0.getClassLoader();
        generator0.setUseCache(false);
        generator0.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy7 = generator0.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter8 = generator0.create();
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy5 = generator0.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = generator0.getNamingPolicy();
        boolean boolean7 = generator0.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter8 = generator0.create();
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = generator0.getStrategy();
        java.lang.ClassLoader classLoader2 = generator0.getClassLoader();
        generator0.setUseCache(false);
        boolean boolean5 = generator0.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = generator0.getNamingPolicy();
        generator0.setAttemptLoad(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter9 = generator0.create();
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        generator0.setUseCache(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = generator0.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy7 = generator0.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy8 = generator0.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter9 = generator0.create();
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        java.util.Comparator<java.lang.String> strComparator0 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator1 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator2 = strComparator0.thenComparing(strComparator1);
        java.util.Comparator<java.lang.String> strComparator3 = strComparator0.reversed();
        java.util.Comparator<java.lang.String> strComparator4 = strComparator3.reversed();
        java.util.Comparator<java.lang.String> strComparator5 = strComparator3.reversed();
        org.mockito.cglib.util.ParallelSorter.Generator generator6 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator6.setUseCache(true);
        java.lang.ClassLoader classLoader9 = generator6.getClassLoader();
        org.mockito.cglib.util.ParallelSorter.Generator generator10 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator10.setUseCache(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator10.getStrategy();
        generator6.setStrategy(generatorStrategy13);
        boolean boolean15 = strComparator5.equals((java.lang.Object) generator6);
        java.lang.ClassLoader classLoader16 = generator6.getClassLoader();
        boolean boolean17 = generator6.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter18 = generator6.create();
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        boolean boolean5 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator0.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter7 = generator0.create();
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator1 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator1.setUseCache(true);
        boolean boolean4 = generator1.getAttemptLoad();
        boolean boolean5 = generator1.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator1.getStrategy();
        generator0.setStrategy(generatorStrategy6);
        org.mockito.cglib.util.ParallelSorter.Generator generator8 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator8.setUseCache(true);
        boolean boolean11 = generator8.getAttemptLoad();
        boolean boolean12 = generator8.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator8.getStrategy();
        generator0.setStrategy(generatorStrategy13);
        generator0.setAttemptLoad(false);
        boolean boolean17 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy18 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy19 = generator0.getStrategy();
        boolean boolean20 = generator0.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter21 = generator0.create();
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        java.util.Comparator<java.lang.String> strComparator0 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator1 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator2 = strComparator0.thenComparing(strComparator1);
        org.mockito.cglib.util.ParallelSorter.Generator generator3 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator3.setUseCache(true);
        boolean boolean6 = generator3.getAttemptLoad();
        boolean boolean7 = generator3.getUseCache();
        generator3.setAttemptLoad(true);
        generator3.setUseCache(true);
        boolean boolean12 = strComparator0.equals((java.lang.Object) generator3);
        org.mockito.cglib.util.ParallelSorter.Generator generator13 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator13.setUseCache(true);
        java.lang.ClassLoader classLoader16 = generator13.getClassLoader();
        org.mockito.cglib.util.ParallelSorter.Generator generator17 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator17.setUseCache(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy20 = generator17.getStrategy();
        generator13.setStrategy(generatorStrategy20);
        generator3.setStrategy(generatorStrategy20);
        java.lang.ClassLoader classLoader23 = generator3.getClassLoader();
        generator3.setUseCache(false);
        generator3.setAttemptLoad(true);
        generator3.setAttemptLoad(false);
        generator3.setUseCache(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter32 = generator3.create();
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        java.util.Comparator<java.lang.String> strComparator0 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator1 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator2 = strComparator0.thenComparing(strComparator1);
        org.mockito.cglib.util.ParallelSorter.Generator generator3 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator3.setUseCache(true);
        boolean boolean6 = generator3.getAttemptLoad();
        boolean boolean7 = generator3.getUseCache();
        generator3.setAttemptLoad(true);
        generator3.setUseCache(true);
        boolean boolean12 = strComparator0.equals((java.lang.Object) generator3);
        java.lang.ClassLoader classLoader13 = generator3.getClassLoader();
        generator3.setAttemptLoad(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter16 = generator3.create();
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = generator0.getStrategy();
        java.lang.ClassLoader classLoader2 = generator0.getClassLoader();
        generator0.setUseCache(false);
        generator0.setUseCache(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy7 = generator0.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter8 = generator0.create();
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = generator0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = generator0.getNamingPolicy();
        generator0.setAttemptLoad(false);
        java.lang.ClassLoader classLoader6 = generator0.getClassLoader();
        boolean boolean7 = generator0.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter8 = generator0.create();
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator1 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator1.setUseCache(true);
        boolean boolean4 = generator1.getAttemptLoad();
        boolean boolean5 = generator1.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator1.getStrategy();
        generator0.setStrategy(generatorStrategy6);
        org.mockito.cglib.util.ParallelSorter.Generator generator8 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator8.setUseCache(true);
        boolean boolean11 = generator8.getAttemptLoad();
        boolean boolean12 = generator8.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator8.getStrategy();
        generator0.setStrategy(generatorStrategy13);
        generator0.setAttemptLoad(false);
        boolean boolean17 = generator0.getUseCache();
        java.lang.ClassLoader classLoader18 = generator0.getClassLoader();
        boolean boolean19 = generator0.getUseCache();
        boolean boolean20 = generator0.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy21 = generator0.getNamingPolicy();
        java.lang.ClassLoader classLoader22 = generator0.getClassLoader();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter23 = generator0.create();
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        generator0.setUseCache(true);
        generator0.setUseCache(false);
        generator0.setUseCache(false);
        boolean boolean13 = generator0.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter14 = generator0.create();
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        org.mockito.cglib.util.ParallelSorter.Generator generator7 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy8 = generator7.getStrategy();
        generator0.setStrategy(generatorStrategy8);
        org.mockito.cglib.util.ParallelSorter.Generator generator10 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator10.setUseCache(true);
        java.lang.ClassLoader classLoader13 = generator10.getClassLoader();
        generator0.setClassLoader(classLoader13);
        boolean boolean15 = generator0.getAttemptLoad();
        boolean boolean16 = generator0.getUseCache();
        generator0.setUseCache(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter19 = generator0.create();
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = generator0.getStrategy();
        boolean boolean8 = generator0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = generator0.getStrategy();
        org.mockito.cglib.util.ParallelSorter.Generator generator10 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator10.setUseCache(true);
        boolean boolean13 = generator10.getAttemptLoad();
        boolean boolean14 = generator10.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy15 = generator10.getStrategy();
        org.mockito.cglib.util.ParallelSorter.Generator generator16 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator16.setUseCache(true);
        boolean boolean19 = generator16.getAttemptLoad();
        boolean boolean20 = generator16.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy21 = generator16.getStrategy();
        generator10.setStrategy(generatorStrategy21);
        java.lang.ClassLoader classLoader23 = generator10.getClassLoader();
        generator0.setClassLoader(classLoader23);
        boolean boolean25 = generator0.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter26 = generator0.create();
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        java.lang.ClassLoader classLoader2 = generator0.getClassLoader();
        generator0.setUseCache(false);
        generator0.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy7 = generator0.getNamingPolicy();
        boolean boolean8 = generator0.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter9 = generator0.create();
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        generator0.setUseCache(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy4 = generator0.getStrategy();
        org.mockito.cglib.util.ParallelSorter.Generator generator5 = new org.mockito.cglib.util.ParallelSorter.Generator();
        boolean boolean6 = generator5.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = generator5.getStrategy();
        generator0.setStrategy(generatorStrategy7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter9 = generator0.create();
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator1 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator1.setUseCache(true);
        boolean boolean4 = generator1.getAttemptLoad();
        boolean boolean5 = generator1.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator1.getStrategy();
        generator0.setStrategy(generatorStrategy6);
        org.mockito.cglib.util.ParallelSorter.Generator generator8 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator8.setUseCache(true);
        boolean boolean11 = generator8.getAttemptLoad();
        boolean boolean12 = generator8.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator8.getStrategy();
        generator0.setStrategy(generatorStrategy13);
        generator0.setAttemptLoad(true);
        boolean boolean17 = generator0.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter18 = generator0.create();
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = generator0.getStrategy();
        java.lang.ClassLoader classLoader2 = generator0.getClassLoader();
        generator0.setUseCache(false);
        boolean boolean5 = generator0.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = generator0.getNamingPolicy();
        boolean boolean7 = generator0.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter8 = generator0.create();
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        java.lang.ClassLoader classLoader2 = generator0.getClassLoader();
        java.lang.ClassLoader classLoader3 = generator0.getClassLoader();
        org.mockito.cglib.util.ParallelSorter.Generator generator4 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator5 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator5.setUseCache(true);
        boolean boolean8 = generator5.getAttemptLoad();
        boolean boolean9 = generator5.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy10 = generator5.getStrategy();
        generator4.setStrategy(generatorStrategy10);
        org.mockito.cglib.util.ParallelSorter.Generator generator12 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator12.setUseCache(true);
        boolean boolean15 = generator12.getAttemptLoad();
        boolean boolean16 = generator12.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy17 = generator12.getStrategy();
        generator4.setStrategy(generatorStrategy17);
        generator4.setAttemptLoad(false);
        boolean boolean21 = generator4.getUseCache();
        java.lang.ClassLoader classLoader22 = generator4.getClassLoader();
        boolean boolean23 = generator4.getUseCache();
        boolean boolean24 = generator4.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy25 = generator4.getStrategy();
        java.lang.ClassLoader classLoader26 = generator4.getClassLoader();
        generator0.setClassLoader(classLoader26);
        boolean boolean28 = generator0.getUseCache();
        generator0.setUseCache(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter31 = generator0.create();
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy4 = generator0.getNamingPolicy();
        boolean boolean5 = generator0.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = generator0.getNamingPolicy();
        generator0.setUseCache(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter9 = generator0.create();
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        generator0.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy7 = generator0.getNamingPolicy();
        generator0.setUseCache(true);
        generator0.setUseCache(false);
        generator0.setAttemptLoad(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter14 = generator0.create();
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = generator0.getStrategy();
        org.mockito.cglib.util.ParallelSorter.Generator generator6 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator6.setUseCache(true);
        boolean boolean9 = generator6.getAttemptLoad();
        boolean boolean10 = generator6.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = generator6.getStrategy();
        generator0.setStrategy(generatorStrategy11);
        java.lang.ClassLoader classLoader13 = generator0.getClassLoader();
        generator0.setUseCache(false);
        org.mockito.cglib.util.ParallelSorter.Generator generator16 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator16.setUseCache(true);
        boolean boolean19 = generator16.getAttemptLoad();
        boolean boolean20 = generator16.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy21 = generator16.getStrategy();
        org.mockito.cglib.util.ParallelSorter.Generator generator22 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator22.setUseCache(true);
        boolean boolean25 = generator22.getAttemptLoad();
        boolean boolean26 = generator22.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy27 = generator22.getStrategy();
        generator16.setStrategy(generatorStrategy27);
        java.lang.ClassLoader classLoader29 = generator16.getClassLoader();
        generator0.setClassLoader(classLoader29);
        org.mockito.cglib.util.ParallelSorter.Generator generator31 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator31.setUseCache(true);
        boolean boolean34 = generator31.getAttemptLoad();
        boolean boolean35 = generator31.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy36 = generator31.getNamingPolicy();
        generator0.setNamingPolicy(namingPolicy36);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy38 = generator0.getStrategy();
        boolean boolean39 = generator0.getUseCache();
        boolean boolean40 = generator0.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter41 = generator0.create();
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = generator0.getStrategy();
        boolean boolean8 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = generator0.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter10 = generator0.create();
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        generator0.setUseCache(true);
        generator0.setUseCache(false);
        boolean boolean11 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = generator0.getStrategy();
        boolean boolean13 = generator0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy14 = generator0.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter15 = generator0.create();
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = generator0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = generator0.getNamingPolicy();
        java.lang.ClassLoader classLoader7 = generator0.getClassLoader();
        generator0.setUseCache(true);
        generator0.setUseCache(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter12 = generator0.create();
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        java.lang.ClassLoader classLoader2 = generator0.getClassLoader();
        generator0.setUseCache(false);
        generator0.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy7 = generator0.getNamingPolicy();
        boolean boolean8 = generator0.getUseCache();
        boolean boolean9 = generator0.getUseCache();
        boolean boolean10 = generator0.getUseCache();
        generator0.setUseCache(true);
        boolean boolean13 = generator0.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter14 = generator0.create();
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = generator0.getStrategy();
        java.lang.ClassLoader classLoader2 = generator0.getClassLoader();
        generator0.setUseCache(false);
        boolean boolean5 = generator0.getUseCache();
        java.lang.ClassLoader classLoader6 = generator0.getClassLoader();
        java.lang.ClassLoader classLoader7 = generator0.getClassLoader();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter8 = generator0.create();
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        generator0.setUseCache(true);
        generator0.setAttemptLoad(true);
        generator0.setUseCache(false);
        boolean boolean13 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy14 = generator0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy15 = generator0.getNamingPolicy();
        generator0.setUseCache(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter18 = generator0.create();
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        java.util.Comparator<java.lang.String> strComparator0 = java.util.Comparator.reverseOrder();
        org.mockito.cglib.util.ParallelSorter.Generator generator1 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator1.setUseCache(true);
        boolean boolean4 = strComparator0.equals((java.lang.Object) generator1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter5 = generator1.create();
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = generator0.getStrategy();
        java.lang.ClassLoader classLoader2 = generator0.getClassLoader();
        generator0.setUseCache(false);
        boolean boolean5 = generator0.getUseCache();
        java.lang.ClassLoader classLoader6 = generator0.getClassLoader();
        java.lang.ClassLoader classLoader7 = generator0.getClassLoader();
        org.mockito.cglib.core.NamingPolicy namingPolicy8 = generator0.getNamingPolicy();
        boolean boolean9 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy10 = generator0.getStrategy();
        boolean boolean11 = generator0.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter12 = generator0.create();
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = generator0.getStrategy();
        org.mockito.cglib.util.ParallelSorter.Generator generator6 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator6.setUseCache(true);
        boolean boolean9 = generator6.getAttemptLoad();
        boolean boolean10 = generator6.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = generator6.getStrategy();
        generator0.setStrategy(generatorStrategy11);
        java.lang.ClassLoader classLoader13 = generator0.getClassLoader();
        generator0.setUseCache(false);
        org.mockito.cglib.util.ParallelSorter.Generator generator16 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator16.setUseCache(true);
        boolean boolean19 = generator16.getAttemptLoad();
        boolean boolean20 = generator16.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy21 = generator16.getStrategy();
        org.mockito.cglib.util.ParallelSorter.Generator generator22 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator22.setUseCache(true);
        boolean boolean25 = generator22.getAttemptLoad();
        boolean boolean26 = generator22.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy27 = generator22.getStrategy();
        generator16.setStrategy(generatorStrategy27);
        java.lang.ClassLoader classLoader29 = generator16.getClassLoader();
        generator0.setClassLoader(classLoader29);
        java.lang.ClassLoader classLoader31 = generator0.getClassLoader();
        generator0.setAttemptLoad(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter34 = generator0.create();
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        generator0.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy7 = generator0.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy8 = generator0.getNamingPolicy();
        boolean boolean9 = generator0.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter10 = generator0.create();
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = generator0.getStrategy();
        generator0.setAttemptLoad(false);
        generator0.setUseCache(false);
        boolean boolean6 = generator0.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter7 = generator0.create();
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        java.util.Comparator<java.lang.String> strComparator0 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator1 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator2 = strComparator0.thenComparing(strComparator1);
        org.mockito.cglib.util.ParallelSorter.Generator generator3 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator3.setUseCache(true);
        boolean boolean6 = generator3.getAttemptLoad();
        boolean boolean7 = generator3.getUseCache();
        generator3.setAttemptLoad(true);
        generator3.setUseCache(true);
        boolean boolean12 = strComparator0.equals((java.lang.Object) generator3);
        generator3.setAttemptLoad(false);
        org.mockito.cglib.util.ParallelSorter.Generator generator15 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = generator15.getStrategy();
        generator15.setUseCache(true);
        generator15.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy21 = generator15.getNamingPolicy();
        generator3.setNamingPolicy(namingPolicy21);
        generator3.setAttemptLoad(false);
        generator3.setUseCache(false);
        generator3.setAttemptLoad(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter29 = generator3.create();
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        generator0.setUseCache(true);
        generator0.setUseCache(false);
        boolean boolean11 = generator0.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy12 = generator0.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy13 = generator0.getNamingPolicy();
        boolean boolean14 = generator0.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter15 = generator0.create();
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator1 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator1.setUseCache(true);
        boolean boolean4 = generator1.getAttemptLoad();
        boolean boolean5 = generator1.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator1.getStrategy();
        generator0.setStrategy(generatorStrategy6);
        generator0.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy10 = generator0.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter11 = generator0.create();
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = generator0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = generator0.getNamingPolicy();
        org.mockito.cglib.util.ParallelSorter.Generator generator7 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator7.setUseCache(true);
        boolean boolean10 = generator7.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = generator7.getStrategy();
        generator0.setStrategy(generatorStrategy11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter13 = generator0.create();
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.util.ParallelSorter.Generator generator5 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator5.setUseCache(true);
        boolean boolean8 = generator5.getAttemptLoad();
        boolean boolean9 = generator5.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy10 = generator5.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = generator5.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = generator5.getStrategy();
        generator0.setStrategy(generatorStrategy12);
        generator0.setAttemptLoad(false);
        generator0.setAttemptLoad(true);
        boolean boolean18 = generator0.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter19 = generator0.create();
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy7 = generator0.getNamingPolicy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy8 = generator0.getStrategy();
        java.lang.ClassLoader classLoader9 = generator0.getClassLoader();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter10 = generator0.create();
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        java.lang.ClassLoader classLoader2 = generator0.getClassLoader();
        generator0.setUseCache(false);
        generator0.setUseCache(false);
        boolean boolean7 = generator0.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter8 = generator0.create();
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = generator0.getStrategy();
        org.mockito.cglib.util.ParallelSorter.Generator generator6 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator6.setUseCache(true);
        boolean boolean9 = generator6.getAttemptLoad();
        boolean boolean10 = generator6.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = generator6.getStrategy();
        generator0.setStrategy(generatorStrategy11);
        java.lang.ClassLoader classLoader13 = generator0.getClassLoader();
        org.mockito.cglib.core.NamingPolicy namingPolicy14 = generator0.getNamingPolicy();
        generator0.setUseCache(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy17 = generator0.getStrategy();
        java.lang.ClassLoader classLoader18 = generator0.getClassLoader();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter19 = generator0.create();
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        org.mockito.cglib.util.ParallelSorter.Generator generator3 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator4 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator4.setUseCache(true);
        boolean boolean7 = generator4.getAttemptLoad();
        boolean boolean8 = generator4.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = generator4.getStrategy();
        generator3.setStrategy(generatorStrategy9);
        org.mockito.cglib.util.ParallelSorter.Generator generator11 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator11.setUseCache(true);
        boolean boolean14 = generator11.getAttemptLoad();
        boolean boolean15 = generator11.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = generator11.getStrategy();
        generator3.setStrategy(generatorStrategy16);
        generator0.setStrategy(generatorStrategy16);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy19 = generator0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy20 = generator0.getNamingPolicy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy21 = generator0.getStrategy();
        java.lang.ClassLoader classLoader22 = generator0.getClassLoader();
        org.mockito.cglib.core.NamingPolicy namingPolicy23 = generator0.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter24 = generator0.create();
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = generator0.getStrategy();
        org.mockito.cglib.util.ParallelSorter.Generator generator6 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator6.setUseCache(true);
        boolean boolean9 = generator6.getAttemptLoad();
        boolean boolean10 = generator6.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = generator6.getStrategy();
        generator0.setStrategy(generatorStrategy11);
        java.lang.ClassLoader classLoader13 = generator0.getClassLoader();
        generator0.setUseCache(false);
        org.mockito.cglib.util.ParallelSorter.Generator generator16 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator16.setUseCache(true);
        boolean boolean19 = generator16.getAttemptLoad();
        boolean boolean20 = generator16.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy21 = generator16.getStrategy();
        org.mockito.cglib.util.ParallelSorter.Generator generator22 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator22.setUseCache(true);
        boolean boolean25 = generator22.getAttemptLoad();
        boolean boolean26 = generator22.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy27 = generator22.getStrategy();
        generator16.setStrategy(generatorStrategy27);
        java.lang.ClassLoader classLoader29 = generator16.getClassLoader();
        generator0.setClassLoader(classLoader29);
        boolean boolean31 = generator0.getAttemptLoad();
        generator0.setUseCache(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy34 = generator0.getStrategy();
        java.lang.ClassLoader classLoader35 = generator0.getClassLoader();
        boolean boolean36 = generator0.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy37 = generator0.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy38 = generator0.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter39 = generator0.create();
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        java.lang.ClassLoader classLoader3 = generator0.getClassLoader();
        org.mockito.cglib.util.ParallelSorter.Generator generator4 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator4.setUseCache(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = generator4.getStrategy();
        generator0.setStrategy(generatorStrategy7);
        org.mockito.cglib.core.NamingPolicy namingPolicy9 = generator0.getNamingPolicy();
        generator0.setUseCache(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy12 = generator0.getNamingPolicy();
        java.lang.ClassLoader classLoader13 = generator0.getClassLoader();
        generator0.setUseCache(true);
        boolean boolean16 = generator0.getAttemptLoad();
        generator0.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy19 = generator0.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter20 = generator0.create();
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        java.lang.ClassLoader classLoader3 = generator0.getClassLoader();
        org.mockito.cglib.util.ParallelSorter.Generator generator4 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator4.setUseCache(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = generator4.getStrategy();
        generator0.setStrategy(generatorStrategy7);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy10 = generator0.getStrategy();
        boolean boolean11 = generator0.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter12 = generator0.create();
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        generator0.setUseCache(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy4 = generator0.getStrategy();
        org.mockito.cglib.util.ParallelSorter.Generator generator5 = new org.mockito.cglib.util.ParallelSorter.Generator();
        boolean boolean6 = generator5.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = generator5.getStrategy();
        generator0.setStrategy(generatorStrategy7);
        org.mockito.cglib.core.NamingPolicy namingPolicy9 = generator0.getNamingPolicy();
        boolean boolean10 = generator0.getAttemptLoad();
        org.mockito.cglib.util.ParallelSorter.Generator generator11 = new org.mockito.cglib.util.ParallelSorter.Generator();
        boolean boolean12 = generator11.getAttemptLoad();
        java.lang.ClassLoader classLoader13 = generator11.getClassLoader();
        generator11.setUseCache(false);
        generator11.setUseCache(false);
        java.lang.ClassLoader classLoader18 = generator11.getClassLoader();
        generator11.setAttemptLoad(true);
        java.lang.ClassLoader classLoader21 = generator11.getClassLoader();
        generator0.setClassLoader(classLoader21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter23 = generator0.create();
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        generator0.setUseCache(true);
        generator0.setAttemptLoad(true);
        boolean boolean11 = generator0.getAttemptLoad();
        generator0.setUseCache(true);
        generator0.setUseCache(false);
        boolean boolean16 = generator0.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter17 = generator0.create();
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = generator0.getStrategy();
        org.mockito.cglib.util.ParallelSorter.Generator generator6 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator6.setUseCache(true);
        boolean boolean9 = generator6.getAttemptLoad();
        boolean boolean10 = generator6.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = generator6.getStrategy();
        generator0.setStrategy(generatorStrategy11);
        java.lang.ClassLoader classLoader13 = generator0.getClassLoader();
        generator0.setUseCache(false);
        org.mockito.cglib.util.ParallelSorter.Generator generator16 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator16.setUseCache(true);
        boolean boolean19 = generator16.getAttemptLoad();
        boolean boolean20 = generator16.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy21 = generator16.getStrategy();
        org.mockito.cglib.util.ParallelSorter.Generator generator22 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator22.setUseCache(true);
        boolean boolean25 = generator22.getAttemptLoad();
        boolean boolean26 = generator22.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy27 = generator22.getStrategy();
        generator16.setStrategy(generatorStrategy27);
        java.lang.ClassLoader classLoader29 = generator16.getClassLoader();
        generator0.setClassLoader(classLoader29);
        boolean boolean31 = generator0.getAttemptLoad();
        generator0.setUseCache(true);
        generator0.setUseCache(false);
        org.mockito.cglib.util.ParallelSorter.Generator generator36 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy37 = generator36.getStrategy();
        java.lang.ClassLoader classLoader38 = generator36.getClassLoader();
        generator0.setClassLoader(classLoader38);
        org.mockito.cglib.util.ParallelSorter.Generator generator40 = new org.mockito.cglib.util.ParallelSorter.Generator();
        boolean boolean41 = generator40.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy42 = generator40.getStrategy();
        java.lang.ClassLoader classLoader43 = generator40.getClassLoader();
        generator0.setClassLoader(classLoader43);
        org.mockito.cglib.core.NamingPolicy namingPolicy45 = generator0.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter46 = generator0.create();
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        java.util.Comparator<java.lang.String> strComparator0 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator1 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator2 = strComparator0.thenComparing(strComparator1);
        java.util.Comparator<java.lang.String> strComparator3 = strComparator0.reversed();
        java.util.Comparator<java.lang.String> strComparator4 = strComparator3.reversed();
        java.util.Comparator<java.lang.String> strComparator5 = strComparator3.reversed();
        org.mockito.cglib.util.ParallelSorter.Generator generator6 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator6.setUseCache(true);
        java.lang.ClassLoader classLoader9 = generator6.getClassLoader();
        org.mockito.cglib.util.ParallelSorter.Generator generator10 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator10.setUseCache(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator10.getStrategy();
        generator6.setStrategy(generatorStrategy13);
        boolean boolean15 = strComparator5.equals((java.lang.Object) generator6);
        generator6.setAttemptLoad(false);
        generator6.setAttemptLoad(true);
        boolean boolean20 = generator6.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter21 = generator6.create();
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator1 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator1.setUseCache(true);
        boolean boolean4 = generator1.getAttemptLoad();
        boolean boolean5 = generator1.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator1.getStrategy();
        generator0.setStrategy(generatorStrategy6);
        org.mockito.cglib.util.ParallelSorter.Generator generator8 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator8.setUseCache(true);
        boolean boolean11 = generator8.getAttemptLoad();
        boolean boolean12 = generator8.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator8.getStrategy();
        generator0.setStrategy(generatorStrategy13);
        generator0.setAttemptLoad(false);
        boolean boolean17 = generator0.getUseCache();
        java.lang.ClassLoader classLoader18 = generator0.getClassLoader();
        boolean boolean19 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter22 = generator0.create();
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        java.util.Comparator<java.lang.String> strComparator0 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator1 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator2 = strComparator0.thenComparing(strComparator1);
        java.util.Comparator<java.lang.String> strComparator3 = strComparator0.reversed();
        java.util.Comparator<java.lang.String> strComparator4 = strComparator3.reversed();
        java.util.Comparator<java.lang.String> strComparator5 = strComparator3.reversed();
        org.mockito.cglib.util.ParallelSorter.Generator generator6 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator6.setUseCache(true);
        java.lang.ClassLoader classLoader9 = generator6.getClassLoader();
        org.mockito.cglib.util.ParallelSorter.Generator generator10 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator10.setUseCache(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator10.getStrategy();
        generator6.setStrategy(generatorStrategy13);
        boolean boolean15 = strComparator5.equals((java.lang.Object) generator6);
        java.lang.ClassLoader classLoader16 = generator6.getClassLoader();
        boolean boolean17 = generator6.getUseCache();
        java.lang.ClassLoader classLoader18 = generator6.getClassLoader();
        boolean boolean19 = generator6.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter20 = generator6.create();
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = generator0.getStrategy();
        java.lang.ClassLoader classLoader2 = generator0.getClassLoader();
        generator0.setUseCache(false);
        generator0.setUseCache(true);
        boolean boolean7 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy8 = generator0.getStrategy();
        boolean boolean9 = generator0.getAttemptLoad();
        boolean boolean10 = generator0.getUseCache();
        generator0.setUseCache(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter13 = generator0.create();
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = generator0.getStrategy();
        org.mockito.cglib.util.ParallelSorter.Generator generator6 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator6.setUseCache(true);
        boolean boolean9 = generator6.getAttemptLoad();
        boolean boolean10 = generator6.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = generator6.getStrategy();
        generator0.setStrategy(generatorStrategy11);
        java.lang.ClassLoader classLoader13 = generator0.getClassLoader();
        generator0.setUseCache(false);
        org.mockito.cglib.util.ParallelSorter.Generator generator16 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator16.setUseCache(true);
        boolean boolean19 = generator16.getAttemptLoad();
        boolean boolean20 = generator16.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy21 = generator16.getStrategy();
        org.mockito.cglib.util.ParallelSorter.Generator generator22 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator22.setUseCache(true);
        boolean boolean25 = generator22.getAttemptLoad();
        boolean boolean26 = generator22.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy27 = generator22.getStrategy();
        generator16.setStrategy(generatorStrategy27);
        java.lang.ClassLoader classLoader29 = generator16.getClassLoader();
        generator0.setClassLoader(classLoader29);
        org.mockito.cglib.util.ParallelSorter.Generator generator31 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator31.setUseCache(true);
        boolean boolean34 = generator31.getAttemptLoad();
        boolean boolean35 = generator31.getUseCache();
        generator31.setAttemptLoad(true);
        boolean boolean38 = generator31.getUseCache();
        generator31.setAttemptLoad(true);
        generator31.setUseCache(true);
        org.mockito.cglib.util.ParallelSorter.Generator generator43 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator43.setUseCache(true);
        boolean boolean46 = generator43.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy47 = generator43.getStrategy();
        generator31.setStrategy(generatorStrategy47);
        generator0.setStrategy(generatorStrategy47);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter50 = generator0.create();
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator1 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator1.setUseCache(true);
        boolean boolean4 = generator1.getAttemptLoad();
        boolean boolean5 = generator1.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator1.getStrategy();
        generator0.setStrategy(generatorStrategy6);
        boolean boolean8 = generator0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = generator0.getStrategy();
        java.lang.ClassLoader classLoader10 = generator0.getClassLoader();
        java.lang.ClassLoader classLoader11 = generator0.getClassLoader();
        boolean boolean12 = generator0.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter13 = generator0.create();
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = generator0.getStrategy();
        org.mockito.cglib.util.ParallelSorter.Generator generator6 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator6.setUseCache(true);
        boolean boolean9 = generator6.getAttemptLoad();
        boolean boolean10 = generator6.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = generator6.getStrategy();
        generator0.setStrategy(generatorStrategy11);
        java.lang.ClassLoader classLoader13 = generator0.getClassLoader();
        generator0.setUseCache(false);
        org.mockito.cglib.util.ParallelSorter.Generator generator16 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator16.setUseCache(true);
        boolean boolean19 = generator16.getAttemptLoad();
        boolean boolean20 = generator16.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy21 = generator16.getStrategy();
        org.mockito.cglib.util.ParallelSorter.Generator generator22 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator22.setUseCache(true);
        boolean boolean25 = generator22.getAttemptLoad();
        boolean boolean26 = generator22.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy27 = generator22.getStrategy();
        generator16.setStrategy(generatorStrategy27);
        java.lang.ClassLoader classLoader29 = generator16.getClassLoader();
        generator0.setClassLoader(classLoader29);
        boolean boolean31 = generator0.getAttemptLoad();
        generator0.setUseCache(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy34 = generator0.getStrategy();
        java.lang.ClassLoader classLoader35 = generator0.getClassLoader();
        org.mockito.cglib.core.NamingPolicy namingPolicy36 = generator0.getNamingPolicy();
        generator0.setAttemptLoad(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter39 = generator0.create();
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        generator0.setUseCache(true);
        generator0.setAttemptLoad(true);
        boolean boolean11 = generator0.getAttemptLoad();
        org.mockito.cglib.util.ParallelSorter.Generator generator12 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator12.setUseCache(true);
        boolean boolean15 = generator12.getAttemptLoad();
        generator12.setUseCache(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy18 = generator12.getNamingPolicy();
        boolean boolean19 = generator12.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy20 = generator12.getNamingPolicy();
        generator0.setNamingPolicy(namingPolicy20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter22 = generator0.create();
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = generator0.getStrategy();
        generator0.setAttemptLoad(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy8 = generator0.getStrategy();
        boolean boolean9 = generator0.getUseCache();
        java.lang.ClassLoader classLoader10 = generator0.getClassLoader();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter11 = generator0.create();
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        generator0.setUseCache(true);
        generator0.setUseCache(false);
        org.mockito.cglib.util.ParallelSorter.Generator generator11 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator12 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator12.setUseCache(true);
        boolean boolean15 = generator12.getAttemptLoad();
        boolean boolean16 = generator12.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy17 = generator12.getStrategy();
        generator11.setStrategy(generatorStrategy17);
        org.mockito.cglib.util.ParallelSorter.Generator generator19 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator19.setUseCache(true);
        boolean boolean22 = generator19.getAttemptLoad();
        boolean boolean23 = generator19.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy24 = generator19.getStrategy();
        generator11.setStrategy(generatorStrategy24);
        org.mockito.cglib.util.ParallelSorter.Generator generator26 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator26.setUseCache(true);
        boolean boolean29 = generator26.getAttemptLoad();
        boolean boolean30 = generator26.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy31 = generator26.getStrategy();
        org.mockito.cglib.util.ParallelSorter.Generator generator32 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator32.setUseCache(true);
        boolean boolean35 = generator32.getAttemptLoad();
        boolean boolean36 = generator32.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy37 = generator32.getStrategy();
        generator26.setStrategy(generatorStrategy37);
        generator11.setStrategy(generatorStrategy37);
        generator0.setStrategy(generatorStrategy37);
        org.mockito.cglib.core.NamingPolicy namingPolicy41 = generator0.getNamingPolicy();
        generator0.setAttemptLoad(true);
        generator0.setUseCache(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter46 = generator0.create();
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = generator0.getStrategy();
        boolean boolean8 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = generator0.getStrategy();
        boolean boolean10 = generator0.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter11 = generator0.create();
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        org.mockito.cglib.util.ParallelSorter.Generator generator3 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator4 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator4.setUseCache(true);
        boolean boolean7 = generator4.getAttemptLoad();
        boolean boolean8 = generator4.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = generator4.getStrategy();
        generator3.setStrategy(generatorStrategy9);
        org.mockito.cglib.util.ParallelSorter.Generator generator11 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator11.setUseCache(true);
        boolean boolean14 = generator11.getAttemptLoad();
        boolean boolean15 = generator11.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = generator11.getStrategy();
        generator3.setStrategy(generatorStrategy16);
        generator0.setStrategy(generatorStrategy16);
        boolean boolean19 = generator0.getAttemptLoad();
        org.mockito.cglib.util.ParallelSorter.Generator generator20 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator21 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator21.setUseCache(true);
        boolean boolean24 = generator21.getAttemptLoad();
        boolean boolean25 = generator21.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy26 = generator21.getStrategy();
        generator20.setStrategy(generatorStrategy26);
        org.mockito.cglib.util.ParallelSorter.Generator generator28 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator28.setUseCache(true);
        boolean boolean31 = generator28.getAttemptLoad();
        boolean boolean32 = generator28.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy33 = generator28.getStrategy();
        generator20.setStrategy(generatorStrategy33);
        generator20.setAttemptLoad(false);
        boolean boolean37 = generator20.getUseCache();
        java.lang.ClassLoader classLoader38 = generator20.getClassLoader();
        generator0.setClassLoader(classLoader38);
        boolean boolean40 = generator0.getUseCache();
        org.mockito.cglib.util.ParallelSorter.Generator generator41 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator41.setUseCache(true);
        java.lang.ClassLoader classLoader44 = generator41.getClassLoader();
        boolean boolean45 = generator41.getUseCache();
        boolean boolean46 = generator41.getAttemptLoad();
        java.lang.ClassLoader classLoader47 = generator41.getClassLoader();
        generator0.setClassLoader(classLoader47);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter49 = generator0.create();
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy5 = generator0.getNamingPolicy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator0.getStrategy();
        generator0.setUseCache(true);
        boolean boolean9 = generator0.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter10 = generator0.create();
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = generator0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = generator0.getNamingPolicy();
        generator0.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy9 = generator0.getNamingPolicy();
        generator0.setUseCache(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter12 = generator0.create();
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        java.lang.ClassLoader classLoader2 = generator0.getClassLoader();
        generator0.setUseCache(false);
        generator0.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy7 = generator0.getNamingPolicy();
        org.mockito.cglib.util.ParallelSorter.Generator generator8 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = generator8.getStrategy();
        java.lang.ClassLoader classLoader10 = generator8.getClassLoader();
        generator8.setUseCache(false);
        boolean boolean13 = generator8.getUseCache();
        java.lang.ClassLoader classLoader14 = generator8.getClassLoader();
        generator0.setClassLoader(classLoader14);
        boolean boolean16 = generator0.getAttemptLoad();
        generator0.setUseCache(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter19 = generator0.create();
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        generator0.setUseCache(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = generator0.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy7 = generator0.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter8 = generator0.create();
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        java.lang.ClassLoader classLoader3 = generator0.getClassLoader();
        org.mockito.cglib.util.ParallelSorter.Generator generator4 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator4.setUseCache(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = generator4.getStrategy();
        generator0.setStrategy(generatorStrategy7);
        org.mockito.cglib.core.NamingPolicy namingPolicy9 = generator0.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy10 = generator0.getNamingPolicy();
        generator0.setAttemptLoad(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter13 = generator0.create();
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        boolean boolean7 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        java.lang.ClassLoader classLoader10 = generator0.getClassLoader();
        boolean boolean11 = generator0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = generator0.getStrategy();
        generator0.setUseCache(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter15 = generator0.create();
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = generator0.getStrategy();
        generator0.setAttemptLoad(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter8 = generator0.create();
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        org.mockito.cglib.util.ParallelSorter.Generator generator3 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator4 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator4.setUseCache(true);
        boolean boolean7 = generator4.getAttemptLoad();
        boolean boolean8 = generator4.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = generator4.getStrategy();
        generator3.setStrategy(generatorStrategy9);
        org.mockito.cglib.util.ParallelSorter.Generator generator11 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator11.setUseCache(true);
        boolean boolean14 = generator11.getAttemptLoad();
        boolean boolean15 = generator11.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = generator11.getStrategy();
        generator3.setStrategy(generatorStrategy16);
        generator0.setStrategy(generatorStrategy16);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy19 = generator0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy20 = generator0.getNamingPolicy();
        java.lang.ClassLoader classLoader21 = generator0.getClassLoader();
        org.mockito.cglib.util.ParallelSorter.Generator generator22 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator22.setUseCache(true);
        boolean boolean25 = generator22.getAttemptLoad();
        boolean boolean26 = generator22.getUseCache();
        generator22.setAttemptLoad(true);
        generator22.setUseCache(true);
        generator22.setAttemptLoad(true);
        generator22.setUseCache(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy35 = generator22.getStrategy();
        generator0.setStrategy(generatorStrategy35);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy37 = generator0.getStrategy();
        boolean boolean38 = generator0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy39 = generator0.getStrategy();
        generator0.setAttemptLoad(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy42 = generator0.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter43 = generator0.create();
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator1 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator1.setUseCache(true);
        boolean boolean4 = generator1.getAttemptLoad();
        boolean boolean5 = generator1.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator1.getStrategy();
        generator0.setStrategy(generatorStrategy6);
        generator0.setUseCache(false);
        generator0.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy12 = generator0.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy13 = generator0.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter14 = generator0.create();
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = generator0.getStrategy();
        org.mockito.cglib.util.ParallelSorter.Generator generator6 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator6.setUseCache(true);
        boolean boolean9 = generator6.getAttemptLoad();
        boolean boolean10 = generator6.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = generator6.getStrategy();
        generator0.setStrategy(generatorStrategy11);
        java.lang.ClassLoader classLoader13 = generator0.getClassLoader();
        generator0.setUseCache(false);
        org.mockito.cglib.util.ParallelSorter.Generator generator16 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator16.setUseCache(true);
        boolean boolean19 = generator16.getAttemptLoad();
        boolean boolean20 = generator16.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy21 = generator16.getStrategy();
        org.mockito.cglib.util.ParallelSorter.Generator generator22 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator22.setUseCache(true);
        boolean boolean25 = generator22.getAttemptLoad();
        boolean boolean26 = generator22.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy27 = generator22.getStrategy();
        generator16.setStrategy(generatorStrategy27);
        java.lang.ClassLoader classLoader29 = generator16.getClassLoader();
        generator0.setClassLoader(classLoader29);
        org.mockito.cglib.util.ParallelSorter.Generator generator31 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator31.setUseCache(true);
        boolean boolean34 = generator31.getAttemptLoad();
        boolean boolean35 = generator31.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy36 = generator31.getNamingPolicy();
        generator0.setNamingPolicy(namingPolicy36);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy38 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy39 = generator0.getStrategy();
        boolean boolean40 = generator0.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter41 = generator0.create();
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy4 = generator0.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter5 = generator0.create();
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        generator0.setUseCache(true);
        generator0.setAttemptLoad(true);
        generator0.setUseCache(false);
        boolean boolean13 = generator0.getUseCache();
        generator0.setUseCache(true);
        generator0.setAttemptLoad(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter18 = generator0.create();
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = generator0.getStrategy();
        java.lang.ClassLoader classLoader2 = generator0.getClassLoader();
        generator0.setUseCache(false);
        boolean boolean5 = generator0.getUseCache();
        java.lang.ClassLoader classLoader6 = generator0.getClassLoader();
        java.lang.ClassLoader classLoader7 = generator0.getClassLoader();
        org.mockito.cglib.core.NamingPolicy namingPolicy8 = generator0.getNamingPolicy();
        boolean boolean9 = generator0.getUseCache();
        boolean boolean10 = generator0.getUseCache();
        boolean boolean11 = generator0.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter12 = generator0.create();
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = generator0.getStrategy();
        org.mockito.cglib.util.ParallelSorter.Generator generator6 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator6.setUseCache(true);
        boolean boolean9 = generator6.getAttemptLoad();
        boolean boolean10 = generator6.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = generator6.getStrategy();
        generator0.setStrategy(generatorStrategy11);
        java.lang.ClassLoader classLoader13 = generator0.getClassLoader();
        generator0.setUseCache(false);
        org.mockito.cglib.util.ParallelSorter.Generator generator16 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator16.setUseCache(true);
        boolean boolean19 = generator16.getAttemptLoad();
        boolean boolean20 = generator16.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy21 = generator16.getStrategy();
        org.mockito.cglib.util.ParallelSorter.Generator generator22 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator22.setUseCache(true);
        boolean boolean25 = generator22.getAttemptLoad();
        boolean boolean26 = generator22.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy27 = generator22.getStrategy();
        generator16.setStrategy(generatorStrategy27);
        java.lang.ClassLoader classLoader29 = generator16.getClassLoader();
        generator0.setClassLoader(classLoader29);
        boolean boolean31 = generator0.getAttemptLoad();
        generator0.setUseCache(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy34 = generator0.getStrategy();
        java.lang.ClassLoader classLoader35 = generator0.getClassLoader();
        boolean boolean36 = generator0.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy37 = generator0.getNamingPolicy();
        java.lang.ClassLoader classLoader38 = generator0.getClassLoader();
        java.lang.ClassLoader classLoader39 = generator0.getClassLoader();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter40 = generator0.create();
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator1 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator1.setUseCache(true);
        boolean boolean4 = generator1.getAttemptLoad();
        boolean boolean5 = generator1.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator1.getStrategy();
        generator0.setStrategy(generatorStrategy6);
        boolean boolean8 = generator0.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy9 = generator0.getNamingPolicy();
        java.lang.ClassLoader classLoader10 = generator0.getClassLoader();
        java.lang.ClassLoader classLoader11 = generator0.getClassLoader();
        generator0.setAttemptLoad(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter14 = generator0.create();
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = generator0.getStrategy();
        org.mockito.cglib.util.ParallelSorter.Generator generator6 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator6.setUseCache(true);
        boolean boolean9 = generator6.getAttemptLoad();
        boolean boolean10 = generator6.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = generator6.getStrategy();
        generator0.setStrategy(generatorStrategy11);
        boolean boolean13 = generator0.getAttemptLoad();
        generator0.setUseCache(true);
        generator0.setUseCache(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter18 = generator0.create();
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test316");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = generator0.getStrategy();
        java.lang.ClassLoader classLoader2 = generator0.getClassLoader();
        generator0.setAttemptLoad(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter5 = generator0.create();
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test317");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        generator0.setUseCache(true);
        generator0.setUseCache(false);
        generator0.setUseCache(false);
        boolean boolean13 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter16 = generator0.create();
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test318");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = generator0.getStrategy();
        org.mockito.cglib.util.ParallelSorter.Generator generator6 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator6.setUseCache(true);
        boolean boolean9 = generator6.getAttemptLoad();
        boolean boolean10 = generator6.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = generator6.getStrategy();
        generator0.setStrategy(generatorStrategy11);
        java.lang.ClassLoader classLoader13 = generator0.getClassLoader();
        generator0.setUseCache(false);
        org.mockito.cglib.util.ParallelSorter.Generator generator16 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator16.setUseCache(true);
        boolean boolean19 = generator16.getAttemptLoad();
        boolean boolean20 = generator16.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy21 = generator16.getStrategy();
        org.mockito.cglib.util.ParallelSorter.Generator generator22 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator22.setUseCache(true);
        boolean boolean25 = generator22.getAttemptLoad();
        boolean boolean26 = generator22.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy27 = generator22.getStrategy();
        generator16.setStrategy(generatorStrategy27);
        java.lang.ClassLoader classLoader29 = generator16.getClassLoader();
        generator0.setClassLoader(classLoader29);
        boolean boolean31 = generator0.getAttemptLoad();
        boolean boolean32 = generator0.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy33 = generator0.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy34 = generator0.getNamingPolicy();
        generator0.setUseCache(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter37 = generator0.create();
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test319");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = generator0.getStrategy();
        java.lang.ClassLoader classLoader2 = generator0.getClassLoader();
        generator0.setUseCache(false);
        boolean boolean5 = generator0.getUseCache();
        java.lang.ClassLoader classLoader6 = generator0.getClassLoader();
        java.lang.ClassLoader classLoader7 = generator0.getClassLoader();
        org.mockito.cglib.core.NamingPolicy namingPolicy8 = generator0.getNamingPolicy();
        boolean boolean9 = generator0.getUseCache();
        generator0.setUseCache(false);
        boolean boolean12 = generator0.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter13 = generator0.create();
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test320");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        org.mockito.cglib.util.ParallelSorter.Generator generator3 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator4 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator4.setUseCache(true);
        boolean boolean7 = generator4.getAttemptLoad();
        boolean boolean8 = generator4.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = generator4.getStrategy();
        generator3.setStrategy(generatorStrategy9);
        org.mockito.cglib.util.ParallelSorter.Generator generator11 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator11.setUseCache(true);
        boolean boolean14 = generator11.getAttemptLoad();
        boolean boolean15 = generator11.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = generator11.getStrategy();
        generator3.setStrategy(generatorStrategy16);
        generator0.setStrategy(generatorStrategy16);
        boolean boolean19 = generator0.getAttemptLoad();
        org.mockito.cglib.util.ParallelSorter.Generator generator20 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator21 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator21.setUseCache(true);
        boolean boolean24 = generator21.getAttemptLoad();
        boolean boolean25 = generator21.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy26 = generator21.getStrategy();
        generator20.setStrategy(generatorStrategy26);
        org.mockito.cglib.util.ParallelSorter.Generator generator28 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator28.setUseCache(true);
        boolean boolean31 = generator28.getAttemptLoad();
        boolean boolean32 = generator28.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy33 = generator28.getStrategy();
        generator20.setStrategy(generatorStrategy33);
        generator20.setAttemptLoad(false);
        boolean boolean37 = generator20.getUseCache();
        java.lang.ClassLoader classLoader38 = generator20.getClassLoader();
        generator0.setClassLoader(classLoader38);
        org.mockito.cglib.core.NamingPolicy namingPolicy40 = generator0.getNamingPolicy();
        org.mockito.cglib.util.ParallelSorter.Generator generator41 = new org.mockito.cglib.util.ParallelSorter.Generator();
        boolean boolean42 = generator41.getAttemptLoad();
        java.lang.ClassLoader classLoader43 = generator41.getClassLoader();
        java.lang.ClassLoader classLoader44 = generator41.getClassLoader();
        org.mockito.cglib.util.ParallelSorter.Generator generator45 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator46 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator46.setUseCache(true);
        boolean boolean49 = generator46.getAttemptLoad();
        boolean boolean50 = generator46.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy51 = generator46.getStrategy();
        generator45.setStrategy(generatorStrategy51);
        org.mockito.cglib.util.ParallelSorter.Generator generator53 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator53.setUseCache(true);
        boolean boolean56 = generator53.getAttemptLoad();
        boolean boolean57 = generator53.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy58 = generator53.getStrategy();
        generator45.setStrategy(generatorStrategy58);
        generator41.setStrategy(generatorStrategy58);
        org.mockito.cglib.util.ParallelSorter.Generator generator61 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy62 = generator61.getStrategy();
        generator41.setStrategy(generatorStrategy62);
        generator0.setStrategy(generatorStrategy62);
        org.mockito.cglib.core.NamingPolicy namingPolicy65 = generator0.getNamingPolicy();
        boolean boolean66 = generator0.getAttemptLoad();
        boolean boolean67 = generator0.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter68 = generator0.create();
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test321");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = generator0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = generator0.getNamingPolicy();
        java.lang.ClassLoader classLoader7 = generator0.getClassLoader();
        boolean boolean8 = generator0.getUseCache();
        boolean boolean9 = generator0.getUseCache();
        java.lang.ClassLoader classLoader10 = generator0.getClassLoader();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter11 = generator0.create();
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test322");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = generator0.getStrategy();
        java.lang.ClassLoader classLoader2 = generator0.getClassLoader();
        generator0.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy5 = generator0.getNamingPolicy();
        org.mockito.cglib.util.ParallelSorter.Generator generator6 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator7 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator7.setUseCache(true);
        boolean boolean10 = generator7.getAttemptLoad();
        boolean boolean11 = generator7.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = generator7.getStrategy();
        generator6.setStrategy(generatorStrategy12);
        generator0.setStrategy(generatorStrategy12);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy15 = generator0.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter16 = generator0.create();
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test323");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator1 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator1.setUseCache(true);
        boolean boolean4 = generator1.getAttemptLoad();
        boolean boolean5 = generator1.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator1.getStrategy();
        generator0.setStrategy(generatorStrategy6);
        boolean boolean8 = generator0.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy9 = generator0.getNamingPolicy();
        java.lang.ClassLoader classLoader10 = generator0.getClassLoader();
        java.lang.ClassLoader classLoader11 = generator0.getClassLoader();
        generator0.setAttemptLoad(false);
        boolean boolean14 = generator0.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy15 = generator0.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter16 = generator0.create();
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test324");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = generator0.getStrategy();
        boolean boolean8 = generator0.getAttemptLoad();
        boolean boolean9 = generator0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy10 = generator0.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter11 = generator0.create();
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test325");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        org.mockito.cglib.util.ParallelSorter.Generator generator3 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator4 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator4.setUseCache(true);
        boolean boolean7 = generator4.getAttemptLoad();
        boolean boolean8 = generator4.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = generator4.getStrategy();
        generator3.setStrategy(generatorStrategy9);
        org.mockito.cglib.util.ParallelSorter.Generator generator11 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator11.setUseCache(true);
        boolean boolean14 = generator11.getAttemptLoad();
        boolean boolean15 = generator11.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = generator11.getStrategy();
        generator3.setStrategy(generatorStrategy16);
        generator0.setStrategy(generatorStrategy16);
        boolean boolean19 = generator0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy20 = generator0.getStrategy();
        boolean boolean21 = generator0.getUseCache();
        generator0.setUseCache(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter24 = generator0.create();
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test326");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        boolean boolean7 = generator0.getUseCache();
        generator0.setAttemptLoad(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy10 = generator0.getNamingPolicy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = generator0.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.util.ParallelSorter parallelSorter13 = generator0.create();
    }
}

