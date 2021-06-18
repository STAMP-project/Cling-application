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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader1 = generator0.getClassLoader();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        boolean boolean2 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        boolean boolean4 = generator0.getAttemptLoad();
        boolean boolean5 = generator0.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader6 = generator0.getClassLoader();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = generator0.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader4 = generator0.getClassLoader();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        boolean boolean2 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader4 = generator0.getClassLoader();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = generator0.getNamingPolicy();
        generator0.setAttemptLoad(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader6 = generator0.getClassLoader();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.proxy.Mixin.Generator generator1 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean2 = generator1.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator1.getStrategy();
        generator0.setStrategy(generatorStrategy3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader5 = generator0.getClassLoader();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.cglib.proxy.Mixin.Generator generator3 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean4 = generator3.getUseCache();
        boolean boolean5 = generator3.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator3.getStrategy();
        generator0.setStrategy(generatorStrategy6);
        org.mockito.cglib.core.NamingPolicy namingPolicy8 = generator0.getNamingPolicy();
        generator0.setAttemptLoad(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader11 = generator0.getClassLoader();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = generator0.getStrategy();
        boolean boolean3 = generator0.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator4 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator4.setUseCache(false);
        generator4.setUseCache(false);
        org.mockito.cglib.proxy.Mixin.Generator generator9 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean10 = generator9.getAttemptLoad();
        java.lang.Object obj11 = new java.lang.Object();
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Class[] classArray15 = new java.lang.Class[] { wildcardClass12, wildcardClass14 };
        generator9.setClasses(classArray15);
        java.lang.Class<?> wildcardClass17 = generator9.getClass();
        org.mockito.cglib.proxy.Mixin.Generator generator18 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator18.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy21 = generator18.getNamingPolicy();
        java.lang.Class<?> wildcardClass22 = namingPolicy21.getClass();
        org.mockito.cglib.proxy.Mixin.Generator generator23 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean24 = generator23.getAttemptLoad();
        java.lang.Object obj25 = new java.lang.Object();
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        java.lang.Object obj27 = new java.lang.Object();
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        java.lang.Class[] classArray29 = new java.lang.Class[] { wildcardClass26, wildcardClass28 };
        generator23.setClasses(classArray29);
        java.lang.Class<?> wildcardClass31 = generator23.getClass();
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Class<?> wildcardClass33 = obj32.getClass();
        org.mockito.cglib.proxy.Mixin.Generator generator34 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean35 = generator34.getAttemptLoad();
        java.lang.Object obj36 = new java.lang.Object();
        java.lang.Class<?> wildcardClass37 = obj36.getClass();
        java.lang.Object obj38 = new java.lang.Object();
        java.lang.Class<?> wildcardClass39 = obj38.getClass();
        java.lang.Class[] classArray40 = new java.lang.Class[] { wildcardClass37, wildcardClass39 };
        generator34.setClasses(classArray40);
        java.lang.Class<?> wildcardClass42 = generator34.getClass();
        org.mockito.cglib.proxy.Mixin.Generator generator43 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator43.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy46 = generator43.getNamingPolicy();
        java.lang.Class<?> wildcardClass47 = namingPolicy46.getClass();
        java.lang.Class[] classArray48 = new java.lang.Class[] { wildcardClass17, wildcardClass22, wildcardClass31, wildcardClass33, wildcardClass42, wildcardClass47 };
        generator4.setClasses(classArray48);
        generator0.setDelegates((java.lang.Object[]) classArray48);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader51 = generator0.getClassLoader();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        boolean boolean2 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        org.mockito.cglib.proxy.Mixin.Generator generator4 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean5 = generator4.getAttemptLoad();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        java.lang.Class[] classArray10 = new java.lang.Class[] { wildcardClass7, wildcardClass9 };
        generator4.setClasses(classArray10);
        generator0.setDelegates((java.lang.Object[]) classArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader13 = generator0.getClassLoader();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader2 = generator0.getClassLoader();
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.cglib.proxy.Mixin.Generator generator3 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean4 = generator3.getUseCache();
        boolean boolean5 = generator3.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator3.getStrategy();
        generator0.setStrategy(generatorStrategy6);
        org.mockito.cglib.core.NamingPolicy namingPolicy8 = generator0.getNamingPolicy();
        generator0.setAttemptLoad(false);
        org.mockito.cglib.proxy.Mixin.Generator generator11 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.proxy.Mixin.Generator generator12 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean13 = generator12.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy14 = generator12.getStrategy();
        generator11.setStrategy(generatorStrategy14);
        org.mockito.cglib.proxy.Mixin.Generator generator16 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean17 = generator16.getAttemptLoad();
        java.lang.Object obj18 = new java.lang.Object();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        java.lang.Object obj20 = new java.lang.Object();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        java.lang.Class[] classArray22 = new java.lang.Class[] { wildcardClass19, wildcardClass21 };
        generator16.setClasses(classArray22);
        generator11.setDelegates((java.lang.Object[]) classArray22);
        generator0.setDelegates((java.lang.Object[]) classArray22);
        generator0.setUseCache(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader28 = generator0.getClassLoader();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        boolean boolean2 = generator0.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = generator0.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader4 = generator0.getClassLoader();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.cglib.proxy.Mixin.Generator generator3 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean4 = generator3.getUseCache();
        boolean boolean5 = generator3.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator3.getStrategy();
        generator0.setStrategy(generatorStrategy6);
        org.mockito.cglib.core.NamingPolicy namingPolicy8 = generator0.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader9 = generator0.getClassLoader();
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.cglib.proxy.Mixin.Generator generator3 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean4 = generator3.getUseCache();
        boolean boolean5 = generator3.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator3.getStrategy();
        generator0.setStrategy(generatorStrategy6);
        org.mockito.cglib.proxy.Mixin.Generator generator8 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean9 = generator8.getAttemptLoad();
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        java.lang.Class[] classArray14 = new java.lang.Class[] { wildcardClass11, wildcardClass13 };
        generator8.setClasses(classArray14);
        generator0.setDelegates((java.lang.Object[]) classArray14);
        generator0.setUseCache(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader19 = generator0.getClassLoader();
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.proxy.Mixin.Generator generator1 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean2 = generator1.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator1.getStrategy();
        generator0.setStrategy(generatorStrategy3);
        org.mockito.cglib.proxy.Mixin.Generator generator5 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean6 = generator5.getAttemptLoad();
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        java.lang.Class[] classArray11 = new java.lang.Class[] { wildcardClass8, wildcardClass10 };
        generator5.setClasses(classArray11);
        generator0.setDelegates((java.lang.Object[]) classArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader14 = generator0.getClassLoader();
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        boolean boolean2 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        org.mockito.cglib.proxy.Mixin.Generator generator4 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean5 = generator4.getAttemptLoad();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        java.lang.Class[] classArray10 = new java.lang.Class[] { wildcardClass7, wildcardClass9 };
        generator4.setClasses(classArray10);
        generator0.setDelegates((java.lang.Object[]) classArray10);
        org.mockito.cglib.proxy.Mixin.Generator generator13 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean14 = generator13.getAttemptLoad();
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.Class[] classArray19 = new java.lang.Class[] { wildcardClass16, wildcardClass18 };
        generator13.setClasses(classArray19);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy21 = generator13.getStrategy();
        generator0.setStrategy(generatorStrategy21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader23 = generator0.getClassLoader();
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        boolean boolean2 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        boolean boolean4 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        generator0.setUseCache(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader9 = generator0.getClassLoader();
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader3 = generator0.getClassLoader();
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = generator0.getStrategy();
        org.mockito.cglib.proxy.Mixin.Generator generator3 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator3.setUseCache(false);
        org.mockito.cglib.proxy.Mixin.Generator generator6 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean7 = generator6.getUseCache();
        boolean boolean8 = generator6.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = generator6.getStrategy();
        generator3.setStrategy(generatorStrategy9);
        org.mockito.cglib.core.NamingPolicy namingPolicy11 = generator3.getNamingPolicy();
        generator0.setNamingPolicy(namingPolicy11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader13 = generator0.getClassLoader();
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator2.setUseCache(false);
        org.mockito.cglib.proxy.Mixin.Generator generator5 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean6 = generator5.getUseCache();
        boolean boolean7 = generator5.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy8 = generator5.getStrategy();
        generator2.setStrategy(generatorStrategy8);
        generator0.setStrategy(generatorStrategy8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader11 = generator0.getClassLoader();
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = generator0.getStrategy();
        boolean boolean3 = generator0.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator4 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator4.setUseCache(false);
        generator4.setUseCache(false);
        org.mockito.cglib.proxy.Mixin.Generator generator9 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean10 = generator9.getAttemptLoad();
        java.lang.Object obj11 = new java.lang.Object();
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Class[] classArray15 = new java.lang.Class[] { wildcardClass12, wildcardClass14 };
        generator9.setClasses(classArray15);
        java.lang.Class<?> wildcardClass17 = generator9.getClass();
        org.mockito.cglib.proxy.Mixin.Generator generator18 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator18.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy21 = generator18.getNamingPolicy();
        java.lang.Class<?> wildcardClass22 = namingPolicy21.getClass();
        org.mockito.cglib.proxy.Mixin.Generator generator23 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean24 = generator23.getAttemptLoad();
        java.lang.Object obj25 = new java.lang.Object();
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        java.lang.Object obj27 = new java.lang.Object();
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        java.lang.Class[] classArray29 = new java.lang.Class[] { wildcardClass26, wildcardClass28 };
        generator23.setClasses(classArray29);
        java.lang.Class<?> wildcardClass31 = generator23.getClass();
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Class<?> wildcardClass33 = obj32.getClass();
        org.mockito.cglib.proxy.Mixin.Generator generator34 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean35 = generator34.getAttemptLoad();
        java.lang.Object obj36 = new java.lang.Object();
        java.lang.Class<?> wildcardClass37 = obj36.getClass();
        java.lang.Object obj38 = new java.lang.Object();
        java.lang.Class<?> wildcardClass39 = obj38.getClass();
        java.lang.Class[] classArray40 = new java.lang.Class[] { wildcardClass37, wildcardClass39 };
        generator34.setClasses(classArray40);
        java.lang.Class<?> wildcardClass42 = generator34.getClass();
        org.mockito.cglib.proxy.Mixin.Generator generator43 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator43.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy46 = generator43.getNamingPolicy();
        java.lang.Class<?> wildcardClass47 = namingPolicy46.getClass();
        java.lang.Class[] classArray48 = new java.lang.Class[] { wildcardClass17, wildcardClass22, wildcardClass31, wildcardClass33, wildcardClass42, wildcardClass47 };
        generator4.setClasses(classArray48);
        generator0.setDelegates((java.lang.Object[]) classArray48);
        org.mockito.cglib.proxy.Mixin.Generator generator51 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean52 = generator51.getUseCache();
        boolean boolean53 = generator51.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy54 = generator51.getStrategy();
        boolean boolean55 = generator51.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator56 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.proxy.Mixin.Generator generator57 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean58 = generator57.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy59 = generator57.getStrategy();
        generator56.setStrategy(generatorStrategy59);
        org.mockito.cglib.proxy.Mixin.Generator generator61 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean62 = generator61.getAttemptLoad();
        java.lang.Object obj63 = new java.lang.Object();
        java.lang.Class<?> wildcardClass64 = obj63.getClass();
        java.lang.Object obj65 = new java.lang.Object();
        java.lang.Class<?> wildcardClass66 = obj65.getClass();
        java.lang.Class[] classArray67 = new java.lang.Class[] { wildcardClass64, wildcardClass66 };
        generator61.setClasses(classArray67);
        generator56.setDelegates((java.lang.Object[]) classArray67);
        generator51.setClasses(classArray67);
        generator0.setDelegates((java.lang.Object[]) classArray67);
        org.mockito.cglib.proxy.Mixin.Generator generator72 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator72.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy75 = generator72.getNamingPolicy();
        generator0.setNamingPolicy(namingPolicy75);
        org.mockito.cglib.core.NamingPolicy namingPolicy77 = generator0.getNamingPolicy();
        generator0.setAttemptLoad(false);
        boolean boolean80 = generator0.getAttemptLoad();
        generator0.setAttemptLoad(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader83 = generator0.getClassLoader();
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        generator0.setStyle(0);
        boolean boolean5 = generator0.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator6 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator6.setUseCache(false);
        generator6.setStyle(0);
        org.mockito.cglib.proxy.Mixin.Generator generator11 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean12 = generator11.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator11.getStrategy();
        boolean boolean14 = generator11.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator15 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator15.setUseCache(false);
        generator15.setUseCache(false);
        org.mockito.cglib.proxy.Mixin.Generator generator20 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean21 = generator20.getAttemptLoad();
        java.lang.Object obj22 = new java.lang.Object();
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        java.lang.Object obj24 = new java.lang.Object();
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        java.lang.Class[] classArray26 = new java.lang.Class[] { wildcardClass23, wildcardClass25 };
        generator20.setClasses(classArray26);
        java.lang.Class<?> wildcardClass28 = generator20.getClass();
        org.mockito.cglib.proxy.Mixin.Generator generator29 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator29.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy32 = generator29.getNamingPolicy();
        java.lang.Class<?> wildcardClass33 = namingPolicy32.getClass();
        org.mockito.cglib.proxy.Mixin.Generator generator34 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean35 = generator34.getAttemptLoad();
        java.lang.Object obj36 = new java.lang.Object();
        java.lang.Class<?> wildcardClass37 = obj36.getClass();
        java.lang.Object obj38 = new java.lang.Object();
        java.lang.Class<?> wildcardClass39 = obj38.getClass();
        java.lang.Class[] classArray40 = new java.lang.Class[] { wildcardClass37, wildcardClass39 };
        generator34.setClasses(classArray40);
        java.lang.Class<?> wildcardClass42 = generator34.getClass();
        java.lang.Object obj43 = new java.lang.Object();
        java.lang.Class<?> wildcardClass44 = obj43.getClass();
        org.mockito.cglib.proxy.Mixin.Generator generator45 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean46 = generator45.getAttemptLoad();
        java.lang.Object obj47 = new java.lang.Object();
        java.lang.Class<?> wildcardClass48 = obj47.getClass();
        java.lang.Object obj49 = new java.lang.Object();
        java.lang.Class<?> wildcardClass50 = obj49.getClass();
        java.lang.Class[] classArray51 = new java.lang.Class[] { wildcardClass48, wildcardClass50 };
        generator45.setClasses(classArray51);
        java.lang.Class<?> wildcardClass53 = generator45.getClass();
        org.mockito.cglib.proxy.Mixin.Generator generator54 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator54.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy57 = generator54.getNamingPolicy();
        java.lang.Class<?> wildcardClass58 = namingPolicy57.getClass();
        java.lang.Class[] classArray59 = new java.lang.Class[] { wildcardClass28, wildcardClass33, wildcardClass42, wildcardClass44, wildcardClass53, wildcardClass58 };
        generator15.setClasses(classArray59);
        generator11.setDelegates((java.lang.Object[]) classArray59);
        generator6.setDelegates((java.lang.Object[]) classArray59);
        generator0.setDelegates((java.lang.Object[]) classArray59);
        generator0.setAttemptLoad(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader66 = generator0.getClassLoader();
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader4 = generator0.getClassLoader();
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.cglib.proxy.Mixin.Generator generator3 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean4 = generator3.getUseCache();
        boolean boolean5 = generator3.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator3.getStrategy();
        generator0.setStrategy(generatorStrategy6);
        org.mockito.cglib.core.NamingPolicy namingPolicy8 = generator0.getNamingPolicy();
        boolean boolean9 = generator0.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader10 = generator0.getClassLoader();
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.cglib.proxy.Mixin.Generator generator3 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean4 = generator3.getUseCache();
        boolean boolean5 = generator3.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator3.getStrategy();
        generator0.setStrategy(generatorStrategy6);
        org.mockito.cglib.core.NamingPolicy namingPolicy8 = generator0.getNamingPolicy();
        generator0.setAttemptLoad(false);
        org.mockito.cglib.proxy.Mixin.Generator generator11 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.proxy.Mixin.Generator generator12 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean13 = generator12.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy14 = generator12.getStrategy();
        generator11.setStrategy(generatorStrategy14);
        org.mockito.cglib.proxy.Mixin.Generator generator16 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean17 = generator16.getAttemptLoad();
        java.lang.Object obj18 = new java.lang.Object();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        java.lang.Object obj20 = new java.lang.Object();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        java.lang.Class[] classArray22 = new java.lang.Class[] { wildcardClass19, wildcardClass21 };
        generator16.setClasses(classArray22);
        generator11.setDelegates((java.lang.Object[]) classArray22);
        generator0.setDelegates((java.lang.Object[]) classArray22);
        org.mockito.cglib.core.NamingPolicy namingPolicy26 = generator0.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader27 = generator0.getClassLoader();
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        boolean boolean2 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        boolean boolean4 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        generator0.setUseCache(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy9 = generator0.getNamingPolicy();
        org.mockito.cglib.proxy.Mixin.Generator generator10 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean11 = generator10.getAttemptLoad();
        org.mockito.cglib.proxy.Mixin.Generator generator12 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator12.setUseCache(false);
        org.mockito.cglib.proxy.Mixin.Generator generator15 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean16 = generator15.getUseCache();
        boolean boolean17 = generator15.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy18 = generator15.getStrategy();
        generator12.setStrategy(generatorStrategy18);
        generator10.setStrategy(generatorStrategy18);
        generator0.setStrategy(generatorStrategy18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader22 = generator0.getClassLoader();
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        boolean boolean2 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        org.mockito.cglib.proxy.Mixin.Generator generator4 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean5 = generator4.getAttemptLoad();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        java.lang.Class[] classArray10 = new java.lang.Class[] { wildcardClass7, wildcardClass9 };
        generator4.setClasses(classArray10);
        generator0.setDelegates((java.lang.Object[]) classArray10);
        generator0.setAttemptLoad(true);
        boolean boolean15 = generator0.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader16 = generator0.getClassLoader();
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        boolean boolean2 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        boolean boolean4 = generator0.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader5 = generator0.getClassLoader();
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = generator0.getStrategy();
        boolean boolean3 = generator0.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy4 = generator0.getNamingPolicy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = generator0.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader6 = generator0.getClassLoader();
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = generator0.getStrategy();
        boolean boolean3 = generator0.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy4 = generator0.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader5 = generator0.getClassLoader();
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        generator0.setStyle(0);
        boolean boolean5 = generator0.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader6 = generator0.getClassLoader();
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        boolean boolean2 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        boolean boolean4 = generator0.getAttemptLoad();
        boolean boolean5 = generator0.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = generator0.getNamingPolicy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = generator0.getStrategy();
        boolean boolean8 = generator0.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader9 = generator0.getClassLoader();
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = generator0.getStrategy();
        boolean boolean3 = generator0.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator4 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator4.setUseCache(false);
        generator4.setUseCache(false);
        org.mockito.cglib.proxy.Mixin.Generator generator9 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean10 = generator9.getAttemptLoad();
        java.lang.Object obj11 = new java.lang.Object();
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Class[] classArray15 = new java.lang.Class[] { wildcardClass12, wildcardClass14 };
        generator9.setClasses(classArray15);
        java.lang.Class<?> wildcardClass17 = generator9.getClass();
        org.mockito.cglib.proxy.Mixin.Generator generator18 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator18.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy21 = generator18.getNamingPolicy();
        java.lang.Class<?> wildcardClass22 = namingPolicy21.getClass();
        org.mockito.cglib.proxy.Mixin.Generator generator23 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean24 = generator23.getAttemptLoad();
        java.lang.Object obj25 = new java.lang.Object();
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        java.lang.Object obj27 = new java.lang.Object();
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        java.lang.Class[] classArray29 = new java.lang.Class[] { wildcardClass26, wildcardClass28 };
        generator23.setClasses(classArray29);
        java.lang.Class<?> wildcardClass31 = generator23.getClass();
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Class<?> wildcardClass33 = obj32.getClass();
        org.mockito.cglib.proxy.Mixin.Generator generator34 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean35 = generator34.getAttemptLoad();
        java.lang.Object obj36 = new java.lang.Object();
        java.lang.Class<?> wildcardClass37 = obj36.getClass();
        java.lang.Object obj38 = new java.lang.Object();
        java.lang.Class<?> wildcardClass39 = obj38.getClass();
        java.lang.Class[] classArray40 = new java.lang.Class[] { wildcardClass37, wildcardClass39 };
        generator34.setClasses(classArray40);
        java.lang.Class<?> wildcardClass42 = generator34.getClass();
        org.mockito.cglib.proxy.Mixin.Generator generator43 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator43.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy46 = generator43.getNamingPolicy();
        java.lang.Class<?> wildcardClass47 = namingPolicy46.getClass();
        java.lang.Class[] classArray48 = new java.lang.Class[] { wildcardClass17, wildcardClass22, wildcardClass31, wildcardClass33, wildcardClass42, wildcardClass47 };
        generator4.setClasses(classArray48);
        generator0.setDelegates((java.lang.Object[]) classArray48);
        generator0.setUseCache(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader53 = generator0.getClassLoader();
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = generator0.getNamingPolicy();
        boolean boolean4 = generator0.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader5 = generator0.getClassLoader();
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = generator0.getStrategy();
        boolean boolean3 = generator0.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator4 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator4.setUseCache(false);
        generator4.setUseCache(false);
        org.mockito.cglib.proxy.Mixin.Generator generator9 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean10 = generator9.getAttemptLoad();
        java.lang.Object obj11 = new java.lang.Object();
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Class[] classArray15 = new java.lang.Class[] { wildcardClass12, wildcardClass14 };
        generator9.setClasses(classArray15);
        java.lang.Class<?> wildcardClass17 = generator9.getClass();
        org.mockito.cglib.proxy.Mixin.Generator generator18 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator18.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy21 = generator18.getNamingPolicy();
        java.lang.Class<?> wildcardClass22 = namingPolicy21.getClass();
        org.mockito.cglib.proxy.Mixin.Generator generator23 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean24 = generator23.getAttemptLoad();
        java.lang.Object obj25 = new java.lang.Object();
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        java.lang.Object obj27 = new java.lang.Object();
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        java.lang.Class[] classArray29 = new java.lang.Class[] { wildcardClass26, wildcardClass28 };
        generator23.setClasses(classArray29);
        java.lang.Class<?> wildcardClass31 = generator23.getClass();
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Class<?> wildcardClass33 = obj32.getClass();
        org.mockito.cglib.proxy.Mixin.Generator generator34 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean35 = generator34.getAttemptLoad();
        java.lang.Object obj36 = new java.lang.Object();
        java.lang.Class<?> wildcardClass37 = obj36.getClass();
        java.lang.Object obj38 = new java.lang.Object();
        java.lang.Class<?> wildcardClass39 = obj38.getClass();
        java.lang.Class[] classArray40 = new java.lang.Class[] { wildcardClass37, wildcardClass39 };
        generator34.setClasses(classArray40);
        java.lang.Class<?> wildcardClass42 = generator34.getClass();
        org.mockito.cglib.proxy.Mixin.Generator generator43 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator43.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy46 = generator43.getNamingPolicy();
        java.lang.Class<?> wildcardClass47 = namingPolicy46.getClass();
        java.lang.Class[] classArray48 = new java.lang.Class[] { wildcardClass17, wildcardClass22, wildcardClass31, wildcardClass33, wildcardClass42, wildcardClass47 };
        generator4.setClasses(classArray48);
        generator0.setDelegates((java.lang.Object[]) classArray48);
        generator0.setAttemptLoad(false);
        generator0.setAttemptLoad(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader55 = generator0.getClassLoader();
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        boolean boolean2 = generator0.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = generator0.getNamingPolicy();
        org.mockito.cglib.proxy.Mixin.Generator generator4 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator4.setUseCache(false);
        org.mockito.cglib.proxy.Mixin.Generator generator7 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator7.setUseCache(false);
        generator7.setUseCache(false);
        org.mockito.cglib.proxy.Mixin.Generator generator12 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean13 = generator12.getAttemptLoad();
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Object obj16 = new java.lang.Object();
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        java.lang.Class[] classArray18 = new java.lang.Class[] { wildcardClass15, wildcardClass17 };
        generator12.setClasses(classArray18);
        java.lang.Class<?> wildcardClass20 = generator12.getClass();
        org.mockito.cglib.proxy.Mixin.Generator generator21 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator21.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy24 = generator21.getNamingPolicy();
        java.lang.Class<?> wildcardClass25 = namingPolicy24.getClass();
        org.mockito.cglib.proxy.Mixin.Generator generator26 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean27 = generator26.getAttemptLoad();
        java.lang.Object obj28 = new java.lang.Object();
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
        java.lang.Object obj30 = new java.lang.Object();
        java.lang.Class<?> wildcardClass31 = obj30.getClass();
        java.lang.Class[] classArray32 = new java.lang.Class[] { wildcardClass29, wildcardClass31 };
        generator26.setClasses(classArray32);
        java.lang.Class<?> wildcardClass34 = generator26.getClass();
        java.lang.Object obj35 = new java.lang.Object();
        java.lang.Class<?> wildcardClass36 = obj35.getClass();
        org.mockito.cglib.proxy.Mixin.Generator generator37 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean38 = generator37.getAttemptLoad();
        java.lang.Object obj39 = new java.lang.Object();
        java.lang.Class<?> wildcardClass40 = obj39.getClass();
        java.lang.Object obj41 = new java.lang.Object();
        java.lang.Class<?> wildcardClass42 = obj41.getClass();
        java.lang.Class[] classArray43 = new java.lang.Class[] { wildcardClass40, wildcardClass42 };
        generator37.setClasses(classArray43);
        java.lang.Class<?> wildcardClass45 = generator37.getClass();
        org.mockito.cglib.proxy.Mixin.Generator generator46 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator46.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy49 = generator46.getNamingPolicy();
        java.lang.Class<?> wildcardClass50 = namingPolicy49.getClass();
        java.lang.Class[] classArray51 = new java.lang.Class[] { wildcardClass20, wildcardClass25, wildcardClass34, wildcardClass36, wildcardClass45, wildcardClass50 };
        generator7.setClasses(classArray51);
        generator4.setDelegates((java.lang.Object[]) classArray51);
        org.mockito.cglib.proxy.Mixin.Generator generator54 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy55 = generator54.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy56 = generator54.getNamingPolicy();
        generator4.setNamingPolicy(namingPolicy56);
        generator0.setNamingPolicy(namingPolicy56);
        boolean boolean59 = generator0.getUseCache();
        generator0.setUseCache(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader62 = generator0.getClassLoader();
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.cglib.proxy.Mixin.Generator generator3 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean4 = generator3.getUseCache();
        boolean boolean5 = generator3.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator3.getStrategy();
        generator0.setStrategy(generatorStrategy6);
        org.mockito.cglib.core.NamingPolicy namingPolicy8 = generator0.getNamingPolicy();
        generator0.setAttemptLoad(false);
        generator0.setAttemptLoad(true);
        generator0.setAttemptLoad(false);
        generator0.setUseCache(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader17 = generator0.getClassLoader();
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.cglib.proxy.Mixin.Generator generator3 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator3.setUseCache(false);
        generator3.setUseCache(false);
        org.mockito.cglib.proxy.Mixin.Generator generator8 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean9 = generator8.getAttemptLoad();
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        java.lang.Class[] classArray14 = new java.lang.Class[] { wildcardClass11, wildcardClass13 };
        generator8.setClasses(classArray14);
        java.lang.Class<?> wildcardClass16 = generator8.getClass();
        org.mockito.cglib.proxy.Mixin.Generator generator17 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator17.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy20 = generator17.getNamingPolicy();
        java.lang.Class<?> wildcardClass21 = namingPolicy20.getClass();
        org.mockito.cglib.proxy.Mixin.Generator generator22 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean23 = generator22.getAttemptLoad();
        java.lang.Object obj24 = new java.lang.Object();
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        java.lang.Class[] classArray28 = new java.lang.Class[] { wildcardClass25, wildcardClass27 };
        generator22.setClasses(classArray28);
        java.lang.Class<?> wildcardClass30 = generator22.getClass();
        java.lang.Object obj31 = new java.lang.Object();
        java.lang.Class<?> wildcardClass32 = obj31.getClass();
        org.mockito.cglib.proxy.Mixin.Generator generator33 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean34 = generator33.getAttemptLoad();
        java.lang.Object obj35 = new java.lang.Object();
        java.lang.Class<?> wildcardClass36 = obj35.getClass();
        java.lang.Object obj37 = new java.lang.Object();
        java.lang.Class<?> wildcardClass38 = obj37.getClass();
        java.lang.Class[] classArray39 = new java.lang.Class[] { wildcardClass36, wildcardClass38 };
        generator33.setClasses(classArray39);
        java.lang.Class<?> wildcardClass41 = generator33.getClass();
        org.mockito.cglib.proxy.Mixin.Generator generator42 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator42.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy45 = generator42.getNamingPolicy();
        java.lang.Class<?> wildcardClass46 = namingPolicy45.getClass();
        java.lang.Class[] classArray47 = new java.lang.Class[] { wildcardClass16, wildcardClass21, wildcardClass30, wildcardClass32, wildcardClass41, wildcardClass46 };
        generator3.setClasses(classArray47);
        generator0.setDelegates((java.lang.Object[]) classArray47);
        org.mockito.cglib.proxy.Mixin.Generator generator50 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy51 = generator50.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy52 = generator50.getNamingPolicy();
        generator0.setNamingPolicy(namingPolicy52);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy54 = generator0.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader55 = generator0.getClassLoader();
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.cglib.proxy.Mixin.Generator generator3 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean4 = generator3.getUseCache();
        boolean boolean5 = generator3.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator3.getStrategy();
        generator0.setStrategy(generatorStrategy6);
        org.mockito.cglib.core.NamingPolicy namingPolicy8 = generator0.getNamingPolicy();
        generator0.setAttemptLoad(false);
        org.mockito.cglib.proxy.Mixin.Generator generator11 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.proxy.Mixin.Generator generator12 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean13 = generator12.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy14 = generator12.getStrategy();
        generator11.setStrategy(generatorStrategy14);
        org.mockito.cglib.proxy.Mixin.Generator generator16 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean17 = generator16.getAttemptLoad();
        java.lang.Object obj18 = new java.lang.Object();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        java.lang.Object obj20 = new java.lang.Object();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        java.lang.Class[] classArray22 = new java.lang.Class[] { wildcardClass19, wildcardClass21 };
        generator16.setClasses(classArray22);
        generator11.setDelegates((java.lang.Object[]) classArray22);
        generator0.setDelegates((java.lang.Object[]) classArray22);
        boolean boolean26 = generator0.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader27 = generator0.getClassLoader();
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.cglib.proxy.Mixin.Generator generator3 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean4 = generator3.getUseCache();
        boolean boolean5 = generator3.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator3.getStrategy();
        generator0.setStrategy(generatorStrategy6);
        org.mockito.cglib.core.NamingPolicy namingPolicy8 = generator0.getNamingPolicy();
        generator0.setAttemptLoad(false);
        org.mockito.cglib.proxy.Mixin.Generator generator11 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.proxy.Mixin.Generator generator12 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean13 = generator12.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy14 = generator12.getStrategy();
        generator11.setStrategy(generatorStrategy14);
        org.mockito.cglib.proxy.Mixin.Generator generator16 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean17 = generator16.getAttemptLoad();
        java.lang.Object obj18 = new java.lang.Object();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        java.lang.Object obj20 = new java.lang.Object();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        java.lang.Class[] classArray22 = new java.lang.Class[] { wildcardClass19, wildcardClass21 };
        generator16.setClasses(classArray22);
        generator11.setDelegates((java.lang.Object[]) classArray22);
        generator0.setDelegates((java.lang.Object[]) classArray22);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy26 = generator0.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader27 = generator0.getClassLoader();
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        generator0.setStyle(0);
        boolean boolean5 = generator0.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator6 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy7 = generator6.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy8 = generator6.getNamingPolicy();
        generator0.setNamingPolicy(namingPolicy8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader10 = generator0.getClassLoader();
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        boolean boolean2 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        boolean boolean4 = generator0.getAttemptLoad();
        boolean boolean5 = generator0.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = generator0.getNamingPolicy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = generator0.getStrategy();
        boolean boolean8 = generator0.getUseCache();
        boolean boolean9 = generator0.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader10 = generator0.getClassLoader();
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        generator0.setStyle(0);
        org.mockito.cglib.proxy.Mixin.Generator generator5 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean6 = generator5.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = generator5.getStrategy();
        boolean boolean8 = generator5.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator9 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator9.setUseCache(false);
        generator9.setUseCache(false);
        org.mockito.cglib.proxy.Mixin.Generator generator14 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean15 = generator14.getAttemptLoad();
        java.lang.Object obj16 = new java.lang.Object();
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        java.lang.Object obj18 = new java.lang.Object();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        java.lang.Class[] classArray20 = new java.lang.Class[] { wildcardClass17, wildcardClass19 };
        generator14.setClasses(classArray20);
        java.lang.Class<?> wildcardClass22 = generator14.getClass();
        org.mockito.cglib.proxy.Mixin.Generator generator23 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator23.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy26 = generator23.getNamingPolicy();
        java.lang.Class<?> wildcardClass27 = namingPolicy26.getClass();
        org.mockito.cglib.proxy.Mixin.Generator generator28 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean29 = generator28.getAttemptLoad();
        java.lang.Object obj30 = new java.lang.Object();
        java.lang.Class<?> wildcardClass31 = obj30.getClass();
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Class<?> wildcardClass33 = obj32.getClass();
        java.lang.Class[] classArray34 = new java.lang.Class[] { wildcardClass31, wildcardClass33 };
        generator28.setClasses(classArray34);
        java.lang.Class<?> wildcardClass36 = generator28.getClass();
        java.lang.Object obj37 = new java.lang.Object();
        java.lang.Class<?> wildcardClass38 = obj37.getClass();
        org.mockito.cglib.proxy.Mixin.Generator generator39 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean40 = generator39.getAttemptLoad();
        java.lang.Object obj41 = new java.lang.Object();
        java.lang.Class<?> wildcardClass42 = obj41.getClass();
        java.lang.Object obj43 = new java.lang.Object();
        java.lang.Class<?> wildcardClass44 = obj43.getClass();
        java.lang.Class[] classArray45 = new java.lang.Class[] { wildcardClass42, wildcardClass44 };
        generator39.setClasses(classArray45);
        java.lang.Class<?> wildcardClass47 = generator39.getClass();
        org.mockito.cglib.proxy.Mixin.Generator generator48 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator48.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy51 = generator48.getNamingPolicy();
        java.lang.Class<?> wildcardClass52 = namingPolicy51.getClass();
        java.lang.Class[] classArray53 = new java.lang.Class[] { wildcardClass22, wildcardClass27, wildcardClass36, wildcardClass38, wildcardClass47, wildcardClass52 };
        generator9.setClasses(classArray53);
        generator5.setDelegates((java.lang.Object[]) classArray53);
        generator0.setDelegates((java.lang.Object[]) classArray53);
        boolean boolean57 = generator0.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy58 = generator0.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader59 = generator0.getClassLoader();
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = generator0.getStrategy();
        boolean boolean3 = generator0.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator4 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator4.setUseCache(false);
        generator4.setUseCache(false);
        org.mockito.cglib.proxy.Mixin.Generator generator9 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean10 = generator9.getAttemptLoad();
        java.lang.Object obj11 = new java.lang.Object();
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Class[] classArray15 = new java.lang.Class[] { wildcardClass12, wildcardClass14 };
        generator9.setClasses(classArray15);
        java.lang.Class<?> wildcardClass17 = generator9.getClass();
        org.mockito.cglib.proxy.Mixin.Generator generator18 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator18.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy21 = generator18.getNamingPolicy();
        java.lang.Class<?> wildcardClass22 = namingPolicy21.getClass();
        org.mockito.cglib.proxy.Mixin.Generator generator23 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean24 = generator23.getAttemptLoad();
        java.lang.Object obj25 = new java.lang.Object();
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        java.lang.Object obj27 = new java.lang.Object();
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        java.lang.Class[] classArray29 = new java.lang.Class[] { wildcardClass26, wildcardClass28 };
        generator23.setClasses(classArray29);
        java.lang.Class<?> wildcardClass31 = generator23.getClass();
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Class<?> wildcardClass33 = obj32.getClass();
        org.mockito.cglib.proxy.Mixin.Generator generator34 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean35 = generator34.getAttemptLoad();
        java.lang.Object obj36 = new java.lang.Object();
        java.lang.Class<?> wildcardClass37 = obj36.getClass();
        java.lang.Object obj38 = new java.lang.Object();
        java.lang.Class<?> wildcardClass39 = obj38.getClass();
        java.lang.Class[] classArray40 = new java.lang.Class[] { wildcardClass37, wildcardClass39 };
        generator34.setClasses(classArray40);
        java.lang.Class<?> wildcardClass42 = generator34.getClass();
        org.mockito.cglib.proxy.Mixin.Generator generator43 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator43.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy46 = generator43.getNamingPolicy();
        java.lang.Class<?> wildcardClass47 = namingPolicy46.getClass();
        java.lang.Class[] classArray48 = new java.lang.Class[] { wildcardClass17, wildcardClass22, wildcardClass31, wildcardClass33, wildcardClass42, wildcardClass47 };
        generator4.setClasses(classArray48);
        generator0.setDelegates((java.lang.Object[]) classArray48);
        org.mockito.cglib.proxy.Mixin.Generator generator51 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean52 = generator51.getUseCache();
        boolean boolean53 = generator51.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy54 = generator51.getStrategy();
        boolean boolean55 = generator51.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator56 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.proxy.Mixin.Generator generator57 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean58 = generator57.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy59 = generator57.getStrategy();
        generator56.setStrategy(generatorStrategy59);
        org.mockito.cglib.proxy.Mixin.Generator generator61 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean62 = generator61.getAttemptLoad();
        java.lang.Object obj63 = new java.lang.Object();
        java.lang.Class<?> wildcardClass64 = obj63.getClass();
        java.lang.Object obj65 = new java.lang.Object();
        java.lang.Class<?> wildcardClass66 = obj65.getClass();
        java.lang.Class[] classArray67 = new java.lang.Class[] { wildcardClass64, wildcardClass66 };
        generator61.setClasses(classArray67);
        generator56.setDelegates((java.lang.Object[]) classArray67);
        generator51.setClasses(classArray67);
        generator0.setDelegates((java.lang.Object[]) classArray67);
        org.mockito.cglib.core.NamingPolicy namingPolicy72 = generator0.getNamingPolicy();
        generator0.setUseCache(false);
        boolean boolean75 = generator0.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader76 = generator0.getClassLoader();
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        boolean boolean2 = generator0.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader3 = generator0.getClassLoader();
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = generator0.getNamingPolicy();
        boolean boolean4 = generator0.getAttemptLoad();
        boolean boolean5 = generator0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator0.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader7 = generator0.getClassLoader();
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean3 = generator2.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy4 = generator2.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = generator2.getStrategy();
        org.mockito.cglib.proxy.Mixin.Generator generator6 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean7 = generator6.getUseCache();
        boolean boolean8 = generator6.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = generator6.getStrategy();
        generator2.setStrategy(generatorStrategy9);
        boolean boolean11 = generator2.getAttemptLoad();
        org.mockito.cglib.proxy.Mixin.Generator generator12 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.proxy.Mixin.Generator generator13 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean14 = generator13.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy15 = generator13.getStrategy();
        generator12.setStrategy(generatorStrategy15);
        org.mockito.cglib.proxy.Mixin.Generator generator17 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean18 = generator17.getUseCache();
        boolean boolean19 = generator17.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy20 = generator17.getNamingPolicy();
        generator12.setNamingPolicy(namingPolicy20);
        generator2.setNamingPolicy(namingPolicy20);
        generator0.setNamingPolicy(namingPolicy20);
        generator0.setUseCache(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy26 = generator0.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader27 = generator0.getClassLoader();
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        boolean boolean3 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        boolean boolean6 = generator0.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader7 = generator0.getClassLoader();
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        boolean boolean2 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator5 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean6 = generator5.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = generator5.getStrategy();
        generator0.setStrategy(generatorStrategy7);
        generator0.setStyle(0);
        boolean boolean11 = generator0.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader12 = generator0.getClassLoader();
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        boolean boolean2 = generator0.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = generator0.getNamingPolicy();
        boolean boolean4 = generator0.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader5 = generator0.getClassLoader();
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = generator0.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy4 = generator0.getNamingPolicy();
        generator0.setAttemptLoad(false);
        generator0.setAttemptLoad(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader9 = generator0.getClassLoader();
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.proxy.Mixin.Generator generator3 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean4 = generator3.getAttemptLoad();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        java.lang.Class[] classArray9 = new java.lang.Class[] { wildcardClass6, wildcardClass8 };
        generator3.setClasses(classArray9);
        generator2.setClasses(classArray9);
        org.mockito.cglib.proxy.Mixin.Generator generator12 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean13 = generator12.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy14 = generator12.getStrategy();
        generator2.setStrategy(generatorStrategy14);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = generator2.getStrategy();
        org.mockito.cglib.proxy.Mixin.Generator generator17 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean18 = generator17.getAttemptLoad();
        java.lang.Object obj19 = new java.lang.Object();
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        java.lang.Object obj21 = new java.lang.Object();
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        java.lang.Class[] classArray23 = new java.lang.Class[] { wildcardClass20, wildcardClass22 };
        generator17.setClasses(classArray23);
        boolean boolean25 = generator17.getAttemptLoad();
        boolean boolean26 = generator17.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy27 = generator17.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy28 = generator17.getNamingPolicy();
        generator2.setNamingPolicy(namingPolicy28);
        generator0.setNamingPolicy(namingPolicy28);
        generator0.setUseCache(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader33 = generator0.getClassLoader();
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        boolean boolean2 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        org.mockito.cglib.proxy.Mixin.Generator generator4 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean5 = generator4.getAttemptLoad();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        java.lang.Class[] classArray10 = new java.lang.Class[] { wildcardClass7, wildcardClass9 };
        generator4.setClasses(classArray10);
        generator0.setDelegates((java.lang.Object[]) classArray10);
        org.mockito.cglib.proxy.Mixin.Generator generator13 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean14 = generator13.getAttemptLoad();
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.Class[] classArray19 = new java.lang.Class[] { wildcardClass16, wildcardClass18 };
        generator13.setClasses(classArray19);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy21 = generator13.getStrategy();
        generator0.setStrategy(generatorStrategy21);
        org.mockito.cglib.proxy.Mixin.Generator generator23 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean24 = generator23.getAttemptLoad();
        java.lang.Object obj25 = new java.lang.Object();
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        java.lang.Object obj27 = new java.lang.Object();
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        java.lang.Class[] classArray29 = new java.lang.Class[] { wildcardClass26, wildcardClass28 };
        generator23.setClasses(classArray29);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy31 = generator23.getStrategy();
        generator0.setStrategy(generatorStrategy31);
        generator0.setAttemptLoad(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader35 = generator0.getClassLoader();
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        generator0.setStyle(0);
        boolean boolean5 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator0.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader7 = generator0.getClassLoader();
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = generator0.getNamingPolicy();
        boolean boolean4 = generator0.getAttemptLoad();
        boolean boolean5 = generator0.getAttemptLoad();
        generator0.setUseCache(false);
        generator0.setUseCache(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader10 = generator0.getClassLoader();
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        org.mockito.cglib.proxy.Mixin.Generator generator4 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean5 = generator4.getUseCache();
        boolean boolean6 = generator4.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = generator4.getStrategy();
        generator0.setStrategy(generatorStrategy7);
        org.mockito.cglib.proxy.Mixin.Generator generator9 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator9.setUseCache(false);
        org.mockito.cglib.proxy.Mixin.Generator generator12 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator12.setUseCache(false);
        generator12.setUseCache(false);
        org.mockito.cglib.proxy.Mixin.Generator generator17 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean18 = generator17.getAttemptLoad();
        java.lang.Object obj19 = new java.lang.Object();
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        java.lang.Object obj21 = new java.lang.Object();
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        java.lang.Class[] classArray23 = new java.lang.Class[] { wildcardClass20, wildcardClass22 };
        generator17.setClasses(classArray23);
        java.lang.Class<?> wildcardClass25 = generator17.getClass();
        org.mockito.cglib.proxy.Mixin.Generator generator26 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator26.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy29 = generator26.getNamingPolicy();
        java.lang.Class<?> wildcardClass30 = namingPolicy29.getClass();
        org.mockito.cglib.proxy.Mixin.Generator generator31 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean32 = generator31.getAttemptLoad();
        java.lang.Object obj33 = new java.lang.Object();
        java.lang.Class<?> wildcardClass34 = obj33.getClass();
        java.lang.Object obj35 = new java.lang.Object();
        java.lang.Class<?> wildcardClass36 = obj35.getClass();
        java.lang.Class[] classArray37 = new java.lang.Class[] { wildcardClass34, wildcardClass36 };
        generator31.setClasses(classArray37);
        java.lang.Class<?> wildcardClass39 = generator31.getClass();
        java.lang.Object obj40 = new java.lang.Object();
        java.lang.Class<?> wildcardClass41 = obj40.getClass();
        org.mockito.cglib.proxy.Mixin.Generator generator42 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean43 = generator42.getAttemptLoad();
        java.lang.Object obj44 = new java.lang.Object();
        java.lang.Class<?> wildcardClass45 = obj44.getClass();
        java.lang.Object obj46 = new java.lang.Object();
        java.lang.Class<?> wildcardClass47 = obj46.getClass();
        java.lang.Class[] classArray48 = new java.lang.Class[] { wildcardClass45, wildcardClass47 };
        generator42.setClasses(classArray48);
        java.lang.Class<?> wildcardClass50 = generator42.getClass();
        org.mockito.cglib.proxy.Mixin.Generator generator51 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator51.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy54 = generator51.getNamingPolicy();
        java.lang.Class<?> wildcardClass55 = namingPolicy54.getClass();
        java.lang.Class[] classArray56 = new java.lang.Class[] { wildcardClass25, wildcardClass30, wildcardClass39, wildcardClass41, wildcardClass50, wildcardClass55 };
        generator12.setClasses(classArray56);
        generator9.setDelegates((java.lang.Object[]) classArray56);
        generator0.setDelegates((java.lang.Object[]) classArray56);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader60 = generator0.getClassLoader();
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        boolean boolean2 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        org.mockito.cglib.proxy.Mixin.Generator generator4 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean5 = generator4.getAttemptLoad();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        java.lang.Class[] classArray10 = new java.lang.Class[] { wildcardClass7, wildcardClass9 };
        generator4.setClasses(classArray10);
        generator0.setDelegates((java.lang.Object[]) classArray10);
        org.mockito.cglib.proxy.Mixin.Generator generator13 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean14 = generator13.getAttemptLoad();
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.Class[] classArray19 = new java.lang.Class[] { wildcardClass16, wildcardClass18 };
        generator13.setClasses(classArray19);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy21 = generator13.getStrategy();
        generator0.setStrategy(generatorStrategy21);
        generator0.setAttemptLoad(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader25 = generator0.getClassLoader();
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = generator0.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy4 = generator0.getNamingPolicy();
        generator0.setAttemptLoad(false);
        boolean boolean7 = generator0.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader8 = generator0.getClassLoader();
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        boolean boolean2 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        boolean boolean4 = generator0.getAttemptLoad();
        boolean boolean5 = generator0.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = generator0.getNamingPolicy();
        org.mockito.cglib.proxy.Mixin.Generator generator7 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean8 = generator7.getAttemptLoad();
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        java.lang.Object obj11 = new java.lang.Object();
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        java.lang.Class[] classArray13 = new java.lang.Class[] { wildcardClass10, wildcardClass12 };
        generator7.setClasses(classArray13);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy15 = generator7.getStrategy();
        generator7.setStyle((int) (short) 0);
        org.mockito.cglib.proxy.Mixin.Generator generator18 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator18.setUseCache(false);
        generator18.setUseCache(false);
        org.mockito.cglib.proxy.Mixin.Generator generator23 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean24 = generator23.getAttemptLoad();
        java.lang.Object obj25 = new java.lang.Object();
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        java.lang.Object obj27 = new java.lang.Object();
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        java.lang.Class[] classArray29 = new java.lang.Class[] { wildcardClass26, wildcardClass28 };
        generator23.setClasses(classArray29);
        java.lang.Class<?> wildcardClass31 = generator23.getClass();
        org.mockito.cglib.proxy.Mixin.Generator generator32 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator32.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy35 = generator32.getNamingPolicy();
        java.lang.Class<?> wildcardClass36 = namingPolicy35.getClass();
        org.mockito.cglib.proxy.Mixin.Generator generator37 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean38 = generator37.getAttemptLoad();
        java.lang.Object obj39 = new java.lang.Object();
        java.lang.Class<?> wildcardClass40 = obj39.getClass();
        java.lang.Object obj41 = new java.lang.Object();
        java.lang.Class<?> wildcardClass42 = obj41.getClass();
        java.lang.Class[] classArray43 = new java.lang.Class[] { wildcardClass40, wildcardClass42 };
        generator37.setClasses(classArray43);
        java.lang.Class<?> wildcardClass45 = generator37.getClass();
        java.lang.Object obj46 = new java.lang.Object();
        java.lang.Class<?> wildcardClass47 = obj46.getClass();
        org.mockito.cglib.proxy.Mixin.Generator generator48 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean49 = generator48.getAttemptLoad();
        java.lang.Object obj50 = new java.lang.Object();
        java.lang.Class<?> wildcardClass51 = obj50.getClass();
        java.lang.Object obj52 = new java.lang.Object();
        java.lang.Class<?> wildcardClass53 = obj52.getClass();
        java.lang.Class[] classArray54 = new java.lang.Class[] { wildcardClass51, wildcardClass53 };
        generator48.setClasses(classArray54);
        java.lang.Class<?> wildcardClass56 = generator48.getClass();
        org.mockito.cglib.proxy.Mixin.Generator generator57 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator57.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy60 = generator57.getNamingPolicy();
        java.lang.Class<?> wildcardClass61 = namingPolicy60.getClass();
        java.lang.Class[] classArray62 = new java.lang.Class[] { wildcardClass31, wildcardClass36, wildcardClass45, wildcardClass47, wildcardClass56, wildcardClass61 };
        generator18.setClasses(classArray62);
        generator7.setClasses(classArray62);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy65 = generator7.getStrategy();
        java.lang.ClassLoader classLoader66 = generator7.getClassLoader();
        generator7.setUseCache(true);
        org.mockito.cglib.proxy.Mixin.Generator generator69 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.proxy.Mixin.Generator generator70 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean71 = generator70.getAttemptLoad();
        java.lang.Object obj72 = new java.lang.Object();
        java.lang.Class<?> wildcardClass73 = obj72.getClass();
        java.lang.Object obj74 = new java.lang.Object();
        java.lang.Class<?> wildcardClass75 = obj74.getClass();
        java.lang.Class[] classArray76 = new java.lang.Class[] { wildcardClass73, wildcardClass75 };
        generator70.setClasses(classArray76);
        generator69.setClasses(classArray76);
        org.mockito.cglib.proxy.Mixin.Generator generator79 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean80 = generator79.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy81 = generator79.getStrategy();
        generator69.setStrategy(generatorStrategy81);
        java.lang.ClassLoader classLoader83 = generator69.getClassLoader();
        boolean boolean84 = generator69.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy85 = generator69.getNamingPolicy();
        generator7.setNamingPolicy(namingPolicy85);
        generator0.setNamingPolicy(namingPolicy85);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader88 = generator0.getClassLoader();
    }
}

