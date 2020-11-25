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
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class1 = null;
        enhancer0.setSuperclass(class1);
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = enhancer0.getNamingPolicy();
        enhancer0.setUseCache(false);
        enhancer0.setUseCache(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy8 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer9 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy10 = enhancer9.getStrategy();
        enhancer9.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.core.NamingPolicy namingPolicy13 = enhancer9.getNamingPolicy();
        enhancer9.setSerialVersionUID((java.lang.Long) 10L);
        enhancer9.setUseFactory(false);
        org.mockito.cglib.proxy.Enhancer enhancer18 = new org.mockito.cglib.proxy.Enhancer();
        enhancer18.setUseCache(false);
        org.mockito.cglib.proxy.Enhancer enhancer21 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class22 = null;
        enhancer21.setSuperclass(class22);
        org.mockito.cglib.core.NamingPolicy namingPolicy24 = enhancer21.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer25 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy26 = enhancer25.getStrategy();
        enhancer25.setSerialVersionUID((java.lang.Long) 0L);
        enhancer25.setUseFactory(false);
        java.lang.Class<?> wildcardClass31 = enhancer25.getClass();
        enhancer21.setSuperclass((java.lang.Class) wildcardClass31);
        org.mockito.cglib.proxy.Callback callback33 = null;
        enhancer21.setCallback(callback33);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy35 = enhancer21.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer36 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy37 = enhancer36.getStrategy();
        enhancer36.setSerialVersionUID((java.lang.Long) 0L);
        enhancer36.setUseFactory(false);
        org.mockito.cglib.proxy.Enhancer enhancer42 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy43 = enhancer42.getStrategy();
        java.lang.Class<?> wildcardClass44 = enhancer42.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer45 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy46 = enhancer45.getStrategy();
        java.lang.Class<?> wildcardClass47 = enhancer45.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer48 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy49 = enhancer48.getStrategy();
        java.lang.Class<?> wildcardClass50 = enhancer48.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer51 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy52 = enhancer51.getStrategy();
        java.lang.Class<?> wildcardClass53 = enhancer51.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer54 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy55 = enhancer54.getStrategy();
        java.lang.Class<?> wildcardClass56 = enhancer54.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer57 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy58 = enhancer57.getStrategy();
        java.lang.Class<?> wildcardClass59 = enhancer57.getClass();
        java.lang.Class[] classArray60 = new java.lang.Class[] { wildcardClass44, wildcardClass47, wildcardClass50, wildcardClass53, wildcardClass56, wildcardClass59 };
        enhancer36.setInterfaces(classArray60);
        enhancer21.setInterfaces(classArray60);
        enhancer18.setInterfaces(classArray60);
        enhancer9.setInterfaces(classArray60);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackTypes(classArray60);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown callback type class org.mockito.cglib.proxy.Enhancer");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(generatorStrategy8);
        org.junit.Assert.assertNotNull(generatorStrategy10);
        org.junit.Assert.assertNotNull(namingPolicy13);
        org.junit.Assert.assertNotNull(namingPolicy24);
        org.junit.Assert.assertNotNull(generatorStrategy26);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(generatorStrategy35);
        org.junit.Assert.assertNotNull(generatorStrategy37);
        org.junit.Assert.assertNotNull(generatorStrategy43);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(generatorStrategy46);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(generatorStrategy49);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(generatorStrategy52);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNotNull(generatorStrategy55);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertNotNull(generatorStrategy58);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNotNull(classArray60);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        enhancer0.setUseFactory(false);
        enhancer0.setAttemptLoad(false);
        java.lang.Class<?> wildcardClass8 = enhancer0.getClass();
        boolean boolean9 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass8);
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        enhancer0.setUseFactory(false);
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class7 = null;
        enhancer6.setSuperclass(class7);
        java.lang.ClassLoader classLoader9 = enhancer6.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer10 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class11 = null;
        enhancer10.setSuperclass(class11);
        org.mockito.cglib.core.NamingPolicy namingPolicy13 = enhancer10.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer14 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy15 = enhancer14.getStrategy();
        enhancer10.setStrategy(generatorStrategy15);
        enhancer6.setStrategy(generatorStrategy15);
        enhancer0.setStrategy(generatorStrategy15);
        org.mockito.cglib.proxy.Enhancer enhancer19 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy20 = enhancer19.getStrategy();
        enhancer19.setSerialVersionUID((java.lang.Long) 0L);
        enhancer19.setUseCache(true);
        org.mockito.cglib.proxy.Enhancer enhancer25 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class26 = null;
        enhancer25.setSuperclass(class26);
        org.mockito.cglib.core.NamingPolicy namingPolicy28 = enhancer25.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer29 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy30 = enhancer29.getStrategy();
        enhancer25.setStrategy(generatorStrategy30);
        enhancer19.setStrategy(generatorStrategy30);
        java.lang.ClassLoader classLoader33 = enhancer19.getClassLoader();
        enhancer19.setUseFactory(true);
        java.lang.Class<?> wildcardClass36 = enhancer19.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass36);
        org.mockito.cglib.proxy.Callback callback38 = null;
        enhancer0.setCallback(callback38);
        java.lang.ClassLoader classLoader40 = enhancer0.getClassLoader();
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(classLoader9);
        org.junit.Assert.assertNotNull(namingPolicy13);
        org.junit.Assert.assertNotNull(generatorStrategy15);
        org.junit.Assert.assertNotNull(generatorStrategy20);
        org.junit.Assert.assertNotNull(namingPolicy28);
        org.junit.Assert.assertNotNull(generatorStrategy30);
        org.junit.Assert.assertNotNull(classLoader33);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(classLoader40);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        enhancer0.setAttemptLoad(false);
        java.lang.ClassLoader classLoader6 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer7 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class8 = null;
        enhancer7.setSuperclass(class8);
        org.mockito.cglib.core.NamingPolicy namingPolicy10 = enhancer7.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer11 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = enhancer11.getStrategy();
        enhancer7.setStrategy(generatorStrategy12);
        boolean boolean14 = enhancer7.getUseCache();
        org.mockito.cglib.proxy.Enhancer enhancer15 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class16 = null;
        enhancer15.setSuperclass(class16);
        org.mockito.cglib.core.NamingPolicy namingPolicy18 = enhancer15.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer19 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy20 = enhancer19.getStrategy();
        enhancer19.setSerialVersionUID((java.lang.Long) 0L);
        enhancer19.setUseFactory(false);
        java.lang.Class<?> wildcardClass25 = enhancer19.getClass();
        enhancer15.setSuperclass((java.lang.Class) wildcardClass25);
        org.mockito.cglib.proxy.Callback callback27 = null;
        enhancer15.setCallback(callback27);
        enhancer15.setUseCache(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy31 = enhancer15.getNamingPolicy();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter32 = null;
        enhancer15.setCallbackFilter(callbackFilter32);
        java.lang.Class<?> wildcardClass34 = enhancer15.getClass();
        enhancer7.setSuperclass((java.lang.Class) wildcardClass34);
        boolean boolean36 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass34);
        enhancer0.setSuperclass((java.lang.Class) wildcardClass34);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class38 = enhancer0.createClass();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback types are required");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(classLoader6);
        org.junit.Assert.assertNotNull(namingPolicy10);
        org.junit.Assert.assertNotNull(generatorStrategy12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(namingPolicy18);
        org.junit.Assert.assertNotNull(generatorStrategy20);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(namingPolicy31);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class1 = null;
        enhancer0.setSuperclass(class1);
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = enhancer0.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer4 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer4.getStrategy();
        enhancer4.setSerialVersionUID((java.lang.Long) 0L);
        enhancer4.setUseFactory(false);
        java.lang.Class<?> wildcardClass10 = enhancer4.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass10);
        org.mockito.cglib.proxy.Callback callback12 = null;
        enhancer0.setCallback(callback12);
        enhancer0.setUseCache(true);
        java.lang.ClassLoader classLoader16 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.Callback callback17 = null;
        enhancer0.setCallback(callback17);
        java.lang.ClassLoader classLoader19 = enhancer0.getClassLoader();
        boolean boolean20 = enhancer0.getUseCache();
        org.mockito.cglib.proxy.Enhancer enhancer21 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy22 = enhancer21.getStrategy();
        enhancer21.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.core.NamingPolicy namingPolicy25 = enhancer21.getNamingPolicy();
        enhancer21.setSerialVersionUID((java.lang.Long) 10L);
        org.mockito.cglib.proxy.Enhancer enhancer28 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy29 = enhancer28.getStrategy();
        enhancer28.setSerialVersionUID((java.lang.Long) 0L);
        enhancer28.setAttemptLoad(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy34 = enhancer28.getStrategy();
        enhancer21.setStrategy(generatorStrategy34);
        org.mockito.cglib.core.NamingPolicy namingPolicy36 = enhancer21.getNamingPolicy();
        enhancer0.setNamingPolicy(namingPolicy36);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter38 = null;
        enhancer0.setCallbackFilter(callbackFilter38);
        java.lang.Class<?> wildcardClass40 = enhancer0.getClass();
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(classLoader16);
        org.junit.Assert.assertNotNull(classLoader19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(generatorStrategy22);
        org.junit.Assert.assertNotNull(namingPolicy25);
        org.junit.Assert.assertNotNull(generatorStrategy29);
        org.junit.Assert.assertNotNull(generatorStrategy34);
        org.junit.Assert.assertNotNull(namingPolicy36);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.core.NamingPolicy namingPolicy4 = enhancer0.getNamingPolicy();
        boolean boolean5 = enhancer0.getAttemptLoad();
        java.lang.ClassLoader classLoader6 = enhancer0.getClassLoader();
        java.lang.ClassLoader classLoader7 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.Callback callback8 = null;
        enhancer0.setCallback(callback8);
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(namingPolicy4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(classLoader6);
        org.junit.Assert.assertNotNull(classLoader7);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class1 = null;
        enhancer0.setSuperclass(class1);
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = enhancer0.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer4 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer4.getStrategy();
        enhancer4.setSerialVersionUID((java.lang.Long) 0L);
        enhancer4.setUseFactory(false);
        java.lang.Class<?> wildcardClass10 = enhancer4.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass10);
        org.mockito.cglib.proxy.Callback callback12 = null;
        enhancer0.setCallback(callback12);
        org.mockito.cglib.proxy.Callback callback14 = null;
        enhancer0.setCallback(callback14);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = enhancer0.getStrategy();
        java.lang.ClassLoader classLoader17 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.Callback callback18 = null;
        enhancer0.setCallback(callback18);
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(generatorStrategy16);
        org.junit.Assert.assertNotNull(classLoader17);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class1 = null;
        enhancer0.setSuperclass(class1);
        enhancer0.setSerialVersionUID((java.lang.Long) (-1L));
        org.mockito.cglib.proxy.CallbackFilter callbackFilter5 = null;
        enhancer0.setCallbackFilter(callbackFilter5);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = enhancer0.getStrategy();
        org.junit.Assert.assertNotNull(generatorStrategy7);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        enhancer0.setUseCache(true);
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = enhancer6.getStrategy();
        enhancer6.setSerialVersionUID((java.lang.Long) 0L);
        enhancer6.setAttemptLoad(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = enhancer6.getStrategy();
        enhancer0.setStrategy(generatorStrategy12);
        boolean boolean14 = enhancer0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy15 = enhancer0.getStrategy();
        java.lang.ClassLoader classLoader16 = enhancer0.getClassLoader();
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(generatorStrategy7);
        org.junit.Assert.assertNotNull(generatorStrategy12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(generatorStrategy15);
        org.junit.Assert.assertNotNull(classLoader16);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class1 = null;
        enhancer0.setSuperclass(class1);
        enhancer0.setSerialVersionUID((java.lang.Long) (-1L));
        org.mockito.cglib.proxy.Callback callback5 = null;
        enhancer0.setCallback(callback5);
        enhancer0.setUseFactory(false);
        java.lang.ClassLoader classLoader9 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.Callback callback10 = null;
        enhancer0.setCallback(callback10);
        org.mockito.cglib.core.NamingPolicy namingPolicy12 = enhancer0.getNamingPolicy();
        enhancer0.setAttemptLoad(true);
        org.mockito.cglib.proxy.Enhancer enhancer15 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = enhancer15.getStrategy();
        enhancer15.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.core.NamingPolicy namingPolicy19 = enhancer15.getNamingPolicy();
        enhancer15.setSerialVersionUID((java.lang.Long) 10L);
        enhancer15.setInterceptDuringConstruction(false);
        enhancer15.setAttemptLoad(true);
        org.mockito.cglib.proxy.Enhancer enhancer26 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class27 = null;
        enhancer26.setSuperclass(class27);
        org.mockito.cglib.core.NamingPolicy namingPolicy29 = enhancer26.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer30 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy31 = enhancer30.getStrategy();
        enhancer30.setSerialVersionUID((java.lang.Long) 0L);
        enhancer30.setUseFactory(false);
        java.lang.Class<?> wildcardClass36 = enhancer30.getClass();
        enhancer26.setSuperclass((java.lang.Class) wildcardClass36);
        org.mockito.cglib.proxy.Callback callback38 = null;
        enhancer26.setCallback(callback38);
        org.mockito.cglib.proxy.Enhancer enhancer40 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy41 = enhancer40.getStrategy();
        java.lang.ClassLoader classLoader42 = enhancer40.getClassLoader();
        enhancer26.setClassLoader(classLoader42);
        enhancer26.setSerialVersionUID((java.lang.Long) 0L);
        boolean boolean46 = enhancer26.getUseCache();
        enhancer26.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy49 = enhancer26.getNamingPolicy();
        enhancer26.setUseCache(false);
        org.mockito.cglib.proxy.Enhancer enhancer52 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy53 = enhancer52.getStrategy();
        enhancer52.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.proxy.Callback callback56 = null;
        enhancer52.setCallback(callback56);
        enhancer52.setUseCache(false);
        boolean boolean60 = enhancer52.getUseCache();
        org.mockito.cglib.proxy.Enhancer enhancer61 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class62 = null;
        enhancer61.setSuperclass(class62);
        enhancer61.setSerialVersionUID((java.lang.Long) (-1L));
        org.mockito.cglib.proxy.Callback callback66 = null;
        enhancer61.setCallback(callback66);
        java.lang.Class<?> wildcardClass68 = enhancer61.getClass();
        enhancer52.setSuperclass((java.lang.Class) wildcardClass68);
        org.mockito.cglib.proxy.Enhancer enhancer70 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class71 = null;
        enhancer70.setSuperclass(class71);
        java.lang.ClassLoader classLoader73 = enhancer70.getClassLoader();
        enhancer52.setClassLoader(classLoader73);
        enhancer26.setClassLoader(classLoader73);
        enhancer15.setClassLoader(classLoader73);
        enhancer0.setClassLoader(classLoader73);
        org.junit.Assert.assertNotNull(classLoader9);
        org.junit.Assert.assertNotNull(namingPolicy12);
        org.junit.Assert.assertNotNull(generatorStrategy16);
        org.junit.Assert.assertNotNull(namingPolicy19);
        org.junit.Assert.assertNotNull(namingPolicy29);
        org.junit.Assert.assertNotNull(generatorStrategy31);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(generatorStrategy41);
        org.junit.Assert.assertNotNull(classLoader42);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(namingPolicy49);
        org.junit.Assert.assertNotNull(generatorStrategy53);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertNotNull(classLoader73);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        enhancer0.setUseCache(true);
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class7 = null;
        enhancer6.setSuperclass(class7);
        org.mockito.cglib.core.NamingPolicy namingPolicy9 = enhancer6.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer10 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = enhancer10.getStrategy();
        enhancer6.setStrategy(generatorStrategy11);
        enhancer0.setStrategy(generatorStrategy11);
        java.lang.ClassLoader classLoader14 = enhancer0.getClassLoader();
        org.mockito.cglib.core.NamingPolicy namingPolicy15 = enhancer0.getNamingPolicy();
        enhancer0.setAttemptLoad(false);
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(namingPolicy9);
        org.junit.Assert.assertNotNull(generatorStrategy11);
        org.junit.Assert.assertNotNull(classLoader14);
        org.junit.Assert.assertNotNull(namingPolicy15);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        enhancer0.setAttemptLoad(false);
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = enhancer6.getStrategy();
        java.lang.Class<?> wildcardClass8 = enhancer6.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer9 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy10 = enhancer9.getStrategy();
        java.lang.Class<?> wildcardClass11 = enhancer9.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer12 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = enhancer12.getStrategy();
        enhancer12.setSerialVersionUID((java.lang.Long) 0L);
        enhancer12.setUseFactory(false);
        java.lang.Class<?> wildcardClass18 = enhancer12.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer19 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy20 = enhancer19.getStrategy();
        enhancer19.setSerialVersionUID((java.lang.Long) 0L);
        enhancer19.setUseFactory(false);
        java.lang.Class<?> wildcardClass25 = enhancer19.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer26 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class27 = null;
        enhancer26.setSuperclass(class27);
        java.lang.ClassLoader classLoader29 = enhancer26.getClassLoader();
        java.lang.Class<?> wildcardClass30 = enhancer26.getClass();
        java.lang.Class[] classArray31 = new java.lang.Class[] { wildcardClass8, wildcardClass11, wildcardClass18, wildcardClass25, wildcardClass30 };
        enhancer0.setInterfaces(classArray31);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy33 = enhancer0.getStrategy();
        java.lang.ClassLoader classLoader34 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy35 = null;
        enhancer0.setStrategy(generatorStrategy35);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy37 = enhancer0.getStrategy();
        java.lang.Class<?> wildcardClass38 = generatorStrategy37.getClass();
        org.mockito.cglib.proxy.Callback[] callbackArray39 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.registerStaticCallbacks((java.lang.Class) wildcardClass38, callbackArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.cglib.core.DefaultGeneratorStrategy is not an enhanced class");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(generatorStrategy7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(generatorStrategy10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(generatorStrategy13);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(generatorStrategy20);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(classLoader29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertNotNull(generatorStrategy33);
        org.junit.Assert.assertNotNull(classLoader34);
        org.junit.Assert.assertNotNull(generatorStrategy37);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class1 = null;
        enhancer0.setSuperclass(class1);
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = enhancer0.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer4 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer4.getStrategy();
        enhancer4.setSerialVersionUID((java.lang.Long) 0L);
        enhancer4.setUseFactory(false);
        java.lang.Class<?> wildcardClass10 = enhancer4.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass10);
        org.mockito.cglib.proxy.Callback callback12 = null;
        enhancer0.setCallback(callback12);
        enhancer0.setUseCache(true);
        java.lang.ClassLoader classLoader16 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.Callback callback17 = null;
        enhancer0.setCallback(callback17);
        java.lang.ClassLoader classLoader19 = enhancer0.getClassLoader();
        enhancer0.setUseFactory(false);
        enhancer0.setUseFactory(false);
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(classLoader16);
        org.junit.Assert.assertNotNull(classLoader19);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class1 = null;
        enhancer0.setSuperclass(class1);
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = enhancer0.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer4 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer4.getStrategy();
        enhancer4.setSerialVersionUID((java.lang.Long) 0L);
        enhancer4.setUseFactory(false);
        java.lang.Class<?> wildcardClass10 = enhancer4.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass10);
        org.mockito.cglib.proxy.Callback callback12 = null;
        enhancer0.setCallback(callback12);
        enhancer0.setUseCache(true);
        java.lang.ClassLoader classLoader16 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.Callback callback17 = null;
        enhancer0.setCallback(callback17);
        java.lang.ClassLoader classLoader19 = enhancer0.getClassLoader();
        enhancer0.setUseFactory(false);
        org.mockito.cglib.proxy.Enhancer enhancer22 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class23 = null;
        enhancer22.setSuperclass(class23);
        java.lang.Class<?> wildcardClass25 = enhancer22.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass25);
        enhancer0.setSerialVersionUID((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(classLoader16);
        org.junit.Assert.assertNotNull(classLoader19);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        enhancer0.setUseCache(true);
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class7 = null;
        enhancer6.setSuperclass(class7);
        org.mockito.cglib.core.NamingPolicy namingPolicy9 = enhancer6.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer10 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = enhancer10.getStrategy();
        enhancer6.setStrategy(generatorStrategy11);
        enhancer0.setStrategy(generatorStrategy11);
        boolean boolean14 = enhancer0.getAttemptLoad();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter15 = null;
        enhancer0.setCallbackFilter(callbackFilter15);
        org.mockito.cglib.proxy.Enhancer enhancer17 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy18 = enhancer17.getStrategy();
        java.lang.ClassLoader classLoader19 = enhancer17.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer20 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy21 = enhancer20.getStrategy();
        java.lang.ClassLoader classLoader22 = enhancer20.getClassLoader();
        enhancer20.setUseFactory(true);
        org.mockito.cglib.proxy.Enhancer enhancer25 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy26 = enhancer25.getStrategy();
        enhancer25.setSerialVersionUID((java.lang.Long) 0L);
        enhancer25.setAttemptLoad(false);
        org.mockito.cglib.proxy.Enhancer enhancer31 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy32 = enhancer31.getStrategy();
        java.lang.Class<?> wildcardClass33 = enhancer31.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer34 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy35 = enhancer34.getStrategy();
        java.lang.Class<?> wildcardClass36 = enhancer34.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer37 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy38 = enhancer37.getStrategy();
        enhancer37.setSerialVersionUID((java.lang.Long) 0L);
        enhancer37.setUseFactory(false);
        java.lang.Class<?> wildcardClass43 = enhancer37.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer44 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy45 = enhancer44.getStrategy();
        enhancer44.setSerialVersionUID((java.lang.Long) 0L);
        enhancer44.setUseFactory(false);
        java.lang.Class<?> wildcardClass50 = enhancer44.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer51 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class52 = null;
        enhancer51.setSuperclass(class52);
        java.lang.ClassLoader classLoader54 = enhancer51.getClassLoader();
        java.lang.Class<?> wildcardClass55 = enhancer51.getClass();
        java.lang.Class[] classArray56 = new java.lang.Class[] { wildcardClass33, wildcardClass36, wildcardClass43, wildcardClass50, wildcardClass55 };
        enhancer25.setInterfaces(classArray56);
        java.lang.Class<?> wildcardClass58 = enhancer25.getClass();
        enhancer20.setSuperclass((java.lang.Class) wildcardClass58);
        org.mockito.cglib.proxy.Enhancer enhancer60 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy61 = enhancer60.getStrategy();
        enhancer60.setSerialVersionUID((java.lang.Long) 0L);
        enhancer60.setUseFactory(false);
        org.mockito.cglib.proxy.Enhancer enhancer66 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy67 = enhancer66.getStrategy();
        java.lang.Class<?> wildcardClass68 = enhancer66.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer69 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy70 = enhancer69.getStrategy();
        java.lang.Class<?> wildcardClass71 = enhancer69.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer72 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy73 = enhancer72.getStrategy();
        java.lang.Class<?> wildcardClass74 = enhancer72.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer75 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy76 = enhancer75.getStrategy();
        java.lang.Class<?> wildcardClass77 = enhancer75.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer78 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy79 = enhancer78.getStrategy();
        java.lang.Class<?> wildcardClass80 = enhancer78.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer81 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy82 = enhancer81.getStrategy();
        java.lang.Class<?> wildcardClass83 = enhancer81.getClass();
        java.lang.Class[] classArray84 = new java.lang.Class[] { wildcardClass68, wildcardClass71, wildcardClass74, wildcardClass77, wildcardClass80, wildcardClass83 };
        enhancer60.setInterfaces(classArray84);
        enhancer20.setInterfaces(classArray84);
        enhancer17.setInterfaces(classArray84);
        enhancer0.setInterfaces(classArray84);
        boolean boolean89 = enhancer0.getAttemptLoad();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter90 = null;
        enhancer0.setCallbackFilter(callbackFilter90);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy92 = enhancer0.getStrategy();
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(namingPolicy9);
        org.junit.Assert.assertNotNull(generatorStrategy11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(generatorStrategy18);
        org.junit.Assert.assertNotNull(classLoader19);
        org.junit.Assert.assertNotNull(generatorStrategy21);
        org.junit.Assert.assertNotNull(classLoader22);
        org.junit.Assert.assertNotNull(generatorStrategy26);
        org.junit.Assert.assertNotNull(generatorStrategy32);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(generatorStrategy35);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(generatorStrategy38);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(generatorStrategy45);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(classLoader54);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(classArray56);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNotNull(generatorStrategy61);
        org.junit.Assert.assertNotNull(generatorStrategy67);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertNotNull(generatorStrategy70);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertNotNull(generatorStrategy73);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertNotNull(generatorStrategy76);
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertNotNull(generatorStrategy79);
        org.junit.Assert.assertNotNull(wildcardClass80);
        org.junit.Assert.assertNotNull(generatorStrategy82);
        org.junit.Assert.assertNotNull(wildcardClass83);
        org.junit.Assert.assertNotNull(classArray84);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(generatorStrategy92);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class1 = null;
        enhancer0.setSuperclass(class1);
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = enhancer0.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer4 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer4.getStrategy();
        enhancer4.setSerialVersionUID((java.lang.Long) 0L);
        enhancer4.setUseFactory(false);
        java.lang.Class<?> wildcardClass10 = enhancer4.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass10);
        org.mockito.cglib.proxy.Enhancer enhancer12 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = enhancer12.getStrategy();
        enhancer0.setStrategy(generatorStrategy13);
        org.mockito.cglib.proxy.Enhancer enhancer15 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = enhancer15.getStrategy();
        enhancer15.setSerialVersionUID((java.lang.Long) 0L);
        enhancer15.setUseFactory(false);
        org.mockito.cglib.proxy.Enhancer enhancer21 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy22 = enhancer21.getStrategy();
        java.lang.Class<?> wildcardClass23 = enhancer21.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer24 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy25 = enhancer24.getStrategy();
        java.lang.Class<?> wildcardClass26 = enhancer24.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer27 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy28 = enhancer27.getStrategy();
        java.lang.Class<?> wildcardClass29 = enhancer27.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer30 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy31 = enhancer30.getStrategy();
        java.lang.Class<?> wildcardClass32 = enhancer30.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer33 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy34 = enhancer33.getStrategy();
        java.lang.Class<?> wildcardClass35 = enhancer33.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer36 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy37 = enhancer36.getStrategy();
        java.lang.Class<?> wildcardClass38 = enhancer36.getClass();
        java.lang.Class[] classArray39 = new java.lang.Class[] { wildcardClass23, wildcardClass26, wildcardClass29, wildcardClass32, wildcardClass35, wildcardClass38 };
        enhancer15.setInterfaces(classArray39);
        org.mockito.cglib.core.NamingPolicy namingPolicy41 = enhancer15.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer42 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy43 = enhancer42.getStrategy();
        enhancer42.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.proxy.Callback callback46 = null;
        enhancer42.setCallback(callback46);
        java.lang.Class<?> wildcardClass48 = enhancer42.getClass();
        enhancer15.setSuperclass((java.lang.Class) wildcardClass48);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy50 = enhancer15.getStrategy();
        enhancer0.setStrategy(generatorStrategy50);
        enhancer0.setAttemptLoad(true);
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(generatorStrategy13);
        org.junit.Assert.assertNotNull(generatorStrategy16);
        org.junit.Assert.assertNotNull(generatorStrategy22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(generatorStrategy25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(generatorStrategy28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(generatorStrategy31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(generatorStrategy34);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(generatorStrategy37);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(classArray39);
        org.junit.Assert.assertNotNull(namingPolicy41);
        org.junit.Assert.assertNotNull(generatorStrategy43);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(generatorStrategy50);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.core.NamingPolicy namingPolicy4 = enhancer0.getNamingPolicy();
        enhancer0.setSerialVersionUID((java.lang.Long) 10L);
        enhancer0.setUseFactory(false);
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.proxy.Enhancer enhancer11 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = enhancer11.getStrategy();
        enhancer11.setSerialVersionUID((java.lang.Long) 0L);
        enhancer11.setUseFactory(false);
        org.mockito.cglib.proxy.Enhancer enhancer17 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy18 = enhancer17.getStrategy();
        java.lang.Class<?> wildcardClass19 = enhancer17.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer20 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy21 = enhancer20.getStrategy();
        java.lang.Class<?> wildcardClass22 = enhancer20.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer23 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy24 = enhancer23.getStrategy();
        java.lang.Class<?> wildcardClass25 = enhancer23.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer26 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy27 = enhancer26.getStrategy();
        java.lang.Class<?> wildcardClass28 = enhancer26.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer29 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy30 = enhancer29.getStrategy();
        java.lang.Class<?> wildcardClass31 = enhancer29.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer32 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy33 = enhancer32.getStrategy();
        java.lang.Class<?> wildcardClass34 = enhancer32.getClass();
        java.lang.Class[] classArray35 = new java.lang.Class[] { wildcardClass19, wildcardClass22, wildcardClass25, wildcardClass28, wildcardClass31, wildcardClass34 };
        enhancer11.setInterfaces(classArray35);
        enhancer0.setInterfaces(classArray35);
        org.mockito.cglib.proxy.Enhancer enhancer38 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class39 = null;
        enhancer38.setSuperclass(class39);
        org.mockito.cglib.core.NamingPolicy namingPolicy41 = enhancer38.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer42 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy43 = enhancer42.getStrategy();
        enhancer38.setStrategy(generatorStrategy43);
        enhancer0.setStrategy(generatorStrategy43);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj46 = enhancer0.create();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callbacks are required");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(namingPolicy4);
        org.junit.Assert.assertNotNull(generatorStrategy12);
        org.junit.Assert.assertNotNull(generatorStrategy18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(generatorStrategy21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(generatorStrategy24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(generatorStrategy27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(generatorStrategy30);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(generatorStrategy33);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(classArray35);
        org.junit.Assert.assertNotNull(namingPolicy41);
        org.junit.Assert.assertNotNull(generatorStrategy43);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class1 = null;
        enhancer0.setSuperclass(class1);
        java.lang.Class<?> wildcardClass3 = enhancer0.getClass();
        boolean boolean4 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass3);
        java.lang.Class[] classArray5 = null;
        java.util.List list6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.getMethods((java.lang.Class) wildcardClass3, classArray5, list6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class1 = null;
        enhancer0.setSuperclass(class1);
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = enhancer0.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer4 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer4.getStrategy();
        enhancer0.setStrategy(generatorStrategy5);
        enhancer0.setUseFactory(true);
        org.mockito.cglib.proxy.Enhancer enhancer9 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class10 = null;
        enhancer9.setSuperclass(class10);
        org.mockito.cglib.core.NamingPolicy namingPolicy12 = enhancer9.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer13 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy14 = enhancer13.getStrategy();
        enhancer13.setSerialVersionUID((java.lang.Long) 0L);
        enhancer13.setUseFactory(false);
        java.lang.Class<?> wildcardClass19 = enhancer13.getClass();
        enhancer9.setSuperclass((java.lang.Class) wildcardClass19);
        enhancer0.setSuperclass((java.lang.Class) wildcardClass19);
        org.mockito.cglib.core.NamingPolicy namingPolicy22 = enhancer0.getNamingPolicy();
        java.lang.ClassLoader classLoader23 = enhancer0.getClassLoader();
        org.mockito.cglib.core.NamingPolicy namingPolicy24 = enhancer0.getNamingPolicy();
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(namingPolicy12);
        org.junit.Assert.assertNotNull(generatorStrategy14);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(namingPolicy22);
        org.junit.Assert.assertNotNull(classLoader23);
        org.junit.Assert.assertNotNull(namingPolicy24);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.proxy.Callback callback4 = null;
        enhancer0.setCallback(callback4);
        enhancer0.setUseCache(false);
        boolean boolean8 = enhancer0.getUseCache();
        org.mockito.cglib.proxy.Callback callback9 = null;
        enhancer0.setCallback(callback9);
        enhancer0.setSerialVersionUID((java.lang.Long) 1L);
        org.mockito.cglib.proxy.Enhancer enhancer13 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class14 = null;
        enhancer13.setSuperclass(class14);
        org.mockito.cglib.core.NamingPolicy namingPolicy16 = enhancer13.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer17 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy18 = enhancer17.getStrategy();
        enhancer17.setSerialVersionUID((java.lang.Long) 0L);
        enhancer17.setUseFactory(false);
        java.lang.Class<?> wildcardClass23 = enhancer17.getClass();
        enhancer13.setSuperclass((java.lang.Class) wildcardClass23);
        org.mockito.cglib.proxy.Callback callback25 = null;
        enhancer13.setCallback(callback25);
        org.mockito.cglib.proxy.Callback callback27 = null;
        enhancer13.setCallback(callback27);
        java.lang.ClassLoader classLoader29 = enhancer13.getClassLoader();
        enhancer0.setClassLoader(classLoader29);
        org.mockito.asm.ClassVisitor classVisitor31 = null;
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.generateClass(classVisitor31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(namingPolicy16);
        org.junit.Assert.assertNotNull(generatorStrategy18);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(classLoader29);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        enhancer0.setUseFactory(false);
        enhancer0.setAttemptLoad(false);
        org.mockito.cglib.proxy.Enhancer enhancer8 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = enhancer8.getStrategy();
        java.lang.Class<?> wildcardClass10 = enhancer8.getClass();
        boolean boolean11 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass10);
        enhancer0.setSuperclass((java.lang.Class) wildcardClass10);
        java.lang.Class<?> wildcardClass13 = enhancer0.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer14 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Callback callback15 = null;
        enhancer14.setCallback(callback15);
        boolean boolean17 = enhancer14.getUseCache();
        org.mockito.cglib.proxy.Enhancer enhancer18 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class19 = null;
        enhancer18.setSuperclass(class19);
        enhancer18.setSerialVersionUID((java.lang.Long) (-1L));
        org.mockito.cglib.proxy.Callback callback23 = null;
        enhancer18.setCallback(callback23);
        enhancer18.setUseFactory(false);
        java.lang.ClassLoader classLoader27 = enhancer18.getClassLoader();
        org.mockito.cglib.proxy.Callback callback28 = null;
        enhancer18.setCallback(callback28);
        org.mockito.cglib.core.NamingPolicy namingPolicy30 = enhancer18.getNamingPolicy();
        enhancer18.setUseCache(false);
        boolean boolean33 = enhancer18.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer34 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy35 = enhancer34.getStrategy();
        enhancer34.setSerialVersionUID((java.lang.Long) 0L);
        enhancer34.setAttemptLoad(false);
        org.mockito.cglib.proxy.Enhancer enhancer40 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy41 = enhancer40.getStrategy();
        java.lang.Class<?> wildcardClass42 = enhancer40.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer43 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy44 = enhancer43.getStrategy();
        java.lang.Class<?> wildcardClass45 = enhancer43.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer46 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy47 = enhancer46.getStrategy();
        enhancer46.setSerialVersionUID((java.lang.Long) 0L);
        enhancer46.setUseFactory(false);
        java.lang.Class<?> wildcardClass52 = enhancer46.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer53 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy54 = enhancer53.getStrategy();
        enhancer53.setSerialVersionUID((java.lang.Long) 0L);
        enhancer53.setUseFactory(false);
        java.lang.Class<?> wildcardClass59 = enhancer53.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer60 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class61 = null;
        enhancer60.setSuperclass(class61);
        java.lang.ClassLoader classLoader63 = enhancer60.getClassLoader();
        java.lang.Class<?> wildcardClass64 = enhancer60.getClass();
        java.lang.Class[] classArray65 = new java.lang.Class[] { wildcardClass42, wildcardClass45, wildcardClass52, wildcardClass59, wildcardClass64 };
        enhancer34.setInterfaces(classArray65);
        enhancer18.setInterfaces(classArray65);
        enhancer14.setInterfaces(classArray65);
        java.util.List list69 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.getMethods((java.lang.Class) wildcardClass13, classArray65, list69);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(generatorStrategy9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(classLoader27);
        org.junit.Assert.assertNotNull(namingPolicy30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(generatorStrategy35);
        org.junit.Assert.assertNotNull(generatorStrategy41);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(generatorStrategy44);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(generatorStrategy47);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(generatorStrategy54);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNotNull(classLoader63);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNotNull(classArray65);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        boolean boolean2 = enhancer0.getUseCache();
        org.mockito.cglib.proxy.Callback callback3 = null;
        enhancer0.setCallback(callback3);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class7 = null;
        enhancer6.setSuperclass(class7);
        org.mockito.cglib.proxy.Enhancer enhancer9 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy10 = enhancer9.getStrategy();
        java.lang.ClassLoader classLoader11 = enhancer9.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter12 = null;
        enhancer9.setCallbackFilter(callbackFilter12);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy14 = enhancer9.getStrategy();
        enhancer6.setStrategy(generatorStrategy14);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = enhancer6.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy17 = enhancer6.getStrategy();
        enhancer0.setStrategy(generatorStrategy17);
        enhancer0.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.Enhancer enhancer21 = new org.mockito.cglib.proxy.Enhancer();
        enhancer21.setUseCache(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy24 = enhancer21.getStrategy();
        enhancer21.setSerialVersionUID((java.lang.Long) 1L);
        java.lang.Class<?> wildcardClass27 = enhancer21.getClass();
        boolean boolean28 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass27);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackType((java.lang.Class) wildcardClass27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown callback type class org.mockito.cglib.proxy.Enhancer");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(generatorStrategy10);
        org.junit.Assert.assertNotNull(classLoader11);
        org.junit.Assert.assertNotNull(generatorStrategy14);
        org.junit.Assert.assertNotNull(generatorStrategy16);
        org.junit.Assert.assertNotNull(generatorStrategy17);
        org.junit.Assert.assertNotNull(generatorStrategy24);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        java.lang.ClassLoader classLoader2 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter3 = null;
        enhancer0.setCallbackFilter(callbackFilter3);
        org.mockito.cglib.core.NamingPolicy namingPolicy5 = enhancer0.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = enhancer6.getStrategy();
        enhancer6.setSerialVersionUID((java.lang.Long) 0L);
        enhancer6.setUseFactory(false);
        org.mockito.cglib.proxy.Enhancer enhancer12 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = enhancer12.getStrategy();
        java.lang.Class<?> wildcardClass14 = enhancer12.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer15 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = enhancer15.getStrategy();
        java.lang.Class<?> wildcardClass17 = enhancer15.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer18 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy19 = enhancer18.getStrategy();
        java.lang.Class<?> wildcardClass20 = enhancer18.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer21 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy22 = enhancer21.getStrategy();
        java.lang.Class<?> wildcardClass23 = enhancer21.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer24 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy25 = enhancer24.getStrategy();
        java.lang.Class<?> wildcardClass26 = enhancer24.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer27 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy28 = enhancer27.getStrategy();
        java.lang.Class<?> wildcardClass29 = enhancer27.getClass();
        java.lang.Class[] classArray30 = new java.lang.Class[] { wildcardClass14, wildcardClass17, wildcardClass20, wildcardClass23, wildcardClass26, wildcardClass29 };
        enhancer6.setInterfaces(classArray30);
        org.mockito.cglib.proxy.Callback callback32 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray33 = new org.mockito.cglib.proxy.Callback[] { callback32 };
        enhancer6.setCallbacks(callbackArray33);
        enhancer0.setCallbacks(callbackArray33);
        java.lang.ClassLoader classLoader36 = null;
        enhancer0.setClassLoader(classLoader36);
        boolean boolean38 = enhancer0.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy39 = enhancer0.getNamingPolicy();
        enhancer0.setAttemptLoad(false);
        java.lang.ClassLoader classLoader42 = enhancer0.getClassLoader();
        boolean boolean43 = enhancer0.getAttemptLoad();
        enhancer0.setInterceptDuringConstruction(true);
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(classLoader2);
        org.junit.Assert.assertNotNull(namingPolicy5);
        org.junit.Assert.assertNotNull(generatorStrategy7);
        org.junit.Assert.assertNotNull(generatorStrategy13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(generatorStrategy16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(generatorStrategy19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(generatorStrategy22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(generatorStrategy25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(generatorStrategy28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(classArray30);
        org.junit.Assert.assertNotNull(callbackArray33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(namingPolicy39);
        org.junit.Assert.assertNotNull(classLoader42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class1 = null;
        enhancer0.setSuperclass(class1);
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = enhancer0.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer4 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer4.getStrategy();
        enhancer4.setSerialVersionUID((java.lang.Long) 0L);
        enhancer4.setUseFactory(false);
        java.lang.Class<?> wildcardClass10 = enhancer4.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass10);
        org.mockito.cglib.proxy.Callback callback12 = null;
        enhancer0.setCallback(callback12);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy14 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer15 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = enhancer15.getStrategy();
        enhancer15.setSerialVersionUID((java.lang.Long) 0L);
        enhancer15.setUseFactory(false);
        org.mockito.cglib.proxy.Enhancer enhancer21 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy22 = enhancer21.getStrategy();
        java.lang.Class<?> wildcardClass23 = enhancer21.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer24 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy25 = enhancer24.getStrategy();
        java.lang.Class<?> wildcardClass26 = enhancer24.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer27 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy28 = enhancer27.getStrategy();
        java.lang.Class<?> wildcardClass29 = enhancer27.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer30 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy31 = enhancer30.getStrategy();
        java.lang.Class<?> wildcardClass32 = enhancer30.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer33 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy34 = enhancer33.getStrategy();
        java.lang.Class<?> wildcardClass35 = enhancer33.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer36 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy37 = enhancer36.getStrategy();
        java.lang.Class<?> wildcardClass38 = enhancer36.getClass();
        java.lang.Class[] classArray39 = new java.lang.Class[] { wildcardClass23, wildcardClass26, wildcardClass29, wildcardClass32, wildcardClass35, wildcardClass38 };
        enhancer15.setInterfaces(classArray39);
        enhancer0.setInterfaces(classArray39);
        enhancer0.setInterceptDuringConstruction(false);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter44 = null;
        enhancer0.setCallbackFilter(callbackFilter44);
        enhancer0.setInterceptDuringConstruction(false);
        org.mockito.cglib.proxy.Callback callback48 = null;
        enhancer0.setCallback(callback48);
        enhancer0.setUseFactory(false);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter52 = null;
        enhancer0.setCallbackFilter(callbackFilter52);
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.proxy.Callback callback56 = null;
        enhancer0.setCallback(callback56);
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(generatorStrategy14);
        org.junit.Assert.assertNotNull(generatorStrategy16);
        org.junit.Assert.assertNotNull(generatorStrategy22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(generatorStrategy25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(generatorStrategy28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(generatorStrategy31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(generatorStrategy34);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(generatorStrategy37);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(classArray39);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class1 = null;
        enhancer0.setSuperclass(class1);
        org.mockito.cglib.proxy.Callback callback3 = null;
        enhancer0.setCallback(callback3);
        enhancer0.setInterceptDuringConstruction(false);
        enhancer0.setUseCache(false);
        org.mockito.cglib.proxy.Enhancer enhancer9 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy10 = enhancer9.getStrategy();
        java.lang.ClassLoader classLoader11 = enhancer9.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter12 = null;
        enhancer9.setCallbackFilter(callbackFilter12);
        enhancer9.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.Enhancer enhancer16 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class17 = null;
        enhancer16.setSuperclass(class17);
        org.mockito.cglib.proxy.Enhancer enhancer19 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy20 = enhancer19.getStrategy();
        java.lang.ClassLoader classLoader21 = enhancer19.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter22 = null;
        enhancer19.setCallbackFilter(callbackFilter22);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy24 = enhancer19.getStrategy();
        enhancer16.setStrategy(generatorStrategy24);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy26 = enhancer16.getStrategy();
        enhancer9.setStrategy(generatorStrategy26);
        java.lang.Class<?> wildcardClass28 = generatorStrategy26.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass28);
        java.lang.Class[] classArray30 = null;
        org.mockito.cglib.proxy.CallbackFilter callbackFilter31 = null;
        org.mockito.cglib.proxy.Enhancer enhancer32 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class33 = null;
        enhancer32.setSuperclass(class33);
        org.mockito.cglib.core.NamingPolicy namingPolicy35 = enhancer32.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer36 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy37 = enhancer36.getStrategy();
        enhancer36.setSerialVersionUID((java.lang.Long) 0L);
        enhancer36.setUseFactory(false);
        java.lang.Class<?> wildcardClass42 = enhancer36.getClass();
        enhancer32.setSuperclass((java.lang.Class) wildcardClass42);
        org.mockito.cglib.proxy.Callback callback44 = null;
        enhancer32.setCallback(callback44);
        org.mockito.cglib.proxy.Enhancer enhancer46 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class47 = null;
        enhancer46.setSuperclass(class47);
        org.mockito.cglib.core.NamingPolicy namingPolicy49 = enhancer46.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer50 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy51 = enhancer50.getStrategy();
        enhancer50.setSerialVersionUID((java.lang.Long) 0L);
        enhancer50.setUseFactory(false);
        java.lang.Class<?> wildcardClass56 = enhancer50.getClass();
        enhancer46.setSuperclass((java.lang.Class) wildcardClass56);
        org.mockito.cglib.proxy.Callback callback58 = null;
        enhancer46.setCallback(callback58);
        org.mockito.cglib.proxy.Callback callback60 = null;
        enhancer46.setCallback(callback60);
        java.lang.ClassLoader classLoader62 = enhancer46.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer63 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy64 = enhancer63.getStrategy();
        enhancer63.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.proxy.Callback callback67 = null;
        enhancer63.setCallback(callback67);
        enhancer63.setUseCache(false);
        boolean boolean71 = enhancer63.getUseCache();
        enhancer63.setSerialVersionUID((java.lang.Long) 10L);
        org.mockito.cglib.proxy.Enhancer enhancer74 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy75 = enhancer74.getStrategy();
        java.lang.ClassLoader classLoader76 = enhancer74.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter77 = null;
        enhancer74.setCallbackFilter(callbackFilter77);
        org.mockito.cglib.core.NamingPolicy namingPolicy79 = enhancer74.getNamingPolicy();
        enhancer63.setNamingPolicy(namingPolicy79);
        java.lang.Class<?> wildcardClass81 = enhancer63.getClass();
        enhancer46.setSuperclass((java.lang.Class) wildcardClass81);
        org.mockito.cglib.proxy.Callback callback83 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray84 = new org.mockito.cglib.proxy.Callback[] { callback83 };
        enhancer46.setCallbacks(callbackArray84);
        enhancer32.setCallbacks(callbackArray84);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj87 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass28, classArray30, callbackFilter31, callbackArray84);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(generatorStrategy10);
        org.junit.Assert.assertNotNull(classLoader11);
        org.junit.Assert.assertNotNull(generatorStrategy20);
        org.junit.Assert.assertNotNull(classLoader21);
        org.junit.Assert.assertNotNull(generatorStrategy24);
        org.junit.Assert.assertNotNull(generatorStrategy26);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(namingPolicy35);
        org.junit.Assert.assertNotNull(generatorStrategy37);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(namingPolicy49);
        org.junit.Assert.assertNotNull(generatorStrategy51);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertNotNull(classLoader62);
        org.junit.Assert.assertNotNull(generatorStrategy64);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(generatorStrategy75);
        org.junit.Assert.assertNotNull(classLoader76);
        org.junit.Assert.assertNotNull(namingPolicy79);
        org.junit.Assert.assertNotNull(wildcardClass81);
        org.junit.Assert.assertNotNull(callbackArray84);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        enhancer0.setUseCache(true);
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = enhancer6.getStrategy();
        enhancer6.setSerialVersionUID((java.lang.Long) 0L);
        enhancer6.setAttemptLoad(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = enhancer6.getStrategy();
        enhancer0.setStrategy(generatorStrategy12);
        enhancer0.setUseCache(false);
        boolean boolean16 = enhancer0.getUseCache();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter17 = null;
        enhancer0.setCallbackFilter(callbackFilter17);
        org.mockito.cglib.proxy.Enhancer enhancer19 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class20 = null;
        enhancer19.setSuperclass(class20);
        java.lang.ClassLoader classLoader22 = enhancer19.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer23 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class24 = null;
        enhancer23.setSuperclass(class24);
        org.mockito.cglib.core.NamingPolicy namingPolicy26 = enhancer23.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer27 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy28 = enhancer27.getStrategy();
        enhancer23.setStrategy(generatorStrategy28);
        enhancer19.setStrategy(generatorStrategy28);
        java.lang.Class<?> wildcardClass31 = enhancer19.getClass();
        boolean boolean32 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass31);
        enhancer0.setSuperclass((java.lang.Class) wildcardClass31);
        boolean boolean34 = enhancer0.getAttemptLoad();
        org.mockito.cglib.proxy.Callback callback35 = null;
        enhancer0.setCallback(callback35);
        org.mockito.cglib.proxy.Enhancer enhancer37 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class38 = null;
        enhancer37.setSuperclass(class38);
        enhancer37.setSerialVersionUID((java.lang.Long) (-1L));
        org.mockito.cglib.proxy.Callback callback42 = null;
        enhancer37.setCallback(callback42);
        enhancer37.setUseFactory(false);
        java.lang.ClassLoader classLoader46 = enhancer37.getClassLoader();
        enhancer0.setClassLoader(classLoader46);
        org.mockito.cglib.proxy.Enhancer enhancer48 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy49 = enhancer48.getStrategy();
        java.lang.Class<?> wildcardClass50 = enhancer48.getClass();
        boolean boolean51 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass50);
        enhancer0.setSuperclass((java.lang.Class) wildcardClass50);
        boolean boolean53 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass50);
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(generatorStrategy7);
        org.junit.Assert.assertNotNull(generatorStrategy12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(classLoader22);
        org.junit.Assert.assertNotNull(namingPolicy26);
        org.junit.Assert.assertNotNull(generatorStrategy28);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(classLoader46);
        org.junit.Assert.assertNotNull(generatorStrategy49);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class1 = null;
        enhancer0.setSuperclass(class1);
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = enhancer0.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer4 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer4.getStrategy();
        enhancer4.setSerialVersionUID((java.lang.Long) 0L);
        enhancer4.setUseFactory(false);
        java.lang.Class<?> wildcardClass10 = enhancer4.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass10);
        org.mockito.cglib.proxy.Callback callback12 = null;
        enhancer0.setCallback(callback12);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy14 = enhancer0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy15 = enhancer0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy16 = enhancer0.getNamingPolicy();
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(generatorStrategy14);
        org.junit.Assert.assertNotNull(generatorStrategy15);
        org.junit.Assert.assertNotNull(namingPolicy16);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        java.lang.ClassLoader classLoader2 = enhancer0.getClassLoader();
        enhancer0.setUseFactory(true);
        org.mockito.cglib.proxy.Enhancer enhancer5 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = enhancer5.getStrategy();
        enhancer5.setSerialVersionUID((java.lang.Long) 0L);
        enhancer5.setAttemptLoad(false);
        org.mockito.cglib.proxy.Enhancer enhancer11 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = enhancer11.getStrategy();
        java.lang.Class<?> wildcardClass13 = enhancer11.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer14 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy15 = enhancer14.getStrategy();
        java.lang.Class<?> wildcardClass16 = enhancer14.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer17 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy18 = enhancer17.getStrategy();
        enhancer17.setSerialVersionUID((java.lang.Long) 0L);
        enhancer17.setUseFactory(false);
        java.lang.Class<?> wildcardClass23 = enhancer17.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer24 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy25 = enhancer24.getStrategy();
        enhancer24.setSerialVersionUID((java.lang.Long) 0L);
        enhancer24.setUseFactory(false);
        java.lang.Class<?> wildcardClass30 = enhancer24.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer31 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class32 = null;
        enhancer31.setSuperclass(class32);
        java.lang.ClassLoader classLoader34 = enhancer31.getClassLoader();
        java.lang.Class<?> wildcardClass35 = enhancer31.getClass();
        java.lang.Class[] classArray36 = new java.lang.Class[] { wildcardClass13, wildcardClass16, wildcardClass23, wildcardClass30, wildcardClass35 };
        enhancer5.setInterfaces(classArray36);
        java.lang.Class<?> wildcardClass38 = enhancer5.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass38);
        org.mockito.cglib.proxy.Enhancer enhancer40 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy41 = enhancer40.getStrategy();
        enhancer40.setSerialVersionUID((java.lang.Long) 0L);
        enhancer40.setUseFactory(false);
        org.mockito.cglib.proxy.Enhancer enhancer46 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy47 = enhancer46.getStrategy();
        java.lang.Class<?> wildcardClass48 = enhancer46.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer49 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy50 = enhancer49.getStrategy();
        java.lang.Class<?> wildcardClass51 = enhancer49.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer52 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy53 = enhancer52.getStrategy();
        java.lang.Class<?> wildcardClass54 = enhancer52.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer55 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy56 = enhancer55.getStrategy();
        java.lang.Class<?> wildcardClass57 = enhancer55.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer58 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy59 = enhancer58.getStrategy();
        java.lang.Class<?> wildcardClass60 = enhancer58.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer61 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy62 = enhancer61.getStrategy();
        java.lang.Class<?> wildcardClass63 = enhancer61.getClass();
        java.lang.Class[] classArray64 = new java.lang.Class[] { wildcardClass48, wildcardClass51, wildcardClass54, wildcardClass57, wildcardClass60, wildcardClass63 };
        enhancer40.setInterfaces(classArray64);
        enhancer0.setInterfaces(classArray64);
        enhancer0.setUseFactory(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy69 = enhancer0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy70 = enhancer0.getStrategy();
        boolean boolean71 = enhancer0.getUseCache();
        boolean boolean72 = enhancer0.getUseCache();
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(classLoader2);
        org.junit.Assert.assertNotNull(generatorStrategy6);
        org.junit.Assert.assertNotNull(generatorStrategy12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(generatorStrategy15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(generatorStrategy18);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(generatorStrategy25);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(classLoader34);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(classArray36);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(generatorStrategy41);
        org.junit.Assert.assertNotNull(generatorStrategy47);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(generatorStrategy50);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(generatorStrategy53);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(generatorStrategy56);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(generatorStrategy59);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(generatorStrategy62);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(classArray64);
        org.junit.Assert.assertNotNull(generatorStrategy69);
        org.junit.Assert.assertNotNull(generatorStrategy70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        enhancer0.setUseFactory(false);
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class7 = null;
        enhancer6.setSuperclass(class7);
        java.lang.ClassLoader classLoader9 = enhancer6.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer10 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class11 = null;
        enhancer10.setSuperclass(class11);
        org.mockito.cglib.core.NamingPolicy namingPolicy13 = enhancer10.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer14 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy15 = enhancer14.getStrategy();
        enhancer10.setStrategy(generatorStrategy15);
        enhancer6.setStrategy(generatorStrategy15);
        enhancer0.setStrategy(generatorStrategy15);
        org.mockito.cglib.core.NamingPolicy namingPolicy19 = enhancer0.getNamingPolicy();
        enhancer0.setUseFactory(true);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter22 = null;
        enhancer0.setCallbackFilter(callbackFilter22);
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(classLoader9);
        org.junit.Assert.assertNotNull(namingPolicy13);
        org.junit.Assert.assertNotNull(generatorStrategy15);
        org.junit.Assert.assertNotNull(namingPolicy19);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = enhancer0.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer2 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = enhancer2.getStrategy();
        enhancer2.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.proxy.Callback callback6 = null;
        enhancer2.setCallback(callback6);
        enhancer2.setUseCache(false);
        boolean boolean10 = enhancer2.getUseCache();
        org.mockito.cglib.proxy.Callback callback11 = null;
        enhancer2.setCallback(callback11);
        java.lang.Class<?> wildcardClass13 = enhancer2.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass13);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter15 = null;
        enhancer0.setCallbackFilter(callbackFilter15);
        org.junit.Assert.assertNotNull(namingPolicy1);
        org.junit.Assert.assertNotNull(generatorStrategy3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        enhancer0.setAttemptLoad(false);
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = enhancer6.getStrategy();
        java.lang.Class<?> wildcardClass8 = enhancer6.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer9 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy10 = enhancer9.getStrategy();
        java.lang.Class<?> wildcardClass11 = enhancer9.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer12 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = enhancer12.getStrategy();
        enhancer12.setSerialVersionUID((java.lang.Long) 0L);
        enhancer12.setUseFactory(false);
        java.lang.Class<?> wildcardClass18 = enhancer12.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer19 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy20 = enhancer19.getStrategy();
        enhancer19.setSerialVersionUID((java.lang.Long) 0L);
        enhancer19.setUseFactory(false);
        java.lang.Class<?> wildcardClass25 = enhancer19.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer26 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class27 = null;
        enhancer26.setSuperclass(class27);
        java.lang.ClassLoader classLoader29 = enhancer26.getClassLoader();
        java.lang.Class<?> wildcardClass30 = enhancer26.getClass();
        java.lang.Class[] classArray31 = new java.lang.Class[] { wildcardClass8, wildcardClass11, wildcardClass18, wildcardClass25, wildcardClass30 };
        enhancer0.setInterfaces(classArray31);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy33 = enhancer0.getStrategy();
        java.lang.ClassLoader classLoader34 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy35 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer36 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy37 = enhancer36.getStrategy();
        enhancer36.setSerialVersionUID((java.lang.Long) 0L);
        enhancer36.setUseCache(true);
        org.mockito.cglib.proxy.Enhancer enhancer42 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class43 = null;
        enhancer42.setSuperclass(class43);
        org.mockito.cglib.core.NamingPolicy namingPolicy45 = enhancer42.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer46 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy47 = enhancer46.getStrategy();
        enhancer42.setStrategy(generatorStrategy47);
        enhancer36.setStrategy(generatorStrategy47);
        enhancer0.setStrategy(generatorStrategy47);
        org.mockito.cglib.proxy.Enhancer enhancer51 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class52 = null;
        enhancer51.setSuperclass(class52);
        enhancer51.setSerialVersionUID((java.lang.Long) (-1L));
        org.mockito.cglib.proxy.Callback callback56 = null;
        enhancer51.setCallback(callback56);
        enhancer51.setUseFactory(false);
        java.lang.ClassLoader classLoader60 = enhancer51.getClassLoader();
        enhancer0.setClassLoader(classLoader60);
        enhancer0.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.Enhancer enhancer64 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy65 = enhancer64.getStrategy();
        java.lang.ClassLoader classLoader66 = enhancer64.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter67 = null;
        enhancer64.setCallbackFilter(callbackFilter67);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy69 = enhancer64.getStrategy();
        java.lang.Class<?> wildcardClass70 = enhancer64.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass70);
        boolean boolean72 = enhancer0.getUseCache();
        boolean boolean73 = enhancer0.getAttemptLoad();
        enhancer0.setAttemptLoad(true);
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(generatorStrategy7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(generatorStrategy10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(generatorStrategy13);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(generatorStrategy20);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(classLoader29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertNotNull(generatorStrategy33);
        org.junit.Assert.assertNotNull(classLoader34);
        org.junit.Assert.assertNotNull(generatorStrategy35);
        org.junit.Assert.assertNotNull(generatorStrategy37);
        org.junit.Assert.assertNotNull(namingPolicy45);
        org.junit.Assert.assertNotNull(generatorStrategy47);
        org.junit.Assert.assertNotNull(classLoader60);
        org.junit.Assert.assertNotNull(generatorStrategy65);
        org.junit.Assert.assertNotNull(classLoader66);
        org.junit.Assert.assertNotNull(generatorStrategy69);
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        java.lang.ClassLoader classLoader2 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter3 = null;
        enhancer0.setCallbackFilter(callbackFilter3);
        enhancer0.setInterceptDuringConstruction(true);
        enhancer0.setInterceptDuringConstruction(false);
        enhancer0.setUseFactory(false);
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(classLoader2);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class1 = null;
        enhancer0.setSuperclass(class1);
        enhancer0.setSerialVersionUID((java.lang.Long) (-1L));
        org.mockito.cglib.proxy.Callback callback5 = null;
        enhancer0.setCallback(callback5);
        enhancer0.setUseFactory(false);
        org.mockito.cglib.proxy.Enhancer enhancer9 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy10 = enhancer9.getStrategy();
        enhancer9.setSerialVersionUID((java.lang.Long) 0L);
        enhancer9.setUseFactory(false);
        org.mockito.cglib.proxy.Enhancer enhancer15 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = enhancer15.getStrategy();
        java.lang.Class<?> wildcardClass17 = enhancer15.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer18 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy19 = enhancer18.getStrategy();
        java.lang.Class<?> wildcardClass20 = enhancer18.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer21 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy22 = enhancer21.getStrategy();
        java.lang.Class<?> wildcardClass23 = enhancer21.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer24 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy25 = enhancer24.getStrategy();
        java.lang.Class<?> wildcardClass26 = enhancer24.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer27 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy28 = enhancer27.getStrategy();
        java.lang.Class<?> wildcardClass29 = enhancer27.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer30 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy31 = enhancer30.getStrategy();
        java.lang.Class<?> wildcardClass32 = enhancer30.getClass();
        java.lang.Class[] classArray33 = new java.lang.Class[] { wildcardClass17, wildcardClass20, wildcardClass23, wildcardClass26, wildcardClass29, wildcardClass32 };
        enhancer9.setInterfaces(classArray33);
        org.mockito.cglib.core.NamingPolicy namingPolicy35 = enhancer9.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy36 = enhancer9.getNamingPolicy();
        enhancer0.setNamingPolicy(namingPolicy36);
        boolean boolean38 = enhancer0.getAttemptLoad();
        org.mockito.cglib.proxy.Callback callback39 = null;
        enhancer0.setCallback(callback39);
        boolean boolean41 = enhancer0.getUseCache();
        org.junit.Assert.assertNotNull(generatorStrategy10);
        org.junit.Assert.assertNotNull(generatorStrategy16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(generatorStrategy19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(generatorStrategy22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(generatorStrategy25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(generatorStrategy28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(generatorStrategy31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(classArray33);
        org.junit.Assert.assertNotNull(namingPolicy35);
        org.junit.Assert.assertNotNull(namingPolicy36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class1 = null;
        enhancer0.setSuperclass(class1);
        enhancer0.setSerialVersionUID((java.lang.Long) (-1L));
        org.mockito.cglib.proxy.Callback callback5 = null;
        enhancer0.setCallback(callback5);
        enhancer0.setUseFactory(false);
        java.lang.ClassLoader classLoader9 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.Callback callback10 = null;
        enhancer0.setCallback(callback10);
        boolean boolean12 = enhancer0.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer13 = new org.mockito.cglib.proxy.Enhancer();
        enhancer13.setUseCache(false);
        org.mockito.cglib.proxy.Enhancer enhancer16 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class17 = null;
        enhancer16.setSuperclass(class17);
        org.mockito.cglib.core.NamingPolicy namingPolicy19 = enhancer16.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer20 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy21 = enhancer20.getStrategy();
        enhancer20.setSerialVersionUID((java.lang.Long) 0L);
        enhancer20.setUseFactory(false);
        java.lang.Class<?> wildcardClass26 = enhancer20.getClass();
        enhancer16.setSuperclass((java.lang.Class) wildcardClass26);
        org.mockito.cglib.proxy.Callback callback28 = null;
        enhancer16.setCallback(callback28);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy30 = enhancer16.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer31 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy32 = enhancer31.getStrategy();
        enhancer31.setSerialVersionUID((java.lang.Long) 0L);
        enhancer31.setUseFactory(false);
        org.mockito.cglib.proxy.Enhancer enhancer37 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy38 = enhancer37.getStrategy();
        java.lang.Class<?> wildcardClass39 = enhancer37.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer40 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy41 = enhancer40.getStrategy();
        java.lang.Class<?> wildcardClass42 = enhancer40.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer43 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy44 = enhancer43.getStrategy();
        java.lang.Class<?> wildcardClass45 = enhancer43.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer46 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy47 = enhancer46.getStrategy();
        java.lang.Class<?> wildcardClass48 = enhancer46.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer49 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy50 = enhancer49.getStrategy();
        java.lang.Class<?> wildcardClass51 = enhancer49.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer52 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy53 = enhancer52.getStrategy();
        java.lang.Class<?> wildcardClass54 = enhancer52.getClass();
        java.lang.Class[] classArray55 = new java.lang.Class[] { wildcardClass39, wildcardClass42, wildcardClass45, wildcardClass48, wildcardClass51, wildcardClass54 };
        enhancer31.setInterfaces(classArray55);
        enhancer16.setInterfaces(classArray55);
        enhancer13.setInterfaces(classArray55);
        enhancer0.setInterfaces(classArray55);
        org.mockito.cglib.proxy.Enhancer enhancer60 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy61 = enhancer60.getStrategy();
        enhancer60.setSerialVersionUID((java.lang.Long) 0L);
        enhancer60.setUseFactory(false);
        org.mockito.cglib.proxy.Enhancer enhancer66 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy67 = enhancer66.getStrategy();
        java.lang.Class<?> wildcardClass68 = enhancer66.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer69 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy70 = enhancer69.getStrategy();
        java.lang.Class<?> wildcardClass71 = enhancer69.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer72 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy73 = enhancer72.getStrategy();
        java.lang.Class<?> wildcardClass74 = enhancer72.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer75 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy76 = enhancer75.getStrategy();
        java.lang.Class<?> wildcardClass77 = enhancer75.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer78 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy79 = enhancer78.getStrategy();
        java.lang.Class<?> wildcardClass80 = enhancer78.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer81 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy82 = enhancer81.getStrategy();
        java.lang.Class<?> wildcardClass83 = enhancer81.getClass();
        java.lang.Class[] classArray84 = new java.lang.Class[] { wildcardClass68, wildcardClass71, wildcardClass74, wildcardClass77, wildcardClass80, wildcardClass83 };
        enhancer60.setInterfaces(classArray84);
        enhancer0.setInterfaces(classArray84);
        org.junit.Assert.assertNotNull(classLoader9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(namingPolicy19);
        org.junit.Assert.assertNotNull(generatorStrategy21);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(generatorStrategy30);
        org.junit.Assert.assertNotNull(generatorStrategy32);
        org.junit.Assert.assertNotNull(generatorStrategy38);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(generatorStrategy41);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(generatorStrategy44);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(generatorStrategy47);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(generatorStrategy50);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(generatorStrategy53);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(classArray55);
        org.junit.Assert.assertNotNull(generatorStrategy61);
        org.junit.Assert.assertNotNull(generatorStrategy67);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertNotNull(generatorStrategy70);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertNotNull(generatorStrategy73);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertNotNull(generatorStrategy76);
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertNotNull(generatorStrategy79);
        org.junit.Assert.assertNotNull(wildcardClass80);
        org.junit.Assert.assertNotNull(generatorStrategy82);
        org.junit.Assert.assertNotNull(wildcardClass83);
        org.junit.Assert.assertNotNull(classArray84);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        java.lang.ClassLoader classLoader2 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter3 = null;
        enhancer0.setCallbackFilter(callbackFilter3);
        enhancer0.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.Callback callback7 = null;
        enhancer0.setCallback(callback7);
        enhancer0.setAttemptLoad(true);
        enhancer0.setUseCache(false);
        enhancer0.setInterceptDuringConstruction(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy15 = enhancer0.getNamingPolicy();
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(classLoader2);
        org.junit.Assert.assertNotNull(namingPolicy15);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        java.lang.ClassLoader classLoader2 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter3 = null;
        enhancer0.setCallbackFilter(callbackFilter3);
        enhancer0.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.Enhancer enhancer7 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class8 = null;
        enhancer7.setSuperclass(class8);
        org.mockito.cglib.proxy.Enhancer enhancer10 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = enhancer10.getStrategy();
        java.lang.ClassLoader classLoader12 = enhancer10.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter13 = null;
        enhancer10.setCallbackFilter(callbackFilter13);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy15 = enhancer10.getStrategy();
        enhancer7.setStrategy(generatorStrategy15);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy17 = enhancer7.getStrategy();
        enhancer0.setStrategy(generatorStrategy17);
        org.mockito.cglib.proxy.Enhancer enhancer19 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy20 = enhancer19.getStrategy();
        java.lang.ClassLoader classLoader21 = enhancer19.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter22 = null;
        enhancer19.setCallbackFilter(callbackFilter22);
        org.mockito.cglib.core.NamingPolicy namingPolicy24 = enhancer19.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer25 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy26 = enhancer25.getStrategy();
        enhancer25.setSerialVersionUID((java.lang.Long) 0L);
        enhancer25.setUseFactory(false);
        org.mockito.cglib.proxy.Enhancer enhancer31 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy32 = enhancer31.getStrategy();
        java.lang.Class<?> wildcardClass33 = enhancer31.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer34 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy35 = enhancer34.getStrategy();
        java.lang.Class<?> wildcardClass36 = enhancer34.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer37 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy38 = enhancer37.getStrategy();
        java.lang.Class<?> wildcardClass39 = enhancer37.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer40 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy41 = enhancer40.getStrategy();
        java.lang.Class<?> wildcardClass42 = enhancer40.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer43 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy44 = enhancer43.getStrategy();
        java.lang.Class<?> wildcardClass45 = enhancer43.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer46 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy47 = enhancer46.getStrategy();
        java.lang.Class<?> wildcardClass48 = enhancer46.getClass();
        java.lang.Class[] classArray49 = new java.lang.Class[] { wildcardClass33, wildcardClass36, wildcardClass39, wildcardClass42, wildcardClass45, wildcardClass48 };
        enhancer25.setInterfaces(classArray49);
        org.mockito.cglib.proxy.Callback callback51 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray52 = new org.mockito.cglib.proxy.Callback[] { callback51 };
        enhancer25.setCallbacks(callbackArray52);
        enhancer19.setCallbacks(callbackArray52);
        enhancer0.setCallbacks(callbackArray52);
        org.mockito.cglib.proxy.Enhancer enhancer56 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy57 = enhancer56.getStrategy();
        enhancer56.setSerialVersionUID((java.lang.Long) 0L);
        enhancer56.setUseCache(true);
        org.mockito.cglib.proxy.Enhancer enhancer62 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class63 = null;
        enhancer62.setSuperclass(class63);
        org.mockito.cglib.core.NamingPolicy namingPolicy65 = enhancer62.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer66 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy67 = enhancer66.getStrategy();
        enhancer62.setStrategy(generatorStrategy67);
        enhancer56.setStrategy(generatorStrategy67);
        java.lang.ClassLoader classLoader70 = enhancer56.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer71 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class72 = null;
        enhancer71.setSuperclass(class72);
        org.mockito.cglib.proxy.Enhancer enhancer74 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy75 = enhancer74.getStrategy();
        java.lang.ClassLoader classLoader76 = enhancer74.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter77 = null;
        enhancer74.setCallbackFilter(callbackFilter77);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy79 = enhancer74.getStrategy();
        enhancer71.setStrategy(generatorStrategy79);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy81 = enhancer71.getStrategy();
        java.lang.Class<?> wildcardClass82 = generatorStrategy81.getClass();
        enhancer56.setSuperclass((java.lang.Class) wildcardClass82);
        enhancer0.setSuperclass((java.lang.Class) wildcardClass82);
        org.mockito.cglib.proxy.Callback callback85 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj86 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass82, callback85);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(classLoader2);
        org.junit.Assert.assertNotNull(generatorStrategy11);
        org.junit.Assert.assertNotNull(classLoader12);
        org.junit.Assert.assertNotNull(generatorStrategy15);
        org.junit.Assert.assertNotNull(generatorStrategy17);
        org.junit.Assert.assertNotNull(generatorStrategy20);
        org.junit.Assert.assertNotNull(classLoader21);
        org.junit.Assert.assertNotNull(namingPolicy24);
        org.junit.Assert.assertNotNull(generatorStrategy26);
        org.junit.Assert.assertNotNull(generatorStrategy32);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(generatorStrategy35);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(generatorStrategy38);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(generatorStrategy41);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(generatorStrategy44);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(generatorStrategy47);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(classArray49);
        org.junit.Assert.assertNotNull(callbackArray52);
        org.junit.Assert.assertNotNull(generatorStrategy57);
        org.junit.Assert.assertNotNull(namingPolicy65);
        org.junit.Assert.assertNotNull(generatorStrategy67);
        org.junit.Assert.assertNotNull(classLoader70);
        org.junit.Assert.assertNotNull(generatorStrategy75);
        org.junit.Assert.assertNotNull(classLoader76);
        org.junit.Assert.assertNotNull(generatorStrategy79);
        org.junit.Assert.assertNotNull(generatorStrategy81);
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class1 = null;
        enhancer0.setSuperclass(class1);
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = enhancer0.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer4 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer4.getStrategy();
        enhancer4.setSerialVersionUID((java.lang.Long) 0L);
        enhancer4.setUseFactory(false);
        java.lang.Class<?> wildcardClass10 = enhancer4.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass10);
        org.mockito.cglib.proxy.Callback callback12 = null;
        enhancer0.setCallback(callback12);
        enhancer0.setUseCache(true);
        java.lang.ClassLoader classLoader16 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.Callback callback17 = null;
        enhancer0.setCallback(callback17);
        java.lang.ClassLoader classLoader19 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer20 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class21 = null;
        enhancer20.setSuperclass(class21);
        org.mockito.cglib.core.NamingPolicy namingPolicy23 = enhancer20.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer24 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy25 = enhancer24.getStrategy();
        enhancer24.setSerialVersionUID((java.lang.Long) 0L);
        enhancer24.setUseFactory(false);
        java.lang.Class<?> wildcardClass30 = enhancer24.getClass();
        enhancer20.setSuperclass((java.lang.Class) wildcardClass30);
        org.mockito.cglib.proxy.Callback callback32 = null;
        enhancer20.setCallback(callback32);
        org.mockito.cglib.proxy.Callback callback34 = null;
        enhancer20.setCallback(callback34);
        java.lang.ClassLoader classLoader36 = enhancer20.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer37 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy38 = enhancer37.getStrategy();
        enhancer37.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.proxy.Callback callback41 = null;
        enhancer37.setCallback(callback41);
        enhancer37.setUseCache(false);
        boolean boolean45 = enhancer37.getUseCache();
        enhancer37.setSerialVersionUID((java.lang.Long) 10L);
        org.mockito.cglib.proxy.Enhancer enhancer48 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy49 = enhancer48.getStrategy();
        java.lang.ClassLoader classLoader50 = enhancer48.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter51 = null;
        enhancer48.setCallbackFilter(callbackFilter51);
        org.mockito.cglib.core.NamingPolicy namingPolicy53 = enhancer48.getNamingPolicy();
        enhancer37.setNamingPolicy(namingPolicy53);
        java.lang.Class<?> wildcardClass55 = enhancer37.getClass();
        enhancer20.setSuperclass((java.lang.Class) wildcardClass55);
        org.mockito.cglib.proxy.Callback callback57 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray58 = new org.mockito.cglib.proxy.Callback[] { callback57 };
        enhancer20.setCallbacks(callbackArray58);
        enhancer0.setCallbacks(callbackArray58);
        enhancer0.setAttemptLoad(false);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter63 = null;
        enhancer0.setCallbackFilter(callbackFilter63);
        enhancer0.setUseCache(false);
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(classLoader16);
        org.junit.Assert.assertNotNull(classLoader19);
        org.junit.Assert.assertNotNull(namingPolicy23);
        org.junit.Assert.assertNotNull(generatorStrategy25);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(classLoader36);
        org.junit.Assert.assertNotNull(generatorStrategy38);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(generatorStrategy49);
        org.junit.Assert.assertNotNull(classLoader50);
        org.junit.Assert.assertNotNull(namingPolicy53);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(callbackArray58);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class1 = null;
        enhancer0.setSuperclass(class1);
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = enhancer0.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer4 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer4.getStrategy();
        enhancer4.setSerialVersionUID((java.lang.Long) 0L);
        enhancer4.setUseFactory(false);
        java.lang.Class<?> wildcardClass10 = enhancer4.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass10);
        org.mockito.cglib.proxy.Callback callback12 = null;
        enhancer0.setCallback(callback12);
        enhancer0.setAttemptLoad(false);
        org.mockito.cglib.proxy.Enhancer enhancer16 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Callback callback17 = null;
        enhancer16.setCallback(callback17);
        boolean boolean19 = enhancer16.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy20 = enhancer16.getStrategy();
        enhancer0.setStrategy(generatorStrategy20);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter22 = null;
        enhancer0.setCallbackFilter(callbackFilter22);
        org.mockito.cglib.proxy.Enhancer enhancer24 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy25 = enhancer24.getStrategy();
        enhancer24.setSerialVersionUID((java.lang.Long) 0L);
        enhancer24.setUseCache(true);
        boolean boolean30 = enhancer24.getUseCache();
        org.mockito.cglib.proxy.Enhancer enhancer31 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class32 = null;
        enhancer31.setSuperclass(class32);
        java.lang.ClassLoader classLoader34 = enhancer31.getClassLoader();
        java.lang.Class<?> wildcardClass35 = enhancer31.getClass();
        enhancer24.setSuperclass((java.lang.Class) wildcardClass35);
        boolean boolean37 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass35);
        boolean boolean38 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass35);
        enhancer0.setSuperclass((java.lang.Class) wildcardClass35);
        org.mockito.cglib.proxy.Enhancer enhancer40 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy41 = enhancer40.getStrategy();
        enhancer40.setSerialVersionUID((java.lang.Long) 0L);
        enhancer40.setUseCache(true);
        org.mockito.cglib.proxy.Enhancer enhancer46 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class47 = null;
        enhancer46.setSuperclass(class47);
        org.mockito.cglib.core.NamingPolicy namingPolicy49 = enhancer46.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer50 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy51 = enhancer50.getStrategy();
        enhancer46.setStrategy(generatorStrategy51);
        enhancer40.setStrategy(generatorStrategy51);
        boolean boolean54 = enhancer40.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy55 = null;
        enhancer40.setStrategy(generatorStrategy55);
        org.mockito.cglib.core.NamingPolicy namingPolicy57 = enhancer40.getNamingPolicy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy58 = enhancer40.getStrategy();
        enhancer0.setStrategy(generatorStrategy58);
        enhancer0.setUseCache(true);
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(generatorStrategy20);
        org.junit.Assert.assertNotNull(generatorStrategy25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(classLoader34);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(generatorStrategy41);
        org.junit.Assert.assertNotNull(namingPolicy49);
        org.junit.Assert.assertNotNull(generatorStrategy51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(namingPolicy57);
        org.junit.Assert.assertNotNull(generatorStrategy58);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class1 = null;
        enhancer0.setSuperclass(class1);
        enhancer0.setSerialVersionUID((java.lang.Long) (-1L));
        java.lang.ClassLoader classLoader5 = enhancer0.getClassLoader();
        java.lang.Class class6 = null;
        enhancer0.setSuperclass(class6);
        enhancer0.setAttemptLoad(true);
        org.mockito.cglib.proxy.Callback callback10 = null;
        enhancer0.setCallback(callback10);
        enhancer0.setUseCache(true);
        java.lang.Class<?> wildcardClass14 = enhancer0.getClass();
        org.junit.Assert.assertNotNull(classLoader5);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class1 = null;
        enhancer0.setSuperclass(class1);
        enhancer0.setSerialVersionUID((java.lang.Long) (-1L));
        enhancer0.setUseCache(false);
        enhancer0.setAttemptLoad(false);
        enhancer0.setAttemptLoad(false);
        org.mockito.cglib.proxy.Enhancer enhancer11 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class12 = null;
        enhancer11.setSuperclass(class12);
        enhancer11.setSerialVersionUID((java.lang.Long) (-1L));
        org.mockito.cglib.proxy.Callback callback16 = null;
        enhancer11.setCallback(callback16);
        enhancer11.setUseFactory(false);
        org.mockito.cglib.proxy.Enhancer enhancer20 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy21 = enhancer20.getStrategy();
        enhancer20.setSerialVersionUID((java.lang.Long) 0L);
        enhancer20.setUseFactory(false);
        org.mockito.cglib.proxy.Enhancer enhancer26 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy27 = enhancer26.getStrategy();
        java.lang.Class<?> wildcardClass28 = enhancer26.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer29 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy30 = enhancer29.getStrategy();
        java.lang.Class<?> wildcardClass31 = enhancer29.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer32 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy33 = enhancer32.getStrategy();
        java.lang.Class<?> wildcardClass34 = enhancer32.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer35 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy36 = enhancer35.getStrategy();
        java.lang.Class<?> wildcardClass37 = enhancer35.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer38 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy39 = enhancer38.getStrategy();
        java.lang.Class<?> wildcardClass40 = enhancer38.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer41 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy42 = enhancer41.getStrategy();
        java.lang.Class<?> wildcardClass43 = enhancer41.getClass();
        java.lang.Class[] classArray44 = new java.lang.Class[] { wildcardClass28, wildcardClass31, wildcardClass34, wildcardClass37, wildcardClass40, wildcardClass43 };
        enhancer20.setInterfaces(classArray44);
        org.mockito.cglib.core.NamingPolicy namingPolicy46 = enhancer20.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy47 = enhancer20.getNamingPolicy();
        enhancer11.setNamingPolicy(namingPolicy47);
        enhancer0.setNamingPolicy(namingPolicy47);
        org.mockito.cglib.proxy.Enhancer enhancer50 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class51 = null;
        enhancer50.setSuperclass(class51);
        org.mockito.cglib.core.NamingPolicy namingPolicy53 = enhancer50.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer54 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy55 = enhancer54.getStrategy();
        enhancer54.setSerialVersionUID((java.lang.Long) 0L);
        enhancer54.setUseFactory(false);
        java.lang.Class<?> wildcardClass60 = enhancer54.getClass();
        enhancer50.setSuperclass((java.lang.Class) wildcardClass60);
        org.mockito.cglib.proxy.Callback callback62 = null;
        enhancer50.setCallback(callback62);
        org.mockito.cglib.proxy.Callback callback64 = null;
        enhancer50.setCallback(callback64);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy66 = enhancer50.getStrategy();
        java.lang.ClassLoader classLoader67 = enhancer50.getClassLoader();
        enhancer0.setClassLoader(classLoader67);
        org.junit.Assert.assertNotNull(generatorStrategy21);
        org.junit.Assert.assertNotNull(generatorStrategy27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(generatorStrategy30);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(generatorStrategy33);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(generatorStrategy36);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(generatorStrategy39);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(generatorStrategy42);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(classArray44);
        org.junit.Assert.assertNotNull(namingPolicy46);
        org.junit.Assert.assertNotNull(namingPolicy47);
        org.junit.Assert.assertNotNull(namingPolicy53);
        org.junit.Assert.assertNotNull(generatorStrategy55);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(generatorStrategy66);
        org.junit.Assert.assertNotNull(classLoader67);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        enhancer0.setUseCache(true);
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class7 = null;
        enhancer6.setSuperclass(class7);
        org.mockito.cglib.core.NamingPolicy namingPolicy9 = enhancer6.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer10 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = enhancer10.getStrategy();
        enhancer6.setStrategy(generatorStrategy11);
        enhancer0.setStrategy(generatorStrategy11);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter14 = null;
        enhancer0.setCallbackFilter(callbackFilter14);
        boolean boolean16 = enhancer0.getUseCache();
        enhancer0.setUseFactory(true);
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(namingPolicy9);
        org.junit.Assert.assertNotNull(generatorStrategy11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        enhancer0.setUseCache(true);
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = enhancer6.getStrategy();
        enhancer6.setSerialVersionUID((java.lang.Long) 0L);
        enhancer6.setAttemptLoad(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = enhancer6.getStrategy();
        enhancer0.setStrategy(generatorStrategy12);
        enhancer0.setUseCache(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer17 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy18 = enhancer17.getStrategy();
        enhancer17.setSerialVersionUID((java.lang.Long) 0L);
        enhancer17.setUseFactory(false);
        org.mockito.cglib.proxy.Enhancer enhancer23 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy24 = enhancer23.getStrategy();
        java.lang.Class<?> wildcardClass25 = enhancer23.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer26 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy27 = enhancer26.getStrategy();
        java.lang.Class<?> wildcardClass28 = enhancer26.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer29 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy30 = enhancer29.getStrategy();
        java.lang.Class<?> wildcardClass31 = enhancer29.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer32 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy33 = enhancer32.getStrategy();
        java.lang.Class<?> wildcardClass34 = enhancer32.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer35 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy36 = enhancer35.getStrategy();
        java.lang.Class<?> wildcardClass37 = enhancer35.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer38 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy39 = enhancer38.getStrategy();
        java.lang.Class<?> wildcardClass40 = enhancer38.getClass();
        java.lang.Class[] classArray41 = new java.lang.Class[] { wildcardClass25, wildcardClass28, wildcardClass31, wildcardClass34, wildcardClass37, wildcardClass40 };
        enhancer17.setInterfaces(classArray41);
        org.mockito.cglib.proxy.Callback callback43 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray44 = new org.mockito.cglib.proxy.Callback[] { callback43 };
        enhancer17.setCallbacks(callbackArray44);
        enhancer0.setCallbacks(callbackArray44);
        enhancer0.setInterceptDuringConstruction(false);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter49 = null;
        enhancer0.setCallbackFilter(callbackFilter49);
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(generatorStrategy7);
        org.junit.Assert.assertNotNull(generatorStrategy12);
        org.junit.Assert.assertNotNull(generatorStrategy16);
        org.junit.Assert.assertNotNull(generatorStrategy18);
        org.junit.Assert.assertNotNull(generatorStrategy24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(generatorStrategy27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(generatorStrategy30);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(generatorStrategy33);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(generatorStrategy36);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(generatorStrategy39);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(classArray41);
        org.junit.Assert.assertNotNull(callbackArray44);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        java.lang.ClassLoader classLoader2 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter3 = null;
        enhancer0.setCallbackFilter(callbackFilter3);
        java.lang.ClassLoader classLoader5 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.Callback callback6 = null;
        enhancer0.setCallback(callback6);
        boolean boolean8 = enhancer0.getUseCache();
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(classLoader2);
        org.junit.Assert.assertNotNull(classLoader5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class1 = null;
        enhancer0.setSuperclass(class1);
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = enhancer0.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer4 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer4.getStrategy();
        enhancer4.setSerialVersionUID((java.lang.Long) 0L);
        enhancer4.setUseFactory(false);
        java.lang.Class<?> wildcardClass10 = enhancer4.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass10);
        org.mockito.cglib.proxy.Callback callback12 = null;
        enhancer0.setCallback(callback12);
        enhancer0.setAttemptLoad(false);
        enhancer0.setInterceptDuringConstruction(false);
        org.mockito.cglib.proxy.Enhancer enhancer18 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy19 = enhancer18.getStrategy();
        enhancer18.setSerialVersionUID((java.lang.Long) 0L);
        enhancer18.setUseFactory(false);
        org.mockito.cglib.proxy.Enhancer enhancer24 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class25 = null;
        enhancer24.setSuperclass(class25);
        java.lang.ClassLoader classLoader27 = enhancer24.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer28 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class29 = null;
        enhancer28.setSuperclass(class29);
        org.mockito.cglib.core.NamingPolicy namingPolicy31 = enhancer28.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer32 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy33 = enhancer32.getStrategy();
        enhancer28.setStrategy(generatorStrategy33);
        enhancer24.setStrategy(generatorStrategy33);
        enhancer18.setStrategy(generatorStrategy33);
        enhancer0.setStrategy(generatorStrategy33);
        org.mockito.cglib.proxy.Callback callback38 = null;
        enhancer0.setCallback(callback38);
        org.mockito.cglib.core.NamingPolicy namingPolicy40 = enhancer0.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer41 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy42 = enhancer41.getStrategy();
        enhancer41.setSerialVersionUID((java.lang.Long) 0L);
        enhancer41.setAttemptLoad(false);
        org.mockito.cglib.proxy.Callback callback47 = null;
        enhancer41.setCallback(callback47);
        org.mockito.cglib.proxy.Enhancer enhancer49 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy50 = enhancer49.getStrategy();
        java.lang.ClassLoader classLoader51 = enhancer49.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter52 = null;
        enhancer49.setCallbackFilter(callbackFilter52);
        enhancer49.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.Callback callback56 = null;
        enhancer49.setCallback(callback56);
        org.mockito.cglib.proxy.Callback callback58 = null;
        enhancer49.setCallback(callback58);
        enhancer49.setAttemptLoad(false);
        org.mockito.cglib.proxy.Enhancer enhancer62 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class63 = null;
        enhancer62.setSuperclass(class63);
        org.mockito.cglib.proxy.Callback callback65 = null;
        enhancer62.setCallback(callback65);
        java.lang.ClassLoader classLoader67 = enhancer62.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer68 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class69 = null;
        enhancer68.setSuperclass(class69);
        enhancer68.setSerialVersionUID((java.lang.Long) (-1L));
        enhancer68.setUseCache(false);
        org.mockito.cglib.proxy.Enhancer enhancer75 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class76 = null;
        enhancer75.setSuperclass(class76);
        enhancer75.setSerialVersionUID((java.lang.Long) (-1L));
        java.lang.ClassLoader classLoader80 = enhancer75.getClassLoader();
        enhancer68.setClassLoader(classLoader80);
        enhancer62.setClassLoader(classLoader80);
        enhancer49.setClassLoader(classLoader80);
        enhancer41.setClassLoader(classLoader80);
        enhancer0.setClassLoader(classLoader80);
        enhancer0.setUseCache(false);
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(generatorStrategy19);
        org.junit.Assert.assertNotNull(classLoader27);
        org.junit.Assert.assertNotNull(namingPolicy31);
        org.junit.Assert.assertNotNull(generatorStrategy33);
        org.junit.Assert.assertNotNull(namingPolicy40);
        org.junit.Assert.assertNotNull(generatorStrategy42);
        org.junit.Assert.assertNotNull(generatorStrategy50);
        org.junit.Assert.assertNotNull(classLoader51);
        org.junit.Assert.assertNotNull(classLoader67);
        org.junit.Assert.assertNotNull(classLoader80);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class1 = null;
        enhancer0.setSuperclass(class1);
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = enhancer0.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer4 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer4.getStrategy();
        enhancer0.setStrategy(generatorStrategy5);
        boolean boolean7 = enhancer0.getUseCache();
        enhancer0.setAttemptLoad(true);
        boolean boolean10 = enhancer0.getUseCache();
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.generateClass(classVisitor11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class1 = null;
        enhancer0.setSuperclass(class1);
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = enhancer0.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer4 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer4.getStrategy();
        enhancer0.setStrategy(generatorStrategy5);
        enhancer0.setUseFactory(true);
        org.mockito.cglib.proxy.Enhancer enhancer9 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class10 = null;
        enhancer9.setSuperclass(class10);
        org.mockito.cglib.core.NamingPolicy namingPolicy12 = enhancer9.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer13 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy14 = enhancer13.getStrategy();
        enhancer13.setSerialVersionUID((java.lang.Long) 0L);
        enhancer13.setUseFactory(false);
        java.lang.Class<?> wildcardClass19 = enhancer13.getClass();
        enhancer9.setSuperclass((java.lang.Class) wildcardClass19);
        enhancer0.setSuperclass((java.lang.Class) wildcardClass19);
        boolean boolean22 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass19);
        org.mockito.cglib.proxy.Callback callback23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass19, callback23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(namingPolicy12);
        org.junit.Assert.assertNotNull(generatorStrategy14);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        java.lang.ClassLoader classLoader2 = enhancer0.getClassLoader();
        enhancer0.setUseFactory(true);
        org.mockito.cglib.proxy.Enhancer enhancer5 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = enhancer5.getStrategy();
        enhancer5.setSerialVersionUID((java.lang.Long) 0L);
        enhancer5.setAttemptLoad(false);
        org.mockito.cglib.proxy.Enhancer enhancer11 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = enhancer11.getStrategy();
        java.lang.Class<?> wildcardClass13 = enhancer11.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer14 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy15 = enhancer14.getStrategy();
        java.lang.Class<?> wildcardClass16 = enhancer14.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer17 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy18 = enhancer17.getStrategy();
        enhancer17.setSerialVersionUID((java.lang.Long) 0L);
        enhancer17.setUseFactory(false);
        java.lang.Class<?> wildcardClass23 = enhancer17.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer24 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy25 = enhancer24.getStrategy();
        enhancer24.setSerialVersionUID((java.lang.Long) 0L);
        enhancer24.setUseFactory(false);
        java.lang.Class<?> wildcardClass30 = enhancer24.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer31 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class32 = null;
        enhancer31.setSuperclass(class32);
        java.lang.ClassLoader classLoader34 = enhancer31.getClassLoader();
        java.lang.Class<?> wildcardClass35 = enhancer31.getClass();
        java.lang.Class[] classArray36 = new java.lang.Class[] { wildcardClass13, wildcardClass16, wildcardClass23, wildcardClass30, wildcardClass35 };
        enhancer5.setInterfaces(classArray36);
        java.lang.Class<?> wildcardClass38 = enhancer5.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass38);
        org.mockito.cglib.proxy.Enhancer enhancer40 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy41 = enhancer40.getStrategy();
        enhancer40.setSerialVersionUID((java.lang.Long) 0L);
        enhancer40.setUseFactory(false);
        org.mockito.cglib.proxy.Enhancer enhancer46 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy47 = enhancer46.getStrategy();
        java.lang.Class<?> wildcardClass48 = enhancer46.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer49 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy50 = enhancer49.getStrategy();
        java.lang.Class<?> wildcardClass51 = enhancer49.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer52 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy53 = enhancer52.getStrategy();
        java.lang.Class<?> wildcardClass54 = enhancer52.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer55 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy56 = enhancer55.getStrategy();
        java.lang.Class<?> wildcardClass57 = enhancer55.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer58 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy59 = enhancer58.getStrategy();
        java.lang.Class<?> wildcardClass60 = enhancer58.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer61 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy62 = enhancer61.getStrategy();
        java.lang.Class<?> wildcardClass63 = enhancer61.getClass();
        java.lang.Class[] classArray64 = new java.lang.Class[] { wildcardClass48, wildcardClass51, wildcardClass54, wildcardClass57, wildcardClass60, wildcardClass63 };
        enhancer40.setInterfaces(classArray64);
        enhancer0.setInterfaces(classArray64);
        enhancer0.setUseFactory(true);
        enhancer0.setUseFactory(true);
        java.lang.ClassLoader classLoader71 = enhancer0.getClassLoader();
        enhancer0.setSerialVersionUID((java.lang.Long) 10L);
        enhancer0.setSerialVersionUID((java.lang.Long) 1L);
        enhancer0.setSerialVersionUID((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(classLoader2);
        org.junit.Assert.assertNotNull(generatorStrategy6);
        org.junit.Assert.assertNotNull(generatorStrategy12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(generatorStrategy15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(generatorStrategy18);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(generatorStrategy25);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(classLoader34);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(classArray36);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(generatorStrategy41);
        org.junit.Assert.assertNotNull(generatorStrategy47);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(generatorStrategy50);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(generatorStrategy53);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(generatorStrategy56);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(generatorStrategy59);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(generatorStrategy62);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(classArray64);
        org.junit.Assert.assertNotNull(classLoader71);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class1 = null;
        enhancer0.setSuperclass(class1);
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = enhancer0.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer4 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer4.getStrategy();
        enhancer4.setSerialVersionUID((java.lang.Long) 0L);
        enhancer4.setUseFactory(false);
        java.lang.Class<?> wildcardClass10 = enhancer4.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass10);
        org.mockito.cglib.proxy.Enhancer enhancer12 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class13 = null;
        enhancer12.setSuperclass(class13);
        org.mockito.cglib.core.NamingPolicy namingPolicy15 = enhancer12.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer16 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy17 = enhancer16.getStrategy();
        enhancer16.setSerialVersionUID((java.lang.Long) 0L);
        enhancer16.setUseFactory(false);
        java.lang.Class<?> wildcardClass22 = enhancer16.getClass();
        enhancer12.setSuperclass((java.lang.Class) wildcardClass22);
        org.mockito.cglib.proxy.Callback callback24 = null;
        enhancer12.setCallback(callback24);
        org.mockito.cglib.proxy.Callback callback26 = null;
        enhancer12.setCallback(callback26);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy28 = enhancer12.getStrategy();
        enhancer0.setStrategy(generatorStrategy28);
        enhancer0.setUseCache(false);
        enhancer0.setUseCache(true);
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(namingPolicy15);
        org.junit.Assert.assertNotNull(generatorStrategy17);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(generatorStrategy28);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.core.NamingPolicy namingPolicy4 = enhancer0.getNamingPolicy();
        enhancer0.setSerialVersionUID((java.lang.Long) 10L);
        enhancer0.setUseFactory(false);
        enhancer0.setUseFactory(false);
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = enhancer0.create();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callbacks are required");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(namingPolicy4);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class1 = null;
        enhancer0.setSuperclass(class1);
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = enhancer0.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer4 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer4.getStrategy();
        enhancer4.setSerialVersionUID((java.lang.Long) 0L);
        enhancer4.setUseFactory(false);
        java.lang.Class<?> wildcardClass10 = enhancer4.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass10);
        org.mockito.cglib.proxy.Callback callback12 = null;
        enhancer0.setCallback(callback12);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy14 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer15 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = enhancer15.getStrategy();
        enhancer15.setSerialVersionUID((java.lang.Long) 0L);
        enhancer15.setUseFactory(false);
        org.mockito.cglib.proxy.Enhancer enhancer21 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy22 = enhancer21.getStrategy();
        java.lang.Class<?> wildcardClass23 = enhancer21.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer24 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy25 = enhancer24.getStrategy();
        java.lang.Class<?> wildcardClass26 = enhancer24.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer27 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy28 = enhancer27.getStrategy();
        java.lang.Class<?> wildcardClass29 = enhancer27.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer30 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy31 = enhancer30.getStrategy();
        java.lang.Class<?> wildcardClass32 = enhancer30.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer33 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy34 = enhancer33.getStrategy();
        java.lang.Class<?> wildcardClass35 = enhancer33.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer36 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy37 = enhancer36.getStrategy();
        java.lang.Class<?> wildcardClass38 = enhancer36.getClass();
        java.lang.Class[] classArray39 = new java.lang.Class[] { wildcardClass23, wildcardClass26, wildcardClass29, wildcardClass32, wildcardClass35, wildcardClass38 };
        enhancer15.setInterfaces(classArray39);
        enhancer0.setInterfaces(classArray39);
        enhancer0.setInterceptDuringConstruction(false);
        enhancer0.setInterceptDuringConstruction(true);
        boolean boolean46 = enhancer0.getUseCache();
        org.mockito.cglib.proxy.Enhancer enhancer47 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy48 = enhancer47.getStrategy();
        enhancer47.setSerialVersionUID((java.lang.Long) 0L);
        enhancer47.setAttemptLoad(false);
        org.mockito.cglib.proxy.Enhancer enhancer53 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy54 = enhancer53.getStrategy();
        java.lang.Class<?> wildcardClass55 = enhancer53.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer56 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy57 = enhancer56.getStrategy();
        java.lang.Class<?> wildcardClass58 = enhancer56.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer59 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy60 = enhancer59.getStrategy();
        enhancer59.setSerialVersionUID((java.lang.Long) 0L);
        enhancer59.setUseFactory(false);
        java.lang.Class<?> wildcardClass65 = enhancer59.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer66 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy67 = enhancer66.getStrategy();
        enhancer66.setSerialVersionUID((java.lang.Long) 0L);
        enhancer66.setUseFactory(false);
        java.lang.Class<?> wildcardClass72 = enhancer66.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer73 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class74 = null;
        enhancer73.setSuperclass(class74);
        java.lang.ClassLoader classLoader76 = enhancer73.getClassLoader();
        java.lang.Class<?> wildcardClass77 = enhancer73.getClass();
        java.lang.Class[] classArray78 = new java.lang.Class[] { wildcardClass55, wildcardClass58, wildcardClass65, wildcardClass72, wildcardClass77 };
        enhancer47.setInterfaces(classArray78);
        org.mockito.cglib.core.NamingPolicy namingPolicy80 = enhancer47.getNamingPolicy();
        java.lang.Class[] classArray81 = null;
        enhancer47.setInterfaces(classArray81);
        org.mockito.cglib.proxy.Enhancer enhancer83 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy84 = enhancer83.getNamingPolicy();
        enhancer47.setNamingPolicy(namingPolicy84);
        java.lang.Class<?> wildcardClass86 = enhancer47.getClass();
        boolean boolean87 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass86);
        enhancer0.setSuperclass((java.lang.Class) wildcardClass86);
        org.mockito.asm.ClassVisitor classVisitor89 = null;
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.generateClass(classVisitor89);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(generatorStrategy14);
        org.junit.Assert.assertNotNull(generatorStrategy16);
        org.junit.Assert.assertNotNull(generatorStrategy22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(generatorStrategy25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(generatorStrategy28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(generatorStrategy31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(generatorStrategy34);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(generatorStrategy37);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(classArray39);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(generatorStrategy48);
        org.junit.Assert.assertNotNull(generatorStrategy54);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(generatorStrategy57);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNotNull(generatorStrategy60);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertNotNull(generatorStrategy67);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertNotNull(classLoader76);
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertNotNull(classArray78);
        org.junit.Assert.assertNotNull(namingPolicy80);
        org.junit.Assert.assertNotNull(namingPolicy84);
        org.junit.Assert.assertNotNull(wildcardClass86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        enhancer0.setUseCache(true);
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class7 = null;
        enhancer6.setSuperclass(class7);
        org.mockito.cglib.core.NamingPolicy namingPolicy9 = enhancer6.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer10 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = enhancer10.getStrategy();
        enhancer6.setStrategy(generatorStrategy11);
        enhancer0.setStrategy(generatorStrategy11);
        java.lang.ClassLoader classLoader14 = enhancer0.getClassLoader();
        enhancer0.setUseFactory(true);
        org.mockito.cglib.proxy.Enhancer enhancer17 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy18 = enhancer17.getStrategy();
        enhancer17.setSerialVersionUID((java.lang.Long) 0L);
        enhancer17.setAttemptLoad(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy23 = enhancer17.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer24 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy25 = enhancer24.getStrategy();
        enhancer24.setSerialVersionUID((java.lang.Long) 0L);
        enhancer24.setUseCache(true);
        org.mockito.cglib.proxy.Enhancer enhancer30 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy31 = enhancer30.getStrategy();
        enhancer30.setSerialVersionUID((java.lang.Long) 0L);
        enhancer30.setAttemptLoad(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy36 = enhancer30.getStrategy();
        enhancer24.setStrategy(generatorStrategy36);
        enhancer24.setUseCache(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy40 = enhancer24.getStrategy();
        enhancer17.setStrategy(generatorStrategy40);
        java.lang.Class<?> wildcardClass42 = generatorStrategy40.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass42);
        boolean boolean44 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass42);
        org.mockito.cglib.proxy.Callback callback45 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj46 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass42, callback45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(namingPolicy9);
        org.junit.Assert.assertNotNull(generatorStrategy11);
        org.junit.Assert.assertNotNull(classLoader14);
        org.junit.Assert.assertNotNull(generatorStrategy18);
        org.junit.Assert.assertNotNull(generatorStrategy23);
        org.junit.Assert.assertNotNull(generatorStrategy25);
        org.junit.Assert.assertNotNull(generatorStrategy31);
        org.junit.Assert.assertNotNull(generatorStrategy36);
        org.junit.Assert.assertNotNull(generatorStrategy40);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.proxy.Callback callback4 = null;
        enhancer0.setCallback(callback4);
        enhancer0.setUseCache(false);
        boolean boolean8 = enhancer0.getUseCache();
        enhancer0.setSerialVersionUID((java.lang.Long) 10L);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter11 = null;
        enhancer0.setCallbackFilter(callbackFilter11);
        enhancer0.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.Callback callback15 = null;
        enhancer0.setCallback(callback15);
        org.mockito.cglib.core.NamingPolicy namingPolicy17 = enhancer0.getNamingPolicy();
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(namingPolicy17);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        java.lang.ClassLoader classLoader2 = enhancer0.getClassLoader();
        enhancer0.setUseFactory(true);
        org.mockito.cglib.proxy.Enhancer enhancer5 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = enhancer5.getStrategy();
        enhancer5.setSerialVersionUID((java.lang.Long) 0L);
        enhancer5.setAttemptLoad(false);
        org.mockito.cglib.proxy.Enhancer enhancer11 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = enhancer11.getStrategy();
        java.lang.Class<?> wildcardClass13 = enhancer11.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer14 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy15 = enhancer14.getStrategy();
        java.lang.Class<?> wildcardClass16 = enhancer14.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer17 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy18 = enhancer17.getStrategy();
        enhancer17.setSerialVersionUID((java.lang.Long) 0L);
        enhancer17.setUseFactory(false);
        java.lang.Class<?> wildcardClass23 = enhancer17.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer24 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy25 = enhancer24.getStrategy();
        enhancer24.setSerialVersionUID((java.lang.Long) 0L);
        enhancer24.setUseFactory(false);
        java.lang.Class<?> wildcardClass30 = enhancer24.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer31 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class32 = null;
        enhancer31.setSuperclass(class32);
        java.lang.ClassLoader classLoader34 = enhancer31.getClassLoader();
        java.lang.Class<?> wildcardClass35 = enhancer31.getClass();
        java.lang.Class[] classArray36 = new java.lang.Class[] { wildcardClass13, wildcardClass16, wildcardClass23, wildcardClass30, wildcardClass35 };
        enhancer5.setInterfaces(classArray36);
        java.lang.Class<?> wildcardClass38 = enhancer5.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass38);
        org.mockito.cglib.proxy.Enhancer enhancer40 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy41 = enhancer40.getStrategy();
        enhancer40.setSerialVersionUID((java.lang.Long) 0L);
        enhancer40.setUseFactory(false);
        org.mockito.cglib.proxy.Enhancer enhancer46 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy47 = enhancer46.getStrategy();
        java.lang.Class<?> wildcardClass48 = enhancer46.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer49 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy50 = enhancer49.getStrategy();
        java.lang.Class<?> wildcardClass51 = enhancer49.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer52 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy53 = enhancer52.getStrategy();
        java.lang.Class<?> wildcardClass54 = enhancer52.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer55 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy56 = enhancer55.getStrategy();
        java.lang.Class<?> wildcardClass57 = enhancer55.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer58 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy59 = enhancer58.getStrategy();
        java.lang.Class<?> wildcardClass60 = enhancer58.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer61 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy62 = enhancer61.getStrategy();
        java.lang.Class<?> wildcardClass63 = enhancer61.getClass();
        java.lang.Class[] classArray64 = new java.lang.Class[] { wildcardClass48, wildcardClass51, wildcardClass54, wildcardClass57, wildcardClass60, wildcardClass63 };
        enhancer40.setInterfaces(classArray64);
        enhancer0.setInterfaces(classArray64);
        enhancer0.setUseCache(true);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter69 = null;
        enhancer0.setCallbackFilter(callbackFilter69);
        boolean boolean71 = enhancer0.getAttemptLoad();
        org.mockito.cglib.proxy.Callback callback72 = null;
        enhancer0.setCallback(callback72);
        boolean boolean74 = enhancer0.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer75 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class76 = null;
        enhancer75.setSuperclass(class76);
        enhancer75.setSerialVersionUID((java.lang.Long) (-1L));
        java.lang.ClassLoader classLoader80 = enhancer75.getClassLoader();
        java.lang.Class class81 = null;
        enhancer75.setSuperclass(class81);
        enhancer75.setAttemptLoad(true);
        org.mockito.cglib.proxy.Callback callback85 = null;
        enhancer75.setCallback(callback85);
        org.mockito.cglib.proxy.Callback callback87 = null;
        enhancer75.setCallback(callback87);
        org.mockito.cglib.proxy.Enhancer enhancer89 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy90 = enhancer89.getStrategy();
        enhancer89.setSerialVersionUID((java.lang.Long) 0L);
        enhancer89.setAttemptLoad(false);
        java.lang.ClassLoader classLoader95 = enhancer89.getClassLoader();
        enhancer75.setClassLoader(classLoader95);
        enhancer0.setClassLoader(classLoader95);
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(classLoader2);
        org.junit.Assert.assertNotNull(generatorStrategy6);
        org.junit.Assert.assertNotNull(generatorStrategy12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(generatorStrategy15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(generatorStrategy18);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(generatorStrategy25);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(classLoader34);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(classArray36);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(generatorStrategy41);
        org.junit.Assert.assertNotNull(generatorStrategy47);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(generatorStrategy50);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(generatorStrategy53);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(generatorStrategy56);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(generatorStrategy59);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(generatorStrategy62);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(classArray64);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(classLoader80);
        org.junit.Assert.assertNotNull(generatorStrategy90);
        org.junit.Assert.assertNotNull(classLoader95);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.core.NamingPolicy namingPolicy4 = enhancer0.getNamingPolicy();
        enhancer0.setSerialVersionUID((java.lang.Long) 10L);
        enhancer0.setUseFactory(false);
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.proxy.Enhancer enhancer11 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class12 = null;
        enhancer11.setSuperclass(class12);
        org.mockito.cglib.core.NamingPolicy namingPolicy14 = enhancer11.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer15 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = enhancer15.getStrategy();
        enhancer15.setSerialVersionUID((java.lang.Long) 0L);
        enhancer15.setUseFactory(false);
        java.lang.Class<?> wildcardClass21 = enhancer15.getClass();
        enhancer11.setSuperclass((java.lang.Class) wildcardClass21);
        org.mockito.cglib.proxy.Callback callback23 = null;
        enhancer11.setCallback(callback23);
        enhancer11.setUseCache(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy27 = enhancer11.getNamingPolicy();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter28 = null;
        enhancer11.setCallbackFilter(callbackFilter28);
        enhancer11.setUseFactory(false);
        org.mockito.cglib.proxy.Enhancer enhancer32 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy33 = enhancer32.getStrategy();
        enhancer32.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.proxy.Callback callback36 = null;
        enhancer32.setCallback(callback36);
        java.lang.Class<?> wildcardClass38 = enhancer32.getClass();
        enhancer11.setSuperclass((java.lang.Class) wildcardClass38);
        enhancer0.setSuperclass((java.lang.Class) wildcardClass38);
        boolean boolean41 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass38);
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(namingPolicy4);
        org.junit.Assert.assertNotNull(namingPolicy14);
        org.junit.Assert.assertNotNull(generatorStrategy16);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(namingPolicy27);
        org.junit.Assert.assertNotNull(generatorStrategy33);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Callback callback1 = null;
        enhancer0.setCallback(callback1);
        enhancer0.setUseCache(false);
        enhancer0.setSerialVersionUID((java.lang.Long) 100L);
        enhancer0.setUseFactory(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter10 = null;
        enhancer0.setCallbackFilter(callbackFilter10);
        org.junit.Assert.assertNotNull(generatorStrategy9);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class1 = null;
        enhancer0.setSuperclass(class1);
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = enhancer0.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer4 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer4.getStrategy();
        enhancer0.setStrategy(generatorStrategy5);
        boolean boolean7 = enhancer0.getUseCache();
        enhancer0.setAttemptLoad(true);
        enhancer0.setSerialVersionUID((java.lang.Long) 1L);
        org.mockito.cglib.proxy.Callback callback12 = null;
        enhancer0.setCallback(callback12);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter14 = null;
        enhancer0.setCallbackFilter(callbackFilter14);
        org.mockito.cglib.core.NamingPolicy namingPolicy16 = enhancer0.getNamingPolicy();
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(namingPolicy16);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        java.lang.Class class0 = null;
        org.mockito.cglib.proxy.Enhancer enhancer1 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = enhancer1.getStrategy();
        enhancer1.setSerialVersionUID((java.lang.Long) 0L);
        enhancer1.setUseCache(true);
        org.mockito.cglib.proxy.Enhancer enhancer7 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class8 = null;
        enhancer7.setSuperclass(class8);
        org.mockito.cglib.core.NamingPolicy namingPolicy10 = enhancer7.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer11 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = enhancer11.getStrategy();
        enhancer7.setStrategy(generatorStrategy12);
        enhancer1.setStrategy(generatorStrategy12);
        org.mockito.cglib.proxy.Enhancer enhancer15 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = enhancer15.getStrategy();
        java.lang.Class<?> wildcardClass17 = enhancer15.getClass();
        boolean boolean18 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass17);
        enhancer1.setSuperclass((java.lang.Class) wildcardClass17);
        enhancer1.setAttemptLoad(true);
        boolean boolean22 = enhancer1.getUseCache();
        org.mockito.cglib.proxy.Enhancer enhancer23 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy24 = enhancer23.getStrategy();
        enhancer23.setAttemptLoad(false);
        org.mockito.cglib.proxy.Callback callback27 = null;
        enhancer23.setCallback(callback27);
        org.mockito.cglib.proxy.Enhancer enhancer29 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class30 = null;
        enhancer29.setSuperclass(class30);
        org.mockito.cglib.core.NamingPolicy namingPolicy32 = enhancer29.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer33 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy34 = enhancer33.getStrategy();
        enhancer33.setSerialVersionUID((java.lang.Long) 0L);
        enhancer33.setUseFactory(false);
        java.lang.Class<?> wildcardClass39 = enhancer33.getClass();
        enhancer29.setSuperclass((java.lang.Class) wildcardClass39);
        org.mockito.cglib.proxy.Callback callback41 = null;
        enhancer29.setCallback(callback41);
        org.mockito.cglib.proxy.Callback callback43 = null;
        enhancer29.setCallback(callback43);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter45 = null;
        enhancer29.setCallbackFilter(callbackFilter45);
        org.mockito.cglib.proxy.Enhancer enhancer47 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy48 = enhancer47.getStrategy();
        enhancer47.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy51 = enhancer47.getStrategy();
        enhancer29.setStrategy(generatorStrategy51);
        org.mockito.cglib.proxy.Enhancer enhancer53 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class54 = null;
        enhancer53.setSuperclass(class54);
        org.mockito.cglib.core.NamingPolicy namingPolicy56 = enhancer53.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer57 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy58 = enhancer57.getStrategy();
        enhancer57.setSerialVersionUID((java.lang.Long) 0L);
        enhancer57.setUseFactory(false);
        java.lang.Class<?> wildcardClass63 = enhancer57.getClass();
        enhancer53.setSuperclass((java.lang.Class) wildcardClass63);
        org.mockito.cglib.proxy.Callback callback65 = null;
        enhancer53.setCallback(callback65);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy67 = enhancer53.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer68 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy69 = enhancer68.getStrategy();
        enhancer68.setSerialVersionUID((java.lang.Long) 0L);
        enhancer68.setUseFactory(false);
        org.mockito.cglib.proxy.Enhancer enhancer74 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy75 = enhancer74.getStrategy();
        java.lang.Class<?> wildcardClass76 = enhancer74.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer77 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy78 = enhancer77.getStrategy();
        java.lang.Class<?> wildcardClass79 = enhancer77.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer80 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy81 = enhancer80.getStrategy();
        java.lang.Class<?> wildcardClass82 = enhancer80.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer83 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy84 = enhancer83.getStrategy();
        java.lang.Class<?> wildcardClass85 = enhancer83.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer86 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy87 = enhancer86.getStrategy();
        java.lang.Class<?> wildcardClass88 = enhancer86.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer89 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy90 = enhancer89.getStrategy();
        java.lang.Class<?> wildcardClass91 = enhancer89.getClass();
        java.lang.Class[] classArray92 = new java.lang.Class[] { wildcardClass76, wildcardClass79, wildcardClass82, wildcardClass85, wildcardClass88, wildcardClass91 };
        enhancer68.setInterfaces(classArray92);
        enhancer53.setInterfaces(classArray92);
        enhancer29.setInterfaces(classArray92);
        enhancer23.setInterfaces(classArray92);
        enhancer1.setInterfaces(classArray92);
        java.util.List list98 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.getMethods(class0, classArray92, list98);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(generatorStrategy2);
        org.junit.Assert.assertNotNull(namingPolicy10);
        org.junit.Assert.assertNotNull(generatorStrategy12);
        org.junit.Assert.assertNotNull(generatorStrategy16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(generatorStrategy24);
        org.junit.Assert.assertNotNull(namingPolicy32);
        org.junit.Assert.assertNotNull(generatorStrategy34);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(generatorStrategy48);
        org.junit.Assert.assertNotNull(generatorStrategy51);
        org.junit.Assert.assertNotNull(namingPolicy56);
        org.junit.Assert.assertNotNull(generatorStrategy58);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(generatorStrategy67);
        org.junit.Assert.assertNotNull(generatorStrategy69);
        org.junit.Assert.assertNotNull(generatorStrategy75);
        org.junit.Assert.assertNotNull(wildcardClass76);
        org.junit.Assert.assertNotNull(generatorStrategy78);
        org.junit.Assert.assertNotNull(wildcardClass79);
        org.junit.Assert.assertNotNull(generatorStrategy81);
        org.junit.Assert.assertNotNull(wildcardClass82);
        org.junit.Assert.assertNotNull(generatorStrategy84);
        org.junit.Assert.assertNotNull(wildcardClass85);
        org.junit.Assert.assertNotNull(generatorStrategy87);
        org.junit.Assert.assertNotNull(wildcardClass88);
        org.junit.Assert.assertNotNull(generatorStrategy90);
        org.junit.Assert.assertNotNull(wildcardClass91);
        org.junit.Assert.assertNotNull(classArray92);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setUseCache(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer4 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer4.getStrategy();
        enhancer4.setSerialVersionUID((java.lang.Long) 0L);
        enhancer4.setUseCache(true);
        org.mockito.cglib.proxy.Enhancer enhancer10 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = enhancer10.getStrategy();
        enhancer10.setSerialVersionUID((java.lang.Long) 0L);
        enhancer10.setAttemptLoad(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = enhancer10.getStrategy();
        enhancer4.setStrategy(generatorStrategy16);
        enhancer0.setStrategy(generatorStrategy16);
        enhancer0.setSerialVersionUID((java.lang.Long) 10L);
        enhancer0.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.Callback callback23 = null;
        enhancer0.setCallback(callback23);
        org.junit.Assert.assertNotNull(generatorStrategy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(generatorStrategy11);
        org.junit.Assert.assertNotNull(generatorStrategy16);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        java.lang.ClassLoader classLoader2 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter3 = null;
        enhancer0.setCallbackFilter(callbackFilter3);
        enhancer0.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.Callback callback7 = null;
        enhancer0.setCallback(callback7);
        java.lang.ClassLoader classLoader9 = enhancer0.getClassLoader();
        enhancer0.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback12 = null;
        enhancer0.setCallback(callback12);
        org.mockito.cglib.proxy.Enhancer enhancer14 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class15 = null;
        enhancer14.setSuperclass(class15);
        java.lang.ClassLoader classLoader17 = enhancer14.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer18 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class19 = null;
        enhancer18.setSuperclass(class19);
        org.mockito.cglib.core.NamingPolicy namingPolicy21 = enhancer18.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer22 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy23 = enhancer22.getStrategy();
        enhancer18.setStrategy(generatorStrategy23);
        enhancer14.setStrategy(generatorStrategy23);
        java.lang.ClassLoader classLoader26 = enhancer14.getClassLoader();
        enhancer14.setUseCache(true);
        org.mockito.cglib.proxy.Enhancer enhancer29 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy30 = enhancer29.getStrategy();
        boolean boolean31 = enhancer29.getUseCache();
        org.mockito.cglib.proxy.Enhancer enhancer32 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy33 = enhancer32.getStrategy();
        enhancer32.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.proxy.Callback callback36 = null;
        enhancer32.setCallback(callback36);
        enhancer32.setUseCache(false);
        boolean boolean40 = enhancer32.getUseCache();
        org.mockito.cglib.proxy.Enhancer enhancer41 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class42 = null;
        enhancer41.setSuperclass(class42);
        enhancer41.setSerialVersionUID((java.lang.Long) (-1L));
        org.mockito.cglib.proxy.Callback callback46 = null;
        enhancer41.setCallback(callback46);
        java.lang.Class<?> wildcardClass48 = enhancer41.getClass();
        enhancer32.setSuperclass((java.lang.Class) wildcardClass48);
        boolean boolean50 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass48);
        enhancer29.setSuperclass((java.lang.Class) wildcardClass48);
        org.mockito.cglib.core.NamingPolicy namingPolicy52 = enhancer29.getNamingPolicy();
        enhancer29.setAttemptLoad(true);
        java.lang.Class<?> wildcardClass55 = enhancer29.getClass();
        boolean boolean56 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass55);
        enhancer14.setSuperclass((java.lang.Class) wildcardClass55);
        enhancer0.setSuperclass((java.lang.Class) wildcardClass55);
        org.mockito.cglib.proxy.Callback callback59 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj60 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass55, callback59);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(classLoader2);
        org.junit.Assert.assertNotNull(classLoader9);
        org.junit.Assert.assertNotNull(classLoader17);
        org.junit.Assert.assertNotNull(namingPolicy21);
        org.junit.Assert.assertNotNull(generatorStrategy23);
        org.junit.Assert.assertNotNull(classLoader26);
        org.junit.Assert.assertNotNull(generatorStrategy30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(generatorStrategy33);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(namingPolicy52);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        enhancer0.setUseCache(true);
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = enhancer6.getStrategy();
        enhancer6.setSerialVersionUID((java.lang.Long) 0L);
        enhancer6.setAttemptLoad(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = enhancer6.getStrategy();
        enhancer0.setStrategy(generatorStrategy12);
        boolean boolean14 = enhancer0.getUseCache();
        enhancer0.setUseFactory(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy17 = enhancer0.getStrategy();
        enhancer0.setSerialVersionUID((java.lang.Long) 10L);
        org.mockito.cglib.proxy.Enhancer enhancer20 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class21 = null;
        enhancer20.setSuperclass(class21);
        org.mockito.cglib.core.NamingPolicy namingPolicy23 = enhancer20.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer24 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy25 = enhancer24.getStrategy();
        enhancer24.setSerialVersionUID((java.lang.Long) 0L);
        enhancer24.setUseFactory(false);
        java.lang.Class<?> wildcardClass30 = enhancer24.getClass();
        enhancer20.setSuperclass((java.lang.Class) wildcardClass30);
        org.mockito.cglib.proxy.Callback callback32 = null;
        enhancer20.setCallback(callback32);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy34 = enhancer20.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer35 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy36 = enhancer35.getStrategy();
        enhancer35.setSerialVersionUID((java.lang.Long) 0L);
        enhancer35.setUseFactory(false);
        org.mockito.cglib.proxy.Enhancer enhancer41 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy42 = enhancer41.getStrategy();
        java.lang.Class<?> wildcardClass43 = enhancer41.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer44 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy45 = enhancer44.getStrategy();
        java.lang.Class<?> wildcardClass46 = enhancer44.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer47 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy48 = enhancer47.getStrategy();
        java.lang.Class<?> wildcardClass49 = enhancer47.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer50 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy51 = enhancer50.getStrategy();
        java.lang.Class<?> wildcardClass52 = enhancer50.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer53 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy54 = enhancer53.getStrategy();
        java.lang.Class<?> wildcardClass55 = enhancer53.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer56 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy57 = enhancer56.getStrategy();
        java.lang.Class<?> wildcardClass58 = enhancer56.getClass();
        java.lang.Class[] classArray59 = new java.lang.Class[] { wildcardClass43, wildcardClass46, wildcardClass49, wildcardClass52, wildcardClass55, wildcardClass58 };
        enhancer35.setInterfaces(classArray59);
        enhancer20.setInterfaces(classArray59);
        enhancer20.setSerialVersionUID((java.lang.Long) 100L);
        org.mockito.cglib.proxy.Enhancer enhancer64 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy65 = enhancer64.getStrategy();
        enhancer64.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.proxy.Callback callback68 = null;
        enhancer64.setCallback(callback68);
        enhancer64.setUseCache(false);
        boolean boolean72 = enhancer64.getUseCache();
        org.mockito.cglib.proxy.Callback callback73 = null;
        enhancer64.setCallback(callback73);
        java.lang.Class<?> wildcardClass75 = enhancer64.getClass();
        enhancer20.setSuperclass((java.lang.Class) wildcardClass75);
        enhancer0.setSuperclass((java.lang.Class) wildcardClass75);
        boolean boolean78 = enhancer0.getUseCache();
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(generatorStrategy7);
        org.junit.Assert.assertNotNull(generatorStrategy12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(generatorStrategy17);
        org.junit.Assert.assertNotNull(namingPolicy23);
        org.junit.Assert.assertNotNull(generatorStrategy25);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(generatorStrategy34);
        org.junit.Assert.assertNotNull(generatorStrategy36);
        org.junit.Assert.assertNotNull(generatorStrategy42);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(generatorStrategy45);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(generatorStrategy48);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(generatorStrategy51);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(generatorStrategy54);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(generatorStrategy57);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNotNull(classArray59);
        org.junit.Assert.assertNotNull(generatorStrategy65);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(wildcardClass75);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        enhancer0.setUseFactory(false);
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = enhancer6.getStrategy();
        java.lang.Class<?> wildcardClass8 = enhancer6.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer9 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy10 = enhancer9.getStrategy();
        java.lang.Class<?> wildcardClass11 = enhancer9.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer12 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = enhancer12.getStrategy();
        java.lang.Class<?> wildcardClass14 = enhancer12.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer15 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = enhancer15.getStrategy();
        java.lang.Class<?> wildcardClass17 = enhancer15.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer18 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy19 = enhancer18.getStrategy();
        java.lang.Class<?> wildcardClass20 = enhancer18.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer21 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy22 = enhancer21.getStrategy();
        java.lang.Class<?> wildcardClass23 = enhancer21.getClass();
        java.lang.Class[] classArray24 = new java.lang.Class[] { wildcardClass8, wildcardClass11, wildcardClass14, wildcardClass17, wildcardClass20, wildcardClass23 };
        enhancer0.setInterfaces(classArray24);
        org.mockito.cglib.proxy.Callback callback26 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray27 = new org.mockito.cglib.proxy.Callback[] { callback26 };
        enhancer0.setCallbacks(callbackArray27);
        java.lang.ClassLoader classLoader29 = enhancer0.getClassLoader();
        enhancer0.setInterceptDuringConstruction(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy32 = enhancer0.getStrategy();
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(generatorStrategy7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(generatorStrategy10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(generatorStrategy13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(generatorStrategy16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(generatorStrategy19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(generatorStrategy22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(classArray24);
        org.junit.Assert.assertNotNull(callbackArray27);
        org.junit.Assert.assertNotNull(classLoader29);
        org.junit.Assert.assertNotNull(generatorStrategy32);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Callback callback2 = null;
        enhancer0.setCallback(callback2);
        enhancer0.setAttemptLoad(true);
        enhancer0.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy8 = enhancer0.getNamingPolicy();
        boolean boolean9 = enhancer0.getUseCache();
        enhancer0.setSerialVersionUID((java.lang.Long) 100L);
        boolean boolean12 = enhancer0.getUseCache();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter13 = null;
        enhancer0.setCallbackFilter(callbackFilter13);
        org.mockito.cglib.proxy.Enhancer enhancer15 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class16 = null;
        enhancer15.setSuperclass(class16);
        org.mockito.cglib.core.NamingPolicy namingPolicy18 = enhancer15.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer19 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy20 = enhancer19.getStrategy();
        enhancer19.setSerialVersionUID((java.lang.Long) 0L);
        enhancer19.setUseFactory(false);
        java.lang.Class<?> wildcardClass25 = enhancer19.getClass();
        enhancer15.setSuperclass((java.lang.Class) wildcardClass25);
        org.mockito.cglib.proxy.Callback callback27 = null;
        enhancer15.setCallback(callback27);
        org.mockito.cglib.proxy.Callback callback29 = null;
        enhancer15.setCallback(callback29);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter31 = null;
        enhancer15.setCallbackFilter(callbackFilter31);
        org.mockito.cglib.proxy.Enhancer enhancer33 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy34 = enhancer33.getStrategy();
        enhancer33.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy37 = enhancer33.getStrategy();
        enhancer15.setStrategy(generatorStrategy37);
        org.mockito.cglib.proxy.Enhancer enhancer39 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class40 = null;
        enhancer39.setSuperclass(class40);
        org.mockito.cglib.core.NamingPolicy namingPolicy42 = enhancer39.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer43 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy44 = enhancer43.getStrategy();
        enhancer43.setSerialVersionUID((java.lang.Long) 0L);
        enhancer43.setUseFactory(false);
        java.lang.Class<?> wildcardClass49 = enhancer43.getClass();
        enhancer39.setSuperclass((java.lang.Class) wildcardClass49);
        org.mockito.cglib.proxy.Callback callback51 = null;
        enhancer39.setCallback(callback51);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy53 = enhancer39.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer54 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy55 = enhancer54.getStrategy();
        enhancer54.setSerialVersionUID((java.lang.Long) 0L);
        enhancer54.setUseFactory(false);
        org.mockito.cglib.proxy.Enhancer enhancer60 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy61 = enhancer60.getStrategy();
        java.lang.Class<?> wildcardClass62 = enhancer60.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer63 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy64 = enhancer63.getStrategy();
        java.lang.Class<?> wildcardClass65 = enhancer63.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer66 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy67 = enhancer66.getStrategy();
        java.lang.Class<?> wildcardClass68 = enhancer66.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer69 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy70 = enhancer69.getStrategy();
        java.lang.Class<?> wildcardClass71 = enhancer69.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer72 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy73 = enhancer72.getStrategy();
        java.lang.Class<?> wildcardClass74 = enhancer72.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer75 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy76 = enhancer75.getStrategy();
        java.lang.Class<?> wildcardClass77 = enhancer75.getClass();
        java.lang.Class[] classArray78 = new java.lang.Class[] { wildcardClass62, wildcardClass65, wildcardClass68, wildcardClass71, wildcardClass74, wildcardClass77 };
        enhancer54.setInterfaces(classArray78);
        enhancer39.setInterfaces(classArray78);
        enhancer15.setInterfaces(classArray78);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackTypes(classArray78);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown callback type class org.mockito.cglib.proxy.Enhancer");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(namingPolicy8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(namingPolicy18);
        org.junit.Assert.assertNotNull(generatorStrategy20);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(generatorStrategy34);
        org.junit.Assert.assertNotNull(generatorStrategy37);
        org.junit.Assert.assertNotNull(namingPolicy42);
        org.junit.Assert.assertNotNull(generatorStrategy44);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(generatorStrategy53);
        org.junit.Assert.assertNotNull(generatorStrategy55);
        org.junit.Assert.assertNotNull(generatorStrategy61);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertNotNull(generatorStrategy64);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertNotNull(generatorStrategy67);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertNotNull(generatorStrategy70);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertNotNull(generatorStrategy73);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertNotNull(generatorStrategy76);
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertNotNull(classArray78);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.core.NamingPolicy namingPolicy4 = enhancer0.getNamingPolicy();
        boolean boolean5 = enhancer0.getAttemptLoad();
        java.lang.ClassLoader classLoader6 = enhancer0.getClassLoader();
        org.mockito.cglib.core.NamingPolicy namingPolicy7 = enhancer0.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer8 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = enhancer8.getStrategy();
        java.lang.ClassLoader classLoader10 = enhancer8.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter11 = null;
        enhancer8.setCallbackFilter(callbackFilter11);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = enhancer8.getStrategy();
        boolean boolean14 = enhancer8.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer15 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class16 = null;
        enhancer15.setSuperclass(class16);
        org.mockito.cglib.core.NamingPolicy namingPolicy18 = enhancer15.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer19 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy20 = enhancer19.getStrategy();
        enhancer19.setSerialVersionUID((java.lang.Long) 0L);
        enhancer19.setUseFactory(false);
        java.lang.Class<?> wildcardClass25 = enhancer19.getClass();
        enhancer15.setSuperclass((java.lang.Class) wildcardClass25);
        org.mockito.cglib.proxy.Callback callback27 = null;
        enhancer15.setCallback(callback27);
        org.mockito.cglib.proxy.Enhancer enhancer29 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy30 = enhancer29.getStrategy();
        java.lang.ClassLoader classLoader31 = enhancer29.getClassLoader();
        enhancer15.setClassLoader(classLoader31);
        enhancer15.setSerialVersionUID((java.lang.Long) 0L);
        enhancer15.setSerialVersionUID((java.lang.Long) (-1L));
        org.mockito.cglib.core.NamingPolicy namingPolicy37 = enhancer15.getNamingPolicy();
        org.mockito.cglib.proxy.Callback callback38 = null;
        enhancer15.setCallback(callback38);
        java.lang.ClassLoader classLoader40 = enhancer15.getClassLoader();
        java.lang.ClassLoader classLoader41 = enhancer15.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer42 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class43 = null;
        enhancer42.setSuperclass(class43);
        org.mockito.cglib.core.NamingPolicy namingPolicy45 = enhancer42.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer46 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy47 = enhancer46.getStrategy();
        enhancer46.setSerialVersionUID((java.lang.Long) 0L);
        enhancer46.setUseFactory(false);
        java.lang.Class<?> wildcardClass52 = enhancer46.getClass();
        enhancer42.setSuperclass((java.lang.Class) wildcardClass52);
        org.mockito.cglib.proxy.Callback callback54 = null;
        enhancer42.setCallback(callback54);
        org.mockito.cglib.proxy.Callback callback56 = null;
        enhancer42.setCallback(callback56);
        java.lang.ClassLoader classLoader58 = enhancer42.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer59 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy60 = enhancer59.getStrategy();
        enhancer59.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.proxy.Callback callback63 = null;
        enhancer59.setCallback(callback63);
        enhancer59.setUseCache(false);
        boolean boolean67 = enhancer59.getUseCache();
        enhancer59.setSerialVersionUID((java.lang.Long) 10L);
        org.mockito.cglib.proxy.Enhancer enhancer70 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy71 = enhancer70.getStrategy();
        java.lang.ClassLoader classLoader72 = enhancer70.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter73 = null;
        enhancer70.setCallbackFilter(callbackFilter73);
        org.mockito.cglib.core.NamingPolicy namingPolicy75 = enhancer70.getNamingPolicy();
        enhancer59.setNamingPolicy(namingPolicy75);
        java.lang.Class<?> wildcardClass77 = enhancer59.getClass();
        enhancer42.setSuperclass((java.lang.Class) wildcardClass77);
        org.mockito.cglib.proxy.Callback callback79 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray80 = new org.mockito.cglib.proxy.Callback[] { callback79 };
        enhancer42.setCallbacks(callbackArray80);
        enhancer15.setCallbacks(callbackArray80);
        enhancer8.setCallbacks(callbackArray80);
        enhancer0.setCallbacks(callbackArray80);
        org.mockito.cglib.proxy.Enhancer enhancer85 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy86 = enhancer85.getStrategy();
        enhancer85.setSerialVersionUID((java.lang.Long) 0L);
        enhancer85.setAttemptLoad(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy91 = enhancer85.getStrategy();
        enhancer0.setStrategy(generatorStrategy91);
        org.mockito.asm.ClassVisitor classVisitor93 = null;
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.generateClass(classVisitor93);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(namingPolicy4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(classLoader6);
        org.junit.Assert.assertNotNull(namingPolicy7);
        org.junit.Assert.assertNotNull(generatorStrategy9);
        org.junit.Assert.assertNotNull(classLoader10);
        org.junit.Assert.assertNotNull(generatorStrategy13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(namingPolicy18);
        org.junit.Assert.assertNotNull(generatorStrategy20);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(generatorStrategy30);
        org.junit.Assert.assertNotNull(classLoader31);
        org.junit.Assert.assertNotNull(namingPolicy37);
        org.junit.Assert.assertNotNull(classLoader40);
        org.junit.Assert.assertNotNull(classLoader41);
        org.junit.Assert.assertNotNull(namingPolicy45);
        org.junit.Assert.assertNotNull(generatorStrategy47);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(classLoader58);
        org.junit.Assert.assertNotNull(generatorStrategy60);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(generatorStrategy71);
        org.junit.Assert.assertNotNull(classLoader72);
        org.junit.Assert.assertNotNull(namingPolicy75);
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertNotNull(callbackArray80);
        org.junit.Assert.assertNotNull(generatorStrategy86);
        org.junit.Assert.assertNotNull(generatorStrategy91);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class1 = null;
        enhancer0.setSuperclass(class1);
        enhancer0.setUseCache(false);
        boolean boolean5 = enhancer0.getUseCache();
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = enhancer6.getStrategy();
        java.lang.ClassLoader classLoader8 = enhancer6.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer9 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class10 = null;
        enhancer9.setSuperclass(class10);
        org.mockito.cglib.proxy.Enhancer enhancer12 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = enhancer12.getStrategy();
        java.lang.ClassLoader classLoader14 = enhancer12.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter15 = null;
        enhancer12.setCallbackFilter(callbackFilter15);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy17 = enhancer12.getStrategy();
        enhancer9.setStrategy(generatorStrategy17);
        enhancer6.setStrategy(generatorStrategy17);
        enhancer0.setStrategy(generatorStrategy17);
        boolean boolean21 = enhancer0.getUseCache();
        boolean boolean22 = enhancer0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy23 = enhancer0.getStrategy();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(generatorStrategy7);
        org.junit.Assert.assertNotNull(classLoader8);
        org.junit.Assert.assertNotNull(generatorStrategy13);
        org.junit.Assert.assertNotNull(classLoader14);
        org.junit.Assert.assertNotNull(generatorStrategy17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(generatorStrategy23);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.proxy.Callback callback4 = null;
        enhancer0.setCallback(callback4);
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class7 = null;
        enhancer6.setSuperclass(class7);
        org.mockito.cglib.core.NamingPolicy namingPolicy9 = enhancer6.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer10 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = enhancer10.getStrategy();
        enhancer10.setSerialVersionUID((java.lang.Long) 0L);
        enhancer10.setUseFactory(false);
        java.lang.Class<?> wildcardClass16 = enhancer10.getClass();
        enhancer6.setSuperclass((java.lang.Class) wildcardClass16);
        org.mockito.cglib.proxy.Enhancer enhancer18 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy19 = enhancer18.getStrategy();
        enhancer6.setStrategy(generatorStrategy19);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy21 = enhancer6.getStrategy();
        enhancer0.setStrategy(generatorStrategy21);
        enhancer0.setAttemptLoad(true);
        enhancer0.setUseCache(true);
        enhancer0.setUseFactory(true);
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(namingPolicy9);
        org.junit.Assert.assertNotNull(generatorStrategy11);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(generatorStrategy19);
        org.junit.Assert.assertNotNull(generatorStrategy21);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class1 = null;
        enhancer0.setSuperclass(class1);
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = enhancer0.getNamingPolicy();
        boolean boolean4 = enhancer0.getAttemptLoad();
        enhancer0.setUseFactory(true);
        org.mockito.cglib.proxy.Enhancer enhancer7 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class8 = null;
        enhancer7.setSuperclass(class8);
        org.mockito.cglib.core.NamingPolicy namingPolicy10 = enhancer7.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer11 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = enhancer11.getStrategy();
        enhancer11.setSerialVersionUID((java.lang.Long) 0L);
        enhancer11.setUseFactory(false);
        java.lang.Class<?> wildcardClass17 = enhancer11.getClass();
        enhancer7.setSuperclass((java.lang.Class) wildcardClass17);
        org.mockito.cglib.proxy.Callback callback19 = null;
        enhancer7.setCallback(callback19);
        enhancer7.setAttemptLoad(false);
        enhancer7.setInterceptDuringConstruction(false);
        enhancer7.setInterceptDuringConstruction(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy27 = enhancer7.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy28 = enhancer7.getStrategy();
        enhancer0.setStrategy(generatorStrategy28);
        org.mockito.cglib.proxy.Enhancer enhancer30 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy31 = enhancer30.getStrategy();
        enhancer30.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.proxy.Callback callback34 = null;
        enhancer30.setCallback(callback34);
        enhancer30.setUseCache(false);
        boolean boolean38 = enhancer30.getUseCache();
        org.mockito.cglib.proxy.Enhancer enhancer39 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class40 = null;
        enhancer39.setSuperclass(class40);
        enhancer39.setSerialVersionUID((java.lang.Long) (-1L));
        org.mockito.cglib.proxy.Callback callback44 = null;
        enhancer39.setCallback(callback44);
        java.lang.Class<?> wildcardClass46 = enhancer39.getClass();
        enhancer30.setSuperclass((java.lang.Class) wildcardClass46);
        org.mockito.cglib.proxy.Enhancer enhancer48 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class49 = null;
        enhancer48.setSuperclass(class49);
        java.lang.ClassLoader classLoader51 = enhancer48.getClassLoader();
        enhancer30.setClassLoader(classLoader51);
        enhancer30.setInterceptDuringConstruction(false);
        org.mockito.cglib.proxy.Enhancer enhancer55 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy56 = enhancer55.getStrategy();
        enhancer55.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.proxy.Enhancer enhancer59 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class60 = null;
        enhancer59.setSuperclass(class60);
        java.lang.ClassLoader classLoader62 = enhancer59.getClassLoader();
        enhancer55.setClassLoader(classLoader62);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter64 = null;
        enhancer55.setCallbackFilter(callbackFilter64);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter66 = null;
        enhancer55.setCallbackFilter(callbackFilter66);
        java.lang.ClassLoader classLoader68 = enhancer55.getClassLoader();
        enhancer30.setClassLoader(classLoader68);
        enhancer0.setClassLoader(classLoader68);
        enhancer0.setAttemptLoad(false);
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(namingPolicy10);
        org.junit.Assert.assertNotNull(generatorStrategy12);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(generatorStrategy27);
        org.junit.Assert.assertNotNull(generatorStrategy28);
        org.junit.Assert.assertNotNull(generatorStrategy31);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(classLoader51);
        org.junit.Assert.assertNotNull(generatorStrategy56);
        org.junit.Assert.assertNotNull(classLoader62);
        org.junit.Assert.assertNotNull(classLoader68);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        java.lang.ClassLoader classLoader2 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter3 = null;
        enhancer0.setCallbackFilter(callbackFilter3);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer0.getStrategy();
        java.lang.ClassLoader classLoader6 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.Callback callback7 = null;
        enhancer0.setCallback(callback7);
        org.mockito.cglib.proxy.Callback callback9 = null;
        enhancer0.setCallback(callback9);
        enhancer0.setUseFactory(true);
        org.mockito.cglib.proxy.Enhancer enhancer13 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class<?> wildcardClass14 = enhancer13.getClass();
        boolean boolean15 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass14);
        boolean boolean16 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass14);
        enhancer0.setSuperclass((java.lang.Class) wildcardClass14);
        boolean boolean18 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass14);
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(classLoader2);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(classLoader6);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class1 = null;
        enhancer0.setSuperclass(class1);
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = enhancer0.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer4 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer4.getStrategy();
        enhancer4.setSerialVersionUID((java.lang.Long) 0L);
        enhancer4.setUseFactory(false);
        java.lang.Class<?> wildcardClass10 = enhancer4.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass10);
        org.mockito.cglib.proxy.Callback callback12 = null;
        enhancer0.setCallback(callback12);
        enhancer0.setUseCache(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy16 = null;
        enhancer0.setNamingPolicy(namingPolicy16);
        org.mockito.cglib.proxy.Enhancer enhancer18 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class19 = null;
        enhancer18.setSuperclass(class19);
        org.mockito.cglib.core.NamingPolicy namingPolicy21 = enhancer18.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer22 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy23 = enhancer22.getStrategy();
        enhancer22.setSerialVersionUID((java.lang.Long) 0L);
        enhancer22.setUseFactory(false);
        java.lang.Class<?> wildcardClass28 = enhancer22.getClass();
        enhancer18.setSuperclass((java.lang.Class) wildcardClass28);
        org.mockito.cglib.proxy.Callback callback30 = null;
        enhancer18.setCallback(callback30);
        org.mockito.cglib.proxy.Enhancer enhancer32 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy33 = enhancer32.getStrategy();
        java.lang.ClassLoader classLoader34 = enhancer32.getClassLoader();
        enhancer18.setClassLoader(classLoader34);
        enhancer18.setSerialVersionUID((java.lang.Long) 0L);
        boolean boolean38 = enhancer18.getUseCache();
        enhancer18.setUseCache(true);
        enhancer18.setUseCache(false);
        enhancer18.setAttemptLoad(false);
        org.mockito.cglib.proxy.Enhancer enhancer45 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy46 = enhancer45.getStrategy();
        enhancer45.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.proxy.Enhancer enhancer49 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy50 = enhancer49.getStrategy();
        enhancer49.setSerialVersionUID((java.lang.Long) 0L);
        enhancer49.setUseFactory(false);
        org.mockito.cglib.proxy.Enhancer enhancer55 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy56 = enhancer55.getStrategy();
        java.lang.Class<?> wildcardClass57 = enhancer55.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer58 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy59 = enhancer58.getStrategy();
        java.lang.Class<?> wildcardClass60 = enhancer58.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer61 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy62 = enhancer61.getStrategy();
        java.lang.Class<?> wildcardClass63 = enhancer61.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer64 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy65 = enhancer64.getStrategy();
        java.lang.Class<?> wildcardClass66 = enhancer64.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer67 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy68 = enhancer67.getStrategy();
        java.lang.Class<?> wildcardClass69 = enhancer67.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer70 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy71 = enhancer70.getStrategy();
        java.lang.Class<?> wildcardClass72 = enhancer70.getClass();
        java.lang.Class[] classArray73 = new java.lang.Class[] { wildcardClass57, wildcardClass60, wildcardClass63, wildcardClass66, wildcardClass69, wildcardClass72 };
        enhancer49.setInterfaces(classArray73);
        org.mockito.cglib.proxy.Callback callback75 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray76 = new org.mockito.cglib.proxy.Callback[] { callback75 };
        enhancer49.setCallbacks(callbackArray76);
        enhancer45.setCallbacks(callbackArray76);
        enhancer18.setCallbacks(callbackArray76);
        enhancer0.setCallbacks(callbackArray76);
        enhancer0.setAttemptLoad(false);
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(namingPolicy21);
        org.junit.Assert.assertNotNull(generatorStrategy23);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(generatorStrategy33);
        org.junit.Assert.assertNotNull(classLoader34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(generatorStrategy46);
        org.junit.Assert.assertNotNull(generatorStrategy50);
        org.junit.Assert.assertNotNull(generatorStrategy56);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(generatorStrategy59);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(generatorStrategy62);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(generatorStrategy65);
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertNotNull(generatorStrategy68);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertNotNull(generatorStrategy71);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertNotNull(classArray73);
        org.junit.Assert.assertNotNull(callbackArray76);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class1 = null;
        enhancer0.setSuperclass(class1);
        enhancer0.setUseCache(false);
        java.lang.ClassLoader classLoader5 = enhancer0.getClassLoader();
        boolean boolean6 = enhancer0.getUseCache();
        org.junit.Assert.assertNotNull(classLoader5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        java.lang.ClassLoader classLoader2 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter3 = null;
        enhancer0.setCallbackFilter(callbackFilter3);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer0.getStrategy();
        java.lang.ClassLoader classLoader6 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.Callback callback7 = null;
        enhancer0.setCallback(callback7);
        enhancer0.setInterceptDuringConstruction(true);
        java.lang.ClassLoader classLoader11 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer12 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = enhancer12.getStrategy();
        java.lang.ClassLoader classLoader14 = enhancer12.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter15 = null;
        enhancer12.setCallbackFilter(callbackFilter15);
        enhancer12.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.Callback callback19 = null;
        enhancer12.setCallback(callback19);
        java.lang.ClassLoader classLoader21 = enhancer12.getClassLoader();
        enhancer12.setUseFactory(true);
        org.mockito.cglib.proxy.Enhancer enhancer24 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class25 = null;
        enhancer24.setSuperclass(class25);
        org.mockito.cglib.proxy.Callback callback27 = null;
        enhancer24.setCallback(callback27);
        java.lang.ClassLoader classLoader29 = enhancer24.getClassLoader();
        enhancer12.setClassLoader(classLoader29);
        enhancer0.setClassLoader(classLoader29);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter32 = null;
        enhancer0.setCallbackFilter(callbackFilter32);
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(classLoader2);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(classLoader6);
        org.junit.Assert.assertNotNull(classLoader11);
        org.junit.Assert.assertNotNull(generatorStrategy13);
        org.junit.Assert.assertNotNull(classLoader14);
        org.junit.Assert.assertNotNull(classLoader21);
        org.junit.Assert.assertNotNull(classLoader29);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.proxy.Callback callback4 = null;
        enhancer0.setCallback(callback4);
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class7 = null;
        enhancer6.setSuperclass(class7);
        org.mockito.cglib.core.NamingPolicy namingPolicy9 = enhancer6.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer10 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = enhancer10.getStrategy();
        enhancer10.setSerialVersionUID((java.lang.Long) 0L);
        enhancer10.setUseFactory(false);
        java.lang.Class<?> wildcardClass16 = enhancer10.getClass();
        enhancer6.setSuperclass((java.lang.Class) wildcardClass16);
        org.mockito.cglib.proxy.Enhancer enhancer18 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy19 = enhancer18.getStrategy();
        enhancer6.setStrategy(generatorStrategy19);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy21 = enhancer6.getStrategy();
        enhancer0.setStrategy(generatorStrategy21);
        enhancer0.setAttemptLoad(true);
        org.mockito.cglib.proxy.Enhancer enhancer25 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class26 = null;
        enhancer25.setSuperclass(class26);
        enhancer25.setSerialVersionUID((java.lang.Long) (-1L));
        enhancer25.setUseCache(false);
        java.lang.Class<?> wildcardClass32 = enhancer25.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass32);
        enhancer0.setInterceptDuringConstruction(false);
        enhancer0.setSerialVersionUID((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(namingPolicy9);
        org.junit.Assert.assertNotNull(generatorStrategy11);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(generatorStrategy19);
        org.junit.Assert.assertNotNull(generatorStrategy21);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        enhancer0.setUseFactory(false);
        enhancer0.setUseCache(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy8 = enhancer0.getNamingPolicy();
        enhancer0.setUseFactory(true);
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(namingPolicy8);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class1 = null;
        enhancer0.setSuperclass(class1);
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = enhancer0.getNamingPolicy();
        boolean boolean4 = enhancer0.getAttemptLoad();
        boolean boolean5 = enhancer0.getUseCache();
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class7 = null;
        enhancer6.setSuperclass(class7);
        org.mockito.cglib.core.NamingPolicy namingPolicy9 = enhancer6.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer10 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = enhancer10.getStrategy();
        enhancer10.setSerialVersionUID((java.lang.Long) 0L);
        enhancer10.setUseFactory(false);
        java.lang.Class<?> wildcardClass16 = enhancer10.getClass();
        enhancer6.setSuperclass((java.lang.Class) wildcardClass16);
        org.mockito.cglib.proxy.Callback callback18 = null;
        enhancer6.setCallback(callback18);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy20 = enhancer6.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer21 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy22 = enhancer21.getStrategy();
        enhancer21.setSerialVersionUID((java.lang.Long) 0L);
        enhancer21.setUseFactory(false);
        org.mockito.cglib.proxy.Enhancer enhancer27 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy28 = enhancer27.getStrategy();
        java.lang.Class<?> wildcardClass29 = enhancer27.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer30 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy31 = enhancer30.getStrategy();
        java.lang.Class<?> wildcardClass32 = enhancer30.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer33 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy34 = enhancer33.getStrategy();
        java.lang.Class<?> wildcardClass35 = enhancer33.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer36 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy37 = enhancer36.getStrategy();
        java.lang.Class<?> wildcardClass38 = enhancer36.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer39 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy40 = enhancer39.getStrategy();
        java.lang.Class<?> wildcardClass41 = enhancer39.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer42 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy43 = enhancer42.getStrategy();
        java.lang.Class<?> wildcardClass44 = enhancer42.getClass();
        java.lang.Class[] classArray45 = new java.lang.Class[] { wildcardClass29, wildcardClass32, wildcardClass35, wildcardClass38, wildcardClass41, wildcardClass44 };
        enhancer21.setInterfaces(classArray45);
        enhancer6.setInterfaces(classArray45);
        enhancer6.setInterceptDuringConstruction(false);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter50 = null;
        enhancer6.setCallbackFilter(callbackFilter50);
        enhancer6.setInterceptDuringConstruction(false);
        org.mockito.cglib.proxy.Callback callback54 = null;
        enhancer6.setCallback(callback54);
        java.lang.Class<?> wildcardClass56 = enhancer6.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass56);
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(namingPolicy9);
        org.junit.Assert.assertNotNull(generatorStrategy11);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(generatorStrategy20);
        org.junit.Assert.assertNotNull(generatorStrategy22);
        org.junit.Assert.assertNotNull(generatorStrategy28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(generatorStrategy31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(generatorStrategy34);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(generatorStrategy37);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(generatorStrategy40);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(generatorStrategy43);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(classArray45);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        enhancer0.setUseCache(true);
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = enhancer6.getStrategy();
        enhancer6.setSerialVersionUID((java.lang.Long) 0L);
        enhancer6.setAttemptLoad(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = enhancer6.getStrategy();
        enhancer0.setStrategy(generatorStrategy12);
        boolean boolean14 = enhancer0.getUseCache();
        enhancer0.setUseFactory(false);
        boolean boolean17 = enhancer0.getUseCache();
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(generatorStrategy7);
        org.junit.Assert.assertNotNull(generatorStrategy12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        java.lang.ClassLoader classLoader2 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter3 = null;
        enhancer0.setCallbackFilter(callbackFilter3);
        enhancer0.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter7 = null;
        enhancer0.setCallbackFilter(callbackFilter7);
        boolean boolean9 = enhancer0.getAttemptLoad();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter10 = null;
        enhancer0.setCallbackFilter(callbackFilter10);
        enhancer0.setUseFactory(false);
        boolean boolean14 = enhancer0.getAttemptLoad();
        enhancer0.setUseFactory(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = enhancer0.create();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callbacks are required");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(classLoader2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class1 = null;
        enhancer0.setSuperclass(class1);
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = enhancer0.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer4 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer4.getStrategy();
        enhancer4.setSerialVersionUID((java.lang.Long) 0L);
        enhancer4.setUseFactory(false);
        java.lang.Class<?> wildcardClass10 = enhancer4.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass10);
        org.mockito.cglib.proxy.Callback callback12 = null;
        enhancer0.setCallback(callback12);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy14 = enhancer0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy15 = enhancer0.getStrategy();
        java.lang.Class<?> wildcardClass16 = generatorStrategy15.getClass();
        boolean boolean17 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass16);
        org.mockito.cglib.proxy.Enhancer enhancer18 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class19 = null;
        enhancer18.setSuperclass(class19);
        org.mockito.cglib.core.NamingPolicy namingPolicy21 = enhancer18.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer22 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy23 = enhancer22.getStrategy();
        enhancer22.setSerialVersionUID((java.lang.Long) 0L);
        enhancer22.setUseFactory(false);
        java.lang.Class<?> wildcardClass28 = enhancer22.getClass();
        enhancer18.setSuperclass((java.lang.Class) wildcardClass28);
        org.mockito.cglib.proxy.Callback callback30 = null;
        enhancer18.setCallback(callback30);
        enhancer18.setUseCache(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy34 = enhancer18.getNamingPolicy();
        enhancer18.setAttemptLoad(false);
        org.mockito.cglib.proxy.Enhancer enhancer37 = new org.mockito.cglib.proxy.Enhancer();
        enhancer37.setUseCache(false);
        org.mockito.cglib.proxy.Enhancer enhancer40 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class41 = null;
        enhancer40.setSuperclass(class41);
        org.mockito.cglib.core.NamingPolicy namingPolicy43 = enhancer40.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer44 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy45 = enhancer44.getStrategy();
        enhancer44.setSerialVersionUID((java.lang.Long) 0L);
        enhancer44.setUseFactory(false);
        java.lang.Class<?> wildcardClass50 = enhancer44.getClass();
        enhancer40.setSuperclass((java.lang.Class) wildcardClass50);
        org.mockito.cglib.proxy.Callback callback52 = null;
        enhancer40.setCallback(callback52);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy54 = enhancer40.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer55 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy56 = enhancer55.getStrategy();
        enhancer55.setSerialVersionUID((java.lang.Long) 0L);
        enhancer55.setUseFactory(false);
        org.mockito.cglib.proxy.Enhancer enhancer61 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy62 = enhancer61.getStrategy();
        java.lang.Class<?> wildcardClass63 = enhancer61.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer64 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy65 = enhancer64.getStrategy();
        java.lang.Class<?> wildcardClass66 = enhancer64.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer67 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy68 = enhancer67.getStrategy();
        java.lang.Class<?> wildcardClass69 = enhancer67.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer70 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy71 = enhancer70.getStrategy();
        java.lang.Class<?> wildcardClass72 = enhancer70.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer73 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy74 = enhancer73.getStrategy();
        java.lang.Class<?> wildcardClass75 = enhancer73.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer76 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy77 = enhancer76.getStrategy();
        java.lang.Class<?> wildcardClass78 = enhancer76.getClass();
        java.lang.Class[] classArray79 = new java.lang.Class[] { wildcardClass63, wildcardClass66, wildcardClass69, wildcardClass72, wildcardClass75, wildcardClass78 };
        enhancer55.setInterfaces(classArray79);
        enhancer40.setInterfaces(classArray79);
        enhancer37.setInterfaces(classArray79);
        enhancer18.setInterfaces(classArray79);
        org.mockito.cglib.proxy.Callback callback84 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj85 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass16, classArray79, callback84);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(generatorStrategy14);
        org.junit.Assert.assertNotNull(generatorStrategy15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(namingPolicy21);
        org.junit.Assert.assertNotNull(generatorStrategy23);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(namingPolicy34);
        org.junit.Assert.assertNotNull(namingPolicy43);
        org.junit.Assert.assertNotNull(generatorStrategy45);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(generatorStrategy54);
        org.junit.Assert.assertNotNull(generatorStrategy56);
        org.junit.Assert.assertNotNull(generatorStrategy62);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(generatorStrategy65);
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertNotNull(generatorStrategy68);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertNotNull(generatorStrategy71);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertNotNull(generatorStrategy74);
        org.junit.Assert.assertNotNull(wildcardClass75);
        org.junit.Assert.assertNotNull(generatorStrategy77);
        org.junit.Assert.assertNotNull(wildcardClass78);
        org.junit.Assert.assertNotNull(classArray79);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class1 = null;
        enhancer0.setSuperclass(class1);
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = enhancer0.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer4 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer4.getStrategy();
        enhancer4.setSerialVersionUID((java.lang.Long) 0L);
        enhancer4.setUseFactory(false);
        java.lang.Class<?> wildcardClass10 = enhancer4.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass10);
        org.mockito.cglib.proxy.Callback callback12 = null;
        enhancer0.setCallback(callback12);
        org.mockito.cglib.proxy.Callback callback14 = null;
        enhancer0.setCallback(callback14);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter16 = null;
        enhancer0.setCallbackFilter(callbackFilter16);
        boolean boolean18 = enhancer0.getAttemptLoad();
        enhancer0.setUseCache(false);
        enhancer0.setUseCache(true);
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        enhancer0.setAttemptLoad(false);
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = enhancer6.getStrategy();
        java.lang.Class<?> wildcardClass8 = enhancer6.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer9 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy10 = enhancer9.getStrategy();
        java.lang.Class<?> wildcardClass11 = enhancer9.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer12 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = enhancer12.getStrategy();
        enhancer12.setSerialVersionUID((java.lang.Long) 0L);
        enhancer12.setUseFactory(false);
        java.lang.Class<?> wildcardClass18 = enhancer12.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer19 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy20 = enhancer19.getStrategy();
        enhancer19.setSerialVersionUID((java.lang.Long) 0L);
        enhancer19.setUseFactory(false);
        java.lang.Class<?> wildcardClass25 = enhancer19.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer26 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class27 = null;
        enhancer26.setSuperclass(class27);
        java.lang.ClassLoader classLoader29 = enhancer26.getClassLoader();
        java.lang.Class<?> wildcardClass30 = enhancer26.getClass();
        java.lang.Class[] classArray31 = new java.lang.Class[] { wildcardClass8, wildcardClass11, wildcardClass18, wildcardClass25, wildcardClass30 };
        enhancer0.setInterfaces(classArray31);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy33 = enhancer0.getStrategy();
        java.lang.ClassLoader classLoader34 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy35 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer36 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy37 = enhancer36.getStrategy();
        enhancer36.setSerialVersionUID((java.lang.Long) 0L);
        enhancer36.setUseCache(true);
        org.mockito.cglib.proxy.Enhancer enhancer42 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy43 = enhancer42.getStrategy();
        enhancer42.setSerialVersionUID((java.lang.Long) 0L);
        enhancer42.setAttemptLoad(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy48 = enhancer42.getStrategy();
        enhancer36.setStrategy(generatorStrategy48);
        enhancer36.setUseCache(false);
        boolean boolean52 = enhancer36.getUseCache();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter53 = null;
        enhancer36.setCallbackFilter(callbackFilter53);
        org.mockito.cglib.proxy.Enhancer enhancer55 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy56 = enhancer55.getStrategy();
        java.lang.ClassLoader classLoader57 = enhancer55.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter58 = null;
        enhancer55.setCallbackFilter(callbackFilter58);
        enhancer55.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.Enhancer enhancer62 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class63 = null;
        enhancer62.setSuperclass(class63);
        org.mockito.cglib.proxy.Enhancer enhancer65 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy66 = enhancer65.getStrategy();
        java.lang.ClassLoader classLoader67 = enhancer65.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter68 = null;
        enhancer65.setCallbackFilter(callbackFilter68);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy70 = enhancer65.getStrategy();
        enhancer62.setStrategy(generatorStrategy70);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy72 = enhancer62.getStrategy();
        enhancer55.setStrategy(generatorStrategy72);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter74 = null;
        enhancer55.setCallbackFilter(callbackFilter74);
        org.mockito.cglib.proxy.Enhancer enhancer76 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy77 = enhancer76.getStrategy();
        enhancer76.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.proxy.Enhancer enhancer80 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class81 = null;
        enhancer80.setSuperclass(class81);
        java.lang.ClassLoader classLoader83 = enhancer80.getClassLoader();
        enhancer76.setClassLoader(classLoader83);
        enhancer55.setClassLoader(classLoader83);
        enhancer36.setClassLoader(classLoader83);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy87 = enhancer36.getStrategy();
        enhancer36.setUseCache(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy90 = enhancer36.getStrategy();
        enhancer0.setStrategy(generatorStrategy90);
        boolean boolean92 = enhancer0.getAttemptLoad();
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(generatorStrategy7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(generatorStrategy10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(generatorStrategy13);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(generatorStrategy20);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(classLoader29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertNotNull(generatorStrategy33);
        org.junit.Assert.assertNotNull(classLoader34);
        org.junit.Assert.assertNotNull(generatorStrategy35);
        org.junit.Assert.assertNotNull(generatorStrategy37);
        org.junit.Assert.assertNotNull(generatorStrategy43);
        org.junit.Assert.assertNotNull(generatorStrategy48);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(generatorStrategy56);
        org.junit.Assert.assertNotNull(classLoader57);
        org.junit.Assert.assertNotNull(generatorStrategy66);
        org.junit.Assert.assertNotNull(classLoader67);
        org.junit.Assert.assertNotNull(generatorStrategy70);
        org.junit.Assert.assertNotNull(generatorStrategy72);
        org.junit.Assert.assertNotNull(generatorStrategy77);
        org.junit.Assert.assertNotNull(classLoader83);
        org.junit.Assert.assertNotNull(generatorStrategy87);
        org.junit.Assert.assertNotNull(generatorStrategy90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        enhancer0.setUseCache(true);
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = enhancer6.getStrategy();
        enhancer6.setSerialVersionUID((java.lang.Long) 0L);
        enhancer6.setAttemptLoad(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = enhancer6.getStrategy();
        enhancer0.setStrategy(generatorStrategy12);
        org.mockito.cglib.proxy.Enhancer enhancer14 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class15 = null;
        enhancer14.setSuperclass(class15);
        java.lang.ClassLoader classLoader17 = enhancer14.getClassLoader();
        java.lang.Class<?> wildcardClass18 = enhancer14.getClass();
        boolean boolean19 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass18);
        enhancer0.setSuperclass((java.lang.Class) wildcardClass18);
        org.mockito.asm.ClassVisitor classVisitor21 = null;
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.generateClass(classVisitor21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(generatorStrategy7);
        org.junit.Assert.assertNotNull(generatorStrategy12);
        org.junit.Assert.assertNotNull(classLoader17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        enhancer0.setUseCache(true);
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = enhancer6.getStrategy();
        enhancer6.setSerialVersionUID((java.lang.Long) 0L);
        enhancer6.setAttemptLoad(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = enhancer6.getStrategy();
        enhancer0.setStrategy(generatorStrategy12);
        org.mockito.cglib.proxy.Enhancer enhancer14 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class15 = null;
        enhancer14.setSuperclass(class15);
        java.lang.ClassLoader classLoader17 = enhancer14.getClassLoader();
        java.lang.Class<?> wildcardClass18 = enhancer14.getClass();
        boolean boolean19 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass18);
        enhancer0.setSuperclass((java.lang.Class) wildcardClass18);
        org.mockito.cglib.proxy.Callback callback21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass18, callback21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(generatorStrategy7);
        org.junit.Assert.assertNotNull(generatorStrategy12);
        org.junit.Assert.assertNotNull(classLoader17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        java.lang.ClassLoader classLoader2 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter3 = null;
        enhancer0.setCallbackFilter(callbackFilter3);
        enhancer0.setInterceptDuringConstruction(true);
        enhancer0.setAttemptLoad(false);
        enhancer0.setSerialVersionUID((java.lang.Long) 1L);
        org.mockito.cglib.proxy.Enhancer enhancer11 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = enhancer11.getStrategy();
        enhancer11.setSerialVersionUID((java.lang.Long) 0L);
        enhancer11.setUseFactory(false);
        org.mockito.cglib.proxy.Enhancer enhancer17 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy18 = enhancer17.getStrategy();
        java.lang.Class<?> wildcardClass19 = enhancer17.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer20 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy21 = enhancer20.getStrategy();
        java.lang.Class<?> wildcardClass22 = enhancer20.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer23 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy24 = enhancer23.getStrategy();
        java.lang.Class<?> wildcardClass25 = enhancer23.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer26 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy27 = enhancer26.getStrategy();
        java.lang.Class<?> wildcardClass28 = enhancer26.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer29 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy30 = enhancer29.getStrategy();
        java.lang.Class<?> wildcardClass31 = enhancer29.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer32 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy33 = enhancer32.getStrategy();
        java.lang.Class<?> wildcardClass34 = enhancer32.getClass();
        java.lang.Class[] classArray35 = new java.lang.Class[] { wildcardClass19, wildcardClass22, wildcardClass25, wildcardClass28, wildcardClass31, wildcardClass34 };
        enhancer11.setInterfaces(classArray35);
        org.mockito.cglib.proxy.Callback callback37 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray38 = new org.mockito.cglib.proxy.Callback[] { callback37 };
        enhancer11.setCallbacks(callbackArray38);
        enhancer0.setCallbacks(callbackArray38);
        boolean boolean41 = enhancer0.getAttemptLoad();
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(classLoader2);
        org.junit.Assert.assertNotNull(generatorStrategy12);
        org.junit.Assert.assertNotNull(generatorStrategy18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(generatorStrategy21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(generatorStrategy24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(generatorStrategy27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(generatorStrategy30);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(generatorStrategy33);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(classArray35);
        org.junit.Assert.assertNotNull(callbackArray38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        java.lang.ClassLoader classLoader2 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter3 = null;
        enhancer0.setCallbackFilter(callbackFilter3);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer0.getStrategy();
        java.lang.ClassLoader classLoader6 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer7 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class8 = null;
        enhancer7.setSuperclass(class8);
        enhancer7.setSerialVersionUID((java.lang.Long) (-1L));
        org.mockito.cglib.proxy.Callback callback12 = null;
        enhancer7.setCallback(callback12);
        enhancer7.setUseFactory(false);
        java.lang.ClassLoader classLoader16 = enhancer7.getClassLoader();
        org.mockito.cglib.proxy.Callback callback17 = null;
        enhancer7.setCallback(callback17);
        org.mockito.cglib.proxy.Callback callback19 = null;
        enhancer7.setCallback(callback19);
        java.lang.ClassLoader classLoader21 = enhancer7.getClassLoader();
        org.mockito.cglib.core.NamingPolicy namingPolicy22 = enhancer7.getNamingPolicy();
        enhancer0.setNamingPolicy(namingPolicy22);
        enhancer0.setUseCache(true);
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(classLoader2);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(classLoader6);
        org.junit.Assert.assertNotNull(classLoader16);
        org.junit.Assert.assertNotNull(classLoader21);
        org.junit.Assert.assertNotNull(namingPolicy22);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class1 = null;
        enhancer0.setSuperclass(class1);
        enhancer0.setSerialVersionUID((java.lang.Long) (-1L));
        org.mockito.cglib.proxy.Callback callback5 = null;
        enhancer0.setCallback(callback5);
        org.mockito.cglib.core.NamingPolicy namingPolicy7 = null;
        enhancer0.setNamingPolicy(namingPolicy7);
        org.mockito.cglib.core.NamingPolicy namingPolicy9 = enhancer0.getNamingPolicy();
        org.junit.Assert.assertNotNull(namingPolicy9);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        java.lang.ClassLoader classLoader2 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter3 = null;
        enhancer0.setCallbackFilter(callbackFilter3);
        java.lang.ClassLoader classLoader5 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = enhancer6.getStrategy();
        enhancer6.setSerialVersionUID((java.lang.Long) 0L);
        enhancer6.setUseCache(true);
        org.mockito.cglib.proxy.Enhancer enhancer12 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = enhancer12.getStrategy();
        enhancer12.setSerialVersionUID((java.lang.Long) 0L);
        enhancer12.setAttemptLoad(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy18 = enhancer12.getStrategy();
        enhancer6.setStrategy(generatorStrategy18);
        enhancer6.setUseCache(false);
        java.lang.ClassLoader classLoader22 = enhancer6.getClassLoader();
        enhancer0.setClassLoader(classLoader22);
        org.mockito.asm.ClassVisitor classVisitor24 = null;
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.generateClass(classVisitor24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(classLoader2);
        org.junit.Assert.assertNotNull(classLoader5);
        org.junit.Assert.assertNotNull(generatorStrategy7);
        org.junit.Assert.assertNotNull(generatorStrategy13);
        org.junit.Assert.assertNotNull(generatorStrategy18);
        org.junit.Assert.assertNotNull(classLoader22);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Callback callback2 = null;
        enhancer0.setCallback(callback2);
        enhancer0.setAttemptLoad(true);
        enhancer0.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.Enhancer enhancer8 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Callback callback9 = null;
        enhancer8.setCallback(callback9);
        enhancer8.setUseCache(false);
        enhancer8.setSerialVersionUID((java.lang.Long) 100L);
        org.mockito.cglib.proxy.Enhancer enhancer15 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = enhancer15.getStrategy();
        java.lang.ClassLoader classLoader17 = enhancer15.getClassLoader();
        enhancer8.setClassLoader(classLoader17);
        org.mockito.cglib.core.NamingPolicy namingPolicy19 = enhancer8.getNamingPolicy();
        boolean boolean20 = enhancer8.getAttemptLoad();
        java.lang.Class<?> wildcardClass21 = enhancer8.getClass();
        boolean boolean22 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass21);
        enhancer0.setSuperclass((java.lang.Class) wildcardClass21);
        java.lang.Class<?> wildcardClass24 = enhancer0.getClass();
        org.mockito.cglib.proxy.Callback[] callbackArray25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.registerStaticCallbacks((java.lang.Class) wildcardClass24, callbackArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.cglib.proxy.Enhancer is not an enhanced class");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(generatorStrategy16);
        org.junit.Assert.assertNotNull(classLoader17);
        org.junit.Assert.assertNotNull(namingPolicy19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class1 = null;
        enhancer0.setSuperclass(class1);
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = enhancer0.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer4 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer4.getStrategy();
        enhancer4.setSerialVersionUID((java.lang.Long) 0L);
        enhancer4.setUseFactory(false);
        java.lang.Class<?> wildcardClass10 = enhancer4.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass10);
        org.mockito.cglib.proxy.Callback callback12 = null;
        enhancer0.setCallback(callback12);
        enhancer0.setAttemptLoad(false);
        enhancer0.setInterceptDuringConstruction(false);
        enhancer0.setInterceptDuringConstruction(true);
        java.lang.ClassLoader classLoader20 = enhancer0.getClassLoader();
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        enhancer0.setInterceptDuringConstruction(false);
        org.mockito.cglib.proxy.Enhancer enhancer25 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class26 = null;
        enhancer25.setSuperclass(class26);
        org.mockito.cglib.core.NamingPolicy namingPolicy28 = enhancer25.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer29 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy30 = enhancer29.getStrategy();
        enhancer29.setSerialVersionUID((java.lang.Long) 0L);
        enhancer29.setUseFactory(false);
        java.lang.Class<?> wildcardClass35 = enhancer29.getClass();
        enhancer25.setSuperclass((java.lang.Class) wildcardClass35);
        org.mockito.cglib.proxy.Callback callback37 = null;
        enhancer25.setCallback(callback37);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy39 = enhancer25.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy40 = enhancer25.getStrategy();
        enhancer25.setUseFactory(true);
        enhancer25.setUseFactory(false);
        java.lang.ClassLoader classLoader45 = enhancer25.getClassLoader();
        enhancer0.setClassLoader(classLoader45);
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(classLoader20);
        org.junit.Assert.assertNotNull(namingPolicy28);
        org.junit.Assert.assertNotNull(generatorStrategy30);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(generatorStrategy39);
        org.junit.Assert.assertNotNull(generatorStrategy40);
        org.junit.Assert.assertNotNull(classLoader45);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class1 = null;
        enhancer0.setSuperclass(class1);
        boolean boolean3 = enhancer0.getAttemptLoad();
        enhancer0.setAttemptLoad(true);
        boolean boolean6 = enhancer0.getAttemptLoad();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter7 = null;
        enhancer0.setCallbackFilter(callbackFilter7);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        enhancer0.setUseCache(true);
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = enhancer6.getStrategy();
        enhancer6.setSerialVersionUID((java.lang.Long) 0L);
        enhancer6.setAttemptLoad(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = enhancer6.getStrategy();
        enhancer0.setStrategy(generatorStrategy12);
        boolean boolean14 = enhancer0.getAttemptLoad();
        enhancer0.setUseCache(true);
        org.mockito.cglib.proxy.Enhancer enhancer17 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class18 = null;
        enhancer17.setSuperclass(class18);
        org.mockito.cglib.core.NamingPolicy namingPolicy20 = enhancer17.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer21 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy22 = enhancer21.getStrategy();
        enhancer21.setSerialVersionUID((java.lang.Long) 0L);
        enhancer21.setUseFactory(false);
        java.lang.Class<?> wildcardClass27 = enhancer21.getClass();
        enhancer17.setSuperclass((java.lang.Class) wildcardClass27);
        org.mockito.cglib.proxy.Callback callback29 = null;
        enhancer17.setCallback(callback29);
        enhancer17.setUseCache(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy33 = enhancer17.getNamingPolicy();
        enhancer17.setAttemptLoad(false);
        boolean boolean36 = enhancer17.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy37 = enhancer17.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer38 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy39 = enhancer38.getStrategy();
        enhancer38.setSerialVersionUID((java.lang.Long) 0L);
        enhancer38.setAttemptLoad(false);
        org.mockito.cglib.proxy.Enhancer enhancer44 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy45 = enhancer44.getStrategy();
        java.lang.Class<?> wildcardClass46 = enhancer44.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer47 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy48 = enhancer47.getStrategy();
        java.lang.Class<?> wildcardClass49 = enhancer47.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer50 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy51 = enhancer50.getStrategy();
        enhancer50.setSerialVersionUID((java.lang.Long) 0L);
        enhancer50.setUseFactory(false);
        java.lang.Class<?> wildcardClass56 = enhancer50.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer57 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy58 = enhancer57.getStrategy();
        enhancer57.setSerialVersionUID((java.lang.Long) 0L);
        enhancer57.setUseFactory(false);
        java.lang.Class<?> wildcardClass63 = enhancer57.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer64 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class65 = null;
        enhancer64.setSuperclass(class65);
        java.lang.ClassLoader classLoader67 = enhancer64.getClassLoader();
        java.lang.Class<?> wildcardClass68 = enhancer64.getClass();
        java.lang.Class[] classArray69 = new java.lang.Class[] { wildcardClass46, wildcardClass49, wildcardClass56, wildcardClass63, wildcardClass68 };
        enhancer38.setInterfaces(classArray69);
        org.mockito.cglib.core.NamingPolicy namingPolicy71 = enhancer38.getNamingPolicy();
        java.lang.Class[] classArray72 = null;
        enhancer38.setInterfaces(classArray72);
        org.mockito.cglib.proxy.Enhancer enhancer74 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy75 = enhancer74.getStrategy();
        enhancer74.setSerialVersionUID((java.lang.Long) 0L);
        enhancer74.setUseFactory(false);
        java.lang.Class<?> wildcardClass80 = enhancer74.getClass();
        enhancer38.setSuperclass((java.lang.Class) wildcardClass80);
        enhancer17.setSuperclass((java.lang.Class) wildcardClass80);
        boolean boolean83 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass80);
        boolean boolean84 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass80);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackType((java.lang.Class) wildcardClass80);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown callback type class org.mockito.cglib.proxy.Enhancer");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(generatorStrategy7);
        org.junit.Assert.assertNotNull(generatorStrategy12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(namingPolicy20);
        org.junit.Assert.assertNotNull(generatorStrategy22);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(namingPolicy33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(generatorStrategy37);
        org.junit.Assert.assertNotNull(generatorStrategy39);
        org.junit.Assert.assertNotNull(generatorStrategy45);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(generatorStrategy48);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(generatorStrategy51);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertNotNull(generatorStrategy58);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(classLoader67);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertNotNull(classArray69);
        org.junit.Assert.assertNotNull(namingPolicy71);
        org.junit.Assert.assertNotNull(generatorStrategy75);
        org.junit.Assert.assertNotNull(wildcardClass80);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        java.lang.ClassLoader classLoader2 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter3 = null;
        enhancer0.setCallbackFilter(callbackFilter3);
        enhancer0.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.Enhancer enhancer7 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class8 = null;
        enhancer7.setSuperclass(class8);
        org.mockito.cglib.proxy.Enhancer enhancer10 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = enhancer10.getStrategy();
        java.lang.ClassLoader classLoader12 = enhancer10.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter13 = null;
        enhancer10.setCallbackFilter(callbackFilter13);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy15 = enhancer10.getStrategy();
        enhancer7.setStrategy(generatorStrategy15);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy17 = enhancer7.getStrategy();
        enhancer0.setStrategy(generatorStrategy17);
        enhancer0.setSerialVersionUID((java.lang.Long) 100L);
        enhancer0.setUseCache(false);
        enhancer0.setSerialVersionUID((java.lang.Long) 100L);
        java.lang.ClassLoader classLoader25 = enhancer0.getClassLoader();
        java.lang.Class<?> wildcardClass26 = enhancer0.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer27 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy28 = enhancer27.getStrategy();
        enhancer27.setSerialVersionUID((java.lang.Long) 0L);
        enhancer27.setAttemptLoad(false);
        org.mockito.cglib.proxy.Enhancer enhancer33 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy34 = enhancer33.getStrategy();
        java.lang.Class<?> wildcardClass35 = enhancer33.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer36 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy37 = enhancer36.getStrategy();
        java.lang.Class<?> wildcardClass38 = enhancer36.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer39 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy40 = enhancer39.getStrategy();
        enhancer39.setSerialVersionUID((java.lang.Long) 0L);
        enhancer39.setUseFactory(false);
        java.lang.Class<?> wildcardClass45 = enhancer39.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer46 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy47 = enhancer46.getStrategy();
        enhancer46.setSerialVersionUID((java.lang.Long) 0L);
        enhancer46.setUseFactory(false);
        java.lang.Class<?> wildcardClass52 = enhancer46.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer53 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class54 = null;
        enhancer53.setSuperclass(class54);
        java.lang.ClassLoader classLoader56 = enhancer53.getClassLoader();
        java.lang.Class<?> wildcardClass57 = enhancer53.getClass();
        java.lang.Class[] classArray58 = new java.lang.Class[] { wildcardClass35, wildcardClass38, wildcardClass45, wildcardClass52, wildcardClass57 };
        enhancer27.setInterfaces(classArray58);
        org.mockito.cglib.core.NamingPolicy namingPolicy60 = enhancer27.getNamingPolicy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy61 = enhancer27.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer62 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy63 = enhancer62.getStrategy();
        enhancer62.setSerialVersionUID((java.lang.Long) 0L);
        enhancer62.setUseFactory(false);
        org.mockito.cglib.proxy.Enhancer enhancer68 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy69 = enhancer68.getStrategy();
        java.lang.Class<?> wildcardClass70 = enhancer68.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer71 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy72 = enhancer71.getStrategy();
        java.lang.Class<?> wildcardClass73 = enhancer71.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer74 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy75 = enhancer74.getStrategy();
        java.lang.Class<?> wildcardClass76 = enhancer74.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer77 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy78 = enhancer77.getStrategy();
        java.lang.Class<?> wildcardClass79 = enhancer77.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer80 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy81 = enhancer80.getStrategy();
        java.lang.Class<?> wildcardClass82 = enhancer80.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer83 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy84 = enhancer83.getStrategy();
        java.lang.Class<?> wildcardClass85 = enhancer83.getClass();
        java.lang.Class[] classArray86 = new java.lang.Class[] { wildcardClass70, wildcardClass73, wildcardClass76, wildcardClass79, wildcardClass82, wildcardClass85 };
        enhancer62.setInterfaces(classArray86);
        enhancer27.setInterfaces(classArray86);
        java.util.List list89 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.getMethods((java.lang.Class) wildcardClass26, classArray86, list89);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(classLoader2);
        org.junit.Assert.assertNotNull(generatorStrategy11);
        org.junit.Assert.assertNotNull(classLoader12);
        org.junit.Assert.assertNotNull(generatorStrategy15);
        org.junit.Assert.assertNotNull(generatorStrategy17);
        org.junit.Assert.assertNotNull(classLoader25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(generatorStrategy28);
        org.junit.Assert.assertNotNull(generatorStrategy34);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(generatorStrategy37);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(generatorStrategy40);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(generatorStrategy47);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(classLoader56);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(classArray58);
        org.junit.Assert.assertNotNull(namingPolicy60);
        org.junit.Assert.assertNotNull(generatorStrategy61);
        org.junit.Assert.assertNotNull(generatorStrategy63);
        org.junit.Assert.assertNotNull(generatorStrategy69);
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertNotNull(generatorStrategy72);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertNotNull(generatorStrategy75);
        org.junit.Assert.assertNotNull(wildcardClass76);
        org.junit.Assert.assertNotNull(generatorStrategy78);
        org.junit.Assert.assertNotNull(wildcardClass79);
        org.junit.Assert.assertNotNull(generatorStrategy81);
        org.junit.Assert.assertNotNull(wildcardClass82);
        org.junit.Assert.assertNotNull(generatorStrategy84);
        org.junit.Assert.assertNotNull(wildcardClass85);
        org.junit.Assert.assertNotNull(classArray86);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class1 = null;
        enhancer0.setSuperclass(class1);
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = enhancer0.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer4 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer4.getStrategy();
        enhancer4.setSerialVersionUID((java.lang.Long) 0L);
        enhancer4.setUseFactory(false);
        java.lang.Class<?> wildcardClass10 = enhancer4.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass10);
        org.mockito.cglib.proxy.Callback callback12 = null;
        enhancer0.setCallback(callback12);
        enhancer0.setUseCache(true);
        java.lang.ClassLoader classLoader16 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.Callback callback17 = null;
        enhancer0.setCallback(callback17);
        java.lang.ClassLoader classLoader19 = enhancer0.getClassLoader();
        boolean boolean20 = enhancer0.getUseCache();
        org.mockito.cglib.proxy.Enhancer enhancer21 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy22 = enhancer21.getStrategy();
        enhancer21.setSerialVersionUID((java.lang.Long) 0L);
        enhancer21.setUseCache(true);
        org.mockito.cglib.proxy.Enhancer enhancer27 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy28 = enhancer27.getStrategy();
        enhancer27.setSerialVersionUID((java.lang.Long) 0L);
        enhancer27.setAttemptLoad(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy33 = enhancer27.getStrategy();
        enhancer21.setStrategy(generatorStrategy33);
        enhancer21.setUseCache(false);
        java.lang.ClassLoader classLoader37 = enhancer21.getClassLoader();
        java.lang.ClassLoader classLoader38 = enhancer21.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer39 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy40 = enhancer39.getStrategy();
        enhancer39.setSerialVersionUID((java.lang.Long) 0L);
        enhancer39.setUseFactory(false);
        java.lang.Class<?> wildcardClass45 = enhancer39.getClass();
        boolean boolean46 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass45);
        enhancer21.setSuperclass((java.lang.Class) wildcardClass45);
        enhancer0.setSuperclass((java.lang.Class) wildcardClass45);
        enhancer0.setUseCache(false);
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(classLoader16);
        org.junit.Assert.assertNotNull(classLoader19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(generatorStrategy22);
        org.junit.Assert.assertNotNull(generatorStrategy28);
        org.junit.Assert.assertNotNull(generatorStrategy33);
        org.junit.Assert.assertNotNull(classLoader37);
        org.junit.Assert.assertNotNull(classLoader38);
        org.junit.Assert.assertNotNull(generatorStrategy40);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class1 = null;
        enhancer0.setSuperclass(class1);
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = enhancer0.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer4 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer4.getStrategy();
        enhancer4.setSerialVersionUID((java.lang.Long) 0L);
        enhancer4.setUseFactory(false);
        java.lang.Class<?> wildcardClass10 = enhancer4.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass10);
        org.mockito.cglib.proxy.Callback callback12 = null;
        enhancer0.setCallback(callback12);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy14 = enhancer0.getStrategy();
        enhancer0.setSerialVersionUID((java.lang.Long) 1L);
        org.mockito.cglib.proxy.Enhancer enhancer17 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class18 = null;
        enhancer17.setSuperclass(class18);
        enhancer17.setSerialVersionUID((java.lang.Long) (-1L));
        org.mockito.cglib.proxy.Callback callback22 = null;
        enhancer17.setCallback(callback22);
        enhancer17.setUseFactory(false);
        java.lang.ClassLoader classLoader26 = enhancer17.getClassLoader();
        org.mockito.cglib.proxy.Callback callback27 = null;
        enhancer17.setCallback(callback27);
        org.mockito.cglib.core.NamingPolicy namingPolicy29 = enhancer17.getNamingPolicy();
        enhancer0.setNamingPolicy(namingPolicy29);
        org.mockito.cglib.proxy.Enhancer enhancer31 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy32 = enhancer31.getStrategy();
        enhancer31.setSerialVersionUID((java.lang.Long) 0L);
        enhancer31.setUseFactory(false);
        org.mockito.cglib.proxy.Enhancer enhancer37 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy38 = enhancer37.getStrategy();
        java.lang.Class<?> wildcardClass39 = enhancer37.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer40 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy41 = enhancer40.getStrategy();
        java.lang.Class<?> wildcardClass42 = enhancer40.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer43 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy44 = enhancer43.getStrategy();
        java.lang.Class<?> wildcardClass45 = enhancer43.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer46 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy47 = enhancer46.getStrategy();
        java.lang.Class<?> wildcardClass48 = enhancer46.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer49 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy50 = enhancer49.getStrategy();
        java.lang.Class<?> wildcardClass51 = enhancer49.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer52 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy53 = enhancer52.getStrategy();
        java.lang.Class<?> wildcardClass54 = enhancer52.getClass();
        java.lang.Class[] classArray55 = new java.lang.Class[] { wildcardClass39, wildcardClass42, wildcardClass45, wildcardClass48, wildcardClass51, wildcardClass54 };
        enhancer31.setInterfaces(classArray55);
        enhancer0.setInterfaces(classArray55);
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(generatorStrategy14);
        org.junit.Assert.assertNotNull(classLoader26);
        org.junit.Assert.assertNotNull(namingPolicy29);
        org.junit.Assert.assertNotNull(generatorStrategy32);
        org.junit.Assert.assertNotNull(generatorStrategy38);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(generatorStrategy41);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(generatorStrategy44);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(generatorStrategy47);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(generatorStrategy50);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(generatorStrategy53);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(classArray55);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class1 = null;
        enhancer0.setSuperclass(class1);
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = enhancer0.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer4 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer4.getStrategy();
        enhancer4.setSerialVersionUID((java.lang.Long) 0L);
        enhancer4.setUseFactory(false);
        java.lang.Class<?> wildcardClass10 = enhancer4.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass10);
        org.mockito.cglib.proxy.Callback callback12 = null;
        enhancer0.setCallback(callback12);
        enhancer0.setUseCache(true);
        java.lang.ClassLoader classLoader16 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.Callback callback17 = null;
        enhancer0.setCallback(callback17);
        java.lang.ClassLoader classLoader19 = enhancer0.getClassLoader();
        boolean boolean20 = enhancer0.getUseCache();
        org.mockito.cglib.proxy.Enhancer enhancer21 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy22 = enhancer21.getStrategy();
        enhancer21.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.core.NamingPolicy namingPolicy25 = enhancer21.getNamingPolicy();
        enhancer21.setSerialVersionUID((java.lang.Long) 10L);
        org.mockito.cglib.proxy.Enhancer enhancer28 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy29 = enhancer28.getStrategy();
        enhancer28.setSerialVersionUID((java.lang.Long) 0L);
        enhancer28.setAttemptLoad(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy34 = enhancer28.getStrategy();
        enhancer21.setStrategy(generatorStrategy34);
        org.mockito.cglib.core.NamingPolicy namingPolicy36 = enhancer21.getNamingPolicy();
        enhancer0.setNamingPolicy(namingPolicy36);
        enhancer0.setAttemptLoad(false);
        enhancer0.setSerialVersionUID((java.lang.Long) 100L);
        enhancer0.setSerialVersionUID((java.lang.Long) (-1L));
        java.lang.ClassLoader classLoader44 = enhancer0.getClassLoader();
        org.mockito.asm.ClassVisitor classVisitor45 = null;
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.generateClass(classVisitor45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(classLoader16);
        org.junit.Assert.assertNotNull(classLoader19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(generatorStrategy22);
        org.junit.Assert.assertNotNull(namingPolicy25);
        org.junit.Assert.assertNotNull(generatorStrategy29);
        org.junit.Assert.assertNotNull(generatorStrategy34);
        org.junit.Assert.assertNotNull(namingPolicy36);
        org.junit.Assert.assertNotNull(classLoader44);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.core.NamingPolicy namingPolicy4 = enhancer0.getNamingPolicy();
        enhancer0.setAttemptLoad(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = enhancer0.getStrategy();
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(namingPolicy4);
        org.junit.Assert.assertNotNull(generatorStrategy7);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        enhancer0.setAttemptLoad(false);
        org.mockito.cglib.proxy.Callback callback4 = null;
        enhancer0.setCallback(callback4);
        enhancer0.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter8 = null;
        enhancer0.setCallbackFilter(callbackFilter8);
        org.mockito.cglib.proxy.Enhancer enhancer10 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Callback callback11 = null;
        enhancer10.setCallback(callback11);
        enhancer10.setUseCache(false);
        enhancer10.setSerialVersionUID((java.lang.Long) 100L);
        enhancer10.setUseFactory(false);
        org.mockito.cglib.proxy.Enhancer enhancer19 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer20 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class21 = null;
        enhancer20.setSuperclass(class21);
        org.mockito.cglib.core.NamingPolicy namingPolicy23 = enhancer20.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer24 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy25 = enhancer24.getStrategy();
        enhancer24.setSerialVersionUID((java.lang.Long) 0L);
        enhancer24.setUseFactory(false);
        java.lang.Class<?> wildcardClass30 = enhancer24.getClass();
        enhancer20.setSuperclass((java.lang.Class) wildcardClass30);
        org.mockito.cglib.proxy.Callback callback32 = null;
        enhancer20.setCallback(callback32);
        org.mockito.cglib.proxy.Callback callback34 = null;
        enhancer20.setCallback(callback34);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy36 = enhancer20.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer37 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class38 = null;
        enhancer37.setSuperclass(class38);
        org.mockito.cglib.core.NamingPolicy namingPolicy40 = enhancer37.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer41 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy42 = enhancer41.getStrategy();
        enhancer41.setSerialVersionUID((java.lang.Long) 0L);
        enhancer41.setUseFactory(false);
        java.lang.Class<?> wildcardClass47 = enhancer41.getClass();
        enhancer37.setSuperclass((java.lang.Class) wildcardClass47);
        org.mockito.cglib.proxy.Callback callback49 = null;
        enhancer37.setCallback(callback49);
        org.mockito.cglib.proxy.Callback callback51 = null;
        enhancer37.setCallback(callback51);
        java.lang.ClassLoader classLoader53 = enhancer37.getClassLoader();
        enhancer20.setClassLoader(classLoader53);
        org.mockito.cglib.core.NamingPolicy namingPolicy55 = enhancer20.getNamingPolicy();
        enhancer19.setNamingPolicy(namingPolicy55);
        org.mockito.cglib.core.NamingPolicy namingPolicy57 = enhancer19.getNamingPolicy();
        enhancer10.setNamingPolicy(namingPolicy57);
        enhancer0.setNamingPolicy(namingPolicy57);
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(namingPolicy23);
        org.junit.Assert.assertNotNull(generatorStrategy25);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(generatorStrategy36);
        org.junit.Assert.assertNotNull(namingPolicy40);
        org.junit.Assert.assertNotNull(generatorStrategy42);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(classLoader53);
        org.junit.Assert.assertNotNull(namingPolicy55);
        org.junit.Assert.assertNotNull(namingPolicy57);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class1 = null;
        enhancer0.setSuperclass(class1);
        enhancer0.setSerialVersionUID((java.lang.Long) (-1L));
        org.mockito.cglib.proxy.Callback callback5 = null;
        enhancer0.setCallback(callback5);
        enhancer0.setUseFactory(false);
        java.lang.ClassLoader classLoader9 = enhancer0.getClassLoader();
        boolean boolean10 = enhancer0.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer11 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class12 = null;
        enhancer11.setSuperclass(class12);
        enhancer11.setSerialVersionUID((java.lang.Long) (-1L));
        org.mockito.cglib.proxy.Callback callback16 = null;
        enhancer11.setCallback(callback16);
        enhancer11.setUseFactory(false);
        java.lang.ClassLoader classLoader20 = enhancer11.getClassLoader();
        org.mockito.cglib.proxy.Callback callback21 = null;
        enhancer11.setCallback(callback21);
        boolean boolean23 = enhancer11.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer24 = new org.mockito.cglib.proxy.Enhancer();
        enhancer24.setUseCache(false);
        org.mockito.cglib.proxy.Enhancer enhancer27 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class28 = null;
        enhancer27.setSuperclass(class28);
        org.mockito.cglib.core.NamingPolicy namingPolicy30 = enhancer27.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer31 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy32 = enhancer31.getStrategy();
        enhancer31.setSerialVersionUID((java.lang.Long) 0L);
        enhancer31.setUseFactory(false);
        java.lang.Class<?> wildcardClass37 = enhancer31.getClass();
        enhancer27.setSuperclass((java.lang.Class) wildcardClass37);
        org.mockito.cglib.proxy.Callback callback39 = null;
        enhancer27.setCallback(callback39);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy41 = enhancer27.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer42 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy43 = enhancer42.getStrategy();
        enhancer42.setSerialVersionUID((java.lang.Long) 0L);
        enhancer42.setUseFactory(false);
        org.mockito.cglib.proxy.Enhancer enhancer48 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy49 = enhancer48.getStrategy();
        java.lang.Class<?> wildcardClass50 = enhancer48.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer51 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy52 = enhancer51.getStrategy();
        java.lang.Class<?> wildcardClass53 = enhancer51.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer54 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy55 = enhancer54.getStrategy();
        java.lang.Class<?> wildcardClass56 = enhancer54.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer57 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy58 = enhancer57.getStrategy();
        java.lang.Class<?> wildcardClass59 = enhancer57.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer60 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy61 = enhancer60.getStrategy();
        java.lang.Class<?> wildcardClass62 = enhancer60.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer63 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy64 = enhancer63.getStrategy();
        java.lang.Class<?> wildcardClass65 = enhancer63.getClass();
        java.lang.Class[] classArray66 = new java.lang.Class[] { wildcardClass50, wildcardClass53, wildcardClass56, wildcardClass59, wildcardClass62, wildcardClass65 };
        enhancer42.setInterfaces(classArray66);
        enhancer27.setInterfaces(classArray66);
        enhancer24.setInterfaces(classArray66);
        enhancer11.setInterfaces(classArray66);
        enhancer0.setInterfaces(classArray66);
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        java.lang.ClassLoader classLoader74 = enhancer0.getClassLoader();
        org.junit.Assert.assertNotNull(classLoader9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(classLoader20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(namingPolicy30);
        org.junit.Assert.assertNotNull(generatorStrategy32);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(generatorStrategy41);
        org.junit.Assert.assertNotNull(generatorStrategy43);
        org.junit.Assert.assertNotNull(generatorStrategy49);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(generatorStrategy52);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNotNull(generatorStrategy55);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertNotNull(generatorStrategy58);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNotNull(generatorStrategy61);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertNotNull(generatorStrategy64);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertNotNull(classArray66);
        org.junit.Assert.assertNotNull(classLoader74);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.proxy.Callback callback4 = null;
        enhancer0.setCallback(callback4);
        enhancer0.setUseCache(false);
        boolean boolean8 = enhancer0.getUseCache();
        org.mockito.cglib.proxy.Enhancer enhancer9 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class10 = null;
        enhancer9.setSuperclass(class10);
        enhancer9.setSerialVersionUID((java.lang.Long) (-1L));
        org.mockito.cglib.proxy.Callback callback14 = null;
        enhancer9.setCallback(callback14);
        java.lang.Class<?> wildcardClass16 = enhancer9.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass16);
        org.mockito.cglib.proxy.Enhancer enhancer18 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class19 = null;
        enhancer18.setSuperclass(class19);
        java.lang.ClassLoader classLoader21 = enhancer18.getClassLoader();
        enhancer0.setClassLoader(classLoader21);
        org.mockito.cglib.proxy.Enhancer enhancer23 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy24 = enhancer23.getStrategy();
        java.lang.ClassLoader classLoader25 = enhancer23.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter26 = null;
        enhancer23.setCallbackFilter(callbackFilter26);
        enhancer23.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.Callback callback30 = null;
        enhancer23.setCallback(callback30);
        java.lang.ClassLoader classLoader32 = enhancer23.getClassLoader();
        enhancer0.setClassLoader(classLoader32);
        enhancer0.setSerialVersionUID((java.lang.Long) (-1L));
        java.lang.ClassLoader classLoader36 = enhancer0.getClassLoader();
        enhancer0.setSerialVersionUID((java.lang.Long) 100L);
        org.mockito.cglib.proxy.Enhancer enhancer39 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy40 = enhancer39.getStrategy();
        enhancer39.setSerialVersionUID((java.lang.Long) 0L);
        enhancer39.setAttemptLoad(false);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter45 = null;
        enhancer39.setCallbackFilter(callbackFilter45);
        enhancer39.setSerialVersionUID((java.lang.Long) (-1L));
        org.mockito.cglib.proxy.Enhancer enhancer49 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy50 = enhancer49.getStrategy();
        java.lang.ClassLoader classLoader51 = enhancer49.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter52 = null;
        enhancer49.setCallbackFilter(callbackFilter52);
        org.mockito.cglib.proxy.Enhancer enhancer54 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class55 = null;
        enhancer54.setSuperclass(class55);
        org.mockito.cglib.core.NamingPolicy namingPolicy57 = enhancer54.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer58 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy59 = enhancer58.getStrategy();
        enhancer58.setSerialVersionUID((java.lang.Long) 0L);
        enhancer58.setUseFactory(false);
        java.lang.Class<?> wildcardClass64 = enhancer58.getClass();
        enhancer54.setSuperclass((java.lang.Class) wildcardClass64);
        org.mockito.cglib.proxy.Callback callback66 = null;
        enhancer54.setCallback(callback66);
        org.mockito.cglib.proxy.Callback callback68 = null;
        enhancer54.setCallback(callback68);
        java.lang.ClassLoader classLoader70 = enhancer54.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer71 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy72 = enhancer71.getStrategy();
        enhancer71.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.proxy.Callback callback75 = null;
        enhancer71.setCallback(callback75);
        enhancer71.setUseCache(false);
        boolean boolean79 = enhancer71.getUseCache();
        enhancer71.setSerialVersionUID((java.lang.Long) 10L);
        org.mockito.cglib.proxy.Enhancer enhancer82 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy83 = enhancer82.getStrategy();
        java.lang.ClassLoader classLoader84 = enhancer82.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter85 = null;
        enhancer82.setCallbackFilter(callbackFilter85);
        org.mockito.cglib.core.NamingPolicy namingPolicy87 = enhancer82.getNamingPolicy();
        enhancer71.setNamingPolicy(namingPolicy87);
        java.lang.Class<?> wildcardClass89 = enhancer71.getClass();
        enhancer54.setSuperclass((java.lang.Class) wildcardClass89);
        org.mockito.cglib.proxy.Callback callback91 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray92 = new org.mockito.cglib.proxy.Callback[] { callback91 };
        enhancer54.setCallbacks(callbackArray92);
        enhancer49.setCallbacks(callbackArray92);
        enhancer39.setCallbacks(callbackArray92);
        enhancer0.setCallbacks(callbackArray92);
        org.mockito.cglib.proxy.Callback callback97 = null;
        enhancer0.setCallback(callback97);
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(classLoader21);
        org.junit.Assert.assertNotNull(generatorStrategy24);
        org.junit.Assert.assertNotNull(classLoader25);
        org.junit.Assert.assertNotNull(classLoader32);
        org.junit.Assert.assertNotNull(classLoader36);
        org.junit.Assert.assertNotNull(generatorStrategy40);
        org.junit.Assert.assertNotNull(generatorStrategy50);
        org.junit.Assert.assertNotNull(classLoader51);
        org.junit.Assert.assertNotNull(namingPolicy57);
        org.junit.Assert.assertNotNull(generatorStrategy59);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNotNull(classLoader70);
        org.junit.Assert.assertNotNull(generatorStrategy72);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(generatorStrategy83);
        org.junit.Assert.assertNotNull(classLoader84);
        org.junit.Assert.assertNotNull(namingPolicy87);
        org.junit.Assert.assertNotNull(wildcardClass89);
        org.junit.Assert.assertNotNull(callbackArray92);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class1 = null;
        enhancer0.setSuperclass(class1);
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = enhancer0.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer4 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer4.getStrategy();
        enhancer4.setSerialVersionUID((java.lang.Long) 0L);
        enhancer4.setUseFactory(false);
        java.lang.Class<?> wildcardClass10 = enhancer4.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass10);
        org.mockito.cglib.proxy.Callback callback12 = null;
        enhancer0.setCallback(callback12);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy14 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer15 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = enhancer15.getStrategy();
        enhancer15.setSerialVersionUID((java.lang.Long) 0L);
        enhancer15.setUseFactory(false);
        org.mockito.cglib.proxy.Enhancer enhancer21 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy22 = enhancer21.getStrategy();
        java.lang.Class<?> wildcardClass23 = enhancer21.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer24 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy25 = enhancer24.getStrategy();
        java.lang.Class<?> wildcardClass26 = enhancer24.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer27 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy28 = enhancer27.getStrategy();
        java.lang.Class<?> wildcardClass29 = enhancer27.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer30 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy31 = enhancer30.getStrategy();
        java.lang.Class<?> wildcardClass32 = enhancer30.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer33 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy34 = enhancer33.getStrategy();
        java.lang.Class<?> wildcardClass35 = enhancer33.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer36 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy37 = enhancer36.getStrategy();
        java.lang.Class<?> wildcardClass38 = enhancer36.getClass();
        java.lang.Class[] classArray39 = new java.lang.Class[] { wildcardClass23, wildcardClass26, wildcardClass29, wildcardClass32, wildcardClass35, wildcardClass38 };
        enhancer15.setInterfaces(classArray39);
        enhancer0.setInterfaces(classArray39);
        enhancer0.setSerialVersionUID((java.lang.Long) 100L);
        org.mockito.cglib.proxy.Enhancer enhancer44 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class45 = null;
        enhancer44.setSuperclass(class45);
        org.mockito.cglib.core.NamingPolicy namingPolicy47 = enhancer44.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer48 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy49 = enhancer48.getStrategy();
        enhancer48.setSerialVersionUID((java.lang.Long) 0L);
        enhancer48.setUseFactory(false);
        java.lang.Class<?> wildcardClass54 = enhancer48.getClass();
        enhancer44.setSuperclass((java.lang.Class) wildcardClass54);
        org.mockito.cglib.proxy.Callback callback56 = null;
        enhancer44.setCallback(callback56);
        org.mockito.cglib.core.NamingPolicy namingPolicy58 = enhancer44.getNamingPolicy();
        enhancer0.setNamingPolicy(namingPolicy58);
        org.mockito.cglib.proxy.Callback callback60 = null;
        enhancer0.setCallback(callback60);
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(generatorStrategy14);
        org.junit.Assert.assertNotNull(generatorStrategy16);
        org.junit.Assert.assertNotNull(generatorStrategy22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(generatorStrategy25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(generatorStrategy28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(generatorStrategy31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(generatorStrategy34);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(generatorStrategy37);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(classArray39);
        org.junit.Assert.assertNotNull(namingPolicy47);
        org.junit.Assert.assertNotNull(generatorStrategy49);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(namingPolicy58);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        java.lang.ClassLoader classLoader2 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter3 = null;
        enhancer0.setCallbackFilter(callbackFilter3);
        enhancer0.setInterceptDuringConstruction(true);
        boolean boolean7 = enhancer0.getUseCache();
        org.mockito.cglib.proxy.Enhancer enhancer8 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class9 = null;
        enhancer8.setSuperclass(class9);
        enhancer8.setSerialVersionUID((java.lang.Long) (-1L));
        enhancer8.setUseCache(false);
        java.lang.Class<?> wildcardClass15 = enhancer8.getClass();
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackType((java.lang.Class) wildcardClass15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown callback type class org.mockito.cglib.proxy.Enhancer");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(classLoader2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class1 = null;
        enhancer0.setSuperclass(class1);
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = enhancer0.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer4 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer4.getStrategy();
        enhancer4.setSerialVersionUID((java.lang.Long) 0L);
        enhancer4.setUseFactory(false);
        java.lang.Class<?> wildcardClass10 = enhancer4.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass10);
        org.mockito.cglib.proxy.Callback callback12 = null;
        enhancer0.setCallback(callback12);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy14 = enhancer0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy15 = enhancer0.getStrategy();
        java.lang.Class<?> wildcardClass16 = generatorStrategy15.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer17 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy18 = enhancer17.getStrategy();
        enhancer17.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.core.NamingPolicy namingPolicy21 = enhancer17.getNamingPolicy();
        org.mockito.cglib.proxy.Callback callback22 = null;
        enhancer17.setCallback(callback22);
        enhancer17.setAttemptLoad(true);
        boolean boolean26 = enhancer17.getAttemptLoad();
        java.lang.ClassLoader classLoader27 = enhancer17.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer28 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy29 = enhancer28.getStrategy();
        java.lang.ClassLoader classLoader30 = enhancer28.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter31 = null;
        enhancer28.setCallbackFilter(callbackFilter31);
        org.mockito.cglib.core.NamingPolicy namingPolicy33 = enhancer28.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer34 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy35 = enhancer34.getStrategy();
        enhancer34.setSerialVersionUID((java.lang.Long) 0L);
        enhancer34.setUseFactory(false);
        org.mockito.cglib.proxy.Enhancer enhancer40 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy41 = enhancer40.getStrategy();
        java.lang.Class<?> wildcardClass42 = enhancer40.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer43 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy44 = enhancer43.getStrategy();
        java.lang.Class<?> wildcardClass45 = enhancer43.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer46 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy47 = enhancer46.getStrategy();
        java.lang.Class<?> wildcardClass48 = enhancer46.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer49 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy50 = enhancer49.getStrategy();
        java.lang.Class<?> wildcardClass51 = enhancer49.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer52 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy53 = enhancer52.getStrategy();
        java.lang.Class<?> wildcardClass54 = enhancer52.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer55 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy56 = enhancer55.getStrategy();
        java.lang.Class<?> wildcardClass57 = enhancer55.getClass();
        java.lang.Class[] classArray58 = new java.lang.Class[] { wildcardClass42, wildcardClass45, wildcardClass48, wildcardClass51, wildcardClass54, wildcardClass57 };
        enhancer34.setInterfaces(classArray58);
        org.mockito.cglib.proxy.Callback callback60 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray61 = new org.mockito.cglib.proxy.Callback[] { callback60 };
        enhancer34.setCallbacks(callbackArray61);
        enhancer28.setCallbacks(callbackArray61);
        enhancer17.setCallbacks(callbackArray61);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.registerStaticCallbacks((java.lang.Class) wildcardClass16, callbackArray61);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.cglib.core.DefaultGeneratorStrategy is not an enhanced class");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(generatorStrategy14);
        org.junit.Assert.assertNotNull(generatorStrategy15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(generatorStrategy18);
        org.junit.Assert.assertNotNull(namingPolicy21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(classLoader27);
        org.junit.Assert.assertNotNull(generatorStrategy29);
        org.junit.Assert.assertNotNull(classLoader30);
        org.junit.Assert.assertNotNull(namingPolicy33);
        org.junit.Assert.assertNotNull(generatorStrategy35);
        org.junit.Assert.assertNotNull(generatorStrategy41);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(generatorStrategy44);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(generatorStrategy47);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(generatorStrategy50);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(generatorStrategy53);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(generatorStrategy56);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(classArray58);
        org.junit.Assert.assertNotNull(callbackArray61);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        java.lang.ClassLoader classLoader2 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter3 = null;
        enhancer0.setCallbackFilter(callbackFilter3);
        enhancer0.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.Enhancer enhancer7 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class8 = null;
        enhancer7.setSuperclass(class8);
        org.mockito.cglib.proxy.Enhancer enhancer10 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = enhancer10.getStrategy();
        java.lang.ClassLoader classLoader12 = enhancer10.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter13 = null;
        enhancer10.setCallbackFilter(callbackFilter13);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy15 = enhancer10.getStrategy();
        enhancer7.setStrategy(generatorStrategy15);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy17 = enhancer7.getStrategy();
        enhancer0.setStrategy(generatorStrategy17);
        java.lang.Class<?> wildcardClass19 = generatorStrategy17.getClass();
        boolean boolean20 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass19);
        boolean boolean21 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass19);
        org.mockito.cglib.proxy.Enhancer enhancer22 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Callback callback23 = null;
        enhancer22.setCallback(callback23);
        enhancer22.setUseCache(false);
        enhancer22.setSerialVersionUID((java.lang.Long) 100L);
        org.mockito.cglib.proxy.Enhancer enhancer29 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy30 = enhancer29.getStrategy();
        java.lang.ClassLoader classLoader31 = enhancer29.getClassLoader();
        enhancer22.setClassLoader(classLoader31);
        org.mockito.cglib.core.NamingPolicy namingPolicy33 = enhancer22.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy34 = enhancer22.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer35 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy36 = enhancer35.getStrategy();
        enhancer35.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.proxy.Enhancer enhancer39 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy40 = enhancer39.getStrategy();
        enhancer39.setSerialVersionUID((java.lang.Long) 0L);
        enhancer39.setUseFactory(false);
        org.mockito.cglib.proxy.Enhancer enhancer45 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy46 = enhancer45.getStrategy();
        java.lang.Class<?> wildcardClass47 = enhancer45.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer48 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy49 = enhancer48.getStrategy();
        java.lang.Class<?> wildcardClass50 = enhancer48.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer51 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy52 = enhancer51.getStrategy();
        java.lang.Class<?> wildcardClass53 = enhancer51.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer54 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy55 = enhancer54.getStrategy();
        java.lang.Class<?> wildcardClass56 = enhancer54.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer57 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy58 = enhancer57.getStrategy();
        java.lang.Class<?> wildcardClass59 = enhancer57.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer60 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy61 = enhancer60.getStrategy();
        java.lang.Class<?> wildcardClass62 = enhancer60.getClass();
        java.lang.Class[] classArray63 = new java.lang.Class[] { wildcardClass47, wildcardClass50, wildcardClass53, wildcardClass56, wildcardClass59, wildcardClass62 };
        enhancer39.setInterfaces(classArray63);
        org.mockito.cglib.proxy.Callback callback65 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray66 = new org.mockito.cglib.proxy.Callback[] { callback65 };
        enhancer39.setCallbacks(callbackArray66);
        enhancer35.setCallbacks(callbackArray66);
        enhancer22.setCallbacks(callbackArray66);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.registerStaticCallbacks((java.lang.Class) wildcardClass19, callbackArray66);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.cglib.core.DefaultGeneratorStrategy is not an enhanced class");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(classLoader2);
        org.junit.Assert.assertNotNull(generatorStrategy11);
        org.junit.Assert.assertNotNull(classLoader12);
        org.junit.Assert.assertNotNull(generatorStrategy15);
        org.junit.Assert.assertNotNull(generatorStrategy17);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(generatorStrategy30);
        org.junit.Assert.assertNotNull(classLoader31);
        org.junit.Assert.assertNotNull(namingPolicy33);
        org.junit.Assert.assertNotNull(namingPolicy34);
        org.junit.Assert.assertNotNull(generatorStrategy36);
        org.junit.Assert.assertNotNull(generatorStrategy40);
        org.junit.Assert.assertNotNull(generatorStrategy46);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(generatorStrategy49);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(generatorStrategy52);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNotNull(generatorStrategy55);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertNotNull(generatorStrategy58);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNotNull(generatorStrategy61);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertNotNull(classArray63);
        org.junit.Assert.assertNotNull(callbackArray66);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class1 = null;
        enhancer0.setSuperclass(class1);
        enhancer0.setSerialVersionUID((java.lang.Long) (-1L));
        org.mockito.cglib.proxy.Callback callback5 = null;
        enhancer0.setCallback(callback5);
        enhancer0.setUseFactory(false);
        java.lang.ClassLoader classLoader9 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.Callback callback10 = null;
        enhancer0.setCallback(callback10);
        org.mockito.cglib.proxy.Enhancer enhancer12 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = enhancer12.getStrategy();
        enhancer12.setSerialVersionUID((java.lang.Long) 0L);
        enhancer12.setUseFactory(false);
        org.mockito.cglib.proxy.Enhancer enhancer18 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class19 = null;
        enhancer18.setSuperclass(class19);
        java.lang.ClassLoader classLoader21 = enhancer18.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer22 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class23 = null;
        enhancer22.setSuperclass(class23);
        org.mockito.cglib.core.NamingPolicy namingPolicy25 = enhancer22.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer26 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy27 = enhancer26.getStrategy();
        enhancer22.setStrategy(generatorStrategy27);
        enhancer18.setStrategy(generatorStrategy27);
        enhancer12.setStrategy(generatorStrategy27);
        org.mockito.cglib.core.NamingPolicy namingPolicy31 = enhancer12.getNamingPolicy();
        enhancer0.setNamingPolicy(namingPolicy31);
        boolean boolean33 = enhancer0.getUseCache();
        enhancer0.setInterceptDuringConstruction(true);
        org.junit.Assert.assertNotNull(classLoader9);
        org.junit.Assert.assertNotNull(generatorStrategy13);
        org.junit.Assert.assertNotNull(classLoader21);
        org.junit.Assert.assertNotNull(namingPolicy25);
        org.junit.Assert.assertNotNull(generatorStrategy27);
        org.junit.Assert.assertNotNull(namingPolicy31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Callback callback2 = null;
        enhancer0.setCallback(callback2);
        enhancer0.setAttemptLoad(true);
        enhancer0.setInterceptDuringConstruction(true);
        enhancer0.setUseFactory(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = enhancer0.create();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(generatorStrategy1);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        enhancer0.setUseFactory(false);
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Callback callback7 = null;
        enhancer6.setCallback(callback7);
        enhancer6.setUseCache(false);
        enhancer6.setSerialVersionUID((java.lang.Long) 100L);
        org.mockito.cglib.proxy.Enhancer enhancer13 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy14 = enhancer13.getStrategy();
        java.lang.ClassLoader classLoader15 = enhancer13.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer16 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy17 = enhancer16.getStrategy();
        java.lang.ClassLoader classLoader18 = enhancer16.getClassLoader();
        enhancer16.setUseFactory(true);
        org.mockito.cglib.proxy.Enhancer enhancer21 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy22 = enhancer21.getStrategy();
        enhancer21.setSerialVersionUID((java.lang.Long) 0L);
        enhancer21.setAttemptLoad(false);
        org.mockito.cglib.proxy.Enhancer enhancer27 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy28 = enhancer27.getStrategy();
        java.lang.Class<?> wildcardClass29 = enhancer27.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer30 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy31 = enhancer30.getStrategy();
        java.lang.Class<?> wildcardClass32 = enhancer30.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer33 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy34 = enhancer33.getStrategy();
        enhancer33.setSerialVersionUID((java.lang.Long) 0L);
        enhancer33.setUseFactory(false);
        java.lang.Class<?> wildcardClass39 = enhancer33.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer40 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy41 = enhancer40.getStrategy();
        enhancer40.setSerialVersionUID((java.lang.Long) 0L);
        enhancer40.setUseFactory(false);
        java.lang.Class<?> wildcardClass46 = enhancer40.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer47 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class48 = null;
        enhancer47.setSuperclass(class48);
        java.lang.ClassLoader classLoader50 = enhancer47.getClassLoader();
        java.lang.Class<?> wildcardClass51 = enhancer47.getClass();
        java.lang.Class[] classArray52 = new java.lang.Class[] { wildcardClass29, wildcardClass32, wildcardClass39, wildcardClass46, wildcardClass51 };
        enhancer21.setInterfaces(classArray52);
        java.lang.Class<?> wildcardClass54 = enhancer21.getClass();
        enhancer16.setSuperclass((java.lang.Class) wildcardClass54);
        org.mockito.cglib.proxy.Enhancer enhancer56 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy57 = enhancer56.getStrategy();
        enhancer56.setSerialVersionUID((java.lang.Long) 0L);
        enhancer56.setUseFactory(false);
        org.mockito.cglib.proxy.Enhancer enhancer62 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy63 = enhancer62.getStrategy();
        java.lang.Class<?> wildcardClass64 = enhancer62.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer65 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy66 = enhancer65.getStrategy();
        java.lang.Class<?> wildcardClass67 = enhancer65.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer68 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy69 = enhancer68.getStrategy();
        java.lang.Class<?> wildcardClass70 = enhancer68.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer71 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy72 = enhancer71.getStrategy();
        java.lang.Class<?> wildcardClass73 = enhancer71.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer74 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy75 = enhancer74.getStrategy();
        java.lang.Class<?> wildcardClass76 = enhancer74.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer77 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy78 = enhancer77.getStrategy();
        java.lang.Class<?> wildcardClass79 = enhancer77.getClass();
        java.lang.Class[] classArray80 = new java.lang.Class[] { wildcardClass64, wildcardClass67, wildcardClass70, wildcardClass73, wildcardClass76, wildcardClass79 };
        enhancer56.setInterfaces(classArray80);
        enhancer16.setInterfaces(classArray80);
        enhancer13.setInterfaces(classArray80);
        enhancer6.setInterfaces(classArray80);
        enhancer0.setInterfaces(classArray80);
        enhancer0.setSerialVersionUID((java.lang.Long) 100L);
        org.mockito.cglib.proxy.Callback callback88 = null;
        enhancer0.setCallback(callback88);
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(generatorStrategy14);
        org.junit.Assert.assertNotNull(classLoader15);
        org.junit.Assert.assertNotNull(generatorStrategy17);
        org.junit.Assert.assertNotNull(classLoader18);
        org.junit.Assert.assertNotNull(generatorStrategy22);
        org.junit.Assert.assertNotNull(generatorStrategy28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(generatorStrategy31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(generatorStrategy34);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(generatorStrategy41);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(classLoader50);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(classArray52);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(generatorStrategy57);
        org.junit.Assert.assertNotNull(generatorStrategy63);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNotNull(generatorStrategy66);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertNotNull(generatorStrategy69);
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertNotNull(generatorStrategy72);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertNotNull(generatorStrategy75);
        org.junit.Assert.assertNotNull(wildcardClass76);
        org.junit.Assert.assertNotNull(generatorStrategy78);
        org.junit.Assert.assertNotNull(wildcardClass79);
        org.junit.Assert.assertNotNull(classArray80);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Callback callback1 = null;
        enhancer0.setCallback(callback1);
        enhancer0.setUseCache(false);
        org.mockito.cglib.proxy.Callback callback5 = null;
        enhancer0.setCallback(callback5);
        org.mockito.cglib.proxy.Enhancer enhancer7 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class8 = null;
        enhancer7.setSuperclass(class8);
        org.mockito.cglib.core.NamingPolicy namingPolicy10 = enhancer7.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer11 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = enhancer11.getStrategy();
        enhancer11.setSerialVersionUID((java.lang.Long) 0L);
        enhancer11.setUseFactory(false);
        java.lang.Class<?> wildcardClass17 = enhancer11.getClass();
        enhancer7.setSuperclass((java.lang.Class) wildcardClass17);
        org.mockito.cglib.proxy.Callback callback19 = null;
        enhancer7.setCallback(callback19);
        enhancer7.setAttemptLoad(false);
        org.mockito.cglib.proxy.Enhancer enhancer23 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Callback callback24 = null;
        enhancer23.setCallback(callback24);
        boolean boolean26 = enhancer23.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy27 = enhancer23.getStrategy();
        enhancer7.setStrategy(generatorStrategy27);
        org.mockito.cglib.proxy.Enhancer enhancer29 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy30 = enhancer29.getStrategy();
        enhancer29.setSerialVersionUID((java.lang.Long) 0L);
        enhancer29.setUseCache(true);
        org.mockito.cglib.proxy.Enhancer enhancer35 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy36 = enhancer35.getStrategy();
        enhancer35.setSerialVersionUID((java.lang.Long) 0L);
        enhancer35.setAttemptLoad(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy41 = enhancer35.getStrategy();
        enhancer29.setStrategy(generatorStrategy41);
        enhancer29.setUseCache(false);
        boolean boolean45 = enhancer29.getUseCache();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter46 = null;
        enhancer29.setCallbackFilter(callbackFilter46);
        org.mockito.cglib.proxy.Enhancer enhancer48 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class49 = null;
        enhancer48.setSuperclass(class49);
        java.lang.ClassLoader classLoader51 = enhancer48.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer52 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class53 = null;
        enhancer52.setSuperclass(class53);
        org.mockito.cglib.core.NamingPolicy namingPolicy55 = enhancer52.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer56 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy57 = enhancer56.getStrategy();
        enhancer52.setStrategy(generatorStrategy57);
        enhancer48.setStrategy(generatorStrategy57);
        java.lang.Class<?> wildcardClass60 = enhancer48.getClass();
        boolean boolean61 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass60);
        enhancer29.setSuperclass((java.lang.Class) wildcardClass60);
        boolean boolean63 = enhancer29.getAttemptLoad();
        org.mockito.cglib.proxy.Callback callback64 = null;
        enhancer29.setCallback(callback64);
        java.lang.Class<?> wildcardClass66 = enhancer29.getClass();
        enhancer7.setSuperclass((java.lang.Class) wildcardClass66);
        org.mockito.cglib.proxy.Enhancer enhancer68 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy69 = enhancer68.getStrategy();
        java.lang.ClassLoader classLoader70 = enhancer68.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter71 = null;
        enhancer68.setCallbackFilter(callbackFilter71);
        java.lang.ClassLoader classLoader73 = enhancer68.getClassLoader();
        enhancer7.setClassLoader(classLoader73);
        enhancer7.setUseCache(true);
        enhancer7.setAttemptLoad(true);
        org.mockito.cglib.proxy.Enhancer enhancer79 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy80 = enhancer79.getStrategy();
        enhancer79.setSerialVersionUID((java.lang.Long) 0L);
        enhancer79.setUseCache(true);
        org.mockito.cglib.proxy.Enhancer enhancer85 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy86 = enhancer85.getStrategy();
        enhancer85.setSerialVersionUID((java.lang.Long) 0L);
        enhancer85.setAttemptLoad(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy91 = enhancer85.getStrategy();
        enhancer79.setStrategy(generatorStrategy91);
        enhancer7.setStrategy(generatorStrategy91);
        enhancer0.setStrategy(generatorStrategy91);
        enhancer0.setUseCache(true);
        org.junit.Assert.assertNotNull(namingPolicy10);
        org.junit.Assert.assertNotNull(generatorStrategy12);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(generatorStrategy27);
        org.junit.Assert.assertNotNull(generatorStrategy30);
        org.junit.Assert.assertNotNull(generatorStrategy36);
        org.junit.Assert.assertNotNull(generatorStrategy41);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(classLoader51);
        org.junit.Assert.assertNotNull(namingPolicy55);
        org.junit.Assert.assertNotNull(generatorStrategy57);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertNotNull(generatorStrategy69);
        org.junit.Assert.assertNotNull(classLoader70);
        org.junit.Assert.assertNotNull(classLoader73);
        org.junit.Assert.assertNotNull(generatorStrategy80);
        org.junit.Assert.assertNotNull(generatorStrategy86);
        org.junit.Assert.assertNotNull(generatorStrategy91);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class1 = null;
        enhancer0.setSuperclass(class1);
        enhancer0.setSerialVersionUID((java.lang.Long) (-1L));
        java.lang.ClassLoader classLoader5 = enhancer0.getClassLoader();
        java.lang.Class class6 = null;
        enhancer0.setSuperclass(class6);
        enhancer0.setAttemptLoad(true);
        org.mockito.cglib.proxy.Callback callback10 = null;
        enhancer0.setCallback(callback10);
        org.mockito.cglib.proxy.Enhancer enhancer12 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class13 = null;
        enhancer12.setSuperclass(class13);
        org.mockito.cglib.core.NamingPolicy namingPolicy15 = enhancer12.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer16 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy17 = enhancer16.getStrategy();
        enhancer12.setStrategy(generatorStrategy17);
        enhancer12.setUseFactory(true);
        org.mockito.cglib.proxy.Enhancer enhancer21 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class22 = null;
        enhancer21.setSuperclass(class22);
        org.mockito.cglib.core.NamingPolicy namingPolicy24 = enhancer21.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer25 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy26 = enhancer25.getStrategy();
        enhancer25.setSerialVersionUID((java.lang.Long) 0L);
        enhancer25.setUseFactory(false);
        java.lang.Class<?> wildcardClass31 = enhancer25.getClass();
        enhancer21.setSuperclass((java.lang.Class) wildcardClass31);
        enhancer12.setSuperclass((java.lang.Class) wildcardClass31);
        org.mockito.cglib.core.NamingPolicy namingPolicy34 = enhancer12.getNamingPolicy();
        enhancer0.setNamingPolicy(namingPolicy34);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy36 = enhancer0.getStrategy();
        org.junit.Assert.assertNotNull(classLoader5);
        org.junit.Assert.assertNotNull(namingPolicy15);
        org.junit.Assert.assertNotNull(generatorStrategy17);
        org.junit.Assert.assertNotNull(namingPolicy24);
        org.junit.Assert.assertNotNull(generatorStrategy26);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(namingPolicy34);
        org.junit.Assert.assertNotNull(generatorStrategy36);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        enhancer0.setUseFactory(false);
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class7 = null;
        enhancer6.setSuperclass(class7);
        java.lang.ClassLoader classLoader9 = enhancer6.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer10 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class11 = null;
        enhancer10.setSuperclass(class11);
        org.mockito.cglib.core.NamingPolicy namingPolicy13 = enhancer10.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer14 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy15 = enhancer14.getStrategy();
        enhancer10.setStrategy(generatorStrategy15);
        enhancer6.setStrategy(generatorStrategy15);
        enhancer0.setStrategy(generatorStrategy15);
        enhancer0.setUseCache(false);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter21 = null;
        enhancer0.setCallbackFilter(callbackFilter21);
        enhancer0.setAttemptLoad(true);
        java.lang.ClassLoader classLoader25 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy26 = enhancer0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy27 = enhancer0.getStrategy();
        java.lang.ClassLoader classLoader28 = enhancer0.getClassLoader();
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(classLoader9);
        org.junit.Assert.assertNotNull(namingPolicy13);
        org.junit.Assert.assertNotNull(generatorStrategy15);
        org.junit.Assert.assertNotNull(classLoader25);
        org.junit.Assert.assertNotNull(generatorStrategy26);
        org.junit.Assert.assertNotNull(generatorStrategy27);
        org.junit.Assert.assertNotNull(classLoader28);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        enhancer0.setUseCache(true);
        boolean boolean6 = enhancer0.getUseCache();
        org.mockito.cglib.proxy.Enhancer enhancer7 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class8 = null;
        enhancer7.setSuperclass(class8);
        java.lang.ClassLoader classLoader10 = enhancer7.getClassLoader();
        java.lang.Class<?> wildcardClass11 = enhancer7.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass11);
        org.mockito.cglib.proxy.Enhancer enhancer13 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class14 = null;
        enhancer13.setSuperclass(class14);
        org.mockito.cglib.core.NamingPolicy namingPolicy16 = enhancer13.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer17 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy18 = enhancer17.getStrategy();
        enhancer13.setStrategy(generatorStrategy18);
        enhancer13.setUseFactory(true);
        org.mockito.cglib.proxy.Enhancer enhancer22 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class23 = null;
        enhancer22.setSuperclass(class23);
        org.mockito.cglib.core.NamingPolicy namingPolicy25 = enhancer22.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer26 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy27 = enhancer26.getStrategy();
        enhancer26.setSerialVersionUID((java.lang.Long) 0L);
        enhancer26.setUseFactory(false);
        java.lang.Class<?> wildcardClass32 = enhancer26.getClass();
        enhancer22.setSuperclass((java.lang.Class) wildcardClass32);
        enhancer13.setSuperclass((java.lang.Class) wildcardClass32);
        org.mockito.cglib.proxy.Enhancer enhancer35 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class36 = null;
        enhancer35.setSuperclass(class36);
        enhancer35.setSerialVersionUID((java.lang.Long) (-1L));
        org.mockito.cglib.proxy.Callback callback40 = null;
        enhancer35.setCallback(callback40);
        java.lang.Class<?> wildcardClass42 = enhancer35.getClass();
        enhancer13.setSuperclass((java.lang.Class) wildcardClass42);
        enhancer0.setSuperclass((java.lang.Class) wildcardClass42);
        enhancer0.setUseCache(false);
        org.mockito.cglib.proxy.Enhancer enhancer47 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy48 = enhancer47.getStrategy();
        java.lang.ClassLoader classLoader49 = enhancer47.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter50 = null;
        enhancer47.setCallbackFilter(callbackFilter50);
        java.lang.ClassLoader classLoader52 = enhancer47.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer53 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy54 = enhancer53.getStrategy();
        enhancer53.setSerialVersionUID((java.lang.Long) 0L);
        enhancer53.setUseCache(true);
        org.mockito.cglib.proxy.Enhancer enhancer59 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy60 = enhancer59.getStrategy();
        enhancer59.setSerialVersionUID((java.lang.Long) 0L);
        enhancer59.setAttemptLoad(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy65 = enhancer59.getStrategy();
        enhancer53.setStrategy(generatorStrategy65);
        enhancer53.setUseCache(false);
        java.lang.ClassLoader classLoader69 = enhancer53.getClassLoader();
        enhancer47.setClassLoader(classLoader69);
        java.lang.Class<?> wildcardClass71 = classLoader69.getClass();
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackType((java.lang.Class) wildcardClass71);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown callback type class sun.misc.Launcher$AppClassLoader");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(classLoader10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(namingPolicy16);
        org.junit.Assert.assertNotNull(generatorStrategy18);
        org.junit.Assert.assertNotNull(namingPolicy25);
        org.junit.Assert.assertNotNull(generatorStrategy27);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(generatorStrategy48);
        org.junit.Assert.assertNotNull(classLoader49);
        org.junit.Assert.assertNotNull(classLoader52);
        org.junit.Assert.assertNotNull(generatorStrategy54);
        org.junit.Assert.assertNotNull(generatorStrategy60);
        org.junit.Assert.assertNotNull(generatorStrategy65);
        org.junit.Assert.assertNotNull(classLoader69);
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        enhancer0.setUseCache(true);
        boolean boolean6 = enhancer0.getUseCache();
        org.mockito.cglib.proxy.Enhancer enhancer7 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class8 = null;
        enhancer7.setSuperclass(class8);
        java.lang.ClassLoader classLoader10 = enhancer7.getClassLoader();
        java.lang.Class<?> wildcardClass11 = enhancer7.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass11);
        boolean boolean13 = enhancer0.getAttemptLoad();
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(classLoader10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        enhancer0.setUseCache(true);
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class7 = null;
        enhancer6.setSuperclass(class7);
        org.mockito.cglib.core.NamingPolicy namingPolicy9 = enhancer6.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer10 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = enhancer10.getStrategy();
        enhancer6.setStrategy(generatorStrategy11);
        enhancer0.setStrategy(generatorStrategy11);
        java.lang.ClassLoader classLoader14 = enhancer0.getClassLoader();
        enhancer0.setUseFactory(true);
        java.lang.Class<?> wildcardClass17 = enhancer0.getClass();
        boolean boolean18 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass17);
        org.mockito.cglib.proxy.Enhancer enhancer19 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy20 = enhancer19.getStrategy();
        enhancer19.setSerialVersionUID((java.lang.Long) 0L);
        enhancer19.setUseCache(true);
        org.mockito.cglib.proxy.Enhancer enhancer25 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy26 = enhancer25.getStrategy();
        enhancer25.setSerialVersionUID((java.lang.Long) 0L);
        enhancer25.setAttemptLoad(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy31 = enhancer25.getStrategy();
        enhancer19.setStrategy(generatorStrategy31);
        boolean boolean33 = enhancer19.getUseCache();
        enhancer19.setInterceptDuringConstruction(false);
        org.mockito.cglib.proxy.Enhancer enhancer36 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy37 = enhancer36.getStrategy();
        enhancer36.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.core.NamingPolicy namingPolicy40 = enhancer36.getNamingPolicy();
        org.mockito.cglib.proxy.Callback callback41 = null;
        enhancer36.setCallback(callback41);
        enhancer36.setAttemptLoad(true);
        boolean boolean45 = enhancer36.getAttemptLoad();
        java.lang.ClassLoader classLoader46 = enhancer36.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer47 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy48 = enhancer47.getStrategy();
        java.lang.ClassLoader classLoader49 = enhancer47.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter50 = null;
        enhancer47.setCallbackFilter(callbackFilter50);
        org.mockito.cglib.core.NamingPolicy namingPolicy52 = enhancer47.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer53 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy54 = enhancer53.getStrategy();
        enhancer53.setSerialVersionUID((java.lang.Long) 0L);
        enhancer53.setUseFactory(false);
        org.mockito.cglib.proxy.Enhancer enhancer59 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy60 = enhancer59.getStrategy();
        java.lang.Class<?> wildcardClass61 = enhancer59.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer62 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy63 = enhancer62.getStrategy();
        java.lang.Class<?> wildcardClass64 = enhancer62.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer65 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy66 = enhancer65.getStrategy();
        java.lang.Class<?> wildcardClass67 = enhancer65.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer68 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy69 = enhancer68.getStrategy();
        java.lang.Class<?> wildcardClass70 = enhancer68.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer71 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy72 = enhancer71.getStrategy();
        java.lang.Class<?> wildcardClass73 = enhancer71.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer74 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy75 = enhancer74.getStrategy();
        java.lang.Class<?> wildcardClass76 = enhancer74.getClass();
        java.lang.Class[] classArray77 = new java.lang.Class[] { wildcardClass61, wildcardClass64, wildcardClass67, wildcardClass70, wildcardClass73, wildcardClass76 };
        enhancer53.setInterfaces(classArray77);
        org.mockito.cglib.proxy.Callback callback79 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray80 = new org.mockito.cglib.proxy.Callback[] { callback79 };
        enhancer53.setCallbacks(callbackArray80);
        enhancer47.setCallbacks(callbackArray80);
        enhancer36.setCallbacks(callbackArray80);
        enhancer19.setCallbacks(callbackArray80);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.registerStaticCallbacks((java.lang.Class) wildcardClass17, callbackArray80);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.cglib.proxy.Enhancer is not an enhanced class");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(namingPolicy9);
        org.junit.Assert.assertNotNull(generatorStrategy11);
        org.junit.Assert.assertNotNull(classLoader14);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(generatorStrategy20);
        org.junit.Assert.assertNotNull(generatorStrategy26);
        org.junit.Assert.assertNotNull(generatorStrategy31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(generatorStrategy37);
        org.junit.Assert.assertNotNull(namingPolicy40);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(classLoader46);
        org.junit.Assert.assertNotNull(generatorStrategy48);
        org.junit.Assert.assertNotNull(classLoader49);
        org.junit.Assert.assertNotNull(namingPolicy52);
        org.junit.Assert.assertNotNull(generatorStrategy54);
        org.junit.Assert.assertNotNull(generatorStrategy60);
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertNotNull(generatorStrategy63);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNotNull(generatorStrategy66);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertNotNull(generatorStrategy69);
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertNotNull(generatorStrategy72);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertNotNull(generatorStrategy75);
        org.junit.Assert.assertNotNull(wildcardClass76);
        org.junit.Assert.assertNotNull(classArray77);
        org.junit.Assert.assertNotNull(callbackArray80);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class1 = null;
        enhancer0.setSuperclass(class1);
        enhancer0.setSerialVersionUID((java.lang.Long) (-1L));
        org.mockito.cglib.proxy.Callback callback5 = null;
        enhancer0.setCallback(callback5);
        enhancer0.setUseFactory(false);
        java.lang.ClassLoader classLoader9 = enhancer0.getClassLoader();
        org.mockito.cglib.core.NamingPolicy namingPolicy10 = enhancer0.getNamingPolicy();
        java.lang.ClassLoader classLoader11 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer12 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class13 = null;
        enhancer12.setSuperclass(class13);
        org.mockito.cglib.core.NamingPolicy namingPolicy15 = enhancer12.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer16 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy17 = enhancer16.getStrategy();
        enhancer16.setSerialVersionUID((java.lang.Long) 0L);
        enhancer16.setUseFactory(false);
        java.lang.Class<?> wildcardClass22 = enhancer16.getClass();
        enhancer12.setSuperclass((java.lang.Class) wildcardClass22);
        org.mockito.cglib.proxy.Callback callback24 = null;
        enhancer12.setCallback(callback24);
        enhancer12.setAttemptLoad(false);
        org.mockito.cglib.proxy.Callback callback28 = null;
        enhancer12.setCallback(callback28);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy30 = enhancer12.getStrategy();
        org.mockito.cglib.proxy.Callback callback31 = null;
        enhancer12.setCallback(callback31);
        enhancer12.setUseCache(false);
        org.mockito.cglib.proxy.Enhancer enhancer35 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Callback callback36 = null;
        enhancer35.setCallback(callback36);
        boolean boolean38 = enhancer35.getUseCache();
        org.mockito.cglib.proxy.Enhancer enhancer39 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class40 = null;
        enhancer39.setSuperclass(class40);
        enhancer39.setSerialVersionUID((java.lang.Long) (-1L));
        org.mockito.cglib.proxy.Callback callback44 = null;
        enhancer39.setCallback(callback44);
        enhancer39.setUseFactory(false);
        java.lang.ClassLoader classLoader48 = enhancer39.getClassLoader();
        org.mockito.cglib.proxy.Callback callback49 = null;
        enhancer39.setCallback(callback49);
        org.mockito.cglib.core.NamingPolicy namingPolicy51 = enhancer39.getNamingPolicy();
        enhancer39.setUseCache(false);
        boolean boolean54 = enhancer39.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer55 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy56 = enhancer55.getStrategy();
        enhancer55.setSerialVersionUID((java.lang.Long) 0L);
        enhancer55.setAttemptLoad(false);
        org.mockito.cglib.proxy.Enhancer enhancer61 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy62 = enhancer61.getStrategy();
        java.lang.Class<?> wildcardClass63 = enhancer61.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer64 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy65 = enhancer64.getStrategy();
        java.lang.Class<?> wildcardClass66 = enhancer64.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer67 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy68 = enhancer67.getStrategy();
        enhancer67.setSerialVersionUID((java.lang.Long) 0L);
        enhancer67.setUseFactory(false);
        java.lang.Class<?> wildcardClass73 = enhancer67.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer74 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy75 = enhancer74.getStrategy();
        enhancer74.setSerialVersionUID((java.lang.Long) 0L);
        enhancer74.setUseFactory(false);
        java.lang.Class<?> wildcardClass80 = enhancer74.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer81 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class82 = null;
        enhancer81.setSuperclass(class82);
        java.lang.ClassLoader classLoader84 = enhancer81.getClassLoader();
        java.lang.Class<?> wildcardClass85 = enhancer81.getClass();
        java.lang.Class[] classArray86 = new java.lang.Class[] { wildcardClass63, wildcardClass66, wildcardClass73, wildcardClass80, wildcardClass85 };
        enhancer55.setInterfaces(classArray86);
        enhancer39.setInterfaces(classArray86);
        enhancer35.setInterfaces(classArray86);
        enhancer12.setInterfaces(classArray86);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackTypes(classArray86);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown callback type class org.mockito.cglib.proxy.Enhancer");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader9);
        org.junit.Assert.assertNotNull(namingPolicy10);
        org.junit.Assert.assertNotNull(classLoader11);
        org.junit.Assert.assertNotNull(namingPolicy15);
        org.junit.Assert.assertNotNull(generatorStrategy17);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(generatorStrategy30);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(classLoader48);
        org.junit.Assert.assertNotNull(namingPolicy51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(generatorStrategy56);
        org.junit.Assert.assertNotNull(generatorStrategy62);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(generatorStrategy65);
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertNotNull(generatorStrategy68);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertNotNull(generatorStrategy75);
        org.junit.Assert.assertNotNull(wildcardClass80);
        org.junit.Assert.assertNotNull(classLoader84);
        org.junit.Assert.assertNotNull(wildcardClass85);
        org.junit.Assert.assertNotNull(classArray86);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class1 = null;
        enhancer0.setSuperclass(class1);
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = enhancer0.getNamingPolicy();
        enhancer0.setUseCache(false);
        org.mockito.cglib.proxy.Callback callback6 = null;
        enhancer0.setCallback(callback6);
        org.junit.Assert.assertNotNull(namingPolicy3);
    }
}

