import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        enhancer0.setInterceptDuringConstruction(true);
        boolean boolean4 = enhancer0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader7 = enhancer6.getClassLoader();
        enhancer6.setInterceptDuringConstruction(true);
        java.lang.ClassLoader classLoader10 = enhancer6.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = enhancer6.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray12 = generatorStrategy5.generate((org.mockito.cglib.core.ClassGenerator) enhancer6);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setSerialVersionUID((java.lang.Long) (-1L));
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer4 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader5 = enhancer4.getClassLoader();
        enhancer4.setInterceptDuringConstruction(true);
        enhancer4.setSerialVersionUID((java.lang.Long) (-1L));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray10 = generatorStrategy3.generate((org.mockito.cglib.core.ClassGenerator) enhancer4);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setSerialVersionUID((java.lang.Long) (-1L));
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer4 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader5 = enhancer4.getClassLoader();
        enhancer4.setInterceptDuringConstruction(true);
        boolean boolean8 = enhancer4.getUseCache();
        boolean boolean9 = enhancer4.getAttemptLoad();
        enhancer4.setInterceptDuringConstruction(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray12 = generatorStrategy3.generate((org.mockito.cglib.core.ClassGenerator) enhancer4);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        enhancer0.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.Enhancer enhancer4 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader5 = enhancer4.getClassLoader();
        enhancer0.setClassLoader(classLoader5);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = enhancer0.getStrategy();
        enhancer0.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.Enhancer enhancer10 = new org.mockito.cglib.proxy.Enhancer();
        enhancer10.setSerialVersionUID((java.lang.Long) (-1L));
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = enhancer10.getStrategy();
        enhancer0.setStrategy(generatorStrategy13);
        org.mockito.cglib.proxy.Enhancer enhancer15 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader16 = enhancer15.getClassLoader();
        enhancer15.setUseCache(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy19 = enhancer15.getStrategy();
        boolean boolean20 = enhancer15.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray21 = generatorStrategy13.generate((org.mockito.cglib.core.ClassGenerator) enhancer15);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        enhancer0.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.Enhancer enhancer4 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader5 = enhancer4.getClassLoader();
        enhancer0.setClassLoader(classLoader5);
        enhancer0.setUseCache(false);
        org.mockito.cglib.proxy.Enhancer enhancer9 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader10 = enhancer9.getClassLoader();
        enhancer9.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.Enhancer enhancer13 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader14 = enhancer13.getClassLoader();
        enhancer9.setClassLoader(classLoader14);
        enhancer9.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy18 = enhancer9.getNamingPolicy();
        enhancer0.setNamingPolicy(namingPolicy18);
        enhancer0.setInterceptDuringConstruction(true);
        enhancer0.setSerialVersionUID((java.lang.Long) 100L);
        org.mockito.cglib.proxy.Enhancer enhancer24 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader25 = enhancer24.getClassLoader();
        enhancer24.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.Enhancer enhancer28 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader29 = enhancer28.getClassLoader();
        enhancer24.setClassLoader(classLoader29);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy31 = enhancer24.getStrategy();
        enhancer24.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.Enhancer enhancer34 = new org.mockito.cglib.proxy.Enhancer();
        enhancer34.setSerialVersionUID((java.lang.Long) (-1L));
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy37 = enhancer34.getStrategy();
        enhancer24.setStrategy(generatorStrategy37);
        enhancer0.setStrategy(generatorStrategy37);
        org.mockito.cglib.proxy.Enhancer enhancer40 = new org.mockito.cglib.proxy.Enhancer();
        enhancer40.setSerialVersionUID((java.lang.Long) (-1L));
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy43 = enhancer40.getStrategy();
        enhancer0.setStrategy(generatorStrategy43);
        org.mockito.cglib.proxy.Enhancer enhancer45 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader46 = enhancer45.getClassLoader();
        enhancer45.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.Enhancer enhancer49 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader50 = enhancer49.getClassLoader();
        enhancer45.setClassLoader(classLoader50);
        enhancer45.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy54 = enhancer45.getNamingPolicy();
        enhancer45.setInterceptDuringConstruction(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray57 = generatorStrategy43.generate((org.mockito.cglib.core.ClassGenerator) enhancer45);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        enhancer0.setInterceptDuringConstruction(true);
        boolean boolean4 = enhancer0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer0.getStrategy();
        java.lang.Class[] classArray6 = new java.lang.Class[] {};
        enhancer0.setInterfaces(classArray6);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy8 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer9 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader10 = enhancer9.getClassLoader();
        enhancer9.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.Enhancer enhancer13 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader14 = enhancer13.getClassLoader();
        enhancer9.setClassLoader(classLoader14);
        enhancer9.setUseCache(false);
        java.lang.ClassLoader classLoader18 = enhancer9.getClassLoader();
        org.mockito.cglib.core.NamingPolicy namingPolicy19 = enhancer9.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy20 = enhancer9.getNamingPolicy();
        enhancer9.setUseCache(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray23 = generatorStrategy8.generate((org.mockito.cglib.core.ClassGenerator) enhancer9);
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test7");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        enhancer0.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.Enhancer enhancer4 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader5 = enhancer4.getClassLoader();
        enhancer0.setClassLoader(classLoader5);
        enhancer0.setUseCache(false);
        org.mockito.cglib.proxy.Enhancer enhancer9 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader10 = enhancer9.getClassLoader();
        enhancer9.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.Enhancer enhancer13 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader14 = enhancer13.getClassLoader();
        enhancer9.setClassLoader(classLoader14);
        enhancer9.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy18 = enhancer9.getNamingPolicy();
        enhancer0.setNamingPolicy(namingPolicy18);
        enhancer0.setInterceptDuringConstruction(true);
        enhancer0.setSerialVersionUID((java.lang.Long) 100L);
        org.mockito.cglib.proxy.Enhancer enhancer24 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader25 = enhancer24.getClassLoader();
        enhancer24.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.Enhancer enhancer28 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader29 = enhancer28.getClassLoader();
        enhancer24.setClassLoader(classLoader29);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy31 = enhancer24.getStrategy();
        enhancer24.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.Enhancer enhancer34 = new org.mockito.cglib.proxy.Enhancer();
        enhancer34.setSerialVersionUID((java.lang.Long) (-1L));
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy37 = enhancer34.getStrategy();
        enhancer24.setStrategy(generatorStrategy37);
        enhancer0.setStrategy(generatorStrategy37);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy40 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer41 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader42 = enhancer41.getClassLoader();
        enhancer41.setInterceptDuringConstruction(true);
        boolean boolean45 = enhancer41.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy46 = enhancer41.getStrategy();
        boolean boolean47 = enhancer41.getUseCache();
        boolean boolean48 = enhancer41.getUseCache();
        org.mockito.cglib.proxy.Enhancer enhancer49 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader50 = enhancer49.getClassLoader();
        enhancer49.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.Enhancer enhancer53 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader54 = enhancer53.getClassLoader();
        enhancer49.setClassLoader(classLoader54);
        enhancer49.setUseCache(false);
        org.mockito.cglib.proxy.Enhancer enhancer58 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader59 = enhancer58.getClassLoader();
        enhancer58.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.Enhancer enhancer62 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader63 = enhancer62.getClassLoader();
        enhancer58.setClassLoader(classLoader63);
        enhancer58.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy67 = enhancer58.getNamingPolicy();
        enhancer49.setNamingPolicy(namingPolicy67);
        enhancer49.setInterceptDuringConstruction(true);
        enhancer49.setSerialVersionUID((java.lang.Long) 100L);
        org.mockito.cglib.proxy.Enhancer enhancer73 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader74 = enhancer73.getClassLoader();
        enhancer73.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.Enhancer enhancer77 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader78 = enhancer77.getClassLoader();
        enhancer73.setClassLoader(classLoader78);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy80 = enhancer73.getStrategy();
        enhancer73.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.Enhancer enhancer83 = new org.mockito.cglib.proxy.Enhancer();
        enhancer83.setSerialVersionUID((java.lang.Long) (-1L));
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy86 = enhancer83.getStrategy();
        enhancer73.setStrategy(generatorStrategy86);
        enhancer49.setStrategy(generatorStrategy86);
        org.mockito.cglib.proxy.Enhancer enhancer89 = new org.mockito.cglib.proxy.Enhancer();
        enhancer89.setSerialVersionUID((java.lang.Long) (-1L));
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy92 = enhancer89.getStrategy();
        enhancer49.setStrategy(generatorStrategy92);
        enhancer41.setStrategy(generatorStrategy92);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray95 = generatorStrategy40.generate((org.mockito.cglib.core.ClassGenerator) enhancer41);
    }

    @Test
    public void test8() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test8");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        boolean boolean2 = enhancer0.getAttemptLoad();
        enhancer0.setInterceptDuringConstruction(false);
        enhancer0.setSerialVersionUID((java.lang.Long) 10L);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = enhancer0.getStrategy();
        boolean boolean8 = enhancer0.getAttemptLoad();
        enhancer0.setInterceptDuringConstruction(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = enhancer0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer13 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader14 = enhancer13.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer15 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer16 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader17 = enhancer16.getClassLoader();
        enhancer16.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.Enhancer enhancer20 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader21 = enhancer20.getClassLoader();
        enhancer16.setClassLoader(classLoader21);
        enhancer15.setClassLoader(classLoader21);
        enhancer13.setClassLoader(classLoader21);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy25 = enhancer13.getStrategy();
        java.lang.ClassLoader classLoader26 = enhancer13.getClassLoader();
        enhancer13.setAttemptLoad(true);
        enhancer13.setAttemptLoad(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray31 = generatorStrategy12.generate((org.mockito.cglib.core.ClassGenerator) enhancer13);
    }

    @Test
    public void test9() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test9");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        enhancer0.setInterceptDuringConstruction(true);
        boolean boolean4 = enhancer0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer0.getStrategy();
        boolean boolean7 = generatorStrategy5.equals((java.lang.Object) (short) -1);
        org.mockito.cglib.proxy.Enhancer enhancer8 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader9 = enhancer8.getClassLoader();
        enhancer8.setInterceptDuringConstruction(true);
        boolean boolean12 = enhancer8.getUseCache();
        boolean boolean13 = enhancer8.getUseCache();
        enhancer8.setUseFactory(true);
        java.lang.ClassLoader classLoader16 = enhancer8.getClassLoader();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray17 = generatorStrategy5.generate((org.mockito.cglib.core.ClassGenerator) enhancer8);
    }
}

