import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        boolean boolean2 = generator0.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader3 = generator0.getClassLoader();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        generator0.setUseCache(true);
        boolean boolean4 = generator0.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader5 = generator0.getClassLoader();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader2 = generator0.getClassLoader();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader2 = generator0.getClassLoader();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        boolean boolean2 = generator0.getUseCache();
        generator0.setAttemptLoad(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader5 = generator0.getClassLoader();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        generator0.setUseCache(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader4 = generator0.getClassLoader();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        generator0.setUseCache(true);
        boolean boolean4 = generator0.getUseCache();
        generator0.setUseCache(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = generator0.getStrategy();
        generator0.setUseCache(false);
        generator0.setUseCache(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader12 = generator0.getClassLoader();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        boolean boolean2 = generator0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        org.mockito.cglib.proxy.Mixin.Generator generator4 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean5 = generator4.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator4.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = generator4.getStrategy();
        generator4.setStyle((int) (byte) 0);
        org.mockito.cglib.proxy.Mixin.Generator generator10 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean11 = generator10.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = generator10.getStrategy();
        generator4.setStrategy(generatorStrategy12);
        org.mockito.cglib.core.NamingPolicy namingPolicy14 = generator4.getNamingPolicy();
        boolean boolean15 = generator4.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray16 = generatorStrategy3.generate((org.mockito.cglib.core.ClassGenerator) generator4);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        boolean boolean2 = generator0.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader3 = generator0.getClassLoader();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        generator0.setUseCache(true);
        boolean boolean4 = generator0.getUseCache();
        generator0.setUseCache(true);
        generator0.setAttemptLoad(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = generator0.getStrategy();
        org.mockito.cglib.proxy.Mixin.Generator generator10 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean11 = generator10.getUseCache();
        generator10.setUseCache(true);
        generator10.setUseCache(true);
        boolean boolean16 = generator10.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray17 = generatorStrategy9.generate((org.mockito.cglib.core.ClassGenerator) generator10);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy4 = generator0.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader5 = generator0.getClassLoader();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        generator0.setUseCache(true);
        boolean boolean4 = generator0.getUseCache();
        generator0.setUseCache(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = generator0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy8 = generator0.getNamingPolicy();
        generator0.setUseCache(false);
        generator0.setUseCache(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader13 = generator0.getClassLoader();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        generator0.setUseCache(true);
        generator0.setUseCache(true);
        generator0.setUseCache(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader8 = generator0.getClassLoader();
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        boolean boolean2 = generator0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        generator0.setAttemptLoad(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader6 = generator0.getClassLoader();
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        generator0.setUseCache(true);
        boolean boolean4 = generator0.getUseCache();
        boolean boolean5 = generator0.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = generator0.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader7 = generator0.getClassLoader();
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        boolean boolean2 = generator0.getUseCache();
        boolean boolean3 = generator0.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader4 = generator0.getClassLoader();
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy4 = generator0.getStrategy();
        boolean boolean5 = generator0.getUseCache();
        generator0.setStyle((int) (short) 1);
        boolean boolean8 = generator0.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader9 = generator0.getClassLoader();
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = generator0.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader3 = generator0.getClassLoader();
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy4 = generator0.getNamingPolicy();
        generator0.setAttemptLoad(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader7 = generator0.getClassLoader();
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        generator0.setUseCache(true);
        boolean boolean4 = generator0.getUseCache();
        boolean boolean5 = generator0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator0.getStrategy();
        org.mockito.cglib.proxy.Mixin.Generator generator7 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean8 = generator7.getUseCache();
        generator7.setUseCache(true);
        boolean boolean11 = generator7.getUseCache();
        boolean boolean12 = generator7.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray13 = generatorStrategy6.generate((org.mockito.cglib.core.ClassGenerator) generator7);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = generator0.getNamingPolicy();
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean3 = generator2.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy4 = generator2.getStrategy();
        generator0.setStrategy(generatorStrategy4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader6 = generator0.getClassLoader();
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        boolean boolean2 = generator0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        boolean boolean4 = generator0.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader5 = generator0.getClassLoader();
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        generator0.setUseCache(true);
        boolean boolean4 = generator0.getUseCache();
        generator0.setUseCache(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = generator0.getStrategy();
        generator0.setUseCache(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy10 = generator0.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader11 = generator0.getClassLoader();
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy4 = generator0.getNamingPolicy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = generator0.getStrategy();
        org.mockito.cglib.proxy.Mixin.Generator generator6 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean7 = generator6.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy8 = generator6.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = generator6.getStrategy();
        generator6.setStyle((int) (byte) 0);
        org.mockito.cglib.proxy.Mixin.Generator generator12 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean13 = generator12.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy14 = generator12.getStrategy();
        generator6.setStrategy(generatorStrategy14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray16 = generatorStrategy5.generate((org.mockito.cglib.core.ClassGenerator) generator6);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        generator0.setUseCache(true);
        generator0.setUseCache(true);
        boolean boolean6 = generator0.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader7 = generator0.getClassLoader();
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        generator0.setUseCache(true);
        boolean boolean4 = generator0.getUseCache();
        generator0.setUseCache(true);
        generator0.setAttemptLoad(false);
        org.mockito.cglib.proxy.Mixin.Generator generator9 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy10 = generator9.getNamingPolicy();
        org.mockito.cglib.proxy.Mixin.Generator generator11 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean12 = generator11.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator11.getStrategy();
        generator9.setStrategy(generatorStrategy13);
        generator0.setStrategy(generatorStrategy13);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = generator0.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader17 = generator0.getClassLoader();
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy4 = generator0.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy5 = generator0.getNamingPolicy();
        boolean boolean6 = generator0.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy7 = generator0.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy8 = generator0.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader9 = generator0.getClassLoader();
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        generator0.setUseCache(true);
        boolean boolean4 = generator0.getUseCache();
        generator0.setUseCache(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = generator0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy8 = generator0.getNamingPolicy();
        generator0.setUseCache(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader11 = generator0.getClassLoader();
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        boolean boolean2 = generator0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        boolean boolean4 = generator0.getAttemptLoad();
        generator0.setAttemptLoad(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader7 = generator0.getClassLoader();
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        generator0.setUseCache(true);
        boolean boolean4 = generator0.getUseCache();
        boolean boolean5 = generator0.getAttemptLoad();
        generator0.setUseCache(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader8 = generator0.getClassLoader();
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        generator0.setUseCache(true);
        boolean boolean4 = generator0.getUseCache();
        boolean boolean5 = generator0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator0.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader7 = generator0.getClassLoader();
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        generator0.setStyle((int) (byte) 0);
        org.mockito.cglib.proxy.Mixin.Generator generator6 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean7 = generator6.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy8 = generator6.getStrategy();
        generator0.setStrategy(generatorStrategy8);
        org.mockito.cglib.core.NamingPolicy namingPolicy10 = generator0.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy11 = generator0.getNamingPolicy();
        boolean boolean12 = generator0.getAttemptLoad();
        boolean boolean13 = generator0.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader14 = generator0.getClassLoader();
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        org.mockito.cglib.proxy.Mixin.Generator generator4 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean5 = generator4.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator4.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = generator4.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy8 = generator4.getNamingPolicy();
        generator0.setNamingPolicy(namingPolicy8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader10 = generator0.getClassLoader();
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        generator0.setUseCache(true);
        boolean boolean4 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        generator0.setUseCache(true);
        boolean boolean9 = generator0.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader10 = generator0.getClassLoader();
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        generator0.setStyle((int) (byte) 0);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator0.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader7 = generator0.getClassLoader();
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        generator0.setStyle((int) (byte) 0);
        org.mockito.cglib.proxy.Mixin.Generator generator6 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean7 = generator6.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy8 = generator6.getStrategy();
        generator0.setStrategy(generatorStrategy8);
        org.mockito.cglib.core.NamingPolicy namingPolicy10 = generator0.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy11 = generator0.getNamingPolicy();
        boolean boolean12 = generator0.getAttemptLoad();
        generator0.setUseCache(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy15 = generator0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy16 = generator0.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader17 = generator0.getClassLoader();
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy4 = generator0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy5 = generator0.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = generator0.getNamingPolicy();
        generator0.setUseCache(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader9 = generator0.getClassLoader();
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        generator0.setUseCache(true);
        boolean boolean4 = generator0.getUseCache();
        generator0.setUseCache(true);
        generator0.setAttemptLoad(false);
        generator0.setStyle(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader11 = generator0.getClassLoader();
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        generator0.setStyle((int) (byte) 0);
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = generator0.getNamingPolicy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = generator0.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader8 = generator0.getClassLoader();
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        generator0.setStyle((int) (byte) 0);
        org.mockito.cglib.proxy.Mixin.Generator generator6 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean7 = generator6.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy8 = generator6.getStrategy();
        generator0.setStrategy(generatorStrategy8);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy10 = generator0.getStrategy();
        generator0.setUseCache(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator0.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader14 = generator0.getClassLoader();
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        generator0.setUseCache(true);
        boolean boolean4 = generator0.getUseCache();
        boolean boolean5 = generator0.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = generator0.getNamingPolicy();
        boolean boolean7 = generator0.getUseCache();
        generator0.setUseCache(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader10 = generator0.getClassLoader();
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        generator0.setUseCache(true);
        boolean boolean4 = generator0.getUseCache();
        generator0.setUseCache(true);
        generator0.setAttemptLoad(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = generator0.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader10 = generator0.getClassLoader();
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean3 = generator2.getUseCache();
        generator2.setUseCache(true);
        boolean boolean6 = generator2.getUseCache();
        generator2.setUseCache(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = generator2.getStrategy();
        generator0.setStrategy(generatorStrategy9);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = generator0.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader12 = generator0.getClassLoader();
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        generator0.setStyle((int) (byte) 0);
        org.mockito.cglib.proxy.Mixin.Generator generator6 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean7 = generator6.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy8 = generator6.getStrategy();
        generator0.setStrategy(generatorStrategy8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader10 = generator0.getClassLoader();
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy4 = generator0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy5 = generator0.getNamingPolicy();
        boolean boolean6 = generator0.getUseCache();
        boolean boolean7 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy8 = generator0.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader9 = generator0.getClassLoader();
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = generator0.getNamingPolicy();
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean3 = generator2.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy4 = generator2.getStrategy();
        generator0.setStrategy(generatorStrategy4);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator0.getStrategy();
        org.mockito.cglib.proxy.Mixin.Generator generator7 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean8 = generator7.getUseCache();
        boolean boolean9 = generator7.getUseCache();
        boolean boolean10 = generator7.getAttemptLoad();
        generator7.setUseCache(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray13 = generatorStrategy6.generate((org.mockito.cglib.core.ClassGenerator) generator7);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        generator0.setUseCache(true);
        generator0.setUseCache(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = generator0.getNamingPolicy();
        boolean boolean7 = generator0.getAttemptLoad();
        generator0.setUseCache(false);
        boolean boolean10 = generator0.getUseCache();
        generator0.setUseCache(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator0.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader14 = generator0.getClassLoader();
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        generator0.setUseCache(true);
        boolean boolean4 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        generator0.setUseCache(true);
        generator0.setAttemptLoad(false);
        generator0.setUseCache(false);
        boolean boolean13 = generator0.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader14 = generator0.getClassLoader();
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        generator0.setUseCache(true);
        boolean boolean4 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        generator0.setUseCache(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader9 = generator0.getClassLoader();
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        generator0.setStyle((int) (byte) 0);
        org.mockito.cglib.proxy.Mixin.Generator generator6 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean7 = generator6.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy8 = generator6.getStrategy();
        generator0.setStrategy(generatorStrategy8);
        org.mockito.cglib.core.NamingPolicy namingPolicy10 = generator0.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy11 = generator0.getNamingPolicy();
        boolean boolean12 = generator0.getAttemptLoad();
        generator0.setUseCache(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader15 = generator0.getClassLoader();
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        generator0.setUseCache(true);
        boolean boolean4 = generator0.getUseCache();
        generator0.setUseCache(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = generator0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy8 = generator0.getNamingPolicy();
        generator0.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy11 = generator0.getNamingPolicy();
        boolean boolean12 = generator0.getAttemptLoad();
        boolean boolean13 = generator0.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader14 = generator0.getClassLoader();
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        generator0.setUseCache(true);
        boolean boolean4 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        generator0.setUseCache(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy10 = generator0.getStrategy();
        boolean boolean11 = generator0.getUseCache();
        boolean boolean12 = generator0.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader13 = generator0.getClassLoader();
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        generator0.setUseCache(true);
        boolean boolean4 = generator0.getUseCache();
        generator0.setUseCache(true);
        org.mockito.cglib.proxy.Mixin.Generator generator7 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean8 = generator7.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = generator7.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy10 = generator7.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = generator7.getStrategy();
        generator0.setStrategy(generatorStrategy11);
        generator0.setUseCache(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader15 = generator0.getClassLoader();
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy4 = generator0.getStrategy();
        boolean boolean5 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator0.getStrategy();
        boolean boolean7 = generator0.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader8 = generator0.getClassLoader();
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        boolean boolean2 = generator0.getAttemptLoad();
        boolean boolean3 = generator0.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader4 = generator0.getClassLoader();
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        generator0.setUseCache(true);
        generator0.setUseCache(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = generator0.getNamingPolicy();
        org.mockito.cglib.proxy.Mixin.Generator generator7 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean8 = generator7.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = generator7.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy10 = generator7.getStrategy();
        generator0.setStrategy(generatorStrategy10);
        generator0.setUseCache(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader14 = generator0.getClassLoader();
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        generator0.setUseCache(true);
        boolean boolean4 = generator0.getUseCache();
        generator0.setUseCache(true);
        generator0.setStyle((int) (byte) 0);
        generator0.setStyle((int) (byte) 1);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = generator0.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader12 = generator0.getClassLoader();
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = generator0.getStrategy();
        org.mockito.cglib.proxy.Mixin.Generator generator3 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean4 = generator3.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = generator3.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator3.getStrategy();
        generator3.setStyle((int) (byte) 0);
        org.mockito.cglib.proxy.Mixin.Generator generator9 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean10 = generator9.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = generator9.getStrategy();
        generator3.setStrategy(generatorStrategy11);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator3.getStrategy();
        generator3.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy16 = generator3.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray17 = generatorStrategy2.generate((org.mockito.cglib.core.ClassGenerator) generator3);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        generator0.setUseCache(true);
        boolean boolean4 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        generator0.setUseCache(true);
        boolean boolean9 = generator0.getAttemptLoad();
        boolean boolean10 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        boolean boolean13 = generator0.getUseCache();
        boolean boolean14 = generator0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy15 = generator0.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader16 = generator0.getClassLoader();
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        generator0.setUseCache(true);
        boolean boolean4 = generator0.getUseCache();
        generator0.setUseCache(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = generator0.getStrategy();
        org.mockito.cglib.proxy.Mixin.Generator generator8 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean9 = generator8.getUseCache();
        generator8.setUseCache(true);
        boolean boolean12 = generator8.getUseCache();
        boolean boolean13 = generator8.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy14 = generator8.getNamingPolicy();
        generator0.setNamingPolicy(namingPolicy14);
        org.mockito.cglib.core.NamingPolicy namingPolicy16 = generator0.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader17 = generator0.getClassLoader();
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        generator0.setUseCache(true);
        boolean boolean4 = generator0.getUseCache();
        generator0.setUseCache(true);
        org.mockito.cglib.proxy.Mixin.Generator generator7 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean8 = generator7.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = generator7.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy10 = generator7.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = generator7.getStrategy();
        generator0.setStrategy(generatorStrategy11);
        boolean boolean13 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader16 = generator0.getClassLoader();
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        generator0.setStyle((int) (byte) 0);
        org.mockito.cglib.proxy.Mixin.Generator generator6 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean7 = generator6.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy8 = generator6.getStrategy();
        generator0.setStrategy(generatorStrategy8);
        generator0.setUseCache(true);
        boolean boolean12 = generator0.getUseCache();
        boolean boolean13 = generator0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy14 = generator0.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader15 = generator0.getClassLoader();
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        generator0.setStyle((int) (byte) 0);
        org.mockito.cglib.proxy.Mixin.Generator generator6 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean7 = generator6.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy8 = generator6.getStrategy();
        generator0.setStrategy(generatorStrategy8);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy10 = generator0.getStrategy();
        boolean boolean11 = generator0.getUseCache();
        boolean boolean12 = generator0.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader13 = generator0.getClassLoader();
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        generator0.setUseCache(true);
        boolean boolean4 = generator0.getUseCache();
        generator0.setUseCache(true);
        generator0.setAttemptLoad(false);
        org.mockito.cglib.proxy.Mixin.Generator generator9 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy10 = generator9.getNamingPolicy();
        org.mockito.cglib.proxy.Mixin.Generator generator11 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean12 = generator11.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator11.getStrategy();
        generator9.setStrategy(generatorStrategy13);
        generator0.setStrategy(generatorStrategy13);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = generator0.getStrategy();
        boolean boolean17 = generator0.getUseCache();
        generator0.setAttemptLoad(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader20 = generator0.getClassLoader();
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        generator0.setUseCache(true);
        boolean boolean4 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        generator0.setUseCache(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy10 = generator0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy11 = generator0.getNamingPolicy();
        boolean boolean12 = generator0.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader13 = generator0.getClassLoader();
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        generator0.setUseCache(true);
        boolean boolean4 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        java.lang.ClassLoader classLoader7 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { (byte) 10 };
        org.mockito.cglib.proxy.Mixin mixin10 = org.mockito.cglib.proxy.Mixin.createBean(classLoader7, objArray9);
        generator0.setDelegates(objArray9);
        generator0.setStyle(1);
        boolean boolean14 = generator0.getUseCache();
        generator0.setStyle(2);
        org.mockito.cglib.proxy.Mixin.Generator generator17 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean18 = generator17.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator19 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean20 = generator19.getUseCache();
        generator19.setUseCache(true);
        boolean boolean23 = generator19.getUseCache();
        generator19.setUseCache(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy26 = generator19.getStrategy();
        generator17.setStrategy(generatorStrategy26);
        boolean boolean28 = generator17.getUseCache();
        boolean boolean29 = generator17.getUseCache();
        java.lang.ClassLoader classLoader30 = null;
        java.lang.Object[] objArray32 = new java.lang.Object[] { (byte) 10 };
        org.mockito.cglib.proxy.Mixin mixin33 = org.mockito.cglib.proxy.Mixin.createBean(classLoader30, objArray32);
        org.mockito.cglib.proxy.Mixin mixin34 = org.mockito.cglib.proxy.Mixin.createBean(objArray32);
        java.lang.Class[] classArray35 = org.mockito.cglib.proxy.Mixin.getClasses(objArray32);
        org.mockito.cglib.proxy.Mixin mixin36 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) classArray35);
        java.lang.ClassLoader classLoader37 = null;
        java.lang.Object[] objArray39 = new java.lang.Object[] { (byte) 10 };
        org.mockito.cglib.proxy.Mixin mixin40 = org.mockito.cglib.proxy.Mixin.createBean(classLoader37, objArray39);
        org.mockito.cglib.proxy.Mixin mixin41 = org.mockito.cglib.proxy.Mixin.createBean(objArray39);
        java.lang.Class[] classArray42 = org.mockito.cglib.proxy.Mixin.getClasses(objArray39);
        org.mockito.cglib.proxy.Mixin mixin43 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) classArray42);
        java.lang.Class[] classArray44 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) classArray42);
        java.lang.Class[] classArray45 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) classArray44);
        org.mockito.cglib.proxy.Mixin mixin46 = mixin36.newInstance((java.lang.Object[]) classArray45);
        java.lang.ClassLoader classLoader47 = null;
        java.lang.Object[] objArray49 = new java.lang.Object[] { (byte) 10 };
        org.mockito.cglib.proxy.Mixin mixin50 = org.mockito.cglib.proxy.Mixin.createBean(classLoader47, objArray49);
        org.mockito.cglib.proxy.Mixin mixin51 = org.mockito.cglib.proxy.Mixin.createBean(objArray49);
        java.lang.Class[] classArray52 = org.mockito.cglib.proxy.Mixin.getClasses(objArray49);
        org.mockito.cglib.proxy.Mixin mixin53 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) classArray52);
        java.lang.Class[] classArray54 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) classArray52);
        org.mockito.cglib.proxy.Mixin.Generator generator55 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean56 = generator55.getAttemptLoad();
        java.lang.ClassLoader classLoader57 = null;
        java.lang.Object[] objArray59 = new java.lang.Object[] { (byte) 10 };
        org.mockito.cglib.proxy.Mixin mixin60 = org.mockito.cglib.proxy.Mixin.createBean(classLoader57, objArray59);
        org.mockito.cglib.proxy.Mixin mixin61 = org.mockito.cglib.proxy.Mixin.createBean(objArray59);
        java.lang.Class[] classArray62 = org.mockito.cglib.proxy.Mixin.getClasses(objArray59);
        generator55.setDelegates((java.lang.Object[]) classArray62);
        org.mockito.cglib.proxy.Mixin mixin64 = org.mockito.cglib.proxy.Mixin.create(classArray54, (java.lang.Object[]) classArray62);
        org.mockito.cglib.proxy.Mixin mixin65 = org.mockito.cglib.proxy.Mixin.create(classArray45, (java.lang.Object[]) classArray54);
        generator17.setClasses(classArray54);
        org.mockito.cglib.core.NamingPolicy namingPolicy67 = generator17.getNamingPolicy();
        boolean boolean68 = generator17.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy69 = generator17.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy70 = generator17.getStrategy();
        generator0.setStrategy(generatorStrategy70);
        boolean boolean72 = generator0.getAttemptLoad();
        org.mockito.cglib.proxy.Mixin mixin73 = generator0.create();
        org.junit.Assert.assertTrue("Contract failed: mixin73.equals(mixin73)", mixin73.equals(mixin73));
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test67");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        generator0.setUseCache(true);
        boolean boolean4 = generator0.getUseCache();
        generator0.setUseCache(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = generator0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy8 = generator0.getNamingPolicy();
        generator0.setAttemptLoad(false);
        generator0.setUseCache(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader13 = generator0.getClassLoader();
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test68");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        generator0.setUseCache(true);
        boolean boolean4 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        generator0.setUseCache(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy10 = generator0.getStrategy();
        boolean boolean11 = generator0.getUseCache();
        boolean boolean12 = generator0.getUseCache();
        boolean boolean13 = generator0.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader14 = generator0.getClassLoader();
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test69");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        generator0.setUseCache(true);
        boolean boolean4 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        generator0.setUseCache(true);
        boolean boolean9 = generator0.getAttemptLoad();
        boolean boolean10 = generator0.getUseCache();
        boolean boolean11 = generator0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = generator0.getStrategy();
        generator0.setAttemptLoad(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader15 = generator0.getClassLoader();
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test70");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        generator0.setUseCache(true);
        boolean boolean4 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        generator0.setUseCache(true);
        generator0.setAttemptLoad(false);
        generator0.setUseCache(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader13 = generator0.getClassLoader();
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test71");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        generator0.setStyle((int) (byte) 0);
        org.mockito.cglib.proxy.Mixin.Generator generator6 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean7 = generator6.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy8 = generator6.getStrategy();
        generator0.setStrategy(generatorStrategy8);
        generator0.setUseCache(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader12 = generator0.getClassLoader();
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test72");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy4 = generator0.getStrategy();
        boolean boolean5 = generator0.getUseCache();
        boolean boolean6 = generator0.getAttemptLoad();
        generator0.setAttemptLoad(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader9 = generator0.getClassLoader();
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test73");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy4 = generator0.getNamingPolicy();
        generator0.setUseCache(false);
        boolean boolean7 = generator0.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader8 = generator0.getClassLoader();
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test74");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        boolean boolean2 = generator0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        generator0.setStyle((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader6 = generator0.getClassLoader();
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test75");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy4 = generator0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy5 = generator0.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader6 = generator0.getClassLoader();
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test76");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        generator0.setUseCache(true);
        boolean boolean4 = generator0.getUseCache();
        generator0.setUseCache(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = generator0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy8 = generator0.getNamingPolicy();
        generator0.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy11 = generator0.getNamingPolicy();
        generator0.setUseCache(false);
        boolean boolean14 = generator0.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader15 = generator0.getClassLoader();
    }
}

