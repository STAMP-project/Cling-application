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
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setAttemptLoad(true);
        boolean boolean3 = enhancer0.getAttemptLoad();
        java.lang.ClassLoader classLoader4 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        enhancer6.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy9 = enhancer6.getNamingPolicy();
        java.lang.ClassLoader classLoader10 = enhancer6.getClassLoader();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray11 = generatorStrategy5.generate((org.mockito.cglib.core.ClassGenerator) enhancer6);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setAttemptLoad(true);
        boolean boolean3 = enhancer0.getAttemptLoad();
        java.lang.ClassLoader classLoader4 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        enhancer6.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy9 = enhancer6.getNamingPolicy();
        java.lang.ClassLoader classLoader10 = enhancer6.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer11 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader12 = enhancer11.getClassLoader();
        enhancer6.setClassLoader(classLoader12);
        java.lang.ClassLoader classLoader14 = enhancer6.getClassLoader();
        enhancer6.setAttemptLoad(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray17 = generatorStrategy5.generate((org.mockito.cglib.core.ClassGenerator) enhancer6);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = enhancer0.getNamingPolicy();
        java.lang.ClassLoader classLoader4 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer5 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader6 = enhancer5.getClassLoader();
        enhancer0.setClassLoader(classLoader6);
        org.mockito.cglib.proxy.Enhancer enhancer8 = new org.mockito.cglib.proxy.Enhancer();
        boolean boolean9 = enhancer8.getUseCache();
        java.lang.ClassLoader classLoader10 = enhancer8.getClassLoader();
        enhancer0.setClassLoader(classLoader10);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer13 = new org.mockito.cglib.proxy.Enhancer();
        boolean boolean14 = enhancer13.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray15 = generatorStrategy12.generate((org.mockito.cglib.core.ClassGenerator) enhancer13);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = enhancer0.getNamingPolicy();
        java.lang.ClassLoader classLoader4 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer5 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader6 = enhancer5.getClassLoader();
        enhancer0.setClassLoader(classLoader6);
        org.mockito.cglib.proxy.Enhancer enhancer8 = new org.mockito.cglib.proxy.Enhancer();
        boolean boolean9 = enhancer8.getUseCache();
        java.lang.ClassLoader classLoader10 = enhancer8.getClassLoader();
        enhancer0.setClassLoader(classLoader10);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer13 = new org.mockito.cglib.proxy.Enhancer();
        enhancer13.setAttemptLoad(true);
        enhancer13.setSerialVersionUID((java.lang.Long) (-1L));
        enhancer13.setInterceptDuringConstruction(true);
        enhancer13.setUseCache(true);
        boolean boolean22 = enhancer13.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray23 = generatorStrategy12.generate((org.mockito.cglib.core.ClassGenerator) enhancer13);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = enhancer0.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer4 = new org.mockito.cglib.proxy.Enhancer();
        enhancer4.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy7 = enhancer4.getNamingPolicy();
        java.lang.ClassLoader classLoader8 = enhancer4.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer9 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader10 = enhancer9.getClassLoader();
        enhancer4.setClassLoader(classLoader10);
        boolean boolean12 = enhancer4.getUseCache();
        boolean boolean13 = namingPolicy3.equals((java.lang.Object) enhancer4);
        org.mockito.cglib.proxy.Enhancer enhancer14 = new org.mockito.cglib.proxy.Enhancer();
        enhancer14.setAttemptLoad(true);
        boolean boolean17 = enhancer14.getAttemptLoad();
        java.lang.ClassLoader classLoader18 = enhancer14.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy19 = enhancer14.getStrategy();
        enhancer4.setStrategy(generatorStrategy19);
        org.mockito.cglib.proxy.Enhancer enhancer21 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader22 = enhancer21.getClassLoader();
        java.lang.Object obj23 = new java.lang.Object();
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        java.lang.Object obj25 = new java.lang.Object();
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        boolean boolean27 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass26);
        java.lang.Object obj28 = new java.lang.Object();
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
        boolean boolean30 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass29);
        java.lang.Object obj31 = new java.lang.Object();
        java.lang.Class<?> wildcardClass32 = obj31.getClass();
        boolean boolean33 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass32);
        java.lang.Object obj34 = new java.lang.Object();
        java.lang.Class<?> wildcardClass35 = obj34.getClass();
        java.lang.Object obj36 = new java.lang.Object();
        java.lang.Class<?> wildcardClass37 = obj36.getClass();
        boolean boolean38 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass37);
        java.lang.Class[] classArray39 = new java.lang.Class[] { wildcardClass24, wildcardClass26, wildcardClass29, wildcardClass32, wildcardClass35, wildcardClass37 };
        enhancer21.setInterfaces(classArray39);
        org.mockito.cglib.proxy.Enhancer enhancer41 = new org.mockito.cglib.proxy.Enhancer();
        enhancer41.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy44 = enhancer41.getNamingPolicy();
        enhancer21.setNamingPolicy(namingPolicy44);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray46 = generatorStrategy19.generate((org.mockito.cglib.core.ClassGenerator) enhancer21);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = enhancer0.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer4 = new org.mockito.cglib.proxy.Enhancer();
        enhancer4.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy7 = enhancer4.getNamingPolicy();
        java.lang.ClassLoader classLoader8 = enhancer4.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer9 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader10 = enhancer9.getClassLoader();
        enhancer4.setClassLoader(classLoader10);
        boolean boolean12 = enhancer4.getUseCache();
        boolean boolean13 = namingPolicy3.equals((java.lang.Object) enhancer4);
        org.mockito.cglib.proxy.Enhancer enhancer14 = new org.mockito.cglib.proxy.Enhancer();
        enhancer14.setAttemptLoad(true);
        boolean boolean17 = enhancer14.getAttemptLoad();
        java.lang.ClassLoader classLoader18 = enhancer14.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy19 = enhancer14.getStrategy();
        enhancer4.setStrategy(generatorStrategy19);
        org.mockito.cglib.proxy.Enhancer enhancer21 = new org.mockito.cglib.proxy.Enhancer();
        enhancer21.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy24 = enhancer21.getNamingPolicy();
        java.lang.ClassLoader classLoader25 = enhancer21.getClassLoader();
        enhancer21.setInterceptDuringConstruction(false);
        enhancer21.setInterceptDuringConstruction(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray30 = generatorStrategy19.generate((org.mockito.cglib.core.ClassGenerator) enhancer21);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setAttemptLoad(true);
        enhancer0.setSerialVersionUID((java.lang.Long) (-1L));
        enhancer0.setInterceptDuringConstruction(true);
        enhancer0.setUseCache(true);
        boolean boolean9 = enhancer0.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer10 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader11 = enhancer10.getClassLoader();
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        boolean boolean16 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass15);
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        boolean boolean19 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass18);
        java.lang.Object obj20 = new java.lang.Object();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        boolean boolean22 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass21);
        java.lang.Object obj23 = new java.lang.Object();
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        java.lang.Object obj25 = new java.lang.Object();
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        boolean boolean27 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass26);
        java.lang.Class[] classArray28 = new java.lang.Class[] { wildcardClass13, wildcardClass15, wildcardClass18, wildcardClass21, wildcardClass24, wildcardClass26 };
        enhancer10.setInterfaces(classArray28);
        org.mockito.cglib.proxy.Enhancer enhancer30 = new org.mockito.cglib.proxy.Enhancer();
        enhancer30.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy33 = enhancer30.getNamingPolicy();
        java.lang.ClassLoader classLoader34 = enhancer30.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer35 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader36 = enhancer35.getClassLoader();
        enhancer30.setClassLoader(classLoader36);
        enhancer10.setClassLoader(classLoader36);
        java.lang.ClassLoader classLoader39 = enhancer10.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer40 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader41 = enhancer40.getClassLoader();
        enhancer40.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy44 = enhancer40.getNamingPolicy();
        enhancer10.setNamingPolicy(namingPolicy44);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy46 = enhancer10.getStrategy();
        enhancer0.setStrategy(generatorStrategy46);
        org.mockito.cglib.proxy.Enhancer enhancer48 = new org.mockito.cglib.proxy.Enhancer();
        enhancer48.setAttemptLoad(true);
        enhancer48.setSerialVersionUID((java.lang.Long) (-1L));
        enhancer48.setInterceptDuringConstruction(true);
        java.lang.Object obj55 = new java.lang.Object();
        java.lang.Class<?> wildcardClass56 = obj55.getClass();
        boolean boolean57 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass56);
        enhancer48.setSuperclass((java.lang.Class) wildcardClass56);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray59 = generatorStrategy46.generate((org.mockito.cglib.core.ClassGenerator) enhancer48);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = enhancer0.getNamingPolicy();
        java.lang.ClassLoader classLoader4 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer5 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader6 = enhancer5.getClassLoader();
        enhancer0.setClassLoader(classLoader6);
        org.mockito.cglib.proxy.Enhancer enhancer8 = new org.mockito.cglib.proxy.Enhancer();
        boolean boolean9 = enhancer8.getUseCache();
        java.lang.ClassLoader classLoader10 = enhancer8.getClassLoader();
        enhancer0.setClassLoader(classLoader10);
        java.lang.ClassLoader classLoader12 = enhancer0.getClassLoader();
        boolean boolean13 = enhancer0.getUseCache();
        boolean boolean14 = enhancer0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy15 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer16 = new org.mockito.cglib.proxy.Enhancer();
        enhancer16.setAttemptLoad(true);
        enhancer16.setSerialVersionUID((java.lang.Long) (-1L));
        enhancer16.setInterceptDuringConstruction(true);
        enhancer16.setInterceptDuringConstruction(true);
        boolean boolean25 = enhancer16.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray26 = generatorStrategy15.generate((org.mockito.cglib.core.ClassGenerator) enhancer16);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        boolean boolean6 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass5);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        boolean boolean9 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass8);
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        boolean boolean12 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass11);
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        boolean boolean17 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass16);
        java.lang.Class[] classArray18 = new java.lang.Class[] { wildcardClass3, wildcardClass5, wildcardClass8, wildcardClass11, wildcardClass14, wildcardClass16 };
        enhancer0.setInterfaces(classArray18);
        org.mockito.cglib.proxy.Enhancer enhancer20 = new org.mockito.cglib.proxy.Enhancer();
        enhancer20.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy23 = enhancer20.getNamingPolicy();
        enhancer0.setNamingPolicy(namingPolicy23);
        org.mockito.cglib.proxy.Enhancer enhancer25 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader26 = enhancer25.getClassLoader();
        enhancer25.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy29 = enhancer25.getNamingPolicy();
        enhancer0.setNamingPolicy(namingPolicy29);
        org.mockito.cglib.proxy.Enhancer enhancer31 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader32 = enhancer31.getClassLoader();
        java.lang.Object obj33 = new java.lang.Object();
        java.lang.Class<?> wildcardClass34 = obj33.getClass();
        java.lang.Object obj35 = new java.lang.Object();
        java.lang.Class<?> wildcardClass36 = obj35.getClass();
        boolean boolean37 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass36);
        java.lang.Object obj38 = new java.lang.Object();
        java.lang.Class<?> wildcardClass39 = obj38.getClass();
        boolean boolean40 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass39);
        java.lang.Object obj41 = new java.lang.Object();
        java.lang.Class<?> wildcardClass42 = obj41.getClass();
        boolean boolean43 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass42);
        java.lang.Object obj44 = new java.lang.Object();
        java.lang.Class<?> wildcardClass45 = obj44.getClass();
        java.lang.Object obj46 = new java.lang.Object();
        java.lang.Class<?> wildcardClass47 = obj46.getClass();
        boolean boolean48 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass47);
        java.lang.Class[] classArray49 = new java.lang.Class[] { wildcardClass34, wildcardClass36, wildcardClass39, wildcardClass42, wildcardClass45, wildcardClass47 };
        enhancer31.setInterfaces(classArray49);
        org.mockito.cglib.proxy.Enhancer enhancer51 = new org.mockito.cglib.proxy.Enhancer();
        enhancer51.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy54 = enhancer51.getNamingPolicy();
        java.lang.ClassLoader classLoader55 = enhancer51.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer56 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader57 = enhancer56.getClassLoader();
        enhancer51.setClassLoader(classLoader57);
        enhancer31.setClassLoader(classLoader57);
        java.lang.ClassLoader classLoader60 = enhancer31.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer61 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader62 = enhancer61.getClassLoader();
        enhancer61.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy65 = enhancer61.getNamingPolicy();
        enhancer31.setNamingPolicy(namingPolicy65);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy67 = enhancer31.getStrategy();
        enhancer0.setStrategy(generatorStrategy67);
        org.mockito.cglib.proxy.Enhancer enhancer69 = new org.mockito.cglib.proxy.Enhancer();
        enhancer69.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy72 = enhancer69.getNamingPolicy();
        java.lang.ClassLoader classLoader73 = enhancer69.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer74 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader75 = enhancer74.getClassLoader();
        enhancer69.setClassLoader(classLoader75);
        org.mockito.cglib.proxy.Enhancer enhancer77 = new org.mockito.cglib.proxy.Enhancer();
        boolean boolean78 = enhancer77.getUseCache();
        java.lang.ClassLoader classLoader79 = enhancer77.getClassLoader();
        enhancer69.setClassLoader(classLoader79);
        java.lang.ClassLoader classLoader81 = enhancer69.getClassLoader();
        boolean boolean82 = enhancer69.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray83 = generatorStrategy67.generate((org.mockito.cglib.core.ClassGenerator) enhancer69);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setAttemptLoad(true);
        enhancer0.setSerialVersionUID((java.lang.Long) (-1L));
        enhancer0.setInterceptDuringConstruction(true);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        boolean boolean9 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass8);
        enhancer0.setSuperclass((java.lang.Class) wildcardClass8);
        enhancer0.setAttemptLoad(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer14 = new org.mockito.cglib.proxy.Enhancer();
        enhancer14.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy17 = enhancer14.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer18 = new org.mockito.cglib.proxy.Enhancer();
        enhancer18.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy21 = enhancer18.getNamingPolicy();
        java.lang.ClassLoader classLoader22 = enhancer18.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer23 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader24 = enhancer23.getClassLoader();
        enhancer18.setClassLoader(classLoader24);
        boolean boolean26 = enhancer18.getUseCache();
        boolean boolean27 = namingPolicy17.equals((java.lang.Object) enhancer18);
        org.mockito.cglib.proxy.Enhancer enhancer28 = new org.mockito.cglib.proxy.Enhancer();
        enhancer28.setAttemptLoad(true);
        boolean boolean31 = enhancer28.getAttemptLoad();
        java.lang.ClassLoader classLoader32 = enhancer28.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy33 = enhancer28.getStrategy();
        enhancer18.setStrategy(generatorStrategy33);
        java.lang.ClassLoader classLoader35 = enhancer18.getClassLoader();
        org.mockito.cglib.core.NamingPolicy namingPolicy36 = enhancer18.getNamingPolicy();
        boolean boolean37 = enhancer18.getAttemptLoad();
        enhancer18.setSerialVersionUID((java.lang.Long) 100L);
        org.mockito.cglib.proxy.Enhancer enhancer40 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader41 = enhancer40.getClassLoader();
        java.lang.Object obj42 = new java.lang.Object();
        java.lang.Class<?> wildcardClass43 = obj42.getClass();
        java.lang.Object obj44 = new java.lang.Object();
        java.lang.Class<?> wildcardClass45 = obj44.getClass();
        boolean boolean46 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass45);
        java.lang.Object obj47 = new java.lang.Object();
        java.lang.Class<?> wildcardClass48 = obj47.getClass();
        boolean boolean49 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass48);
        java.lang.Object obj50 = new java.lang.Object();
        java.lang.Class<?> wildcardClass51 = obj50.getClass();
        boolean boolean52 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass51);
        java.lang.Object obj53 = new java.lang.Object();
        java.lang.Class<?> wildcardClass54 = obj53.getClass();
        java.lang.Object obj55 = new java.lang.Object();
        java.lang.Class<?> wildcardClass56 = obj55.getClass();
        boolean boolean57 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass56);
        java.lang.Class[] classArray58 = new java.lang.Class[] { wildcardClass43, wildcardClass45, wildcardClass48, wildcardClass51, wildcardClass54, wildcardClass56 };
        enhancer40.setInterfaces(classArray58);
        org.mockito.cglib.proxy.Enhancer enhancer60 = new org.mockito.cglib.proxy.Enhancer();
        enhancer60.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy63 = enhancer60.getNamingPolicy();
        enhancer40.setNamingPolicy(namingPolicy63);
        enhancer18.setNamingPolicy(namingPolicy63);
        boolean boolean66 = enhancer18.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray67 = generatorStrategy13.generate((org.mockito.cglib.core.ClassGenerator) enhancer18);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        boolean boolean6 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass5);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        boolean boolean9 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass8);
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        boolean boolean12 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass11);
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        boolean boolean17 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass16);
        java.lang.Class[] classArray18 = new java.lang.Class[] { wildcardClass3, wildcardClass5, wildcardClass8, wildcardClass11, wildcardClass14, wildcardClass16 };
        enhancer0.setInterfaces(classArray18);
        org.mockito.cglib.proxy.Enhancer enhancer20 = new org.mockito.cglib.proxy.Enhancer();
        enhancer20.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy23 = enhancer20.getNamingPolicy();
        java.lang.ClassLoader classLoader24 = enhancer20.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer25 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader26 = enhancer25.getClassLoader();
        enhancer20.setClassLoader(classLoader26);
        enhancer0.setClassLoader(classLoader26);
        java.lang.ClassLoader classLoader29 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer30 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader31 = enhancer30.getClassLoader();
        enhancer30.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy34 = enhancer30.getNamingPolicy();
        enhancer0.setNamingPolicy(namingPolicy34);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy36 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer37 = new org.mockito.cglib.proxy.Enhancer();
        enhancer37.setAttemptLoad(true);
        boolean boolean40 = enhancer37.getAttemptLoad();
        enhancer37.setUseCache(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray43 = generatorStrategy36.generate((org.mockito.cglib.core.ClassGenerator) enhancer37);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setAttemptLoad(true);
        boolean boolean3 = enhancer0.getAttemptLoad();
        java.lang.ClassLoader classLoader4 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer0.getStrategy();
        boolean boolean6 = enhancer0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer8 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader9 = enhancer8.getClassLoader();
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        boolean boolean14 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass13);
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        boolean boolean17 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass16);
        java.lang.Object obj18 = new java.lang.Object();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        boolean boolean20 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass19);
        java.lang.Object obj21 = new java.lang.Object();
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        java.lang.Object obj23 = new java.lang.Object();
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        boolean boolean25 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass24);
        java.lang.Class[] classArray26 = new java.lang.Class[] { wildcardClass11, wildcardClass13, wildcardClass16, wildcardClass19, wildcardClass22, wildcardClass24 };
        enhancer8.setInterfaces(classArray26);
        org.mockito.cglib.proxy.Enhancer enhancer28 = new org.mockito.cglib.proxy.Enhancer();
        enhancer28.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy31 = enhancer28.getNamingPolicy();
        enhancer8.setNamingPolicy(namingPolicy31);
        org.mockito.cglib.proxy.Enhancer enhancer33 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader34 = enhancer33.getClassLoader();
        enhancer33.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy37 = enhancer33.getNamingPolicy();
        enhancer8.setNamingPolicy(namingPolicy37);
        org.mockito.cglib.proxy.Enhancer enhancer39 = new org.mockito.cglib.proxy.Enhancer();
        boolean boolean40 = enhancer39.getUseCache();
        java.lang.ClassLoader classLoader41 = enhancer39.getClassLoader();
        enhancer8.setClassLoader(classLoader41);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray43 = generatorStrategy7.generate((org.mockito.cglib.core.ClassGenerator) enhancer8);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        boolean boolean6 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass5);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        boolean boolean9 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass8);
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        boolean boolean12 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass11);
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        boolean boolean17 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass16);
        java.lang.Class[] classArray18 = new java.lang.Class[] { wildcardClass3, wildcardClass5, wildcardClass8, wildcardClass11, wildcardClass14, wildcardClass16 };
        enhancer0.setInterfaces(classArray18);
        org.mockito.cglib.proxy.Enhancer enhancer20 = new org.mockito.cglib.proxy.Enhancer();
        enhancer20.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy23 = enhancer20.getNamingPolicy();
        java.lang.ClassLoader classLoader24 = enhancer20.getClassLoader();
        enhancer0.setClassLoader(classLoader24);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy26 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer27 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader28 = enhancer27.getClassLoader();
        java.lang.Object obj29 = new java.lang.Object();
        java.lang.Class<?> wildcardClass30 = obj29.getClass();
        java.lang.Object obj31 = new java.lang.Object();
        java.lang.Class<?> wildcardClass32 = obj31.getClass();
        boolean boolean33 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass32);
        java.lang.Object obj34 = new java.lang.Object();
        java.lang.Class<?> wildcardClass35 = obj34.getClass();
        boolean boolean36 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass35);
        java.lang.Object obj37 = new java.lang.Object();
        java.lang.Class<?> wildcardClass38 = obj37.getClass();
        boolean boolean39 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass38);
        java.lang.Object obj40 = new java.lang.Object();
        java.lang.Class<?> wildcardClass41 = obj40.getClass();
        java.lang.Object obj42 = new java.lang.Object();
        java.lang.Class<?> wildcardClass43 = obj42.getClass();
        boolean boolean44 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass43);
        java.lang.Class[] classArray45 = new java.lang.Class[] { wildcardClass30, wildcardClass32, wildcardClass35, wildcardClass38, wildcardClass41, wildcardClass43 };
        enhancer27.setInterfaces(classArray45);
        enhancer27.setUseCache(false);
        boolean boolean49 = enhancer27.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray50 = generatorStrategy26.generate((org.mockito.cglib.core.ClassGenerator) enhancer27);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        boolean boolean1 = enhancer0.getUseCache();
        java.lang.ClassLoader classLoader2 = enhancer0.getClassLoader();
        enhancer0.setAttemptLoad(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        enhancer6.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy9 = enhancer6.getNamingPolicy();
        java.lang.ClassLoader classLoader10 = enhancer6.getClassLoader();
        java.lang.ClassLoader classLoader11 = enhancer6.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = enhancer6.getStrategy();
        enhancer6.setUseCache(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray15 = generatorStrategy5.generate((org.mockito.cglib.core.ClassGenerator) enhancer6);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        boolean boolean6 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass5);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        boolean boolean9 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass8);
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        boolean boolean12 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass11);
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        boolean boolean17 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass16);
        java.lang.Class[] classArray18 = new java.lang.Class[] { wildcardClass3, wildcardClass5, wildcardClass8, wildcardClass11, wildcardClass14, wildcardClass16 };
        enhancer0.setInterfaces(classArray18);
        java.lang.Object obj20 = new java.lang.Object();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass21);
        boolean boolean23 = enhancer0.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer24 = new org.mockito.cglib.proxy.Enhancer();
        enhancer24.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy27 = enhancer24.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer28 = new org.mockito.cglib.proxy.Enhancer();
        enhancer28.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy31 = enhancer28.getNamingPolicy();
        java.lang.ClassLoader classLoader32 = enhancer28.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer33 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader34 = enhancer33.getClassLoader();
        enhancer28.setClassLoader(classLoader34);
        boolean boolean36 = enhancer28.getUseCache();
        boolean boolean37 = namingPolicy27.equals((java.lang.Object) enhancer28);
        org.mockito.cglib.proxy.Enhancer enhancer38 = new org.mockito.cglib.proxy.Enhancer();
        enhancer38.setAttemptLoad(true);
        boolean boolean41 = enhancer38.getAttemptLoad();
        java.lang.ClassLoader classLoader42 = enhancer38.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy43 = enhancer38.getStrategy();
        enhancer28.setStrategy(generatorStrategy43);
        java.lang.ClassLoader classLoader45 = enhancer28.getClassLoader();
        org.mockito.cglib.core.NamingPolicy namingPolicy46 = enhancer28.getNamingPolicy();
        enhancer0.setNamingPolicy(namingPolicy46);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy48 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer49 = new org.mockito.cglib.proxy.Enhancer();
        enhancer49.setAttemptLoad(true);
        enhancer49.setSerialVersionUID((java.lang.Long) (-1L));
        enhancer49.setInterceptDuringConstruction(true);
        java.lang.Object obj56 = new java.lang.Object();
        java.lang.Class<?> wildcardClass57 = obj56.getClass();
        boolean boolean58 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass57);
        enhancer49.setSuperclass((java.lang.Class) wildcardClass57);
        enhancer49.setAttemptLoad(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray62 = generatorStrategy48.generate((org.mockito.cglib.core.ClassGenerator) enhancer49);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setAttemptLoad(true);
        boolean boolean3 = enhancer0.getAttemptLoad();
        java.lang.ClassLoader classLoader4 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer0.getStrategy();
        boolean boolean7 = generatorStrategy5.equals((java.lang.Object) "hi!");
        boolean boolean9 = generatorStrategy5.equals((java.lang.Object) false);
        org.mockito.cglib.proxy.Enhancer enhancer10 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader11 = enhancer10.getClassLoader();
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        boolean boolean16 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass15);
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        boolean boolean19 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass18);
        java.lang.Object obj20 = new java.lang.Object();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        boolean boolean22 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass21);
        java.lang.Object obj23 = new java.lang.Object();
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        java.lang.Object obj25 = new java.lang.Object();
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        boolean boolean27 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass26);
        java.lang.Class[] classArray28 = new java.lang.Class[] { wildcardClass13, wildcardClass15, wildcardClass18, wildcardClass21, wildcardClass24, wildcardClass26 };
        enhancer10.setInterfaces(classArray28);
        java.lang.Object obj30 = new java.lang.Object();
        java.lang.Class<?> wildcardClass31 = obj30.getClass();
        enhancer10.setSuperclass((java.lang.Class) wildcardClass31);
        org.mockito.cglib.core.NamingPolicy namingPolicy33 = enhancer10.getNamingPolicy();
        enhancer10.setUseFactory(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray36 = generatorStrategy5.generate((org.mockito.cglib.core.ClassGenerator) enhancer10);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = enhancer0.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer4 = new org.mockito.cglib.proxy.Enhancer();
        enhancer4.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy7 = enhancer4.getNamingPolicy();
        java.lang.ClassLoader classLoader8 = enhancer4.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer9 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader10 = enhancer9.getClassLoader();
        enhancer4.setClassLoader(classLoader10);
        boolean boolean12 = enhancer4.getUseCache();
        boolean boolean13 = namingPolicy3.equals((java.lang.Object) enhancer4);
        org.mockito.cglib.proxy.Enhancer enhancer14 = new org.mockito.cglib.proxy.Enhancer();
        enhancer14.setAttemptLoad(true);
        boolean boolean17 = enhancer14.getAttemptLoad();
        java.lang.ClassLoader classLoader18 = enhancer14.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy19 = enhancer14.getStrategy();
        enhancer4.setStrategy(generatorStrategy19);
        org.mockito.cglib.proxy.Enhancer enhancer21 = new org.mockito.cglib.proxy.Enhancer();
        enhancer21.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy24 = enhancer21.getNamingPolicy();
        java.lang.ClassLoader classLoader25 = enhancer21.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer26 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader27 = enhancer26.getClassLoader();
        enhancer21.setClassLoader(classLoader27);
        java.lang.ClassLoader classLoader29 = enhancer21.getClassLoader();
        enhancer21.setAttemptLoad(true);
        boolean boolean32 = generatorStrategy19.equals((java.lang.Object) true);
        org.mockito.cglib.proxy.Enhancer enhancer33 = new org.mockito.cglib.proxy.Enhancer();
        enhancer33.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy36 = enhancer33.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer37 = new org.mockito.cglib.proxy.Enhancer();
        enhancer37.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy40 = enhancer37.getNamingPolicy();
        java.lang.ClassLoader classLoader41 = enhancer37.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer42 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader43 = enhancer42.getClassLoader();
        enhancer37.setClassLoader(classLoader43);
        boolean boolean45 = enhancer37.getUseCache();
        boolean boolean46 = namingPolicy36.equals((java.lang.Object) enhancer37);
        org.mockito.cglib.proxy.Enhancer enhancer47 = new org.mockito.cglib.proxy.Enhancer();
        enhancer47.setAttemptLoad(true);
        boolean boolean50 = enhancer47.getAttemptLoad();
        java.lang.ClassLoader classLoader51 = enhancer47.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy52 = enhancer47.getStrategy();
        enhancer37.setStrategy(generatorStrategy52);
        java.lang.ClassLoader classLoader54 = enhancer37.getClassLoader();
        org.mockito.cglib.core.NamingPolicy namingPolicy55 = enhancer37.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer56 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader57 = enhancer56.getClassLoader();
        java.lang.Object obj58 = new java.lang.Object();
        java.lang.Class<?> wildcardClass59 = obj58.getClass();
        java.lang.Object obj60 = new java.lang.Object();
        java.lang.Class<?> wildcardClass61 = obj60.getClass();
        boolean boolean62 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass61);
        java.lang.Object obj63 = new java.lang.Object();
        java.lang.Class<?> wildcardClass64 = obj63.getClass();
        boolean boolean65 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass64);
        java.lang.Object obj66 = new java.lang.Object();
        java.lang.Class<?> wildcardClass67 = obj66.getClass();
        boolean boolean68 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass67);
        java.lang.Object obj69 = new java.lang.Object();
        java.lang.Class<?> wildcardClass70 = obj69.getClass();
        java.lang.Object obj71 = new java.lang.Object();
        java.lang.Class<?> wildcardClass72 = obj71.getClass();
        boolean boolean73 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass72);
        java.lang.Class[] classArray74 = new java.lang.Class[] { wildcardClass59, wildcardClass61, wildcardClass64, wildcardClass67, wildcardClass70, wildcardClass72 };
        enhancer56.setInterfaces(classArray74);
        enhancer37.setInterfaces(classArray74);
        enhancer37.setInterceptDuringConstruction(true);
        enhancer37.setSerialVersionUID((java.lang.Long) 1L);
        org.mockito.cglib.core.NamingPolicy namingPolicy81 = enhancer37.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray82 = generatorStrategy19.generate((org.mockito.cglib.core.ClassGenerator) enhancer37);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setAttemptLoad(true);
        boolean boolean3 = enhancer0.getAttemptLoad();
        java.lang.ClassLoader classLoader4 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer0.getStrategy();
        boolean boolean6 = enhancer0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer8 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader9 = enhancer8.getClassLoader();
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        boolean boolean14 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass13);
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        boolean boolean17 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass16);
        java.lang.Object obj18 = new java.lang.Object();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        boolean boolean20 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass19);
        java.lang.Object obj21 = new java.lang.Object();
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        java.lang.Object obj23 = new java.lang.Object();
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        boolean boolean25 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass24);
        java.lang.Class[] classArray26 = new java.lang.Class[] { wildcardClass11, wildcardClass13, wildcardClass16, wildcardClass19, wildcardClass22, wildcardClass24 };
        enhancer8.setInterfaces(classArray26);
        java.lang.Object obj28 = new java.lang.Object();
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
        enhancer8.setSuperclass((java.lang.Class) wildcardClass29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray31 = generatorStrategy7.generate((org.mockito.cglib.core.ClassGenerator) enhancer8);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = enhancer0.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer4 = new org.mockito.cglib.proxy.Enhancer();
        enhancer4.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy7 = enhancer4.getNamingPolicy();
        java.lang.ClassLoader classLoader8 = enhancer4.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer9 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader10 = enhancer9.getClassLoader();
        enhancer4.setClassLoader(classLoader10);
        boolean boolean12 = enhancer4.getUseCache();
        boolean boolean13 = namingPolicy3.equals((java.lang.Object) enhancer4);
        enhancer4.setAttemptLoad(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = enhancer4.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer17 = new org.mockito.cglib.proxy.Enhancer();
        enhancer17.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy20 = enhancer17.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer21 = new org.mockito.cglib.proxy.Enhancer();
        enhancer21.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy24 = enhancer21.getNamingPolicy();
        java.lang.ClassLoader classLoader25 = enhancer21.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer26 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader27 = enhancer26.getClassLoader();
        enhancer21.setClassLoader(classLoader27);
        boolean boolean29 = enhancer21.getUseCache();
        boolean boolean30 = namingPolicy20.equals((java.lang.Object) enhancer21);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy31 = enhancer21.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray32 = generatorStrategy16.generate((org.mockito.cglib.core.ClassGenerator) enhancer21);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setAttemptLoad(true);
        boolean boolean3 = enhancer0.getAttemptLoad();
        java.lang.ClassLoader classLoader4 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer0.getStrategy();
        boolean boolean6 = enhancer0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer8 = new org.mockito.cglib.proxy.Enhancer();
        enhancer8.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy11 = enhancer8.getNamingPolicy();
        java.lang.ClassLoader classLoader12 = enhancer8.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = enhancer8.getStrategy();
        enhancer8.setUseCache(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = enhancer8.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray17 = generatorStrategy7.generate((org.mockito.cglib.core.ClassGenerator) enhancer8);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = enhancer0.getNamingPolicy();
        java.lang.ClassLoader classLoader4 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        enhancer6.setAttemptLoad(true);
        enhancer6.setSerialVersionUID((java.lang.Long) (-1L));
        enhancer6.setInterceptDuringConstruction(true);
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        boolean boolean15 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass14);
        enhancer6.setSuperclass((java.lang.Class) wildcardClass14);
        enhancer6.setAttemptLoad(false);
        enhancer6.setUseFactory(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray21 = generatorStrategy5.generate((org.mockito.cglib.core.ClassGenerator) enhancer6);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        boolean boolean6 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass5);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        boolean boolean9 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass8);
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        boolean boolean12 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass11);
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        boolean boolean17 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass16);
        java.lang.Class[] classArray18 = new java.lang.Class[] { wildcardClass3, wildcardClass5, wildcardClass8, wildcardClass11, wildcardClass14, wildcardClass16 };
        enhancer0.setInterfaces(classArray18);
        org.mockito.cglib.proxy.Enhancer enhancer20 = new org.mockito.cglib.proxy.Enhancer();
        enhancer20.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy23 = enhancer20.getNamingPolicy();
        java.lang.ClassLoader classLoader24 = enhancer20.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer25 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader26 = enhancer25.getClassLoader();
        enhancer20.setClassLoader(classLoader26);
        enhancer0.setClassLoader(classLoader26);
        boolean boolean29 = enhancer0.getUseCache();
        boolean boolean30 = enhancer0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy31 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer32 = new org.mockito.cglib.proxy.Enhancer();
        enhancer32.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy35 = enhancer32.getNamingPolicy();
        java.lang.ClassLoader classLoader36 = enhancer32.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy37 = enhancer32.getStrategy();
        enhancer32.setUseCache(false);
        boolean boolean40 = generatorStrategy31.equals((java.lang.Object) false);
        org.mockito.cglib.proxy.Enhancer enhancer41 = new org.mockito.cglib.proxy.Enhancer();
        enhancer41.setAttemptLoad(true);
        enhancer41.setSerialVersionUID((java.lang.Long) (-1L));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray46 = generatorStrategy31.generate((org.mockito.cglib.core.ClassGenerator) enhancer41);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        boolean boolean6 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass5);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        boolean boolean9 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass8);
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        boolean boolean12 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass11);
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        boolean boolean17 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass16);
        java.lang.Class[] classArray18 = new java.lang.Class[] { wildcardClass3, wildcardClass5, wildcardClass8, wildcardClass11, wildcardClass14, wildcardClass16 };
        enhancer0.setInterfaces(classArray18);
        java.lang.Object obj20 = new java.lang.Object();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass21);
        enhancer0.setUseFactory(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy25 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer26 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader27 = enhancer26.getClassLoader();
        java.lang.Object obj28 = new java.lang.Object();
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
        java.lang.Object obj30 = new java.lang.Object();
        java.lang.Class<?> wildcardClass31 = obj30.getClass();
        boolean boolean32 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass31);
        java.lang.Object obj33 = new java.lang.Object();
        java.lang.Class<?> wildcardClass34 = obj33.getClass();
        boolean boolean35 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass34);
        java.lang.Object obj36 = new java.lang.Object();
        java.lang.Class<?> wildcardClass37 = obj36.getClass();
        boolean boolean38 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass37);
        java.lang.Object obj39 = new java.lang.Object();
        java.lang.Class<?> wildcardClass40 = obj39.getClass();
        java.lang.Object obj41 = new java.lang.Object();
        java.lang.Class<?> wildcardClass42 = obj41.getClass();
        boolean boolean43 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass42);
        java.lang.Class[] classArray44 = new java.lang.Class[] { wildcardClass29, wildcardClass31, wildcardClass34, wildcardClass37, wildcardClass40, wildcardClass42 };
        enhancer26.setInterfaces(classArray44);
        org.mockito.cglib.proxy.Enhancer enhancer46 = new org.mockito.cglib.proxy.Enhancer();
        enhancer46.setAttemptLoad(true);
        enhancer46.setSerialVersionUID((java.lang.Long) (-1L));
        enhancer46.setInterceptDuringConstruction(true);
        java.lang.Object obj53 = new java.lang.Object();
        java.lang.Class<?> wildcardClass54 = obj53.getClass();
        boolean boolean55 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass54);
        enhancer46.setSuperclass((java.lang.Class) wildcardClass54);
        enhancer26.setSuperclass((java.lang.Class) wildcardClass54);
        enhancer26.setUseCache(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray60 = generatorStrategy25.generate((org.mockito.cglib.core.ClassGenerator) enhancer26);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setAttemptLoad(true);
        boolean boolean3 = enhancer0.getAttemptLoad();
        java.lang.ClassLoader classLoader4 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        enhancer6.setAttemptLoad(true);
        boolean boolean9 = enhancer6.getAttemptLoad();
        java.lang.ClassLoader classLoader10 = enhancer6.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = enhancer6.getStrategy();
        enhancer0.setStrategy(generatorStrategy11);
        org.mockito.cglib.proxy.Enhancer enhancer13 = new org.mockito.cglib.proxy.Enhancer();
        enhancer13.setAttemptLoad(true);
        boolean boolean16 = enhancer13.getAttemptLoad();
        java.lang.ClassLoader classLoader17 = enhancer13.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy18 = enhancer13.getStrategy();
        enhancer0.setStrategy(generatorStrategy18);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy20 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer21 = new org.mockito.cglib.proxy.Enhancer();
        enhancer21.setAttemptLoad(true);
        boolean boolean24 = enhancer21.getAttemptLoad();
        java.lang.ClassLoader classLoader25 = enhancer21.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy26 = enhancer21.getStrategy();
        boolean boolean27 = enhancer21.getAttemptLoad();
        java.lang.ClassLoader classLoader28 = enhancer21.getClassLoader();
        boolean boolean29 = generatorStrategy20.equals((java.lang.Object) enhancer21);
        org.mockito.cglib.proxy.Enhancer enhancer30 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader31 = enhancer30.getClassLoader();
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Class<?> wildcardClass33 = obj32.getClass();
        java.lang.Object obj34 = new java.lang.Object();
        java.lang.Class<?> wildcardClass35 = obj34.getClass();
        boolean boolean36 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass35);
        java.lang.Object obj37 = new java.lang.Object();
        java.lang.Class<?> wildcardClass38 = obj37.getClass();
        boolean boolean39 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass38);
        java.lang.Object obj40 = new java.lang.Object();
        java.lang.Class<?> wildcardClass41 = obj40.getClass();
        boolean boolean42 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass41);
        java.lang.Object obj43 = new java.lang.Object();
        java.lang.Class<?> wildcardClass44 = obj43.getClass();
        java.lang.Object obj45 = new java.lang.Object();
        java.lang.Class<?> wildcardClass46 = obj45.getClass();
        boolean boolean47 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass46);
        java.lang.Class[] classArray48 = new java.lang.Class[] { wildcardClass33, wildcardClass35, wildcardClass38, wildcardClass41, wildcardClass44, wildcardClass46 };
        enhancer30.setInterfaces(classArray48);
        org.mockito.cglib.proxy.Enhancer enhancer50 = new org.mockito.cglib.proxy.Enhancer();
        enhancer50.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy53 = enhancer50.getNamingPolicy();
        java.lang.ClassLoader classLoader54 = enhancer50.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer55 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader56 = enhancer55.getClassLoader();
        enhancer50.setClassLoader(classLoader56);
        enhancer30.setClassLoader(classLoader56);
        java.lang.ClassLoader classLoader59 = enhancer30.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer60 = new org.mockito.cglib.proxy.Enhancer();
        enhancer60.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy63 = enhancer60.getNamingPolicy();
        java.lang.ClassLoader classLoader64 = enhancer60.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer65 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader66 = enhancer65.getClassLoader();
        enhancer60.setClassLoader(classLoader66);
        enhancer60.setAttemptLoad(true);
        java.lang.Object obj70 = new java.lang.Object();
        java.lang.Class<?> wildcardClass71 = obj70.getClass();
        java.lang.Class[] classArray72 = new java.lang.Class[] { wildcardClass71 };
        enhancer60.setInterfaces(classArray72);
        enhancer30.setInterfaces(classArray72);
        boolean boolean75 = enhancer30.getAttemptLoad();
        boolean boolean76 = enhancer30.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray77 = generatorStrategy20.generate((org.mockito.cglib.core.ClassGenerator) enhancer30);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        boolean boolean1 = enhancer0.getUseCache();
        java.lang.ClassLoader classLoader2 = enhancer0.getClassLoader();
        enhancer0.setAttemptLoad(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        enhancer6.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy9 = enhancer6.getNamingPolicy();
        java.lang.ClassLoader classLoader10 = enhancer6.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer11 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader12 = enhancer11.getClassLoader();
        enhancer6.setClassLoader(classLoader12);
        org.mockito.cglib.proxy.Enhancer enhancer14 = new org.mockito.cglib.proxy.Enhancer();
        boolean boolean15 = enhancer14.getUseCache();
        java.lang.ClassLoader classLoader16 = enhancer14.getClassLoader();
        enhancer6.setClassLoader(classLoader16);
        java.lang.ClassLoader classLoader18 = enhancer6.getClassLoader();
        boolean boolean19 = enhancer6.getUseCache();
        boolean boolean20 = enhancer6.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy21 = enhancer6.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy22 = enhancer6.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray23 = generatorStrategy5.generate((org.mockito.cglib.core.ClassGenerator) enhancer6);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setAttemptLoad(true);
        enhancer0.setSerialVersionUID((java.lang.Long) (-1L));
        enhancer0.setInterceptDuringConstruction(true);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        boolean boolean9 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass8);
        enhancer0.setSuperclass((java.lang.Class) wildcardClass8);
        enhancer0.setAttemptLoad(false);
        enhancer0.setUseFactory(false);
        enhancer0.setUseFactory(true);
        boolean boolean17 = enhancer0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy18 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer19 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader20 = enhancer19.getClassLoader();
        java.lang.Object obj21 = new java.lang.Object();
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        java.lang.Object obj23 = new java.lang.Object();
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        boolean boolean25 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass24);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        boolean boolean28 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass27);
        java.lang.Object obj29 = new java.lang.Object();
        java.lang.Class<?> wildcardClass30 = obj29.getClass();
        boolean boolean31 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass30);
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Class<?> wildcardClass33 = obj32.getClass();
        java.lang.Object obj34 = new java.lang.Object();
        java.lang.Class<?> wildcardClass35 = obj34.getClass();
        boolean boolean36 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass35);
        java.lang.Class[] classArray37 = new java.lang.Class[] { wildcardClass22, wildcardClass24, wildcardClass27, wildcardClass30, wildcardClass33, wildcardClass35 };
        enhancer19.setInterfaces(classArray37);
        org.mockito.cglib.proxy.Enhancer enhancer39 = new org.mockito.cglib.proxy.Enhancer();
        enhancer39.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy42 = enhancer39.getNamingPolicy();
        java.lang.ClassLoader classLoader43 = enhancer39.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer44 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader45 = enhancer44.getClassLoader();
        enhancer39.setClassLoader(classLoader45);
        enhancer19.setClassLoader(classLoader45);
        java.lang.ClassLoader classLoader48 = enhancer19.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer49 = new org.mockito.cglib.proxy.Enhancer();
        enhancer49.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy52 = enhancer49.getNamingPolicy();
        java.lang.ClassLoader classLoader53 = enhancer49.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer54 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader55 = enhancer54.getClassLoader();
        enhancer49.setClassLoader(classLoader55);
        enhancer49.setAttemptLoad(true);
        java.lang.Object obj59 = new java.lang.Object();
        java.lang.Class<?> wildcardClass60 = obj59.getClass();
        java.lang.Class[] classArray61 = new java.lang.Class[] { wildcardClass60 };
        enhancer49.setInterfaces(classArray61);
        enhancer19.setInterfaces(classArray61);
        boolean boolean64 = enhancer19.getAttemptLoad();
        enhancer19.setUseCache(true);
        boolean boolean67 = enhancer19.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray68 = generatorStrategy18.generate((org.mockito.cglib.core.ClassGenerator) enhancer19);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setAttemptLoad(true);
        enhancer0.setSerialVersionUID((java.lang.Long) (-1L));
        enhancer0.setInterceptDuringConstruction(true);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        boolean boolean9 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass8);
        enhancer0.setSuperclass((java.lang.Class) wildcardClass8);
        enhancer0.setAttemptLoad(false);
        enhancer0.setUseFactory(false);
        org.mockito.cglib.proxy.Enhancer enhancer15 = new org.mockito.cglib.proxy.Enhancer();
        enhancer15.setAttemptLoad(true);
        enhancer15.setSerialVersionUID((java.lang.Long) (-1L));
        enhancer15.setInterceptDuringConstruction(true);
        enhancer15.setUseCache(true);
        boolean boolean24 = enhancer15.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer25 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader26 = enhancer25.getClassLoader();
        java.lang.Object obj27 = new java.lang.Object();
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        java.lang.Object obj29 = new java.lang.Object();
        java.lang.Class<?> wildcardClass30 = obj29.getClass();
        boolean boolean31 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass30);
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Class<?> wildcardClass33 = obj32.getClass();
        boolean boolean34 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass33);
        java.lang.Object obj35 = new java.lang.Object();
        java.lang.Class<?> wildcardClass36 = obj35.getClass();
        boolean boolean37 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass36);
        java.lang.Object obj38 = new java.lang.Object();
        java.lang.Class<?> wildcardClass39 = obj38.getClass();
        java.lang.Object obj40 = new java.lang.Object();
        java.lang.Class<?> wildcardClass41 = obj40.getClass();
        boolean boolean42 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass41);
        java.lang.Class[] classArray43 = new java.lang.Class[] { wildcardClass28, wildcardClass30, wildcardClass33, wildcardClass36, wildcardClass39, wildcardClass41 };
        enhancer25.setInterfaces(classArray43);
        org.mockito.cglib.proxy.Enhancer enhancer45 = new org.mockito.cglib.proxy.Enhancer();
        enhancer45.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy48 = enhancer45.getNamingPolicy();
        java.lang.ClassLoader classLoader49 = enhancer45.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer50 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader51 = enhancer50.getClassLoader();
        enhancer45.setClassLoader(classLoader51);
        enhancer25.setClassLoader(classLoader51);
        java.lang.ClassLoader classLoader54 = enhancer25.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer55 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader56 = enhancer55.getClassLoader();
        enhancer55.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy59 = enhancer55.getNamingPolicy();
        enhancer25.setNamingPolicy(namingPolicy59);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy61 = enhancer25.getStrategy();
        enhancer15.setStrategy(generatorStrategy61);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy63 = enhancer15.getStrategy();
        enhancer0.setStrategy(generatorStrategy63);
        org.mockito.cglib.proxy.Enhancer enhancer65 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader66 = enhancer65.getClassLoader();
        java.lang.Object obj67 = new java.lang.Object();
        java.lang.Class<?> wildcardClass68 = obj67.getClass();
        java.lang.Object obj69 = new java.lang.Object();
        java.lang.Class<?> wildcardClass70 = obj69.getClass();
        boolean boolean71 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass70);
        java.lang.Object obj72 = new java.lang.Object();
        java.lang.Class<?> wildcardClass73 = obj72.getClass();
        boolean boolean74 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass73);
        java.lang.Object obj75 = new java.lang.Object();
        java.lang.Class<?> wildcardClass76 = obj75.getClass();
        boolean boolean77 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass76);
        java.lang.Object obj78 = new java.lang.Object();
        java.lang.Class<?> wildcardClass79 = obj78.getClass();
        java.lang.Object obj80 = new java.lang.Object();
        java.lang.Class<?> wildcardClass81 = obj80.getClass();
        boolean boolean82 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass81);
        java.lang.Class[] classArray83 = new java.lang.Class[] { wildcardClass68, wildcardClass70, wildcardClass73, wildcardClass76, wildcardClass79, wildcardClass81 };
        enhancer65.setInterfaces(classArray83);
        java.lang.Object obj85 = new java.lang.Object();
        java.lang.Class<?> wildcardClass86 = obj85.getClass();
        enhancer65.setSuperclass((java.lang.Class) wildcardClass86);
        enhancer65.setUseFactory(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy90 = enhancer65.getStrategy();
        enhancer65.setAttemptLoad(false);
        enhancer65.setInterceptDuringConstruction(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy95 = enhancer65.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray96 = generatorStrategy63.generate((org.mockito.cglib.core.ClassGenerator) enhancer65);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setAttemptLoad(true);
        boolean boolean3 = enhancer0.getAttemptLoad();
        java.lang.ClassLoader classLoader4 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        enhancer6.setAttemptLoad(true);
        boolean boolean9 = enhancer6.getAttemptLoad();
        java.lang.ClassLoader classLoader10 = enhancer6.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = enhancer6.getStrategy();
        enhancer0.setStrategy(generatorStrategy11);
        org.mockito.cglib.proxy.Enhancer enhancer13 = new org.mockito.cglib.proxy.Enhancer();
        enhancer13.setAttemptLoad(true);
        boolean boolean16 = enhancer13.getAttemptLoad();
        java.lang.ClassLoader classLoader17 = enhancer13.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy18 = enhancer13.getStrategy();
        enhancer0.setStrategy(generatorStrategy18);
        org.mockito.cglib.proxy.Enhancer enhancer20 = new org.mockito.cglib.proxy.Enhancer();
        enhancer20.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy23 = enhancer20.getNamingPolicy();
        java.lang.ClassLoader classLoader24 = enhancer20.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy25 = enhancer20.getStrategy();
        enhancer20.setAttemptLoad(false);
        boolean boolean28 = enhancer20.getAttemptLoad();
        enhancer20.setSerialVersionUID((java.lang.Long) 100L);
        boolean boolean31 = enhancer20.getUseCache();
        enhancer20.setAttemptLoad(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray34 = generatorStrategy18.generate((org.mockito.cglib.core.ClassGenerator) enhancer20);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setAttemptLoad(true);
        boolean boolean3 = enhancer0.getAttemptLoad();
        java.lang.ClassLoader classLoader4 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        enhancer6.setAttemptLoad(true);
        boolean boolean9 = enhancer6.getAttemptLoad();
        java.lang.ClassLoader classLoader10 = enhancer6.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = enhancer6.getStrategy();
        enhancer0.setStrategy(generatorStrategy11);
        org.mockito.cglib.proxy.Enhancer enhancer13 = new org.mockito.cglib.proxy.Enhancer();
        enhancer13.setAttemptLoad(true);
        boolean boolean16 = enhancer13.getAttemptLoad();
        java.lang.ClassLoader classLoader17 = enhancer13.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy18 = enhancer13.getStrategy();
        enhancer0.setStrategy(generatorStrategy18);
        org.mockito.cglib.proxy.Enhancer enhancer20 = new org.mockito.cglib.proxy.Enhancer();
        enhancer20.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy23 = enhancer20.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer24 = new org.mockito.cglib.proxy.Enhancer();
        enhancer24.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy27 = enhancer24.getNamingPolicy();
        java.lang.ClassLoader classLoader28 = enhancer24.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer29 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader30 = enhancer29.getClassLoader();
        enhancer24.setClassLoader(classLoader30);
        boolean boolean32 = enhancer24.getUseCache();
        boolean boolean33 = namingPolicy23.equals((java.lang.Object) enhancer24);
        org.mockito.cglib.proxy.Enhancer enhancer34 = new org.mockito.cglib.proxy.Enhancer();
        enhancer34.setAttemptLoad(true);
        boolean boolean37 = enhancer34.getAttemptLoad();
        java.lang.ClassLoader classLoader38 = enhancer34.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy39 = enhancer34.getStrategy();
        enhancer24.setStrategy(generatorStrategy39);
        java.lang.ClassLoader classLoader41 = enhancer24.getClassLoader();
        org.mockito.cglib.core.NamingPolicy namingPolicy42 = enhancer24.getNamingPolicy();
        boolean boolean44 = namingPolicy42.equals((java.lang.Object) 1.0d);
        org.mockito.cglib.proxy.Enhancer enhancer45 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader46 = enhancer45.getClassLoader();
        java.lang.Object obj47 = new java.lang.Object();
        java.lang.Class<?> wildcardClass48 = obj47.getClass();
        java.lang.Object obj49 = new java.lang.Object();
        java.lang.Class<?> wildcardClass50 = obj49.getClass();
        boolean boolean51 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass50);
        java.lang.Object obj52 = new java.lang.Object();
        java.lang.Class<?> wildcardClass53 = obj52.getClass();
        boolean boolean54 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass53);
        java.lang.Object obj55 = new java.lang.Object();
        java.lang.Class<?> wildcardClass56 = obj55.getClass();
        boolean boolean57 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass56);
        java.lang.Object obj58 = new java.lang.Object();
        java.lang.Class<?> wildcardClass59 = obj58.getClass();
        java.lang.Object obj60 = new java.lang.Object();
        java.lang.Class<?> wildcardClass61 = obj60.getClass();
        boolean boolean62 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass61);
        java.lang.Class[] classArray63 = new java.lang.Class[] { wildcardClass48, wildcardClass50, wildcardClass53, wildcardClass56, wildcardClass59, wildcardClass61 };
        enhancer45.setInterfaces(classArray63);
        org.mockito.cglib.proxy.Enhancer enhancer65 = new org.mockito.cglib.proxy.Enhancer();
        enhancer65.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy68 = enhancer65.getNamingPolicy();
        java.lang.ClassLoader classLoader69 = enhancer65.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer70 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader71 = enhancer70.getClassLoader();
        enhancer65.setClassLoader(classLoader71);
        enhancer45.setClassLoader(classLoader71);
        org.mockito.cglib.core.NamingPolicy namingPolicy74 = enhancer45.getNamingPolicy();
        boolean boolean75 = namingPolicy42.equals((java.lang.Object) enhancer45);
        boolean boolean76 = generatorStrategy18.equals((java.lang.Object) boolean75);
        org.mockito.cglib.proxy.Enhancer enhancer77 = new org.mockito.cglib.proxy.Enhancer();
        enhancer77.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy80 = enhancer77.getNamingPolicy();
        java.lang.ClassLoader classLoader81 = enhancer77.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy82 = enhancer77.getStrategy();
        enhancer77.setAttemptLoad(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy85 = enhancer77.getNamingPolicy();
        boolean boolean86 = generatorStrategy18.equals((java.lang.Object) namingPolicy85);
        org.mockito.cglib.proxy.Enhancer enhancer87 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader88 = enhancer87.getClassLoader();
        enhancer87.setUseCache(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy91 = enhancer87.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray92 = generatorStrategy18.generate((org.mockito.cglib.core.ClassGenerator) enhancer87);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = enhancer0.getNamingPolicy();
        java.lang.ClassLoader classLoader4 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer5 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader6 = enhancer5.getClassLoader();
        enhancer0.setClassLoader(classLoader6);
        java.lang.ClassLoader classLoader8 = enhancer0.getClassLoader();
        enhancer0.setAttemptLoad(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = enhancer0.getStrategy();
        enhancer0.setUseFactory(false);
        enhancer0.setAttemptLoad(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer17 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader18 = enhancer17.getClassLoader();
        java.lang.Object obj19 = new java.lang.Object();
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        java.lang.Object obj21 = new java.lang.Object();
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        boolean boolean23 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass22);
        java.lang.Object obj24 = new java.lang.Object();
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        boolean boolean26 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass25);
        java.lang.Object obj27 = new java.lang.Object();
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        boolean boolean29 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass28);
        java.lang.Object obj30 = new java.lang.Object();
        java.lang.Class<?> wildcardClass31 = obj30.getClass();
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Class<?> wildcardClass33 = obj32.getClass();
        boolean boolean34 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass33);
        java.lang.Class[] classArray35 = new java.lang.Class[] { wildcardClass20, wildcardClass22, wildcardClass25, wildcardClass28, wildcardClass31, wildcardClass33 };
        enhancer17.setInterfaces(classArray35);
        org.mockito.cglib.proxy.Enhancer enhancer37 = new org.mockito.cglib.proxy.Enhancer();
        enhancer37.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy40 = enhancer37.getNamingPolicy();
        java.lang.ClassLoader classLoader41 = enhancer37.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer42 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader43 = enhancer42.getClassLoader();
        enhancer37.setClassLoader(classLoader43);
        enhancer17.setClassLoader(classLoader43);
        java.lang.ClassLoader classLoader46 = enhancer17.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer47 = new org.mockito.cglib.proxy.Enhancer();
        enhancer47.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy50 = enhancer47.getNamingPolicy();
        java.lang.ClassLoader classLoader51 = enhancer47.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer52 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader53 = enhancer52.getClassLoader();
        enhancer47.setClassLoader(classLoader53);
        enhancer47.setAttemptLoad(true);
        java.lang.Object obj57 = new java.lang.Object();
        java.lang.Class<?> wildcardClass58 = obj57.getClass();
        java.lang.Class[] classArray59 = new java.lang.Class[] { wildcardClass58 };
        enhancer47.setInterfaces(classArray59);
        enhancer17.setInterfaces(classArray59);
        boolean boolean62 = enhancer17.getAttemptLoad();
        enhancer17.setUseCache(true);
        boolean boolean65 = enhancer17.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray66 = generatorStrategy16.generate((org.mockito.cglib.core.ClassGenerator) enhancer17);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setAttemptLoad(true);
        enhancer0.setSerialVersionUID((java.lang.Long) (-1L));
        enhancer0.setInterceptDuringConstruction(true);
        enhancer0.setInterceptDuringConstruction(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer10 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = enhancer10.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer12 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader13 = enhancer12.getClassLoader();
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Object obj16 = new java.lang.Object();
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        boolean boolean18 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass17);
        java.lang.Object obj19 = new java.lang.Object();
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        boolean boolean21 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass20);
        java.lang.Object obj22 = new java.lang.Object();
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        boolean boolean24 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass23);
        java.lang.Object obj25 = new java.lang.Object();
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        java.lang.Object obj27 = new java.lang.Object();
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        boolean boolean29 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass28);
        java.lang.Class[] classArray30 = new java.lang.Class[] { wildcardClass15, wildcardClass17, wildcardClass20, wildcardClass23, wildcardClass26, wildcardClass28 };
        enhancer12.setInterfaces(classArray30);
        org.mockito.cglib.proxy.Enhancer enhancer32 = new org.mockito.cglib.proxy.Enhancer();
        enhancer32.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy35 = enhancer32.getNamingPolicy();
        enhancer12.setNamingPolicy(namingPolicy35);
        enhancer10.setNamingPolicy(namingPolicy35);
        enhancer10.setInterceptDuringConstruction(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy40 = enhancer10.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray41 = generatorStrategy9.generate((org.mockito.cglib.core.ClassGenerator) enhancer10);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setAttemptLoad(true);
        enhancer0.setSerialVersionUID((java.lang.Long) (-1L));
        enhancer0.setInterceptDuringConstruction(true);
        enhancer0.setUseCache(true);
        boolean boolean9 = enhancer0.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer10 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader11 = enhancer10.getClassLoader();
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        boolean boolean16 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass15);
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        boolean boolean19 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass18);
        java.lang.Object obj20 = new java.lang.Object();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        boolean boolean22 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass21);
        java.lang.Object obj23 = new java.lang.Object();
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        java.lang.Object obj25 = new java.lang.Object();
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        boolean boolean27 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass26);
        java.lang.Class[] classArray28 = new java.lang.Class[] { wildcardClass13, wildcardClass15, wildcardClass18, wildcardClass21, wildcardClass24, wildcardClass26 };
        enhancer10.setInterfaces(classArray28);
        org.mockito.cglib.proxy.Enhancer enhancer30 = new org.mockito.cglib.proxy.Enhancer();
        enhancer30.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy33 = enhancer30.getNamingPolicy();
        java.lang.ClassLoader classLoader34 = enhancer30.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer35 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader36 = enhancer35.getClassLoader();
        enhancer30.setClassLoader(classLoader36);
        enhancer10.setClassLoader(classLoader36);
        java.lang.ClassLoader classLoader39 = enhancer10.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer40 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader41 = enhancer40.getClassLoader();
        enhancer40.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy44 = enhancer40.getNamingPolicy();
        enhancer10.setNamingPolicy(namingPolicy44);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy46 = enhancer10.getStrategy();
        enhancer0.setStrategy(generatorStrategy46);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy48 = enhancer0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy49 = enhancer0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy50 = enhancer0.getNamingPolicy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy51 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer52 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader53 = enhancer52.getClassLoader();
        java.lang.Object obj54 = new java.lang.Object();
        java.lang.Class<?> wildcardClass55 = obj54.getClass();
        java.lang.Object obj56 = new java.lang.Object();
        java.lang.Class<?> wildcardClass57 = obj56.getClass();
        boolean boolean58 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass57);
        java.lang.Object obj59 = new java.lang.Object();
        java.lang.Class<?> wildcardClass60 = obj59.getClass();
        boolean boolean61 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass60);
        java.lang.Object obj62 = new java.lang.Object();
        java.lang.Class<?> wildcardClass63 = obj62.getClass();
        boolean boolean64 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass63);
        java.lang.Object obj65 = new java.lang.Object();
        java.lang.Class<?> wildcardClass66 = obj65.getClass();
        java.lang.Object obj67 = new java.lang.Object();
        java.lang.Class<?> wildcardClass68 = obj67.getClass();
        boolean boolean69 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass68);
        java.lang.Class[] classArray70 = new java.lang.Class[] { wildcardClass55, wildcardClass57, wildcardClass60, wildcardClass63, wildcardClass66, wildcardClass68 };
        enhancer52.setInterfaces(classArray70);
        org.mockito.cglib.proxy.Enhancer enhancer72 = new org.mockito.cglib.proxy.Enhancer();
        enhancer72.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy75 = enhancer72.getNamingPolicy();
        java.lang.ClassLoader classLoader76 = enhancer72.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer77 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader78 = enhancer77.getClassLoader();
        enhancer72.setClassLoader(classLoader78);
        enhancer52.setClassLoader(classLoader78);
        enhancer52.setSerialVersionUID((java.lang.Long) (-1L));
        boolean boolean83 = enhancer52.getAttemptLoad();
        enhancer52.setAttemptLoad(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray86 = generatorStrategy51.generate((org.mockito.cglib.core.ClassGenerator) enhancer52);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setAttemptLoad(true);
        boolean boolean3 = enhancer0.getAttemptLoad();
        java.lang.ClassLoader classLoader4 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer0.getStrategy();
        enhancer0.setAttemptLoad(false);
        org.mockito.cglib.proxy.Enhancer enhancer8 = new org.mockito.cglib.proxy.Enhancer();
        enhancer8.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy11 = enhancer8.getNamingPolicy();
        java.lang.ClassLoader classLoader12 = enhancer8.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer13 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader14 = enhancer13.getClassLoader();
        enhancer8.setClassLoader(classLoader14);
        enhancer0.setClassLoader(classLoader14);
        enhancer0.setUseCache(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy19 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer20 = new org.mockito.cglib.proxy.Enhancer();
        enhancer20.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy23 = enhancer20.getNamingPolicy();
        java.lang.ClassLoader classLoader24 = enhancer20.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer25 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader26 = enhancer25.getClassLoader();
        enhancer20.setClassLoader(classLoader26);
        org.mockito.cglib.proxy.Enhancer enhancer28 = new org.mockito.cglib.proxy.Enhancer();
        boolean boolean29 = enhancer28.getUseCache();
        java.lang.ClassLoader classLoader30 = enhancer28.getClassLoader();
        enhancer20.setClassLoader(classLoader30);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy32 = enhancer20.getStrategy();
        enhancer20.setAttemptLoad(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray35 = generatorStrategy19.generate((org.mockito.cglib.core.ClassGenerator) enhancer20);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = enhancer0.getNamingPolicy();
        java.lang.ClassLoader classLoader4 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer5 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader6 = enhancer5.getClassLoader();
        enhancer0.setClassLoader(classLoader6);
        org.mockito.cglib.proxy.Enhancer enhancer8 = new org.mockito.cglib.proxy.Enhancer();
        boolean boolean9 = enhancer8.getUseCache();
        java.lang.ClassLoader classLoader10 = enhancer8.getClassLoader();
        enhancer0.setClassLoader(classLoader10);
        java.lang.ClassLoader classLoader12 = enhancer0.getClassLoader();
        boolean boolean13 = enhancer0.getUseCache();
        boolean boolean14 = enhancer0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy15 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer16 = new org.mockito.cglib.proxy.Enhancer();
        enhancer16.setAttemptLoad(true);
        boolean boolean19 = enhancer16.getAttemptLoad();
        java.lang.ClassLoader classLoader20 = enhancer16.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy21 = enhancer16.getStrategy();
        boolean boolean22 = enhancer16.getAttemptLoad();
        enhancer16.setAttemptLoad(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray25 = generatorStrategy15.generate((org.mockito.cglib.core.ClassGenerator) enhancer16);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = enhancer0.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer4 = new org.mockito.cglib.proxy.Enhancer();
        enhancer4.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy7 = enhancer4.getNamingPolicy();
        java.lang.ClassLoader classLoader8 = enhancer4.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer9 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader10 = enhancer9.getClassLoader();
        enhancer4.setClassLoader(classLoader10);
        boolean boolean12 = enhancer4.getUseCache();
        boolean boolean13 = namingPolicy3.equals((java.lang.Object) enhancer4);
        enhancer4.setAttemptLoad(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = enhancer4.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer17 = new org.mockito.cglib.proxy.Enhancer();
        enhancer17.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy20 = enhancer17.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer21 = new org.mockito.cglib.proxy.Enhancer();
        enhancer21.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy24 = enhancer21.getNamingPolicy();
        java.lang.ClassLoader classLoader25 = enhancer21.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer26 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader27 = enhancer26.getClassLoader();
        enhancer21.setClassLoader(classLoader27);
        boolean boolean29 = enhancer21.getUseCache();
        boolean boolean30 = namingPolicy20.equals((java.lang.Object) enhancer21);
        org.mockito.cglib.proxy.Enhancer enhancer31 = new org.mockito.cglib.proxy.Enhancer();
        enhancer31.setAttemptLoad(true);
        boolean boolean34 = enhancer31.getAttemptLoad();
        java.lang.ClassLoader classLoader35 = enhancer31.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy36 = enhancer31.getStrategy();
        enhancer21.setStrategy(generatorStrategy36);
        java.lang.ClassLoader classLoader38 = enhancer21.getClassLoader();
        org.mockito.cglib.core.NamingPolicy namingPolicy39 = enhancer21.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer40 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader41 = enhancer40.getClassLoader();
        java.lang.Object obj42 = new java.lang.Object();
        java.lang.Class<?> wildcardClass43 = obj42.getClass();
        java.lang.Object obj44 = new java.lang.Object();
        java.lang.Class<?> wildcardClass45 = obj44.getClass();
        boolean boolean46 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass45);
        java.lang.Object obj47 = new java.lang.Object();
        java.lang.Class<?> wildcardClass48 = obj47.getClass();
        boolean boolean49 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass48);
        java.lang.Object obj50 = new java.lang.Object();
        java.lang.Class<?> wildcardClass51 = obj50.getClass();
        boolean boolean52 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass51);
        java.lang.Object obj53 = new java.lang.Object();
        java.lang.Class<?> wildcardClass54 = obj53.getClass();
        java.lang.Object obj55 = new java.lang.Object();
        java.lang.Class<?> wildcardClass56 = obj55.getClass();
        boolean boolean57 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass56);
        java.lang.Class[] classArray58 = new java.lang.Class[] { wildcardClass43, wildcardClass45, wildcardClass48, wildcardClass51, wildcardClass54, wildcardClass56 };
        enhancer40.setInterfaces(classArray58);
        enhancer21.setInterfaces(classArray58);
        enhancer21.setUseFactory(false);
        enhancer21.setUseFactory(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray65 = generatorStrategy16.generate((org.mockito.cglib.core.ClassGenerator) enhancer21);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setAttemptLoad(true);
        enhancer0.setSerialVersionUID((java.lang.Long) (-1L));
        enhancer0.setInterceptDuringConstruction(true);
        enhancer0.setUseCache(true);
        boolean boolean9 = enhancer0.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer10 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader11 = enhancer10.getClassLoader();
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        boolean boolean16 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass15);
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        boolean boolean19 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass18);
        java.lang.Object obj20 = new java.lang.Object();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        boolean boolean22 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass21);
        java.lang.Object obj23 = new java.lang.Object();
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        java.lang.Object obj25 = new java.lang.Object();
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        boolean boolean27 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass26);
        java.lang.Class[] classArray28 = new java.lang.Class[] { wildcardClass13, wildcardClass15, wildcardClass18, wildcardClass21, wildcardClass24, wildcardClass26 };
        enhancer10.setInterfaces(classArray28);
        org.mockito.cglib.proxy.Enhancer enhancer30 = new org.mockito.cglib.proxy.Enhancer();
        enhancer30.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy33 = enhancer30.getNamingPolicy();
        java.lang.ClassLoader classLoader34 = enhancer30.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer35 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader36 = enhancer35.getClassLoader();
        enhancer30.setClassLoader(classLoader36);
        enhancer10.setClassLoader(classLoader36);
        java.lang.ClassLoader classLoader39 = enhancer10.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer40 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader41 = enhancer40.getClassLoader();
        enhancer40.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy44 = enhancer40.getNamingPolicy();
        enhancer10.setNamingPolicy(namingPolicy44);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy46 = enhancer10.getStrategy();
        enhancer0.setStrategy(generatorStrategy46);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy48 = enhancer0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy49 = enhancer0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy50 = enhancer0.getNamingPolicy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy51 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer52 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader53 = enhancer52.getClassLoader();
        java.lang.Object obj54 = new java.lang.Object();
        java.lang.Class<?> wildcardClass55 = obj54.getClass();
        java.lang.Object obj56 = new java.lang.Object();
        java.lang.Class<?> wildcardClass57 = obj56.getClass();
        boolean boolean58 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass57);
        java.lang.Object obj59 = new java.lang.Object();
        java.lang.Class<?> wildcardClass60 = obj59.getClass();
        boolean boolean61 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass60);
        java.lang.Object obj62 = new java.lang.Object();
        java.lang.Class<?> wildcardClass63 = obj62.getClass();
        boolean boolean64 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass63);
        java.lang.Object obj65 = new java.lang.Object();
        java.lang.Class<?> wildcardClass66 = obj65.getClass();
        java.lang.Object obj67 = new java.lang.Object();
        java.lang.Class<?> wildcardClass68 = obj67.getClass();
        boolean boolean69 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass68);
        java.lang.Class[] classArray70 = new java.lang.Class[] { wildcardClass55, wildcardClass57, wildcardClass60, wildcardClass63, wildcardClass66, wildcardClass68 };
        enhancer52.setInterfaces(classArray70);
        org.mockito.cglib.proxy.Enhancer enhancer72 = new org.mockito.cglib.proxy.Enhancer();
        enhancer72.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy75 = enhancer72.getNamingPolicy();
        java.lang.ClassLoader classLoader76 = enhancer72.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer77 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader78 = enhancer77.getClassLoader();
        enhancer72.setClassLoader(classLoader78);
        enhancer52.setClassLoader(classLoader78);
        java.lang.ClassLoader classLoader81 = enhancer52.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer82 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader83 = enhancer82.getClassLoader();
        enhancer82.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy86 = enhancer82.getNamingPolicy();
        enhancer52.setNamingPolicy(namingPolicy86);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy88 = enhancer52.getStrategy();
        boolean boolean89 = enhancer52.getUseCache();
        boolean boolean90 = enhancer52.getAttemptLoad();
        boolean boolean91 = enhancer52.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray92 = generatorStrategy51.generate((org.mockito.cglib.core.ClassGenerator) enhancer52);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setAttemptLoad(true);
        enhancer0.setSerialVersionUID((java.lang.Long) (-1L));
        enhancer0.setInterceptDuringConstruction(true);
        enhancer0.setUseCache(true);
        boolean boolean9 = enhancer0.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer10 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader11 = enhancer10.getClassLoader();
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        boolean boolean16 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass15);
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        boolean boolean19 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass18);
        java.lang.Object obj20 = new java.lang.Object();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        boolean boolean22 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass21);
        java.lang.Object obj23 = new java.lang.Object();
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        java.lang.Object obj25 = new java.lang.Object();
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        boolean boolean27 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass26);
        java.lang.Class[] classArray28 = new java.lang.Class[] { wildcardClass13, wildcardClass15, wildcardClass18, wildcardClass21, wildcardClass24, wildcardClass26 };
        enhancer10.setInterfaces(classArray28);
        org.mockito.cglib.proxy.Enhancer enhancer30 = new org.mockito.cglib.proxy.Enhancer();
        enhancer30.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy33 = enhancer30.getNamingPolicy();
        java.lang.ClassLoader classLoader34 = enhancer30.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer35 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader36 = enhancer35.getClassLoader();
        enhancer30.setClassLoader(classLoader36);
        enhancer10.setClassLoader(classLoader36);
        java.lang.ClassLoader classLoader39 = enhancer10.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer40 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader41 = enhancer40.getClassLoader();
        enhancer40.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy44 = enhancer40.getNamingPolicy();
        enhancer10.setNamingPolicy(namingPolicy44);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy46 = enhancer10.getStrategy();
        enhancer0.setStrategy(generatorStrategy46);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy48 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer49 = new org.mockito.cglib.proxy.Enhancer();
        enhancer49.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy52 = enhancer49.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer53 = new org.mockito.cglib.proxy.Enhancer();
        enhancer53.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy56 = enhancer53.getNamingPolicy();
        java.lang.ClassLoader classLoader57 = enhancer53.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer58 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader59 = enhancer58.getClassLoader();
        enhancer53.setClassLoader(classLoader59);
        boolean boolean61 = enhancer53.getUseCache();
        boolean boolean62 = namingPolicy52.equals((java.lang.Object) enhancer53);
        org.mockito.cglib.proxy.Enhancer enhancer63 = new org.mockito.cglib.proxy.Enhancer();
        enhancer63.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy66 = enhancer63.getNamingPolicy();
        enhancer53.setNamingPolicy(namingPolicy66);
        enhancer53.setInterceptDuringConstruction(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray70 = generatorStrategy48.generate((org.mockito.cglib.core.ClassGenerator) enhancer53);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = enhancer0.getNamingPolicy();
        java.lang.ClassLoader classLoader4 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer5 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader6 = enhancer5.getClassLoader();
        enhancer0.setClassLoader(classLoader6);
        java.lang.ClassLoader classLoader8 = enhancer0.getClassLoader();
        enhancer0.setAttemptLoad(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer12 = new org.mockito.cglib.proxy.Enhancer();
        enhancer12.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy15 = enhancer12.getNamingPolicy();
        java.lang.ClassLoader classLoader16 = enhancer12.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer17 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader18 = enhancer17.getClassLoader();
        enhancer12.setClassLoader(classLoader18);
        org.mockito.cglib.proxy.Enhancer enhancer20 = new org.mockito.cglib.proxy.Enhancer();
        boolean boolean21 = enhancer20.getUseCache();
        java.lang.ClassLoader classLoader22 = enhancer20.getClassLoader();
        enhancer12.setClassLoader(classLoader22);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy24 = enhancer12.getStrategy();
        enhancer12.setAttemptLoad(false);
        java.lang.ClassLoader classLoader27 = enhancer12.getClassLoader();
        enhancer12.setUseCache(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray30 = generatorStrategy11.generate((org.mockito.cglib.core.ClassGenerator) enhancer12);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setAttemptLoad(true);
        enhancer0.setSerialVersionUID((java.lang.Long) (-1L));
        enhancer0.setInterceptDuringConstruction(true);
        enhancer0.setUseCache(true);
        boolean boolean9 = enhancer0.getAttemptLoad();
        enhancer0.setUseCache(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer13 = new org.mockito.cglib.proxy.Enhancer();
        enhancer13.setAttemptLoad(true);
        boolean boolean16 = enhancer13.getAttemptLoad();
        java.lang.ClassLoader classLoader17 = enhancer13.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy18 = enhancer13.getStrategy();
        enhancer13.setUseCache(true);
        org.mockito.cglib.proxy.Enhancer enhancer21 = new org.mockito.cglib.proxy.Enhancer();
        enhancer21.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy24 = enhancer21.getNamingPolicy();
        java.lang.ClassLoader classLoader25 = enhancer21.getClassLoader();
        java.lang.ClassLoader classLoader26 = enhancer21.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy27 = enhancer21.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy28 = enhancer21.getNamingPolicy();
        boolean boolean29 = enhancer21.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy30 = enhancer21.getNamingPolicy();
        enhancer13.setNamingPolicy(namingPolicy30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray32 = generatorStrategy12.generate((org.mockito.cglib.core.ClassGenerator) enhancer13);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = enhancer0.getNamingPolicy();
        java.lang.ClassLoader classLoader4 = enhancer0.getClassLoader();
        java.lang.ClassLoader classLoader5 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer7 = new org.mockito.cglib.proxy.Enhancer();
        enhancer7.setAttemptLoad(true);
        boolean boolean10 = enhancer7.getAttemptLoad();
        java.lang.ClassLoader classLoader11 = enhancer7.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = enhancer7.getStrategy();
        enhancer7.setAttemptLoad(false);
        org.mockito.cglib.proxy.Enhancer enhancer15 = new org.mockito.cglib.proxy.Enhancer();
        enhancer15.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy18 = enhancer15.getNamingPolicy();
        java.lang.ClassLoader classLoader19 = enhancer15.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer20 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader21 = enhancer20.getClassLoader();
        enhancer15.setClassLoader(classLoader21);
        enhancer7.setClassLoader(classLoader21);
        java.lang.ClassLoader classLoader24 = enhancer7.getClassLoader();
        java.lang.ClassLoader classLoader25 = enhancer7.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy26 = enhancer7.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray27 = generatorStrategy6.generate((org.mockito.cglib.core.ClassGenerator) enhancer7);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setAttemptLoad(true);
        boolean boolean3 = enhancer0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy4 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer5 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader7 = enhancer6.getClassLoader();
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        boolean boolean12 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass11);
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        boolean boolean15 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass14);
        java.lang.Object obj16 = new java.lang.Object();
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        boolean boolean18 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass17);
        java.lang.Object obj19 = new java.lang.Object();
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        java.lang.Object obj21 = new java.lang.Object();
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        boolean boolean23 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass22);
        java.lang.Class[] classArray24 = new java.lang.Class[] { wildcardClass9, wildcardClass11, wildcardClass14, wildcardClass17, wildcardClass20, wildcardClass22 };
        enhancer6.setInterfaces(classArray24);
        org.mockito.cglib.proxy.Enhancer enhancer26 = new org.mockito.cglib.proxy.Enhancer();
        enhancer26.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy29 = enhancer26.getNamingPolicy();
        java.lang.ClassLoader classLoader30 = enhancer26.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer31 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader32 = enhancer31.getClassLoader();
        enhancer26.setClassLoader(classLoader32);
        enhancer6.setClassLoader(classLoader32);
        org.mockito.cglib.proxy.Enhancer enhancer35 = new org.mockito.cglib.proxy.Enhancer();
        enhancer35.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy38 = enhancer35.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer39 = new org.mockito.cglib.proxy.Enhancer();
        enhancer39.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy42 = enhancer39.getNamingPolicy();
        java.lang.ClassLoader classLoader43 = enhancer39.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer44 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader45 = enhancer44.getClassLoader();
        enhancer39.setClassLoader(classLoader45);
        boolean boolean47 = enhancer39.getUseCache();
        boolean boolean48 = namingPolicy38.equals((java.lang.Object) enhancer39);
        enhancer6.setNamingPolicy(namingPolicy38);
        org.mockito.cglib.proxy.Enhancer enhancer50 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader51 = enhancer50.getClassLoader();
        java.lang.Object obj52 = new java.lang.Object();
        java.lang.Class<?> wildcardClass53 = obj52.getClass();
        java.lang.Object obj54 = new java.lang.Object();
        java.lang.Class<?> wildcardClass55 = obj54.getClass();
        boolean boolean56 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass55);
        java.lang.Object obj57 = new java.lang.Object();
        java.lang.Class<?> wildcardClass58 = obj57.getClass();
        boolean boolean59 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass58);
        java.lang.Object obj60 = new java.lang.Object();
        java.lang.Class<?> wildcardClass61 = obj60.getClass();
        boolean boolean62 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass61);
        java.lang.Object obj63 = new java.lang.Object();
        java.lang.Class<?> wildcardClass64 = obj63.getClass();
        java.lang.Object obj65 = new java.lang.Object();
        java.lang.Class<?> wildcardClass66 = obj65.getClass();
        boolean boolean67 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass66);
        java.lang.Class[] classArray68 = new java.lang.Class[] { wildcardClass53, wildcardClass55, wildcardClass58, wildcardClass61, wildcardClass64, wildcardClass66 };
        enhancer50.setInterfaces(classArray68);
        org.mockito.cglib.proxy.Enhancer enhancer70 = new org.mockito.cglib.proxy.Enhancer();
        enhancer70.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy73 = enhancer70.getNamingPolicy();
        java.lang.ClassLoader classLoader74 = enhancer70.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer75 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader76 = enhancer75.getClassLoader();
        enhancer70.setClassLoader(classLoader76);
        enhancer50.setClassLoader(classLoader76);
        java.lang.ClassLoader classLoader79 = enhancer50.getClassLoader();
        boolean boolean80 = namingPolicy38.equals((java.lang.Object) enhancer50);
        java.lang.Class<?> wildcardClass81 = namingPolicy38.getClass();
        enhancer5.setSuperclass((java.lang.Class) wildcardClass81);
        enhancer5.setSerialVersionUID((java.lang.Long) (-1L));
        java.lang.ClassLoader classLoader85 = enhancer5.getClassLoader();
        enhancer5.setUseFactory(false);
        enhancer5.setInterceptDuringConstruction(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray90 = generatorStrategy4.generate((org.mockito.cglib.core.ClassGenerator) enhancer5);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = enhancer0.getNamingPolicy();
        java.lang.ClassLoader classLoader4 = enhancer0.getClassLoader();
        enhancer0.setInterceptDuringConstruction(false);
        boolean boolean7 = enhancer0.getUseCache();
        boolean boolean8 = enhancer0.getUseCache();
        enhancer0.setInterceptDuringConstruction(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy11 = enhancer0.getNamingPolicy();
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        java.lang.ClassLoader classLoader14 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer15 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader16 = enhancer15.getClassLoader();
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.Object obj19 = new java.lang.Object();
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        boolean boolean21 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass20);
        java.lang.Object obj22 = new java.lang.Object();
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        boolean boolean24 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass23);
        java.lang.Object obj25 = new java.lang.Object();
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        boolean boolean27 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass26);
        java.lang.Object obj28 = new java.lang.Object();
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
        java.lang.Object obj30 = new java.lang.Object();
        java.lang.Class<?> wildcardClass31 = obj30.getClass();
        boolean boolean32 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass31);
        java.lang.Class[] classArray33 = new java.lang.Class[] { wildcardClass18, wildcardClass20, wildcardClass23, wildcardClass26, wildcardClass29, wildcardClass31 };
        enhancer15.setInterfaces(classArray33);
        enhancer15.setUseCache(false);
        boolean boolean37 = enhancer15.getAttemptLoad();
        java.lang.Class<?> wildcardClass38 = enhancer15.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass38);
        java.lang.ClassLoader classLoader40 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy41 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer42 = new org.mockito.cglib.proxy.Enhancer();
        enhancer42.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy45 = enhancer42.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer46 = new org.mockito.cglib.proxy.Enhancer();
        enhancer46.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy49 = enhancer46.getNamingPolicy();
        java.lang.ClassLoader classLoader50 = enhancer46.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer51 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader52 = enhancer51.getClassLoader();
        enhancer46.setClassLoader(classLoader52);
        boolean boolean54 = enhancer46.getUseCache();
        boolean boolean55 = namingPolicy45.equals((java.lang.Object) enhancer46);
        org.mockito.cglib.proxy.Enhancer enhancer56 = new org.mockito.cglib.proxy.Enhancer();
        enhancer56.setAttemptLoad(true);
        boolean boolean59 = enhancer56.getAttemptLoad();
        java.lang.ClassLoader classLoader60 = enhancer56.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy61 = enhancer56.getStrategy();
        enhancer46.setStrategy(generatorStrategy61);
        org.mockito.cglib.proxy.Enhancer enhancer63 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader64 = enhancer63.getClassLoader();
        java.lang.Object obj65 = new java.lang.Object();
        java.lang.Class<?> wildcardClass66 = obj65.getClass();
        java.lang.Object obj67 = new java.lang.Object();
        java.lang.Class<?> wildcardClass68 = obj67.getClass();
        boolean boolean69 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass68);
        java.lang.Object obj70 = new java.lang.Object();
        java.lang.Class<?> wildcardClass71 = obj70.getClass();
        boolean boolean72 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass71);
        java.lang.Object obj73 = new java.lang.Object();
        java.lang.Class<?> wildcardClass74 = obj73.getClass();
        boolean boolean75 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass74);
        java.lang.Object obj76 = new java.lang.Object();
        java.lang.Class<?> wildcardClass77 = obj76.getClass();
        java.lang.Object obj78 = new java.lang.Object();
        java.lang.Class<?> wildcardClass79 = obj78.getClass();
        boolean boolean80 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass79);
        java.lang.Class[] classArray81 = new java.lang.Class[] { wildcardClass66, wildcardClass68, wildcardClass71, wildcardClass74, wildcardClass77, wildcardClass79 };
        enhancer63.setInterfaces(classArray81);
        org.mockito.cglib.proxy.Enhancer enhancer83 = new org.mockito.cglib.proxy.Enhancer();
        enhancer83.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy86 = enhancer83.getNamingPolicy();
        java.lang.ClassLoader classLoader87 = enhancer83.getClassLoader();
        enhancer63.setClassLoader(classLoader87);
        enhancer46.setClassLoader(classLoader87);
        enhancer46.setAttemptLoad(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy92 = enhancer46.getNamingPolicy();
        boolean boolean93 = enhancer46.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray94 = generatorStrategy41.generate((org.mockito.cglib.core.ClassGenerator) enhancer46);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setAttemptLoad(true);
        enhancer0.setSerialVersionUID((java.lang.Long) (-1L));
        enhancer0.setInterceptDuringConstruction(true);
        enhancer0.setUseCache(true);
        enhancer0.setSerialVersionUID((java.lang.Long) 1L);
        enhancer0.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy13 = enhancer0.getNamingPolicy();
        enhancer0.setUseCache(false);
        boolean boolean16 = enhancer0.getUseCache();
        enhancer0.setSerialVersionUID((java.lang.Long) 1L);
        boolean boolean19 = enhancer0.getUseCache();
        org.mockito.cglib.proxy.Enhancer enhancer20 = new org.mockito.cglib.proxy.Enhancer();
        boolean boolean21 = enhancer20.getUseCache();
        java.lang.ClassLoader classLoader22 = enhancer20.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer23 = new org.mockito.cglib.proxy.Enhancer();
        enhancer23.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy26 = enhancer23.getNamingPolicy();
        java.lang.ClassLoader classLoader27 = enhancer23.getClassLoader();
        enhancer20.setClassLoader(classLoader27);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy29 = enhancer20.getStrategy();
        enhancer0.setStrategy(generatorStrategy29);
        org.mockito.cglib.proxy.Enhancer enhancer31 = new org.mockito.cglib.proxy.Enhancer();
        enhancer31.setSerialVersionUID((java.lang.Long) 100L);
        enhancer31.setUseCache(false);
        boolean boolean36 = enhancer31.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray37 = generatorStrategy29.generate((org.mockito.cglib.core.ClassGenerator) enhancer31);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = enhancer0.getNamingPolicy();
        java.lang.ClassLoader classLoader4 = enhancer0.getClassLoader();
        enhancer0.setUseCache(true);
        enhancer0.setUseCache(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer10 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader11 = enhancer10.getClassLoader();
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        boolean boolean16 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass15);
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        boolean boolean19 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass18);
        java.lang.Object obj20 = new java.lang.Object();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        boolean boolean22 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass21);
        java.lang.Object obj23 = new java.lang.Object();
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        java.lang.Object obj25 = new java.lang.Object();
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        boolean boolean27 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass26);
        java.lang.Class[] classArray28 = new java.lang.Class[] { wildcardClass13, wildcardClass15, wildcardClass18, wildcardClass21, wildcardClass24, wildcardClass26 };
        enhancer10.setInterfaces(classArray28);
        org.mockito.cglib.proxy.Enhancer enhancer30 = new org.mockito.cglib.proxy.Enhancer();
        enhancer30.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy33 = enhancer30.getNamingPolicy();
        java.lang.ClassLoader classLoader34 = enhancer30.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer35 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader36 = enhancer35.getClassLoader();
        enhancer30.setClassLoader(classLoader36);
        enhancer10.setClassLoader(classLoader36);
        enhancer10.setSerialVersionUID((java.lang.Long) (-1L));
        enhancer10.setUseCache(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy43 = enhancer10.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray44 = generatorStrategy9.generate((org.mockito.cglib.core.ClassGenerator) enhancer10);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setAttemptLoad(true);
        enhancer0.setSerialVersionUID((java.lang.Long) (-1L));
        enhancer0.setInterceptDuringConstruction(true);
        enhancer0.setUseCache(true);
        enhancer0.setSerialVersionUID((java.lang.Long) 1L);
        enhancer0.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy13 = enhancer0.getNamingPolicy();
        enhancer0.setUseCache(true);
        enhancer0.setUseCache(true);
        boolean boolean18 = enhancer0.getAttemptLoad();
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy21 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer22 = new org.mockito.cglib.proxy.Enhancer();
        enhancer22.setAttemptLoad(true);
        enhancer22.setSerialVersionUID((java.lang.Long) (-1L));
        enhancer22.setInterceptDuringConstruction(true);
        enhancer22.setUseCache(true);
        enhancer22.setSerialVersionUID((java.lang.Long) 1L);
        enhancer22.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy35 = enhancer22.getNamingPolicy();
        enhancer22.setUseFactory(true);
        enhancer22.setUseCache(true);
        enhancer22.setUseFactory(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray42 = generatorStrategy21.generate((org.mockito.cglib.core.ClassGenerator) enhancer22);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        boolean boolean6 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass5);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        boolean boolean9 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass8);
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        boolean boolean12 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass11);
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        boolean boolean17 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass16);
        java.lang.Class[] classArray18 = new java.lang.Class[] { wildcardClass3, wildcardClass5, wildcardClass8, wildcardClass11, wildcardClass14, wildcardClass16 };
        enhancer0.setInterfaces(classArray18);
        java.lang.Object obj20 = new java.lang.Object();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass21);
        boolean boolean23 = enhancer0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy24 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer25 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader26 = enhancer25.getClassLoader();
        java.lang.Object obj27 = new java.lang.Object();
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        java.lang.Object obj29 = new java.lang.Object();
        java.lang.Class<?> wildcardClass30 = obj29.getClass();
        boolean boolean31 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass30);
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Class<?> wildcardClass33 = obj32.getClass();
        boolean boolean34 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass33);
        java.lang.Object obj35 = new java.lang.Object();
        java.lang.Class<?> wildcardClass36 = obj35.getClass();
        boolean boolean37 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass36);
        java.lang.Object obj38 = new java.lang.Object();
        java.lang.Class<?> wildcardClass39 = obj38.getClass();
        java.lang.Object obj40 = new java.lang.Object();
        java.lang.Class<?> wildcardClass41 = obj40.getClass();
        boolean boolean42 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass41);
        java.lang.Class[] classArray43 = new java.lang.Class[] { wildcardClass28, wildcardClass30, wildcardClass33, wildcardClass36, wildcardClass39, wildcardClass41 };
        enhancer25.setInterfaces(classArray43);
        java.lang.Object obj45 = new java.lang.Object();
        java.lang.Class<?> wildcardClass46 = obj45.getClass();
        enhancer25.setSuperclass((java.lang.Class) wildcardClass46);
        boolean boolean48 = enhancer25.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer49 = new org.mockito.cglib.proxy.Enhancer();
        enhancer49.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy52 = enhancer49.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer53 = new org.mockito.cglib.proxy.Enhancer();
        enhancer53.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy56 = enhancer53.getNamingPolicy();
        java.lang.ClassLoader classLoader57 = enhancer53.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer58 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader59 = enhancer58.getClassLoader();
        enhancer53.setClassLoader(classLoader59);
        boolean boolean61 = enhancer53.getUseCache();
        boolean boolean62 = namingPolicy52.equals((java.lang.Object) enhancer53);
        org.mockito.cglib.proxy.Enhancer enhancer63 = new org.mockito.cglib.proxy.Enhancer();
        enhancer63.setAttemptLoad(true);
        boolean boolean66 = enhancer63.getAttemptLoad();
        java.lang.ClassLoader classLoader67 = enhancer63.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy68 = enhancer63.getStrategy();
        enhancer53.setStrategy(generatorStrategy68);
        java.lang.ClassLoader classLoader70 = enhancer53.getClassLoader();
        org.mockito.cglib.core.NamingPolicy namingPolicy71 = enhancer53.getNamingPolicy();
        enhancer25.setNamingPolicy(namingPolicy71);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy73 = enhancer25.getStrategy();
        enhancer25.setUseCache(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy76 = enhancer25.getNamingPolicy();
        enhancer25.setUseFactory(true);
        boolean boolean79 = enhancer25.getUseCache();
        boolean boolean80 = enhancer25.getUseCache();
        boolean boolean81 = generatorStrategy24.equals((java.lang.Object) boolean80);
        org.mockito.cglib.proxy.Enhancer enhancer82 = new org.mockito.cglib.proxy.Enhancer();
        enhancer82.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy85 = enhancer82.getNamingPolicy();
        java.lang.ClassLoader classLoader86 = enhancer82.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy87 = enhancer82.getStrategy();
        enhancer82.setAttemptLoad(false);
        boolean boolean90 = enhancer82.getAttemptLoad();
        enhancer82.setSerialVersionUID((java.lang.Long) 100L);
        boolean boolean93 = enhancer82.getUseCache();
        enhancer82.setAttemptLoad(false);
        boolean boolean96 = enhancer82.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray97 = generatorStrategy24.generate((org.mockito.cglib.core.ClassGenerator) enhancer82);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = enhancer0.getNamingPolicy();
        boolean boolean4 = enhancer0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        enhancer6.setAttemptLoad(true);
        enhancer6.setSerialVersionUID((java.lang.Long) (-1L));
        enhancer6.setInterceptDuringConstruction(true);
        enhancer6.setInterceptDuringConstruction(true);
        boolean boolean15 = enhancer6.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray16 = generatorStrategy5.generate((org.mockito.cglib.core.ClassGenerator) enhancer6);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        boolean boolean6 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass5);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        boolean boolean9 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass8);
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        boolean boolean12 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass11);
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        boolean boolean17 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass16);
        java.lang.Class[] classArray18 = new java.lang.Class[] { wildcardClass3, wildcardClass5, wildcardClass8, wildcardClass11, wildcardClass14, wildcardClass16 };
        enhancer0.setInterfaces(classArray18);
        org.mockito.cglib.proxy.Enhancer enhancer20 = new org.mockito.cglib.proxy.Enhancer();
        enhancer20.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy23 = enhancer20.getNamingPolicy();
        java.lang.ClassLoader classLoader24 = enhancer20.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer25 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader26 = enhancer25.getClassLoader();
        enhancer20.setClassLoader(classLoader26);
        enhancer0.setClassLoader(classLoader26);
        boolean boolean29 = enhancer0.getUseCache();
        boolean boolean30 = enhancer0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy31 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer32 = new org.mockito.cglib.proxy.Enhancer();
        enhancer32.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy35 = enhancer32.getNamingPolicy();
        java.lang.ClassLoader classLoader36 = enhancer32.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy37 = enhancer32.getStrategy();
        enhancer32.setUseCache(false);
        boolean boolean40 = generatorStrategy31.equals((java.lang.Object) false);
        org.mockito.cglib.proxy.Enhancer enhancer41 = new org.mockito.cglib.proxy.Enhancer();
        enhancer41.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy44 = enhancer41.getNamingPolicy();
        java.lang.ClassLoader classLoader45 = enhancer41.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy46 = enhancer41.getStrategy();
        enhancer41.setAttemptLoad(false);
        boolean boolean49 = enhancer41.getAttemptLoad();
        enhancer41.setSerialVersionUID((java.lang.Long) 100L);
        boolean boolean52 = generatorStrategy31.equals((java.lang.Object) enhancer41);
        org.mockito.cglib.proxy.Enhancer enhancer53 = new org.mockito.cglib.proxy.Enhancer();
        boolean boolean54 = enhancer53.getUseCache();
        java.lang.ClassLoader classLoader55 = enhancer53.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer56 = new org.mockito.cglib.proxy.Enhancer();
        enhancer56.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy59 = enhancer56.getNamingPolicy();
        java.lang.ClassLoader classLoader60 = enhancer56.getClassLoader();
        enhancer53.setClassLoader(classLoader60);
        boolean boolean62 = enhancer53.getAttemptLoad();
        boolean boolean63 = enhancer53.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray64 = generatorStrategy31.generate((org.mockito.cglib.core.ClassGenerator) enhancer53);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        boolean boolean6 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass5);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        boolean boolean9 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass8);
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        boolean boolean12 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass11);
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        boolean boolean17 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass16);
        java.lang.Class[] classArray18 = new java.lang.Class[] { wildcardClass3, wildcardClass5, wildcardClass8, wildcardClass11, wildcardClass14, wildcardClass16 };
        enhancer0.setInterfaces(classArray18);
        org.mockito.cglib.proxy.Enhancer enhancer20 = new org.mockito.cglib.proxy.Enhancer();
        enhancer20.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy23 = enhancer20.getNamingPolicy();
        java.lang.ClassLoader classLoader24 = enhancer20.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer25 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader26 = enhancer25.getClassLoader();
        enhancer20.setClassLoader(classLoader26);
        enhancer0.setClassLoader(classLoader26);
        java.lang.ClassLoader classLoader29 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer30 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader31 = enhancer30.getClassLoader();
        enhancer30.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy34 = enhancer30.getNamingPolicy();
        enhancer0.setNamingPolicy(namingPolicy34);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy36 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer37 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader38 = enhancer37.getClassLoader();
        java.lang.Object obj39 = new java.lang.Object();
        java.lang.Class<?> wildcardClass40 = obj39.getClass();
        java.lang.Object obj41 = new java.lang.Object();
        java.lang.Class<?> wildcardClass42 = obj41.getClass();
        boolean boolean43 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass42);
        java.lang.Object obj44 = new java.lang.Object();
        java.lang.Class<?> wildcardClass45 = obj44.getClass();
        boolean boolean46 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass45);
        java.lang.Object obj47 = new java.lang.Object();
        java.lang.Class<?> wildcardClass48 = obj47.getClass();
        boolean boolean49 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass48);
        java.lang.Object obj50 = new java.lang.Object();
        java.lang.Class<?> wildcardClass51 = obj50.getClass();
        java.lang.Object obj52 = new java.lang.Object();
        java.lang.Class<?> wildcardClass53 = obj52.getClass();
        boolean boolean54 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass53);
        java.lang.Class[] classArray55 = new java.lang.Class[] { wildcardClass40, wildcardClass42, wildcardClass45, wildcardClass48, wildcardClass51, wildcardClass53 };
        enhancer37.setInterfaces(classArray55);
        org.mockito.cglib.proxy.Enhancer enhancer57 = new org.mockito.cglib.proxy.Enhancer();
        enhancer57.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy60 = enhancer57.getNamingPolicy();
        java.lang.ClassLoader classLoader61 = enhancer57.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer62 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader63 = enhancer62.getClassLoader();
        enhancer57.setClassLoader(classLoader63);
        enhancer37.setClassLoader(classLoader63);
        boolean boolean66 = enhancer37.getUseCache();
        boolean boolean67 = enhancer37.getAttemptLoad();
        boolean boolean68 = generatorStrategy36.equals((java.lang.Object) enhancer37);
        org.mockito.cglib.proxy.Enhancer enhancer69 = new org.mockito.cglib.proxy.Enhancer();
        boolean boolean70 = enhancer69.getUseCache();
        java.lang.ClassLoader classLoader71 = enhancer69.getClassLoader();
        enhancer69.setAttemptLoad(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray74 = generatorStrategy36.generate((org.mockito.cglib.core.ClassGenerator) enhancer69);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = enhancer0.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer4 = new org.mockito.cglib.proxy.Enhancer();
        enhancer4.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy7 = enhancer4.getNamingPolicy();
        java.lang.ClassLoader classLoader8 = enhancer4.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer9 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader10 = enhancer9.getClassLoader();
        enhancer4.setClassLoader(classLoader10);
        boolean boolean12 = enhancer4.getUseCache();
        boolean boolean13 = namingPolicy3.equals((java.lang.Object) enhancer4);
        org.mockito.cglib.proxy.Enhancer enhancer14 = new org.mockito.cglib.proxy.Enhancer();
        enhancer14.setAttemptLoad(true);
        boolean boolean17 = enhancer14.getAttemptLoad();
        java.lang.ClassLoader classLoader18 = enhancer14.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy19 = enhancer14.getStrategy();
        enhancer4.setStrategy(generatorStrategy19);
        java.lang.ClassLoader classLoader21 = enhancer4.getClassLoader();
        org.mockito.cglib.core.NamingPolicy namingPolicy22 = enhancer4.getNamingPolicy();
        boolean boolean23 = enhancer4.getAttemptLoad();
        enhancer4.setSerialVersionUID((java.lang.Long) 100L);
        enhancer4.setUseFactory(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy28 = enhancer4.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer29 = new org.mockito.cglib.proxy.Enhancer();
        enhancer29.setAttemptLoad(true);
        boolean boolean32 = enhancer29.getAttemptLoad();
        java.lang.ClassLoader classLoader33 = enhancer29.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy34 = enhancer29.getStrategy();
        enhancer29.setSerialVersionUID((java.lang.Long) 100L);
        org.mockito.cglib.proxy.Enhancer enhancer37 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader38 = enhancer37.getClassLoader();
        java.lang.Object obj39 = new java.lang.Object();
        java.lang.Class<?> wildcardClass40 = obj39.getClass();
        java.lang.Object obj41 = new java.lang.Object();
        java.lang.Class<?> wildcardClass42 = obj41.getClass();
        boolean boolean43 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass42);
        java.lang.Object obj44 = new java.lang.Object();
        java.lang.Class<?> wildcardClass45 = obj44.getClass();
        boolean boolean46 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass45);
        java.lang.Object obj47 = new java.lang.Object();
        java.lang.Class<?> wildcardClass48 = obj47.getClass();
        boolean boolean49 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass48);
        java.lang.Object obj50 = new java.lang.Object();
        java.lang.Class<?> wildcardClass51 = obj50.getClass();
        java.lang.Object obj52 = new java.lang.Object();
        java.lang.Class<?> wildcardClass53 = obj52.getClass();
        boolean boolean54 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass53);
        java.lang.Class[] classArray55 = new java.lang.Class[] { wildcardClass40, wildcardClass42, wildcardClass45, wildcardClass48, wildcardClass51, wildcardClass53 };
        enhancer37.setInterfaces(classArray55);
        org.mockito.cglib.proxy.Enhancer enhancer57 = new org.mockito.cglib.proxy.Enhancer();
        enhancer57.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy60 = enhancer57.getNamingPolicy();
        java.lang.ClassLoader classLoader61 = enhancer57.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer62 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader63 = enhancer62.getClassLoader();
        enhancer57.setClassLoader(classLoader63);
        enhancer37.setClassLoader(classLoader63);
        java.lang.ClassLoader classLoader66 = enhancer37.getClassLoader();
        enhancer29.setClassLoader(classLoader66);
        enhancer29.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.proxy.Enhancer enhancer70 = new org.mockito.cglib.proxy.Enhancer();
        enhancer70.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy73 = enhancer70.getNamingPolicy();
        java.lang.ClassLoader classLoader74 = enhancer70.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer75 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader76 = enhancer75.getClassLoader();
        enhancer70.setClassLoader(classLoader76);
        java.lang.ClassLoader classLoader78 = enhancer70.getClassLoader();
        enhancer70.setAttemptLoad(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy81 = enhancer70.getStrategy();
        enhancer29.setStrategy(generatorStrategy81);
        enhancer29.setInterceptDuringConstruction(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray85 = generatorStrategy28.generate((org.mockito.cglib.core.ClassGenerator) enhancer29);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = enhancer0.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer4 = new org.mockito.cglib.proxy.Enhancer();
        enhancer4.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy7 = enhancer4.getNamingPolicy();
        java.lang.ClassLoader classLoader8 = enhancer4.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer9 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader10 = enhancer9.getClassLoader();
        enhancer4.setClassLoader(classLoader10);
        boolean boolean12 = enhancer4.getUseCache();
        boolean boolean13 = namingPolicy3.equals((java.lang.Object) enhancer4);
        org.mockito.cglib.proxy.Enhancer enhancer14 = new org.mockito.cglib.proxy.Enhancer();
        enhancer14.setAttemptLoad(true);
        boolean boolean17 = enhancer14.getAttemptLoad();
        java.lang.ClassLoader classLoader18 = enhancer14.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy19 = enhancer14.getStrategy();
        enhancer4.setStrategy(generatorStrategy19);
        java.lang.ClassLoader classLoader21 = enhancer4.getClassLoader();
        java.lang.ClassLoader classLoader22 = enhancer4.getClassLoader();
        enhancer4.setUseFactory(false);
        org.mockito.cglib.proxy.Enhancer enhancer25 = new org.mockito.cglib.proxy.Enhancer();
        enhancer25.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy28 = enhancer25.getNamingPolicy();
        java.lang.ClassLoader classLoader29 = enhancer25.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer30 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader31 = enhancer30.getClassLoader();
        enhancer25.setClassLoader(classLoader31);
        java.lang.ClassLoader classLoader33 = enhancer25.getClassLoader();
        java.lang.Object obj34 = new java.lang.Object();
        java.lang.Class<?> wildcardClass35 = obj34.getClass();
        boolean boolean36 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass35);
        enhancer25.setSuperclass((java.lang.Class) wildcardClass35);
        enhancer25.setUseFactory(true);
        enhancer25.setUseCache(true);
        java.lang.ClassLoader classLoader42 = enhancer25.getClassLoader();
        enhancer4.setClassLoader(classLoader42);
        org.mockito.cglib.core.NamingPolicy namingPolicy44 = enhancer4.getNamingPolicy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy45 = enhancer4.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer46 = new org.mockito.cglib.proxy.Enhancer();
        enhancer46.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy49 = enhancer46.getNamingPolicy();
        java.lang.ClassLoader classLoader50 = enhancer46.getClassLoader();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray51 = generatorStrategy45.generate((org.mockito.cglib.core.ClassGenerator) enhancer46);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setAttemptLoad(true);
        boolean boolean3 = enhancer0.getAttemptLoad();
        java.lang.ClassLoader classLoader4 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer0.getStrategy();
        enhancer0.setSerialVersionUID((java.lang.Long) 100L);
        org.mockito.cglib.proxy.Enhancer enhancer8 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader9 = enhancer8.getClassLoader();
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        boolean boolean14 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass13);
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        boolean boolean17 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass16);
        java.lang.Object obj18 = new java.lang.Object();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        boolean boolean20 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass19);
        java.lang.Object obj21 = new java.lang.Object();
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        java.lang.Object obj23 = new java.lang.Object();
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        boolean boolean25 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass24);
        java.lang.Class[] classArray26 = new java.lang.Class[] { wildcardClass11, wildcardClass13, wildcardClass16, wildcardClass19, wildcardClass22, wildcardClass24 };
        enhancer8.setInterfaces(classArray26);
        org.mockito.cglib.proxy.Enhancer enhancer28 = new org.mockito.cglib.proxy.Enhancer();
        enhancer28.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy31 = enhancer28.getNamingPolicy();
        java.lang.ClassLoader classLoader32 = enhancer28.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer33 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader34 = enhancer33.getClassLoader();
        enhancer28.setClassLoader(classLoader34);
        enhancer8.setClassLoader(classLoader34);
        java.lang.ClassLoader classLoader37 = enhancer8.getClassLoader();
        enhancer0.setClassLoader(classLoader37);
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.proxy.Enhancer enhancer41 = new org.mockito.cglib.proxy.Enhancer();
        enhancer41.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy44 = enhancer41.getNamingPolicy();
        java.lang.ClassLoader classLoader45 = enhancer41.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer46 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader47 = enhancer46.getClassLoader();
        enhancer41.setClassLoader(classLoader47);
        java.lang.ClassLoader classLoader49 = enhancer41.getClassLoader();
        enhancer41.setAttemptLoad(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy52 = enhancer41.getStrategy();
        enhancer0.setStrategy(generatorStrategy52);
        org.mockito.cglib.proxy.Enhancer enhancer54 = new org.mockito.cglib.proxy.Enhancer();
        enhancer54.setAttemptLoad(true);
        enhancer54.setSerialVersionUID((java.lang.Long) (-1L));
        enhancer54.setInterceptDuringConstruction(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray61 = generatorStrategy52.generate((org.mockito.cglib.core.ClassGenerator) enhancer54);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setAttemptLoad(true);
        boolean boolean3 = enhancer0.getAttemptLoad();
        java.lang.ClassLoader classLoader4 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        enhancer6.setAttemptLoad(true);
        boolean boolean9 = enhancer6.getAttemptLoad();
        java.lang.ClassLoader classLoader10 = enhancer6.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = enhancer6.getStrategy();
        enhancer0.setStrategy(generatorStrategy11);
        java.lang.ClassLoader classLoader13 = enhancer0.getClassLoader();
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        enhancer0.setInterceptDuringConstruction(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy18 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer19 = new org.mockito.cglib.proxy.Enhancer();
        enhancer19.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy22 = enhancer19.getNamingPolicy();
        java.lang.ClassLoader classLoader23 = enhancer19.getClassLoader();
        enhancer19.setInterceptDuringConstruction(false);
        boolean boolean26 = enhancer19.getUseCache();
        boolean boolean27 = enhancer19.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy28 = enhancer19.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray29 = generatorStrategy18.generate((org.mockito.cglib.core.ClassGenerator) enhancer19);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        boolean boolean6 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass5);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        boolean boolean9 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass8);
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        boolean boolean12 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass11);
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        boolean boolean17 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass16);
        java.lang.Class[] classArray18 = new java.lang.Class[] { wildcardClass3, wildcardClass5, wildcardClass8, wildcardClass11, wildcardClass14, wildcardClass16 };
        enhancer0.setInterfaces(classArray18);
        org.mockito.cglib.proxy.Enhancer enhancer20 = new org.mockito.cglib.proxy.Enhancer();
        enhancer20.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy23 = enhancer20.getNamingPolicy();
        enhancer0.setNamingPolicy(namingPolicy23);
        org.mockito.cglib.proxy.Enhancer enhancer25 = new org.mockito.cglib.proxy.Enhancer();
        enhancer25.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy28 = enhancer25.getNamingPolicy();
        java.lang.ClassLoader classLoader29 = enhancer25.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer30 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader31 = enhancer30.getClassLoader();
        enhancer25.setClassLoader(classLoader31);
        java.lang.Class<?> wildcardClass33 = classLoader31.getClass();
        boolean boolean34 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass33);
        enhancer0.setSuperclass((java.lang.Class) wildcardClass33);
        enhancer0.setUseCache(true);
        enhancer0.setUseCache(true);
        org.mockito.cglib.proxy.Enhancer enhancer40 = new org.mockito.cglib.proxy.Enhancer();
        enhancer40.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy43 = enhancer40.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer44 = new org.mockito.cglib.proxy.Enhancer();
        enhancer44.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy47 = enhancer44.getNamingPolicy();
        java.lang.ClassLoader classLoader48 = enhancer44.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer49 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader50 = enhancer49.getClassLoader();
        enhancer44.setClassLoader(classLoader50);
        boolean boolean52 = enhancer44.getUseCache();
        boolean boolean53 = namingPolicy43.equals((java.lang.Object) enhancer44);
        org.mockito.cglib.proxy.Enhancer enhancer54 = new org.mockito.cglib.proxy.Enhancer();
        enhancer54.setAttemptLoad(true);
        boolean boolean57 = enhancer54.getAttemptLoad();
        java.lang.ClassLoader classLoader58 = enhancer54.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy59 = enhancer54.getStrategy();
        enhancer44.setStrategy(generatorStrategy59);
        java.lang.ClassLoader classLoader61 = enhancer44.getClassLoader();
        java.lang.ClassLoader classLoader62 = enhancer44.getClassLoader();
        org.mockito.cglib.core.NamingPolicy namingPolicy63 = enhancer44.getNamingPolicy();
        enhancer0.setNamingPolicy(namingPolicy63);
        enhancer0.setInterceptDuringConstruction(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy67 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer68 = new org.mockito.cglib.proxy.Enhancer();
        enhancer68.setAttemptLoad(true);
        enhancer68.setSerialVersionUID((java.lang.Long) (-1L));
        enhancer68.setInterceptDuringConstruction(true);
        enhancer68.setInterceptDuringConstruction(true);
        boolean boolean77 = enhancer68.getAttemptLoad();
        boolean boolean78 = enhancer68.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray79 = generatorStrategy67.generate((org.mockito.cglib.core.ClassGenerator) enhancer68);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = enhancer0.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer4 = new org.mockito.cglib.proxy.Enhancer();
        enhancer4.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy7 = enhancer4.getNamingPolicy();
        java.lang.ClassLoader classLoader8 = enhancer4.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer9 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader10 = enhancer9.getClassLoader();
        enhancer4.setClassLoader(classLoader10);
        boolean boolean12 = enhancer4.getUseCache();
        boolean boolean13 = namingPolicy3.equals((java.lang.Object) enhancer4);
        org.mockito.cglib.proxy.Enhancer enhancer14 = new org.mockito.cglib.proxy.Enhancer();
        enhancer14.setAttemptLoad(true);
        boolean boolean17 = enhancer14.getAttemptLoad();
        java.lang.ClassLoader classLoader18 = enhancer14.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy19 = enhancer14.getStrategy();
        enhancer4.setStrategy(generatorStrategy19);
        java.lang.ClassLoader classLoader21 = enhancer4.getClassLoader();
        org.mockito.cglib.core.NamingPolicy namingPolicy22 = enhancer4.getNamingPolicy();
        boolean boolean23 = enhancer4.getAttemptLoad();
        enhancer4.setSerialVersionUID((java.lang.Long) 100L);
        enhancer4.setUseFactory(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy28 = enhancer4.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer29 = new org.mockito.cglib.proxy.Enhancer();
        enhancer29.setAttemptLoad(true);
        enhancer29.setSerialVersionUID((java.lang.Long) (-1L));
        enhancer29.setInterceptDuringConstruction(true);
        enhancer29.setUseCache(true);
        boolean boolean38 = enhancer29.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer39 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader40 = enhancer39.getClassLoader();
        java.lang.Object obj41 = new java.lang.Object();
        java.lang.Class<?> wildcardClass42 = obj41.getClass();
        java.lang.Object obj43 = new java.lang.Object();
        java.lang.Class<?> wildcardClass44 = obj43.getClass();
        boolean boolean45 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass44);
        java.lang.Object obj46 = new java.lang.Object();
        java.lang.Class<?> wildcardClass47 = obj46.getClass();
        boolean boolean48 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass47);
        java.lang.Object obj49 = new java.lang.Object();
        java.lang.Class<?> wildcardClass50 = obj49.getClass();
        boolean boolean51 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass50);
        java.lang.Object obj52 = new java.lang.Object();
        java.lang.Class<?> wildcardClass53 = obj52.getClass();
        java.lang.Object obj54 = new java.lang.Object();
        java.lang.Class<?> wildcardClass55 = obj54.getClass();
        boolean boolean56 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass55);
        java.lang.Class[] classArray57 = new java.lang.Class[] { wildcardClass42, wildcardClass44, wildcardClass47, wildcardClass50, wildcardClass53, wildcardClass55 };
        enhancer39.setInterfaces(classArray57);
        org.mockito.cglib.proxy.Enhancer enhancer59 = new org.mockito.cglib.proxy.Enhancer();
        enhancer59.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy62 = enhancer59.getNamingPolicy();
        java.lang.ClassLoader classLoader63 = enhancer59.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer64 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader65 = enhancer64.getClassLoader();
        enhancer59.setClassLoader(classLoader65);
        enhancer39.setClassLoader(classLoader65);
        java.lang.ClassLoader classLoader68 = enhancer39.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer69 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader70 = enhancer69.getClassLoader();
        enhancer69.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy73 = enhancer69.getNamingPolicy();
        enhancer39.setNamingPolicy(namingPolicy73);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy75 = enhancer39.getStrategy();
        enhancer29.setStrategy(generatorStrategy75);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy77 = enhancer29.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray78 = generatorStrategy28.generate((org.mockito.cglib.core.ClassGenerator) enhancer29);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setAttemptLoad(true);
        boolean boolean3 = enhancer0.getAttemptLoad();
        java.lang.ClassLoader classLoader4 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        enhancer6.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy9 = enhancer6.getNamingPolicy();
        java.lang.ClassLoader classLoader10 = enhancer6.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer11 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader12 = enhancer11.getClassLoader();
        enhancer6.setClassLoader(classLoader12);
        boolean boolean14 = enhancer6.getUseCache();
        enhancer6.setInterceptDuringConstruction(false);
        org.mockito.cglib.proxy.Enhancer enhancer17 = new org.mockito.cglib.proxy.Enhancer();
        enhancer17.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy20 = enhancer17.getNamingPolicy();
        java.lang.ClassLoader classLoader21 = enhancer17.getClassLoader();
        java.lang.ClassLoader classLoader22 = enhancer17.getClassLoader();
        enhancer6.setClassLoader(classLoader22);
        org.mockito.cglib.proxy.Enhancer enhancer24 = new org.mockito.cglib.proxy.Enhancer();
        enhancer24.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy27 = enhancer24.getNamingPolicy();
        java.lang.ClassLoader classLoader28 = enhancer24.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer29 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader30 = enhancer29.getClassLoader();
        enhancer24.setClassLoader(classLoader30);
        enhancer24.setAttemptLoad(true);
        java.lang.Object obj34 = new java.lang.Object();
        java.lang.Class<?> wildcardClass35 = obj34.getClass();
        java.lang.Class[] classArray36 = new java.lang.Class[] { wildcardClass35 };
        enhancer24.setInterfaces(classArray36);
        enhancer6.setInterfaces(classArray36);
        enhancer0.setInterfaces(classArray36);
        org.mockito.cglib.core.NamingPolicy namingPolicy40 = enhancer0.getNamingPolicy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy41 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer42 = new org.mockito.cglib.proxy.Enhancer();
        enhancer42.setAttemptLoad(true);
        boolean boolean45 = enhancer42.getAttemptLoad();
        java.lang.ClassLoader classLoader46 = enhancer42.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer47 = new org.mockito.cglib.proxy.Enhancer();
        enhancer47.setSerialVersionUID((java.lang.Long) 100L);
        enhancer47.setUseCache(false);
        enhancer47.setUseFactory(true);
        org.mockito.cglib.proxy.Enhancer enhancer54 = new org.mockito.cglib.proxy.Enhancer();
        enhancer54.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy57 = enhancer54.getNamingPolicy();
        java.lang.ClassLoader classLoader58 = enhancer54.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer59 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader60 = enhancer59.getClassLoader();
        enhancer54.setClassLoader(classLoader60);
        enhancer47.setClassLoader(classLoader60);
        enhancer42.setClassLoader(classLoader60);
        org.mockito.cglib.core.NamingPolicy namingPolicy64 = enhancer42.getNamingPolicy();
        enhancer42.setInterceptDuringConstruction(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray67 = generatorStrategy41.generate((org.mockito.cglib.core.ClassGenerator) enhancer42);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setAttemptLoad(true);
        enhancer0.setSerialVersionUID((java.lang.Long) (-1L));
        enhancer0.setInterceptDuringConstruction(true);
        enhancer0.setUseCache(true);
        enhancer0.setSerialVersionUID((java.lang.Long) 1L);
        enhancer0.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy13 = enhancer0.getNamingPolicy();
        enhancer0.setUseCache(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer17 = new org.mockito.cglib.proxy.Enhancer();
        enhancer17.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy20 = enhancer17.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer21 = new org.mockito.cglib.proxy.Enhancer();
        enhancer21.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy24 = enhancer21.getNamingPolicy();
        java.lang.ClassLoader classLoader25 = enhancer21.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer26 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader27 = enhancer26.getClassLoader();
        enhancer21.setClassLoader(classLoader27);
        boolean boolean29 = enhancer21.getUseCache();
        boolean boolean30 = namingPolicy20.equals((java.lang.Object) enhancer21);
        org.mockito.cglib.proxy.Enhancer enhancer31 = new org.mockito.cglib.proxy.Enhancer();
        enhancer31.setAttemptLoad(true);
        boolean boolean34 = enhancer31.getAttemptLoad();
        java.lang.ClassLoader classLoader35 = enhancer31.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy36 = enhancer31.getStrategy();
        enhancer21.setStrategy(generatorStrategy36);
        java.lang.ClassLoader classLoader38 = enhancer21.getClassLoader();
        org.mockito.cglib.core.NamingPolicy namingPolicy39 = enhancer21.getNamingPolicy();
        enhancer21.setUseCache(true);
        enhancer21.setAttemptLoad(false);
        enhancer21.setAttemptLoad(true);
        enhancer21.setUseFactory(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy48 = enhancer21.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray49 = generatorStrategy16.generate((org.mockito.cglib.core.ClassGenerator) enhancer21);
    }
}

